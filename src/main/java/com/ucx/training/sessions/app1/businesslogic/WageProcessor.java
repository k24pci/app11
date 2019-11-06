package com.ucx.training.sessions.app1.businesslogic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class WageProcessor {
    private static final Logger LOGGER = Logger.getLogger(WageProcessor.class.getName());
    private static final String HEADER = "firstName, lastName, position, workingHours";
    public static List<WageResult> calculateWages(String filePath) throws IOException{
        String line;
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            while ((line = br.readLine()) != null) {
                if (line.equals(HEADER)) continue;
                String[] parts = line.split(",");
                Employee employee = new Employee();
                employee.setFirstName(parts[0].trim());
                employee.setLastName(parts[1].trim());
                employee.setJobPosition(Position.valueOf(parts[2].trim()));
                employee.setWorkingHours(Double.valueOf(parts[3].trim()));
                employees.add(employee);
            }
        }
        Company company = new Company();
        List<WageResult> wageResults = company.calculateWages(employees);
        return wageResults;

    }
}
