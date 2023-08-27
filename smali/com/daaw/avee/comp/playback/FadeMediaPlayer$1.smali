.class Lcom/daaw/avee/comp/playback/FadeMediaPlayer$1;
.super Ljava/lang/Object;
.source "FadeMediaPlayer.java"

# interfaces
.implements Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/playback/FadeMediaPlayer;-><init>(Lcom/daaw/avee/comp/playback/IMediaPlayerCore;Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)V
    .locals 0

    .line 188
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$1;->this$0:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getEqualizerEnabled(Ljava/lang/String;)Z
    .locals 1

    .line 262
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$1;->this$0:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$600(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->getEqualizerEnabled(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public getEqualizerSettings(Ljava/lang/String;)Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;
    .locals 1

    .line 257
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$1;->this$0:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$600(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->getEqualizerSettings(Ljava/lang/String;)Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;

    move-result-object p1

    return-object p1
.end method

.method public getVideoScalingMode()I
    .locals 1

    .line 242
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$1;->this$0:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$600(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->getVideoScalingMode()I

    move-result v0

    return v0
.end method

.method public onBufferingUpdate(ZI)V
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$1;->this$0:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$600(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onBufferingUpdate(ZI)V

    return-void
.end method

.method public onEqualizerDescChanged(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;)V
    .locals 1

    .line 252
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$1;->this$0:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$600(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onEqualizerDescChanged(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;)V

    return-void
.end method

.method public onExoPcmData(Lcom/daaw/avee/comp/Common/ExoPcmData;)V
    .locals 1

    .line 267
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$1;->this$0:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$600(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onExoPcmData(Lcom/daaw/avee/comp/Common/ExoPcmData;)V

    return-void
.end method

.method public onExoPcmDataNewSource()V
    .locals 1

    .line 272
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$1;->this$0:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$600(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onExoPcmDataNewSource()V

    return-void
.end method

.method public onMpPlaystateOrMetaChanged(ZLjava/lang/String;)V
    .locals 1

    .line 227
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$1;->this$0:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$600(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onMpPlaystateOrMetaChanged(ZLjava/lang/String;)V

    return-void
.end method

.method public onNotifyVideoSizeChanged(IIF)V
    .locals 1

    .line 237
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$1;->this$0:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$600(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onNotifyVideoSizeChanged(IIF)V

    return-void
.end method

.method public onRequestAudioFocus()Z
    .locals 1

    .line 217
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$1;->this$0:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$600(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onRequestAudioFocus()Z

    move-result v0

    return v0
.end method

.method public onRequestVideoSurfaceHolder()Landroid/view/SurfaceHolder;
    .locals 1

    .line 247
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$1;->this$0:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$600(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onRequestVideoSurfaceHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    return-object v0
.end method

.method public onVolumeMuteStateChanged(Z)V
    .locals 1

    .line 222
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$1;->this$0:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$600(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onVolumeMuteStateChanged(Z)V

    return-void
.end method

.method public requestNextDataAtTime(J)V
    .locals 1

    .line 212
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$1;->this$0:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$600(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->requestNextDataAtTime(J)V

    return-void
.end method

.method public requestNextDataDelay(Z)V
    .locals 2

    .line 193
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$1;->this$0:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$1200(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$1;->this$0:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$1200(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$1;->this$0:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$1200(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 197
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$1;->this$0:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$600(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->requestNextDataDelay(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public requestNextDataNow()V
    .locals 2

    .line 203
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$1;->this$0:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$1200(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$1;->this$0:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$1200(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$1;->this$0:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$1200(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 207
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$1;->this$0:Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$600(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->requestNextDataNow()V

    :cond_1
    :goto_0
    return-void
.end method
