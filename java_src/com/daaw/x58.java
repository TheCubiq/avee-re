package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzaw;
/* loaded from: classes2.dex */
public final class x58 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ zzaw f32125p;

    /* renamed from: q */
    public final /* synthetic */ String f32126q;

    /* renamed from: r */
    public final /* synthetic */ ox3 f32127r;

    /* renamed from: s */
    public final /* synthetic */ x78 f32128s;

    public x58(x78 x78Var, zzaw zzawVar, String str, ox3 ox3Var) {
        this.f32128s = x78Var;
        this.f32125p = zzawVar;
        this.f32126q = str;
        this.f32127r = ox3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ua5 ua5Var;
        byte[] bArr = null;
        try {
            try {
                x78 x78Var = this.f32128s;
                ua5Var = x78Var.f32173d;
                if (ua5Var == null) {
                    x78Var.f25143a.mo3895i().m14160q().m20653a("Discarding data. Failed to send event to service to bundle");
                } else {
                    bArr = ua5Var.mo8368m0(this.f32125p, this.f32126q);
                    this.f32128s.m5479E();
                }
            } catch (RemoteException e) {
                this.f32128s.f25143a.mo3895i().m14160q().m20652b("Failed to send event to the service to bundle", e);
            }
        } finally {
            this.f32128s.f25143a.m24045N().m24508G(this.f32127r, bArr);
        }
    }
}
