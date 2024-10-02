package com.rubenKristantoJplane.service;

import com.rubenKristantoJplane.Account;
import com.rubenKristantoJplane.Plane;
import com.rubenKristantoJplane.Ticket;
import com.rubenKristantoJplane.repository.AccountRepository;
import com.rubenKristantoJplane.repository.PlaneRepository;
import com.rubenKristantoJplane.repository.TicketRpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    private TicketRpository ticketRepository;

    @Autowired
    private PlaneRepository planeRepository;

    @Autowired
    private AccountRepository accountRepository;

    public Ticket getTicket(Long ticketID){
        Ticket ticket = ticketRepository.findById(ticketID).orElseThrow(() -> new RuntimeException("Ticket not found"));
        return ticket;
    }

    public List<Ticket> getAllTickets(){
        return ticketRepository.findAll();
    }

    public Ticket bookTicket(Long buyerId, Long planeId, String code) throws Exception {
        Plane plane = planeRepository.findById(planeId).orElseThrow(() -> new Exception("Plane not found with id: " + planeId));

        Account buyer = accountRepository.findById(buyerId).orElseThrow(() -> new Exception("Buyer not found with id: " + buyerId));

        Ticket ticket = new Ticket(buyer, plane, code);

        if (buyer.getBalance() >= 100000) {
            buyer.setBalance(buyer.getBalance() - 100000);
        } else {
            throw new Exception("Insufficient balance.");
        }

        ticketRepository.save(ticket);

        accountRepository.save(buyer);

        return ticket;
    }
}