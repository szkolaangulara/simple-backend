package szkolaangulara.com.data;

public class CarModel {
    private String brand;
    private String model;
    private String vin;
    private String engine;
    private String bodyType;
    private Integer price;

    CarModel(String brand, String model, String vin, String engine, String bodyType, Integer price) {
        this.brand = brand;
        this.model = model;
        this.vin = vin;
        this.engine = engine;
        this.bodyType = bodyType;
        this.price = price;
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

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
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
}