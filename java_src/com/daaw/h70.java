package com.daaw;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.Objects;
/* loaded from: classes.dex */
public class h70 extends l70 {
    public final Rect p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public a u;

    /* loaded from: classes.dex */
    public static class a extends Drawable.ConstantState {
        public static final Paint d = new Paint(6);
        public final Bitmap a;
        public int b;
        public Paint c;

        public a(Bitmap bitmap) {
            this.c = d;
            this.a = bitmap;
        }

        public a(a aVar) {
            this(aVar.a);
            this.b = aVar.b;
        }

        public void a() {
            if (d == this.c) {
                this.c = new Paint(6);
            }
        }

        public void b(int i) {
            a();
            this.c.setAlpha(i);
        }

        public void c(ColorFilter colorFilter) {
            a();
            this.c.setColorFilter(colorFilter);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new h70((Resources) null, this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new h70(resources, this);
        }
    }

    public h70(Resources resources, Bitmap bitmap) {
        this(resources, new a(bitmap));
    }

    public h70(Resources resources, a aVar) {
        int i;
        this.p = new Rect();
        Objects.requireNonNull(aVar, "BitmapState must not be null");
        this.u = aVar;
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
            i = i == 0 ? 160 : i;
            aVar.b = i;
        } else {
            i = aVar.b;
        }
        this.q = aVar.a.getScaledWidth(i);
        this.r = aVar.a.getScaledHeight(i);
    }

    @Override // com.daaw.l70
    public boolean b() {
        return false;
    }

    @Override // com.daaw.l70
    public void c(int i) {
    }

    public Bitmap d() {
        return this.u.a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.s) {
            Gravity.apply(x21.F0, this.q, this.r, getBounds(), this.p);
            this.s = false;
        }
        a aVar = this.u;
        canvas.drawBitmap(aVar.a, (Rect) null, this.p, aVar.c);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.u;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.r;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap = this.u.a;
        return (bitmap == null || bitmap.hasAlpha() || this.u.c.getAlpha() < 255) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.t && super.mutate() == this) {
            this.u = new a(this.u);
            this.t = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.s = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.u.c.getAlpha() != i) {
            this.u.b(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.u.c(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }
}
