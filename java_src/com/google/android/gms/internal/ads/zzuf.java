package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzuf extends zzus<zzwb> implements zzuo, zzuu {
    private final zzasv zzbpj;

    /* JADX WARN: Multi-variable type inference failed */
    public zzuf(Context context, zzang zzangVar) throws zzarg {
        try {
            zzasv zzasvVar = new zzasv(new zzash(context));
            this.zzbpj = zzasvVar;
            zzasvVar.setWillNotDraw(true);
            this.zzbpj.zza(new zzasx(this) { // from class: com.google.android.gms.internal.ads.zzug
                private final zzuf zzbpk;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbpk = this;
                }

                @Override // com.google.android.gms.internal.ads.zzasx
                public final boolean zza(zzasu zzasuVar) {
                    return this.zzbpk.zzf(zzasuVar.uri);
                }
            });
            this.zzbpj.zza(new zzasz(this) { // from class: com.google.android.gms.internal.ads.zzuh
                private final zzuf zzbpk;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbpk = this;
                }

                @Override // com.google.android.gms.internal.ads.zzasz
                public final void zzb(zzasu zzasuVar) {
                    this.zzbpk.zzf(zzasuVar.uri);
                }
            });
            this.zzbpj.addJavascriptInterface(new zzun(this), "GoogleJsInterface");
            com.google.android.gms.ads.internal.zzbv.zzek().zza(context, zzangVar.zzcw, this.zzbpj.getSettings());
        } catch (Throwable th) {
            throw new zzarg("Init failed.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void destroy() {
        this.zzbpj.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final /* bridge */ /* synthetic */ zzwb getReference() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zza(final zzuv zzuvVar) {
        this.zzbpj.zza(new zzata(zzuvVar) { // from class: com.google.android.gms.internal.ads.zzuk
            private final zzuv zzbpl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzbpl = zzuvVar;
            }

            @Override // com.google.android.gms.internal.ads.zzata
            public final void zzc(zzasu zzasuVar) {
                this.zzbpl.zzlx();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zza(String str, Map map) {
        zzup.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzue
    public final void zza(String str, JSONObject jSONObject) {
        zzup.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzve
    public final void zzb(String str, JSONObject jSONObject) {
        zzup.zza(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzbb(String str) {
        zzbc(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", str));
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzbc(final String str) {
        zzaoe.zzcvy.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzui
            private final zzuf zzbpk;
            private final String zzzo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzbpk = this;
                this.zzzo = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzbpk.zzbh(this.zzzo);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzbd(final String str) {
        zzaoe.zzcvy.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzuj
            private final zzuf zzbpk;
            private final String zzzo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzbpk = this;
                this.zzzo = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzbpk.zzbg(this.zzzo);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzve
    public final void zzbe(final String str) {
        zzaoe.zzcvy.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzul
            private final zzuf zzbpk;
            private final String zzzo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzbpk = this;
                this.zzzo = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzbpk.zzbf(this.zzzo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzbf(String str) {
        this.zzbpj.zzbe(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzbg(String str) {
        this.zzbpj.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzbh(String str) {
        this.zzbpj.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzf(String str, String str2) {
        zzup.zza(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final zzwc zzlw() {
        return new zzwd(this);
    }
}
