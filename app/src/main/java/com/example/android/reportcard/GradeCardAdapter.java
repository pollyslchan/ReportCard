package com.example.android.reportcard;


import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class GradeCardAdapter extends ArrayAdapter<GradeCard> {

    public GradeCardAdapter(@NonNull Activity context, @NonNull ArrayList<GradeCard> gradeCards) {
        super(context, 0, gradeCards);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        GradeCard currentGradeCard = getItem(position);

        TextView studentName = (TextView) listItemView.findViewById(R.id.student_name);
        studentName.setText("Student name: " + currentGradeCard.getStudentName());
        TextView chineseGrade = (TextView) listItemView.findViewById(R.id.chinese_grade);
        chineseGrade.setText("Chinese grade: " + currentGradeCard.getChineseGrade());
        TextView englishGrade = (TextView) listItemView.findViewById(R.id.english_grade);
        englishGrade.setText("English grade: " + currentGradeCard.getEnglishGrade());
        TextView mathGrade = (TextView) listItemView.findViewById(R.id.math_grade);
        mathGrade.setText("Math grade: " + currentGradeCard.getMathGrade());

        return listItemView;

    }
}
