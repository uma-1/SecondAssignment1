package com.example.secondassignment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.secondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SumFragment extends Fragment implements View.OnClickListener {
    Button btnCalculate;
    EditText etFirst, etSecond;
    TextView tvResult;
    public SumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sum, container, false);

        etFirst= view.findViewById(R.id.etFirst);
        etSecond= view.findViewById(R.id.etSecond);
        btnCalculate= view.findViewById(R.id.btnCalculate);
        tvResult= view.findViewById(R.id.tvResult);

        btnCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        int first= Integer.parseInt(etFirst.getText().toString());
        int second= Integer.parseInt(etSecond.getText().toString());
        int result = first + second;
        tvResult.setText("The sum is"+ Integer.toString(result));

    }
}
