package me.eoh_digital.views;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Admin on 2017/02/16.
 */
public class AccountInformation {
    private String accountNumber;
    private String firstName;
    private String lastName;
    private String email;
    private Integer invoiceId;
    private BigDecimal openingBalance;
    private BigDecimal closingBalance;
    private Date dueDate;

    public AccountInformation(){}

    public AccountInformation(String accountNumber,
                              String firstName,
                              String lastName,
                              String email,
                              Integer invoiceId,
                              BigDecimal openingBalance,
                              BigDecimal closingBalance,
                              Date dueDate) {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.invoiceId = invoiceId;
        this.openingBalance = openingBalance;
        this.closingBalance = closingBalance;
        this.dueDate = dueDate;
    }

    @Override
    public String toString(){
        return String.format("accountInformation{accountNumber:'%s', firstName:'%s', lastName:'%s'," +
                "email:'%s', invoiceId:'%d', openingBalance:'%.2f', closingBalance:'%.2f', dueDate:'%s'}",
                accountNumber, firstName, lastName, email, invoiceId, openingBalance, closingBalance, dueDate);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public BigDecimal getOpeningBalance() {
        return openingBalance;
    }

    public BigDecimal getClosingBalance() {
        return closingBalance;
    }

    public Date getDueDate() {
        return dueDate;
    }
}
