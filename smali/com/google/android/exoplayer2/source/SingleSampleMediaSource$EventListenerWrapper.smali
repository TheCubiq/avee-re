.class final Lcom/google/android/exoplayer2/source/SingleSampleMediaSource$EventListenerWrapper;
.super Lcom/google/android/exoplayer2/source/DefaultMediaSourceEventListener;
.source "SingleSampleMediaSource.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/source/SingleSampleMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "EventListenerWrapper"
.end annotation


# instance fields
.field private final eventListener:Lcom/google/android/exoplayer2/source/SingleSampleMediaSource$EventListener;

.field private final eventSourceId:I


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/source/SingleSampleMediaSource$EventListener;I)V
    .locals 0

    .line 312
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/DefaultMediaSourceEventListener;-><init>()V

    .line 313
    invoke-static {p1}, Lcom/google/android/exoplayer2/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource$EventListener;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource$EventListenerWrapper;->eventListener:Lcom/google/android/exoplayer2/source/SingleSampleMediaSource$EventListener;

    .line 314
    iput p2, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource$EventListenerWrapper;->eventSourceId:I

    return-void
.end method


# virtual methods
.method public onLoadError(ILcom/google/android/exoplayer2/source/MediaSource$MediaPeriodId;Lcom/google/android/exoplayer2/source/MediaSourceEventListener$LoadEventInfo;Lcom/google/android/exoplayer2/source/MediaSourceEventListener$MediaLoadData;Ljava/io/IOException;Z)V
    .locals 0

    .line 325
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource$EventListenerWrapper;->eventListener:Lcom/google/android/exoplayer2/source/SingleSampleMediaSource$EventListener;

    iget p2, p0, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource$EventListenerWrapper;->eventSourceId:I

    invoke-interface {p1, p2, p5}, Lcom/google/android/exoplayer2/source/SingleSampleMediaSource$EventListener;->onLoadError(ILjava/io/IOException;)V

    return-void
.end method
