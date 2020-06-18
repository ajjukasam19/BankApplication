package com.userfront.Dao;

import com.userfront.Domain.PrimaryAccount;
import org.springframework.data.repository.CrudRepository;

/**
 created by ajay
 */
public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount,Long> {

    PrimaryAccount findByAccountNumber (int accountNumber);
}
