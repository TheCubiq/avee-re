.class final Lcom/daaw/avee/comp/playback/IMediaPlayerCore$1;
.super Ljava/lang/Object;
.source "IMediaPlayerCore.java"

# interfaces
.implements Lcom/daaw/avee/comp/playback/IMediaPlayerCore;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/IMediaPlayerCore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public containsVideoTrack()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public destroyOld()V
    .locals 0

    return-void
.end method

.method public duration()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getEqualizerDesc()Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getPlayingMediaInfo()Lcom/daaw/avee/comp/playback/PlayingMediaInfo;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getVisualizationData(Lcom/daaw/avee/comp/playback/AudioFrameData;Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;)Lcom/daaw/avee/comp/playback/AudioFrameData;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public isMuted()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isPreparingOrAbove()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isPreparingOrStared()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public pause()V
    .locals 0

    return-void
.end method

.method public playNext(ZZFJ)V
    .locals 0

    return-void
.end method

.method public position()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public release()V
    .locals 0

    return-void
.end method

.method public resetVisualizer()V
    .locals 0

    return-void
.end method

.method public seek(J)V
    .locals 0

    return-void
.end method

.method public setEqualizerSettings(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;)V
    .locals 0

    return-void
.end method

.method public setFadeVolume(FI)V
    .locals 0

    return-void
.end method

.method public setFadeVolumeRelative(FI)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public setMute(Z)V
    .locals 0

    return-void
.end method

.method public setNextDataSource(Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;)V
    .locals 0

    return-void
.end method

.method public setNotifyListener(Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;)V
    .locals 0

    return-void
.end method

.method public setVideoScalingMode(I)V
    .locals 0

    return-void
.end method

.method public setVideoSurfaceHolder(Landroid/view/SurfaceHolder;)V
    .locals 0

    return-void
.end method

.method public setVolume(F)V
    .locals 0

    return-void
.end method

.method public setVolumeStereoBalance(F)V
    .locals 0

    return-void
.end method

.method public start()V
    .locals 0

    return-void
.end method

.method public stop()V
    .locals 0

    return-void
.end method
