package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class j13 {

    /* renamed from: b */
    public int f14173b;

    /* renamed from: a */
    public final Object f14172a = new Object();

    /* renamed from: c */
    public final List f14174c = new LinkedList();

    /* renamed from: a */
    public final i13 m19174a(boolean z) {
        synchronized (this.f14172a) {
            i13 i13Var = null;
            if (this.f14174c.isEmpty()) {
                k04.zze("Queue empty");
                return null;
            }
            int i = 0;
            if (this.f14174c.size() < 2) {
                i13 i13Var2 = (i13) this.f14174c.get(0);
                if (z) {
                    this.f14174c.remove(0);
                } else {
                    i13Var2.m20209i();
                }
                return i13Var2;
            }
            int i2 = Integer.MIN_VALUE;
            int i3 = 0;
            for (i13 i13Var3 : this.f14174c) {
                int m20216b = i13Var3.m20216b();
                if (m20216b > i2) {
                    i = i3;
                }
                int i4 = m20216b > i2 ? m20216b : i2;
                if (m20216b > i2) {
                    i13Var = i13Var3;
                }
                i3++;
                i2 = i4;
            }
            this.f14174c.remove(i);
            return i13Var;
        }
    }

    /* renamed from: b */
    public final void m19173b(i13 i13Var) {
        synchronized (this.f14172a) {
            if (this.f14174c.size() >= 10) {
                int size = this.f14174c.size();
                k04.zze("Queue is full, current size = " + size);
                this.f14174c.remove(0);
            }
            int i = this.f14173b;
            this.f14173b = i + 1;
            i13Var.m20208j(i);
            i13Var.m20204n();
            this.f14174c.add(i13Var);
        }
    }

    /* renamed from: c */
    public final boolean m19172c(i13 i13Var) {
        synchronized (this.f14172a) {
            Iterator it = this.f14174c.iterator();
            while (it.hasNext()) {
                i13 i13Var2 = (i13) it.next();
                if (zzt.zzo().m11915h().zzM()) {
                    if (!zzt.zzo().m11915h().zzN() && !i13Var.equals(i13Var2) && i13Var2.m20212f().equals(i13Var.m20212f())) {
                        it.remove();
                        return true;
                    }
                } else if (!i13Var.equals(i13Var2) && i13Var2.m20214d().equals(i13Var.m20214d())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: d */
    public final boolean m19171d(i13 i13Var) {
        synchronized (this.f14172a) {
            return this.f14174c.contains(i13Var);
        }
    }
}
