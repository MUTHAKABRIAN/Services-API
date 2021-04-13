package Models;

import java.util.Objects;

public class Maid {
    private int maidId;
    private String maid_name;
    private String image;
    private String physical_address;
    private int phone_number;
    private String email;
    private float rating;
    private String description;

    public Maid(String maid_name, String image, String physical_address, int phone_number, String email, float rating, String description) {
        this.maid_name = maid_name;
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
        if (!(obj instanceof Maid)) return false;
        Maid maid = (Maid) obj;
        return maidId == maid.maidId &&
                Objects.equals(maid_name, maid.maid_name) &&
                Objects.equals(image, maid.image) &&
                Objects.equals(physical_address, maid.physical_address) &&
                Objects.equals(phone_number, maid.phone_number) &&
                Objects.equals(email, maid.email) &&
                Objects.equals(rating, maid.rating) &&
                Objects.equals(description, maid.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                maidId,
                maid_name,
                image,
                physical_address,
                phone_number,
                email,
                rating,
                description
        );
    }

    public int getMaidId() {
        return maidId;
    }

    public void setMaidId(int maidId) {
        this.maidId = maidId;
    }

    public String getMaid_name() {
        return maid_name;
    }

    public void setMaid_name(String maid_name) {
        this.maid_name = maid_name;
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
