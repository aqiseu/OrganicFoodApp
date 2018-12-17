package com.applesyrup.organicfoodapp.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.applesyrup.organicfoodapp.R;
import com.applesyrup.organicfoodapp.main.MainActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.edt_login_email)
    EditText edtLoginEmail;
    @BindView(R.id.til_name)
    TextInputLayout tilName;
    @BindView(R.id.edt_login_name)
    EditText edtLoginName;
    @BindView(R.id.til_email)
    TextInputLayout tilEmail;
    @BindView(R.id.btn_login)
    Button btnLogin;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        intent = new Intent(LoginActivity.this, MainActivity.class);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!validateForm()) {
                    onFailed();
                    return;
                }

                intent.putExtra(MainActivity.EXTRA_NAME, edtLoginName.getText().toString());
                intent.putExtra(MainActivity.EXTRA_EMAIL, edtLoginEmail.getText().toString());
                startActivity(intent);
            }
        });
    }

    public boolean validateForm(){

        boolean valid = true;
        if (edtLoginName.getText().toString().isEmpty() || edtLoginName.getText().toString().length() < 3) {
            tilName.setError("At least 3 characters");
            valid = false;
        } else {
            tilName.setError(null);
        }

        if (edtLoginEmail.getText().toString().isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(edtLoginEmail.getText().toString()).matches()) {
            tilEmail.setError("Enter your valid email");
            valid = false;
        } else {
            tilEmail.setError(null);
        }

        return valid;
    }


    public void onFailed() {
        Toast.makeText(LoginActivity.this, "Failed", Toast.LENGTH_SHORT).show();
        btnLogin.setEnabled(true);
    }
}
