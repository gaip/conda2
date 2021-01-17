public class Gym extends Facilities{
    EquipmentType equipmentType=EquipmentType.AUTOMATIC;




    public Gym(FacilitiesName nameFacilities, String openingTime, String closingTime, int maxCapacity, int availableSpotForBooking, boolean visitorsAllowed, EquipmentType equipmentType) {
        super(nameFacilities, openingTime, closingTime, maxCapacity, availableSpotForBooking, visitorsAllowed);
        this.equipmentType = equipmentType;
    }
}
