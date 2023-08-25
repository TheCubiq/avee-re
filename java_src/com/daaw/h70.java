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

    /* renamed from: p */
    public final Rect f12120p;

    /* renamed from: q */
    public int f12121q;

    /* renamed from: r */
    public int f12122r;

    /* renamed from: s */
    public boolean f12123s;

    /* renamed from: t */
    public boolean f12124t;

    /* renamed from: u */
    public C1512a f12125u;

    /* renamed from: com.daaw.h70$a */
    /* loaded from: classes.dex */
    public static class C1512a extends Drawable.ConstantState {

        /* renamed from: d */
        public static final Paint f12126d = new Paint(6);

        /* renamed from: a */
        public final Bitmap f12127a;

        /* renamed from: b */
        public int f12128b;

        /* renamed from: c */
        public Paint f12129c;

        public C1512a(Bitmap bitmap) {
            this.f12129c = f12126d;
            this.f12127a = bitmap;
        }

        public C1512a(C1512a c1512a) {
            this(c1512a.f12127a);
            this.f12128b = c1512a.f12128b;
        }

        /* renamed from: a */
        public void m20982a() {
            if (f12126d == this.f12129c) {
                this.f12129c = new Paint(6);
            }
        }

        /* renamed from: b */
        public void m20981b(int i) {
            m20982a();
            this.f12129c.setAlpha(i);
        }

        /* renamed from: c */
        public void m20980c(ColorFilter colorFilter) {
            m20982a();
            this.f12129c.setColorFilter(colorFilter);
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
        this(resources, new C1512a(bitmap));
    }

    public h70(Resources resources, C1512a c1512a) {
        int i;
        this.f12120p = new Rect();
        Objects.requireNonNull(c1512a, "BitmapState must not be null");
        this.f12125u = c1512a;
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
            i = i == 0 ? 160 : i;
            c1512a.f12128b = i;
        } else {
            i = c1512a.f12128b;
        }
        this.f12121q = c1512a.f12127a.getScaledWidth(i);
        this.f12122r = c1512a.f12127a.getScaledHeight(i);
    }

    @Override // com.daaw.l70
    /* renamed from: b */
    public boolean mo7215b() {
        return false;
    }

    @Override // com.daaw.l70
    /* renamed from: c */
    public void mo7214c(int i) {
    }

    /* renamed from: d */
    public Bitmap m20983d() {
        return this.f12125u.f12127a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f12123s) {
            Gravity.apply(x21.f31784F0, this.f12121q, this.f12122r, getBounds(), this.f12120p);
            this.f12123s = false;
        }
        C1512a c1512a = this.f12125u;
        canvas.drawBitmap(c1512a.f12127a, (Rect) null, this.f12120p, c1512a.f12129c);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f12125u;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f12122r;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f12121q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap = this.f12125u.f12127a;
        return (bitmap == null || bitmap.hasAlpha() || this.f12125u.f12129c.getAlpha() < 255) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f12124t && super.mutate() == this) {
            this.f12125u = new C1512a(this.f12125u);
            this.f12124t = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f12123s = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f12125u.f12129c.getAlpha() != i) {
            this.f12125u.m20981b(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f12125u.m20980c(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }
}
