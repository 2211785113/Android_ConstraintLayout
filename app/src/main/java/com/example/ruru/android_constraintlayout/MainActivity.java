package com.example.ruru.android_constraintlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ruru.android_constraintlayout.centerhorizontal.CL1Activity;
import com.example.ruru.android_constraintlayout.centerhorizontal.CL2Activity;
import com.example.ruru.android_constraintlayout.centerhorizontal.CL3Activity;
import com.example.ruru.android_constraintlayout.centerhorizontal.LLActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void centerHorizontalLL(View v) {
        startActivity(new Intent(this, LLActivity.class));
    }

    public void centerHorizontalCL1(View v) {
        startActivity(new Intent(this, CL1Activity.class));
    }

    public void centerHorizontalCL2(View v) {
        startActivity(new Intent(this, CL2Activity.class));
    }

    public void centerHorizontalCL3(View v) {
        startActivity(new Intent(this, CL3Activity.class));
    }


}
