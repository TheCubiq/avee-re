.class final Lcom/google/android/exoplayer2/text/dvb/DvbParser;
.super Ljava/lang/Object;
.source "DvbParser.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/text/dvb/DvbParser$ObjectData;,
        Lcom/google/android/exoplayer2/text/dvb/DvbParser$ClutDefinition;,
        Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionObject;,
        Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;,
        Lcom/google/android/exoplayer2/text/dvb/DvbParser$PageRegion;,
        Lcom/google/android/exoplayer2/text/dvb/DvbParser$PageComposition;,
        Lcom/google/android/exoplayer2/text/dvb/DvbParser$DisplayDefinition;,
        Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;
    }
.end annotation


# static fields
.field private static final DATA_TYPE_24_TABLE_DATA:I = 0x20

.field private static final DATA_TYPE_28_TABLE_DATA:I = 0x21

.field private static final DATA_TYPE_2BP_CODE_STRING:I = 0x10

.field private static final DATA_TYPE_48_TABLE_DATA:I = 0x22

.field private static final DATA_TYPE_4BP_CODE_STRING:I = 0x11

.field private static final DATA_TYPE_8BP_CODE_STRING:I = 0x12

.field private static final DATA_TYPE_END_LINE:I = 0xf0

.field private static final OBJECT_CODING_PIXELS:I = 0x0

.field private static final OBJECT_CODING_STRING:I = 0x1

.field private static final PAGE_STATE_NORMAL:I = 0x0

.field private static final REGION_DEPTH_4_BIT:I = 0x2

.field private static final REGION_DEPTH_8_BIT:I = 0x3

.field private static final SEGMENT_TYPE_CLUT_DEFINITION:I = 0x12

.field private static final SEGMENT_TYPE_DISPLAY_DEFINITION:I = 0x14

.field private static final SEGMENT_TYPE_OBJECT_DATA:I = 0x13

.field private static final SEGMENT_TYPE_PAGE_COMPOSITION:I = 0x10

.field private static final SEGMENT_TYPE_REGION_COMPOSITION:I = 0x11

.field private static final TAG:Ljava/lang/String; = "DvbParser"

