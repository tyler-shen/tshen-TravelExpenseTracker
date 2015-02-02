package tshen.cmput301.as1.tshen_travelexpensetracker;

import java.util.List;






import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set layout for this activity
        setContentView(R.layout.activity_main);
        
        // Initialize the button
        Button btn1 = (Button)findViewById(R.id.addaclaim);
        btn1.setOnClickListener(new OnClickListener() {
        	
        	@Override
        	public void onClick(View v){
        		Intent intent=new Intent(MainActivity.this, CreateClaim.class);
        		startActivity(intent);
        	}
        });
        

        
        // initialize the listview
        ListView clview = (ListView) findViewById(R.id.claimslist);

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
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
