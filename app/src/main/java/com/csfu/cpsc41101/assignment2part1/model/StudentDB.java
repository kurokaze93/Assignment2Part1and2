package com.csfu.cpsc41101.assignment2part1.model;

import java.util.ArrayList;

public class StudentDB {

    private static final StudentDB ourInstance = new StudentDB();

    protected ArrayList<Student> mStudent;

    static public StudentDB getInstance(){

        return ourInstance;
    }

    private StudentDB(){


    }

    public ArrayList<Student> getStudent(){

        return mStudent;
    }

    public void setStudent(ArrayList<Student> student){

        mStudent = student;
    }

    public void addStudent(Student s){

        mStudent.add(s);
    }

}
