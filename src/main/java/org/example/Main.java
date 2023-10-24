package org.example;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        StaffService staffService = new StaffService();
        List<Employee> staff = staffService.getStaff();
        System.out.println(staff);

        System.out.println("Сотрудники со стажем старше 10 лет - "
                + staffService.employeesByExperience(staff, 10));

        System.out.println("Имя сотрудника по номеру телефона - "
                + staffService.getEmployeesByPhone(staff, "+7(911) 111-11-14"));

        Employee newEmployee = new Employee(6L, "+7(911) 111-11-16", "Светлана", 3);

        System.out.println("Добавили нового сотрудника "
                + staffService.createEmployee(staff, newEmployee));

        System.out.println("Поиск по ID "
                + staffService.getEmployeeBiId(staff, 6L));
    }


}