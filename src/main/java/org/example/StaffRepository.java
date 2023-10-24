package org.example;

import java.util.ArrayList;
import java.util.List;

public class StaffRepository {

    public List<Employee> getStaff() {
        List<Employee> staff = new ArrayList<>();
        staff.add(new Employee(1L, "+7(911) 111-11-11", "Василий", 11));
        staff.add(new Employee(2L, "+7(911) 111-11-12", "Татьяна", 3));
        staff.add(new Employee(3L, "+7(911) 111-11-13", "Дмитрий", 17));
        staff.add(new Employee(4L, "+7(911) 111-11-14", "Ольга", 9));
        staff.add(new Employee(5L, "+7(911) 111-11-15", "Николай", 34));

        return staff;

    }
}
