package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class i13 {

    /* renamed from: a */
    public final int f13157a;

    /* renamed from: b */
    public final int f13158b;

    /* renamed from: c */
    public final int f13159c;

    /* renamed from: d */
    public final boolean f13160d;

    /* renamed from: e */
    public final a23 f13161e;

    /* renamed from: f */
    public final i23 f13162f;

    /* renamed from: n */
    public int f13170n;

    /* renamed from: g */
    public final Object f13163g = new Object();

    /* renamed from: h */
    public final ArrayList f13164h = new ArrayList();

    /* renamed from: i */
    public final ArrayList f13165i = new ArrayList();

    /* renamed from: j */
    public final ArrayList f13166j = new ArrayList();

    /* renamed from: k */
    public int f13167k = 0;

    /* renamed from: l */
    public int f13168l = 0;

    /* renamed from: m */
    public int f13169m = 0;

    /* renamed from: o */
    public String f13171o = "";

    /* renamed from: p */
    public String f13172p = "";

    /* renamed from: q */
    public String f13173q = "";

    public i13(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.f13157a = i;
        this.f13158b = i2;
        this.f13159c = i3;
        this.f13160d = z;
        this.f13161e = new a23(i4);
        this.f13162f = new i23(i5, i6, i7);
    }

    /* renamed from: q */
    public static final String m20201q(ArrayList arrayList, int i) {
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

    /* renamed from: a */
    public final int m20217a(int i, int i2) {
        return this.f13160d ? this.f13158b : (i * this.f13157a) + (i2 * this.f13158b);
    }

    /* renamed from: b */
    public final int m20216b() {
        return this.f13170n;
    }

    /* renamed from: c */
    public final int m20215c() {
        return this.f13167k;
    }

    /* renamed from: d */
    public final String m20214d() {
        return this.f13171o;
    }

    /* renamed from: e */
    public final String m20213e() {
        return this.f13172p;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i13) {
            if (obj == this) {
                return true;
            }
            String str = ((i13) obj).f13171o;
            return str != null && str.equals(this.f13171o);
        }
        return false;
    }

    /* renamed from: f */
    public final String m20212f() {
        return this.f13173q;
    }

    /* renamed from: g */
    public final void m20211g() {
        synchronized (this.f13163g) {
            this.f13169m--;
        }
    }

    /* renamed from: h */
    public final void m20210h() {
        synchronized (this.f13163g) {
            this.f13169m++;
        }
    }

    public final int hashCode() {
        return this.f13171o.hashCode();
    }

    /* renamed from: i */
    public final void m20209i() {
        synchronized (this.f13163g) {
            this.f13170n -= 100;
        }
    }

    /* renamed from: j */
    public final void m20208j(int i) {
        this.f13168l = i;
    }

    /* renamed from: k */
    public final void m20207k(String str, boolean z, float f, float f2, float f3, float f4) {
        m20202p(str, z, f, f2, f3, f4);
    }

    /* renamed from: l */
    public final void m20206l(String str, boolean z, float f, float f2, float f3, float f4) {
        m20202p(str, z, f, f2, f3, f4);
        synchronized (this.f13163g) {
            if (this.f13169m < 0) {
                k04.zze("ActivityContent: negative number of WebViews.");
            }
            m20205m();
        }
    }

    /* renamed from: m */
    public final void m20205m() {
        synchronized (this.f13163g) {
            int m20217a = m20217a(this.f13167k, this.f13168l);
            if (m20217a > this.f13170n) {
                this.f13170n = m20217a;
                if (!zzt.zzo().m11915h().zzM()) {
                    this.f13171o = this.f13161e.m27749a(this.f13164h);
                    this.f13172p = this.f13161e.m27749a(this.f13165i);
                }
                if (!zzt.zzo().m11915h().zzN()) {
                    this.f13173q = this.f13162f.m20168a(this.f13165i, this.f13166j);
                }
            }
        }
    }

    /* renamed from: n */
    public final void m20204n() {
        synchronized (this.f13163g) {
            int m20217a = m20217a(this.f13167k, this.f13168l);
            if (m20217a > this.f13170n) {
                this.f13170n = m20217a;
            }
        }
    }

    /* renamed from: o */
    public final boolean m20203o() {
        boolean z;
        synchronized (this.f13163g) {
            z = this.f13169m == 0;
        }
        return z;
    }

    /* renamed from: p */
    public final void m20202p(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str == null || str.length() < this.f13159c) {
            return;
        }
        synchronized (this.f13163g) {
            this.f13164h.add(str);
            this.f13167k += str.length();
            if (z) {
                this.f13165i.add(str);
                this.f13166j.add(new t13(f, f2, f3, f4, this.f13165i.size() - 1));
            }
        }
    }

    public final String toString() {
        int i = this.f13168l;
        int i2 = this.f13170n;
        int i3 = this.f13167k;
        String m20201q = m20201q(this.f13164h, 100);
        String m20201q2 = m20201q(this.f13165i, 100);
        String str = this.f13171o;
        String str2 = this.f13172p;
        String str3 = this.f13173q;
        return "ActivityContent fetchId: " + i + " score:" + i2 + " total_length:" + i3 + "\n text: " + m20201q + "\n viewableText" + m20201q2 + "\n signture: " + str + "\n viewableSignture: " + str2 + "\n viewableSignatureForVertical: " + str3;
    }
}
