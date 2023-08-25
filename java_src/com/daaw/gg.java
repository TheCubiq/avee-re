package com.daaw;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.daaw.nf1;
import com.daaw.sd;
/* loaded from: classes2.dex */
public final class gg {
    public static final boolean b0 = false;
    public static final Paint c0 = null;
    public boolean A;
    public Bitmap B;
    public Paint C;
    public float D;
    public float E;
    public int[] F;
    public boolean G;
    public final TextPaint H;
    public final TextPaint I;
    public TimeInterpolator J;
    public TimeInterpolator K;
    public float L;
    public float M;
    public float N;
    public ColorStateList O;
    public float P;
    public float Q;
    public float R;
    public ColorStateList S;
    public float T;
    public float U;
    public StaticLayout V;
    public float W;
    public float X;
    public float Y;
    public CharSequence Z;
    public final View a;
    public boolean b;
    public float c;
    public final Rect d;
    public final Rect e;
    public final RectF f;
    public ColorStateList k;
    public ColorStateList l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public Typeface s;
    public Typeface t;
    public Typeface u;
    public sd v;
    public sd w;
    public CharSequence x;
    public CharSequence y;
    public boolean z;
    public int g = 16;
    public int h = 16;
    public float i = 15.0f;
    public float j = 15.0f;
    public int a0 = 1;

    /* loaded from: classes2.dex */
    public class a implements sd.a {
        public a() {
        }

        @Override // com.daaw.sd.a
        public void a(Typeface typeface) {
            gg.this.M(typeface);
        }
    }

    public gg(View view) {
        this.a = view;
        TextPaint textPaint = new TextPaint(129);
        this.H = textPaint;
        this.I = new TextPaint(textPaint);
        this.e = new Rect();
        this.d = new Rect();
        this.f = new RectF();
    }

    public static float C(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return f3.a(f, f2, f3);
    }

