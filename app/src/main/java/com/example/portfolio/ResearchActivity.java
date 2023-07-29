package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResearchActivity extends AppCompatActivity {
    TextView research;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research);
        research=findViewById(R.id.Research);
    }

    public void Research(View view) {
        gotoUrl("https://ieeexplore.ieee.org/document/9788168");
    }
    public void Certificate(View view) {
        gotoUrl("https://drive.google.com/file/d/10MN-GmiXzRYbj8-dGSP8YeMH0_jIDdVB/view?usp=drivesdk");
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}