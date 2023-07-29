package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView linkedin;
    TextView github;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button education=findViewById(R.id.Education);
        Button projects=findViewById(R.id.Projects);
        Button research=findViewById(R.id.Research);
        Button coding=findViewById(R.id.Coding);

        linkedin=findViewById(R.id.linkedin);
        github=findViewById(R.id.github);
    }

    public void Projects(View view) {
        Intent intent=new Intent(this,ProjectsActivity.class);
        startActivity(intent);
    }

    public void Education(View view) {
        Intent intent=new Intent(this,EducationActivity.class);
        startActivity(intent);
    }

    public void Research(View view) {
        Intent intent=new Intent(this,ResearchActivity.class);
        startActivity(intent);
    }

    public void Coding(View view) {
        Intent intent=new Intent(this,CodingActivity.class);
        startActivity(intent);
    }

    public void Linkedin(View view) {
        gotoUrl("https://www.linkedin.com/in/kunalgupta20/");
    }

    public void Github(View view) {
        gotoUrl("https://github.com/guptaKunal2001");
    }

    private void gotoUrl(String s){
        Uri uri = Uri.parse(s);
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}