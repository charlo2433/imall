package com.example.charlo.ecommerce.adapter;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import com.example.charlo.ecommerce.R;

public class Dialog extends DialogFragment {
    View rootview;
    EditText name, message, phone, email;

    @Override
    public android.app.Dialog onCreateDialog(Bundle savedInstanceState) {


        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();


        builder.setView(inflater.inflate(R.layout.message,null));
        builder.setPositiveButton("Login ", (dialog, which) -> {
           // name = find


        });

        builder.setNegativeButton("cancel", (dialog, which) -> {

        });

        return builder.create();
    }
}
