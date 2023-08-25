package com.daaw;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
/* renamed from: com.daaw.e4 */
/* loaded from: classes.dex */
public class C1160e4 {

    /* renamed from: a */
    public final EditText f8108a;

    /* renamed from: b */
    public final C0776aw f8109b;

    public C1160e4(EditText editText) {
        this.f8108a = editText;
        this.f8109b = new C0776aw(editText, false);
    }

    /* renamed from: a */
    public KeyListener m23733a(KeyListener keyListener) {
        return m23732b(keyListener) ? this.f8109b.m26632a(keyListener) : keyListener;
    }

    /* renamed from: b */
    public boolean m23732b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* renamed from: c */
    public void m23731c(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f8108a.getContext().obtainStyledAttributes(attributeSet, x21.f31913g0, i, 0);
        try {
            int i2 = x21.f31983u0;
            boolean z = obtainStyledAttributes.hasValue(i2) ? obtainStyledAttributes.getBoolean(i2, true) : true;
            obtainStyledAttributes.recycle();
            m23729e(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: d */
    public InputConnection m23730d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f8109b.m26631b(inputConnection, editorInfo);
    }

    /* renamed from: e */
    public void m23729e(boolean z) {
        this.f8109b.m26630c(z);
    }
}
