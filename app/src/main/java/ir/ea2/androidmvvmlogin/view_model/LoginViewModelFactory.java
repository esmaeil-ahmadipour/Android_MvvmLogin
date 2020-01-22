package ir.ea2.androidmvvmlogin.view_model;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

// To Handle LoginViewModel
public class LoginViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private LoginCallbacks loginCallbacks ;

    public LoginViewModelFactory(LoginCallbacks loginCallbacks){
        this.loginCallbacks = loginCallbacks;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new LoginViewModel(loginCallbacks);
    }
}
