package com.daaw;

import android.os.SystemClock;
import com.daaw.InterfaceC2200mp;
import com.daaw.InterfaceC3356vo;
import com.daaw.ex0;
import com.daaw.tb0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.trackselection.InterfaceC3970c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.daaw.qq */
/* loaded from: classes.dex */
public class C2746qq implements InterfaceC3356vo {

    /* renamed from: a */
    public final lk0 f24238a;

    /* renamed from: b */
    public final int[] f24239b;

    /* renamed from: c */
    public final InterfaceC3970c f24240c;

    /* renamed from: d */
    public final int f24241d;

    /* renamed from: e */
    public final InterfaceC2200mp f24242e;

    /* renamed from: f */
    public final long f24243f;

    /* renamed from: g */
    public final int f24244g;

    /* renamed from: h */
    public final ex0.C1232c f24245h;

    /* renamed from: i */
    public final C2748b[] f24246i;

    /* renamed from: j */
    public C3456wo f24247j;

    /* renamed from: k */
    public int f24248k;

    /* renamed from: l */
    public IOException f24249l;

    /* renamed from: m */
    public boolean f24250m;

    /* renamed from: n */
    public long f24251n;

    /* renamed from: com.daaw.qq$a */
    /* loaded from: classes.dex */
    public static final class C2747a implements InterfaceC3356vo.InterfaceC3357a {

        /* renamed from: a */
        public final InterfaceC2200mp.InterfaceC2201a f24252a;

        /* renamed from: b */
        public final int f24253b;

        public C2747a(InterfaceC2200mp.InterfaceC2201a interfaceC2201a) {
            this(interfaceC2201a, 1);
        }

        public C2747a(InterfaceC2200mp.InterfaceC2201a interfaceC2201a, int i) {
            this.f24252a = interfaceC2201a;
            this.f24253b = i;
        }

        @Override // com.daaw.InterfaceC3356vo.InterfaceC3357a
        /* renamed from: a */
        public InterfaceC3356vo mo6975a(lk0 lk0Var, C3456wo c3456wo, int i, int[] iArr, InterfaceC3970c interfaceC3970c, int i2, long j, boolean z, boolean z2, ex0.C1232c c1232c) {
            return new C2746qq(lk0Var, c3456wo, i, iArr, interfaceC3970c, i2, this.f24252a.mo9376a(), j, this.f24253b, z, z2, c1232c);
        }
    }

    /* renamed from: com.daaw.qq$b */
    /* loaded from: classes.dex */
    public static final class C2748b {

        /* renamed from: a */
        public final C1275ff f24254a;

        /* renamed from: b */
        public j41 f24255b;

        /* renamed from: c */
        public InterfaceC0879bp f24256c;

        /* renamed from: d */
        public long f24257d;

        /* renamed from: e */
        public long f24258e;

        public C2748b(long j, int i, j41 j41Var, boolean z, boolean z2, sm1 sm1Var) {
            InterfaceC3919zz d40Var;
            this.f24257d = j;
            this.f24255b = j41Var;
            String str = j41Var.f14244c.f35720t;
            if (m12288g(str)) {
                this.f24254a = null;
            } else {
                if ("application/x-rawcc".equals(str)) {
                    d40Var = new h31(j41Var.f14244c);
                } else if (m12287h(str)) {
                    d40Var = new un0(1);
                } else {
                    d40Var = new d40(z ? 4 : 0, null, null, null, z2 ? Collections.singletonList(Format.m1744B(null, "application/cea-608", 0, null)) : Collections.emptyList(), sm1Var);
                }
                this.f24254a = new C1275ff(d40Var, i, j41Var.f14244c);
            }
            this.f24256c = j41Var.mo19086i();
        }

        /* renamed from: g */
        public static boolean m12288g(String str) {
            return hq0.m20493l(str) || "application/ttml+xml".equals(str);
        }

        /* renamed from: h */
        public static boolean m12287h(String str) {
            return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm");
        }

        /* renamed from: a */
        public long m12294a() {
            return this.f24256c.mo12606g() + this.f24258e;
        }

        /* renamed from: b */
        public int m12293b() {
            return this.f24256c.mo12605h(this.f24257d);
        }

        /* renamed from: c */
        public long m12292c(long j) {
            return m12290e(j) + this.f24256c.mo12610c(j - this.f24258e, this.f24257d);
        }

