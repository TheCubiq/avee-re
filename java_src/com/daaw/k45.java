package com.daaw;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class k45 implements ec3 {
    public final /* synthetic */ k55 a;
    public final /* synthetic */ ViewGroup b;

    public k45(k55 k55Var, ViewGroup viewGroup) {
        this.a = k55Var;
        this.b = viewGroup;
    }

    @Override // com.daaw.ec3
    public final void a(MotionEvent motionEvent) {
        this.a.onTouch(null, motionEvent);
    }

    @Override // com.daaw.ec3
    public final JSONObject zza() {
        return this.a.zzo();
    }

    @Override // com.daaw.ec3
    public final JSONObject zzb() {
        return this.a.zzp();
    }

    @Override // com.daaw.ec3
    public final void zzc() {
        k55 k55Var = this.a;
        y17 y17Var = h45.D;
        Map zzm = k55Var.zzm();
        if (zzm == null) {
            return;
        }
        int size = y17Var.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (zzm.get((String) y17Var.get(i)) != null) {
                this.a.onClick(this.b);
                return;
            }
            i = i2;
        }
    }
}
