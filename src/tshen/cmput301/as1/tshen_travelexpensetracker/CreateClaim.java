package tshen.cmput301.as1.tshen_travelexpensetracker;

import java.util.ArrayList;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class CreateClaim extends Activity{
	
	//protected ArrayList<String> claimlist = new ArrayList<String>();
    //public ArrayAdapter<String> listclaim;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState);
		// set the layout this activity
		setContentView(R.layout.create_claim);
	
		// initialize the views
		EditText ET1 = (EditText)findViewById(R.id.destination);
		EditText ET2 = (EditText)findViewById(R.id.reason);
		DatePicker DT1 = (DatePicker) findViewById(R.id.startdate);
		DatePicker DT2 = (DatePicker) findViewById(R.id.enddate);
		
        //String destination = ET1.getText().toString();
        //String reason = ET2.getText().toString();
        
        //claimlist.add(destination);

        //listclaim = new ArrayAdapter<String> (this, android.R.layout.simple_expandable_list_item_1,claimlist);

        
		
        // Initialize the button
        Button btn2 = (Button)findViewById(R.id.submitclaim);
        btn2.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View v2){

                
        		Intent intent=new Intent(CreateClaim.this, MainActivity.class);
        		startActivity(intent);
        	}
        });
        

	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
}
