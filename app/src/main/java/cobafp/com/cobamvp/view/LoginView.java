package cobafp.com.cobamvp.view;

public interface LoginView {
    void setUsernameError();
    void setPasswordError();
    void showProgressbar();
    void hideProgressbar();
    void onLoginSuccess(String username);
    void onLoginError();
}
