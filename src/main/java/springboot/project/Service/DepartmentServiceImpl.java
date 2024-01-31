package springboot.project.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.project.Entity.Department;
import springboot.project.Repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> fetchDepartmentList() {
		
		return departmentRepository.findAll();
	}

	@Override
	public Department fetchDepartmentsById(Long departmentId) {
		return departmentRepository.findById(departmentId).get();
	}

	@Override
	public void deleteDepartmentsById(Long departmentId) {
		 departmentRepository.deleteById(departmentId);
	}

	@Override
	public Department updateDepartment(Long departmentId, Department department) {
		Department deptDB=departmentRepository.findById(departmentId).get();
		
		if(Objects.nonNull(department.getDepartmentName())&&
				!"".equalsIgnoreCase(department.getDepartmentName())) {
			deptDB.setDepartmentName(department.getDepartmentName());
		}
		
		
		if(Objects.nonNull(department.getDepartmentAddress())&&
				!"".equalsIgnoreCase(department.getDepartmentAddress())) {
			deptDB.setDepartmentAddress(department.getDepartmentAddress());
		}

		
		if(Objects.nonNull(department.getDepartmentCode())&&
				!"".equalsIgnoreCase(department.getDepartmentCode())) {
			deptDB.setDepartmentCode(department.getDepartmentCode());
		}
		
		return departmentRepository.save(deptDB);

	}

	@Override
	public Department fetchDepartmentByName(String departmentName) {
		 return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
	}

	
	
	

}
