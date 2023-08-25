package com.daaw;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class dz6 extends vx6 {
    public final CharSequence r;
    public final by6 s;
    public int t = 0;
    public int u;

    public dz6(fz6 fz6Var, CharSequence charSequence) {
        by6 by6Var;
        by6Var = fz6Var.a;
        this.s = by6Var;
        this.u = Integer.MAX_VALUE;
        this.r = charSequence;
    }

    @Override // com.daaw.vx6
    @CheckForNull
    public final /* bridge */ /* synthetic */ Object a() {
        int c;
        int i = this.t;
        while (true) {
            int i2 = this.t;
            if (i2 == -1) {
                b();
                return null;
            }
            int d = d(i2);
            if (d == -1) {
                d = this.r.length();
                this.t = -1;
                c = -1;
            } else {
                c = c(d);
                this.t = c;
            }
            if (c != i) {
                if (i < d) {
                    this.r.charAt(i);
                }
                if (i < d) {
                    this.r.charAt(d - 1);
                }
                int i3 = this.u;
                if (i3 == 1) {
                    d = this.r.length();
                    this.t = -1;
                    if (d > i) {
                        this.r.charAt(d - 1);
                    }
                } else {
                    this.u = i3 - 1;
                }
                return this.r.subSequence(i, d).toString();
            }
            int i4 = c + 1;
            this.t = i4;
            if (i4 > this.r.length()) {
                this.t = -1;
            }
        }
    }

    public abstract int c(int i);

    public abstract int d(int i);
}
