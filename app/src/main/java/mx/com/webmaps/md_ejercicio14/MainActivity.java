package mx.com.webmaps.md_ejercicio14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatSeekBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AppCompatSeekBar seekBar;
    TextView seekBarValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (AppCompatSeekBar) findViewById(R.id.appCompatSeekBar_id);
        seekBarValue = (TextView) findViewById(R.id.appCompatSeekBar_value);

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
    }
}
