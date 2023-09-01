package com.ahmad.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActifity extends AppCompatActivity {
    TextView name, email,phone,address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_actifity);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        address = findViewById(R.id.address);

        Bundle data = getIntent().getExtras();
        String nameIntern = data.getString("nameIntent");
        String emailIntern = data.getString("emailIntent");
        String phoneIntern = data.getString("phoneIntent");
        String addressIntern = data.getString("addressIntent");

        name.setText(nameIntern);
        email.setText(emailIntern);
        phone.setText(phoneIntern);
        address.setText(addressIntern);
    }
}