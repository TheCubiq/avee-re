package com.daaw;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.zzas;
/* loaded from: classes.dex */
public final class a17 extends RelativeLayout {

    /* renamed from: p */
    public final zzas f2701p;

    /* renamed from: q */
    public boolean f2702q;

    public a17(Context context, String str, String str2, String str3) {
        super(context);
        zzas zzasVar = new zzas(context, str);
        this.f2701p = zzasVar;
        zzasVar.zzo(str2);
        zzasVar.zzn(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f2702q) {
            return false;
        }
        this.f2701p.zzm(motionEvent);
        return false;
    }
}
