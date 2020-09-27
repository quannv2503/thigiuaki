package service;

import java.util.List;

public interface IManager<T> {
    void add(T object);

    void update(int id, T newObject);

    void delete(int id);

    T findById(int id);

    List<T> findByName(String name);

    List<T> findAll();
}
