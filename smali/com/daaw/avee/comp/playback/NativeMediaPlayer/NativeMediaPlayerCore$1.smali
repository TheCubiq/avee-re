.class Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$1;
.super Ljava/lang/Object;
.source "NativeMediaPlayerCore.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$1;->this$0:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()V
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$1;->this$0:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->checkVisualizerLife()V

    return-void
.end method
