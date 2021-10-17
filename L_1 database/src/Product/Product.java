package Product;


import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Базовый уровень: создать класс с нижеуказанными полями. Определить количество товаров, проданных продавцом "Иваном",
вевести сведения о них и определить товар с максимальной стоимостью.
   Продавец
   Наименование
   Количество
   Цена
   Дата продажи
*/

public class Product implements Serializable {

    String seller;
    String name;
    int amount;
    double price;
    Date dateOfSale;

    @Override
    public String toString(){
        return seller + ": " + name + ": " + amount + ": " + price + "$";
    }
    public  Product(String seller, String name,int amount, double price){
        this.seller = seller;
        this.name = name;
        this.amount = amount;
        this.price = price;

    }

    public String getSeller() {
        return seller;
    }
    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDateOfSale() {
        return this.dateOfSale;
    }
    public void setDateOfSale(String dateOfSale) throws ParseException {
        try {
            this.dateOfSale = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfSale);
        } catch (ParseException pe) {
            System.err.println("Something went wrong!");
        }
    }
}
