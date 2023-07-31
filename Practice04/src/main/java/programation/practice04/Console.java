package programation.practice04;

public class Console {

    public static void main(String[] args) {
        Continent SudAmerica = new Continent("SudAmerica");
        Country Bolivia = new Country("Bolivia");
        Country Venezuela = new Country("Venezuela");

        SudAmerica.saveCountry(Bolivia);
        SudAmerica.saveCountry(Venezuela);

        Bolivia.addCity("Sucre", 313455, true);
        Bolivia.addCity("Cochabamba", 23456, false);
        Venezuela.addCity("Caracas", 5423567, true);
        Venezuela.addCity("Valencia", 64256, false);

        SudAmerica.addCityinCountry("Bolivia", "La Paz", 412345, false);
        SudAmerica.addCityinCountry("Venezuela", "Maracaibo", 2545678, false);

        System.out.println(Bolivia.getCapitalName());
        System.out.println(Bolivia.getTotalPopulationCountry());
        Bolivia.getListCities();
        System.out.println(Venezuela.getCapitalName());
        System.out.println(Venezuela.getTotalPopulationCountry());
        Venezuela.getListCities();
        System.out.println("-=[+]=-");
        SudAmerica.getAllDetails();
        System.out.println("-=[+]=-");
        System.out.println(SudAmerica.getTotalPopulationContinent());

    }

}
