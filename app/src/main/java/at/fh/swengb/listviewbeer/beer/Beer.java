package at.fh.swengb.listviewbeer.beer;



/**
 * Created by micha on 24.11.2016.
 */

public  class Beer implements java.io.Serializable{

    private String name;
    private String manufacturer;
    private String address;
    private String phoneNumber;

    public Beer() {
    }

    public Beer(String name, String manufacturer, String address, String phoneNumber) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Beer beer = (Beer) o;

        if (name != null ? !name.equals(beer.name) : beer.name != null) return false;
        if (manufacturer != null ? !manufacturer.equals(beer.manufacturer) : beer.manufacturer != null)
            return false;
        if (address != null ? !address.equals(beer.address) : beer.address != null) return false;
        return phoneNumber != null ? phoneNumber.equals(beer.phoneNumber) : beer.phoneNumber == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Beer{");
        sb.append("name='").append(name).append('\'');
        sb.append(", manufacturer='").append(manufacturer).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
