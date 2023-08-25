package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* renamed from: com.daaw.fj */
/* loaded from: classes.dex */
public class C1291fj {

    /* renamed from: b */
    public static final Object f9625b = new Object();
    @Nullable

    /* renamed from: c */
    public static volatile C1291fj f9626c;

    /* renamed from: a */
    public ConcurrentHashMap f9627a = new ConcurrentHashMap();

    /* renamed from: b */
    public static C1291fj m22614b() {
        if (f9626c == null) {
            synchronized (f9625b) {
                if (f9626c == null) {
                    f9626c = new C1291fj();
                }
            }
        }
        C1291fj c1291fj = f9626c;
        ry0.m10830j(c1291fj);
        return c1291fj;
    }

    /* renamed from: e */
    public static void m22611e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* renamed from: g */
    public static boolean m22609g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof cr8);
    }

    /* renamed from: h */
    public static final boolean m22608h(Context context, Intent intent, ServiceConnection serviceConnection, int i, @Nullable Executor executor) {
        return (!vw0.m6695j() || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
    }

    /* renamed from: a */
    public boolean m22615a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return m22610f(context, context.getClass().getName(), intent, serviceConnection, i, true, null);
    }

    /* renamed from: c */
    public void m22613c(Context context, ServiceConnection serviceConnection) {
        if (!m22609g(serviceConnection) || !this.f9627a.containsKey(serviceConnection)) {
            m22611e(context, serviceConnection);
            return;
        }
        try {
            m22611e(context, (ServiceConnection) this.f9627a.get(serviceConnection));
        } finally {
            this.f9627a.remove(serviceConnection);
        }
    }

    /* renamed from: d */
    public final boolean m22612d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, @Nullable Executor executor) {
        return m22610f(context, str, intent, serviceConnection, i, true, executor);
    }

    /* renamed from: f */
    public final boolean m22610f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z, @Nullable Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((ez1.m22979a(context).m19344c(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (m22609g(serviceConnection)) {
            ServiceConnection serviceConnection2 = (ServiceConnection) this.f9627a.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction());
            }
            try {
                boolean m22608h = m22608h(context, intent, serviceConnection, i, executor);
                if (m22608h) {
                    return m22608h;
                }
                return false;
            } finally {
                this.f9627a.remove(serviceConnection, serviceConnection);
            }
        }
        return m22608h(context, intent, serviceConnection, i, executor);
    }
}
