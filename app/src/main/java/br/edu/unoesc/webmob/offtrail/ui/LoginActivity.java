package br.edu.unoesc.webmob.offtrail.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Fullscreen;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.ViewsById;
import org.androidannotations.annotations.WindowFeature;

import br.edu.unoesc.webmob.offtrail.R;
import br.edu.unoesc.webmob.offtrail.helper.DatabaseHelper;
import br.edu.unoesc.webmob.offtrail.model.Usuario;


@EActivity(R.layout.activity_login)
public class LoginActivity extends AppCompatActivity {
    @ViewById
    EditText login;

    @ViewById
    EditText senha;

    @Bean
    DatabaseHelper dh;


    public void login(View v) {

        try {
            dh.getUsuarioDao().queryForAll();

        } catch (Exception e) {
            Toast.makeText(this, "Errou", Toast.LENGTH_LONG).show();

            e.printStackTrace();
        }

        String log = login.getText().toString();
        String sen = senha.getText().toString();

        Usuario usuario = dh.validarLogin(log, sen);
        if (usuario != null) {
            startActivity(new Intent(this, PrincipalActivity.class));
            finish();
        } else {
            Toast.makeText(this, "Errou", Toast.LENGTH_LONG).show();
        }
    }

    public void sair(View v) {
        System.exit(0);
    }
}
