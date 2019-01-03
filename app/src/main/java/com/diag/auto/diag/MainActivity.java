package com.diag.auto.diag;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.buttonScan);

        // Show toast message when button is clicked
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Hello Word",Toast.LENGTH_LONG).show();

                Bundle objetbunble = new Bundle();

                Intent intent = new Intent(MainActivity.this, DefaultActivity.class);

                //On affecte à l'Intent le Bundle que l'on a créé
                intent.putExtras(objetbunble);

                //On démarre l'autre Activity
                startActivityForResult(intent, 1);



            }
        });

    }
}
