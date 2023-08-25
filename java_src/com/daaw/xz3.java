package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class xz3 implements m13 {
    public final zzg b;
    public final rz3 d;
    public final Object a = new Object();
    public final HashSet e = new HashSet();
    public final HashSet f = new HashSet();
    public boolean g = false;
    public final sz3 c = new sz3();

    public xz3(String str, zzg zzgVar) {
        this.d = new rz3(str, zzgVar);
        this.b = zzgVar;
    }

    public final jz3 a(ag agVar, String str) {
        return new jz3(agVar, this, this.c.a(), str);
    }

    public final void b(jz3 jz3Var) {
        synchronized (this.a) {
            this.e.add(jz3Var);
        }
    }

    public final void c() {
        synchronized (this.a) {
            this.d.b();
        }
    }

    public final void d() {
        synchronized (this.a) {
            this.d.c();
        }
    }

    public final void e() {
        synchronized (this.a) {
            this.d.d();
        }
    }

    public final void f() {
        synchronized (this.a) {
            this.d.e();
        }
    }

    public final void g(zzl zzlVar, long j) {
        synchronized (this.a) {
            this.d.f(zzlVar, j);
        }
    }

    public final void h(HashSet hashSet) {
        synchronized (this.a) {
            this.e.addAll(hashSet);
        }
    }

    public final boolean i() {
        return this.g;
    }

    public final Bundle j(Context context, zj6 zj6Var) {
        HashSet hashSet = new HashSet();
        synchronized (this.a) {
            hashSet.addAll(this.e);
            this.e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.d.a(context, this.c.b()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.f.iterator();
        if (it.hasNext()) {
            wz3 wz3Var = (wz3) it.next();
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((jz3) it2.next()).a());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        zj6Var.c(hashSet);
        return bundle;
    }

    @Override // com.daaw.m13
    public final void zza(boolean z) {
        rz3 rz3Var;
        int zzc;
        long a = zzt.zzB().a();
        if (!z) {
            this.b.zzt(a);
            this.b.zzJ(this.d.d);
            return;
        }
        if (a - this.b.zzd() > ((Long) zzba.zzc().b(g93.N0)).longValue()) {
            rz3Var = this.d;
            zzc = -1;
        } else {
            rz3Var = this.d;
            zzc = this.b.zzc();
        }
        rz3Var.d = zzc;
        this.g = true;
    }
}
