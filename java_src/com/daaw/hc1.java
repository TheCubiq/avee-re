package com.daaw;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
/* loaded from: classes2.dex */
public class hc1 {

    /* renamed from: a */
    public final ic1[] f12375a = new ic1[4];

    /* renamed from: b */
    public final Matrix[] f12376b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f12377c = new Matrix[4];

    /* renamed from: d */
    public final PointF f12378d = new PointF();

    /* renamed from: e */
    public final Path f12379e = new Path();

    /* renamed from: f */
    public final Path f12380f = new Path();

    /* renamed from: g */
    public final ic1 f12381g = new ic1();

    /* renamed from: h */
    public final float[] f12382h = new float[2];

    /* renamed from: i */
    public final float[] f12383i = new float[2];

    /* renamed from: j */
    public final Path f12384j = new Path();

    /* renamed from: k */
    public final Path f12385k = new Path();

    /* renamed from: l */
    public boolean f12386l = true;

    /* renamed from: com.daaw.hc1$a */
    /* loaded from: classes2.dex */
    public static class C1527a {

        /* renamed from: a */
        public static final hc1 f12387a = new hc1();
    }

    /* renamed from: com.daaw.hc1$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC1528b {
        /* renamed from: a */
        void mo14960a(ic1 ic1Var, Matrix matrix, int i);

