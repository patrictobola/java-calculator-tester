package org.java;

public class Ticket {
    private double pricePerKm = 0.21;
	private double finalPrice;

    public Ticket(int kms, int age) {
        if (kms < 0 || age < 0) {
            throw new IllegalArgumentException("Il numero di km e l'età devono essere numeri positivi.");
        }

        double partialPrice = kms * pricePerKm;
        double finalPrice = partialPrice;

        if (age < 18) {
            finalPrice -= partialPrice * 0.20;
        } else if (age >= 65) {
            finalPrice -= partialPrice * 0.40;
        }

        this.finalPrice = finalPrice;
    }

    public double getFinalPrice() {
        return finalPrice;
    }
}

