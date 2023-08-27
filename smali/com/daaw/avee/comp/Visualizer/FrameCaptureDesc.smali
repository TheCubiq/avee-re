.class public Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;
.super Ljava/lang/Object;
.source "FrameCaptureDesc.java"


# instance fields
.field public captureToImageBuffer:Z

.field public overrideFrameTimeMs:I

.field public overrideScreenHeight:I

.field public overrideScreenWidth:I

.field public reuseBuffer0:[I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 7
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;->overrideScreenWidth:I

    .line 8
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;->overrideScreenHeight:I

    .line 9
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;->overrideFrameTimeMs:I

    return-void
.end method
