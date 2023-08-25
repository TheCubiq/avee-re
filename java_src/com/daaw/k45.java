package com.daaw;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class k45 implements ec3 {

    /* renamed from: a */
    public final /* synthetic */ k55 f15676a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f15677b;

    public k45(k55 k55Var, ViewGroup viewGroup) {
        this.f15676a = k55Var;
        this.f15677b = viewGroup;
    }

    @Override // com.daaw.ec3
    /* renamed from: a */
    public final void mo4031a(MotionEvent motionEvent) {
        this.f15676a.onTouch(null, motionEvent);
    }

    @Override // com.daaw.ec3
    public final JSONObject zza() {
        return this.f15676a.zzo();
    }

    @Override // com.daaw.ec3
    public final JSONObject zzb() {
        return this.f15676a.zzp();
    }

    @Override // com.daaw.ec3
    public final void zzc() {
        k55 k55Var = this.f15676a;
        y17 y17Var = h45.f12041D;
        Map zzm = k55Var.zzm();
        if (zzm == null) {
            return;
        }
        int size = y17Var.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (zzm.get((String) y17Var.get(i)) != null) {
                this.f15676a.onClick(this.f15677b);
                return;
            }
            i = i2;
        }
    }
}
