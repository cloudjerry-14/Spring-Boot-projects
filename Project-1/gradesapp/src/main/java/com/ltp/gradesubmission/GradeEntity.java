package com.ltp.gradesubmission;

public class GradeEntity {
    private String name;
    private String subject;
    private String score;
    
    public GradeEntity(String name,String score, String subject) {
        this.name = name;
        this.score = score;
        this.subject = subject;

    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGrade() {
        return this.score;
    }

    public void setGrade(String score) {
        this.score = score;
    }

    public GradeEntity() {
    }

    
}
