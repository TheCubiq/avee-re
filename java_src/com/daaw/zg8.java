package com.daaw;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class zg8 implements hh8 {

    /* renamed from: h */
    public static final iz6 f35044h = new iz6() { // from class: com.daaw.vg8
        @Override // com.daaw.iz6
        public final Object zza() {
            String m2329k;
            m2329k = zg8.m2329k();
            return m2329k;
        }
    };

    /* renamed from: i */
    public static final Random f35045i = new Random();

    /* renamed from: d */
    public final iz6 f35049d;

    /* renamed from: e */
    public fh8 f35050e;

    /* renamed from: g */
    public String f35052g;

    /* renamed from: a */
    public final i54 f35046a = new i54();

    /* renamed from: b */
    public final d34 f35047b = new d34();

    /* renamed from: c */
    public final HashMap f35048c = new HashMap();

    /* renamed from: f */
    public l64 f35051f = l64.f17090a;

    public zg8(iz6 iz6Var) {
        this.f35049d = iz6Var;
    }

    /* renamed from: k */
    public static String m2329k() {
        byte[] bArr = new byte[12];
        f35045i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // com.daaw.hh8
    /* renamed from: a */
    public final synchronized String mo2339a(l64 l64Var, pr8 pr8Var) {
        String str;
        str = m2330j(l64Var.mo13467n(pr8Var.f18805a, this.f35047b).f6450c, pr8Var).f32708a;
        return str;
    }

    @Override // com.daaw.hh8
    /* renamed from: b */
    public final synchronized void mo2338b(ib8 ib8Var) {
        boolean z;
        fh8 fh8Var;
        String str;
        this.f35052g = null;
        Iterator it = this.f35048c.values().iterator();
        while (it.hasNext()) {
            xg8 xg8Var = (xg8) it.next();
            it.remove();
            z = xg8Var.f32712e;
            if (z && (fh8Var = this.f35050e) != null) {
                str = xg8Var.f32708a;
                fh8Var.mo22635a(ib8Var, str, false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x003d, code lost:
        if (r1 < r3) goto L18;
     */
    @Override // com.daaw.hh8
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void mo2337c(ib8 ib8Var) {
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        String str3;
        long j;
        long j2;
        int i;
        String unused;
        String unused2;
        Objects.requireNonNull(this.f35050e);
        if (ib8Var.f13442b.m17121o()) {
            return;
        }
        xg8 xg8Var = (xg8) this.f35048c.get(this.f35052g);
        if (ib8Var.f13444d != null && xg8Var != null) {
            j = xg8Var.f32710c;
            if (j == -1) {
                i = xg8Var.f32709b;
                if (i == ib8Var.f13443c) {
                }
                return;
            }
            long j3 = ib8Var.f13444d.f18808d;
            j2 = xg8Var.f32710c;
        }
        xg8 m2330j = m2330j(ib8Var.f13443c, ib8Var.f13444d);
        if (this.f35052g == null) {
            str3 = m2330j.f32708a;
            this.f35052g = str3;
        }
        pr8 pr8Var = ib8Var.f13444d;
        if (pr8Var != null && pr8Var.m16079b()) {
            xg8 m2330j2 = m2330j(ib8Var.f13443c, new pr8(pr8Var.f18805a, pr8Var.f18808d, pr8Var.f18806b));
            z3 = m2330j2.f32712e;
            if (!z3) {
                m2330j2.f32712e = true;
                ib8Var.f13442b.mo13467n(ib8Var.f13444d.f18805a, this.f35047b);
                this.f35047b.m24721h(ib8Var.f13444d.f18806b);
                Math.max(0L, it5.m19386j0(0L) + it5.m19386j0(0L));
                unused = m2330j2.f32708a;
            }
        }
        z = m2330j.f32712e;
        if (!z) {
            m2330j.f32712e = true;
            unused2 = m2330j.f32708a;
        }
        str = m2330j.f32708a;
        if (str.equals(this.f35052g)) {
            z2 = m2330j.f32713f;
            if (!z2) {
                m2330j.f32713f = true;
                fh8 fh8Var = this.f35050e;
                str2 = m2330j.f32708a;
                fh8Var.mo22634c(ib8Var, str2);
            }
        }
    }

    @Override // com.daaw.hh8
    /* renamed from: d */
    public final void mo2336d(fh8 fh8Var) {
        this.f35050e = fh8Var;
    }

    @Override // com.daaw.hh8
    /* renamed from: e */
    public final synchronized void mo2335e(ib8 ib8Var) {
        boolean z;
        String str;
        String str2;
        Objects.requireNonNull(this.f35050e);
        l64 l64Var = this.f35051f;
        this.f35051f = ib8Var.f13442b;
        Iterator it = this.f35048c.values().iterator();
        while (it.hasNext()) {
            xg8 xg8Var = (xg8) it.next();
            if (!xg8Var.m5118l(l64Var, this.f35051f) || xg8Var.m5119k(ib8Var)) {
                it.remove();
                z = xg8Var.f32712e;
                if (z) {
                    str = xg8Var.f32708a;
                    if (str.equals(this.f35052g)) {
                        this.f35052g = null;
                    }
                    fh8 fh8Var = this.f35050e;
                    str2 = xg8Var.f32708a;
                    fh8Var.mo22635a(ib8Var, str2, false);
                }
            }
        }
        m2328l(ib8Var);
    }

    @Override // com.daaw.hh8
    /* renamed from: f */
    public final synchronized void mo2334f(ib8 ib8Var, int i) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        Objects.requireNonNull(this.f35050e);
        Iterator it = this.f35048c.values().iterator();
        while (it.hasNext()) {
            xg8 xg8Var = (xg8) it.next();
            if (xg8Var.m5119k(ib8Var)) {
                it.remove();
                z = xg8Var.f32712e;
                if (z) {
                    str = xg8Var.f32708a;
                    boolean equals = str.equals(this.f35052g);
                    boolean z3 = false;
                    if (i == 0 && equals) {
                        z2 = xg8Var.f32713f;
                        if (z2) {
                            z3 = true;
                        }
                    }
                    if (equals) {
                        this.f35052g = null;
                    }
                    fh8 fh8Var = this.f35050e;
                    str2 = xg8Var.f32708a;
                    fh8Var.mo22635a(ib8Var, str2, z3);
                }
            }
        }
        m2328l(ib8Var);
    }

    /* renamed from: j */
    public final xg8 m2330j(int i, pr8 pr8Var) {
        long j;
        pr8 pr8Var2;
        pr8 pr8Var3;
        xg8 xg8Var = null;
        long j2 = Long.MAX_VALUE;
        for (xg8 xg8Var2 : this.f35048c.values()) {
            xg8Var2.m5123g(i, pr8Var);
            if (xg8Var2.m5120j(i, pr8Var)) {
                j = xg8Var2.f32710c;
                if (j == -1 || j < j2) {
                    xg8Var = xg8Var2;
                    j2 = j;
                } else if (j == j2) {
                    int i2 = it5.f13991a;
                    pr8Var2 = xg8Var.f32711d;
                    if (pr8Var2 != null) {
                        pr8Var3 = xg8Var2.f32711d;
                        if (pr8Var3 != null) {
                            xg8Var = xg8Var2;
                        }
                    }
                }
            }
        }
        if (xg8Var == null) {
            String m2329k = m2329k();
            xg8 xg8Var3 = new xg8(this, m2329k, i, pr8Var);
            this.f35048c.put(m2329k, xg8Var3);
            return xg8Var3;
        }
        return xg8Var;
    }

    @RequiresNonNull({"listener"})
    /* renamed from: l */
    public final void m2328l(ib8 ib8Var) {
        String str;
        long j;
        pr8 pr8Var;
        pr8 pr8Var2;
        pr8 pr8Var3;
        String unused;
        String unused2;
        if (ib8Var.f13442b.m17121o()) {
            this.f35052g = null;
            return;
        }
        xg8 xg8Var = (xg8) this.f35048c.get(this.f35052g);
        xg8 m2330j = m2330j(ib8Var.f13443c, ib8Var.f13444d);
        str = m2330j.f32708a;
        this.f35052g = str;
        mo2337c(ib8Var);
        pr8 pr8Var4 = ib8Var.f13444d;
        if (pr8Var4 == null || !pr8Var4.m16079b()) {
            return;
        }
        if (xg8Var != null) {
            j = xg8Var.f32710c;
            if (j == ib8Var.f13444d.f18808d) {
                pr8Var = xg8Var.f32711d;
                if (pr8Var != null) {
                    pr8Var2 = xg8Var.f32711d;
                    if (pr8Var2.f18806b == ib8Var.f13444d.f18806b) {
                        pr8Var3 = xg8Var.f32711d;
                        if (pr8Var3.f18807c == ib8Var.f13444d.f18807c) {
                            return;
                        }
                    }
                }
            }
        }
        pr8 pr8Var5 = ib8Var.f13444d;
        unused = m2330j(ib8Var.f13443c, new pr8(pr8Var5.f18805a, pr8Var5.f18808d)).f32708a;
        unused2 = m2330j.f32708a;
    }

    @Override // com.daaw.hh8
    public final synchronized String zzd() {
        return this.f35052g;
    }
}
