package com.daaw;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class qf2 implements Comparable {

    /* renamed from: A */
    public final af2 f23901A;

    /* renamed from: p */
    public final bg2 f23902p;

    /* renamed from: q */
    public final int f23903q;

    /* renamed from: r */
    public final String f23904r;

    /* renamed from: s */
    public final int f23905s;

    /* renamed from: t */
    public final Object f23906t;

    /* renamed from: u */
    public final uf2 f23907u;

    /* renamed from: v */
    public Integer f23908v;

    /* renamed from: w */
    public tf2 f23909w;

    /* renamed from: x */
    public boolean f23910x;

    /* renamed from: y */
    public ve2 f23911y;

    /* renamed from: z */
    public pf2 f23912z;

    public qf2(int i, String str, uf2 uf2Var) {
        Uri parse;
        String host;
        this.f23902p = bg2.f4782c ? new bg2() : null;
        this.f23906t = new Object();
        int i2 = 0;
        this.f23910x = false;
        this.f23911y = null;
        this.f23903q = i;
        this.f23904r = str;
        this.f23907u = uf2Var;
        this.f23901A = new af2();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i2 = host.hashCode();
        }
        this.f23905s = i2;
    }

    /* renamed from: a */
    public abstract wf2 mo1348a(mf2 mf2Var);

    /* renamed from: c */
    public abstract void mo1347c(Object obj);

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f23908v.intValue() - ((qf2) obj).f23908v.intValue();
    }

    /* renamed from: d */
    public final void m12568d(String str) {
        tf2 tf2Var = this.f23909w;
        if (tf2Var != null) {
            tf2Var.m9198b(this);
        }
        if (bg2.f4782c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new of2(this, str, id));
                return;
            }
            this.f23902p.m26174a(str, id);
            this.f23902p.m26173b(toString());
        }
    }

    /* renamed from: e */
    public final void m12567e() {
        pf2 pf2Var;
        synchronized (this.f23906t) {
            pf2Var = this.f23912z;
        }
        if (pf2Var != null) {
            pf2Var.zza(this);
        }
    }

    /* renamed from: f */
    public final void m12566f(wf2 wf2Var) {
        pf2 pf2Var;
        synchronized (this.f23906t) {
            pf2Var = this.f23912z;
        }
        if (pf2Var != null) {
            pf2Var.mo13408a(this, wf2Var);
        }
    }

    /* renamed from: g */
    public final void m12565g(int i) {
        tf2 tf2Var = this.f23909w;
        if (tf2Var != null) {
            tf2Var.m9197c(this, i);
        }
    }

    /* renamed from: h */
    public final void m12564h(pf2 pf2Var) {
        synchronized (this.f23906t) {
            this.f23912z = pf2Var;
        }
    }

    public final String toString() {
        String hexString = Integer.toHexString(this.f23905s);
        zzw();
        String str = this.f23904r;
        Integer num = this.f23908v;
        return "[ ] " + str + " " + "0x".concat(String.valueOf(hexString)) + " NORMAL " + num;
    }

    public final int zza() {
        return this.f23903q;
    }

    public final int zzb() {
        return this.f23901A.m27494b();
    }

    public final int zzc() {
        return this.f23905s;
    }

    public final ve2 zzd() {
        return this.f23911y;
    }

    public final qf2 zze(ve2 ve2Var) {
        this.f23911y = ve2Var;
        return this;
    }

    public final qf2 zzf(tf2 tf2Var) {
        this.f23909w = tf2Var;
        return this;
    }

    public final qf2 zzg(int i) {
        this.f23908v = Integer.valueOf(i);
        return this;
    }

    public final String zzj() {
        String str = this.f23904r;
        if (this.f23903q != 0) {
            String num = Integer.toString(1);
            return num + "-" + str;
        }
        return str;
    }

    public final String zzk() {
        return this.f23904r;
    }

    public Map zzl() {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (bg2.f4782c) {
            this.f23902p.m26174a(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zf2 zf2Var) {
        uf2 uf2Var;
        synchronized (this.f23906t) {
            uf2Var = this.f23907u;
        }
        if (uf2Var != null) {
            uf2Var.mo8276a(zf2Var);
        }
    }

    public final void zzq() {
        synchronized (this.f23906t) {
            this.f23910x = true;
        }
    }

    public final boolean zzv() {
        boolean z;
        synchronized (this.f23906t) {
            z = this.f23910x;
        }
        return z;
    }

    public final boolean zzw() {
        synchronized (this.f23906t) {
        }
        return false;
    }

    public byte[] zzx() {
        return null;
    }

    public final af2 zzy() {
        return this.f23901A;
    }
}
