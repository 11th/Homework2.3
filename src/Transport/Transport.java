package Transport;

public abstract class Transport {
    private String brand;
    private String model;
    private int productionYear;
    private String productionCountry;
    private String color;
    private int maxSpeed;

    private String fuel;

    public Transport(String brand, String model, int productionYear, String productionCountry) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (productionYear > 1800) {
            this.productionYear = productionYear;
        }
        if (productionCountry !=null && !productionCountry.isEmpty() && !productionCountry.isBlank()) {
            this.productionCountry = productionCountry;
        } else {
            this.productionCountry = "default";
        }
    }

    public abstract void refill(String fuel);

    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return String.format("Марка %s, Модель %s, Год %d, Страна %s", brand, model, productionYear, productionCountry);
    }
}
