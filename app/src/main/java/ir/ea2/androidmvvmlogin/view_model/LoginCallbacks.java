package ir.ea2.androidmvvmlogin.view_model;

public interface LoginCallbacks {
     void onSuccess(String message);
     void onFailure(String message);
}
