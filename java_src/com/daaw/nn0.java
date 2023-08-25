package com.daaw;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import com.daaw.gc1;
import com.daaw.hc1;
import com.daaw.ic1;
import java.util.BitSet;
/* loaded from: classes2.dex */
public class nn0 extends Drawable implements ql1, jc1 {
    public static final String L = nn0.class.getSimpleName();
    public static final Paint M = new Paint(1);
    public final Region A;
    public gc1 B;
    public final Paint C;
    public final Paint D;
    public final ec1 E;
    public final hc1.b F;
    public final hc1 G;
    public PorterDuffColorFilter H;
    public PorterDuffColorFilter I;
    public final RectF J;
    public boolean K;
    public c p;
    public final ic1.g[] q;
    public final ic1.g[] r;
    public final BitSet s;
    public boolean t;
    public final Matrix u;
    public final Path v;
    public final Path w;
    public final RectF x;
    public final RectF y;
    public final Region z;

    /* loaded from: classes2.dex */
    public class a implements hc1.b {
        public a() {
        }

        @Override // com.daaw.hc1.b
        public void a(ic1 ic1Var, Matrix matrix, int i) {
            nn0.this.s.set(i, ic1Var.e());
            nn0.this.q[i] = ic1Var.f(matrix);
        }

        @Override // com.daaw.hc1.b
        public void b(ic1 ic1Var, Matrix matrix, int i) {
            nn0.this.s.set(i + 4, ic1Var.e());
            nn0.this.r[i] = ic1Var.f(matrix);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements gc1.c {
        public final /* synthetic */ float a;

        public b(float f) {
            this.a = f;
        }

        @Override // com.daaw.gc1.c
        public ll a(ll llVar) {
            return llVar instanceof o31 ? llVar : new g1(this.a, llVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends Drawable.ConstantState {
        public gc1 a;
        public yv b;
        public ColorFilter c;
        public ColorStateList d;
        public ColorStateList e;
        public ColorStateList f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public Rect i;
        public float j;
        public float k;
        public float l;
        public int m;
        public float n;
        public float o;
        public float p;
        public int q;
        public int r;
        public int s;
        public int t;
        public boolean u;
        public Paint.Style v;

        public c(gc1 gc1Var, yv yvVar) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = gc1Var;
            this.b = yvVar;
        }

        public c(c cVar) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = cVar.a;
            this.b = cVar.b;
            this.l = cVar.l;
            this.c = cVar.c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.h = cVar.h;
            this.g = cVar.g;
            this.m = cVar.m;
            this.j = cVar.j;
            this.s = cVar.s;
            this.q = cVar.q;
            this.u = cVar.u;
            this.k = cVar.k;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
            this.r = cVar.r;
            this.t = cVar.t;
            this.f = cVar.f;
            this.v = cVar.v;
            if (cVar.i != null) {
                this.i = new Rect(cVar.i);
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            nn0 nn0Var = new nn0(this, null);
            nn0Var.t = true;
            return nn0Var;
        }
    }

    public nn0() {
        this(new gc1());
    }

    public nn0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(gc1.e(context, attributeSet, i, i2).m());
    }

    public nn0(gc1 gc1Var) {
        this(new c(gc1Var, null));
    }

    public nn0(c cVar) {
        this.q = new ic1.g[4];
        this.r = new ic1.g[4];
        this.s = new BitSet(8);
        this.u = new Matrix();
        this.v = new Path();
        this.w = new Path();
        this.x = new RectF();
        this.y = new RectF();
        this.z = new Region();
        this.A = new Region();
        Paint paint = new Paint(1);
        this.C = paint;
        Paint paint2 = new Paint(1);
        this.D = paint2;
        this.E = new ec1();
        this.G = Looper.getMainLooper().getThread() == Thread.currentThread() ? hc1.k() : new hc1();
        this.J = new RectF();
        this.K = true;
        this.p = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = M;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        g0();
        f0(getState());
        this.F = new a();
    }

    public /* synthetic */ nn0(c cVar, a aVar) {
        this(cVar);
    }

    public static int R(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    public static nn0 m(Context context, float f) {
        int b2 = jn0.b(context, w01.colorSurface, nn0.class.getSimpleName());
        nn0 nn0Var = new nn0();
        nn0Var.M(context);
        nn0Var.W(ColorStateList.valueOf(b2));
        nn0Var.V(f);
        return nn0Var;
    }

    public int A() {
        c cVar;
        double d = this.p.s;
        double cos = Math.cos(Math.toRadians(cVar.t));
        Double.isNaN(d);
        return (int) (d * cos);
    }

    public int B() {
        return this.p.r;
    }

    public gc1 C() {
        return this.p.a;
    }

    public final float D() {
        if (L()) {
            return this.D.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public ColorStateList E() {
        return this.p.g;
    }

    public float F() {
        return this.p.a.r().a(u());
    }

    public float G() {
        return this.p.a.t().a(u());
    }

    public float H() {
        return this.p.p;
    }

    public float I() {
        return w() + H();
    }

    public final boolean J() {
        c cVar = this.p;
        int i = cVar.q;
        return i != 1 && cVar.r > 0 && (i == 2 || T());
    }

    public final boolean K() {
        Paint.Style style = this.p.v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    public final boolean L() {
        Paint.Style style = this.p.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.D.getStrokeWidth() > 0.0f;
    }

    public void M(Context context) {
        this.p.b = new yv(context);
        h0();
    }

    public final void N() {
        super.invalidateSelf();
    }

    public boolean O() {
        yv yvVar = this.p.b;
        return yvVar != null && yvVar.d();
    }

    public boolean P() {
        return this.p.a.u(u());
    }

    public final void Q(Canvas canvas) {
        if (J()) {
            canvas.save();
            S(canvas);
            if (this.K) {
                int width = (int) (this.J.width() - getBounds().width());
                int height = (int) (this.J.height() - getBounds().height());
                if (width < 0 || height < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap createBitmap = Bitmap.createBitmap(((int) this.J.width()) + (this.p.r * 2) + width, ((int) this.J.height()) + (this.p.r * 2) + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f = (getBounds().left - this.p.r) - width;
                float f2 = (getBounds().top - this.p.r) - height;
                canvas2.translate(-f, -f2);
                n(canvas2);
                canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
                createBitmap.recycle();
            } else {
                n(canvas);
            }
            canvas.restore();
        }
    }

    public final void S(Canvas canvas) {
        int z = z();
        int A = A();
        if (Build.VERSION.SDK_INT < 21 && this.K) {
            Rect clipBounds = canvas.getClipBounds();
            int i = this.p.r;
            clipBounds.inset(-i, -i);
            clipBounds.offset(z, A);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate(z, A);
    }

    public boolean T() {
        int i = Build.VERSION.SDK_INT;
        return i < 21 || !(P() || this.v.isConvex() || i >= 29);
    }

    public void U(ll llVar) {
        setShapeAppearanceModel(this.p.a.x(llVar));
    }

    public void V(float f) {
        c cVar = this.p;
        if (cVar.o != f) {
            cVar.o = f;
            h0();
        }
    }

    public void W(ColorStateList colorStateList) {
        c cVar = this.p;
        if (cVar.d != colorStateList) {
            cVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public void X(float f) {
        c cVar = this.p;
        if (cVar.k != f) {
            cVar.k = f;
            this.t = true;
            invalidateSelf();
        }
    }

    public void Y(int i, int i2, int i3, int i4) {
        c cVar = this.p;
        if (cVar.i == null) {
            cVar.i = new Rect();
        }
        this.p.i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    public void Z(float f) {
        c cVar = this.p;
        if (cVar.n != f) {
            cVar.n = f;
            h0();
        }
    }

    public void a0(int i) {
        c cVar = this.p;
        if (cVar.t != i) {
            cVar.t = i;
            N();
        }
    }

    public void b0(float f, int i) {
        e0(f);
        d0(ColorStateList.valueOf(i));
    }

    public void c0(float f, ColorStateList colorStateList) {
        e0(f);
        d0(colorStateList);
    }

    public void d0(ColorStateList colorStateList) {
        c cVar = this.p;
        if (cVar.e != colorStateList) {
            cVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.C.setColorFilter(this.H);
        int alpha = this.C.getAlpha();
        this.C.setAlpha(R(alpha, this.p.m));
        this.D.setColorFilter(this.I);
        this.D.setStrokeWidth(this.p.l);
        int alpha2 = this.D.getAlpha();
        this.D.setAlpha(R(alpha2, this.p.m));
        if (this.t) {
            i();
            g(u(), this.v);
            this.t = false;
        }
        Q(canvas);
        if (K()) {
            o(canvas);
        }
        if (L()) {
            r(canvas);
        }
        this.C.setAlpha(alpha);
        this.D.setAlpha(alpha2);
    }

    public void e0(float f) {
        this.p.l = f;
        invalidateSelf();
    }

    public final PorterDuffColorFilter f(Paint paint, boolean z) {
        int color;
        int l;
        if (!z || (l = l((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(l, PorterDuff.Mode.SRC_IN);
    }

    public final boolean f0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.p.d == null || color2 == (colorForState2 = this.p.d.getColorForState(iArr, (color2 = this.C.getColor())))) {
            z = false;
        } else {
            this.C.setColor(colorForState2);
            z = true;
        }
        if (this.p.e == null || color == (colorForState = this.p.e.getColorForState(iArr, (color = this.D.getColor())))) {
            return z;
        }
        this.D.setColor(colorForState);
        return true;
    }

    public final void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.p.j != 1.0f) {
            this.u.reset();
            Matrix matrix = this.u;
            float f = this.p.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.u);
        }
        path.computeBounds(this.J, true);
    }

    public final boolean g0() {
        PorterDuffColorFilter porterDuffColorFilter = this.H;
        PorterDuffColorFilter porterDuffColorFilter2 = this.I;
        c cVar = this.p;
        this.H = k(cVar.g, cVar.h, this.C, true);
        c cVar2 = this.p;
        this.I = k(cVar2.f, cVar2.h, this.D, false);
        c cVar3 = this.p;
        if (cVar3.u) {
            this.E.d(cVar3.g.getColorForState(getState(), 0));
        }
        return (pt0.a(porterDuffColorFilter, this.H) && pt0.a(porterDuffColorFilter2, this.I)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.p.q == 2) {
            return;
        }
        if (P()) {
            outline.setRoundRect(getBounds(), F() * this.p.k);
            return;
        }
        g(u(), this.v);
        if (this.v.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.v);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.p.i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.z.set(getBounds());
        g(u(), this.v);
        this.A.setPath(this.v, this.z);
        this.z.op(this.A, Region.Op.DIFFERENCE);
        return this.z;
    }

    public final void h(RectF rectF, Path path) {
        hc1 hc1Var = this.G;
        c cVar = this.p;
        hc1Var.e(cVar.a, cVar.k, rectF, this.F, path);
    }

    public final void h0() {
        float I = I();
        this.p.r = (int) Math.ceil(0.75f * I);
        this.p.s = (int) Math.ceil(I * 0.25f);
        g0();
        N();
    }

    public final void i() {
        gc1 y = C().y(new b(-D()));
        this.B = y;
        this.G.d(y, this.p.k, v(), this.w);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.t = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.p.g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.p.f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.p.e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.p.d) != null && colorStateList4.isStateful())));
    }

    public final PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = l(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? f(paint, z) : j(colorStateList, mode, z);
    }

    public int l(int i) {
        float I = I() + y();
        yv yvVar = this.p.b;
        return yvVar != null ? yvVar.c(i, I) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.p = new c(this.p);
        return this;
    }

    public final void n(Canvas canvas) {
        this.s.cardinality();
        if (this.p.s != 0) {
            canvas.drawPath(this.v, this.E.c());
        }
        for (int i = 0; i < 4; i++) {
            this.q[i].b(this.E, this.p.r, canvas);
            this.r[i].b(this.E, this.p.r, canvas);
        }
        if (this.K) {
            int z = z();
            int A = A();
            canvas.translate(-z, -A);
            canvas.drawPath(this.v, M);
            canvas.translate(z, A);
        }
    }

    public final void o(Canvas canvas) {
        q(canvas, this.C, this.v, this.p.a, u());
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.t = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = f0(iArr) || g0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.p.a, rectF);
    }

    public final void q(Canvas canvas, Paint paint, Path path, gc1 gc1Var, RectF rectF) {
        if (!gc1Var.u(rectF)) {
            canvas.drawPath(path, paint);
            return;
        }
        float a2 = gc1Var.t().a(rectF) * this.p.k;
        canvas.drawRoundRect(rectF, a2, a2, paint);
    }

    public final void r(Canvas canvas) {
        q(canvas, this.D, this.w, this.B, v());
    }

    public float s() {
        return this.p.a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        c cVar = this.p;
        if (cVar.m != i) {
            cVar.m = i;
            N();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.p.c = colorFilter;
        N();
    }

    @Override // com.daaw.jc1
    public void setShapeAppearanceModel(gc1 gc1Var) {
        this.p.a = gc1Var;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintList(ColorStateList colorStateList) {
        this.p.g = colorStateList;
        g0();
        N();
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.p;
        if (cVar.h != mode) {
            cVar.h = mode;
            g0();
            N();
        }
    }

    public float t() {
        return this.p.a.l().a(u());
    }

    public RectF u() {
        this.x.set(getBounds());
        return this.x;
    }

    public final RectF v() {
        this.y.set(u());
        float D = D();
        this.y.inset(D, D);
        return this.y;
    }

    public float w() {
        return this.p.o;
    }

    public ColorStateList x() {
        return this.p.d;
    }

    public float y() {
        return this.p.n;
    }

    public int z() {
        c cVar;
        double d = this.p.s;
        double sin = Math.sin(Math.toRadians(cVar.t));
        Double.isNaN(d);
        return (int) (d * sin);
    }
}
