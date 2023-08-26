.class public interface abstract Lcom/daaw/avee/comp/playback/IMediaPlayerCore;
.super Ljava/lang/Object;
.source "IMediaPlayerCore.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;
    }
.end annotation


# static fields
.field public static final Empty:Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

.field public static final MP_VIDEO_SCALING_MODE_SCALE_TO_FIT:I = 0x1

.field public static final MP_VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING:I = 0x2


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    new-instance v0, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$1;

    invoke-direct {v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->Empty:Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    return-void
.end method


# virtual methods
.method public abstract containsVideoTrack()Z
.end method

.method public abstract destroyOld()V
.end method

.method public abstract duration()J
.end method

.method public abstract getEqualizerDesc()Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;
.end method

.method public abstract getPlayingMediaInfo()Lcom/daaw/avee/comp/playback/PlayingMediaInfo;
.end method

.method public abstract getVisualizationData(Lcom/daaw/avee/comp/playback/AudioFrameData;Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;)Lcom/daaw/avee/comp/playback/AudioFrameData;
.end method

.method public abstract isMuted()Z
.end method

.method public abstract isPreparingOrAbove()Z
.end method

.method public abstract isPreparingOrStared()Z
.end method

.method public abstract pause()V
.end method

.method public abstract playNext(ZZFJ)V
.end method

.method public abstract position()J
.end method

.method public abstract release()V
.end method

.method public abstract resetVisualizer()V
.end method

.method public abstract seek(J)V
.end method

.method public abstract setEqualizerSettings(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;)V
.end method

.method public abstract setFadeVolume(FI)V
.end method

.method public abstract setFadeVolumeRelative(FI)Z
.end method

.method public abstract setMute(Z)V
.end method

.method public abstract setNextDataSource(Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;)V
.end method

.method public abstract setNotifyListener(Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;)V
.end method

.method public abstract setVideoScalingMode(I)V
.end method

.method public abstract setVideoSurfaceHolder(Landroid/view/SurfaceHolder;)V
.end method

.method public abstract setVolume(F)V
.end method

.method public abstract setVolumeStereoBalance(F)V
.end method

.method public abstract start()V
.end method

.method public abstract stop()V
.end method
