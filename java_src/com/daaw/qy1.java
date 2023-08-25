package com.daaw;

import androidx.work.C0511b;
import java.util.List;
/* loaded from: classes.dex */
public final class qy1 {

    /* renamed from: s */
    public static final String f24622s = ll0.m16883f("WorkSpec");

    /* renamed from: t */
    public static final v50<List<Object>, List<Object>> f24623t = new C2800a();

    /* renamed from: a */
    public String f24624a;

    /* renamed from: b */
    public yx1 f24625b;

    /* renamed from: c */
    public String f24626c;

    /* renamed from: d */
    public String f24627d;

    /* renamed from: e */
    public C0511b f24628e;

    /* renamed from: f */
    public C0511b f24629f;

    /* renamed from: g */
    public long f24630g;

    /* renamed from: h */
    public long f24631h;

    /* renamed from: i */
    public long f24632i;

    /* renamed from: j */
    public C2943sj f24633j;

    /* renamed from: k */
    public int f24634k;

    /* renamed from: l */
    public EnumC1520ha f24635l;

    /* renamed from: m */
    public long f24636m;

    /* renamed from: n */
    public long f24637n;

    /* renamed from: o */
    public long f24638o;

    /* renamed from: p */
    public long f24639p;

    /* renamed from: q */
    public boolean f24640q;

    /* renamed from: r */
    public zu0 f24641r;

    /* renamed from: com.daaw.qy1$a */
    /* loaded from: classes.dex */
    public class C2800a implements v50<List<Object>, List<Object>> {
    }

    /* renamed from: com.daaw.qy1$b */
    /* loaded from: classes.dex */
    public static class C2801b {

        /* renamed from: a */
        public String f24642a;

        /* renamed from: b */
        public yx1 f24643b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2801b) {
                C2801b c2801b = (C2801b) obj;
                if (this.f24643b != c2801b.f24643b) {
                    return false;
                }
                return this.f24642a.equals(c2801b.f24642a);
            }
            return false;
        }

        public int hashCode() {
            return (this.f24642a.hashCode() * 31) + this.f24643b.hashCode();
        }
    }

    public qy1(qy1 qy1Var) {
        this.f24625b = yx1.ENQUEUED;
        C0511b c0511b = C0511b.f2466c;
        this.f24628e = c0511b;
        this.f24629f = c0511b;
        this.f24633j = C2943sj.f26283i;
        this.f24635l = EnumC1520ha.EXPONENTIAL;
        this.f24636m = 30000L;
        this.f24639p = -1L;
        this.f24641r = zu0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f24624a = qy1Var.f24624a;
        this.f24626c = qy1Var.f24626c;
        this.f24625b = qy1Var.f24625b;
        this.f24627d = qy1Var.f24627d;
        this.f24628e = new C0511b(qy1Var.f24628e);
        this.f24629f = new C0511b(qy1Var.f24629f);
        this.f24630g = qy1Var.f24630g;
        this.f24631h = qy1Var.f24631h;
        this.f24632i = qy1Var.f24632i;
        this.f24633j = new C2943sj(qy1Var.f24633j);
        this.f24634k = qy1Var.f24634k;
        this.f24635l = qy1Var.f24635l;
        this.f24636m = qy1Var.f24636m;
        this.f24637n = qy1Var.f24637n;
        this.f24638o = qy1Var.f24638o;
        this.f24639p = qy1Var.f24639p;
        this.f24640q = qy1Var.f24640q;
        this.f24641r = qy1Var.f24641r;
    }

    public qy1(String str, String str2) {
        this.f24625b = yx1.ENQUEUED;
        C0511b c0511b = C0511b.f2466c;
        this.f24628e = c0511b;
        this.f24629f = c0511b;
        this.f24633j = C2943sj.f26283i;
        this.f24635l = EnumC1520ha.EXPONENTIAL;
        this.f24636m = 30000L;
        this.f24639p = -1L;
        this.f24641r = zu0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f24624a = str;
        this.f24626c = str2;
    }

    /* renamed from: a */
    public long m11938a() {
        if (m11936c()) {
            return this.f24637n + Math.min(18000000L, this.f24635l == EnumC1520ha.LINEAR ? this.f24636m * this.f24634k : Math.scalb((float) this.f24636m, this.f24634k - 1));
        }
        if (!m11935d()) {
            long j = this.f24637n;
            if (j == 0) {
                j = System.currentTimeMillis();
            }
            return j + this.f24630g;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.f24637n;
        long j3 = j2 == 0 ? currentTimeMillis + this.f24630g : j2;
        long j4 = this.f24632i;
        long j5 = this.f24631h;
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (j4 != j5) {
            return j3 + j5 + (i == 0 ? j4 * (-1) : 0L);
        }
        return j3 + (i != 0 ? j5 : 0L);
    }

    /* renamed from: b */
    public boolean m11937b() {
        return !C2943sj.f26283i.equals(this.f24633j);
    }

    /* renamed from: c */
    public boolean m11936c() {
        return this.f24625b == yx1.ENQUEUED && this.f24634k > 0;
    }

    /* renamed from: d */
    public boolean m11935d() {
        return this.f24631h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qy1.class != obj.getClass()) {
            return false;
        }
        qy1 qy1Var = (qy1) obj;
        if (this.f24630g == qy1Var.f24630g && this.f24631h == qy1Var.f24631h && this.f24632i == qy1Var.f24632i && this.f24634k == qy1Var.f24634k && this.f24636m == qy1Var.f24636m && this.f24637n == qy1Var.f24637n && this.f24638o == qy1Var.f24638o && this.f24639p == qy1Var.f24639p && this.f24640q == qy1Var.f24640q && this.f24624a.equals(qy1Var.f24624a) && this.f24625b == qy1Var.f24625b && this.f24626c.equals(qy1Var.f24626c)) {
            String str = this.f24627d;
            if (str == null ? qy1Var.f24627d == null : str.equals(qy1Var.f24627d)) {
                return this.f24628e.equals(qy1Var.f24628e) && this.f24629f.equals(qy1Var.f24629f) && this.f24633j.equals(qy1Var.f24633j) && this.f24635l == qy1Var.f24635l && this.f24641r == qy1Var.f24641r;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f24624a.hashCode() * 31) + this.f24625b.hashCode()) * 31) + this.f24626c.hashCode()) * 31;
        String str = this.f24627d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j = this.f24630g;
        long j2 = this.f24631h;
        long j3 = this.f24632i;
        long j4 = this.f24636m;
        long j5 = this.f24637n;
        long j6 = this.f24638o;
        long j7 = this.f24639p;
        return ((((((((((((((((((((((((((((hashCode + hashCode2) * 31) + this.f24628e.hashCode()) * 31) + this.f24629f.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f24633j.hashCode()) * 31) + this.f24634k) * 31) + this.f24635l.hashCode()) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f24640q ? 1 : 0)) * 31) + this.f24641r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f24624a + "}";
    }
}
