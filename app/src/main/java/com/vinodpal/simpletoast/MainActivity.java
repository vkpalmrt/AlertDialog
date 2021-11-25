package com.vinodpal.simpletoast;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.vinodpal.simpletoastlibrary.SimpleToast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSuccess, btnError, btnWarning, btnInfo, btnDelete, btnConfusing, btnCustomIcon;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setListeners();
    }

    private void setListeners() {
        btnSuccess.setOnClickListener(this);
        btnError.setOnClickListener(this);
        btnWarning.setOnClickListener(this);
        btnInfo.setOnClickListener(this);
        btnDelete.setOnClickListener(this);
        btnConfusing.setOnClickListener(this);
        btnCustomIcon.setOnClickListener(this);
    }

    private void initView() {
        btnSuccess = findViewById(R.id.btnSuccess);
        btnError = findViewById(R.id.btnError);
        btnWarning = findViewById(R.id.btnWarning);
        btnInfo = findViewById(R.id.btnInfo);
        btnDelete = findViewById(R.id.btnDelete);
        btnConfusing = findViewById(R.id.btnConfusing);
        btnCustomIcon = findViewById(R.id.btnCustomIcon);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnSuccess:
                SimpleToast.createToast(this, "This is the success toast.", SimpleToast.LENGTH_LONG, SimpleToast.SUCCESS).show();
                break;
            case R.id.btnError:
                SimpleToast.createToast(this, "This is the error toast.", SimpleToast.LENGTH_LONG, SimpleToast.ERROR).show();
                break;
            case R.id.btnWarning:
                SimpleToast.createToast(this, "This is the warning toast.", SimpleToast.LENGTH_LONG, SimpleToast.WARNING).show();
                break;
            case R.id.btnInfo:
                SimpleToast.createToast(this, "This is the information toast.", SimpleToast.LENGTH_LONG, SimpleToast.INFO).show();
                break;
            case R.id.btnDelete:
                SimpleToast.createToast(this, "This is the delete toast.", SimpleToast.LENGTH_LONG, SimpleToast.DELETE).show();
                break;
            case R.id.btnConfusing:
                SimpleToast.createToast(this, "This is the confusing toast.", SimpleToast.LENGTH_LONG, SimpleToast.CONFUSING).show();
                break;
            case R.id.btnCustomIcon:
                SimpleToast.createToast(this, "This is the custom icon toast.", SimpleToast.LENGTH_LONG, SimpleToast.CUSTOM_ICON).show();
                break;
        }
    }
}