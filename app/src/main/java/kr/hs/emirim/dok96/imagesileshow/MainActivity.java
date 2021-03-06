package kr.hs.emirim.dok96.imagesileshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ViewFlipper flip;
    EditText editTime;
    int time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flip= (ViewFlipper) findViewById(R.id.view_flip);
        flip.setFlipInterval(1000);
        editTime=(EditText) findViewById (R.id.text_second);
        Button butStart=(Button)findViewById(R.id.but_start);
        butStart.setOnClickListener(this);
        Button butstop = (Button)findViewById(R.id.but_stop);
        butstop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.but_start:
                time=(int)(Double.parseDouble(editTime.getText().toString())*1000);
                flip.setFlipInterval((int) time);
                flip.startFlipping();
                break;
            case R.id.but_stop:
                flip.stopFlipping();
                break;
        }
    }
}
