package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.daaw.a21;
import com.daaw.m11;
import com.daaw.uk1;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: p */
    public final Chip f37814p;

    /* renamed from: q */
    public final TextInputLayout f37815q;

    /* renamed from: r */
    public final EditText f37816r;

    /* renamed from: s */
    public TextWatcher f37817s;

    /* renamed from: t */
    public TextView f37818t;

    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$b */
    /* loaded from: classes2.dex */
    public class C4156b extends uk1 {
        public C4156b() {
        }

        @Override // com.daaw.uk1, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f37814p.setText(ChipTextInputComboView.this.m171c("00"));
            } else {
                ChipTextInputComboView.this.f37814p.setText(ChipTextInputComboView.this.m171c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(a21.material_time_chip, (ViewGroup) this, false);
        this.f37814p = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(a21.material_time_input, (ViewGroup) this, false);
        this.f37815q = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f37816r = editText;
        editText.setVisibility(4);
        C4156b c4156b = new C4156b();
        this.f37817s = c4156b;
        editText.addTextChangedListener(c4156b);
        m170d();
        addView(chip);
        addView(textInputLayout);
        this.f37818t = (TextView) findViewById(m11.material_label);
        editText.setSaveEnabled(false);
    }

    /* renamed from: c */
    public final String m171c(CharSequence charSequence) {
        return TimeModel.m145a(getResources(), charSequence);
    }

    /* renamed from: d */
    public final void m170d() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f37816r.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f37814p.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m170d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.f37814p.setChecked(z);
        this.f37816r.setVisibility(z ? 0 : 4);
        this.f37814p.setVisibility(z ? 8 : 0);
        if (isChecked()) {
            this.f37816r.requestFocus();
            if (TextUtils.isEmpty(this.f37816r.getText())) {
                return;
            }
            EditText editText = this.f37816r;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f37814p.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.f37814p.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f37814p.toggle();
    }
}
