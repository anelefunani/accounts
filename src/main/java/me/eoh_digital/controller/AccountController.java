package me.eoh_digital.controller;

import me.eoh_digital.model.AccountEntity;
import me.eoh_digital.model.ItemisedEntity;
import me.eoh_digital.service.AccountInformationService;
import me.eoh_digital.service.AccountService;
import me.eoh_digital.service.ItemisedBillService;
import me.eoh_digital.views.AccountInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    @RequestMapping(value = {"/", "/accounts"}, method = RequestMethod.GET)
    public String accounts(Model model){
        String str = "Some additional data.";
        List<AccountEntity> accounts = accountService.findAll();
        model.addAttribute("data", accounts);
        return "accountSearch";
    }

    @RequestMapping(value = "/accountSearch", method = RequestMethod.POST)
    public String accountSearch(@ModelAttribute("account") AccountEntity account, BindingResult result,  Model model){
        AccountEntity results = (AccountEntity) result.getModel().get("account");
        results = accountService.findByAccountNumber(results.getAccountNumber());
        System.out.println(results);
        AccountInformation accountInformation = accountInformationService.findByAccountNumber(results.getAccountNumber());
        if(accountInformation != null)
            model.addAttribute("accountInformation", accountInformation);
        else
            return "accountNotFound";

        return "accountDetails";
    }

    @RequestMapping(value = "/details", method = RequestMethod.GET)
    public String details(Model model){
        model.addAttribute("accountDetails", "accountDetails");
        return "accountDetails";
    }

    @RequestMapping(value = "/billItems", method = RequestMethod.POST)
    public String bilItems(@ModelAttribute("invoiceId") String invoiceId, BindingResult result,  Model model){
        System.out.println(result.getModel().get("invoiceId"));
        List<ItemisedEntity> billItems = itemisedBillService.findAllByInvoiceId(Integer.valueOf((String)result.getModel().get("invoiceId")));
        model.addAttribute("billItems", billItems);
        return "billItems";
    }
}
