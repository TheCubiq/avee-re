package com.daaw;

import android.os.Binder;
import com.daaw.AbstractC2527pa;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzccb;
/* loaded from: classes.dex */
public abstract class xj5 implements AbstractC2527pa.InterfaceC2528a, AbstractC2527pa.InterfaceC2529b {

    /* renamed from: a */
    public final e14 f32767a = new e14();

    /* renamed from: b */
    public final Object f32768b = new Object();

    /* renamed from: c */
    public boolean f32769c = false;

    /* renamed from: d */
    public boolean f32770d = false;

    /* renamed from: e */
    public zzccb f32771e;

    /* renamed from: f */
    public pt3 f32772f;

    @Override // com.daaw.AbstractC2527pa.InterfaceC2528a
    /* renamed from: D */
    public final void mo5044D(int i) {
        k04.zze("Cannot connect to remote service, fallback to local instance.");
    }

    /* renamed from: I */
    public void mo2982I(ConnectionResult connectionResult) {
        k04.zze("Disconnected from remote ad request service.");
        this.f32767a.m23796c(new pk5(1));
    }

    /* renamed from: a */
    public final void m5043a() {
        synchronized (this.f32768b) {
            this.f32770d = true;
            if (this.f32772f.isConnected() || this.f32772f.isConnecting()) {
                this.f32772f.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }
}
