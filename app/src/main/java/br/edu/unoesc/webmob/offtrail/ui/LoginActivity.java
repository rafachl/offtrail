package br.edu.unoesc.webmob.offtrail.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Fullscreen;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.ViewsById;
import org.androidannotations.annotations.WindowFeature;

import br.edu.unoesc.webmob.offtrail.R;


@EActivity(R.layout.activity_login)
public class LoginActivity extends AppCompatActivity {
    @ViewById
    EditText login;

    @ViewById
    EditText senha;


    public void login(View v) {


        String log = login.getText().toString();
        String sen = senha.getText().toString();

        if (log.equals("123") && sen.equals("123")) {
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
