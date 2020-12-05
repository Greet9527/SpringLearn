package org.grit.container.xmlBeans;

public class Student {



    private User user;

    //学号
    private int number;

    //年级
    private int gradeNo;

    //班级
    private int classNo;

//    public Student(User user){
//        this.user=user;
//    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getGradeNo() {
        return gradeNo;
    }

    public void setGradeNo(int gradeNo) {
        this.gradeNo = gradeNo;
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user){
        this.user=user;
    }
}
