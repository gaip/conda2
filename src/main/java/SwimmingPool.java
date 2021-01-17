import org.jetbrains.annotations.NotNull;

public class SwimmingPool extends Facilities{

    private WaterQuality waterQuality=WaterQuality.GOOD;

    public SwimmingPool(FacilitiesName nameFacilities, String openingTime, String closingTime, int maxCapacity, int availableSpotForBooking, boolean visitorsAllowed, WaterQuality waterQuality) {
        super(nameFacilities, openingTime, closingTime, maxCapacity, availableSpotForBooking, visitorsAllowed);
        this.waterQuality=waterQuality;

    }


}
