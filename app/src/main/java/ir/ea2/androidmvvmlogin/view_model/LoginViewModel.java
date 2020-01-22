package ir.ea2.androidmvvmlogin.view_model;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.lifecycle.ViewModel;
import ir.ea2.androidmvvmlogin.R;
import ir.ea2.androidmvvmlogin.model.LoginModel;

public class LoginViewModel extends ViewModel {
    //set object of MODEL
    private LoginModel loginModel;
    //CallBack Interface : Transfer Data Between VIEW_MODEL to VIEW .(This data includes the result of MODEL and VIEW_MODEL's relationship. )
    private LoginCallbacks loginCallbacks;

    public LoginViewModel(LoginCallbacks loginCallbacks) {
        this.loginCallbacks = loginCallbacks;
        this.loginModel = new LoginModel();
    }

    public LoginModel getLoginModel() {
        return loginModel;
    }

    public LoginCallbacks getLoginCallbacks() {
        return loginCallbacks;
    }

    public void setLoginModel(LoginModel loginModel) {
        this.loginModel = loginModel;
    }

    public void setLoginCallbacks(LoginCallbacks loginCallbacks) {
        this.loginCallbacks = loginCallbacks;
    }

    public TextWatcher usernameTextWatcher(){
     return  new TextWatcher() {
         @Override
         public void beforeTextChanged(CharSequence cs, int start, int count, int after) {

         }

         @Override
         public void onTextChanged(CharSequence cs, int start, int before, int count) {

         }

         @Override
         public void afterTextChanged(Editable editable) {
            loginModel.setUsername(editable.toString());

         }
     };
    }
    public TextWatcher emailTextWatcher(){
        return  new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence cs, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence cs, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                loginModel.setEmail(editable.toString());

            }
        };
    }
    public TextWatcher passwordTextWatcher(){
        return  new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence cs, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence cs, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                loginModel.setPassword(editable.toString());

            }
        };
    }
    public void onLoginBtnClick(View view){
        if (loginModel.validateLogin()) {
            loginCallbacks.onSuccess(view.getResources().getString(R.string.successful_login_message));
        } else {
            loginCallbacks.onFailure(view.getResources().getString(R.string.failed_login_message));
        }
    }
}
