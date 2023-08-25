package com.daaw;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class jz3 {

    /* renamed from: a */
    public final InterfaceC0623ag f15537a;

    /* renamed from: b */
    public final xz3 f15538b;

    /* renamed from: e */
    public final String f15541e;

    /* renamed from: f */
    public final String f15542f;

    /* renamed from: d */
    public final Object f15540d = new Object();
    @GuardedBy("lock")

    /* renamed from: g */
    public long f15543g = -1;
    @GuardedBy("lock")

    /* renamed from: h */
    public long f15544h = -1;
    @GuardedBy("lock")

    /* renamed from: i */
    public long f15545i = 0;
    @GuardedBy("lock")

    /* renamed from: j */
    public long f15546j = -1;
    @GuardedBy("lock")

    /* renamed from: k */
    public long f15547k = -1;
    @GuardedBy("lock")

    /* renamed from: c */
    public final LinkedList f15539c = new LinkedList();

    public jz3(InterfaceC0623ag interfaceC0623ag, xz3 xz3Var, String str, String str2) {
        this.f15537a = interfaceC0623ag;
        this.f15538b = xz3Var;
        this.f15541e = str;
        this.f15542f = str2;
    }

    /* renamed from: a */
    public final Bundle m18138a() {
        Bundle bundle;
        synchronized (this.f15540d) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f15541e);
            bundle.putString("slotid", this.f15542f);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.f15546j);
            bundle.putLong("tresponse", this.f15547k);
            bundle.putLong("timp", this.f15543g);
            bundle.putLong("tload", this.f15544h);
            bundle.putLong("pcc", this.f15545i);
            bundle.putLong("tfetch", -1L);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator it = this.f15539c.iterator();
            while (it.hasNext()) {
                arrayList.add(((iz3) it.next()).m19222b());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    /* renamed from: c */
    public final String m18136c() {
        return this.f15541e;
    }

    /* renamed from: d */
    public final void m18135d() {
        synchronized (this.f15540d) {
            if (this.f15547k != -1) {
                iz3 iz3Var = new iz3(this);
                iz3Var.m19220d();
                this.f15539c.add(iz3Var);
                this.f15545i++;
                this.f15538b.m4393c();
                this.f15538b.m4394b(this);
            }
        }
    }

    /* renamed from: e */
    public final void m18134e() {
        synchronized (this.f15540d) {
            if (this.f15547k != -1 && !this.f15539c.isEmpty()) {
                iz3 iz3Var = (iz3) this.f15539c.getLast();
                if (iz3Var.m19223a() == -1) {
                    iz3Var.m19221c();
                    this.f15538b.m4394b(this);
                }
            }
        }
    }

    /* renamed from: f */
    public final void m18133f() {
        synchronized (this.f15540d) {
            if (this.f15547k != -1 && this.f15543g == -1) {
                this.f15543g = this.f15537a.mo15859b();
                this.f15538b.m4394b(this);
            }
            this.f15538b.m4392d();
        }
    }

    /* renamed from: g */
    public final void m18132g() {
        synchronized (this.f15540d) {
            this.f15538b.m4391e();
        }
    }

    /* renamed from: h */
    public final void m18131h(boolean z) {
        synchronized (this.f15540d) {
            if (this.f15547k != -1) {
                this.f15544h = this.f15537a.mo15859b();
            }
        }
    }

    /* renamed from: i */
    public final void m18130i() {
        synchronized (this.f15540d) {
            this.f15538b.m4390f();
        }
    }

    /* renamed from: j */
    public final void m18129j(zzl zzlVar) {
        synchronized (this.f15540d) {
            long mo15859b = this.f15537a.mo15859b();
            this.f15546j = mo15859b;
            this.f15538b.m4389g(zzlVar, mo15859b);
        }
    }

    /* renamed from: k */
    public final void m18128k(long j) {
        synchronized (this.f15540d) {
            this.f15547k = j;
            if (j != -1) {
                this.f15538b.m4394b(this);
            }
        }
    }
}
