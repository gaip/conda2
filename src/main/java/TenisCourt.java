public class TenisCourt extends  Facilities{

    boolean ballRequired;


    public TenisCourt(FacilitiesName nameFacilities, String openingTime, String closingTime, int maxCapacity, int availableSpotForBooking, boolean visitorsAllowed, boolean ballRequired) {
        super(nameFacilities, openingTime, closingTime, maxCapacity, availableSpotForBooking, visitorsAllowed);
        this.ballRequired=ballRequired;
    }
}
