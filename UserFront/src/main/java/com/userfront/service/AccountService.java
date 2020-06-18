package com.userfront.service;

import java.security.Principal;

import com.userfront.Domain.PrimaryAccount;
import com.userfront.Domain.SavingsAccount;

public interface AccountService {
	PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
    
    
}
