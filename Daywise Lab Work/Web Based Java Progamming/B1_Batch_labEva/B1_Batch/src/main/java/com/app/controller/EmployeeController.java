package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Company;
import com.app.pojos.Employee;
import com.app.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	//employees/show
	@Autowired
	private EmployeeService empService;

	@RequestMapping("/addEmployee")
	public String homeController() {
		System.out.println("in method addEmployee " + getClass().getName());
		return "/employees/add_employee_form";
	}
	
	
	@PostMapping("/show")
	public String addEmployee(@RequestParam String fn, @RequestParam String ln, @RequestParam String city,
			@RequestParam String myCompany, Model map) {
		Employee emp = new Employee(fn, ln, city, Company.valueOf(myCompany));
		String result = empService.addEmployee(emp);
		map.addAttribute("employee", result);
		return "/employees/show";
	}
	
	@RequestMapping("/display")
	public String diplayEmployee(Model map) {
		System.out.println("in displayEmployee controller");
		List<Employee> list = empService.displayEmployee();
//		list.forEach(p->System.out.println(p));
		map.addAttribute("listOfEmp",list);
		return "/employees/display_list";
	}
	@PostMapping("/company")
	public String viewEmployee(@RequestParam String myCompany, Model map) {
		System.out.println("in view employee");
		List<Employee> list =empService.findByCompany(Company.valueOf(myCompany));
		list.forEach(p->System.out.println(p));
		map.addAttribute("filterEmployee",list);
		return "/employees/filter_employee";
	}
	@RequestMapping("/find")
	public String mycontrol() {
		return "/employees/search_employee";
	}
}
