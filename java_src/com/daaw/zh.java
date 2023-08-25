package com.daaw;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.c;
import com.daaw.ii0;
/* loaded from: classes.dex */
public class zh extends Activity implements sj0, ii0.a {
    public cd1<Class<Object>, Object> p = new cd1<>();
    public androidx.lifecycle.e q = new androidx.lifecycle.e(this);

    public androidx.lifecycle.c a() {
        return this.q;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !ii0.d(decorView, keyEvent)) {
            return ii0.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !ii0.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // com.daaw.ii0.a
    public boolean k(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.lifecycle.i.g(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.q.j(c.EnumC0020c.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
