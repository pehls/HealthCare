package com.pehls.healthcare.View.IdealWeight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.pehls.healthcare.Pessoa.Repository.PessoaProvider;
import com.pehls.healthcare.Pessoa.Repository.PessoaRepository;
import com.pehls.healthcare.R;
import com.pehls.healthcare.View.IMC.IMCActivity;

public class IdealWeightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ideal_weight);
        PessoaProvider pessoaProvider = new PessoaProvider();
        pessoaProvider.abreBanco(this);
        ((TextView) findViewById(R.id.height_textView)).setText(
                pessoaProvider.recuperaPessoa(1, PessoaRepository.IW));
        findViewById(R.id.ok_button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             start(IMCActivity.class);
            }
        });
    }
    private void start(Class activityClass) {
        startActivity(new Intent(getBaseContext(), activityClass));
    }
}
