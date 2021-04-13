package Models;

import java.util.Objects;

public class cleaner {
    private int cleanerId;
    private String cleaner_name;
    private String image;
    private String physical_address;
    private int phone_number;
    private String email;
    private float rating;
    private String description;

    public cleaner(String cleaner_name, String image, String physical_address, int phone_number, String email, float rating, String description) {
        this.cleaner_name = cleaner_name;
        this.image = image;
        this.physical_address = physical_address;
        this.phone_number = phone_number;
        this.email = email;
        this.rating = rating;
        this.description = description;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof cleaner)) return false;
        cleaner cleaner = (Models.cleaner) obj;
        return cleanerId == cleaner.cleanerId &&
                Objects.equals(cleaner_name, cleaner.cleaner_name) &&
                Objects.equals(image, cleaner.image) &&
                Objects.equals(physical_address, cleaner.physical_address) &&
                Objects.equals(phone_number, cleaner.phone_number) &&
                Objects.equals(email, cleaner.email) &&
                Objects.equals(rating, cleaner.rating) &&
                Objects.equals(description, cleaner.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                cleanerId,
                cleaner_name,
                image,
                physical_address,
                phone_number,
                email,
                rating,
                description
        );
    }

    public int getCleanerId() {
        return cleanerId;
    }

    public void setCleanerId(int cleanerId) {
        this.cleanerId = cleanerId;
    }

    public String getCleaner_name() {
        return cleaner_name;
    }

    public void setCleaner_name(String cleaner_name) {
        this.cleaner_name = cleaner_name;
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
}
