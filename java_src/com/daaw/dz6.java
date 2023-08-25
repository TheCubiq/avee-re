package com.daaw;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class dz6 extends vx6 {

    /* renamed from: r */
    public final CharSequence f8004r;

    /* renamed from: s */
    public final by6 f8005s;

    /* renamed from: t */
    public int f8006t = 0;

    /* renamed from: u */
    public int f8007u;

    public dz6(fz6 fz6Var, CharSequence charSequence) {
        by6 by6Var;
        by6Var = fz6Var.f10113a;
        this.f8005s = by6Var;
        this.f8007u = Integer.MAX_VALUE;
        this.f8004r = charSequence;
    }

    @Override // com.daaw.vx6
    @CheckForNull
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6673a() {
        int mo3067c;
        int i = this.f8006t;
        while (true) {
            int i2 = this.f8006t;
            if (i2 == -1) {
                m6672b();
                return null;
            }
            int mo3066d = mo3066d(i2);
            if (mo3066d == -1) {
                mo3066d = this.f8004r.length();
                this.f8006t = -1;
                mo3067c = -1;
            } else {
                mo3067c = mo3067c(mo3066d);
                this.f8006t = mo3067c;
            }
            if (mo3067c != i) {
                if (i < mo3066d) {
                    this.f8004r.charAt(i);
                }
                if (i < mo3066d) {
                    this.f8004r.charAt(mo3066d - 1);
                }
                int i3 = this.f8007u;
                if (i3 == 1) {
                    mo3066d = this.f8004r.length();
                    this.f8006t = -1;
                    if (mo3066d > i) {
                        this.f8004r.charAt(mo3066d - 1);
                    }
                } else {
                    this.f8007u = i3 - 1;
                }
                return this.f8004r.subSequence(i, mo3066d).toString();
            }
            int i4 = mo3067c + 1;
            this.f8006t = i4;
            if (i4 > this.f8004r.length()) {
                this.f8006t = -1;
            }
        }
    }

    /* renamed from: c */
    public abstract int mo3067c(int i);

    /* renamed from: d */
    public abstract int mo3066d(int i);
}
