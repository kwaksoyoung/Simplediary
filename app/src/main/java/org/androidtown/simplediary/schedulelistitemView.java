package org.androidtown.simplediary;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by SOYOUNG on 2015-11-07.
 */

public class schedulelistitemView extends LinearLayout {

        private TextView timeText;

        private TextView scheduleText;


        public schedulelistitemView(Context context) {
            super(context);

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            inflater.inflate(R.layout.activity_schedulelistitem, this, true);

            timeText = (TextView) findViewById(R.id.timeText);
            scheduleText = (TextView) findViewById(R.id.scheduleText);

        }

        public void setContents(int index,String data){

            if(index == 0) {
                timeText.setText(data);
            }
            else if(index==1){
                scheduleText.setText(data);
            }
            else{
                throw new IllegalArgumentException();
            }
        }



}

