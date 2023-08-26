.class public final Lcom/google/android/exoplayer2/extractor/ogg/VorbisUtil$VorbisIdHeader;
.super Ljava/lang/Object;
.source "VorbisUtil.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/extractor/ogg/VorbisUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "VorbisIdHeader"
.end annotation


# instance fields
.field public final bitrateMax:I

.field public final bitrateMin:I

.field public final bitrateNominal:I

.field public final blockSize0:I

.field public final blockSize1:I

.field public final channels:I

.field public final data:[B

.field public final framingFlag:Z

.field public final sampleRate:J

.field public final version:J


# direct methods
.method public constructor <init>(JIJIIIIIZ[B)V
    .locals 0

    .line 462
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 463
    iput-wide p1, p0, Lcom/google/android/exoplayer2/extractor/ogg/VorbisUtil$VorbisIdHeader;->version:J

    .line 464
    iput p3, p0, Lcom/google/android/exoplayer2/extractor/ogg/VorbisUtil$VorbisIdHeader;->channels:I

    .line 465
    iput-wide p4, p0, Lcom/google/android/exoplayer2/extractor/ogg/VorbisUtil$VorbisIdHeader;->sampleRate:J

    .line 466
    iput p6, p0, Lcom/google/android/exoplayer2/extractor/ogg/VorbisUtil$VorbisIdHeader;->bitrateMax:I

    .line 467
    iput p7, p0, Lcom/google/android/exoplayer2/extractor/ogg/VorbisUtil$VorbisIdHeader;->bitrateNominal:I

    .line 468
    iput p8, p0, Lcom/google/android/exoplayer2/extractor/ogg/VorbisUtil$VorbisIdHeader;->bitrateMin:I

    .line 469
    iput p9, p0, Lcom/google/android/exoplayer2/extractor/ogg/VorbisUtil$VorbisIdHeader;->blockSize0:I

    .line 470
    iput p10, p0, Lcom/google/android/exoplayer2/extractor/ogg/VorbisUtil$VorbisIdHeader;->blockSize1:I

    .line 471
    iput-boolean p11, p0, Lcom/google/android/exoplayer2/extractor/ogg/VorbisUtil$VorbisIdHeader;->framingFlag:Z

    .line 472
    iput-object p12, p0, Lcom/google/android/exoplayer2/extractor/ogg/VorbisUtil$VorbisIdHeader;->data:[B

    return-void
.end method


# virtual methods
.method public getApproximateBitrate()I
    .locals 2

    .line 476
    iget v0, p0, Lcom/google/android/exoplayer2/extractor/ogg/VorbisUtil$VorbisIdHeader;->bitrateNominal:I

    if-nez v0, :cond_0

    iget v0, p0, Lcom/google/android/exoplayer2/extractor/ogg/VorbisUtil$VorbisIdHeader;->bitrateMin:I

    iget v1, p0, Lcom/google/android/exoplayer2/extractor/ogg/VorbisUtil$VorbisIdHeader;->bitrateMax:I

    add-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    :cond_0
    return v0
.end method
