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
public class s60 extends l70 implements x60.InterfaceC3508c {

    /* renamed from: A */
    public boolean f25890A;

    /* renamed from: p */
    public final Paint f25891p;

    /* renamed from: q */
    public final Rect f25892q;

    /* renamed from: r */
    public final C2915a f25893r;

    /* renamed from: s */
    public final r60 f25894s;

    /* renamed from: t */
    public final x60 f25895t;

    /* renamed from: u */
    public boolean f25896u;

    /* renamed from: v */
    public boolean f25897v;

    /* renamed from: w */
    public boolean f25898w;

    /* renamed from: x */
    public boolean f25899x;

    /* renamed from: y */
    public int f25900y;

    /* renamed from: z */
    public int f25901z;

    /* renamed from: com.daaw.s60$a */
    /* loaded from: classes.dex */
    public static class C2915a extends Drawable.ConstantState {

        /* renamed from: a */
        public a70 f25902a;

        /* renamed from: b */
        public byte[] f25903b;

        /* renamed from: c */
        public Context f25904c;

        /* renamed from: d */
        public cn1<Bitmap> f25905d;

        /* renamed from: e */
        public int f25906e;

        /* renamed from: f */
        public int f25907f;

        /* renamed from: g */
        public r60.InterfaceC2829a f25908g;

        /* renamed from: h */
        public InterfaceC0832bc f25909h;

        /* renamed from: i */
        public Bitmap f25910i;

        public C2915a(a70 a70Var, byte[] bArr, Context context, cn1<Bitmap> cn1Var, int i, int i2, r60.InterfaceC2829a interfaceC2829a, InterfaceC0832bc interfaceC0832bc, Bitmap bitmap) {
            Objects.requireNonNull(bitmap, "The first frame of the GIF must not be null");
            this.f25902a = a70Var;
            this.f25903b = bArr;
            this.f25909h = interfaceC0832bc;
            this.f25910i = bitmap;
            this.f25904c = context.getApplicationContext();
            this.f25905d = cn1Var;
            this.f25906e = i;
            this.f25907f = i2;
            this.f25908g = interfaceC2829a;
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

    public s60(Context context, r60.InterfaceC2829a interfaceC2829a, InterfaceC0832bc interfaceC0832bc, cn1<Bitmap> cn1Var, int i, int i2, a70 a70Var, byte[] bArr, Bitmap bitmap) {
        this(new C2915a(a70Var, bArr, context, cn1Var, i, i2, interfaceC2829a, interfaceC0832bc, bitmap));
    }

    public s60(C2915a c2915a) {
        this.f25892q = new Rect();
        this.f25899x = true;
        this.f25901z = -1;
        Objects.requireNonNull(c2915a, "GifState must not be null");
        this.f25893r = c2915a;
        r60 r60Var = new r60(c2915a.f25908g);
        this.f25894s = r60Var;
        this.f25891p = new Paint();
        r60Var.m11714o(c2915a.f25902a, c2915a.f25903b);
        x60 x60Var = new x60(c2915a.f25904c, this, r60Var, c2915a.f25906e, c2915a.f25907f);
        this.f25895t = x60Var;
        x60Var.m5509f(c2915a.f25905d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s60(s60 s60Var, Bitmap bitmap, cn1<Bitmap> cn1Var) {
        this(new C2915a(r12.f25902a, r12.f25903b, r12.f25904c, cn1Var, r12.f25906e, r12.f25907f, r12.f25908g, r12.f25909h, bitmap));
        C2915a c2915a = s60Var.f25893r;
    }

    @Override // com.daaw.x60.InterfaceC3508c
    @TargetApi(11)
    /* renamed from: a */
    public void mo5502a(int i) {
        if (getCallback() == null) {
            stop();
            m10677j();
            return;
        }
        invalidateSelf();
        if (i == this.f25894s.m11723f() - 1) {
            this.f25900y++;
        }
        int i2 = this.f25901z;
        if (i2 == -1 || this.f25900y < i2) {
            return;
        }
        stop();
    }

    @Override // com.daaw.l70
    /* renamed from: b */
    public boolean mo7215b() {
        return true;
    }

    @Override // com.daaw.l70
    /* renamed from: c */
    public void mo7214c(int i) {
        if (i <= 0 && i != -1 && i != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i != 0) {
            this.f25901z = i;
            return;
        }
        int m11719j = this.f25894s.m11719j();
        this.f25901z = m11719j != 0 ? m11719j : -1;
    }

    /* renamed from: d */
    public byte[] m10683d() {
        return this.f25893r.f25903b;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f25898w) {
            return;
        }
        if (this.f25890A) {
            Gravity.apply(x21.f31784F0, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), this.f25892q);
            this.f25890A = false;
        }
        Bitmap m5513b = this.f25895t.m5513b();
        if (m5513b == null) {
            m5513b = this.f25893r.f25910i;
        }
        canvas.drawBitmap(m5513b, (Rect) null, this.f25892q, this.f25891p);
    }

    /* renamed from: e */
    public r60 m10682e() {
        return this.f25894s;
    }

    /* renamed from: f */
    public Bitmap m10681f() {
        return this.f25893r.f25910i;
    }

    /* renamed from: g */
    public int m10680g() {
        return this.f25894s.m11723f();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f25893r;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f25893r.f25910i.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f25893r.f25910i.getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* renamed from: h */
    public cn1<Bitmap> m10679h() {
        return this.f25893r.f25905d;
    }

    /* renamed from: i */
    public void m10678i() {
        this.f25898w = true;
        C2915a c2915a = this.f25893r;
        c2915a.f25909h.mo8071a(c2915a.f25910i);
        this.f25895t.m5514a();
        this.f25895t.m5507h();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f25896u;
    }

    /* renamed from: j */
    public final void m10677j() {
        this.f25895t.m5514a();
        invalidateSelf();
    }

    /* renamed from: k */
    public final void m10676k() {
        this.f25900y = 0;
    }

    /* renamed from: l */
    public final void m10675l() {
        if (this.f25894s.m11723f() != 1) {
            if (this.f25896u) {
                return;
            }
            this.f25896u = true;
            this.f25895t.m5508g();
        }
        invalidateSelf();
    }

    /* renamed from: m */
    public final void m10674m() {
        this.f25896u = false;
        this.f25895t.m5507h();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f25890A = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f25891p.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f25891p.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        this.f25899x = z;
        if (!z) {
            m10674m();
        } else if (this.f25897v) {
            m10675l();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f25897v = true;
        m10676k();
        if (this.f25899x) {
            m10675l();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f25897v = false;
        m10674m();
    }
}
