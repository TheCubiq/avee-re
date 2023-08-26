.class Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$1;
.super Ljava/lang/Object;
.source "ExoMediaPlayerCore.java"

# interfaces
.implements Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field enabled:Z

.field final synthetic this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)V
    .locals 0

    .line 130
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$1;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 131
    iput-boolean p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$1;->enabled:Z

    return-void
.end method


# virtual methods
.method public isCurrentPlayerEntry(I)Z
    .locals 2

    .line 199
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$1;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->getPlayerEntry()Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 202
    :cond_0
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->access$400(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;)I

    move-result v0

    if-ne v0, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public onAudioSessionId(I)V
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$1;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$300(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoEqualizerEffect;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 186
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$1;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$300(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoEqualizerEffect;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoEqualizerEffect;->onAudioSessionChanged(I)V

    :cond_0
    return-void
.end method

.method public onNewSource()V
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$1;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$000(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onExoPcmDataNewSource()V

    .line 138
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$1;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$100(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 140
    invoke-virtual {v0}, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->onNewSourceTh()V

    :cond_0
    return-void
.end method

.method public onPcmData(Ljava/nio/ByteBuffer;JIIIIJ)V
    .locals 2

    .line 162
    iget-boolean v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$1;->enabled:Z

    if-nez v0, :cond_0

    return-void

    .line 164
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$1;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$200(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/Common/ExoPcmData;

    move-result-object v0

    iget-boolean v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$1;->enabled:Z

    iput-boolean v1, v0, Lcom/daaw/avee/comp/Common/ExoPcmData;->enabled:Z

    .line 165
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$1;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$200(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/Common/ExoPcmData;

    move-result-object v0

    iput-object p1, v0, Lcom/daaw/avee/comp/Common/ExoPcmData;->buffer:Ljava/nio/ByteBuffer;

    .line 166
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$1;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$200(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/Common/ExoPcmData;

    move-result-object p1

    iput-wide p2, p1, Lcom/daaw/avee/comp/Common/ExoPcmData;->bufferPresentationTimeUs:J

    .line 167
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$1;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$200(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/Common/ExoPcmData;

    move-result-object p1

    iput p4, p1, Lcom/daaw/avee/comp/Common/ExoPcmData;->bufferIndex:I

    .line 168
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$1;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$200(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/Common/ExoPcmData;

    move-result-object p1

    iput p5, p1, Lcom/daaw/avee/comp/Common/ExoPcmData;->sampleRate:I

    .line 169
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$1;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$200(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/Common/ExoPcmData;

    move-result-object p1

    iput p6, p1, Lcom/daaw/avee/comp/Common/ExoPcmData;->channelCount:I

    .line 170
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$1;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$200(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/Common/ExoPcmData;

    move-result-object p1

    iput p7, p1, Lcom/daaw/avee/comp/Common/ExoPcmData;->bitDepth:I

    .line 171
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$1;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$200(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/Common/ExoPcmData;

    move-result-object p1

    iput-wide p8, p1, Lcom/daaw/avee/comp/Common/ExoPcmData;->positionUs:J

    .line 173
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$1;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$000(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$1;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {p2}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$200(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/Common/ExoPcmData;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onExoPcmData(Lcom/daaw/avee/comp/Common/ExoPcmData;)V

    .line 179
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$1;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$200(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/Common/ExoPcmData;

    move-result-object p1

    const/4 p2, 0x0

    iput-object p2, p1, Lcom/daaw/avee/comp/Common/ExoPcmData;->buffer:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public onSetEnabled(Z)V
    .locals 0

    .line 154
    iput-boolean p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$1;->enabled:Z

    return-void
.end method