        /* renamed from: d */
        public long m12291d(long j) {
            return this.f24256c.mo12608e(j, this.f24257d) + this.f24258e;
        }

        /* renamed from: e */
        public long m12290e(long j) {
            return this.f24256c.mo12611b(j - this.f24258e);
        }

        /* renamed from: f */
        public d31 m12289f(long j) {
            return this.f24256c.mo12609d(j - this.f24258e);
        }

        /* renamed from: i */
        public void m12286i(long j, j41 j41Var) {
            int mo12605h;
            InterfaceC0879bp mo19086i = this.f24255b.mo19086i();
            InterfaceC0879bp mo19086i2 = j41Var.mo19086i();
            this.f24257d = j;
            this.f24255b = j41Var;
            if (mo19086i == null) {
                return;
            }
            this.f24256c = mo19086i2;
            if (mo19086i.mo12607f() && (mo12605h = mo19086i.mo12605h(this.f24257d)) != 0) {
                long mo12606g = (mo19086i.mo12606g() + mo12605h) - 1;
                long mo12611b = mo19086i.mo12611b(mo12606g) + mo19086i.mo12610c(mo12606g, this.f24257d);
                long mo12606g2 = mo19086i2.mo12606g();
                long mo12611b2 = mo19086i2.mo12611b(mo12606g2);
                if (mo12611b == mo12611b2) {
                    this.f24258e += (mo12606g + 1) - mo12606g2;
                } else if (mo12611b < mo12611b2) {
                    throw new C2428ob();
                } else {
                    this.f24258e += mo19086i.mo12608e(mo12611b2, this.f24257d) - mo12606g2;
                }
            }
        }
    }

    public C2746qq(lk0 lk0Var, C3456wo c3456wo, int i, int[] iArr, InterfaceC3970c interfaceC3970c, int i2, InterfaceC2200mp interfaceC2200mp, long j, int i3, boolean z, boolean z2, ex0.C1232c c1232c) {
        this.f24238a = lk0Var;
        this.f24247j = c3456wo;
        this.f24239b = iArr;
        this.f24240c = interfaceC3970c;
        this.f24241d = i2;
        this.f24242e = interfaceC2200mp;
        this.f24248k = i;
        this.f24243f = j;
        this.f24244g = i3;
        this.f24245h = c1232c;
        long m5921g = c3456wo.m5921g(i);
        this.f24251n = -9223372036854775807L;
        ArrayList<j41> m12299j = m12299j();
        this.f24246i = new C2748b[interfaceC3970c.length()];
        for (int i4 = 0; i4 < this.f24246i.length; i4++) {
            this.f24246i[i4] = new C2748b(m5921g, i2, m12299j.get(interfaceC3970c.mo1529f(i4)), z, z2, c1232c);
        }
    }

    /* renamed from: k */
    public static AbstractC1180ef m12298k(C2748b c2748b, InterfaceC2200mp interfaceC2200mp, Format format, int i, Object obj, d31 d31Var, d31 d31Var2) {
        String str = c2748b.f24255b.f14245d;
        if (d31Var == null || (d31Var2 = d31Var.m24731a(d31Var2, str)) != null) {
            d31Var = d31Var2;
        }
        return new uf0(interfaceC2200mp, new C2570pp(d31Var.m24730b(str), d31Var.f6440a, d31Var.f6441b, c2748b.f24255b.mo19087a()), format, i, obj, c2748b.f24254a);
    }

    /* renamed from: l */
    public static AbstractC1180ef m12297l(C2748b c2748b, InterfaceC2200mp interfaceC2200mp, int i, Format format, int i2, Object obj, long j, int i3, long j2) {
        j41 j41Var = c2748b.f24255b;
        long m12290e = c2748b.m12290e(j);
        d31 m12289f = c2748b.m12289f(j);
        String str = j41Var.f14245d;
        if (c2748b.f24254a == null) {
            return new pd1(interfaceC2200mp, new C2570pp(m12289f.m24730b(str), m12289f.f6440a, m12289f.f6441b, j41Var.mo19087a()), format, i2, obj, m12290e, c2748b.m12292c(j), j, i, format);
        }
        int i4 = 1;
        int i5 = 1;
        while (i4 < i3) {
            d31 m24731a = m12289f.m24731a(c2748b.m12289f(i4 + j), str);
            if (m24731a == null) {
                break;
            }
            i5++;
            i4++;
            m12289f = m24731a;
        }
        return new C1292fk(interfaceC2200mp, new C2570pp(m12289f.m24730b(str), m12289f.f6440a, m12289f.f6441b, j41Var.mo19087a()), format, i2, obj, m12290e, c2748b.m12292c((i5 + j) - 1), j2, j, i5, -j41Var.f14246e, c2748b.f24254a);
    }

