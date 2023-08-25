package com.daaw;

import android.os.AsyncTask;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.ads.internal.zzs;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class ro8 extends AsyncTask {
    public final /* synthetic */ zzs a;

    public /* synthetic */ ro8(zzs zzsVar, zzp zzpVar) {
        this.a = zzsVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public final String doInBackground(Void... voidArr) {
        try {
            zzs zzsVar = this.a;
            zzs.o3(zzsVar, (sl2) zzs.n3(zzsVar).get(1000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            k04.zzk("", e);
        }
        return this.a.zzp();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzs zzsVar = this.a;
        if (zzs.i3(zzsVar) == null || str == null) {
            return;
        }
        zzs.i3(zzsVar).loadUrl(str);
    }
}
