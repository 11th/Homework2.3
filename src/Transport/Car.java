package Transport;

public class Car extends Transport {
    public static class Key{
        private boolean remoteStart;
        private boolean accessWoKey;

        public Key(boolean remoteStart, boolean accessWoKey) {
            this.remoteStart = remoteStart;
            this.accessWoKey = accessWoKey;
        }
    }

    public class Insurance {
        private int availDays;
        private final double cost;
        private final String number;

        public Insurance(int availDays, double cost, String number) {
            if (availDays > 0){
                this.availDays = availDays;
            } else {
                this.availDays = 0;
            }
            if (cost > 0){
                this.cost = cost;
            } else {
                this.cost = 0;
            }
            this.number = number;
        }
    }

    private String bodyType;
    private int seats;
    private double engineVolume;
    private String transmission;
    private String regNumber;
    private boolean isWinterTyres;

    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, int productionYear, String productionCountry, String bodyType, int seats ){
        this(brand, model, productionYear, productionCountry, null, 0, bodyType, seats,
                null, null, false);
    }

    public Car(String brand, String model, int productionYear, String productionCountry, String color, double engineVolume,
               String bodyType, int seats ) {
        this(brand, model, productionYear, productionCountry, color, engineVolume,
                bodyType, seats, null, null, false
        );
    }

    public Car(String brand, String model, int productionYear, String productionCountry, String color, double engineVolume,
               String bodyType, int seats, String transmission, String regNumber, boolean isWinterTyres) {
        super(brand, model, productionYear, productionCountry);
        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()){
            this.bodyType = bodyType;
        } else {
            this.bodyType = "седан";
        }
        if (seats > 0){
            this.seats = seats;
        } else {
            this.seats = 4;
        }
        setEngineVolume(engineVolume);
        setColor(color);
        setTransmission(transmission);
        setRegNumber(regNumber);
        setWinterTyres(isWinterTyres);

        this.key = new Key(false, false);
        this.insurance = new Insurance(0, 0, "");
    }

    @Override
    public void refill(String fuel) {
        System.out.println(String.format("Заправить %s", fuel));
    }

    public void changeTyres(){
        isWinterTyres = !isWinterTyres;
    }

    public boolean checkRegNumber(String regNumber){
        if (regNumber != null && !regNumber.isEmpty() && !regNumber.isBlank()) {
            if (regNumber.matches("^[АВЕКМНОРСТУХ]\\d{3}(?<!000)[АВЕКМНОРСТУХ]{2}\\d{2,3}$")) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean checkInsurance(){
        if (this.insurance.availDays == 0){
            return false;
        }
        return true;
    }

    public boolean checkInsuranceNumber(){
        if (this.insurance.number.length() != 9){
            return false;
        }
        return true;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
        if (color == null || color.isEmpty() || color.isBlank()){
            super.setColor("белый");
        }
    }

    public void setTransmission(String transmission) {
        if (transmission != null && !transmission.isEmpty() && !transmission.isBlank()) {
            this.transmission = transmission;
        } else {
            this.transmission = "auto";
        }
    }

    public void setRegNumber(String regNumber) {
        if (checkRegNumber(regNumber)){
            this.regNumber = regNumber;
        } else {
            this.regNumber = "x000xx000";
        }
    }

    public void setWinterTyres(boolean isWinterTyres) {
        isWinterTyres = isWinterTyres;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getTransmission() {
        return transmission;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public int getSeats() {
        return seats;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean getWinterTyres() {
        return isWinterTyres;
    }

    @Override
    public String toString() {
        return String.format(
                "%s %s, %d год, сборка %s, цвет %s, двигатель %s, кузов %s, мест %d, КПП %s, номер %s, шины зимние %b",
                getBrand(), getModel(), getProductionYear(), getProductionCountry(), getColor(),
                engineVolume, bodyType, seats, transmission, regNumber, isWinterTyres
        );
    }
}
