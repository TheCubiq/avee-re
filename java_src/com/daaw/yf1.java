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

    /* renamed from: c */
    public static final Lock f33624c = new ReentrantLock();
    @GuardedBy("sLk")

    /* renamed from: d */
    public static yf1 f33625d;

    /* renamed from: a */
    public final Lock f33626a = new ReentrantLock();
    @GuardedBy("mLk")

    /* renamed from: b */
    public final SharedPreferences f33627b;

    public yf1(Context context) {
        this.f33627b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public static yf1 m3782a(Context context) {
        ry0.m10830j(context);
        Lock lock = f33624c;
        lock.lock();
        try {
            if (f33625d == null) {
                f33625d = new yf1(context.getApplicationContext());
            }
            yf1 yf1Var = f33625d;
            lock.unlock();
            return yf1Var;
        } catch (Throwable th) {
            f33624c.unlock();
            throw th;
        }
    }

    /* renamed from: d */
    public static final String m3779d(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    public GoogleSignInAccount m3781b() {
        String m3780c;
        String m3780c2 = m3780c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(m3780c2) || (m3780c = m3780c(m3779d("googleSignInAccount", m3780c2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m1220B(m3780c);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final String m3780c(String str) {
        this.f33626a.lock();
        try {
            return this.f33627b.getString(str, null);
        } finally {
            this.f33626a.unlock();
        }
    }
}
