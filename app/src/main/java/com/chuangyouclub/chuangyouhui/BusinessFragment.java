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

public class BusinessFragment extends Fragment {

    public static BusinessFragment newInstance(String title) {
        BusinessFragment businessFragment = new BusinessFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", title);
        businessFragment.setArguments(bundle);
        return businessFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_business, container, false);
        return view;
    }
}
