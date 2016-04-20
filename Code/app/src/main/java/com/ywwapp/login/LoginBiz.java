package com.ywwapp.login;

import android.content.Context;

/**
 * Created by wang on 16/4/9.
 */
public class LoginBiz {
    static LoginBiz loginBiz;

    public static LoginBiz getInstance(Context context) {
        if (loginBiz == null) {
            loginBiz = new LoginBiz(context);
        }
        return loginBiz;
    }

    public LoginBiz(Context context) {

    }
}
