package com.daaw;

import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.AbstractC0181b;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public abstract class qu1 extends AbstractC0181b {

    /* renamed from: x */
    public boolean f24330x;

    /* renamed from: y */
    public boolean f24331y;

    @Override // androidx.constraintlayout.widget.AbstractC0181b
    /* renamed from: g */
    public void mo12220g(AttributeSet attributeSet) {
        super.mo12220g(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p21.f22371a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == p21.f22385c1) {
                    this.f24330x = true;
                } else if (index == p21.f22420h1) {
                    this.f24331y = true;
                }
            }
        }
    }

    /* renamed from: n */
    public void m12219n(ru1 ru1Var, int i, int i2) {
    }

    @Override // androidx.constraintlayout.widget.AbstractC0181b, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f24330x || this.f24331y) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
            for (int i = 0; i < this.f983q; i++) {
                View m29890h = constraintLayout.m29890h(this.f982p[i]);
                if (m29890h != null) {
                    if (this.f24330x) {
                        m29890h.setVisibility(visibility);
                    }
                    if (this.f24331y && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                        m29890h.setTranslationZ(m29890h.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m29870c();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m29870c();
    }
}
