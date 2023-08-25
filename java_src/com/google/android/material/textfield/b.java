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
import com.daaw.ex;
import com.daaw.f11;
import com.daaw.f3;
import com.daaw.gc1;
import com.daaw.h21;
import com.daaw.j11;
import com.daaw.jn0;
import com.daaw.nn0;
import com.daaw.r4;
import com.daaw.uk1;
import com.daaw.w01;
import com.daaw.xs1;
import com.daaw.y;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes2.dex */
public class b extends ex {
    public static final boolean q;
    public final TextWatcher d;
    public final View.OnFocusChangeListener e;
    public final TextInputLayout.e f;
    public final TextInputLayout.f g;
    @SuppressLint({"ClickableViewAccessibility"})
    public final TextInputLayout.g h;
    public boolean i;
    public boolean j;
    public long k;
    public StateListDrawable l;
    public nn0 m;
    public AccessibilityManager n;
    public ValueAnimator o;
    public ValueAnimator p;

    /* loaded from: classes2.dex */
    public class a extends uk1 {

        /* renamed from: com.google.android.material.textfield.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0104a implements Runnable {
            public final /* synthetic */ AutoCompleteTextView p;

            public RunnableC0104a(AutoCompleteTextView autoCompleteTextView) {
                this.p = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.p.isPopupShowing();
                b.this.E(isPopupShowing);
                b.this.i = isPopupShowing;
            }
        }

        public a() {
        }

