package com.pehls.healthcare.View.IMC;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.pehls.healthcare.Pessoa.Repository.PessoaProvider;
import com.pehls.healthcare.Pessoa.Repository.PessoaRepository;
import com.pehls.healthcare.R;
import com.pehls.healthcare.View.TGC.TGCActivity;


public class IMCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);
        PessoaProvider pessoaProvider = new PessoaProvider();
        pessoaProvider.abreBanco(this);
        ((TextView) findViewById(R.id.imc_textView)).setText(pessoaProvider.recuperaPessoa(1, PessoaRepository.EVALIMC) + ", seu IMC é " + pessoaProvider.recuperaPessoa(1, PessoaRepository.IMC));
        findViewById(R.id.ok_button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start(TGCActivity.class);
            }
        });
    }
    private void start(Class activityClass) {
        startActivity(new Intent(getBaseContext(), activityClass));
    }
}
