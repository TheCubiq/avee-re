package com.daaw;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC0344c;
import androidx.lifecycle.C0349e;
import androidx.lifecycle.FragmentC0358i;
import com.daaw.ii0;
/* renamed from: com.daaw.zh */
/* loaded from: classes.dex */
public class ActivityC3839zh extends Activity implements sj0, ii0.InterfaceC1709a {

    /* renamed from: p */
    public cd1<Class<Object>, Object> f35053p = new cd1<>();

    /* renamed from: q */
    public C0349e f35054q = new C0349e(this);

    /* renamed from: a */
    public AbstractC0344c mo2327a() {
        return this.f35054q;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !ii0.m19783d(decorView, keyEvent)) {
            return ii0.m19782e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !ii0.m19783d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // com.daaw.ii0.InterfaceC1709a
    /* renamed from: k */
    public boolean mo2326k(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC0358i.m29009g(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.f35054q.m29039j(AbstractC0344c.EnumC0347c.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
