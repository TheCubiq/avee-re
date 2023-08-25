package com.daaw;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.daaw.r60;
import com.daaw.x60;
import java.util.Objects;
/* loaded from: classes.dex */
public class s60 extends l70 implements x60.c {
    public boolean A;
    public final Paint p;
    public final Rect q;
    public final a r;
    public final r60 s;
    public final x60 t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public int z;

    /* loaded from: classes.dex */
    public static class a extends Drawable.ConstantState {
        public a70 a;
        public byte[] b;
        public Context c;
        public cn1<Bitmap> d;
        public int e;
        public int f;
        public r60.a g;
        public bc h;
        public Bitmap i;

        public a(a70 a70Var, byte[] bArr, Context context, cn1<Bitmap> cn1Var, int i, int i2, r60.a aVar, bc bcVar, Bitmap bitmap) {
            Objects.requireNonNull(bitmap, "The first frame of the GIF must not be null");
            this.a = a70Var;
            this.b = bArr;
            this.h = bcVar;
            this.i = bitmap;
            this.c = context.getApplicationContext();
            this.d = cn1Var;
            this.e = i;
            this.f = i2;
            this.g = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new s60(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    public s60(Context context, r60.a aVar, bc bcVar, cn1<Bitmap> cn1Var, int i, int i2, a70 a70Var, byte[] bArr, Bitmap bitmap) {
        this(new a(a70Var, bArr, context, cn1Var, i, i2, aVar, bcVar, bitmap));
    }

    public s60(a aVar) {
        this.q = new Rect();
        this.x = true;
        this.z = -1;
        Objects.requireNonNull(aVar, "GifState must not be null");
        this.r = aVar;
        r60 r60Var = new r60(aVar.g);
        this.s = r60Var;
        this.p = new Paint();
        r60Var.o(aVar.a, aVar.b);
        x60 x60Var = new x60(aVar.c, this, r60Var, aVar.e, aVar.f);
        this.t = x60Var;
        x60Var.f(aVar.d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s60(com.daaw.s60 r12, android.graphics.Bitmap r13, com.daaw.cn1<android.graphics.Bitmap> r14) {
        /*
            r11 = this;
            com.daaw.s60$a r10 = new com.daaw.s60$a
            com.daaw.s60$a r12 = r12.r
            com.daaw.a70 r1 = r12.a
            byte[] r2 = r12.b
            android.content.Context r3 = r12.c
            int r5 = r12.e
            int r6 = r12.f
            com.daaw.r60$a r7 = r12.g
            com.daaw.bc r8 = r12.h
            r0 = r10
            r4 = r14
            r9 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.<init>(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.s60.<init>(com.daaw.s60, android.graphics.Bitmap, com.daaw.cn1):void");
    }

    @Override // com.daaw.x60.c
    @TargetApi(11)
    public void a(int i) {
        if (getCallback() == null) {
            stop();
            j();
            return;
        }
        invalidateSelf();
        if (i == this.s.f() - 1) {
            this.y++;
        }
        int i2 = this.z;
        if (i2 == -1 || this.y < i2) {
            return;
        }
        stop();
    }

    @Override // com.daaw.l70
    public boolean b() {
        return true;
    }

    @Override // com.daaw.l70
    public void c(int i) {
        if (i <= 0 && i != -1 && i != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i != 0) {
            this.z = i;
            return;
        }
        int j = this.s.j();
        this.z = j != 0 ? j : -1;
    }

    public byte[] d() {
        return this.r.b;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.w) {
            return;
        }
        if (this.A) {
            Gravity.apply(x21.F0, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), this.q);
            this.A = false;
        }
        Bitmap b = this.t.b();
        if (b == null) {
            b = this.r.i;
        }
        canvas.drawBitmap(b, (Rect) null, this.q, this.p);
    }

    public r60 e() {
        return this.s;
    }

    public Bitmap f() {
        return this.r.i;
    }

    public int g() {
        return this.s.f();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.r;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.r.i.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.r.i.getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public cn1<Bitmap> h() {
        return this.r.d;
    }

    public void i() {
        this.w = true;
        a aVar = this.r;
        aVar.h.a(aVar.i);
        this.t.a();
        this.t.h();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.u;
    }

    public final void j() {
        this.t.a();
        invalidateSelf();
    }

    public final void k() {
        this.y = 0;
    }

    public final void l() {
        if (this.s.f() != 1) {
            if (this.u) {
                return;
            }
            this.u = true;
            this.t.g();
        }
        invalidateSelf();
    }

    public final void m() {
        this.u = false;
        this.t.h();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.p.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.p.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        this.x = z;
        if (!z) {
            m();
        } else if (this.v) {
            l();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.v = true;
        k();
        if (this.x) {
            l();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.v = false;
        m();
    }
}
