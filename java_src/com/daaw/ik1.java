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

    /* renamed from: a */
    public final ColorStateList f13693a;

    /* renamed from: b */
    public final ColorStateList f13694b;

    /* renamed from: c */
    public final ColorStateList f13695c;

    /* renamed from: d */
    public final ColorStateList f13696d;

    /* renamed from: e */
    public final String f13697e;

    /* renamed from: f */
    public final int f13698f;

    /* renamed from: g */
    public final int f13699g;

    /* renamed from: h */
    public final boolean f13700h;

    /* renamed from: i */
    public final float f13701i;

    /* renamed from: j */
    public final float f13702j;

    /* renamed from: k */
    public final float f13703k;

    /* renamed from: l */
    public final boolean f13704l;

    /* renamed from: m */
    public final float f13705m;

    /* renamed from: n */
    public float f13706n;

    /* renamed from: o */
    public final int f13707o;

    /* renamed from: p */
    public boolean f13708p = false;

    /* renamed from: q */
    public Typeface f13709q;

    /* renamed from: com.daaw.ik1$a */
    /* loaded from: classes2.dex */
    public class C1716a extends j51.AbstractC1794f {

        /* renamed from: a */
        public final /* synthetic */ kk1 f13710a;

        public C1716a(kk1 kk1Var) {
            this.f13710a = kk1Var;
        }

        @Override // com.daaw.j51.AbstractC1794f
        /* renamed from: h */
        public void mo7477h(int i) {
            ik1.this.f13708p = true;
            this.f13710a.mo784a(i);
        }

        @Override // com.daaw.j51.AbstractC1794f
        /* renamed from: i */
        public void mo7476i(Typeface typeface) {
            ik1 ik1Var = ik1.this;
            ik1Var.f13709q = Typeface.create(typeface, ik1Var.f13698f);
            ik1.this.f13708p = true;
            this.f13710a.mo783b(ik1.this.f13709q, false);
        }
    }

    /* renamed from: com.daaw.ik1$b */
    /* loaded from: classes2.dex */
    public class C1717b extends kk1 {

        /* renamed from: a */
        public final /* synthetic */ TextPaint f13712a;

        /* renamed from: b */
        public final /* synthetic */ kk1 f13713b;

        public C1717b(TextPaint textPaint, kk1 kk1Var) {
            this.f13712a = textPaint;
            this.f13713b = kk1Var;
        }

        @Override // com.daaw.kk1
        /* renamed from: a */
        public void mo784a(int i) {
            this.f13713b.mo784a(i);
        }

        @Override // com.daaw.kk1
        /* renamed from: b */
        public void mo783b(Typeface typeface, boolean z) {
            ik1.this.m19731l(this.f13712a, typeface);
            this.f13713b.mo783b(typeface, z);
        }
    }

    public ik1(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, m21.f18012A4);
        this.f13706n = obtainStyledAttributes.getDimension(m21.f18019B4, 0.0f);
        this.f13693a = mn0.m15930a(context, obtainStyledAttributes, m21.f18040E4);
        this.f13694b = mn0.m15930a(context, obtainStyledAttributes, m21.f18047F4);
        this.f13695c = mn0.m15930a(context, obtainStyledAttributes, m21.f18054G4);
        this.f13698f = obtainStyledAttributes.getInt(m21.f18033D4, 0);
        this.f13699g = obtainStyledAttributes.getInt(m21.f18026C4, 1);
        int m15926e = mn0.m15926e(obtainStyledAttributes, m21.f18096M4, m21.f18089L4);
        this.f13707o = obtainStyledAttributes.getResourceId(m15926e, 0);
        this.f13697e = obtainStyledAttributes.getString(m15926e);
        this.f13700h = obtainStyledAttributes.getBoolean(m21.f18103N4, false);
        this.f13696d = mn0.m15930a(context, obtainStyledAttributes, m21.f18061H4);
        this.f13701i = obtainStyledAttributes.getFloat(m21.f18068I4, 0.0f);
        this.f13702j = obtainStyledAttributes.getFloat(m21.f18075J4, 0.0f);
        this.f13703k = obtainStyledAttributes.getFloat(m21.f18082K4, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT < 21) {
            this.f13704l = false;
            this.f13705m = 0.0f;
            return;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, m21.f18115P2);
        int i2 = m21.f18122Q2;
        this.f13704l = obtainStyledAttributes2.hasValue(i2);
        this.f13705m = obtainStyledAttributes2.getFloat(i2, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: d */
    public final void m19739d() {
        String str;
        if (this.f13709q == null && (str = this.f13697e) != null) {
            this.f13709q = Typeface.create(str, this.f13698f);
        }
        if (this.f13709q == null) {
            int i = this.f13699g;
            this.f13709q = i != 1 ? i != 2 ? i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f13709q = Typeface.create(this.f13709q, this.f13698f);
        }
    }

    /* renamed from: e */
    public Typeface m19738e() {
        m19739d();
        return this.f13709q;
    }

    /* renamed from: f */
    public Typeface m19737f(Context context) {
        if (this.f13708p) {
            return this.f13709q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface m18894f = j51.m18894f(context, this.f13707o);
                this.f13709q = m18894f;
                if (m18894f != null) {
                    this.f13709q = Typeface.create(m18894f, this.f13698f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception unused2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error loading font ");
                sb.append(this.f13697e);
            }
        }
        m19739d();
        this.f13708p = true;
        return this.f13709q;
    }

    /* renamed from: g */
    public void m19736g(Context context, TextPaint textPaint, kk1 kk1Var) {
        m19731l(textPaint, m19738e());
        m19735h(context, new C1717b(textPaint, kk1Var));
    }

    /* renamed from: h */
    public void m19735h(Context context, kk1 kk1Var) {
        if (m19734i(context)) {
            m19737f(context);
        } else {
            m19739d();
        }
        int i = this.f13707o;
        if (i == 0) {
            this.f13708p = true;
        }
        if (this.f13708p) {
            kk1Var.mo783b(this.f13709q, true);
            return;
        }
        try {
            j51.m18892h(context, i, new C1716a(kk1Var), null);
        } catch (Resources.NotFoundException unused) {
            this.f13708p = true;
            kk1Var.mo784a(1);
        } catch (Exception unused2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error loading font ");
            sb.append(this.f13697e);
            this.f13708p = true;
            kk1Var.mo784a(-3);
        }
    }

    /* renamed from: i */
    public final boolean m19734i(Context context) {
        return jk1.m18454a();
    }

    /* renamed from: j */
    public void m19733j(Context context, TextPaint textPaint, kk1 kk1Var) {
        m19732k(context, textPaint, kk1Var);
        ColorStateList colorStateList = this.f13693a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f13703k;
        float f2 = this.f13701i;
        float f3 = this.f13702j;
        ColorStateList colorStateList2 = this.f13696d;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: k */
    public void m19732k(Context context, TextPaint textPaint, kk1 kk1Var) {
        if (m19734i(context)) {
            m19731l(textPaint, m19737f(context));
        } else {
            m19736g(context, textPaint, kk1Var);
        }
    }

    /* renamed from: l */
    public void m19731l(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ (-1)) & this.f13698f;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f13706n);
        if (Build.VERSION.SDK_INT < 21 || !this.f13704l) {
            return;
        }
        textPaint.setLetterSpacing(this.f13705m);
    }
}
