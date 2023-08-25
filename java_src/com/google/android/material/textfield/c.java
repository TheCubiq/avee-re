package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.daaw.ex;
import com.daaw.h21;
import com.daaw.j11;
import com.daaw.r4;
import com.daaw.uk1;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes2.dex */
public class c extends ex {
    public final TextWatcher d;
    public final TextInputLayout.f e;
    public final TextInputLayout.g f;

    /* loaded from: classes2.dex */
    public class a extends uk1 {
        public a() {
        }

        @Override // com.daaw.uk1, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            c cVar = c.this;
            cVar.c.setChecked(!cVar.g());
        }
    }

    /* loaded from: classes2.dex */
    public class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            c cVar = c.this;
            cVar.c.setChecked(!cVar.g());
            editText.removeTextChangedListener(c.this.d);
            editText.addTextChangedListener(c.this.d);
        }
    }

    /* renamed from: com.google.android.material.textfield.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0106c implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.c$c$a */
        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public final /* synthetic */ EditText p;

            public a(EditText editText) {
                this.p = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.p.removeTextChangedListener(c.this.d);
            }
        }

        public C0106c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    /* loaded from: classes2.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = c.this.a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            editText.setTransformationMethod(c.this.g() ? null : PasswordTransformationMethod.getInstance());
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            c.this.a.V();
        }
    }

    public c(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = new a();
        this.e = new b();
        this.f = new C0106c();
    }

    public static boolean h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    @Override // com.daaw.ex
    public void a() {
        this.a.setEndIconDrawable(r4.b(this.b, j11.design_password_eye));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(h21.password_toggle_content_description));
        this.a.setEndIconOnClickListener(new d());
        this.a.e(this.e);
        this.a.f(this.f);
        EditText editText = this.a.getEditText();
        if (h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean g() {
        EditText editText = this.a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
