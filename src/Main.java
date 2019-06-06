import java.util.*;



public class Main {

    public static void main(String[] args) {
        List<String> zad1 = new ArrayList<>();
        zad1.add("String 1");
        zad1.add("String 2");
        zad1.add("String 3");
        System.out.println(zad1);

        Set<Long> zad2 = new HashSet<>();
        zad2.add(1235413l);
        zad2.add(2345346256l);
        zad2.add(23454643756748678l);
        System.out.println(zad2);


        Map<String, Double> zad3 = new HashMap<>();
        zad3.put("Kebab", 14.5);
        zad3.put("Ksiazka", 5.99);
        zad3.put("Krzeslo", 199.99);
        for (String s : zad3.keySet()) {
            System.out.println(s + " " + zad3.get(s));
        }

        Set<String> zad4 = new HashSet<>();
        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int nrWyrazu = i + 1;
            System.out.println("Podaj wyraz nr: " + nrWyrazu);
            String wyraz = reader.next();
            zad4.add(wyraz);
        }
        System.out.println(zad4);

        Map<String, String> slownik = new HashMap<>();
        slownik.put("table", "stol");
        slownik.put("chair", "krzeslo");
        slownik.put("window", "okno");

        while (true) {
            System.out.println("Wpisz 'exit' zeby wyjsc\nPodaj szukany wyraz: ");
            String wyraz = reader.next();
            if (wyraz.equals("exit")) {
                break;
            }
            if (slownik.containsKey(wyraz)) {
                System.out.println("Tlumaczenie tego wyrazu to: " + slownik.get(wyraz));
            } else {
                System.out.println("Brak podanego wyrazu w słowniku.");
            }
        }

        List<SamochodOsobowy> samochody = new ArrayList<>();
        SilnikBenzynowy silnik1 = new SilnikBenzynowy();
        SamochodOsobowy samochod1 = new SamochodOsobowy("Fiat", "Punto", "NOE78EJ", "niebieski",
                150.00, 6.5, silnik1.getRodzaj(), 12, 14500, 5, true, 5);
        samochody.add(samochod1);
        SilnikBenzynowy silnik2 = new SilnikBenzynowy();
        SamochodOsobowy samochod2 = new SamochodOsobowy("Mercedes", "190", "NOE78EJ", "czerwony",
                150.00, 5.0, silnik2.getRodzaj(), 12, 14500, 5, true, 5);
        samochody.add(samochod2);

        SilnikBenzynowy silnik3 = new SilnikBenzynowy();
        SamochodOsobowy samochod3 = new SamochodOsobowy("Audi", "A4", "BI345763", "Biały",
                150.00, 5.0, silnik3.getRodzaj(), 12, 14500, 5, true, 5);
        samochody.add(samochod3);

        System.out.println(samochody);

    }
}
