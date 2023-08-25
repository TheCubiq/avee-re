package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class lz5 {

    /* renamed from: a */
    public final qz5 f17924a;

    /* renamed from: b */
    public final String f17925b;
    @GuardedBy("this")

    /* renamed from: c */
    public zzdn f17926c;

    public lz5(qz5 qz5Var, String str) {
        this.f17924a = qz5Var;
        this.f17925b = str;
    }

    /* renamed from: a */
    public final synchronized String m16358a() {
        zzdn zzdnVar;
        try {
            zzdnVar = this.f17926c;
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzdnVar != null ? zzdnVar.zzg() : null;
    }

    /* renamed from: b */
    public final synchronized String m16357b() {
        zzdn zzdnVar;
        try {
            zzdnVar = this.f17926c;
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzdnVar != null ? zzdnVar.zzg() : null;
    }

    /* renamed from: d */
    public final synchronized void m16355d(zzl zzlVar, int i) {
        this.f17926c = null;
        this.f17924a.mo4385a(zzlVar, this.f17925b, new rz5(i), new kz5(this));
    }

    /* renamed from: e */
    public final synchronized boolean m16354e() {
        return this.f17924a.zza();
    }
}
