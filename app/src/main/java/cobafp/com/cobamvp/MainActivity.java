package cobafp.com.cobamvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import cobafp.com.cobamvp.presenter.LoginInteractor;
import cobafp.com.cobamvp.presenter.LoginPresenter;
import cobafp.com.cobamvp.view.LoginView;

public class MainActivity extends AppCompatActivity implements LoginView {

    EditText edUsername, edPassword;
    Button btnButton;
    ProgressBar progressBar;
    LoginPresenter loginPresenter;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        loginPresenter = new LoginPresenter(this, new LoginInteractor());
    }

    private void initViews() {

        edUsername = findViewById(R.id.edt_username);
        edPassword = findViewById(R.id.etd_password);
        progressBar = findViewById(R.id.progressBar);

    }

    public void loginMe(View view){
        showProgressbar();
        loginPresenter.validateCredentials(edUsername.getText().toString().trim(),
                                            edPassword.getText().toString().trim());
    }

    @Override
    public void setUsernameError() {

    }

    @Override
    public void setPasswordError() {

    }

    @Override
    public void showProgressbar() {

    }

    @Override
    public void hideProgressbar() {

    }

    @Override
    public void onLoginSuccess(String username) {

    }

    @Override
    public void onLoginError() {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
