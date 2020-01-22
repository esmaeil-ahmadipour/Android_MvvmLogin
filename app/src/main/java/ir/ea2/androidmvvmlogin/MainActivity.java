package ir.ea2.androidmvvmlogin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;
import ir.ea2.androidmvvmlogin.databinding.ActivityMainBinding;
import ir.ea2.androidmvvmlogin.view_model.LoginCallbacks;
import ir.ea2.androidmvvmlogin.view_model.LoginViewModel;
import ir.ea2.androidmvvmlogin.view_model.LoginViewModelFactory;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements LoginCallbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Binding Layout
        ActivityMainBinding activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        //Connecting VIEW_MODEL To VIEW
        activityMainBinding.setViewModel(ViewModelProviders.of(this, new LoginViewModelFactory(this )).get(LoginViewModel.class));
    }


    @Override
    public void onSuccess(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailure(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }
}
