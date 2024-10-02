package com.rubenKristantoJplane;

import jakarta.persistence.*;

@Entity
@Table(name = "tickets")

public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @ManyToOne
    @JoinColumn(name = "buyer_id", nullable = false)
    private Account buyer;

    @ManyToOne
    @JoinColumn(name = "plane_id", nullable = false)
    private Plane plane;

    @JoinColumn(name = "code", nullable = false)
    private String code;

    public Ticket(Account buyer, Plane plane, String code){
        this.buyer = buyer;
        this.plane = plane;
        this.code = code;
    }

    public Ticket(){;
        buyer = null;
        plane = null;
        code = "";
    }

    public String toString(){
        return "Ticket{ id="+ buyer.getId()+"buyer= "+buyer.getUsername()+"plane=Plane{id= "+plane.getId()+"code= "+plane.getCode()+"Departure city= "+plane.getDepartureCity()+"arrival city= "+plane.getArrivalCity()+"} code = "+code+"}";
    }

    public long getId() {
        return Id;
    }

    public Account getBuyer() {
        return buyer;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getCode() {
        return code;
    }

    public void setId(long id) {
        Id = id;
    }

    public void setBuyer(Account buyer) {
        this.buyer = buyer;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
