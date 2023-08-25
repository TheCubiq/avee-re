.class public Lcom/daaw/ua1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ge0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/ua1$a;
    }
.end annotation


# instance fields
.field public a:F

.field public b:Lcom/daaw/xn0;

.field public c:Landroid/graphics/RectF;

.field public d:Lcom/daaw/bs1;

.field public e:Lcom/daaw/ve;

.field public f:[Lcom/daaw/ua1$a;

.field public g:F

.field public h:I

.field public i:[Ljava/lang/String;

.field public j:Z


# direct methods
.method public constructor <init>([Ljava/lang/String;Z)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/daaw/ua1;->a:F

    new-instance v1, Lcom/daaw/xn0;

    const-string v2, "{ArtistOrTitle}"

    invoke-direct {v1, v2, v0, v0}, Lcom/daaw/xn0;-><init>(Ljava/lang/String;FF)V

    iput-object v1, p0, Lcom/daaw/ua1;->b:Lcom/daaw/xn0;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/daaw/ua1;->c:Landroid/graphics/RectF;

    new-instance v0, Lcom/daaw/bs1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/ua1;->d:Lcom/daaw/bs1;

    invoke-static {}, Lcom/daaw/ve;->d()Lcom/daaw/ve;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ua1;->e:Lcom/daaw/ve;

    const/4 v0, 0x0

    new-array v1, v0, [Lcom/daaw/ua1$a;

    iput-object v1, p0, Lcom/daaw/ua1;->f:[Lcom/daaw/ua1$a;

    iput v0, p0, Lcom/daaw/ua1;->h:I

    iput-object p1, p0, Lcom/daaw/ua1;->i:[Ljava/lang/String;

    iput-boolean p2, p0, Lcom/daaw/ua1;->j:Z

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/un;)V
    .locals 2

    iget v0, p0, Lcom/daaw/ua1;->a:F

    const-string v1, "radius"

    invoke-virtual {p1, v1, v0}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result p1

    iput p1, p0, Lcom/daaw/ua1;->a:F

    return-void
.end method

.method public final c(Lcom/daaw/ve;[Ljava/lang/String;I)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ua1;->j:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/ua1;->q(Lcom/daaw/ve;[Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/ua1;->j(Lcom/daaw/ve;[Ljava/lang/String;I)V

    :goto_0
    return-void
.end method

.method public d(Lcom/daaw/de0;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ua1;->b:Lcom/daaw/xn0;

    invoke-interface {p1}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/xn0;->k(Lcom/daaw/aq0;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

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

    :goto_1
    iget-object v0, p0, Lcom/daaw/ua1;->e:Lcom/daaw/ve;

    invoke-virtual {v0, p1}, Lcom/daaw/ve;->n(C)I

    move-result p1

    iput p1, p0, Lcom/daaw/ua1;->h:I

    return-void
.end method

.method public e(ZIILandroid/graphics/RectF;FLandroid/graphics/PointF;Landroid/graphics/PointF;)I
    .locals 3

    iget-object p1, p0, Lcom/daaw/ua1;->f:[Lcom/daaw/ua1$a;

    array-length p5, p1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    aget-object p1, p1, v0

    iget-object p1, p1, Lcom/daaw/ua1$a;->c:[Lcom/daaw/bs1;

    array-length p1, p1

    if-eq p1, p3, :cond_1

    :cond_0
    iget-object p1, p0, Lcom/daaw/ua1;->e:Lcom/daaw/ve;

    iget-object p5, p0, Lcom/daaw/ua1;->i:[Ljava/lang/String;

    invoke-virtual {p0, p1, p5, p3}, Lcom/daaw/ua1;->c(Lcom/daaw/ve;[Ljava/lang/String;I)V

    :cond_1
    iget p1, p0, Lcom/daaw/ua1;->h:I

    iget-object p3, p0, Lcom/daaw/ua1;->f:[Lcom/daaw/ua1$a;

    array-length p5, p3

    if-ge p1, p5, :cond_2

    aget-object p1, p3, p1

    goto :goto_0

    :cond_2
    aget-object p1, p3, v0

    :goto_0
    if-eqz p1, :cond_6

    iget-object p3, p1, Lcom/daaw/ua1$a;->c:[Lcom/daaw/bs1;

    array-length p5, p3

    if-nez p5, :cond_3

    goto/16 :goto_3

    :cond_3
    aget-object p3, p3, p2

    iget-object p5, p1, Lcom/daaw/ua1$a;->d:[Lcom/daaw/bs1;

    aget-object p5, p5, p2

    iget-object v0, p0, Lcom/daaw/ua1;->c:Landroid/graphics/RectF;

    iget-object v1, p1, Lcom/daaw/ua1$a;->e:Lcom/daaw/bs1;

    iget v2, v1, Lcom/daaw/bs1;->a:F

    iput v2, v0, Landroid/graphics/RectF;->left:F

    iget v1, v1, Lcom/daaw/bs1;->b:F

    iput v1, v0, Landroid/graphics/RectF;->top:F

    iget-object v1, p1, Lcom/daaw/ua1$a;->f:Lcom/daaw/bs1;

    iget v2, v1, Lcom/daaw/bs1;->a:F

    iput v2, v0, Landroid/graphics/RectF;->right:F

    iget v1, v1, Lcom/daaw/bs1;->b:F

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    iget-object v1, p0, Lcom/daaw/ua1;->d:Lcom/daaw/bs1;

    iget v2, p5, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/bs1;->a:F

    iget p5, p5, Lcom/daaw/bs1;->a:F

    neg-float p5, p5

    iput p5, v1, Lcom/daaw/bs1;->b:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result p5

    iget-object v0, p0, Lcom/daaw/ua1;->c:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    cmpl-float p5, p5, v0

    if-lez p5, :cond_4

    iget p5, p3, Lcom/daaw/bs1;->a:F

    iget-object v0, p0, Lcom/daaw/ua1;->c:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    sub-float/2addr p5, v0

    iget-object v0, p0, Lcom/daaw/ua1;->c:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    div-float/2addr p5, v0

    iput p5, p6, Landroid/graphics/PointF;->x:F

    iget p3, p3, Lcom/daaw/bs1;->b:F

    iget-object p5, p0, Lcom/daaw/ua1;->c:Landroid/graphics/RectF;

    invoke-virtual {p5}, Landroid/graphics/RectF;->centerY()F

    move-result p5

    sub-float/2addr p3, p5

    iget-object p5, p0, Lcom/daaw/ua1;->c:Landroid/graphics/RectF;

    invoke-virtual {p5}, Landroid/graphics/RectF;->width()F

    move-result p5

    goto :goto_1

    :cond_4
    iget p5, p3, Lcom/daaw/bs1;->a:F

    iget-object v0, p0, Lcom/daaw/ua1;->c:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    sub-float/2addr p5, v0

    iget-object v0, p0, Lcom/daaw/ua1;->c:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    div-float/2addr p5, v0

    iput p5, p6, Landroid/graphics/PointF;->x:F

    iget p3, p3, Lcom/daaw/bs1;->b:F

    iget-object p5, p0, Lcom/daaw/ua1;->c:Landroid/graphics/RectF;

    invoke-virtual {p5}, Landroid/graphics/RectF;->centerY()F

    move-result p5

    sub-float/2addr p3, p5

    iget-object p5, p0, Lcom/daaw/ua1;->c:Landroid/graphics/RectF;

    invoke-virtual {p5}, Landroid/graphics/RectF;->height()F

    move-result p5

    :goto_1
    div-float/2addr p3, p5

    iput p3, p6, Landroid/graphics/PointF;->y:F

    invoke-virtual {p4}, Landroid/graphics/RectF;->width()F

    move-result p3

    invoke-virtual {p4}, Landroid/graphics/RectF;->height()F

    move-result p5

    cmpg-float p3, p3, p5

    if-gez p3, :cond_5

    invoke-virtual {p4}, Landroid/graphics/RectF;->width()F

    move-result p3

    goto :goto_2

    :cond_5
    invoke-virtual {p4}, Landroid/graphics/RectF;->height()F

    move-result p3

    :goto_2
    const/high16 p5, 0x3f000000    # 0.5f

    mul-float p3, p3, p5

    iget p5, p0, Lcom/daaw/ua1;->a:F

    mul-float p3, p3, p5

    invoke-virtual {p4}, Landroid/graphics/RectF;->centerX()F

    move-result p5

    iget v0, p6, Landroid/graphics/PointF;->x:F

    mul-float v0, v0, p3

    add-float/2addr p5, v0

    iput p5, p6, Landroid/graphics/PointF;->x:F

    invoke-virtual {p4}, Landroid/graphics/RectF;->centerY()F

    move-result p4

    iget p5, p6, Landroid/graphics/PointF;->y:F

    mul-float p5, p5, p3

    add-float/2addr p4, p5

    iput p4, p6, Landroid/graphics/PointF;->y:F

    iget-object p3, p0, Lcom/daaw/ua1;->d:Lcom/daaw/bs1;

    iget p4, p3, Lcom/daaw/bs1;->a:F

    neg-float p4, p4

    iput p4, p7, Landroid/graphics/PointF;->x:F

    iget p3, p3, Lcom/daaw/bs1;->b:F

    neg-float p3, p3

    iput p3, p7, Landroid/graphics/PointF;->y:F

    invoke-virtual {p1, p2}, Lcom/daaw/ua1$a;->b(I)I

    move-result p1

    return p1

    :cond_6
    :goto_3
    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p7, Landroid/graphics/PointF;->x:F

    const/4 p1, 0x0

    iput p1, p7, Landroid/graphics/PointF;->y:F

    invoke-virtual {p4}, Landroid/graphics/RectF;->centerX()F

    move-result p1

    iput p1, p6, Landroid/graphics/PointF;->x:F

    invoke-virtual {p4}, Landroid/graphics/RectF;->centerY()F

    move-result p1

    iput p1, p6, Landroid/graphics/PointF;->y:F

    const/4 p1, -0x1

    return p1
.end method

.method public i(Landroid/graphics/RectF;)I
    .locals 0

    const/4 p1, 0x2

    return p1
.end method

.method public final j(Lcom/daaw/ve;[Ljava/lang/String;I)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ve;->a()I

    move-result v3

    array-length v4, v1

    if-eq v3, v4, :cond_0

    const-string v3, "charSet count don\'t match"

    invoke-static {v3}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ve;->a()I

    move-result v3

    array-length v4, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    new-array v3, v3, [Lcom/daaw/ua1$a;

    iput-object v3, v0, Lcom/daaw/ua1;->f:[Lcom/daaw/ua1$a;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x2

    new-array v5, v4, [F

    fill-array-data v5, :array_0

    new-array v4, v4, [F

    fill-array-data v4, :array_1

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    iget-object v8, v0, Lcom/daaw/ua1;->f:[Lcom/daaw/ua1$a;

    array-length v8, v8

    if-ge v7, v8, :cond_a

    const/4 v8, 0x0

    iput v8, v0, Lcom/daaw/ua1;->g:F

    invoke-interface {v3}, Ljava/util/List;->clear()V

    aget-object v9, v1, v7

    invoke-static {v9}, Lcom/daaw/t71;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    if-gtz v10, :cond_1

    new-instance v8, Lcom/daaw/ua1$a;

    invoke-direct {v8, v0, v6}, Lcom/daaw/ua1$a;-><init>(Lcom/daaw/ua1;I)V

    invoke-virtual {v8}, Lcom/daaw/ua1$a;->a()V

    iget-object v9, v0, Lcom/daaw/ua1;->f:[Lcom/daaw/ua1$a;

    aput-object v8, v9, v7

    goto/16 :goto_4

    :cond_1
    const/4 v10, 0x0

    :goto_1
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/daaw/la1;

    invoke-virtual {v11}, Lcom/daaw/la1;->a()F

    move-result v11

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    invoke-interface {v3, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget v12, v0, Lcom/daaw/ua1;->g:F

    add-float/2addr v12, v11

    iput v12, v0, Lcom/daaw/ua1;->g:F

    const/4 v11, 0x1

    add-int/2addr v10, v11

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v12

    if-lt v10, v12, :cond_9

    new-instance v10, Lcom/daaw/ua1$a;

    invoke-direct {v10, v0, v2}, Lcom/daaw/ua1$a;-><init>(Lcom/daaw/ua1;I)V

    iget v12, v0, Lcom/daaw/ua1;->g:F

    int-to-float v13, v2

    div-float/2addr v12, v13

    iget-object v13, v10, Lcom/daaw/ua1$a;->a:Ljava/util/List;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_2
    if-ge v13, v2, :cond_8

    int-to-float v15, v13

    mul-float v15, v15, v12

    invoke-interface {v9, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/daaw/la1;

    invoke-virtual/range {v16 .. v16}, Lcom/daaw/la1;->a()F

    move-result v16

    add-float v16, v8, v16

    cmpl-float v17, v15, v16

    if-lez v17, :cond_3

    add-int/lit8 v14, v14, 0x1

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v8

    if-lt v14, v8, :cond_2

    const-string v8, "could get all points on path"

    invoke-static {v8}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_2
    iget-object v8, v10, Lcom/daaw/ua1$a;->a:Ljava/util/List;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v8, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move/from16 v8, v16

    goto :goto_2

    :cond_3
    invoke-interface {v9, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v11, v16

    check-cast v11, Lcom/daaw/la1;

    sub-float/2addr v15, v8

    invoke-virtual {v11, v15, v5, v4}, Lcom/daaw/la1;->b(F[F[F)Z

    iget v11, v0, Lcom/daaw/ua1;->g:F

    iput v11, v10, Lcom/daaw/ua1$a;->g:F

    iget-object v11, v10, Lcom/daaw/ua1$a;->c:[Lcom/daaw/bs1;

    new-instance v15, Lcom/daaw/bs1;

    aget v1, v5, v6

    const/16 v16, 0x1

    aget v6, v5, v16

    invoke-direct {v15, v1, v6}, Lcom/daaw/bs1;-><init>(FF)V

    aput-object v15, v11, v13

    iget-object v1, v10, Lcom/daaw/ua1$a;->d:[Lcom/daaw/bs1;

    new-instance v6, Lcom/daaw/bs1;

    const/4 v11, 0x0

    aget v15, v4, v11

    aget v11, v4, v16

    invoke-direct {v6, v15, v11}, Lcom/daaw/bs1;-><init>(FF)V

    aput-object v6, v1, v13

    iget-object v1, v10, Lcom/daaw/ua1$a;->d:[Lcom/daaw/bs1;

    aget-object v1, v1, v13

    invoke-virtual {v1}, Lcom/daaw/bs1;->o()Lcom/daaw/bs1;

    iget-object v1, v10, Lcom/daaw/ua1$a;->e:Lcom/daaw/bs1;

    iget v6, v1, Lcom/daaw/bs1;->a:F

    iget-object v11, v10, Lcom/daaw/ua1$a;->c:[Lcom/daaw/bs1;

    aget-object v15, v11, v13

    iget v15, v15, Lcom/daaw/bs1;->a:F

    cmpl-float v6, v6, v15

    if-lez v6, :cond_4

    aget-object v6, v11, v13

    iget v6, v6, Lcom/daaw/bs1;->a:F

    iput v6, v1, Lcom/daaw/bs1;->a:F

    :cond_4
    iget v6, v1, Lcom/daaw/bs1;->b:F

    aget-object v15, v11, v13

    iget v15, v15, Lcom/daaw/bs1;->b:F

    cmpl-float v6, v6, v15

    if-lez v6, :cond_5

    aget-object v6, v11, v13

    iget v6, v6, Lcom/daaw/bs1;->b:F

    iput v6, v1, Lcom/daaw/bs1;->b:F

    :cond_5
    iget-object v1, v10, Lcom/daaw/ua1$a;->f:Lcom/daaw/bs1;

    iget v6, v1, Lcom/daaw/bs1;->a:F

    aget-object v15, v11, v13

    iget v15, v15, Lcom/daaw/bs1;->a:F

    cmpg-float v6, v6, v15

    if-gez v6, :cond_6

    aget-object v6, v11, v13

    iget v6, v6, Lcom/daaw/bs1;->a:F

    iput v6, v1, Lcom/daaw/bs1;->a:F

    :cond_6
    iget v6, v1, Lcom/daaw/bs1;->b:F

    aget-object v15, v11, v13

    iget v15, v15, Lcom/daaw/bs1;->b:F

    cmpg-float v6, v6, v15

    if-gez v6, :cond_7

    aget-object v6, v11, v13

    iget v6, v6, Lcom/daaw/bs1;->b:F

    iput v6, v1, Lcom/daaw/bs1;->b:F

    :cond_7
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v1, p2

    const/4 v6, 0x0

    const/4 v11, 0x1

    goto/16 :goto_2

    :cond_8
    :goto_3
    invoke-virtual {v10}, Lcom/daaw/ua1$a;->a()V

    iget-object v1, v0, Lcom/daaw/ua1;->f:[Lcom/daaw/ua1$a;

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

.method public k(Landroid/graphics/RectF;I)F
    .locals 3

    iget-object v0, p0, Lcom/daaw/ua1;->f:[Lcom/daaw/ua1$a;

    array-length v1, v0

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/daaw/ua1$a;->c:[Lcom/daaw/bs1;

    array-length v0, v0

    if-eq v0, p2, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/ua1;->e:Lcom/daaw/ve;

    iget-object v1, p0, Lcom/daaw/ua1;->i:[Ljava/lang/String;

    invoke-virtual {p0, v0, v1, p2}, Lcom/daaw/ua1;->c(Lcom/daaw/ve;[Ljava/lang/String;I)V

    :cond_1
    iget p2, p0, Lcom/daaw/ua1;->h:I

    iget-object v0, p0, Lcom/daaw/ua1;->f:[Lcom/daaw/ua1$a;

    array-length v1, v0

    if-ge p2, v1, :cond_2

    aget-object p2, v0, p2

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_3

    const/high16 p1, 0x3f800000    # 1.0f

    return p1

    :cond_3
    iget-object v0, p0, Lcom/daaw/ua1;->c:Landroid/graphics/RectF;

    iget-object v1, p2, Lcom/daaw/ua1$a;->e:Lcom/daaw/bs1;

    iget v2, v1, Lcom/daaw/bs1;->a:F

    iput v2, v0, Landroid/graphics/RectF;->left:F

    iget v1, v1, Lcom/daaw/bs1;->b:F

    iput v1, v0, Landroid/graphics/RectF;->top:F

    iget-object v1, p2, Lcom/daaw/ua1$a;->f:Lcom/daaw/bs1;

    iget v2, v1, Lcom/daaw/bs1;->a:F

    iput v2, v0, Landroid/graphics/RectF;->right:F

    iget v1, v1, Lcom/daaw/bs1;->b:F

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_4

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result p1

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    :goto_1
    iget-object v0, p0, Lcom/daaw/ua1;->c:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    iget-object v1, p0, Lcom/daaw/ua1;->c:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_5

    iget-object v0, p0, Lcom/daaw/ua1;->c:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lcom/daaw/ua1;->c:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    :goto_2
    invoke-virtual {p2}, Lcom/daaw/ua1$a;->d()F

    move-result p2

    div-float/2addr p2, v0

    mul-float p2, p2, p1

    const/high16 p1, 0x3f000000    # 0.5f

    mul-float p2, p2, p1

    iget p1, p0, Lcom/daaw/ua1;->a:F

    mul-float p2, p2, p1

    return p2
.end method

.method public o(Lcom/daaw/un;)V
    .locals 6

    iget v2, p0, Lcom/daaw/ua1;->a:F

    const-string v1, "radius"

    const-string v3, "misc"

    const v4, 0x3dcccccd    # 0.1f

    const/high16 v5, 0x40400000    # 3.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    return-void
.end method

.method public final q(Lcom/daaw/ve;[Ljava/lang/String;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ve;->a()I

    move-result v3

    array-length v4, v1

    if-eq v3, v4, :cond_0

    const-string v3, "charSet count don\'t match"

    invoke-static {v3}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ve;->a()I

    move-result v3

    array-length v4, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    new-array v3, v3, [Lcom/daaw/ua1$a;

    iput-object v3, v0, Lcom/daaw/ua1;->f:[Lcom/daaw/ua1$a;

    new-instance v3, Landroid/graphics/PathMeasure;

    invoke-direct {v3}, Landroid/graphics/PathMeasure;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const/4 v5, 0x2

    new-array v6, v5, [F

    fill-array-data v6, :array_0

    new-array v5, v5, [F

    fill-array-data v5, :array_1

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    iget-object v9, v0, Lcom/daaw/ua1;->f:[Lcom/daaw/ua1$a;

    array-length v9, v9

    if-ge v8, v9, :cond_9

    const/4 v9, 0x0

    iput v9, v0, Lcom/daaw/ua1;->g:F

    invoke-interface {v4}, Ljava/util/List;->clear()V

    aget-object v10, v1, v8

    invoke-static {v10}, Lcom/daaw/u71;->d(Ljava/lang/String;)Landroid/graphics/Path;

    move-result-object v10

    invoke-virtual {v3, v10, v7}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    :cond_1
    invoke-virtual {v3}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v11

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget v12, v0, Lcom/daaw/ua1;->g:F

    add-float/2addr v12, v11

    iput v12, v0, Lcom/daaw/ua1;->g:F

    invoke-virtual {v3}, Landroid/graphics/PathMeasure;->nextContour()Z

    move-result v11

    if-nez v11, :cond_1

    new-instance v11, Lcom/daaw/ua1$a;

    invoke-direct {v11, v0, v2}, Lcom/daaw/ua1$a;-><init>(Lcom/daaw/ua1;I)V

    invoke-virtual {v3, v10, v7}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    iget v10, v0, Lcom/daaw/ua1;->g:F

    int-to-float v12, v2

    div-float/2addr v10, v12

    iget-object v12, v11, Lcom/daaw/ua1$a;->a:Ljava/util/List;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v12, 0x0

    :goto_1
    if-ge v12, v2, :cond_8

    int-to-float v13, v12

    mul-float v13, v13, v10

    invoke-virtual {v3}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v14

    add-float/2addr v14, v9

    cmpl-float v15, v13, v14

    if-lez v15, :cond_3

    invoke-virtual {v3}, Landroid/graphics/PathMeasure;->nextContour()Z

    move-result v9

    if-nez v9, :cond_2

    const-string v9, "could get all points on path"

    invoke-static {v9}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_2
    iget-object v9, v11, Lcom/daaw/ua1$a;->a:Ljava/util/List;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v9, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v9, v14

    goto :goto_1

    :cond_3
    sub-float/2addr v13, v9

    invoke-virtual {v3, v13, v6, v5}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    iget v13, v0, Lcom/daaw/ua1;->g:F

    iput v13, v11, Lcom/daaw/ua1$a;->g:F

    iget-object v13, v11, Lcom/daaw/ua1$a;->c:[Lcom/daaw/bs1;

    new-instance v14, Lcom/daaw/bs1;

    aget v15, v6, v7

    const/16 v16, 0x1

    aget v7, v6, v16

    invoke-direct {v14, v15, v7}, Lcom/daaw/bs1;-><init>(FF)V

    aput-object v14, v13, v12

    iget-object v7, v11, Lcom/daaw/ua1$a;->d:[Lcom/daaw/bs1;

    new-instance v13, Lcom/daaw/bs1;

    const/4 v14, 0x0

    aget v15, v5, v14

    aget v14, v5, v16

    invoke-direct {v13, v15, v14}, Lcom/daaw/bs1;-><init>(FF)V

    aput-object v13, v7, v12

    iget-object v7, v11, Lcom/daaw/ua1$a;->d:[Lcom/daaw/bs1;

    aget-object v7, v7, v12

    invoke-virtual {v7}, Lcom/daaw/bs1;->o()Lcom/daaw/bs1;

    iget-object v7, v11, Lcom/daaw/ua1$a;->e:Lcom/daaw/bs1;

    iget v13, v7, Lcom/daaw/bs1;->a:F

    iget-object v14, v11, Lcom/daaw/ua1$a;->c:[Lcom/daaw/bs1;

    aget-object v15, v14, v12

    iget v15, v15, Lcom/daaw/bs1;->a:F

    cmpl-float v13, v13, v15

    if-lez v13, :cond_4

    aget-object v13, v14, v12

    iget v13, v13, Lcom/daaw/bs1;->a:F

    iput v13, v7, Lcom/daaw/bs1;->a:F

    :cond_4
    iget v13, v7, Lcom/daaw/bs1;->b:F

    aget-object v15, v14, v12

    iget v15, v15, Lcom/daaw/bs1;->b:F

    cmpl-float v13, v13, v15

    if-lez v13, :cond_5

    aget-object v13, v14, v12

    iget v13, v13, Lcom/daaw/bs1;->b:F

    iput v13, v7, Lcom/daaw/bs1;->b:F

    :cond_5
    iget-object v7, v11, Lcom/daaw/ua1$a;->f:Lcom/daaw/bs1;

    iget v13, v7, Lcom/daaw/bs1;->a:F

    aget-object v15, v14, v12

    iget v15, v15, Lcom/daaw/bs1;->a:F

    cmpg-float v13, v13, v15

    if-gez v13, :cond_6

    aget-object v13, v14, v12

    iget v13, v13, Lcom/daaw/bs1;->a:F

    iput v13, v7, Lcom/daaw/bs1;->a:F

    :cond_6
    iget v13, v7, Lcom/daaw/bs1;->b:F

    aget-object v15, v14, v12

    iget v15, v15, Lcom/daaw/bs1;->b:F

    cmpg-float v13, v13, v15

    if-gez v13, :cond_7

    aget-object v13, v14, v12

    iget v13, v13, Lcom/daaw/bs1;->b:F

    iput v13, v7, Lcom/daaw/bs1;->b:F

    :cond_7
    add-int/lit8 v12, v12, 0x1

    const/4 v7, 0x0

    goto/16 :goto_1

    :cond_8
    :goto_2
    invoke-virtual {v11}, Lcom/daaw/ua1$a;->a()V

    iget-object v7, v0, Lcom/daaw/ua1;->f:[Lcom/daaw/ua1$a;

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
