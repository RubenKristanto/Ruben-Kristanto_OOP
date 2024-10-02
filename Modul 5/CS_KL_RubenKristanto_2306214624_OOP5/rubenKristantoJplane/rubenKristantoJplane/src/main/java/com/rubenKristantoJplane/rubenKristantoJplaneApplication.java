package com.rubenKristantoJplane;

import com.rubenKristantoJplane.service.AccountService;
import com.rubenKristantoJplane.service.TicketService;
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

    @Autowired
    private TicketService ticketService;


    public static void main(String[] args) {
        SpringApplication.run(rubenKristantoJplaneApplication.class, args);
    }

        @Bean
        public ApplicationRunner initializer (){
            return args -> {
                List<Account> accounts = accountService.getAllUsers();
                // ganti dengan account yang anda buat saat pre-cs
                Account account = accountService.topUpBalance(1L, "Netlab",
                "myPassword", 200000);
                // ganti buyerId menjadi id account yang anda buat, ganti juga 000menjadi 3 digit terakhir NPM anda
                Ticket ticket = ticketService.bookTicket(1L, 1L, "KL624");
                System.out.println("Added ticket:");
                System.out.println(ticketService.getTicket(ticket.getId()));
                System.out.println("All ticket:");
                List<Ticket> tickets = ticketService.getAllTickets();
                tickets.forEach(x -> System.out.println(x));
                List<Account> updatedAccounts = accountService.getAllUsers();
                System.out.println("All accounts updated:");
                updatedAccounts.forEach(x -> System.out.println(x));
            };
        }
}
