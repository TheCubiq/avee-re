package com.daaw;

import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public final class nw8 {
    public int a;
    public int b;
    public int c = 0;
    public gw8[] d = new gw8[100];

    public nw8(boolean z, int i) {
    }

    public final synchronized int a() {
        return this.b * 65536;
    }

    public final synchronized gw8 b() {
        gw8 gw8Var;
        this.b++;
        int i = this.c;
        if (i > 0) {
            gw8[] gw8VarArr = this.d;
            int i2 = i - 1;
            this.c = i2;
            gw8Var = gw8VarArr[i2];
            Objects.requireNonNull(gw8Var);
            gw8VarArr[i2] = null;
        } else {
            gw8Var = new gw8(new byte[65536], 0);
            int i3 = this.b;
            gw8[] gw8VarArr2 = this.d;
            int length = gw8VarArr2.length;
            if (i3 > length) {
                this.d = (gw8[]) Arrays.copyOf(gw8VarArr2, length + length);
                return gw8Var;
            }
        }
        return gw8Var;
    }

    public final synchronized void c(gw8 gw8Var) {
        gw8[] gw8VarArr = this.d;
        int i = this.c;
        this.c = i + 1;
        gw8VarArr[i] = gw8Var;
        this.b--;
        notifyAll();
    }

    public final synchronized void d(hw8 hw8Var) {
        while (hw8Var != null) {
            gw8[] gw8VarArr = this.d;
            int i = this.c;
            this.c = i + 1;
            gw8VarArr[i] = hw8Var.zzc();
            this.b--;
            hw8Var = hw8Var.zzd();
        }
        notifyAll();
    }

    public final synchronized void e() {
        f(0);
    }

    public final synchronized void f(int i) {
        int i2 = this.a;
        this.a = i;
        if (i < i2) {
            g();
        }
    }

    public final synchronized void g() {
        int max = Math.max(0, it5.O(this.a, 65536) - this.b);
        int i = this.c;
        if (max >= i) {
            return;
        }
        Arrays.fill(this.d, max, i, (Object) null);
        this.c = max;
    }
}
