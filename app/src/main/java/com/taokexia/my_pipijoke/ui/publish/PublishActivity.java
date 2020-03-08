package com.taokexia.my_pipijoke.ui.publish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.taokexia.libnavannotation.ActivityDestination;
import com.taokexia.my_pipijoke.R;

@ActivityDestination(pageUrl = "main/tabs/publish", needLogin = true)
public class PublishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publish);
    }
}
