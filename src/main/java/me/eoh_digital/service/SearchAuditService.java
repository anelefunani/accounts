package me.eoh_digital.service;

import java.time.LocalDateTime;

/**
 * Created by Admin on 2017/02/17.
 */
public interface SearchAuditService {
    void recordAccountSearch(LocalDateTime date, String accountNumber, String username);
}
