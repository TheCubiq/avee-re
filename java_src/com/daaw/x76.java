package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.daaw.AbstractC2527pa;
import com.google.android.gms.common.ConnectionResult;
/* loaded from: classes.dex */
public final class x76 extends m32 {

    /* renamed from: g */
    public final IBinder f32170g;

    /* renamed from: h */
    public final /* synthetic */ AbstractC2527pa f32171h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x76(AbstractC2527pa abstractC2527pa, int i, IBinder iBinder, Bundle bundle) {
        super(abstractC2527pa, i, bundle);
        this.f32171h = abstractC2527pa;
        this.f32170g = iBinder;
    }

    @Override // com.daaw.m32
    /* renamed from: f */
    public final void mo5486f(ConnectionResult connectionResult) {
        if (this.f32171h.f22757v != null) {
            this.f32171h.f22757v.mo2982I(connectionResult);
        }
        this.f32171h.m13551p(connectionResult);
    }

    @Override // com.daaw.m32
    /* renamed from: g */
    public final boolean mo5485g() {
        AbstractC2527pa.InterfaceC2528a interfaceC2528a;
        AbstractC2527pa.InterfaceC2528a interfaceC2528a2;
        try {
            IBinder iBinder = this.f32170g;
            ry0.m10830j(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f32171h.mo6175k().equals(interfaceDescriptor)) {
                String mo6175k = this.f32171h.mo6175k();
                StringBuilder sb = new StringBuilder();
                sb.append("service descriptor mismatch: ");
                sb.append(mo6175k);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                return false;
            }
            IInterface mo6177e = this.f32171h.mo6177e(this.f32170g);
            if (mo6177e != null) {
                if (AbstractC2527pa.m13560G(this.f32171h, 2, 4, mo6177e) || AbstractC2527pa.m13560G(this.f32171h, 3, 4, mo6177e)) {
                    this.f32171h.f22761z = null;
                    Bundle connectionHint = this.f32171h.getConnectionHint();
                    AbstractC2527pa abstractC2527pa = this.f32171h;
                    interfaceC2528a = abstractC2527pa.f22756u;
                    if (interfaceC2528a != null) {
                        interfaceC2528a2 = abstractC2527pa.f22756u;
                        interfaceC2528a2.mo2196M(connectionHint);
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
