package com.example.charlo.ecommerce;


import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.charlo.ecommerce.fragment.PaymentSuccessDialog;
import com.google.android.gms.maps.GoogleMap;


public class ContactUs_Activity extends AppCompatActivity {
    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us_);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

    }


    public void Complain(View view) {
        PaymentSuccessDialog dialog = new PaymentSuccessDialog();
        dialog.show(getSupportFragmentManager(),"Contact us");
    }
}
