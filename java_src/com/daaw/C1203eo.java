package com.daaw;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.IBinder;
/* renamed from: com.daaw.eo */
/* loaded from: classes.dex */
public final class C1203eo {

    /* renamed from: a */
    public final Object f8605a = new Object();

    /* renamed from: b */
    public final yc0 f8606b;

    /* renamed from: c */
    public final xc0 f8607c;

    /* renamed from: d */
    public final ComponentName f8608d;

    /* renamed from: e */
    public final PendingIntent f8609e;

    public C1203eo(yc0 yc0Var, xc0 xc0Var, ComponentName componentName, PendingIntent pendingIntent) {
        this.f8606b = yc0Var;
        this.f8607c = xc0Var;
        this.f8608d = componentName;
        this.f8609e = pendingIntent;
    }

    /* renamed from: a */
    public IBinder m23343a() {
        return this.f8607c.asBinder();
    }

    /* renamed from: b */
    public ComponentName m23342b() {
        return this.f8608d;
    }

    /* renamed from: c */
    public PendingIntent m23341c() {
        return this.f8609e;
    }
}
