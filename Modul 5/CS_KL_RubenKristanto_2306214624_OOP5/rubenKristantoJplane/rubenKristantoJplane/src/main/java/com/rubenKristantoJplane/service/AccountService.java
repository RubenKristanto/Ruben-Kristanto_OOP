package com.rubenKristantoJplane.service;

import com.rubenKristantoJplane.Account;
import com.rubenKristantoJplane.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account registerAccount(String username, String password) {
        Account user = new Account(username, password);
        return accountRepository.save(user);
    }

    public List<Account> getAllUsers() {
        return accountRepository.findAll();
    }

    public Account topUpBalance(Long accountId, String username, String password, int amount){
        List<Account> accounts = getAllUsers();
        Account query = null;
        for(int i=0; i<accounts.size(); i++){
            if(accounts.get(i).getId() == accountId){
                if(accounts.get(i).getUsername().equals(username) && accounts.get(i).getPassword().equals(password)){
                    accounts.get(i).setBalance(accounts.get(i).getBalance() + amount);
                    accountRepository.save(accounts.get(i));
                    query = accounts.get(i);
                    break;
                }
                else {
                    throw new RuntimeException("Invalid username or password");
                }
            }

            return query;
        }

        return
    }
}

