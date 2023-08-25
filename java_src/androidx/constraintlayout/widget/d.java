package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.daaw.p21;
/* loaded from: classes.dex */
public class d extends ViewGroup {
    public c p;

    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.b {
        public float A0;
        public float B0;
        public float p0;
        public boolean q0;
        public float r0;
        public float s0;
        public float t0;
        public float u0;
        public float v0;
        public float w0;
        public float x0;
        public float y0;
        public float z0;

        public a(int i, int i2) {
            super(i, i2);
            this.p0 = 1.0f;
            this.q0 = false;
            this.r0 = 0.0f;
            this.s0 = 0.0f;
            this.t0 = 0.0f;
            this.u0 = 0.0f;
            this.v0 = 1.0f;
            this.w0 = 1.0f;
            this.x0 = 0.0f;
            this.y0 = 0.0f;
            this.z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.p0 = 1.0f;
            this.q0 = false;
            this.r0 = 0.0f;
            this.s0 = 0.0f;
            this.t0 = 0.0f;
            this.u0 = 0.0f;
            this.v0 = 1.0f;
            this.w0 = 1.0f;
            this.x0 = 0.0f;
            this.y0 = 0.0f;
            this.z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p21.o2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == p21.p2) {
                    this.p0 = obtainStyledAttributes.getFloat(index, this.p0);
                } else if (index == p21.A2) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.r0 = obtainStyledAttributes.getFloat(index, this.r0);
                        this.q0 = true;
                    }
                } else if (index == p21.x2) {
                    this.t0 = obtainStyledAttributes.getFloat(index, this.t0);
                } else if (index == p21.y2) {
                    this.u0 = obtainStyledAttributes.getFloat(index, this.u0);
                } else if (index == p21.w2) {
                    this.s0 = obtainStyledAttributes.getFloat(index, this.s0);
                } else if (index == p21.u2) {
                    this.v0 = obtainStyledAttributes.getFloat(index, this.v0);
                } else if (index == p21.v2) {
                    this.w0 = obtainStyledAttributes.getFloat(index, this.w0);
                } else if (index == p21.q2) {
                    this.x0 = obtainStyledAttributes.getFloat(index, this.x0);
                } else if (index == p21.r2) {
                    this.y0 = obtainStyledAttributes.getFloat(index, this.y0);
                } else if (index == p21.s2) {
                    this.z0 = obtainStyledAttributes.getFloat(index, this.z0);
                } else if (index == p21.t2) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == p21.z2 && Build.VERSION.SDK_INT >= 21) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: a */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    public c getConstraintSet() {
        if (this.p == null) {
            this.p = new c();
        }
        this.p.h(this);
        return this.p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
