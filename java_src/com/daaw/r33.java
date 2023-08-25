package com.daaw;

import android.os.Bundle;
import android.os.RemoteException;
import com.daaw.AbstractC2527pa;
import com.google.android.gms.internal.ads.zzbef;
import com.google.android.gms.internal.ads.zzbei;
import java.io.IOException;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public final class r33 implements AbstractC2527pa.InterfaceC2528a {

    /* renamed from: a */
    public final /* synthetic */ zzbei f24807a;

    /* renamed from: b */
    public final /* synthetic */ e14 f24808b;

    /* renamed from: c */
    public final /* synthetic */ t33 f24809c;

    public r33(t33 t33Var, zzbei zzbeiVar, e14 e14Var) {
        this.f24809c = t33Var;
        this.f24807a = zzbeiVar;
        this.f24808b = e14Var;
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2528a
    /* renamed from: D */
    public final void mo5044D(int i) {
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2528a
    /* renamed from: M */
    public final void mo2196M(Bundle bundle) {
        Object obj;
        boolean z;
        final j33 j33Var;
        obj = this.f24809c.f26959d;
        synchronized (obj) {
            t33 t33Var = this.f24809c;
            z = t33Var.f26957b;
            if (z) {
                return;
            }
            t33Var.f26957b = true;
            j33Var = this.f24809c.f26956a;
            if (j33Var == null) {
                return;
            }
            g77 g77Var = z04.f34305a;
            final zzbei zzbeiVar = this.f24807a;
            final e14 e14Var = this.f24808b;
            final f77 mo20111P = g77Var.mo20111P(new Runnable() { // from class: com.daaw.o33
                @Override // java.lang.Runnable
                public final void run() {
                    r33 r33Var = r33.this;
                    j33 j33Var2 = j33Var;
                    zzbei zzbeiVar2 = zzbeiVar;
                    e14 e14Var2 = e14Var;
                    try {
                        l33 m19156K = j33Var2.m19156K();
                        zzbef m17177j3 = j33Var2.m19157J() ? m19156K.m17177j3(zzbeiVar2) : m19156K.m17178i3(zzbeiVar2);
                        if (!m17177j3.m1109u()) {
                            e14Var2.m23796c(new RuntimeException("No entry contents."));
                            t33.m9602e(r33Var.f24809c);
                            return;
                        }
                        q33 q33Var = new q33(r33Var, m17177j3.m1111s(), 1);
                        int read = q33Var.read();
                        if (read == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        q33Var.unread(read);
                        e14Var2.m23797b(v33.m7516b(q33Var, m17177j3.m1110t(), m17177j3.m1107w(), m17177j3.m1113h(), m17177j3.m1108v()));
                    } catch (RemoteException | IOException e) {
                        k04.zzh("Unable to obtain a cache service instance.", e);
                        e14Var2.m23796c(e);
                        t33.m9602e(r33Var.f24809c);
                    }
                }
            });
            final e14 e14Var2 = this.f24808b;
            e14Var2.mo6515f(new Runnable() { // from class: com.daaw.p33
                @Override // java.lang.Runnable
                public final void run() {
                    e14 e14Var3 = e14.this;
                    Future future = mo20111P;
                    if (e14Var3.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, z04.f34310f);
        }
    }
}
