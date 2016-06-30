package com.futuregong.android_test;

import java.util.ArrayList;
import java.util.List;

import com.futuregong.pojo.worker;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity implements android.view.View.OnClickListener {
	public List<worker> list_worker = new ArrayList<worker>();
	private ListView lv_01;
	private Button btn_add;
	List<String> list;
	ArrayAdapter<String> adapter;
	int i=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);		
		//初始化视图界面
		initView();
		//初始化控件的点击事件及其他的响应事件
		initEvent();
		//初始化数据
		initData();
	}

	private void initData() {
		// TODO Auto-generated method stub
		list =new ArrayList<String>();
		for (int i = 0; i < ; i++) {
			
		}
		list.add("张三");
		list.add("李四");
		adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list );
		//adapter.notifyDataSetChanged();
		lv_01.setAdapter(adapter);
	}

	private void initEvent() {
		// TODO Auto-generated method stub
		btn_add.setOnClickListener(this);
	}

	private void initView() {
		// TODO Auto-generated method stub
		lv_01 = (ListView) findViewById(R.id.listView1);
		btn_add = (Button) findViewById(R.id.xinjian);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.xinjian:{
			Intent it = new Intent(MainActivity.this,InfoActivity.class);
			startActivity(it);
		}
			
			break;
		case R.id.listView1:{
			
		}
			
		default:
			break;
		}
	}


}
