public class Facilities {
    FacilitiesName nameFacilities;
    String openingTime;
    String closingTime;
    int maxCapacity;
    int availableSpotForBooking;
    boolean visitorsAllowed;

    public Facilities(FacilitiesName nameFacilities, String openingTime, String closingTime, int maxCapacity, int availableSpotForBooking, boolean visitorsAllowed) {
        this.nameFacilities = nameFacilities;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.maxCapacity = maxCapacity;
        this.availableSpotForBooking = availableSpotForBooking;
        this.visitorsAllowed = visitorsAllowed;
    }

    public FacilitiesName getNameFacilities() {
        return nameFacilities;
    }

    public void setNameFacilities(FacilitiesName nameFacilities) {
        this.nameFacilities = nameFacilities;
    }

    public String getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public String getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getAvailableSpotForBooking() {
        return availableSpotForBooking;
    }

    public void setAvailableSpotForBooking(int availableSpotForBooking) {
        this.availableSpotForBooking = availableSpotForBooking;
    }

    public boolean isVisitorsAllowed() {
        return visitorsAllowed;
    }

    public void setVisitorsAllowed(boolean visitorsAllowed) {
        this.visitorsAllowed = visitorsAllowed;
    }
}
