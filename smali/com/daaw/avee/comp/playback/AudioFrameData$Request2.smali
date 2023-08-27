.class public Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;
.super Lcom/daaw/avee/comp/playback/AudioFrameData$Request;
.source "AudioFrameData.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/AudioFrameData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Request2"
.end annotation


# instance fields
.field public clearBuffers:Z

.field public overridePositionUs:J

.field public snoopMode:Z

.field public useGlobalSession:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/AudioFrameData$Request;-><init>()V

    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->clearBuffers:Z

    return-void
.end method
