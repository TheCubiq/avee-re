package com.daaw;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbsl;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class y46 implements i76 {

    /* renamed from: a */
    public final g77 f33358a;

    /* renamed from: b */
    public final ri6 f33359b;

    /* renamed from: c */
    public final PackageInfo f33360c;

    /* renamed from: d */
    public final zzg f33361d;

    public y46(g77 g77Var, ri6 ri6Var, PackageInfo packageInfo, zzg zzgVar) {
        this.f33358a = g77Var;
        this.f33359b = ri6Var;
        this.f33360c = packageInfo;
        this.f33361d = zzgVar;
    }

    /* renamed from: a */
    public static /* synthetic */ z46 m4125a(final y46 y46Var) {
        final ArrayList arrayList = y46Var.f33359b.f25347g;
        return arrayList == null ? new z46() { // from class: com.daaw.u46
            @Override // com.daaw.h76
            /* renamed from: b */
            public final void mo2851b(Object obj) {
                Bundle bundle = (Bundle) obj;
            }
        } : arrayList.isEmpty() ? new z46() { // from class: com.daaw.v46
            @Override // com.daaw.h76
            /* renamed from: b */
            public final void mo2851b(Object obj) {
                ((Bundle) obj).putInt("native_version", 0);
            }
        } : new z46() { // from class: com.daaw.w46
            @Override // com.daaw.h76
            /* renamed from: b */
            public final void mo2851b(Object obj) {
                y46.this.m4124b(arrayList, (Bundle) obj);
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fc, code lost:
        if (r9 == 3) goto L54;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void m4124b(ArrayList arrayList, Bundle bundle) {
        JSONArray optJSONArray;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", this.f33359b.f25348h);
        String str = "landscape";
        if (this.f33359b.f25349i.f36843p > 3) {
            bundle.putBoolean("enable_native_media_orientation", true);
            int i = this.f33359b.f25349i.f36850w;
            String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "square" : "portrait" : "landscape" : "any";
            if (!"unknown".equals(str2)) {
                bundle.putString("native_media_orientation", str2);
            }
        }
        int i2 = this.f33359b.f25349i.f36845r;
        if (i2 == 0) {
            str = "any";
        } else if (i2 == 1) {
            str = "portrait";
        } else if (i2 != 2) {
            str = "unknown";
        }
        if (!"unknown".equals(str)) {
            bundle.putString("native_image_orientation", str);
        }
        bundle.putBoolean("native_multiple_images", this.f33359b.f25349i.f36846s);
        bundle.putBoolean("use_custom_mute", this.f33359b.f25349i.f36849v);
        zzblz zzblzVar = this.f33359b.f25349i;
        if (zzblzVar.f36851x != 0) {
            bundle.putBoolean("sccg_tap", zzblzVar.f36852y);
            bundle.putInt("sccg_dir", this.f33359b.f25349i.f36851x);
        }
        PackageInfo packageInfo = this.f33360c;
        int i3 = packageInfo == null ? 0 : packageInfo.versionCode;
        if (i3 > this.f33361d.zza()) {
            this.f33361d.zzs();
            this.f33361d.zzv(i3);
        }
        JSONObject zzp = this.f33361d.zzp();
        String str3 = null;
        if (zzp != null && (optJSONArray = zzp.optJSONArray(this.f33359b.f25346f)) != null) {
            str3 = optJSONArray.toString();
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString("native_advanced_settings", str3);
        }
        int i4 = this.f33359b.f25351k;
        if (i4 > 1) {
            bundle.putInt("max_num_ads", i4);
        }
        zzbsl zzbslVar = this.f33359b.f25342b;
        if (zzbslVar != null) {
            if (TextUtils.isEmpty(zzbslVar.f36874r)) {
                String str4 = "p";
                if (zzbslVar.f36872p >= 2) {
                    int i5 = zzbslVar.f36875s;
                    if (i5 != 2) {
                    }
                    str4 = "l";
                    bundle.putString("ia_var", str4);
                } else {
                    int i6 = zzbslVar.f36873q;
                    if (i6 != 1) {
                        if (i6 != 2) {
                            k04.zzg("Instream ad video aspect ratio " + i6 + " is wrong.");
                        }
                        bundle.putString("ia_var", str4);
                    }
                    str4 = "l";
                    bundle.putString("ia_var", str4);
                }
            } else {
                bundle.putString("ad_tag", zzbslVar.f36874r);
            }
            bundle.putBoolean("instr", true);
        }
        if (this.f33359b.m11286a() != null) {
            bundle.putBoolean("has_delayed_banner_listener", true);
        }
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 26;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.f33358a.mo20112M(new Callable() { // from class: com.daaw.x46
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return y46.m4125a(y46.this);
            }
        });
    }
}
