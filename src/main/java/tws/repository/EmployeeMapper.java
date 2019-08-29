package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

import tws.entity.Employee;

@Mapper
public interface EmployeeMapper {

 public List<Employee> selectAll();
}
