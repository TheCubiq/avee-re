package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzalx implements zzy {
    private final /* synthetic */ String zzcce;
    private final /* synthetic */ zzama zzctj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzalx(zzalt zzaltVar, String str, zzama zzamaVar) {
        this.zzcce = str;
        this.zzctj = zzamaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzy
    public final void zzd(zzae zzaeVar) {
        String str = this.zzcce;
        String zzaeVar2 = zzaeVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(zzaeVar2).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(zzaeVar2);
        zzakb.zzdk(sb.toString());
        this.zzctj.zzb(null);
    }
}
