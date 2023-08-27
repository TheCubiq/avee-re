.class public interface abstract Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;
.super Ljava/lang/Object;
.source "IMediaPlayerCore.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/IMediaPlayerCore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "OnNotifyListener"
.end annotation


# virtual methods
.method public abstract getEqualizerEnabled(Ljava/lang/String;)Z
.end method

.method public abstract getEqualizerSettings(Ljava/lang/String;)Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;
.end method

.method public abstract getVideoScalingMode()I
.end method

.method public abstract onBufferingUpdate(ZI)V
.end method

.method public abstract onEqualizerDescChanged(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;)V
.end method

.method public abstract onExoPcmData(Lcom/daaw/avee/comp/Common/ExoPcmData;)V
.end method

.method public abstract onExoPcmDataNewSource()V
.end method

.method public abstract onMpPlaystateOrMetaChanged(ZLjava/lang/String;)V
.end method

.method public abstract onNotifyVideoSizeChanged(IIF)V
.end method

.method public abstract onRequestAudioFocus()Z
.end method

.method public abstract onRequestVideoSurfaceHolder()Landroid/view/SurfaceHolder;
.end method

.method public abstract onVolumeMuteStateChanged(Z)V
.end method

.method public abstract requestNextDataAtTime(J)V
.end method

.method public abstract requestNextDataDelay(Z)V
.end method

.method public abstract requestNextDataNow()V
.end method
