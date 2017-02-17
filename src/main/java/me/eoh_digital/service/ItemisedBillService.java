package me.eoh_digital.service;

import me.eoh_digital.model.ItemisedEntity;

import java.util.List;

/**
 * Created by Admin on 2017/02/17.
 */

public interface ItemisedBillService {
    List<ItemisedEntity> findAllByInvoiceId(Integer id);
}
