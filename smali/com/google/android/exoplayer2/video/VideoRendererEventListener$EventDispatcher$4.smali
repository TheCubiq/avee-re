.class Lcom/google/android/exoplayer2/video/VideoRendererEventListener$EventDispatcher$4;
.super Ljava/lang/Object;
.source "VideoRendererEventListener.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/exoplayer2/video/VideoRendererEventListener$EventDispatcher;->droppedFrames(IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/android/exoplayer2/video/VideoRendererEventListener$EventDispatcher;

.field final synthetic val$droppedFrameCount:I

.field final synthetic val$elapsedMs:J


# direct methods
.method constructor <init>(Lcom/google/android/exoplayer2/video/VideoRendererEventListener$EventDispatcher;IJ)V
    .locals 0

    .line 176
    iput-object p1, p0, Lcom/google/android/exoplayer2/video/VideoRendererEventListener$EventDispatcher$4;->this$0:Lcom/google/android/exoplayer2/video/VideoRendererEventListener$EventDispatcher;

    iput p2, p0, Lcom/google/android/exoplayer2/video/VideoRendererEventListener$EventDispatcher$4;->val$droppedFrameCount:I

    iput-wide p3, p0, Lcom/google/android/exoplayer2/video/VideoRendererEventListener$EventDispatcher$4;->val$elapsedMs:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 179
    iget-object v0, p0, Lcom/google/android/exoplayer2/video/VideoRendererEventListener$EventDispatcher$4;->this$0:Lcom/google/android/exoplayer2/video/VideoRendererEventListener$EventDispatcher;

    invoke-static {v0}, Lcom/google/android/exoplayer2/video/VideoRendererEventListener$EventDispatcher;->access$000(Lcom/google/android/exoplayer2/video/VideoRendererEventListener$EventDispatcher;)Lcom/google/android/exoplayer2/video/VideoRendererEventListener;

    move-result-object v0

    iget v1, p0, Lcom/google/android/exoplayer2/video/VideoRendererEventListener$EventDispatcher$4;->val$droppedFrameCount:I

    iget-wide v2, p0, Lcom/google/android/exoplayer2/video/VideoRendererEventListener$EventDispatcher$4;->val$elapsedMs:J

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/exoplayer2/video/VideoRendererEventListener;->onDroppedFrames(IJ)V

    return-void
.end method
