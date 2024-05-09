package com.Controller;

import com.interfaces.StudentsDao;
import com.modals.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {
    @Autowired
    private StudentsDao studentsDao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String formAddStudent(Model model){

        return "AddStudent";
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String AddStudent(Students student){
        studentsDao.AddStudent(student);
        studentsDao.GetAllStudents().forEach(System.out::println);
        return "AddStudent";
    }

}

