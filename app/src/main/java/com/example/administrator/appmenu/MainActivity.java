package com.example.administrator.appmenu;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    Button bxYzreader = null;
    Button bScores = null;
    Button bLibrary = null;
    Button bSpotify = null;
    Button bBuildIT = null;
    Context context = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();

        bSpotify = (Button) findViewById(R.id.button);
        bScores = (Button) findViewById(R.id.button2);
        bLibrary = (Button) findViewById(R.id.button3);
        bBuildIT = (Button) findViewById(R.id.button4);
        bxYzreader = (Button) findViewById(R.id.button5);

        bSpotify.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                CharSequence text = "Launching Spotify Steamer";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();                Log.d("my pp", "xyz readdr");
            }
        });

        bScores.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                CharSequence text = "Launching Scores App";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();                Log.d("my pp", "xyz readdr");
            }
        });

        bLibrary.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                CharSequence text = "Launching Library App";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();                Log.d("my pp", "xyz readdr");
            }
        });

        bBuildIT.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                CharSequence text = "Launching Build IT Bigger";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();                Log.d("my pp", "xyz readdr");
            }
        });

        bxYzreader.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                CharSequence text = "Launching YYZ Reader";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();                Log.d("my pp", "xyz readdr");
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
}
