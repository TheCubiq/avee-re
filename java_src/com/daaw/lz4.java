package com.daaw;

import com.google.android.gms.ads.VideoController;
import java.util.Set;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class lz4 extends kw4 {
    @GuardedBy("this")
    public boolean q;

    public lz4(Set set) {
        super(set);
    }

    public final void zza() {
        B0(new jw4() { // from class: com.daaw.hz4
            @Override // com.daaw.jw4
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
            }
        });
    }

    public final void zzb() {
        B0(new jw4() { // from class: com.daaw.jz4
            @Override // com.daaw.jw4
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
            }
        });
    }

    public final synchronized void zzc() {
        if (!this.q) {
            B0(iz4.a);
            this.q = true;
        }
        B0(new jw4() { // from class: com.daaw.kz4
            @Override // com.daaw.jw4
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
            }
        });
    }

    public final synchronized void zzd() {
        B0(iz4.a);
        this.q = true;
    }
}
