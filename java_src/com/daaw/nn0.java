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

    /* renamed from: L */
    public static final String f20271L = nn0.class.getSimpleName();

    /* renamed from: M */
    public static final Paint f20272M = new Paint(1);

    /* renamed from: A */
    public final Region f20273A;

    /* renamed from: B */
    public gc1 f20274B;

    /* renamed from: C */
    public final Paint f20275C;

    /* renamed from: D */
    public final Paint f20276D;

    /* renamed from: E */
    public final ec1 f20277E;

    /* renamed from: F */
    public final hc1.InterfaceC1528b f20278F;

    /* renamed from: G */
    public final hc1 f20279G;

    /* renamed from: H */
    public PorterDuffColorFilter f20280H;

    /* renamed from: I */
    public PorterDuffColorFilter f20281I;

    /* renamed from: J */
    public final RectF f20282J;

    /* renamed from: K */
    public boolean f20283K;

    /* renamed from: p */
    public C2322c f20284p;

    /* renamed from: q */
    public final ic1.AbstractC1682g[] f20285q;

    /* renamed from: r */
    public final ic1.AbstractC1682g[] f20286r;

    /* renamed from: s */
    public final BitSet f20287s;

    /* renamed from: t */
    public boolean f20288t;

    /* renamed from: u */
    public final Matrix f20289u;

    /* renamed from: v */
    public final Path f20290v;

    /* renamed from: w */
    public final Path f20291w;

    /* renamed from: x */
    public final RectF f20292x;

    /* renamed from: y */
    public final RectF f20293y;

    /* renamed from: z */
    public final Region f20294z;

    /* renamed from: com.daaw.nn0$a */
    /* loaded from: classes2.dex */
    public class C2320a implements hc1.InterfaceC1528b {
        public C2320a() {
        }

        @Override // com.daaw.hc1.InterfaceC1528b
        /* renamed from: a */
        public void mo14960a(ic1 ic1Var, Matrix matrix, int i) {
            nn0.this.f20287s.set(i, ic1Var.m19977e());
            nn0.this.f20285q[i] = ic1Var.m19976f(matrix);
        }

        @Override // com.daaw.hc1.InterfaceC1528b
        /* renamed from: b */
        public void mo14959b(ic1 ic1Var, Matrix matrix, int i) {
            nn0.this.f20287s.set(i + 4, ic1Var.m19977e());
            nn0.this.f20286r[i] = ic1Var.m19976f(matrix);
        }
    }

    /* renamed from: com.daaw.nn0$b */
    /* loaded from: classes2.dex */
    public class C2321b implements gc1.InterfaceC1394c {

        /* renamed from: a */
        public final /* synthetic */ float f20296a;

        public C2321b(float f) {
            this.f20296a = f;
        }

        @Override // com.daaw.gc1.InterfaceC1394c
        /* renamed from: a */
        public InterfaceC2055ll mo14958a(InterfaceC2055ll interfaceC2055ll) {
            return interfaceC2055ll instanceof o31 ? interfaceC2055ll : new C1349g1(this.f20296a, interfaceC2055ll);
        }
    }

    /* renamed from: com.daaw.nn0$c */
    /* loaded from: classes2.dex */
    public static final class C2322c extends Drawable.ConstantState {

        /* renamed from: a */
        public gc1 f20298a;

        /* renamed from: b */
        public C3747yv f20299b;

        /* renamed from: c */
        public ColorFilter f20300c;

        /* renamed from: d */
        public ColorStateList f20301d;

        /* renamed from: e */
        public ColorStateList f20302e;

        /* renamed from: f */
        public ColorStateList f20303f;

        /* renamed from: g */
        public ColorStateList f20304g;

        /* renamed from: h */
        public PorterDuff.Mode f20305h;

        /* renamed from: i */
        public Rect f20306i;

        /* renamed from: j */
        public float f20307j;

        /* renamed from: k */
        public float f20308k;

        /* renamed from: l */
        public float f20309l;

        /* renamed from: m */
        public int f20310m;

        /* renamed from: n */
        public float f20311n;

        /* renamed from: o */
        public float f20312o;

        /* renamed from: p */
        public float f20313p;

        /* renamed from: q */
        public int f20314q;

        /* renamed from: r */
        public int f20315r;

        /* renamed from: s */
        public int f20316s;

        /* renamed from: t */
        public int f20317t;

        /* renamed from: u */
        public boolean f20318u;

        /* renamed from: v */
        public Paint.Style f20319v;

        public C2322c(gc1 gc1Var, C3747yv c3747yv) {
            this.f20301d = null;
            this.f20302e = null;
            this.f20303f = null;
            this.f20304g = null;
            this.f20305h = PorterDuff.Mode.SRC_IN;
            this.f20306i = null;
            this.f20307j = 1.0f;
            this.f20308k = 1.0f;
            this.f20310m = 255;
            this.f20311n = 0.0f;
            this.f20312o = 0.0f;
            this.f20313p = 0.0f;
            this.f20314q = 0;
            this.f20315r = 0;
            this.f20316s = 0;
            this.f20317t = 0;
            this.f20318u = false;
            this.f20319v = Paint.Style.FILL_AND_STROKE;
            this.f20298a = gc1Var;
            this.f20299b = c3747yv;
        }

        public C2322c(C2322c c2322c) {
            this.f20301d = null;
            this.f20302e = null;
            this.f20303f = null;
            this.f20304g = null;
            this.f20305h = PorterDuff.Mode.SRC_IN;
            this.f20306i = null;
            this.f20307j = 1.0f;
            this.f20308k = 1.0f;
            this.f20310m = 255;
            this.f20311n = 0.0f;
            this.f20312o = 0.0f;
            this.f20313p = 0.0f;
            this.f20314q = 0;
            this.f20315r = 0;
            this.f20316s = 0;
            this.f20317t = 0;
            this.f20318u = false;
            this.f20319v = Paint.Style.FILL_AND_STROKE;
            this.f20298a = c2322c.f20298a;
            this.f20299b = c2322c.f20299b;
            this.f20309l = c2322c.f20309l;
            this.f20300c = c2322c.f20300c;
            this.f20301d = c2322c.f20301d;
            this.f20302e = c2322c.f20302e;
            this.f20305h = c2322c.f20305h;
            this.f20304g = c2322c.f20304g;
            this.f20310m = c2322c.f20310m;
            this.f20307j = c2322c.f20307j;
            this.f20316s = c2322c.f20316s;
            this.f20314q = c2322c.f20314q;
            this.f20318u = c2322c.f20318u;
            this.f20308k = c2322c.f20308k;
            this.f20311n = c2322c.f20311n;
            this.f20312o = c2322c.f20312o;
            this.f20313p = c2322c.f20313p;
            this.f20315r = c2322c.f20315r;
            this.f20317t = c2322c.f20317t;
            this.f20303f = c2322c.f20303f;
            this.f20319v = c2322c.f20319v;
            if (c2322c.f20306i != null) {
                this.f20306i = new Rect(c2322c.f20306i);
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            nn0 nn0Var = new nn0(this, null);
            nn0Var.f20288t = true;
            return nn0Var;
        }
    }

    public nn0() {
        this(new gc1());
    }

    public nn0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(gc1.m21808e(context, attributeSet, i, i2).m21769m());
    }

    public nn0(gc1 gc1Var) {
        this(new C2322c(gc1Var, null));
    }

    public nn0(C2322c c2322c) {
        this.f20285q = new ic1.AbstractC1682g[4];
        this.f20286r = new ic1.AbstractC1682g[4];
        this.f20287s = new BitSet(8);
        this.f20289u = new Matrix();
        this.f20290v = new Path();
        this.f20291w = new Path();
        this.f20292x = new RectF();
        this.f20293y = new RectF();
        this.f20294z = new Region();
        this.f20273A = new Region();
        Paint paint = new Paint(1);
        this.f20275C = paint;
        Paint paint2 = new Paint(1);
        this.f20276D = paint2;
        this.f20277E = new ec1();
        this.f20279G = Looper.getMainLooper().getThread() == Thread.currentThread() ? hc1.m20851k() : new hc1();
        this.f20282J = new RectF();
        this.f20283K = true;
        this.f20284p = c2322c;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f20272M;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m14981g0();
        m14983f0(getState());
        this.f20278F = new C2320a();
    }

    public /* synthetic */ nn0(C2322c c2322c, C2320a c2320a) {
        this(c2322c);
    }

    /* renamed from: R */
    public static int m15002R(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* renamed from: m */
    public static nn0 m14974m(Context context, float f) {
        int m18397b = jn0.m18397b(context, w01.colorSurface, nn0.class.getSimpleName());
        nn0 nn0Var = new nn0();
        nn0Var.m15007M(context);
        nn0Var.m14997W(ColorStateList.valueOf(m18397b));
        nn0Var.m14998V(f);
        return nn0Var;
    }

    /* renamed from: A */
    public int m15019A() {
        C2322c c2322c;
        double d = this.f20284p.f20316s;
        double cos = Math.cos(Math.toRadians(c2322c.f20317t));
        Double.isNaN(d);
        return (int) (d * cos);
    }

    /* renamed from: B */
    public int m15018B() {
        return this.f20284p.f20315r;
    }

    /* renamed from: C */
    public gc1 m15017C() {
        return this.f20284p.f20298a;
    }

    /* renamed from: D */
    public final float m15016D() {
        if (m15008L()) {
            return this.f20276D.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: E */
    public ColorStateList m15015E() {
        return this.f20284p.f20304g;
    }

    /* renamed from: F */
    public float m15014F() {
        return this.f20284p.f20298a.m21795r().mo14583a(m14966u());
    }

    /* renamed from: G */
    public float m15013G() {
        return this.f20284p.f20298a.m21793t().mo14583a(m14966u());
    }

    /* renamed from: H */
    public float m15012H() {
        return this.f20284p.f20313p;
    }

    /* renamed from: I */
    public float m15011I() {
        return m14964w() + m15012H();
    }

    /* renamed from: J */
    public final boolean m15010J() {
        C2322c c2322c = this.f20284p;
        int i = c2322c.f20314q;
        return i != 1 && c2322c.f20315r > 0 && (i == 2 || m15000T());
    }

    /* renamed from: K */
    public final boolean m15009K() {
        Paint.Style style = this.f20284p.f20319v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* renamed from: L */
    public final boolean m15008L() {
        Paint.Style style = this.f20284p.f20319v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f20276D.getStrokeWidth() > 0.0f;
    }

    /* renamed from: M */
    public void m15007M(Context context) {
        this.f20284p.f20299b = new C3747yv(context);
        m14979h0();
    }

    /* renamed from: N */
    public final void m15006N() {
        super.invalidateSelf();
    }

    /* renamed from: O */
    public boolean m15005O() {
        C3747yv c3747yv = this.f20284p.f20299b;
        return c3747yv != null && c3747yv.m3211d();
    }

    /* renamed from: P */
    public boolean m15004P() {
        return this.f20284p.f20298a.m21792u(m14966u());
    }

    /* renamed from: Q */
    public final void m15003Q(Canvas canvas) {
        if (m15010J()) {
            canvas.save();
            m15001S(canvas);
            if (this.f20283K) {
                int width = (int) (this.f20282J.width() - getBounds().width());
                int height = (int) (this.f20282J.height() - getBounds().height());
                if (width < 0 || height < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap createBitmap = Bitmap.createBitmap(((int) this.f20282J.width()) + (this.f20284p.f20315r * 2) + width, ((int) this.f20282J.height()) + (this.f20284p.f20315r * 2) + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f = (getBounds().left - this.f20284p.f20315r) - width;
                float f2 = (getBounds().top - this.f20284p.f20315r) - height;
                canvas2.translate(-f, -f2);
                m14973n(canvas2);
                canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
                createBitmap.recycle();
            } else {
                m14973n(canvas);
            }
            canvas.restore();
        }
    }

    /* renamed from: S */
    public final void m15001S(Canvas canvas) {
        int m14961z = m14961z();
        int m15019A = m15019A();
        if (Build.VERSION.SDK_INT < 21 && this.f20283K) {
            Rect clipBounds = canvas.getClipBounds();
            int i = this.f20284p.f20315r;
            clipBounds.inset(-i, -i);
            clipBounds.offset(m14961z, m15019A);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate(m14961z, m15019A);
    }

    /* renamed from: T */
    public boolean m15000T() {
        int i = Build.VERSION.SDK_INT;
        return i < 21 || !(m15004P() || this.f20290v.isConvex() || i >= 29);
    }

    /* renamed from: U */
    public void m14999U(InterfaceC2055ll interfaceC2055ll) {
        setShapeAppearanceModel(this.f20284p.f20298a.m21789x(interfaceC2055ll));
    }

    /* renamed from: V */
    public void m14998V(float f) {
        C2322c c2322c = this.f20284p;
        if (c2322c.f20312o != f) {
            c2322c.f20312o = f;
            m14979h0();
        }
    }

    /* renamed from: W */
    public void m14997W(ColorStateList colorStateList) {
        C2322c c2322c = this.f20284p;
        if (c2322c.f20301d != colorStateList) {
            c2322c.f20301d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: X */
    public void m14996X(float f) {
        C2322c c2322c = this.f20284p;
        if (c2322c.f20308k != f) {
            c2322c.f20308k = f;
            this.f20288t = true;
            invalidateSelf();
        }
    }

    /* renamed from: Y */
    public void m14995Y(int i, int i2, int i3, int i4) {
        C2322c c2322c = this.f20284p;
        if (c2322c.f20306i == null) {
            c2322c.f20306i = new Rect();
        }
        this.f20284p.f20306i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    /* renamed from: Z */
    public void m14994Z(float f) {
        C2322c c2322c = this.f20284p;
        if (c2322c.f20311n != f) {
            c2322c.f20311n = f;
            m14979h0();
        }
    }

    /* renamed from: a0 */
    public void m14993a0(int i) {
        C2322c c2322c = this.f20284p;
        if (c2322c.f20317t != i) {
            c2322c.f20317t = i;
            m15006N();
        }
    }

    /* renamed from: b0 */
    public void m14991b0(float f, int i) {
        m14985e0(f);
        m14987d0(ColorStateList.valueOf(i));
    }

    /* renamed from: c0 */
    public void m14989c0(float f, ColorStateList colorStateList) {
        m14985e0(f);
        m14987d0(colorStateList);
    }

    /* renamed from: d0 */
    public void m14987d0(ColorStateList colorStateList) {
        C2322c c2322c = this.f20284p;
        if (c2322c.f20302e != colorStateList) {
            c2322c.f20302e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f20275C.setColorFilter(this.f20280H);
        int alpha = this.f20275C.getAlpha();
        this.f20275C.setAlpha(m15002R(alpha, this.f20284p.f20310m));
        this.f20276D.setColorFilter(this.f20281I);
        this.f20276D.setStrokeWidth(this.f20284p.f20309l);
        int alpha2 = this.f20276D.getAlpha();
        this.f20276D.setAlpha(m15002R(alpha2, this.f20284p.f20310m));
        if (this.f20288t) {
            m14978i();
            m14982g(m14966u(), this.f20290v);
            this.f20288t = false;
        }
        m15003Q(canvas);
        if (m15009K()) {
            m14972o(canvas);
        }
        if (m15008L()) {
            m14969r(canvas);
        }
        this.f20275C.setAlpha(alpha);
        this.f20276D.setAlpha(alpha2);
    }

    /* renamed from: e0 */
    public void m14985e0(float f) {
        this.f20284p.f20309l = f;
        invalidateSelf();
    }

    /* renamed from: f */
    public final PorterDuffColorFilter m14984f(Paint paint, boolean z) {
        int color;
        int m14975l;
        if (!z || (m14975l = m14975l((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(m14975l, PorterDuff.Mode.SRC_IN);
    }

    /* renamed from: f0 */
    public final boolean m14983f0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f20284p.f20301d == null || color2 == (colorForState2 = this.f20284p.f20301d.getColorForState(iArr, (color2 = this.f20275C.getColor())))) {
            z = false;
        } else {
            this.f20275C.setColor(colorForState2);
            z = true;
        }
        if (this.f20284p.f20302e == null || color == (colorForState = this.f20284p.f20302e.getColorForState(iArr, (color = this.f20276D.getColor())))) {
            return z;
        }
        this.f20276D.setColor(colorForState);
        return true;
    }

    /* renamed from: g */
    public final void m14982g(RectF rectF, Path path) {
        m14980h(rectF, path);
        if (this.f20284p.f20307j != 1.0f) {
            this.f20289u.reset();
            Matrix matrix = this.f20289u;
            float f = this.f20284p.f20307j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f20289u);
        }
        path.computeBounds(this.f20282J, true);
    }

    /* renamed from: g0 */
    public final boolean m14981g0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f20280H;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f20281I;
        C2322c c2322c = this.f20284p;
        this.f20280H = m14976k(c2322c.f20304g, c2322c.f20305h, this.f20275C, true);
        C2322c c2322c2 = this.f20284p;
        this.f20281I = m14976k(c2322c2.f20303f, c2322c2.f20305h, this.f20276D, false);
        C2322c c2322c3 = this.f20284p;
        if (c2322c3.f20318u) {
            this.f20277E.m23609d(c2322c3.f20304g.getColorForState(getState(), 0));
        }
        return (pt0.m13160a(porterDuffColorFilter, this.f20280H) && pt0.m13160a(porterDuffColorFilter2, this.f20281I)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f20284p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f20284p.f20314q == 2) {
            return;
        }
        if (m15004P()) {
            outline.setRoundRect(getBounds(), m15014F() * this.f20284p.f20308k);
            return;
        }
        m14982g(m14966u(), this.f20290v);
        if (this.f20290v.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f20290v);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f20284p.f20306i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f20294z.set(getBounds());
        m14982g(m14966u(), this.f20290v);
        this.f20273A.setPath(this.f20290v, this.f20294z);
        this.f20294z.op(this.f20273A, Region.Op.DIFFERENCE);
        return this.f20294z;
    }

    /* renamed from: h */
    public final void m14980h(RectF rectF, Path path) {
        hc1 hc1Var = this.f20279G;
        C2322c c2322c = this.f20284p;
        hc1Var.m20857e(c2322c.f20298a, c2322c.f20308k, rectF, this.f20278F, path);
    }

    /* renamed from: h0 */
    public final void m14979h0() {
        float m15011I = m15011I();
        this.f20284p.f20315r = (int) Math.ceil(0.75f * m15011I);
        this.f20284p.f20316s = (int) Math.ceil(m15011I * 0.25f);
        m14981g0();
        m15006N();
    }

    /* renamed from: i */
    public final void m14978i() {
        gc1 m21788y = m15017C().m21788y(new C2321b(-m15016D()));
        this.f20274B = m21788y;
        this.f20279G.m20858d(m21788y, this.f20284p.f20308k, m14965v(), this.f20291w);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f20288t = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f20284p.f20304g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f20284p.f20303f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f20284p.f20302e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f20284p.f20301d) != null && colorStateList4.isStateful())));
    }

    /* renamed from: j */
    public final PorterDuffColorFilter m14977j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = m14975l(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: k */
    public final PorterDuffColorFilter m14976k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? m14984f(paint, z) : m14977j(colorStateList, mode, z);
    }

    /* renamed from: l */
    public int m14975l(int i) {
        float m15011I = m15011I() + m14962y();
        C3747yv c3747yv = this.f20284p.f20299b;
        return c3747yv != null ? c3747yv.m3212c(i, m15011I) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f20284p = new C2322c(this.f20284p);
        return this;
    }

    /* renamed from: n */
    public final void m14973n(Canvas canvas) {
        this.f20287s.cardinality();
        if (this.f20284p.f20316s != 0) {
            canvas.drawPath(this.f20290v, this.f20277E.m23610c());
        }
        for (int i = 0; i < 4; i++) {
            this.f20285q[i].m19933b(this.f20277E, this.f20284p.f20315r, canvas);
            this.f20286r[i].m19933b(this.f20277E, this.f20284p.f20315r, canvas);
        }
        if (this.f20283K) {
            int m14961z = m14961z();
            int m15019A = m15019A();
            canvas.translate(-m14961z, -m15019A);
            canvas.drawPath(this.f20290v, f20272M);
            canvas.translate(m14961z, m15019A);
        }
    }

    /* renamed from: o */
    public final void m14972o(Canvas canvas) {
        m14970q(canvas, this.f20275C, this.f20290v, this.f20284p.f20298a, m14966u());
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f20288t = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = m14983f0(iArr) || m14981g0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: p */
    public void m14971p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m14970q(canvas, paint, path, this.f20284p.f20298a, rectF);
    }

    /* renamed from: q */
    public final void m14970q(Canvas canvas, Paint paint, Path path, gc1 gc1Var, RectF rectF) {
        if (!gc1Var.m21792u(rectF)) {
            canvas.drawPath(path, paint);
            return;
        }
        float mo14583a = gc1Var.m21793t().mo14583a(rectF) * this.f20284p.f20308k;
        canvas.drawRoundRect(rectF, mo14583a, mo14583a, paint);
    }

    /* renamed from: r */
    public final void m14969r(Canvas canvas) {
        m14970q(canvas, this.f20276D, this.f20291w, this.f20274B, m14965v());
    }

    /* renamed from: s */
    public float m14968s() {
        return this.f20284p.f20298a.m21803j().mo14583a(m14966u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C2322c c2322c = this.f20284p;
        if (c2322c.f20310m != i) {
            c2322c.f20310m = i;
            m15006N();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f20284p.f20300c = colorFilter;
        m15006N();
    }

    @Override // com.daaw.jc1
    public void setShapeAppearanceModel(gc1 gc1Var) {
        this.f20284p.f20298a = gc1Var;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintList(ColorStateList colorStateList) {
        this.f20284p.f20304g = colorStateList;
        m14981g0();
        m15006N();
    }

    @Override // android.graphics.drawable.Drawable, com.daaw.ql1
    public void setTintMode(PorterDuff.Mode mode) {
        C2322c c2322c = this.f20284p;
        if (c2322c.f20305h != mode) {
            c2322c.f20305h = mode;
            m14981g0();
            m15006N();
        }
    }

    /* renamed from: t */
    public float m14967t() {
        return this.f20284p.f20298a.m21801l().mo14583a(m14966u());
    }

    /* renamed from: u */
    public RectF m14966u() {
        this.f20292x.set(getBounds());
        return this.f20292x;
    }

    /* renamed from: v */
    public final RectF m14965v() {
        this.f20293y.set(m14966u());
        float m15016D = m15016D();
        this.f20293y.inset(m15016D, m15016D);
        return this.f20293y;
    }

    /* renamed from: w */
    public float m14964w() {
        return this.f20284p.f20312o;
    }

    /* renamed from: x */
    public ColorStateList m14963x() {
        return this.f20284p.f20301d;
    }

    /* renamed from: y */
    public float m14962y() {
        return this.f20284p.f20311n;
    }

    /* renamed from: z */
    public int m14961z() {
        C2322c c2322c;
        double d = this.f20284p.f20316s;
        double sin = Math.sin(Math.toRadians(c2322c.f20317t));
        Double.isNaN(d);
        return (int) (d * sin);
    }
}
