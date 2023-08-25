package com.daaw;

import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes2.dex */
public abstract class l implements hd0 {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public String g;
    public int h;
    public int i;
    public byte[] j;
    public boolean k;
    public final Map<String, jd0> l;

    public l() {
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = null;
        this.h = 0;
        this.k = false;
        this.l = new TreeMap();
    }

    public l(byte[] bArr) {
        this(bArr, false);
    }

    public l(byte[] bArr, boolean z) {
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = null;
        this.h = 0;
        this.k = false;
        this.l = new TreeMap();
        this.k = z;
        k(bArr);
    }

    @Override // com.daaw.hd0
    public byte[] a() {
        md0 d = d(this.k ? "PIC" : "APIC");
        if (d != null) {
            return d.c();
        }
        return null;
    }

    public void b(id0 id0Var, boolean z) {
        jd0 jd0Var = this.l.get(id0Var.b());
        if (jd0Var == null) {
            jd0 jd0Var2 = new jd0(id0Var.b());
            jd0Var2.a(id0Var);
            this.l.put(id0Var.b(), jd0Var2);
            return;
        }
        if (z) {
            jd0Var.b();
        }
        jd0Var.a(id0Var);
    }

    public id0 c(byte[] bArr, int i) {
        return this.k ? new kd0(bArr, i) : new id0(bArr, i);
    }

    public final md0 d(String str) {
        jd0 jd0Var = this.l.get(str);
        if (jd0Var != null) {
            id0 id0Var = jd0Var.c().get(0);
            try {
                return this.k ? new ld0(l(), id0Var.a()) : new md0(l(), id0Var.a());
            } catch (xg0 unused) {
                return null;
            }
        }
        return null;
    }

    public Map<String, jd0> e() {
        return this.l;
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            if (super.equals(obj)) {
                return true;
            }
            l lVar = (l) obj;
            if (this.a == lVar.a && this.b == lVar.b && this.c == lVar.c && this.d == lVar.d && this.e == lVar.e && this.h == lVar.h && this.i == lVar.i) {
                String str = this.g;
                if (str != null) {
                    String str2 = lVar.g;
                    if (str2 == null || !str.equals(str2)) {
                        return false;
                    }
                } else if (lVar.g != null) {
                    return false;
                }
                Map<String, jd0> map = this.l;
                Map<String, jd0> map2 = lVar.l;
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

    public final int f(byte[] bArr, int i) {
        int m = wc.m(bArr[i], bArr[i + 1], bArr[i + 2], bArr[i + 3]) + 4;
        this.i = m;
        this.j = wc.e(bArr, i + 4, m);
        return this.i;
    }

    public abstract void g(byte[] bArr);

    public final int h(byte[] bArr, int i) {
        if ("3DI".equals(wc.c(bArr, i, 3))) {
            return 10;
        }
        throw new xg0("Invalid footer");
    }

    public int i(byte[] bArr, int i, int i2) {
        while (i <= i2) {
            try {
                id0 c = c(bArr, i);
                b(c, false);
                i += c.c();
            } catch (xg0 unused) {
            }
        }
        return i;
    }

    public final int j(byte[] bArr) {
        byte b = bArr[3];
        byte b2 = bArr[4];
        this.g = ((int) b) + "." + ((int) b2);
        if (b != 2 && b != 3 && b != 4) {
            throw new sp1("Unsupported version " + this.g);
        }
        g(bArr);
        if ((bArr[5] & 15) == 0) {
            int m = wc.m(bArr[6], bArr[7], bArr[8], bArr[9]);
            this.h = m;
            if (m >= 1) {
                return 10;
            }
            throw new xg0("Zero size tag");
        }
        throw new sp1("Unrecognised bits in header");
    }

    public final void k(byte[] bArr) {
        nd0.c(bArr);
        int j = j(bArr);
        try {
            if (this.b) {
                j = f(bArr, j);
            }
            int i = this.h;
            if (this.d) {
                i -= 10;
            }
            i(bArr, j, i);
            if (this.d) {
                h(bArr, this.h);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new xg0("Premature end of tag", e);
        }
    }

    public boolean l() {
        return false;
    }
}
