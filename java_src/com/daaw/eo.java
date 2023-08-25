package com.daaw;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.IBinder;
/* loaded from: classes.dex */
public final class eo {
    public final Object a = new Object();
    public final yc0 b;
    public final xc0 c;
    public final ComponentName d;
    public final PendingIntent e;

    public eo(yc0 yc0Var, xc0 xc0Var, ComponentName componentName, PendingIntent pendingIntent) {
        this.b = yc0Var;
        this.c = xc0Var;
        this.d = componentName;
        this.e = pendingIntent;
    }

    public IBinder a() {
        return this.c.asBinder();
    }

    public ComponentName b() {
        return this.d;
    }

    public PendingIntent c() {
        return this.e;
    }
}
