package org.example.model.dao;

import java.util.List;

public interface DaoRepository <T>{
    List <T> findAll();
    T findOne(int id);
    boolean update(int id,T t);

    boolean delete(int id);
    boolean insert(T t);
}
