import model.Product;
import service.ProductManager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void disPlay(List<Product> list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        List<Product> products;

        System.out.println("====== add======");
        productManager.add(new Product("iphone4", 3800000, 5));
        products=productManager.findAll();
        disPlay(products);


        System.out.println("========update=======");
        productManager.update(5,new Product("iphone9", 3000000, 5));
        products=productManager.findAll();
        disPlay(products);


        System.out.println("======find by id========");
        System.out.println(productManager.findById(3));


        System.out.println("======find by name======");
        disPlay(productManager.findByName("iphone4"));

        System.out.println("=======sort by price=====");
        disPlay(productManager.sortByPrice());
    }
}
