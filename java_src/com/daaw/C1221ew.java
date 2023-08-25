package com.daaw;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.C0232b;
/* renamed from: com.daaw.ew */
/* loaded from: classes.dex */
public final class C1221ew implements KeyListener {

    /* renamed from: a */
    public final KeyListener f8852a;

    /* renamed from: b */
    public final C1222a f8853b;

    /* renamed from: com.daaw.ew$a */
    /* loaded from: classes.dex */
    public static class C1222a {
        /* renamed from: a */
        public boolean m23112a(Editable editable, int i, KeyEvent keyEvent) {
            return C0232b.m29571f(editable, i, keyEvent);
        }
    }

    public C1221ew(KeyListener keyListener) {
        this(keyListener, new C1222a());
    }

    public C1221ew(KeyListener keyListener, C1222a c1222a) {
        this.f8852a = keyListener;
        this.f8853b = c1222a;
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.f8852a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f8852a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f8853b.m23112a(editable, i, keyEvent) || this.f8852a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f8852a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f8852a.onKeyUp(view, editable, i, keyEvent);
    }
}
