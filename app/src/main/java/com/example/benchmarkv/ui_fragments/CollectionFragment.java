package com.example.benchmarkv.ui_fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.benchmarkv.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;


public class CollectionFragment extends Fragment {

    Button btCalculate;
    TextInputLayout til;
    EditText editCollectionSize;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.input_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btCalculate = view.findViewById(R.id.bt_calculate);

        til = view.findViewById(R.id.outlinedTextField);
        editCollectionSize = view.findViewById(R.id.editCollectionSize);
        btCalculate.setOnClickListener(v -> clickOnCalculate());
    }

    private void clickOnCalculate() {

        if (TextUtils.isEmpty(editCollectionSize.getText().toString().trim()) || Integer.parseInt(editCollectionSize.getText().toString()) < 1000000 || Integer.parseInt(editCollectionSize.getText().toString()) > 10000000){
            editCollectionSize.setBackground(getResources().getDrawable(R.drawable.error_edit_background));
            til.setError("Error.You need enter elements count.");
        }else{
            editCollectionSize.setBackground(getResources().getDrawable(R.drawable.base_edit_background));
            til.setError(null);
        }

    }
}