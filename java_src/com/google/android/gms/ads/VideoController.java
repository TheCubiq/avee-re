package com.google.android.gms.ads;

import android.os.RemoteException;
import com.daaw.k04;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzfk;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;

    /* renamed from: a */
    public final Object f36040a = new Object();
    @GuardedBy("lock")

    /* renamed from: b */
    public zzdq f36041b;
    @GuardedBy("lock")

    /* renamed from: c */
    public VideoLifecycleCallbacks f36042c;

    /* loaded from: classes.dex */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public int getPlaybackState() {
        synchronized (this.f36040a) {
            zzdq zzdqVar = this.f36041b;
            if (zzdqVar == null) {
                return 0;
            }
            try {
                return zzdqVar.zzh();
            } catch (RemoteException e) {
                k04.zzh("Unable to call getPlaybackState on video controller.", e);
                return 0;
            }
        }
    }

    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.f36040a) {
            videoLifecycleCallbacks = this.f36042c;
        }
        return videoLifecycleCallbacks;
    }

    public boolean hasVideoContent() {
        boolean z;
        synchronized (this.f36040a) {
            z = this.f36041b != null;
        }
        return z;
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.f36040a) {
            zzdq zzdqVar = this.f36041b;
            if (zzdqVar == null) {
                return false;
            }
            try {
                return zzdqVar.zzo();
            } catch (RemoteException e) {
                k04.zzh("Unable to call isClickToExpandEnabled.", e);
                return false;
            }
        }
    }

    public boolean isCustomControlsEnabled() {
        synchronized (this.f36040a) {
            zzdq zzdqVar = this.f36041b;
            if (zzdqVar == null) {
                return false;
            }
            try {
                return zzdqVar.zzp();
            } catch (RemoteException e) {
                k04.zzh("Unable to call isUsingCustomPlayerControls.", e);
                return false;
            }
        }
    }

    public boolean isMuted() {
        synchronized (this.f36040a) {
            zzdq zzdqVar = this.f36041b;
            if (zzdqVar == null) {
                return true;
            }
            try {
                return zzdqVar.zzq();
            } catch (RemoteException e) {
                k04.zzh("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }

    public void mute(boolean z) {
        synchronized (this.f36040a) {
            zzdq zzdqVar = this.f36041b;
            if (zzdqVar != null) {
                try {
                    zzdqVar.zzj(z);
                } catch (RemoteException e) {
                    k04.zzh("Unable to call mute on video controller.", e);
                }
            }
        }
    }

    public void pause() {
        synchronized (this.f36040a) {
            zzdq zzdqVar = this.f36041b;
            if (zzdqVar != null) {
                try {
                    zzdqVar.zzk();
                } catch (RemoteException e) {
                    k04.zzh("Unable to call pause on video controller.", e);
                }
            }
        }
    }

    public void play() {
        synchronized (this.f36040a) {
            zzdq zzdqVar = this.f36041b;
            if (zzdqVar != null) {
                try {
                    zzdqVar.zzl();
                } catch (RemoteException e) {
                    k04.zzh("Unable to call play on video controller.", e);
                }
            }
        }
    }

    public void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        zzfk zzfkVar;
        synchronized (this.f36040a) {
            this.f36042c = videoLifecycleCallbacks;
            zzdq zzdqVar = this.f36041b;
            if (zzdqVar != null) {
                if (videoLifecycleCallbacks == null) {
                    zzfkVar = null;
                } else {
                    try {
                        zzfkVar = new zzfk(videoLifecycleCallbacks);
                    } catch (RemoteException e) {
                        k04.zzh("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                    }
                }
                zzdqVar.zzm(zzfkVar);
            }
        }
    }

    public void stop() {
        synchronized (this.f36040a) {
            zzdq zzdqVar = this.f36041b;
            if (zzdqVar != null) {
                try {
                    zzdqVar.zzn();
                } catch (RemoteException e) {
                    k04.zzh("Unable to call stop on video controller.", e);
                }
            }
        }
    }

    public final zzdq zza() {
        zzdq zzdqVar;
        synchronized (this.f36040a) {
            zzdqVar = this.f36041b;
        }
        return zzdqVar;
    }

    public final void zzb(zzdq zzdqVar) {
        synchronized (this.f36040a) {
            this.f36041b = zzdqVar;
            VideoLifecycleCallbacks videoLifecycleCallbacks = this.f36042c;
            if (videoLifecycleCallbacks != null) {
                setVideoLifecycleCallbacks(videoLifecycleCallbacks);
            }
        }
    }
}
