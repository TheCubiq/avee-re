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
    public static final double q = Math.cos(Math.toRadians(45.0d));
    public static a r;
    public final int a;
    public Paint b;
    public Paint c;
    public Paint d;
    public final RectF e;
    public float f;
    public Path g;
    public float h;
    public float i;
    public float j;
    public ColorStateList k;
    public boolean l;
    public final int m;
    public final int n;
    public boolean o;
    public boolean p;

    /* loaded from: classes.dex */
    public interface a {
        void a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    public static float c(float f, float f2, boolean z) {
        if (z) {
            double d = f;
            double d2 = f2;
            Double.isNaN(d2);
            Double.isNaN(d);
            return (float) (d + ((1.0d - q) * d2));
        }
        return f;
    }

    public static float d(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        if (z) {
            double d = f3;
            double d2 = f2;
            Double.isNaN(d2);
            Double.isNaN(d);
            return (float) (d + ((1.0d - q) * d2));
        }
        return f3;
    }

    public final void a(Rect rect) {
        float f = this.h;
        float f2 = 1.5f * f;
        this.e.set(rect.left + f, rect.top + f2, rect.right - f, rect.bottom - f2);
        b();
    }

    public final void b() {
        float f = this.f;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.i;
        rectF2.inset(-f2, -f2);
        Path path = this.g;
        if (path == null) {
            this.g = new Path();
        } else {
            path.reset();
        }
        this.g.setFillType(Path.FillType.EVEN_ODD);
        this.g.moveTo(-this.f, 0.0f);
        this.g.rLineTo(-this.i, 0.0f);
        this.g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.g.arcTo(rectF, 270.0f, -90.0f, false);
        this.g.close();
        float f3 = this.f;
        float f4 = f3 / (this.i + f3);
        Paint paint = this.c;
        float f5 = this.f + this.i;
        int i = this.m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.n}, new float[]{0.0f, f4, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.d;
        float f6 = this.f;
        float f7 = this.i;
        int i2 = this.m;
        paint2.setShader(new LinearGradient(0.0f, (-f6) + f7, 0.0f, (-f6) - f7, new int[]{i2, i2, this.n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.d.setAntiAlias(false);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.l) {
            a(getBounds());
            this.l = false;
        }
        canvas.translate(0.0f, this.j / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.j) / 2.0f);
        r.a(canvas, this.e, this.f, this.b);
    }

    public final void e(Canvas canvas) {
        float f = this.f;
        float f2 = (-f) - this.i;
        float f3 = f + this.a + (this.j / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.e.width() - f4 > 0.0f;
        boolean z2 = this.e.height() - f4 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.e;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.g, this.c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.e.width() - f4, -this.f, this.d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.e;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.g, this.c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.e.width() - f4, (-this.f) + this.i, this.d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.e;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.g, this.c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.e.height() - f4, -this.f, this.d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.e;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.g, this.c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.e.height() - f4, -this.f, this.d);
        }
        canvas.restoreToCount(save4);
    }

    public ColorStateList f() {
        return this.k;
    }

    public float g() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(d(this.h, this.f, this.o));
        int ceil2 = (int) Math.ceil(c(this.h, this.f, this.o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public void h(Rect rect) {
        getPadding(rect);
    }

    public float i() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public float j() {
        float f = this.h;
        return (Math.max(f, this.f + this.a + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.h * 1.5f) + this.a) * 2.0f);
    }

    public float k() {
        float f = this.h;
        return (Math.max(f, this.f + this.a + (f / 2.0f)) * 2.0f) + ((this.h + this.a) * 2.0f);
    }

    public float l() {
        return this.j;
    }

    public void m(boolean z) {
        this.o = z;
        invalidateSelf();
    }

    public final void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.k = colorStateList;
        this.b.setColor(colorStateList.getColorForState(getState(), this.k.getDefaultColor()));
    }

    public void o(ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.l = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.b.getColor() == colorForState) {
            return false;
        }
        this.b.setColor(colorForState);
        this.l = true;
        invalidateSelf();
        return true;
    }

    public void p(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
        }
        float f2 = (int) (f + 0.5f);
        if (this.f == f2) {
            return;
        }
        this.f = f2;
        this.l = true;
        invalidateSelf();
    }

    public void q(float f) {
        s(this.j, f);
    }

    public void r(float f) {
        s(f, this.h);
    }

    public final void s(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        } else {
            float t = t(f);
            float t2 = t(f2);
            if (t > t2) {
                if (!this.p) {
                    this.p = true;
                }
                t = t2;
            }
            if (this.j == t && this.h == t2) {
                return;
            }
            this.j = t;
            this.h = t2;
            this.i = (int) ((t * 1.5f) + this.a + 0.5f);
            this.l = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.b.setAlpha(i);
        this.c.setAlpha(i);
        this.d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    public final int t(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }
}
