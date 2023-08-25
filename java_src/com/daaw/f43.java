package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class f43 {

    /* renamed from: a */
    public final byte[] f9094a;

    /* renamed from: b */
    public int f9095b;

    /* renamed from: c */
    public final /* synthetic */ g43 f9096c;

    public /* synthetic */ f43(g43 g43Var, byte[] bArr, e43 e43Var) {
        this.f9096c = g43Var;
        this.f9094a = bArr;
    }

    /* renamed from: a */
    public final f43 m22929a(int i) {
        this.f9095b = i;
        return this;
    }

    /* renamed from: c */
    public final synchronized void m22927c() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10708h9)).booleanValue()) {
            g43.m21969a(this.f9096c).execute(new Runnable() { // from class: com.daaw.a43
                @Override // java.lang.Runnable
                public final void run() {
                    f43.this.m22926d();
                }
            });
        } else {
            m22926d();
        }
    }

    /* renamed from: d */
    public final synchronized void m22926d() {
        try {
            g43 g43Var = this.f9096c;
            if (g43Var.f10255b) {
                g43Var.f10254a.mo21359w(this.f9094a);
                this.f9096c.f10254a.mo21363C(0);
                this.f9096c.f10254a.mo21360c(this.f9095b);
                this.f9096c.f10254a.mo21362E(null);
                this.f9096c.f10254a.zzf();
            }
        } catch (RemoteException e) {
            k04.zzf("Clearcut log failed", e);
        }
    }
}
