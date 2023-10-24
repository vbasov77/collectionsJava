package org.example;

import java.util.ArrayList;
import java.util.List;

public class StaffService {

    public List<Employee> getStaff() {
        StaffRepository staffRepository = new StaffRepository();
        return staffRepository.getStaff();
    }

    public List<Employee> employeesByExperience(List<Employee> staff, Integer experience) {
        List<Employee> newArrayStaff = new ArrayList<>();
        for (int i = 0; i < staff.size(); i++) {
            if (staff.get(i).getExperience() >= experience) {
                newArrayStaff.add(staff.get(i));
            }
        }
        return newArrayStaff;
    }

    public String getEmployeesByPhone(List<Employee> staff, String phone) {
        for (int i = 0; i < staff.size(); i++) {
            if (staff.get(i).getPhone().equals(phone)) {
                return staff.get(i).getName().toString();
            }
        }
        return "Сотрудники не найдены";
    }

    public Employee getEmployeeBiId(List<Employee> staff, Long id) {
        for (int i = 0; i < staff.size(); i++) {
            if (staff.get(i).getId().equals(id)) {
                return staff.get(i);
            }
        }
        return null;
    }

    public List<Employee> createEmployee(List<Employee> staff, Employee employee) {
        staff.add(employee);
        return staff;
    }
}
