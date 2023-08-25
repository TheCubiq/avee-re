package com.daaw;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzs;
/* loaded from: classes.dex */
public final class oh8 implements View.OnTouchListener {
    public final /* synthetic */ zzs p;

    public oh8(zzs zzsVar) {
        this.p = zzsVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        sl2 sl2Var;
        sl2 sl2Var2;
        zzs zzsVar = this.p;
        sl2Var = zzsVar.w;
        if (sl2Var != null) {
            sl2Var2 = zzsVar.w;
            sl2Var2.d(motionEvent);
            return false;
        }
        return false;
    }
}
