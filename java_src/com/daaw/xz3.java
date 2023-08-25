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

    /* renamed from: b */
    public final zzg f33126b;

    /* renamed from: d */
    public final rz3 f33128d;

    /* renamed from: a */
    public final Object f33125a = new Object();

    /* renamed from: e */
    public final HashSet f33129e = new HashSet();

    /* renamed from: f */
    public final HashSet f33130f = new HashSet();

    /* renamed from: g */
    public boolean f33131g = false;

    /* renamed from: c */
    public final sz3 f33127c = new sz3();

    public xz3(String str, zzg zzgVar) {
        this.f33128d = new rz3(str, zzgVar);
        this.f33126b = zzgVar;
    }

    /* renamed from: a */
    public final jz3 m4395a(InterfaceC0623ag interfaceC0623ag, String str) {
        return new jz3(interfaceC0623ag, this, this.f33127c.m9691a(), str);
    }

    /* renamed from: b */
    public final void m4394b(jz3 jz3Var) {
        synchronized (this.f33125a) {
            this.f33129e.add(jz3Var);
        }
    }

    /* renamed from: c */
    public final void m4393c() {
        synchronized (this.f33125a) {
            this.f33128d.m10820b();
        }
    }

    /* renamed from: d */
    public final void m4392d() {
        synchronized (this.f33125a) {
            this.f33128d.m10819c();
        }
    }

    /* renamed from: e */
    public final void m4391e() {
        synchronized (this.f33125a) {
            this.f33128d.m10818d();
        }
    }

    /* renamed from: f */
    public final void m4390f() {
        synchronized (this.f33125a) {
            this.f33128d.m10817e();
        }
    }

    /* renamed from: g */
    public final void m4389g(zzl zzlVar, long j) {
        synchronized (this.f33125a) {
            this.f33128d.m10816f(zzlVar, j);
        }
    }

    /* renamed from: h */
    public final void m4388h(HashSet hashSet) {
        synchronized (this.f33125a) {
            this.f33129e.addAll(hashSet);
        }
    }

    /* renamed from: i */
    public final boolean m4387i() {
        return this.f33131g;
    }

    /* renamed from: j */
    public final Bundle m4386j(Context context, zj6 zj6Var) {
        HashSet hashSet = new HashSet();
        synchronized (this.f33125a) {
            hashSet.addAll(this.f33129e);
            this.f33129e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f33128d.m10821a(context, this.f33127c.m9690b()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.f33130f.iterator();
        if (it.hasNext()) {
            wz3 wz3Var = (wz3) it.next();
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((jz3) it2.next()).m18138a());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        zj6Var.m2193c(hashSet);
        return bundle;
    }

    @Override // com.daaw.m13
    public final void zza(boolean z) {
        rz3 rz3Var;
        int zzc;
        long mo15860a = zzt.zzB().mo15860a();
        if (!z) {
            this.f33126b.zzt(mo15860a);
            this.f33126b.zzJ(this.f33128d.f25720d);
            return;
        }
        if (mo15860a - this.f33126b.zzd() > ((Long) zzba.zzc().m23658b(g93.f10492N0)).longValue()) {
            rz3Var = this.f33128d;
            zzc = -1;
        } else {
            rz3Var = this.f33128d;
            zzc = this.f33126b.zzc();
        }
        rz3Var.f25720d = zzc;
        this.f33131g = true;
    }
}
