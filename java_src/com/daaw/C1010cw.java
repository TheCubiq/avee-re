package com.daaw;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.C0232b;
/* renamed from: com.daaw.cw */
/* loaded from: classes.dex */
public final class C1010cw extends InputConnectionWrapper {

    /* renamed from: a */
    public final TextView f6210a;

    /* renamed from: b */
    public final C1011a f6211b;

    /* renamed from: com.daaw.cw$a */
    /* loaded from: classes.dex */
    public static class C1011a {
        /* renamed from: a */
        public boolean m24952a(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
            return C0232b.m29572e(inputConnection, editable, i, i2, z);
        }

        /* renamed from: b */
        public void m24951b(EditorInfo editorInfo) {
            if (C0232b.m29569h()) {
                C0232b.m29575b().m29556u(editorInfo);
            }
        }
    }

    public C1010cw(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new C1011a());
    }

    public C1010cw(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, C1011a c1011a) {
        super(inputConnection, false);
        this.f6210a = textView;
        this.f6211b = c1011a;
        c1011a.m24951b(editorInfo);
    }

    /* renamed from: a */
    public final Editable m24953a() {
        return this.f6210a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        return this.f6211b.m24952a(this, m24953a(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return this.f6211b.m24952a(this, m24953a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
