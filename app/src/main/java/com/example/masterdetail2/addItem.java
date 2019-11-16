package com.example.masterdetail2;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class addItem extends AppCompatActivity {

    EditText id;
    EditText content;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arecord);

        id=(EditText)findViewById(R.id.id);

        content=(EditText)findViewById(R.id.content);

    }

    public void cancelhandler(View v)
    {
        Intent intent = new Intent();
        setResult(RESULT_CANCELED, intent);
        finish();
    }


    // Make sure the handler shouldd have the following :
    // Be public
    // Return void
    // Define a View as its only parameter (this will be the View that was clicked)
    public void addhandler(View v)
    {
        Intent intent = new Intent();
        String i=id.getText().toString();
        String c=content.getText().toString();

        Toast.makeText(getApplicationContext(),i+c, Toast.LENGTH_SHORT).show();

        intent.putExtra("id", i);
        intent.putExtra("content", c);
        // you might want to add more key-value pairs and extract them correspondingly in the caller part.
        setResult(RESULT_OK, intent); //Call this to set the result that your activity will return to its caller.
        finish();
    }

}
