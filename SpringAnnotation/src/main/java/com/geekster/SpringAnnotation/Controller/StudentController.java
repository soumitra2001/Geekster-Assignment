package com.geekster.SpringAnnotation.Controller;

import com.geekster.SpringAnnotation.MailSender.HandleMail;
import com.geekster.SpringAnnotation.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    Student s1;

    // when we use Autowired, all the beans are autowired
    // component scan annotation which is present in SpringBootApplication will scan all the beans
    @Autowired
    HandleMail h1;

    @GetMapping(value = "/student")
    public Student getStudent(){
        System.out.println("Mail sent Successfully...!!");
        h1.sendMail();
        return s1;
    }
}
