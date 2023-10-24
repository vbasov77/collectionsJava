package org.example;

public class Employee {
    private Long id;
    private String phone;
    private String name;
    private Integer experience; // Стаж

    public Employee(Long id, String phone, String name, Integer experience) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.experience = experience;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", phone=" + phone +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
