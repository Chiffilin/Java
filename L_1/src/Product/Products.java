package Product;

import java.util.ArrayList;

public class Products {
    private final ArrayList<Product> products = new ArrayList<Product>();

    public void addProduct(Product product){
        if(product != null) {
            this.products.add(product);
        } else {
            System.err.println("Provided element is not a product!");
        }
    }

    public ArrayList<Product> getProducts(){ return this.products; }

 @Override
    public String toString() {
        String name1 = "A";
        StringBuilder answer = new StringBuilder();
        for(Product product : products) {
            String name2 = product.getSeller();
            if(name2.equals(name1)) {
                //answer.append(String.format("\n\n[RESULT]\nSeller: %s\nName of product: %s\nAmount of product: %d\nPrice of product: %dd\nDate of sale: %s\n",product.getSeller(), product.getName(), product.getAmount(), product.getPrice(), product.getDateOfSale()));
                answer.append(String.format("\n\n[RESULT]\nSeller: %s\nAmount of product: %d\n",product.getSeller(),product.getAmount()));
                int sell =+ product.getAmount();
                System.out.println("\nПродано"+ sell);
            }
        }
        return answer.toString();
    }
}
