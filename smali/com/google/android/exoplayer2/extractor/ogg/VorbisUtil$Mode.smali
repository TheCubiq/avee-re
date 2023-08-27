.class public final Lcom/google/android/exoplayer2/extractor/ogg/VorbisUtil$Mode;
.super Ljava/lang/Object;
.source "VorbisUtil.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/extractor/ogg/VorbisUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Mode"
.end annotation


# instance fields
.field public final blockFlag:Z

.field public final mapping:I

.field public final transformType:I

.field public final windowType:I


# direct methods
.method public constructor <init>(ZIII)V
    .locals 0

    .line 488
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 489
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/extractor/ogg/VorbisUtil$Mode;->blockFlag:Z

    .line 490
    iput p2, p0, Lcom/google/android/exoplayer2/extractor/ogg/VorbisUtil$Mode;->windowType:I

    .line 491
    iput p3, p0, Lcom/google/android/exoplayer2/extractor/ogg/VorbisUtil$Mode;->transformType:I

    .line 492
    iput p4, p0, Lcom/google/android/exoplayer2/extractor/ogg/VorbisUtil$Mode;->mapping:I

    return-void
.end method
