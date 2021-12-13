package de.liwei.model;

public class Student {
     String name;
     int studentId;
     int alt;

    //Constructor
    public Student(String name, int studentId, int alt) {
        this.name = name;
        this.studentId = studentId;
        this.alt = alt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getAlt() {
        return alt;
    }

    public void setAlt(int alt) {
        this.alt = alt;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Id: "  + studentId + ",gi Alte: " + alt;
    }
}
