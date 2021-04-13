package Models;

import java.util.Objects;

public class Categories {
    private int categoryId;
    private String home_cleaning;
    private String maid_services;
    private String mover_services;
    private String plumbing;
    private String electrician;
    private String carpet_cleaning;
    private String paint_man;

    public Categories(String home_cleaning, String maid_services, String mover_services, String plumbing, String electrician, String carpet_cleaning, String paint_man) {
        this.home_cleaning = home_cleaning;
        this.maid_services = maid_services;
        this.mover_services = mover_services;
        this.plumbing = plumbing;
        this.electrician = electrician;
        this.carpet_cleaning = carpet_cleaning;
        this.paint_man = paint_man;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Categories)) return false;
        Categories categories = (Categories) obj;
        return categoryId == categories.categoryId &&
                Objects.equals(home_cleaning, categories.home_cleaning) &&
                Objects.equals(maid_services, categories.maid_services) &&
                Objects.equals(mover_services, categories.mover_services) &&
                Objects.equals(plumbing, categories.plumbing) &&
                Objects.equals(electrician, categories.electrician) &&
                Objects.equals(carpet_cleaning, categories.carpet_cleaning) &&
                Objects.equals(paint_man, categories.paint_man);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                categoryId,
                home_cleaning,
                maid_services,
                mover_services,
                plumbing,
                electrician,
                carpet_cleaning,
                paint_man
        );
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getHome_cleaning() {
        return home_cleaning;
    }

    public void setHome_cleaning(String home_cleaning) {
        this.home_cleaning = home_cleaning;
    }

    public String getMaid_services() {
        return maid_services;
    }

    public void setMaid_services(String maid_services) {
        this.maid_services = maid_services;
    }

    public String getMover_services() {
        return mover_services;
    }

    public void setMover_services(String mover_services) {
        this.mover_services = mover_services;
    }

    public String getPlumbing() {
        return plumbing;
    }

    public void setPlumbing(String plumbing) {
        this.plumbing = plumbing;
    }

    public String getElectrician() {
        return electrician;
    }

    public void setElectrician(String electrician) {
        this.electrician = electrician;
    }

    public String getCarpet_cleaning() {
        return carpet_cleaning;
    }

    public void setCarpet_cleaning(String carpet_cleaning) {
        this.carpet_cleaning = carpet_cleaning;
    }

    public String getPaint_man() {
        return paint_man;
    }

    public void setPaint_man(String paint_man) {
        this.paint_man = paint_man;
    }
}
