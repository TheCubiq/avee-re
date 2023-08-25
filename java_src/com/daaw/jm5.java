package com.daaw;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import com.daaw.AbstractC2527pa;
import com.google.android.gms.common.ConnectionResult;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public abstract class jm5 implements AbstractC2527pa.InterfaceC2528a, AbstractC2527pa.InterfaceC2529b {

    /* renamed from: a */
    public final e14 f15206a = new e14();

    /* renamed from: b */
    public boolean f15207b = false;

    /* renamed from: c */
    public boolean f15208c = false;

    /* renamed from: d */
    public rt3 f15209d;

    /* renamed from: e */
    public Context f15210e;

    /* renamed from: f */
    public Looper f15211f;

    /* renamed from: g */
    public ScheduledExecutorService f15212g;

    @Override // com.daaw.AbstractC2527pa.InterfaceC2528a
    /* renamed from: D */
    public void mo5044D(int i) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i));
        k04.zze(format);
        this.f15206a.m23796c(new pk5(1, format));
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2529b
    /* renamed from: I */
    public final void mo2982I(ConnectionResult connectionResult) {
        String format = String.format(Locale.US, "Remote ad service connection failed, cause: %d.", Integer.valueOf(connectionResult.m1209h()));
        k04.zze(format);
        this.f15206a.m23796c(new pk5(1, format));
    }

    /* renamed from: a */
    public final synchronized void m18408a() {
        if (this.f15209d == null) {
            this.f15209d = new rt3(this.f15210e, this.f15211f, this, this);
        }
        this.f15209d.checkAvailabilityAndConnect();
    }

    /* renamed from: b */
    public final synchronized void m18407b() {
        this.f15208c = true;
        rt3 rt3Var = this.f15209d;
        if (rt3Var == null) {
            return;
        }
        if (rt3Var.isConnected() || this.f15209d.isConnecting()) {
            this.f15209d.disconnect();
        }
        Binder.flushPendingCommands();
    }
}
