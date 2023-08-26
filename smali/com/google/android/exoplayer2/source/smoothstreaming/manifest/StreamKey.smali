.class public final Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/StreamKey;
.super Ljava/lang/Object;
.source "StreamKey.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/StreamKey;",
        ">;"
    }
.end annotation


# instance fields
.field public final streamElementIndex:I

.field public final trackIndex:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/StreamKey;->streamElementIndex:I

    .line 29
    iput p2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/StreamKey;->trackIndex:I

    return-void
.end method


# virtual methods
.method public compareTo(Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/StreamKey;)I
    .locals 2

    .line 61
    iget v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/StreamKey;->streamElementIndex:I

    iget v1, p1, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/StreamKey;->streamElementIndex:I

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    .line 63
    iget v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/StreamKey;->trackIndex:I

    iget p1, p1, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/StreamKey;->trackIndex:I

    sub-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 22
    check-cast p1, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/StreamKey;

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/StreamKey;->compareTo(Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/StreamKey;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    .line 42
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 46
    :cond_1
    check-cast p1, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/StreamKey;

    .line 47
    iget v2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/StreamKey;->streamElementIndex:I

    iget v3, p1, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/StreamKey;->streamElementIndex:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/StreamKey;->trackIndex:I

    iget p1, p1, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/StreamKey;->trackIndex:I

    if-ne v2, p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    .line 52
    iget v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/StreamKey;->streamElementIndex:I

    mul-int/lit8 v0, v0, 0x1f

    .line 53
    iget v1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/StreamKey;->trackIndex:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/StreamKey;->streamElementIndex:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/StreamKey;->trackIndex:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
