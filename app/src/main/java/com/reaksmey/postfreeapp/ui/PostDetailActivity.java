package com.reaksmey.postfreeapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.reaksmey.postfreeapp.R;

import org.w3c.dom.Text;

public class PostDetailActivity extends AppCompatActivity {
    private TextView title, body;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_post_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        title = findViewById(R.id.tvPostTt);
        body = findViewById(R.id.tvPostBd);
        Intent intent = getIntent();
        if(intent.getStringExtra("Title") != null){
            title.setText(intent.getStringExtra("Title"));
        }
        if(intent.getStringExtra("Body") != null){
            body.setText(intent.getStringExtra("Body"));
        }
    }
}