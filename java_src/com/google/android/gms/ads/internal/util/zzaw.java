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

    /* renamed from: a */
    public final Object f36255a = new Object();
    @GuardedBy("lock")

    /* renamed from: b */
    public String f36256b = "";
    @GuardedBy("lock")

    /* renamed from: c */
    public String f36257c = "";
    @GuardedBy("lock")

    /* renamed from: d */
    public boolean f36258d = false;
    @GuardedBy("lock")

    /* renamed from: e */
    public boolean f36259e = false;

    /* renamed from: f */
    public String f36260f = "";

    /* renamed from: g */
    public dh5 f36261g;

    /* renamed from: c */
    public static final String m1355c(Context context, String str, String str2) {
        String valueOf;
        String str3;
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzp().zzc(context, str2));
        f77 zzb = new zzbo(context).zzb(0, str, hashMap, null);
        try {
            return (String) zzb.get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10747l4)).intValue(), TimeUnit.MILLISECONDS);
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

    /* renamed from: a */
    public final void m1357a(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            zzs.zza.post(new es2(this, context, str, z, z2));
        } else {
            k04.zzi("Can not create dialog without Activity Context");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1356b(Context context, String str, String str2) {
        boolean z;
        String m1355c = m1355c(context, m1354d(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10714i4), str, str2).toString(), str2);
        if (TextUtils.isEmpty(m1355c)) {
            k04.zze("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(m1355c.trim());
            String optString = jSONObject.optString("gct");
            this.f36260f = jSONObject.optString("status");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10762m8)).booleanValue()) {
                if (!"0".equals(this.f36260f) && !"2".equals(this.f36260f)) {
                    z = false;
                    zzf(z);
                    zzg m11915h = com.google.android.gms.ads.internal.zzt.zzo().m11915h();
                    if (z) {
                        str = "";
                    }
                    m11915h.zzA(str);
                }
                z = true;
                zzf(z);
                zzg m11915h2 = com.google.android.gms.ads.internal.zzt.zzo().m11915h();
                if (z) {
                }
                m11915h2.zzA(str);
            }
            synchronized (this.f36255a) {
                this.f36257c = optString;
            }
            return true;
        } catch (JSONException e) {
            k04.zzk("Fail to get in app preview response json.", e);
            return false;
        }
    }

    /* renamed from: d */
    public final Uri m1354d(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f36255a) {
            if (TextUtils.isEmpty(this.f36256b)) {
                com.google.android.gms.ads.internal.zzt.zzp();
                try {
                    str5 = new String(xd0.m5224d(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (IOException unused) {
                    k04.zze("Error reading from internal storage.");
                    str5 = "";
                }
                this.f36256b = str5;
                if (TextUtils.isEmpty(str5)) {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    this.f36256b = UUID.randomUUID().toString();
                    com.google.android.gms.ads.internal.zzt.zzp();
                    String str6 = this.f36256b;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e) {
                        k04.zzh("Error writing to file in internal storage.", e);
                    }
                }
            }
            str4 = this.f36256b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    public final dh5 zza() {
        return this.f36261g;
    }

    public final String zzb() {
        String str;
        synchronized (this.f36255a) {
            str = this.f36257c;
        }
        return str;
    }

    public final void zzc(Context context) {
        dh5 dh5Var;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10762m8)).booleanValue() || (dh5Var = this.f36261g) == null) {
            return;
        }
        dh5Var.m24403h(new yp2(this, context), ch5.DEBUG_MENU);
    }

    public final void zzd(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzt.zzp();
        zzs.zzR(context, m1354d(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10703h4), str, str2));
    }

    public final void zze(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = m1354d(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10736k4), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzt.zzp();
        zzs.zzH(context, str, buildUpon.build().toString());
    }

    public final void zzf(boolean z) {
        synchronized (this.f36255a) {
            this.f36259e = z;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10762m8)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzo().m11915h().zzB(z);
                dh5 dh5Var = this.f36261g;
                if (dh5Var != null) {
                    dh5Var.m24401j(z);
                }
            }
        }
    }

    public final void zzg(dh5 dh5Var) {
        this.f36261g = dh5Var;
    }

    public final void zzh(boolean z) {
        synchronized (this.f36255a) {
            this.f36258d = z;
        }
    }

    public final boolean zzj(Context context, String str, String str2) {
        String m1355c = m1355c(context, m1354d(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10725j4), str, str2).toString(), str2);
        if (TextUtils.isEmpty(m1355c)) {
            k04.zze("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(m1355c.trim()).optString("debug_mode"));
            zzf(equals);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10762m8)).booleanValue()) {
                zzg m11915h = com.google.android.gms.ads.internal.zzt.zzo().m11915h();
                if (true != equals) {
                    str = "";
                }
                m11915h.zzA(str);
            }
            return equals;
        } catch (JSONException e) {
            k04.zzk("Fail to get debug mode response json.", e);
            return false;
        }
    }

    public final boolean zzl() {
        boolean z;
        synchronized (this.f36255a) {
            z = this.f36259e;
        }
        return z;
    }

    public final boolean zzm() {
        boolean z;
        synchronized (this.f36255a) {
            z = this.f36258d;
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
