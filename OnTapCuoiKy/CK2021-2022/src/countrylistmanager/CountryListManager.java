package countrylistmanager;

import countryarraymanager.CountryData;

import java.util.*;

public class CountryListManager {

    // Singleton pattern
    private static CountryListManager instance;

    private List<AbstractCountry> countryList;

    private CountryListManager() {
        countryList = new LinkedList<>();
    }

    public static CountryListManager getInstance() {
        /* TODO */
        if (instance == null){
            return new CountryListManager();
        }
        return instance;
    }

    public List<AbstractCountry> getCountryList() {
        return this.countryList;
    }

    public void append(AbstractCountry country) {
        /* TODO */
        countryList.add(country);
    }

    public void add(AbstractCountry country, int index) {
        /* TODO */
        countryList.add(index, country);
    }

    public void remove(int index) {
        /* TODO */
        countryList.remove(index);
    }

    public void remove(AbstractCountry country) {
        /* TODO */
        for (AbstractCountry x : countryList){
            if (x.getName().equals(country.getName())){
                countryList.remove(country);
            }
        }
    }

    public AbstractCountry countryAt(int index) {
        /* TODO */
        return countryList.get(index);
    }

    public List<AbstractCountry> sortIncreasingByPopulation() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return left.getPopulation() - right.getPopulation();
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortDecreasingByPopulation() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return right.getPopulation() - left.getPopulation();
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortIncreasingByArea() {
        /* TODO */
        List<AbstractCountry> newList = new LinkedList<>();
        newList.addAll(countryList);
        for (int i = 0; i < newList.size() - 1; i++){
            for (int j = i + 1; j < newList.size(); j++){
                if (countryList.get(i).getArea() > countryList.get(j).getArea()){
                    AbstractCountry temp = countryList.get(i);
                    countryList.set(i, countryAt(j));
                    countryList.set(j, temp);
                }
            }
        }
        return newList;
    }


//    public List<AbstractCountry> sortDecreasingByArea() {
//        /* TODO */
//    }
//
//    public List<AbstractCountry> sortIncreasingByGdp() {
//        /* TODO */
//    }
//
//    public List<AbstractCountry> sortDecreasingByGdp() {
//        /* TODO */
//    }
//
//    public List<AbstractCountry> filterContinent(String continent) {
//        /* TODO */
//    }
//
//    public List<AbstractCountry> filterMostPopulousCountries(int howMany) {
//        /* TODO */
//    }
//
//    public List<AbstractCountry> filterLeastPopulousCountries(int howMany) {
//        /* TODO */
//    }
//
//    public List<AbstractCountry> filterLargestAreaCountries(int howMany) {
//        /* TODO */
//    }
//
//    public List<AbstractCountry> filterSmallestAreaCountries(int howMany) {
//        /* TODO */
//    }
//
//    public List<AbstractCountry> filterHighestGdpCountries(int howMany) {
//        /* TODO */
//    }
//
//    public List<AbstractCountry> filterLowestGdpCountries(int howMany) {
//        /* TODO */
//    }


    public static String codeOfCountriesToString(List<AbstractCountry> countryList) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (AbstractCountry country : countryList) {
            codeOfCountries.append(country.getCode()).append(" ");
        }
        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(List<AbstractCountry> countryList) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (AbstractCountry country : countryList) {
            countriesString.append(country.toString()).append("\n");
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
