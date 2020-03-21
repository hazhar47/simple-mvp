package cobafp.com.cobamvp.presenter;

import cobafp.com.cobamvp.view.LoginView;

public class LoginPresenter implements LoginInteractor.OnLoginFinishedListener {

    private LoginView loginView;
    private LoginInteractor loginInteractor;
    public LoginPresenter(LoginView loginView, LoginInteractor loginInteractor){
        this.loginView = loginView;
        this.loginInteractor = loginInteractor;
    }

    @Override
    public void onUsernameError() {

    }

    @Override
    public void onPasswordError() {

    }

    @Override
    public void onLoginSuccess(String username) {

    }

    @Override
    public void onLoginError() {

    }

    public void validateCredentials(String trim, String trim1) {
    }
}
