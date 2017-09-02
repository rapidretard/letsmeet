package com.meet.letsmeet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class SelectPreference extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_preference);

        final CheckBox check_bar = (CheckBox)findViewById(R.id.check_bar);
        Button next_btn = (Button)findViewById(R.id.next_btn);

        next_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(SelectPreference.this, ViewPreferenceResults.class);
                intent.putExtra("bars_checked", check_bar.isChecked());
                startActivity(intent);
            }
        });
    }
}
