package com.daaw;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C0232b;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* renamed from: com.daaw.dw */
/* loaded from: classes.dex */
public final class C1146dw implements InputFilter {

    /* renamed from: a */
    public final TextView f7915a;

    /* renamed from: b */
    public C0232b.AbstractC0238e f7916b;

    /* renamed from: com.daaw.dw$a */
    /* loaded from: classes.dex */
    public static class C1147a extends C0232b.AbstractC0238e {

        /* renamed from: a */
        public final Reference<TextView> f7917a;

        /* renamed from: b */
        public final Reference<C1146dw> f7918b;

        public C1147a(TextView textView, C1146dw c1146dw) {
            this.f7917a = new WeakReference(textView);
            this.f7918b = new WeakReference(c1146dw);
        }

        @Override // androidx.emoji2.text.C0232b.AbstractC0238e
        /* renamed from: b */
        public void mo19311b() {
            CharSequence text;
            CharSequence m29562o;
            super.mo19311b();
            TextView textView = this.f7917a.get();
            if (m23863c(textView, this.f7918b.get()) && textView.isAttachedToWindow() && text != (m29562o = C0232b.m29575b().m29562o((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(m29562o);
                int selectionEnd = Selection.getSelectionEnd(m29562o);
                textView.setText(m29562o);
                if (m29562o instanceof Spannable) {
                    C1146dw.m23864b((Spannable) m29562o, selectionStart, selectionEnd);
                }
            }
        }

        /* renamed from: c */
        public final boolean m23863c(TextView textView, InputFilter inputFilter) {
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

    public C1146dw(TextView textView) {
        this.f7915a = textView;
    }

    /* renamed from: b */
    public static void m23864b(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    /* renamed from: a */
    public final C0232b.AbstractC0238e m23865a() {
        if (this.f7916b == null) {
            this.f7916b = new C1147a(this.f7915a, this);
        }
        return this.f7916b;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f7915a.isInEditMode()) {
            return charSequence;
        }
        int m29573d = C0232b.m29575b().m29573d();
        if (m29573d != 0) {
            boolean z = true;
            if (m29573d == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.f7915a.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C0232b.m29575b().m29561p(charSequence, 0, charSequence.length());
            } else if (m29573d != 3) {
                return charSequence;
            }
        }
        C0232b.m29575b().m29558s(m23865a());
        return charSequence;
    }
}
