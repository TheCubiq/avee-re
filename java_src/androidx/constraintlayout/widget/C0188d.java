package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.daaw.p21;
/* renamed from: androidx.constraintlayout.widget.d */
/* loaded from: classes.dex */
public class C0188d extends ViewGroup {

    /* renamed from: p */
    public C0182c f1091p;

    /* renamed from: androidx.constraintlayout.widget.d$a */
    /* loaded from: classes.dex */
    public static class C0189a extends ConstraintLayout.C0175b {

        /* renamed from: A0 */
        public float f1092A0;

        /* renamed from: B0 */
        public float f1093B0;

        /* renamed from: p0 */
        public float f1094p0;

        /* renamed from: q0 */
        public boolean f1095q0;

        /* renamed from: r0 */
        public float f1096r0;

        /* renamed from: s0 */
        public float f1097s0;

        /* renamed from: t0 */
        public float f1098t0;

        /* renamed from: u0 */
        public float f1099u0;

        /* renamed from: v0 */
        public float f1100v0;

        /* renamed from: w0 */
        public float f1101w0;

        /* renamed from: x0 */
        public float f1102x0;

        /* renamed from: y0 */
        public float f1103y0;

        /* renamed from: z0 */
        public float f1104z0;

        public C0189a(int i, int i2) {
            super(i, i2);
            this.f1094p0 = 1.0f;
            this.f1095q0 = false;
            this.f1096r0 = 0.0f;
            this.f1097s0 = 0.0f;
            this.f1098t0 = 0.0f;
            this.f1099u0 = 0.0f;
            this.f1100v0 = 1.0f;
            this.f1101w0 = 1.0f;
            this.f1102x0 = 0.0f;
            this.f1103y0 = 0.0f;
            this.f1104z0 = 0.0f;
            this.f1092A0 = 0.0f;
            this.f1093B0 = 0.0f;
        }

        public C0189a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1094p0 = 1.0f;
            this.f1095q0 = false;
            this.f1096r0 = 0.0f;
            this.f1097s0 = 0.0f;
            this.f1098t0 = 0.0f;
            this.f1099u0 = 0.0f;
            this.f1100v0 = 1.0f;
            this.f1101w0 = 1.0f;
            this.f1102x0 = 0.0f;
            this.f1103y0 = 0.0f;
            this.f1104z0 = 0.0f;
            this.f1092A0 = 0.0f;
            this.f1093B0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p21.f22465o2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == p21.f22471p2) {
                    this.f1094p0 = obtainStyledAttributes.getFloat(index, this.f1094p0);
                } else if (index == p21.f22216A2) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f1096r0 = obtainStyledAttributes.getFloat(index, this.f1096r0);
                        this.f1095q0 = true;
                    }
                } else if (index == p21.f22519x2) {
                    this.f1098t0 = obtainStyledAttributes.getFloat(index, this.f1098t0);
                } else if (index == p21.f22525y2) {
                    this.f1099u0 = obtainStyledAttributes.getFloat(index, this.f1099u0);
                } else if (index == p21.f22513w2) {
                    this.f1097s0 = obtainStyledAttributes.getFloat(index, this.f1097s0);
                } else if (index == p21.f22501u2) {
                    this.f1100v0 = obtainStyledAttributes.getFloat(index, this.f1100v0);
                } else if (index == p21.f22507v2) {
                    this.f1101w0 = obtainStyledAttributes.getFloat(index, this.f1101w0);
                } else if (index == p21.f22477q2) {
                    this.f1102x0 = obtainStyledAttributes.getFloat(index, this.f1102x0);
                } else if (index == p21.f22483r2) {
                    this.f1103y0 = obtainStyledAttributes.getFloat(index, this.f1103y0);
                } else if (index == p21.f22489s2) {
                    this.f1104z0 = obtainStyledAttributes.getFloat(index, this.f1104z0);
                } else if (index == p21.f22495t2) {
                    this.f1092A0 = obtainStyledAttributes.getFloat(index, this.f1092A0);
                } else if (index == p21.f22531z2 && Build.VERSION.SDK_INT >= 21) {
                    this.f1093B0 = obtainStyledAttributes.getFloat(index, this.f1093B0);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: a */
    public C0189a generateDefaultLayoutParams() {
        return new C0189a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public C0189a generateLayoutParams(AttributeSet attributeSet) {
        return new C0189a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0175b(layoutParams);
    }

    public C0182c getConstraintSet() {
        if (this.f1091p == null) {
            this.f1091p = new C0182c();
        }
        this.f1091p.m29853h(this);
        return this.f1091p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
