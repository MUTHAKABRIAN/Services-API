package Models;

public class Paint {
    private int painterId ;
    private String painter_name ;
    private String image ;
    private String physical_address ;
    private int  phone_number;
    private String email;
    private float rating;
    private String description;

    public Paint(String painter_name, String image, String physical_address, int phone_number, String email, float rating, String description) {
        this.painter_name = painter_name;
        this.image = image;
        this.physical_address = physical_address;
        this.phone_number = phone_number;
        this.email = email;
        this.rating = rating;
        this.description = description;
    }

    public String getPainter_name() {
        return painter_name;
    }

    public void setPainter_name(String painter_name) {
        this.painter_name = painter_name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhysical_address() {
        return physical_address;
    }

    public void setPhysical_address(String physical_address) {
        this.physical_address = physical_address;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
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

    public int getPainterId() {
        return painterId;
    }

    public void setPainterId(int painterId) {
        this.painterId = painterId;
    }
}
