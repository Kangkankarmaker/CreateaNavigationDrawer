package kangkan.developer.createanavigationdrawer;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.nav_res);

        drawerLayout=findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.navigation_View);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.nav_a:
                        item.setChecked(true);
                        diplaymessage("A selected");
                        drawerLayout.closeDrawers();
                        return true;

                    case R.id.nav_b:
                        item.setChecked(true);
                        diplaymessage("B selected");
                        drawerLayout.closeDrawers();
                        return true;

                    case R.id.nav_c:
                        item.setChecked(true);
                        diplaymessage("C selected");
                        drawerLayout.closeDrawers();
                        return true;

                    case R.id.nav_d:
                        item.setChecked(true);
                        diplaymessage("D selected");
                        drawerLayout.closeDrawers();
                        return true;


                }


                return false;
            }
        });

    }

    private  void diplaymessage(String meaasge)
    {
        Toast.makeText(this, meaasge, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
