package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.daaw.AbstractC2228n0;
import com.daaw.ii0;
/* renamed from: com.daaw.c4 */
/* loaded from: classes.dex */
public class DialogC0913c4 extends DialogC1088di implements InterfaceC3010t3 {

    /* renamed from: r */
    public AbstractC3800z3 f5454r;

    /* renamed from: s */
    public final ii0.InterfaceC1709a f5455s;

    public DialogC0913c4(Context context, int i) {
        super(context, m25641g(context, i));
        this.f5455s = new ii0.InterfaceC1709a() { // from class: com.daaw.b4
            @Override // com.daaw.ii0.InterfaceC1709a
            /* renamed from: k */
            public final boolean mo2326k(KeyEvent keyEvent) {
                return DialogC0913c4.this.m25640k(keyEvent);
            }
        };
        AbstractC3800z3 m25642f = m25642f();
        m25642f.mo2939T(m25641g(context, i));
        m25642f.mo2955D(null);
    }

    /* renamed from: g */
    public static int m25641g(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(x01.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m25642f().mo2932f(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m25642f().mo2954E();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return ii0.m19782e(this.f5455s, getWindow().getDecorView(), this, keyEvent);
    }

    /* renamed from: f */
    public AbstractC3800z3 m25642f() {
        if (this.f5454r == null) {
            this.f5454r = AbstractC3800z3.m2925m(this, this);
        }
        return this.f5454r;
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) m25642f().mo2924n(i);
    }

    @Override // com.daaw.InterfaceC3010t3
    /* renamed from: h */
    public void mo9641h(AbstractC2228n0 abstractC2228n0) {
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m25642f().mo2913y();
    }

    @Override // com.daaw.InterfaceC3010t3
    /* renamed from: j */
    public void mo9640j(AbstractC2228n0 abstractC2228n0) {
    }

    /* renamed from: k */
    public boolean m25640k(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.daaw.InterfaceC3010t3
    /* renamed from: l */
    public AbstractC2228n0 mo9639l(AbstractC2228n0.InterfaceC2229a interfaceC2229a) {
        return null;
    }

    /* renamed from: m */
    public boolean m25639m(int i) {
        return m25642f().mo2946M(i);
    }

    @Override // com.daaw.DialogC1088di, android.app.Dialog
    public void onCreate(Bundle bundle) {
        m25642f().mo2914x();
        super.onCreate(bundle);
        m25642f().mo2955D(bundle);
    }

    @Override // com.daaw.DialogC1088di, android.app.Dialog
    public void onStop() {
        super.onStop();
        m25642f().mo2949J();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m25642f().mo2943P(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m25642f().mo2942Q(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m25642f().mo2941R(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        m25642f().mo2938U(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m25642f().mo2938U(charSequence);
    }
}
