package com.example.soti_v1.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.soti_v1.R;
import com.example.soti_v1.Session.SigninActivity;
import com.parse.ParseUser;

import static com.parse.Parse.getApplicationContext;

public class BasketFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_basket,container,false);




    }
}






















