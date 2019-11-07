package com.ucx.training.sessions.app1.businessLogic;
import static org.junit.Assert.*;

import com.ucx.training.sessions.app1.businesslogic.Employee;
import com.ucx.training.sessions.app1.businesslogic.Position;
import com.ucx.training.sessions.app1.businesslogic.WageProcessor;
import com.ucx.training.sessions.app1.businesslogic.WageResult;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class WageProcessorTest {

    @Test
    public void testWageProcessor() throws IOException {
        List<WageResult> wageResults;
        wageResults = WageProcessor.calculateWages("C:\\Users\\lenovo\\Desktop\\training\\remoteApp1\\app1\\src\\test\\java\\com\\ucx\\training\\sessions\\app1\\resources\\employeesInformation.csv");
        assertEquals(4, wageResults.size());
        assertEquals("Flake",wageResults.get(0).getEmployee().getFirstName());
        assertEquals(Position.QA, wageResults.get(0).getEmployee().getJobPosition());
        assertEquals(Double.valueOf(4000), wageResults.get(0).getWage());

    }

    @Test(expected = Exception.class)
    public void testWageProcessor_whenFileNameIsNull() throws IOException{
         WageProcessor.calculateWages(null);
    }

}
