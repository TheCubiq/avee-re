package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.daaw.j51;
import java.lang.ref.WeakReference;
import java.util.Locale;
/* renamed from: com.daaw.v4 */
/* loaded from: classes.dex */
public class C3282v4 {

    /* renamed from: a */
    public final TextView f29838a;

    /* renamed from: b */
    public sl1 f29839b;

    /* renamed from: c */
    public sl1 f29840c;

    /* renamed from: d */
    public sl1 f29841d;

    /* renamed from: e */
    public sl1 f29842e;

    /* renamed from: f */
    public sl1 f29843f;

    /* renamed from: g */
    public sl1 f29844g;

    /* renamed from: h */
    public sl1 f29845h;

    /* renamed from: i */
    public final C3497x4 f29846i;

    /* renamed from: j */
    public int f29847j = 0;

    /* renamed from: k */
    public int f29848k = -1;

    /* renamed from: l */
    public Typeface f29849l;

    /* renamed from: m */
    public boolean f29850m;

    /* renamed from: com.daaw.v4$a */
    /* loaded from: classes.dex */
    public class C3283a extends j51.AbstractC1794f {

        /* renamed from: a */
        public final /* synthetic */ int f29851a;

        /* renamed from: b */
        public final /* synthetic */ int f29852b;

        /* renamed from: c */
        public final /* synthetic */ WeakReference f29853c;

        public C3283a(int i, int i2, WeakReference weakReference) {
            this.f29851a = i;
            this.f29852b = i2;
            this.f29853c = weakReference;
        }

        @Override // com.daaw.j51.AbstractC1794f
        /* renamed from: h */
        public void mo7477h(int i) {
        }

