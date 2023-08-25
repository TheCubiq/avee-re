package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.daaw.pa;
import com.google.android.gms.common.ConnectionResult;
/* loaded from: classes.dex */
public final class x76 extends m32 {
    public final IBinder g;
    public final /* synthetic */ pa h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x76(pa paVar, int i, IBinder iBinder, Bundle bundle) {
        super(paVar, i, bundle);
        this.h = paVar;
        this.g = iBinder;
    }

    @Override // com.daaw.m32
    public final void f(ConnectionResult connectionResult) {
        if (this.h.v != null) {
            this.h.v.I(connectionResult);
        }
        this.h.p(connectionResult);
    }

    @Override // com.daaw.m32
    public final boolean g() {
        pa.a aVar;
        pa.a aVar2;
        try {
            IBinder iBinder = this.g;
            ry0.j(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.h.k().equals(interfaceDescriptor)) {
                String k = this.h.k();
                StringBuilder sb = new StringBuilder();
                sb.append("service descriptor mismatch: ");
                sb.append(k);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                return false;
            }
            IInterface e = this.h.e(this.g);
            if (e != null) {
                if (pa.G(this.h, 2, 4, e) || pa.G(this.h, 3, 4, e)) {
                    this.h.z = null;
                    Bundle connectionHint = this.h.getConnectionHint();
                    pa paVar = this.h;
                    aVar = paVar.u;
                    if (aVar != null) {
                        aVar2 = paVar.u;
                        aVar2.M(connectionHint);
                    }
                    return true;
                }
                return false;
            }
            return false;
        } catch (RemoteException unused) {
            return false;
        }
    }
}
