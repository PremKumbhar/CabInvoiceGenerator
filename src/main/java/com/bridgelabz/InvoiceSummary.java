package com.bridgelabz;

public class InvoiceSummary {
    private int numofRides;
    private double totalFare;
    private double avrageFare;

    public InvoiceSummary(int numofRides, double totalFare) {
        this.numofRides = numofRides;
        this.totalFare = totalFare;
        this.avrageFare = this.totalFare;

    }
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof InvoiceSummary)) return false;
        if (!super.equals(object)) return false;
        InvoiceSummary that = (InvoiceSummary) object;
        return numofRides == that.numofRides && java.lang.Double.compare(that.totalFare, totalFare) == 0 && java.lang.Double.compare(that.avrageFare, avrageFare) == 0;
    }

    @Override
    public String toString() {
        return "InvoiceSummary{" +
                "numofRides=" + numofRides +
                ", totalFare=" + totalFare +
                ", avrageFare=" + avrageFare +
                '}';
    }
}
