.class public Lcom/daaw/avee/comp/playback/AudioFrameData$Request;
.super Ljava/lang/Object;
.source "AudioFrameData.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/AudioFrameData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Request"
.end annotation


# instance fields
.field public audioChannelCount:I

.field public audioOffsetMs:I

.field public samplesCount:I

.field public samplesCountUs:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
