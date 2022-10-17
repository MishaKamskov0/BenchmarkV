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
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import com.example.benchmarkv.R;
import com.google.android.material.textfield.TextInputLayout;


public class InputFragment extends Fragment implements View.OnClickListener {

    TextInputLayout til;
    EditText editCollectionSize;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_input, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btCalculate = view.findViewById(R.id.bt_calculate);
        til = view.findViewById(R.id.outlinedTextField);
        editCollectionSize = view.findViewById(R.id.editCollectionSize);

        btCalculate.setOnClickListener(this);


    }



    private PopupWindow getErrorView(){
        View vError = getLayoutInflater().inflate(R.layout.error_view, null);
        return new PopupWindow(vError, LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, true);
    }

    @Override
    public void onClick(View v) {
        PopupWindow error = getErrorView();
        if (TextUtils.isEmpty(editCollectionSize.getText().toString())){
            editCollectionSize.setBackground(getResources().getDrawable(R.drawable.error_edit_background));
            error.showAsDropDown(editCollectionSize, 125,0);
        }else{
            editCollectionSize.setBackground(getResources().getDrawable(R.drawable.base_edit_background));
            if (error.isShowing()){
                error.dismiss();
            }
        }
    }
}