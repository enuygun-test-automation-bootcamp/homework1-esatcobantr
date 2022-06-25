//Electronics isminde bir abstract class olusturdum.
abstract class Electronics {
    String brand;
    int model;
    int price;
    String battery;
    //Marka model fiyat ve batarya durumunu degiskenlik gosterebilecek sekilde belirledim.
    public abstract void properties();
    //Stokta var olma durumunu ortak ozellik olarak belirledim.
    public void stock() {
        String stock = "Yes";
        System.out.println("Stock: " + stock + "\n");
    }
}

//Electronics sinifinden kalitim alan Desktop sinifini olusturdum ve ozelliklerini atadim.
class Desktop extends Electronics {
    String brand = "MSI";
    int model = 2020;
    int price = 2500;
    String battery = "No";
    public void properties() {
        System.out.println("Desktop\n" + "Brand: " + brand + "\nModel: " + model + "\nPrice: " + price + "\nBattery: " + battery);
    }
}

//Electronics sinifinden kalitim alan Laptop sinifini olusturdum ve ozelliklerini atadim.
class Laptop extends Electronics {
    String brand = "Monster";
    int model = 2021;
    int price = 4000;
    String battery = "Yes";
    public void properties() {
        System.out.println("Laptop\n" + "Brand: " + brand + "\nModel: " + model + "\nPrice: " + price + "\nBattery: " + battery);
    }
}

//Electronics sinifinden kalitim alan Mobile sinifini olusturdum ve ozelliklerini atadim.
class Mobile extends Electronics {
    String brand = "Xiaomi";
    int model = 2022;
    int price = 3000;
    String battery = "Yes";
    public void properties() {
        System.out.println("Mobile\n" + "Brand: " + brand + "\nModel: " + model + "\nPrice: " + price + "\nBattery: " + battery);
    }
}

//Main metodumda nesneleri turetip metotlari cagirdim.
class Homework1 {
    public static void main(String[] args) {
        Desktop myDesktop = new Desktop();
        Laptop myLaptop = new Laptop();
        Mobile myMobile = new Mobile();
        myDesktop.properties();
        myDesktop.stock();
        myLaptop.properties();
        myLaptop.stock();
        myMobile.properties();
        myMobile.stock();
    }
}