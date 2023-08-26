.class final Lcom/google/android/exoplayer2/text/ttml/TtmlRegion;
.super Ljava/lang/Object;
.source "TtmlRegion.java"


# instance fields
.field public final id:Ljava/lang/String;

.field public final line:F

.field public final lineAnchor:I

.field public final lineType:I

.field public final position:F

.field public final textSize:F

.field public final textSizeType:I

.field public final width:F


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 9

    const/4 v2, 0x1

    const/4 v3, 0x1

    const/high16 v4, -0x80000000

    const/high16 v5, -0x80000000

    const/4 v6, 0x1

    const/high16 v7, -0x80000000

    const/4 v8, 0x1

    move-object v0, p0

    move-object v1, p1

    .line 35
    invoke-direct/range {v0 .. v8}, Lcom/google/android/exoplayer2/text/ttml/TtmlRegion;-><init>(Ljava/lang/String;FFIIFIF)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;FFIIFIF)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlRegion;->id:Ljava/lang/String;

    .line 56
    iput p2, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlRegion;->position:F

    .line 57
    iput p3, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlRegion;->line:F

    .line 58
    iput p4, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlRegion;->lineType:I

    .line 59
    iput p5, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlRegion;->lineAnchor:I

    .line 60
    iput p6, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlRegion;->width:F

    .line 61
    iput p7, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlRegion;->textSizeType:I

    .line 62
    iput p8, p0, Lcom/google/android/exoplayer2/text/ttml/TtmlRegion;->textSize:F

    return-void
.end method
