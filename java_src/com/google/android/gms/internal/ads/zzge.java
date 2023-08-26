package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzge {
    private final int zzagx;
    private final int zzagy;
    private final int zzagz;
    private final zzgr zzaha;
    private final zzha zzahb;
    private int zzahi;
    private final Object mLock = new Object();
    private ArrayList<String> zzahc = new ArrayList<>();
    private ArrayList<String> zzahd = new ArrayList<>();
    private ArrayList<zzgp> zzahe = new ArrayList<>();
    private int zzahf = 0;
    private int zzahg = 0;
    private int zzahh = 0;
    private String zzahj = "";
    private String zzahk = "";
    private String zzahl = "";

    public zzge(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.zzagx = i;
        this.zzagy = i2;
        this.zzagz = i3;
        this.zzaha = new zzgr(i4);
        this.zzahb = new zzha(i5, i6, i7);
    }

    private static String zza(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            String str = arrayList2.get(i2);
            i2++;
            sb.append(str);
            sb.append(' ');
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    private final void zzc(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str == null || str.length() < this.zzagz) {
            return;
        }
        synchronized (this.mLock) {
            this.zzahc.add(str);
            this.zzahf += str.length();
            if (z) {
                this.zzahd.add(str);
                this.zzahe.add(new zzgp(f, f2, f3, f4, this.zzahd.size() - 1));
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzge) {
            if (obj == this) {
                return true;
            }
            String str = ((zzge) obj).zzahj;
            return str != null && str.equals(this.zzahj);
        }
        return false;
    }

    public final int getScore() {
        return this.zzahi;
    }

    public final String getSignature() {
        return this.zzahj;
    }

    public final int hashCode() {
        return this.zzahj.hashCode();
    }

    public final String toString() {
        int i = this.zzahg;
        int i2 = this.zzahi;
        int i3 = this.zzahf;
        String zza = zza(this.zzahc, 100);
        String zza2 = zza(this.zzahd, 100);
        String str = this.zzahj;
        String str2 = this.zzahk;
        String str3 = this.zzahl;
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 165 + String.valueOf(zza2).length() + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i);
        sb.append(" score:");
        sb.append(i2);
        sb.append(" total_length:");
        sb.append(i3);
        sb.append("\n text: ");
        sb.append(zza);
        sb.append("\n viewableText");
        sb.append(zza2);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }

    public final void zza(String str, boolean z, float f, float f2, float f3, float f4) {
        zzc(str, z, f, f2, f3, f4);
        synchronized (this.mLock) {
            if (this.zzahh < 0) {
                zzakb.zzck("ActivityContent: negative number of WebViews.");
            }
            zzgt();
        }
    }

    public final void zzb(String str, boolean z, float f, float f2, float f3, float f4) {
        zzc(str, z, f, f2, f3, f4);
    }

    public final boolean zzgn() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzahh == 0;
        }
        return z;
    }

    public final String zzgo() {
        return this.zzahk;
    }

    public final String zzgp() {
        return this.zzahl;
    }

    public final void zzgq() {
        synchronized (this.mLock) {
            this.zzahi -= 100;
        }
    }

    public final void zzgr() {
        synchronized (this.mLock) {
            this.zzahh--;
        }
    }

    public final void zzgs() {
        synchronized (this.mLock) {
            this.zzahh++;
        }
    }

    public final void zzgt() {
        synchronized (this.mLock) {
            int i = (this.zzahf * this.zzagx) + (this.zzahg * this.zzagy);
            if (i > this.zzahi) {
                this.zzahi = i;
                if (((Boolean) zzkb.zzik().zzd(zznk.zzawq)).booleanValue() && !com.google.android.gms.ads.internal.zzbv.zzeo().zzqh().zzqu()) {
                    this.zzahj = this.zzaha.zza(this.zzahc);
                    this.zzahk = this.zzaha.zza(this.zzahd);
                }
                if (((Boolean) zzkb.zzik().zzd(zznk.zzaws)).booleanValue() && !com.google.android.gms.ads.internal.zzbv.zzeo().zzqh().zzqw()) {
                    this.zzahl = this.zzahb.zza(this.zzahd, this.zzahe);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzgu() {
        return this.zzahf;
    }

    public final void zzo(int i) {
        this.zzahg = i;
    }
}
