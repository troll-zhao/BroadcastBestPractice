package com.example.broadcastbestpractice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

	private EditText accountEdit;
	
	private EditText passwordEdit;
	
	private Button login;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.id.login);
		accountEdit = (EditText)findViewById(R.id.account);
		passwordEdit = (EditText)findViewById(R.id.password);
		login = (Button)findViewById(R.id.login);
		login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String account = accountEdit.getText().toString();
				String password = passwordEdit.getText().toString();
				
				if(accountEdit.equals("admin") && passwordEdit.equals("123456")){
					Intent intent = new Intent(LoginActivity.this, MainActivity.class);
					startActivity(intent);
					finish();
				} else {
					Toast.makeText(LoginActivity.this, "account or password is invalid", Toast.LENGTH_SHORT).show();
				}
			}
		});
	}
}
