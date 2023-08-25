package com.daaw;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* loaded from: classes.dex */
public final class b97 {

    /* renamed from: a */
    public final List f4569a = new ArrayList();

    /* renamed from: a */
    public final b97 m26322a(z87 z87Var) {
        b97 b97Var;
        boolean z;
        b97Var = z87Var.f34608f;
        if (b97Var == null) {
            z = z87Var.f34603a;
            if (z) {
                m26319d();
            }
            z87Var.f34608f = this;
            this.f4569a.add(z87Var);
            return this;
        }
        throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
    }

    /* renamed from: b */
    public final d97 m26321b() {
        a97 a97Var;
        a97 a97Var2;
        a97 a97Var3;
        int i;
        l97 l97Var;
        boolean z;
        a97 a97Var4;
        a97 a97Var5;
        a97 a97Var6;
        a97 a97Var7;
        v87 unused;
        a97 unused2;
        an7 m24205N = dn7.m24205N();
        List list = this.f4569a;
        for (int i2 = 0; i2 < list.size() - 1; i2++) {
            a97Var4 = ((z87) list.get(i2)).f34607e;
            a97Var5 = a97.f3008a;
            if (a97Var4 == a97Var5) {
                a97Var6 = ((z87) list.get(i2 + 1)).f34607e;
                a97Var7 = a97.f3008a;
                if (a97Var6 != a97Var7) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (z87 z87Var : this.f4569a) {
            unused = z87Var.f34604b;
            a97Var = z87Var.f34607e;
            if (a97Var == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            a97Var2 = z87Var.f34607e;
            a97Var3 = a97.f3008a;
            int i3 = 3;
            if (a97Var2 == a97Var3) {
                i = 0;
                while (true) {
                    if (i != 0 && !hashSet.contains(Integer.valueOf(i))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[4];
                    int i4 = 0;
                    while (i4 == 0) {
                        secureRandom.nextBytes(bArr);
                        i4 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    }
                    i = i4;
                }
            } else {
                unused2 = z87Var.f34607e;
                i = 0;
            }
            Integer valueOf = Integer.valueOf(i);
            if (hashSet.contains(valueOf)) {
                throw new GeneralSecurityException("Id " + i + " is used twice in the keyset");
            }
            hashSet.add(valueOf);
            z87.m2620a(z87Var);
            l97Var = z87Var.f34606d;
            v87 m2618c = z87Var.m2618c();
            if (!v87.f30036b.equals(m2618c)) {
                if (v87.f30037c.equals(m2618c)) {
                    i3 = 4;
                } else if (!v87.f30038d.equals(m2618c)) {
                    throw new IllegalStateException("Unknown key status");
                } else {
                    i3 = 5;
                }
            }
            ff7 m18542a = ((je7) l97Var).m18542a();
            nm7 m6296c = w97.m6296c(m18542a.m22690b());
            bn7 m25203N = cn7.m25203N();
            m25203N.m25974t(i);
            m25203N.m25972v(i3);
            m25203N.m25975s(m6296c);
            m25203N.m25973u(m18542a.m22690b().m7025O());
            m24205N.m27321s((cn7) m25203N.m22315n());
            z = z87Var.f34603a;
            if (z) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                num = valueOf;
            }
        }
        if (num != null) {
            m24205N.m27320t(num.intValue());
            return new d97((dn7) m24205N.m22315n());
        }
        throw new GeneralSecurityException("No primary was set");
    }

    /* renamed from: d */
    public final void m26319d() {
        for (z87 z87Var : this.f4569a) {
            z87Var.f34603a = false;
        }
    }
}
