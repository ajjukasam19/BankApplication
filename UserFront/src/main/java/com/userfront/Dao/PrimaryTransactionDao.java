package com.userfront.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.userfront.Domain.PrimaryTransaction;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}
