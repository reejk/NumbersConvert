package com.app.numconv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class NewsActivity extends BarActivity implements OnClickListener {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.news);
		
		findViewById(R.id.continue_button).setOnClickListener(this);
	}

	public void onClick(View v) {
		onBackPressed();
	}
	
	public void onBackPressed() {
		if(getIntent().getBooleanExtra("createNew", true))
			startActivity(new Intent(NewsActivity.this, MainActivity.class));
		finish();
	}

}
