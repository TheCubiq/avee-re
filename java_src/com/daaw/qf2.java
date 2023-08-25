package com.daaw;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class qf2 implements Comparable {
    public final af2 A;
    public final bg2 p;
    public final int q;
    public final String r;
    public final int s;
    public final Object t;
    public final uf2 u;
    public Integer v;
    public tf2 w;
    public boolean x;
    public ve2 y;
    public pf2 z;

    public qf2(int i, String str, uf2 uf2Var) {
        Uri parse;
        String host;
        this.p = bg2.c ? new bg2() : null;
        this.t = new Object();
        int i2 = 0;
        this.x = false;
        this.y = null;
        this.q = i;
        this.r = str;
        this.u = uf2Var;
        this.A = new af2();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i2 = host.hashCode();
        }
        this.s = i2;
    }

    public abstract wf2 a(mf2 mf2Var);

    public abstract void c(Object obj);

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.v.intValue() - ((qf2) obj).v.intValue();
    }

    public final void d(String str) {
        tf2 tf2Var = this.w;
        if (tf2Var != null) {
            tf2Var.b(this);
        }
        if (bg2.c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new of2(this, str, id));
                return;
            }
            this.p.a(str, id);
            this.p.b(toString());
        }
    }

    public final void e() {
        pf2 pf2Var;
        synchronized (this.t) {
            pf2Var = this.z;
        }
        if (pf2Var != null) {
            pf2Var.zza(this);
        }
    }

    public final void f(wf2 wf2Var) {
        pf2 pf2Var;
        synchronized (this.t) {
            pf2Var = this.z;
        }
        if (pf2Var != null) {
            pf2Var.a(this, wf2Var);
        }
    }

    public final void g(int i) {
        tf2 tf2Var = this.w;
        if (tf2Var != null) {
            tf2Var.c(this, i);
        }
    }

    public final void h(pf2 pf2Var) {
        synchronized (this.t) {
            this.z = pf2Var;
        }
    }

    public final String toString() {
        String hexString = Integer.toHexString(this.s);
        zzw();
        String str = this.r;
        Integer num = this.v;
        return "[ ] " + str + " " + "0x".concat(String.valueOf(hexString)) + " NORMAL " + num;
    }

    public final int zza() {
        return this.q;
    }

    public final int zzb() {
        return this.A.b();
    }

    public final int zzc() {
        return this.s;
    }

    public final ve2 zzd() {
        return this.y;
    }

    public final qf2 zze(ve2 ve2Var) {
        this.y = ve2Var;
        return this;
    }

    public final qf2 zzf(tf2 tf2Var) {
        this.w = tf2Var;
        return this;
    }

    public final qf2 zzg(int i) {
        this.v = Integer.valueOf(i);
        return this;
    }

    public final String zzj() {
        String str = this.r;
        if (this.q != 0) {
            String num = Integer.toString(1);
            return num + "-" + str;
        }
        return str;
    }

    public final String zzk() {
        return this.r;
    }

    public Map zzl() {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (bg2.c) {
            this.p.a(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zf2 zf2Var) {
        uf2 uf2Var;
        synchronized (this.t) {
            uf2Var = this.u;
        }
        if (uf2Var != null) {
            uf2Var.a(zf2Var);
        }
    }

    public final void zzq() {
        synchronized (this.t) {
            this.x = true;
        }
    }

    public final boolean zzv() {
        boolean z;
        synchronized (this.t) {
            z = this.x;
        }
        return z;
    }

    public final boolean zzw() {
        synchronized (this.t) {
        }
        return false;
    }

    public byte[] zzx() {
        return null;
    }

    public final af2 zzy() {
        return this.A;
    }
}
