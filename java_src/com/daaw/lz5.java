package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class lz5 {
    public final qz5 a;
    public final String b;
    @GuardedBy("this")
    public zzdn c;

    public lz5(qz5 qz5Var, String str) {
        this.a = qz5Var;
        this.b = str;
    }

    public final synchronized String a() {
        zzdn zzdnVar;
        try {
            zzdnVar = this.c;
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzdnVar != null ? zzdnVar.zzg() : null;
    }

    public final synchronized String b() {
        zzdn zzdnVar;
        try {
            zzdnVar = this.c;
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzdnVar != null ? zzdnVar.zzg() : null;
    }

    public final synchronized void d(zzl zzlVar, int i) {
        this.c = null;
        this.a.a(zzlVar, this.b, new rz5(i), new kz5(this));
    }

    public final synchronized boolean e() {
        return this.a.zza();
    }
}