.field private static final defaultMap2To4:[B

.field private static final defaultMap2To8:[B

.field private static final defaultMap4To8:[B


# instance fields
.field private bitmap:Landroid/graphics/Bitmap;

.field private final canvas:Landroid/graphics/Canvas;

.field private final defaultClutDefinition:Lcom/google/android/exoplayer2/text/dvb/DvbParser$ClutDefinition;

.field private final defaultDisplayDefinition:Lcom/google/android/exoplayer2/text/dvb/DvbParser$DisplayDefinition;

.field private final defaultPaint:Landroid/graphics/Paint;

.field private final fillRegionPaint:Landroid/graphics/Paint;

.field private final subtitleService:Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x4

    new-array v1, v0, [B

    .line 72
    fill-array-data v1, :array_0

    sput-object v1, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->defaultMap2To4:[B

    new-array v0, v0, [B

    .line 74
    fill-array-data v0, :array_1

    sput-object v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->defaultMap2To8:[B

    const/16 v0, 0x10

    new-array v0, v0, [B

    .line 76
    fill-array-data v0, :array_2

    sput-object v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->defaultMap4To8:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x7t
        0x8t
        0xft
    .end array-data

    :array_1
    .array-data 1
        0x0t
        0x77t
        -0x78t
        -0x1t
    .end array-data

    :array_2
    .array-data 1
        0x0t
        0x11t
        0x22t
        0x33t
        0x44t
        0x55t
        0x66t
        0x77t
        -0x78t
        -0x67t
        -0x56t
        -0x45t
        -0x34t
        -0x23t
        -0x12t
        -0x1t
    .end array-data
.end method

.method public constructor <init>(II)V
    .locals 8

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->defaultPaint:Landroid/graphics/Paint;

    .line 99
    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 100
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->defaultPaint:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 101
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->defaultPaint:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 102
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->fillRegionPaint:Landroid/graphics/Paint;

    .line 103
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 104
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->fillRegionPaint:Landroid/graphics/Paint;

    new-instance v2, Landroid/graphics/PorterDuffXfermode;

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->DST_OVER:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v2, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 105
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->fillRegionPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 106
    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0}, Landroid/graphics/Canvas;-><init>()V

    iput-object v0, p0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->canvas:Landroid/graphics/Canvas;

    .line 107
    new-instance v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser$DisplayDefinition;

    const/16 v2, 0x2cf

    const/16 v3, 0x23f

    const/4 v4, 0x0

    const/16 v5, 0x2cf

    const/4 v6, 0x0

    const/16 v7, 0x23f

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/google/android/exoplayer2/text/dvb/DvbParser$DisplayDefinition;-><init>(IIIIII)V

    iput-object v0, p0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->defaultDisplayDefinition:Lcom/google/android/exoplayer2/text/dvb/DvbParser$DisplayDefinition;

    .line 108
    new-instance v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser$ClutDefinition;

    invoke-static {}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->generateDefault2BitClutEntries()[I

    move-result-object v1

    .line 109
    invoke-static {}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->generateDefault4BitClutEntries()[I

    move-result-object v2

    invoke-static {}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->generateDefault8BitClutEntries()[I

    move-result-object v3

    invoke-direct {v0, v4, v1, v2, v3}, Lcom/google/android/exoplayer2/text/dvb/DvbParser$ClutDefinition;-><init>(I[I[I[I)V

    iput-object v0, p0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->defaultClutDefinition:Lcom/google/android/exoplayer2/text/dvb/DvbParser$ClutDefinition;

    .line 110
    new-instance v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;

    invoke-direct {v0, p1, p2}, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;-><init>(II)V

    iput-object v0, p0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->subtitleService:Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;

    return-void
.end method

.method private static buildClutMapTable(IILcom/google/android/exoplayer2/util/ParsableBitArray;)[B
    .locals 3

    .line 801
    new-array v0, p0, [B

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p0, :cond_0

    .line 803
    invoke-virtual {p2, p1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v2

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static generateDefault2BitClutEntries()[I
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [I

    .line 498
    fill-array-data v0, :array_0

    return-object v0

    nop

    :array_0
    .array-data 4
        0x0
        -0x1
        -0x1000000
        -0x808081
    .end array-data
.end method

.method private static generateDefault4BitClutEntries()[I
    .locals 9

    const/16 v0, 0x10

    new-array v1, v0, [I

    const/4 v2, 0x0

    aput v2, v1, v2

    const/4 v3, 0x1

    :goto_0
    if-ge v3, v0, :cond_7

    const/16 v4, 0x8

    const/16 v5, 0xff

    if-ge v3, v4, :cond_3

    and-int/lit8 v4, v3, 0x1

    if-eqz v4, :cond_0

    const/16 v4, 0xff

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    :goto_1
    and-int/lit8 v6, v3, 0x2

    if-eqz v6, :cond_1

    const/16 v6, 0xff

    goto :goto_2

    :cond_1
    const/4 v6, 0x0

    :goto_2
    and-int/lit8 v7, v3, 0x4

    if-eqz v7, :cond_2

    const/16 v7, 0xff

    goto :goto_3

    :cond_2
    const/4 v7, 0x0

    .line 511
    :goto_3
    invoke-static {v5, v4, v6, v7}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->getColor(IIII)I

    move-result v4

    aput v4, v1, v3

    goto :goto_7

    :cond_3
    and-int/lit8 v4, v3, 0x1

    const/16 v6, 0x7f

    if-eqz v4, :cond_4

    const/16 v4, 0x7f

    goto :goto_4

    :cond_4
    const/4 v4, 0x0

    :goto_4
    and-int/lit8 v7, v3, 0x2

    if-eqz v7, :cond_5

    const/16 v7, 0x7f

    goto :goto_5

    :cond_5
    const/4 v7, 0x0

    :goto_5
    and-int/lit8 v8, v3, 0x4

    if-eqz v8, :cond_6

    goto :goto_6

    :cond_6
    const/4 v6, 0x0

    .line 517
    :goto_6
    invoke-static {v5, v4, v7, v6}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->getColor(IIII)I

    move-result v4

    aput v4, v1, v3

    :goto_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_7
    return-object v1
.end method

.method private static generateDefault8BitClutEntries()[I
    .locals 11

    const/16 v0, 0x100

    new-array v1, v0, [I

    const/4 v2, 0x0

    aput v2, v1, v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_20

    const/16 v4, 0x8

    const/16 v5, 0xff

    if-ge v3, v4, :cond_3

    const/16 v4, 0x3f

    and-int/lit8 v6, v3, 0x1

    if-eqz v6, :cond_0

    const/16 v6, 0xff

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    :goto_1
    and-int/lit8 v7, v3, 0x2

    if-eqz v7, :cond_1

    const/16 v7, 0xff

    goto :goto_2

    :cond_1
    const/4 v7, 0x0

    :goto_2
    and-int/lit8 v8, v3, 0x4

    if-eqz v8, :cond_2

    goto :goto_3

    :cond_2
    const/4 v5, 0x0

    .line 532
    :goto_3
    invoke-static {v4, v6, v7, v5}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->getColor(IIII)I

    move-result v4

    aput v4, v1, v3

    goto/16 :goto_1c

    :cond_3
    and-int/lit16 v6, v3, 0x88

    const/16 v7, 0xaa

    const/16 v8, 0x55

    if-eqz v6, :cond_19

    const/16 v9, 0x7f

    if-eq v6, v4, :cond_12

    const/16 v4, 0x80

    const/16 v7, 0x2b

    if-eq v6, v4, :cond_b

    const/16 v4, 0x88

    if-eq v6, v4, :cond_4

    goto/16 :goto_1c

    :cond_4
    and-int/lit8 v4, v3, 0x1

    if-eqz v4, :cond_5

    const/16 v4, 0x2b

    goto :goto_4

    :cond_5
    const/4 v4, 0x0

    :goto_4
    and-int/lit8 v6, v3, 0x10

    if-eqz v6, :cond_6

    const/16 v6, 0x55

    goto :goto_5

    :cond_6
    const/4 v6, 0x0

    :goto_5
    add-int/2addr v4, v6

    and-int/lit8 v6, v3, 0x2

    if-eqz v6, :cond_7

    const/16 v6, 0x2b

    goto :goto_6

    :cond_7
    const/4 v6, 0x0

    :goto_6
    and-int/lit8 v9, v3, 0x20

    if-eqz v9, :cond_8

    const/16 v9, 0x55

    goto :goto_7

    :cond_8
    const/4 v9, 0x0

    :goto_7
    add-int/2addr v6, v9

    and-int/lit8 v9, v3, 0x4

    if-eqz v9, :cond_9

    goto :goto_8

    :cond_9
    const/4 v7, 0x0

    :goto_8
    and-int/lit8 v9, v3, 0x40

    if-eqz v9, :cond_a

    goto :goto_9

    :cond_a
    const/4 v8, 0x0

    :goto_9
    add-int/2addr v7, v8

    .line 561
    invoke-static {v5, v4, v6, v7}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->getColor(IIII)I

    move-result v4

    aput v4, v1, v3

    goto/16 :goto_1c

    :cond_b
    and-int/lit8 v4, v3, 0x1

    if-eqz v4, :cond_c

    const/16 v4, 0x2b

    goto :goto_a

    :cond_c
    const/4 v4, 0x0

    :goto_a
    add-int/2addr v4, v9

    and-int/lit8 v6, v3, 0x10

    if-eqz v6, :cond_d

    const/16 v6, 0x55

    goto :goto_b

    :cond_d
    const/4 v6, 0x0

    :goto_b
    add-int/2addr v4, v6

    and-int/lit8 v6, v3, 0x2

    if-eqz v6, :cond_e

    const/16 v6, 0x2b

    goto :goto_c

    :cond_e
    const/4 v6, 0x0

    :goto_c
    add-int/2addr v6, v9

    and-int/lit8 v10, v3, 0x20

    if-eqz v10, :cond_f

    const/16 v10, 0x55

    goto :goto_d

    :cond_f
    const/4 v10, 0x0

    :goto_d
    add-int/2addr v6, v10

    and-int/lit8 v10, v3, 0x4

    if-eqz v10, :cond_10

    goto :goto_e

    :cond_10
    const/4 v7, 0x0

    :goto_e
    add-int/2addr v7, v9

    and-int/lit8 v9, v3, 0x40

    if-eqz v9, :cond_11

    goto :goto_f

    :cond_11
    const/4 v8, 0x0

    :goto_f
    add-int/2addr v7, v8

    .line 554
    invoke-static {v5, v4, v6, v7}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->getColor(IIII)I

    move-result v4

    aput v4, v1, v3

    goto/16 :goto_1c

    :cond_12
    and-int/lit8 v4, v3, 0x1

    if-eqz v4, :cond_13

    const/16 v4, 0x55

    goto :goto_10

    :cond_13
    const/4 v4, 0x0

    :goto_10
    and-int/lit8 v5, v3, 0x10

    if-eqz v5, :cond_14

    const/16 v5, 0xaa

    goto :goto_11

    :cond_14
    const/4 v5, 0x0

    :goto_11
    add-int/2addr v4, v5

    and-int/lit8 v5, v3, 0x2

    if-eqz v5, :cond_15

    const/16 v5, 0x55

    goto :goto_12

    :cond_15
    const/4 v5, 0x0

    :goto_12
    and-int/lit8 v6, v3, 0x20

    if-eqz v6, :cond_16

    const/16 v6, 0xaa

    goto :goto_13

    :cond_16
    const/4 v6, 0x0

    :goto_13
    add-int/2addr v5, v6

    and-int/lit8 v6, v3, 0x4

    if-eqz v6, :cond_17

    goto :goto_14

    :cond_17
    const/4 v8, 0x0

    :goto_14
    and-int/lit8 v6, v3, 0x40

    if-eqz v6, :cond_18

    goto :goto_15

    :cond_18
    const/4 v7, 0x0

    :goto_15
    add-int/2addr v8, v7

    .line 547
    invoke-static {v9, v4, v5, v8}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->getColor(IIII)I

    move-result v4

    aput v4, v1, v3

    goto :goto_1c

    :cond_19
    and-int/lit8 v4, v3, 0x1

    if-eqz v4, :cond_1a

    const/16 v4, 0x55

    goto :goto_16

    :cond_1a
    const/4 v4, 0x0

    :goto_16
    and-int/lit8 v6, v3, 0x10

    if-eqz v6, :cond_1b

    const/16 v6, 0xaa

    goto :goto_17

    :cond_1b
    const/4 v6, 0x0

    :goto_17
    add-int/2addr v4, v6

    and-int/lit8 v6, v3, 0x2

    if-eqz v6, :cond_1c

    const/16 v6, 0x55

    goto :goto_18

    :cond_1c
    const/4 v6, 0x0

    :goto_18
    and-int/lit8 v9, v3, 0x20

    if-eqz v9, :cond_1d

    const/16 v9, 0xaa

    goto :goto_19

    :cond_1d
    const/4 v9, 0x0

    :goto_19
    add-int/2addr v6, v9

    and-int/lit8 v9, v3, 0x4

    if-eqz v9, :cond_1e

    goto :goto_1a

    :cond_1e
    const/4 v8, 0x0

    :goto_1a
    and-int/lit8 v9, v3, 0x40

    if-eqz v9, :cond_1f

    goto :goto_1b

    :cond_1f
    const/4 v7, 0x0

    :goto_1b
    add-int/2addr v8, v7

    .line 540
    invoke-static {v5, v4, v6, v8}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->getColor(IIII)I

    move-result v4

    aput v4, v1, v3

    :goto_1c
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_20
    return-object v1
.end method

.method private static getColor(IIII)I
    .locals 0

    shl-int/lit8 p0, p0, 0x18

    shl-int/lit8 p1, p1, 0x10

    or-int/2addr p0, p1

    shl-int/lit8 p1, p2, 0x8

    or-int/2addr p0, p1

    or-int/2addr p0, p3

    return p0
.end method

.method private static paint2BitPixelCodeString(Lcom/google/android/exoplayer2/util/ParsableBitArray;[I[BIILandroid/graphics/Paint;Landroid/graphics/Canvas;)I
    .locals 13

    move-object v0, p0

    move/from16 v1, p4

    move-object/from16 v8, p5

    const/4 v9, 0x0

    move/from16 v10, p3

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x2

    .line 669
    invoke-virtual {p0, v3}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    move v11, v2

    :goto_1
    const/4 v12, 0x1

    goto :goto_4

    .line 673
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBit()Z

    move-result v4

    const/4 v6, 0x3

    if-eqz v4, :cond_1

    .line 674
    invoke-virtual {p0, v6}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v4

    add-int/2addr v4, v6

    .line 675
    invoke-virtual {p0, v3}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v3

    :goto_2
    move v11, v2

    move v12, v4

    move v4, v3

    goto :goto_4

    .line 676
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBit()Z

    move-result v4

    if-eqz v4, :cond_2

    move v11, v2

    const/4 v4, 0x0

    goto :goto_1

    .line 679
    :cond_2
    invoke-virtual {p0, v3}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v4

    if-eqz v4, :cond_6

    if-eq v4, v5, :cond_5

    if-eq v4, v3, :cond_4

    if-eq v4, v6, :cond_3

    move v11, v2

    const/4 v4, 0x0

    :goto_3
    const/4 v12, 0x0

    goto :goto_4

    :cond_3
    const/16 v4, 0x8

    .line 691
    invoke-virtual {p0, v4}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x1d

    .line 692
    invoke-virtual {p0, v3}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v3

    goto :goto_2

    :cond_4
    const/4 v4, 0x4

    .line 687
    invoke-virtual {p0, v4}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v4

    add-int/lit8 v4, v4, 0xc

    .line 688
    invoke-virtual {p0, v3}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v3

    goto :goto_2

    :cond_5
    move v11, v2

    const/4 v4, 0x0

    const/4 v12, 0x2

    goto :goto_4

    :cond_6
    const/4 v4, 0x0

    const/4 v11, 0x1

    goto :goto_3

    :goto_4
    if-eqz v12, :cond_8

    if-eqz v8, :cond_8

    if-eqz p2, :cond_7

    .line 698
    aget-byte v4, p2, v4

    :cond_7
    aget v2, p1, v4

    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v3, v10

    int-to-float v4, v1

    add-int v2, v10, v12

    int-to-float v6, v2

    add-int/lit8 v2, v1, 0x1

    int-to-float v7, v2

    move-object/from16 v2, p6

    move v5, v6

    move v6, v7

    move-object/from16 v7, p5

    .line 699
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_8
    add-int/2addr v10, v12

    if-eqz v11, :cond_9

    return v10

    :cond_9
    move v2, v11

    goto :goto_0
.end method

.method private static paint4BitPixelCodeString(Lcom/google/android/exoplayer2/util/ParsableBitArray;[I[BIILandroid/graphics/Paint;Landroid/graphics/Canvas;)I
    .locals 13

    move-object v0, p0

    move/from16 v1, p4

    move-object/from16 v8, p5

    const/4 v9, 0x0

    move/from16 v10, p3

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x4

    .line 717
    invoke-virtual {p0, v3}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v4

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v4, :cond_0

    move v11, v2

    :goto_1
    const/4 v12, 0x1

    goto/16 :goto_4

    .line 721
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBit()Z

    move-result v4

    const/4 v7, 0x3

    if-nez v4, :cond_2

    .line 722
    invoke-virtual {p0, v7}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v5, v3, 0x2

    move v11, v2

    move v12, v5

    const/4 v4, 0x0

    goto :goto_4

    :cond_1
    const/4 v4, 0x0

    const/4 v11, 0x1

    goto :goto_3

    .line 729
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBit()Z

    move-result v4

    if-nez v4, :cond_3

    .line 730
    invoke-virtual {p0, v5}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v4

    add-int/lit8 v5, v4, 0x4

    .line 731
    invoke-virtual {p0, v3}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v4

    :goto_2
    move v11, v2

    move v12, v5

    goto :goto_4

    .line 733
    :cond_3
    invoke-virtual {p0, v5}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v4

    if-eqz v4, :cond_7

    if-eq v4, v6, :cond_6

    if-eq v4, v5, :cond_5

    if-eq v4, v7, :cond_4

    move v11, v2

    const/4 v4, 0x0

    :goto_3
    const/4 v12, 0x0

    goto :goto_4

    :cond_4
    const/16 v4, 0x8

    .line 745
    invoke-virtual {p0, v4}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v4

    add-int/lit8 v5, v4, 0x19

    .line 746
    invoke-virtual {p0, v3}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v4

    goto :goto_2

    .line 741
    :cond_5
    invoke-virtual {p0, v3}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v4

    add-int/lit8 v5, v4, 0x9

    .line 742
    invoke-virtual {p0, v3}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v4

    goto :goto_2

    :cond_6
    move v11, v2

    const/4 v4, 0x0

    const/4 v12, 0x2

    goto :goto_4

    :cond_7
    move v11, v2

    const/4 v4, 0x0

    goto :goto_1

    :goto_4
    if-eqz v12, :cond_9

    if-eqz v8, :cond_9

    if-eqz p2, :cond_8

    .line 752
    aget-byte v4, p2, v4

    :cond_8
    aget v2, p1, v4

    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v3, v10

    int-to-float v4, v1

    add-int v2, v10, v12

    int-to-float v5, v2

    add-int/lit8 v2, v1, 0x1

    int-to-float v6, v2

    move-object/from16 v2, p6

    move-object/from16 v7, p5

    .line 753
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_9
    add-int/2addr v10, v12

    if-eqz v11, :cond_a

    return v10

    :cond_a
    move v2, v11

    goto/16 :goto_0
.end method

.method private static paint8BitPixelCodeString(Lcom/google/android/exoplayer2/util/ParsableBitArray;[I[BIILandroid/graphics/Paint;Landroid/graphics/Canvas;)I
    .locals 13

    move-object v0, p0

    move/from16 v1, p4

    move-object/from16 v8, p5

    const/4 v9, 0x0

    move/from16 v10, p3

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x8

    .line 771
    invoke-virtual {p0, v3}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    move v11, v2

    const/4 v12, 0x1

    goto :goto_1

    .line 776
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBit()Z

    move-result v4

    const/4 v6, 0x7

    if-nez v4, :cond_2

    .line 777
    invoke-virtual {p0, v6}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v3

    if-eqz v3, :cond_1

    move v11, v2

    move v12, v3

    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    goto :goto_1

    .line 785
    :cond_2
    invoke-virtual {p0, v6}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v4

    .line 786
    invoke-virtual {p0, v3}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v3

    move v11, v2

    move v12, v4

    move v4, v3

    :goto_1
    if-eqz v12, :cond_4

    if-eqz v8, :cond_4

    if-eqz p2, :cond_3

    .line 791
    aget-byte v4, p2, v4

    :cond_3
    aget v2, p1, v4

    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v3, v10

    int-to-float v4, v1

    add-int v2, v10, v12

    int-to-float v6, v2

    add-int/lit8 v2, v1, 0x1

    int-to-float v7, v2

    move-object/from16 v2, p6

    move v5, v6

    move v6, v7

    move-object/from16 v7, p5

    .line 792
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_4
    add-int/2addr v10, v12

    if-eqz v11, :cond_5

    return v10

    :cond_5
    move v2, v11

    goto :goto_0
.end method

.method private static paintPixelDataSubBlock([B[IIIILandroid/graphics/Paint;Landroid/graphics/Canvas;)V
    .locals 13

    move v0, p2

    .line 603
    new-instance v8, Lcom/google/android/exoplayer2/util/ParsableBitArray;

    move-object v1, p0

    invoke-direct {v8, p0}, Lcom/google/android/exoplayer2/util/ParsableBitArray;-><init>([B)V

    const/4 v9, 0x0

    move/from16 v4, p3

    move/from16 v10, p4

    move-object v11, v9

    move-object v12, v11

    .line 610
    :goto_0
    invoke-virtual {v8}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->bitsLeft()I

    move-result v1

    if-eqz v1, :cond_6

    const/16 v1, 0x8

    .line 611
    invoke-virtual {v8, v1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v2

    const/16 v3, 0xf0

    if-eq v2, v3, :cond_5

    const/4 v3, 0x3

    packed-switch v2, :pswitch_data_0

    const/4 v3, 0x4

    packed-switch v2, :pswitch_data_1

    goto :goto_0

    :pswitch_0
    const/16 v2, 0x10

    .line 647
    invoke-static {v2, v1, v8}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->buildClutMapTable(IILcom/google/android/exoplayer2/util/ParsableBitArray;)[B

    move-result-object v11

    goto :goto_0

    .line 644
    :pswitch_1
    invoke-static {v3, v1, v8}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->buildClutMapTable(IILcom/google/android/exoplayer2/util/ParsableBitArray;)[B

    move-result-object v11

    goto :goto_0

    .line 641
    :pswitch_2
    invoke-static {v3, v3, v8}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->buildClutMapTable(IILcom/google/android/exoplayer2/util/ParsableBitArray;)[B

    move-result-object v12

    goto :goto_0

    :pswitch_3
    const/4 v3, 0x0

    move-object v1, v8

    move-object v2, p1

    move v5, v10

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    .line 638
    invoke-static/range {v1 .. v7}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->paint8BitPixelCodeString(Lcom/google/android/exoplayer2/util/ParsableBitArray;[I[BIILandroid/graphics/Paint;Landroid/graphics/Canvas;)I

    move-result v4

    goto :goto_0

    :pswitch_4
    if-ne v0, v3, :cond_0

    .line 629
    sget-object v1, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->defaultMap4To8:[B

    move-object v3, v1

    goto :goto_1

    :cond_0
    move-object v3, v9

    :goto_1
    move-object v1, v8

    move-object v2, p1

    move v5, v10

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    .line 633
    invoke-static/range {v1 .. v7}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->paint4BitPixelCodeString(Lcom/google/android/exoplayer2/util/ParsableBitArray;[I[BIILandroid/graphics/Paint;Landroid/graphics/Canvas;)I

    move-result v4

    .line 635
    invoke-virtual {v8}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->byteAlign()V

    goto :goto_0

    :pswitch_5
    if-ne v0, v3, :cond_2

    if-nez v11, :cond_1

    .line 616
    sget-object v1, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->defaultMap2To8:[B

    goto :goto_2

    :cond_1
    move-object v1, v11

    :goto_2
    move-object v3, v1

    goto :goto_3

    :cond_2
    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    if-nez v12, :cond_3

    .line 618
    sget-object v1, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->defaultMap2To4:[B

    goto :goto_2

    :cond_3
    move-object v1, v12

    goto :goto_2

    :cond_4
    move-object v3, v9

    :goto_3
    move-object v1, v8

    move-object v2, p1

    move v5, v10

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    .line 622
    invoke-static/range {v1 .. v7}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->paint2BitPixelCodeString(Lcom/google/android/exoplayer2/util/ParsableBitArray;[I[BIILandroid/graphics/Paint;Landroid/graphics/Canvas;)I

    move-result v4

    .line 624
    invoke-virtual {v8}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->byteAlign()V

    goto :goto_0

    :cond_5
    add-int/lit8 v10, v10, 0x2

    move/from16 v4, p3

    goto :goto_0

    :cond_6
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x20
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static paintPixelDataSubBlocks(Lcom/google/android/exoplayer2/text/dvb/DvbParser$ObjectData;Lcom/google/android/exoplayer2/text/dvb/DvbParser$ClutDefinition;IIILandroid/graphics/Paint;Landroid/graphics/Canvas;)V
    .locals 7

    const/4 v0, 0x3

    if-ne p2, v0, :cond_0

    .line 586
    iget-object p1, p1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$ClutDefinition;->clutEntries8Bit:[I

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 588
    iget-object p1, p1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$ClutDefinition;->clutEntries4Bit:[I

    goto :goto_0

    .line 590
    :cond_1
    iget-object p1, p1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$ClutDefinition;->clutEntries2Bit:[I

    .line 592
    :goto_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/dvb/DvbParser$ObjectData;->topFieldData:[B

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-static/range {v0 .. v6}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->paintPixelDataSubBlock([B[IIIILandroid/graphics/Paint;Landroid/graphics/Canvas;)V

    .line 594
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/dvb/DvbParser$ObjectData;->bottomFieldData:[B

    add-int/lit8 v4, p4, 0x1

    invoke-static/range {v0 .. v6}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->paintPixelDataSubBlock([B[IIIILandroid/graphics/Paint;Landroid/graphics/Canvas;)V

    return-void
.end method

.method private static parseClutDefinition(Lcom/google/android/exoplayer2/util/ParsableBitArray;I)Lcom/google/android/exoplayer2/text/dvb/DvbParser$ClutDefinition;
    .locals 22

    move-object/from16 v0, p0

    const/16 v1, 0x8

    .line 403
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v2

    .line 404
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->skipBits(I)V

    const/4 v3, 0x2

    add-int/lit8 v4, p1, -0x2

    .line 407
    invoke-static {}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->generateDefault2BitClutEntries()[I

    move-result-object v5

    .line 408
    invoke-static {}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->generateDefault4BitClutEntries()[I

    move-result-object v6

    .line 409
    invoke-static {}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->generateDefault8BitClutEntries()[I

    move-result-object v7

    :goto_0
    if-lez v4, :cond_4

    .line 412
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v8

    .line 413
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v9

    add-int/lit8 v4, v4, -0x2

    and-int/lit16 v10, v9, 0x80

    if-eqz v10, :cond_0

    move-object v10, v5

    goto :goto_1

    :cond_0
    and-int/lit8 v10, v9, 0x40

    if-eqz v10, :cond_1

    move-object v10, v6

    goto :goto_1

    :cond_1
    move-object v10, v7

    :goto_1
    and-int/lit8 v9, v9, 0x1

    if-eqz v9, :cond_2

    .line 430
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v9

    .line 431
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v11

    .line 432
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v12

    .line 433
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v13

    add-int/lit8 v4, v4, -0x4

    goto :goto_2

    :cond_2
    const/4 v9, 0x6

    .line 436
    invoke-virtual {v0, v9}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v11

    shl-int/2addr v11, v3

    const/4 v12, 0x4

    .line 437
    invoke-virtual {v0, v12}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v13

    shl-int/2addr v13, v12

    .line 438
    invoke-virtual {v0, v12}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v14

    shl-int/lit8 v12, v14, 0x4

    .line 439
    invoke-virtual {v0, v3}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v14

    shl-int/lit8 v9, v14, 0x6

    add-int/lit8 v4, v4, -0x2

    move/from16 v21, v13

    move v13, v9

    move v9, v11

    move/from16 v11, v21

    :goto_2
    const/16 v15, 0xff

    if-nez v9, :cond_3

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xff

    :cond_3
    and-int/2addr v13, v15

    rsub-int v13, v13, 0xff

    int-to-byte v13, v13

    move/from16 p1, v4

    int-to-double v3, v9

    const-wide v16, 0x3ff66e978d4fdf3bL    # 1.402

    add-int/lit8 v11, v11, -0x80

    move/from16 v18, v2

    int-to-double v1, v11

    .line 450
    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v16, v16, v1

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    move-object v11, v10

    add-double v9, v3, v16

    double-to-int v9, v9

    const-wide v16, 0x3fd60663c74fb54aL    # 0.34414

    add-int/lit8 v12, v12, -0x80

    int-to-double v14, v12

    .line 451
    invoke-static {v14, v15}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v16, v16, v14

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    sub-double v16, v3, v16

    const-wide v19, 0x3fe6da3c21187e7cL    # 0.71414

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v1, v1, v19

    sub-double v1, v16, v1

    double-to-int v1, v1

    const-wide v16, 0x3ffc5a1cac083127L    # 1.772

    .line 452
    invoke-static {v14, v15}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v14, v14, v16

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v3, v14

    double-to-int v2, v3

    const/4 v3, 0x0

    const/16 v4, 0xff

    .line 453
    invoke-static {v9, v3, v4}, Lcom/google/android/exoplayer2/util/Util;->constrainValue(III)I

    move-result v9

    .line 454
    invoke-static {v1, v3, v4}, Lcom/google/android/exoplayer2/util/Util;->constrainValue(III)I

    move-result v1

    invoke-static {v2, v3, v4}, Lcom/google/android/exoplayer2/util/Util;->constrainValue(III)I

    move-result v2

    .line 453
    invoke-static {v13, v9, v1, v2}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->getColor(IIII)I

    move-result v1

    aput v1, v11, v8

    move/from16 v4, p1

    move/from16 v2, v18

    const/16 v1, 0x8

    const/4 v3, 0x2

    goto/16 :goto_0

    :cond_4
    move/from16 v18, v2

    .line 457
    new-instance v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser$ClutDefinition;

    move/from16 v1, v18

    invoke-direct {v0, v1, v5, v6, v7}, Lcom/google/android/exoplayer2/text/dvb/DvbParser$ClutDefinition;-><init>(I[I[I[I)V

    return-object v0
.end method

.method private static parseDisplayDefinition(Lcom/google/android/exoplayer2/util/ParsableBitArray;)Lcom/google/android/exoplayer2/text/dvb/DvbParser$DisplayDefinition;
    .locals 9

    const/4 v0, 0x4

    .line 303
    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->skipBits(I)V

    .line 304
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBit()Z

    move-result v0

    const/4 v1, 0x3

    .line 305
    invoke-virtual {p0, v1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->skipBits(I)V

    const/16 v1, 0x10

    .line 306
    invoke-virtual {p0, v1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v3

    .line 307
    invoke-virtual {p0, v1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v4

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 314
    invoke-virtual {p0, v1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v0

    .line 315
    invoke-virtual {p0, v1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v2

    .line 316
    invoke-virtual {p0, v1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v5

    .line 317
    invoke-virtual {p0, v1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result p0

    move v8, p0

    move v6, v2

    move v7, v5

    move v5, v0

    goto :goto_0

    :cond_0
    move v6, v3

    move v8, v4

    const/4 v5, 0x0

    const/4 v7, 0x0

    .line 325
    :goto_0
    new-instance p0, Lcom/google/android/exoplayer2/text/dvb/DvbParser$DisplayDefinition;

    move-object v2, p0

    invoke-direct/range {v2 .. v8}, Lcom/google/android/exoplayer2/text/dvb/DvbParser$DisplayDefinition;-><init>(IIIIII)V

    return-object p0
.end method

.method private static parseObjectData(Lcom/google/android/exoplayer2/util/ParsableBitArray;)Lcom/google/android/exoplayer2/text/dvb/DvbParser$ObjectData;
    .locals 6

    const/16 v0, 0x10

    .line 466
    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v1

    const/4 v2, 0x4

    .line 467
    invoke-virtual {p0, v2}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->skipBits(I)V

    const/4 v2, 0x2

    .line 468
    invoke-virtual {p0, v2}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v2

    .line 469
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBit()Z

    move-result v3

    const/4 v4, 0x1

    .line 470
    invoke-virtual {p0, v4}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->skipBits(I)V

    const/4 v5, 0x0

    if-ne v2, v4, :cond_0

    const/16 v2, 0x8

    .line 476
    invoke-virtual {p0, v2}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v2

    mul-int/lit8 v2, v2, 0x10

    .line 478
    invoke-virtual {p0, v2}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->skipBits(I)V

    goto :goto_0

    :cond_0
    if-nez v2, :cond_2

    .line 480
    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v2

    .line 481
    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v0

    const/4 v4, 0x0

    if-lez v2, :cond_1

    .line 483
    new-array v5, v2, [B

    .line 484
    invoke-virtual {p0, v5, v4, v2}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBytes([BII)V

    :cond_1
    if-lez v0, :cond_2

    .line 487
    new-array v2, v0, [B

    .line 488
    invoke-virtual {p0, v2, v4, v0}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBytes([BII)V

    goto :goto_1

    :cond_2
    :goto_0
    move-object v2, v5

    .line 494
    :goto_1
    new-instance p0, Lcom/google/android/exoplayer2/text/dvb/DvbParser$ObjectData;

    invoke-direct {p0, v1, v3, v5, v2}, Lcom/google/android/exoplayer2/text/dvb/DvbParser$ObjectData;-><init>(IZ[B[B)V

    return-object p0
.end method

.method private static parsePageComposition(Lcom/google/android/exoplayer2/util/ParsableBitArray;I)Lcom/google/android/exoplayer2/text/dvb/DvbParser$PageComposition;
    .locals 9

    const/16 v0, 0x8

    .line 333
    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v1

    const/4 v2, 0x4

    .line 334
    invoke-virtual {p0, v2}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v2

    const/4 v3, 0x2

    .line 335
    invoke-virtual {p0, v3}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v4

    .line 336
    invoke-virtual {p0, v3}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->skipBits(I)V

    sub-int/2addr p1, v3

    .line 339
    new-instance v3, Landroid/util/SparseArray;

    invoke-direct {v3}, Landroid/util/SparseArray;-><init>()V

    :goto_0
    if-lez p1, :cond_0

    .line 341
    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v5

    .line 342
    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->skipBits(I)V

    const/16 v6, 0x10

    .line 343
    invoke-virtual {p0, v6}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v7

    .line 344
    invoke-virtual {p0, v6}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v6

    add-int/lit8 p1, p1, -0x6

    .line 346
    new-instance v8, Lcom/google/android/exoplayer2/text/dvb/DvbParser$PageRegion;

    invoke-direct {v8, v7, v6}, Lcom/google/android/exoplayer2/text/dvb/DvbParser$PageRegion;-><init>(II)V

    invoke-virtual {v3, v5, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_0

    .line 349
    :cond_0
    new-instance p0, Lcom/google/android/exoplayer2/text/dvb/DvbParser$PageComposition;

    invoke-direct {p0, v1, v2, v4, v3}, Lcom/google/android/exoplayer2/text/dvb/DvbParser$PageComposition;-><init>(IIILandroid/util/SparseArray;)V

    return-object p0
.end method

.method private static parseRegionComposition(Lcom/google/android/exoplayer2/util/ParsableBitArray;I)Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;
    .locals 26

    move-object/from16 v0, p0

    const/16 v1, 0x8

    .line 356
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v3

    const/4 v2, 0x4

    .line 357
    invoke-virtual {v0, v2}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->skipBits(I)V

    .line 358
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBit()Z

    move-result v4

    const/4 v5, 0x3

    .line 359
    invoke-virtual {v0, v5}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->skipBits(I)V

    const/16 v6, 0x10

    .line 360
    invoke-virtual {v0, v6}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v7

    .line 361
    invoke-virtual {v0, v6}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v8

    .line 362
    invoke-virtual {v0, v5}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v9

    .line 363
    invoke-virtual {v0, v5}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v10

    const/4 v5, 0x2

    .line 364
    invoke-virtual {v0, v5}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->skipBits(I)V

    .line 365
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v11

    .line 366
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v12

    .line 367
    invoke-virtual {v0, v2}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v13

    .line 368
    invoke-virtual {v0, v5}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v14

    .line 369
    invoke-virtual {v0, v5}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->skipBits(I)V

    add-int/lit8 v15, p1, -0xa

    .line 372
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    :goto_0
    if-lez v15, :cond_2

    .line 374
    invoke-virtual {v0, v6}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v2

    .line 375
    invoke-virtual {v0, v5}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v6

    .line 376
    invoke-virtual {v0, v5}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v20

    const/16 v5, 0xc

    .line 377
    invoke-virtual {v0, v5}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v21

    move/from16 v25, v14

    const/4 v14, 0x4

    .line 378
    invoke-virtual {v0, v14}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->skipBits(I)V

    .line 379
    invoke-virtual {v0, v5}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v22

    add-int/lit8 v15, v15, -0x6

    const/4 v5, 0x1

    const/16 v17, 0x0

    if-eq v6, v5, :cond_1

    const/4 v5, 0x2

    if-ne v6, v5, :cond_0

    goto :goto_1

    :cond_0
    const/16 v23, 0x0

    const/16 v24, 0x0

    goto :goto_2

    :cond_1
    :goto_1
    const/16 v5, 0x8

    .line 385
    invoke-virtual {v0, v5}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v16

    .line 386
    invoke-virtual {v0, v5}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v17

    add-int/lit8 v15, v15, -0x2

    move/from16 v23, v16

    move/from16 v24, v17

    .line 390
    :goto_2
    new-instance v5, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionObject;

    move-object/from16 v18, v5

    move/from16 v19, v6

    invoke-direct/range {v18 .. v24}, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionObject;-><init>(IIIIII)V

    invoke-virtual {v1, v2, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move/from16 v14, v25

    const/4 v2, 0x4

    const/4 v5, 0x2

    const/16 v6, 0x10

    goto :goto_0

    :cond_2
    move/from16 v25, v14

    .line 395
    new-instance v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;

    move-object v2, v0

    move v5, v7

    move v6, v8

    move v7, v9

    move v8, v10

    move v9, v11

    move v10, v12

    move v11, v13

    move/from16 v12, v25

    move-object v13, v1

    invoke-direct/range {v2 .. v13}, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;-><init>(IZIIIIIIIILandroid/util/SparseArray;)V

    return-object v0
.end method

.method private static parseSubtitlingSegment(Lcom/google/android/exoplayer2/util/ParsableBitArray;Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;)V
    .locals 6

    const/16 v0, 0x8

    .line 230
    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v0

    const/16 v1, 0x10

    .line 231
    invoke-virtual {p0, v1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v2

    .line 232
    invoke-virtual {p0, v1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v1

    .line 233
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->getBytePosition()I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v4, v1, 0x8

    .line 235
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->bitsLeft()I

    move-result v5

    if-le v4, v5, :cond_0

    const-string p1, "DvbParser"

    const-string v0, "Data field length exceeds limit"

    .line 236
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 238
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->bitsLeft()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->skipBits(I)V

    return-void

    :cond_0
    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 244
    :pswitch_0
    iget v0, p1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->subtitlePageId:I

    if-ne v2, v0, :cond_5

    .line 245
    invoke-static {p0}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->parseDisplayDefinition(Lcom/google/android/exoplayer2/util/ParsableBitArray;)Lcom/google/android/exoplayer2/text/dvb/DvbParser$DisplayDefinition;

    move-result-object v0

    iput-object v0, p1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->displayDefinition:Lcom/google/android/exoplayer2/text/dvb/DvbParser$DisplayDefinition;

    goto/16 :goto_0

    .line 282
    :pswitch_1
    iget v0, p1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->subtitlePageId:I

    if-ne v2, v0, :cond_1

    .line 283
    invoke-static {p0}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->parseObjectData(Lcom/google/android/exoplayer2/util/ParsableBitArray;)Lcom/google/android/exoplayer2/text/dvb/DvbParser$ObjectData;

    move-result-object v0

    .line 284
    iget-object p1, p1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->objects:Landroid/util/SparseArray;

    iget v1, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser$ObjectData;->id:I

    invoke-virtual {p1, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 285
    :cond_1
    iget v0, p1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->ancillaryPageId:I

    if-ne v2, v0, :cond_5

    .line 286
    invoke-static {p0}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->parseObjectData(Lcom/google/android/exoplayer2/util/ParsableBitArray;)Lcom/google/android/exoplayer2/text/dvb/DvbParser$ObjectData;

    move-result-object v0

    .line 287
    iget-object p1, p1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->ancillaryObjects:Landroid/util/SparseArray;

    iget v1, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser$ObjectData;->id:I

    invoke-virtual {p1, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 273
    :pswitch_2
    iget v0, p1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->subtitlePageId:I

    if-ne v2, v0, :cond_2

    .line 274
    invoke-static {p0, v1}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->parseClutDefinition(Lcom/google/android/exoplayer2/util/ParsableBitArray;I)Lcom/google/android/exoplayer2/text/dvb/DvbParser$ClutDefinition;

    move-result-object v0

    .line 275
    iget-object p1, p1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->cluts:Landroid/util/SparseArray;

    iget v1, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser$ClutDefinition;->id:I

    invoke-virtual {p1, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_0

    .line 276
    :cond_2
    iget v0, p1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->ancillaryPageId:I

    if-ne v2, v0, :cond_5

    .line 277
    invoke-static {p0, v1}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->parseClutDefinition(Lcom/google/android/exoplayer2/util/ParsableBitArray;I)Lcom/google/android/exoplayer2/text/dvb/DvbParser$ClutDefinition;

    move-result-object v0

    .line 278
    iget-object p1, p1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->ancillaryCluts:Landroid/util/SparseArray;

    iget v1, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser$ClutDefinition;->id:I

    invoke-virtual {p1, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_0

    .line 263
    :pswitch_3
    iget-object v0, p1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->pageComposition:Lcom/google/android/exoplayer2/text/dvb/DvbParser$PageComposition;

    .line 264
    iget v4, p1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->subtitlePageId:I

    if-ne v2, v4, :cond_5

    if-eqz v0, :cond_5

    .line 265
    invoke-static {p0, v1}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->parseRegionComposition(Lcom/google/android/exoplayer2/util/ParsableBitArray;I)Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;

    move-result-object v1

    .line 266
    iget v0, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser$PageComposition;->state:I

    if-nez v0, :cond_3

    .line 267
    iget-object v0, p1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->regions:Landroid/util/SparseArray;

    iget v2, v1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;->id:I

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;

    invoke-virtual {v1, v0}, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;->mergeFrom(Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;)V

    .line 269
    :cond_3
    iget-object p1, p1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->regions:Landroid/util/SparseArray;

    iget v0, v1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;->id:I

    invoke-virtual {p1, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_0

    .line 249
    :pswitch_4
    iget v0, p1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->subtitlePageId:I

    if-ne v2, v0, :cond_5

    .line 250
    iget-object v0, p1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->pageComposition:Lcom/google/android/exoplayer2/text/dvb/DvbParser$PageComposition;

    .line 251
    invoke-static {p0, v1}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->parsePageComposition(Lcom/google/android/exoplayer2/util/ParsableBitArray;I)Lcom/google/android/exoplayer2/text/dvb/DvbParser$PageComposition;

    move-result-object v1

    .line 252
    iget v2, v1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$PageComposition;->state:I

    if-eqz v2, :cond_4

    .line 253
    iput-object v1, p1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->pageComposition:Lcom/google/android/exoplayer2/text/dvb/DvbParser$PageComposition;

    .line 254
    iget-object v0, p1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->regions:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 255
    iget-object v0, p1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->cluts:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 256
    iget-object p1, p1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->objects:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    goto :goto_0

    :cond_4
    if-eqz v0, :cond_5

    .line 257
    iget v0, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser$PageComposition;->version:I

    iget v2, v1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$PageComposition;->version:I

    if-eq v0, v2, :cond_5

    .line 258
    iput-object v1, p1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->pageComposition:Lcom/google/android/exoplayer2/text/dvb/DvbParser$PageComposition;

    .line 296
    :cond_5
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->getBytePosition()I

    move-result p1

    sub-int/2addr v3, p1

    invoke-virtual {p0, v3}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->skipBytes(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public decode([BI)Ljava/util/List;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BI)",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/text/Cue;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 129
    new-instance v1, Lcom/google/android/exoplayer2/util/ParsableBitArray;

    move-object/from16 v2, p1

    move/from16 v3, p2

    invoke-direct {v1, v2, v3}, Lcom/google/android/exoplayer2/util/ParsableBitArray;-><init>([BI)V

    .line 130
    :goto_0
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->bitsLeft()I

    move-result v2

    const/16 v3, 0x30

    if-lt v2, v3, :cond_0

    const/16 v2, 0x8

    .line 131
    invoke-virtual {v1, v2}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->readBits(I)I

    move-result v2

    const/16 v3, 0xf

    if-ne v2, v3, :cond_0

    .line 132
    iget-object v2, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->subtitleService:Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;

    invoke-static {v1, v2}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->parseSubtitlingSegment(Lcom/google/android/exoplayer2/util/ParsableBitArray;Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;)V

    goto :goto_0

    .line 135
    :cond_0
    iget-object v1, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->subtitleService:Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;

    iget-object v1, v1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->pageComposition:Lcom/google/android/exoplayer2/text/dvb/DvbParser$PageComposition;

    if-nez v1, :cond_1

    .line 136
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    return-object v1

    .line 140
    :cond_1
    iget-object v1, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->subtitleService:Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;

    iget-object v1, v1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->displayDefinition:Lcom/google/android/exoplayer2/text/dvb/DvbParser$DisplayDefinition;

    if-eqz v1, :cond_2

    iget-object v1, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->subtitleService:Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;

    iget-object v1, v1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->displayDefinition:Lcom/google/android/exoplayer2/text/dvb/DvbParser$DisplayDefinition;

    goto :goto_1

    :cond_2
    iget-object v1, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->defaultDisplayDefinition:Lcom/google/android/exoplayer2/text/dvb/DvbParser$DisplayDefinition;

    .line 142
    :goto_1
    iget-object v2, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->bitmap:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_3

    iget v2, v1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$DisplayDefinition;->width:I

    add-int/lit8 v2, v2, 0x1

    iget-object v3, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    if-ne v2, v3, :cond_3

    iget v2, v1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$DisplayDefinition;->height:I

    add-int/lit8 v2, v2, 0x1

    iget-object v3, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->bitmap:Landroid/graphics/Bitmap;

    .line 143
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    if-eq v2, v3, :cond_4

    .line 144
    :cond_3
    iget v2, v1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$DisplayDefinition;->width:I

    add-int/lit8 v2, v2, 0x1

    iget v3, v1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$DisplayDefinition;->height:I

    add-int/lit8 v3, v3, 0x1

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    iput-object v2, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->bitmap:Landroid/graphics/Bitmap;

    .line 146
    iget-object v3, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->canvas:Landroid/graphics/Canvas;

    invoke-virtual {v3, v2}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 150
    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 151
    iget-object v3, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->subtitleService:Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;

    iget-object v3, v3, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->pageComposition:Lcom/google/android/exoplayer2/text/dvb/DvbParser$PageComposition;

    iget-object v3, v3, Lcom/google/android/exoplayer2/text/dvb/DvbParser$PageComposition;->regions:Landroid/util/SparseArray;

    const/4 v5, 0x0

    .line 152
    :goto_2
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v6

    if-ge v5, v6, :cond_d

    .line 153
    invoke-virtual {v3, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/exoplayer2/text/dvb/DvbParser$PageRegion;

    .line 154
    invoke-virtual {v3, v5}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v7

    .line 155
    iget-object v8, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->subtitleService:Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;

    iget-object v8, v8, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->regions:Landroid/util/SparseArray;

    invoke-virtual {v8, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;

    .line 158
    iget v8, v6, Lcom/google/android/exoplayer2/text/dvb/DvbParser$PageRegion;->horizontalAddress:I

    iget v9, v1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$DisplayDefinition;->horizontalPositionMinimum:I

    add-int/2addr v8, v9

    .line 160
    iget v6, v6, Lcom/google/android/exoplayer2/text/dvb/DvbParser$PageRegion;->verticalAddress:I

    iget v9, v1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$DisplayDefinition;->verticalPositionMinimum:I

    add-int/2addr v6, v9

    .line 162
    iget v9, v7, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;->width:I

    add-int/2addr v9, v8

    iget v10, v1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$DisplayDefinition;->horizontalPositionMaximum:I

    invoke-static {v9, v10}, Ljava/lang/Math;->min(II)I

    move-result v9

    .line 164
    iget v10, v7, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;->height:I

    add-int/2addr v10, v6

    iget v11, v1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$DisplayDefinition;->verticalPositionMaximum:I

    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    move-result v10

    .line 166
    iget-object v11, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->canvas:Landroid/graphics/Canvas;

    int-to-float v15, v8

    int-to-float v14, v6

    int-to-float v9, v9

    int-to-float v10, v10

    sget-object v16, Landroid/graphics/Region$Op;->REPLACE:Landroid/graphics/Region$Op;

    move v12, v15

    move v13, v14

    move/from16 v18, v14

    move v14, v9

    move v9, v15

    move v15, v10

    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->clipRect(FFFFLandroid/graphics/Region$Op;)Z

    .line 169
    iget-object v10, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->subtitleService:Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;

    iget-object v10, v10, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->cluts:Landroid/util/SparseArray;

    iget v11, v7, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;->clutId:I

    invoke-virtual {v10, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/google/android/exoplayer2/text/dvb/DvbParser$ClutDefinition;

    if-nez v10, :cond_5

    .line 171
    iget-object v10, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->subtitleService:Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;

    iget-object v10, v10, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->ancillaryCluts:Landroid/util/SparseArray;

    iget v11, v7, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;->clutId:I

    invoke-virtual {v10, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/google/android/exoplayer2/text/dvb/DvbParser$ClutDefinition;

    if-nez v10, :cond_5

    .line 173
    iget-object v10, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->defaultClutDefinition:Lcom/google/android/exoplayer2/text/dvb/DvbParser$ClutDefinition;

    .line 177
    :cond_5
    iget-object v15, v7, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;->regionObjects:Landroid/util/SparseArray;

    const/4 v14, 0x0

    .line 178
    :goto_3
    invoke-virtual {v15}, Landroid/util/SparseArray;->size()I

    move-result v11

    if-ge v14, v11, :cond_9

    .line 179
    invoke-virtual {v15, v14}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v11

    .line 180
    invoke-virtual {v15, v14}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionObject;

    .line 181
    iget-object v13, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->subtitleService:Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;

    iget-object v13, v13, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->objects:Landroid/util/SparseArray;

    invoke-virtual {v13, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/google/android/exoplayer2/text/dvb/DvbParser$ObjectData;

    if-nez v13, :cond_6

    .line 183
    iget-object v13, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->subtitleService:Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;

    iget-object v13, v13, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->ancillaryObjects:Landroid/util/SparseArray;

    invoke-virtual {v13, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/google/android/exoplayer2/text/dvb/DvbParser$ObjectData;

    goto :goto_4

    :cond_6
    move-object v11, v13

    :goto_4
    if-eqz v11, :cond_8

    .line 186
    iget-boolean v13, v11, Lcom/google/android/exoplayer2/text/dvb/DvbParser$ObjectData;->nonModifyingColorFlag:Z

    if-eqz v13, :cond_7

    const/4 v13, 0x0

    goto :goto_5

    :cond_7
    iget-object v13, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->defaultPaint:Landroid/graphics/Paint;

    :goto_5
    move-object/from16 v16, v13

    .line 187
    iget v13, v7, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;->depth:I

    iget v4, v12, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionObject;->horizontalPosition:I

    add-int/2addr v4, v8

    iget v12, v12, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionObject;->verticalPosition:I

    add-int v17, v6, v12

    iget-object v12, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->canvas:Landroid/graphics/Canvas;

    move-object/from16 v19, v12

    move-object v12, v10

    move/from16 v20, v14

    move v14, v4

    move-object v4, v15

    move/from16 v15, v17

    move-object/from16 v17, v19

    invoke-static/range {v11 .. v17}, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->paintPixelDataSubBlocks(Lcom/google/android/exoplayer2/text/dvb/DvbParser$ObjectData;Lcom/google/android/exoplayer2/text/dvb/DvbParser$ClutDefinition;IIILandroid/graphics/Paint;Landroid/graphics/Canvas;)V

    goto :goto_6

    :cond_8
    move/from16 v20, v14

    move-object v4, v15

    :goto_6
    add-int/lit8 v14, v20, 0x1

    move-object v15, v4

    goto :goto_3

    .line 193
    :cond_9
    iget-boolean v4, v7, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;->fillFlag:Z

    if-eqz v4, :cond_c

    .line 195
    iget v4, v7, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;->depth:I

    const/4 v11, 0x3

    if-ne v4, v11, :cond_a

    .line 196
    iget-object v4, v10, Lcom/google/android/exoplayer2/text/dvb/DvbParser$ClutDefinition;->clutEntries8Bit:[I

    iget v10, v7, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;->pixelCode8Bit:I

    aget v4, v4, v10

    goto :goto_7

    .line 197
    :cond_a
    iget v4, v7, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;->depth:I

    const/4 v11, 0x2

    if-ne v4, v11, :cond_b

    .line 198
    iget-object v4, v10, Lcom/google/android/exoplayer2/text/dvb/DvbParser$ClutDefinition;->clutEntries4Bit:[I

    iget v10, v7, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;->pixelCode4Bit:I

    aget v4, v4, v10

    goto :goto_7

    .line 200
    :cond_b
    iget-object v4, v10, Lcom/google/android/exoplayer2/text/dvb/DvbParser$ClutDefinition;->clutEntries2Bit:[I

    iget v10, v7, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;->pixelCode2Bit:I

    aget v4, v4, v10

    .line 202
    :goto_7
    iget-object v10, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->fillRegionPaint:Landroid/graphics/Paint;

    invoke-virtual {v10, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 203
    iget-object v12, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->canvas:Landroid/graphics/Canvas;

    iget v4, v7, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;->width:I

    add-int/2addr v4, v8

    int-to-float v15, v4

    iget v4, v7, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;->height:I

    add-int/2addr v4, v6

    int-to-float v4, v4

    iget-object v10, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->fillRegionPaint:Landroid/graphics/Paint;

    move v13, v9

    move/from16 v14, v18

    move/from16 v16, v4

    move-object/from16 v17, v10

    invoke-virtual/range {v12 .. v17}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 209
    :cond_c
    iget-object v4, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->bitmap:Landroid/graphics/Bitmap;

    iget v10, v7, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;->width:I

    iget v11, v7, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;->height:I

    invoke-static {v4, v8, v6, v10, v11}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v20

    .line 211
    new-instance v4, Lcom/google/android/exoplayer2/text/Cue;

    iget v6, v1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$DisplayDefinition;->width:I

    int-to-float v6, v6

    div-float v21, v9, v6

    const/16 v22, 0x0

    iget v6, v1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$DisplayDefinition;->height:I

    int-to-float v6, v6

    div-float v23, v18, v6

    const/16 v24, 0x0

    iget v6, v7, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;->width:I

    int-to-float v6, v6

    iget v8, v1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$DisplayDefinition;->width:I

    int-to-float v8, v8

    div-float v25, v6, v8

    iget v6, v7, Lcom/google/android/exoplayer2/text/dvb/DvbParser$RegionComposition;->height:I

    int-to-float v6, v6

    iget v7, v1, Lcom/google/android/exoplayer2/text/dvb/DvbParser$DisplayDefinition;->height:I

    int-to-float v7, v7

    div-float v26, v6, v7

    move-object/from16 v19, v4

    invoke-direct/range {v19 .. v26}, Lcom/google/android/exoplayer2/text/Cue;-><init>(Landroid/graphics/Bitmap;FIFIFF)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 216
    iget-object v4, v0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->canvas:Landroid/graphics/Canvas;

    sget-object v6, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    const/4 v7, 0x0

    invoke-virtual {v4, v7, v6}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_2

    :cond_d
    return-object v2
.end method

.method public reset()V
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/google/android/exoplayer2/text/dvb/DvbParser;->subtitleService:Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/text/dvb/DvbParser$SubtitleService;->reset()V

    return-void
.end method
