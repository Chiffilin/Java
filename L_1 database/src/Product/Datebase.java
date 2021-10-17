package Product;


import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Datebase {
    public ArrayList<Product> list;

    public Datebase(){
        list = new ArrayList<>();
    }
    /*this.seller = seller;
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.dateOfSale = dateOfSale;*/
    public void add(String seller, String name, int amount, double price){
        this.list.add(new Product(seller,name,amount,price));
    }

    public Product get(int index) {
        return this.list.get(index);
    }

    public Product remove(int index) {
        return this.list.remove(index);
    }

    @Override
    public String toString() {
        return "Datebse{" + list + '}';
    }

    public void save(String filename) throws IOException {
        FileWriter outStream = new FileWriter(filename);
        BufferedWriter bw = new BufferedWriter(outStream);
        for(Product product : list) {
            try {
                bw.write(product.seller);
                bw.write(System.lineSeparator());
                bw.write(product.name);
                bw.write(System.lineSeparator());
                bw.write(String.valueOf(product.amount));
                bw.write(System.lineSeparator());
                bw.write(String.valueOf(product.price));
                bw.write(System.lineSeparator());

            }catch (IOException e) {
                e.printStackTrace();
            }
        }
        bw.close();
        outStream.close();
    }

    public void load(String filename) throws IOException {
        this.clear();
        Scanner scanner = new Scanner(new FileReader(filename));
        String seller = "";
        String name = "";
        int amount = -1;
        double price = -1.0;

        while (scanner.hasNextLine()){
            seller = scanner.nextLine();
            name = scanner.nextLine();
            amount = Integer.parseInt(scanner.nextLine());
            price = Double.parseDouble(scanner.nextLine());

            this.list.add(new Product(seller,name,amount,price));
        }
        scanner.close();

    }

    public void clear(){
        this.list.clear();
    }

    public void serialize(String filename) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this.list);
            out.close();
            fileOut.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public void deserialize(String filename){
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            this.list = (ArrayList<Product>) in.readObject();
            in.close();
            fileIn.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }catch (ClassNotFoundException c) {
            System.out.println("Product class not found");
            c.printStackTrace();
        }
    }
/*

    public void jacksonSerialize(String filename) throws IOException{
        new ObjectMapper().writeValue(new File(filename), this);
    }

    public void jacksonDeserialize(String filename) throws IOException {
        Database db1 = new ObjectMapper().readValue(new File(filename), Database.class);
        this.list = db1.list;
    }

    public void serializeFastJSON(String filename) throws IOException {
        FileWriter outStream = new FileWriter(filename);
        BufferedWriter bw = new BufferedWriter(outStream);
        bw.write(JSON.toJSONString(this.list));
        bw.close();
        outStream.close();
    }

    public void deserializeFastJSON(String filename) throws IOException {
        Scanner scanner = new Scanner(new FileReader(filename));
        this.clear();
        ArrayList<JSONObject> JSONlist = JSON.parseObject(scanner.nextLine(), ArrayList.class);
        for (JSONObject st : JSONlist) {
            this.add(new Student(st.getString("name"), st.getIntValue("age")));
        }
        scanner.close();
    }
*/

    public void add(Product product) {
        this.list.add(product);
    }
}
