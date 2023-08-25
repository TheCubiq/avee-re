package com.daaw;

import java.util.Arrays;
import java.util.HashSet;
/* loaded from: classes.dex */
public class de1 {

    /* renamed from: o */
    public static int f6970o = 1;

    /* renamed from: a */
    public boolean f6971a;

    /* renamed from: b */
    public String f6972b;

    /* renamed from: f */
    public float f6976f;

    /* renamed from: j */
    public EnumC1078a f6980j;

    /* renamed from: c */
    public int f6973c = -1;

    /* renamed from: d */
    public int f6974d = -1;

    /* renamed from: e */
    public int f6975e = 0;

    /* renamed from: g */
    public boolean f6977g = false;

    /* renamed from: h */
    public float[] f6978h = new float[9];

    /* renamed from: i */
    public float[] f6979i = new float[9];

    /* renamed from: k */
    public C1659i6[] f6981k = new C1659i6[16];

    /* renamed from: l */
    public int f6982l = 0;

    /* renamed from: m */
    public int f6983m = 0;

    /* renamed from: n */
    public HashSet<C1659i6> f6984n = null;

    /* renamed from: com.daaw.de1$a */
    /* loaded from: classes.dex */
    public enum EnumC1078a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public de1(EnumC1078a enumC1078a, String str) {
        this.f6980j = enumC1078a;
    }

    /* renamed from: b */
    public static void m24450b() {
        f6970o++;
    }

    /* renamed from: a */
    public final void m24451a(C1659i6 c1659i6) {
        int i = 0;
        while (true) {
            int i2 = this.f6982l;
            if (i >= i2) {
                C1659i6[] c1659i6Arr = this.f6981k;
                if (i2 >= c1659i6Arr.length) {
                    this.f6981k = (C1659i6[]) Arrays.copyOf(c1659i6Arr, c1659i6Arr.length * 2);
                }
                C1659i6[] c1659i6Arr2 = this.f6981k;
                int i3 = this.f6982l;
                c1659i6Arr2[i3] = c1659i6;
                this.f6982l = i3 + 1;
                return;
            } else if (this.f6981k[i] == c1659i6) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: c */
    public final void m24449c(C1659i6 c1659i6) {
        int i = this.f6982l;
        int i2 = 0;
        while (i2 < i) {
            if (this.f6981k[i2] == c1659i6) {
                while (i2 < i - 1) {
                    C1659i6[] c1659i6Arr = this.f6981k;
                    int i3 = i2 + 1;
                    c1659i6Arr[i2] = c1659i6Arr[i3];
                    i2 = i3;
                }
                this.f6982l--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: d */
    public void m24448d() {
        this.f6972b = null;
        this.f6980j = EnumC1078a.UNKNOWN;
        this.f6975e = 0;
        this.f6973c = -1;
        this.f6974d = -1;
        this.f6976f = 0.0f;
        this.f6977g = false;
        int i = this.f6982l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f6981k[i2] = null;
        }
        this.f6982l = 0;
        this.f6983m = 0;
        this.f6971a = false;
        Arrays.fill(this.f6979i, 0.0f);
    }

    /* renamed from: e */
    public void m24447e(ak0 ak0Var, float f) {
        this.f6976f = f;
        this.f6977g = true;
        int i = this.f6982l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f6981k[i2].m20109B(ak0Var, this, false);
        }
        this.f6982l = 0;
    }

    /* renamed from: f */
    public void m24446f(EnumC1078a enumC1078a, String str) {
        this.f6980j = enumC1078a;
    }

    /* renamed from: g */
    public final void m24445g(C1659i6 c1659i6) {
        int i = this.f6982l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f6981k[i2].mo20108C(c1659i6, false);
        }
        this.f6982l = 0;
    }

    public String toString() {
        StringBuilder sb;
        if (this.f6972b != null) {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f6972b);
        } else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f6973c);
        }
        return sb.toString();
    }
}
