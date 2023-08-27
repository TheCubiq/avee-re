package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
@zzadh
/* loaded from: classes.dex */
public final class zzalk {
    private final Object mLock = new Object();
    private String zzcsm = "";
    private String zzcsn = "";
    private boolean zzcso = false;
    private String zzcsp = "";

    private final void zza(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            zzakk.zzcrm.post(new zzall(this, context, str, z, z2));
        } else {
            zzakb.zzdj("Can not create dialog without Activity Context");
        }
    }

    private final String zzaz(Context context) {
        String str;
        synchronized (this.mLock) {
            if (TextUtils.isEmpty(this.zzcsm)) {
                com.google.android.gms.ads.internal.zzbv.zzek();
                String zzn = zzakk.zzn(context, "debug_signals_id.txt");
                this.zzcsm = zzn;
                if (TextUtils.isEmpty(zzn)) {
                    com.google.android.gms.ads.internal.zzbv.zzek();
                    this.zzcsm = zzakk.zzrh();
                    com.google.android.gms.ads.internal.zzbv.zzek();
                    zzakk.zze(context, "debug_signals_id.txt", this.zzcsm);
                }
            }
            str = this.zzcsm;
        }
        return str;
    }

    private final Uri zzc(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", zzaz(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    private final boolean zzh(Context context, String str, String str2) {
        String zzj = zzj(context, zzc(context, (String) zzkb.zzik().zzd(zznk.zzbeg), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzj)) {
            zzakb.zzck("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(zzj.trim());
            String optString = jSONObject.optString("gct");
            this.zzcsp = jSONObject.optString(NotificationCompat.CATEGORY_STATUS);
            synchronized (this.mLock) {
                this.zzcsn = optString;
            }
            return true;
        } catch (JSONException e) {
            zzakb.zzc("Fail to get in app preview response json.", e);
            return false;
        }
    }

    private final boolean zzi(Context context, String str, String str2) {
        String zzj = zzj(context, zzc(context, (String) zzkb.zzik().zzd(zznk.zzbeh), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzj)) {
            zzakb.zzck("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(zzj.trim()).optString("debug_mode"));
            synchronized (this.mLock) {
                this.zzcso = equals;
            }
            return equals;
        } catch (JSONException e) {
            zzakb.zzc("Fail to get debug mode response json.", e);
            return false;
        }
    }

    private static String zzj(Context context, String str, String str2) {
        String str3;
        String valueOf;
        String str4;
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractSpiCall.HEADER_USER_AGENT, com.google.android.gms.ads.internal.zzbv.zzek().zzm(context, str2));
        zzanz<String> zzc = new zzalt(context).zzc(str, hashMap);
        try {
            return zzc.get(((Integer) zzkb.zzik().zzd(zznk.zzbej)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            str3 = "Interrupted while retriving a response from: ";
            valueOf = String.valueOf(str);
            if (valueOf.length() == 0) {
                str4 = new String("Interrupted while retriving a response from: ");
                zzakb.zzb(str4, e);
                zzc.cancel(true);
                return null;
            }
            str4 = str3.concat(valueOf);
            zzakb.zzb(str4, e);
            zzc.cancel(true);
            return null;
        } catch (TimeoutException e2) {
            e = e2;
            str3 = "Timeout while retriving a response from: ";
            valueOf = String.valueOf(str);
            if (valueOf.length() == 0) {
                str4 = new String("Timeout while retriving a response from: ");
                zzakb.zzb(str4, e);
                zzc.cancel(true);
                return null;
            }
            str4 = str3.concat(valueOf);
            zzakb.zzb(str4, e);
            zzc.cancel(true);
            return null;
        } catch (Exception e3) {
            String valueOf2 = String.valueOf(str);
            zzakb.zzb(valueOf2.length() != 0 ? "Error retriving a response from: ".concat(valueOf2) : new String("Error retriving a response from: "), e3);
            return null;
        }
    }

    private final void zzk(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzbv.zzek();
        zzakk.zza(context, zzc(context, (String) zzkb.zzik().zzd(zznk.zzbef), str, str2));
    }

    public final void zza(Context context, String str, String str2, @Nullable String str3) {
        boolean zzrx = zzrx();
        if (!zzi(context, str, str2)) {
            zzk(context, str, str2);
            return;
        }
        if (!zzrx && !TextUtils.isEmpty(str3)) {
            zzb(context, str2, str3, str);
        }
        zzakb.zzck("Device is linked for debug signals.");
        zza(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    public final void zzb(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = zzc(context, (String) zzkb.zzik().zzd(zznk.zzbei), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzbv.zzek();
        zzakk.zzd(context, str, buildUpon.build().toString());
    }

    public final void zzg(Context context, String str, String str2) {
        if (!zzh(context, str, str2)) {
            zza(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(this.zzcsp)) {
            zzakb.zzck("Creative is not pushed for this device.");
            zza(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(this.zzcsp)) {
            zzakb.zzck("The app is not linked for creative preview.");
            zzk(context, str, str2);
        } else if ("0".equals(this.zzcsp)) {
            zzakb.zzck("Device is linked for in app preview.");
            zza(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final String zzrw() {
        String str;
        synchronized (this.mLock) {
            str = this.zzcsn;
        }
        return str;
    }

    public final boolean zzrx() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzcso;
        }
        return z;
    }
}
