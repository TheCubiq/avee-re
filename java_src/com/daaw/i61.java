package com.daaw;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public class i61 extends Drawable {

    /* renamed from: q */
    public static final double f13295q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r */
    public static InterfaceC1661a f13296r;

    /* renamed from: a */
    public final int f13297a;

    /* renamed from: b */
    public Paint f13298b;

    /* renamed from: c */
    public Paint f13299c;

    /* renamed from: d */
    public Paint f13300d;

    /* renamed from: e */
    public final RectF f13301e;

    /* renamed from: f */
    public float f13302f;

    /* renamed from: g */
    public Path f13303g;

    /* renamed from: h */
    public float f13304h;

    /* renamed from: i */
    public float f13305i;

    /* renamed from: j */
    public float f13306j;

    /* renamed from: k */
    public ColorStateList f13307k;

    /* renamed from: l */
    public boolean f13308l;

    /* renamed from: m */
    public final int f13309m;

    /* renamed from: n */
    public final int f13310n;

    /* renamed from: o */
    public boolean f13311o;

    /* renamed from: p */
    public boolean f13312p;

    /* renamed from: com.daaw.i61$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1661a {
        /* renamed from: a */
        void mo20049a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    /* renamed from: c */
    public static float m20067c(float f, float f2, boolean z) {
        if (z) {
            double d = f;
            double d2 = f2;
            Double.isNaN(d2);
            Double.isNaN(d);
            return (float) (d + ((1.0d - f13295q) * d2));
        }
        return f;
    }

    /* renamed from: d */
    public static float m20066d(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        if (z) {
            double d = f3;
            double d2 = f2;
            Double.isNaN(d2);
            Double.isNaN(d);
            return (float) (d + ((1.0d - f13295q) * d2));
        }
        return f3;
    }

    /* renamed from: a */
    public final void m20069a(Rect rect) {
        float f = this.f13304h;
        float f2 = 1.5f * f;
        this.f13301e.set(rect.left + f, rect.top + f2, rect.right - f, rect.bottom - f2);
        m20068b();
    }

    /* renamed from: b */
    public final void m20068b() {
        float f = this.f13302f;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f13305i;
        rectF2.inset(-f2, -f2);
        Path path = this.f13303g;
        if (path == null) {
            this.f13303g = new Path();
        } else {
            path.reset();
        }
        this.f13303g.setFillType(Path.FillType.EVEN_ODD);
        this.f13303g.moveTo(-this.f13302f, 0.0f);
        this.f13303g.rLineTo(-this.f13305i, 0.0f);
        this.f13303g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f13303g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f13303g.close();
        float f3 = this.f13302f;
        float f4 = f3 / (this.f13305i + f3);
        Paint paint = this.f13299c;
        float f5 = this.f13302f + this.f13305i;
        int i = this.f13309m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.f13310n}, new float[]{0.0f, f4, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f13300d;
        float f6 = this.f13302f;
        float f7 = this.f13305i;
        int i2 = this.f13309m;
        paint2.setShader(new LinearGradient(0.0f, (-f6) + f7, 0.0f, (-f6) - f7, new int[]{i2, i2, this.f13310n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f13300d.setAntiAlias(false);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f13308l) {
            m20069a(getBounds());
            this.f13308l = false;
        }
        canvas.translate(0.0f, this.f13306j / 2.0f);
        m20065e(canvas);
        canvas.translate(0.0f, (-this.f13306j) / 2.0f);
        f13296r.mo20049a(canvas, this.f13301e, this.f13302f, this.f13298b);
    }

    /* renamed from: e */
    public final void m20065e(Canvas canvas) {
        float f = this.f13302f;
        float f2 = (-f) - this.f13305i;
        float f3 = f + this.f13297a + (this.f13306j / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f13301e.width() - f4 > 0.0f;
        boolean z2 = this.f13301e.height() - f4 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f13301e;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.f13303g, this.f13299c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f13301e.width() - f4, -this.f13302f, this.f13300d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f13301e;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f13303g, this.f13299c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f13301e.width() - f4, (-this.f13302f) + this.f13305i, this.f13300d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f13301e;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f13303g, this.f13299c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f13301e.height() - f4, -this.f13302f, this.f13300d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f13301e;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f13303g, this.f13299c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f13301e.height() - f4, -this.f13302f, this.f13300d);
        }
        canvas.restoreToCount(save4);
    }

    /* renamed from: f */
    public ColorStateList m20064f() {
        return this.f13307k;
    }

    /* renamed from: g */
    public float m20063g() {
        return this.f13302f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(m20066d(this.f13304h, this.f13302f, this.f13311o));
        int ceil2 = (int) Math.ceil(m20067c(this.f13304h, this.f13302f, this.f13311o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* renamed from: h */
    public void m20062h(Rect rect) {
        getPadding(rect);
    }

    /* renamed from: i */
    public float m20061i() {
        return this.f13304h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f13307k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* renamed from: j */
    public float m20060j() {
        float f = this.f13304h;
        return (Math.max(f, this.f13302f + this.f13297a + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f13304h * 1.5f) + this.f13297a) * 2.0f);
    }

    /* renamed from: k */
    public float m20059k() {
        float f = this.f13304h;
        return (Math.max(f, this.f13302f + this.f13297a + (f / 2.0f)) * 2.0f) + ((this.f13304h + this.f13297a) * 2.0f);
    }

    /* renamed from: l */
    public float m20058l() {
        return this.f13306j;
    }

    /* renamed from: m */
    public void m20057m(boolean z) {
        this.f13311o = z;
        invalidateSelf();
    }

    /* renamed from: n */
    public final void m20056n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f13307k = colorStateList;
        this.f13298b.setColor(colorStateList.getColorForState(getState(), this.f13307k.getDefaultColor()));
    }

    /* renamed from: o */
    public void m20055o(ColorStateList colorStateList) {
        m20056n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f13308l = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f13307k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f13298b.getColor() == colorForState) {
            return false;
        }
        this.f13298b.setColor(colorForState);
        this.f13308l = true;
        invalidateSelf();
        return true;
    }

    /* renamed from: p */
    public void m20054p(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
        }
        float f2 = (int) (f + 0.5f);
        if (this.f13302f == f2) {
            return;
        }
        this.f13302f = f2;
        this.f13308l = true;
        invalidateSelf();
    }

    /* renamed from: q */
    public void m20053q(float f) {
        m20051s(this.f13306j, f);
    }

    /* renamed from: r */
    public void m20052r(float f) {
        m20051s(f, this.f13304h);
    }

    /* renamed from: s */
    public final void m20051s(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        } else {
            float m20050t = m20050t(f);
            float m20050t2 = m20050t(f2);
            if (m20050t > m20050t2) {
                if (!this.f13312p) {
                    this.f13312p = true;
                }
                m20050t = m20050t2;
            }
            if (this.f13306j == m20050t && this.f13304h == m20050t2) {
                return;
            }
            this.f13306j = m20050t;
            this.f13304h = m20050t2;
            this.f13305i = (int) ((m20050t * 1.5f) + this.f13297a + 0.5f);
            this.f13308l = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f13298b.setAlpha(i);
        this.f13299c.setAlpha(i);
        this.f13300d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f13298b.setColorFilter(colorFilter);
    }

    /* renamed from: t */
    public final int m20050t(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }
}
