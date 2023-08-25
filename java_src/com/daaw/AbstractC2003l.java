package com.daaw;

import java.util.Map;
import java.util.TreeMap;
/* renamed from: com.daaw.l */
/* loaded from: classes2.dex */
public abstract class AbstractC2003l implements hd0 {

    /* renamed from: a */
    public boolean f16909a;

    /* renamed from: b */
    public boolean f16910b;

    /* renamed from: c */
    public boolean f16911c;

    /* renamed from: d */
    public boolean f16912d;

    /* renamed from: e */
    public boolean f16913e;

    /* renamed from: f */
    public boolean f16914f;

    /* renamed from: g */
    public String f16915g;

    /* renamed from: h */
    public int f16916h;

    /* renamed from: i */
    public int f16917i;

    /* renamed from: j */
    public byte[] f16918j;

    /* renamed from: k */
    public boolean f16919k;

    /* renamed from: l */
    public final Map<String, jd0> f16920l;

    public AbstractC2003l() {
        this.f16909a = false;
        this.f16910b = false;
        this.f16911c = false;
        this.f16912d = false;
        this.f16913e = false;
        this.f16914f = false;
        this.f16915g = null;
        this.f16916h = 0;
        this.f16919k = false;
        this.f16920l = new TreeMap();
    }

    public AbstractC2003l(byte[] bArr) {
        this(bArr, false);
    }

    public AbstractC2003l(byte[] bArr, boolean z) {
        this.f16909a = false;
        this.f16910b = false;
        this.f16911c = false;
        this.f16912d = false;
        this.f16913e = false;
        this.f16914f = false;
        this.f16915g = null;
        this.f16916h = 0;
        this.f16919k = false;
        this.f16920l = new TreeMap();
        this.f16919k = z;
        m17276k(bArr);
    }

    @Override // com.daaw.hd0
    /* renamed from: a */
    public byte[] mo17286a() {
        md0 m17283d = m17283d(this.f16919k ? "PIC" : "APIC");
        if (m17283d != null) {
            return m17283d.m16086c();
        }
        return null;
    }

    /* renamed from: b */
    public void m17285b(id0 id0Var, boolean z) {
        jd0 jd0Var = this.f16920l.get(id0Var.m19921b());
        if (jd0Var == null) {
            jd0 jd0Var2 = new jd0(id0Var.m19921b());
            jd0Var2.m18603a(id0Var);
            this.f16920l.put(id0Var.m19921b(), jd0Var2);
            return;
        }
        if (z) {
            jd0Var.m18602b();
        }
        jd0Var.m18603a(id0Var);
    }

    /* renamed from: c */
    public id0 mo17284c(byte[] bArr, int i) {
        return this.f16919k ? new kd0(bArr, i) : new id0(bArr, i);
    }

    /* renamed from: d */
    public final md0 m17283d(String str) {
        jd0 jd0Var = this.f16920l.get(str);
        if (jd0Var != null) {
            id0 id0Var = jd0Var.m18601c().get(0);
            try {
                return this.f16919k ? new ld0(mo17275l(), id0Var.m19922a()) : new md0(mo17275l(), id0Var.m19922a());
            } catch (xg0 unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: e */
    public Map<String, jd0> m17282e() {
        return this.f16920l;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC2003l) {
            if (super.equals(obj)) {
                return true;
            }
            AbstractC2003l abstractC2003l = (AbstractC2003l) obj;
            if (this.f16909a == abstractC2003l.f16909a && this.f16910b == abstractC2003l.f16910b && this.f16911c == abstractC2003l.f16911c && this.f16912d == abstractC2003l.f16912d && this.f16913e == abstractC2003l.f16913e && this.f16916h == abstractC2003l.f16916h && this.f16917i == abstractC2003l.f16917i) {
                String str = this.f16915g;
                if (str != null) {
                    String str2 = abstractC2003l.f16915g;
                    if (str2 == null || !str.equals(str2)) {
                        return false;
                    }
                } else if (abstractC2003l.f16915g != null) {
                    return false;
                }
                Map<String, jd0> map = this.f16920l;
                Map<String, jd0> map2 = abstractC2003l.f16920l;
                if (map == null) {
                    if (map2 != null) {
                        return false;
                    }
                } else if (map2 == null || !map.equals(map2)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public final int m17281f(byte[] bArr, int i) {
        int m6191m = C3419wc.m6191m(bArr[i], bArr[i + 1], bArr[i + 2], bArr[i + 3]) + 4;
        this.f16917i = m6191m;
        this.f16918j = C3419wc.m6199e(bArr, i + 4, m6191m);
        return this.f16917i;
    }

    /* renamed from: g */
    public abstract void mo17280g(byte[] bArr);

    /* renamed from: h */
    public final int m17279h(byte[] bArr, int i) {
        if ("3DI".equals(C3419wc.m6201c(bArr, i, 3))) {
            return 10;
        }
        throw new xg0("Invalid footer");
    }

    /* renamed from: i */
    public int m17278i(byte[] bArr, int i, int i2) {
        while (i <= i2) {
            try {
                id0 mo17284c = mo17284c(bArr, i);
                m17285b(mo17284c, false);
                i += mo17284c.mo17787c();
            } catch (xg0 unused) {
            }
        }
        return i;
    }

    /* renamed from: j */
    public final int m17277j(byte[] bArr) {
        byte b = bArr[3];
        byte b2 = bArr[4];
        this.f16915g = ((int) b) + "." + ((int) b2);
        if (b != 2 && b != 3 && b != 4) {
            throw new sp1("Unsupported version " + this.f16915g);
        }
        mo17280g(bArr);
        if ((bArr[5] & 15) == 0) {
            int m6191m = C3419wc.m6191m(bArr[6], bArr[7], bArr[8], bArr[9]);
            this.f16916h = m6191m;
            if (m6191m >= 1) {
                return 10;
            }
            throw new xg0("Zero size tag");
        }
        throw new sp1("Unrecognised bits in header");
    }

    /* renamed from: k */
    public final void m17276k(byte[] bArr) {
        nd0.m15221c(bArr);
        int m17277j = m17277j(bArr);
        try {
            if (this.f16910b) {
                m17277j = m17281f(bArr, m17277j);
            }
            int i = this.f16916h;
            if (this.f16912d) {
                i -= 10;
            }
            m17278i(bArr, m17277j, i);
            if (this.f16912d) {
                m17279h(bArr, this.f16916h);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new xg0("Premature end of tag", e);
        }
    }

    /* renamed from: l */
    public boolean mo17275l() {
        return false;
    }
}
