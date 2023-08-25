package com.daaw;

import java.util.Arrays;
import java.util.HashSet;
/* loaded from: classes.dex */
public class de1 {
    public static int o = 1;
    public boolean a;
    public String b;
    public float f;
    public a j;
    public int c = -1;
    public int d = -1;
    public int e = 0;
    public boolean g = false;
    public float[] h = new float[9];
    public float[] i = new float[9];
    public i6[] k = new i6[16];
    public int l = 0;
    public int m = 0;
    public HashSet<i6> n = null;

    /* loaded from: classes.dex */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public de1(a aVar, String str) {
        this.j = aVar;
    }

    public static void b() {
        o++;
    }

    public final void a(i6 i6Var) {
        int i = 0;
        while (true) {
            int i2 = this.l;
            if (i >= i2) {
                i6[] i6VarArr = this.k;
                if (i2 >= i6VarArr.length) {
                    this.k = (i6[]) Arrays.copyOf(i6VarArr, i6VarArr.length * 2);
                }
                i6[] i6VarArr2 = this.k;
                int i3 = this.l;
                i6VarArr2[i3] = i6Var;
                this.l = i3 + 1;
                return;
            } else if (this.k[i] == i6Var) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void c(i6 i6Var) {
        int i = this.l;
        int i2 = 0;
        while (i2 < i) {
            if (this.k[i2] == i6Var) {
                while (i2 < i - 1) {
                    i6[] i6VarArr = this.k;
                    int i3 = i2 + 1;
                    i6VarArr[i2] = i6VarArr[i3];
                    i2 = i3;
                }
                this.l--;
                return;
            }
            i2++;
        }
    }

    public void d() {
        this.b = null;
        this.j = a.UNKNOWN;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = false;
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2] = null;
        }
        this.l = 0;
        this.m = 0;
        this.a = false;
        Arrays.fill(this.i, 0.0f);
    }

    public void e(ak0 ak0Var, float f) {
        this.f = f;
        this.g = true;
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2].B(ak0Var, this, false);
        }
        this.l = 0;
    }

    public void f(a aVar, String str) {
        this.j = aVar;
    }

    public final void g(i6 i6Var) {
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2].C(i6Var, false);
        }
        this.l = 0;
    }

    public String toString() {
        StringBuilder sb;
        if (this.b != null) {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.b);
        } else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.c);
        }
        return sb.toString();
    }
}
