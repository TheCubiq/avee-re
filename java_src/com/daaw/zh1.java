package com.daaw;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class zh1 {
    public float A;
    public float B;
    public int C;
    public int D;
    public int E;
    public int F;
    public StaticLayout G;
    public int H;
    public int I;
    public int J;
    public Rect K;
    public final RectF a = new RectF();
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final TextPaint h;
    public final Paint i;
    public CharSequence j;
    public Layout.Alignment k;
    public Bitmap l;
    public float m;
    public int n;
    public int o;
    public float p;
    public int q;
    public float r;
    public float s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public zh1(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.b = round;
        this.c = round;
        this.d = round;
        this.e = round;
        TextPaint textPaint = new TextPaint();
        this.h = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.i = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    public void b(ln lnVar, boolean z, boolean z2, zd zdVar, float f, float f2, Canvas canvas, int i, int i2, int i3, int i4) {
        boolean z3 = lnVar.r == null;
        int i5 = -16777216;
        if (z3) {
            if (TextUtils.isEmpty(lnVar.p)) {
                return;
            }
            i5 = (lnVar.z && z) ? lnVar.A : zdVar.c;
        }
        if (a(this.j, lnVar.p) && sq1.b(this.k, lnVar.q) && this.l == lnVar.r && this.m == lnVar.s && this.n == lnVar.t && sq1.b(Integer.valueOf(this.o), Integer.valueOf(lnVar.u)) && this.p == lnVar.v && sq1.b(Integer.valueOf(this.q), Integer.valueOf(lnVar.w)) && this.r == lnVar.x && this.s == lnVar.y && this.t == z && this.u == z2 && this.v == zdVar.a && this.w == zdVar.b && this.x == i5 && this.z == zdVar.d && this.y == zdVar.e && sq1.b(this.h.getTypeface(), zdVar.f) && this.A == f && this.B == f2 && this.C == i && this.D == i2 && this.E == i3 && this.F == i4) {
            d(canvas, z3);
            return;
        }
        this.j = lnVar.p;
        this.k = lnVar.q;
        this.l = lnVar.r;
        this.m = lnVar.s;
        this.n = lnVar.t;
        this.o = lnVar.u;
        this.p = lnVar.v;
        this.q = lnVar.w;
        this.r = lnVar.x;
        this.s = lnVar.y;
        this.t = z;
        this.u = z2;
        this.v = zdVar.a;
        this.w = zdVar.b;
        this.x = i5;
        this.z = zdVar.d;
        this.y = zdVar.e;
        this.h.setTypeface(zdVar.f);
        this.A = f;
        this.B = f2;
        this.C = i;
        this.D = i2;
        this.E = i3;
        this.F = i4;
        if (z3) {
            g();
        } else {
            f();
        }
        d(canvas, z3);
    }

    public final void c(Canvas canvas) {
        canvas.drawBitmap(this.l, (Rect) null, this.K, (Paint) null);
    }

    public final void d(Canvas canvas, boolean z) {
        if (z) {
            e(canvas);
        } else {
            c(canvas);
        }
    }

    public final void e(Canvas canvas) {
        StaticLayout staticLayout = this.G;
        if (staticLayout == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.H, this.I);
        if (Color.alpha(this.x) > 0) {
            this.i.setColor(this.x);
            canvas.drawRect(-this.J, 0.0f, staticLayout.getWidth() + this.J, staticLayout.getHeight(), this.i);
        }
        if (Color.alpha(this.w) > 0) {
            this.i.setColor(this.w);
            float lineTop = staticLayout.getLineTop(0);
            int lineCount = staticLayout.getLineCount();
            int i = 0;
            while (i < lineCount) {
                float lineLeft = staticLayout.getLineLeft(i);
                float lineRight = staticLayout.getLineRight(i);
                RectF rectF = this.a;
                int i2 = this.J;
                rectF.left = lineLeft - i2;
                rectF.right = i2 + lineRight;
                rectF.top = lineTop;
                rectF.bottom = staticLayout.getLineBottom(i);
                RectF rectF2 = this.a;
                float f = rectF2.bottom;
                if (lineRight - lineLeft > 0.0f) {
                    float f2 = this.b;
                    canvas.drawRoundRect(rectF2, f2, f2, this.i);
                }
                i++;
                lineTop = f;
            }
        }
        int i3 = this.z;
        if (i3 == 1) {
            this.h.setStrokeJoin(Paint.Join.ROUND);
            this.h.setStrokeWidth(this.c);
            this.h.setColor(this.y);
            this.h.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout.draw(canvas);
        } else if (i3 == 2) {
            TextPaint textPaint = this.h;
            float f3 = this.d;
            float f4 = this.e;
            textPaint.setShadowLayer(f3, f4, f4, this.y);
        } else if (i3 == 3 || i3 == 4) {
            boolean z = i3 == 3;
            int i4 = z ? -1 : this.y;
            int i5 = z ? this.y : -1;
            float f5 = this.d / 2.0f;
            this.h.setColor(this.v);
            this.h.setStyle(Paint.Style.FILL);
            float f6 = -f5;
            this.h.setShadowLayer(this.d, f6, f6, i4);
            staticLayout.draw(canvas);
            this.h.setShadowLayer(this.d, f5, f5, i5);
        }
        this.h.setColor(this.v);
        this.h.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.h.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(save);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r7 = this;
            int r0 = r7.E
            int r1 = r7.C
            int r0 = r0 - r1
            int r2 = r7.F
            int r3 = r7.D
            int r2 = r2 - r3
            float r1 = (float) r1
            float r0 = (float) r0
            float r4 = r7.p
            float r4 = r4 * r0
            float r1 = r1 + r4
            float r3 = (float) r3
            float r2 = (float) r2
            float r4 = r7.m
            float r4 = r4 * r2
            float r3 = r3 + r4
            float r4 = r7.r
            float r0 = r0 * r4
            int r0 = java.lang.Math.round(r0)
            float r4 = r7.s
            r5 = 1
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L28
            goto L38
        L28:
            float r2 = (float) r0
            android.graphics.Bitmap r4 = r7.l
            int r4 = r4.getHeight()
            float r4 = (float) r4
            android.graphics.Bitmap r5 = r7.l
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
        L38:
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
            int r4 = r7.o
            r5 = 1
            r6 = 2
            if (r4 != r6) goto L47
            float r4 = (float) r0
        L45:
            float r1 = r1 - r4
            goto L4d
        L47:
            if (r4 != r5) goto L4d
            int r4 = r0 / 2
            float r4 = (float) r4
            goto L45
        L4d:
            int r1 = java.lang.Math.round(r1)
            int r4 = r7.q
            if (r4 != r6) goto L58
            float r4 = (float) r2
        L56:
            float r3 = r3 - r4
            goto L5e
        L58:
            if (r4 != r5) goto L5e
            int r4 = r2 / 2
            float r4 = (float) r4
            goto L56
        L5e:
            int r3 = java.lang.Math.round(r3)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r0 = r0 + r1
            int r2 = r2 + r3
            r4.<init>(r1, r3, r0, r2)
            r7.K = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.zh1.f():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.zh1.g():void");
    }
}
