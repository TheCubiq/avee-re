.class public Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;
.super Ljava/lang/Object;
.source "SegmentPathSvg.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;
    }
.end annotation


# instance fields
.field charPaths:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;

.field charSet:Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

.field currentCharIndex:I

.field private measureText:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

.field pathBounds:Landroid/graphics/RectF;

.field radius:F

.field svgApproximate:Z

.field svgPaths:[Ljava/lang/String;

.field totalPathLength:F

.field vec:Lcom/daaw/avee/Common/Vec2f;


# direct methods
.method public constructor <init>([Ljava/lang/String;Z)V
    .locals 3

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 28
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->radius:F

    .line 35
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const-string v2, "{ArtistOrTitle}"

    invoke-direct {v1, v2, v0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->measureText:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    .line 37
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->pathBounds:Landroid/graphics/RectF;

    .line 38
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->vec:Lcom/daaw/avee/Common/Vec2f;

    .line 106
    invoke-static {}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->createAscii48to90()Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->charSet:Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    const/4 v0, 0x0

    new-array v1, v0, [Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;

    .line 107
    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->charPaths:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;

    .line 110
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->currentCharIndex:I

    .line 117
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->svgPaths:[Ljava/lang/String;

    .line 118
    iput-boolean p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->svgApproximate:Z

    return-void
.end method

.method private createPaths(Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;[Ljava/lang/String;I)V
    .locals 1

    .line 140
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->svgApproximate:Z

    if-nez v0, :cond_0

    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->createPaths_pathMeasure(Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;[Ljava/lang/String;I)V

    goto :goto_0

    .line 141
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->createPaths_approximate(Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;[Ljava/lang/String;I)V

    :goto_0
    return-void
.end method

.method private createPaths_approximate(Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;[Ljava/lang/String;I)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    .line 275
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->count()I

    move-result v3

    array-length v4, v1

    if-eq v3, v4, :cond_0

    const-string v3, "charSet count don\'t match"

    .line 276
    invoke-static {v3}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 278
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->count()I

    move-result v3

    array-length v4, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    new-array v3, v3, [Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;

    iput-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->charPaths:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;

    .line 286
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x2

    new-array v5, v4, [F

    .line 288
    fill-array-data v5, :array_0

    new-array v4, v4, [F

    .line 289
    fill-array-data v4, :array_1

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 291
    :goto_0
    iget-object v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->charPaths:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;

    array-length v8, v8

    if-ge v7, v8, :cond_a

    const/4 v8, 0x0

    .line 293
    iput v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->totalPathLength:F

    .line 294
    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 299
    aget-object v9, v1, v7

    invoke-static {v9}, Lcom/daaw/avee/comp/Visualizer/Path/SVGApproximate;->parsePathApproximate(Ljava/lang/String;)Ljava/util/List;

    move-result-object v9

    .line 301
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    if-gtz v10, :cond_1

    .line 303
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;

    invoke-direct {v8, v0, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;I)V

    .line 304
    invoke-virtual {v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->finishInit()V

    .line 305
    iget-object v9, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->charPaths:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;

    aput-object v8, v9, v7

    goto/16 :goto_4

    :cond_1
    const/4 v10, 0x0

    .line 313
    :goto_1
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/daaw/avee/comp/Visualizer/Path/SegmentContour;

    invoke-virtual {v11}, Lcom/daaw/avee/comp/Visualizer/Path/SegmentContour;->getLength()F

    move-result v11

    .line 314
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    invoke-interface {v3, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 315
    iget v12, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->totalPathLength:F

    add-float/2addr v12, v11

    iput v12, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->totalPathLength:F

    const/4 v11, 0x1

    add-int/2addr v10, v11

    .line 317
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v12

    if-lt v10, v12, :cond_9

    .line 320
    new-instance v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;

    invoke-direct {v10, v0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;I)V

    .line 327
    iget v12, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->totalPathLength:F

    int-to-float v13, v2

    div-float/2addr v12, v13

    .line 329
    iget-object v13, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->indexContourGaps:Ljava/util/List;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_2
    if-ge v13, v2, :cond_8

    int-to-float v15, v13

    mul-float v15, v15, v12

    .line 335
    invoke-interface {v9, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/daaw/avee/comp/Visualizer/Path/SegmentContour;

    invoke-virtual/range {v16 .. v16}, Lcom/daaw/avee/comp/Visualizer/Path/SegmentContour;->getLength()F

    move-result v16

    add-float v16, v8, v16

    cmpl-float v17, v15, v16

    if-lez v17, :cond_3

    add-int/lit8 v14, v14, 0x1

    .line 339
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v8

    if-lt v14, v8, :cond_2

    const-string v8, "could get all points on path"

    .line 340
    invoke-static {v8}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    goto/16 :goto_3

    .line 343
    :cond_2
    iget-object v8, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->indexContourGaps:Ljava/util/List;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v8, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move/from16 v8, v16

    goto :goto_2

    .line 347
    :cond_3
    invoke-interface {v9, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v11, v16

    check-cast v11, Lcom/daaw/avee/comp/Visualizer/Path/SegmentContour;

    sub-float/2addr v15, v8

    invoke-virtual {v11, v15, v5, v4}, Lcom/daaw/avee/comp/Visualizer/Path/SegmentContour;->getPosTan(F[F[F)Z

    .line 349
    iget v11, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->totalPathLength:F

    iput v11, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->length:F

    .line 350
    iget-object v11, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    new-instance v15, Lcom/daaw/avee/Common/Vec2f;

    aget v1, v5, v6

    const/16 v16, 0x1

    aget v6, v5, v16

    invoke-direct {v15, v1, v6}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    aput-object v15, v11, v13

    .line 351
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->tans:[Lcom/daaw/avee/Common/Vec2f;

    new-instance v6, Lcom/daaw/avee/Common/Vec2f;

    const/4 v11, 0x0

    aget v15, v4, v11

    aget v11, v4, v16

    invoke-direct {v6, v15, v11}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    aput-object v6, v1, v13

    .line 352
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->tans:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v1, v1, v13

    invoke-virtual {v1}, Lcom/daaw/avee/Common/Vec2f;->normalize()Lcom/daaw/avee/Common/Vec2f;

    .line 354
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->min:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v6, v6, v13

    iget v6, v6, Lcom/daaw/avee/Common/Vec2f;->x:F

    cmpl-float v1, v1, v6

    if-lez v1, :cond_4

    .line 355
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->min:Lcom/daaw/avee/Common/Vec2f;

    iget-object v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v6, v6, v13

    iget v6, v6, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v6, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 356
    :cond_4
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->min:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v6, v6, v13

    iget v6, v6, Lcom/daaw/avee/Common/Vec2f;->y:F

    cmpl-float v1, v1, v6

    if-lez v1, :cond_5

    .line 357
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->min:Lcom/daaw/avee/Common/Vec2f;

    iget-object v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v6, v6, v13

    iget v6, v6, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v6, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 359
    :cond_5
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->max:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v6, v6, v13

    iget v6, v6, Lcom/daaw/avee/Common/Vec2f;->x:F

    cmpg-float v1, v1, v6

    if-gez v1, :cond_6

    .line 360
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->max:Lcom/daaw/avee/Common/Vec2f;

    iget-object v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v6, v6, v13

    iget v6, v6, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v6, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 361
    :cond_6
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->max:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v6, v6, v13

    iget v6, v6, Lcom/daaw/avee/Common/Vec2f;->y:F

    cmpg-float v1, v1, v6

    if-gez v1, :cond_7

    .line 362
    iget-object v1, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->max:Lcom/daaw/avee/Common/Vec2f;

    iget-object v6, v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v6, v6, v13

    iget v6, v6, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v6, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    :cond_7
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v1, p2

    const/4 v6, 0x0

    const/4 v11, 0x1

    goto/16 :goto_2

    .line 367
    :cond_8
    :goto_3
    invoke-virtual {v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->finishInit()V

    .line 368
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->charPaths:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;

    aput-object v10, v1, v7

    :goto_4
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v1, p2

    const/4 v6, 0x0

    goto/16 :goto_0

    :cond_9
    move-object/from16 v1, p2

    goto/16 :goto_1

    :cond_a
    return-void

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method private createPaths_pathMeasure(Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;[Ljava/lang/String;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    .line 149
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->count()I

    move-result v3

    array-length v4, v1

    if-eq v3, v4, :cond_0

    const-string v3, "charSet count don\'t match"

    .line 150
    invoke-static {v3}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 152
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->count()I

    move-result v3

    array-length v4, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    new-array v3, v3, [Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;

    iput-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->charPaths:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;

    .line 155
    new-instance v3, Landroid/graphics/PathMeasure;

    invoke-direct {v3}, Landroid/graphics/PathMeasure;-><init>()V

    .line 159
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const/4 v5, 0x2

    new-array v6, v5, [F

    .line 161
    fill-array-data v6, :array_0

    new-array v5, v5, [F

    .line 162
    fill-array-data v5, :array_1

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 164
    :goto_0
    iget-object v9, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->charPaths:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;

    array-length v9, v9

    if-ge v8, v9, :cond_9

    const/4 v9, 0x0

    .line 166
    iput v9, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->totalPathLength:F

    .line 167
    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 169
    aget-object v10, v1, v8

    invoke-static {v10}, Lcom/larvalabs/svgandroid/SVGParser;->parsePath(Ljava/lang/String;)Landroid/graphics/Path;

    move-result-object v10

    .line 170
    invoke-virtual {v3, v10, v7}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 176
    :cond_1
    invoke-virtual {v3}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v11

    .line 177
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 178
    iget v12, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->totalPathLength:F

    add-float/2addr v12, v11

    iput v12, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->totalPathLength:F

    .line 179
    invoke-virtual {v3}, Landroid/graphics/PathMeasure;->nextContour()Z

    move-result v11

    if-nez v11, :cond_1

    .line 181
    new-instance v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;

    invoke-direct {v11, v0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;I)V

    .line 183
    invoke-virtual {v3, v10, v7}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 188
    iget v10, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->totalPathLength:F

    int-to-float v12, v2

    div-float/2addr v10, v12

    .line 190
    iget-object v12, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->indexContourGaps:Ljava/util/List;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v12, 0x0

    :goto_1
    if-ge v12, v2, :cond_8

    int-to-float v13, v12

    mul-float v13, v13, v10

    .line 195
    invoke-virtual {v3}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v14

    add-float/2addr v14, v9

    cmpl-float v15, v13, v14

    if-lez v15, :cond_3

    .line 198
    invoke-virtual {v3}, Landroid/graphics/PathMeasure;->nextContour()Z

    move-result v9

    if-nez v9, :cond_2

    const-string v9, "could get all points on path"

    .line 199
    invoke-static {v9}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 202
    :cond_2
    iget-object v9, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->indexContourGaps:Ljava/util/List;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v9, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v9, v14

    goto :goto_1

    :cond_3
    sub-float/2addr v13, v9

    .line 206
    invoke-virtual {v3, v13, v6, v5}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    .line 208
    iget v13, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->totalPathLength:F

    iput v13, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->length:F

    .line 209
    iget-object v13, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    new-instance v14, Lcom/daaw/avee/Common/Vec2f;

    aget v15, v6, v7

    const/16 v16, 0x1

    aget v7, v6, v16

    invoke-direct {v14, v15, v7}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    aput-object v14, v13, v12

    .line 210
    iget-object v7, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->tans:[Lcom/daaw/avee/Common/Vec2f;

    new-instance v13, Lcom/daaw/avee/Common/Vec2f;

    const/4 v14, 0x0

    aget v15, v5, v14

    aget v14, v5, v16

    invoke-direct {v13, v15, v14}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    aput-object v13, v7, v12

    .line 211
    iget-object v7, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->tans:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v7, v7, v12

    invoke-virtual {v7}, Lcom/daaw/avee/Common/Vec2f;->normalize()Lcom/daaw/avee/Common/Vec2f;

    .line 213
    iget-object v7, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->min:Lcom/daaw/avee/Common/Vec2f;

    iget v7, v7, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v13, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v13, v13, v12

    iget v13, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    cmpl-float v7, v7, v13

    if-lez v7, :cond_4

    .line 214
    iget-object v7, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->min:Lcom/daaw/avee/Common/Vec2f;

    iget-object v13, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v13, v13, v12

    iget v13, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v13, v7, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 215
    :cond_4
    iget-object v7, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->min:Lcom/daaw/avee/Common/Vec2f;

    iget v7, v7, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v13, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v13, v13, v12

    iget v13, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    cmpl-float v7, v7, v13

    if-lez v7, :cond_5

    .line 216
    iget-object v7, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->min:Lcom/daaw/avee/Common/Vec2f;

    iget-object v13, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v13, v13, v12

    iget v13, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v13, v7, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 218
    :cond_5
    iget-object v7, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->max:Lcom/daaw/avee/Common/Vec2f;

    iget v7, v7, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v13, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v13, v13, v12

    iget v13, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    cmpg-float v7, v7, v13

    if-gez v7, :cond_6

    .line 219
    iget-object v7, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->max:Lcom/daaw/avee/Common/Vec2f;

    iget-object v13, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v13, v13, v12

    iget v13, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v13, v7, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 220
    :cond_6
    iget-object v7, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->max:Lcom/daaw/avee/Common/Vec2f;

    iget v7, v7, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v13, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v13, v13, v12

    iget v13, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    cmpg-float v7, v7, v13

    if-gez v7, :cond_7

    .line 221
    iget-object v7, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->max:Lcom/daaw/avee/Common/Vec2f;

    iget-object v13, v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object v13, v13, v12

    iget v13, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v13, v7, Lcom/daaw/avee/Common/Vec2f;->y:F

    :cond_7
    add-int/lit8 v12, v12, 0x1

    const/4 v7, 0x0

    goto/16 :goto_1

    .line 226
    :cond_8
    :goto_2
    invoke-virtual {v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->finishInit()V

    .line 227
    iget-object v7, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->charPaths:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;

    aput-object v11, v7, v8

    add-int/lit8 v8, v8, 0x1

    const/4 v7, 0x0

    goto/16 :goto_0

    :cond_9
    return-void

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x0
    .end array-data
.end method


# virtual methods
.method public getPathLength(Landroid/graphics/RectF;I)F
    .locals 2

    .line 536
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->charPaths:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;

    array-length v1, v0

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    array-length v0, v0

    if-eq v0, p2, :cond_1

    .line 537
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->charSet:Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->svgPaths:[Ljava/lang/String;

    invoke-direct {p0, v0, v1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->createPaths(Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;[Ljava/lang/String;I)V

    .line 538
    :cond_1
    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->currentCharIndex:I

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->charPaths:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;

    array-length v1, v0

    if-ge p2, v1, :cond_2

    .line 539
    aget-object p2, v0, p2

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_3

    const/high16 p1, 0x3f800000    # 1.0f

    return p1

    .line 544
    :cond_3
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->pathBounds:Landroid/graphics/RectF;

    iget-object v1, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->min:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 545
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->pathBounds:Landroid/graphics/RectF;

    iget-object v1, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->min:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 546
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->pathBounds:Landroid/graphics/RectF;

    iget-object v1, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->max:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 547
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->pathBounds:Landroid/graphics/RectF;

    iget-object v1, p2, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->max:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 550
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_4

    .line 551
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result p1

    goto :goto_1

    .line 553
    :cond_4
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    .line 556
    :goto_1
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_5

    .line 557
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    goto :goto_2

    .line 559
    :cond_5
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    .line 561
    :goto_2
    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->getLength()F

    move-result p2

    div-float/2addr p2, v0

    mul-float p2, p2, p1

    const/high16 p1, 0x3f000000    # 0.5f

    mul-float p2, p2, p1

    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->radius:F

    mul-float p2, p2, p1

    return p2
.end method

.method public getPointOnPath(ZIILandroid/graphics/RectF;FLandroid/graphics/PointF;Landroid/graphics/PointF;)I
    .locals 2

    .line 442
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->charPaths:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;

    array-length p5, p1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    aget-object p1, p1, v0

    iget-object p1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    array-length p1, p1

    if-eq p1, p3, :cond_1

    .line 443
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->charSet:Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    iget-object p5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->svgPaths:[Ljava/lang/String;

    invoke-direct {p0, p1, p5, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->createPaths(Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;[Ljava/lang/String;I)V

    .line 444
    :cond_1
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->currentCharIndex:I

    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->charPaths:[Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;

    array-length p5, p3

    if-ge p1, p5, :cond_2

    .line 445
    aget-object p1, p3, p1

    goto :goto_0

    .line 447
    :cond_2
    aget-object p1, p3, v0

    :goto_0
    if-eqz p1, :cond_6

    .line 451
    iget-object p3, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    array-length p3, p3

    if-nez p3, :cond_3

    goto/16 :goto_3

    .line 459
    :cond_3
    iget-object p3, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->points:[Lcom/daaw/avee/Common/Vec2f;

    aget-object p3, p3, p2

    .line 460
    iget-object p5, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->tans:[Lcom/daaw/avee/Common/Vec2f;

    aget-object p5, p5, p2

    .line 462
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->pathBounds:Landroid/graphics/RectF;

    iget-object v1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->min:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 463
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->pathBounds:Landroid/graphics/RectF;

    iget-object v1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->min:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 464
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->pathBounds:Landroid/graphics/RectF;

    iget-object v1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->max:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 465
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->pathBounds:Landroid/graphics/RectF;

    iget-object v1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->max:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 492
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->vec:Lcom/daaw/avee/Common/Vec2f;

    iget v1, p5, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v1, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 493
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->vec:Lcom/daaw/avee/Common/Vec2f;

    iget p5, p5, Lcom/daaw/avee/Common/Vec2f;->x:F

    neg-float p5, p5

    iput p5, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 503
    iget-object p5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {p5}, Landroid/graphics/RectF;->width()F

    move-result p5

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    cmpl-float p5, p5, v0

    if-lez p5, :cond_4

    .line 504
    iget p5, p3, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    sub-float/2addr p5, v0

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    div-float/2addr p5, v0

    iput p5, p6, Landroid/graphics/PointF;->x:F

    .line 505
    iget p3, p3, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object p5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {p5}, Landroid/graphics/RectF;->centerY()F

    move-result p5

    sub-float/2addr p3, p5

    iget-object p5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {p5}, Landroid/graphics/RectF;->width()F

    move-result p5

    div-float/2addr p3, p5

    iput p3, p6, Landroid/graphics/PointF;->y:F

    goto :goto_1

    .line 507
    :cond_4
    iget p5, p3, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    sub-float/2addr p5, v0

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    div-float/2addr p5, v0

    iput p5, p6, Landroid/graphics/PointF;->x:F

    .line 508
    iget p3, p3, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object p5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {p5}, Landroid/graphics/RectF;->centerY()F

    move-result p5

    sub-float/2addr p3, p5

    iget-object p5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->pathBounds:Landroid/graphics/RectF;

    invoke-virtual {p5}, Landroid/graphics/RectF;->height()F

    move-result p5

    div-float/2addr p3, p5

    iput p3, p6, Landroid/graphics/PointF;->y:F

    .line 514
    :goto_1
    invoke-virtual {p4}, Landroid/graphics/RectF;->width()F

    move-result p3

    invoke-virtual {p4}, Landroid/graphics/RectF;->height()F

    move-result p5

    cmpg-float p3, p3, p5

    if-gez p3, :cond_5

    .line 515
    invoke-virtual {p4}, Landroid/graphics/RectF;->width()F

    move-result p3

    goto :goto_2

    .line 517
    :cond_5
    invoke-virtual {p4}, Landroid/graphics/RectF;->height()F

    move-result p3

    :goto_2
    const/high16 p5, 0x3f000000    # 0.5f

    mul-float p3, p3, p5

    .line 519
    iget p5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->radius:F

    mul-float p3, p3, p5

    .line 521
    invoke-virtual {p4}, Landroid/graphics/RectF;->centerX()F

    move-result p5

    iget v0, p6, Landroid/graphics/PointF;->x:F

    mul-float v0, v0, p3

    add-float/2addr p5, v0

    iput p5, p6, Landroid/graphics/PointF;->x:F

    .line 522
    invoke-virtual {p4}, Landroid/graphics/RectF;->centerY()F

    move-result p4

    iget p5, p6, Landroid/graphics/PointF;->y:F

    mul-float p5, p5, p3

    add-float/2addr p4, p5

    iput p4, p6, Landroid/graphics/PointF;->y:F

    .line 524
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->vec:Lcom/daaw/avee/Common/Vec2f;

    iget p3, p3, Lcom/daaw/avee/Common/Vec2f;->x:F

    neg-float p3, p3

    iput p3, p7, Landroid/graphics/PointF;->x:F

    .line 525
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->vec:Lcom/daaw/avee/Common/Vec2f;

    iget p3, p3, Lcom/daaw/avee/Common/Vec2f;->y:F

    neg-float p3, p3

    iput p3, p7, Landroid/graphics/PointF;->y:F

    .line 528
    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg$CharPathEntry;->getLastIndexOfContour(I)I

    move-result p1

    return p1

    :cond_6
    :goto_3
    const/high16 p1, 0x3f800000    # 1.0f

    .line 452
    iput p1, p7, Landroid/graphics/PointF;->x:F

    const/4 p1, 0x0

    .line 453
    iput p1, p7, Landroid/graphics/PointF;->y:F

    .line 454
    invoke-virtual {p4}, Landroid/graphics/RectF;->centerX()F

    move-result p1

    iput p1, p6, Landroid/graphics/PointF;->x:F

    .line 455
    invoke-virtual {p4}, Landroid/graphics/RectF;->centerY()F

    move-result p1

    iput p1, p6, Landroid/graphics/PointF;->y:F

    const/4 p1, -0x1

    return p1
.end method

.method public getPreferredPointCount(Landroid/graphics/RectF;)I
    .locals 0

    const/4 p1, 0x2

    return p1
.end method

.method public onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 2

    .line 571
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->radius:F

    const-string v1, "radius"

    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->radius:F

    return-void
.end method

.method public onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 6

    .line 576
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->radius:F

    const-string v1, "radius"

    const-string v3, "misc"

    const v4, 0x3dcccccd    # 0.1f

    const/high16 v5, 0x40400000    # 3.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    return-void
.end method

.method public process(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;)V
    .locals 2

    .line 414
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->measureText:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->measureText(Lcom/daaw/avee/comp/Visualizer/Meter;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 416
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result p1

    goto :goto_1

    :cond_1
    :goto_0
    const/16 p1, 0x58

    .line 421
    :goto_1
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->charSet:Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->getIndexByChar(C)I

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->currentCharIndex:I

    return-void
.end method

.method public setRadius(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;
    .locals 0

    .line 395
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSvg;->radius:F

    return-object p0
.end method
