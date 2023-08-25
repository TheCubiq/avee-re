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
    public final Chip p;
    public final TextInputLayout q;
    public final EditText r;
    public TextWatcher s;
    public TextView t;

    /* loaded from: classes2.dex */
    public class b extends uk1 {
        public b() {
        }

        @Override // com.daaw.uk1, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.p.setText(ChipTextInputComboView.this.c("00"));
            } else {
                ChipTextInputComboView.this.p.setText(ChipTextInputComboView.this.c(editable));
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
        this.p = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(a21.material_time_input, (ViewGroup) this, false);
        this.q = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.r = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.s = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.t = (TextView) findViewById(m11.material_label);
        editText.setSaveEnabled(false);
    }

    public final String c(CharSequence charSequence) {
        return TimeModel.a(getResources(), charSequence);
    }

    public final void d() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.r.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.p.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.p.setChecked(z);
        this.r.setVisibility(z ? 0 : 4);
        this.p.setVisibility(z ? 8 : 0);
        if (isChecked()) {
            this.r.requestFocus();
            if (TextUtils.isEmpty(this.r.getText())) {
                return;
            }
            EditText editText = this.r;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.p.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.p.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.p.toggle();
    }
}
