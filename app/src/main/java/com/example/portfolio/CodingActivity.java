package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CodingActivity extends AppCompatActivity {
    TextView leetcode, gfg, hacker, studio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coding);
        leetcode=findViewById(R.id.leetcode);
        gfg=findViewById(R.id.gfg);
        hacker=findViewById(R.id.hacker);
        studio=findViewById(R.id.studio);
    }

    public void Leetcode(View view) {
        gotoUrl("https://leetcode.com/Kunalgupta20/");
    }

    public void Gfg(View view) {
        gotoUrl("https://auth.geeksforgeeks.org/user/kg8909131/practice");
    }

    public void Hacker(View view) {
        gotoUrl("https://www.hackerrank.com/kg8909131");
    }

    public void Studio(View view) {
        gotoUrl("https://www.codingninjas.com/codestudio/profile/80e6bb46-ec96-4827-9fd8-f7648b9bc5d5");
    }
    private void gotoUrl(String s){
        Uri uri = Uri.parse(s);
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}