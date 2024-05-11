import java.time.LocalDate;
import java.net.InetAddress;

public class Carrot {

    public static void main(String[] args) {
        String producerName = "Lála";
        String producerSurname = "Fardová";
        LocalDate birthDate = LocalDate.of(1977, 8, 19);
        int contracts = 7;
        int carrotSoldTotal = 100;
        String producerTown = "Hluboká nad Vltavou";
        String registrationPlate = "9C2 1713";
        double fuelConsumption = 5.4;
        String ipAddress = "192.168.255.255";

        System.out.println(
                producerName + " " + producerSurname + " prodala průměrně " + (double) carrotSoldTotal /contracts + " tun mrkve na 1 smlouvu");

    }
}
/*
Jméno a příjmení prodejce
Datum narození prodejce.
Počet dosud sjednaných smluv.
Celkové množství prodané mrkve v tunách.
Název města, kde prodejce sídlí.
Registrační značka vozidla („SPZ“).
Spotřeba firemního vozidla v litrech na 100 km.
IP adresa verze 4 firemního počítače.
Více o formátu IP adresy verze 4 viz například IP adresa verze 4
Do proměnných ulož vhodné hodnoty (hodnoty si vymysli tak, aby dávaly smysl).

Na základě zadaných údajů vypiš v metodě main na obrazovku průměrné
množství prodané mrkve na jednu smlouvu.
 */
