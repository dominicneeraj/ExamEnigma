package examenigma.in.examenigma;

/**
 * Created by NEERAJPC on 5/13/2016.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import examenigma.in.examenigma.Physics.StaticElectricityActivity;


public class PhysicsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.physics_layout);
        setTitle("EVENTS");
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
             Intent intent = new Intent(examenigma.in.examenigma.PhysicsActivity.this, StaticElectricityActivity.class);
             examenigma.in.examenigma.PhysicsActivity.this.startActivity(intent);
    }}

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


}
