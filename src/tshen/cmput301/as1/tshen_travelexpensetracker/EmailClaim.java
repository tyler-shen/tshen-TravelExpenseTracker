package tshen.cmput301.as1.tshen_travelexpensetracker;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class EmailClaim extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    // set layout for this activity
	    setContentView(R.layout.send_email);
	    
        // Initialize the button
        Button btn6 = (Button)findViewById(R.id.sendemailbutton);
        btn6.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View v){
        		Intent intent=new Intent(EmailClaim.this, EditClaim.class);
        		startActivity(intent);
        	}
        });
	}

}
