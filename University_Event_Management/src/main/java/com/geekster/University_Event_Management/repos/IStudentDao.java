package com.geekster.University_Event_Management.repos;

import com.geekster.University_Event_Management.models.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentDao extends CrudRepository<Student,Integer> {


    @Modifying
    @Query(value = "Update Student set Department = :departmentString where Student_Id =:studentId",nativeQuery = true)
    void updateDepartment(int studentId, String departmentString);
}
