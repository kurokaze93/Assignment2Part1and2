package com.csfu.cpsc41101.assignment2part1.model;

import java.util.ArrayList;

public class Student {

    protected String mFirstName;
    protected String mLastName;
    protected String mCWID;
    protected ArrayList<Course> mCourses;

    public Student(String fname, String lname, String cwid){

        mFirstName = fname;
        mLastName = lname;
        mCWID = cwid;
    }

    public String getFirstName(){

        return mFirstName;
    }

    public  void setFirstName(String fname){

        mFirstName = fname;

    }

    public String getLastName(){

        return mLastName;
    }

    public void setLastName(String lname){

        mLastName = lname;
    }

    public String getCWID(){

        return mCWID;
    }

    public void setCWID(String cwid){

        mCWID = cwid;
    }

    public ArrayList<Course> getCourses(){

        return mCourses;

    }

    public void setCourses(ArrayList<Course> courses){

        mCourses = courses;
    }
}
