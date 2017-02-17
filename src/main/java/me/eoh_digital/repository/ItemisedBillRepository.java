package me.eoh_digital.repository;

import me.eoh_digital.model.ItemisedEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Admin on 2017/02/17.
 */
public interface ItemisedBillRepository {
    List<ItemisedEntity> findAllByInvoiceId(Integer id);
}
