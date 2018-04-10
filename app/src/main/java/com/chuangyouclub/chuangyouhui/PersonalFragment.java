package com.chuangyouclub.chuangyouhui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class PersonalFragment extends Fragment {

    public static PersonalFragment newInstance(String title) {
        PersonalFragment personalFragment = new PersonalFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", title);
        personalFragment.setArguments(bundle);
        return personalFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_personal, container, false);
        return view;
    }
}
