package com.example.bottomsheet_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SwitchCompat switchCompat = findViewById(R.id.switch_btn);
        View view = findViewById(R.id.view_show);
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    view.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.purple));
                    bottomSheet();
                } else {
                    view.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
                }
            }
        });
    }

    private void bottomSheet() {
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(R.layout.sheet_item);
        bottomSheetDialog.findViewById(R.id.button_mis).setOnClickListener(v -> {
            bottomSheetDialog.dismiss();
        });
       bottomSheetDialog.show();
    }
}