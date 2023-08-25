package com.daaw;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C0232b;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* renamed from: com.daaw.iw */
/* loaded from: classes.dex */
public final class C1763iw implements TextWatcher {

    /* renamed from: p */
    public final EditText f14064p;

    /* renamed from: q */
    public final boolean f14065q;

    /* renamed from: r */
    public C0232b.AbstractC0238e f14066r;

    /* renamed from: s */
    public int f14067s = Integer.MAX_VALUE;

    /* renamed from: t */
    public int f14068t = 0;

    /* renamed from: u */
    public boolean f14069u = true;

    /* renamed from: com.daaw.iw$a */
    /* loaded from: classes.dex */
    public static class C1764a extends C0232b.AbstractC0238e {

        /* renamed from: a */
        public final Reference<EditText> f14070a;

        public C1764a(EditText editText) {
            this.f14070a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.C0232b.AbstractC0238e
        /* renamed from: b */
        public void mo19311b() {
            super.mo19311b();
            C1763iw.m19314b(this.f14070a.get(), 1);
        }
    }

    public C1763iw(EditText editText, boolean z) {
        this.f14064p = editText;
        this.f14065q = z;
    }

    /* renamed from: b */
    public static void m19314b(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0232b.m29575b().m29562o(editableText);
            C1146dw.m23864b(editableText, selectionStart, selectionEnd);
        }
    }

    /* renamed from: a */
    public final C0232b.AbstractC0238e m19315a() {
        if (this.f14066r == null) {
            this.f14066r = new C1764a(this.f14064p);
        }
        return this.f14066r;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: c */
    public void m19313c(boolean z) {
        if (this.f14069u != z) {
            if (this.f14066r != null) {
                C0232b.m29575b().m29557t(this.f14066r);
            }
            this.f14069u = z;
            if (z) {
                m19314b(this.f14064p, C0232b.m29575b().m29573d());
            }
        }
    }

    /* renamed from: d */
    public final boolean m19312d() {
        return (this.f14069u && (this.f14065q || C0232b.m29569h())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f14064p.isInEditMode() || m19312d() || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int m29573d = C0232b.m29575b().m29573d();
        if (m29573d != 0) {
            if (m29573d == 1) {
                C0232b.m29575b().m29559r((Spannable) charSequence, i, i + i3, this.f14067s, this.f14068t);
                return;
            } else if (m29573d != 3) {
                return;
            }
        }
        C0232b.m29575b().m29558s(m19315a());
    }
}
