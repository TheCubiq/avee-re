.class Lcom/daaw/avee/comp/playback/MediaPlaybackService$3;
.super Ljava/lang/Object;
.source "MediaPlaybackService.java"

# interfaces
.implements Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/MediaPlaybackService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/playback/MediaPlaybackService;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$3;->this$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getEqualizerEnabled(Ljava/lang/String;)Z
    .locals 2

    .line 208
    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestEqualizerIsEnabled:Lcom/daaw/avee/Common/Events/WeakEventR1;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public getEqualizerSettings(Ljava/lang/String;)Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;
    .locals 2

    .line 203
    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestEqualizerSettings:Lcom/daaw/avee/Common/Events/WeakEventR1;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerSettings;

    return-object p1
.end method

.method public getVideoScalingMode()I
    .locals 2

    .line 193
    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestVideoScalingMode:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public onBufferingUpdate(ZI)V
    .locals 1

    .line 183
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$3;->this$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-static {v0, p1, p2}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->access$300(Lcom/daaw/avee/comp/playback/MediaPlaybackService;ZI)V

    return-void
.end method

.method public onEqualizerDescChanged(Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;)V
    .locals 1

    .line 213
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$3;->this$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->access$402(Lcom/daaw/avee/comp/playback/MediaPlaybackService;Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;)Lcom/daaw/avee/comp/playback/BaseEqualizerEffect$EqualizerDesc;

    .line 214
    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onEqualizerDescChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method

.method public onExoPcmData(Lcom/daaw/avee/comp/Common/ExoPcmData;)V
    .locals 1

    .line 224
    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onExoPcmData:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method

.method public onExoPcmDataNewSource()V
    .locals 1

    .line 219
    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onExoPcmDataNewSource:Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-virtual {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;->invoke()V

    return-void
.end method

.method public onMpPlaystateOrMetaChanged(ZLjava/lang/String;)V
    .locals 1

    .line 178
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$3;->this$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-static {v0, p1, p2}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->access$200(Lcom/daaw/avee/comp/playback/MediaPlaybackService;ZLjava/lang/String;)V

    return-void
.end method

.method public onNotifyVideoSizeChanged(IIF)V
    .locals 1

    .line 188
    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onVideoSizeChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/avee/Common/Events/WeakEvent3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public onRequestAudioFocus()Z
    .locals 1

    .line 168
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$3;->this$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->requestAudioFocus()Z

    move-result v0

    return v0
.end method

.method public onRequestVideoSurfaceHolder()Landroid/view/SurfaceHolder;
    .locals 2

    .line 198
    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestVideoSurfaceHolder:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/SurfaceHolder;

    return-object v0
.end method

.method public onVolumeMuteStateChanged(Z)V
    .locals 1

    .line 173
    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onVolumeMuteChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method

.method public requestNextDataAtTime(J)V
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$3;->this$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mpRequestNextDataAtTime(J)V

    return-void
.end method

.method public requestNextDataDelay(Z)V
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$3;->this$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mpRequestNextDataDelay(Z)V

    return-void
.end method

.method public requestNextDataNow()V
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaPlaybackService$3;->this$0:Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->mpRequestNextDataNow()V

    return-void
.end method
