package me.eoh_digital.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created by Admin on 2017/02/16.
 */
@Entity
@Table(name = "invoice", schema = "", catalog = "digital")
public class InvoiceEntity {
    private Integer invoiceId;
    private Integer accountId;
    private BigDecimal openingBalance;
    private BigDecimal closingBalance;
    private Date invoiceDueDate;
    private AccountEntity accountByAccountId;

    @Id
    @Column(name = "invoiceId")
    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    @Basic
    @Column(name = "openingBalance")
    public BigDecimal getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(BigDecimal openingBalance) {
        this.openingBalance = openingBalance;
    }

    @Basic
    @Column(name = "closingBalance")
    public BigDecimal getClosingBalance() {
        return closingBalance;
    }

    public void setClosingBalance(BigDecimal closingBalance) {
        this.closingBalance = closingBalance;
    }

    @Basic
    @Column(name = "invoiceDueDate")
    public Date getInvoiceDueDate() {
        return invoiceDueDate;
    }

    public void setInvoiceDueDate(Date invoiceDueDate) {
        this.invoiceDueDate = invoiceDueDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InvoiceEntity that = (InvoiceEntity) o;

        if (invoiceId != null ? !invoiceId.equals(that.invoiceId) : that.invoiceId != null) return false;
        if (openingBalance != null ? !openingBalance.equals(that.openingBalance) : that.openingBalance != null)
            return false;
        if (closingBalance != null ? !closingBalance.equals(that.closingBalance) : that.closingBalance != null)
            return false;
        if (invoiceDueDate != null ? !invoiceDueDate.equals(that.invoiceDueDate) : that.invoiceDueDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = invoiceId != null ? invoiceId.hashCode() : 0;
        result = 31 * result + (openingBalance != null ? openingBalance.hashCode() : 0);
        result = 31 * result + (closingBalance != null ? closingBalance.hashCode() : 0);
        result = 31 * result + (invoiceDueDate != null ? invoiceDueDate.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "accountId", referencedColumnName = "accountId", nullable = false)
    public AccountEntity getAccountByAccountId() {
        return accountByAccountId;
    }

    public void setAccountByAccountId(AccountEntity accountByAccountId) {
        this.accountByAccountId = accountByAccountId;
    }

    @Override
    public String toString(){
        return String.format("invoice{invoiceId:'%d', openingBalance:'%.2f', closingBalance:'%.2f', invoiceDueDate:'%s'}",
                invoiceId, openingBalance, closingBalance, invoiceDueDate);
    }
}
