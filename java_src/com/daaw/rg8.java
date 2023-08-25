package com.daaw;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class rg8 {
    public final d34 a;
    public y17 b = y17.u();
    public b27 c = b27.d();
    public pr8 d;
    public pr8 e;
    public pr8 f;

    public rg8(d34 d34Var) {
        this.a = d34Var;
    }

    public static pr8 j(ty3 ty3Var, y17 y17Var, pr8 pr8Var, d34 d34Var) {
        l64 zzn = ty3Var.zzn();
        int zzg = ty3Var.zzg();
        Object f = zzn.o() ? null : zzn.f(zzg);
        int c = (ty3Var.zzs() || zzn.o()) ? -1 : zzn.d(zzg, d34Var, false).c(it5.f0(ty3Var.zzl()));
        for (int i = 0; i < y17Var.size(); i++) {
            pr8 pr8Var2 = (pr8) y17Var.get(i);
            if (m(pr8Var2, f, ty3Var.zzs(), ty3Var.zzd(), ty3Var.zze(), c)) {
                return pr8Var2;
            }
        }
        if (y17Var.isEmpty() && pr8Var != null) {
            if (m(pr8Var, f, ty3Var.zzs(), ty3Var.zzd(), ty3Var.zze(), c)) {
                return pr8Var;
            }
        }
        return null;
    }

    public static boolean m(pr8 pr8Var, Object obj, boolean z, int i, int i2, int i3) {
        if (pr8Var.a.equals(obj)) {
            if (z) {
                if (pr8Var.b != i || pr8Var.c != i2) {
                    return false;
                }
            } else if (pr8Var.b != -1 || pr8Var.e != i3) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final l64 a(pr8 pr8Var) {
        return (l64) this.c.get(pr8Var);
    }

    public final pr8 b() {
        return this.d;
    }

    public final pr8 c() {
        Object next;
        Object obj;
        if (this.b.isEmpty()) {
            return null;
        }
        y17 y17Var = this.b;
        if (!(y17Var instanceof List)) {
            Iterator<E> it = y17Var.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else if (y17Var.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            obj = y17Var.get(y17Var.size() - 1);
        }
        return (pr8) obj;
    }

    public final pr8 d() {
        return this.e;
    }

    public final pr8 e() {
        return this.f;
    }

    public final void g(ty3 ty3Var) {
        this.d = j(ty3Var, this.b, this.e, this.a);
    }

    public final void h(List list, pr8 pr8Var, ty3 ty3Var) {
        this.b = y17.s(list);
        if (!list.isEmpty()) {
            this.e = (pr8) list.get(0);
            Objects.requireNonNull(pr8Var);
            this.f = pr8Var;
        }
        if (this.d == null) {
            this.d = j(ty3Var, this.b, this.e, this.a);
        }
        l(ty3Var.zzn());
    }

    public final void i(ty3 ty3Var) {
        this.d = j(ty3Var, this.b, this.e, this.a);
        l(ty3Var.zzn());
    }

    public final void k(a27 a27Var, pr8 pr8Var, l64 l64Var) {
        if (pr8Var == null) {
            return;
        }
        if (l64Var.a(pr8Var.a) != -1) {
            a27Var.a(pr8Var, l64Var);
            return;
        }
        l64 l64Var2 = (l64) this.c.get(pr8Var);
        if (l64Var2 != null) {
            a27Var.a(pr8Var, l64Var2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (com.daaw.ky6.a(r3.d, r3.f) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r3.b.contains(r3.d) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        k(r0, r3.d, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(com.daaw.l64 r4) {
        /*
            r3 = this;
            com.daaw.a27 r0 = new com.daaw.a27
            r0.<init>()
            com.daaw.y17 r1 = r3.b
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L36
            com.daaw.pr8 r1 = r3.e
            r3.k(r0, r1, r4)
            com.daaw.pr8 r1 = r3.f
            com.daaw.pr8 r2 = r3.e
            boolean r1 = com.daaw.ky6.a(r1, r2)
            if (r1 != 0) goto L21
            com.daaw.pr8 r1 = r3.f
            r3.k(r0, r1, r4)
        L21:
            com.daaw.pr8 r1 = r3.d
            com.daaw.pr8 r2 = r3.e
            boolean r1 = com.daaw.ky6.a(r1, r2)
            if (r1 != 0) goto L5c
            com.daaw.pr8 r1 = r3.d
            com.daaw.pr8 r2 = r3.f
            boolean r1 = com.daaw.ky6.a(r1, r2)
            if (r1 != 0) goto L5c
            goto L57
        L36:
            r1 = 0
        L37:
            com.daaw.y17 r2 = r3.b
            int r2 = r2.size()
            if (r1 >= r2) goto L4d
            com.daaw.y17 r2 = r3.b
            java.lang.Object r2 = r2.get(r1)
            com.daaw.pr8 r2 = (com.daaw.pr8) r2
            r3.k(r0, r2, r4)
            int r1 = r1 + 1
            goto L37
        L4d:
            com.daaw.y17 r1 = r3.b
            com.daaw.pr8 r2 = r3.d
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L5c
        L57:
            com.daaw.pr8 r1 = r3.d
            r3.k(r0, r1, r4)
        L5c:
            com.daaw.b27 r4 = r0.c()
            r3.c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.rg8.l(com.daaw.l64):void");
    }
}
