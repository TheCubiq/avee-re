.class public final Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter$Builder;
.super Ljava/lang/Object;
.source "DefaultBandwidthMeter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private clock:Lcom/google/android/exoplayer2/util/Clock;

.field private eventHandler:Landroid/os/Handler;

.field private eventListener:Lcom/google/android/exoplayer2/upstream/BandwidthMeter$EventListener;

.field private initialBitrateEstimate:J

.field private slidingWindowMaxWeight:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0xf4240

    .line 47
    iput-wide v0, p0, Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter$Builder;->initialBitrateEstimate:J

    const/16 v0, 0x7d0

    .line 48
    iput v0, p0, Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter$Builder;->slidingWindowMaxWeight:I

    .line 49
    sget-object v0, Lcom/google/android/exoplayer2/util/Clock;->DEFAULT:Lcom/google/android/exoplayer2/util/Clock;

    iput-object v0, p0, Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter$Builder;->clock:Lcom/google/android/exoplayer2/util/Clock;

    return-void
.end method


# virtual methods
.method public build()Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter;
    .locals 9

    .line 108
    new-instance v8, Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter;

    iget-object v1, p0, Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter$Builder;->eventHandler:Landroid/os/Handler;

    iget-object v2, p0, Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter$Builder;->eventListener:Lcom/google/android/exoplayer2/upstream/BandwidthMeter$EventListener;

    iget-wide v3, p0, Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter$Builder;->initialBitrateEstimate:J

    iget v5, p0, Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter$Builder;->slidingWindowMaxWeight:I

    iget-object v6, p0, Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter$Builder;->clock:Lcom/google/android/exoplayer2/util/Clock;

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter;-><init>(Landroid/os/Handler;Lcom/google/android/exoplayer2/upstream/BandwidthMeter$EventListener;JILcom/google/android/exoplayer2/util/Clock;Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter$1;)V

    return-object v8
.end method

.method public setClock(Lcom/google/android/exoplayer2/util/Clock;)Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter$Builder;
    .locals 0

    .line 98
    iput-object p1, p0, Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter$Builder;->clock:Lcom/google/android/exoplayer2/util/Clock;

    return-object p0
.end method

.method public setEventListener(Landroid/os/Handler;Lcom/google/android/exoplayer2/upstream/BandwidthMeter$EventListener;)Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter$Builder;
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 61
    :goto_0
    invoke-static {v0}, Lcom/google/android/exoplayer2/util/Assertions;->checkArgument(Z)V

    .line 62
    iput-object p1, p0, Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter$Builder;->eventHandler:Landroid/os/Handler;

    .line 63
    iput-object p2, p0, Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter$Builder;->eventListener:Lcom/google/android/exoplayer2/upstream/BandwidthMeter$EventListener;

    return-object p0
.end method

.method public setInitialBitrateEstimate(J)Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter$Builder;
    .locals 0

    .line 86
    iput-wide p1, p0, Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter$Builder;->initialBitrateEstimate:J

    return-object p0
.end method

.method public setSlidingWindowMaxWeight(I)Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter$Builder;
    .locals 0

    .line 74
    iput p1, p0, Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter$Builder;->slidingWindowMaxWeight:I

    return-object p0
.end method
