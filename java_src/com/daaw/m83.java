package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import com.google.android.gms.ads.internal.util.zzcb;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class m83 {
    public final Context a;

    public m83(Context context) {
        ry0.k(context, "Context can not be null");
        this.a = context;
    }

    public final boolean a(Intent intent) {
        ry0.k(intent, "Intent can not be null");
        return !this.a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public final boolean b() {
        return a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean c() {
        return ((Boolean) zzcb.zza(this.a, new Callable() { // from class: com.daaw.l83
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            }
        })).booleanValue() && ez1.a(this.a).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
