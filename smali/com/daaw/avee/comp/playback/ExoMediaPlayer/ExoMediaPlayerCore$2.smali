.class Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$2;
.super Ljava/lang/Object;
.source "ExoMediaPlayerCore.java"

# interfaces
.implements Lcom/google/android/exoplayer2/audio/AudioCapabilitiesReceiver$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)V
    .locals 0

    .line 226
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$2;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAudioCapabilitiesChanged(Lcom/google/android/exoplayer2/audio/AudioCapabilities;)V
    .locals 1

    .line 229
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$2;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$500(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/google/android/exoplayer2/audio/AudioCapabilities;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/audio/AudioCapabilities;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    .line 231
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$2;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$502(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;Lcom/google/android/exoplayer2/audio/AudioCapabilities;)Lcom/google/android/exoplayer2/audio/AudioCapabilities;

    .line 232
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$2;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$600(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)V

    :cond_0
    return-void
.end method
