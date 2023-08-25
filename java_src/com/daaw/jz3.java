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
    public final ag a;
    public final xz3 b;
    public final String e;
    public final String f;
    public final Object d = new Object();
    @GuardedBy("lock")
    public long g = -1;
    @GuardedBy("lock")
    public long h = -1;
    @GuardedBy("lock")
    public long i = 0;
    @GuardedBy("lock")
    public long j = -1;
    @GuardedBy("lock")
    public long k = -1;
    @GuardedBy("lock")
    public final LinkedList c = new LinkedList();

    public jz3(ag agVar, xz3 xz3Var, String str, String str2) {
        this.a = agVar;
        this.b = xz3Var;
        this.e = str;
        this.f = str2;
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.d) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.e);
            bundle.putString("slotid", this.f);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.j);
            bundle.putLong("tresponse", this.k);
            bundle.putLong("timp", this.g);
            bundle.putLong("tload", this.h);
            bundle.putLong("pcc", this.i);
            bundle.putLong("tfetch", -1L);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                arrayList.add(((iz3) it.next()).b());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final String c() {
        return this.e;
    }

    public final void d() {
        synchronized (this.d) {
            if (this.k != -1) {
                iz3 iz3Var = new iz3(this);
                iz3Var.d();
                this.c.add(iz3Var);
                this.i++;
                this.b.c();
                this.b.b(this);
            }
        }
    }

    public final void e() {
        synchronized (this.d) {
            if (this.k != -1 && !this.c.isEmpty()) {
                iz3 iz3Var = (iz3) this.c.getLast();
                if (iz3Var.a() == -1) {
                    iz3Var.c();
                    this.b.b(this);
                }
            }
        }
    }

    public final void f() {
        synchronized (this.d) {
            if (this.k != -1 && this.g == -1) {
                this.g = this.a.b();
                this.b.b(this);
            }
            this.b.d();
        }
    }

    public final void g() {
        synchronized (this.d) {
            this.b.e();
        }
    }

    public final void h(boolean z) {
        synchronized (this.d) {
            if (this.k != -1) {
                this.h = this.a.b();
            }
        }
    }

    public final void i() {
        synchronized (this.d) {
            this.b.f();
        }
    }

    public final void j(zzl zzlVar) {
        synchronized (this.d) {
            long b = this.a.b();
            this.j = b;
            this.b.g(zzlVar, b);
        }
    }

    public final void k(long j) {
        synchronized (this.d) {
            this.k = j;
            if (j != -1) {
                this.b.b(this);
            }
        }
    }
}
