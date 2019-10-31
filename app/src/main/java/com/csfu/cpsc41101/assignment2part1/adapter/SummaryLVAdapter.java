package com.csfu.cpsc41101.assignment2part1.adapter;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.BaseAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.csfu.cpsc41101.assignment2part1.DetailStudentActivity;
import com.csfu.cpsc41101.assignment2part1.R;
import com.csfu.cpsc41101.assignment2part1.model.Student;
import com.csfu.cpsc41101.assignment2part1.model.StudentDB;

public class SummaryLVAdapter extends BaseAdapter {



    @Override
    public int getCount(){

        return StudentDB.getInstance().getStudent().size();
    }

    @Override
    public Object getItem(int i){

        return StudentDB.getInstance().getStudent().get(i);
    }

    @Override
    public long getItemId(int i){

        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View row_view;

        if (view == null) {
            //cnt++;
            LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
            row_view = inflater.inflate(R.layout.student_row, viewGroup, false);
        } else row_view = view;

        Student s = StudentDB.getInstance().getStudent().get(i);

        TextView firstNameView = (TextView) row_view.findViewById(R.id.first_name);
        firstNameView.setText(s.getFirstName());
        TextView lastNameView = (TextView) row_view.findViewById(R.id.last_name);
        lastNameView.setText(s.getLastName());
        row_view.setTag(new Integer(i));

        //

        row_view.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(view.getContext(), DetailStudentActivity.class);
                        intent.putExtra("StudentIndex", ((Integer)view.getTag()).intValue());
                        view.getContext().startActivity(intent);
                    }
                }
        );




        return row_view;
    }





}




