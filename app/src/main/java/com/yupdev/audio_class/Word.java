package com.yupdev.audio_class;

public class Word 		{
	
	private String mYoruba;
	private String mEnglish;
	private int mImage;
	
	public Word(String yoruba, String english, int image)		{
		mYoruba = yoruba;
		mEnglish = english;
		mImage = image;
	}
	
	public String getYoruba()	{
		return mYoruba;
	}
	
	public String getEnglish()	{
		return mEnglish;
	}
	
	public int getImage()	{
		return mImage;
	}
}
