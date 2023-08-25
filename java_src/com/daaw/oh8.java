package com.daaw;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzs;
/* loaded from: classes.dex */
public final class oh8 implements View.OnTouchListener {

    /* renamed from: p */
    public final /* synthetic */ zzs f21566p;

    public oh8(zzs zzsVar) {
        this.f21566p = zzsVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        sl2 sl2Var;
        sl2 sl2Var2;
        zzs zzsVar = this.f21566p;
        sl2Var = zzsVar.f36373w;
        if (sl2Var != null) {
            sl2Var2 = zzsVar.f36373w;
            sl2Var2.m10201d(motionEvent);
            return false;
        }
        return false;
    }
}
