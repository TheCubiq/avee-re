package com.daaw;

import android.os.AsyncTask;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.ads.internal.zzs;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class ro8 extends AsyncTask {

    /* renamed from: a */
    public final /* synthetic */ zzs f25458a;

    public /* synthetic */ ro8(zzs zzsVar, zzp zzpVar) {
        this.f25458a = zzsVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public final String doInBackground(Void... voidArr) {
        try {
            zzs zzsVar = this.f25458a;
            zzs.m1302o3(zzsVar, (sl2) zzs.m1303n3(zzsVar).get(1000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            k04.zzk("", e);
        }
        return this.f25458a.zzp();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzs zzsVar = this.f25458a;
        if (zzs.m1308i3(zzsVar) == null || str == null) {
            return;
        }
        zzs.m1308i3(zzsVar).loadUrl(str);
    }
}
