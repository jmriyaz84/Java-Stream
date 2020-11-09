package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The Class CSVReader.
 * 
 * @author Mohammed Riyaz
 */
public class CSVReader {

	/**
	 * Get the employees.
	 *
	 * @return the employees
	 */
	public static List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();
		String csvFile = "H:\\Employee-Data.csv";
		String line = "";
		String cvsSplitBy = ",";
		int index = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			while ((line = br.readLine()) != null) {
				if (index > 0) {
					String[] emp = line.split(cvsSplitBy);
					Employee employee = new Employee(emp[0], emp[1], Integer.parseInt(emp[2]), Integer.parseInt(emp[3]),
							emp[4], emp[5], emp[6], emp[7], emp[8], emp[9]);
					employees.add(employee);
				}
				index++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return employees;
	}
}
