package demo.controller;

import demo.model.Student;
import demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("student")
public class StudentController extends BaseController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("queryAll")
    @ResponseBody
    private List<Student> queryAll() {
//        session.setAttribute("students", studentService.queryAll());
//        return "redirect:/students.jsp";
        return studentService.queryAll();
    }

    @RequestMapping("studentCourses/{id}")
    @ResponseBody
    private Student studentCourses(@PathVariable int id) {
//        session.setAttribute("student", studentService.queryOne("studentCourses", id));
//        return "redirect:/student.jsp";
        return studentService.queryOne("studentCourses", id);
    }
}
