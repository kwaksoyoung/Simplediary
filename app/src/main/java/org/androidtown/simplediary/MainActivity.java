package org.androidtown.simplediary;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class MainActivity extends Activity {

    ListView mschedulelistView;
    schedulelistAdapter mscheduleListAdapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mschedulelistView = (ListView)findViewById(R.id.scheduleList);
        mscheduleListAdapter = new schedulelistAdapter(this);
        mschedulelistView.setAdapter(mscheduleListAdapter);
        mschedulelistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                viewMemo(position);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void viewMemo(int position) {
    }


    public void onaddClicked(View v)
    {
        Intent intent_01= new Intent(getApplicationContext(), AddActivity.class);
        startActivity(intent_01);
    }
}
