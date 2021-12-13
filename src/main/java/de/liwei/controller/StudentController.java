package de.liwei.controller;


import de.liwei.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {

    @GetMapping
    public Student getStudent(){
        return new Student("Daniel",2021002,19);
    }

    @GetMapping(path = "{id}")
    public String getStudent(@PathVariable int id) {
        Student student = new Student("Daniel", 2021002, 19);
        if (id == student.getStudentId()){
            return student.getName();
        }
        return "nicht gefunden";
    }


}




