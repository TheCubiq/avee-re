package com.daaw;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.c;
/* loaded from: classes.dex */
public class di extends Dialog implements sj0, yt0 {
    public androidx.lifecycle.e p;
    public final OnBackPressedDispatcher q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(Context context, int i) {
        super(context, i);
        ug0.f(context, "context");
        this.q = new OnBackPressedDispatcher(new Runnable() { // from class: com.daaw.ci
            @Override // java.lang.Runnable
            public final void run() {
                di.e(di.this);
            }
        });
    }

    public static final void e(di diVar) {
        ug0.f(diVar, "this$0");
        super.onBackPressed();
    }

    @Override // com.daaw.sj0
    public final androidx.lifecycle.c a() {
        return d();
    }

    @Override // com.daaw.yt0
    public final OnBackPressedDispatcher c() {
        return this.q;
    }

    public final androidx.lifecycle.e d() {
        androidx.lifecycle.e eVar = this.p;
        if (eVar == null) {
            androidx.lifecycle.e eVar2 = new androidx.lifecycle.e(this);
            this.p = eVar2;
            return eVar2;
        }
        return eVar;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.q.f();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d().h(c.b.ON_CREATE);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        d().h(c.b.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        d().h(c.b.ON_DESTROY);
        this.p = null;
        super.onStop();
    }
}
