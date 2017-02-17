package me.eoh_digital.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by Admin on 2017/02/16.
 */
@Entity
@Table(name = "audit", schema = "", catalog = "digital")
public class AuditEntity {
    private Integer auditId;
    private Date auditDate;
    private Time auditTime;
    private String accountViewed;
    private String username;

    @Id
    @Column(name = "auditId")
    public Integer getAuditId() {
        return auditId;
    }

    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
    }

    @Basic
    @Column(name = "auditDate")
    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    @Basic
    @Column(name = "auditTime")
    public Time getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Time auditTime) {
        this.auditTime = auditTime;
    }

    @Basic
    @Column(name = "accountViewed")
    public String getAccountViewed() {
        return accountViewed;
    }

    public void setAccountViewed(String accountViewed) {
        this.accountViewed = accountViewed;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuditEntity that = (AuditEntity) o;

        if (auditId != null ? !auditId.equals(that.auditId) : that.auditId != null) return false;
        if (auditDate != null ? !auditDate.equals(that.auditDate) : that.auditDate != null) return false;
        if (auditTime != null ? !auditTime.equals(that.auditTime) : that.auditTime != null) return false;
        if (accountViewed != null ? !accountViewed.equals(that.accountViewed) : that.accountViewed != null)
            return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = auditId != null ? auditId.hashCode() : 0;
        result = 31 * result + (auditDate != null ? auditDate.hashCode() : 0);
        result = 31 * result + (auditTime != null ? auditTime.hashCode() : 0);
        result = 31 * result + (accountViewed != null ? accountViewed.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){
        return String.format("audit{auditId:'%d', auditDate:'%s', auditTime:'%s', accountViewed:'%s', username:'%s'}",
                auditId, auditDate, auditTime, accountViewed, username);
    }
}
