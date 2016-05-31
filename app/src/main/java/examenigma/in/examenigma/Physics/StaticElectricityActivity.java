package examenigma.in.examenigma.Physics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import examenigma.in.examenigma.R;

public class StaticElectricityActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.electricity_layout);
        setTitle("GENESIS");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(false);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void onItemClick(View view) {
        if (view.getId() == R.id.imageView1) {
            Intent intent = new Intent(StaticElectricityActivity.this, StaticElectricityActivity.class);
            StaticElectricityActivity.this.startActivity(intent);
        }}


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


}

