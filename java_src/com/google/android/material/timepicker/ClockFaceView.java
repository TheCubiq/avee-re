package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.daaw.a11;
import com.daaw.a21;
import com.daaw.f11;
import com.daaw.k21;
import com.daaw.m11;
import com.daaw.m21;
import com.daaw.mn0;
import com.daaw.r4;
import com.daaw.w;
import com.daaw.w01;
import com.daaw.xs1;
import com.daaw.y;
import com.daaw.y21;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
/* loaded from: classes2.dex */
class ClockFaceView extends y21 implements ClockHandView.d {
    public final ClockHandView P;
    public final Rect Q;
    public final RectF R;
    public final SparseArray<TextView> S;
    public final w T;
    public final int[] U;
    public final float[] V;
    public final int W;
    public String[] a0;
    public float b0;
    public final ColorStateList c0;

    /* loaded from: classes2.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (ClockFaceView.this.isShown()) {
                ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                ClockFaceView.this.v(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.P.g()) - ClockFaceView.this.W);
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class b extends w {
        public b() {
        }

        @Override // com.daaw.w
        public void g(View view, y yVar) {
            super.g(view, yVar);
            int intValue = ((Integer) view.getTag(m11.material_value_index)).intValue();
            if (intValue > 0) {
                yVar.A0((View) ClockFaceView.this.S.get(intValue - 1));
            }
            yVar.e0(y.c.a(0, 1, intValue, 1, false, view.isSelected()));
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w01.materialClockStyle);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Q = new Rect();
        this.R = new RectF();
        this.S = new SparseArray<>();
        this.V = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m21.M0, i, k21.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList a2 = mn0.a(context, obtainStyledAttributes, m21.O0);
        this.c0 = a2;
        LayoutInflater.from(context).inflate(a21.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(m11.material_clock_hand);
        this.P = clockHandView;
        this.W = resources.getDimensionPixelSize(f11.material_clock_hand_padding);
        int colorForState = a2.getColorForState(new int[]{16842913}, a2.getDefaultColor());
        this.U = new int[]{colorForState, colorForState, a2.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = r4.a(context, a11.material_timepicker_clockface).getDefaultColor();
        ColorStateList a3 = mn0.a(context, obtainStyledAttributes, m21.N0);
        setBackgroundColor(a3 != null ? a3.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.T = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        E(strArr, 0);
    }

    public final void C() {
        RectF d = this.P.d();
        for (int i = 0; i < this.S.size(); i++) {
            TextView textView = this.S.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.Q);
                this.Q.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.Q);
                this.R.set(this.Q);
                textView.getPaint().setShader(D(d, this.R));
                textView.invalidate();
            }
        }
    }

    public final RadialGradient D(RectF rectF, RectF rectF2) {
        if (RectF.intersects(rectF, rectF2)) {
            return new RadialGradient(rectF.centerX() - this.R.left, rectF.centerY() - this.R.top, rectF.width() * 0.5f, this.U, this.V, Shader.TileMode.CLAMP);
        }
        return null;
    }

    public void E(String[] strArr, int i) {
        this.a0 = strArr;
        F(i);
    }

    public final void F(int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.S.size();
        for (int i2 = 0; i2 < Math.max(this.a0.length, size); i2++) {
            TextView textView = this.S.get(i2);
            if (i2 >= this.a0.length) {
                removeView(textView);
                this.S.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(a21.material_clockface_textview, (ViewGroup) this, false);
                    this.S.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.a0[i2]);
                textView.setTag(m11.material_value_index, Integer.valueOf(i2));
                xs1.r0(textView, this.T);
                textView.setTextColor(this.c0);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.a0[i2]));
                }
            }
        }
    }

    @Override // com.google.android.material.timepicker.ClockHandView.d
    public void a(float f, boolean z) {
        if (Math.abs(this.b0 - f) > 0.001f) {
            this.b0 = f;
            C();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        y.D0(accessibilityNodeInfo).d0(y.b.b(1, this.a0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C();
    }

    @Override // com.daaw.y21
    public void v(int i) {
        if (i != u()) {
            super.v(i);
            this.P.j(u());
        }
    }
}
