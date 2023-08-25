package com.daaw;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
/* renamed from: com.daaw.aw */
/* loaded from: classes.dex */
public final class C0776aw {

    /* renamed from: a */
    public final C0778b f4054a;

    /* renamed from: b */
    public int f4055b = Integer.MAX_VALUE;

    /* renamed from: c */
    public int f4056c = 0;

    /* renamed from: com.daaw.aw$a */
    /* loaded from: classes.dex */
    public static class C0777a extends C0778b {

        /* renamed from: a */
        public final EditText f4057a;

        /* renamed from: b */
        public final C1763iw f4058b;

        public C0777a(EditText editText, boolean z) {
            this.f4057a = editText;
            C1763iw c1763iw = new C1763iw(editText, z);
            this.f4058b = c1763iw;
            editText.addTextChangedListener(c1763iw);
            editText.setEditableFactory(C0889bw.getInstance());
        }

        @Override // com.daaw.C0776aw.C0778b
        /* renamed from: a */
        public KeyListener mo26629a(KeyListener keyListener) {
            if (keyListener instanceof C1221ew) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new C1221ew(keyListener);
        }

        @Override // com.daaw.C0776aw.C0778b
        /* renamed from: b */
        public InputConnection mo26628b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof C1010cw ? inputConnection : new C1010cw(this.f4057a, inputConnection, editorInfo);
        }

        @Override // com.daaw.C0776aw.C0778b
        /* renamed from: c */
        public void mo26627c(boolean z) {
            this.f4058b.m19313c(z);
        }
    }

    /* renamed from: com.daaw.aw$b */
    /* loaded from: classes.dex */
    public static class C0778b {
        /* renamed from: a */
        public KeyListener mo26629a(KeyListener keyListener) {
            throw null;
        }

        /* renamed from: b */
        public InputConnection mo26628b(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        /* renamed from: c */
        public void mo26627c(boolean z) {
            throw null;
        }
    }

    public C0776aw(EditText editText, boolean z) {
        ty0.m8698g(editText, "editText cannot be null");
        this.f4054a = new C0777a(editText, z);
    }

    /* renamed from: a */
    public KeyListener m26632a(KeyListener keyListener) {
        return this.f4054a.mo26629a(keyListener);
    }

    /* renamed from: b */
    public InputConnection m26631b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f4054a.mo26628b(inputConnection, editorInfo);
    }

    /* renamed from: c */
    public void m26630c(boolean z) {
        this.f4054a.mo26627c(z);
    }
}