        @Override // com.daaw.uk1, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView y = b.y(b.this.a.getEditText());
            if (b.this.n.isTouchExplorationEnabled() && b.D(y) && !b.this.c.hasFocus()) {
                y.dismissDropDown();
            }
            y.post(new RunnableC0104a(y));
        }
    }

    /* renamed from: com.google.android.material.textfield.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0105b implements ValueAnimator.AnimatorUpdateListener {
        public C0105b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes2.dex */
    public class c implements View.OnFocusChangeListener {
        public c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            b.this.a.setEndIconActivated(z);
            if (z) {
                return;
            }
            b.this.E(false);
            b.this.i = false;
        }
    }

    /* loaded from: classes2.dex */
    public class d extends TextInputLayout.e {
        public d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, com.daaw.w
        public void g(View view, y yVar) {
            super.g(view, yVar);
            if (!b.D(b.this.a.getEditText())) {
                yVar.b0(Spinner.class.getName());
            }
            if (yVar.M()) {
                yVar.l0(null);
            }
        }

        @Override // com.daaw.w
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            AutoCompleteTextView y = b.y(b.this.a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && b.this.n.isTouchExplorationEnabled() && !b.D(b.this.a.getEditText())) {
                b.this.H(y);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e implements TextInputLayout.f {
        public e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView y = b.y(textInputLayout.getEditText());
            b.this.F(y);
            b.this.v(y);
            b.this.G(y);
            y.setThreshold(0);
            y.removeTextChangedListener(b.this.d);
            y.addTextChangedListener(b.this.d);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!b.D(y)) {
                xs1.B0(b.this.c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(b.this.f);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* loaded from: classes2.dex */
    public class f implements TextInputLayout.g {

        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public final /* synthetic */ AutoCompleteTextView p;

            public a(AutoCompleteTextView autoCompleteTextView) {
                this.p = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.p.removeTextChangedListener(b.this.d);
            }
        }

        public f() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || i != 3) {
                return;
            }
            autoCompleteTextView.post(new a(autoCompleteTextView));
            if (autoCompleteTextView.getOnFocusChangeListener() == b.this.e) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            if (b.q) {
                autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.H((AutoCompleteTextView) b.this.a.getEditText());
        }
    }

    /* loaded from: classes2.dex */
    public class h implements View.OnTouchListener {
        public final /* synthetic */ AutoCompleteTextView p;

        public h(AutoCompleteTextView autoCompleteTextView) {
            this.p = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (b.this.C()) {
                    b.this.i = false;
                }
                b.this.H(this.p);
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public class i implements AutoCompleteTextView.OnDismissListener {
        public i() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            b.this.i = true;
            b.this.k = System.currentTimeMillis();
            b.this.E(false);
        }
    }

    /* loaded from: classes2.dex */
    public class j extends AnimatorListenerAdapter {
        public j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b bVar = b.this;
            bVar.c.setChecked(bVar.j);
            b.this.p.start();
        }
    }

    static {
        q = Build.VERSION.SDK_INT >= 21;
    }

    public b(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = new a();
        this.e = new c();
        this.f = new d(this.a);
        this.g = new e();
        this.h = new f();
        this.i = false;
        this.j = false;
        this.k = Long.MAX_VALUE;
    }

    public static boolean D(EditText editText) {
        return editText.getKeyListener() != null;
    }

    public static AutoCompleteTextView y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public final nn0 A(float f2, float f3, float f4, int i2) {
        gc1 m = gc1.a().A(f2).E(f2).s(f3).w(f3).m();
        nn0 m2 = nn0.m(this.b, f4);
        m2.setShapeAppearanceModel(m);
        m2.Y(0, i2, 0, i2);
        return m2;
    }

    public final void B() {
        this.p = z(67, 0.0f, 1.0f);
        ValueAnimator z = z(50, 1.0f, 0.0f);
        this.o = z;
        z.addListener(new j());
    }

    public final boolean C() {
        long currentTimeMillis = System.currentTimeMillis() - this.k;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    public final void E(boolean z) {
        if (this.j != z) {
            this.j = z;
            this.p.cancel();
            this.o.start();
        }
    }

    public final void F(AutoCompleteTextView autoCompleteTextView) {
        Drawable drawable;
        if (q) {
            int boxBackgroundMode = this.a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                drawable = this.m;
            } else if (boxBackgroundMode != 1) {
                return;
            } else {
                drawable = this.l;
            }
            autoCompleteTextView.setDropDownBackgroundDrawable(drawable);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void G(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.e);
        if (q) {
            autoCompleteTextView.setOnDismissListener(new i());
        }
    }

    public final void H(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (C()) {
            this.i = false;
        }
        if (this.i) {
            this.i = false;
            return;
        }
        if (q) {
            E(!this.j);
        } else {
            this.j = !this.j;
            this.c.toggle();
        }
        if (!this.j) {
            autoCompleteTextView.dismissDropDown();
            return;
        }
        autoCompleteTextView.requestFocus();
        autoCompleteTextView.showDropDown();
    }

    @Override // com.daaw.ex
    public void a() {
        float dimensionPixelOffset = this.b.getResources().getDimensionPixelOffset(f11.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.b.getResources().getDimensionPixelOffset(f11.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.b.getResources().getDimensionPixelOffset(f11.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        nn0 A = A(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        nn0 A2 = A(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.m = A;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.l = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, A);
        this.l.addState(new int[0], A2);
        this.a.setEndIconDrawable(r4.b(this.b, q ? j11.mtrl_dropdown_arrow : j11.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(h21.exposed_dropdown_menu_content_description));
        this.a.setEndIconOnClickListener(new g());
        this.a.e(this.g);
        this.a.f(this.h);
        B();
        this.n = (AccessibilityManager) this.b.getSystemService("accessibility");
    }

    @Override // com.daaw.ex
    public boolean b(int i2) {
        return i2 != 0;
    }

    @Override // com.daaw.ex
    public boolean d() {
        return true;
    }

    public final void v(AutoCompleteTextView autoCompleteTextView) {
        if (D(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.a.getBoxBackgroundMode();
        nn0 boxBackground = this.a.getBoxBackground();
        int c2 = jn0.c(autoCompleteTextView, w01.g);
        int[][] iArr = {new int[]{16842919}, new int[0]};
        if (boxBackgroundMode == 2) {
            x(autoCompleteTextView, c2, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            w(autoCompleteTextView, c2, iArr, boxBackground);
        }
    }

    public final void w(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, nn0 nn0Var) {
        int boxBackgroundColor = this.a.getBoxBackgroundColor();
        int[] iArr2 = {jn0.f(i2, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (q) {
            xs1.v0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), nn0Var, nn0Var));
            return;
        }
        nn0 nn0Var2 = new nn0(nn0Var.C());
        nn0Var2.W(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{nn0Var, nn0Var2});
        int J = xs1.J(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int I = xs1.I(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        xs1.v0(autoCompleteTextView, layerDrawable);
        xs1.E0(autoCompleteTextView, J, paddingTop, I, paddingBottom);
    }

    public final void x(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, nn0 nn0Var) {
        LayerDrawable layerDrawable;
        int c2 = jn0.c(autoCompleteTextView, w01.colorSurface);
        nn0 nn0Var2 = new nn0(nn0Var.C());
        int f2 = jn0.f(i2, c2, 0.1f);
        nn0Var2.W(new ColorStateList(iArr, new int[]{f2, 0}));
        if (q) {
            nn0Var2.setTint(c2);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{f2, c2});
            nn0 nn0Var3 = new nn0(nn0Var.C());
            nn0Var3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, nn0Var2, nn0Var3), nn0Var});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{nn0Var2, nn0Var});
        }
        xs1.v0(autoCompleteTextView, layerDrawable);
    }

    public final ValueAnimator z(int i2, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(f3.a);
        ofFloat.setDuration(i2);
        ofFloat.addUpdateListener(new C0105b());
        return ofFloat;
    }
}
