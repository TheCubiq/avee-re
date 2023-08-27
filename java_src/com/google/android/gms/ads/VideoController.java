package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzane;
import com.google.android.gms.internal.ads.zzlo;
import com.google.android.gms.internal.ads.zzmt;
@zzadh
/* loaded from: classes.dex */
public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final Object mLock = new Object();
    private zzlo zzux;
    private VideoLifecycleCallbacks zzuy;

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

    public final float getAspectRatio() {
        synchronized (this.mLock) {
            if (this.zzux == null) {
                return 0.0f;
            }
            try {
                return this.zzux.getAspectRatio();
            } catch (RemoteException e) {
                zzane.zzb("Unable to call getAspectRatio on video controller.", e);
                return 0.0f;
            }
        }
    }

    public final int getPlaybackState() {
        synchronized (this.mLock) {
            if (this.zzux == null) {
                return 0;
            }
            try {
                return this.zzux.getPlaybackState();
            } catch (RemoteException e) {
                zzane.zzb("Unable to call getPlaybackState on video controller.", e);
                return 0;
            }
        }
    }

    public final VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.mLock) {
            videoLifecycleCallbacks = this.zzuy;
        }
        return videoLifecycleCallbacks;
    }

    public final boolean hasVideoContent() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzux != null;
        }
        return z;
    }

    public final boolean isClickToExpandEnabled() {
        synchronized (this.mLock) {
            if (this.zzux == null) {
                return false;
            }
            try {
                return this.zzux.isClickToExpandEnabled();
            } catch (RemoteException e) {
                zzane.zzb("Unable to call isClickToExpandEnabled.", e);
                return false;
            }
        }
    }

    public final boolean isCustomControlsEnabled() {
        synchronized (this.mLock) {
            if (this.zzux == null) {
                return false;
            }
            try {
                return this.zzux.isCustomControlsEnabled();
            } catch (RemoteException e) {
                zzane.zzb("Unable to call isUsingCustomPlayerControls.", e);
                return false;
            }
        }
    }

    public final boolean isMuted() {
        synchronized (this.mLock) {
            if (this.zzux == null) {
                return true;
            }
            try {
                return this.zzux.isMuted();
            } catch (RemoteException e) {
                zzane.zzb("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }

    public final void mute(boolean z) {
        synchronized (this.mLock) {
            if (this.zzux == null) {
                return;
            }
            try {
                this.zzux.mute(z);
            } catch (RemoteException e) {
                zzane.zzb("Unable to call mute on video controller.", e);
            }
        }
    }

    public final void pause() {
        synchronized (this.mLock) {
            if (this.zzux == null) {
                return;
            }
            try {
                this.zzux.pause();
            } catch (RemoteException e) {
                zzane.zzb("Unable to call pause on video controller.", e);
            }
        }
    }

    public final void play() {
        synchronized (this.mLock) {
            if (this.zzux == null) {
                return;
            }
            try {
                this.zzux.play();
            } catch (RemoteException e) {
                zzane.zzb("Unable to call play on video controller.", e);
            }
        }
    }

    public final void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        Preconditions.checkNotNull(videoLifecycleCallbacks, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.mLock) {
            this.zzuy = videoLifecycleCallbacks;
            if (this.zzux == null) {
                return;
            }
            try {
                this.zzux.zza(new zzmt(videoLifecycleCallbacks));
            } catch (RemoteException e) {
                zzane.zzb("Unable to call setVideoLifecycleCallbacks on video controller.", e);
            }
        }
    }

    public final void zza(zzlo zzloVar) {
        synchronized (this.mLock) {
            this.zzux = zzloVar;
            if (this.zzuy != null) {
                setVideoLifecycleCallbacks(this.zzuy);
            }
        }
    }

    public final zzlo zzbc() {
        zzlo zzloVar;
        synchronized (this.mLock) {
            zzloVar = this.zzux;
        }
        return zzloVar;
    }
}
