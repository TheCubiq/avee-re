package com.daaw;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* loaded from: classes.dex */
public final class b97 {
    public final List a = new ArrayList();

    public final b97 a(z87 z87Var) {
        b97 b97Var;
        boolean z;
        b97Var = z87Var.f;
        if (b97Var == null) {
            z = z87Var.a;
            if (z) {
                d();
            }
            z87Var.f = this;
            this.a.add(z87Var);
            return this;
        }
        throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
    }

    public final d97 b() {
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
        an7 N = dn7.N();
        List list = this.a;
        for (int i2 = 0; i2 < list.size() - 1; i2++) {
            a97Var4 = ((z87) list.get(i2)).e;
            a97Var5 = a97.a;
            if (a97Var4 == a97Var5) {
                a97Var6 = ((z87) list.get(i2 + 1)).e;
                a97Var7 = a97.a;
                if (a97Var6 != a97Var7) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (z87 z87Var : this.a) {
            unused = z87Var.b;
            a97Var = z87Var.e;
            if (a97Var == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            a97Var2 = z87Var.e;
            a97Var3 = a97.a;
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
                unused2 = z87Var.e;
                i = 0;
            }
            Integer valueOf = Integer.valueOf(i);
            if (hashSet.contains(valueOf)) {
                throw new GeneralSecurityException("Id " + i + " is used twice in the keyset");
            }
            hashSet.add(valueOf);
            z87.a(z87Var);
            l97Var = z87Var.d;
            v87 c = z87Var.c();
            if (!v87.b.equals(c)) {
                if (v87.c.equals(c)) {
                    i3 = 4;
                } else if (!v87.d.equals(c)) {
                    throw new IllegalStateException("Unknown key status");
                } else {
                    i3 = 5;
                }
            }
            ff7 a = ((je7) l97Var).a();
            nm7 c2 = w97.c(a.b());
            bn7 N2 = cn7.N();
            N2.t(i);
            N2.v(i3);
            N2.s(c2);
            N2.u(a.b().O());
            N.s((cn7) N2.n());
            z = z87Var.a;
            if (z) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                num = valueOf;
            }
        }
        if (num != null) {
            N.t(num.intValue());
            return new d97((dn7) N.n());
        }
        throw new GeneralSecurityException("No primary was set");
    }

    public final void d() {
        for (z87 z87Var : this.a) {
            z87Var.a = false;
        }
    }
}
