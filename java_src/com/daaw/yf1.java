package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
/* loaded from: classes.dex */
public class yf1 {
    public static final Lock c = new ReentrantLock();
    @GuardedBy("sLk")
    public static yf1 d;
    public final Lock a = new ReentrantLock();
    @GuardedBy("mLk")
    public final SharedPreferences b;

    public yf1(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static yf1 a(Context context) {
        ry0.j(context);
        Lock lock = c;
        lock.lock();
        try {
            if (d == null) {
                d = new yf1(context.getApplicationContext());
            }
            yf1 yf1Var = d;
            lock.unlock();
            return yf1Var;
        } catch (Throwable th) {
            c.unlock();
            throw th;
        }
    }

    public static final String d(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public GoogleSignInAccount b() {
        String c2;
        String c3 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c3) || (c2 = c(d("googleSignInAccount", c3))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.B(c2);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String c(String str) {
        this.a.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            this.a.unlock();
        }
    }
}
