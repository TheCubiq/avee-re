package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import com.daaw.j51;
/* loaded from: classes2.dex */
public class ik1 {
    public final ColorStateList a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final String e;
    public final int f;
    public final int g;
    public final boolean h;
    public final float i;
    public final float j;
    public final float k;
    public final boolean l;
    public final float m;
    public float n;
    public final int o;
    public boolean p = false;
    public Typeface q;

    /* loaded from: classes2.dex */
    public class a extends j51.f {
        public final /* synthetic */ kk1 a;

        public a(kk1 kk1Var) {
            this.a = kk1Var;
        }

        @Override // com.daaw.j51.f
        public void h(int i) {
            ik1.this.p = true;
            this.a.a(i);
        }

        @Override // com.daaw.j51.f
        public void i(Typeface typeface) {
            ik1 ik1Var = ik1.this;
            ik1Var.q = Typeface.create(typeface, ik1Var.f);
            ik1.this.p = true;
            this.a.b(ik1.this.q, false);
        }
    }

    /* loaded from: classes2.dex */
    public class b extends kk1 {
        public final /* synthetic */ TextPaint a;
        public final /* synthetic */ kk1 b;

        public b(TextPaint textPaint, kk1 kk1Var) {
            this.a = textPaint;
            this.b = kk1Var;
        }

        @Override // com.daaw.kk1
        public void a(int i) {
            this.b.a(i);
        }

        @Override // com.daaw.kk1
        public void b(Typeface typeface, boolean z) {
            ik1.this.l(this.a, typeface);
            this.b.b(typeface, z);
        }
    }

    public ik1(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, m21.A4);
        this.n = obtainStyledAttributes.getDimension(m21.B4, 0.0f);
        this.a = mn0.a(context, obtainStyledAttributes, m21.E4);
        this.b = mn0.a(context, obtainStyledAttributes, m21.F4);
        this.c = mn0.a(context, obtainStyledAttributes, m21.G4);
        this.f = obtainStyledAttributes.getInt(m21.D4, 0);
        this.g = obtainStyledAttributes.getInt(m21.C4, 1);
        int e = mn0.e(obtainStyledAttributes, m21.M4, m21.L4);
        this.o = obtainStyledAttributes.getResourceId(e, 0);
        this.e = obtainStyledAttributes.getString(e);
        this.h = obtainStyledAttributes.getBoolean(m21.N4, false);
        this.d = mn0.a(context, obtainStyledAttributes, m21.H4);
        this.i = obtainStyledAttributes.getFloat(m21.I4, 0.0f);
        this.j = obtainStyledAttributes.getFloat(m21.J4, 0.0f);
        this.k = obtainStyledAttributes.getFloat(m21.K4, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT < 21) {
            this.l = false;
            this.m = 0.0f;
            return;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, m21.P2);
        int i2 = m21.Q2;
        this.l = obtainStyledAttributes2.hasValue(i2);
        this.m = obtainStyledAttributes2.getFloat(i2, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void d() {
        String str;
        if (this.q == null && (str = this.e) != null) {
            this.q = Typeface.create(str, this.f);
        }
        if (this.q == null) {
            int i = this.g;
            this.q = i != 1 ? i != 2 ? i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.q = Typeface.create(this.q, this.f);
        }
    }

    public Typeface e() {
        d();
        return this.q;
    }

    public Typeface f(Context context) {
        if (this.p) {
            return this.q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface f = j51.f(context, this.o);
                this.q = f;
                if (f != null) {
                    this.q = Typeface.create(f, this.f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception unused2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error loading font ");
                sb.append(this.e);
            }
        }
        d();
        this.p = true;
        return this.q;
    }

    public void g(Context context, TextPaint textPaint, kk1 kk1Var) {
        l(textPaint, e());
        h(context, new b(textPaint, kk1Var));
    }

    public void h(Context context, kk1 kk1Var) {
        if (i(context)) {
            f(context);
        } else {
            d();
        }
        int i = this.o;
        if (i == 0) {
            this.p = true;
        }
        if (this.p) {
            kk1Var.b(this.q, true);
            return;
        }
        try {
            j51.h(context, i, new a(kk1Var), null);
        } catch (Resources.NotFoundException unused) {
            this.p = true;
            kk1Var.a(1);
        } catch (Exception unused2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error loading font ");
            sb.append(this.e);
            this.p = true;
            kk1Var.a(-3);
        }
    }

    public final boolean i(Context context) {
        return jk1.a();
    }

    public void j(Context context, TextPaint textPaint, kk1 kk1Var) {
        k(context, textPaint, kk1Var);
        ColorStateList colorStateList = this.a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.k;
        float f2 = this.i;
        float f3 = this.j;
        ColorStateList colorStateList2 = this.d;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void k(Context context, TextPaint textPaint, kk1 kk1Var) {
        if (i(context)) {
            l(textPaint, f(context));
        } else {
            g(context, textPaint, kk1Var);
        }
    }

    public void l(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ (-1)) & this.f;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.n);
        if (Build.VERSION.SDK_INT < 21 || !this.l) {
            return;
        }
        textPaint.setLetterSpacing(this.m);
    }
}
