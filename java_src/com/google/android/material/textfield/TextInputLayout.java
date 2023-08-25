package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
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
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.daaw.AbstractC1229ex;
import com.daaw.C1046d4;
import com.daaw.C1247f3;
import com.daaw.C1398gg;
import com.daaw.C1753it;
import com.daaw.C2366nu;
import com.daaw.C2533pb;
import com.daaw.C2818r4;
import com.daaw.C2873ro;
import com.daaw.C2957sn;
import com.daaw.C3373vu;
import com.daaw.C3388w;
import com.daaw.C3397w4;
import com.daaw.C3654y;
import com.daaw.C3866zk;
import com.daaw.a11;
import com.daaw.a21;
import com.daaw.cn0;
import com.daaw.f11;
import com.daaw.fu1;
import com.daaw.gc1;
import com.daaw.h21;
import com.daaw.jn0;
import com.daaw.k21;
import com.daaw.m11;
import com.daaw.m21;
import com.daaw.mn0;
import com.daaw.nn0;
import com.daaw.qn0;
import com.daaw.sf0;
import com.daaw.sk1;
import com.daaw.ul1;
import com.daaw.w01;
import com.daaw.ws0;
import com.daaw.xk1;
import com.daaw.xs1;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: Y0 */
    public static final int f37664Y0 = k21.Widget_Design_TextInputLayout;

    /* renamed from: A */
    public int f37665A;

    /* renamed from: A0 */
    public int f37666A0;

    /* renamed from: B */
    public int f37667B;

    /* renamed from: B0 */
    public Drawable f37668B0;

    /* renamed from: C */
    public CharSequence f37669C;

    /* renamed from: C0 */
    public View.OnLongClickListener f37670C0;

    /* renamed from: D */
    public boolean f37671D;

    /* renamed from: D0 */
    public View.OnLongClickListener f37672D0;

    /* renamed from: E */
    public TextView f37673E;

    /* renamed from: E0 */
    public final CheckableImageButton f37674E0;

    /* renamed from: F */
    public ColorStateList f37675F;

    /* renamed from: F0 */
    public ColorStateList f37676F0;

    /* renamed from: G */
    public int f37677G;

    /* renamed from: G0 */
    public ColorStateList f37678G0;

    /* renamed from: H */
    public ColorStateList f37679H;

    /* renamed from: H0 */
    public ColorStateList f37680H0;

    /* renamed from: I */
    public ColorStateList f37681I;

    /* renamed from: I0 */
    public int f37682I0;

    /* renamed from: J */
    public CharSequence f37683J;

    /* renamed from: J0 */
    public int f37684J0;

    /* renamed from: K */
    public final TextView f37685K;

    /* renamed from: K0 */
    public int f37686K0;

    /* renamed from: L */
    public CharSequence f37687L;

    /* renamed from: L0 */
    public ColorStateList f37688L0;

    /* renamed from: M */
    public final TextView f37689M;

    /* renamed from: M0 */
    public int f37690M0;

    /* renamed from: N */
    public boolean f37691N;

    /* renamed from: N0 */
    public int f37692N0;

    /* renamed from: O */
    public CharSequence f37693O;

    /* renamed from: O0 */
    public int f37694O0;

    /* renamed from: P */
    public boolean f37695P;

    /* renamed from: P0 */
    public int f37696P0;

    /* renamed from: Q */
    public nn0 f37697Q;

    /* renamed from: Q0 */
    public int f37698Q0;

    /* renamed from: R */
    public nn0 f37699R;

    /* renamed from: R0 */
    public boolean f37700R0;

    /* renamed from: S */
    public gc1 f37701S;

    /* renamed from: S0 */
    public final C1398gg f37702S0;

    /* renamed from: T */
    public final int f37703T;

    /* renamed from: T0 */
    public boolean f37704T0;

    /* renamed from: U */
    public int f37705U;

    /* renamed from: U0 */
    public boolean f37706U0;

    /* renamed from: V */
    public int f37707V;

    /* renamed from: V0 */
    public ValueAnimator f37708V0;

    /* renamed from: W */
    public int f37709W;

    /* renamed from: W0 */
    public boolean f37710W0;

    /* renamed from: X0 */
    public boolean f37711X0;

    /* renamed from: a0 */
    public int f37712a0;

    /* renamed from: b0 */
    public int f37713b0;

    /* renamed from: c0 */
    public int f37714c0;

    /* renamed from: d0 */
    public int f37715d0;

    /* renamed from: e0 */
    public final Rect f37716e0;

    /* renamed from: f0 */
    public final Rect f37717f0;

    /* renamed from: g0 */
    public final RectF f37718g0;

    /* renamed from: h0 */
    public Typeface f37719h0;

    /* renamed from: i0 */
    public final CheckableImageButton f37720i0;

    /* renamed from: j0 */
    public ColorStateList f37721j0;

    /* renamed from: k0 */
    public boolean f37722k0;

    /* renamed from: l0 */
    public PorterDuff.Mode f37723l0;

    /* renamed from: m0 */
    public boolean f37724m0;

    /* renamed from: n0 */
    public Drawable f37725n0;

    /* renamed from: o0 */
    public int f37726o0;

    /* renamed from: p */
    public final FrameLayout f37727p;

    /* renamed from: p0 */
    public View.OnLongClickListener f37728p0;

    /* renamed from: q */
    public final LinearLayout f37729q;

    /* renamed from: q0 */
    public final LinkedHashSet<InterfaceC4123f> f37730q0;

    /* renamed from: r */
    public final LinearLayout f37731r;

    /* renamed from: r0 */
    public int f37732r0;

    /* renamed from: s */
    public final FrameLayout f37733s;

    /* renamed from: s0 */
    public final SparseArray<AbstractC1229ex> f37734s0;

    /* renamed from: t */
    public EditText f37735t;

    /* renamed from: t0 */
    public final CheckableImageButton f37736t0;

    /* renamed from: u */
    public CharSequence f37737u;

    /* renamed from: u0 */
    public final LinkedHashSet<InterfaceC4124g> f37738u0;

    /* renamed from: v */
    public final sf0 f37739v;

    /* renamed from: v0 */
    public ColorStateList f37740v0;

    /* renamed from: w */
    public boolean f37741w;

    /* renamed from: w0 */
    public boolean f37742w0;

    /* renamed from: x */
    public int f37743x;

    /* renamed from: x0 */
    public PorterDuff.Mode f37744x0;

    /* renamed from: y */
    public boolean f37745y;

    /* renamed from: y0 */
    public boolean f37746y0;

    /* renamed from: z */
    public TextView f37747z;

    /* renamed from: z0 */
    public Drawable f37748z0;

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4117a();

        /* renamed from: r */
        public CharSequence f37749r;

        /* renamed from: s */
        public boolean f37750s;

        /* renamed from: t */
        public CharSequence f37751t;

        /* renamed from: u */
        public CharSequence f37752u;

        /* renamed from: v */
        public CharSequence f37753v;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$a */
        /* loaded from: classes2.dex */
        public static class C4117a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f37749r = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f37750s = parcel.readInt() == 1;
            this.f37751t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f37752u = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f37753v = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f37749r) + " hint=" + ((Object) this.f37751t) + " helperText=" + ((Object) this.f37752u) + " placeholderText=" + ((Object) this.f37753v) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f37749r, parcel, i);
            parcel.writeInt(this.f37750s ? 1 : 0);
            TextUtils.writeToParcel(this.f37751t, parcel, i);
            TextUtils.writeToParcel(this.f37752u, parcel, i);
            TextUtils.writeToParcel(this.f37753v, parcel, i);
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    /* loaded from: classes2.dex */
    public class C4118a implements TextWatcher {
        public C4118a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.m247u0(!textInputLayout.f37711X0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f37741w) {
                textInputLayout2.m261n0(editable.length());
            }
            if (TextInputLayout.this.f37671D) {
                TextInputLayout.this.m239y0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    /* loaded from: classes2.dex */
    public class RunnableC4119b implements Runnable {
        public RunnableC4119b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f37736t0.performClick();
            TextInputLayout.this.f37736t0.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    /* loaded from: classes2.dex */
    public class RunnableC4120c implements Runnable {
        public RunnableC4120c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f37735t.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    /* loaded from: classes2.dex */
    public class C4121d implements ValueAnimator.AnimatorUpdateListener {
        public C4121d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f37702S0.m21695V(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    /* loaded from: classes2.dex */
    public static class C4122e extends C3388w {

        /* renamed from: d */
        public final TextInputLayout f37758d;

        public C4122e(TextInputLayout textInputLayout) {
            this.f37758d = textInputLayout;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
            if (r3 != null) goto L43;
         */
        @Override // com.daaw.C3388w
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo161g(View view, C3654y c3654y) {
            super.mo161g(view, c3654y);
            EditText editText = this.f37758d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f37758d.getHint();
            CharSequence error = this.f37758d.getError();
            CharSequence placeholderText = this.f37758d.getPlaceholderText();
            int counterMaxLength = this.f37758d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f37758d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !this.f37758d.m301N();
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z2 ? hint.toString() : "";
            if (z) {
                c3654y.m4287z0(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                c3654y.m4287z0(charSequence);
                if (z3 && placeholderText != null) {
                    placeholderText = charSequence + ", " + ((Object) placeholderText);
                    c3654y.m4287z0(placeholderText);
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    c3654y.m4315l0(charSequence);
                } else {
                    if (z) {
                        charSequence = ((Object) text) + ", " + charSequence;
                    }
                    c3654y.m4287z0(charSequence);
                }
                c3654y.m4295v0(!z);
            }
            c3654y.m4311n0((text == null || text.length() != counterMaxLength) ? -1 : -1);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                c3654y.m4323h0(error);
            }
            if (editText != null) {
                editText.setLabelFor(m11.textinput_helper_text);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC4123f {
        /* renamed from: a */
        void mo185a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    /* loaded from: classes2.dex */
    public interface InterfaceC4124g {
        /* renamed from: a */
        void mo184a(TextInputLayout textInputLayout, int i);
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
    */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(qn0.m12324c(context, attributeSet, i, r9), attributeSet, i);
        ?? r2;
        int colorForState;
        int i2 = f37664Y0;
        this.f37739v = new sf0(this);
        this.f37716e0 = new Rect();
        this.f37717f0 = new Rect();
        this.f37718g0 = new RectF();
        this.f37730q0 = new LinkedHashSet<>();
        this.f37732r0 = 0;
        SparseArray<AbstractC1229ex> sparseArray = new SparseArray<>();
        this.f37734s0 = sparseArray;
        this.f37738u0 = new LinkedHashSet<>();
        C1398gg c1398gg = new C1398gg(this);
        this.f37702S0 = c1398gg;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f37727p = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f37729q = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        frameLayout.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.f37731r = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout.addView(linearLayout2);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f37733s = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = C1247f3.f9051a;
        c1398gg.m21689a0(timeInterpolator);
        c1398gg.m21693X(timeInterpolator);
        c1398gg.m21705L(8388659);
        int[] iArr = m21.f18124Q4;
        int i3 = m21.f18267j5;
        int i4 = m21.f18251h5;
        int i5 = m21.f18362w5;
        int i6 = m21.f18020B5;
        int i7 = m21.f18048F5;
        ul1 m5025i = xk1.m5025i(context2, attributeSet, iArr, i, i2, i3, i4, i5, i6, i7);
        this.f37691N = m5025i.m8058a(m21.f18041E5, true);
        setHint(m5025i.m8043p(m21.f18145T4));
        this.f37706U0 = m5025i.m8058a(m21.f18034D5, true);
        this.f37704T0 = m5025i.m8058a(m21.f18376y5, true);
        this.f37701S = gc1.m21808e(context2, attributeSet, i, i2).m21769m();
        this.f37703T = context2.getResources().getDimensionPixelOffset(f11.mtrl_textinput_box_label_cutout_padding);
        this.f37707V = m5025i.m8054e(m21.f18166W4, 0);
        this.f37712a0 = m5025i.m8053f(m21.f18219d5, context2.getResources().getDimensionPixelSize(f11.mtrl_textinput_box_stroke_width_default));
        this.f37713b0 = m5025i.m8053f(m21.f18227e5, context2.getResources().getDimensionPixelSize(f11.mtrl_textinput_box_stroke_width_focused));
        this.f37709W = this.f37712a0;
        float m8055d = m5025i.m8055d(m21.f18195a5, -1.0f);
        float m8055d2 = m5025i.m8055d(m21.f18187Z4, -1.0f);
        float m8055d3 = m5025i.m8055d(m21.f18173X4, -1.0f);
        float m8055d4 = m5025i.m8055d(m21.f18180Y4, -1.0f);
        gc1.C1393b m21791v = this.f37701S.m21791v();
        if (m8055d >= 0.0f) {
            m21791v.m21787A(m8055d);
        }
        if (m8055d2 >= 0.0f) {
            m21791v.m21783E(m8055d2);
        }
        if (m8055d3 >= 0.0f) {
            m21791v.m21759w(m8055d3);
        }
        if (m8055d4 >= 0.0f) {
            m21791v.m21763s(m8055d4);
        }
        this.f37701S = m21791v.m21769m();
        ColorStateList m15929b = mn0.m15929b(context2, m5025i, m21.f18152U4);
        if (m15929b != null) {
            int defaultColor = m15929b.getDefaultColor();
            this.f37690M0 = defaultColor;
            this.f37715d0 = defaultColor;
            if (m15929b.isStateful()) {
                this.f37692N0 = m15929b.getColorForState(new int[]{-16842910}, -1);
                this.f37694O0 = m15929b.getColorForState(new int[]{16842908, 16842910}, -1);
                colorForState = m15929b.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.f37694O0 = this.f37690M0;
                ColorStateList m11784a = C2818r4.m11784a(context2, a11.mtrl_filled_background_color);
                this.f37692N0 = m11784a.getColorForState(new int[]{-16842910}, -1);
                colorForState = m11784a.getColorForState(new int[]{16843623}, -1);
            }
            this.f37696P0 = colorForState;
        } else {
            this.f37715d0 = 0;
            this.f37690M0 = 0;
            this.f37692N0 = 0;
            this.f37694O0 = 0;
            this.f37696P0 = 0;
        }
        int i8 = m21.f18138S4;
        if (m5025i.m8040s(i8)) {
            ColorStateList m8056c = m5025i.m8056c(i8);
            this.f37680H0 = m8056c;
            this.f37678G0 = m8056c;
        }
        int i9 = m21.f18203b5;
        ColorStateList m15929b2 = mn0.m15929b(context2, m5025i, i9);
        this.f37686K0 = m5025i.m8057b(i9, 0);
        this.f37682I0 = C3866zk.m2180c(context2, a11.mtrl_textinput_default_box_stroke_color);
        this.f37698Q0 = C3866zk.m2180c(context2, a11.mtrl_textinput_disabled_color);
        this.f37684J0 = C3866zk.m2180c(context2, a11.mtrl_textinput_hovered_box_stroke_color);
        if (m15929b2 != null) {
            setBoxStrokeColorStateList(m15929b2);
        }
        int i10 = m21.f18211c5;
        if (m5025i.m8040s(i10)) {
            setBoxStrokeErrorColor(mn0.m15929b(context2, m5025i, i10));
        }
        if (m5025i.m8045n(i7, -1) != -1) {
            r2 = 0;
            setHintTextAppearance(m5025i.m8045n(i7, 0));
        } else {
            r2 = 0;
        }
        int m8045n = m5025i.m8045n(i5, r2);
        CharSequence m8043p = m5025i.m8043p(m21.f18327r5);
        boolean m8058a = m5025i.m8058a(m21.f18334s5, r2);
        LayoutInflater from = LayoutInflater.from(getContext());
        int i11 = a21.design_text_input_end_icon;
        CheckableImageButton checkableImageButton = (CheckableImageButton) from.inflate(i11, linearLayout2, (boolean) r2);
        this.f37674E0 = checkableImageButton;
        checkableImageButton.setId(m11.text_input_error_icon);
        checkableImageButton.setVisibility(8);
        if (mn0.m15924g(context2)) {
            cn0.m25224d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), r2);
        }
        int i12 = m21.f18341t5;
        if (m5025i.m8040s(i12)) {
            setErrorIconDrawable(m5025i.m8052g(i12));
        }
        int i13 = m21.f18348u5;
        if (m5025i.m8040s(i13)) {
            setErrorIconTintList(mn0.m15929b(context2, m5025i, i13));
        }
        int i14 = m21.f18355v5;
        if (m5025i.m8040s(i14)) {
            setErrorIconTintMode(fu1.m22258e(m5025i.m8048k(i14, -1), null));
        }
        checkableImageButton.setContentDescription(getResources().getText(h21.error_icon_content_description));
        xs1.m4773B0(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int m8045n2 = m5025i.m8045n(i6, 0);
        boolean m8058a2 = m5025i.m8058a(m21.f18013A5, false);
        CharSequence m8043p2 = m5025i.m8043p(m21.f18383z5);
        int m8045n3 = m5025i.m8045n(m21.f18104N5, 0);
        CharSequence m8043p3 = m5025i.m8043p(m21.f18097M5);
        int m8045n4 = m5025i.m8045n(m21.f18125Q5, 0);
        CharSequence m8043p4 = m5025i.m8043p(m21.f18118P5);
        int m8045n5 = m5025i.m8045n(m21.f18181Y5, 0);
        CharSequence m8043p5 = m5025i.m8043p(m21.f18174X5);
        boolean m8058a3 = m5025i.m8058a(m21.f18235f5, false);
        setCounterMaxLength(m5025i.m8048k(m21.f18243g5, -1));
        this.f37667B = m5025i.m8045n(i3, 0);
        this.f37665A = m5025i.m8045n(i4, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(a21.design_text_input_start_icon, (ViewGroup) linearLayout, false);
        this.f37720i0 = checkableImageButton2;
        checkableImageButton2.setVisibility(8);
        if (mn0.m15924g(context2)) {
            cn0.m25225c((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams(), 0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        int i15 = m21.f18153U5;
        if (m5025i.m8040s(i15)) {
            setStartIconDrawable(m5025i.m8052g(i15));
            int i16 = m21.f18146T5;
            if (m5025i.m8040s(i16)) {
                setStartIconContentDescription(m5025i.m8043p(i16));
            }
            setStartIconCheckable(m5025i.m8058a(m21.f18139S5, true));
        }
        int i17 = m21.f18160V5;
        if (m5025i.m8040s(i17)) {
            setStartIconTintList(mn0.m15929b(context2, m5025i, i17));
        }
        int i18 = m21.f18167W5;
        if (m5025i.m8040s(i18)) {
            setStartIconTintMode(fu1.m22258e(m5025i.m8048k(i18, -1), null));
        }
        setBoxBackgroundMode(m5025i.m8048k(m21.f18159V4, 0));
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(i11, (ViewGroup) frameLayout2, false);
        this.f37736t0 = checkableImageButton3;
        frameLayout2.addView(checkableImageButton3);
        checkableImageButton3.setVisibility(8);
        if (mn0.m15924g(context2)) {
            cn0.m25224d((ViewGroup.MarginLayoutParams) checkableImageButton3.getLayoutParams(), 0);
        }
        sparseArray.append(-1, new C2957sn(this));
        sparseArray.append(0, new ws0(this));
        sparseArray.append(1, new C4149c(this));
        sparseArray.append(2, new C4125a(this));
        sparseArray.append(3, new C4136b(this));
        int i19 = m21.f18306o5;
        if (m5025i.m8040s(i19)) {
            setEndIconMode(m5025i.m8048k(i19, 0));
            int i20 = m21.f18299n5;
            if (m5025i.m8040s(i20)) {
                setEndIconDrawable(m5025i.m8052g(i20));
            }
            int i21 = m21.f18291m5;
            if (m5025i.m8040s(i21)) {
                setEndIconContentDescription(m5025i.m8043p(i21));
            }
            setEndIconCheckable(m5025i.m8058a(m21.f18283l5, true));
        } else {
            int i22 = m21.f18076J5;
            if (m5025i.m8040s(i22)) {
                setEndIconMode(m5025i.m8058a(i22, false) ? 1 : 0);
                setEndIconDrawable(m5025i.m8052g(m21.f18069I5));
                setEndIconContentDescription(m5025i.m8043p(m21.f18062H5));
                int i23 = m21.f18083K5;
                if (m5025i.m8040s(i23)) {
                    setEndIconTintList(mn0.m15929b(context2, m5025i, i23));
                }
                int i24 = m21.f18090L5;
                if (m5025i.m8040s(i24)) {
                    setEndIconTintMode(fu1.m22258e(m5025i.m8048k(i24, -1), null));
                }
            }
        }
        if (!m5025i.m8040s(m21.f18076J5)) {
            int i25 = m21.f18313p5;
            if (m5025i.m8040s(i25)) {
                setEndIconTintList(mn0.m15929b(context2, m5025i, i25));
            }
            int i26 = m21.f18320q5;
            if (m5025i.m8040s(i26)) {
                setEndIconTintMode(fu1.m22258e(m5025i.m8048k(i26, -1), null));
            }
        }
        C3397w4 c3397w4 = new C3397w4(context2);
        this.f37685K = c3397w4;
        c3397w4.setId(m11.textinput_prefix_text);
        c3397w4.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        xs1.m4698t0(c3397w4, 1);
        linearLayout.addView(checkableImageButton2);
        linearLayout.addView(c3397w4);
        C3397w4 c3397w42 = new C3397w4(context2);
        this.f37689M = c3397w42;
        c3397w42.setId(m11.textinput_suffix_text);
        c3397w42.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        xs1.m4698t0(c3397w42, 1);
        linearLayout2.addView(c3397w42);
        linearLayout2.addView(checkableImageButton);
        linearLayout2.addView(frameLayout2);
        setHelperTextEnabled(m8058a2);
        setHelperText(m8043p2);
        setHelperTextTextAppearance(m8045n2);
        setErrorEnabled(m8058a);
        setErrorTextAppearance(m8045n);
        setErrorContentDescription(m8043p);
        setCounterTextAppearance(this.f37667B);
        setCounterOverflowTextAppearance(this.f37665A);
        setPlaceholderText(m8043p3);
        setPlaceholderTextAppearance(m8045n3);
        setPrefixText(m8043p4);
        setPrefixTextAppearance(m8045n4);
        setSuffixText(m8043p5);
        setSuffixTextAppearance(m8045n5);
        int i27 = m21.f18369x5;
        if (m5025i.m8040s(i27)) {
            setErrorTextColor(m5025i.m8056c(i27));
        }
        int i28 = m21.f18027C5;
        if (m5025i.m8040s(i28)) {
            setHelperTextColor(m5025i.m8056c(i28));
        }
        int i29 = m21.f18055G5;
        if (m5025i.m8040s(i29)) {
            setHintTextColor(m5025i.m8056c(i29));
        }
        int i30 = m21.f18275k5;
        if (m5025i.m8040s(i30)) {
            setCounterTextColor(m5025i.m8056c(i30));
        }
        int i31 = m21.f18259i5;
        if (m5025i.m8040s(i31)) {
            setCounterOverflowTextColor(m5025i.m8056c(i31));
        }
        int i32 = m21.f18111O5;
        if (m5025i.m8040s(i32)) {
            setPlaceholderTextColor(m5025i.m8056c(i32));
        }
        int i33 = m21.f18132R5;
        if (m5025i.m8040s(i33)) {
            setPrefixTextColor(m5025i.m8056c(i33));
        }
        int i34 = m21.f18188Z5;
        if (m5025i.m8040s(i34)) {
            setSuffixTextColor(m5025i.m8056c(i34));
        }
        setCounterEnabled(m8058a3);
        setEnabled(m5025i.m8058a(m21.f18131R4, true));
        m5025i.m8036w();
        xs1.m4773B0(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            xs1.m4771C0(this, 1);
        }
    }

    /* renamed from: U */
    public static void m294U(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m294U((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: b0 */
    public static void m285b0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean m4747Q = xs1.m4747Q(checkableImageButton);
        boolean z = false;
        boolean z2 = onLongClickListener != null;
        z = (m4747Q || z2) ? true : true;
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(m4747Q);
        checkableImageButton.setPressable(m4747Q);
        checkableImageButton.setLongClickable(z2);
        xs1.m4773B0(checkableImageButton, z ? 1 : 2);
    }

    /* renamed from: c0 */
    public static void m283c0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m285b0(checkableImageButton, onLongClickListener);
    }

    /* renamed from: d0 */
    public static void m281d0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m285b0(checkableImageButton, onLongClickListener);
    }

    private AbstractC1229ex getEndIconDelegate() {
        AbstractC1229ex abstractC1229ex = this.f37734s0.get(this.f37732r0);
        return abstractC1229ex != null ? abstractC1229ex : this.f37734s0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f37674E0.getVisibility() == 0) {
            return this.f37674E0;
        }
        if (m306I() && m304K()) {
            return this.f37736t0;
        }
        return null;
    }

    /* renamed from: o0 */
    public static void m259o0(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? h21.character_counter_overflowed_content_description : h21.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    private void setEditText(EditText editText) {
        if (this.f37735t != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.f37732r0 != 3) {
            boolean z = editText instanceof TextInputEditText;
        }
        this.f37735t = editText;
        m296S();
        setTextInputAccessibilityDelegate(new C4122e(this));
        this.f37702S0.m21687b0(this.f37735t.getTypeface());
        this.f37702S0.m21697T(this.f37735t.getTextSize());
        int gravity = this.f37735t.getGravity();
        this.f37702S0.m21705L((gravity & (-113)) | 48);
        this.f37702S0.m21698S(gravity);
        this.f37735t.addTextChangedListener(new C4118a());
        if (this.f37678G0 == null) {
            this.f37678G0 = this.f37735t.getHintTextColors();
        }
        if (this.f37691N) {
            if (TextUtils.isEmpty(this.f37693O)) {
                CharSequence hint = this.f37735t.getHint();
                this.f37737u = hint;
                setHint(hint);
                this.f37735t.setHint((CharSequence) null);
            }
            this.f37695P = true;
        }
        if (this.f37747z != null) {
            m261n0(this.f37735t.getText().length());
        }
        m253r0();
        this.f37739v.m10407e();
        this.f37729q.bringToFront();
        this.f37731r.bringToFront();
        this.f37733s.bringToFront();
        this.f37674E0.bringToFront();
        m317B();
        m237z0();
        m314C0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m245v0(false, true);
    }

    private void setErrorIconVisible(boolean z) {
        this.f37674E0.setVisibility(z ? 0 : 8);
        this.f37733s.setVisibility(z ? 8 : 0);
        m314C0();
        if (m306I()) {
            return;
        }
        m255q0();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f37693O)) {
            return;
        }
        this.f37693O = charSequence;
        this.f37702S0.m21691Z(charSequence);
        if (this.f37700R0) {
            return;
        }
        m295T();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f37671D == z) {
            return;
        }
        if (z) {
            C3397w4 c3397w4 = new C3397w4(getContext());
            this.f37673E = c3397w4;
            c3397w4.setId(m11.textinput_placeholder);
            xs1.m4698t0(this.f37673E, 1);
            setPlaceholderTextAppearance(this.f37677G);
            setPlaceholderTextColor(this.f37675F);
            m276g();
        } else {
            m289Z();
            this.f37673E = null;
        }
        this.f37671D = z;
    }

    /* renamed from: A */
    public final boolean m319A() {
        return this.f37691N && !TextUtils.isEmpty(this.f37693O) && (this.f37697Q instanceof C2873ro);
    }

    /* renamed from: A0 */
    public final void m318A0() {
        this.f37685K.setVisibility((this.f37683J == null || m301N()) ? 8 : 0);
        m255q0();
    }

    /* renamed from: B */
    public final void m317B() {
        Iterator<InterfaceC4123f> it = this.f37730q0.iterator();
        while (it.hasNext()) {
            it.next().mo185a(this);
        }
    }

    /* renamed from: B0 */
    public final void m316B0(boolean z, boolean z2) {
        int defaultColor = this.f37688L0.getDefaultColor();
        int colorForState = this.f37688L0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f37688L0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f37714c0 = colorForState2;
        } else if (z2) {
            this.f37714c0 = colorForState;
        } else {
            this.f37714c0 = defaultColor;
        }
    }

    /* renamed from: C */
    public final void m315C(int i) {
        Iterator<InterfaceC4124g> it = this.f37738u0.iterator();
        while (it.hasNext()) {
            it.next().mo184a(this, i);
        }
    }

    /* renamed from: C0 */
    public final void m314C0() {
        if (this.f37735t == null) {
            return;
        }
        xs1.m4767E0(this.f37689M, getContext().getResources().getDimensionPixelSize(f11.material_input_text_to_prefix_suffix_padding), this.f37735t.getPaddingTop(), (m304K() || m303L()) ? 0 : xs1.m4760I(this.f37735t), this.f37735t.getPaddingBottom());
    }

    /* renamed from: D */
    public final void m313D(Canvas canvas) {
        nn0 nn0Var = this.f37699R;
        if (nn0Var != null) {
            Rect bounds = nn0Var.getBounds();
            bounds.top = bounds.bottom - this.f37709W;
            this.f37699R.draw(canvas);
        }
    }

    /* renamed from: D0 */
    public final void m312D0() {
        int visibility = this.f37689M.getVisibility();
        boolean z = (this.f37687L == null || m301N()) ? false : true;
        this.f37689M.setVisibility(z ? 0 : 8);
        if (visibility != this.f37689M.getVisibility()) {
            getEndIconDelegate().mo233c(z);
        }
        m255q0();
    }

    /* renamed from: E */
    public final void m311E(Canvas canvas) {
        if (this.f37691N) {
            this.f37702S0.m21678j(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be  */
    /* renamed from: E0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m310E0() {
        int i;
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f37697Q == null || this.f37705U == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f37735t) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.f37735t) != null && editText.isHovered());
        if (isEnabled()) {
            if (this.f37739v.m10401k()) {
                if (this.f37688L0 == null) {
                    i = this.f37739v.m10397o();
                }
                m316B0(z2, z3);
            } else if (!this.f37745y || (textView = this.f37747z) == null) {
                i = z2 ? this.f37686K0 : z3 ? this.f37684J0 : this.f37682I0;
            } else {
                if (this.f37688L0 == null) {
                    i = textView.getCurrentTextColor();
                }
                m316B0(z2, z3);
            }
            if (getErrorIconDrawable() != null && this.f37739v.m10388x() && this.f37739v.m10401k()) {
                z = true;
            }
            setErrorIconVisible(z);
            m292W();
            m290Y();
            m293V();
            if (getEndIconDelegate().mo214d()) {
                m269j0(this.f37739v.m10401k());
            }
            this.f37709W = (z2 || !isEnabled()) ? this.f37712a0 : this.f37713b0;
            if (this.f37705U == 1) {
                this.f37715d0 = !isEnabled() ? this.f37692N0 : (!z3 || z2) ? z2 ? this.f37694O0 : this.f37690M0 : this.f37696P0;
            }
            m270j();
        }
        i = this.f37698Q0;
        this.f37714c0 = i;
        if (getErrorIconDrawable() != null) {
            z = true;
        }
        setErrorIconVisible(z);
        m292W();
        m290Y();
        m293V();
        if (getEndIconDelegate().mo214d()) {
        }
        this.f37709W = (z2 || !isEnabled()) ? this.f37712a0 : this.f37713b0;
        if (this.f37705U == 1) {
        }
        m270j();
    }

    /* renamed from: F */
    public final void m309F(boolean z) {
        ValueAnimator valueAnimator = this.f37708V0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f37708V0.cancel();
        }
        if (z && this.f37706U0) {
            m272i(0.0f);
        } else {
            this.f37702S0.m21695V(0.0f);
        }
        if (m319A() && ((C2873ro) this.f37697Q).m11134i0()) {
            m240y();
        }
        this.f37700R0 = true;
        m305J();
        m318A0();
        m312D0();
    }

    /* renamed from: G */
    public final int m308G(int i, boolean z) {
        int compoundPaddingLeft = i + this.f37735t.getCompoundPaddingLeft();
        return (this.f37683J == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.f37685K.getMeasuredWidth()) + this.f37685K.getPaddingLeft();
    }

    /* renamed from: H */
    public final int m307H(int i, boolean z) {
        int compoundPaddingRight = i - this.f37735t.getCompoundPaddingRight();
        return (this.f37683J == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.f37685K.getMeasuredWidth() - this.f37685K.getPaddingRight());
    }

    /* renamed from: I */
    public final boolean m306I() {
        return this.f37732r0 != 0;
    }

    /* renamed from: J */
    public final void m305J() {
        TextView textView = this.f37673E;
        if (textView == null || !this.f37671D) {
            return;
        }
        textView.setText((CharSequence) null);
        this.f37673E.setVisibility(4);
    }

    /* renamed from: K */
    public boolean m304K() {
        return this.f37733s.getVisibility() == 0 && this.f37736t0.getVisibility() == 0;
    }

    /* renamed from: L */
    public final boolean m303L() {
        return this.f37674E0.getVisibility() == 0;
    }

    /* renamed from: M */
    public boolean m302M() {
        return this.f37739v.m10387y();
    }

    /* renamed from: N */
    public final boolean m301N() {
        return this.f37700R0;
    }

    /* renamed from: O */
    public boolean m300O() {
        return this.f37695P;
    }

    /* renamed from: P */
    public final boolean m299P() {
        return this.f37705U == 1 && this.f37735t.getMinLines() <= 1;
    }

    /* renamed from: Q */
    public boolean m298Q() {
        return this.f37720i0.getVisibility() == 0;
    }

    /* renamed from: R */
    public final int[] m297R(CheckableImageButton checkableImageButton) {
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    /* renamed from: S */
    public final void m296S() {
        m258p();
        m287a0();
        m310E0();
        m267k0();
        m274h();
        if (this.f37705U != 0) {
            m249t0();
        }
    }

    /* renamed from: T */
    public final void m295T() {
        if (m319A()) {
            RectF rectF = this.f37718g0;
            this.f37702S0.m21675m(rectF, this.f37735t.getWidth(), this.f37735t.getGravity());
            m266l(rectF);
            rectF.offset(-getPaddingLeft(), -getPaddingTop());
            ((C2873ro) this.f37697Q).m11128o0(rectF);
        }
    }

    /* renamed from: V */
    public void m293V() {
        m291X(this.f37736t0, this.f37740v0);
    }

    /* renamed from: W */
    public void m292W() {
        m291X(this.f37674E0, this.f37676F0);
    }

    /* renamed from: X */
    public final void m291X(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(m297R(checkableImageButton), colorStateList.getDefaultColor());
        Drawable mutate = C2366nu.m14809r(drawable).mutate();
        C2366nu.m14812o(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    /* renamed from: Y */
    public void m290Y() {
        m291X(this.f37720i0, this.f37721j0);
    }

    /* renamed from: Z */
    public final void m289Z() {
        TextView textView = this.f37673E;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: a0 */
    public final void m287a0() {
        if (m273h0()) {
            xs1.m4694v0(this.f37735t, this.f37697Q);
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
        this.f37727p.addView(view, layoutParams2);
        this.f37727p.setLayoutParams(layoutParams);
        m249t0();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f37735t;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f37737u != null) {
            boolean z = this.f37695P;
            this.f37695P = false;
            CharSequence hint = editText.getHint();
            this.f37735t.setHint(this.f37737u);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f37735t.setHint(hint);
                this.f37695P = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.f37727p.getChildCount());
        for (int i2 = 0; i2 < this.f37727p.getChildCount(); i2++) {
            View childAt = this.f37727p.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.f37735t) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f37711X0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f37711X0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        m311E(canvas);
        m313D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f37710W0) {
            return;
        }
        boolean z = true;
        this.f37710W0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C1398gg c1398gg = this.f37702S0;
        boolean m21692Y = c1398gg != null ? c1398gg.m21692Y(drawableState) | false : false;
        if (this.f37735t != null) {
            m247u0((xs1.m4742V(this) && isEnabled()) ? false : false);
        }
        m253r0();
        m310E0();
        if (m21692Y) {
            invalidate();
        }
        this.f37710W0 = false;
    }

    /* renamed from: e */
    public void m280e(InterfaceC4123f interfaceC4123f) {
        this.f37730q0.add(interfaceC4123f);
        if (this.f37735t != null) {
            interfaceC4123f.mo185a(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L8;
     */
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m279e0(TextView textView, int i) {
        boolean z = true;
        try {
            sk1.m10260n(textView, i);
            if (Build.VERSION.SDK_INT >= 23) {
            }
            z = false;
        } catch (Exception unused) {
        }
        if (z) {
            sk1.m10260n(textView, k21.TextAppearance_AppCompat_Caption);
            textView.setTextColor(C3866zk.m2180c(getContext(), a11.design_error));
        }
    }

    /* renamed from: f */
    public void m278f(InterfaceC4124g interfaceC4124g) {
        this.f37738u0.add(interfaceC4124g);
    }

    /* renamed from: f0 */
    public final boolean m277f0() {
        return (this.f37674E0.getVisibility() == 0 || ((m306I() && m304K()) || this.f37687L != null)) && this.f37731r.getMeasuredWidth() > 0;
    }

    /* renamed from: g */
    public final void m276g() {
        TextView textView = this.f37673E;
        if (textView != null) {
            this.f37727p.addView(textView);
            this.f37673E.setVisibility(0);
        }
    }

    /* renamed from: g0 */
    public final boolean m275g0() {
        return !(getStartIconDrawable() == null && this.f37683J == null) && this.f37729q.getMeasuredWidth() > 0;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f37735t;
        return editText != null ? editText.getBaseline() + getPaddingTop() + m246v() : super.getBaseline();
    }

    public nn0 getBoxBackground() {
        int i = this.f37705U;
        if (i == 1 || i == 2) {
            return this.f37697Q;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f37715d0;
    }

    public int getBoxBackgroundMode() {
        return this.f37705U;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f37697Q.m14968s();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f37697Q.m14967t();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f37697Q.m15013G();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f37697Q.m15014F();
    }

    public int getBoxStrokeColor() {
        return this.f37686K0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f37688L0;
    }

    public int getBoxStrokeWidth() {
        return this.f37712a0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f37713b0;
    }

    public int getCounterMaxLength() {
        return this.f37743x;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f37741w && this.f37745y && (textView = this.f37747z) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f37679H;
    }

    public ColorStateList getCounterTextColor() {
        return this.f37679H;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f37678G0;
    }

    public EditText getEditText() {
        return this.f37735t;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f37736t0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f37736t0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f37732r0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f37736t0;
    }

    public CharSequence getError() {
        if (this.f37739v.m10388x()) {
            return this.f37739v.m10398n();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f37739v.m10399m();
    }

    public int getErrorCurrentTextColors() {
        return this.f37739v.m10397o();
    }

    public Drawable getErrorIconDrawable() {
        return this.f37674E0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.f37739v.m10397o();
    }

    public CharSequence getHelperText() {
        if (this.f37739v.m10387y()) {
            return this.f37739v.m10395q();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f37739v.m10394r();
    }

    public CharSequence getHint() {
        if (this.f37691N) {
            return this.f37693O;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f37702S0.m21673o();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f37702S0.m21670r();
    }

    public ColorStateList getHintTextColor() {
        return this.f37680H0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f37736t0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f37736t0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f37671D) {
            return this.f37669C;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f37677G;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f37675F;
    }

    public CharSequence getPrefixText() {
        return this.f37683J;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f37685K.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f37685K;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f37720i0.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f37720i0.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f37687L;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f37689M.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f37689M;
    }

    public Typeface getTypeface() {
        return this.f37719h0;
    }

    /* renamed from: h */
    public final void m274h() {
        EditText editText;
        int m4758J;
        int dimensionPixelSize;
        int m4760I;
        Resources resources;
        int i;
        if (this.f37735t == null || this.f37705U != 1) {
            return;
        }
        if (mn0.m15923h(getContext())) {
            editText = this.f37735t;
            m4758J = xs1.m4758J(editText);
            dimensionPixelSize = getResources().getDimensionPixelSize(f11.material_filled_edittext_font_2_0_padding_top);
            m4760I = xs1.m4760I(this.f37735t);
            resources = getResources();
            i = f11.material_filled_edittext_font_2_0_padding_bottom;
        } else if (!mn0.m15924g(getContext())) {
            return;
        } else {
            editText = this.f37735t;
            m4758J = xs1.m4758J(editText);
            dimensionPixelSize = getResources().getDimensionPixelSize(f11.material_filled_edittext_font_1_3_padding_top);
            m4760I = xs1.m4760I(this.f37735t);
            resources = getResources();
            i = f11.material_filled_edittext_font_1_3_padding_bottom;
        }
        xs1.m4767E0(editText, m4758J, dimensionPixelSize, m4760I, resources.getDimensionPixelSize(i));
    }

    /* renamed from: h0 */
    public final boolean m273h0() {
        EditText editText = this.f37735t;
        return (editText == null || this.f37697Q == null || editText.getBackground() != null || this.f37705U == 0) ? false : true;
    }

    /* renamed from: i */
    public void m272i(float f) {
        if (this.f37702S0.m21666v() == f) {
            return;
        }
        if (this.f37708V0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f37708V0 = valueAnimator;
            valueAnimator.setInterpolator(C1247f3.f9052b);
            this.f37708V0.setDuration(167L);
            this.f37708V0.addUpdateListener(new C4121d());
        }
        this.f37708V0.setFloatValues(this.f37702S0.m21666v(), f);
        this.f37708V0.start();
    }

    /* renamed from: i0 */
    public final void m271i0() {
        TextView textView = this.f37673E;
        if (textView == null || !this.f37671D) {
            return;
        }
        textView.setText(this.f37669C);
        this.f37673E.setVisibility(0);
        this.f37673E.bringToFront();
    }

    /* renamed from: j */
    public final void m270j() {
        nn0 nn0Var = this.f37697Q;
        if (nn0Var == null) {
            return;
        }
        nn0Var.setShapeAppearanceModel(this.f37701S);
        if (m244w()) {
            this.f37697Q.m14991b0(this.f37709W, this.f37714c0);
        }
        int m256q = m256q();
        this.f37715d0 = m256q;
        this.f37697Q.m14997W(ColorStateList.valueOf(m256q));
        if (this.f37732r0 == 3) {
            this.f37735t.getBackground().invalidateSelf();
        }
        m268k();
        invalidate();
    }

    /* renamed from: j0 */
    public final void m269j0(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            m264m();
            return;
        }
        Drawable mutate = C2366nu.m14809r(getEndIconDrawable()).mutate();
        C2366nu.m14813n(mutate, this.f37739v.m10397o());
        this.f37736t0.setImageDrawable(mutate);
    }

    /* renamed from: k */
    public final void m268k() {
        if (this.f37699R == null) {
            return;
        }
        if (m242x()) {
            this.f37699R.m14997W(ColorStateList.valueOf(this.f37714c0));
        }
        invalidate();
    }

    /* renamed from: k0 */
    public final void m267k0() {
        Resources resources;
        int i;
        if (this.f37705U == 1) {
            if (mn0.m15923h(getContext())) {
                resources = getResources();
                i = f11.material_font_2_0_box_collapsed_padding_top;
            } else if (!mn0.m15924g(getContext())) {
                return;
            } else {
                resources = getResources();
                i = f11.material_font_1_3_box_collapsed_padding_top;
            }
            this.f37707V = resources.getDimensionPixelSize(i);
        }
    }

    /* renamed from: l */
    public final void m266l(RectF rectF) {
        float f = rectF.left;
        int i = this.f37703T;
        rectF.left = f - i;
        rectF.top -= i;
        rectF.right += i;
        rectF.bottom += i;
    }

    /* renamed from: l0 */
    public final void m265l0(Rect rect) {
        nn0 nn0Var = this.f37699R;
        if (nn0Var != null) {
            int i = rect.bottom;
            nn0Var.setBounds(rect.left, i - this.f37713b0, rect.right, i);
        }
    }

    /* renamed from: m */
    public final void m264m() {
        m262n(this.f37736t0, this.f37742w0, this.f37740v0, this.f37746y0, this.f37744x0);
    }

    /* renamed from: m0 */
    public final void m263m0() {
        if (this.f37747z != null) {
            EditText editText = this.f37735t;
            m261n0(editText == null ? 0 : editText.getText().length());
        }
    }

    /* renamed from: n */
    public final void m262n(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = C2366nu.m14809r(drawable).mutate();
            if (z) {
                C2366nu.m14812o(drawable, colorStateList);
            }
            if (z2) {
                C2366nu.m14811p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: n0 */
    public void m261n0(int i) {
        boolean z = this.f37745y;
        int i2 = this.f37743x;
        if (i2 == -1) {
            this.f37747z.setText(String.valueOf(i));
            this.f37747z.setContentDescription(null);
            this.f37745y = false;
        } else {
            this.f37745y = i > i2;
            m259o0(getContext(), this.f37747z, i, this.f37743x, this.f37745y);
            if (z != this.f37745y) {
                m257p0();
            }
            this.f37747z.setText(C2533pb.m13528c().m13521j(getContext().getString(h21.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.f37743x))));
        }
        if (this.f37735t == null || z == this.f37745y) {
            return;
        }
        m247u0(false);
        m310E0();
        m253r0();
    }

    /* renamed from: o */
    public final void m260o() {
        m262n(this.f37720i0, this.f37722k0, this.f37721j0, this.f37724m0, this.f37723l0);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f37735t;
        if (editText != null) {
            Rect rect = this.f37716e0;
            C1753it.m19438a(this, editText, rect);
            m265l0(rect);
            if (this.f37691N) {
                this.f37702S0.m21697T(this.f37735t.getTextSize());
                int gravity = this.f37735t.getGravity();
                this.f37702S0.m21705L((gravity & (-113)) | 48);
                this.f37702S0.m21698S(gravity);
                this.f37702S0.m21709H(m254r(rect));
                this.f37702S0.m21701P(m248u(rect));
                this.f37702S0.m21712E();
                if (!m319A() || this.f37700R0) {
                    return;
                }
                m295T();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean m251s0 = m251s0();
        boolean m255q0 = m255q0();
        if (m251s0 || m255q0) {
            this.f37735t.post(new RunnableC4120c());
        }
        m243w0();
        m237z0();
        m314C0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m29657a());
        setError(savedState.f37749r);
        if (savedState.f37750s) {
            this.f37736t0.post(new RunnableC4119b());
        }
        setHint(savedState.f37751t);
        setHelperText(savedState.f37752u);
        setPlaceholderText(savedState.f37753v);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f37739v.m10401k()) {
            savedState.f37749r = getError();
        }
        savedState.f37750s = m306I() && this.f37736t0.isChecked();
        savedState.f37751t = getHint();
        savedState.f37752u = getHelperText();
        savedState.f37753v = getPlaceholderText();
        return savedState;
    }

    /* renamed from: p */
    public final void m258p() {
        int i = this.f37705U;
        if (i == 0) {
            this.f37697Q = null;
        } else if (i == 1) {
            this.f37697Q = new nn0(this.f37701S);
            this.f37699R = new nn0();
            return;
        } else if (i != 2) {
            throw new IllegalArgumentException(this.f37705U + " is illegal; only @BoxBackgroundMode constants are supported.");
        } else {
            this.f37697Q = (!this.f37691N || (this.f37697Q instanceof C2873ro)) ? new nn0(this.f37701S) : new C2873ro(this.f37701S);
        }
        this.f37699R = null;
    }

    /* renamed from: p0 */
    public final void m257p0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f37747z;
        if (textView != null) {
            m279e0(textView, this.f37745y ? this.f37665A : this.f37667B);
            if (!this.f37745y && (colorStateList2 = this.f37679H) != null) {
                this.f37747z.setTextColor(colorStateList2);
            }
            if (!this.f37745y || (colorStateList = this.f37681I) == null) {
                return;
            }
            this.f37747z.setTextColor(colorStateList);
        }
    }

    /* renamed from: q */
    public final int m256q() {
        return this.f37705U == 1 ? jn0.m18394e(jn0.m18395d(this, w01.colorSurface, 0), this.f37715d0) : this.f37715d0;
    }

    /* renamed from: q0 */
    public final boolean m255q0() {
        boolean z;
        if (this.f37735t == null) {
            return false;
        }
        boolean z2 = true;
        if (m275g0()) {
            int measuredWidth = this.f37729q.getMeasuredWidth() - this.f37735t.getPaddingLeft();
            if (this.f37725n0 == null || this.f37726o0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f37725n0 = colorDrawable;
                this.f37726o0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] m10273a = sk1.m10273a(this.f37735t);
            Drawable drawable = m10273a[0];
            Drawable drawable2 = this.f37725n0;
            if (drawable != drawable2) {
                sk1.m10265i(this.f37735t, drawable2, m10273a[1], m10273a[2], m10273a[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.f37725n0 != null) {
                Drawable[] m10273a2 = sk1.m10273a(this.f37735t);
                sk1.m10265i(this.f37735t, null, m10273a2[1], m10273a2[2], m10273a2[3]);
                this.f37725n0 = null;
                z = true;
            }
            z = false;
        }
        if (m277f0()) {
            int measuredWidth2 = this.f37689M.getMeasuredWidth() - this.f37735t.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + cn0.m25226b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] m10273a3 = sk1.m10273a(this.f37735t);
            Drawable drawable3 = this.f37748z0;
            if (drawable3 == null || this.f37666A0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f37748z0 = colorDrawable2;
                    this.f37666A0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = m10273a3[2];
                Drawable drawable5 = this.f37748z0;
                if (drawable4 != drawable5) {
                    this.f37668B0 = m10273a3[2];
                    sk1.m10265i(this.f37735t, m10273a3[0], m10273a3[1], drawable5, m10273a3[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.f37666A0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                sk1.m10265i(this.f37735t, m10273a3[0], m10273a3[1], this.f37748z0, m10273a3[3]);
            }
        } else if (this.f37748z0 == null) {
            return z;
        } else {
            Drawable[] m10273a4 = sk1.m10273a(this.f37735t);
            if (m10273a4[2] == this.f37748z0) {
                sk1.m10265i(this.f37735t, m10273a4[0], m10273a4[1], this.f37668B0, m10273a4[3]);
            } else {
                z2 = z;
            }
            this.f37748z0 = null;
        }
        return z2;
    }

    /* renamed from: r */
    public final Rect m254r(Rect rect) {
        int i;
        int i2;
        if (this.f37735t != null) {
            Rect rect2 = this.f37717f0;
            boolean z = xs1.m4768E(this) == 1;
            rect2.bottom = rect.bottom;
            int i3 = this.f37705U;
            if (i3 == 1) {
                rect2.left = m308G(rect.left, z);
                i = rect.top + this.f37707V;
            } else if (i3 == 2) {
                rect2.left = rect.left + this.f37735t.getPaddingLeft();
                rect2.top = rect.top - m246v();
                i2 = rect.right - this.f37735t.getPaddingRight();
                rect2.right = i2;
                return rect2;
            } else {
                rect2.left = m308G(rect.left, z);
                i = getPaddingTop();
            }
            rect2.top = i;
            i2 = m307H(rect.right, z);
            rect2.right = i2;
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: r0 */
    public void m253r0() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f37735t;
        if (editText == null || this.f37705U != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (C3373vu.m6789a(background)) {
            background = background.mutate();
        }
        if (this.f37739v.m10401k()) {
            currentTextColor = this.f37739v.m10397o();
        } else if (!this.f37745y || (textView = this.f37747z) == null) {
            C2366nu.m14824c(background);
            this.f37735t.refreshDrawableState();
            return;
        } else {
            currentTextColor = textView.getCurrentTextColor();
        }
        background.setColorFilter(C1046d4.m24710e(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: s */
    public final int m252s(Rect rect, Rect rect2, float f) {
        return m299P() ? (int) (rect2.top + f) : rect.bottom - this.f37735t.getCompoundPaddingBottom();
    }

    /* renamed from: s0 */
    public final boolean m251s0() {
        int max;
        if (this.f37735t != null && this.f37735t.getMeasuredHeight() < (max = Math.max(this.f37731r.getMeasuredHeight(), this.f37729q.getMeasuredHeight()))) {
            this.f37735t.setMinimumHeight(max);
            return true;
        }
        return false;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f37715d0 != i) {
            this.f37715d0 = i;
            this.f37690M0 = i;
            this.f37694O0 = i;
            this.f37696P0 = i;
            m270j();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C3866zk.m2180c(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f37690M0 = defaultColor;
        this.f37715d0 = defaultColor;
        this.f37692N0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f37694O0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f37696P0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        m270j();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f37705U) {
            return;
        }
        this.f37705U = i;
        if (this.f37735t != null) {
            m296S();
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.f37686K0 != i) {
            this.f37686K0 = i;
            m310E0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.f37686K0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            m310E0();
        }
        this.f37682I0 = colorStateList.getDefaultColor();
        this.f37698Q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f37684J0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f37686K0 = defaultColor;
        m310E0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f37688L0 != colorStateList) {
            this.f37688L0 = colorStateList;
            m310E0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f37712a0 = i;
        m310E0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f37713b0 = i;
        m310E0();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f37741w != z) {
            if (z) {
                C3397w4 c3397w4 = new C3397w4(getContext());
                this.f37747z = c3397w4;
                c3397w4.setId(m11.textinput_counter);
                Typeface typeface = this.f37719h0;
                if (typeface != null) {
                    this.f37747z.setTypeface(typeface);
                }
                this.f37747z.setMaxLines(1);
                this.f37739v.m10408d(this.f37747z, 2);
                cn0.m25224d((ViewGroup.MarginLayoutParams) this.f37747z.getLayoutParams(), getResources().getDimensionPixelOffset(f11.mtrl_textinput_counter_margin_start));
                m257p0();
                m263m0();
            } else {
                this.f37739v.m10386z(this.f37747z, 2);
                this.f37747z = null;
            }
            this.f37741w = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f37743x != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f37743x = i;
            if (this.f37741w) {
                m263m0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f37665A != i) {
            this.f37665A = i;
            m257p0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f37681I != colorStateList) {
            this.f37681I = colorStateList;
            m257p0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f37667B != i) {
            this.f37667B = i;
            m257p0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f37679H != colorStateList) {
            this.f37679H = colorStateList;
            m257p0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f37678G0 = colorStateList;
        this.f37680H0 = colorStateList;
        if (this.f37735t != null) {
            m247u0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m294U(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f37736t0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f37736t0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f37736t0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C2818r4.m11783b(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f37736t0.setImageDrawable(drawable);
        m293V();
    }

    public void setEndIconMode(int i) {
        int i2 = this.f37732r0;
        this.f37732r0 = i;
        m315C(i2);
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().mo215b(this.f37705U)) {
            getEndIconDelegate().mo190a();
            m264m();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f37705U + " is not supported by the end icon mode " + i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m283c0(this.f37736t0, onClickListener, this.f37670C0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f37670C0 = onLongClickListener;
        m281d0(this.f37736t0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f37740v0 != colorStateList) {
            this.f37740v0 = colorStateList;
            this.f37742w0 = true;
            m264m();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f37744x0 != mode) {
            this.f37744x0 = mode;
            this.f37746y0 = true;
            m264m();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (m304K() != z) {
            this.f37736t0.setVisibility(z ? 0 : 8);
            m314C0();
            m255q0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f37739v.m10388x()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f37739v.m10392t();
        } else {
            this.f37739v.m10414M(charSequence);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f37739v.m10425B(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f37739v.m10424C(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C2818r4.m11783b(getContext(), i) : null);
        m292W();
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f37674E0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f37739v.m10388x());
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        m283c0(this.f37674E0, onClickListener, this.f37672D0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f37672D0 = onLongClickListener;
        m281d0(this.f37674E0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f37676F0 = colorStateList;
        Drawable drawable = this.f37674E0.getDrawable();
        if (drawable != null) {
            drawable = C2366nu.m14809r(drawable).mutate();
            C2366nu.m14812o(drawable, colorStateList);
        }
        if (this.f37674E0.getDrawable() != drawable) {
            this.f37674E0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f37674E0.getDrawable();
        if (drawable != null) {
            drawable = C2366nu.m14809r(drawable).mutate();
            C2366nu.m14811p(drawable, mode);
        }
        if (this.f37674E0.getDrawable() != drawable) {
            this.f37674E0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.f37739v.m10423D(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f37739v.m10422E(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f37704T0 != z) {
            this.f37704T0 = z;
            m247u0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (m302M()) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!m302M()) {
            setHelperTextEnabled(true);
        }
        this.f37739v.m10413N(charSequence);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f37739v.m10419H(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f37739v.m10420G(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f37739v.m10421F(i);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f37691N) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f37706U0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f37691N) {
            this.f37691N = z;
            if (z) {
                CharSequence hint = this.f37735t.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f37693O)) {
                        setHint(hint);
                    }
                    this.f37735t.setHint((CharSequence) null);
                }
                this.f37695P = true;
            } else {
                this.f37695P = false;
                if (!TextUtils.isEmpty(this.f37693O) && TextUtils.isEmpty(this.f37735t.getHint())) {
                    this.f37735t.setHint(this.f37693O);
                }
                setHintInternal(null);
            }
            if (this.f37735t != null) {
                m249t0();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f37702S0.m21708I(i);
        this.f37680H0 = this.f37702S0.m21674n();
        if (this.f37735t != null) {
            m247u0(false);
            m249t0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f37680H0 != colorStateList) {
            if (this.f37678G0 == null) {
                this.f37702S0.m21706K(colorStateList);
            }
            this.f37680H0 = colorStateList;
            if (this.f37735t != null) {
                m247u0(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f37736t0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C2818r4.m11783b(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f37736t0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f37732r0 != 1) {
            setEndIconMode(1);
        } else if (z) {
        } else {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f37740v0 = colorStateList;
        this.f37742w0 = true;
        m264m();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f37744x0 = mode;
        this.f37746y0 = true;
        m264m();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f37671D && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f37671D) {
                setPlaceholderTextEnabled(true);
            }
            this.f37669C = charSequence;
        }
        m241x0();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f37677G = i;
        TextView textView = this.f37673E;
        if (textView != null) {
            sk1.m10260n(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f37675F != colorStateList) {
            this.f37675F = colorStateList;
            TextView textView = this.f37673E;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f37683J = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f37685K.setText(charSequence);
        m318A0();
    }

    public void setPrefixTextAppearance(int i) {
        sk1.m10260n(this.f37685K, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f37685K.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f37720i0.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f37720i0.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C2818r4.m11783b(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f37720i0.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            m290Y();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        m283c0(this.f37720i0, onClickListener, this.f37728p0);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f37728p0 = onLongClickListener;
        m281d0(this.f37720i0, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f37721j0 != colorStateList) {
            this.f37721j0 = colorStateList;
            this.f37722k0 = true;
            m260o();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f37723l0 != mode) {
            this.f37723l0 = mode;
            this.f37724m0 = true;
            m260o();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (m298Q() != z) {
            this.f37720i0.setVisibility(z ? 0 : 8);
            m237z0();
            m255q0();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f37687L = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f37689M.setText(charSequence);
        m312D0();
    }

    public void setSuffixTextAppearance(int i) {
        sk1.m10260n(this.f37689M, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f37689M.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C4122e c4122e) {
        EditText editText = this.f37735t;
        if (editText != null) {
            xs1.m4702r0(editText, c4122e);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f37719h0) {
            this.f37719h0 = typeface;
            this.f37702S0.m21687b0(typeface);
            this.f37739v.m10417J(typeface);
            TextView textView = this.f37747z;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* renamed from: t */
    public final int m250t(Rect rect, float f) {
        return m299P() ? (int) (rect.centerY() - (f / 2.0f)) : rect.top + this.f37735t.getCompoundPaddingTop();
    }

    /* renamed from: t0 */
    public final void m249t0() {
        if (this.f37705U != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f37727p.getLayoutParams();
            int m246v = m246v();
            if (m246v != layoutParams.topMargin) {
                layoutParams.topMargin = m246v;
                this.f37727p.requestLayout();
            }
        }
    }

    /* renamed from: u */
    public final Rect m248u(Rect rect) {
        if (this.f37735t != null) {
            Rect rect2 = this.f37717f0;
            float m21667u = this.f37702S0.m21667u();
            rect2.left = rect.left + this.f37735t.getCompoundPaddingLeft();
            rect2.top = m250t(rect, m21667u);
            rect2.right = rect.right - this.f37735t.getCompoundPaddingRight();
            rect2.bottom = m252s(rect, rect2, m21667u);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: u0 */
    public void m247u0(boolean z) {
        m245v0(z, false);
    }

    /* renamed from: v */
    public final int m246v() {
        float m21673o;
        if (this.f37691N) {
            int i = this.f37705U;
            if (i == 0 || i == 1) {
                m21673o = this.f37702S0.m21673o();
            } else if (i != 2) {
                return 0;
            } else {
                m21673o = this.f37702S0.m21673o() / 2.0f;
            }
            return (int) m21673o;
        }
        return 0;
    }

    /* renamed from: v0 */
    public final void m245v0(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C1398gg c1398gg;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f37735t;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f37735t;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean m10401k = this.f37739v.m10401k();
        ColorStateList colorStateList2 = this.f37678G0;
        if (colorStateList2 != null) {
            this.f37702S0.m21706K(colorStateList2);
            this.f37702S0.m21699R(this.f37678G0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f37678G0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f37698Q0) : this.f37698Q0;
            this.f37702S0.m21706K(ColorStateList.valueOf(colorForState));
            this.f37702S0.m21699R(ColorStateList.valueOf(colorForState));
        } else if (m10401k) {
            this.f37702S0.m21706K(this.f37739v.m10396p());
        } else {
            if (this.f37745y && (textView = this.f37747z) != null) {
                c1398gg = this.f37702S0;
                colorStateList = textView.getTextColors();
            } else if (z4 && (colorStateList = this.f37680H0) != null) {
                c1398gg = this.f37702S0;
            }
            c1398gg.m21706K(colorStateList);
        }
        if (z3 || !this.f37704T0 || (isEnabled() && z4)) {
            if (z2 || this.f37700R0) {
                m238z(z);
            }
        } else if (z2 || !this.f37700R0) {
            m309F(z);
        }
    }

    /* renamed from: w */
    public final boolean m244w() {
        return this.f37705U == 2 && m242x();
    }

    /* renamed from: w0 */
    public final void m243w0() {
        EditText editText;
        if (this.f37673E == null || (editText = this.f37735t) == null) {
            return;
        }
        this.f37673E.setGravity(editText.getGravity());
        this.f37673E.setPadding(this.f37735t.getCompoundPaddingLeft(), this.f37735t.getCompoundPaddingTop(), this.f37735t.getCompoundPaddingRight(), this.f37735t.getCompoundPaddingBottom());
    }

    /* renamed from: x */
    public final boolean m242x() {
        return this.f37709W > -1 && this.f37714c0 != 0;
    }

    /* renamed from: x0 */
    public final void m241x0() {
        EditText editText = this.f37735t;
        m239y0(editText == null ? 0 : editText.getText().length());
    }

    /* renamed from: y */
    public final void m240y() {
        if (m319A()) {
            ((C2873ro) this.f37697Q).m11131l0();
        }
    }

    /* renamed from: y0 */
    public final void m239y0(int i) {
        if (i != 0 || this.f37700R0) {
            m305J();
        } else {
            m271i0();
        }
    }

    /* renamed from: z */
    public final void m238z(boolean z) {
        ValueAnimator valueAnimator = this.f37708V0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f37708V0.cancel();
        }
        if (z && this.f37706U0) {
            m272i(1.0f);
        } else {
            this.f37702S0.m21695V(1.0f);
        }
        this.f37700R0 = false;
        if (m319A()) {
            m295T();
        }
        m241x0();
        m318A0();
        m312D0();
    }

    /* renamed from: z0 */
    public final void m237z0() {
        if (this.f37735t == null) {
            return;
        }
        xs1.m4767E0(this.f37685K, m298Q() ? 0 : xs1.m4758J(this.f37735t), this.f37735t.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(f11.material_input_text_to_prefix_suffix_padding), this.f37735t.getCompoundPaddingBottom());
    }
}
