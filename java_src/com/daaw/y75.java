package com.daaw;

import android.view.MotionEvent;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class y75 implements ec3 {
    public final /* synthetic */ z75 a;

    public y75(z75 z75Var) {
        this.a = z75Var;
    }

    @Override // com.daaw.ec3
    public final void a(MotionEvent motionEvent) {
    }

    @Override // com.daaw.ec3
    public final JSONObject zza() {
        return null;
    }

    @Override // com.daaw.ec3
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.daaw.ec3
    public final void zzc() {
        e35 e35Var;
        e35 e35Var2;
        z75 z75Var = this.a;
        e35Var = z75Var.s;
        if (e35Var != null) {
            e35Var2 = z75Var.s;
            e35Var2.i("_videoMediaView");
        }
    }
}
