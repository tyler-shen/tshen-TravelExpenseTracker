package tshen.cmput301.as1.tshen_travelexpensetracker;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class EditClaim extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set layout for this activity
        setContentView(R.layout.edit_claim);
        
        // Initialize the button
        Button btn3 = (Button)findViewById(R.id.addexpense);
        btn3.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View v){
        		Intent intent=new Intent(EditClaim.this, CreateExpense.class);
        		startActivity(intent);
        	}
        });
        
        Button btn4 = (Button)findViewById(R.id.editclaim);
        btn4.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View v){
        		Intent intent=new Intent(EditClaim.this, CreateClaim.class);
        		startActivity(intent);
        	}
        });
	
        Button btn5 = (Button)findViewById(R.id.emailclaim);
        btn5.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View v){
        		Intent intent=new Intent(EditClaim.this, EmailClaim.class);
        		startActivity(intent);
        	}
        });
	
    }
    
}