        @Override // com.daaw.j51.AbstractC1794f
        /* renamed from: i */
        public void mo7476i(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f29851a) != -1) {
                typeface = C3289g.m7465a(typeface, i, (this.f29852b & 2) != 0);
            }
            C3282v4.this.m7490n(this.f29853c, typeface);
        }
    }

    /* renamed from: com.daaw.v4$b */
    /* loaded from: classes.dex */
    public class RunnableC3284b implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ TextView f29855p;

        /* renamed from: q */
        public final /* synthetic */ Typeface f29856q;

        /* renamed from: r */
        public final /* synthetic */ int f29857r;

        public RunnableC3284b(TextView textView, Typeface typeface, int i) {
            this.f29855p = textView;
            this.f29856q = typeface;
            this.f29857r = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29855p.setTypeface(this.f29856q, this.f29857r);
        }
    }

    /* renamed from: com.daaw.v4$c */
    /* loaded from: classes.dex */
    public static class C3285c {
        /* renamed from: a */
        public static Drawable[] m7475a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        public static void m7474b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: c */
        public static void m7473c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* renamed from: com.daaw.v4$d */
    /* loaded from: classes.dex */
    public static class C3286d {
        /* renamed from: a */
        public static Locale m7472a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* renamed from: com.daaw.v4$e */
    /* loaded from: classes.dex */
    public static class C3287e {
        /* renamed from: a */
        public static LocaleList m7471a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        /* renamed from: b */
        public static void m7470b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* renamed from: com.daaw.v4$f */
    /* loaded from: classes.dex */
    public static class C3288f {
        /* renamed from: a */
        public static int m7469a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        /* renamed from: b */
        public static void m7468b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        /* renamed from: c */
        public static void m7467c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        /* renamed from: d */
        public static boolean m7466d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* renamed from: com.daaw.v4$g */
    /* loaded from: classes.dex */
    public static class C3289g {
        /* renamed from: a */
        public static Typeface m7465a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public C3282v4(TextView textView) {
        this.f29838a = textView;
        this.f29846i = new C3497x4(textView);
    }

    /* renamed from: d */
    public static sl1 m7500d(Context context, C1046d4 c1046d4, int i) {
        ColorStateList m24709f = c1046d4.m24709f(context, i);
        if (m24709f != null) {
            sl1 sl1Var = new sl1();
            sl1Var.f26352d = true;
            sl1Var.f26349a = m24709f;
            return sl1Var;
        }
        return null;
    }

    /* renamed from: A */
    public void m7506A(int i, float f) {
        if (InterfaceC3511x7.f32160a || m7492l()) {
            return;
        }
        m7505B(i, f);
    }

    /* renamed from: B */
    public final void m7505B(int i, float f) {
        this.f29846i.m5554t(i, f);
    }

    /* renamed from: C */
    public final void m7504C(Context context, ul1 ul1Var) {
        String m8044o;
        Typeface create;
        Typeface typeface;
        this.f29847j = ul1Var.m8048k(x21.f31865V2, this.f29847j);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int m8048k = ul1Var.m8048k(x21.f31886a3, -1);
            this.f29848k = m8048k;
            if (m8048k != -1) {
                this.f29847j = (this.f29847j & 2) | 0;
            }
        }
        int i2 = x21.f31881Z2;
        if (!ul1Var.m8040s(i2) && !ul1Var.m8040s(x21.f31891b3)) {
            int i3 = x21.f31861U2;
            if (ul1Var.m8040s(i3)) {
                this.f29850m = false;
                int m8048k2 = ul1Var.m8048k(i3, 1);
                if (m8048k2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (m8048k2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (m8048k2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f29849l = typeface;
                return;
            }
            return;
        }
        this.f29849l = null;
        int i4 = x21.f31891b3;
        if (ul1Var.m8040s(i4)) {
            i2 = i4;
        }
        int i5 = this.f29848k;
        int i6 = this.f29847j;
        if (!context.isRestricted()) {
            try {
                Typeface m8049j = ul1Var.m8049j(i2, this.f29847j, new C3283a(i5, i6, new WeakReference(this.f29838a)));
                if (m8049j != null) {
                    if (i >= 28 && this.f29848k != -1) {
                        m8049j = C3289g.m7465a(Typeface.create(m8049j, 0), this.f29848k, (this.f29847j & 2) != 0);
                    }
                    this.f29849l = m8049j;
                }
                this.f29850m = this.f29849l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f29849l != null || (m8044o = ul1Var.m8044o(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f29848k == -1) {
            create = Typeface.create(m8044o, this.f29847j);
        } else {
            create = C3289g.m7465a(Typeface.create(m8044o, 0), this.f29848k, (this.f29847j & 2) != 0);
        }
        this.f29849l = create;
    }

    /* renamed from: a */
    public final void m7503a(Drawable drawable, sl1 sl1Var) {
        if (drawable == null || sl1Var == null) {
            return;
        }
        C1046d4.m24706i(drawable, sl1Var, this.f29838a.getDrawableState());
    }

    /* renamed from: b */
    public void m7502b() {
        if (this.f29839b != null || this.f29840c != null || this.f29841d != null || this.f29842e != null) {
            Drawable[] compoundDrawables = this.f29838a.getCompoundDrawables();
            m7503a(compoundDrawables[0], this.f29839b);
            m7503a(compoundDrawables[1], this.f29840c);
            m7503a(compoundDrawables[2], this.f29841d);
            m7503a(compoundDrawables[3], this.f29842e);
        }
        if (this.f29843f == null && this.f29844g == null) {
            return;
        }
        Drawable[] m7475a = C3285c.m7475a(this.f29838a);
        m7503a(m7475a[0], this.f29843f);
        m7503a(m7475a[2], this.f29844g);
    }

    /* renamed from: c */
    public void m7501c() {
        this.f29846i.m5573a();
    }

    /* renamed from: e */
    public int m7499e() {
        return this.f29846i.m5568f();
    }

    /* renamed from: f */
    public int m7498f() {
        return this.f29846i.m5567g();
    }

    /* renamed from: g */
    public int m7497g() {
        return this.f29846i.m5566h();
    }

    /* renamed from: h */
    public int[] m7496h() {
        return this.f29846i.m5565i();
    }

    /* renamed from: i */
    public int m7495i() {
        return this.f29846i.m5564j();
    }

    /* renamed from: j */
    public ColorStateList m7494j() {
        sl1 sl1Var = this.f29845h;
        if (sl1Var != null) {
            return sl1Var.f26349a;
        }
        return null;
    }

    /* renamed from: k */
    public PorterDuff.Mode m7493k() {
        sl1 sl1Var = this.f29845h;
        if (sl1Var != null) {
            return sl1Var.f26350b;
        }
        return null;
    }

    /* renamed from: l */
    public boolean m7492l() {
        return this.f29846i.m5560n();
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
    @SuppressLint({"NewApi"})
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m7491m(AttributeSet attributeSet, int i) {
        String str;
        ColorStateList colorStateList;
        String str2;
        boolean z;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        boolean z2;
        String str3;
        int i2;
        int i3;
        String str4;
        C1046d4 c1046d4;
        Typeface typeface;
        ul1 m8038u;
        int i4;
        int i5;
        int i6;
        int m8053f;
        int m8053f2;
        int m8053f3;
        int[] m5565i;
        Context context = this.f29838a.getContext();
        C1046d4 m24713b = C1046d4.m24713b();
        int[] iArr = x21.f31874Y;
        ul1 m8037v = ul1.m8037v(context, attributeSet, iArr, i, 0);
        TextView textView = this.f29838a;
        xs1.m4706p0(textView, textView.getContext(), iArr, attributeSet, m8037v.m8041r(), i, 0);
        int m8045n = m8037v.m8045n(x21.f31878Z, -1);
        int i7 = x21.f31893c0;
        if (m8037v.m8040s(i7)) {
            this.f29839b = m7500d(context, m24713b, m8037v.m8045n(i7, 0));
        }
        int i8 = x21.f31883a0;
        if (m8037v.m8040s(i8)) {
            this.f29840c = m7500d(context, m24713b, m8037v.m8045n(i8, 0));
        }
        int i9 = x21.f31898d0;
        if (m8037v.m8040s(i9)) {
            this.f29841d = m7500d(context, m24713b, m8037v.m8045n(i9, 0));
        }
        int i10 = x21.f31888b0;
        if (m8037v.m8040s(i10)) {
            this.f29842e = m7500d(context, m24713b, m8037v.m8045n(i10, 0));
        }
        int i11 = Build.VERSION.SDK_INT;
        int i12 = x21.f31903e0;
        if (m8037v.m8040s(i12)) {
            this.f29843f = m7500d(context, m24713b, m8037v.m8045n(i12, 0));
        }
        int i13 = x21.f31908f0;
        if (m8037v.m8040s(i13)) {
            this.f29844g = m7500d(context, m24713b, m8037v.m8045n(i13, 0));
        }
        m8037v.m8036w();
        boolean z3 = this.f29838a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (m8045n != -1) {
            ul1 m8039t = ul1.m8039t(context, m8045n, x21.f31851S2);
            if (!z3) {
                int i14 = x21.f31901d3;
                if (m8039t.m8040s(i14)) {
                    z = m8039t.m8058a(i14, false);
                    z2 = true;
                    m7504C(context, m8039t);
                    if (i11 >= 23) {
                        int i15 = x21.f31869W2;
                        colorStateList = m8039t.m8040s(i15) ? m8039t.m8056c(i15) : null;
                        int i16 = x21.f31873X2;
                        colorStateList2 = m8039t.m8040s(i16) ? m8039t.m8056c(i16) : null;
                        int i17 = x21.f31877Y2;
                        if (m8039t.m8040s(i17)) {
                            colorStateList3 = m8039t.m8056c(i17);
                            int i18 = x21.f31906e3;
                            str2 = m8039t.m8040s(i18) ? m8039t.m8044o(i18) : null;
                            if (i11 >= 26) {
                                int i19 = x21.f31896c3;
                                if (m8039t.m8040s(i19)) {
                                    str = m8039t.m8044o(i19);
                                    m8039t.m8036w();
                                }
                            }
                            str = null;
                            m8039t.m8036w();
                        }
                    } else {
                        colorStateList = null;
                        colorStateList2 = null;
                    }
                    colorStateList3 = null;
                    int i182 = x21.f31906e3;
                    if (m8039t.m8040s(i182)) {
                    }
                    if (i11 >= 26) {
                    }
                    str = null;
                    m8039t.m8036w();
                }
            }
            z = false;
            z2 = false;
            m7504C(context, m8039t);
            if (i11 >= 23) {
            }
            colorStateList3 = null;
            int i1822 = x21.f31906e3;
            if (m8039t.m8040s(i1822)) {
            }
            if (i11 >= 26) {
            }
            str = null;
            m8039t.m8036w();
        } else {
            str = null;
            colorStateList = null;
            str2 = null;
            z = false;
            colorStateList2 = null;
            colorStateList3 = null;
            z2 = false;
        }
        ul1 m8037v2 = ul1.m8037v(context, attributeSet, x21.f31851S2, i, 0);
        if (!z3) {
            int i20 = x21.f31901d3;
            if (m8037v2.m8040s(i20)) {
                str3 = str;
                z = m8037v2.m8058a(i20, false);
                i2 = 23;
                z2 = true;
                if (i11 < i2) {
                    int i21 = x21.f31869W2;
                    if (m8037v2.m8040s(i21)) {
                        colorStateList = m8037v2.m8056c(i21);
                    }
                    int i22 = x21.f31873X2;
                    if (m8037v2.m8040s(i22)) {
                        colorStateList2 = m8037v2.m8056c(i22);
                    }
                    int i23 = x21.f31877Y2;
                    if (m8037v2.m8040s(i23)) {
                        colorStateList3 = m8037v2.m8056c(i23);
                    }
                }
                i3 = x21.f31906e3;
                if (m8037v2.m8040s(i3)) {
                    str2 = m8037v2.m8044o(i3);
                }
                if (i11 >= 26) {
                    int i24 = x21.f31896c3;
                    if (m8037v2.m8040s(i24)) {
                        str4 = m8037v2.m8044o(i24);
                        if (i11 >= 28) {
                            int i25 = x21.f31856T2;
                            if (m8037v2.m8040s(i25)) {
                                c1046d4 = m24713b;
                                if (m8037v2.m8053f(i25, -1) == 0) {
                                    this.f29838a.setTextSize(0, 0.0f);
                                }
                                m7504C(context, m8037v2);
                                m8037v2.m8036w();
                                if (colorStateList != null) {
                                    this.f29838a.setTextColor(colorStateList);
                                }
                                if (colorStateList2 != null) {
                                    this.f29838a.setHintTextColor(colorStateList2);
                                }
                                if (colorStateList3 != null) {
                                    this.f29838a.setLinkTextColor(colorStateList3);
                                }
                                if (!z3 && z2) {
                                    m7485s(z);
                                }
                                typeface = this.f29849l;
                                if (typeface != null) {
                                    if (this.f29848k == -1) {
                                        this.f29838a.setTypeface(typeface, this.f29847j);
                                    } else {
                                        this.f29838a.setTypeface(typeface);
                                    }
                                }
                                if (str4 != null) {
                                    C3288f.m7466d(this.f29838a, str4);
                                }
                                if (str2 != null) {
                                    if (i11 >= 24) {
                                        C3287e.m7470b(this.f29838a, C3287e.m7471a(str2));
                                    } else if (i11 >= 21) {
                                        C3285c.m7473c(this.f29838a, C3286d.m7472a(str2.split(",")[0]));
                                    }
                                }
                                this.f29846i.m5559o(attributeSet, i);
                                if (InterfaceC3511x7.f32160a && this.f29846i.m5564j() != 0) {
                                    m5565i = this.f29846i.m5565i();
                                    if (m5565i.length > 0) {
                                        if (C3288f.m7469a(this.f29838a) != -1.0f) {
                                            C3288f.m7468b(this.f29838a, this.f29846i.m5567g(), this.f29846i.m5568f(), this.f29846i.m5566h(), 0);
                                        } else {
                                            C3288f.m7467c(this.f29838a, m5565i, 0);
                                        }
                                    }
                                }
                                m8038u = ul1.m8038u(context, attributeSet, x21.f31913g0);
                                int m8045n2 = m8038u.m8045n(x21.f31953o0, -1);
                                C1046d4 c1046d42 = c1046d4;
                                Drawable m24712c = m8045n2 == -1 ? c1046d42.m24712c(context, m8045n2) : null;
                                int m8045n3 = m8038u.m8045n(x21.f31978t0, -1);
                                Drawable m24712c2 = m8045n3 == -1 ? c1046d42.m24712c(context, m8045n3) : null;
                                int m8045n4 = m8038u.m8045n(x21.f31958p0, -1);
                                Drawable m24712c3 = m8045n4 == -1 ? c1046d42.m24712c(context, m8045n4) : null;
                                int m8045n5 = m8038u.m8045n(x21.f31943m0, -1);
                                Drawable m24712c4 = m8045n5 == -1 ? c1046d42.m24712c(context, m8045n5) : null;
                                int m8045n6 = m8038u.m8045n(x21.f31963q0, -1);
                                Drawable m24712c5 = m8045n6 == -1 ? c1046d42.m24712c(context, m8045n6) : null;
                                int m8045n7 = m8038u.m8045n(x21.f31948n0, -1);
                                m7479y(m24712c, m24712c2, m24712c3, m24712c4, m24712c5, m8045n7 == -1 ? c1046d42.m24712c(context, m8045n7) : null);
                                i4 = x21.f31968r0;
                                if (m8038u.m8040s(i4)) {
                                    sk1.m10267g(this.f29838a, m8038u.m8056c(i4));
                                }
                                i5 = x21.f31973s0;
                                if (m8038u.m8040s(i5)) {
                                    i6 = -1;
                                } else {
                                    i6 = -1;
                                    sk1.m10266h(this.f29838a, C3373vu.m6785e(m8038u.m8048k(i5, -1), null));
                                }
                                m8053f = m8038u.m8053f(x21.f31988v0, i6);
                                m8053f2 = m8038u.m8053f(x21.f31993w0, i6);
                                m8053f3 = m8038u.m8053f(x21.f31998x0, i6);
                                m8038u.m8036w();
                                if (m8053f != i6) {
                                    sk1.m10264j(this.f29838a, m8053f);
                                }
                                if (m8053f2 != i6) {
                                    sk1.m10263k(this.f29838a, m8053f2);
                                }
                                if (m8053f3 == i6) {
                                    sk1.m10262l(this.f29838a, m8053f3);
                                    return;
                                }
                                return;
                            }
                        }
                        c1046d4 = m24713b;
                        m7504C(context, m8037v2);
                        m8037v2.m8036w();
                        if (colorStateList != null) {
                        }
                        if (colorStateList2 != null) {
                        }
                        if (colorStateList3 != null) {
                        }
                        if (!z3) {
                            m7485s(z);
                        }
                        typeface = this.f29849l;
                        if (typeface != null) {
                        }
                        if (str4 != null) {
                        }
                        if (str2 != null) {
                        }
                        this.f29846i.m5559o(attributeSet, i);
                        if (InterfaceC3511x7.f32160a) {
                            m5565i = this.f29846i.m5565i();
                            if (m5565i.length > 0) {
                            }
                        }
                        m8038u = ul1.m8038u(context, attributeSet, x21.f31913g0);
                        int m8045n22 = m8038u.m8045n(x21.f31953o0, -1);
                        C1046d4 c1046d422 = c1046d4;
                        if (m8045n22 == -1) {
                        }
                        int m8045n32 = m8038u.m8045n(x21.f31978t0, -1);
                        if (m8045n32 == -1) {
                        }
                        int m8045n42 = m8038u.m8045n(x21.f31958p0, -1);
                        if (m8045n42 == -1) {
                        }
                        int m8045n52 = m8038u.m8045n(x21.f31943m0, -1);
                        if (m8045n52 == -1) {
                        }
                        int m8045n62 = m8038u.m8045n(x21.f31963q0, -1);
                        if (m8045n62 == -1) {
                        }
                        int m8045n72 = m8038u.m8045n(x21.f31948n0, -1);
                        m7479y(m24712c, m24712c2, m24712c3, m24712c4, m24712c5, m8045n72 == -1 ? c1046d422.m24712c(context, m8045n72) : null);
                        i4 = x21.f31968r0;
                        if (m8038u.m8040s(i4)) {
                        }
                        i5 = x21.f31973s0;
                        if (m8038u.m8040s(i5)) {
                        }
                        m8053f = m8038u.m8053f(x21.f31988v0, i6);
                        m8053f2 = m8038u.m8053f(x21.f31993w0, i6);
                        m8053f3 = m8038u.m8053f(x21.f31998x0, i6);
                        m8038u.m8036w();
                        if (m8053f != i6) {
                        }
                        if (m8053f2 != i6) {
                        }
                        if (m8053f3 == i6) {
                        }
                    }
                }
                str4 = str3;
                if (i11 >= 28) {
                }
                c1046d4 = m24713b;
                m7504C(context, m8037v2);
                m8037v2.m8036w();
                if (colorStateList != null) {
                }
                if (colorStateList2 != null) {
                }
                if (colorStateList3 != null) {
                }
                if (!z3) {
                }
                typeface = this.f29849l;
                if (typeface != null) {
                }
                if (str4 != null) {
                }
                if (str2 != null) {
                }
                this.f29846i.m5559o(attributeSet, i);
                if (InterfaceC3511x7.f32160a) {
                }
                m8038u = ul1.m8038u(context, attributeSet, x21.f31913g0);
                int m8045n222 = m8038u.m8045n(x21.f31953o0, -1);
                C1046d4 c1046d4222 = c1046d4;
                if (m8045n222 == -1) {
                }
                int m8045n322 = m8038u.m8045n(x21.f31978t0, -1);
                if (m8045n322 == -1) {
                }
                int m8045n422 = m8038u.m8045n(x21.f31958p0, -1);
                if (m8045n422 == -1) {
                }
                int m8045n522 = m8038u.m8045n(x21.f31943m0, -1);
                if (m8045n522 == -1) {
                }
                int m8045n622 = m8038u.m8045n(x21.f31963q0, -1);
                if (m8045n622 == -1) {
                }
                int m8045n722 = m8038u.m8045n(x21.f31948n0, -1);
                m7479y(m24712c, m24712c2, m24712c3, m24712c4, m24712c5, m8045n722 == -1 ? c1046d4222.m24712c(context, m8045n722) : null);
                i4 = x21.f31968r0;
                if (m8038u.m8040s(i4)) {
                }
                i5 = x21.f31973s0;
                if (m8038u.m8040s(i5)) {
                }
                m8053f = m8038u.m8053f(x21.f31988v0, i6);
                m8053f2 = m8038u.m8053f(x21.f31993w0, i6);
                m8053f3 = m8038u.m8053f(x21.f31998x0, i6);
                m8038u.m8036w();
                if (m8053f != i6) {
                }
                if (m8053f2 != i6) {
                }
                if (m8053f3 == i6) {
                }
            }
        }
        str3 = str;
        i2 = 23;
        if (i11 < i2) {
        }
        i3 = x21.f31906e3;
        if (m8037v2.m8040s(i3)) {
        }
        if (i11 >= 26) {
        }
        str4 = str3;
        if (i11 >= 28) {
        }
        c1046d4 = m24713b;
        m7504C(context, m8037v2);
        m8037v2.m8036w();
        if (colorStateList != null) {
        }
        if (colorStateList2 != null) {
        }
        if (colorStateList3 != null) {
        }
        if (!z3) {
        }
        typeface = this.f29849l;
        if (typeface != null) {
        }
        if (str4 != null) {
        }
        if (str2 != null) {
        }
        this.f29846i.m5559o(attributeSet, i);
        if (InterfaceC3511x7.f32160a) {
        }
        m8038u = ul1.m8038u(context, attributeSet, x21.f31913g0);
        int m8045n2222 = m8038u.m8045n(x21.f31953o0, -1);
        C1046d4 c1046d42222 = c1046d4;
        if (m8045n2222 == -1) {
        }
        int m8045n3222 = m8038u.m8045n(x21.f31978t0, -1);
        if (m8045n3222 == -1) {
        }
        int m8045n4222 = m8038u.m8045n(x21.f31958p0, -1);
        if (m8045n4222 == -1) {
        }
        int m8045n5222 = m8038u.m8045n(x21.f31943m0, -1);
        if (m8045n5222 == -1) {
        }
        int m8045n6222 = m8038u.m8045n(x21.f31963q0, -1);
        if (m8045n6222 == -1) {
        }
        int m8045n7222 = m8038u.m8045n(x21.f31948n0, -1);
        m7479y(m24712c, m24712c2, m24712c3, m24712c4, m24712c5, m8045n7222 == -1 ? c1046d42222.m24712c(context, m8045n7222) : null);
        i4 = x21.f31968r0;
        if (m8038u.m8040s(i4)) {
        }
        i5 = x21.f31973s0;
        if (m8038u.m8040s(i5)) {
        }
        m8053f = m8038u.m8053f(x21.f31988v0, i6);
        m8053f2 = m8038u.m8053f(x21.f31993w0, i6);
        m8053f3 = m8038u.m8053f(x21.f31998x0, i6);
        m8038u.m8036w();
        if (m8053f != i6) {
        }
        if (m8053f2 != i6) {
        }
        if (m8053f3 == i6) {
        }
    }

    /* renamed from: n */
    public void m7490n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f29850m) {
            this.f29849l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (xs1.m4743U(textView)) {
                    textView.post(new RunnableC3284b(textView, typeface, this.f29847j));
                } else {
                    textView.setTypeface(typeface, this.f29847j);
                }
            }
        }
    }

    /* renamed from: o */
    public void m7489o(boolean z, int i, int i2, int i3, int i4) {
        if (InterfaceC3511x7.f32160a) {
            return;
        }
        m7501c();
    }

    /* renamed from: p */
    public void m7488p() {
        m7502b();
    }

    /* renamed from: q */
    public void m7487q(Context context, int i) {
        String m8044o;
        ColorStateList m8056c;
        ColorStateList m8056c2;
        ColorStateList m8056c3;
        ul1 m8039t = ul1.m8039t(context, i, x21.f31851S2);
        int i2 = x21.f31901d3;
        if (m8039t.m8040s(i2)) {
            m7485s(m8039t.m8058a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = x21.f31869W2;
            if (m8039t.m8040s(i4) && (m8056c3 = m8039t.m8056c(i4)) != null) {
                this.f29838a.setTextColor(m8056c3);
            }
            int i5 = x21.f31877Y2;
            if (m8039t.m8040s(i5) && (m8056c2 = m8039t.m8056c(i5)) != null) {
                this.f29838a.setLinkTextColor(m8056c2);
            }
            int i6 = x21.f31873X2;
            if (m8039t.m8040s(i6) && (m8056c = m8039t.m8056c(i6)) != null) {
                this.f29838a.setHintTextColor(m8056c);
            }
        }
        int i7 = x21.f31856T2;
        if (m8039t.m8040s(i7) && m8039t.m8053f(i7, -1) == 0) {
            this.f29838a.setTextSize(0, 0.0f);
        }
        m7504C(context, m8039t);
        if (i3 >= 26) {
            int i8 = x21.f31896c3;
            if (m8039t.m8040s(i8) && (m8044o = m8039t.m8044o(i8)) != null) {
                C3288f.m7466d(this.f29838a, m8044o);
            }
        }
        m8039t.m8036w();
        Typeface typeface = this.f29849l;
        if (typeface != null) {
            this.f29838a.setTypeface(typeface, this.f29847j);
        }
    }

    /* renamed from: r */
    public void m7486r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        C2983sv.m9840f(editorInfo, textView.getText());
    }

    /* renamed from: s */
    public void m7485s(boolean z) {
        this.f29838a.setAllCaps(z);
    }

    /* renamed from: t */
    public void m7484t(int i, int i2, int i3, int i4) {
        this.f29846i.m5558p(i, i2, i3, i4);
    }

    /* renamed from: u */
    public void m7483u(int[] iArr, int i) {
        this.f29846i.m5557q(iArr, i);
    }

    /* renamed from: v */
    public void m7482v(int i) {
        this.f29846i.m5556r(i);
    }

    /* renamed from: w */
    public void m7481w(ColorStateList colorStateList) {
        if (this.f29845h == null) {
            this.f29845h = new sl1();
        }
        sl1 sl1Var = this.f29845h;
        sl1Var.f26349a = colorStateList;
        sl1Var.f26352d = colorStateList != null;
        m7478z();
    }

    /* renamed from: x */
    public void m7480x(PorterDuff.Mode mode) {
        if (this.f29845h == null) {
            this.f29845h = new sl1();
        }
        sl1 sl1Var = this.f29845h;
        sl1Var.f26350b = mode;
        sl1Var.f26351c = mode != null;
        m7478z();
    }

    /* renamed from: y */
    public final void m7479y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] m7475a = C3285c.m7475a(this.f29838a);
            TextView textView = this.f29838a;
            if (drawable5 == null) {
                drawable5 = m7475a[0];
            }
            if (drawable2 == null) {
                drawable2 = m7475a[1];
            }
            if (drawable6 == null) {
                drawable6 = m7475a[2];
            }
            if (drawable4 == null) {
                drawable4 = m7475a[3];
            }
            C3285c.m7474b(textView, drawable5, drawable2, drawable6, drawable4);
        } else if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
        } else {
            Drawable[] m7475a2 = C3285c.m7475a(this.f29838a);
            if (m7475a2[0] != null || m7475a2[2] != null) {
                TextView textView2 = this.f29838a;
                Drawable drawable7 = m7475a2[0];
                if (drawable2 == null) {
                    drawable2 = m7475a2[1];
                }
                Drawable drawable8 = m7475a2[2];
                if (drawable4 == null) {
                    drawable4 = m7475a2[3];
                }
                C3285c.m7474b(textView2, drawable7, drawable2, drawable8, drawable4);
                return;
            }
            Drawable[] compoundDrawables = this.f29838a.getCompoundDrawables();
            TextView textView3 = this.f29838a;
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

    /* renamed from: z */
    public final void m7478z() {
        sl1 sl1Var = this.f29845h;
        this.f29839b = sl1Var;
        this.f29840c = sl1Var;
        this.f29841d = sl1Var;
        this.f29842e = sl1Var;
        this.f29843f = sl1Var;
        this.f29844g = sl1Var;
    }
}
