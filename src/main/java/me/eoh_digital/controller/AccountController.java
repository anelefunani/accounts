package me.eoh_digital.controller;

import me.eoh_digital.model.AccountEntity;
import me.eoh_digital.model.ItemisedEntity;
import me.eoh_digital.service.AccountInformationService;
import me.eoh_digital.service.AccountService;
import me.eoh_digital.service.ItemisedBillService;
import me.eoh_digital.service.SearchAuditService;
import me.eoh_digital.views.AccountInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Admin on 2017/02/14.
 */

@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private AccountInformationService accountInformationService;
    @Autowired
    private ItemisedBillService itemisedBillService;
    @Autowired
    private SearchAuditService searchAuditService;

    @RequestMapping(value = {"/", "/accounts"}, method = RequestMethod.GET)
    public String accounts(){
        return "accountSearch";
    }

    @RequestMapping(value = "/accountSearch", method = RequestMethod.POST)
    public String accountSearch(@ModelAttribute("account") AccountEntity account, BindingResult result,  Model model){
        AccountEntity accountSearch = accountService.findByAccountNumber(((AccountEntity)result.getModel().get("account")).getAccountNumber());
        if(accountSearch != null){
            AccountInformation accountSearchInformation = accountInformationService.findByAccountNumber(accountSearch.getAccountNumber());
            if(accountSearchInformation != null){
                model.addAttribute("accountInformation", accountSearchInformation);
                searchAuditService.recordAccountSearch(LocalDateTime.now(), accountSearchInformation.getAccountNumber(), "guest");
            }
        }
        else
            return "notFoundPage";

        return "accountDetails";
    }

    @RequestMapping(value = "/billItems", method = RequestMethod.POST)
    public String billItems(@ModelAttribute("invoiceId") String invoiceId, BindingResult result,  Model model){
        List<ItemisedEntity> billItems = itemisedBillService.findAllByInvoiceId(Integer.valueOf((String)result.getModel().get("invoiceId")));
        model.addAttribute("billItems", billItems);
        return "billItems";
    }
}