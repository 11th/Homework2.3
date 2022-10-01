package Transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int productionYear, String productionCountry) {
        super(brand, model, productionYear, productionCountry);
    }

    @Override
    public void refill(String fuel) {
        System.out.println(String.format("Заправить %s", fuel));
    }
}
