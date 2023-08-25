package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import com.google.android.gms.ads.internal.util.zzcb;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class m83 {

    /* renamed from: a */
    public final Context f18653a;

    public m83(Context context) {
        ry0.m10829k(context, "Context can not be null");
        this.f18653a = context;
    }

    /* renamed from: a */
    public final boolean m16168a(Intent intent) {
        ry0.m10829k(intent, "Intent can not be null");
        return !this.f18653a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    /* renamed from: b */
    public final boolean m16167b() {
        return m16168a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    /* renamed from: c */
    public final boolean m16166c() {
        return ((Boolean) zzcb.zza(this.f18653a, new Callable() { // from class: com.daaw.l83
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            }
        })).booleanValue() && ez1.m22979a(this.f18653a).m19346a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
