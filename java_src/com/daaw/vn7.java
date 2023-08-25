package com.daaw;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzcl;
/* loaded from: classes2.dex */
public final class vn7 {

    /* renamed from: a */
    public final Context f30370a;

    /* renamed from: b */
    public String f30371b;

    /* renamed from: c */
    public String f30372c;

    /* renamed from: d */
    public String f30373d;

    /* renamed from: e */
    public Boolean f30374e;

    /* renamed from: f */
    public long f30375f;

    /* renamed from: g */
    public zzcl f30376g;

    /* renamed from: h */
    public boolean f30377h;

    /* renamed from: i */
    public final Long f30378i;

    /* renamed from: j */
    public String f30379j;

    public vn7(Context context, zzcl zzclVar, Long l) {
        this.f30377h = true;
        ry0.m10830j(context);
        Context applicationContext = context.getApplicationContext();
        ry0.m10830j(applicationContext);
        this.f30370a = applicationContext;
        this.f30378i = l;
        if (zzclVar != null) {
            this.f30376g = zzclVar;
            this.f30371b = zzclVar.f37046u;
            this.f30372c = zzclVar.f37045t;
            this.f30373d = zzclVar.f37044s;
            this.f30377h = zzclVar.f37043r;
            this.f30375f = zzclVar.f37042q;
            this.f30379j = zzclVar.f37048w;
            Bundle bundle = zzclVar.f37047v;
            if (bundle != null) {
                this.f30374e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
