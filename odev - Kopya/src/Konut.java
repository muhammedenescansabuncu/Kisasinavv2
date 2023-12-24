public abstract class Konut {
    String adres;

    Konut(String adres) {//UMLde yazdigi gibi Konutun string olan constructerını verdik
        this.adres = adres;
    }


    void displayInfo() {//Displayinfoyla adresi yazdırdık ve bunu Polymorphism mantıgıyla kullanıcaz
        System.out.println("Adres : " + adres);
    }
}