package sg.edu.rp.c346.memoria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    Button btnSingleNormal, btnMultiNormal, btnTime;
    ImageView ivSingle, ivMulti;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ivSingle = findViewById(R.id.ivSingle);
        ivMulti = findViewById(R.id.ivMulti);

        btnSingleNormal = findViewById(R.id.btnSingleNormal);
        btnMultiNormal = findViewById(R.id.btnMultiNormal);
        btnTime = findViewById(R.id.btnTime);

        btnMultiNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnSingleNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, SingleActivity.class);
                startActivity(intent);
            }
        });

        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, TimeActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.home) {
            Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
            startActivity(intent);
        } else if (id == R.id.singleNormal){
            Intent intent = new Intent(HomeActivity.this, SingleActivity.class);
            startActivity(intent);
        } else if (id == R.id.singleTimer){
            Intent intent = new Intent(HomeActivity.this, TimeActivity.class);
            startActivity(intent);
        } else if (id == R.id.multiNormal){
            Intent intent = new Intent(HomeActivity.this, MainActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
