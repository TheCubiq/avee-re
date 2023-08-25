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
import com.daaw.C2818r4;
import com.daaw.C3388w;
import com.daaw.C3654y;
import com.daaw.a11;
import com.daaw.a21;
import com.daaw.f11;
import com.daaw.k21;
import com.daaw.m11;
import com.daaw.m21;
import com.daaw.mn0;
import com.daaw.w01;
import com.daaw.xs1;
import com.daaw.y21;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
/* loaded from: classes2.dex */
class ClockFaceView extends y21 implements ClockHandView.InterfaceC4162d {

    /* renamed from: P */
    public final ClockHandView f37820P;

    /* renamed from: Q */
    public final Rect f37821Q;

    /* renamed from: R */
    public final RectF f37822R;

    /* renamed from: S */
    public final SparseArray<TextView> f37823S;

    /* renamed from: T */
    public final C3388w f37824T;

    /* renamed from: U */
    public final int[] f37825U;

    /* renamed from: V */
    public final float[] f37826V;

    /* renamed from: W */
    public final int f37827W;

    /* renamed from: a0 */
    public String[] f37828a0;

    /* renamed from: b0 */
    public float f37829b0;

    /* renamed from: c0 */
    public final ColorStateList f37830c0;

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$a */
    /* loaded from: classes2.dex */
    public class ViewTreeObserver$OnPreDrawListenerC4157a implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserver$OnPreDrawListenerC4157a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (ClockFaceView.this.isShown()) {
                ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                ClockFaceView.this.mo163v(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f37820P.m154g()) - ClockFaceView.this.f37827W);
                return true;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$b */
    /* loaded from: classes2.dex */
    public class C4158b extends C3388w {
        public C4158b() {
        }

        @Override // com.daaw.C3388w
        /* renamed from: g */
        public void mo161g(View view, C3654y c3654y) {
            super.mo161g(view, c3654y);
            int intValue = ((Integer) view.getTag(m11.material_value_index)).intValue();
            if (intValue > 0) {
                c3654y.m4367A0((View) ClockFaceView.this.f37823S.get(intValue - 1));
            }
            c3654y.m4329e0(C3654y.C3657c.m4280a(0, 1, intValue, 1, false, view.isSelected()));
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w01.materialClockStyle);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37821Q = new Rect();
        this.f37822R = new RectF();
        this.f37823S = new SparseArray<>();
        this.f37826V = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m21.f18092M0, i, k21.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList m15930a = mn0.m15930a(context, obtainStyledAttributes, m21.f18106O0);
        this.f37830c0 = m15930a;
        LayoutInflater.from(context).inflate(a21.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(m11.material_clock_hand);
        this.f37820P = clockHandView;
        this.f37827W = resources.getDimensionPixelSize(f11.material_clock_hand_padding);
        int colorForState = m15930a.getColorForState(new int[]{16842913}, m15930a.getDefaultColor());
        this.f37825U = new int[]{colorForState, colorForState, m15930a.getDefaultColor()};
        clockHandView.m159b(this);
        int defaultColor = C2818r4.m11784a(context, a11.material_timepicker_clockface).getDefaultColor();
        ColorStateList m15930a2 = mn0.m15930a(context, obtainStyledAttributes, m21.f18099N0);
        setBackgroundColor(m15930a2 != null ? m15930a2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC4157a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f37824T = new C4158b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        m165E(strArr, 0);
    }

    /* renamed from: C */
    public final void m167C() {
        RectF m157d = this.f37820P.m157d();
        for (int i = 0; i < this.f37823S.size(); i++) {
            TextView textView = this.f37823S.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.f37821Q);
                this.f37821Q.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.f37821Q);
                this.f37822R.set(this.f37821Q);
                textView.getPaint().setShader(m166D(m157d, this.f37822R));
                textView.invalidate();
            }
        }
    }

    /* renamed from: D */
    public final RadialGradient m166D(RectF rectF, RectF rectF2) {
        if (RectF.intersects(rectF, rectF2)) {
            return new RadialGradient(rectF.centerX() - this.f37822R.left, rectF.centerY() - this.f37822R.top, rectF.width() * 0.5f, this.f37825U, this.f37826V, Shader.TileMode.CLAMP);
        }
        return null;
    }

    /* renamed from: E */
    public void m165E(String[] strArr, int i) {
        this.f37828a0 = strArr;
        m164F(i);
    }

    /* renamed from: F */
    public final void m164F(int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f37823S.size();
        for (int i2 = 0; i2 < Math.max(this.f37828a0.length, size); i2++) {
            TextView textView = this.f37823S.get(i2);
            if (i2 >= this.f37828a0.length) {
                removeView(textView);
                this.f37823S.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(a21.material_clockface_textview, (ViewGroup) this, false);
                    this.f37823S.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f37828a0[i2]);
                textView.setTag(m11.material_value_index, Integer.valueOf(i2));
                xs1.m4702r0(textView, this.f37824T);
                textView.setTextColor(this.f37830c0);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.f37828a0[i2]));
                }
            }
        }
    }

    @Override // com.google.android.material.timepicker.ClockHandView.InterfaceC4162d
    /* renamed from: a */
    public void mo146a(float f, boolean z) {
        if (Math.abs(this.f37829b0 - f) > 0.001f) {
            this.f37829b0 = f;
            m167C();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C3654y.m4361D0(accessibilityNodeInfo).m4331d0(C3654y.C3656b.m4281b(1, this.f37828a0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m167C();
    }

    @Override // com.daaw.y21
    /* renamed from: v */
    public void mo163v(int i) {
        if (i != m4252u()) {
            super.mo163v(i);
            this.f37820P.m151j(m4252u());
        }
    }
}
