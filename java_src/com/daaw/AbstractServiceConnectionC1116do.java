package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.daaw.yc0;
/* renamed from: com.daaw.do */
/* loaded from: classes.dex */
public abstract class AbstractServiceConnectionC1116do implements ServiceConnection {

    /* renamed from: a */
    public Context f7504a;

    /* renamed from: com.daaw.do$a */
    /* loaded from: classes.dex */
    public class C1117a extends C0875bo {
        public C1117a(yc0 yc0Var, ComponentName componentName, Context context) {
            super(yc0Var, componentName, context);
        }
    }

    /* renamed from: a */
    public abstract void mo14652a(ComponentName componentName, C0875bo c0875bo);

    /* renamed from: b */
    public void m24198b(Context context) {
        this.f7504a = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f7504a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        mo14652a(componentName, new C1117a(yc0.AbstractBinderC3688a.m3869D(iBinder), componentName, this.f7504a));
    }
}
