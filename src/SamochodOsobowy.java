public class SamochodOsobowy extends Pojazd {
    int liczbaDrzwi;
    boolean czyMaKlimatyzacje;
    int iloscFoteli;
    final static String typPojazdu = "Samochód Osobowy";

    public SamochodOsobowy(String marka, String model, String numerRejestracyjny, String kolor,
                           double cena, double spalanieNa100Km, String silnik, double stanZbiornika,
                           double stanLicznika, int liczbaDrzwi, boolean czyMaKlimatyzacje, int iloscFoteli) {
        super(marka, model, numerRejestracyjny, kolor, cena, spalanieNa100Km, silnik, stanZbiornika, stanLicznika);
        this.liczbaDrzwi = liczbaDrzwi;
        this.czyMaKlimatyzacje = czyMaKlimatyzacje;
        this.iloscFoteli = iloscFoteli;
    }


    String czyMaKlimatyzacje(boolean czyMaKlimatyzacje) {
        if (czyMaKlimatyzacje == true) {
            return "Tak";
        } else {
            return "Nie.";
        }
    }

    @Override
    String info() {
        return super.info() + "\nLiczba drzwi: " + liczbaDrzwi + "\nKlimatyzacja: " + czyMaKlimatyzacje(this.czyMaKlimatyzacje) +
                "\nIlosc foteli: " + iloscFoteli + "\n" + typPojazdu();
    }


    @Override
    String typPojazdu() {
        return "Typ pojazdu: " + typPojazdu;
    }

}
