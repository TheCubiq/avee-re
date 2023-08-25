package com.daaw;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ua1 implements ge0 {

    /* renamed from: g */
    public float f28826g;

    /* renamed from: i */
    public String[] f28828i;

    /* renamed from: j */
    public boolean f28829j;

    /* renamed from: a */
    public float f28820a = 1.0f;

    /* renamed from: b */
    public xn0 f28821b = new xn0("{ArtistOrTitle}", 1.0f, 1.0f);

    /* renamed from: c */
    public RectF f28822c = new RectF();

    /* renamed from: d */
    public bs1 f28823d = new bs1(0.0f, 0.0f);

    /* renamed from: e */
    public C3325ve f28824e = C3325ve.m7235d();

    /* renamed from: f */
    public C3192a[] f28825f = new C3192a[0];

    /* renamed from: h */
    public int f28827h = 0;

    /* renamed from: com.daaw.ua1$a */
    /* loaded from: classes.dex */
    public class C3192a {

        /* renamed from: c */
        public bs1[] f28832c;

        /* renamed from: d */
        public bs1[] f28833d;

        /* renamed from: g */
        public float f28836g;

        /* renamed from: a */
        public List<Integer> f28830a = new ArrayList();

        /* renamed from: b */
        public List<Integer> f28831b = new ArrayList();

        /* renamed from: e */
        public bs1 f28834e = new bs1(10000.0f, 10000.0f);

        /* renamed from: f */
        public bs1 f28835f = new bs1(-10000.0f, -10000.0f);

        public C3192a(int i) {
            this.f28832c = new bs1[i];
            this.f28833d = new bs1[i];
        }

        /* renamed from: a */
        public void m8387a() {
            this.f28831b = new ArrayList(this.f28830a.size());
            for (int i = 0; i < this.f28830a.size(); i++) {
                this.f28831b.add(Integer.valueOf(m8385c(this.f28830a.get(i).intValue())));
            }
            bs1[] bs1VarArr = this.f28833d;
            if (bs1VarArr.length > 0) {
                if (Float.isNaN(bs1VarArr[0].f5090a) || this.f28833d[0].m25852k() < 1.0E-5f) {
                    int m8386b = m8386b(0);
                    bs1[] bs1VarArr2 = this.f28833d;
                    bs1VarArr2[0].f5090a = bs1VarArr2[m8386b].f5090a;
                    bs1VarArr2[0].f5091b = bs1VarArr2[m8386b].f5091b;
                }
            }
        }

        /* renamed from: b */
        public int m8386b(int i) {
            for (int i2 = 0; i2 < this.f28830a.size(); i2++) {
                if (this.f28830a.get(i2).intValue() == i) {
                    return this.f28831b.get(i2).intValue();
                }
            }
            bs1[] bs1VarArr = this.f28832c;
            return ((i + bs1VarArr.length) - 1) % bs1VarArr.length;
        }

        /* renamed from: c */
        public int m8385c(int i) {
            int length;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f28830a.size() - 1) {
                    length = this.f28832c.length;
                    break;
                } else if (this.f28830a.get(i2).intValue() == i) {
                    length = this.f28830a.get(i2 + 1).intValue();
                    break;
                } else {
                    i2++;
                }
            }
            return length - 1;
        }

        /* renamed from: d */
        public float m8384d() {
            return this.f28836g;
        }
    }

    public ua1(String[] strArr, boolean z) {
        this.f28828i = strArr;
        this.f28829j = z;
    }

    @Override // com.daaw.zc0
    /* renamed from: a */
    public void mo2493a(C3239un c3239un) {
        this.f28820a = c3239un.m7953o("radius", this.f28820a);
    }

    /* renamed from: c */
    public final void m8394c(C3325ve c3325ve, String[] strArr, int i) {
        if (this.f28829j) {
            m8390j(c3325ve, strArr, i);
        } else {
            m8388q(c3325ve, strArr, i);
        }
    }

    @Override // com.daaw.ge0
    /* renamed from: d */
    public void mo8393d(de0 de0Var) {
        String m4962k = this.f28821b.m4962k(de0Var.mo2889b().mo4185a());
        this.f28827h = this.f28824e.m7225n((m4962k == null || m4962k.length() < 1) ? 'X' : m4962k.charAt(0));
    }

    @Override // com.daaw.ge0
    /* renamed from: e */
    public int mo8392e(boolean z, int i, int i2, RectF rectF, float f, PointF pointF, PointF pointF2) {
        float centerY;
        float height;
        C3192a[] c3192aArr = this.f28825f;
        if (c3192aArr.length == 0 || c3192aArr[0].f28832c.length != i2) {
            m8394c(this.f28824e, this.f28828i, i2);
        }
        int i3 = this.f28827h;
        C3192a[] c3192aArr2 = this.f28825f;
        C3192a c3192a = i3 < c3192aArr2.length ? c3192aArr2[i3] : c3192aArr2[0];
        if (c3192a != null) {
            bs1[] bs1VarArr = c3192a.f28832c;
            if (bs1VarArr.length != 0) {
                bs1 bs1Var = bs1VarArr[i];
                bs1 bs1Var2 = c3192a.f28833d[i];
                RectF rectF2 = this.f28822c;
                bs1 bs1Var3 = c3192a.f28834e;
                rectF2.left = bs1Var3.f5090a;
                rectF2.top = bs1Var3.f5091b;
                bs1 bs1Var4 = c3192a.f28835f;
                rectF2.right = bs1Var4.f5090a;
                rectF2.bottom = bs1Var4.f5091b;
                bs1 bs1Var5 = this.f28823d;
                bs1Var5.f5090a = bs1Var2.f5091b;
                bs1Var5.f5091b = -bs1Var2.f5090a;
                if (rectF2.width() > this.f28822c.height()) {
                    pointF.x = (bs1Var.f5090a - this.f28822c.centerX()) / this.f28822c.width();
                    centerY = bs1Var.f5091b - this.f28822c.centerY();
                    height = this.f28822c.width();
                } else {
                    pointF.x = (bs1Var.f5090a - this.f28822c.centerX()) / this.f28822c.height();
                    centerY = bs1Var.f5091b - this.f28822c.centerY();
                    height = this.f28822c.height();
                }
                pointF.y = centerY / height;
                float width = (rectF.width() < rectF.height() ? rectF.width() : rectF.height()) * 0.5f * this.f28820a;
                pointF.x = rectF.centerX() + (pointF.x * width);
                pointF.y = rectF.centerY() + (pointF.y * width);
                bs1 bs1Var6 = this.f28823d;
                pointF2.x = -bs1Var6.f5090a;
                pointF2.y = -bs1Var6.f5091b;
                return c3192a.m8386b(i);
            }
        }
        pointF2.x = 1.0f;
        pointF2.y = 0.0f;
        pointF.x = rectF.centerX();
        pointF.y = rectF.centerY();
        return -1;
    }

    @Override // com.daaw.ge0
    /* renamed from: i */
    public int mo8391i(RectF rectF) {
        return 2;
    }

    /* renamed from: j */
    public final void m8390j(C3325ve c3325ve, String[] strArr, int i) {
        String[] strArr2 = strArr;
        if (c3325ve.m7238a() != strArr2.length) {
            lz1.m16363c("charSet count don't match");
        }
        this.f28825f = new C3192a[Math.min(c3325ve.m7238a(), strArr2.length)];
        ArrayList arrayList = new ArrayList();
        float[] fArr = {0.0f, 0.0f};
        float[] fArr2 = {0.0f, 0.0f};
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.f28825f.length) {
            float f = 0.0f;
            this.f28826g = 0.0f;
            arrayList.clear();
            List<la1> m9473c = t71.m9473c(strArr2[i3]);
            if (m9473c.size() <= 0) {
                C3192a c3192a = new C3192a(i2);
                c3192a.m8387a();
                this.f28825f[i3] = c3192a;
            } else {
                int i4 = 0;
                while (true) {
                    float m17074a = m9473c.get(i4).m17074a();
                    arrayList.add(Float.valueOf(m17074a));
                    this.f28826g += m17074a;
                    i4++;
                    if (i4 >= m9473c.size()) {
                        break;
                    }
                }
                C3192a c3192a2 = new C3192a(i);
                float f2 = this.f28826g / i;
                c3192a2.f28830a.add(Integer.valueOf(i2));
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    if (i5 >= i) {
                        break;
                    }
                    float f3 = i5 * f2;
                    float m17074a2 = f + m9473c.get(i6).m17074a();
                    if (f3 > m17074a2) {
                        i6++;
                        if (i6 >= m9473c.size()) {
                            lz1.m16363c("could get all points on path");
                            break;
                        } else {
                            c3192a2.f28830a.add(Integer.valueOf(i5));
                            f = m17074a2;
                        }
                    } else {
                        m9473c.get(i6).m17073b(f3 - f, fArr, fArr2);
                        c3192a2.f28836g = this.f28826g;
                        c3192a2.f28832c[i5] = new bs1(fArr[i2], fArr[1]);
                        c3192a2.f28833d[i5] = new bs1(fArr2[0], fArr2[1]);
                        c3192a2.f28833d[i5].m25848o();
                        bs1 bs1Var = c3192a2.f28834e;
                        float f4 = bs1Var.f5090a;
                        bs1[] bs1VarArr = c3192a2.f28832c;
                        if (f4 > bs1VarArr[i5].f5090a) {
                            bs1Var.f5090a = bs1VarArr[i5].f5090a;
                        }
                        if (bs1Var.f5091b > bs1VarArr[i5].f5091b) {
                            bs1Var.f5091b = bs1VarArr[i5].f5091b;
                        }
                        bs1 bs1Var2 = c3192a2.f28835f;
                        if (bs1Var2.f5090a < bs1VarArr[i5].f5090a) {
                            bs1Var2.f5090a = bs1VarArr[i5].f5090a;
                        }
                        if (bs1Var2.f5091b < bs1VarArr[i5].f5091b) {
                            bs1Var2.f5091b = bs1VarArr[i5].f5091b;
                        }
                        i5++;
                        i2 = 0;
                    }
                }
                c3192a2.m8387a();
                this.f28825f[i3] = c3192a2;
            }
            i3++;
            strArr2 = strArr;
            i2 = 0;
        }
    }

    @Override // com.daaw.ge0
    /* renamed from: k */
    public float mo8389k(RectF rectF, int i) {
        C3192a[] c3192aArr = this.f28825f;
        if (c3192aArr.length == 0 || c3192aArr[0].f28832c.length != i) {
            m8394c(this.f28824e, this.f28828i, i);
        }
        int i2 = this.f28827h;
        C3192a[] c3192aArr2 = this.f28825f;
        C3192a c3192a = i2 < c3192aArr2.length ? c3192aArr2[i2] : null;
        if (c3192a == null) {
            return 1.0f;
        }
        RectF rectF2 = this.f28822c;
        bs1 bs1Var = c3192a.f28834e;
        rectF2.left = bs1Var.f5090a;
        rectF2.top = bs1Var.f5091b;
        bs1 bs1Var2 = c3192a.f28835f;
        rectF2.right = bs1Var2.f5090a;
        rectF2.bottom = bs1Var2.f5091b;
        return (c3192a.m8384d() / (this.f28822c.width() > this.f28822c.height() ? this.f28822c.width() : this.f28822c.height())) * (rectF.width() < rectF.height() ? rectF.width() : rectF.height()) * 0.5f * this.f28820a;
    }

    @Override // com.daaw.zc0
    /* renamed from: o */
    public void mo2492o(C3239un c3239un) {
        c3239un.m7990O("radius", this.f28820a, "misc", 0.1f, 3.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.graphics.PathMeasure] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* renamed from: q */
    public final void m8388q(C3325ve c3325ve, String[] strArr, int i) {
        if (c3325ve.m7238a() != strArr.length) {
            lz1.m16363c("charSet count don't match");
        }
        this.f28825f = new C3192a[Math.min(c3325ve.m7238a(), strArr.length)];
        ?? pathMeasure = new PathMeasure();
        ArrayList arrayList = new ArrayList();
        float[] fArr = {0.0f, 0.0f};
        float[] fArr2 = {0.0f, 0.0f};
        ?? r7 = 0;
        int i2 = 0;
        while (i2 < this.f28825f.length) {
            float f = 0.0f;
            this.f28826g = 0.0f;
            arrayList.clear();
            Path m8455d = u71.m8455d(strArr[i2]);
            pathMeasure.setPath(m8455d, r7);
            do {
                float length = pathMeasure.getLength();
                arrayList.add(Float.valueOf(length));
                this.f28826g += length;
            } while (pathMeasure.nextContour());
            C3192a c3192a = new C3192a(i);
            pathMeasure.setPath(m8455d, r7);
            float f2 = this.f28826g / i;
            c3192a.f28830a.add(Integer.valueOf((int) r7));
            int i3 = 0;
            while (true) {
                if (i3 < i) {
                    float f3 = i3 * f2;
                    float length2 = pathMeasure.getLength() + f;
                    if (f3 <= length2) {
                        pathMeasure.getPosTan(f3 - f, fArr, fArr2);
                        c3192a.f28836g = this.f28826g;
                        c3192a.f28832c[i3] = new bs1(fArr[r7 == true ? 1 : 0], fArr[1]);
                        c3192a.f28833d[i3] = new bs1(fArr2[0], fArr2[1]);
                        c3192a.f28833d[i3].m25848o();
                        bs1 bs1Var = c3192a.f28834e;
                        float f4 = bs1Var.f5090a;
                        bs1[] bs1VarArr = c3192a.f28832c;
                        if (f4 > bs1VarArr[i3].f5090a) {
                            bs1Var.f5090a = bs1VarArr[i3].f5090a;
                        }
                        if (bs1Var.f5091b > bs1VarArr[i3].f5091b) {
                            bs1Var.f5091b = bs1VarArr[i3].f5091b;
                        }
                        bs1 bs1Var2 = c3192a.f28835f;
                        if (bs1Var2.f5090a < bs1VarArr[i3].f5090a) {
                            bs1Var2.f5090a = bs1VarArr[i3].f5090a;
                        }
                        if (bs1Var2.f5091b < bs1VarArr[i3].f5091b) {
                            bs1Var2.f5091b = bs1VarArr[i3].f5091b;
                        }
                        i3++;
                        r7 = 0;
                    } else if (!pathMeasure.nextContour()) {
                        lz1.m16363c("could get all points on path");
                        break;
                    } else {
                        c3192a.f28830a.add(Integer.valueOf(i3));
                        f = length2;
                    }
                }
            }
            c3192a.m8387a();
            this.f28825f[i2] = c3192a;
            i2++;
            r7 = 0;
        }
    }
}
