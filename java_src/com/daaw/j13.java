package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class j13 {
    public int b;
    public final Object a = new Object();
    public final List c = new LinkedList();

    public final i13 a(boolean z) {
        synchronized (this.a) {
            i13 i13Var = null;
            if (this.c.isEmpty()) {
                k04.zze("Queue empty");
                return null;
            }
            int i = 0;
            if (this.c.size() < 2) {
                i13 i13Var2 = (i13) this.c.get(0);
                if (z) {
                    this.c.remove(0);
                } else {
                    i13Var2.i();
                }
                return i13Var2;
            }
            int i2 = Integer.MIN_VALUE;
            int i3 = 0;
            for (i13 i13Var3 : this.c) {
                int b = i13Var3.b();
                if (b > i2) {
                    i = i3;
                }
                int i4 = b > i2 ? b : i2;
                if (b > i2) {
                    i13Var = i13Var3;
                }
                i3++;
                i2 = i4;
            }
            this.c.remove(i);
            return i13Var;
        }
    }

    public final void b(i13 i13Var) {
        synchronized (this.a) {
            if (this.c.size() >= 10) {
                int size = this.c.size();
                k04.zze("Queue is full, current size = " + size);
                this.c.remove(0);
            }
            int i = this.b;
            this.b = i + 1;
            i13Var.j(i);
            i13Var.n();
            this.c.add(i13Var);
        }
    }

    public final boolean c(i13 i13Var) {
        synchronized (this.a) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                i13 i13Var2 = (i13) it.next();
                if (zzt.zzo().h().zzM()) {
                    if (!zzt.zzo().h().zzN() && !i13Var.equals(i13Var2) && i13Var2.f().equals(i13Var.f())) {
                        it.remove();
                        return true;
                    }
                } else if (!i13Var.equals(i13Var2) && i13Var2.d().equals(i13Var.d())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean d(i13 i13Var) {
        synchronized (this.a) {
            return this.c.contains(i13Var);
        }
    }
}
