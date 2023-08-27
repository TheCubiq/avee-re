.class public Lcom/daaw/avee/comp/Visualizer/FrameStats;
.super Ljava/lang/Object;
.source "FrameStats.java"


# instance fields
.field public fps:I

.field public fpsAcc:I

.field public frameResourcesLoadingCount:I

.field public statFlushCount:I

.field public statFlushCounter:I

.field public statGradualResourceLoadCount:I

.field public statGradualResourceLoadCounter:I

.field public statRTSwitchCount:I

.field public statRTSwitchCounter:I

.field public statResourceLoadCount:I

.field public statResourceLoadCounter:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->frameResourcesLoadingCount:I

    .line 7
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->fps:I

    .line 8
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->fpsAcc:I

    .line 10
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statFlushCount:I

    .line 11
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statFlushCounter:I

    .line 12
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statResourceLoadCount:I

    .line 13
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statResourceLoadCounter:I

    .line 14
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statGradualResourceLoadCount:I

    .line 15
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statGradualResourceLoadCounter:I

    .line 16
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statRTSwitchCounter:I

    .line 17
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statRTSwitchCount:I

    return-void
.end method


# virtual methods
.method public getFps()I
    .locals 1

    .line 24
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->fps:I

    return v0
.end method

.method public getFrameResourcesLoadingCount()I
    .locals 1

    .line 20
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->frameResourcesLoadingCount:I

    return v0
.end method

.method public getStatFlushCount()I
    .locals 1

    .line 28
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statFlushCount:I

    return v0
.end method

.method public getStatGradualResourceLoadCount()I
    .locals 1

    .line 36
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statGradualResourceLoadCount:I

    return v0
.end method

.method public getStatRTSwitchCount()I
    .locals 1

    .line 40
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statRTSwitchCount:I

    return v0
.end method

.method public getStatResourceLoadCount()I
    .locals 1

    .line 32
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/FrameStats;->statResourceLoadCount:I

    return v0
.end method
