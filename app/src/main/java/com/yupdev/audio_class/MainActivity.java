package com.yupdev.audio_class;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	
	public void onClickFamily (View v) 
	{
		Intent numbers = new Intent (this, FamilyActivity.class);
		startActivity(numbers);
//		Toast.makeText(this,"working",Toast.LENGTH_LONG).show();
	}
	
}
