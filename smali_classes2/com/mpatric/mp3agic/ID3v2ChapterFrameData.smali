.class public Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;
.super Lcom/mpatric/mp3agic/AbstractID3v2FrameData;
.source "ID3v2ChapterFrameData.java"


# instance fields
.field protected endOffset:I

.field protected endTime:I

.field protected id:Ljava/lang/String;

.field protected startOffset:I

.field protected startTime:I

.field protected subframes:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/mpatric/mp3agic/ID3v2Frame;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;-><init>(Z)V

    .line 13
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->subframes:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;IIII)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;-><init>(Z)V

    .line 13
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->subframes:Ljava/util/ArrayList;

    .line 22
    iput-object p2, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->id:Ljava/lang/String;

    .line 23
    iput p3, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->startTime:I

    .line 24
    iput p4, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->endTime:I

    .line 25
    iput p5, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->startOffset:I

    .line 26
    iput p6, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->endOffset:I

    return-void
.end method

.method public constructor <init>(Z[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    .line 31
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;-><init>(Z)V

    .line 13
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->subframes:Ljava/util/ArrayList;

    .line 32
    invoke-virtual {p0, p2}, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->synchroniseAndUnpackFrameData([B)V

    return-void
.end method


# virtual methods
.method public addSubframe(Ljava/lang/String;Lcom/mpatric/mp3agic/AbstractID3v2FrameData;)V
    .locals 2

    .line 56
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->subframes:Ljava/util/ArrayList;

    new-instance v1, Lcom/mpatric/mp3agic/ID3v2Frame;

    invoke-virtual {p2}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;->toBytes()[B

    move-result-object p2

    invoke-direct {v1, p1, p2}, Lcom/mpatric/mp3agic/ID3v2Frame;-><init>(Ljava/lang/String;[B)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 179
    :cond_0
    invoke-super {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 181
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v1, v3, :cond_2

    return v2

    .line 183
    :cond_2
    check-cast p1, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;

    .line 184
    iget v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->endOffset:I

    iget v3, p1, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->endOffset:I

    if-eq v1, v3, :cond_3

    return v2

    .line 186
    :cond_3
    iget v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->endTime:I

    iget v3, p1, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->endTime:I

    if-eq v1, v3, :cond_4

    return v2

    .line 188
    :cond_4
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->id:Ljava/lang/String;

    if-nez v1, :cond_5

    .line 189
    iget-object v1, p1, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->id:Ljava/lang/String;

    if-eqz v1, :cond_6

    return v2

    .line 191
    :cond_5
    iget-object v3, p1, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->id:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    .line 193
    :cond_6
    iget v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->startOffset:I

    iget v3, p1, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->startOffset:I

    if-eq v1, v3, :cond_7

    return v2

    .line 195
    :cond_7
    iget v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->startTime:I

    iget v3, p1, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->startTime:I

    if-eq v1, v3, :cond_8

    return v2

    .line 197
    :cond_8
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->subframes:Ljava/util/ArrayList;

    if-nez v1, :cond_9

    .line 198
    iget-object p1, p1, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->subframes:Ljava/util/ArrayList;

    if-eqz p1, :cond_a

    return v2

    .line 200
    :cond_9
    iget-object p1, p1, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->subframes:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public getEndOffset()I
    .locals 1

    .line 113
    iget v0, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->endOffset:I

    return v0
.end method

.method public getEndTime()I
    .locals 1

    .line 97
    iget v0, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->endTime:I

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->id:Ljava/lang/String;

    return-object v0
.end method

.method protected getLength()I
    .locals 3

    .line 132
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->id:Ljava/lang/String;

    const/16 v1, 0x11

    if-eqz v0, :cond_0

    .line 133
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v1, v0

    .line 134
    :cond_0
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->subframes:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 135
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mpatric/mp3agic/ID3v2Frame;

    .line 136
    invoke-virtual {v2}, Lcom/mpatric/mp3agic/ID3v2Frame;->getLength()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_1
    return v1
.end method

.method public getStartOffset()I
    .locals 1

    .line 105
    iget v0, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->startOffset:I

    return v0
.end method

.method public getStartTime()I
    .locals 1

    .line 89
    iget v0, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->startTime:I

    return v0
.end method

.method public getSubframes()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/mpatric/mp3agic/ID3v2Frame;",
            ">;"
        }
    .end annotation

    .line 121
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->subframes:Ljava/util/ArrayList;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 165
    iget v0, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->endOffset:I

    const/16 v1, 0x1f

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 166
    iget v2, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->endTime:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 167
    iget-object v2, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->id:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 168
    iget v2, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->startOffset:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 169
    iget v2, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->startTime:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 170
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->subframes:Ljava/util/ArrayList;

    if-nez v1, :cond_1

    goto :goto_1

    .line 171
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method protected packFrameData()[B
    .locals 3

    .line 61
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->getLength()I

    move-result v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 62
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->id:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    const/4 v1, 0x0

    .line 63
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 65
    iget v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->startTime:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 66
    iget v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->endTime:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 67
    iget v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->startOffset:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 68
    iget v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->endOffset:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 70
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->subframes:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mpatric/mp3agic/ID3v2Frame;

    .line 72
    :try_start_0
    invoke-virtual {v2}, Lcom/mpatric/mp3agic/ID3v2Frame;->toBytes()[B

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Lcom/mpatric/mp3agic/NotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 74
    invoke-virtual {v2}, Lcom/mpatric/mp3agic/NotSupportedException;->printStackTrace()V

    goto :goto_0

    .line 77
    :cond_0
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    return-object v0
.end method

.method public setEndOffset(I)V
    .locals 0

    .line 117
    iput p1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->endOffset:I

    return-void
.end method

.method public setEndTime(I)V
    .locals 0

    .line 101
    iput p1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->endTime:I

    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->id:Ljava/lang/String;

    return-void
.end method

.method public setStartOffset(I)V
    .locals 0

    .line 109
    iput p1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->startOffset:I

    return-void
.end method

.method public setStartTime(I)V
    .locals 0

    .line 93
    iput p1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->startTime:I

    return-void
.end method

.method public setSubframes(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/mpatric/mp3agic/ID3v2Frame;",
            ">;)V"
        }
    .end annotation

    .line 125
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->subframes:Ljava/util/ArrayList;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 144
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ID3v2ChapterFrameData [id="

    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", startTime="

    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    iget v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->startTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", endTime="

    .line 149
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    iget v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->endTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", startOffset="

    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    iget v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->startOffset:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", endOffset="

    .line 153
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    iget v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->endOffset:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", subframes="

    .line 155
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->subframes:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    .line 157
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected unpackFrameData([B)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mpatric/mp3agic/InvalidDataException;
        }
    .end annotation

    .line 37
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 39
    invoke-static {v0}, Lcom/mpatric/mp3agic/ByteBufferUtils;->extractNullTerminatedString(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->id:Ljava/lang/String;

    .line 41
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 42
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    iput v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->startTime:I

    .line 43
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    iput v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->endTime:I

    .line 44
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    iput v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->startOffset:I

    .line 45
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    iput v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->endOffset:I

    .line 47
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    .line 48
    new-instance v1, Lcom/mpatric/mp3agic/ID3v2Frame;

    invoke-direct {v1, p1, v0}, Lcom/mpatric/mp3agic/ID3v2Frame;-><init>([BI)V

    .line 49
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/ID3v2Frame;->getLength()I

    move-result v2

    add-int/2addr v0, v2

    .line 50
    iget-object v2, p0, Lcom/mpatric/mp3agic/ID3v2ChapterFrameData;->subframes:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method
