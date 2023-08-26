.class public final Lcom/google/android/exoplayer2/source/MediaSourceEventListener$MediaLoadData;
.super Ljava/lang/Object;
.source "MediaSourceEventListener.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/source/MediaSourceEventListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MediaLoadData"
.end annotation


# instance fields
.field public final dataType:I

.field public final mediaEndTimeMs:J

.field public final mediaStartTimeMs:J

.field public final trackFormat:Lcom/google/android/exoplayer2/Format;

.field public final trackSelectionData:Ljava/lang/Object;

.field public final trackSelectionReason:I

.field public final trackType:I


# direct methods
.method public constructor <init>(IILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJ)V
    .locals 0

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 126
    iput p1, p0, Lcom/google/android/exoplayer2/source/MediaSourceEventListener$MediaLoadData;->dataType:I

    .line 127
    iput p2, p0, Lcom/google/android/exoplayer2/source/MediaSourceEventListener$MediaLoadData;->trackType:I

    .line 128
    iput-object p3, p0, Lcom/google/android/exoplayer2/source/MediaSourceEventListener$MediaLoadData;->trackFormat:Lcom/google/android/exoplayer2/Format;

    .line 129
    iput p4, p0, Lcom/google/android/exoplayer2/source/MediaSourceEventListener$MediaLoadData;->trackSelectionReason:I

    .line 130
    iput-object p5, p0, Lcom/google/android/exoplayer2/source/MediaSourceEventListener$MediaLoadData;->trackSelectionData:Ljava/lang/Object;

    .line 131
    iput-wide p6, p0, Lcom/google/android/exoplayer2/source/MediaSourceEventListener$MediaLoadData;->mediaStartTimeMs:J

    .line 132
    iput-wide p8, p0, Lcom/google/android/exoplayer2/source/MediaSourceEventListener$MediaLoadData;->mediaEndTimeMs:J

    return-void
.end method
