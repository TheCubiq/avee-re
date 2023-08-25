package com.daaw;

import android.os.Bundle;
import android.os.RemoteException;
import com.daaw.pa;
import com.google.android.gms.internal.ads.zzbef;
import com.google.android.gms.internal.ads.zzbei;
import java.io.IOException;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public final class r33 implements pa.a {
    public final /* synthetic */ zzbei a;
    public final /* synthetic */ e14 b;
    public final /* synthetic */ t33 c;

    public r33(t33 t33Var, zzbei zzbeiVar, e14 e14Var) {
        this.c = t33Var;
        this.a = zzbeiVar;
        this.b = e14Var;
    }

    @Override // com.daaw.pa.a
    public final void D(int i) {
    }

    @Override // com.daaw.pa.a
    public final void M(Bundle bundle) {
        Object obj;
        boolean z;
        final j33 j33Var;
        obj = this.c.d;
        synchronized (obj) {
            t33 t33Var = this.c;
            z = t33Var.b;
            if (z) {
                return;
            }
            t33Var.b = true;
            j33Var = this.c.a;
            if (j33Var == null) {
                return;
            }
            g77 g77Var = z04.a;
            final zzbei zzbeiVar = this.a;
            final e14 e14Var = this.b;
            final f77 P = g77Var.P(new Runnable() { // from class: com.daaw.o33
                @Override // java.lang.Runnable
                public final void run() {
                    r33 r33Var = r33.this;
                    j33 j33Var2 = j33Var;
                    zzbei zzbeiVar2 = zzbeiVar;
                    e14 e14Var2 = e14Var;
                    try {
                        l33 K = j33Var2.K();
                        zzbef j3 = j33Var2.J() ? K.j3(zzbeiVar2) : K.i3(zzbeiVar2);
                        if (!j3.u()) {
                            e14Var2.c(new RuntimeException("No entry contents."));
                            t33.e(r33Var.c);
                            return;
                        }
                        q33 q33Var = new q33(r33Var, j3.s(), 1);
                        int read = q33Var.read();
                        if (read == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        q33Var.unread(read);
                        e14Var2.b(v33.b(q33Var, j3.t(), j3.w(), j3.h(), j3.v()));
                    } catch (RemoteException | IOException e) {
                        k04.zzh("Unable to obtain a cache service instance.", e);
                        e14Var2.c(e);
                        t33.e(r33Var.c);
                    }
                }
            });
            final e14 e14Var2 = this.b;
            e14Var2.f(new Runnable() { // from class: com.daaw.p33
                @Override // java.lang.Runnable
                public final void run() {
                    e14 e14Var3 = e14.this;
                    Future future = P;
                    if (e14Var3.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, z04.f);
        }
    }
}
