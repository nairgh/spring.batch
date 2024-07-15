package com.springbatch.spring.batch.demo1.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;

import com.springbatch.spring.batch.demo1.dto.EmployeeDTO;

public class EmployeeFileRowMapper implements FieldSetMapper<EmployeeDTO> {

    @Override
    public EmployeeDTO mapFieldSet(FieldSet fieldSet) {
        EmployeeDTO employee = new EmployeeDTO();
        employee.setEmployeeId(fieldSet.readString("employeeId"));
        employee.setFirstName(fieldSet.readString("firstName"));
        employee.setLastName(fieldSet.readString("lastName"));
        employee.setEmail(fieldSet.readString("email"));
        try {
            employee.setAge(fieldSet.readInt("age"));
        } catch (Exception e) {

        }
        return employee;
    }

}
