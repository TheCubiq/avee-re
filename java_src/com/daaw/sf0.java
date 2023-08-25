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
    public final Context a;
    public final TextInputLayout b;
    public LinearLayout c;
    public int d;
    public FrameLayout e;
    public Animator f;
    public final float g;
    public int h;
    public int i;
    public CharSequence j;
    public boolean k;
    public TextView l;
    public CharSequence m;
    public int n;
    public ColorStateList o;
    public CharSequence p;
    public boolean q;
    public TextView r;
    public int s;
    public ColorStateList t;
    public Typeface u;

    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ int a;
        public final /* synthetic */ TextView b;
        public final /* synthetic */ int c;
        public final /* synthetic */ TextView d;

        public a(int i, TextView textView, int i2, TextView textView2) {
            this.a = i;
            this.b = textView;
            this.c = i2;
            this.d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            sf0.this.h = this.a;
            sf0.this.f = null;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.c == 1 && sf0.this.l != null) {
                    sf0.this.l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public sf0(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.a = context;
        this.b = textInputLayout;
        this.g = context.getResources().getDimensionPixelSize(f11.design_textinput_caption_translate_y);
    }

    public final void A(int i, int i2) {
        TextView l;
        TextView l2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (l2 = l(i2)) != null) {
            l2.setVisibility(0);
            l2.setAlpha(1.0f);
        }
        if (i != 0 && (l = l(i)) != null) {
            l.setVisibility(4);
            if (i == 1) {
                l.setText((CharSequence) null);
            }
        }
        this.h = i2;
    }

    public void B(CharSequence charSequence) {
        this.m = charSequence;
        TextView textView = this.l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void C(boolean z) {
        if (this.k == z) {
            return;
        }
        g();
        if (z) {
            w4 w4Var = new w4(this.a);
            this.l = w4Var;
            w4Var.setId(m11.textinput_error);
            this.l.setTextAlignment(5);
            Typeface typeface = this.u;
            if (typeface != null) {
                this.l.setTypeface(typeface);
            }
            D(this.n);
            E(this.o);
            B(this.m);
            this.l.setVisibility(4);
            xs1.t0(this.l, 1);
            d(this.l, 0);
        } else {
            t();
            z(this.l, 0);
            this.l = null;
            this.b.r0();
            this.b.E0();
        }
        this.k = z;
    }

    public void D(int i) {
        this.n = i;
        TextView textView = this.l;
        if (textView != null) {
            this.b.e0(textView, i);
        }
    }

    public void E(ColorStateList colorStateList) {
        this.o = colorStateList;
        TextView textView = this.l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void F(int i) {
        this.s = i;
        TextView textView = this.r;
        if (textView != null) {
            sk1.n(textView, i);
        }
    }

    public void G(boolean z) {
        if (this.q == z) {
            return;
        }
        g();
        if (z) {
            w4 w4Var = new w4(this.a);
            this.r = w4Var;
            w4Var.setId(m11.textinput_helper_text);
            this.r.setTextAlignment(5);
            Typeface typeface = this.u;
            if (typeface != null) {
                this.r.setTypeface(typeface);
            }
            this.r.setVisibility(4);
            xs1.t0(this.r, 1);
            F(this.s);
            H(this.t);
            d(this.r, 1);
        } else {
            u();
            z(this.r, 1);
            this.r = null;
            this.b.r0();
            this.b.E0();
        }
        this.q = z;
    }

    public void H(ColorStateList colorStateList) {
        this.t = colorStateList;
        TextView textView = this.r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public final void I(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    public void J(Typeface typeface) {
        if (typeface != this.u) {
            this.u = typeface;
            I(this.l, typeface);
            I(this.r, typeface);
        }
    }

    public final void K(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public final boolean L(TextView textView, CharSequence charSequence) {
        return xs1.V(this.b) && this.b.isEnabled() && !(this.i == this.h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public void M(CharSequence charSequence) {
        g();
        this.j = charSequence;
        this.l.setText(charSequence);
        int i = this.h;
        if (i != 1) {
            this.i = 1;
        }
        O(i, this.i, L(this.l, charSequence));
    }

    public void N(CharSequence charSequence) {
        g();
        this.p = charSequence;
        this.r.setText(charSequence);
        int i = this.h;
        if (i != 2) {
            this.i = 2;
        }
        O(i, this.i, L(this.r, charSequence));
    }

    public final void O(int i, int i2, boolean z) {
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f = animatorSet;
            ArrayList arrayList = new ArrayList();
            h(arrayList, this.q, this.r, 2, i, i2);
            h(arrayList, this.k, this.l, 1, i, i2);
            i3.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i2, l(i), i, l(i2)));
            animatorSet.start();
        } else {
            A(i, i2);
        }
        this.b.r0();
        this.b.u0(z);
        this.b.E0();
    }

    public void d(TextView textView, int i) {
        if (this.c == null && this.e == null) {
            LinearLayout linearLayout = new LinearLayout(this.a);
            this.c = linearLayout;
            linearLayout.setOrientation(0);
            this.b.addView(this.c, -1, -2);
            this.e = new FrameLayout(this.a);
            this.c.addView(this.e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.b.getEditText() != null) {
                e();
            }
        }
        if (w(i)) {
            this.e.setVisibility(0);
            this.e.addView(textView);
        } else {
            this.c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.c.setVisibility(0);
        this.d++;
    }

    public void e() {
        if (f()) {
            EditText editText = this.b.getEditText();
            boolean g = mn0.g(this.a);
            LinearLayout linearLayout = this.c;
            int i = f11.material_helper_text_font_1_3_padding_horizontal;
            xs1.E0(linearLayout, s(g, i, xs1.J(editText)), s(g, f11.material_helper_text_font_1_3_padding_top, this.a.getResources().getDimensionPixelSize(f11.material_helper_text_default_padding_top)), s(g, i, xs1.I(editText)), 0);
        }
    }

    public final boolean f() {
        return (this.c == null || this.b.getEditText() == null) ? false : true;
    }

    public void g() {
        Animator animator = this.f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void h(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            list.add(i(textView, i3 == i));
            if (i3 == i) {
                list.add(j(textView));
            }
        }
    }

    public final ObjectAnimator i(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, z ? 1.0f : 0.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(f3.a);
        return ofFloat;
    }

    public final ObjectAnimator j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.g, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(f3.d);
        return ofFloat;
    }

    public boolean k() {
        return v(this.i);
    }

    public final TextView l(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.r;
        }
        return this.l;
    }

    public CharSequence m() {
        return this.m;
    }

    public CharSequence n() {
        return this.j;
    }

    public int o() {
        TextView textView = this.l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public ColorStateList p() {
        TextView textView = this.l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public CharSequence q() {
        return this.p;
    }

    public int r() {
        TextView textView = this.r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int s(boolean z, int i, int i2) {
        return z ? this.a.getResources().getDimensionPixelSize(i) : i2;
    }

    public void t() {
        this.j = null;
        g();
        if (this.h == 1) {
            this.i = (!this.q || TextUtils.isEmpty(this.p)) ? 0 : 2;
        }
        O(this.h, this.i, L(this.l, null));
    }

    public void u() {
        g();
        int i = this.h;
        if (i == 2) {
            this.i = 0;
        }
        O(i, this.i, L(this.r, null));
    }

    public final boolean v(int i) {
        return (i != 1 || this.l == null || TextUtils.isEmpty(this.j)) ? false : true;
    }

    public boolean w(int i) {
        return i == 0 || i == 1;
    }

    public boolean x() {
        return this.k;
    }

    public boolean y() {
        return this.q;
    }

    public void z(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.c == null) {
            return;
        }
        if (!w(i) || (frameLayout = this.e) == null) {
            this.c.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i2 = this.d - 1;
        this.d = i2;
        K(this.c, i2);
    }
}
