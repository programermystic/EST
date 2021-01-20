
package erp_system;


public class Producto {
  private String Id;
    private String prices_amoutmax;
    private String prices_amoutmin;
    private String prices_avaliability;
    private String prices_condition;
    private String prices_currency;
    private String prices_dateseen;
    private boolean price_issale;
    private String price_merchant;
    private String prices_shiping;
    private String pricessourceurls;
    private String asins;
    private String brand;
    private String categories;
    private String dateadded;
    private String dateupdated;
    private String ean;
    private String imagineurls;
    private String keys;
    private String manufacturer;
    private String manufacturernumber;
    private String name;
    private String primarycategories;
    private String sourceurls;
    private String upc;
    private String weight;

    public String getId() {
        return Id;
    }

    public String getPrices_amoutmax() {
        return prices_amoutmax;
    }

    public String getPrices_amoutmin() {
        return prices_amoutmin;
    }

    public String getPrices_avaliability() {
        return prices_avaliability;
    }

    public String getPrices_condition() {
        return prices_condition;
    }

    public String getPrices_currency() {
        return prices_currency;
    }

    public String getPrices_dateseen() {
        return prices_dateseen;
    }

    public boolean isPrice_issale() {
        return price_issale;
    }

    public String getPrice_merchant() {
        return price_merchant;
    }

    public String getPrices_shiping() {
        return prices_shiping;
    }

    public String getPricessourceurls() {
        return pricessourceurls;
    }

    public String getAsins() {
        return asins;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategories() {
        return categories;
    }

    public String getDateadded() {
        return dateadded;
    }

    public String getDateupdated() {
        return dateupdated;
    }

    public String getEan() {
        return ean;
    }

    public String getImagineurls() {
        return imagineurls;
    }

    public String getKeys() {
        return keys;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getManufacturernumber() {
        return manufacturernumber;
    }

    public String getName() {
        return name;
    }

    public String getPrimarycategories() {
        return primarycategories;
    }

    public String getSourceurls() {
        return sourceurls;
    }

    public String getUpc() {
        return upc;
    }

    public String getWeight() {
        return weight;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setPrices_amoutmax(String prices_amoutmax) {
        this.prices_amoutmax = prices_amoutmax;
    }

    public void setPrices_amoutmin(String prices_amoutmin) {
        this.prices_amoutmin = prices_amoutmin;
    }

    public void setPrices_avaliability(String prices_avaliability) {
        this.prices_avaliability = prices_avaliability;
    }

    public void setPrices_condition(String prices_condition) {
        this.prices_condition = prices_condition;
    }

    public void setPrices_currency(String prices_currency) {
        this.prices_currency = prices_currency;
    }

    public void setPrices_dateseen(String prices_dateseen) {
        this.prices_dateseen = prices_dateseen;
    }

    public void setPrice_issale(boolean price_issale) {
        this.price_issale = price_issale;
    }

    public void setPrice_merchant(String price_merchant) {
        this.price_merchant = price_merchant;
    }

    public void setPrices_shiping(String prices_shiping) {
        this.prices_shiping = prices_shiping;
    }

    public void setPricessourceurls(String pricessourceurls) {
        this.pricessourceurls = pricessourceurls;
    }

    public void setAsins(String asins) {
        this.asins = asins;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public void setDateadded(String dateadded) {
        this.dateadded = dateadded;
    }

    public void setDateupdated(String dateupdated) {
        this.dateupdated = dateupdated;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public void setImagineurls(String imagineurls) {
        this.imagineurls = imagineurls;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setManufacturernumber(String manufacturernumber) {
        this.manufacturernumber = manufacturernumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrimarycategories(String primarycategories) {
        this.primarycategories = primarycategories;
    }

    public void setSourceurls(String sourceurls) {
        this.sourceurls = sourceurls;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
    public void mostrar()
    {
        System.out.println(this.getId()+" "+this.getPrices_amoutmax()+" "+this.getPrices_amoutmin()+" "+this.getPrices_avaliability()+" "+this.getPrices_condition()+" "+this.getPrices_currency()+" "+this.getPrices_dateseen()+" "+isPrice_issale()+" "+this.getPrice_merchant()+" "+this.getPrices_shiping()+" "+this.getPricessourceurls()+" "+this.getAsins()+" "+this.getBrand()+" "+this.getCategories()+" "+this.getDateadded()+" "+this.getDateupdated()+" "+this.getEan()+" "+this.getImagineurls()+" "+this.getKeys()+" "+this.getManufacturer()+" "+this.getManufacturernumber()+" "+this.getName()+" "+this.getPrimarycategories()+" "+this.getSourceurls()+" "+this.getUpc()+" "+this.getWeight());
    }
      
}
