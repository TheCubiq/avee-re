package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.daaw.AbstractC1229ex;
import com.daaw.C1247f3;
import com.daaw.C2818r4;
import com.daaw.C3654y;
import com.daaw.f11;
import com.daaw.gc1;
import com.daaw.h21;
import com.daaw.j11;
import com.daaw.jn0;
import com.daaw.nn0;
import com.daaw.uk1;
import com.daaw.w01;
import com.daaw.xs1;
import com.google.android.material.textfield.TextInputLayout;
/* renamed from: com.google.android.material.textfield.b */
/* loaded from: classes2.dex */
public class C4136b extends AbstractC1229ex {

    /* renamed from: q */
    public static final boolean f37776q;

    /* renamed from: d */
    public final TextWatcher f37777d;

    /* renamed from: e */
    public final View.OnFocusChangeListener f37778e;

    /* renamed from: f */
    public final TextInputLayout.C4122e f37779f;

    /* renamed from: g */
    public final TextInputLayout.InterfaceC4123f f37780g;
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: h */
    public final TextInputLayout.InterfaceC4124g f37781h;

    /* renamed from: i */
    public boolean f37782i;

    /* renamed from: j */
    public boolean f37783j;

    /* renamed from: k */
    public long f37784k;

    /* renamed from: l */
    public StateListDrawable f37785l;

    /* renamed from: m */
    public nn0 f37786m;

    /* renamed from: n */
    public AccessibilityManager f37787n;

    /* renamed from: o */
    public ValueAnimator f37788o;

    /* renamed from: p */
    public ValueAnimator f37789p;

    /* renamed from: com.google.android.material.textfield.b$a */
    /* loaded from: classes2.dex */
    public class C4137a extends uk1 {

        /* renamed from: com.google.android.material.textfield.b$a$a */
        /* loaded from: classes2.dex */
        public class RunnableC4138a implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ AutoCompleteTextView f37791p;

            public RunnableC4138a(AutoCompleteTextView autoCompleteTextView) {
                this.f37791p = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f37791p.isPopupShowing();
                C4136b.this.m219E(isPopupShowing);
                C4136b.this.f37782i = isPopupShowing;
            }
        }

        public C4137a() {
        }

