package me.eoh_digital.service;

import me.eoh_digital.repository.SearchAuditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Created by Admin on 2017/02/17.
 */

@Service
public class SearchAuditServiceImpl implements SearchAuditService {
    @Autowired
    private SearchAuditRepository repository;

    @Override
    public void recordAccountSearch(LocalDateTime date, String accountNumber, String username) {
        repository.recordAccountSearch(date, accountNumber, username);
    }
}
