package com.example.wibugrams.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.wibugrams.Home.HomeActivity;
import com.example.wibugrams.R;
import com.google.android.material.textfield.TextInputEditText;

public class LoginFragment extends Fragment {
    TextInputEditText edtEmail, edtPassword;
    Button btn_login;

    public void LoginFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = (View) inflater.inflate(R.layout.fragment_login, container, false);

        edtEmail = view.findViewById(R.id.edtEmail);
        edtPassword = view.findViewById(R.id.edtPassword);
        btn_login = view.findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplication(), HomeActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}