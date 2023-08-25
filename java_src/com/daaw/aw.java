package com.daaw;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
/* loaded from: classes.dex */
public final class aw {
    public final b a;
    public int b = Integer.MAX_VALUE;
    public int c = 0;

    /* loaded from: classes.dex */
    public static class a extends b {
        public final EditText a;
        public final iw b;

        public a(EditText editText, boolean z) {
            this.a = editText;
            iw iwVar = new iw(editText, z);
            this.b = iwVar;
            editText.addTextChangedListener(iwVar);
            editText.setEditableFactory(bw.getInstance());
        }

        @Override // com.daaw.aw.b
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof ew) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new ew(keyListener);
        }

        @Override // com.daaw.aw.b
        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof cw ? inputConnection : new cw(this.a, inputConnection, editorInfo);
        }

        @Override // com.daaw.aw.b
        public void c(boolean z) {
            this.b.c(z);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public KeyListener a(KeyListener keyListener) {
            throw null;
        }

        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        public void c(boolean z) {
            throw null;
        }
    }

    public aw(EditText editText, boolean z) {
        ty0.g(editText, "editText cannot be null");
        this.a = new a(editText, z);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.a.b(inputConnection, editorInfo);
    }

    public void c(boolean z) {
        this.a.c(z);
    }
}
