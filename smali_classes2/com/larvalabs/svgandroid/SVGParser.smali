.class public Lcom/larvalabs/svgandroid/SVGParser;
.super Ljava/lang/Object;
.source "SVGParser.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;,
        Lcom/larvalabs/svgandroid/SVGParser$LayerAttributes;,
        Lcom/larvalabs/svgandroid/SVGParser$Properties;,
        Lcom/larvalabs/svgandroid/SVGParser$StyleSet;,
        Lcom/larvalabs/svgandroid/SVGParser$Gradient;,
        Lcom/larvalabs/svgandroid/SVGParser$NumberParse;
    }
.end annotation


# static fields
.field private static DISALLOW_DOCTYPE_DECL:Z = true

.field static final TAG:Ljava/lang/String; = "SVGAndroid"

.field private static final TRANSFORM_SEP:Ljava/util/regex/Pattern;

.field private static final arcMatrix:Landroid/graphics/Matrix;

.field private static final arcMatrix2:Landroid/graphics/Matrix;

.field private static final arcRectf:Landroid/graphics/RectF;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "[\\s,]*"

    .line 189
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/larvalabs/svgandroid/SVGParser;->TRANSFORM_SEP:Ljava/util/regex/Pattern;

    .line 497
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    sput-object v0, Lcom/larvalabs/svgandroid/SVGParser;->arcRectf:Landroid/graphics/RectF;

    .line 498
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    sput-object v0, Lcom/larvalabs/svgandroid/SVGParser;->arcMatrix:Landroid/graphics/Matrix;

    .line 499
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    sput-object v0, Lcom/larvalabs/svgandroid/SVGParser;->arcMatrix2:Landroid/graphics/Matrix;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$100(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;
    .locals 0

    .line 47
    invoke-static {p0, p1}, Lcom/larvalabs/svgandroid/SVGParser;->getStringAttr(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$1000(Ljava/lang/String;)Landroid/graphics/Path;
    .locals 0

    .line 47
    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser;->doPath(Ljava/lang/String;)Landroid/graphics/Path;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$400(Ljava/lang/String;Lorg/xml/sax/Attributes;F)F
    .locals 0

    .line 47
    invoke-static {p0, p1, p2}, Lcom/larvalabs/svgandroid/SVGParser;->getFloatAttr(Ljava/lang/String;Lorg/xml/sax/Attributes;F)F

    move-result p0

    return p0
.end method

.method static synthetic access$500(Ljava/lang/String;)Landroid/graphics/Matrix;
    .locals 0

    .line 47
    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser;->parseTransform(Ljava/lang/String;)Landroid/graphics/Matrix;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$600(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;
    .locals 0

    .line 47
    invoke-static {p0, p1}, Lcom/larvalabs/svgandroid/SVGParser;->getFloatAttr(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$700(Ljava/lang/String;Ljava/lang/Float;)Ljava/lang/Float;
    .locals 0

    .line 47
    invoke-static {p0, p1}, Lcom/larvalabs/svgandroid/SVGParser;->parseFloatValue(Ljava/lang/String;Ljava/lang/Float;)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$900(Ljava/lang/String;Lorg/xml/sax/Attributes;)Lcom/larvalabs/svgandroid/SVGParser$NumberParse;
    .locals 0

    .line 47
    invoke-static {p0, p1}, Lcom/larvalabs/svgandroid/SVGParser;->getNumberParseAttr(Ljava/lang/String;Lorg/xml/sax/Attributes;)Lcom/larvalabs/svgandroid/SVGParser$NumberParse;

    move-result-object p0

    return-object p0
.end method

.method private static angle(FFFF)F
    .locals 2

    float-to-double v0, p0

    float-to-double p0, p1

    .line 494
    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p0

    float-to-double v0, p2

    float-to-double p2, p3

    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p2

    sub-double/2addr p0, p2

    invoke-static {p0, p1}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide p0

    double-to-float p0, p0

    const/high16 p1, 0x43b40000    # 360.0f

    rem-float/2addr p0, p1

    return p0
.end method

.method private static doPath(Ljava/lang/String;)Landroid/graphics/Path;
    .locals 24

    move-object/from16 v0, p0

    .line 299
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v1

    .line 300
    new-instance v2, Lcom/larvalabs/svgandroid/ParserHelper;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lcom/larvalabs/svgandroid/ParserHelper;-><init>(Ljava/lang/String;I)V

    .line 301
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->skipWhitespace()V

    .line 302
    new-instance v14, Landroid/graphics/Path;

    invoke-direct {v14}, Landroid/graphics/Path;-><init>()V

    const/4 v15, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    .line 310
    :goto_0
    iget v7, v2, Lcom/larvalabs/svgandroid/ParserHelper;->pos:I

    if-ge v7, v1, :cond_c

    .line 311
    iget v7, v2, Lcom/larvalabs/svgandroid/ParserHelper;->pos:I

    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x2b

    const/16 v9, 0x6d

    if-eq v7, v8, :cond_0

    const/16 v8, 0x2d

    if-eq v7, v8, :cond_0

    packed-switch v7, :pswitch_data_0

    goto :goto_1

    :cond_0
    :pswitch_0
    if-eq v4, v9, :cond_3

    const/16 v8, 0x4d

    if-ne v4, v8, :cond_1

    goto :goto_3

    .line 328
    :cond_1
    invoke-static {v4}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v8

    const-string v10, "lhvcsqta"

    invoke-virtual {v10, v8}, Ljava/lang/String;->indexOf(I)I

    move-result v8

    if-ltz v8, :cond_2

    goto :goto_2

    .line 333
    :cond_2
    :goto_1
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->advance()V

    move v4, v7

    :goto_2
    move/from16 v18, v4

    goto :goto_4

    :cond_3
    :goto_3
    add-int/lit8 v7, v4, -0x1

    int-to-char v7, v7

    move/from16 v18, v4

    move v4, v7

    :goto_4
    const/4 v11, 0x1

    sparse-switch v4, :sswitch_data_0

    move/from16 v23, v12

    move v3, v13

    .line 480
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Invalid path command: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v7, "SVGAndroid"

    invoke-static {v7, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 481
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->advance()V

    :goto_5
    const/4 v11, 0x0

    goto/16 :goto_7

    .line 361
    :sswitch_0
    invoke-virtual {v14}, Landroid/graphics/Path;->close()V

    .line 362
    invoke-virtual {v14, v13, v12}, Landroid/graphics/Path;->moveTo(FF)V

    move v6, v12

    move/from16 v17, v6

    move v5, v13

    move/from16 v16, v5

    goto/16 :goto_7

    .line 402
    :sswitch_1
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->nextFloat()F

    move-result v7

    const/16 v8, 0x76

    if-ne v4, v8, :cond_4

    .line 404
    invoke-virtual {v14, v15, v7}, Landroid/graphics/Path;->rLineTo(FF)V

    add-float/2addr v6, v7

    goto :goto_5

    .line 407
    :cond_4
    invoke-virtual {v14, v5, v7}, Landroid/graphics/Path;->lineTo(FF)V

    move v6, v7

    goto :goto_5

    .line 442
    :sswitch_2
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->nextFloat()F

    move-result v7

    .line 443
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->nextFloat()F

    move-result v8

    .line 444
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->nextFloat()F

    move-result v9

    .line 445
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->nextFloat()F

    move-result v10

    .line 446
    invoke-static {v4}, Ljava/lang/Character;->isLowerCase(C)Z

    move-result v4

    if-eqz v4, :cond_5

    add-float/2addr v7, v5

    add-float/2addr v9, v5

    add-float/2addr v8, v6

    add-float/2addr v10, v6

    :cond_5
    move/from16 v19, v7

    move/from16 v20, v8

    move/from16 v21, v9

    move/from16 v22, v10

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v5, v5, v4

    sub-float v5, v5, v16

    mul-float v6, v6, v4

    sub-float v6, v6, v17

    move-object v4, v14

    move/from16 v7, v19

    move/from16 v8, v20

    move/from16 v9, v21

    move/from16 v10, v22

    .line 454
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    move/from16 v16, v19

    move/from16 v17, v20

    move/from16 v5, v21

    move/from16 v6, v22

    goto/16 :goto_7

    .line 342
    :sswitch_3
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->nextFloat()F

    move-result v7

    .line 343
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->nextFloat()F

    move-result v8

    if-ne v4, v9, :cond_6

    add-float/2addr v13, v7

    add-float/2addr v12, v8

    .line 347
    invoke-virtual {v14, v7, v8}, Landroid/graphics/Path;->rMoveTo(FF)V

    goto :goto_6

    .line 353
    :cond_6
    invoke-virtual {v14, v7, v8}, Landroid/graphics/Path;->moveTo(FF)V

    move v5, v7

    move v13, v5

    move v6, v8

    move v12, v6

    goto :goto_5

    .line 375
    :sswitch_4
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->nextFloat()F

    move-result v7

    .line 376
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->nextFloat()F

    move-result v8

    const/16 v9, 0x6c

    if-ne v4, v9, :cond_7

    .line 378
    invoke-virtual {v14, v7, v8}, Landroid/graphics/Path;->rLineTo(FF)V

    :goto_6
    add-float/2addr v5, v7

    add-float/2addr v6, v8

    goto/16 :goto_5

    .line 382
    :cond_7
    invoke-virtual {v14, v7, v8}, Landroid/graphics/Path;->lineTo(FF)V

    move v5, v7

    move v6, v8

    goto/16 :goto_5

    .line 390
    :sswitch_5
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->nextFloat()F

    move-result v7

    const/16 v8, 0x68

    if-ne v4, v8, :cond_8

    .line 392
    invoke-virtual {v14, v7, v15}, Landroid/graphics/Path;->rLineTo(FF)V

    add-float/2addr v5, v7

    goto/16 :goto_5

    .line 395
    :cond_8
    invoke-virtual {v14, v7, v6}, Landroid/graphics/Path;->lineTo(FF)V

    move v5, v7

    goto/16 :goto_5

    .line 415
    :sswitch_6
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->nextFloat()F

    move-result v7

    .line 416
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->nextFloat()F

    move-result v8

    .line 417
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->nextFloat()F

    move-result v9

    .line 418
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->nextFloat()F

    move-result v10

    .line 419
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->nextFloat()F

    move-result v16

    .line 420
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->nextFloat()F

    move-result v17

    const/16 v3, 0x63

    if-ne v4, v3, :cond_9

    add-float/2addr v7, v5

    add-float/2addr v9, v5

    add-float v16, v16, v5

    add-float/2addr v8, v6

    add-float/2addr v10, v6

    add-float v17, v17, v6

    :cond_9
    move v5, v7

    move v6, v8

    move v3, v9

    move/from16 v20, v10

    move-object v4, v14

    move v7, v3

    move/from16 v8, v20

    move/from16 v9, v16

    move/from16 v10, v17

    .line 429
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    move/from16 v5, v16

    move/from16 v6, v17

    move/from16 v17, v20

    move/from16 v16, v3

    goto :goto_7

    .line 463
    :sswitch_7
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->nextFloat()F

    move-result v9

    .line 464
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->nextFloat()F

    move-result v10

    .line 465
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->nextFloat()F

    move-result v11

    .line 466
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->nextFlag()I

    move-result v3

    .line 467
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->nextFlag()I

    move-result v20

    .line 468
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->nextFloat()F

    move-result v7

    .line 469
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->nextFloat()F

    move-result v8

    const/16 v15, 0x61

    if-ne v4, v15, :cond_a

    add-float/2addr v7, v5

    add-float/2addr v8, v6

    :cond_a
    move v15, v7

    move/from16 v22, v8

    move-object v4, v14

    move v7, v15

    move/from16 v8, v22

    move/from16 v23, v12

    move v12, v3

    move v3, v13

    move/from16 v13, v20

    .line 474
    invoke-static/range {v4 .. v13}, Lcom/larvalabs/svgandroid/SVGParser;->drawArc(Landroid/graphics/Path;FFFFFFFII)V

    move v13, v3

    move v5, v15

    move/from16 v6, v22

    move/from16 v12, v23

    goto/16 :goto_5

    :goto_7
    if-nez v11, :cond_b

    move/from16 v16, v5

    move/from16 v17, v6

    .line 487
    :cond_b
    invoke-virtual {v2}, Lcom/larvalabs/svgandroid/ParserHelper;->skipWhitespace()V

    move/from16 v4, v18

    const/4 v3, 0x0

    const/4 v15, 0x0

    goto/16 :goto_0

    :cond_c
    return-object v14

    nop

    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x41 -> :sswitch_7
        0x43 -> :sswitch_6
        0x48 -> :sswitch_5
        0x4c -> :sswitch_4
        0x4d -> :sswitch_3
        0x51 -> :sswitch_2
        0x53 -> :sswitch_2
        0x54 -> :sswitch_4
        0x56 -> :sswitch_1
        0x5a -> :sswitch_0
        0x61 -> :sswitch_7
        0x63 -> :sswitch_6
        0x68 -> :sswitch_5
        0x6c -> :sswitch_4
        0x6d -> :sswitch_3
        0x71 -> :sswitch_2
        0x73 -> :sswitch_2
        0x74 -> :sswitch_4
        0x76 -> :sswitch_1
        0x7a -> :sswitch_0
    .end sparse-switch
.end method

.method private static drawArc(Landroid/graphics/Path;FFFFFFFII)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p3

    move/from16 v2, p4

    move/from16 v3, p7

    move/from16 v4, p9

    const/4 v5, 0x0

    cmpl-float v6, p5, v5

    if-eqz v6, :cond_7

    cmpl-float v6, p6, v5

    if-nez v6, :cond_0

    goto/16 :goto_3

    :cond_0
    cmpl-float v6, v1, p1

    if-nez v6, :cond_1

    cmpl-float v6, v2, p2

    if-nez v6, :cond_1

    return-void

    .line 517
    :cond_1
    invoke-static/range {p5 .. p5}, Ljava/lang/Math;->abs(F)F

    move-result v6

    .line 518
    invoke-static/range {p6 .. p6}, Ljava/lang/Math;->abs(F)F

    move-result v7

    const v8, 0x40490fdb    # (float)Math.PI

    mul-float v8, v8, v3

    const/high16 v9, 0x43340000    # 180.0f

    div-float/2addr v8, v9

    float-to-double v8, v8

    .line 521
    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    move-result-wide v10

    double-to-float v10, v10

    .line 522
    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    double-to-float v8, v8

    sub-float v9, p1, v1

    const/high16 v11, 0x40000000    # 2.0f

    div-float/2addr v9, v11

    sub-float v12, p2, v2

    div-float/2addr v12, v11

    mul-float v13, v8, v9

    mul-float v14, v10, v12

    add-float/2addr v13, v14

    neg-float v14, v10

    mul-float v14, v14, v9

    mul-float v12, v12, v8

    add-float/2addr v14, v12

    mul-float v9, v13, v13

    mul-float v12, v14, v14

    mul-float v15, v6, v6

    mul-float v16, v7, v7

    div-float v17, v9, v15

    div-float v18, v12, v16

    add-float v17, v17, v18

    const v18, 0x3f8020c5    # 1.001f

    mul-float v5, v17, v18

    const/high16 v11, 0x3f800000    # 1.0f

    cmpl-float v17, v5, v11

    move/from16 p6, v12

    if-lez v17, :cond_2

    float-to-double v11, v5

    .line 537
    invoke-static {v11, v12}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v11

    double-to-float v5, v11

    mul-float v6, v6, v5

    mul-float v7, v7, v5

    mul-float v15, v6, v6

    mul-float v16, v7, v7

    :cond_2
    mul-float v5, v15, v16

    mul-float v15, v15, p6

    sub-float/2addr v5, v15

    mul-float v16, v16, v9

    sub-float v5, v5, v16

    add-float v15, v15, v16

    div-float/2addr v5, v15

    float-to-double v11, v5

    .line 545
    invoke-static {v11, v12}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v11

    double-to-float v5, v11

    move/from16 v9, p8

    if-ne v9, v4, :cond_3

    const/4 v9, -0x1

    goto :goto_0

    :cond_3
    const/4 v9, 0x1

    :goto_0
    int-to-float v9, v9

    mul-float v5, v5, v9

    mul-float v9, v5, v6

    mul-float v9, v9, v14

    div-float/2addr v9, v7

    neg-float v5, v5

    mul-float v5, v5, v7

    mul-float v5, v5, v13

    div-float/2addr v5, v6

    mul-float v11, v8, v9

    mul-float v12, v10, v5

    sub-float/2addr v11, v12

    add-float v1, p1, v1

    const/high16 v12, 0x40000000    # 2.0f

    div-float/2addr v1, v12

    add-float/2addr v11, v1

    mul-float v10, v10, v9

    mul-float v8, v8, v5

    add-float/2addr v10, v8

    add-float v1, p2, v2

    div-float/2addr v1, v12

    add-float/2addr v10, v1

    sub-float v1, v13, v9

    div-float/2addr v1, v6

    sub-float v2, v14, v5

    div-float/2addr v2, v7

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v12, 0x0

    .line 552
    invoke-static {v8, v12, v1, v2}, Lcom/larvalabs/svgandroid/SVGParser;->angle(FFFF)F

    move-result v8

    neg-float v13, v13

    sub-float/2addr v13, v9

    div-float/2addr v13, v6

    neg-float v9, v14

    sub-float/2addr v9, v5

    div-float/2addr v9, v7

    .line 553
    invoke-static {v1, v2, v13, v9}, Lcom/larvalabs/svgandroid/SVGParser;->angle(FFFF)F

    move-result v1

    const/high16 v2, 0x43b40000    # 360.0f

    if-nez v4, :cond_4

    cmpl-float v5, v1, v12

    if-lez v5, :cond_4

    sub-float/2addr v1, v2

    goto :goto_1

    :cond_4
    if-eqz v4, :cond_5

    cmpg-float v4, v1, v12

    if-gez v4, :cond_5

    add-float/2addr v1, v2

    :cond_5
    :goto_1
    rem-float v2, v3, v2

    cmpl-float v2, v2, v12

    if-nez v2, :cond_6

    .line 564
    sget-object v2, Lcom/larvalabs/svgandroid/SVGParser;->arcRectf:Landroid/graphics/RectF;

    sub-float v3, v11, v6

    sub-float v4, v10, v7

    add-float/2addr v11, v6

    add-float/2addr v10, v7

    invoke-virtual {v2, v3, v4, v11, v10}, Landroid/graphics/RectF;->set(FFFF)V

    .line 565
    sget-object v2, Lcom/larvalabs/svgandroid/SVGParser;->arcRectf:Landroid/graphics/RectF;

    invoke-virtual {v0, v2, v8, v1}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    goto :goto_2

    .line 568
    :cond_6
    sget-object v2, Lcom/larvalabs/svgandroid/SVGParser;->arcRectf:Landroid/graphics/RectF;

    neg-float v4, v6

    neg-float v5, v7

    invoke-virtual {v2, v4, v5, v6, v7}, Landroid/graphics/RectF;->set(FFFF)V

    .line 570
    sget-object v2, Lcom/larvalabs/svgandroid/SVGParser;->arcMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v2}, Landroid/graphics/Matrix;->reset()V

    .line 571
    sget-object v2, Lcom/larvalabs/svgandroid/SVGParser;->arcMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 572
    sget-object v2, Lcom/larvalabs/svgandroid/SVGParser;->arcMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v2, v11, v10}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 573
    sget-object v2, Lcom/larvalabs/svgandroid/SVGParser;->arcMatrix:Landroid/graphics/Matrix;

    sget-object v3, Lcom/larvalabs/svgandroid/SVGParser;->arcMatrix2:Landroid/graphics/Matrix;

    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 575
    sget-object v2, Lcom/larvalabs/svgandroid/SVGParser;->arcMatrix2:Landroid/graphics/Matrix;

    invoke-virtual {v0, v2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 576
    sget-object v2, Lcom/larvalabs/svgandroid/SVGParser;->arcRectf:Landroid/graphics/RectF;

    invoke-virtual {v0, v2, v8, v1}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 577
    sget-object v1, Lcom/larvalabs/svgandroid/SVGParser;->arcMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    :goto_2
    return-void

    .line 509
    :cond_7
    :goto_3
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    return-void
.end method

.method private static getFloatAttr(Ljava/lang/String;Lorg/xml/sax/Attributes;F)F
    .locals 0

    .line 611
    invoke-static {p0, p1}, Lcom/larvalabs/svgandroid/SVGParser;->getStringAttr(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object p0

    .line 612
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/larvalabs/svgandroid/SVGParser;->parseFloatValue(Ljava/lang/String;Ljava/lang/Float;)Ljava/lang/Float;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    return p0
.end method

.method private static getFloatAttr(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;
    .locals 1

    const/4 v0, 0x0

    .line 602
    invoke-static {p0, p1, v0}, Lcom/larvalabs/svgandroid/SVGParser;->getFloatAttr(Ljava/lang/String;Lorg/xml/sax/Attributes;Ljava/lang/Float;)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method private static getFloatAttr(Ljava/lang/String;Lorg/xml/sax/Attributes;Ljava/lang/Float;)Ljava/lang/Float;
    .locals 0

    .line 606
    invoke-static {p0, p1}, Lcom/larvalabs/svgandroid/SVGParser;->getStringAttr(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object p0

    .line 607
    invoke-static {p0, p2}, Lcom/larvalabs/svgandroid/SVGParser;->parseFloatValue(Ljava/lang/String;Ljava/lang/Float;)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method private static getNumberParseAttr(Ljava/lang/String;Lorg/xml/sax/Attributes;)Lcom/larvalabs/svgandroid/SVGParser$NumberParse;
    .locals 3

    .line 582
    invoke-interface {p1}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 584
    invoke-interface {p1, v1}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 585
    invoke-interface {p1, v1}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser;->parseNumbers(Ljava/lang/String;)Lcom/larvalabs/svgandroid/SVGParser$NumberParse;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static getStringAttr(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;
    .locals 3

    .line 592
    invoke-interface {p1}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 594
    invoke-interface {p1, v1}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 595
    invoke-interface {p1, v1}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method static parse(Lorg/xml/sax/InputSource;Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;)Lcom/larvalabs/svgandroid/SVG;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/larvalabs/svgandroid/SVGParseException;
        }
    .end annotation

    .line 65
    :try_start_0
    new-instance v0, Landroid/graphics/Picture;

    invoke-direct {v0}, Landroid/graphics/Picture;-><init>()V

    .line 66
    invoke-virtual {p1, v0}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->setPicture(Landroid/graphics/Picture;)V

    .line 68
    invoke-static {}, Ljavax/xml/parsers/SAXParserFactory;->newInstance()Ljavax/xml/parsers/SAXParserFactory;

    move-result-object v1

    .line 69
    invoke-virtual {v1}, Ljavax/xml/parsers/SAXParserFactory;->newSAXParser()Ljavax/xml/parsers/SAXParser;

    move-result-object v1

    .line 70
    invoke-virtual {v1}, Ljavax/xml/parsers/SAXParser;->getXMLReader()Lorg/xml/sax/XMLReader;

    move-result-object v1

    .line 71
    invoke-interface {v1, p1}, Lorg/xml/sax/XMLReader;->setContentHandler(Lorg/xml/sax/ContentHandler;)V

    const-string v2, "http://xml.org/sax/features/validation"

    const/4 v3, 0x0

    .line 72
    invoke-interface {v1, v2, v3}, Lorg/xml/sax/XMLReader;->setFeature(Ljava/lang/String;Z)V

    .line 73
    sget-boolean v2, Lcom/larvalabs/svgandroid/SVGParser;->DISALLOW_DOCTYPE_DECL:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v2, :cond_0

    :try_start_1
    const-string v2, "http://apache.org/xml/features/disallow-doctype-decl"

    const/4 v4, 0x1

    .line 75
    invoke-interface {v1, v2, v4}, Lorg/xml/sax/XMLReader;->setFeature(Ljava/lang/String;Z)V
    :try_end_1
    .catch Lorg/xml/sax/SAXNotRecognizedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 77
    :catch_0
    :try_start_2
    sput-boolean v3, Lcom/larvalabs/svgandroid/SVGParser;->DISALLOW_DOCTYPE_DECL:Z

    .line 80
    :cond_0
    :goto_0
    invoke-interface {v1, p0}, Lorg/xml/sax/XMLReader;->parse(Lorg/xml/sax/InputSource;)V

    .line 82
    new-instance p0, Lcom/larvalabs/svgandroid/SVG;

    iget-object v1, p1, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->bounds:Landroid/graphics/RectF;

    invoke-direct {p0, v0, v1}, Lcom/larvalabs/svgandroid/SVG;-><init>(Landroid/graphics/Picture;Landroid/graphics/RectF;)V

    .line 84
    iget-object v0, p1, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->limits:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-nez v0, :cond_1

    .line 85
    iget-object p1, p1, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->limits:Landroid/graphics/RectF;

    invoke-virtual {p0, p1}, Lcom/larvalabs/svgandroid/SVG;->setLimits(Landroid/graphics/RectF;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :cond_1
    return-object p0

    :catch_1
    move-exception p0

    const-string p1, "SVGAndroid"

    const-string v0, "Failed to parse SVG."

    .line 89
    invoke-static {p1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 90
    new-instance p1, Lcom/larvalabs/svgandroid/SVGParseException;

    invoke-direct {p1, p0}, Lcom/larvalabs/svgandroid/SVGParseException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method private static parseFloatValue(Ljava/lang/String;Ljava/lang/Float;)Ljava/lang/Float;
    .locals 1

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    const-string p1, "px"

    .line 618
    invoke-virtual {p0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 619
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    add-int/lit8 p1, p1, -0x2

    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    const-string p1, "%"

    .line 620
    invoke-virtual {p0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 621
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 622
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    const/high16 p1, 0x42c80000    # 100.0f

    div-float/2addr p0, p1

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0

    .line 625
    :cond_2
    :goto_0
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method private static parseNumbers(Ljava/lang/String;)Lcom/larvalabs/svgandroid/SVGParser$NumberParse;
    .locals 10

    .line 96
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    .line 98
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v4, v0, :cond_5

    if-eqz v6, :cond_0

    const/4 v6, 0x0

    goto :goto_2

    .line 106
    :cond_0
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v8

    sparse-switch v8, :sswitch_data_0

    :goto_1
    const/4 v7, 0x0

    goto :goto_2

    :sswitch_0
    const/4 v7, 0x1

    goto :goto_2

    :sswitch_1
    if-eqz v7, :cond_2

    goto :goto_1

    .line 130
    :sswitch_2
    invoke-virtual {p0, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 131
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 133
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    .line 134
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    :cond_1
    new-instance p0, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;

    invoke-direct {p0, v1, v4}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;-><init>(Ljava/util/ArrayList;I)V

    return-object p0

    .line 150
    :cond_2
    :sswitch_3
    invoke-virtual {p0, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 152
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    if-lez v9, :cond_4

    .line 154
    invoke-static {v7}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    .line 155
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v5, 0x2d

    if-ne v8, v5, :cond_3

    move v5, v4

    goto :goto_1

    :cond_3
    add-int/lit8 v5, v4, 0x1

    const/4 v6, 0x1

    goto :goto_1

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 176
    :cond_5
    invoke-virtual {p0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 177
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_6

    .line 180
    :try_start_0
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 184
    :catch_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    .line 186
    :cond_6
    new-instance p0, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;

    invoke-direct {p0, v1, v5}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;-><init>(Ljava/util/ArrayList;I)V

    return-object p0

    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_3
        0xa -> :sswitch_3
        0x20 -> :sswitch_3
        0x29 -> :sswitch_2
        0x2c -> :sswitch_3
        0x2d -> :sswitch_1
        0x41 -> :sswitch_2
        0x43 -> :sswitch_2
        0x48 -> :sswitch_2
        0x4c -> :sswitch_2
        0x4d -> :sswitch_2
        0x51 -> :sswitch_2
        0x53 -> :sswitch_2
        0x54 -> :sswitch_2
        0x56 -> :sswitch_2
        0x5a -> :sswitch_2
        0x61 -> :sswitch_2
        0x63 -> :sswitch_2
        0x65 -> :sswitch_0
        0x68 -> :sswitch_2
        0x6c -> :sswitch_2
        0x6d -> :sswitch_2
        0x71 -> :sswitch_2
        0x73 -> :sswitch_2
        0x74 -> :sswitch_2
        0x76 -> :sswitch_2
        0x7a -> :sswitch_2
    .end sparse-switch
.end method

.method public static parsePath(Ljava/lang/String;)Landroid/graphics/Path;
    .locals 0

    .line 60
    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser;->doPath(Ljava/lang/String;)Landroid/graphics/Path;

    move-result-object p0

    return-object p0
.end method

.method private static parseTransform(Ljava/lang/String;)Landroid/graphics/Matrix;
    .locals 3

    .line 195
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 197
    :goto_0
    invoke-static {p0, v0}, Lcom/larvalabs/svgandroid/SVGParser;->parseTransformItem(Ljava/lang/String;Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    const-string v1, ")"

    .line 199
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_0

    .line 200
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v1, v1, 0x1

    if-le v2, v1, :cond_0

    .line 201
    sget-object v2, Lcom/larvalabs/svgandroid/SVGParser;->TRANSFORM_SEP:Ljava/util/regex/Pattern;

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    const-string v1, ""

    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static parseTransformItem(Ljava/lang/String;Landroid/graphics/Matrix;)Landroid/graphics/Matrix;
    .locals 9

    const-string v0, "matrix("

    .line 210
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x7

    const/4 v2, 0x2

    const/4 v3, 0x6

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v0, :cond_0

    .line 211
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser;->parseNumbers(Ljava/lang/String;)Lcom/larvalabs/svgandroid/SVGParser$NumberParse;

    move-result-object p0

    .line 212
    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;->access$000(Lcom/larvalabs/svgandroid/SVGParser$NumberParse;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne v0, v3, :cond_9

    .line 213
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    const/16 v7, 0x9

    new-array v7, v7, [F

    .line 216
    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;->access$000(Lcom/larvalabs/svgandroid/SVGParser$NumberParse;)Ljava/util/ArrayList;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Float;

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v8

    aput v8, v7, v6

    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;->access$000(Lcom/larvalabs/svgandroid/SVGParser$NumberParse;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Float;

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    aput v6, v7, v5

    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;->access$000(Lcom/larvalabs/svgandroid/SVGParser$NumberParse;)Ljava/util/ArrayList;

    move-result-object v6

    const/4 v8, 0x4

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Float;

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    aput v6, v7, v2

    .line 218
    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;->access$000(Lcom/larvalabs/svgandroid/SVGParser$NumberParse;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    const/4 v5, 0x3

    aput v2, v7, v5

    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;->access$000(Lcom/larvalabs/svgandroid/SVGParser$NumberParse;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    aput v2, v7, v8

    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;->access$000(Lcom/larvalabs/svgandroid/SVGParser$NumberParse;)Ljava/util/ArrayList;

    move-result-object p0

    const/4 v2, 0x5

    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    aput p0, v7, v2

    aput v4, v7, v3

    aput v4, v7, v1

    const/16 p0, 0x8

    const/high16 v1, 0x3f800000    # 1.0f

    aput v1, v7, p0

    .line 214
    invoke-virtual {v0, v7}, Landroid/graphics/Matrix;->setValues([F)V

    .line 221
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    goto/16 :goto_2

    :cond_0
    const-string v0, "translate("

    .line 223
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0xa

    .line 224
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser;->parseNumbers(Ljava/lang/String;)Lcom/larvalabs/svgandroid/SVGParser$NumberParse;

    move-result-object p0

    .line 225
    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;->access$000(Lcom/larvalabs/svgandroid/SVGParser$NumberParse;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_9

    .line 226
    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;->access$000(Lcom/larvalabs/svgandroid/SVGParser$NumberParse;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    .line 228
    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;->access$000(Lcom/larvalabs/svgandroid/SVGParser$NumberParse;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-le v1, v5, :cond_1

    .line 229
    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;->access$000(Lcom/larvalabs/svgandroid/SVGParser$NumberParse;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result v4

    .line 231
    :cond_1
    invoke-virtual {p1, v0, v4}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    goto/16 :goto_2

    :cond_2
    const-string v0, "scale("

    .line 233
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 234
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser;->parseNumbers(Ljava/lang/String;)Lcom/larvalabs/svgandroid/SVGParser$NumberParse;

    move-result-object p0

    .line 235
    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;->access$000(Lcom/larvalabs/svgandroid/SVGParser$NumberParse;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_9

    .line 236
    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;->access$000(Lcom/larvalabs/svgandroid/SVGParser$NumberParse;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    .line 238
    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;->access$000(Lcom/larvalabs/svgandroid/SVGParser$NumberParse;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-le v1, v5, :cond_3

    .line 239
    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;->access$000(Lcom/larvalabs/svgandroid/SVGParser$NumberParse;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    goto :goto_0

    :cond_3
    move p0, v0

    .line 241
    :goto_0
    invoke-virtual {p1, v0, p0}, Landroid/graphics/Matrix;->preScale(FF)Z

    goto/16 :goto_2

    :cond_4
    const-string v0, "skewX("

    .line 243
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 244
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser;->parseNumbers(Ljava/lang/String;)Lcom/larvalabs/svgandroid/SVGParser$NumberParse;

    move-result-object p0

    .line 245
    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;->access$000(Lcom/larvalabs/svgandroid/SVGParser$NumberParse;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_9

    .line 246
    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;->access$000(Lcom/larvalabs/svgandroid/SVGParser$NumberParse;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    float-to-double v0, p0

    .line 247
    invoke-static {v0, v1}, Ljava/lang/Math;->tan(D)D

    move-result-wide v0

    double-to-float p0, v0

    invoke-virtual {p1, p0, v4}, Landroid/graphics/Matrix;->preSkew(FF)Z

    goto/16 :goto_2

    :cond_5
    const-string v0, "skewY("

    .line 249
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 250
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser;->parseNumbers(Ljava/lang/String;)Lcom/larvalabs/svgandroid/SVGParser$NumberParse;

    move-result-object p0

    .line 251
    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;->access$000(Lcom/larvalabs/svgandroid/SVGParser$NumberParse;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_9

    .line 252
    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;->access$000(Lcom/larvalabs/svgandroid/SVGParser$NumberParse;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    float-to-double v0, p0

    .line 253
    invoke-static {v0, v1}, Ljava/lang/Math;->tan(D)D

    move-result-wide v0

    double-to-float p0, v0

    invoke-virtual {p1, v4, p0}, Landroid/graphics/Matrix;->preSkew(FF)Z

    goto/16 :goto_2

    :cond_6
    const-string v0, "rotate("

    .line 255
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 256
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser;->parseNumbers(Ljava/lang/String;)Lcom/larvalabs/svgandroid/SVGParser$NumberParse;

    move-result-object p0

    .line 257
    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;->access$000(Lcom/larvalabs/svgandroid/SVGParser$NumberParse;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_9

    .line 258
    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;->access$000(Lcom/larvalabs/svgandroid/SVGParser$NumberParse;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    .line 261
    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;->access$000(Lcom/larvalabs/svgandroid/SVGParser$NumberParse;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-le v1, v2, :cond_7

    .line 262
    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;->access$000(Lcom/larvalabs/svgandroid/SVGParser$NumberParse;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v4

    .line 263
    invoke-static {p0}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;->access$000(Lcom/larvalabs/svgandroid/SVGParser$NumberParse;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    goto :goto_1

    :cond_7
    const/4 p0, 0x0

    :goto_1
    neg-float v1, v4

    neg-float v2, p0

    .line 265
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 266
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 267
    invoke-virtual {p1, v4, p0}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    goto :goto_2

    .line 270
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid transform ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "SVGAndroid"

    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_9
    :goto_2
    return-object p1
.end method
