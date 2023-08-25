package com.daaw;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class u70 {

    /* renamed from: a */
    public static int f28754a = 4225;

    /* renamed from: b */
    public static final Object f28755b = new Object();

    /* renamed from: c */
    public static vp8 f28756c;

    /* renamed from: d */
    public static HandlerThread f28757d;

    /* renamed from: e */
    public static boolean f28758e;

    /* renamed from: a */
    public static int m8462a() {
        return f28754a;
    }

    /* renamed from: b */
    public static u70 m8461b(Context context) {
        synchronized (f28755b) {
            if (f28756c == null) {
                f28756c = new vp8(context.getApplicationContext(), f28758e ? m8460c().getLooper() : context.getMainLooper());
            }
        }
        return f28756c;
    }

    /* renamed from: c */
    public static HandlerThread m8460c() {
        synchronized (f28755b) {
            HandlerThread handlerThread = f28757d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f28757d = handlerThread2;
            handlerThread2.start();
            return f28757d;
        }
    }

    /* renamed from: d */
    public abstract void mo6941d(rh8 rh8Var, ServiceConnection serviceConnection, String str);

    /* renamed from: e */
    public final void m8459e(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        mo6941d(new rh8(str, str2, i, z), serviceConnection, str3);
    }

    /* renamed from: f */
    public abstract boolean mo6940f(rh8 rh8Var, ServiceConnection serviceConnection, String str, Executor executor);
}
