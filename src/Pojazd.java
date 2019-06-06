abstract class Pojazd {
    protected String marka;
    protected String model;
    protected String numerRejestracyjny;
    protected String kolor;
    protected double cena;
    protected double spalanieNa100Km;
    protected String silnik;
    protected double stanZbiornika;
    protected double stanLicznika;
    protected final double pojemnoscBaku = 60;

    public Pojazd(String marka, String model, String numerRejestracyjny, String kolor,
                  double cena, double spalanieNa100Km, String silnik, double stanZbiornika, double stanLicznika) {
        this.marka = marka;
        this.model = model;
        this.numerRejestracyjny = numerRejestracyjny;
        this.kolor = kolor;
        this.cena = cena;
        this.spalanieNa100Km = spalanieNa100Km;
        this.silnik = silnik;
        this.stanZbiornika = pojemnoscBaku > stanZbiornika ? stanZbiornika : pojemnoscBaku;
        this.stanLicznika = stanLicznika;
    }

    String info() {
        return "Marka: " + marka + "\nModel: " + model + "\nNumer rejestracyjny: " + numerRejestracyjny + "\nKolor: " +
                kolor + "\nCena: " + cena + "\nSpalanie: " + spalanieNa100Km + "\nSilnik: " + silnik +
                "\nStan zbiornika: " + stanZbiornika + "\nStan licznika: " + stanLicznika;
    }

    abstract String typPojazdu();

    void jedz(int km) {
        if (stanZbiornika < (km * (spalanieNa100Km / 100))) {
            double przejechane = km * (spalanieNa100Km / 100);
            stanZbiornika = 0;
            System.out.println("Przejechałeś " + przejechane + "km i skończyło ci się paliwo.");
            stanLicznika += przejechane;
        } else {
            stanLicznika += km;
            stanZbiornika -= km * (spalanieNa100Km / 100);
            System.out.println("Przejechałeś " + km + "km.");
        }
    }

    void tankuj(int iloscZatankowanego){
        double miejsce = pojemnoscBaku - stanZbiornika;
        if (iloscZatankowanego > miejsce) {
            stanZbiornika += miejsce;
            System.out.println("Za mała pojemność baku.\nZatankowano tylko " + miejsce + "l paliwa.");
        } else {
            stanZbiornika += iloscZatankowanego;
            System.out.println("Zatankowano "+ iloscZatankowanego +"l paliwa.");
        }
    }

    double ilePaliwa(){
        return stanZbiornika;
    }

}