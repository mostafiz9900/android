package com.example.checkboxtutos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkBox1, checkBox2, checkBox3;
    private Button buttons, btnRadio;

    private static RadioGroup radio_g;

    private static RadioButton radio_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radio_g = (RadioGroup) findViewById(R.id.radioGrop);
        btnRadio = (Button) findViewById(R.id.btnRadio);

        addcheck();
        addListnerToCheckBox();
        addRadioButton();
    }

    public void addRadioButton() {
        btnRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectId =radio_g.getCheckedRadioButtonId();
                radio_b=(RadioButton) findViewById(selectId);
                Toast.makeText(MainActivity.this, radio_b.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void addListnerToCheckBox() {
        checkBox1 = (CheckBox) findViewById(R.id.checkBox);
        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(MainActivity.this, "Check box is silected ", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void addcheck() {
        checkBox1 = (CheckBox) findViewById(R.id.checkBox);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        buttons = (Button) findViewById(R.id.button);

        buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("Check 1 :").append(checkBox1.isChecked());
                result.append("\nCheck 2 :").append(checkBox2.isChecked());
                result.append("\nCheck 3 :").append(checkBox3.isChecked());
                Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