    @Override // com.daaw.InterfaceC1826jf
    /* renamed from: a */
    public void mo3398a() {
        IOException iOException = this.f24249l;
        if (iOException != null) {
            throw iOException;
        }
        this.f24238a.mo16893a();
    }

    @Override // com.daaw.InterfaceC3356vo
    /* renamed from: c */
    public void mo6976c(C3456wo c3456wo, int i) {
        try {
            this.f24247j = c3456wo;
            this.f24248k = i;
            long m5921g = c3456wo.m5921g(i);
            ArrayList<j41> m12299j = m12299j();
            for (int i2 = 0; i2 < this.f24246i.length; i2++) {
                this.f24246i[i2].m12286i(m5921g, m12299j.get(this.f24240c.mo1529f(i2)));
            }
        } catch (C2428ob e) {
            this.f24249l = e;
        }
    }

    /* renamed from: d */
    public final long m12300d() {
        return (this.f24243f != 0 ? SystemClock.elapsedRealtime() + this.f24243f : System.currentTimeMillis()) * 1000;
    }

    @Override // com.daaw.InterfaceC1826jf
    /* renamed from: e */
    public long mo3395e(long j, ea1 ea1Var) {
        C2748b[] c2748bArr;
        for (C2748b c2748b : this.f24246i) {
            if (c2748b.f24256c != null) {
                long m12291d = c2748b.m12291d(j);
                long m12290e = c2748b.m12290e(m12291d);
                return sq1.m10026S(j, ea1Var, m12290e, (m12290e >= j || m12291d >= ((long) (c2748b.m12293b() + (-1)))) ? m12290e : c2748b.m12290e(m12291d + 1));
            }
        }
        return j;
    }

    @Override // com.daaw.InterfaceC1826jf
    /* renamed from: f */
    public void mo3394f(AbstractC1180ef abstractC1180ef) {
        da1 m22698c;
        if (abstractC1180ef instanceof uf0) {
            C2748b c2748b = this.f24246i[this.f24240c.mo1526i(((uf0) abstractC1180ef).f8430c)];
            if (c2748b.f24256c == null && (m22698c = c2748b.f24254a.m22698c()) != null) {
                c2748b.f24256c = new C0974cp((C1533hf) m22698c, c2748b.f24255b.f14246e);
            }
        }
        ex0.C1232c c1232c = this.f24245h;
        if (c1232c != null) {
            c1232c.m23061h(abstractC1180ef);
        }
    }

    @Override // com.daaw.InterfaceC1826jf
    /* renamed from: g */
    public boolean mo3393g(AbstractC1180ef abstractC1180ef, boolean z, Exception exc) {
        C2748b c2748b;
        int m12293b;
        if (z) {
            ex0.C1232c c1232c = this.f24245h;
            if (c1232c == null || !c1232c.m23062g(abstractC1180ef)) {
                if (!this.f24247j.f31404d && (abstractC1180ef instanceof zn0) && (exc instanceof tb0.C3040e) && ((tb0.C3040e) exc).f27195r == 404 && (m12293b = (c2748b = this.f24246i[this.f24240c.mo1526i(abstractC1180ef.f8430c)]).m12293b()) != -1 && m12293b != 0) {
                    if (((zn0) abstractC1180ef).mo2104e() > (c2748b.m12294a() + m12293b) - 1) {
                        this.f24250m = true;
                        return true;
                    }
                }
                InterfaceC3970c interfaceC3970c = this.f24240c;
                return C1943kf.m17771a(interfaceC3970c, interfaceC3970c.mo1526i(abstractC1180ef.f8430c), exc);
            }
            return true;
        }
        return false;
    }

    @Override // com.daaw.InterfaceC1826jf
    /* renamed from: h */
    public int mo3392h(long j, List<? extends zn0> list) {
        return (this.f24249l != null || this.f24240c.length() < 2) ? list.size() : this.f24240c.mo1527h(j, list);
    }