        @Override // com.daaw.uk1, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView m193y = C4136b.m193y(C4136b.this.f8888a.getEditText());
            if (C4136b.this.f37787n.isTouchExplorationEnabled() && C4136b.m220D(m193y) && !C4136b.this.f8890c.hasFocus()) {
                m193y.dismissDropDown();
            }
            m193y.post(new RunnableC4138a(m193y));
        }
    }

    /* renamed from: com.google.android.material.textfield.b$b */
    /* loaded from: classes2.dex */
    public class C4139b implements ValueAnimator.AnimatorUpdateListener {
        public C4139b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C4136b.this.f8890c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.b$c */
    /* loaded from: classes2.dex */
    public class View$OnFocusChangeListenerC4140c implements View.OnFocusChangeListener {
        public View$OnFocusChangeListenerC4140c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            C4136b.this.f8888a.setEndIconActivated(z);
            if (z) {
                return;
            }
            C4136b.this.m219E(false);
            C4136b.this.f37782i = false;
        }
    }

    /* renamed from: com.google.android.material.textfield.b$d */
    /* loaded from: classes2.dex */
    public class C4141d extends TextInputLayout.C4122e {
        public C4141d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.C4122e, com.daaw.C3388w
        /* renamed from: g */
        public void mo161g(View view, C3654y c3654y) {
            super.mo161g(view, c3654y);
            if (!C4136b.m220D(C4136b.this.f8888a.getEditText())) {
                c3654y.m4335b0(Spinner.class.getName());
            }
            if (c3654y.m4352M()) {
                c3654y.m4315l0(null);
            }
        }

        @Override // com.daaw.C3388w
        /* renamed from: h */
        public void mo191h(View view, AccessibilityEvent accessibilityEvent) {
            super.mo191h(view, accessibilityEvent);
            AutoCompleteTextView m193y = C4136b.m193y(C4136b.this.f8888a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C4136b.this.f37787n.isTouchExplorationEnabled() && !C4136b.m220D(C4136b.this.f8888a.getEditText())) {
                C4136b.this.m216H(m193y);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.b$e */
    /* loaded from: classes2.dex */
    public class C4142e implements TextInputLayout.InterfaceC4123f {
        public C4142e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4123f
        /* renamed from: a */
        public void mo185a(TextInputLayout textInputLayout) {
            AutoCompleteTextView m193y = C4136b.m193y(textInputLayout.getEditText());
            C4136b.this.m218F(m193y);
            C4136b.this.m196v(m193y);
            C4136b.this.m217G(m193y);
            m193y.setThreshold(0);
            m193y.removeTextChangedListener(C4136b.this.f37777d);
            m193y.addTextChangedListener(C4136b.this.f37777d);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!C4136b.m220D(m193y)) {
                xs1.m4773B0(C4136b.this.f8890c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(C4136b.this.f37779f);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.b$f */
    /* loaded from: classes2.dex */
    public class C4143f implements TextInputLayout.InterfaceC4124g {

        /* renamed from: com.google.android.material.textfield.b$f$a */
        /* loaded from: classes2.dex */
        public class RunnableC4144a implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ AutoCompleteTextView f37798p;

            public RunnableC4144a(AutoCompleteTextView autoCompleteTextView) {
                this.f37798p = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f37798p.removeTextChangedListener(C4136b.this.f37777d);
            }
        }

        public C4143f() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4124g
        /* renamed from: a */
        public void mo184a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || i != 3) {
                return;
            }
            autoCompleteTextView.post(new RunnableC4144a(autoCompleteTextView));
            if (autoCompleteTextView.getOnFocusChangeListener() == C4136b.this.f37778e) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            if (C4136b.f37776q) {
                autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.b$g */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC4145g implements View.OnClickListener {
        public View$OnClickListenerC4145g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4136b.this.m216H((AutoCompleteTextView) C4136b.this.f8888a.getEditText());
        }
    }

    /* renamed from: com.google.android.material.textfield.b$h */
    /* loaded from: classes2.dex */
    public class View$OnTouchListenerC4146h implements View.OnTouchListener {

        /* renamed from: p */
        public final /* synthetic */ AutoCompleteTextView f37801p;

        public View$OnTouchListenerC4146h(AutoCompleteTextView autoCompleteTextView) {
            this.f37801p = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (C4136b.this.m221C()) {
                    C4136b.this.f37782i = false;
                }
                C4136b.this.m216H(this.f37801p);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.textfield.b$i */
    /* loaded from: classes2.dex */
    public class C4147i implements AutoCompleteTextView.OnDismissListener {
        public C4147i() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            C4136b.this.f37782i = true;
            C4136b.this.f37784k = System.currentTimeMillis();
            C4136b.this.m219E(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.b$j */
    /* loaded from: classes2.dex */
    public class C4148j extends AnimatorListenerAdapter {
        public C4148j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4136b c4136b = C4136b.this;
            c4136b.f8890c.setChecked(c4136b.f37783j);
            C4136b.this.f37789p.start();
        }
    }

    static {
        f37776q = Build.VERSION.SDK_INT >= 21;
    }

    public C4136b(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f37777d = new C4137a();
        this.f37778e = new View$OnFocusChangeListenerC4140c();
        this.f37779f = new C4141d(this.f8888a);
        this.f37780g = new C4142e();
        this.f37781h = new C4143f();
        this.f37782i = false;
        this.f37783j = false;
        this.f37784k = Long.MAX_VALUE;
    }

    /* renamed from: D */
    public static boolean m220D(EditText editText) {
        return editText.getKeyListener() != null;
    }

    /* renamed from: y */
    public static AutoCompleteTextView m193y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: A */
    public final nn0 m223A(float f, float f2, float f3, int i) {
        gc1 m21769m = gc1.m21812a().m21787A(f).m21783E(f).m21763s(f2).m21759w(f2).m21769m();
        nn0 m14974m = nn0.m14974m(this.f8889b, f3);
        m14974m.setShapeAppearanceModel(m21769m);
        m14974m.m14995Y(0, i, 0, i);
        return m14974m;
    }

    /* renamed from: B */
    public final void m222B() {
        this.f37789p = m192z(67, 0.0f, 1.0f);
        ValueAnimator m192z = m192z(50, 1.0f, 0.0f);
        this.f37788o = m192z;
        m192z.addListener(new C4148j());
    }

    /* renamed from: C */
    public final boolean m221C() {
        long currentTimeMillis = System.currentTimeMillis() - this.f37784k;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* renamed from: E */
    public final void m219E(boolean z) {
        if (this.f37783j != z) {
            this.f37783j = z;
            this.f37789p.cancel();
            this.f37788o.start();
        }
    }

    /* renamed from: F */
    public final void m218F(AutoCompleteTextView autoCompleteTextView) {
        Drawable drawable;
        if (f37776q) {
            int boxBackgroundMode = this.f8888a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                drawable = this.f37786m;
            } else if (boxBackgroundMode != 1) {
                return;
            } else {
                drawable = this.f37785l;
            }
            autoCompleteTextView.setDropDownBackgroundDrawable(drawable);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: G */
    public final void m217G(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new View$OnTouchListenerC4146h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f37778e);
        if (f37776q) {
            autoCompleteTextView.setOnDismissListener(new C4147i());
        }
    }

    /* renamed from: H */
    public final void m216H(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (m221C()) {
            this.f37782i = false;
        }
        if (this.f37782i) {
            this.f37782i = false;
            return;
        }
        if (f37776q) {
            m219E(!this.f37783j);
        } else {
            this.f37783j = !this.f37783j;
            this.f8890c.toggle();
        }
        if (!this.f37783j) {
            autoCompleteTextView.dismissDropDown();
            return;
        }
        autoCompleteTextView.requestFocus();
        autoCompleteTextView.showDropDown();
    }

    @Override // com.daaw.AbstractC1229ex
    /* renamed from: a */
    public void mo190a() {
        float dimensionPixelOffset = this.f8889b.getResources().getDimensionPixelOffset(f11.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.f8889b.getResources().getDimensionPixelOffset(f11.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f8889b.getResources().getDimensionPixelOffset(f11.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        nn0 m223A = m223A(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        nn0 m223A2 = m223A(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f37786m = m223A;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f37785l = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, m223A);
        this.f37785l.addState(new int[0], m223A2);
        this.f8888a.setEndIconDrawable(C2818r4.m11783b(this.f8889b, f37776q ? j11.mtrl_dropdown_arrow : j11.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.f8888a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(h21.exposed_dropdown_menu_content_description));
        this.f8888a.setEndIconOnClickListener(new View$OnClickListenerC4145g());
        this.f8888a.m280e(this.f37780g);
        this.f8888a.m278f(this.f37781h);
        m222B();
        this.f37787n = (AccessibilityManager) this.f8889b.getSystemService("accessibility");
    }

    @Override // com.daaw.AbstractC1229ex
    /* renamed from: b */
    public boolean mo215b(int i) {
        return i != 0;
    }

    @Override // com.daaw.AbstractC1229ex
    /* renamed from: d */
    public boolean mo214d() {
        return true;
    }

    /* renamed from: v */
    public final void m196v(AutoCompleteTextView autoCompleteTextView) {
        if (m220D(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.f8888a.getBoxBackgroundMode();
        nn0 boxBackground = this.f8888a.getBoxBackground();
        int m18396c = jn0.m18396c(autoCompleteTextView, w01.f30750g);
        int[][] iArr = {new int[]{16842919}, new int[0]};
        if (boxBackgroundMode == 2) {
            m194x(autoCompleteTextView, m18396c, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            m195w(autoCompleteTextView, m18396c, iArr, boxBackground);
        }
    }

    /* renamed from: w */
    public final void m195w(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, nn0 nn0Var) {
        int boxBackgroundColor = this.f8888a.getBoxBackgroundColor();
        int[] iArr2 = {jn0.m18393f(i, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f37776q) {
            xs1.m4694v0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), nn0Var, nn0Var));
            return;
        }
        nn0 nn0Var2 = new nn0(nn0Var.m15017C());
        nn0Var2.m14997W(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{nn0Var, nn0Var2});
        int m4758J = xs1.m4758J(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int m4760I = xs1.m4760I(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        xs1.m4694v0(autoCompleteTextView, layerDrawable);
        xs1.m4767E0(autoCompleteTextView, m4758J, paddingTop, m4760I, paddingBottom);
    }

    /* renamed from: x */
    public final void m194x(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, nn0 nn0Var) {
        LayerDrawable layerDrawable;
        int m18396c = jn0.m18396c(autoCompleteTextView, w01.colorSurface);
        nn0 nn0Var2 = new nn0(nn0Var.m15017C());
        int m18393f = jn0.m18393f(i, m18396c, 0.1f);
        nn0Var2.m14997W(new ColorStateList(iArr, new int[]{m18393f, 0}));
        if (f37776q) {
            nn0Var2.setTint(m18396c);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{m18393f, m18396c});
            nn0 nn0Var3 = new nn0(nn0Var.m15017C());
            nn0Var3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, nn0Var2, nn0Var3), nn0Var});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{nn0Var2, nn0Var});
        }
        xs1.m4694v0(autoCompleteTextView, layerDrawable);
    }

    /* renamed from: z */
    public final ValueAnimator m192z(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C1247f3.f9051a);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new C4139b());
        return ofFloat;
    }
}
