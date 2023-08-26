.class public Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;
.super Lcom/mpatric/mp3agic/AbstractID3v2FrameData;
.source "ID3v2ChapterTOCFrameData.java"


# instance fields
.field protected children:[Ljava/lang/String;

.field protected id:Ljava/lang/String;

.field protected isOrdered:Z

.field protected isRoot:Z

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

    .line 17
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;-><init>(Z)V

    .line 14
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->subframes:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(ZZZLjava/lang/String;[Ljava/lang/String;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;-><init>(Z)V

    .line 14
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->subframes:Ljava/util/ArrayList;

    .line 23
    iput-boolean p2, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->isRoot:Z

    .line 24
    iput-boolean p3, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->isOrdered:Z

    .line 25
    iput-object p4, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->id:Ljava/lang/String;

    .line 26
    iput-object p5, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->children:[Ljava/lang/String;

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

    .line 14
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->subframes:Ljava/util/ArrayList;

    .line 32
    invoke-virtual {p0, p2}, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->synchroniseAndUnpackFrameData([B)V

    return-void
.end method

.method private getFlags()B
    .locals 2

    .line 95
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->isRoot:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    int-to-byte v0, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 99
    :goto_0
    iget-boolean v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->isOrdered:Z

    if-eqz v1, :cond_1

    or-int/lit8 v0, v0, 0x2

    int-to-byte v0, v0

    :cond_1
    return v0
.end method


# virtual methods
.method public addSubframe(Ljava/lang/String;Lcom/mpatric/mp3agic/AbstractID3v2FrameData;)V
    .locals 2

    .line 66
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->subframes:Ljava/util/ArrayList;

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

    .line 207
    :cond_0
    invoke-super {p0, p1}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 209
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v1, v3, :cond_2

    return v2

    .line 211
    :cond_2
    check-cast p1, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;

    .line 212
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->children:[Ljava/lang/String;

    iget-object v3, p1, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->children:[Ljava/lang/String;

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    .line 214
    :cond_3
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->id:Ljava/lang/String;

    if-nez v1, :cond_4

    .line 215
    iget-object v1, p1, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->id:Ljava/lang/String;

    if-eqz v1, :cond_5

    return v2

    .line 217
    :cond_4
    iget-object v3, p1, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->id:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    .line 219
    :cond_5
    iget-boolean v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->isOrdered:Z

    iget-boolean v3, p1, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->isOrdered:Z

    if-eq v1, v3, :cond_6

    return v2

    .line 221
    :cond_6
    iget-boolean v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->isRoot:Z

    iget-boolean v3, p1, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->isRoot:Z

    if-eq v1, v3, :cond_7

    return v2

    .line 223
    :cond_7
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->subframes:Ljava/util/ArrayList;

    if-nez v1, :cond_8

    .line 224
    iget-object p1, p1, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->subframes:Ljava/util/ArrayList;

    if-eqz p1, :cond_9

    return v2

    .line 226
    :cond_8
    iget-object p1, p1, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->subframes:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public getChildren()[Ljava/lang/String;
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->children:[Ljava/lang/String;

    return-object v0
.end method

.method public getChilds()[Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 139
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->children:[Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->id:Ljava/lang/String;

    return-object v0
.end method

.method protected getLength()I
    .locals 5

    .line 158
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->id:Ljava/lang/String;

    const/4 v1, 0x3

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v1, v0

    .line 159
    :cond_0
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->children:[Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 160
    array-length v2, v0

    add-int/2addr v1, v2

    .line 161
    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    .line 162
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 165
    :cond_1
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->subframes:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 166
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mpatric/mp3agic/ID3v2Frame;

    .line 167
    invoke-virtual {v2}, Lcom/mpatric/mp3agic/ID3v2Frame;->getLength()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_1

    :cond_2
    return v1
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

    .line 148
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->subframes:Ljava/util/ArrayList;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    .line 193
    invoke-super {p0}, Lcom/mpatric/mp3agic/AbstractID3v2FrameData;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 194
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->children:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 195
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->id:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 196
    iget-boolean v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->isOrdered:Z

    const/16 v3, 0x4cf

    const/16 v4, 0x4d5

    if-eqz v1, :cond_1

    const/16 v1, 0x4cf

    goto :goto_1

    :cond_1
    const/16 v1, 0x4d5

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 197
    iget-boolean v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->isRoot:Z

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    const/16 v3, 0x4d5

    :goto_2
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    .line 198
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->subframes:Ljava/util/ArrayList;

    if-nez v1, :cond_3

    goto :goto_3

    .line 199
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    return v0
.end method

.method public isOrdered()Z
    .locals 1

    .line 114
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->isOrdered:Z

    return v0
.end method

.method public isRoot()Z
    .locals 1

    .line 106
    iget-boolean v0, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->isRoot:Z

    return v0
.end method

.method protected packFrameData()[B
    .locals 6

    .line 71
    invoke-virtual {p0}, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->getLength()I

    move-result v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 72
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->id:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    const/4 v1, 0x0

    .line 73
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 74
    invoke-direct {p0}, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->getFlags()B

    move-result v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 75
    iget-object v2, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->children:[Ljava/lang/String;

    array-length v2, v2

    int-to-byte v2, v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 77
    iget-object v2, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->children:[Ljava/lang/String;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v2, v4

    .line 78
    invoke-virtual {v5}, Ljava/lang/String;->getBytes()[B

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 79
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 82
    :cond_0
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->subframes:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mpatric/mp3agic/ID3v2Frame;

    .line 84
    :try_start_0
    invoke-virtual {v2}, Lcom/mpatric/mp3agic/ID3v2Frame;->toBytes()[B

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Lcom/mpatric/mp3agic/NotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    .line 86
    invoke-virtual {v2}, Lcom/mpatric/mp3agic/NotSupportedException;->printStackTrace()V

    goto :goto_1

    .line 89
    :cond_1
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    return-object v0
.end method

.method public setChildren([Ljava/lang/String;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->children:[Ljava/lang/String;

    return-void
.end method

.method public setChilds([Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 144
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->children:[Ljava/lang/String;

    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .line 126
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->id:Ljava/lang/String;

    return-void
.end method

.method public setOrdered(Z)V
    .locals 0

    .line 118
    iput-boolean p1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->isOrdered:Z

    return-void
.end method

.method public setRoot(Z)V
    .locals 0

    .line 110
    iput-boolean p1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->isRoot:Z

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

    .line 152
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->subframes:Ljava/util/ArrayList;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 175
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ID3v2ChapterTOCFrameData [isRoot="

    .line 176
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    iget-boolean v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->isRoot:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isOrdered="

    .line 178
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    iget-boolean v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->isOrdered:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    .line 180
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", children="

    .line 182
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->children:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", subframes="

    .line 184
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    iget-object v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->subframes:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    .line 186
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected unpackFrameData([B)V
    .locals 5
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

    iput-object v1, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->id:Ljava/lang/String;

    .line 41
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    .line 43
    iput-boolean v3, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->isRoot:Z

    :cond_0
    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    .line 46
    iput-boolean v3, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->isOrdered:Z

    .line 49
    :cond_1
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    .line 51
    new-array v2, v1, [Ljava/lang/String;

    iput-object v2, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->children:[Ljava/lang/String;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 54
    iget-object v3, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->children:[Ljava/lang/String;

    invoke-static {v0}, Lcom/mpatric/mp3agic/ByteBufferUtils;->extractNullTerminatedString(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 57
    :cond_2
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    :goto_1
    array-length v1, p1

    if-ge v0, v1, :cond_3

    .line 58
    new-instance v1, Lcom/mpatric/mp3agic/ID3v2Frame;

    invoke-direct {v1, p1, v0}, Lcom/mpatric/mp3agic/ID3v2Frame;-><init>([BI)V

    .line 59
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/ID3v2Frame;->getLength()I

    move-result v2

    add-int/2addr v0, v2

    .line 60
    iget-object v2, p0, Lcom/mpatric/mp3agic/ID3v2ChapterTOCFrameData;->subframes:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    return-void
.end method
