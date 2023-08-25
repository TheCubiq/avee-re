package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.daaw.ii0;
import com.daaw.n0;
/* loaded from: classes.dex */
public class c4 extends di implements t3 {
    public z3 r;
    public final ii0.a s;

    public c4(Context context, int i) {
        super(context, g(context, i));
        this.s = new ii0.a() { // from class: com.daaw.b4
            @Override // com.daaw.ii0.a
            public final boolean k(KeyEvent keyEvent) {
                return c4.this.k(keyEvent);
            }
        };
        z3 f = f();
        f.T(g(context, i));
        f.D(null);
    }

    public static int g(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(x01.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f().f(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        f().E();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return ii0.e(this.s, getWindow().getDecorView(), this, keyEvent);
    }

    public z3 f() {
        if (this.r == null) {
            this.r = z3.m(this, this);
        }
        return this.r;
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) f().n(i);
    }

    @Override // com.daaw.t3
    public void h(n0 n0Var) {
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        f().y();
    }

    @Override // com.daaw.t3
    public void j(n0 n0Var) {
    }

    public boolean k(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.daaw.t3
    public n0 l(n0.a aVar) {
        return null;
    }

    public boolean m(int i) {
        return f().M(i);
    }

    @Override // com.daaw.di, android.app.Dialog
    public void onCreate(Bundle bundle) {
        f().x();
        super.onCreate(bundle);
        f().D(bundle);
    }

    @Override // com.daaw.di, android.app.Dialog
    public void onStop() {
        super.onStop();
        f().J();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        f().P(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        f().Q(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f().R(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        f().U(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().U(charSequence);
    }
}
