package org.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicketTest {

    @Test
    public void testTicketCreation() {
        Ticket ticket = new Ticket(50, 25);
        assertNotNull(ticket);
    }

    @Test
    public void testFinalPriceWithoutDiscount() {
        Ticket ticket = new Ticket(50, 25);
        assertEquals(10.50, ticket.getFinalPrice(), 0.01);
    }

    @Test
    public void testFinalPriceWithYouthDiscount() {
        Ticket ticket = new Ticket(50, 16);
        assertEquals(8.40, ticket.getFinalPrice(), 0.01);
    }

    @Test
    public void testFinalPriceWithSeniorDiscount() {
        Ticket ticket = new Ticket(50, 70);
        assertEquals(6.30, ticket.getFinalPrice(), 0.01);
    }

    @Test
    public void testTicketCreationWithNegativeKm() {
        assertThrows(IllegalArgumentException.class, () -> new Ticket(-50, 25));
    }

    @Test
    public void testTicketCreationWithNegativeAge() {
        assertThrows(IllegalArgumentException.class, () -> new Ticket(50, -25));
    }
}
