package com.daaw;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class ic1 {
    @Deprecated

    /* renamed from: a */
    public float f13453a;
    @Deprecated

    /* renamed from: b */
    public float f13454b;
    @Deprecated

    /* renamed from: c */
    public float f13455c;
    @Deprecated

    /* renamed from: d */
    public float f13456d;
    @Deprecated

    /* renamed from: e */
    public float f13457e;
    @Deprecated

    /* renamed from: f */
    public float f13458f;

    /* renamed from: g */
    public final List<AbstractC1681f> f13459g = new ArrayList();

    /* renamed from: h */
    public final List<AbstractC1682g> f13460h = new ArrayList();

    /* renamed from: i */
    public boolean f13461i;

    /* renamed from: com.daaw.ic1$a */
    /* loaded from: classes2.dex */
    public class C1676a extends AbstractC1682g {

        /* renamed from: b */
        public final /* synthetic */ List f13462b;

        /* renamed from: c */
        public final /* synthetic */ Matrix f13463c;

        public C1676a(List list, Matrix matrix) {
            this.f13462b = list;
            this.f13463c = matrix;
        }

        @Override // com.daaw.ic1.AbstractC1682g
        /* renamed from: a */
        public void mo19934a(Matrix matrix, ec1 ec1Var, int i, Canvas canvas) {
            for (AbstractC1682g abstractC1682g : this.f13462b) {
                abstractC1682g.mo19934a(this.f13463c, ec1Var, i, canvas);
            }
        }
    }

    /* renamed from: com.daaw.ic1$b */
    /* loaded from: classes2.dex */
    public static class C1677b extends AbstractC1682g {

        /* renamed from: b */
        public final C1679d f13465b;

        public C1677b(C1679d c1679d) {
            this.f13465b = c1679d;
        }

        @Override // com.daaw.ic1.AbstractC1682g
        /* renamed from: a */
        public void mo19934a(Matrix matrix, ec1 ec1Var, int i, Canvas canvas) {
            ec1Var.m23612a(canvas, matrix, new RectF(this.f13465b.m19950k(), this.f13465b.m19946o(), this.f13465b.m19949l(), this.f13465b.m19951j()), i, this.f13465b.m19948m(), this.f13465b.m19947n());
        }
    }

    /* renamed from: com.daaw.ic1$c */
    /* loaded from: classes2.dex */
    public static class C1678c extends AbstractC1682g {

        /* renamed from: b */
        public final C1680e f13466b;

        /* renamed from: c */
        public final float f13467c;

        /* renamed from: d */
        public final float f13468d;

        public C1678c(C1680e c1680e, float f, float f2) {
            this.f13466b = c1680e;
            this.f13467c = f;
            this.f13468d = f2;
        }

        @Override // com.daaw.ic1.AbstractC1682g
        /* renamed from: a */
        public void mo19934a(Matrix matrix, ec1 ec1Var, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f13466b.f13477c - this.f13468d, this.f13466b.f13476b - this.f13467c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f13467c, this.f13468d);
            matrix2.preRotate(m19960c());
            ec1Var.m23611b(canvas, matrix2, rectF, i);
        }

        /* renamed from: c */
        public float m19960c() {
            return (float) Math.toDegrees(Math.atan((this.f13466b.f13477c - this.f13468d) / (this.f13466b.f13476b - this.f13467c)));
        }
    }

    /* renamed from: com.daaw.ic1$d */
    /* loaded from: classes2.dex */
    public static class C1679d extends AbstractC1681f {

        /* renamed from: h */
        public static final RectF f13469h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f13470b;
        @Deprecated

        /* renamed from: c */
        public float f13471c;
        @Deprecated

        /* renamed from: d */
        public float f13472d;
        @Deprecated

        /* renamed from: e */
        public float f13473e;
        @Deprecated

        /* renamed from: f */
        public float f13474f;
        @Deprecated

        /* renamed from: g */
        public float f13475g;

        public C1679d(float f, float f2, float f3, float f4) {
            m19944q(f);
            m19940u(f2);
            m19943r(f3);
            m19945p(f4);
        }

        @Override // com.daaw.ic1.AbstractC1681f
        /* renamed from: a */
        public void mo19935a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f13478a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f13469h;
            rectF.set(m19950k(), m19946o(), m19949l(), m19951j());
            path.arcTo(rectF, m19948m(), m19947n(), false);
            path.transform(matrix);
        }

        /* renamed from: j */
        public final float m19951j() {
            return this.f13473e;
        }

        /* renamed from: k */
        public final float m19950k() {
            return this.f13470b;
        }

        /* renamed from: l */
        public final float m19949l() {
            return this.f13472d;
        }

        /* renamed from: m */
        public final float m19948m() {
            return this.f13474f;
        }

        /* renamed from: n */
        public final float m19947n() {
            return this.f13475g;
        }

        /* renamed from: o */
        public final float m19946o() {
            return this.f13471c;
        }

        /* renamed from: p */
        public final void m19945p(float f) {
            this.f13473e = f;
        }

        /* renamed from: q */
        public final void m19944q(float f) {
            this.f13470b = f;
        }

        /* renamed from: r */
        public final void m19943r(float f) {
            this.f13472d = f;
        }

        /* renamed from: s */
        public final void m19942s(float f) {
            this.f13474f = f;
        }

        /* renamed from: t */
        public final void m19941t(float f) {
            this.f13475g = f;
        }

        /* renamed from: u */
        public final void m19940u(float f) {
            this.f13471c = f;
        }
    }

    /* renamed from: com.daaw.ic1$e */
    /* loaded from: classes2.dex */
    public static class C1680e extends AbstractC1681f {

        /* renamed from: b */
        public float f13476b;

        /* renamed from: c */
        public float f13477c;

        @Override // com.daaw.ic1.AbstractC1681f
        /* renamed from: a */
        public void mo19935a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f13478a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f13476b, this.f13477c);
            path.transform(matrix);
        }
    }

    /* renamed from: com.daaw.ic1$f */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1681f {

        /* renamed from: a */
        public final Matrix f13478a = new Matrix();

        /* renamed from: a */
        public abstract void mo19935a(Matrix matrix, Path path);
    }

    /* renamed from: com.daaw.ic1$g */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1682g {

        /* renamed from: a */
        public static final Matrix f13479a = new Matrix();

        /* renamed from: a */
        public abstract void mo19934a(Matrix matrix, ec1 ec1Var, int i, Canvas canvas);

        /* renamed from: b */
        public final void m19933b(ec1 ec1Var, int i, Canvas canvas) {
            mo19934a(f13479a, ec1Var, i, canvas);
        }
    }

    public ic1() {
        m19968n(0.0f, 0.0f);
    }

    /* renamed from: a */
    public void m19981a(float f, float f2, float f3, float f4, float f5, float f6) {
        C1679d c1679d = new C1679d(f, f2, f3, f4);
        c1679d.m19942s(f5);
        c1679d.m19941t(f6);
        this.f13459g.add(c1679d);
        C1677b c1677b = new C1677b(c1679d);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        m19979c(c1677b, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = f7;
        m19964r(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m19963s(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    /* renamed from: b */
    public final void m19980b(float f) {
        if (m19975g() == f) {
            return;
        }
        float m19975g = ((f - m19975g()) + 360.0f) % 360.0f;
        if (m19975g > 180.0f) {
            return;
        }
        C1679d c1679d = new C1679d(m19973i(), m19972j(), m19973i(), m19972j());
        c1679d.m19942s(m19975g());
        c1679d.m19941t(m19975g);
        this.f13460h.add(new C1677b(c1679d));
        m19966p(f);
    }

    /* renamed from: c */
    public final void m19979c(AbstractC1682g abstractC1682g, float f, float f2) {
        m19980b(f);
        this.f13460h.add(abstractC1682g);
        m19966p(f2);
    }

    /* renamed from: d */
    public void m19978d(Matrix matrix, Path path) {
        int size = this.f13459g.size();
        for (int i = 0; i < size; i++) {
            this.f13459g.get(i).mo19935a(matrix, path);
        }
    }

    /* renamed from: e */
    public boolean m19977e() {
        return this.f13461i;
    }

    /* renamed from: f */
    public AbstractC1682g m19976f(Matrix matrix) {
        m19980b(m19974h());
        return new C1676a(new ArrayList(this.f13460h), new Matrix(matrix));
    }

    /* renamed from: g */
    public final float m19975g() {
        return this.f13457e;
    }

    /* renamed from: h */
    public final float m19974h() {
        return this.f13458f;
    }

    /* renamed from: i */
    public float m19973i() {
        return this.f13455c;
    }

    /* renamed from: j */
    public float m19972j() {
        return this.f13456d;
    }

    /* renamed from: k */
    public float m19971k() {
        return this.f13453a;
    }

    /* renamed from: l */
    public float m19970l() {
        return this.f13454b;
    }

    /* renamed from: m */
    public void m19969m(float f, float f2) {
        C1680e c1680e = new C1680e();
        c1680e.f13476b = f;
        c1680e.f13477c = f2;
        this.f13459g.add(c1680e);
        C1678c c1678c = new C1678c(c1680e, m19973i(), m19972j());
        m19979c(c1678c, c1678c.m19960c() + 270.0f, c1678c.m19960c() + 270.0f);
        m19964r(f);
        m19963s(f2);
    }

    /* renamed from: n */
    public void m19968n(float f, float f2) {
        m19967o(f, f2, 270.0f, 0.0f);
    }

    /* renamed from: o */
    public void m19967o(float f, float f2, float f3, float f4) {
        m19962t(f);
        m19961u(f2);
        m19964r(f);
        m19963s(f2);
        m19966p(f3);
        m19965q((f3 + f4) % 360.0f);
        this.f13459g.clear();
        this.f13460h.clear();
        this.f13461i = false;
    }

    /* renamed from: p */
    public final void m19966p(float f) {
        this.f13457e = f;
    }

    /* renamed from: q */
    public final void m19965q(float f) {
        this.f13458f = f;
    }

    /* renamed from: r */
    public final void m19964r(float f) {
        this.f13455c = f;
    }

    /* renamed from: s */
    public final void m19963s(float f) {
        this.f13456d = f;
    }

    /* renamed from: t */
    public final void m19962t(float f) {
        this.f13453a = f;
    }

    /* renamed from: u */
    public final void m19961u(float f) {
        this.f13454b = f;
    }
}
