package com.daaw;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.AbstractC0344c;
import androidx.lifecycle.C0349e;
/* renamed from: com.daaw.di */
/* loaded from: classes.dex */
public class DialogC1088di extends Dialog implements sj0, yt0 {

    /* renamed from: p */
    public C0349e f7121p;

    /* renamed from: q */
    public final OnBackPressedDispatcher f7122q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC1088di(Context context, int i) {
        super(context, i);
        ug0.m8268f(context, "context");
        this.f7122q = new OnBackPressedDispatcher(new Runnable() { // from class: com.daaw.ci
            @Override // java.lang.Runnable
            public final void run() {
                DialogC1088di.m24364e(DialogC1088di.this);
            }
        });
    }

    /* renamed from: e */
    public static final void m24364e(DialogC1088di dialogC1088di) {
        ug0.m8268f(dialogC1088di, "this$0");
        super.onBackPressed();
    }

    @Override // com.daaw.sj0
    /* renamed from: a */
    public final AbstractC0344c mo2327a() {
        return m24365d();
    }

    @Override // com.daaw.yt0
    /* renamed from: c */
    public final OnBackPressedDispatcher mo3233c() {
        return this.f7122q;
    }

    /* renamed from: d */
    public final C0349e m24365d() {
        C0349e c0349e = this.f7121p;
        if (c0349e == null) {
            C0349e c0349e2 = new C0349e(this);
            this.f7121p = c0349e2;
            return c0349e2;
        }
        return c0349e;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f7122q.m30369f();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m24365d().m29041h(AbstractC0344c.EnumC0346b.ON_CREATE);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        m24365d().m29041h(AbstractC0344c.EnumC0346b.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        m24365d().m29041h(AbstractC0344c.EnumC0346b.ON_DESTROY);
        this.f7121p = null;
        super.onStop();
    }
}
