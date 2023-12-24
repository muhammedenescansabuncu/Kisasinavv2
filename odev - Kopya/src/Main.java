public class Main {
    public static void main(String[] args) {
        Bina bina1 = new Bina("Kırklareli", 4);
        evSahibi evSahibi = new evSahibi("Ahmet", "Soyar", bina1);

        // Bir bina nesnesi oluşturup ev sahibine eşledik


        // Daire nesnelerini oluşturup binaya ekledik çünkü bir binanın birden fazla dairesi olabilir
        Daire daire1 = new Daire("Kırklareli", 24, 1);
        Daire daire2 = new Daire("kağıthane", 1, 2);
        Daire daire3 = new Daire("nişantaşı", 3, 3);
        evSahibi.addApartment(daire1);
        evSahibi.addApartment(daire2);
        evSahibi.addApartment(daire3);//daha sonra ev sahibine daire tanımladık

        // Bir kiracı nesnesi oluşturduk ve bu kiracının ev sahibini muhammed sali olarak(evsahibi) atadık
        Kiraci kiraci = new Kiraci("Cem", "Güzel", evSahibi);

        // Şuana kadar tanımladıgımız ev sahibi kiracı ve bina gibi bilgileri yazdırttık
        System.out.println("\nEv sahibi ve Binaları: ");
        evSahibi.displayInfo();
        System.out.println("\n\nBinanın Bilgileri :  ");
        bina1.displayInfo();
        System.out.println("\nDaireler : ");
        daire1.displayInfo();
        daire2.displayInfo();
        daire3.displayInfo();
        System.out.println("\nKiracı : ");
        kiraci.displayInfo();
    }
    //muhammed enes cansabuncu cem güzel //
}