package service;

import model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager implements IManager<Product> {
    static List<Product> listProduct = new ArrayList<>();

    static {
        listProduct.add(new Product("iphone4", 3500000, 7));
        listProduct.add(new Product("iphone5", 4000000, 2));
        listProduct.add(new Product("iphone12", 6000000, 3));
        listProduct.add(new Product("iphone8", 6000000, 4));
        listProduct.add(new Product("iphone4", 3000000, 1));

    }

    @Override
    public void add(Product object) {
        boolean isFind = true;
        for (Product a : listProduct) {
            if (a.getId() == object.getId()) {
                isFind = false;
                break;
            }
        }
        if (isFind) {
            listProduct.add(object);
        }
    }

    @Override
    public void update(int id, Product newObject) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (id == listProduct.get(i).getId()) {
                listProduct.set(i, newObject);
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (id == listProduct.get(i).getId()) {
                listProduct.remove(i);
                break;
            }
        }
    }

    @Override
    public Product findById(int id) {
        for (Product a : listProduct) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> list = new ArrayList<>();
        for (Product a : listProduct) {
            if (a.getName().equals(name)) {
                list.add(a);
            }
        }
        return list;
    }

    @Override
    public List<Product> findAll() {
        return listProduct;
    }

    public List<Product> sortByPrice() {
        Collections.sort(listProduct);
        return listProduct;
    }
}
