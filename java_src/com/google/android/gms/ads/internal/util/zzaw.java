package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.daaw.ch5;
import com.daaw.dh5;
import com.daaw.es2;
import com.daaw.f77;
import com.daaw.g93;
import com.daaw.k04;
import com.daaw.xd0;
import com.daaw.yp2;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzaw {
    public final Object a = new Object();
    @GuardedBy("lock")
    public String b = "";
    @GuardedBy("lock")
    public String c = "";
    @GuardedBy("lock")
    public boolean d = false;
    @GuardedBy("lock")
    public boolean e = false;
    public String f = "";
    public dh5 g;

    public static final String c(Context context, String str, String str2) {
        String valueOf;
        String str3;
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzp().zzc(context, str2));
        f77 zzb = new zzbo(context).zzb(0, str, hashMap, null);
        try {
            return (String) zzb.get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.l4)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            valueOf = String.valueOf(str);
            str3 = "Interrupted while retrieving a response from: ";
            k04.zzh(str3.concat(valueOf), e);
            zzb.cancel(true);
            return null;
        } catch (TimeoutException e2) {
            e = e2;
            valueOf = String.valueOf(str);
            str3 = "Timeout while retrieving a response from: ";
            k04.zzh(str3.concat(valueOf), e);
            zzb.cancel(true);
            return null;
        } catch (Exception e3) {
            k04.zzh("Error retrieving a response from: ".concat(String.valueOf(str)), e3);
            return null;
        }
    }

    public final void a(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            zzs.zza.post(new es2(this, context, str, z, z2));
        } else {
            k04.zzi("Can not create dialog without Activity Context");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.daaw.y83 r0 = com.daaw.g93.i4
            com.daaw.e93 r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.b(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = r3.d(r4, r0, r5, r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = c(r4, r0, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            r0 = 0
            if (r6 == 0) goto L25
            java.lang.String r4 = "Not linked for in app preview."
            com.daaw.k04.zze(r4)
            return r0
        L25:
            java.lang.String r4 = r4.trim()
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L84
            r6.<init>(r4)     // Catch: org.json.JSONException -> L84
            java.lang.String r4 = "gct"
            java.lang.String r4 = r6.optString(r4)     // Catch: org.json.JSONException -> L84
            java.lang.String r1 = "status"
            java.lang.String r6 = r6.optString(r1)     // Catch: org.json.JSONException -> L84
            r3.f = r6     // Catch: org.json.JSONException -> L84
            com.daaw.y83 r6 = com.daaw.g93.m8     // Catch: org.json.JSONException -> L84
            com.daaw.e93 r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: org.json.JSONException -> L84
            java.lang.Object r6 = r1.b(r6)     // Catch: org.json.JSONException -> L84
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: org.json.JSONException -> L84
            boolean r6 = r6.booleanValue()     // Catch: org.json.JSONException -> L84
            r1 = 1
            if (r6 == 0) goto L7a
            java.lang.String r6 = "0"
            java.lang.String r2 = r3.f     // Catch: org.json.JSONException -> L84
            boolean r6 = r6.equals(r2)     // Catch: org.json.JSONException -> L84
            if (r6 != 0) goto L66
            java.lang.String r6 = "2"
            java.lang.String r2 = r3.f     // Catch: org.json.JSONException -> L84
            boolean r6 = r6.equals(r2)     // Catch: org.json.JSONException -> L84
            if (r6 == 0) goto L64
            goto L66
        L64:
            r6 = 0
            goto L67
        L66:
            r6 = 1
        L67:
            r3.zzf(r6)     // Catch: org.json.JSONException -> L84
            com.daaw.qz3 r2 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch: org.json.JSONException -> L84
            com.google.android.gms.ads.internal.util.zzg r2 = r2.h()     // Catch: org.json.JSONException -> L84
            if (r6 == 0) goto L75
            goto L77
        L75:
            java.lang.String r5 = ""
        L77:
            r2.zzA(r5)     // Catch: org.json.JSONException -> L84
        L7a:
            java.lang.Object r5 = r3.a
            monitor-enter(r5)
            r3.c = r4     // Catch: java.lang.Throwable -> L81
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L81
            return r1
        L81:
            r4 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L81
            throw r4
        L84:
            r4 = move-exception
            java.lang.String r5 = "Fail to get in app preview response json."
            com.daaw.k04.zzk(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzaw.b(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public final Uri d(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.a) {
            if (TextUtils.isEmpty(this.b)) {
                com.google.android.gms.ads.internal.zzt.zzp();
                try {
                    str5 = new String(xd0.d(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (IOException unused) {
                    k04.zze("Error reading from internal storage.");
                    str5 = "";
                }
                this.b = str5;
                if (TextUtils.isEmpty(str5)) {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    this.b = UUID.randomUUID().toString();
                    com.google.android.gms.ads.internal.zzt.zzp();
                    String str6 = this.b;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e) {
                        k04.zzh("Error writing to file in internal storage.", e);
                    }
                }
            }
            str4 = this.b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    public final dh5 zza() {
        return this.g;
    }

    public final String zzb() {
        String str;
        synchronized (this.a) {
            str = this.c;
        }
        return str;
    }

    public final void zzc(Context context) {
        dh5 dh5Var;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.m8)).booleanValue() || (dh5Var = this.g) == null) {
            return;
        }
        dh5Var.h(new yp2(this, context), ch5.DEBUG_MENU);
    }

    public final void zzd(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzt.zzp();
        zzs.zzR(context, d(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.h4), str, str2));
    }

    public final void zze(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = d(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.k4), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzt.zzp();
        zzs.zzH(context, str, buildUpon.build().toString());
    }

    public final void zzf(boolean z) {
        synchronized (this.a) {
            this.e = z;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.m8)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzo().h().zzB(z);
                dh5 dh5Var = this.g;
                if (dh5Var != null) {
                    dh5Var.j(z);
                }
            }
        }
    }

    public final void zzg(dh5 dh5Var) {
        this.g = dh5Var;
    }

    public final void zzh(boolean z) {
        synchronized (this.a) {
            this.d = z;
        }
    }

    public final boolean zzj(Context context, String str, String str2) {
        String c = c(context, d(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.j4), str, str2).toString(), str2);
        if (TextUtils.isEmpty(c)) {
            k04.zze("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(c.trim()).optString("debug_mode"));
            zzf(equals);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.m8)).booleanValue()) {
                zzg h = com.google.android.gms.ads.internal.zzt.zzo().h();
                if (true != equals) {
                    str = "";
                }
                h.zzA(str);
            }
            return equals;
        } catch (JSONException e) {
            k04.zzk("Fail to get debug mode response json.", e);
            return false;
        }
    }

    public final boolean zzl() {
        boolean z;
        synchronized (this.a) {
            z = this.e;
        }
        return z;
    }

    public final boolean zzm() {
        boolean z;
        synchronized (this.a) {
            z = this.d;
        }
        return z;
    }

    public final boolean zzn(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzm()) {
            return false;
        }
        k04.zze("Sending troubleshooting signals to the server.");
        zze(context, str, str2, str3);
        return true;
    }
}
