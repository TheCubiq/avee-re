.class Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$3;
.super Ljava/lang/Object;
.source "ExoMediaPlayerCore.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent$Handler;


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

    .line 238
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$3;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()V
    .locals 1

    .line 241
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$3;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->checkVisualizerLife()V

    return-void
.end method
