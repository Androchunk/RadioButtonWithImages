package com.androchunk.radiobuttonwithimages;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAlignmentSelected(View view) {
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        switch (radioGroup.getCheckedRadioButtonId()) {
            case R.id.alignLeft:
                Toast.makeText(this, "alignLeft", Toast.LENGTH_SHORT).show();
                break;
            case R.id.alignCenter:
                Toast.makeText(this, "alignCenter", Toast.LENGTH_SHORT).show();
                break;
            case R.id.alignRighr:
                Toast.makeText(this, "alignRighr", Toast.LENGTH_SHORT).show();
                break;
            case R.id.alignJustify:
                Toast.makeText(this, "alignJustify", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
