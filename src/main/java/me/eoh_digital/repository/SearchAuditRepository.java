package me.eoh_digital.repository;

import java.time.LocalDateTime;

/**
 * Created by Admin on 2017/02/17.
 */

public interface SearchAuditRepository {
    void recordAccountSearch(LocalDateTime date, String accountNumber, String username);
}
