package com.jiyoun.teampleboard;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by kim Ji Youn on 2017-06-11.
 */

public class ProjectItemView extends LinearLayout{
    TextView textView;
    TextView textView1;

    public ProjectItemView(Context context) {
        super(context);

        init(context);
    }

    public ProjectItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    private void init(Context context){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.project_item, this, true);

        textView = (TextView) findViewById(R.id.projectNameShow);
        textView1 = (TextView) findViewById(R.id.projectDateShow);

    }

    public void setName(String name){
        textView.setText(name);
    }
    public void setDate(String date) {
        textView1.setText(date);
    }
}
