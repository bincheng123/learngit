package com.example.basicview1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       CheckBox checkBox = (CheckBox)findViewById(R.id.checkBox1);
       checkBox.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View V) {
			// TODO Auto-generated method stub
			if(((CheckBox) V).isChecked())
    	   DisplayToast("CheckBox is checked");
       
			else
				DisplayToast("CheckBox is unchecked");
			
			
		}});
   	
		RadioGroup radioGrop = (RadioGroup)findViewById(R.id.radioGroup1);
		radioGrop.setOnCheckedChangeListener(new OnCheckedChangeListener(){
			public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
		RadioButton rb1 = (RadioButton) findViewById(R.id.radio1);
		if(rb1.isChecked())
			DisplayToast("OPtion 1 checked!");
		
		
	else
		DisplayToast("Option 2 checked");
	
			}}
		
		);
	
		ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggleButton1);
		toggleButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(((ToggleButton)v).isChecked())
					DisplayToast("Toggle button is On");
				else
					DisplayToast("Toggle button is Off");
			}});
	
		
	
		}
    
    
    
    
    
	private void DisplayToast(String string) {
		// TODO Auto-generated method stub
		Toast.makeText(getBaseContext(), string, 1).show();
		
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
