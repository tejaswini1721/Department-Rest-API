package springboot.project.Service;

import java.util.List;

import springboot.project.Entity.Department;

public interface DepartmentService  {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentsById(Long departmentId);

	public void deleteDepartmentsById(Long departmentId);

	public Department updateDepartment(Long departmentId, Department department);

	public Department fetchDepartmentByName(String departmentName);

	
	 

	

}
