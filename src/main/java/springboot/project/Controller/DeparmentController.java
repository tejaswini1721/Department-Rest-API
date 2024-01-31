package springboot.project.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import springboot.project.Entity.Department;
import springboot.project.Service.DepartmentService;
import org.springframework.web.bind.annotation.PutMapping;

@RestController

public class DeparmentController {
	
	private final Logger logger=LoggerFactory.getLogger(DeparmentController.class);
	
	
	@Autowired
	private DepartmentService departmentService;
	
	
	@PostMapping("/departments")
	public Department saveDepartment(@Valid @RequestBody Department department) {
		logger.info("Inside saveDepartment controller");
		return departmentService.saveDepartment(department);
		
	}
	
	
	@GetMapping("/departments")
	public List<Department> fetchDepartmentsList(){
		logger.info("Inside fetchDepartment controller");
		return departmentService.fetchDepartmentList();
		
	}
	
	@GetMapping("/departments/{id}")
	public Department fetchDepartmentsById(@PathVariable("id") Long departmentId){
		return departmentService.fetchDepartmentsById(departmentId);
		
	}
	
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentsById(@PathVariable("id") Long departmentId){
		departmentService.deleteDepartmentsById(departmentId);
		return "Department deleted successfully";
		
	}
	
	@PutMapping("departments/{id}")
	public Department updateDepartment(@PathVariable ("id") Long departmentId, 
										@RequestBody Department department) {
		return departmentService.updateDepartment(departmentId, department);
		 
	}
	
	
	  @GetMapping("/departments/name/{name}")
	    public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
	        return departmentService.fetchDepartmentByName(departmentName);
	    }
	
	 

}
