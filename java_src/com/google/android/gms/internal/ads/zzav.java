package com.google.android.gms.internal.ads;

import com.mpatric.mp3agic.EncodedText;
import java.io.UnsupportedEncodingException;
import java.util.Map;
/* loaded from: classes2.dex */
public class zzav extends zzr<String> {
    private final Object mLock;
    private zzz<String> zzck;

    public zzav(int i, String str, zzz<String> zzzVar, zzy zzyVar) {
        super(i, str, zzyVar);
        this.mLock = new Object();
        this.zzck = zzzVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzr
    public final zzx<String> zza(zzp zzpVar) {
        String str;
        try {
            byte[] bArr = zzpVar.data;
            Map<String, String> map = zzpVar.zzab;
            String str2 = EncodedText.CHARSET_ISO_8859_1;
            String str3 = map.get("Content-Type");
            if (str3 != null) {
                String[] split = str3.split(";");
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=");
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str2 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzpVar.data);
        }
        return zzx.zza(str, zzap.zzb(zzpVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzr
    /* renamed from: zzh */
    public void zza(String str) {
        zzz<String> zzzVar;
        synchronized (this.mLock) {
            zzzVar = this.zzck;
        }
        if (zzzVar != null) {
            zzzVar.zzb(str);
        }
    }
}
