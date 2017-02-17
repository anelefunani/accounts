package me.eoh_digital.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by Admin on 2017/02/16.
 */
@Entity
@Table(name = "itemised", schema = "", catalog = "digital")
public class ItemisedEntity {
    private Integer itemisedId;
    private Date callDate;
    private Time callTime;
    private String callType;
    private BigDecimal callCost;
    private InvoiceEntity invoiceByInvoiceId;

    @Id
    @Column(name = "itemisedId")
    public Integer getItemisedId() {
        return itemisedId;
    }

    public void setItemisedId(Integer itemisedId) {
        this.itemisedId = itemisedId;
    }

    @Basic
    @Column(name = "callDate")
    public Date getCallDate() {
        return callDate;
    }

    public void setCallDate(Date callDate) {
        this.callDate = callDate;
    }

    @Basic
    @Column(name = "callTime")
    public Time getCallTime() {
        return callTime;
    }

    public void setCallTime(Time callTime) {
        this.callTime = callTime;
    }

    @Basic
    @Column(name = "callType")
    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    @Basic
    @Column(name = "callCost")
    public BigDecimal getCallCost() {
        return callCost;
    }

    public void setCallCost(BigDecimal callCost) {
        this.callCost = callCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemisedEntity that = (ItemisedEntity) o;

        if (itemisedId != null ? !itemisedId.equals(that.itemisedId) : that.itemisedId != null) return false;
        if (callDate != null ? !callDate.equals(that.callDate) : that.callDate != null) return false;
        if (callTime != null ? !callTime.equals(that.callTime) : that.callTime != null) return false;
        if (callType != null ? !callType.equals(that.callType) : that.callType != null) return false;
        if (callCost != null ? !callCost.equals(that.callCost) : that.callCost != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = itemisedId != null ? itemisedId.hashCode() : 0;
        result = 31 * result + (callDate != null ? callDate.hashCode() : 0);
        result = 31 * result + (callTime != null ? callTime.hashCode() : 0);
        result = 31 * result + (callType != null ? callType.hashCode() : 0);
        result = 31 * result + (callCost != null ? callCost.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "invoiceId", referencedColumnName = "invoiceId", nullable = false)
    public InvoiceEntity getInvoiceByInvoiceId() {
        return invoiceByInvoiceId;
    }

    public void setInvoiceByInvoiceId(InvoiceEntity invoiceByInvoiceId) {
        this.invoiceByInvoiceId = invoiceByInvoiceId;
    }

    @Override
    public String toString(){
        return String.format("itemised{itemisedId:'%d', callDate:'%s', callTime:'%s',callType:'%s' callCost:'%.2f'}",
                itemisedId, callDate, callTime, callType, callCost);
    }
}
