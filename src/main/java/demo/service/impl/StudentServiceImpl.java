package demo.service.impl;

import demo.dao.GenericDao;
import demo.model.Student;
import demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends GenericServiceImpl<Student, Integer> implements StudentService {
    @Override
    @Autowired
    @Qualifier("studentDaoImpl")
    public void setGenericDao(GenericDao<Student, Integer> genericDao) {
        super.genericDao = genericDao;
    }
}
