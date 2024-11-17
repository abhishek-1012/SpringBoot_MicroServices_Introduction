package com.example.microservices.DepartmentService.Model;

import jakarta.persistence.Entity;

@Entity
public record Employee(Long id, Long departmentID, String name, int age, String position) {

}
