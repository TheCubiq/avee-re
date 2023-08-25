package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.daaw.cn0;
import com.daaw.d4;
import com.daaw.ex;
import com.daaw.f11;
import com.daaw.f3;
import com.daaw.gc1;
import com.daaw.gg;
import com.daaw.h21;
import com.daaw.it;
import com.daaw.jn0;
import com.daaw.k21;
import com.daaw.m11;
import com.daaw.mn0;
import com.daaw.nn0;
import com.daaw.nu;
import com.daaw.pb;
import com.daaw.r4;
import com.daaw.ro;
import com.daaw.sf0;
import com.daaw.sk1;
import com.daaw.vu;
import com.daaw.w;
import com.daaw.w01;
import com.daaw.w4;
import com.daaw.xs1;
import com.daaw.zk;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout {
    public static final int Y0 = k21.Widget_Design_TextInputLayout;
    public int A;
    public int A0;
    public int B;
    public Drawable B0;
    public CharSequence C;
    public View.OnLongClickListener C0;
    public boolean D;
    public View.OnLongClickListener D0;
    public TextView E;
    public final CheckableImageButton E0;
    public ColorStateList F;
    public ColorStateList F0;
    public int G;
    public ColorStateList G0;
    public ColorStateList H;
    public ColorStateList H0;
    public ColorStateList I;
    public int I0;
    public CharSequence J;
    public int J0;
    public final TextView K;
    public int K0;
    public CharSequence L;
    public ColorStateList L0;
    public final TextView M;
    public int M0;
    public boolean N;
    public int N0;
    public CharSequence O;
    public int O0;
    public boolean P;
    public int P0;
    public nn0 Q;
    public int Q0;
    public nn0 R;
    public boolean R0;
    public gc1 S;
    public final gg S0;
    public final int T;
    public boolean T0;
    public int U;
    public boolean U0;
    public int V;
    public ValueAnimator V0;
    public int W;
    public boolean W0;
    public boolean X0;
    public int a0;
    public int b0;
    public int c0;
    public int d0;
    public final Rect e0;
    public final Rect f0;
    public final RectF g0;
    public Typeface h0;
    public final CheckableImageButton i0;
    public ColorStateList j0;
    public boolean k0;
    public PorterDuff.Mode l0;
    public boolean m0;
    public Drawable n0;
    public int o0;
    public final FrameLayout p;
    public View.OnLongClickListener p0;
    public final LinearLayout q;
    public final LinkedHashSet<f> q0;
    public final LinearLayout r;
    public int r0;
    public final FrameLayout s;
    public final SparseArray<ex> s0;
    public EditText t;
    public final CheckableImageButton t0;
    public CharSequence u;
    public final LinkedHashSet<g> u0;
    public final sf0 v;
    public ColorStateList v0;
    public boolean w;
    public boolean w0;
    public int x;
    public PorterDuff.Mode x0;
    public boolean y;
    public boolean y0;
    public TextView z;
    public Drawable z0;

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public CharSequence r;
        public boolean s;
        public CharSequence t;
        public CharSequence u;
        public CharSequence v;

        /* loaded from: classes2.dex */
        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.r = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.s = parcel.readInt() == 1;
            this.t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.u = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.v = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.r) + " hint=" + ((Object) this.t) + " helperText=" + ((Object) this.u) + " placeholderText=" + ((Object) this.v) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.r, parcel, i);
            parcel.writeInt(this.s ? 1 : 0);
            TextUtils.writeToParcel(this.t, parcel, i);
            TextUtils.writeToParcel(this.u, parcel, i);
            TextUtils.writeToParcel(this.v, parcel, i);
        }
    }

    /* loaded from: classes2.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.u0(!textInputLayout.X0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.w) {
                textInputLayout2.n0(editable.length());
            }
            if (TextInputLayout.this.D) {
                TextInputLayout.this.y0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.t0.performClick();
            TextInputLayout.this.t0.jumpDrawablesToCurrentState();
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.t.requestLayout();
        }
    }

    /* loaded from: classes2.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.S0.V(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes2.dex */
    public static class e extends w {
        public final TextInputLayout d;

        public e(TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
            if (r3 != null) goto L43;
         */
        @Override // com.daaw.w
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void g(android.view.View r14, com.daaw.y r15) {
            /*
                r13 = this;
                super.g(r14, r15)
                com.google.android.material.textfield.TextInputLayout r14 = r13.d
                android.widget.EditText r14 = r14.getEditText()
                if (r14 == 0) goto L10
                android.text.Editable r0 = r14.getText()
                goto L11
            L10:
                r0 = 0
            L11:
                com.google.android.material.textfield.TextInputLayout r1 = r13.d
                java.lang.CharSequence r1 = r1.getHint()
                com.google.android.material.textfield.TextInputLayout r2 = r13.d
                java.lang.CharSequence r2 = r2.getError()
                com.google.android.material.textfield.TextInputLayout r3 = r13.d
                java.lang.CharSequence r3 = r3.getPlaceholderText()
                com.google.android.material.textfield.TextInputLayout r4 = r13.d
                int r4 = r4.getCounterMaxLength()
                com.google.android.material.textfield.TextInputLayout r5 = r13.d
                java.lang.CharSequence r5 = r5.getCounterOverflowDescription()
                boolean r6 = android.text.TextUtils.isEmpty(r0)
                r7 = 1
                r6 = r6 ^ r7
                boolean r8 = android.text.TextUtils.isEmpty(r1)
                r8 = r8 ^ r7
                com.google.android.material.textfield.TextInputLayout r9 = r13.d
                boolean r9 = r9.N()
                r9 = r9 ^ r7
                boolean r10 = android.text.TextUtils.isEmpty(r2)
                r10 = r10 ^ r7
                if (r10 != 0) goto L51
                boolean r11 = android.text.TextUtils.isEmpty(r5)
                if (r11 != 0) goto L4f
                goto L51
            L4f:
                r11 = 0
                goto L52
            L51:
                r11 = 1
            L52:
                if (r8 == 0) goto L59
                java.lang.String r1 = r1.toString()
                goto L5b
            L59:
                java.lang.String r1 = ""
            L5b:
                java.lang.String r8 = ", "
                if (r6 == 0) goto L63
                r15.z0(r0)
                goto L88
            L63:
                boolean r12 = android.text.TextUtils.isEmpty(r1)
                if (r12 != 0) goto L83
                r15.z0(r1)
                if (r9 == 0) goto L88
                if (r3 == 0) goto L88
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r1)
                r9.append(r8)
                r9.append(r3)
                java.lang.String r3 = r9.toString()
                goto L85
            L83:
                if (r3 == 0) goto L88
            L85:
                r15.z0(r3)
            L88:
                boolean r3 = android.text.TextUtils.isEmpty(r1)
                if (r3 != 0) goto Lb4
                int r3 = android.os.Build.VERSION.SDK_INT
                r9 = 26
                if (r3 < r9) goto L98
                r15.l0(r1)
                goto Laf
            L98:
                if (r6 == 0) goto Lac
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r0)
                r3.append(r8)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
            Lac:
                r15.z0(r1)
            Laf:
                r1 = r6 ^ 1
                r15.v0(r1)
            Lb4:
                if (r0 == 0) goto Lbd
                int r0 = r0.length()
                if (r0 != r4) goto Lbd
                goto Lbe
            Lbd:
                r4 = -1
            Lbe:
                r15.n0(r4)
                if (r11 == 0) goto Lca
                if (r10 == 0) goto Lc6
                goto Lc7
            Lc6:
                r2 = r5
            Lc7:
                r15.h0(r2)
            Lca:
                if (r14 == 0) goto Ld1
                int r15 = com.daaw.m11.textinput_helper_text
                r14.setLabelFor(r15)
            Ld1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.e.g(android.view.View, com.daaw.y):void");
        }
    }

    /* loaded from: classes2.dex */
    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    /* loaded from: classes2.dex */
    public interface g {
        void a(TextInputLayout textInputLayout, int i);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w01.textInputStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v103 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(android.content.Context r28, android.util.AttributeSet r29, int r30) {
        /*
            Method dump skipped, instructions count: 1532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static void U(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                U((ViewGroup) childAt, z);
            }
        }
    }

    public static void b0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean Q = xs1.Q(checkableImageButton);
        boolean z = false;
        boolean z2 = onLongClickListener != null;
        z = (Q || z2) ? true : true;
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(Q);
        checkableImageButton.setPressable(Q);
        checkableImageButton.setLongClickable(z2);
        xs1.B0(checkableImageButton, z ? 1 : 2);
    }

    public static void c0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        b0(checkableImageButton, onLongClickListener);
    }

    public static void d0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        b0(checkableImageButton, onLongClickListener);
    }

    private ex getEndIconDelegate() {
        ex exVar = this.s0.get(this.r0);
        return exVar != null ? exVar : this.s0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.E0.getVisibility() == 0) {
            return this.E0;
        }
        if (I() && K()) {
            return this.t0;
        }
        return null;
    }

    public static void o0(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? h21.character_counter_overflowed_content_description : h21.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    private void setEditText(EditText editText) {
        if (this.t != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.r0 != 3) {
            boolean z = editText instanceof TextInputEditText;
        }
        this.t = editText;
        S();
        setTextInputAccessibilityDelegate(new e(this));
        this.S0.b0(this.t.getTypeface());
        this.S0.T(this.t.getTextSize());
        int gravity = this.t.getGravity();
        this.S0.L((gravity & (-113)) | 48);
        this.S0.S(gravity);
        this.t.addTextChangedListener(new a());
        if (this.G0 == null) {
            this.G0 = this.t.getHintTextColors();
        }
        if (this.N) {
            if (TextUtils.isEmpty(this.O)) {
                CharSequence hint = this.t.getHint();
                this.u = hint;
                setHint(hint);
                this.t.setHint((CharSequence) null);
            }
            this.P = true;
        }
        if (this.z != null) {
            n0(this.t.getText().length());
        }
        r0();
        this.v.e();
        this.q.bringToFront();
        this.r.bringToFront();
        this.s.bringToFront();
        this.E0.bringToFront();
        B();
        z0();
        C0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        v0(false, true);
    }

    private void setErrorIconVisible(boolean z) {
        this.E0.setVisibility(z ? 0 : 8);
        this.s.setVisibility(z ? 8 : 0);
        C0();
        if (I()) {
            return;
        }
        q0();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.O)) {
            return;
        }
        this.O = charSequence;
        this.S0.Z(charSequence);
        if (this.R0) {
            return;
        }
        T();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.D == z) {
            return;
        }
        if (z) {
            w4 w4Var = new w4(getContext());
            this.E = w4Var;
            w4Var.setId(m11.textinput_placeholder);
            xs1.t0(this.E, 1);
            setPlaceholderTextAppearance(this.G);
            setPlaceholderTextColor(this.F);
            g();
        } else {
            Z();
            this.E = null;
        }
        this.D = z;
    }

    public final boolean A() {
        return this.N && !TextUtils.isEmpty(this.O) && (this.Q instanceof ro);
    }

    public final void A0() {
        this.K.setVisibility((this.J == null || N()) ? 8 : 0);
        q0();
    }

    public final void B() {
        Iterator<f> it = this.q0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    public final void B0(boolean z, boolean z2) {
        int defaultColor = this.L0.getDefaultColor();
        int colorForState = this.L0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.L0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.c0 = colorForState2;
        } else if (z2) {
            this.c0 = colorForState;
        } else {
            this.c0 = defaultColor;
        }
    }

    public final void C(int i) {
        Iterator<g> it = this.u0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i);
        }
    }

    public final void C0() {
        if (this.t == null) {
            return;
        }
        xs1.E0(this.M, getContext().getResources().getDimensionPixelSize(f11.material_input_text_to_prefix_suffix_padding), this.t.getPaddingTop(), (K() || L()) ? 0 : xs1.I(this.t), this.t.getPaddingBottom());
    }

    public final void D(Canvas canvas) {
        nn0 nn0Var = this.R;
        if (nn0Var != null) {
            Rect bounds = nn0Var.getBounds();
            bounds.top = bounds.bottom - this.W;
            this.R.draw(canvas);
        }
    }

    public final void D0() {
        int visibility = this.M.getVisibility();
        boolean z = (this.L == null || N()) ? false : true;
        this.M.setVisibility(z ? 0 : 8);
        if (visibility != this.M.getVisibility()) {
            getEndIconDelegate().c(z);
        }
        q0();
    }

    public final void E(Canvas canvas) {
        if (this.N) {
            this.S0.j(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E0() {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.E0():void");
    }

    public final void F(boolean z) {
        ValueAnimator valueAnimator = this.V0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.V0.cancel();
        }
        if (z && this.U0) {
            i(0.0f);
        } else {
            this.S0.V(0.0f);
        }
        if (A() && ((ro) this.Q).i0()) {
            y();
        }
        this.R0 = true;
        J();
        A0();
        D0();
    }

    public final int G(int i, boolean z) {
        int compoundPaddingLeft = i + this.t.getCompoundPaddingLeft();
        return (this.J == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.K.getMeasuredWidth()) + this.K.getPaddingLeft();
    }

    public final int H(int i, boolean z) {
        int compoundPaddingRight = i - this.t.getCompoundPaddingRight();
        return (this.J == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.K.getMeasuredWidth() - this.K.getPaddingRight());
    }

    public final boolean I() {
        return this.r0 != 0;
    }

    public final void J() {
        TextView textView = this.E;
        if (textView == null || !this.D) {
            return;
        }
        textView.setText((CharSequence) null);
        this.E.setVisibility(4);
    }

    public boolean K() {
        return this.s.getVisibility() == 0 && this.t0.getVisibility() == 0;
    }

    public final boolean L() {
        return this.E0.getVisibility() == 0;
    }

    public boolean M() {
        return this.v.y();
    }

    public final boolean N() {
        return this.R0;
    }

    public boolean O() {
        return this.P;
    }

    public final boolean P() {
        return this.U == 1 && this.t.getMinLines() <= 1;
    }

    public boolean Q() {
        return this.i0.getVisibility() == 0;
    }

    public final int[] R(CheckableImageButton checkableImageButton) {
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    public final void S() {
        p();
        a0();
        E0();
        k0();
        h();
        if (this.U != 0) {
            t0();
        }
    }

    public final void T() {
        if (A()) {
            RectF rectF = this.g0;
            this.S0.m(rectF, this.t.getWidth(), this.t.getGravity());
            l(rectF);
            rectF.offset(-getPaddingLeft(), -getPaddingTop());
            ((ro) this.Q).o0(rectF);
        }
    }

    public void V() {
        X(this.t0, this.v0);
    }

    public void W() {
        X(this.E0, this.F0);
    }

    public final void X(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(R(checkableImageButton), colorStateList.getDefaultColor());
        Drawable mutate = nu.r(drawable).mutate();
        nu.o(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public void Y() {
        X(this.i0, this.j0);
    }

    public final void Z() {
        TextView textView = this.E;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public final void a0() {
        if (h0()) {
            xs1.v0(this.t, this.Q);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.p.addView(view, layoutParams2);
        this.p.setLayoutParams(layoutParams);
        t0();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.t;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.u != null) {
            boolean z = this.P;
            this.P = false;
            CharSequence hint = editText.getHint();
            this.t.setHint(this.u);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.t.setHint(hint);
                this.P = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.p.getChildCount());
        for (int i2 = 0; i2 < this.p.getChildCount(); i2++) {
            View childAt = this.p.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.t) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.X0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.X0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.W0) {
            return;
        }
        boolean z = true;
        this.W0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        gg ggVar = this.S0;
        boolean Y = ggVar != null ? ggVar.Y(drawableState) | false : false;
        if (this.t != null) {
            u0((xs1.V(this) && isEnabled()) ? false : false);
        }
        r0();
        E0();
        if (Y) {
            invalidate();
        }
        this.W0 = false;
    }

    public void e(f fVar) {
        this.q0.add(fVar);
        if (this.t != null) {
            fVar.a(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e0(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            com.daaw.sk1.n(r3, r4)     // Catch: java.lang.Exception -> L1b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1b
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1b
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1c
        L18:
            r4 = 0
            r0 = 0
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L30
            int r4 = com.daaw.k21.TextAppearance_AppCompat_Caption
            com.daaw.sk1.n(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = com.daaw.a11.design_error
            int r4 = com.daaw.zk.c(r4, r0)
            r3.setTextColor(r4)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.e0(android.widget.TextView, int):void");
    }

    public void f(g gVar) {
        this.u0.add(gVar);
    }

    public final boolean f0() {
        return (this.E0.getVisibility() == 0 || ((I() && K()) || this.L != null)) && this.r.getMeasuredWidth() > 0;
    }

    public final void g() {
        TextView textView = this.E;
        if (textView != null) {
            this.p.addView(textView);
            this.E.setVisibility(0);
        }
    }

    public final boolean g0() {
        return !(getStartIconDrawable() == null && this.J == null) && this.q.getMeasuredWidth() > 0;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.t;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    public nn0 getBoxBackground() {
        int i = this.U;
        if (i == 1 || i == 2) {
            return this.Q;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.d0;
    }

    public int getBoxBackgroundMode() {
        return this.U;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.Q.s();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.Q.t();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.Q.G();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.Q.F();
    }

    public int getBoxStrokeColor() {
        return this.K0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.L0;
    }

    public int getBoxStrokeWidth() {
        return this.a0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.b0;
    }

    public int getCounterMaxLength() {
        return this.x;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.w && this.y && (textView = this.z) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.H;
    }

    public ColorStateList getCounterTextColor() {
        return this.H;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.G0;
    }

    public EditText getEditText() {
        return this.t;
    }

    public CharSequence getEndIconContentDescription() {
        return this.t0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.t0.getDrawable();
    }

    public int getEndIconMode() {
        return this.r0;
    }

    public CheckableImageButton getEndIconView() {
        return this.t0;
    }

    public CharSequence getError() {
        if (this.v.x()) {
            return this.v.n();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.v.m();
    }

    public int getErrorCurrentTextColors() {
        return this.v.o();
    }

    public Drawable getErrorIconDrawable() {
        return this.E0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.v.o();
    }

    public CharSequence getHelperText() {
        if (this.v.y()) {
            return this.v.q();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.v.r();
    }

    public CharSequence getHint() {
        if (this.N) {
            return this.O;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.S0.o();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.S0.r();
    }

    public ColorStateList getHintTextColor() {
        return this.H0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.t0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.t0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.D) {
            return this.C;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.G;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.F;
    }

    public CharSequence getPrefixText() {
        return this.J;
    }

    public ColorStateList getPrefixTextColor() {
        return this.K.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.K;
    }

    public CharSequence getStartIconContentDescription() {
        return this.i0.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.i0.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.L;
    }

    public ColorStateList getSuffixTextColor() {
        return this.M.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.M;
    }

    public Typeface getTypeface() {
        return this.h0;
    }

    public final void h() {
        EditText editText;
        int J;
        int dimensionPixelSize;
        int I;
        Resources resources;
        int i;
        if (this.t == null || this.U != 1) {
            return;
        }
        if (mn0.h(getContext())) {
            editText = this.t;
            J = xs1.J(editText);
            dimensionPixelSize = getResources().getDimensionPixelSize(f11.material_filled_edittext_font_2_0_padding_top);
            I = xs1.I(this.t);
            resources = getResources();
            i = f11.material_filled_edittext_font_2_0_padding_bottom;
        } else if (!mn0.g(getContext())) {
            return;
        } else {
            editText = this.t;
            J = xs1.J(editText);
            dimensionPixelSize = getResources().getDimensionPixelSize(f11.material_filled_edittext_font_1_3_padding_top);
            I = xs1.I(this.t);
            resources = getResources();
            i = f11.material_filled_edittext_font_1_3_padding_bottom;
        }
        xs1.E0(editText, J, dimensionPixelSize, I, resources.getDimensionPixelSize(i));
    }

    public final boolean h0() {
        EditText editText = this.t;
        return (editText == null || this.Q == null || editText.getBackground() != null || this.U == 0) ? false : true;
    }

    public void i(float f2) {
        if (this.S0.v() == f2) {
            return;
        }
        if (this.V0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.V0 = valueAnimator;
            valueAnimator.setInterpolator(f3.b);
            this.V0.setDuration(167L);
            this.V0.addUpdateListener(new d());
        }
        this.V0.setFloatValues(this.S0.v(), f2);
        this.V0.start();
    }

    public final void i0() {
        TextView textView = this.E;
        if (textView == null || !this.D) {
            return;
        }
        textView.setText(this.C);
        this.E.setVisibility(0);
        this.E.bringToFront();
    }

    public final void j() {
        nn0 nn0Var = this.Q;
        if (nn0Var == null) {
            return;
        }
        nn0Var.setShapeAppearanceModel(this.S);
        if (w()) {
            this.Q.b0(this.W, this.c0);
        }
        int q = q();
        this.d0 = q;
        this.Q.W(ColorStateList.valueOf(q));
        if (this.r0 == 3) {
            this.t.getBackground().invalidateSelf();
        }
        k();
        invalidate();
    }

    public final void j0(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            m();
            return;
        }
        Drawable mutate = nu.r(getEndIconDrawable()).mutate();
        nu.n(mutate, this.v.o());
        this.t0.setImageDrawable(mutate);
    }

    public final void k() {
        if (this.R == null) {
            return;
        }
        if (x()) {
            this.R.W(ColorStateList.valueOf(this.c0));
        }
        invalidate();
    }

    public final void k0() {
        Resources resources;
        int i;
        if (this.U == 1) {
            if (mn0.h(getContext())) {
                resources = getResources();
                i = f11.material_font_2_0_box_collapsed_padding_top;
            } else if (!mn0.g(getContext())) {
                return;
            } else {
                resources = getResources();
                i = f11.material_font_1_3_box_collapsed_padding_top;
            }
            this.V = resources.getDimensionPixelSize(i);
        }
    }

    public final void l(RectF rectF) {
        float f2 = rectF.left;
        int i = this.T;
        rectF.left = f2 - i;
        rectF.top -= i;
        rectF.right += i;
        rectF.bottom += i;
    }

    public final void l0(Rect rect) {
        nn0 nn0Var = this.R;
        if (nn0Var != null) {
            int i = rect.bottom;
            nn0Var.setBounds(rect.left, i - this.b0, rect.right, i);
        }
    }

    public final void m() {
        n(this.t0, this.w0, this.v0, this.y0, this.x0);
    }

    public final void m0() {
        if (this.z != null) {
            EditText editText = this.t;
            n0(editText == null ? 0 : editText.getText().length());
        }
    }

    public final void n(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = nu.r(drawable).mutate();
            if (z) {
                nu.o(drawable, colorStateList);
            }
            if (z2) {
                nu.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void n0(int i) {
        boolean z = this.y;
        int i2 = this.x;
        if (i2 == -1) {
            this.z.setText(String.valueOf(i));
            this.z.setContentDescription(null);
            this.y = false;
        } else {
            this.y = i > i2;
            o0(getContext(), this.z, i, this.x, this.y);
            if (z != this.y) {
                p0();
            }
            this.z.setText(pb.c().j(getContext().getString(h21.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.x))));
        }
        if (this.t == null || z == this.y) {
            return;
        }
        u0(false);
        E0();
        r0();
    }

    public final void o() {
        n(this.i0, this.k0, this.j0, this.m0, this.l0);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.t;
        if (editText != null) {
            Rect rect = this.e0;
            it.a(this, editText, rect);
            l0(rect);
            if (this.N) {
                this.S0.T(this.t.getTextSize());
                int gravity = this.t.getGravity();
                this.S0.L((gravity & (-113)) | 48);
                this.S0.S(gravity);
                this.S0.H(r(rect));
                this.S0.P(u(rect));
                this.S0.E();
                if (!A() || this.R0) {
                    return;
                }
                T();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean s0 = s0();
        boolean q0 = q0();
        if (s0 || q0) {
            this.t.post(new c());
        }
        w0();
        z0();
        C0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setError(savedState.r);
        if (savedState.s) {
            this.t0.post(new b());
        }
        setHint(savedState.t);
        setHelperText(savedState.u);
        setPlaceholderText(savedState.v);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.v.k()) {
            savedState.r = getError();
        }
        savedState.s = I() && this.t0.isChecked();
        savedState.t = getHint();
        savedState.u = getHelperText();
        savedState.v = getPlaceholderText();
        return savedState;
    }

    public final void p() {
        int i = this.U;
        if (i == 0) {
            this.Q = null;
        } else if (i == 1) {
            this.Q = new nn0(this.S);
            this.R = new nn0();
            return;
        } else if (i != 2) {
            throw new IllegalArgumentException(this.U + " is illegal; only @BoxBackgroundMode constants are supported.");
        } else {
            this.Q = (!this.N || (this.Q instanceof ro)) ? new nn0(this.S) : new ro(this.S);
        }
        this.R = null;
    }

    public final void p0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.z;
        if (textView != null) {
            e0(textView, this.y ? this.A : this.B);
            if (!this.y && (colorStateList2 = this.H) != null) {
                this.z.setTextColor(colorStateList2);
            }
            if (!this.y || (colorStateList = this.I) == null) {
                return;
            }
            this.z.setTextColor(colorStateList);
        }
    }

    public final int q() {
        return this.U == 1 ? jn0.e(jn0.d(this, w01.colorSurface, 0), this.d0) : this.d0;
    }

    public final boolean q0() {
        boolean z;
        if (this.t == null) {
            return false;
        }
        boolean z2 = true;
        if (g0()) {
            int measuredWidth = this.q.getMeasuredWidth() - this.t.getPaddingLeft();
            if (this.n0 == null || this.o0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.n0 = colorDrawable;
                this.o0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] a2 = sk1.a(this.t);
            Drawable drawable = a2[0];
            Drawable drawable2 = this.n0;
            if (drawable != drawable2) {
                sk1.i(this.t, drawable2, a2[1], a2[2], a2[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.n0 != null) {
                Drawable[] a3 = sk1.a(this.t);
                sk1.i(this.t, null, a3[1], a3[2], a3[3]);
                this.n0 = null;
                z = true;
            }
            z = false;
        }
        if (f0()) {
            int measuredWidth2 = this.M.getMeasuredWidth() - this.t.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + cn0.b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] a4 = sk1.a(this.t);
            Drawable drawable3 = this.z0;
            if (drawable3 == null || this.A0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.z0 = colorDrawable2;
                    this.A0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = a4[2];
                Drawable drawable5 = this.z0;
                if (drawable4 != drawable5) {
                    this.B0 = a4[2];
                    sk1.i(this.t, a4[0], a4[1], drawable5, a4[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.A0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                sk1.i(this.t, a4[0], a4[1], this.z0, a4[3]);
            }
        } else if (this.z0 == null) {
            return z;
        } else {
            Drawable[] a5 = sk1.a(this.t);
            if (a5[2] == this.z0) {
                sk1.i(this.t, a5[0], a5[1], this.B0, a5[3]);
            } else {
                z2 = z;
            }
            this.z0 = null;
        }
        return z2;
    }

    public final Rect r(Rect rect) {
        int i;
        int i2;
        if (this.t != null) {
            Rect rect2 = this.f0;
            boolean z = xs1.E(this) == 1;
            rect2.bottom = rect.bottom;
            int i3 = this.U;
            if (i3 == 1) {
                rect2.left = G(rect.left, z);
                i = rect.top + this.V;
            } else if (i3 == 2) {
                rect2.left = rect.left + this.t.getPaddingLeft();
                rect2.top = rect.top - v();
                i2 = rect.right - this.t.getPaddingRight();
                rect2.right = i2;
                return rect2;
            } else {
                rect2.left = G(rect.left, z);
                i = getPaddingTop();
            }
            rect2.top = i;
            i2 = H(rect.right, z);
            rect2.right = i2;
            return rect2;
        }
        throw new IllegalStateException();
    }

    public void r0() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.t;
        if (editText == null || this.U != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (vu.a(background)) {
            background = background.mutate();
        }
        if (this.v.k()) {
            currentTextColor = this.v.o();
        } else if (!this.y || (textView = this.z) == null) {
            nu.c(background);
            this.t.refreshDrawableState();
            return;
        } else {
            currentTextColor = textView.getCurrentTextColor();
        }
        background.setColorFilter(d4.e(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    public final int s(Rect rect, Rect rect2, float f2) {
        return P() ? (int) (rect2.top + f2) : rect.bottom - this.t.getCompoundPaddingBottom();
    }

    public final boolean s0() {
        int max;
        if (this.t != null && this.t.getMeasuredHeight() < (max = Math.max(this.r.getMeasuredHeight(), this.q.getMeasuredHeight()))) {
            this.t.setMinimumHeight(max);
            return true;
        }
        return false;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.d0 != i) {
            this.d0 = i;
            this.M0 = i;
            this.O0 = i;
            this.P0 = i;
            j();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(zk.c(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.M0 = defaultColor;
        this.d0 = defaultColor;
        this.N0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.O0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.P0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        j();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.U) {
            return;
        }
        this.U = i;
        if (this.t != null) {
            S();
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.K0 != i) {
            this.K0 = i;
            E0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.K0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            E0();
        }
        this.I0 = colorStateList.getDefaultColor();
        this.Q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.J0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.K0 = defaultColor;
        E0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.L0 != colorStateList) {
            this.L0 = colorStateList;
            E0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.a0 = i;
        E0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.b0 = i;
        E0();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.w != z) {
            if (z) {
                w4 w4Var = new w4(getContext());
                this.z = w4Var;
                w4Var.setId(m11.textinput_counter);
                Typeface typeface = this.h0;
                if (typeface != null) {
                    this.z.setTypeface(typeface);
                }
                this.z.setMaxLines(1);
                this.v.d(this.z, 2);
                cn0.d((ViewGroup.MarginLayoutParams) this.z.getLayoutParams(), getResources().getDimensionPixelOffset(f11.mtrl_textinput_counter_margin_start));
                p0();
                m0();
            } else {
                this.v.z(this.z, 2);
                this.z = null;
            }
            this.w = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.x != i) {
            if (i <= 0) {
                i = -1;
            }
            this.x = i;
            if (this.w) {
                m0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.A != i) {
            this.A = i;
            p0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.I != colorStateList) {
            this.I = colorStateList;
            p0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.B != i) {
            this.B = i;
            p0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            p0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.G0 = colorStateList;
        this.H0 = colorStateList;
        if (this.t != null) {
            u0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        U(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.t0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.t0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.t0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? r4.b(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.t0.setImageDrawable(drawable);
        V();
    }

    public void setEndIconMode(int i) {
        int i2 = this.r0;
        this.r0 = i;
        C(i2);
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().b(this.U)) {
            getEndIconDelegate().a();
            m();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.U + " is not supported by the end icon mode " + i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        c0(this.t0, onClickListener, this.C0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.C0 = onLongClickListener;
        d0(this.t0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.v0 != colorStateList) {
            this.v0 = colorStateList;
            this.w0 = true;
            m();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.x0 != mode) {
            this.x0 = mode;
            this.y0 = true;
            m();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (K() != z) {
            this.t0.setVisibility(z ? 0 : 8);
            C0();
            q0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.v.x()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.v.t();
        } else {
            this.v.M(charSequence);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.v.B(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.v.C(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? r4.b(getContext(), i) : null);
        W();
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.E0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.v.x());
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        c0(this.E0, onClickListener, this.D0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.D0 = onLongClickListener;
        d0(this.E0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.F0 = colorStateList;
        Drawable drawable = this.E0.getDrawable();
        if (drawable != null) {
            drawable = nu.r(drawable).mutate();
            nu.o(drawable, colorStateList);
        }
        if (this.E0.getDrawable() != drawable) {
            this.E0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.E0.getDrawable();
        if (drawable != null) {
            drawable = nu.r(drawable).mutate();
            nu.p(drawable, mode);
        }
        if (this.E0.getDrawable() != drawable) {
            this.E0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.v.D(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.v.E(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.T0 != z) {
            this.T0 = z;
            u0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (M()) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!M()) {
            setHelperTextEnabled(true);
        }
        this.v.N(charSequence);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.v.H(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.v.G(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.v.F(i);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.N) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.U0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.N) {
            this.N = z;
            if (z) {
                CharSequence hint = this.t.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.O)) {
                        setHint(hint);
                    }
                    this.t.setHint((CharSequence) null);
                }
                this.P = true;
            } else {
                this.P = false;
                if (!TextUtils.isEmpty(this.O) && TextUtils.isEmpty(this.t.getHint())) {
                    this.t.setHint(this.O);
                }
                setHintInternal(null);
            }
            if (this.t != null) {
                t0();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.S0.I(i);
        this.H0 = this.S0.n();
        if (this.t != null) {
            u0(false);
            t0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.H0 != colorStateList) {
            if (this.G0 == null) {
                this.S0.K(colorStateList);
            }
            this.H0 = colorStateList;
            if (this.t != null) {
                u0(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.t0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? r4.b(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.t0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.r0 != 1) {
            setEndIconMode(1);
        } else if (z) {
        } else {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.v0 = colorStateList;
        this.w0 = true;
        m();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.x0 = mode;
        this.y0 = true;
        m();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.D && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.D) {
                setPlaceholderTextEnabled(true);
            }
            this.C = charSequence;
        }
        x0();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.G = i;
        TextView textView = this.E;
        if (textView != null) {
            sk1.n(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            TextView textView = this.E;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.J = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.K.setText(charSequence);
        A0();
    }

    public void setPrefixTextAppearance(int i) {
        sk1.n(this.K, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.K.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.i0.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.i0.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? r4.b(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.i0.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            Y();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        c0(this.i0, onClickListener, this.p0);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.p0 = onLongClickListener;
        d0(this.i0, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.j0 != colorStateList) {
            this.j0 = colorStateList;
            this.k0 = true;
            o();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.l0 != mode) {
            this.l0 = mode;
            this.m0 = true;
            o();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (Q() != z) {
            this.i0.setVisibility(z ? 0 : 8);
            z0();
            q0();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.L = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.M.setText(charSequence);
        D0();
    }

    public void setSuffixTextAppearance(int i) {
        sk1.n(this.M, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.M.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.t;
        if (editText != null) {
            xs1.r0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.h0) {
            this.h0 = typeface;
            this.S0.b0(typeface);
            this.v.J(typeface);
            TextView textView = this.z;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public final int t(Rect rect, float f2) {
        return P() ? (int) (rect.centerY() - (f2 / 2.0f)) : rect.top + this.t.getCompoundPaddingTop();
    }

    public final void t0() {
        if (this.U != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.p.getLayoutParams();
            int v = v();
            if (v != layoutParams.topMargin) {
                layoutParams.topMargin = v;
                this.p.requestLayout();
            }
        }
    }

    public final Rect u(Rect rect) {
        if (this.t != null) {
            Rect rect2 = this.f0;
            float u = this.S0.u();
            rect2.left = rect.left + this.t.getCompoundPaddingLeft();
            rect2.top = t(rect, u);
            rect2.right = rect.right - this.t.getCompoundPaddingRight();
            rect2.bottom = s(rect, rect2, u);
            return rect2;
        }
        throw new IllegalStateException();
    }

    public void u0(boolean z) {
        v0(z, false);
    }

    public final int v() {
        float o;
        if (this.N) {
            int i = this.U;
            if (i == 0 || i == 1) {
                o = this.S0.o();
            } else if (i != 2) {
                return 0;
            } else {
                o = this.S0.o() / 2.0f;
            }
            return (int) o;
        }
        return 0;
    }

    public final void v0(boolean z, boolean z2) {
        ColorStateList colorStateList;
        gg ggVar;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.t;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.t;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean k = this.v.k();
        ColorStateList colorStateList2 = this.G0;
        if (colorStateList2 != null) {
            this.S0.K(colorStateList2);
            this.S0.R(this.G0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.G0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.Q0) : this.Q0;
            this.S0.K(ColorStateList.valueOf(colorForState));
            this.S0.R(ColorStateList.valueOf(colorForState));
        } else if (k) {
            this.S0.K(this.v.p());
        } else {
            if (this.y && (textView = this.z) != null) {
                ggVar = this.S0;
                colorStateList = textView.getTextColors();
            } else if (z4 && (colorStateList = this.H0) != null) {
                ggVar = this.S0;
            }
            ggVar.K(colorStateList);
        }
        if (z3 || !this.T0 || (isEnabled() && z4)) {
            if (z2 || this.R0) {
                z(z);
            }
        } else if (z2 || !this.R0) {
            F(z);
        }
    }

    public final boolean w() {
        return this.U == 2 && x();
    }

    public final void w0() {
        EditText editText;
        if (this.E == null || (editText = this.t) == null) {
            return;
        }
        this.E.setGravity(editText.getGravity());
        this.E.setPadding(this.t.getCompoundPaddingLeft(), this.t.getCompoundPaddingTop(), this.t.getCompoundPaddingRight(), this.t.getCompoundPaddingBottom());
    }

    public final boolean x() {
        return this.W > -1 && this.c0 != 0;
    }

    public final void x0() {
        EditText editText = this.t;
        y0(editText == null ? 0 : editText.getText().length());
    }

    public final void y() {
        if (A()) {
            ((ro) this.Q).l0();
        }
    }

    public final void y0(int i) {
        if (i != 0 || this.R0) {
            J();
        } else {
            i0();
        }
    }

    public final void z(boolean z) {
        ValueAnimator valueAnimator = this.V0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.V0.cancel();
        }
        if (z && this.U0) {
            i(1.0f);
        } else {
            this.S0.V(1.0f);
        }
        this.R0 = false;
        if (A()) {
            T();
        }
        x0();
        A0();
        D0();
    }

    public final void z0() {
        if (this.t == null) {
            return;
        }
        xs1.E0(this.K, Q() ? 0 : xs1.J(this.t), this.t.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(f11.material_input_text_to_prefix_suffix_padding), this.t.getCompoundPaddingBottom());
    }
}
