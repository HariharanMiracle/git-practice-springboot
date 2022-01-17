package com.darkdevil.practicespringboot.trans.Controller;

import com.darkdevil.practicespringboot.trans.Model.Mark;
import com.darkdevil.practicespringboot.trans.Model.Student;
import com.darkdevil.practicespringboot.trans.Model.Templog;
import com.darkdevil.practicespringboot.trans.Service.StudMarkService;
import com.darkdevil.practicespringboot.trans.Service.TemplogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trans")
public class TransController {

    @Autowired
    StudMarkService studMarkService;

    @Autowired
    TemplogService templogService;

    @GetMapping("/save/{studentId}/{studentName}/{subject}/{score}")
    public boolean saveStudentWithMark(@PathVariable int studentId,
                                       @PathVariable String studentName,
                                       @PathVariable String subject,
                                       @PathVariable String score){
        Templog templog = new Templog();

        try{
            Student student = new Student();
            Mark mark = new Mark();

            student.setId(studentId);
            student.setName(studentName);

            mark.setId(0);
            mark.setSid(studentId);
            mark.setScore(score);
            mark.setSubject(subject);

            templog = buildTemplogModel(student, mark);
            templog = templogService.saveOrUpdate(templog);

            boolean rsp = studMarkService.saveStudentAndMark(student, mark);

            templog.setStatus("SUCCESS");
            templog.setStatusDescription("Students and marks are saved");
            templogService.saveOrUpdate(templog);

            return rsp;
        }
        catch (Exception e){
            System.out.println("Main: " + e);

            templog.setStatus("FAILED");
            templog.setStatusDescription(e.getMessage());
            templogService.saveOrUpdate(templog);

            return false;
        }
    }

    private Templog buildTemplogModel(Student student, Mark mark){
        Templog templog = new Templog();

        templog.setId(0);
        templog.setStudentId(student.getId());
        templog.setScore(mark.getScore());
        templog.setStatus("INITIAL");
        templog.setStatusDescription("INITIAL");
        templog.setStudentName(student.getName());
        templog.setSubject(mark.getSubject());

        return templog;
    }

}
