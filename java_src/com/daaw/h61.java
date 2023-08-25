package com.daaw;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public class h61 extends Drawable {

    /* renamed from: a */
    public float f12082a;

    /* renamed from: b */
    public final Paint f12083b;

    /* renamed from: c */
    public final RectF f12084c;

    /* renamed from: d */
    public final Rect f12085d;

    /* renamed from: e */
    public float f12086e;

    /* renamed from: f */
    public boolean f12087f;

    /* renamed from: g */
    public boolean f12088g;

    /* renamed from: h */
    public ColorStateList f12089h;

    /* renamed from: i */
    public PorterDuffColorFilter f12090i;

    /* renamed from: j */
    public ColorStateList f12091j;

    /* renamed from: k */
    public PorterDuff.Mode f12092k;

    /* renamed from: a */
    public final PorterDuffColorFilter m20996a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: b */
    public ColorStateList m20995b() {
        return this.f12089h;
    }

    /* renamed from: c */
    public float m20994c() {
        return this.f12086e;
    }

    /* renamed from: d */
    public float m20993d() {
        return this.f12082a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f12083b;
        if (this.f12090i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f12090i);
            z = true;
        }
        RectF rectF = this.f12084c;
        float f = this.f12082a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* renamed from: e */
    public final void m20992e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f12089h = colorStateList;
        this.f12083b.setColor(colorStateList.getColorForState(getState(), this.f12089h.getDefaultColor()));
    }

    /* renamed from: f */
    public void m20991f(ColorStateList colorStateList) {
        m20992e(colorStateList);
        invalidateSelf();
    }

    /* renamed from: g */
    public void m20990g(float f, boolean z, boolean z2) {
        if (f == this.f12086e && this.f12087f == z && this.f12088g == z2) {
            return;
        }
        this.f12086e = f;
        this.f12087f = z;
        this.f12088g = z2;
        m20988i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f12085d, this.f12082a);
    }

    /* renamed from: h */
    public void m20989h(float f) {
        if (f == this.f12082a) {
            return;
        }
        this.f12082a = f;
        m20988i(null);
        invalidateSelf();
    }

    /* renamed from: i */
    public final void m20988i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f12084c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f12085d.set(rect);
        if (this.f12087f) {
            float m20066d = i61.m20066d(this.f12086e, this.f12082a, this.f12088g);
            this.f12085d.inset((int) Math.ceil(i61.m20067c(this.f12086e, this.f12082a, this.f12088g)), (int) Math.ceil(m20066d));
            this.f12084c.set(this.f12085d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f12091j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f12089h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m20988i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f12089h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f12083b.getColor();
        if (z) {
            this.f12083b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f12091j;
        if (colorStateList2 == null || (mode = this.f12092k) == null) {
            return z;
        }
        this.f12090i = m20996a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f12083b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f12083b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f12091j = colorStateList;
        this.f12090i = m20996a(colorStateList, this.f12092k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f12092k = mode;
        this.f12090i = m20996a(this.f12091j, mode);
        invalidateSelf();
    }
}
