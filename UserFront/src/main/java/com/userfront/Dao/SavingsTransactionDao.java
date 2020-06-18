package com.userfront.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.userfront.Domain.SavingsTransaction;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}

