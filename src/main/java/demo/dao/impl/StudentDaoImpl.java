package demo.dao.impl;

import demo.dao.StudentDao;
import demo.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl extends GenericDaoImpl<Student, Integer> implements StudentDao {
}
