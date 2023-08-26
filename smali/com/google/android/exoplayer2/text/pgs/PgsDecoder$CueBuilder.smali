.class final Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;
.super Ljava/lang/Object;
.source "PgsDecoder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/text/pgs/PgsDecoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "CueBuilder"
.end annotation


# instance fields
.field private final bitmapData:Lcom/google/android/exoplayer2/util/ParsableByteArray;

.field private bitmapHeight:I

.field private bitmapWidth:I

.field private bitmapX:I

.field private bitmapY:I

.field private final colors:[I

.field private colorsSet:Z

.field private planeHeight:I

.field private planeWidth:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 148
    new-instance v0, Lcom/google/android/exoplayer2/util/ParsableByteArray;

    invoke-direct {v0}, Lcom/google/android/exoplayer2/util/ParsableByteArray;-><init>()V

    iput-object v0, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapData:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    const/16 v0, 0x100

    new-array v0, v0, [I

    .line 149
    iput-object v0, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->colors:[I

    return-void
.end method

.method static synthetic access$000(Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;Lcom/google/android/exoplayer2/util/ParsableByteArray;I)V
    .locals 0

    .line 134
    invoke-direct {p0, p1, p2}, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->parsePaletteSection(Lcom/google/android/exoplayer2/util/ParsableByteArray;I)V

    return-void
.end method

.method static synthetic access$100(Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;Lcom/google/android/exoplayer2/util/ParsableByteArray;I)V
    .locals 0

    .line 134
    invoke-direct {p0, p1, p2}, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->parseBitmapSection(Lcom/google/android/exoplayer2/util/ParsableByteArray;I)V

    return-void
.end method

.method static synthetic access$200(Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;Lcom/google/android/exoplayer2/util/ParsableByteArray;I)V
    .locals 0

    .line 134
    invoke-direct {p0, p1, p2}, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->parseIdentifierSection(Lcom/google/android/exoplayer2/util/ParsableByteArray;I)V

    return-void
.end method

.method private parseBitmapSection(Lcom/google/android/exoplayer2/util/ParsableByteArray;I)V
    .locals 3

    const/4 v0, 0x4

    if-ge p2, v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x3

    .line 183
    invoke-virtual {p1, v1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->skipBytes(I)V

    .line 184
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->readUnsignedByte()I

    move-result v1

    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    add-int/lit8 p2, p2, -0x4

    if-eqz v1, :cond_4

    const/4 v1, 0x7

    if-ge p2, v1, :cond_2

    return-void

    .line 191
    :cond_2
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->readUnsignedInt24()I

    move-result v1

    if-ge v1, v0, :cond_3

    return-void

    .line 195
    :cond_3
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->readUnsignedShort()I

    move-result v2

    iput v2, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapWidth:I

    .line 196
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->readUnsignedShort()I

    move-result v2

    iput v2, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapHeight:I

    .line 197
    iget-object v2, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapData:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    sub-int/2addr v1, v0

    invoke-virtual {v2, v1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->reset(I)V

    add-int/lit8 p2, p2, -0x7

    .line 201
    :cond_4
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapData:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->getPosition()I

    move-result v0

    .line 202
    iget-object v1, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapData:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    invoke-virtual {v1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->limit()I

    move-result v1

    if-ge v0, v1, :cond_5

    if-lez p2, :cond_5

    sub-int/2addr v1, v0

    .line 204
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 205
    iget-object v1, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapData:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    iget-object v1, v1, Lcom/google/android/exoplayer2/util/ParsableByteArray;->data:[B

    invoke-virtual {p1, v1, v0, p2}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->readBytes([BII)V

    .line 206
    iget-object p1, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapData:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    add-int/2addr v0, p2

    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->setPosition(I)V

    :cond_5
    return-void
.end method

.method private parseIdentifierSection(Lcom/google/android/exoplayer2/util/ParsableByteArray;I)V
    .locals 1

    const/16 v0, 0x13

    if-ge p2, v0, :cond_0

    return-void

    .line 214
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->readUnsignedShort()I

    move-result p2

    iput p2, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->planeWidth:I

    .line 215
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->readUnsignedShort()I

    move-result p2

    iput p2, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->planeHeight:I

    const/16 p2, 0xb

    .line 216
    invoke-virtual {p1, p2}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->skipBytes(I)V

    .line 217
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->readUnsignedShort()I

    move-result p2

    iput p2, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapX:I

    .line 218
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->readUnsignedShort()I

    move-result p1

    iput p1, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapY:I

    return-void
.end method

.method private parsePaletteSection(Lcom/google/android/exoplayer2/util/ParsableByteArray;I)V
    .locals 17

    move-object/from16 v0, p0

    .line 153
    rem-int/lit8 v1, p2, 0x5

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    return-void

    :cond_0
    move-object/from16 v1, p1

    .line 157
    invoke-virtual {v1, v2}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->skipBytes(I)V

    .line 159
    iget-object v2, v0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->colors:[I

    const/4 v3, 0x0

    invoke-static {v2, v3}, Ljava/util/Arrays;->fill([II)V

    .line 160
    div-int/lit8 v2, p2, 0x5

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    .line 162
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->readUnsignedByte()I

    move-result v5

    .line 163
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->readUnsignedByte()I

    move-result v6

    .line 164
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->readUnsignedByte()I

    move-result v7

    .line 165
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->readUnsignedByte()I

    move-result v8

    .line 166
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->readUnsignedByte()I

    move-result v9

    int-to-double v10, v6

    const-wide v12, 0x3ff66e978d4fdf3bL    # 1.402

    add-int/lit8 v7, v7, -0x80

    int-to-double v6, v7

    .line 167
    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v12, v12, v6

    invoke-static {v10, v11}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v12, v10

    double-to-int v12, v12

    const-wide v13, 0x3fd60663c74fb54aL    # 0.34414

    add-int/lit8 v8, v8, -0x80

    move/from16 p2, v4

    int-to-double v3, v8

    .line 168
    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v13, v13, v3

    invoke-static {v10, v11}, Ljava/lang/Double;->isNaN(D)Z

    sub-double v13, v10, v13

    const-wide v15, 0x3fe6da3c21187e7cL    # 0.71414

    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v6, v6, v15

    sub-double/2addr v13, v6

    double-to-int v6, v13

    const-wide v7, 0x3ffc5a1cac083127L    # 1.772

    .line 169
    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v3, v3, v7

    invoke-static {v10, v11}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v10, v3

    double-to-int v3, v10

    .line 170
    iget-object v4, v0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->colors:[I

    shl-int/lit8 v7, v9, 0x18

    const/16 v8, 0xff

    const/4 v9, 0x0

    .line 172
    invoke-static {v12, v9, v8}, Lcom/google/android/exoplayer2/util/Util;->constrainValue(III)I

    move-result v10

    shl-int/lit8 v10, v10, 0x10

    or-int/2addr v7, v10

    .line 173
    invoke-static {v6, v9, v8}, Lcom/google/android/exoplayer2/util/Util;->constrainValue(III)I

    move-result v6

    shl-int/lit8 v6, v6, 0x8

    or-int/2addr v6, v7

    .line 174
    invoke-static {v3, v9, v8}, Lcom/google/android/exoplayer2/util/Util;->constrainValue(III)I

    move-result v3

    or-int/2addr v3, v6

    aput v3, v4, v5

    add-int/lit8 v4, p2, 0x1

    const/4 v3, 0x0

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    .line 176
    iput-boolean v1, v0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->colorsSet:Z

    return-void
.end method


# virtual methods
.method public build()Lcom/google/android/exoplayer2/text/Cue;
    .locals 12

    .line 222
    iget v0, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->planeWidth:I

    if-eqz v0, :cond_6

    iget v0, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->planeHeight:I

    if-eqz v0, :cond_6

    iget v0, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapWidth:I

    if-eqz v0, :cond_6

    iget v0, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapHeight:I

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapData:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    .line 226
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->limit()I

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapData:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    .line 227
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->getPosition()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapData:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    invoke-virtual {v1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->limit()I

    move-result v1

    if-ne v0, v1, :cond_6

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->colorsSet:Z

    if-nez v0, :cond_0

    goto/16 :goto_4

    .line 232
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapData:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->setPosition(I)V

    .line 233
    iget v0, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapWidth:I

    iget v2, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapHeight:I

    mul-int v0, v0, v2

    new-array v2, v0, [I

    const/4 v3, 0x0

    :cond_1
    :goto_0
    if-ge v3, v0, :cond_5

    .line 236
    iget-object v4, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapData:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    invoke-virtual {v4}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->readUnsignedByte()I

    move-result v4

    if-eqz v4, :cond_2

    add-int/lit8 v5, v3, 0x1

    .line 238
    iget-object v6, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->colors:[I

    aget v4, v6, v4

    aput v4, v2, v3

    :goto_1
    move v3, v5

    goto :goto_0

    .line 240
    :cond_2
    iget-object v4, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapData:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    invoke-virtual {v4}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->readUnsignedByte()I

    move-result v4

    if-eqz v4, :cond_1

    and-int/lit8 v5, v4, 0x40

    if-nez v5, :cond_3

    and-int/lit8 v5, v4, 0x3f

    goto :goto_2

    :cond_3
    and-int/lit8 v5, v4, 0x3f

    shl-int/lit8 v5, v5, 0x8

    .line 242
    iget-object v6, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapData:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    .line 245
    invoke-virtual {v6}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->readUnsignedByte()I

    move-result v6

    or-int/2addr v5, v6

    :goto_2
    and-int/lit16 v4, v4, 0x80

    if-nez v4, :cond_4

    const/4 v4, 0x0

    goto :goto_3

    .line 246
    :cond_4
    iget-object v4, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->colors:[I

    iget-object v6, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapData:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    invoke-virtual {v6}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->readUnsignedByte()I

    move-result v6

    aget v4, v4, v6

    :goto_3
    add-int/2addr v5, v3

    .line 247
    invoke-static {v2, v3, v5, v4}, Ljava/util/Arrays;->fill([IIII)V

    goto :goto_1

    .line 253
    :cond_5
    iget v0, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapWidth:I

    iget v1, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapHeight:I

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 254
    invoke-static {v2, v0, v1, v3}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 256
    new-instance v0, Lcom/google/android/exoplayer2/text/Cue;

    iget v1, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapX:I

    int-to-float v1, v1

    iget v2, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->planeWidth:I

    int-to-float v3, v2

    div-float v6, v1, v3

    const/4 v7, 0x0

    iget v1, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapY:I

    int-to-float v1, v1

    iget v3, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->planeHeight:I

    int-to-float v4, v3

    div-float v8, v1, v4

    const/4 v9, 0x0

    iget v1, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapWidth:I

    int-to-float v1, v1

    int-to-float v2, v2

    div-float v10, v1, v2

    iget v1, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapHeight:I

    int-to-float v1, v1

    int-to-float v2, v3

    div-float v11, v1, v2

    move-object v4, v0

    invoke-direct/range {v4 .. v11}, Lcom/google/android/exoplayer2/text/Cue;-><init>(Landroid/graphics/Bitmap;FIFIFF)V

    return-object v0

    :cond_6
    :goto_4
    const/4 v0, 0x0

    return-object v0
.end method

.method public reset()V
    .locals 2

    const/4 v0, 0x0

    .line 267
    iput v0, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->planeWidth:I

    .line 268
    iput v0, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->planeHeight:I

    .line 269
    iput v0, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapX:I

    .line 270
    iput v0, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapY:I

    .line 271
    iput v0, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapWidth:I

    .line 272
    iput v0, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapHeight:I

    .line 273
    iget-object v1, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->bitmapData:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    invoke-virtual {v1, v0}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->reset(I)V

    .line 274
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/text/pgs/PgsDecoder$CueBuilder;->colorsSet:Z

    return-void
.end method
