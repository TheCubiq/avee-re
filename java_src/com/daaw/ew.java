package com.daaw;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
/* loaded from: classes.dex */
public final class ew implements KeyListener {
    public final KeyListener a;
    public final a b;

    /* loaded from: classes.dex */
    public static class a {
        public boolean a(Editable editable, int i, KeyEvent keyEvent) {
            return androidx.emoji2.text.b.f(editable, i, keyEvent);
        }
    }

    public ew(KeyListener keyListener) {
        this(keyListener, new a());
    }

    public ew(KeyListener keyListener, a aVar) {
        this.a = keyListener;
        this.b = aVar;
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.b.a(editable, i, keyEvent) || this.a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, i, keyEvent);
    }
}
