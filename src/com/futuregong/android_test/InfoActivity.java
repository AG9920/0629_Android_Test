package com.futuregong.android_test;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.futuregong.db.Myhelper;
import com.futuregong.pojo.worker;

public class InfoActivity extends Activity implements OnClickListener {
	
	private EditText  name,telephone,work,qq,weixin,company;
	private Button save;
	
	SQLiteDatabase db;
	Myhelper mh;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_info);
		
		initView();
		initEvent();
	}

	private void initEvent() {		
		save.setOnClickListener(this);
	}

	private void initView() {
		// TODO Auto-generated method stub
		name = (EditText) findViewById(R.id.name_);
		telephone = (EditText) findViewById(R.id.telephone_);
		work = (EditText) findViewById(R.id.work_);
		qq = (EditText) findViewById(R.id.qq_);
		weixin = (EditText) findViewById(R.id.weixin_);
		company = (EditText) findViewById(R.id.company_);
		save = (Button) findViewById(R.id.but);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.info, menu);
		return true;
	}

	public void onClick(View c) {
		
		String _name = name.getText().toString();
		int _telephone = Integer.parseInt(telephone.getText().toString());
		String _work = work.getText().toString();
		int _qq= Integer.parseInt(qq.getText().toString());
		String _weixin = weixin.getText().toString();
		String _company = company.getText().toString();
		
		worker w = new worker(_name, _telephone, _work, _qq, _weixin, _company);
		list_worker.add(w);
		
		db = mh.getWritableDatabase();
		db.execSQL("insert into INFO(name,telephone,work,qq,weixin,company) values(?,?,?,?,?,?);",
				new Object[]{w.getName(),w.getTelephone(),w.getWork(),w.getQq(),w.getWeixin(),w.getCompany()});
		Toast.makeText(InfoActivity.this, "±£´æ³É¹¦", 0).show();
		
		
		Intent it = new Intent(InfoActivity.this,MainActivity.class);
		startActivity(it);
		
	}

}
