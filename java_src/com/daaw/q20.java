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
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class q20 extends com.google.android.material.floatingactionbutton.a {
    public q20(FloatingActionButton floatingActionButton, fc1 fc1Var) {
        super(floatingActionButton, fc1Var);
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void A() {
        b0();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void C(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            float f = 0.0f;
            if (this.x.isEnabled()) {
                this.x.setElevation(this.g);
                if (this.x.isPressed()) {
                    floatingActionButton = this.x;
                    f = this.i;
                } else if (this.x.isFocused() || this.x.isHovered()) {
                    floatingActionButton = this.x;
                    f = this.h;
                }
                floatingActionButton.setTranslationZ(f);
            }
            this.x.setElevation(0.0f);
            floatingActionButton = this.x;
            floatingActionButton.setTranslationZ(f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void D(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            this.x.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.F, e0(f, f3));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.G, e0(f, f2));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.H, e0(f, f2));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.I, e0(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.x, "elevation", f).setDuration(0L));
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.x;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.x, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.a.E);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.J, animatorSet);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.K, e0(0.0f, 0.0f));
            this.x.setStateListAnimator(stateListAnimator);
        }
        if (V()) {
            b0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public boolean I() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void R(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(z51.a(colorStateList));
        } else {
            super.R(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public boolean V() {
        return this.y.c() || !X();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void Z() {
    }

    public final Animator e0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.x, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.x, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.a.E);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public float m() {
        return this.x.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void r(Rect rect) {
        if (this.y.c()) {
            super.r(rect);
            return;
        }
        int sizeDimension = !X() ? (this.j - this.x.getSizeDimension()) / 2 : 0;
        rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void y() {
    }
}
