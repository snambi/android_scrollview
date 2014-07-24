package com.example.scrollview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TextView view = (TextView ) findViewById(R.id.textView3);
        StringBuilder sb = new StringBuilder();
        for( int i=0; i< 500; i++ ){
        	sb.append("this is awesome! ");
        }
        
        view.setText(sb.toString());
    }
}
