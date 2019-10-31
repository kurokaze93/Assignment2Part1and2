package com.csfu.cpsc41101.assignment2part1;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.annotation.NonNull;

import com.csfu.cpsc41101.assignment2part1.adapter.SummaryLVAdapter;
import com.csfu.cpsc41101.assignment2part1.model.Course;
import com.csfu.cpsc41101.assignment2part1.model.Student;
import com.csfu.cpsc41101.assignment2part1.model.StudentDB;

import java.util.ArrayList;

public class MainActivity extends Activity {


    protected ListView mSummaryView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summary_listview);

        createStudentObjects();

        mSummaryView = findViewById(R.id.summary_list_view_id);
        SummaryLVAdapter ad = new SummaryLVAdapter();
        mSummaryView.setAdapter(ad);



    }

    protected void createStudentObjects() {
        // Create Jin student object
        Student s = new Student("Jin", "Nguyen", "889342812");
        Course c = new Course("CPSC 411", "A");

        ArrayList<Course> courses = new ArrayList<Course>();
        ArrayList<Student> studentList = new ArrayList<Student>();

        courses.add(c);
        s.setCourses(courses);
        studentList.add(s);

        // Create Another Person
        s = new Student("Lee", "Thi", "123456789");
        c = new Course("CPSC 471", "B");

        courses = new ArrayList<Course>();
        courses.add(c);
        s.setCourses(courses);
        studentList.add(s);
        //
        StudentDB.getInstance().setStudent(studentList);
    }


}
