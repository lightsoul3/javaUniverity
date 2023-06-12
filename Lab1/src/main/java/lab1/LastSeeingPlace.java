package lab1;

import java.util.Objects;

/**
 * class "Vanished" with fields: reginName, streetName, houseNumber
 * @author User
 * @version 1.0
 */

public class LastSeeingPlace {
    private String regionName;
    private String streetName;
    private String houseNumber;

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    /**
     * Overridden function of comparison an instance of
     * the class "LastSeeingPlace" and an instance of the class "Object"
     * @return returns the boolean value of the comparison
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LastSeeingPlace)) return false;
        LastSeeingPlace that = (LastSeeingPlace) o;
        return getRegionName().equals(that.getRegionName())
                && getStreetName().equals(that.getStreetName()) && getHouseNumber().equals(that.getHouseNumber());
    }

    /**
     * Overridden function of obtaining the hash code
     * @return returns the numeric value of the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getRegionName(), getStreetName(), getHouseNumber());
    }

    /**
     * Class "Builder" with fields: lastSeeingPlace
     * @author User
     * @version 1.0
     */
    @Override
    public String toString() {
        return "LastSeeingPlace{" +
                "regionName='" + regionName + '\'' +
                ", streetName='" + streetName + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                '}';
    }

    public static class Builder{
        private LastSeeingPlace lastSeeingPlace;
        public Builder(){
            lastSeeingPlace = new LastSeeingPlace();
        }

        /**
         * Setter type designation
         * @param regionName - region name
         * @return returns current object
         */
        public Builder setRegionName(String regionName){
            lastSeeingPlace.regionName = regionName;
            return this;
        }

        /**
         * Setter type designation
         * @param streetName - street name
         * @return returns current object
         */
        public Builder setStreetName(String streetName){
            lastSeeingPlace.streetName = streetName;
            return this;
        }

        /**
         * Setter type designation
         * @param houseNumber - house number
         * @return returns current object
         */
        public Builder setHouseNumber(String houseNumber){
            lastSeeingPlace.houseNumber = houseNumber;
            return this;
        }

        /**
         * Function of creating an object of class "LastSeeingPlace"
         * @return returns new object of class "LastSeeingPlace"
         */
        public LastSeeingPlace build(){
            return lastSeeingPlace;
        }
    }

    public static void main(String args[]) {
    }
}
