package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProjectsActivity extends AppCompatActivity {

    TextView quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);
        quiz=findViewById(R.id.Quiz);
    }

    public void Quiz(View view) {
        gotoUrl("https://github.com/guptaKunal2001/Quiz_App");
    }
    public void Admin(View view) {
        gotoUrl("https://github.com/guptaKunal2001/Quiz_Admin_App");
    }
    public void Meme(View view) {
        gotoUrl("https://github.com/guptaKunal2001/MemeSharingApp");
    }
    private void gotoUrl(String s){
        Uri uri = Uri.parse(s);
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}