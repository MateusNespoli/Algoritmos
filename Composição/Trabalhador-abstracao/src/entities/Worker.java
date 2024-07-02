package entities;

import entities.enums.WorkerLevel;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts;

    public Worker() {
    }

    public Worker(Double baseSalary, Department department, WorkerLevel level, String name) {
        this.baseSalary = baseSalary;
        this.department = department;
        this.level = level;
        this.name = name;
    }



}
