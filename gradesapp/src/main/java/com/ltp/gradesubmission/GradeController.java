package com.ltp.gradesubmission;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GradeController {

    List<GradeEntity> studentsData = new ArrayList<>();

    @GetMapping("/grades")
    public String getGrades(Model model) {
        model.addAttribute("grade", studentsData);
        return "grades";
    }

    @GetMapping("/")
    public String gradeForm(Model model) {
        GradeEntity grade=new GradeEntity();
        model.addAttribute("grade", grade);
        return "form";
    }

    @PostMapping("/addGrade")
    public String submitForm(GradeEntity grade) {
        studentsData.add(grade);
        return "redirect:/grades";

    }



}
