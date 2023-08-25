package com.daaw;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class u70 {
    public static int a = 4225;
    public static final Object b = new Object();
    public static vp8 c;
    public static HandlerThread d;
    public static boolean e;

    public static int a() {
        return a;
    }

    public static u70 b(Context context) {
        synchronized (b) {
            if (c == null) {
                c = new vp8(context.getApplicationContext(), e ? c().getLooper() : context.getMainLooper());
            }
        }
        return c;
    }

    public static HandlerThread c() {
        synchronized (b) {
            HandlerThread handlerThread = d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            d = handlerThread2;
            handlerThread2.start();
            return d;
        }
    }

    public abstract void d(rh8 rh8Var, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        d(new rh8(str, str2, i, z), serviceConnection, str3);
    }

    public abstract boolean f(rh8 rh8Var, ServiceConnection serviceConnection, String str, Executor executor);
}
