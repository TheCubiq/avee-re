package com.daaw;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.b;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class dw implements InputFilter {
    public final TextView a;
    public b.e b;

    /* loaded from: classes.dex */
    public static class a extends b.e {
        public final Reference<TextView> a;
        public final Reference<dw> b;

        public a(TextView textView, dw dwVar) {
            this.a = new WeakReference(textView);
            this.b = new WeakReference(dwVar);
        }

        @Override // androidx.emoji2.text.b.e
        public void b() {
            CharSequence text;
            CharSequence o;
            super.b();
            TextView textView = this.a.get();
            if (c(textView, this.b.get()) && textView.isAttachedToWindow() && text != (o = androidx.emoji2.text.b.b().o((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(o);
                int selectionEnd = Selection.getSelectionEnd(o);
                textView.setText(o);
                if (o instanceof Spannable) {
                    dw.b((Spannable) o, selectionStart, selectionEnd);
                }
            }
        }

        public final boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }
    }

    public dw(TextView textView) {
        this.a = textView;
    }

    public static void b(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    public final b.e a() {
        if (this.b == null) {
            this.b = new a(this.a, this);
        }
        return this.b;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.a.isInEditMode()) {
            return charSequence;
        }
        int d = androidx.emoji2.text.b.b().d();
        if (d != 0) {
            boolean z = true;
            if (d == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.a.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return androidx.emoji2.text.b.b().p(charSequence, 0, charSequence.length());
            } else if (d != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.b.b().s(a());
        return charSequence;
    }
}
