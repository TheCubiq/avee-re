package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class zj8 implements ServiceConnection, cr8 {
    public final Map a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final rh8 e;
    public ComponentName f;
    public final /* synthetic */ vp8 g;

    public zj8(vp8 vp8Var, rh8 rh8Var) {
        this.g = vp8Var;
        this.e = rh8Var;
    }

    public final int a() {
        return this.b;
    }

    public final ComponentName b() {
        return this.f;
    }

    public final IBinder c() {
        return this.d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        fj fjVar;
        Context context;
        Context context2;
        fj fjVar2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j;
        this.b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (vw0.l()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            vp8 vp8Var = this.g;
            fjVar = vp8Var.j;
            context = vp8Var.g;
            rh8 rh8Var = this.e;
            context2 = vp8Var.g;
            boolean d = fjVar.d(context, str, rh8Var.c(context2), this, this.e.a(), executor);
            this.c = d;
            if (d) {
                handler = this.g.h;
                Message obtainMessage = handler.obtainMessage(1, this.e);
                handler2 = this.g.h;
                j = this.g.l;
                handler2.sendMessageDelayed(obtainMessage, j);
            } else {
                this.b = 2;
                try {
                    vp8 vp8Var2 = this.g;
                    fjVar2 = vp8Var2.j;
                    context3 = vp8Var2.g;
                    fjVar2.c(context3, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.a.remove(serviceConnection);
    }

    public final void g(String str) {
        Handler handler;
        fj fjVar;
        Context context;
        handler = this.g.h;
        handler.removeMessages(1, this.e);
        vp8 vp8Var = this.g;
        fjVar = vp8Var.j;
        context = vp8Var.g;
        fjVar.c(context, this);
        this.c = false;
        this.b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.a.isEmpty();
    }

    public final boolean j() {
        return this.c;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.g.f;
        synchronized (hashMap) {
            handler = this.g.h;
            handler.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            for (ServiceConnection serviceConnection : this.a.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.g.f;
        synchronized (hashMap) {
            handler = this.g.h;
            handler.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            for (ServiceConnection serviceConnection : this.a.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
