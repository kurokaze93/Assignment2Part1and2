package com.csfu.cpsc41101.assignment2part1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.csfu.cpsc41101.assignment2part1.adapter.SummaryLVAdapter;
import com.csfu.cpsc41101.assignment2part1.model.Course;
import com.csfu.cpsc41101.assignment2part1.model.Student;
import com.csfu.cpsc41101.assignment2part1.model.StudentDB;

import java.util.ArrayList;


public class SummaryLVActivity extends AppCompatActivity {

    protected Menu summaryMenu;
    protected ListView mSummaryView;
    protected final String TAG = "Summary Screen";
    protected SummaryLVAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate() called");
        super.onCreate(savedInstanceState);

        setContentView(R.layout.summary_listview);

        createStudentObjects();

        mSummaryView = findViewById(R.id.summary_list_view_id);
        ad = new SummaryLVAdapter();
        mSummaryView.setAdapter(ad);
    }

    protected void createStudentObjects() {
        // Create Jin student object
        Student s = new Student("Jin", "Nguyen", "889342812");
        Course c = new Course("CPSC 411", "A");
        Course c1 = new Course("CPSC 471", "A");
        ArrayList<Course> courses = new ArrayList<Course>();
        ArrayList<Student> studentList = new ArrayList<Student>();

        courses.add(c);
        courses.add(c1);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.summary_menu, menu);
        summaryMenu = menu;
        menu.findItem(R.id.action_add).setVisible(true);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.action_add) {

            Intent intent = new Intent(this, AddStudentActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }



    @Override
    protected void onStart() {
        Log.d(TAG, "onStart() called");
        ad.notifyDataSetChanged();
        super.onStart();

    }
    @Override
    protected void onPause() {
        Log.d(TAG, "onPause() called");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop() called");
        super.onStop();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume() called");
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy() called");
        super.onDestroy();
    }
}