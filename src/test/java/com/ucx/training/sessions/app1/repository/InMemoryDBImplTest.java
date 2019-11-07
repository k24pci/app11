package com.ucx.training.sessions.app1.repository;

import com.ucx.training.sessions.app1.MockData;
import com.ucx.training.sessions.app1.businesslogic.Company;
import com.ucx.training.sessions.app1.repository.InMemoryDBImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class InMemoryDBImplTest {

    @Test
    public void testCreate(){
        Company company = MockData.getCompany();
        InMemoryDBImpl db = new InMemoryDBImpl();
        db.createOrUpdate(company);
        Company foundCompany = db.findById(company.getId());
        assertNotNull(foundCompany);
        assertEquals(company.getId(), foundCompany.getId());
        assertEquals(3, foundCompany.getEmployees().size());
    }

    @Test (expected = RuntimeException.class)
    public void testCreate_whenCompanyIsNull(){
        InMemoryDBImpl db = new InMemoryDBImpl();
        db.createOrUpdate(null);
    }

    @Test (expected = RuntimeException.class)
    public void testFind_whenIdIsNull(){
        InMemoryDBImpl db = new InMemoryDBImpl();
        db.findById(null);
    }
}
