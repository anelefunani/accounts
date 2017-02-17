package me.eoh_digital.model;

import javax.persistence.*;

/**
 * Created by Admin on 2017/02/16.
 */

@Entity
@Table(name = "account", schema = "", catalog = "digital")
public class AccountEntity {
    private Integer accountId;
    private String accountNumber;

    @Id
    @Column(name = "accountId")
    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "accountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountEntity that = (AccountEntity) o;

        if (accountId != null ? !accountId.equals(that.accountId) : that.accountId != null) return false;
        if (accountNumber != null ? !accountNumber.equals(that.accountNumber) : that.accountNumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = accountId != null ? accountId.hashCode() : 0;
        result = 31 * result + (accountNumber != null ? accountNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){
        return String.format("account{accountId:'%d', accountNumber:'%s'}", accountId, accountNumber);
    }
}
