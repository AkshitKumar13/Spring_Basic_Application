package com.spring;



public class Student {
private  int  student_id;
private String studentname;
    private String address;


    public int getStudent_id(){
        return student_id;
    }
    public void setStudent_id(int student_id){
        this.student_id=student_id;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(int student_id,String studentname,String address){
        super();
        this.student_id=student_id;
        this.studentname=studentname;
        this.address=address;

    }
    public Student(){
        super();
    }

    public String toString(){
        return  "Student  [student_id="+student_id+", studentname="+studentname+", address="+address+" ]";
    }
}
