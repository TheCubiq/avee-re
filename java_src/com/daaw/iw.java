package com.daaw;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.b;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class iw implements TextWatcher {
    public final EditText p;
    public final boolean q;
    public b.e r;
    public int s = Integer.MAX_VALUE;
    public int t = 0;
    public boolean u = true;

    /* loaded from: classes.dex */
    public static class a extends b.e {
        public final Reference<EditText> a;

        public a(EditText editText) {
            this.a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.b.e
        public void b() {
            super.b();
            iw.b(this.a.get(), 1);
        }
    }

    public iw(EditText editText, boolean z) {
        this.p = editText;
        this.q = z;
    }

    public static void b(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.b.b().o(editableText);
            dw.b(editableText, selectionStart, selectionEnd);
        }
    }

    public final b.e a() {
        if (this.r == null) {
            this.r = new a(this.p);
        }
        return this.r;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void c(boolean z) {
        if (this.u != z) {
            if (this.r != null) {
                androidx.emoji2.text.b.b().t(this.r);
            }
            this.u = z;
            if (z) {
                b(this.p, androidx.emoji2.text.b.b().d());
            }
        }
    }

    public final boolean d() {
        return (this.u && (this.q || androidx.emoji2.text.b.h())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.p.isInEditMode() || d() || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int d = androidx.emoji2.text.b.b().d();
        if (d != 0) {
            if (d == 1) {
                androidx.emoji2.text.b.b().r((Spannable) charSequence, i, i + i3, this.s, this.t);
                return;
            } else if (d != 3) {
                return;
            }
        }
        androidx.emoji2.text.b.b().s(a());
    }
}
