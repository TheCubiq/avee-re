.class Lcom/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher$6;
.super Ljava/lang/Object;
.source "AudioRendererEventListener.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher;->audioSessionId(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher;

.field final synthetic val$audioSessionId:I


# direct methods
.method constructor <init>(Lcom/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher;I)V
    .locals 0

    .line 181
    iput-object p1, p0, Lcom/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher$6;->this$0:Lcom/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher;

    iput p2, p0, Lcom/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher$6;->val$audioSessionId:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 184
    iget-object v0, p0, Lcom/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher$6;->this$0:Lcom/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher;

    invoke-static {v0}, Lcom/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher;->access$000(Lcom/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher;)Lcom/google/android/exoplayer2/audio/AudioRendererEventListener;

    move-result-object v0

    iget v1, p0, Lcom/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher$6;->val$audioSessionId:I

    invoke-interface {v0, v1}, Lcom/google/android/exoplayer2/audio/AudioRendererEventListener;->onAudioSessionId(I)V

    return-void
.end method
