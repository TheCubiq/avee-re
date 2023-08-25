package com.daaw;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.daaw.AbstractC2527pa;
/* loaded from: classes.dex */
public final class f33 implements AbstractC2527pa.InterfaceC2528a {

    /* renamed from: a */
    public final /* synthetic */ h33 f9057a;

    public f33(h33 h33Var) {
        this.f9057a = h33Var;
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2528a
    /* renamed from: D */
    public final void mo5044D(int i) {
        Object obj;
        Object obj2;
        obj = this.f9057a.f11999c;
        synchronized (obj) {
            this.f9057a.f12002f = null;
            obj2 = this.f9057a.f11999c;
            obj2.notifyAll();
        }
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2528a
    /* renamed from: M */
    public final void mo2196M(Bundle bundle) {
        Object obj;
        Object obj2;
        j33 j33Var;
        j33 j33Var2;
        obj = this.f9057a.f11999c;
        synchronized (obj) {
            try {
                h33 h33Var = this.f9057a;
                j33Var = h33Var.f12000d;
                if (j33Var != null) {
                    j33Var2 = h33Var.f12000d;
                    h33Var.f12002f = j33Var2.m19156K();
                }
            } catch (DeadObjectException e) {
                k04.zzh("Unable to obtain a cache service instance.", e);
                h33.m21048h(this.f9057a);
            }
            obj2 = this.f9057a.f11999c;
            obj2.notifyAll();
        }
    }
}
