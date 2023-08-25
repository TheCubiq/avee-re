package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.daaw.j51;
import java.lang.ref.WeakReference;
import java.util.Locale;
/* loaded from: classes.dex */
public class v4 {
    public final TextView a;
    public sl1 b;
    public sl1 c;
    public sl1 d;
    public sl1 e;
    public sl1 f;
    public sl1 g;
    public sl1 h;
    public final x4 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    /* loaded from: classes.dex */
    public class a extends j51.f {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ WeakReference c;

        public a(int i, int i2, WeakReference weakReference) {
            this.a = i;
            this.b = i2;
            this.c = weakReference;
        }

        @Override // com.daaw.j51.f
        public void h(int i) {
        }

        @Override // com.daaw.j51.f
        public void i(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
                typeface = g.a(typeface, i, (this.b & 2) != 0);
            }
            v4.this.n(this.c, typeface);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ TextView p;
        public final /* synthetic */ Typeface q;
        public final /* synthetic */ int r;

        public b(TextView textView, Typeface typeface, int i) {
            this.p = textView;
            this.q = typeface;
            this.r = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.p.setTypeface(this.q, this.r);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        public static void c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        public static Typeface a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public v4(TextView textView) {
        this.a = textView;
        this.i = new x4(textView);
    }

    public static sl1 d(Context context, d4 d4Var, int i) {
        ColorStateList f2 = d4Var.f(context, i);
        if (f2 != null) {
            sl1 sl1Var = new sl1();
            sl1Var.d = true;
            sl1Var.a = f2;
            return sl1Var;
        }
        return null;
    }

    public void A(int i, float f2) {
        if (x7.a || l()) {
            return;
        }
        B(i, f2);
    }

    public final void B(int i, float f2) {
        this.i.t(i, f2);
    }

    public final void C(Context context, ul1 ul1Var) {
        String o;
        Typeface create;
        Typeface typeface;
        this.j = ul1Var.k(x21.V2, this.j);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int k = ul1Var.k(x21.a3, -1);
            this.k = k;
            if (k != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        int i2 = x21.Z2;
        if (!ul1Var.s(i2) && !ul1Var.s(x21.b3)) {
            int i3 = x21.U2;
            if (ul1Var.s(i3)) {
                this.m = false;
                int k2 = ul1Var.k(i3, 1);
                if (k2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (k2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (k2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.l = typeface;
                return;
            }
            return;
        }
        this.l = null;
        int i4 = x21.b3;
        if (ul1Var.s(i4)) {
            i2 = i4;
        }
        int i5 = this.k;
        int i6 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface j = ul1Var.j(i2, this.j, new a(i5, i6, new WeakReference(this.a)));
                if (j != null) {
                    if (i >= 28 && this.k != -1) {
                        j = g.a(Typeface.create(j, 0), this.k, (this.j & 2) != 0);
                    }
                    this.l = j;
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (o = ul1Var.o(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            create = Typeface.create(o, this.j);
        } else {
            create = g.a(Typeface.create(o, 0), this.k, (this.j & 2) != 0);
        }
        this.l = create;
    }

    public final void a(Drawable drawable, sl1 sl1Var) {
        if (drawable == null || sl1Var == null) {
            return;
        }
        d4.i(drawable, sl1Var, this.a.getDrawableState());
    }

    public void b() {
        if (this.b != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] a2 = c.a(this.a);
        a(a2[0], this.f);
        a(a2[2], this.g);
    }

    public void c() {
        this.i.a();
    }

    public int e() {
        return this.i.f();
    }

    public int f() {
        return this.i.g();
    }

    public int g() {
        return this.i.h();
    }

    public int[] h() {
        return this.i.i();
    }

    public int i() {
        return this.i.j();
    }

    public ColorStateList j() {
        sl1 sl1Var = this.h;
        if (sl1Var != null) {
            return sl1Var.a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        sl1 sl1Var = this.h;
        if (sl1Var != null) {
            return sl1Var.b;
        }
        return null;
    }

    public boolean l() {
        return this.i.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ca  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.v4.m(android.util.AttributeSet, int):void");
    }

    public void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.m) {
            this.l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (xs1.U(textView)) {
                    textView.post(new b(textView, typeface, this.j));
                } else {
                    textView.setTypeface(typeface, this.j);
                }
            }
        }
    }

    public void o(boolean z, int i, int i2, int i3, int i4) {
        if (x7.a) {
            return;
        }
        c();
    }

    public void p() {
        b();
    }

    public void q(Context context, int i) {
        String o;
        ColorStateList c2;
        ColorStateList c3;
        ColorStateList c4;
        ul1 t = ul1.t(context, i, x21.S2);
        int i2 = x21.d3;
        if (t.s(i2)) {
            s(t.a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = x21.W2;
            if (t.s(i4) && (c4 = t.c(i4)) != null) {
                this.a.setTextColor(c4);
            }
            int i5 = x21.Y2;
            if (t.s(i5) && (c3 = t.c(i5)) != null) {
                this.a.setLinkTextColor(c3);
            }
            int i6 = x21.X2;
            if (t.s(i6) && (c2 = t.c(i6)) != null) {
                this.a.setHintTextColor(c2);
            }
        }
        int i7 = x21.T2;
        if (t.s(i7) && t.f(i7, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        C(context, t);
        if (i3 >= 26) {
            int i8 = x21.c3;
            if (t.s(i8) && (o = t.o(i8)) != null) {
                f.d(this.a, o);
            }
        }
        t.w();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.j);
        }
    }

    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        sv.f(editorInfo, textView.getText());
    }

    public void s(boolean z) {
        this.a.setAllCaps(z);
    }

    public void t(int i, int i2, int i3, int i4) {
        this.i.p(i, i2, i3, i4);
    }

    public void u(int[] iArr, int i) {
        this.i.q(iArr, i);
    }

    public void v(int i) {
        this.i.r(i);
    }

    public void w(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new sl1();
        }
        sl1 sl1Var = this.h;
        sl1Var.a = colorStateList;
        sl1Var.d = colorStateList != null;
        z();
    }

    public void x(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new sl1();
        }
        sl1 sl1Var = this.h;
        sl1Var.b = mode;
        sl1Var.c = mode != null;
        z();
    }

    public final void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] a2 = c.a(this.a);
            TextView textView = this.a;
            if (drawable5 == null) {
                drawable5 = a2[0];
            }
            if (drawable2 == null) {
                drawable2 = a2[1];
            }
            if (drawable6 == null) {
                drawable6 = a2[2];
            }
            if (drawable4 == null) {
                drawable4 = a2[3];
            }
            c.b(textView, drawable5, drawable2, drawable6, drawable4);
        } else if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
        } else {
            Drawable[] a3 = c.a(this.a);
            if (a3[0] != null || a3[2] != null) {
                TextView textView2 = this.a;
                Drawable drawable7 = a3[0];
                if (drawable2 == null) {
                    drawable2 = a3[1];
                }
                Drawable drawable8 = a3[2];
                if (drawable4 == null) {
                    drawable4 = a3[3];
                }
                c.b(textView2, drawable7, drawable2, drawable8, drawable4);
                return;
            }
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            TextView textView3 = this.a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    public final void z() {
        sl1 sl1Var = this.h;
        this.b = sl1Var;
        this.c = sl1Var;
        this.d = sl1Var;
        this.e = sl1Var;
        this.f = sl1Var;
        this.g = sl1Var;
    }
}
