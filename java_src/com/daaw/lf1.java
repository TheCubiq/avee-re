package com.daaw;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import com.daaw.C2477ou;
@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public class lf1 extends C2477ou {

    /* renamed from: B */
    public C2036a f17363B;

    /* renamed from: C */
    public boolean f17364C;

    /* renamed from: com.daaw.lf1$a */
    /* loaded from: classes.dex */
    public static class C2036a extends C2477ou.AbstractC2481d {

        /* renamed from: J */
        public int[][] f17365J;

        public C2036a(C2036a c2036a, lf1 lf1Var, Resources resources) {
            super(c2036a, lf1Var, resources);
            if (c2036a != null) {
                this.f17365J = c2036a.f17365J;
            } else {
                this.f17365J = new int[m13952f()];
            }
        }

        /* renamed from: A */
        public int m16969A(int[] iArr) {
            int[][] iArr2 = this.f17365J;
            int m13950h = m13950h();
            for (int i = 0; i < m13950h; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new lf1(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new lf1(this, resources);
        }

        @Override // com.daaw.C2477ou.AbstractC2481d
        /* renamed from: o */
        public void mo13943o(int i, int i2) {
            super.mo13943o(i, i2);
            int[][] iArr = new int[i2];
            System.arraycopy(this.f17365J, 0, iArr, 0, i);
            this.f17365J = iArr;
        }

        @Override // com.daaw.C2477ou.AbstractC2481d
        /* renamed from: r */
        public void mo13940r() {
            int[][] iArr = this.f17365J;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f17365J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f17365J = iArr2;
        }

        /* renamed from: z */
        public int m16968z(int[] iArr, Drawable drawable) {
            int m13957a = m13957a(drawable);
            this.f17365J[m13957a] = iArr;
            return m13957a;
        }
    }

    public lf1(C2036a c2036a) {
        if (c2036a != null) {
            mo13964h(c2036a);
        }
    }

    public lf1(C2036a c2036a, Resources resources) {
        mo13964h(new C2036a(c2036a, this, resources));
        onStateChange(getState());
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // com.daaw.C2477ou
    /* renamed from: h */
    public void mo13964h(C2477ou.AbstractC2481d abstractC2481d) {
        super.mo13964h(abstractC2481d);
        if (abstractC2481d instanceof C2036a) {
            this.f17363B = (C2036a) abstractC2481d;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // com.daaw.C2477ou
    /* renamed from: j */
    public C2036a mo13970b() {
        return new C2036a(this.f17363B, this, null);
    }

    /* renamed from: k */
    public int[] m16970k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f17364C && super.mutate() == this) {
            this.f17363B.mo13940r();
            this.f17364C = true;
        }
        return this;
    }

    @Override // com.daaw.C2477ou, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int m16969A = this.f17363B.m16969A(iArr);
        if (m16969A < 0) {
            m16969A = this.f17363B.m16969A(StateSet.WILD_CARD);
        }
        return m13965g(m16969A) || onStateChange;
    }
}
