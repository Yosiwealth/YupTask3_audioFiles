
package com.yupdev.audio_class;

import android.app.*;
import android.media.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.util.*;

public class FamilyActivity extends Activity
	{
		@Override
		protected void onCreate(Bundle savedInstanceState)
		{
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_family);
			
			ArrayList<Word> words = new ArrayList <Word> () ;
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Omobinrin",	"Daughter",	R.drawable.play));
			words.add(new Word("Egbon Okunrin",	"Brother",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			words.add(new Word("Baba",	"Father",	R.drawable.play));
			words.add(new Word("Iya",	"Mother",	R.drawable.play));
			words.add(new Word("Omokunrin",	"Son",	R.drawable.play));
			words.add(new Word("Egbon Obinrin",	"Sister",	R.drawable.play));
			
			
			WordAdapter adapter = new WordAdapter(this, words);
			ListView listView = (ListView) findViewById(R.id.listViewHolder);
			listView.setAdapter(adapter);
			
			}
			
	ImageButton buttonPlay;
			
	ImageButon  buttonPlay = (ImageButton) findViewById(R.id.play);
	buttonPlay.setOnClickListener(new OnClickListener() {

	public void onClick(View v) {
		// TODO Auto-generated method stub
		mPlayer = MediaPlayer.create(getApplicationContext(),R.raw.hosannahindi);//Create MediaPlayer object with MP3 file under res/raw folder
		mPlayer.start();//Start playing the music
	}
	});
		 
	}
	
