package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.C0182c;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.daaw.a21;
import com.daaw.m11;
import com.daaw.xs1;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
/* loaded from: classes2.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: M */
    public final Chip f37859M;

    /* renamed from: N */
    public final Chip f37860N;

    /* renamed from: O */
    public final ClockHandView f37861O;

    /* renamed from: P */
    public final ClockFaceView f37862P;

    /* renamed from: Q */
    public final MaterialButtonToggleGroup f37863Q;

    /* renamed from: R */
    public final View.OnClickListener f37864R;

    /* renamed from: S */
    public InterfaceC4169f f37865S;

    /* renamed from: T */
    public InterfaceC4170g f37866T;

    /* renamed from: U */
    public InterfaceC4168e f37867U;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$a */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC4164a implements View.OnClickListener {
        public View$OnClickListenerC4164a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.f37866T != null) {
                TimePickerView.this.f37866T.m131a(((Integer) view.getTag(m11.selection_type)).intValue());
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$b */
    /* loaded from: classes2.dex */
    public class C4165b implements MaterialButtonToggleGroup.InterfaceC4042e {
        public C4165b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.InterfaceC4042e
        /* renamed from: a */
        public void mo134a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
            int i2 = i == m11.material_clock_period_pm_button ? 1 : 0;
            if (TimePickerView.this.f37865S == null || !z) {
                return;
            }
            TimePickerView.this.f37865S.m132a(i2);
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$c */
    /* loaded from: classes2.dex */
    public class C4166c extends GestureDetector.SimpleOnGestureListener {
        public C4166c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            if (TimePickerView.this.f37867U != null) {
                TimePickerView.this.f37867U.m133a();
            }
            return onDoubleTap;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$d */
    /* loaded from: classes2.dex */
    public class View$OnTouchListenerC4167d implements View.OnTouchListener {

        /* renamed from: p */
        public final /* synthetic */ GestureDetector f37871p;

        public View$OnTouchListenerC4167d(GestureDetector gestureDetector) {
            this.f37871p = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f37871p.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC4168e {
        /* renamed from: a */
        void m133a();
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC4169f {
        /* renamed from: a */
        void m132a(int i);
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$g */
    /* loaded from: classes2.dex */
    public interface InterfaceC4170g {
        /* renamed from: a */
        void m131a(int i);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37864R = new View$OnClickListenerC4164a();
        LayoutInflater.from(context).inflate(a21.material_timepicker, this);
        this.f37862P = (ClockFaceView) findViewById(m11.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(m11.material_clock_period_toggle);
        this.f37863Q = materialButtonToggleGroup;
        materialButtonToggleGroup.m838g(new C4165b());
        this.f37859M = (Chip) findViewById(m11.material_minute_tv);
        this.f37860N = (Chip) findViewById(m11.material_hour_tv);
        this.f37861O = (ClockHandView) findViewById(m11.material_clock_hand);
        m136x();
        m137w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m135y();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            m135y();
        }
    }

    /* renamed from: w */
    public final void m137w() {
        Chip chip = this.f37859M;
        int i = m11.selection_type;
        chip.setTag(i, 12);
        this.f37860N.setTag(i, 10);
        this.f37859M.setOnClickListener(this.f37864R);
        this.f37860N.setOnClickListener(this.f37864R);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: x */
    public final void m136x() {
        View$OnTouchListenerC4167d view$OnTouchListenerC4167d = new View$OnTouchListenerC4167d(new GestureDetector(getContext(), new C4166c()));
        this.f37859M.setOnTouchListener(view$OnTouchListenerC4167d);
        this.f37860N.setOnTouchListener(view$OnTouchListenerC4167d);
    }

    /* renamed from: y */
    public final void m135y() {
        if (this.f37863Q.getVisibility() == 0) {
            C0182c c0182c = new C0182c();
            c0182c.m29854g(this);
            c0182c.m29856e(m11.material_clock_display, xs1.m4768E(this) == 0 ? 2 : 1);
            c0182c.m29858c(this);
        }
    }
}
