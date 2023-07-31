package programation.practice04;

public class Country {

    private String name;
    private City[] cities = new City[5];

    public Country(String name) {
        this.name = name;
    }

  
    public String getName() {
        return name;
    }

    public void addCity(String name, int population, boolean capital) {
        City newCity = new City(name, population, capital);
        saveCity(newCity);
    }

    public void saveCity(City newCity) {
        for (int i = 0; i < cities.length; i++) {
            if (cities[i] == null) {
                cities[i] = newCity;
                break;
            }
        }
    }

    public int getTotalPopulationCountry() {
        int total = 0;
        for (int i = 0; i < cities.length; i++) {
            if (cities[i] != null) {
                total += cities[i].getPopulation();
            } else {
                break;
            }
        }
        return total;
    }

    public String getCapitalName() {
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].isCapital() == true) {
                return cities[i].getName() + " is the capital.";
            }
        }
        return "There is no capital.";
    }

    public String getListCities() {
        for (int i = 0; i < cities.length; i++) {
            if (cities[i] != null) {
                System.out.println((i + 1) + ".- " + cities[i].getName());
            }
        }
        return "";
    }
    
    public String getListCitiesPopulation() {
        for (int i = 0; i < cities.length; i++) {
            if (cities[i] != null) {
                System.out.println((i + 1) + ".- " + cities[i].getName()+" have around "+cities[i].getPopulation()+" of population.");
            }
        }
        return "";
    }

}
