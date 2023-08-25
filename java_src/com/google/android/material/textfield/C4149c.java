package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.daaw.AbstractC1229ex;
import com.daaw.C2818r4;
import com.daaw.h21;
import com.daaw.j11;
import com.daaw.uk1;
import com.google.android.material.textfield.TextInputLayout;
/* renamed from: com.google.android.material.textfield.c */
/* loaded from: classes2.dex */
public class C4149c extends AbstractC1229ex {

    /* renamed from: d */
    public final TextWatcher f37805d;

    /* renamed from: e */
    public final TextInputLayout.InterfaceC4123f f37806e;

    /* renamed from: f */
    public final TextInputLayout.InterfaceC4124g f37807f;

    /* renamed from: com.google.android.material.textfield.c$a */
    /* loaded from: classes2.dex */
    public class C4150a extends uk1 {
        public C4150a() {
        }

        @Override // com.daaw.uk1, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C4149c c4149c = C4149c.this;
            c4149c.f8890c.setChecked(!c4149c.m187g());
        }
    }

    /* renamed from: com.google.android.material.textfield.c$b */
    /* loaded from: classes2.dex */
    public class C4151b implements TextInputLayout.InterfaceC4123f {
        public C4151b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4123f
        /* renamed from: a */
        public void mo185a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            C4149c c4149c = C4149c.this;
            c4149c.f8890c.setChecked(!c4149c.m187g());
            editText.removeTextChangedListener(C4149c.this.f37805d);
            editText.addTextChangedListener(C4149c.this.f37805d);
        }
    }

    /* renamed from: com.google.android.material.textfield.c$c */
    /* loaded from: classes2.dex */
    public class C4152c implements TextInputLayout.InterfaceC4124g {

        /* renamed from: com.google.android.material.textfield.c$c$a */
        /* loaded from: classes2.dex */
        public class RunnableC4153a implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ EditText f37811p;

            public RunnableC4153a(EditText editText) {
                this.f37811p = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f37811p.removeTextChangedListener(C4149c.this.f37805d);
            }
        }

        public C4152c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4124g
        /* renamed from: a */
        public void mo184a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new RunnableC4153a(editText));
        }
    }

    /* renamed from: com.google.android.material.textfield.c$d */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC4154d implements View.OnClickListener {
        public View$OnClickListenerC4154d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = C4149c.this.f8888a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            editText.setTransformationMethod(C4149c.this.m187g() ? null : PasswordTransformationMethod.getInstance());
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            C4149c.this.f8888a.m293V();
        }
    }

    public C4149c(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f37805d = new C4150a();
        this.f37806e = new C4151b();
        this.f37807f = new C4152c();
    }

    /* renamed from: h */
    public static boolean m186h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    @Override // com.daaw.AbstractC1229ex
    /* renamed from: a */
    public void mo190a() {
        this.f8888a.setEndIconDrawable(C2818r4.m11783b(this.f8889b, j11.design_password_eye));
        TextInputLayout textInputLayout = this.f8888a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(h21.password_toggle_content_description));
        this.f8888a.setEndIconOnClickListener(new View$OnClickListenerC4154d());
        this.f8888a.m280e(this.f37806e);
        this.f8888a.m278f(this.f37807f);
        EditText editText = this.f8888a.getEditText();
        if (m186h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* renamed from: g */
    public final boolean m187g() {
        EditText editText = this.f8888a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
