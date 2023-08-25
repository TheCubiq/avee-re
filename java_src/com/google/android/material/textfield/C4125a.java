package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.daaw.AbstractC1229ex;
import com.daaw.C1247f3;
import com.daaw.C2818r4;
import com.daaw.h21;
import com.daaw.j11;
import com.google.android.material.textfield.TextInputLayout;
/* renamed from: com.google.android.material.textfield.a */
/* loaded from: classes2.dex */
public class C4125a extends AbstractC1229ex {

    /* renamed from: d */
    public final TextWatcher f37759d;

    /* renamed from: e */
    public final View.OnFocusChangeListener f37760e;

    /* renamed from: f */
    public final TextInputLayout.InterfaceC4123f f37761f;

    /* renamed from: g */
    public final TextInputLayout.InterfaceC4124g f37762g;

    /* renamed from: h */
    public AnimatorSet f37763h;

    /* renamed from: i */
    public ValueAnimator f37764i;

    /* renamed from: com.google.android.material.textfield.a$a */
    /* loaded from: classes2.dex */
    public class C4126a implements TextWatcher {
        public C4126a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (C4125a.this.f8888a.getSuffixText() != null) {
                return;
            }
            C4125a.this.m228i(C4125a.m225l(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    /* loaded from: classes2.dex */
    public class View$OnFocusChangeListenerC4127b implements View.OnFocusChangeListener {
        public View$OnFocusChangeListenerC4127b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            boolean z2 = true;
            C4125a.this.m228i(((TextUtils.isEmpty(((EditText) view).getText()) ^ true) && z) ? false : false);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    /* loaded from: classes2.dex */
    public class C4128c implements TextInputLayout.InterfaceC4123f {
        public C4128c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4123f
        /* renamed from: a */
        public void mo185a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(editText.hasFocus() && C4125a.m225l(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(C4125a.this.f37760e);
            editText.removeTextChangedListener(C4125a.this.f37759d);
            editText.addTextChangedListener(C4125a.this.f37759d);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    /* loaded from: classes2.dex */
    public class C4129d implements TextInputLayout.InterfaceC4124g {

        /* renamed from: com.google.android.material.textfield.a$d$a */
        /* loaded from: classes2.dex */
        public class RunnableC4130a implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ EditText f37769p;

            public RunnableC4130a(EditText editText) {
                this.f37769p = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f37769p.removeTextChangedListener(C4125a.this.f37759d);
            }
        }

        public C4129d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4124g
        /* renamed from: a */
        public void mo184a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 2) {
                return;
            }
            editText.post(new RunnableC4130a(editText));
            if (editText.getOnFocusChangeListener() == C4125a.this.f37760e) {
                editText.setOnFocusChangeListener(null);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.a$e */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC4131e implements View.OnClickListener {
        public View$OnClickListenerC4131e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = C4125a.this.f8888a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            C4125a.this.f8888a.m293V();
        }
    }

    /* renamed from: com.google.android.material.textfield.a$f */
    /* loaded from: classes2.dex */
    public class C4132f extends AnimatorListenerAdapter {
        public C4132f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C4125a.this.f8888a.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$g */
    /* loaded from: classes2.dex */
    public class C4133g extends AnimatorListenerAdapter {
        public C4133g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4125a.this.f8888a.setEndIconVisible(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$h */
    /* loaded from: classes2.dex */
    public class C4134h implements ValueAnimator.AnimatorUpdateListener {
        public C4134h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C4125a.this.f8890c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.a$i */
    /* loaded from: classes2.dex */
    public class C4135i implements ValueAnimator.AnimatorUpdateListener {
        public C4135i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C4125a.this.f8890c.setScaleX(floatValue);
            C4125a.this.f8890c.setScaleY(floatValue);
        }
    }

    public C4125a(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f37759d = new C4126a();
        this.f37760e = new View$OnFocusChangeListenerC4127b();
        this.f37761f = new C4128c();
        this.f37762g = new C4129d();
    }

    /* renamed from: l */
    public static boolean m225l(Editable editable) {
        return editable.length() > 0;
    }

    @Override // com.daaw.AbstractC1229ex
    /* renamed from: a */
    public void mo190a() {
        this.f8888a.setEndIconDrawable(C2818r4.m11783b(this.f8889b, j11.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f8888a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(h21.clear_text_end_icon_content_description));
        this.f8888a.setEndIconOnClickListener(new View$OnClickListenerC4131e());
        this.f8888a.m280e(this.f37761f);
        this.f8888a.m278f(this.f37762g);
        m224m();
    }

    @Override // com.daaw.AbstractC1229ex
    /* renamed from: c */
    public void mo233c(boolean z) {
        if (this.f8888a.getSuffixText() == null) {
            return;
        }
        m228i(z);
    }

    /* renamed from: i */
    public final void m228i(boolean z) {
        boolean z2 = this.f8888a.m304K() == z;
        if (z && !this.f37763h.isRunning()) {
            this.f37764i.cancel();
            this.f37763h.start();
            if (z2) {
                this.f37763h.end();
            }
        } else if (z) {
        } else {
            this.f37763h.cancel();
            this.f37764i.start();
            if (z2) {
                this.f37764i.end();
            }
        }
    }

    /* renamed from: j */
    public final ValueAnimator m227j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C1247f3.f9051a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new C4134h());
        return ofFloat;
    }

    /* renamed from: k */
    public final ValueAnimator m226k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(C1247f3.f9054d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new C4135i());
        return ofFloat;
    }

    /* renamed from: m */
    public final void m224m() {
        ValueAnimator m226k = m226k();
        ValueAnimator m227j = m227j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f37763h = animatorSet;
        animatorSet.playTogether(m226k, m227j);
        this.f37763h.addListener(new C4132f());
        ValueAnimator m227j2 = m227j(1.0f, 0.0f);
        this.f37764i = m227j2;
        m227j2.addListener(new C4133g());
    }
}
