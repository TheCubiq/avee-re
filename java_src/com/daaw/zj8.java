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

    /* renamed from: a */
    public final Map f35172a = new HashMap();

    /* renamed from: b */
    public int f35173b = 2;

    /* renamed from: c */
    public boolean f35174c;

    /* renamed from: d */
    public IBinder f35175d;

    /* renamed from: e */
    public final rh8 f35176e;

    /* renamed from: f */
    public ComponentName f35177f;

    /* renamed from: g */
    public final /* synthetic */ vp8 f35178g;

    public zj8(vp8 vp8Var, rh8 rh8Var) {
        this.f35178g = vp8Var;
        this.f35176e = rh8Var;
    }

    /* renamed from: a */
    public final int m2192a() {
        return this.f35173b;
    }

    /* renamed from: b */
    public final ComponentName m2191b() {
        return this.f35177f;
    }

    /* renamed from: c */
    public final IBinder m2190c() {
        return this.f35175d;
    }

    /* renamed from: d */
    public final void m2189d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f35172a.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: e */
    public final void m2188e(String str, Executor executor) {
        C1291fj c1291fj;
        Context context;
        Context context2;
        C1291fj c1291fj2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j;
        this.f35173b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (vw0.m6693l()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            vp8 vp8Var = this.f35178g;
            c1291fj = vp8Var.f30432j;
            context = vp8Var.f30429g;
            rh8 rh8Var = this.f35176e;
            context2 = vp8Var.f30429g;
            boolean m22612d = c1291fj.m22612d(context, str, rh8Var.m11298c(context2), this, this.f35176e.m11300a(), executor);
            this.f35174c = m22612d;
            if (m22612d) {
                handler = this.f35178g.f30430h;
                Message obtainMessage = handler.obtainMessage(1, this.f35176e);
                handler2 = this.f35178g.f30430h;
                j = this.f35178g.f30434l;
                handler2.sendMessageDelayed(obtainMessage, j);
            } else {
                this.f35173b = 2;
                try {
                    vp8 vp8Var2 = this.f35178g;
                    c1291fj2 = vp8Var2.f30432j;
                    context3 = vp8Var2.f30429g;
                    c1291fj2.m22613c(context3, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    /* renamed from: f */
    public final void m2187f(ServiceConnection serviceConnection, String str) {
        this.f35172a.remove(serviceConnection);
    }

    /* renamed from: g */
    public final void m2186g(String str) {
        Handler handler;
        C1291fj c1291fj;
        Context context;
        handler = this.f35178g.f30430h;
        handler.removeMessages(1, this.f35176e);
        vp8 vp8Var = this.f35178g;
        c1291fj = vp8Var.f30432j;
        context = vp8Var.f30429g;
        c1291fj.m22613c(context, this);
        this.f35174c = false;
        this.f35173b = 2;
    }

    /* renamed from: h */
    public final boolean m2185h(ServiceConnection serviceConnection) {
        return this.f35172a.containsKey(serviceConnection);
    }

    /* renamed from: i */
    public final boolean m2184i() {
        return this.f35172a.isEmpty();
    }

    /* renamed from: j */
    public final boolean m2183j() {
        return this.f35174c;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f35178g.f30428f;
        synchronized (hashMap) {
            handler = this.f35178g.f30430h;
            handler.removeMessages(1, this.f35176e);
            this.f35175d = iBinder;
            this.f35177f = componentName;
            for (ServiceConnection serviceConnection : this.f35172a.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.f35173b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f35178g.f30428f;
        synchronized (hashMap) {
            handler = this.f35178g.f30430h;
            handler.removeMessages(1, this.f35176e);
            this.f35175d = null;
            this.f35177f = componentName;
            for (ServiceConnection serviceConnection : this.f35172a.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.f35173b = 2;
        }
    }
}
