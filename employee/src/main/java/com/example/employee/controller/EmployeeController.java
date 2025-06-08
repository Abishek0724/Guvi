package com.example.employee.controller;

import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;  

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("employee", new Employee());  
        return "index";
    }

    @PostMapping("/addEmployee")
    public String addEmployee(@ModelAttribute Employee emp) {  
        repository.save(emp);
        return "redirect:/displayAll";
    }

    @GetMapping("/displayAll")
    @ResponseBody
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @GetMapping("/display/{id}")
    @ResponseBody
    public Optional<Employee> getEmployeeById(@PathVariable String id) {
        return repository.findById(id);
    }
}
