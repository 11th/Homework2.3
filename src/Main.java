import Transport.Bus;
import Transport.Car;
import Transport.Train;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Grande", 2015, "Россия", "желтый", 1.7, "", 0);
        System.out.println(lada);
        Car audi = new Car("Audi", "A8", 2020, "Германия", "черный", 3.0, "", 0);
        System.out.println(audi);
        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "черный", 3.0, "", 0);
        System.out.println(bmw);
        Car kia = new Car("Kia", "Sportage", 2018, "Южная Корея", "крвсный", 2.4, "", 0);
        System.out.println(kia);
        if (!kia.checkInsurance()){
            System.out.println("Kia: Продлите страховку");
        }
        Car hyndai = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6, "", 0);
        System.out.println(hyndai);
        hyndai.setRegNumber("Х777ХХ777");
        hyndai.changeTyres();
        Car.Insurance insurance = hyndai.new Insurance(365, 5000, "XXX12454");
        hyndai.setInsurance(insurance);
        if (!hyndai.checkInsurance()){
            System.out.println("Hyndai: Продлите страховку");
        }
        if (!hyndai.checkInsuranceNumber()){
            System.out.println("Hyndai: Некорректный номер страховки");
        }
        System.out.println(hyndai);
        hyndai.refill("бензин");

        System.out.println("\n***\n");

        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия",
                3500, 7, "Белорусский вокзал", "Минск-Пассажирский", 11);
        lastochka.setMaxSpeed(301);
        System.out.println(lastochka);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия",
                3500, 7, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        leningrad.setMaxSpeed(270);
        System.out.println(leningrad);
        leningrad.refill("дизель");

        System.out.println("\n***\n");

        Bus paz = new Bus("ПАЗ", "1", 2010, "Россия");
        System.out.println(paz);
        Bus liaz = new Bus("ЛИАЗ", "2", 2020, "Россия");
        System.out.println(liaz);
        Bus volvo = new Bus("Volvo", "v3", 2015, "Швеция");
        System.out.println(volvo);
        volvo.refill("дизель");
    }
}