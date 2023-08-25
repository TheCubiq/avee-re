package com.daaw;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.zzas;
/* loaded from: classes.dex */
public final class a17 extends RelativeLayout {
    public final zzas p;
    public boolean q;

    public a17(Context context, String str, String str2, String str3) {
        super(context);
        zzas zzasVar = new zzas(context, str);
        this.p = zzasVar;
        zzasVar.zzo(str2);
        zzasVar.zzn(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.q) {
            return false;
        }
        this.p.zzm(motionEvent);
        return false;
    }
}
