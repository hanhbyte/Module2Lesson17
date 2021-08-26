package managerProduct;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(01, "Hảo Hảo", "VinaEcook", "4500");
        Product product2 = new Product(02, "MonterEnergy", "Monter", "30000");
        Product product3 = new Product(03, "Nước lọc", "abc", "4500");
        Product product4 = new Product(04, "Hảo Hảo", "VinaEcook", "4500");
        Product product5 = new Product(05, "Hảo Hảo", "VinaEcook", "4500");
        List<Product> list = new ArrayList<>();
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);
        try {
            writeFileProduct(list);
        }catch (IOException e){
            e.printStackTrace();
        }
        try {
            list = readFileProduct();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }catch (ClassNotFoundException classNotFoundException){
            classNotFoundException.printStackTrace();
        }
        for (Product product : list){
            System.out.println(product);
        }
    }

    public static void writeFileProduct(List<Product> products) throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream("listproduct.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(products);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public static List<Product> readFileProduct() throws IOException, ClassNotFoundException{
        List<Product> productList = new ArrayList<>();
        FileInputStream fileOutputStream = new FileInputStream("listproduct.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileOutputStream);
        productList = (List<Product>) objectInputStream.readObject();
        fileOutputStream.close();
        objectInputStream.close();
        return productList;
    }
}
