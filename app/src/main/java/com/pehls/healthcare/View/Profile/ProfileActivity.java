package com.pehls.healthcare.View.Profile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.pehls.healthcare.Pessoa.Repository.PessoaProvider;
import com.pehls.healthcare.Pessoa.Repository.PessoaRepository;
import com.pehls.healthcare.R;
import com.pehls.healthcare.View.IdealWeight.IdealWeightActivity;
import com.pehls.healthcare.View.Main.MainActivity;
import com.pehls.healthcare.View.Main.MainAdapter;
import com.pehls.healthcare.View.TGC.TGCAdapter;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        PessoaProvider pessoaProvider = new PessoaProvider();
        pessoaProvider.abreBanco(this);
        Log.v("Pessoa", pessoaProvider.recuperaPessoa(1, PessoaRepository.NAME)+"");
        ((TextView) findViewById(R.id.name_textView)).setText(pessoaProvider.recuperaPessoa(1, PessoaRepository.NAME));
        findViewById(R.id.ok_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start(IdealWeightActivity.class);
            }
        });
    }
    private void start(Class activityClass) {
        startActivity(new Intent(getBaseContext(), activityClass));
    }
}
