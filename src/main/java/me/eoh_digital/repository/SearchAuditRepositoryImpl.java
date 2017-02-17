package me.eoh_digital.repository;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Admin on 2017/02/17.
 */
@Repository
@Transactional
public class SearchAuditRepositoryImpl implements SearchAuditRepository {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void recordAccountSearch(LocalDateTime date, String accountNumber, String username) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        String sqlDate = dateFormat.format(date);
        String sqlTime = timeFormat.format(date);
        String sql = String.format("INSERT INTO audit (auditDate, auditTime, accountViewed, username) VALUES (:date, :time, :accountViewed, :username)");
        Query query = sessionFactory.getCurrentSession().createNativeQuery(sql);
        query.setParameter("date", sqlDate);
        query.setParameter("time", sqlTime);
        query.setParameter("accountViewed", accountNumber);
        query.setParameter("username", username);
        query.executeUpdate();
        System.out.println("Audit table updated");
    }
}
