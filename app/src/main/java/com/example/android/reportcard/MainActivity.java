package com.example.android.reportcard;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<GradeCard> gradeCards = new ArrayList<>();
        gradeCards.add(new GradeCard ("Sally Wong", 'A', 'B', 'C'));
        gradeCards.add(new GradeCard ("Kelly Chan", 'B', 'B', 'C'));
        gradeCards.add(new GradeCard ("Peter Ng", 'C', 'C', 'C'));
        gradeCards.add(new GradeCard ("Steven Lau", 'A', 'A', 'C'));
        gradeCards.add(new GradeCard ("Tony Wong", 'B', 'B', 'B'));
        gradeCards.add(new GradeCard ("Paul Fong", 'C', 'D', 'D'));
        gradeCards.add(new GradeCard ("Linda Law", 'B', 'C', 'C'));
        gradeCards.add(new GradeCard ("Laila Lo", 'A', 'A', 'A'));

        GradeCardAdapter adapter = new GradeCardAdapter(this, gradeCards);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }


}
