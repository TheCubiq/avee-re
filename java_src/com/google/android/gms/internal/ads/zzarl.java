package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;
@zzadh
/* loaded from: classes2.dex */
public final class zzarl extends zzlp {
    private boolean zzatp;
    private boolean zzatq;
    private zzlr zzbuq;
    private final zzapw zzcyg;
    private final boolean zzded;
    private final boolean zzdee;
    private final float zzdef;
    private int zzdeg;
    private boolean zzdeh;
    private float zzdej;
    private float zzdek;
    private final Object lock = new Object();
    private boolean zzdei = true;
    private boolean zzato = true;

    public zzarl(zzapw zzapwVar, float f, boolean z, boolean z2) {
        this.zzcyg = zzapwVar;
        this.zzdef = f;
        this.zzded = z;
        this.zzdee = z2;
    }

    private final void zzf(String str, Map<String, String> map) {
        final HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzaoe.zzcvy.execute(new Runnable(this, hashMap) { // from class: com.google.android.gms.internal.ads.zzarm
            private final Map zzbjl;
            private final zzarl zzdel;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdel = this;
                this.zzbjl = hashMap;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzdel.zzo(this.zzbjl);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final float getAspectRatio() {
        float f;
        synchronized (this.lock) {
            f = this.zzdek;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final int getPlaybackState() {
        int i;
        synchronized (this.lock) {
            i = this.zzdeg;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final boolean isClickToExpandEnabled() {
        boolean z;
        boolean isCustomControlsEnabled = isCustomControlsEnabled();
        synchronized (this.lock) {
            if (!isCustomControlsEnabled) {
                try {
                    z = (this.zzatq && this.zzdee) ? true : true;
                } finally {
                }
            }
            z = false;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final boolean isCustomControlsEnabled() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzded && this.zzatp;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final boolean isMuted() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzdei;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final void mute(boolean z) {
        zzf(z ? "mute" : "unmute", null);
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final void pause() {
        zzf("pause", null);
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final void play() {
        zzf("play", null);
    }

    public final void zza(float f, final int i, final boolean z, float f2) {
        final boolean z2;
        final int i2;
        synchronized (this.lock) {
            this.zzdej = f;
            z2 = this.zzdei;
            this.zzdei = z;
            i2 = this.zzdeg;
            this.zzdeg = i;
            float f3 = this.zzdek;
            this.zzdek = f2;
            if (Math.abs(f2 - f3) > 1.0E-4f) {
                this.zzcyg.getView().invalidate();
            }
        }
        zzaoe.zzcvy.execute(new Runnable(this, i2, i, z2, z) { // from class: com.google.android.gms.internal.ads.zzarn
            private final int zzcsi;
            private final int zzcsj;
            private final boolean zzdcp;
            private final boolean zzdcq;
            private final zzarl zzdel;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdel = this;
                this.zzcsi = i2;
                this.zzcsj = i;
                this.zzdcp = z2;
                this.zzdcq = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzdel.zza(this.zzcsi, this.zzcsj, this.zzdcp, this.zzdcq);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(int i, int i2, boolean z, boolean z2) {
        synchronized (this.lock) {
            boolean z3 = false;
            boolean z4 = i != i2;
            boolean z5 = !this.zzdeh && i2 == 1;
            boolean z6 = z4 && i2 == 1;
            boolean z7 = z4 && i2 == 2;
            boolean z8 = z4 && i2 == 3;
            boolean z9 = z != z2;
            this.zzdeh = (this.zzdeh || z5) ? true : true;
            if (this.zzbuq == null) {
                return;
            }
            if (z5) {
                try {
                    this.zzbuq.onVideoStart();
                } catch (RemoteException e) {
                    zzakb.zzc("Unable to call onVideoStart()", e);
                }
            }
            if (z6) {
                try {
                    this.zzbuq.onVideoPlay();
                } catch (RemoteException e2) {
                    zzakb.zzc("Unable to call onVideoPlay()", e2);
                }
            }
            if (z7) {
                try {
                    this.zzbuq.onVideoPause();
                } catch (RemoteException e3) {
                    zzakb.zzc("Unable to call onVideoPause()", e3);
                }
            }
            if (z8) {
                try {
                    this.zzbuq.onVideoEnd();
                } catch (RemoteException e4) {
                    zzakb.zzc("Unable to call onVideoEnd()", e4);
                }
            }
            if (z9) {
                try {
                    this.zzbuq.onVideoMute(z2);
                } catch (RemoteException e5) {
                    zzakb.zzc("Unable to call onVideoMute()", e5);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final void zza(zzlr zzlrVar) {
        synchronized (this.lock) {
            this.zzbuq = zzlrVar;
        }
    }

    public final void zzb(zzmu zzmuVar) {
        synchronized (this.lock) {
            this.zzato = zzmuVar.zzato;
            this.zzatp = zzmuVar.zzatp;
            this.zzatq = zzmuVar.zzatq;
        }
        zzf("initialState", CollectionUtils.mapOf("muteStart", zzmuVar.zzato ? "1" : "0", "customControlsRequested", zzmuVar.zzatp ? "1" : "0", "clickToExpandRequested", zzmuVar.zzatq ? "1" : "0"));
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final float zzim() {
        return this.zzdef;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final float zzin() {
        float f;
        synchronized (this.lock) {
            f = this.zzdej;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final zzlr zzio() throws RemoteException {
        zzlr zzlrVar;
        synchronized (this.lock) {
            zzlrVar = this.zzbuq;
        }
        return zzlrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(Map map) {
        this.zzcyg.zza("pubVideoCmd", map);
    }
}
