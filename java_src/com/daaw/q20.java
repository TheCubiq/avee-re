package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.C4094a;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class q20 extends C4094a {
    public q20(FloatingActionButton floatingActionButton, fc1 fc1Var) {
        super(floatingActionButton, fc1Var);
    }

    @Override // com.google.android.material.floatingactionbutton.C4094a
    /* renamed from: A */
    public void mo431A() {
        m402b0();
    }

    @Override // com.google.android.material.floatingactionbutton.C4094a
    /* renamed from: C */
    public void mo429C(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            float f = 0.0f;
            if (this.f37602x.isEnabled()) {
                this.f37602x.setElevation(this.f37585g);
                if (this.f37602x.isPressed()) {
                    floatingActionButton = this.f37602x;
                    f = this.f37587i;
                } else if (this.f37602x.isFocused() || this.f37602x.isHovered()) {
                    floatingActionButton = this.f37602x;
                    f = this.f37586h;
                }
                floatingActionButton.setTranslationZ(f);
            }
            this.f37602x.setElevation(0.0f);
            floatingActionButton = this.f37602x;
            floatingActionButton.setTranslationZ(f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C4094a
    /* renamed from: D */
    public void mo428D(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            this.f37602x.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C4094a.f37569F, m12796e0(f, f3));
            stateListAnimator.addState(C4094a.f37570G, m12796e0(f, f2));
            stateListAnimator.addState(C4094a.f37571H, m12796e0(f, f2));
            stateListAnimator.addState(C4094a.f37572I, m12796e0(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f37602x, "elevation", f).setDuration(0L));
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.f37602x;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f37602x, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C4094a.f37568E);
            stateListAnimator.addState(C4094a.f37573J, animatorSet);
            stateListAnimator.addState(C4094a.f37574K, m12796e0(0.0f, 0.0f));
            this.f37602x.setStateListAnimator(stateListAnimator);
        }
        if (mo410V()) {
            m402b0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C4094a
    /* renamed from: I */
    public boolean mo423I() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.C4094a
    /* renamed from: R */
    public void mo414R(ColorStateList colorStateList) {
        Drawable drawable = this.f37581c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(z51.m2812a(colorStateList));
        } else {
            super.mo414R(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C4094a
    /* renamed from: V */
    public boolean mo410V() {
        return this.f37603y.mo432c() || !m408X();
    }

    @Override // com.google.android.material.floatingactionbutton.C4094a
    /* renamed from: Z */
    public void mo406Z() {
    }

    /* renamed from: e0 */
    public final Animator m12796e0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f37602x, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f37602x, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(C4094a.f37568E);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.C4094a
    /* renamed from: m */
    public float mo389m() {
        return this.f37602x.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.C4094a
    /* renamed from: r */
    public void mo384r(Rect rect) {
        if (this.f37603y.mo432c()) {
            super.mo384r(rect);
            return;
        }
        int sizeDimension = !m408X() ? (this.f37588j - this.f37602x.getSizeDimension()) / 2 : 0;
        rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
    }

    @Override // com.google.android.material.floatingactionbutton.C4094a
    /* renamed from: y */
    public void mo377y() {
    }
}
