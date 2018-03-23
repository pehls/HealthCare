package com.pehls.healthcare.View.TGC;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.pehls.healthcare.Pessoa.Repository.PessoaProvider;
import com.pehls.healthcare.Pessoa.Repository.PessoaRepository;
import com.pehls.healthcare.R;
import com.pehls.healthcare.View.Main.MainActivity;

import java.io.Console;

public class TGCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tgc);
        PessoaProvider pessoaProvider = new PessoaProvider();
        pessoaProvider.abreBanco(this);

        ((TextView) findViewById(R.id.tgc_textView)).setText(pessoaProvider.recuperaPessoa(1, PessoaRepository.EVALTGC)+", com valor de "+pessoaProvider.recuperaPessoa(1, PessoaRepository.TGC));
        findViewById(R.id.ok_button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start(MainActivity.class);
            }
        });
    }
    private void start(Class activityClass) {
        startActivity(new Intent(getBaseContext(), activityClass));
    }
}
