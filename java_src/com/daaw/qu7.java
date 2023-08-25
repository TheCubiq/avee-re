package com.daaw;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class qu7 {
    public long A;
    public String B;
    public boolean C;
    public long D;
    public long E;
    public final dr6 a;
    public final String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;
    public long i;
    public String j;
    public long k;
    public String l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;
    public String q;
    public Boolean r;
    public long s;
    public List t;
    public String u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public qu7(dr6 dr6Var, String str) {
        ry0.j(dr6Var);
        ry0.f(str);
        this.a = dr6Var;
        this.b = str;
        dr6Var.r().f();
    }

    public final long A() {
        this.a.r().f();
        return 0L;
    }

    public final void B(long j) {
        ry0.a(j >= 0);
        this.a.r().f();
        this.C = (this.g != j) | this.C;
        this.g = j;
    }

    public final void C(long j) {
        this.a.r().f();
        this.C |= this.h != j;
        this.h = j;
    }

    public final void D(boolean z) {
        this.a.r().f();
        this.C |= this.o != z;
        this.o = z;
    }

    public final void E(Boolean bool) {
        this.a.r().f();
        this.C |= !x07.a(this.r, bool);
        this.r = bool;
    }

    public final void F(String str) {
        this.a.r().f();
        this.C |= !x07.a(this.e, str);
        this.e = str;
    }

    public final void G(List list) {
        this.a.r().f();
        if (x07.a(this.t, list)) {
            return;
        }
        this.C = true;
        this.t = list != null ? new ArrayList(list) : null;
    }

    public final void H(String str) {
        this.a.r().f();
        this.C |= !x07.a(this.u, str);
        this.u = str;
    }

    public final boolean I() {
        this.a.r().f();
        return this.p;
    }

    public final boolean J() {
        this.a.r().f();
        return this.o;
    }

    public final boolean K() {
        this.a.r().f();
        return this.C;
    }

    public final long L() {
        this.a.r().f();
        return this.k;
    }

    public final long M() {
        this.a.r().f();
        return this.D;
    }

    public final long N() {
        this.a.r().f();
        return this.y;
    }

    public final long O() {
        this.a.r().f();
        return this.z;
    }

    public final long P() {
        this.a.r().f();
        return this.x;
    }

    public final long Q() {
        this.a.r().f();
        return this.w;
    }

    public final long R() {
        this.a.r().f();
        return this.A;
    }

    public final long S() {
        this.a.r().f();
        return this.v;
    }

    public final long T() {
        this.a.r().f();
        return this.n;
    }

    public final long U() {
        this.a.r().f();
        return this.s;
    }

    public final long V() {
        this.a.r().f();
        return this.E;
    }

    public final long W() {
        this.a.r().f();
        return this.m;
    }

    public final long X() {
        this.a.r().f();
        return this.i;
    }

    public final long Y() {
        this.a.r().f();
        return this.g;
    }

    public final long Z() {
        this.a.r().f();
        return this.h;
    }

    public final String a() {
        this.a.r().f();
        return this.e;
    }

    public final Boolean a0() {
        this.a.r().f();
        return this.r;
    }

    public final String b() {
        this.a.r().f();
        return this.u;
    }

    public final String b0() {
        this.a.r().f();
        return this.q;
    }

    public final List c() {
        this.a.r().f();
        return this.t;
    }

    public final String c0() {
        this.a.r().f();
        String str = this.B;
        y(null);
        return str;
    }

    public final void d() {
        this.a.r().f();
        this.C = false;
    }

    public final String d0() {
        this.a.r().f();
        return this.b;
    }

    public final void e() {
        this.a.r().f();
        long j = this.g + 1;
        if (j > 2147483647L) {
            this.a.i().w().b("Bundle index overflow. appId", om5.z(this.b));
            j = 0;
        }
        this.C = true;
        this.g = j;
    }

    public final String e0() {
        this.a.r().f();
        return this.c;
    }

    public final void f(String str) {
        this.a.r().f();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.C |= true ^ x07.a(this.q, str);
        this.q = str;
    }

    public final String f0() {
        this.a.r().f();
        return this.l;
    }

    public final void g(boolean z) {
        this.a.r().f();
        this.C |= this.p != z;
        this.p = z;
    }

    public final String g0() {
        this.a.r().f();
        return this.j;
    }

    public final void h(String str) {
        this.a.r().f();
        this.C |= !x07.a(this.c, str);
        this.c = str;
    }

    public final String h0() {
        this.a.r().f();
        return this.f;
    }

    public final void i(String str) {
        this.a.r().f();
        this.C |= !x07.a(this.l, str);
        this.l = str;
    }

    public final String i0() {
        this.a.r().f();
        return this.d;
    }

    public final void j(String str) {
        this.a.r().f();
        this.C |= !x07.a(this.j, str);
        this.j = str;
    }

    public final String j0() {
        this.a.r().f();
        return this.B;
    }

    public final void k(long j) {
        this.a.r().f();
        this.C |= this.k != j;
        this.k = j;
    }

    public final void l(long j) {
        this.a.r().f();
        this.C |= this.D != j;
        this.D = j;
    }

    public final void m(long j) {
        this.a.r().f();
        this.C |= this.y != j;
        this.y = j;
    }

    public final void n(long j) {
        this.a.r().f();
        this.C |= this.z != j;
        this.z = j;
    }

    public final void o(long j) {
        this.a.r().f();
        this.C |= this.x != j;
        this.x = j;
    }

    public final void p(long j) {
        this.a.r().f();
        this.C |= this.w != j;
        this.w = j;
    }

    public final void q(long j) {
        this.a.r().f();
        this.C |= this.A != j;
        this.A = j;
    }

    public final void r(long j) {
        this.a.r().f();
        this.C |= this.v != j;
        this.v = j;
    }

    public final void s(long j) {
        this.a.r().f();
        this.C |= this.n != j;
        this.n = j;
    }

    public final void t(long j) {
        this.a.r().f();
        this.C |= this.s != j;
        this.s = j;
    }

    public final void u(long j) {
        this.a.r().f();
        this.C |= this.E != j;
        this.E = j;
    }

    public final void v(String str) {
        this.a.r().f();
        this.C |= !x07.a(this.f, str);
        this.f = str;
    }

    public final void w(String str) {
        this.a.r().f();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.C |= true ^ x07.a(this.d, str);
        this.d = str;
    }

    public final void x(long j) {
        this.a.r().f();
        this.C |= this.m != j;
        this.m = j;
    }

    public final void y(String str) {
        this.a.r().f();
        this.C |= !x07.a(this.B, str);
        this.B = str;
    }

    public final void z(long j) {
        this.a.r().f();
        this.C |= this.i != j;
        this.i = j;
    }
}
