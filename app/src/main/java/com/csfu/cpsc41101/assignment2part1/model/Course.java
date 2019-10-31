package com.csfu.cpsc41101.assignment2part1.model;

import java.util.ArrayList;


public class Course {

    protected String mCourseID;
    protected String mGrade;

    public Course(String courseid, String grade){

        mCourseID = courseid;
        mGrade = grade;

    }

    public String getCourseId(){

        return mCourseID;
    }

    public void setCourseID(String courseid){

        mCourseID = courseid;
    }

    public String getGrade(){

        return mGrade;
    }

    public void setGrade(String grade){

        mGrade = grade;
    }
}




