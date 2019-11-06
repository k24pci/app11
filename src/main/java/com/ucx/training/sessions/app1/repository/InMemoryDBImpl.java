package com.ucx.training.sessions.app1.repository;

import com.ucx.training.sessions.app1.businesslogic.Company;

import java.util.HashMap;
import java.util.Map;

public class InMemoryDBImpl implements InMemoryDB{
    private Map<Integer, Company> storage;

    public InMemoryDBImpl(){
        // Initialize storage
        storage = new HashMap<>();
    }

    public void createOrUpdate(Company company){
        if (company == null) throw new RuntimeException("Company can not be null");
        // key, value/object
       storage.put(company.getId(), company);
    }


    public Company findById(Integer id){
        if (id == null) throw  new RuntimeException("Id can not be null");
        return storage.get(id);
    }

    @Override
    public void remove(Integer id) {
//        throw new UnsupportedOperationException();
        if (id == null) throw new RuntimeException("Id can not be null");
        storage.remove(id);
    }
}
