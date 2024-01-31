package springboot.project.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.project.Entity.Department;

@Repository

public interface DepartmentRepository extends JpaRepository<Department, Long>{
	
	public Department findByDepartmentName(String departmentName);

	public Department findByDepartmentNameIgnoreCase(String departmentName);

	
	
	

	

}
