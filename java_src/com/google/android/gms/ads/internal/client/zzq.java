package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.daaw.d04;
import com.daaw.z71;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final zzq[] zzg;
    public final boolean zzh;
    public final boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public boolean zzl;
    public boolean zzm;
    public boolean zzn;
    public boolean zzo;

    public zzq() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public zzq(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzq(Context context, AdSize[] adSizeArr) {
        int height;
        int i;
        String str;
        int i2;
        double d;
        double d2;
        DisplayMetrics displayMetrics;
        AdSize adSize = adSizeArr[0];
        this.zzd = false;
        boolean isFluid = adSize.isFluid();
        this.zzi = isFluid;
        this.zzm = com.google.android.gms.ads.zzb.zzf(adSize);
        this.zzn = com.google.android.gms.ads.zzb.zzg(adSize);
        boolean zzh = com.google.android.gms.ads.zzb.zzh(adSize);
        this.zzo = zzh;
        if (isFluid) {
            AdSize adSize2 = AdSize.BANNER;
            this.zze = adSize2.getWidth();
            height = adSize2.getHeight();
        } else if (this.zzn) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzb.zza(adSize);
        } else if (zzh) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzb.zzb(adSize);
        } else {
            this.zze = adSize.getWidth();
            height = adSize.getHeight();
        }
        this.zzb = height;
        boolean z = this.zze == -1;
        boolean z2 = height == -2;
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        if (z) {
            zzay.zzb();
            if (context.getResources().getConfiguration().orientation == 2) {
                if (((int) (displayMetrics.heightPixels / context.getResources().getDisplayMetrics().density)) < 600) {
                    zzay.zzb();
                    DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics3);
                        int i3 = displayMetrics3.heightPixels;
                        int i4 = displayMetrics3.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics3);
                        int i5 = displayMetrics3.heightPixels;
                        int i6 = displayMetrics3.widthPixels;
                        if (i5 == i3 && i6 == i4) {
                            int i7 = displayMetrics2.widthPixels;
                            zzay.zzb();
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            i2 = i7 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.zzf = i2;
                            d = i2 / displayMetrics2.density;
                            i = (int) d;
                            d2 = i;
                            Double.isNaN(d);
                            Double.isNaN(d2);
                            if (d - d2 >= 0.01d) {
                                i++;
                            }
                        }
                    }
                }
            }
            i2 = displayMetrics2.widthPixels;
            this.zzf = i2;
            d = i2 / displayMetrics2.density;
            i = (int) d;
            d2 = i;
            Double.isNaN(d);
            Double.isNaN(d2);
            if (d - d2 >= 0.01d) {
            }
        } else {
            i = this.zze;
            zzay.zzb();
            this.zzf = d04.m24810v(displayMetrics2, this.zze);
        }
        int m1390h = z2 ? m1390h(displayMetrics2) : this.zzb;
        zzay.zzb();
        this.zzc = d04.m24810v(displayMetrics2, m1390h);
        if (z || z2) {
            str = i + "x" + m1390h + "_as";
        } else if (this.zzn || this.zzo) {
            str = this.zze + "x" + this.zzb + "_as";
        } else {
            str = isFluid ? "320x50_mb" : adSize.toString();
        }
        this.zza = str;
        int length = adSizeArr.length;
        if (length > 1) {
            this.zzg = new zzq[length];
            for (int i8 = 0; i8 < adSizeArr.length; i8++) {
                this.zzg[i8] = new zzq(context, adSizeArr[i8]);
            }
        } else {
            this.zzg = null;
        }
        this.zzh = false;
        this.zzj = false;
    }

    public zzq(String str, int i, int i2, boolean z, int i3, int i4, zzq[] zzqVarArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = zzqVarArr;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = z4;
        this.zzk = z5;
        this.zzl = z6;
        this.zzm = z7;
        this.zzn = z8;
        this.zzo = z9;
    }

    /* renamed from: h */
    public static int m1390h(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    public static int zza(DisplayMetrics displayMetrics) {
        return (int) (m1390h(displayMetrics) * displayMetrics.density);
    }

    public static zzq zzb() {
        return new zzq("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static zzq zzc() {
        return new zzq("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static zzq zzd() {
        return new zzq("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static zzq zze() {
        return new zzq("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2717q(parcel, 2, this.zza, false);
        z71.m2723k(parcel, 3, this.zzb);
        z71.m2723k(parcel, 4, this.zzc);
        z71.m2731c(parcel, 5, this.zzd);
        z71.m2723k(parcel, 6, this.zze);
        z71.m2723k(parcel, 7, this.zzf);
        z71.m2714t(parcel, 8, this.zzg, i, false);
        z71.m2731c(parcel, 9, this.zzh);
        z71.m2731c(parcel, 10, this.zzi);
        z71.m2731c(parcel, 11, this.zzj);
        z71.m2731c(parcel, 12, this.zzk);
        z71.m2731c(parcel, 13, this.zzl);
        z71.m2731c(parcel, 14, this.zzm);
        z71.m2731c(parcel, 15, this.zzn);
        z71.m2731c(parcel, 16, this.zzo);
        z71.m2732b(parcel, m2733a);
    }
}
