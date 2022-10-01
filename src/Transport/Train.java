package Transport;

public class Train extends Transport {
    private double tripPrice;
    private int tripTime;
    private String fromPoint;
    private String toPoint;
    private int unitCount;

    public Train(String brand, String model, int productionYear, String productionCountry) {
        super(brand, model, productionYear, productionCountry);
    }

    public Train(String brand, String model, int productionYear, String productionCountry,
                 double tripPrice, int tripTime, String fromPoint, String toPoint, int unitCount) {
        super(brand, model, productionYear, productionCountry);
        setTripPrice(tripPrice);
        setTripTime(tripTime);
        setFromPoint(fromPoint);
        setToPoint(toPoint);
        setUnitCount(unitCount);
    }

    @Override
    public void refill(String fuel) {
        System.out.println(String.format("Заправить %s", fuel));
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        if (tripPrice > 0) {
            this.tripPrice = tripPrice;
        }
    }

    public int getTripTime() {
        return tripTime;
    }

    public void setTripTime(int tripTime) {
        if (tripTime > 0) {
            this.tripTime = tripTime;
        }
    }

    public String getFromPoint() {
        return fromPoint;
    }

    public void setFromPoint(String fromPoint) {
        if (fromPoint != null && !fromPoint.isEmpty() && !fromPoint.isBlank()) {
            this.fromPoint = fromPoint;
        } else {
            this.fromPoint = "Не указано";
        }
    }

    public String getToPoint() {
        return toPoint;
    }

    public void setToPoint(String toPoint) {
        if (toPoint != null && !toPoint.isEmpty() && !toPoint.isBlank()) {
            this.toPoint = fromPoint;
        } else {
            this.toPoint = "Не указано";
        }
    }

    public int getUnitCount() {
        return unitCount;
    }

    public void setUnitCount(int unitCount) {
        if (unitCount > 0) {
            this.unitCount = unitCount;
        }
    }

    @Override
    public String toString() {
        return String.format("Поезд %s, модель %s, %d год выпуска в %s, скорость передвижения – %d км/ч, отходит от %s и следует до %s. Цена поездки - %s рублей, в поезде %d вагонов",
                getBrand(), getModel(), getProductionYear(), getProductionCountry(), getMaxSpeed(),
                getFromPoint(), getToPoint(), getTripPrice(), getUnitCount()
        );
    }
}
