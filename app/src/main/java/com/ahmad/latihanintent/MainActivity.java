package com.ahmad.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText name, email, phone, address;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        address = findViewById(R.id.address);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent inten = new Intent(this, ResultActifity.class);

        inten.putExtra("nameIntent", name.getText().toString());
        inten.putExtra("emailIntent", email.getText().toString());
        inten.putExtra("phoneIntent", phone.getText().toString());
        inten.putExtra("addressIntent", address.getText().toString());

        startActivity(inten);
    }
}