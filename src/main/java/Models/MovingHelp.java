package Models;

import java.util.Objects;

public class MovingHelp {
    private int moverId;
    private String mover_name;
    private String image;
    private String physical_address;
    private int phone_number;
    private String email;
    private float rating;
    private String description;

    public MovingHelp(String mover_name, String image, String physical_address, int phone_number, String email, float rating, String description) {
        this.mover_name = mover_name;
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
        if (!(obj instanceof MovingHelp)) return false;
        MovingHelp MovingHelp = (Models.MovingHelp) obj;
        return moverId == MovingHelp.moverId &&
                Objects.equals(mover_name, MovingHelp.mover_name) &&
                Objects.equals(image, MovingHelp.image) &&
                Objects.equals(physical_address, MovingHelp.physical_address) &&
                Objects.equals(phone_number, MovingHelp.phone_number) &&
                Objects.equals(email, MovingHelp.email) &&
                Objects.equals(rating, MovingHelp.rating) &&
                Objects.equals(description, MovingHelp.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                moverId,
                mover_name,
                image,
                physical_address,
                phone_number,
                email,
                rating,
                description
        );
    }

    public int getMoverId() {
        return moverId;
    }

    public void setMoverId(int moverId) {
        this.moverId = moverId;
    }

    public String getMover_name() {
        return mover_name;
    }

    public void setMover_name(String mover_name) {
        this.mover_name = mover_name;
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
