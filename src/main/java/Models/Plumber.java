package Models;

import java.util.Objects;

public class Plumber {
   private int plumberId ;
   private String plumber_name ;
   private String image ;
   private String physical_address ;
   private int  phone_number;
   private String email;
   private float rating;
   private String description;

    public Plumber(String plumber_name, String image, String physical_address, int phone_number, String email, float rating, String description) {
        this.plumber_name = plumber_name;
        this.image = image;
        this.physical_address = physical_address;
        this.phone_number = phone_number;
        this.email = email;
        this.rating = rating;
        this.description = description;
    }

    public int getPlumberId() {
        return plumberId;
    }

    public void setPlumberId(int plumberId) {
        this.plumberId = plumberId;
    }

    public String getPlumber_name() {
        return plumber_name;
    }

    public void setPlumber_name(String plumber_name) {
        this.plumber_name = plumber_name;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)return true;
        if (obj == null || getClass() !=obj.getClass())return false;
        Plumber that =(Plumber) obj;
        return plumberId == that.plumberId &&
                Objects.equals(plumber_name,that.plumber_name)&&
                Objects.equals(image,that.image)&&
                Objects.equals(physical_address,that.physical_address)&&
                Objects.equals(email,that.email)&&
                Objects.equals(rating,that.rating)&&
                Objects.equals(description,that.description);

    }

    @Override
    public int hashCode() {
        return Objects.hash(plumberId,plumber_name,image,physical_address,email,rating,description);
    }
}
