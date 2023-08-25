package com.daaw;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import com.daaw.ou;
@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public class lf1 extends ou {
    public a B;
    public boolean C;

    /* loaded from: classes.dex */
    public static class a extends ou.d {
        public int[][] J;

        public a(a aVar, lf1 lf1Var, Resources resources) {
            super(aVar, lf1Var, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[f()];
            }
        }

        public int A(int[] iArr) {
            int[][] iArr2 = this.J;
            int h = h();
            for (int i = 0; i < h; i++) {
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

        @Override // com.daaw.ou.d
        public void o(int i, int i2) {
            super.o(i, i2);
            int[][] iArr = new int[i2];
            System.arraycopy(this.J, 0, iArr, 0, i);
            this.J = iArr;
        }

        @Override // com.daaw.ou.d
        public void r() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.J = iArr2;
        }

        public int z(int[] iArr, Drawable drawable) {
            int a = a(drawable);
            this.J[a] = iArr;
            return a;
        }
    }

    public lf1(a aVar) {
        if (aVar != null) {
            h(aVar);
        }
    }

    public lf1(a aVar, Resources resources) {
        h(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // com.daaw.ou
    public void h(ou.d dVar) {
        super.h(dVar);
        if (dVar instanceof a) {
            this.B = (a) dVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // com.daaw.ou
    /* renamed from: j */
    public a b() {
        return new a(this.B, this, null);
    }

    public int[] k(AttributeSet attributeSet) {
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

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.C && super.mutate() == this) {
            this.B.r();
            this.C = true;
        }
        return this;
    }

    @Override // com.daaw.ou, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int A = this.B.A(iArr);
        if (A < 0) {
            A = this.B.A(StateSet.WILD_CARD);
        }
        return g(A) || onStateChange;
    }
}
