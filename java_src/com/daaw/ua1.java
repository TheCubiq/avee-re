package com.daaw;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ua1 implements ge0 {
    public float g;
    public String[] i;
    public boolean j;
    public float a = 1.0f;
    public xn0 b = new xn0("{ArtistOrTitle}", 1.0f, 1.0f);
    public RectF c = new RectF();
    public bs1 d = new bs1(0.0f, 0.0f);
    public ve e = ve.d();
    public a[] f = new a[0];
    public int h = 0;

    /* loaded from: classes.dex */
    public class a {
        public bs1[] c;
        public bs1[] d;
        public float g;
        public List<Integer> a = new ArrayList();
        public List<Integer> b = new ArrayList();
        public bs1 e = new bs1(10000.0f, 10000.0f);
        public bs1 f = new bs1(-10000.0f, -10000.0f);

        public a(int i) {
            this.c = new bs1[i];
            this.d = new bs1[i];
        }

        public void a() {
            this.b = new ArrayList(this.a.size());
            for (int i = 0; i < this.a.size(); i++) {
                this.b.add(Integer.valueOf(c(this.a.get(i).intValue())));
            }
            bs1[] bs1VarArr = this.d;
            if (bs1VarArr.length > 0) {
                if (Float.isNaN(bs1VarArr[0].a) || this.d[0].k() < 1.0E-5f) {
                    int b = b(0);
                    bs1[] bs1VarArr2 = this.d;
                    bs1VarArr2[0].a = bs1VarArr2[b].a;
                    bs1VarArr2[0].b = bs1VarArr2[b].b;
                }
            }
        }

        public int b(int i) {
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                if (this.a.get(i2).intValue() == i) {
                    return this.b.get(i2).intValue();
                }
            }
            bs1[] bs1VarArr = this.c;
            return ((i + bs1VarArr.length) - 1) % bs1VarArr.length;
        }

        public int c(int i) {
            int length;
            int i2 = 0;
            while (true) {
                if (i2 >= this.a.size() - 1) {
                    length = this.c.length;
                    break;
                } else if (this.a.get(i2).intValue() == i) {
                    length = this.a.get(i2 + 1).intValue();
                    break;
                } else {
                    i2++;
                }
            }
            return length - 1;
        }

        public float d() {
            return this.g;
        }
    }

    public ua1(String[] strArr, boolean z) {
        this.i = strArr;
        this.j = z;
    }

    @Override // com.daaw.zc0
    public void a(un unVar) {
        this.a = unVar.o("radius", this.a);
    }

    public final void c(ve veVar, String[] strArr, int i) {
        if (this.j) {
            j(veVar, strArr, i);
        } else {
            q(veVar, strArr, i);
        }
    }

    @Override // com.daaw.ge0
    public void d(de0 de0Var) {
        String k = this.b.k(de0Var.b().a());
        this.h = this.e.n((k == null || k.length() < 1) ? 'X' : k.charAt(0));
    }

    @Override // com.daaw.ge0
    public int e(boolean z, int i, int i2, RectF rectF, float f, PointF pointF, PointF pointF2) {
        float centerY;
        float height;
        a[] aVarArr = this.f;
        if (aVarArr.length == 0 || aVarArr[0].c.length != i2) {
            c(this.e, this.i, i2);
        }
        int i3 = this.h;
        a[] aVarArr2 = this.f;
        a aVar = i3 < aVarArr2.length ? aVarArr2[i3] : aVarArr2[0];
        if (aVar != null) {
            bs1[] bs1VarArr = aVar.c;
            if (bs1VarArr.length != 0) {
                bs1 bs1Var = bs1VarArr[i];
                bs1 bs1Var2 = aVar.d[i];
                RectF rectF2 = this.c;
                bs1 bs1Var3 = aVar.e;
                rectF2.left = bs1Var3.a;
                rectF2.top = bs1Var3.b;
                bs1 bs1Var4 = aVar.f;
                rectF2.right = bs1Var4.a;
                rectF2.bottom = bs1Var4.b;
                bs1 bs1Var5 = this.d;
                bs1Var5.a = bs1Var2.b;
                bs1Var5.b = -bs1Var2.a;
                if (rectF2.width() > this.c.height()) {
                    pointF.x = (bs1Var.a - this.c.centerX()) / this.c.width();
                    centerY = bs1Var.b - this.c.centerY();
                    height = this.c.width();
                } else {
                    pointF.x = (bs1Var.a - this.c.centerX()) / this.c.height();
                    centerY = bs1Var.b - this.c.centerY();
                    height = this.c.height();
                }
                pointF.y = centerY / height;
                float width = (rectF.width() < rectF.height() ? rectF.width() : rectF.height()) * 0.5f * this.a;
                pointF.x = rectF.centerX() + (pointF.x * width);
                pointF.y = rectF.centerY() + (pointF.y * width);
                bs1 bs1Var6 = this.d;
                pointF2.x = -bs1Var6.a;
                pointF2.y = -bs1Var6.b;
                return aVar.b(i);
            }
        }
        pointF2.x = 1.0f;
        pointF2.y = 0.0f;
        pointF.x = rectF.centerX();
        pointF.y = rectF.centerY();
        return -1;
    }

    @Override // com.daaw.ge0
    public int i(RectF rectF) {
        return 2;
    }

    public final void j(ve veVar, String[] strArr, int i) {
        String[] strArr2 = strArr;
        if (veVar.a() != strArr2.length) {
            lz1.c("charSet count don't match");
        }
        this.f = new a[Math.min(veVar.a(), strArr2.length)];
        ArrayList arrayList = new ArrayList();
        float[] fArr = {0.0f, 0.0f};
        float[] fArr2 = {0.0f, 0.0f};
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.f.length) {
            float f = 0.0f;
            this.g = 0.0f;
            arrayList.clear();
            List<la1> c = t71.c(strArr2[i3]);
            if (c.size() <= 0) {
                a aVar = new a(i2);
                aVar.a();
                this.f[i3] = aVar;
            } else {
                int i4 = 0;
                while (true) {
                    float a2 = c.get(i4).a();
                    arrayList.add(Float.valueOf(a2));
                    this.g += a2;
                    i4++;
                    if (i4 >= c.size()) {
                        break;
                    }
                }
                a aVar2 = new a(i);
                float f2 = this.g / i;
                aVar2.a.add(Integer.valueOf(i2));
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    if (i5 >= i) {
                        break;
                    }
                    float f3 = i5 * f2;
                    float a3 = f + c.get(i6).a();
                    if (f3 > a3) {
                        i6++;
                        if (i6 >= c.size()) {
                            lz1.c("could get all points on path");
                            break;
                        } else {
                            aVar2.a.add(Integer.valueOf(i5));
                            f = a3;
                        }
                    } else {
                        c.get(i6).b(f3 - f, fArr, fArr2);
                        aVar2.g = this.g;
                        aVar2.c[i5] = new bs1(fArr[i2], fArr[1]);
                        aVar2.d[i5] = new bs1(fArr2[0], fArr2[1]);
                        aVar2.d[i5].o();
                        bs1 bs1Var = aVar2.e;
                        float f4 = bs1Var.a;
                        bs1[] bs1VarArr = aVar2.c;
                        if (f4 > bs1VarArr[i5].a) {
                            bs1Var.a = bs1VarArr[i5].a;
                        }
                        if (bs1Var.b > bs1VarArr[i5].b) {
                            bs1Var.b = bs1VarArr[i5].b;
                        }
                        bs1 bs1Var2 = aVar2.f;
                        if (bs1Var2.a < bs1VarArr[i5].a) {
                            bs1Var2.a = bs1VarArr[i5].a;
                        }
                        if (bs1Var2.b < bs1VarArr[i5].b) {
                            bs1Var2.b = bs1VarArr[i5].b;
                        }
                        i5++;
                        i2 = 0;
                    }
                }
                aVar2.a();
                this.f[i3] = aVar2;
            }
            i3++;
            strArr2 = strArr;
            i2 = 0;
        }
    }

    @Override // com.daaw.ge0
    public float k(RectF rectF, int i) {
        a[] aVarArr = this.f;
        if (aVarArr.length == 0 || aVarArr[0].c.length != i) {
            c(this.e, this.i, i);
        }
        int i2 = this.h;
        a[] aVarArr2 = this.f;
        a aVar = i2 < aVarArr2.length ? aVarArr2[i2] : null;
        if (aVar == null) {
            return 1.0f;
        }
        RectF rectF2 = this.c;
        bs1 bs1Var = aVar.e;
        rectF2.left = bs1Var.a;
        rectF2.top = bs1Var.b;
        bs1 bs1Var2 = aVar.f;
        rectF2.right = bs1Var2.a;
        rectF2.bottom = bs1Var2.b;
        return (aVar.d() / (this.c.width() > this.c.height() ? this.c.width() : this.c.height())) * (rectF.width() < rectF.height() ? rectF.width() : rectF.height()) * 0.5f * this.a;
    }

    @Override // com.daaw.zc0
    public void o(un unVar) {
        unVar.O("radius", this.a, "misc", 0.1f, 3.0f);
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
    public final void q(ve veVar, String[] strArr, int i) {
        if (veVar.a() != strArr.length) {
            lz1.c("charSet count don't match");
        }
        this.f = new a[Math.min(veVar.a(), strArr.length)];
        ?? pathMeasure = new PathMeasure();
        ArrayList arrayList = new ArrayList();
        float[] fArr = {0.0f, 0.0f};
        float[] fArr2 = {0.0f, 0.0f};
        ?? r7 = 0;
        int i2 = 0;
        while (i2 < this.f.length) {
            float f = 0.0f;
            this.g = 0.0f;
            arrayList.clear();
            Path d = u71.d(strArr[i2]);
            pathMeasure.setPath(d, r7);
            do {
                float length = pathMeasure.getLength();
                arrayList.add(Float.valueOf(length));
                this.g += length;
            } while (pathMeasure.nextContour());
            a aVar = new a(i);
            pathMeasure.setPath(d, r7);
            float f2 = this.g / i;
            aVar.a.add(Integer.valueOf((int) r7));
            int i3 = 0;
            while (true) {
                if (i3 < i) {
                    float f3 = i3 * f2;
                    float length2 = pathMeasure.getLength() + f;
                    if (f3 <= length2) {
                        pathMeasure.getPosTan(f3 - f, fArr, fArr2);
                        aVar.g = this.g;
                        aVar.c[i3] = new bs1(fArr[r7 == true ? 1 : 0], fArr[1]);
                        aVar.d[i3] = new bs1(fArr2[0], fArr2[1]);
                        aVar.d[i3].o();
                        bs1 bs1Var = aVar.e;
                        float f4 = bs1Var.a;
                        bs1[] bs1VarArr = aVar.c;
                        if (f4 > bs1VarArr[i3].a) {
                            bs1Var.a = bs1VarArr[i3].a;
                        }
                        if (bs1Var.b > bs1VarArr[i3].b) {
                            bs1Var.b = bs1VarArr[i3].b;
                        }
                        bs1 bs1Var2 = aVar.f;
                        if (bs1Var2.a < bs1VarArr[i3].a) {
                            bs1Var2.a = bs1VarArr[i3].a;
                        }
                        if (bs1Var2.b < bs1VarArr[i3].b) {
                            bs1Var2.b = bs1VarArr[i3].b;
                        }
                        i3++;
                        r7 = 0;
                    } else if (!pathMeasure.nextContour()) {
                        lz1.c("could get all points on path");
                        break;
                    } else {
                        aVar.a.add(Integer.valueOf(i3));
                        f = length2;
                    }
                }
            }
            aVar.a();
            this.f[i2] = aVar;
            i2++;
            r7 = 0;
        }
    }
}
