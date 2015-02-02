package tshen.cmput301.as1.tshen_travelexpensetracker;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class EditExpense extends Activity {

	   @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        // set layout for this activity
	        setContentView(R.layout.edit_expense);
	        
	        // Initialize the button
	        Button btn7 = (Button)findViewById(R.id.editexpense);
	        btn7.setOnClickListener(new OnClickListener() {
	        	@Override
	        	public void onClick(View v){
	        		Intent intent=new Intent(EditExpense.this, CreateExpense.class);
	        		startActivity(intent);
	        	}
	        });

		}
	
}
