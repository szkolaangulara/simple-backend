package szkolaangulara.com.data;

public class Car {
    private String brand;
    private String model;
    private String vin;
    private String engineType;
    private String type;
    private Integer price;
    private String photoSource;

    Car(String brand, String model, String vin, String engineType, String type, Integer price, String photoSource) {
        this.brand = brand;
        this.model = model;
        this.vin = vin;
        this.engineType = engineType;
        this.type = type;
        this.price = price;
        this.photoSource = photoSource;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhotoSource() {
        return photoSource;
    }

    public void setPhotoSource(String photoSource) {
        this.photoSource = photoSource;
    }
}