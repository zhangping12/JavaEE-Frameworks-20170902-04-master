package demo.dao.impl;

import demo.dao.CourseDao;
import demo.model.Course;
import org.springframework.stereotype.Repository;

@Repository
public class CourseDaoImpl extends GenericDaoImpl<Course, Integer> implements CourseDao {
}
