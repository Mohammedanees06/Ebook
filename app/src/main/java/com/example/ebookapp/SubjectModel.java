package com.example.ebookapp;

public class SubjectModel {
    private  String subjectName;
    public SubjectModel(String subjectName) {
        this.subjectName=subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
