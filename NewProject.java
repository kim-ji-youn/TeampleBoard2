package com.jiyoun.teampleboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewProject extends AppCompatActivity {
    static int Number = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_project);

        Button button = (Button) findViewById(R.id.completeButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewProject.this, ProjectItem.class);


                EditText editTextName = (EditText)findViewById(R.id.projectName);
                intent.putExtra("project_name", editTextName.getText().toString());

                EditText editTextDate = (EditText) findViewById(R.id.projectDate);
                intent.putExtra("project_date", editTextDate.getText().toString());





            }
        });

    }
}