    public static boolean F(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    public static int a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    public static boolean z(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    public final boolean A() {
        return xs1.E(this.a) == 1;
    }

    public final boolean B() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.l;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.k) != null && colorStateList.isStateful());
    }

    public void D() {
        this.b = this.e.width() > 0 && this.e.height() > 0 && this.d.width() > 0 && this.d.height() > 0;
    }

    public void E() {
        if (this.a.getHeight() <= 0 || this.a.getWidth() <= 0) {
            return;
        }
        b();
        d();
    }

    public void G(int i, int i2, int i3, int i4) {
        if (F(this.e, i, i2, i3, i4)) {
            return;
        }
        this.e.set(i, i2, i3, i4);
        this.G = true;
        D();
    }

    public void H(Rect rect) {
        G(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void I(int i) {
        ik1 ik1Var = new ik1(this.a.getContext(), i);
        ColorStateList colorStateList = ik1Var.a;
        if (colorStateList != null) {
            this.l = colorStateList;
        }
        float f = ik1Var.n;
        if (f != 0.0f) {
            this.j = f;
        }
        ColorStateList colorStateList2 = ik1Var.d;
        if (colorStateList2 != null) {
            this.O = colorStateList2;
        }
        this.M = ik1Var.i;
        this.N = ik1Var.j;
        this.L = ik1Var.k;
        this.T = ik1Var.m;
        sd sdVar = this.w;
        if (sdVar != null) {
            sdVar.c();
        }
        this.w = new sd(new a(), ik1Var.e());
        ik1Var.h(this.a.getContext(), this.w);
        E();
    }

    public final void J(float f) {
        this.W = f;
        xs1.i0(this.a);
    }

    public void K(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            E();
        }
    }

    public void L(int i) {
        if (this.h != i) {
            this.h = i;
            E();
        }
    }

    public void M(Typeface typeface) {
        if (N(typeface)) {
            E();
        }
    }

    public final boolean N(Typeface typeface) {
        sd sdVar = this.w;
        if (sdVar != null) {
            sdVar.c();
        }
        if (this.s != typeface) {
            this.s = typeface;
            return true;
        }
        return false;
    }

    public void O(int i, int i2, int i3, int i4) {
        if (F(this.d, i, i2, i3, i4)) {
            return;
        }
        this.d.set(i, i2, i3, i4);
        this.G = true;
        D();
    }

    public void P(Rect rect) {
        O(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void Q(float f) {
        this.X = f;
        xs1.i0(this.a);
    }

    public void R(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            E();
        }
    }

    public void S(int i) {
        if (this.g != i) {
            this.g = i;
            E();
        }
    }

    public void T(float f) {
        if (this.i != f) {
            this.i = f;
            E();
        }
    }

    public final boolean U(Typeface typeface) {
        sd sdVar = this.v;
        if (sdVar != null) {
            sdVar.c();
        }
        if (this.t != typeface) {
            this.t = typeface;
            return true;
        }
        return false;
    }

    public void V(float f) {
        float a2 = sn0.a(f, 0.0f, 1.0f);
        if (a2 != this.c) {
            this.c = a2;
            d();
        }
    }

    public final void W(float f) {
        g(f);
        boolean z = b0 && this.D != 1.0f;
        this.A = z;
        if (z) {
            l();
        }
        xs1.i0(this.a);
    }

    public void X(TimeInterpolator timeInterpolator) {
        this.J = timeInterpolator;
        E();
    }

    public final boolean Y(int[] iArr) {
        this.F = iArr;
        if (B()) {
            E();
            return true;
        }
        return false;
    }

    public void Z(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.x, charSequence)) {
            this.x = charSequence;
            this.y = null;
            h();
            E();
        }
    }

    public void a0(TimeInterpolator timeInterpolator) {
        this.K = timeInterpolator;
        E();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.gg.b():void");
    }

    public void b0(Typeface typeface) {
        boolean N = N(typeface);
        boolean U = U(typeface);
        if (N || U) {
            E();
        }
    }

    public float c() {
        if (this.x == null) {
            return 0.0f;
        }
        w(this.I);
        TextPaint textPaint = this.I;
        CharSequence charSequence = this.x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final boolean c0() {
        return (this.a0 <= 1 || this.z || this.A) ? false : true;
    }

    public final void d() {
        f(this.c);
    }

    public final boolean e(CharSequence charSequence) {
        return (A() ? mk1.d : mk1.c).a(charSequence, 0, charSequence.length());
    }

    public final void f(float f) {
        TextPaint textPaint;
        int r;
        y(f);
        this.q = C(this.o, this.p, f, this.J);
        this.r = C(this.m, this.n, f, this.J);
        W(C(this.i, this.j, f, this.K));
        TimeInterpolator timeInterpolator = f3.b;
        J(1.0f - C(0.0f, 1.0f, 1.0f - f, timeInterpolator));
        Q(C(1.0f, 0.0f, f, timeInterpolator));
        if (this.l != this.k) {
            textPaint = this.H;
            r = a(t(), r(), f);
        } else {
            textPaint = this.H;
            r = r();
        }
        textPaint.setColor(r);
        if (Build.VERSION.SDK_INT >= 21) {
            float f2 = this.T;
            float f3 = this.U;
            if (f2 != f3) {
                this.H.setLetterSpacing(C(f3, f2, f, timeInterpolator));
            } else {
                this.H.setLetterSpacing(f2);
            }
        }
        this.H.setShadowLayer(C(this.P, this.L, f, null), C(this.Q, this.M, f, null), C(this.R, this.N, f, null), a(s(this.S), s(this.O), f));
        xs1.i0(this.a);
    }

    public final void g(float f) {
        boolean z;
        float f2;
        boolean z2;
        if (this.x == null) {
            return;
        }
        float width = this.e.width();
        float width2 = this.d.width();
        if (z(f, this.j)) {
            f2 = this.j;
            this.D = 1.0f;
            Typeface typeface = this.u;
            Typeface typeface2 = this.s;
            if (typeface != typeface2) {
                this.u = typeface2;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            float f3 = this.i;
            Typeface typeface3 = this.u;
            Typeface typeface4 = this.t;
            if (typeface3 != typeface4) {
                this.u = typeface4;
                z = true;
            } else {
                z = false;
            }
            if (z(f, f3)) {
                this.D = 1.0f;
            } else {
                this.D = f / this.i;
            }
            float f4 = this.j / this.i;
            width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
            f2 = f3;
            z2 = z;
        }
        if (width > 0.0f) {
            z2 = this.E != f2 || this.G || z2;
            this.E = f2;
            this.G = false;
        }
        if (this.y == null || z2) {
            this.H.setTextSize(this.E);
            this.H.setTypeface(this.u);
            this.H.setLinearText(this.D != 1.0f);
            this.z = e(this.x);
            StaticLayout i = i(c0() ? this.a0 : 1, width, this.z);
            this.V = i;
            this.y = i.getText();
        }
    }

    public final void h() {
        Bitmap bitmap = this.B;
        if (bitmap != null) {
            bitmap.recycle();
            this.B = null;
        }
    }

    public final StaticLayout i(int i, float f, boolean z) {
        StaticLayout staticLayout;
        try {
            staticLayout = nf1.c(this.x, this.H, (int) f).e(TextUtils.TruncateAt.END).g(z).d(Layout.Alignment.ALIGN_NORMAL).f(false).h(i).a();
        } catch (nf1.a e) {
            e.getCause().getMessage();
            staticLayout = null;
        }
        return (StaticLayout) ty0.f(staticLayout);
    }

    public void j(Canvas canvas) {
        int save = canvas.save();
        if (this.y == null || !this.b) {
            return;
        }
        boolean z = false;
        float lineLeft = (this.q + this.V.getLineLeft(0)) - (this.Y * 2.0f);
        this.H.setTextSize(this.E);
        float f = this.q;
        float f2 = this.r;
        if (this.A && this.B != null) {
            z = true;
        }
        float f3 = this.D;
        if (f3 != 1.0f) {
            canvas.scale(f3, f3, f, f2);
        }
        if (z) {
            canvas.drawBitmap(this.B, f, f2, this.C);
            canvas.restoreToCount(save);
            return;
        }
        if (c0()) {
            k(canvas, lineLeft, f2);
        } else {
            canvas.translate(f, f2);
            this.V.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    public final void k(Canvas canvas, float f, float f2) {
        int alpha = this.H.getAlpha();
        canvas.translate(f, f2);
        float f3 = alpha;
        this.H.setAlpha((int) (this.X * f3));
        this.V.draw(canvas);
        this.H.setAlpha((int) (this.W * f3));
        int lineBaseline = this.V.getLineBaseline(0);
        CharSequence charSequence = this.Z;
        float f4 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, this.H);
        String trim = this.Z.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.H.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.V.getLineEnd(0), str.length()), 0.0f, f4, (Paint) this.H);
    }

    public final void l() {
        if (this.B != null || this.d.isEmpty() || TextUtils.isEmpty(this.y)) {
            return;
        }
        f(0.0f);
        int width = this.V.getWidth();
        int height = this.V.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.B = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.V.draw(new Canvas(this.B));
        if (this.C == null) {
            this.C = new Paint(3);
        }
    }

    public void m(RectF rectF, int i, int i2) {
        this.z = e(this.x);
        rectF.left = p(i, i2);
        rectF.top = this.e.top;
        rectF.right = q(rectF, i, i2);
        rectF.bottom = this.e.top + o();
    }

    public ColorStateList n() {
        return this.l;
    }

    public float o() {
        w(this.I);
        return -this.I.ascent();
    }

    public final float p(int i, int i2) {
        return (i2 == 17 || (i2 & 7) == 1) ? (i / 2.0f) - (c() / 2.0f) : ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.z ? this.e.left : this.e.right - c() : this.z ? this.e.right - c() : this.e.left;
    }

    public final float q(RectF rectF, int i, int i2) {
        return (i2 == 17 || (i2 & 7) == 1) ? (i / 2.0f) + (c() / 2.0f) : ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.z ? rectF.left + c() : this.e.right : this.z ? this.e.right : rectF.left + c();
    }

    public int r() {
        return s(this.l);
    }

    public final int s(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.F;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final int t() {
        return s(this.k);
    }

    public float u() {
        x(this.I);
        return -this.I.ascent();
    }

    public float v() {
        return this.c;
    }

    public final void w(TextPaint textPaint) {
        textPaint.setTextSize(this.j);
        textPaint.setTypeface(this.s);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.T);
        }
    }

    public final void x(TextPaint textPaint) {
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.t);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.U);
        }
    }

    public final void y(float f) {
        this.f.left = C(this.d.left, this.e.left, f, this.J);
        this.f.top = C(this.m, this.n, f, this.J);
        this.f.right = C(this.d.right, this.e.right, f, this.J);
        this.f.bottom = C(this.d.bottom, this.e.bottom, f, this.J);
    }
}
