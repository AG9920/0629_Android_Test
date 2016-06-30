package com.futuregong.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class Myhelper extends SQLiteOpenHelper {
	
	private static final String CREATE_INFO = "create table info(name varchar(20) primary key,telephone integer,work varchar(20),qq integer,weixin varchar(20),company varchar(20);";

	public Myhelper(Context context) {
		super(context, "test0629.db", null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(CREATE_INFO);
		db.execSQL("insert into INFO(name,telephone,work,qq,weixin,company) values('ÕÅÈý',13516180664,engineer,110340,future,Microsoft);");
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}
	
	

}
