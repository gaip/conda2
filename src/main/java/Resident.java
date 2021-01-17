public class Resident {
    String name;
    String apartmentNumber;
    String towerName;


    public Resident(String name, String apartmentNumber, String towerName) {
        this.name = name;
        this.apartmentNumber = apartmentNumber;
        this.towerName = towerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getTowerName() {
        return towerName;
    }

    public void setTowerName(String towerName) {
        this.towerName = towerName;
    }
}
