package com.kodilla.hibernate.manytomany;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {
    @Autowired
    SearchFacade searchFacade;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testFindCompanies() {
        //given
        Company company1 = new Company("Cisco Systems");
        Company company2 = new Company("Microsoft");
        Company company3 = new Company("Apple");

        //when
        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);
        List<Company> companies = searchFacade.findCompanies("Systems");

        //then
        Assert.assertEquals(1, companies.size());

        //cleanup
            companyDao.delete(company1);
            companyDao.delete(company2);
            companyDao.delete(company3);
    }

    @Test
    public void testFindEmployees() {
        //Given
        Employee employee1 = new Employee("Tomek", "Pieniezny");
        Employee employee2 = new Employee("Marcin", "Malinowski");
        Employee employee3 = new Employee("Marek", "Malinowski");

        //when
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);
        List<Employee> employees = searchFacade.findEmployees("Malinowski");

        //then
        Assert.assertEquals(2, employees.size());

        //cleanup
            employeeDao.delete(employee1);
            employeeDao.delete(employee2);
            employeeDao.delete(employee3);

    }
}