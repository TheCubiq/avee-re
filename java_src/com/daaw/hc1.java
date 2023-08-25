package com.daaw;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
/* loaded from: classes2.dex */
public class hc1 {
    public final ic1[] a = new ic1[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final ic1 g = new ic1();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public boolean l = true;

    /* loaded from: classes2.dex */
    public static class a {
        public static final hc1 a = new hc1();
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(ic1 ic1Var, Matrix matrix, int i);

        void b(ic1 ic1Var, Matrix matrix, int i);
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public final gc1 a;
        public final Path b;
        public final RectF c;
        public final b d;
        public final float e;

        public c(gc1 gc1Var, float f, RectF rectF, b bVar, Path path) {
            this.d = bVar;
            this.a = gc1Var;
            this.e = f;
            this.c = rectF;
            this.b = path;
        }
    }

    public hc1() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new ic1();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    public static hc1 k() {
        return a.a;
    }

    public final float a(int i) {
        return (i + 1) * 90;
    }

    public final void b(c cVar, int i) {
        this.h[0] = this.a[i].k();
        this.h[1] = this.a[i].l();
        this.b[i].mapPoints(this.h);
        Path path = cVar.b;
        float[] fArr = this.h;
        if (i == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.a[i].d(this.b[i], cVar.b);
        b bVar = cVar.d;
        if (bVar != null) {
            bVar.a(this.a[i], this.b[i], i);
        }
    }

    public final void c(c cVar, int i) {
        ic1 ic1Var;
        Matrix matrix;
        Path path;
        int i2 = (i + 1) % 4;
        this.h[0] = this.a[i].i();
        this.h[1] = this.a[i].j();
        this.b[i].mapPoints(this.h);
        this.i[0] = this.a[i2].k();
        this.i[1] = this.a[i2].l();
        this.b[i2].mapPoints(this.i);
        float[] fArr = this.h;
        float f = fArr[0];
        float[] fArr2 = this.i;
        float max = Math.max(((float) Math.hypot(f - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float i3 = i(cVar.c, i);
        this.g.n(0.0f, 0.0f);
        rv j = j(i, cVar.a);
        j.b(max, i3, cVar.e, this.g);
        this.j.reset();
        this.g.d(this.c[i], this.j);
        if (this.l && (j.a() || l(this.j, i) || l(this.j, i2))) {
            Path path2 = this.j;
            path2.op(path2, this.f, Path.Op.DIFFERENCE);
            this.h[0] = this.g.k();
            this.h[1] = this.g.l();
            this.c[i].mapPoints(this.h);
            Path path3 = this.e;
            float[] fArr3 = this.h;
            path3.moveTo(fArr3[0], fArr3[1]);
            ic1Var = this.g;
            matrix = this.c[i];
            path = this.e;
        } else {
            ic1Var = this.g;
            matrix = this.c[i];
            path = cVar.b;
        }
        ic1Var.d(matrix, path);
        b bVar = cVar.d;
        if (bVar != null) {
            bVar.b(this.g, this.c[i], i);
        }
    }

    public void d(gc1 gc1Var, float f, RectF rectF, Path path) {
        e(gc1Var, f, rectF, null, path);
    }

    public void e(gc1 gc1Var, float f, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(gc1Var, f, rectF, bVar, path);
        for (int i = 0; i < 4; i++) {
            m(cVar, i);
            n(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            b(cVar, i2);
            c(cVar, i2);
        }
        path.close();
        this.e.close();
        if (this.e.isEmpty()) {
            return;
        }
        path.op(this.e, Path.Op.UNION);
    }

    public final void f(int i, RectF rectF, PointF pointF) {
        float f;
        float f2;
        if (i == 1) {
            f = rectF.right;
        } else if (i != 2) {
            f = i != 3 ? rectF.right : rectF.left;
            f2 = rectF.top;
            pointF.set(f, f2);
        } else {
            f = rectF.left;
        }
        f2 = rectF.bottom;
        pointF.set(f, f2);
    }

    public final ll g(int i, gc1 gc1Var) {
        return i != 1 ? i != 2 ? i != 3 ? gc1Var.t() : gc1Var.r() : gc1Var.j() : gc1Var.l();
    }

    public final ml h(int i, gc1 gc1Var) {
        return i != 1 ? i != 2 ? i != 3 ? gc1Var.s() : gc1Var.q() : gc1Var.i() : gc1Var.k();
    }

    public final float i(RectF rectF, int i) {
        float centerX;
        float f;
        float[] fArr = this.h;
        ic1[] ic1VarArr = this.a;
        fArr[0] = ic1VarArr[i].c;
        fArr[1] = ic1VarArr[i].d;
        this.b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            centerX = rectF.centerX();
            f = this.h[0];
        } else {
            centerX = rectF.centerY();
            f = this.h[1];
        }
        return Math.abs(centerX - f);
    }

    public final rv j(int i, gc1 gc1Var) {
        return i != 1 ? i != 2 ? i != 3 ? gc1Var.o() : gc1Var.p() : gc1Var.n() : gc1Var.h();
    }

    public final boolean l(Path path, int i) {
        this.k.reset();
        this.a[i].d(this.b[i], this.k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.k.computeBounds(rectF, true);
        path.op(this.k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    public final void m(c cVar, int i) {
        h(i, cVar.a).b(this.a[i], 90.0f, cVar.e, cVar.c, g(i, cVar.a));
        float a2 = a(i);
        this.b[i].reset();
        f(i, cVar.c, this.d);
        Matrix matrix = this.b[i];
        PointF pointF = this.d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.b[i].preRotate(a2);
    }

    public final void n(int i) {
        this.h[0] = this.a[i].i();
        this.h[1] = this.a[i].j();
        this.b[i].mapPoints(this.h);
        float a2 = a(i);
        this.c[i].reset();
        Matrix matrix = this.c[i];
        float[] fArr = this.h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.c[i].preRotate(a2);
    }
}
