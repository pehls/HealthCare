package com.pehls.healthcare.View.Main;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.pehls.healthcare.Pessoa.Repository.PessoaProvider;
import com.pehls.healthcare.R;
import com.pehls.healthcare.View.IdealWeight.IdealWeightActivity;
import com.pehls.healthcare.View.Profile.ProfileActivity;
import com.pehls.healthcare.Pessoa.Model.*;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    PessoaProvider pessoaProvider = new PessoaProvider();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        pessoaProvider.abreBanco(this);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        final Spinner genderSpinner = (Spinner) findViewById(R.id.gender_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.genders, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        genderSpinner.setAdapter(adapter);

        findViewById(R.id.save_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (genderSpinner.getItemAtPosition(genderSpinner.getSelectedItemPosition()).toString().equalsIgnoreCase("homem")) {
                    pessoaProvider.inserePessoa(new PessoaBO(
                            new Man())
                            .setName(((EditText)findViewById(R.id.name_editText)).getText().toString())
                            .setAge(Integer.parseInt(((EditText)findViewById(R.id.age_editText)).getText().toString()))
                            .setHeight(Float.parseFloat(((EditText)findViewById(R.id.height_editText)).getText().toString()))
                            .setWeight(Float.parseFloat(((EditText)findViewById(R.id.weight_editText)).getText().toString()))
                    , getBaseContext());
                    start(ProfileActivity.class);
                } else {
                    pessoaProvider.inserePessoa(new PessoaBO(
                            new Woman())
                            .setName(((EditText)findViewById(R.id.name_editText)).getText().toString())
                            .setAge(Integer.parseInt(((EditText)findViewById(R.id.age_editText)).getText().toString()))
                            .setHeight(Float.parseFloat(((EditText)findViewById(R.id.height_editText)).getText().toString()))
                            .setWeight(Float.parseFloat(((EditText)findViewById(R.id.weight_editText)).getText().toString()))
                    , getBaseContext());
                    start(ProfileActivity.class);
                };

            }
        });

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.profile_link) {
           start(ProfileActivity.class);
        }  else if (id == R.id.info_link) {
            start(IdealWeightActivity.class);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    private void start(Class activityClass) {
        startActivity(new Intent(getBaseContext(), activityClass));
    }
}
