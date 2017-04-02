package com.pineapple.dapineapple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DealActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deal);
    }

    public void onBackPressed() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
