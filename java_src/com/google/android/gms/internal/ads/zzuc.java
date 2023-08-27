package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
/* JADX INFO: Access modifiers changed from: package-private */
@zzadh
/* loaded from: classes2.dex */
public final class zzuc {
    final zzjj zzaao;
    final int zzbop;
    final String zzye;

    private zzuc(zzjj zzjjVar, String str, int i) {
        this.zzaao = zzjjVar;
        this.zzye = str;
        this.zzbop = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzuc(zzty zztyVar) {
        this(zztyVar.zzlf(), zztyVar.getAdUnitId(), zztyVar.getNetworkType());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzuc zzba(String str) throws IOException {
        String[] split = str.split("\u0000");
        if (split.length == 3) {
            Parcel obtain = Parcel.obtain();
            try {
                try {
                    String str2 = new String(Base64.decode(split[0], 0), "UTF-8");
                    int parseInt = Integer.parseInt(split[1]);
                    byte[] decode = Base64.decode(split[2], 0);
                    obtain.unmarshall(decode, 0, decode.length);
                    obtain.setDataPosition(0);
                    return new zzuc(zzjj.CREATOR.createFromParcel(obtain), str2, parseInt);
                } finally {
                    obtain.recycle();
                }
            } catch (SafeParcelReader.ParseException | IllegalArgumentException | IllegalStateException e) {
                com.google.android.gms.ads.internal.zzbv.zzeo().zza(e, "QueueSeed.decode");
                throw new IOException("Malformed QueueSeed encoding.", e);
            }
        }
        throw new IOException("Incorrect field count for QueueSeed.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzlu() {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                String encodeToString = Base64.encodeToString(this.zzye.getBytes("UTF-8"), 0);
                String num = Integer.toString(this.zzbop);
                this.zzaao.writeToParcel(obtain, 0);
                String encodeToString2 = Base64.encodeToString(obtain.marshall(), 0);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 2 + String.valueOf(num).length() + String.valueOf(encodeToString2).length());
                sb.append(encodeToString);
                sb.append("\u0000");
                sb.append(num);
                sb.append("\u0000");
                sb.append(encodeToString2);
                return sb.toString();
            } catch (UnsupportedEncodingException unused) {
                zzakb.e("QueueSeed encode failed because UTF-8 is not available.");
                obtain.recycle();
                return "";
            }
        } finally {
            obtain.recycle();
        }
    }
}
