package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.daaw.yc0;
/* renamed from: com.daaw.do  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class Cdo implements ServiceConnection {
    public Context a;

    /* renamed from: com.daaw.do$a */
    /* loaded from: classes.dex */
    public class a extends bo {
        public a(yc0 yc0Var, ComponentName componentName, Context context) {
            super(yc0Var, componentName, context);
        }
    }

    public abstract void a(ComponentName componentName, bo boVar);

    public void b(Context context) {
        this.a = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        a(componentName, new a(yc0.a.D(iBinder), componentName, this.a));
    }
}
