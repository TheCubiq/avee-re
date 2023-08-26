.class public abstract Lcom/mpatric/mp3agic/AbstractID3v2FrameData;
.super Ljava/lang/Object;
.source "AbstractID3v2FrameData.java"


# instance fields
.field unsynchronisation:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-boolean p1, p0, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;->unsynchronisation:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    .line 46
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    .line 48
    :cond_2
    check-cast p1, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;

    .line 49
    iget-boolean v2, p0, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;->unsynchronisation:Z

    iget-boolean p1, p1, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;->unsynchronisation:Z

    if-eq v2, p1, :cond_3

    return v1

    :cond_3
    return v0
.end method

.method protected abstract getLength()I
.end method

.method public hashCode()I
    .locals 2

    .line 36
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;->unsynchronisation:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v0, 0x4d5

    :goto_0
    const/16 v1, 0x1f

    add-int/2addr v1, v0

    return v1
.end method

.method protected packAndUnsynchroniseFrameData()[B
    .locals 2

    .line 21
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;->packFrameData()[B

    move-result-object v0

    .line 22
    iget-boolean v1, p0, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;->unsynchronisation:Z

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/mpatric/mp3agic/BufferTools;->sizeUnsynchronisationWouldAdd([B)I

    move-result v1

    if-lez v1, :cond_0

    .line 23
    invoke-static {v0}, Lcom/mpatric/mp3agic/BufferTools;->unsynchroniseBuffer([B)[B

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method protected abstract packFrameData()[B
.end method

.method protected final synchroniseAndUnpackFrameData([B)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    .line 12
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;->unsynchronisation:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/mpatric/mp3agic/BufferTools;->sizeSynchronisationWouldSubtract([B)I

    move-result v0

    if-lez v0, :cond_0

    .line 13
    invoke-static {p1}, Lcom/mpatric/mp3agic/BufferTools;->synchroniseBuffer([B)[B

    move-result-object p1

    .line 14
    invoke-virtual {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;->unpackFrameData([B)V

    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;->unpackFrameData([B)V

    :goto_0
    return-void
.end method

.method protected toBytes()[B
    .locals 1

    .line 29
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;->packAndUnsynchroniseFrameData()[B

    move-result-object v0

    return-object v0
.end method

.method protected abstract unpackFrameData([B)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation
.end method
