package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public class Group extends AbstractC0181b {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0181b
    /* renamed from: g */
    public void mo12220g(AttributeSet attributeSet) {
        super.mo12220g(attributeSet);
        this.f986t = false;
    }

    @Override // androidx.constraintlayout.widget.AbstractC0181b
    /* renamed from: i */
    public void mo29865i(ConstraintLayout constraintLayout) {
        ConstraintLayout.C0175b c0175b = (ConstraintLayout.C0175b) getLayoutParams();
        c0175b.f943n0.m12466B0(0);
        c0175b.f943n0.m12432e0(0);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0181b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m29870c();
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
