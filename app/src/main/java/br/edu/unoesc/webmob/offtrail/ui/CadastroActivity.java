package br.edu.unoesc.webmob.offtrail.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import br.edu.unoesc.webmob.offtrail.R;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void cancelarTrilheiro(View v){
        Toast.makeText(this,"Cancelando",Toast.LENGTH_LONG).show();

        finish();
    }

    public void salvarTrilheiro(View v){
        Toast.makeText(this,"Salvando",Toast.LENGTH_LONG).show();
        finish();

    }


}
