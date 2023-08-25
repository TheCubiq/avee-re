package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class f43 {
    public final byte[] a;
    public int b;
    public final /* synthetic */ g43 c;

    public /* synthetic */ f43(g43 g43Var, byte[] bArr, e43 e43Var) {
        this.c = g43Var;
        this.a = bArr;
    }

    public final f43 a(int i) {
        this.b = i;
        return this;
    }

    public final synchronized void c() {
        if (((Boolean) zzba.zzc().b(g93.h9)).booleanValue()) {
            g43.a(this.c).execute(new Runnable() { // from class: com.daaw.a43
                @Override // java.lang.Runnable
                public final void run() {
                    f43.this.d();
                }
            });
        } else {
            d();
        }
    }

    public final synchronized void d() {
        try {
            g43 g43Var = this.c;
            if (g43Var.b) {
                g43Var.a.w(this.a);
                this.c.a.C(0);
                this.c.a.c(this.b);
                this.c.a.E(null);
                this.c.a.zzf();
            }
        } catch (RemoteException e) {
            k04.zzf("Clearcut log failed", e);
        }
    }
}
