package com.rubenKristantoJplane;

import com.rubenKristantoJplane.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.List;

@SpringBootApplication
public class rubenKristantoJplaneApplication {

    @Autowired
    private AccountService accountService;


    public static void main(String[] args) {
        SpringApplication.run(rubenKristantoJplaneApplication.class, args);
    }

    @Bean
    public ApplicationRunner initializer (){
        return args -> {
            accountService.registerAccount("Netlab", "myPassword"); //ganti username dengan nama kalian dan password nya bebas (jangan password asli yaa)
            List<Account> accounts = accountService.getAllUsers();
            accounts.forEach(account -> System.out.println(account));
        };
    }
}
