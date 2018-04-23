package mx.com.webmaps.md_ejercicio14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatSeekBar;
import android.widget.SeekBar;
import android.widget.TextView;

import com.appyvet.materialrangebar.RangeBar;

public class MainActivity extends AppCompatActivity {

    AppCompatSeekBar seekBar;
    TextView seekBarValue;

    RangeBar rangeBar1;
    TextView rangeBarVal;

    RangeBar rangeBar2;
    TextView rangeBarLeftVal;
    TextView rangeBarRigthVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (AppCompatSeekBar) findViewById(R.id.appCompatSeekBar_id);
        seekBarValue = (TextView) findViewById(R.id.appCompatSeekBar_value);

        rangeBar1 = (RangeBar) findViewById(R.id.rangeBar1_id);
        rangeBarVal = (TextView) findViewById(R.id.rangeBar1_value);

        rangeBar2 = (RangeBar) findViewById(R.id.rangeBar2_id);
        rangeBarLeftVal = (TextView) findViewById(R.id.rangeBar2_leftvalue);
        rangeBarRigthVal = (TextView) findViewById(R.id.rangeBar2_rightvalue);

        //AppvompatSeekBar Default Value
        seekBar.setProgress(0);

        //AppComatSeekBar step value
        seekBar.setKeyProgressIncrement(1);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String value = String.valueOf(progress);
                seekBarValue.setText(value);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        rangeBar1.setSeekPinByIndex(0);
        rangeBar1.setPinTextColor(getResources().getColor(R.color.colorRangeBarText));
        rangeBar1.setSelectorColor(getResources().getColor(R.color.colorAccent));
        rangeBar1.setTickColor(getResources().getColor(R.color.colorAccent));
        rangeBar1.setConnectingLineColor(getResources().getColor(R.color.colorAccent));
        //rangeBar1.setBarColor(getResources().getColor(R.color.colorAccent));
        rangeBar1.setPinColor(getResources().getColor(R.color.colorAccent));

        rangeBar1.setOnRangeBarChangeListener(new RangeBar.OnRangeBarChangeListener() {
            @Override
            public void onRangeChangeListener(RangeBar rangeBar, int leftPinIndex, int rightPinIndex, String leftPinValue, String rightPinValue) {
                //System.out.println(rightPinValue);
                rangeBarVal.setText(rightPinValue);
            }
        });


        rangeBar2.setSeekPinByIndex(0);
        rangeBar2.setPinTextColor(getResources().getColor(R.color.colorRangeBarText));
        rangeBar2.setSelectorColor(getResources().getColor(R.color.colorAccent));
        rangeBar2.setTickColor(getResources().getColor(R.color.colorAccent));
        rangeBar2.setConnectingLineColor(getResources().getColor(R.color.colorAccent));
        //rangeBar2.setBarColor(getResources().getColor(R.color.colorAccent));
        rangeBar2.setPinColor(getResources().getColor(R.color.colorAccent));


        rangeBar2.setOnRangeBarChangeListener(new RangeBar.OnRangeBarChangeListener() {
            @Override
            public void onRangeChangeListener(RangeBar rangeBar, int leftPinIndex, int rightPinIndex, String leftPinValue, String rightPinValue) {
                //System.out.println(rightPinValue);
                rangeBarLeftVal.setText(leftPinValue);
                rangeBarRigthVal.setText(rightPinValue);
            }
        });


    }
}
