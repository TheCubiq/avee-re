package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class i13 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final a23 e;
    public final i23 f;
    public int n;
    public final Object g = new Object();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public String o = "";
    public String p = "";
    public String q = "";

    public i13(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = new a23(i4);
        this.f = new i23(i5, i6, i7);
    }

    public static final String q(ArrayList arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            sb.append((String) arrayList.get(i2));
            sb.append(' ');
            i2++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    public final int a(int i, int i2) {
        return this.d ? this.b : (i * this.a) + (i2 * this.b);
    }

    public final int b() {
        return this.n;
    }

    public final int c() {
        return this.k;
    }

    public final String d() {
        return this.o;
    }

    public final String e() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i13) {
            if (obj == this) {
                return true;
            }
            String str = ((i13) obj).o;
            return str != null && str.equals(this.o);
        }
        return false;
    }

    public final String f() {
        return this.q;
    }

    public final void g() {
        synchronized (this.g) {
            this.m--;
        }
    }

    public final void h() {
        synchronized (this.g) {
            this.m++;
        }
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final void i() {
        synchronized (this.g) {
            this.n -= 100;
        }
    }

    public final void j(int i) {
        this.l = i;
    }

    public final void k(String str, boolean z, float f, float f2, float f3, float f4) {
        p(str, z, f, f2, f3, f4);
    }

    public final void l(String str, boolean z, float f, float f2, float f3, float f4) {
        p(str, z, f, f2, f3, f4);
        synchronized (this.g) {
            if (this.m < 0) {
                k04.zze("ActivityContent: negative number of WebViews.");
            }
            m();
        }
    }

    public final void m() {
        synchronized (this.g) {
            int a = a(this.k, this.l);
            if (a > this.n) {
                this.n = a;
                if (!zzt.zzo().h().zzM()) {
                    this.o = this.e.a(this.h);
                    this.p = this.e.a(this.i);
                }
                if (!zzt.zzo().h().zzN()) {
                    this.q = this.f.a(this.i, this.j);
                }
            }
        }
    }

    public final void n() {
        synchronized (this.g) {
            int a = a(this.k, this.l);
            if (a > this.n) {
                this.n = a;
            }
        }
    }

    public final boolean o() {
        boolean z;
        synchronized (this.g) {
            z = this.m == 0;
        }
        return z;
    }

    public final void p(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str == null || str.length() < this.c) {
            return;
        }
        synchronized (this.g) {
            this.h.add(str);
            this.k += str.length();
            if (z) {
                this.i.add(str);
                this.j.add(new t13(f, f2, f3, f4, this.i.size() - 1));
            }
        }
    }

    public final String toString() {
        int i = this.l;
        int i2 = this.n;
        int i3 = this.k;
        String q = q(this.h, 100);
        String q2 = q(this.i, 100);
        String str = this.o;
        String str2 = this.p;
        String str3 = this.q;
        return "ActivityContent fetchId: " + i + " score:" + i2 + " total_length:" + i3 + "\n text: " + q + "\n viewableText" + q2 + "\n signture: " + str + "\n viewableSignture: " + str2 + "\n viewableSignatureForVertical: " + str3;
    }
}