    @Override // com.daaw.InterfaceC1826jf
    /* renamed from: i */
    public void mo3391i(zn0 zn0Var, long j, long j2, C1397gf c1397gf) {
        long j3;
        long mo2104e;
        boolean z;
        if (this.f24249l != null) {
            return;
        }
        long j4 = j2 - j;
        long m12296m = m12296m(j);
        long m24527a = C1075dd.m24527a(this.f24247j.f31401a) + C1075dd.m24527a(this.f24247j.m5924d(this.f24248k).f11773b) + j2;
        ex0.C1232c c1232c = this.f24245h;
        if (c1232c == null || !c1232c.m23063f(m24527a)) {
            this.f24240c.mo1521n(j, j4, m12296m);
            C2748b c2748b = this.f24246i[this.f24240c.mo1533b()];
            C1275ff c1275ff = c2748b.f24254a;
            if (c1275ff != null) {
                j41 j41Var = c2748b.f24255b;
                d31 m19090k = c1275ff.m22699b() == null ? j41Var.m19090k() : null;
                d31 mo19085j = c2748b.f24256c == null ? j41Var.mo19085j() : null;
                if (m19090k != null || mo19085j != null) {
                    c1397gf.f11131a = m12298k(c2748b, this.f24242e, this.f24240c.mo1524k(), this.f24240c.mo1523l(), this.f24240c.mo1520o(), m19090k, mo19085j);
                    return;
                }
            }
            int m12293b = c2748b.m12293b();
            if (m12293b == 0) {
                C3456wo c3456wo = this.f24247j;
                c1397gf.f11132b = !c3456wo.f31404d || this.f24248k < c3456wo.m5923e() - 1;
                return;
            }
            long m12294a = c2748b.m12294a();
            if (m12293b == -1) {
                long m12300d = (m12300d() - C1075dd.m24527a(this.f24247j.f31401a)) - C1075dd.m24527a(this.f24247j.m5924d(this.f24248k).f11773b);
                long j5 = this.f24247j.f31406f;
                if (j5 != -9223372036854775807L) {
                    m12294a = Math.max(m12294a, c2748b.m12291d(m12300d - C1075dd.m24527a(j5)));
                }
                j3 = c2748b.m12291d(m12300d);
            } else {
                j3 = m12293b + m12294a;
            }
            long j6 = j3 - 1;
            long j7 = m12294a;
            m12295n(c2748b, j6);
            if (zn0Var == null) {
                mo2104e = sq1.m10003m(c2748b.m12291d(j2), j7, j6);
            } else {
                mo2104e = zn0Var.mo2104e();
                if (mo2104e < j7) {
                    this.f24249l = new C2428ob();
                    return;
                }
            }
            long j8 = mo2104e;
            if (j8 <= j6 && (!this.f24250m || j8 < j6)) {
                c1397gf.f11131a = m12297l(c2748b, this.f24242e, this.f24241d, this.f24240c.mo1524k(), this.f24240c.mo1523l(), this.f24240c.mo1520o(), j8, (int) Math.min(this.f24244g, (j6 - j8) + 1), zn0Var == null ? j2 : -9223372036854775807L);
                return;
            }
            C3456wo c3456wo2 = this.f24247j;
            if (c3456wo2.f31404d && this.f24248k >= c3456wo2.m5923e() - 1) {
                z = false;
                c1397gf.f11132b = z;
            }
            z = true;
            c1397gf.f11132b = z;
        }
    }

    /* renamed from: j */
    public final ArrayList<j41> m12299j() {
        List<C1154e1> list = this.f24247j.m5924d(this.f24248k).f11774c;
        ArrayList<j41> arrayList = new ArrayList<>();
        for (int i : this.f24239b) {
            arrayList.addAll(list.get(i).f8023c);
        }
        return arrayList;
    }

    /* renamed from: m */
    public final long m12296m(long j) {
        if (this.f24247j.f31404d && this.f24251n != -9223372036854775807L) {
            return this.f24251n - j;
        }
        return -9223372036854775807L;
    }

    /* renamed from: n */
    public final void m12295n(C2748b c2748b, long j) {
        this.f24251n = this.f24247j.f31404d ? c2748b.m12292c(j) : -9223372036854775807L;
    }
}
