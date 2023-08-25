package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.internal.zzj;
/* loaded from: classes.dex */
public final class dl4 extends x42 {
    public pa p;
    public final int q;

    public dl4(pa paVar, int i) {
        this.p = paVar;
        this.q = i;
    }

    @Override // com.daaw.td0
    public final void O0(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.daaw.td0
    public final void p1(int i, IBinder iBinder, Bundle bundle) {
        ry0.k(this.p, "onPostInitComplete can be called only once per call to getRemoteService");
        this.p.r(i, iBinder, bundle, this.q);
        this.p = null;
    }

    @Override // com.daaw.td0
    public final void w1(int i, IBinder iBinder, zzj zzjVar) {
        pa paVar = this.p;
        ry0.k(paVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        ry0.j(zzjVar);
        pa.C(paVar, zzjVar);
        p1(i, iBinder, zzjVar.p);
    }
}
