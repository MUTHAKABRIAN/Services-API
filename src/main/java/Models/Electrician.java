package Models;

public class Electrician {
    private int electricianId;
    private String electrician_name;
    private String image;
    private String address;
    private String phone_number;
    private String email;
    private float rating;
    private String description;

    public Electrician(String electrician_name, String image, String address, String phone_number, String email, float rating, String description) {
        this.electrician_name = electrician_name;
        this.image = image;
        this.address = address;
        this.phone_number = phone_number;
        this.email = email;
        this.rating = rating;
        this.description = description;
    }

    public int getElectricianId() {
        return electricianId;
    }

    public void setElectricianId(int electricianId) {
        this.electricianId = electricianId;
    }

    public String getElectrician_name() {
        return electrician_name;
    }

    public void setElectrician_name(String electrician_name) {
        this.electrician_name = electrician_name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
