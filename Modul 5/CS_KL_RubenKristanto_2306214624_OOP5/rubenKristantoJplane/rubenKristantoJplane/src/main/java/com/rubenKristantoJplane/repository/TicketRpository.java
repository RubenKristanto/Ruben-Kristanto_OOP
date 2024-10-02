package com.rubenKristantoJplane.repository;

import com.rubenKristantoJplane.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRpository extends JpaRepository<Ticket, Long> {
   Ticket findFirstByCode(String Code);
}