        /* renamed from: b */
        void mo14959b(ic1 ic1Var, Matrix matrix, int i);
    }

    /* renamed from: com.daaw.hc1$c */
    /* loaded from: classes2.dex */
    public static final class C1529c {

        /* renamed from: a */
        public final gc1 f12388a;

        /* renamed from: b */
        public final Path f12389b;

        /* renamed from: c */
        public final RectF f12390c;

        /* renamed from: d */
        public final InterfaceC1528b f12391d;

        /* renamed from: e */
        public final float f12392e;

        public C1529c(gc1 gc1Var, float f, RectF rectF, InterfaceC1528b interfaceC1528b, Path path) {
            this.f12391d = interfaceC1528b;
            this.f12388a = gc1Var;
            this.f12392e = f;
            this.f12390c = rectF;
            this.f12389b = path;
        }
    }

    public hc1() {
        for (int i = 0; i < 4; i++) {
            this.f12375a[i] = new ic1();
            this.f12376b[i] = new Matrix();
            this.f12377c[i] = new Matrix();
        }
    }

    /* renamed from: k */
    public static hc1 m20851k() {
        return C1527a.f12387a;
    }

    /* renamed from: a */
    public final float m20861a(int i) {
        return (i + 1) * 90;
    }

    /* renamed from: b */
    public final void m20860b(C1529c c1529c, int i) {
        this.f12382h[0] = this.f12375a[i].m19971k();
        this.f12382h[1] = this.f12375a[i].m19970l();
        this.f12376b[i].mapPoints(this.f12382h);
        Path path = c1529c.f12389b;
        float[] fArr = this.f12382h;
        if (i == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f12375a[i].m19978d(this.f12376b[i], c1529c.f12389b);
        InterfaceC1528b interfaceC1528b = c1529c.f12391d;
        if (interfaceC1528b != null) {
            interfaceC1528b.mo14960a(this.f12375a[i], this.f12376b[i], i);
        }
    }

    /* renamed from: c */
    public final void m20859c(C1529c c1529c, int i) {
        ic1 ic1Var;
        Matrix matrix;
        Path path;
        int i2 = (i + 1) % 4;
        this.f12382h[0] = this.f12375a[i].m19973i();
        this.f12382h[1] = this.f12375a[i].m19972j();
        this.f12376b[i].mapPoints(this.f12382h);
        this.f12383i[0] = this.f12375a[i2].m19971k();
        this.f12383i[1] = this.f12375a[i2].m19970l();
        this.f12376b[i2].mapPoints(this.f12383i);
        float[] fArr = this.f12382h;
        float f = fArr[0];
        float[] fArr2 = this.f12383i;
        float max = Math.max(((float) Math.hypot(f - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float m20853i = m20853i(c1529c.f12390c, i);
        this.f12381g.m19968n(0.0f, 0.0f);
        C2889rv m20852j = m20852j(i, c1529c.f12388a);
        m20852j.mo10931b(max, m20853i, c1529c.f12392e, this.f12381g);
        this.f12384j.reset();
        this.f12381g.m19978d(this.f12377c[i], this.f12384j);
        if (this.f12386l && (m20852j.m10932a() || m20850l(this.f12384j, i) || m20850l(this.f12384j, i2))) {
            Path path2 = this.f12384j;
            path2.op(path2, this.f12380f, Path.Op.DIFFERENCE);
            this.f12382h[0] = this.f12381g.m19971k();
            this.f12382h[1] = this.f12381g.m19970l();
            this.f12377c[i].mapPoints(this.f12382h);
            Path path3 = this.f12379e;
            float[] fArr3 = this.f12382h;
            path3.moveTo(fArr3[0], fArr3[1]);
            ic1Var = this.f12381g;
            matrix = this.f12377c[i];
            path = this.f12379e;
        } else {
            ic1Var = this.f12381g;
            matrix = this.f12377c[i];
            path = c1529c.f12389b;
        }
        ic1Var.m19978d(matrix, path);
        InterfaceC1528b interfaceC1528b = c1529c.f12391d;
        if (interfaceC1528b != null) {
            interfaceC1528b.mo14959b(this.f12381g, this.f12377c[i], i);
        }
    }

    /* renamed from: d */
    public void m20858d(gc1 gc1Var, float f, RectF rectF, Path path) {
        m20857e(gc1Var, f, rectF, null, path);
    }

    /* renamed from: e */
    public void m20857e(gc1 gc1Var, float f, RectF rectF, InterfaceC1528b interfaceC1528b, Path path) {
        path.rewind();
        this.f12379e.rewind();
        this.f12380f.rewind();
        this.f12380f.addRect(rectF, Path.Direction.CW);
        C1529c c1529c = new C1529c(gc1Var, f, rectF, interfaceC1528b, path);
        for (int i = 0; i < 4; i++) {
            m20849m(c1529c, i);
            m20848n(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m20860b(c1529c, i2);
            m20859c(c1529c, i2);
        }
        path.close();
        this.f12379e.close();
        if (this.f12379e.isEmpty()) {
            return;
        }
        path.op(this.f12379e, Path.Op.UNION);
    }

    /* renamed from: f */
    public final void m20856f(int i, RectF rectF, PointF pointF) {
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

    /* renamed from: g */
    public final InterfaceC2055ll m20855g(int i, gc1 gc1Var) {
        return i != 1 ? i != 2 ? i != 3 ? gc1Var.m21793t() : gc1Var.m21795r() : gc1Var.m21803j() : gc1Var.m21801l();
    }

    /* renamed from: h */
    public final C2193ml m20854h(int i, gc1 gc1Var) {
        return i != 1 ? i != 2 ? i != 3 ? gc1Var.m21794s() : gc1Var.m21796q() : gc1Var.m21804i() : gc1Var.m21802k();
    }

    /* renamed from: i */
    public final float m20853i(RectF rectF, int i) {
        float centerX;
        float f;
        float[] fArr = this.f12382h;
        ic1[] ic1VarArr = this.f12375a;
        fArr[0] = ic1VarArr[i].f13455c;
        fArr[1] = ic1VarArr[i].f13456d;
        this.f12376b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            centerX = rectF.centerX();
            f = this.f12382h[0];
        } else {
            centerX = rectF.centerY();
            f = this.f12382h[1];
        }
        return Math.abs(centerX - f);
    }

    /* renamed from: j */
    public final C2889rv m20852j(int i, gc1 gc1Var) {
        return i != 1 ? i != 2 ? i != 3 ? gc1Var.m21798o() : gc1Var.m21797p() : gc1Var.m21799n() : gc1Var.m21805h();
    }

    /* renamed from: l */
    public final boolean m20850l(Path path, int i) {
        this.f12385k.reset();
        this.f12375a[i].m19978d(this.f12376b[i], this.f12385k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f12385k.computeBounds(rectF, true);
        path.op(this.f12385k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* renamed from: m */
    public final void m20849m(C1529c c1529c, int i) {
        m20854h(i, c1529c.f12388a).m15982b(this.f12375a[i], 90.0f, c1529c.f12392e, c1529c.f12390c, m20855g(i, c1529c.f12388a));
        float m20861a = m20861a(i);
        this.f12376b[i].reset();
        m20856f(i, c1529c.f12390c, this.f12378d);
        Matrix matrix = this.f12376b[i];
        PointF pointF = this.f12378d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f12376b[i].preRotate(m20861a);
    }

    /* renamed from: n */
    public final void m20848n(int i) {
        this.f12382h[0] = this.f12375a[i].m19973i();
        this.f12382h[1] = this.f12375a[i].m19972j();
        this.f12376b[i].mapPoints(this.f12382h);
        float m20861a = m20861a(i);
        this.f12377c[i].reset();
        Matrix matrix = this.f12377c[i];
        float[] fArr = this.f12382h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f12377c[i].preRotate(m20861a);
    }
}
