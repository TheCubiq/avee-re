package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.internal.zzj;
/* loaded from: classes.dex */
public final class dl4 extends x42 {

    /* renamed from: p */
    public AbstractC2527pa f7428p;

    /* renamed from: q */
    public final int f7429q;

    public dl4(AbstractC2527pa abstractC2527pa, int i) {
        this.f7428p = abstractC2527pa;
        this.f7429q = i;
    }

    @Override // com.daaw.td0
    /* renamed from: O0 */
    public final void mo9294O0(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.daaw.td0
    /* renamed from: p1 */
    public final void mo9293p1(int i, IBinder iBinder, Bundle bundle) {
        ry0.m10829k(this.f7428p, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f7428p.m13549r(i, iBinder, bundle, this.f7429q);
        this.f7428p = null;
    }

    @Override // com.daaw.td0
    /* renamed from: w1 */
    public final void mo9292w1(int i, IBinder iBinder, zzj zzjVar) {
        AbstractC2527pa abstractC2527pa = this.f7428p;
        ry0.m10829k(abstractC2527pa, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        ry0.m10830j(zzjVar);
        AbstractC2527pa.m13564C(abstractC2527pa, zzjVar);
        mo9293p1(i, iBinder, zzjVar.f36661p);
    }
}
