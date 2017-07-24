package com.yupdev.audio_class;

import android.content.*;
import android.widget.*;
import java.util.*;
import android.view.*;

public class WordAdapter extends ArrayAdapter<Word>
{
	public WordAdapter (Context context,	ArrayList<Word> words)	{
			super(context,0,words);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		
		LayoutInflater inflater = LayoutInflater.from(getContext());
		View listItemView = inflater.inflate(R.layout.listview_holder, parent, false);
		
		
		Word currentWord = getItem(position);
		TextView yorubaView = (TextView) listItemView.findViewById(R.id.yoruba);
		yorubaView.setText(currentWord.getYoruba());
		
		TextView englishView = (TextView) listItemView.findViewById(R.id.english);
		englishView.setText(currentWord.getEnglish());
		
		ImageButton image = (ImageButton) listItemView.findViewById(R.id.play);
		image.setImageResource(currentWord.getImage());
		image.setVisibility(View.VISIBLE);
		
		return listItemView;
		
		}
	}
	
