package com.example.myapplication2.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    public int a=0;
    public int b=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.inc) {
            b++;
            Button button = (Button) findViewById(R.id.button);
            button.setText(String.valueOf(b));
            return true;
        }
        if (id == R.id.dec) {
            b--;
            Button button = (Button) findViewById(R.id.button);
            button.setText(String.valueOf(b));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean Writer(View view)
    {
      a=a+b;
      TextView wri = (TextView) findViewById(R.id.wri);
      String tt =String.valueOf(a);
      wri.setText(tt);
      if (a==1000)
      {
          TextView wintext = (TextView) findViewById(R.id.wintext);
          wintext.setText("You WIN!!!");
      }
      return true;
    }

}
