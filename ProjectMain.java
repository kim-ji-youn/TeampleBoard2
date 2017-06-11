package com.jiyoun.teampleboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProjectMain extends AppCompatActivity {
    Button button;
    String name;
    String date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_main);

        button = (Button) findViewById(R.id.newProject);
        ListView listView = (ListView) findViewById(R.id.projectList);

        Intent intent = getIntent();
        TextView textViewName = (TextView) findViewById(R.id.projectName);//오류있다면 projectDate로 바꿔보기
        name = intent.getStringExtra("project_name");

        TextView textViewDate = (TextView) findViewById(R.id.projectDate);
        date = intent.getStringExtra("project_date");

        ProjectAdapter adapter = new ProjectAdapter();
        adapter.addItem(new ProjectItem(name,date));

        listView.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NewProject.class);
                startActivity(intent);
            }
        });

    }

    class ProjectAdapter extends BaseAdapter{

        ArrayList<ProjectItem> items = new ArrayList<ProjectItem>();

        @Override
        public int getCount() {
            return items.size();
        }

        public void addItem(ProjectItem item) {
            items.add(item);
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ProjectItemView view = new ProjectItemView(getApplicationContext());
            ProjectItem item = items.get(position);

            view.setName(item.getName());
            view.setDate(item.getDate());

            return view;
        }
    }


}
