package com.daaw;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzcl;
/* loaded from: classes2.dex */
public final class vn7 {
    public final Context a;
    public String b;
    public String c;
    public String d;
    public Boolean e;
    public long f;
    public zzcl g;
    public boolean h;
    public final Long i;
    public String j;

    public vn7(Context context, zzcl zzclVar, Long l) {
        this.h = true;
        ry0.j(context);
        Context applicationContext = context.getApplicationContext();
        ry0.j(applicationContext);
        this.a = applicationContext;
        this.i = l;
        if (zzclVar != null) {
            this.g = zzclVar;
            this.b = zzclVar.u;
            this.c = zzclVar.t;
            this.d = zzclVar.s;
            this.h = zzclVar.r;
            this.f = zzclVar.q;
            this.j = zzclVar.w;
            Bundle bundle = zzclVar.v;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
