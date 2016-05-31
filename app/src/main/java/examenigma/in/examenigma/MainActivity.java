package examenigma.in.examenigma;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity{
    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         *Setup the DrawerLayout and NavigationView
         */

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mNavigationView = (NavigationView) findViewById(R.id.navigation_view) ;

        /**
         * Lets inflate the very first fragment
         * Here , we are inflating the HomeFragment as the first Fragment
         */

        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.containerView,new HomeFragment()).commit();
        /**
         * Setup click events on the Navigation View Items.
         */

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();

                if (menuItem.getItemId() == R.id.nav_item_home) {
                    FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.containerView,new HomeFragment()).commit();

                }


                if (menuItem.getItemId() == R.id.nav_item_event) {
                    Intent intent = new Intent(MainActivity.this, PhysicsActivity.class);
                    MainActivity.this.startActivity(intent);

                }

                if (menuItem.getItemId() == R.id.nav_item_sponsor) {
                    Intent intent = new Intent(MainActivity.this, ChemistryActivity.class);
                   MainActivity.this.startActivity(intent);
                }
                if (menuItem.getItemId() == R.id.nav_item_guest) {
                    Intent intent = new Intent(MainActivity.this, MathsActivity.class);
                    MainActivity.this.startActivity(intent);
                }
                if (menuItem.getItemId() == R.id.nav_item_workshop) {
                    Intent intent = new Intent(MainActivity.this,LecturesActivity.class);
                    MainActivity.this.startActivity(intent);
                }
                if (menuItem.getItemId() == R.id.nav_item_exhibitions) {
                    Intent intent = new Intent(MainActivity.this, NcertActivity.class);
                    MainActivity.this.startActivity(intent);
                }
                if (menuItem.getItemId() == R.id.nav_item_megashows) {
                    Intent intent = new Intent(MainActivity.this, QuestionpaperActivity.class);
                    MainActivity.this.startActivity(intent);
                }
                if (menuItem.getItemId() == R.id.nav_item_contacts) {
                    Intent intent = new Intent(MainActivity.this, ContactActivity.class);
                    MainActivity.this.startActivity(intent);
                }

                return false;
            }

        });

        /**
         * Setup Drawer Toggle of the Toolbar
         */

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout, toolbar,R.string.app_name,R.string.app_name);

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerToggle.syncState();

    }
}