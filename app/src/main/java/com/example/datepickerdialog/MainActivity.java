package com.example.datepickerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private Button button;
    private DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textviewid);
        button=findViewById(R.id.buttonid);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        DatePicker datePicker=new DatePicker(this);
        int day = datePicker.getDayOfMonth();
        int month = (datePicker.getMonth())+1;
        int year = datePicker.getYear();

        datePickerDialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                textView.setText(dayOfMonth+"/"+(month+1)+"/"+year);

            }
        },day,month,year);
        datePickerDialog.show();

    }
}
