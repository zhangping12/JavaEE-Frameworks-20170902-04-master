package demo.service.impl;

import demo.dao.GenericDao;
import demo.model.Course;
import demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl extends GenericServiceImpl<Course, Integer> implements CourseService {
    @Override
    @Autowired
    @Qualifier("courseDaoImpl")
    public void setGenericDao(GenericDao<Course, Integer> genericDao) {
        super.genericDao = genericDao;
    }
}
