package com.ucx.training.sessions.app1.repository;

import com.ucx.training.sessions.app1.businesslogic.Company;

public interface InMemoryDB {
    void createOrUpdate(Company company);
    Company findById(Integer id);
    void remove(Integer id);
}
