import java.util.HashMap;
import java.util.Map;

public class FacilityMain
{

    static Map<FacilitiesName,Facilities> facilities1 = new HashMap<>();
    public static void main(String[] args) {
        Gym gymRoom = new Gym(FacilitiesName.Gym1,"9:00","19:00",10,10,true,EquipmentType.AUTOMATIC);
        SwimmingPool swimmingPool = new SwimmingPool(FacilitiesName.POOL1, "8:00","20:00", 10,10, true, WaterQuality.GOOD);
        TenisCourt tenisCourt = new TenisCourt(FacilitiesName.COURT1,"10:00","19:00",4,4,true,true);

        facilities1.put(FacilitiesName.Gym1,gymRoom);
        facilities1.put(FacilitiesName.POOL1,swimmingPool);
        facilities1.put(FacilitiesName.COURT1,tenisCourt);

        Resident requester = new Resident("amar", "10A", "metropolis");

        FacilitiesName facilitiesName = FacilitiesName.Gym1;
        String bookingID=BookingImpl.bookFacilites(requester, facilitiesName,4);
        BookingImpl.printBookingDetails(bookingID);



    }
}
