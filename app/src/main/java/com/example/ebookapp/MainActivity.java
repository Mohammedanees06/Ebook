package com.example.ebookapp;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.navigation.NavigationView;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ArrayList<SubjectModel> list;
    SubjectAdapter adapter;
    RecyclerView recyclerView;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView menu;

    View header;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();}
            recyclerView = findViewById(R.id.recySubject);
            menu = findViewById(R.id.menu);
            drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
            list = new ArrayList<>();
            navigationView = (NavigationView) findViewById(R.id.navView);
            LinearLayoutManager manager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(manager);

            list.add(new SubjectModel("Chapter-1"));
            list.add(new SubjectModel("Chapter-2"));
            list.add(new SubjectModel("Chapter-3"));
            list.add(new SubjectModel("Chapter-4"));
            list.add(new SubjectModel("Chapter-5"));
            list.add(new SubjectModel("Chapter-6"));
            list.add(new SubjectModel("Chapter-7"));
            list.add(new SubjectModel("Chapter-8"));
            list.add(new SubjectModel("Chapter-9"));
            list.add(new SubjectModel("Chapter-10"));
            list.add(new SubjectModel("Chapter-11"));
            list.add(new SubjectModel("Chapter-12"));
            adapter = new SubjectAdapter(this, list);
            recyclerView.setAdapter(adapter);
            header = navigationView.getHeaderView(0);
            menu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                        drawerLayout.closeDrawer(GravityCompat.START);
                    } else {
                        drawerLayout.openDrawer(GravityCompat.START);
                    }
                }
            });
            navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    return false;
                }
            });
            navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {


                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    int itemId = item.getItemId();

                    if (itemId == R.id.home) {
                        Toast.makeText(MainActivity.this, "Home ", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        return true;
                    } else if (itemId == R.id.share) {

                        Toast.makeText(MainActivity.this, "Share ", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        return true;
                    } else if (itemId == R.id.rate) {

                        Toast.makeText(MainActivity.this, "Rate us", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        return true;
                    }
                    return false;
                }
            });
        }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);


        }
    }
}


       



