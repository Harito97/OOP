package countryarraymanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class CountryArrayManager {
    private Country[] countries;
    private int length;
    private int increment;

    public CountryArrayManager() {
        this.increment = 10;
        countries = new Country[this.increment];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        this.increment = 10;
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[this.countries.length + this.increment];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     * using selection sort algorithm.
     *
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (newArray[i].getPopulation() > newArray[j].getPopulation()) {
                    Country country = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = country;
                }
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     *
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (newArray[i].getPopulation() < newArray[j].getPopulation()) {
                    Country country = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = country;
                }
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (newArray[i].getArea() > newArray[j].getArea()) {
                    Country country = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = country;
                }
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (newArray[i].getArea() < newArray[j].getArea()) {
                    Country country = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = country;
                }
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (newArray[i].getGdp() > newArray[j].getGdp()) {
                    Country country = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = country;
                }
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (newArray[i].getGdp() < newArray[j].getGdp()) {
                    Country country = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = country;
                }
            }
        }
        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        /* TODO */
        ArrayList<Country> arrayList = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof AfricaCountry) {
                arrayList.add(country);
            }
        }
        AfricaCountry[] res = new AfricaCountry[arrayList.size()];
        return arrayList.toArray(res);
    }

    public AsiaCountry[] filterAsiaCountry() {
        /* TODO */
        ArrayList<Country> arrayList = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof AsiaCountry) {
                arrayList.add(country);
            }
        }
        AsiaCountry[] res = new AsiaCountry[arrayList.size()];
        return arrayList.toArray(res);
    }

    public EuropeCountry[] filterEuropeCountry() {
        /* TODO */
        ArrayList<Country> arrayList = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof EuropeCountry) {
                arrayList.add(country);
            }
        }
        EuropeCountry[] res = new EuropeCountry[arrayList.size()];
        return arrayList.toArray(res);
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        /* TODO */
        ArrayList<Country> arrayList = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof NorthAmericaCountry) {
                arrayList.add(country);
            }
        }
        NorthAmericaCountry[] res = new NorthAmericaCountry[arrayList.size()];
        return arrayList.toArray(res);
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        /* TODO */
        ArrayList<Country> arrayList = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof OceaniaCountry) {
                arrayList.add(country);
            }
        }
        OceaniaCountry[] res = new OceaniaCountry[arrayList.size()];
        return arrayList.toArray(res);
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        /* TODO */
        ArrayList<Country> arrayList = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof SouthAmericaCountry) {
                arrayList.add(country);
            }
        }
        SouthAmericaCountry[] res = new SouthAmericaCountry[arrayList.size()];
        return arrayList.toArray(res);
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        /* TODO */
        return Arrays.copyOf(sortByDecreasingPopulation(), howMany);
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        /* TODO */
        return Arrays.copyOf(sortByIncreasingPopulation(), howMany);
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        /* TODO */
        return Arrays.copyOf(sortByDecreasingArea(), howMany);
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        /* TODO */
        return Arrays.copyOf(sortByIncreasingArea(), howMany);
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        /* TODO */
        return Arrays.copyOf(sortByDecreasingGdp(), howMany);
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        /* TODO */
        return Arrays.copyOf(sortByIncreasingGdp(), howMany);
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
