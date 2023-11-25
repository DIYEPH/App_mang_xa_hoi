package com.example.ltdd_app_mang_xa_hoi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;

public class NewChatActivity extends AppCompatActivity {
LinearLayout btn_creategroup;
ImageButton backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_chat);
        backButton = findViewById(R.id.back);
        ListView lv_listfriend;
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        btn_creategroup = findViewById(R.id.btn_creategroup);
        lv_listfriend= findViewById(R.id.lv_listfriend);
        btn_creategroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewChatActivity.this, CreateGroupChatActivity.class);
                startActivity(intent);
            }
        });
    }
}