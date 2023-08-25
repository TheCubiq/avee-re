package com.daaw;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class rg8 {

    /* renamed from: a */
    public final d34 f25275a;

    /* renamed from: b */
    public y17 f25276b = y17.m4260u();

    /* renamed from: c */
    public b27 f25277c = b27.m26518d();

    /* renamed from: d */
    public pr8 f25278d;

    /* renamed from: e */
    public pr8 f25279e;

    /* renamed from: f */
    public pr8 f25280f;

    public rg8(d34 d34Var) {
        this.f25275a = d34Var;
    }

    /* renamed from: j */
    public static pr8 m11319j(ty3 ty3Var, y17 y17Var, pr8 pr8Var, d34 d34Var) {
        l64 zzn = ty3Var.zzn();
        int zzg = ty3Var.zzg();
        Object mo4508f = zzn.m17121o() ? null : zzn.mo4508f(zzg);
        int m24726c = (ty3Var.zzs() || zzn.m17121o()) ? -1 : zzn.mo1924d(zzg, d34Var, false).m24726c(it5.m19394f0(ty3Var.zzl()));
        for (int i = 0; i < y17Var.size(); i++) {
            pr8 pr8Var2 = (pr8) y17Var.get(i);
            if (m11316m(pr8Var2, mo4508f, ty3Var.zzs(), ty3Var.zzd(), ty3Var.zze(), m24726c)) {
                return pr8Var2;
            }
        }
        if (y17Var.isEmpty() && pr8Var != null) {
            if (m11316m(pr8Var, mo4508f, ty3Var.zzs(), ty3Var.zzd(), ty3Var.zze(), m24726c)) {
                return pr8Var;
            }
        }
        return null;
    }

    /* renamed from: m */
    public static boolean m11316m(pr8 pr8Var, Object obj, boolean z, int i, int i2, int i3) {
        if (pr8Var.f18805a.equals(obj)) {
            if (z) {
                if (pr8Var.f18806b != i || pr8Var.f18807c != i2) {
                    return false;
                }
            } else if (pr8Var.f18806b != -1 || pr8Var.f18809e != i3) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final l64 m11328a(pr8 pr8Var) {
        return (l64) this.f25277c.get(pr8Var);
    }

    /* renamed from: b */
    public final pr8 m11327b() {
        return this.f25278d;
    }

    /* renamed from: c */
    public final pr8 m11326c() {
        Object next;
        Object obj;
        if (this.f25276b.isEmpty()) {
            return null;
        }
        y17 y17Var = this.f25276b;
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

    /* renamed from: d */
    public final pr8 m11325d() {
        return this.f25279e;
    }

    /* renamed from: e */
    public final pr8 m11324e() {
        return this.f25280f;
    }

    /* renamed from: g */
    public final void m11322g(ty3 ty3Var) {
        this.f25278d = m11319j(ty3Var, this.f25276b, this.f25279e, this.f25275a);
    }

    /* renamed from: h */
    public final void m11321h(List list, pr8 pr8Var, ty3 ty3Var) {
        this.f25276b = y17.m4262s(list);
        if (!list.isEmpty()) {
            this.f25279e = (pr8) list.get(0);
            Objects.requireNonNull(pr8Var);
            this.f25280f = pr8Var;
        }
        if (this.f25278d == null) {
            this.f25278d = m11319j(ty3Var, this.f25276b, this.f25279e, this.f25275a);
        }
        m11317l(ty3Var.zzn());
    }

    /* renamed from: i */
    public final void m11320i(ty3 ty3Var) {
        this.f25278d = m11319j(ty3Var, this.f25276b, this.f25279e, this.f25275a);
        m11317l(ty3Var.zzn());
    }

    /* renamed from: k */
    public final void m11318k(a27 a27Var, pr8 pr8Var, l64 l64Var) {
        if (pr8Var == null) {
            return;
        }
        if (l64Var.mo4511a(pr8Var.f18805a) != -1) {
            a27Var.m27748a(pr8Var, l64Var);
            return;
        }
        l64 l64Var2 = (l64) this.f25277c.get(pr8Var);
        if (l64Var2 != null) {
            a27Var.m27748a(pr8Var, l64Var2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (com.daaw.ky6.m17316a(r3.f25278d, r3.f25280f) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r3.f25276b.contains(r3.f25278d) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        m11318k(r0, r3.f25278d, r4);
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m11317l(l64 l64Var) {
        a27 a27Var = new a27();
        if (this.f25276b.isEmpty()) {
            m11318k(a27Var, this.f25279e, l64Var);
            if (!ky6.m17316a(this.f25280f, this.f25279e)) {
                m11318k(a27Var, this.f25280f, l64Var);
            }
            if (!ky6.m17316a(this.f25278d, this.f25279e)) {
            }
        } else {
            for (int i = 0; i < this.f25276b.size(); i++) {
                m11318k(a27Var, (pr8) this.f25276b.get(i), l64Var);
            }
        }
        this.f25277c = a27Var.m27746c();
    }
}
