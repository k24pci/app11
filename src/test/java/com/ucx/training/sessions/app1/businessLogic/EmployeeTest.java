package com.ucx.training.sessions.app1.businessLogic;

import com.ucx.training.sessions.app1.MockData;
import com.ucx.training.sessions.app1.businesslogic.Employee;
import com.ucx.training.sessions.app1.businesslogic.Position;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    @Test
    public void testCalculateWage(){
        Employee mockEmployee = MockData.getEmployee(Position.PM);
        assertEquals(Double.valueOf(30000),Double.valueOf(mockEmployee.calculateWage()));
    }
}
