package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class sf0 {

    /* renamed from: a */
    public final Context f26203a;

    /* renamed from: b */
    public final TextInputLayout f26204b;

    /* renamed from: c */
    public LinearLayout f26205c;

    /* renamed from: d */
    public int f26206d;

    /* renamed from: e */
    public FrameLayout f26207e;

    /* renamed from: f */
    public Animator f26208f;

    /* renamed from: g */
    public final float f26209g;

    /* renamed from: h */
    public int f26210h;

    /* renamed from: i */
    public int f26211i;

    /* renamed from: j */
    public CharSequence f26212j;

    /* renamed from: k */
    public boolean f26213k;

    /* renamed from: l */
    public TextView f26214l;

    /* renamed from: m */
    public CharSequence f26215m;

    /* renamed from: n */
    public int f26216n;

    /* renamed from: o */
    public ColorStateList f26217o;

    /* renamed from: p */
    public CharSequence f26218p;

    /* renamed from: q */
    public boolean f26219q;

    /* renamed from: r */
    public TextView f26220r;

    /* renamed from: s */
    public int f26221s;

    /* renamed from: t */
    public ColorStateList f26222t;

    /* renamed from: u */
    public Typeface f26223u;

    /* renamed from: com.daaw.sf0$a */
    /* loaded from: classes2.dex */
    public class C2936a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f26224a;

        /* renamed from: b */
        public final /* synthetic */ TextView f26225b;

        /* renamed from: c */
        public final /* synthetic */ int f26226c;

        /* renamed from: d */
        public final /* synthetic */ TextView f26227d;

        public C2936a(int i, TextView textView, int i2, TextView textView2) {
            this.f26224a = i;
            this.f26225b = textView;
            this.f26226c = i2;
            this.f26227d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            sf0.this.f26210h = this.f26224a;
            sf0.this.f26208f = null;
            TextView textView = this.f26225b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f26226c == 1 && sf0.this.f26214l != null) {
                    sf0.this.f26214l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f26227d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f26227d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f26227d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public sf0(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f26203a = context;
        this.f26204b = textInputLayout;
        this.f26209g = context.getResources().getDimensionPixelSize(f11.design_textinput_caption_translate_y);
    }

    /* renamed from: A */
    public final void m10426A(int i, int i2) {
        TextView m10400l;
        TextView m10400l2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (m10400l2 = m10400l(i2)) != null) {
            m10400l2.setVisibility(0);
            m10400l2.setAlpha(1.0f);
        }
        if (i != 0 && (m10400l = m10400l(i)) != null) {
            m10400l.setVisibility(4);
            if (i == 1) {
                m10400l.setText((CharSequence) null);
            }
        }
        this.f26210h = i2;
    }

    /* renamed from: B */
    public void m10425B(CharSequence charSequence) {
        this.f26215m = charSequence;
        TextView textView = this.f26214l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* renamed from: C */
    public void m10424C(boolean z) {
        if (this.f26213k == z) {
            return;
        }
        m10405g();
        if (z) {
            C3397w4 c3397w4 = new C3397w4(this.f26203a);
            this.f26214l = c3397w4;
            c3397w4.setId(m11.textinput_error);
            this.f26214l.setTextAlignment(5);
            Typeface typeface = this.f26223u;
            if (typeface != null) {
                this.f26214l.setTypeface(typeface);
            }
            m10423D(this.f26216n);
            m10422E(this.f26217o);
            m10425B(this.f26215m);
            this.f26214l.setVisibility(4);
            xs1.m4698t0(this.f26214l, 1);
            m10408d(this.f26214l, 0);
        } else {
            m10392t();
            m10386z(this.f26214l, 0);
            this.f26214l = null;
            this.f26204b.m253r0();
            this.f26204b.m310E0();
        }
        this.f26213k = z;
    }

    /* renamed from: D */
    public void m10423D(int i) {
        this.f26216n = i;
        TextView textView = this.f26214l;
        if (textView != null) {
            this.f26204b.m279e0(textView, i);
        }
    }

    /* renamed from: E */
    public void m10422E(ColorStateList colorStateList) {
        this.f26217o = colorStateList;
        TextView textView = this.f26214l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* renamed from: F */
    public void m10421F(int i) {
        this.f26221s = i;
        TextView textView = this.f26220r;
        if (textView != null) {
            sk1.m10260n(textView, i);
        }
    }

    /* renamed from: G */
    public void m10420G(boolean z) {
        if (this.f26219q == z) {
            return;
        }
        m10405g();
        if (z) {
            C3397w4 c3397w4 = new C3397w4(this.f26203a);
            this.f26220r = c3397w4;
            c3397w4.setId(m11.textinput_helper_text);
            this.f26220r.setTextAlignment(5);
            Typeface typeface = this.f26223u;
            if (typeface != null) {
                this.f26220r.setTypeface(typeface);
            }
            this.f26220r.setVisibility(4);
            xs1.m4698t0(this.f26220r, 1);
            m10421F(this.f26221s);
            m10419H(this.f26222t);
            m10408d(this.f26220r, 1);
        } else {
            m10391u();
            m10386z(this.f26220r, 1);
            this.f26220r = null;
            this.f26204b.m253r0();
            this.f26204b.m310E0();
        }
        this.f26219q = z;
    }

    /* renamed from: H */
    public void m10419H(ColorStateList colorStateList) {
        this.f26222t = colorStateList;
        TextView textView = this.f26220r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* renamed from: I */
    public final void m10418I(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: J */
    public void m10417J(Typeface typeface) {
        if (typeface != this.f26223u) {
            this.f26223u = typeface;
            m10418I(this.f26214l, typeface);
            m10418I(this.f26220r, typeface);
        }
    }

    /* renamed from: K */
    public final void m10416K(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: L */
    public final boolean m10415L(TextView textView, CharSequence charSequence) {
        return xs1.m4742V(this.f26204b) && this.f26204b.isEnabled() && !(this.f26211i == this.f26210h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: M */
    public void m10414M(CharSequence charSequence) {
        m10405g();
        this.f26212j = charSequence;
        this.f26214l.setText(charSequence);
        int i = this.f26210h;
        if (i != 1) {
            this.f26211i = 1;
        }
        m10412O(i, this.f26211i, m10415L(this.f26214l, charSequence));
    }

    /* renamed from: N */
    public void m10413N(CharSequence charSequence) {
        m10405g();
        this.f26218p = charSequence;
        this.f26220r.setText(charSequence);
        int i = this.f26210h;
        if (i != 2) {
            this.f26211i = 2;
        }
        m10412O(i, this.f26211i, m10415L(this.f26220r, charSequence));
    }

    /* renamed from: O */
    public final void m10412O(int i, int i2, boolean z) {
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f26208f = animatorSet;
            ArrayList arrayList = new ArrayList();
            m10404h(arrayList, this.f26219q, this.f26220r, 2, i, i2);
            m10404h(arrayList, this.f26213k, this.f26214l, 1, i, i2);
            C1653i3.m20165a(animatorSet, arrayList);
            animatorSet.addListener(new C2936a(i2, m10400l(i), i, m10400l(i2)));
            animatorSet.start();
        } else {
            m10426A(i, i2);
        }
        this.f26204b.m253r0();
        this.f26204b.m247u0(z);
        this.f26204b.m310E0();
    }

    /* renamed from: d */
    public void m10408d(TextView textView, int i) {
        if (this.f26205c == null && this.f26207e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f26203a);
            this.f26205c = linearLayout;
            linearLayout.setOrientation(0);
            this.f26204b.addView(this.f26205c, -1, -2);
            this.f26207e = new FrameLayout(this.f26203a);
            this.f26205c.addView(this.f26207e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f26204b.getEditText() != null) {
                m10407e();
            }
        }
        if (m10389w(i)) {
            this.f26207e.setVisibility(0);
            this.f26207e.addView(textView);
        } else {
            this.f26205c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f26205c.setVisibility(0);
        this.f26206d++;
    }

    /* renamed from: e */
    public void m10407e() {
        if (m10406f()) {
            EditText editText = this.f26204b.getEditText();
            boolean m15924g = mn0.m15924g(this.f26203a);
            LinearLayout linearLayout = this.f26205c;
            int i = f11.material_helper_text_font_1_3_padding_horizontal;
            xs1.m4767E0(linearLayout, m10393s(m15924g, i, xs1.m4758J(editText)), m10393s(m15924g, f11.material_helper_text_font_1_3_padding_top, this.f26203a.getResources().getDimensionPixelSize(f11.material_helper_text_default_padding_top)), m10393s(m15924g, i, xs1.m4760I(editText)), 0);
        }
    }

    /* renamed from: f */
    public final boolean m10406f() {
        return (this.f26205c == null || this.f26204b.getEditText() == null) ? false : true;
    }

    /* renamed from: g */
    public void m10405g() {
        Animator animator = this.f26208f;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: h */
    public final void m10404h(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            list.add(m10403i(textView, i3 == i));
            if (i3 == i) {
                list.add(m10402j(textView));
            }
        }
    }

    /* renamed from: i */
    public final ObjectAnimator m10403i(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, z ? 1.0f : 0.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(C1247f3.f9051a);
        return ofFloat;
    }

    /* renamed from: j */
    public final ObjectAnimator m10402j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f26209g, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(C1247f3.f9054d);
        return ofFloat;
    }

    /* renamed from: k */
    public boolean m10401k() {
        return m10390v(this.f26211i);
    }

    /* renamed from: l */
    public final TextView m10400l(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.f26220r;
        }
        return this.f26214l;
    }

    /* renamed from: m */
    public CharSequence m10399m() {
        return this.f26215m;
    }

    /* renamed from: n */
    public CharSequence m10398n() {
        return this.f26212j;
    }

    /* renamed from: o */
    public int m10397o() {
        TextView textView = this.f26214l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: p */
    public ColorStateList m10396p() {
        TextView textView = this.f26214l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* renamed from: q */
    public CharSequence m10395q() {
        return this.f26218p;
    }

    /* renamed from: r */
    public int m10394r() {
        TextView textView = this.f26220r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: s */
    public final int m10393s(boolean z, int i, int i2) {
        return z ? this.f26203a.getResources().getDimensionPixelSize(i) : i2;
    }

    /* renamed from: t */
    public void m10392t() {
        this.f26212j = null;
        m10405g();
        if (this.f26210h == 1) {
            this.f26211i = (!this.f26219q || TextUtils.isEmpty(this.f26218p)) ? 0 : 2;
        }
        m10412O(this.f26210h, this.f26211i, m10415L(this.f26214l, null));
    }

    /* renamed from: u */
    public void m10391u() {
        m10405g();
        int i = this.f26210h;
        if (i == 2) {
            this.f26211i = 0;
        }
        m10412O(i, this.f26211i, m10415L(this.f26220r, null));
    }

    /* renamed from: v */
    public final boolean m10390v(int i) {
        return (i != 1 || this.f26214l == null || TextUtils.isEmpty(this.f26212j)) ? false : true;
    }

    /* renamed from: w */
    public boolean m10389w(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: x */
    public boolean m10388x() {
        return this.f26213k;
    }

    /* renamed from: y */
    public boolean m10387y() {
        return this.f26219q;
    }

    /* renamed from: z */
    public void m10386z(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f26205c == null) {
            return;
        }
        if (!m10389w(i) || (frameLayout = this.f26207e) == null) {
            this.f26205c.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i2 = this.f26206d - 1;
        this.f26206d = i2;
        m10416K(this.f26205c, i2);
    }
}
