package com.example.bridgeit.datepicker;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends Activity {
private DatePicker mDate;
    private TextView mCurrentDate;
    Button mChangeDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mChangeDate = (Button)findViewById(R.id.button1);
        mCurrentDate = (TextView)findViewById(R.id.textView1);
        mDate = (DatePicker)findViewById(R.id.datePicker1);

         mCurrentDate.setText(getDate());

        //set date
        mChangeDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentDate.setText(getDate());
            }
        });
    }
    //return the date
    public  String getDate() {
        StringBuffer date = new StringBuffer();
        date.append((mDate.getMonth()+1)+"/");
        date.append((mDate.getDayOfMonth())+"/");
        date.append(mDate.getYear());
       return date.toString();
    }
}
