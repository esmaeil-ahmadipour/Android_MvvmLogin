package ir.ea2.androidmvvmlogin.model;

import android.text.TextUtils;

import androidx.annotation.Nullable;

public class LoginModel {

    @Nullable
    String username, email, password;

    public LoginModel() {
    }

    public LoginModel(@Nullable String username, @Nullable String email, @Nullable String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public void setUsername(@Nullable String username) {
        this.username = username;
    }

    public void setEmail(@Nullable String email) {
        this.email = email;
    }

    public void setPassword(@Nullable String password) {
        this.password = password;
    }

    @Nullable
    public String getUsername() {
        return username;
    }

    @Nullable
    public String getEmail() {
        return email;
    }

    @Nullable
    public String getPassword() {
        return password;
    }

    public boolean validateLogin() {

        return !TextUtils.isEmpty(username)
                && !TextUtils.isEmpty(email)
                && !TextUtils.isEmpty(password)
                && getPassword().length() > 6
                && getUsername().length() > 8;
    }
}
