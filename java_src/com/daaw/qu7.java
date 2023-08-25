package com.daaw;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class qu7 {

    /* renamed from: A */
    public long f24400A;

    /* renamed from: B */
    public String f24401B;

    /* renamed from: C */
    public boolean f24402C;

    /* renamed from: D */
    public long f24403D;

    /* renamed from: E */
    public long f24404E;

    /* renamed from: a */
    public final dr6 f24405a;

    /* renamed from: b */
    public final String f24406b;

    /* renamed from: c */
    public String f24407c;

    /* renamed from: d */
    public String f24408d;

    /* renamed from: e */
    public String f24409e;

    /* renamed from: f */
    public String f24410f;

    /* renamed from: g */
    public long f24411g;

    /* renamed from: h */
    public long f24412h;

    /* renamed from: i */
    public long f24413i;

    /* renamed from: j */
    public String f24414j;

    /* renamed from: k */
    public long f24415k;

    /* renamed from: l */
    public String f24416l;

    /* renamed from: m */
    public long f24417m;

    /* renamed from: n */
    public long f24418n;

    /* renamed from: o */
    public boolean f24419o;

    /* renamed from: p */
    public boolean f24420p;

    /* renamed from: q */
    public String f24421q;

    /* renamed from: r */
    public Boolean f24422r;

    /* renamed from: s */
    public long f24423s;

    /* renamed from: t */
    public List f24424t;

    /* renamed from: u */
    public String f24425u;

    /* renamed from: v */
    public long f24426v;

    /* renamed from: w */
    public long f24427w;

    /* renamed from: x */
    public long f24428x;

    /* renamed from: y */
    public long f24429y;

    /* renamed from: z */
    public long f24430z;

    public qu7(dr6 dr6Var, String str) {
        ry0.m10830j(dr6Var);
        ry0.m10834f(str);
        this.f24405a = dr6Var;
        this.f24406b = str;
        dr6Var.mo3882r().mo6991f();
    }

    /* renamed from: A */
    public final long m12202A() {
        this.f24405a.mo3882r().mo6991f();
        return 0L;
    }

    /* renamed from: B */
    public final void m12201B(long j) {
        ry0.m10839a(j >= 0);
        this.f24405a.mo3882r().mo6991f();
        this.f24402C = (this.f24411g != j) | this.f24402C;
        this.f24411g = j;
    }

    /* renamed from: C */
    public final void m12200C(long j) {
        this.f24405a.mo3882r().mo6991f();
        this.f24402C |= this.f24412h != j;
        this.f24412h = j;
    }

    /* renamed from: D */
    public final void m12199D(boolean z) {
        this.f24405a.mo3882r().mo6991f();
        this.f24402C |= this.f24419o != z;
        this.f24419o = z;
    }

    /* renamed from: E */
    public final void m12198E(Boolean bool) {
        this.f24405a.mo3882r().mo6991f();
        this.f24402C |= !x07.m5666a(this.f24422r, bool);
        this.f24422r = bool;
    }

    /* renamed from: F */
    public final void m12197F(String str) {
        this.f24405a.mo3882r().mo6991f();
        this.f24402C |= !x07.m5666a(this.f24409e, str);
        this.f24409e = str;
    }

    /* renamed from: G */
    public final void m12196G(List list) {
        this.f24405a.mo3882r().mo6991f();
        if (x07.m5666a(this.f24424t, list)) {
            return;
        }
        this.f24402C = true;
        this.f24424t = list != null ? new ArrayList(list) : null;
    }

    /* renamed from: H */
    public final void m12195H(String str) {
        this.f24405a.mo3882r().mo6991f();
        this.f24402C |= !x07.m5666a(this.f24425u, str);
        this.f24425u = str;
    }

    /* renamed from: I */
    public final boolean m12194I() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24420p;
    }

    /* renamed from: J */
    public final boolean m12193J() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24419o;
    }

    /* renamed from: K */
    public final boolean m12192K() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24402C;
    }

    /* renamed from: L */
    public final long m12191L() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24415k;
    }

    /* renamed from: M */
    public final long m12190M() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24403D;
    }

    /* renamed from: N */
    public final long m12189N() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24429y;
    }

    /* renamed from: O */
    public final long m12188O() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24430z;
    }

    /* renamed from: P */
    public final long m12187P() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24428x;
    }

    /* renamed from: Q */
    public final long m12186Q() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24427w;
    }

    /* renamed from: R */
    public final long m12185R() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24400A;
    }

    /* renamed from: S */
    public final long m12184S() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24426v;
    }

    /* renamed from: T */
    public final long m12183T() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24418n;
    }

    /* renamed from: U */
    public final long m12182U() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24423s;
    }

    /* renamed from: V */
    public final long m12181V() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24404E;
    }

    /* renamed from: W */
    public final long m12180W() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24417m;
    }

    /* renamed from: X */
    public final long m12179X() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24413i;
    }

    /* renamed from: Y */
    public final long m12178Y() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24411g;
    }

    /* renamed from: Z */
    public final long m12177Z() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24412h;
    }

    /* renamed from: a */
    public final String m12176a() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24409e;
    }

    /* renamed from: a0 */
    public final Boolean m12175a0() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24422r;
    }

    /* renamed from: b */
    public final String m12174b() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24425u;
    }

    /* renamed from: b0 */
    public final String m12173b0() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24421q;
    }

    /* renamed from: c */
    public final List m12172c() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24424t;
    }

    /* renamed from: c0 */
    public final String m12171c0() {
        this.f24405a.mo3882r().mo6991f();
        String str = this.f24401B;
        m12142y(null);
        return str;
    }

    /* renamed from: d */
    public final void m12170d() {
        this.f24405a.mo3882r().mo6991f();
        this.f24402C = false;
    }

    /* renamed from: d0 */
    public final String m12169d0() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24406b;
    }

    /* renamed from: e */
    public final void m12168e() {
        this.f24405a.mo3882r().mo6991f();
        long j = this.f24411g + 1;
        if (j > 2147483647L) {
            this.f24405a.mo3895i().m14155w().m20652b("Bundle index overflow. appId", om5.m14152z(this.f24406b));
            j = 0;
        }
        this.f24402C = true;
        this.f24411g = j;
    }

    /* renamed from: e0 */
    public final String m12167e0() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24407c;
    }

    /* renamed from: f */
    public final void m12166f(String str) {
        this.f24405a.mo3882r().mo6991f();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f24402C |= true ^ x07.m5666a(this.f24421q, str);
        this.f24421q = str;
    }

    /* renamed from: f0 */
    public final String m12165f0() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24416l;
    }

    /* renamed from: g */
    public final void m12164g(boolean z) {
        this.f24405a.mo3882r().mo6991f();
        this.f24402C |= this.f24420p != z;
        this.f24420p = z;
    }

    /* renamed from: g0 */
    public final String m12163g0() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24414j;
    }

    /* renamed from: h */
    public final void m12162h(String str) {
        this.f24405a.mo3882r().mo6991f();
        this.f24402C |= !x07.m5666a(this.f24407c, str);
        this.f24407c = str;
    }

    /* renamed from: h0 */
    public final String m12161h0() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24410f;
    }

    /* renamed from: i */
    public final void m12160i(String str) {
        this.f24405a.mo3882r().mo6991f();
        this.f24402C |= !x07.m5666a(this.f24416l, str);
        this.f24416l = str;
    }

    /* renamed from: i0 */
    public final String m12159i0() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24408d;
    }

    /* renamed from: j */
    public final void m12158j(String str) {
        this.f24405a.mo3882r().mo6991f();
        this.f24402C |= !x07.m5666a(this.f24414j, str);
        this.f24414j = str;
    }

    /* renamed from: j0 */
    public final String m12157j0() {
        this.f24405a.mo3882r().mo6991f();
        return this.f24401B;
    }

    /* renamed from: k */
    public final void m12156k(long j) {
        this.f24405a.mo3882r().mo6991f();
        this.f24402C |= this.f24415k != j;
        this.f24415k = j;
    }

    /* renamed from: l */
    public final void m12155l(long j) {
        this.f24405a.mo3882r().mo6991f();
        this.f24402C |= this.f24403D != j;
        this.f24403D = j;
    }

    /* renamed from: m */
    public final void m12154m(long j) {
        this.f24405a.mo3882r().mo6991f();
        this.f24402C |= this.f24429y != j;
        this.f24429y = j;
    }

    /* renamed from: n */
    public final void m12153n(long j) {
        this.f24405a.mo3882r().mo6991f();
        this.f24402C |= this.f24430z != j;
        this.f24430z = j;
    }

    /* renamed from: o */
    public final void m12152o(long j) {
        this.f24405a.mo3882r().mo6991f();
        this.f24402C |= this.f24428x != j;
        this.f24428x = j;
    }

    /* renamed from: p */
    public final void m12151p(long j) {
        this.f24405a.mo3882r().mo6991f();
        this.f24402C |= this.f24427w != j;
        this.f24427w = j;
    }

    /* renamed from: q */
    public final void m12150q(long j) {
        this.f24405a.mo3882r().mo6991f();
        this.f24402C |= this.f24400A != j;
        this.f24400A = j;
    }

    /* renamed from: r */
    public final void m12149r(long j) {
        this.f24405a.mo3882r().mo6991f();
        this.f24402C |= this.f24426v != j;
        this.f24426v = j;
    }

    /* renamed from: s */
    public final void m12148s(long j) {
        this.f24405a.mo3882r().mo6991f();
        this.f24402C |= this.f24418n != j;
        this.f24418n = j;
    }

    /* renamed from: t */
    public final void m12147t(long j) {
        this.f24405a.mo3882r().mo6991f();
        this.f24402C |= this.f24423s != j;
        this.f24423s = j;
    }

    /* renamed from: u */
    public final void m12146u(long j) {
        this.f24405a.mo3882r().mo6991f();
        this.f24402C |= this.f24404E != j;
        this.f24404E = j;
    }

    /* renamed from: v */
    public final void m12145v(String str) {
        this.f24405a.mo3882r().mo6991f();
        this.f24402C |= !x07.m5666a(this.f24410f, str);
        this.f24410f = str;
    }

    /* renamed from: w */
    public final void m12144w(String str) {
        this.f24405a.mo3882r().mo6991f();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f24402C |= true ^ x07.m5666a(this.f24408d, str);
        this.f24408d = str;
    }

    /* renamed from: x */
    public final void m12143x(long j) {
        this.f24405a.mo3882r().mo6991f();
        this.f24402C |= this.f24417m != j;
        this.f24417m = j;
    }

    /* renamed from: y */
    public final void m12142y(String str) {
        this.f24405a.mo3882r().mo6991f();
        this.f24402C |= !x07.m5666a(this.f24401B, str);
        this.f24401B = str;
    }

    /* renamed from: z */
    public final void m12141z(long j) {
        this.f24405a.mo3882r().mo6991f();
        this.f24402C |= this.f24413i != j;
        this.f24413i = j;
    }
}
