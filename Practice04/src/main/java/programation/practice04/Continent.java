package programation.practice04;

public class Continent {

    private String nombre;
    private Country[] countries = new Country[3];

    public Continent(String name) {
        this.nombre = name;
    }

    public void addCountry(String name) {
        Country newCountry = new Country(name);
        saveCountry(newCountry);
    }

    public void saveCountry(Country newCountry) {
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] == null) {
                countries[i] = newCountry;
                break;
            }
        }
    }

    public void addCityinCountry(String country, String city, int population, boolean capital) {

        for (int i = 0; i < countries.length; i++) {
            if (countries[i].getName().equals(country)) {
                countries[i].addCity(city, population, capital);
                break;
            }
        }
    }

    public int getTotalPopulationContinent() {
        int total = 0;
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] != null) {
                total += countries[i].getTotalPopulationCountry();
            }
        }
        return total;
    }

    public void getCapitalListContinent() {
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] != null) {
                System.out.println((i + i) + ".- " + countries[i].getCapitalName());
            } else {
                break;
            }

        }

    }

    public String getListCountries() {
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] != null) {
                System.out.println((i + 1) + ".- " + countries[i].getName());
            } else {
                break;
            }
        }
        return "";
    }

    public String getListCities() {
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] != null) {
                countries[i].getListCities();
            } else {
                break;
            }
        }
        return "";
    }

    public String getAllDetails() {
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] != null) {
                System.out.println("\nCountries");
                System.out.println((i+1)+".- "+countries[i].getName()+" have " + countries[i].getTotalPopulationCountry()+" population.");
                System.out.println("\nCities");
                countries[i].getListCitiesPopulation();
            } else {
                break;
            }
        }
        return "";
    }

}
