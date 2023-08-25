package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.daaw.a21;
import com.daaw.m11;
import com.daaw.xs1;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
/* loaded from: classes2.dex */
class TimePickerView extends ConstraintLayout {
    public final Chip M;
    public final Chip N;
    public final ClockHandView O;
    public final ClockFaceView P;
    public final MaterialButtonToggleGroup Q;
    public final View.OnClickListener R;
    public f S;
    public g T;
    public e U;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.T != null) {
                TimePickerView.this.T.a(((Integer) view.getTag(m11.selection_type)).intValue());
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements MaterialButtonToggleGroup.e {
        public b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.e
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
            int i2 = i == m11.material_clock_period_pm_button ? 1 : 0;
            if (TimePickerView.this.S == null || !z) {
                return;
            }
            TimePickerView.this.S.a(i2);
        }
    }

    /* loaded from: classes2.dex */
    public class c extends GestureDetector.SimpleOnGestureListener {
        public c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            if (TimePickerView.this.U != null) {
                TimePickerView.this.U.a();
            }
            return onDoubleTap;
        }
    }

    /* loaded from: classes2.dex */
    public class d implements View.OnTouchListener {
        public final /* synthetic */ GestureDetector p;

        public d(GestureDetector gestureDetector) {
            this.p = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.p.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public interface e {
        void a();
    }

    /* loaded from: classes2.dex */
    public interface f {
        void a(int i);
    }

    /* loaded from: classes2.dex */
    public interface g {
        void a(int i);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.R = new a();
        LayoutInflater.from(context).inflate(a21.material_timepicker, this);
        this.P = (ClockFaceView) findViewById(m11.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(m11.material_clock_period_toggle);
        this.Q = materialButtonToggleGroup;
        materialButtonToggleGroup.g(new b());
        this.M = (Chip) findViewById(m11.material_minute_tv);
        this.N = (Chip) findViewById(m11.material_hour_tv);
        this.O = (ClockHandView) findViewById(m11.material_clock_hand);
        x();
        w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        y();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            y();
        }
    }

    public final void w() {
        Chip chip = this.M;
        int i = m11.selection_type;
        chip.setTag(i, 12);
        this.N.setTag(i, 10);
        this.M.setOnClickListener(this.R);
        this.N.setOnClickListener(this.R);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void x() {
        d dVar = new d(new GestureDetector(getContext(), new c()));
        this.M.setOnTouchListener(dVar);
        this.N.setOnTouchListener(dVar);
    }

    public final void y() {
        if (this.Q.getVisibility() == 0) {
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            cVar.g(this);
            cVar.e(m11.material_clock_display, xs1.E(this) == 0 ? 2 : 1);
            cVar.c(this);
        }
    }
}
