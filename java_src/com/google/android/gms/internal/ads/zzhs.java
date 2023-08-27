package com.google.android.gms.internal.ads;

import android.os.Environment;
import com.google.android.gms.internal.ads.zzhu;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@zzadh
/* loaded from: classes2.dex */
public final class zzhs {
    private final zzhx zzakc;
    private final zzii zzakd;
    private final boolean zzake;

    private zzhs() {
        this.zzake = false;
        this.zzakc = new zzhx();
        this.zzakd = new zzii();
        zzhn();
    }

    public zzhs(zzhx zzhxVar) {
        this.zzakc = zzhxVar;
        this.zzake = ((Boolean) zzkb.zzik().zzd(zznk.zzbeo)).booleanValue();
        this.zzakd = new zzii();
        zzhn();
    }

    private final synchronized void zzb(zzhu.zza.zzb zzbVar) {
        this.zzakd.zzanl = zzho();
        this.zzakc.zzd(zzbfi.zzb(this.zzakd)).zzs(zzbVar.zzhq()).zzbd();
        String valueOf = String.valueOf(Integer.toString(zzbVar.zzhq(), 10));
        zzakb.v(valueOf.length() != 0 ? "Logging Event with event code : ".concat(valueOf) : new String("Logging Event with event code : "));
    }

    private final synchronized void zzc(zzhu.zza.zzb zzbVar) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(zzd(zzbVar).getBytes());
                    fileOutputStream.write(10);
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        zzakb.v("Could not close Clearcut output stream.");
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        zzakb.v("Could not close Clearcut output stream.");
                    }
                    throw th;
                }
            } catch (IOException unused3) {
                zzakb.v("Could not write Clearcut to file.");
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    zzakb.v("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused5) {
            zzakb.v("Could not find file for Clearcut");
        }
    }

    private final synchronized String zzd(zzhu.zza.zzb zzbVar) {
        return String.format("id=%s,timestamp=%s,event=%s", this.zzakd.zzanh, Long.valueOf(com.google.android.gms.ads.internal.zzbv.zzer().elapsedRealtime()), Integer.valueOf(zzbVar.zzhq()));
    }

    public static zzhs zzhm() {
        return new zzhs();
    }

    private final synchronized void zzhn() {
        this.zzakd.zzanp = new zzib();
        this.zzakd.zzanp.zzalw = new zzie();
        this.zzakd.zzanm = new zzig();
    }

    private static long[] zzho() {
        int i;
        List<String> zzjc = zznk.zzjc();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = zzjc.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String[] split = it.next().split(",");
            int length = split.length;
            while (i < length) {
                try {
                    arrayList.add(Long.valueOf(split[i]));
                } catch (NumberFormatException unused) {
                    zzakb.v("Experiment ID is not a number");
                }
                i++;
            }
        }
        long[] jArr = new long[arrayList.size()];
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            jArr[i2] = ((Long) obj).longValue();
            i2++;
        }
        return jArr;
    }

    public final synchronized void zza(zzht zzhtVar) {
        if (this.zzake) {
            try {
                zzhtVar.zza(this.zzakd);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzbv.zzeo().zza(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zza(zzhu.zza.zzb zzbVar) {
        if (this.zzake) {
            if (((Boolean) zzkb.zzik().zzd(zznk.zzbep)).booleanValue()) {
                zzc(zzbVar);
            } else {
                zzb(zzbVar);
            }
        }
    }
}
