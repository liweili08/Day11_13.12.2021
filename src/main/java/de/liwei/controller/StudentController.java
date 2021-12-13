package de.liwei.controller;


import de.liwei.model.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
public class StudentController {

    @GetMapping
    public Student getStudent(){
        return new Student("Daniel",2021002,19);
    }

    @GetMapping(path = "{id}")
    public String getStudentName(@PathVariable int id) {
        Student student = new Student("Daniel", 2021002, 19);
        if (id == student.getStudentId()){
            return student.getName();
        }
        return "nicht gefunden";
    }
    //localhost:8080/student/2021002


//    @GetMapping("search")
//    //@GetMapping(value = "search")
//    public String search(@RequestParam String name) {
//        Student student = new Student("Daniel", 2021002, 19);
//        if (name.equals(student.getName())){
//            return student.toString();
//        }
//        return "nicht gefunden";
//    }

    @GetMapping(path = "search/{name}")
    public String search(@PathVariable String name) {
        Student student = new Student("Daniel", 2021002, 19);
        if (name.equals(student.getName())){
            return student.toString();
        }
        return "nicht gefunden";
    }



}




