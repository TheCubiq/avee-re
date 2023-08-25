.class public Lcom/daaw/wv0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zd0;


# static fields
.field public static v:Z = true

.field public static w:Lcom/daaw/ds1;

.field public static x:Lcom/daaw/ds1;

.field public static y:Lcom/daaw/ds1;


# instance fields
.field public a:J

.field public b:F

.field public c:I

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:Z

.field public i:Z

.field public j:Lcom/daaw/z6;

.field public k:[Lcom/daaw/xv0;

.field public l:Lcom/daaw/ds1;

.field public m:Lcom/daaw/ds1;

.field public n:Lcom/daaw/bs1;

.field public o:Lcom/daaw/ds1;

.field public p:F

.field public q:F

.field public r:Z

.field public s:Z

.field public t:Lcom/daaw/xv0;

.field public u:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/ds1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, Lcom/daaw/ds1;-><init>(FFF)V

    sput-object v0, Lcom/daaw/wv0;->w:Lcom/daaw/ds1;

    new-instance v0, Lcom/daaw/ds1;

    invoke-direct {v0, v1, v1, v1}, Lcom/daaw/ds1;-><init>(FFF)V

    sput-object v0, Lcom/daaw/wv0;->x:Lcom/daaw/ds1;

    new-instance v0, Lcom/daaw/ds1;

    invoke-direct {v0, v1, v1, v1}, Lcom/daaw/ds1;-><init>(FFF)V

    sput-object v0, Lcom/daaw/wv0;->y:Lcom/daaw/ds1;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v1, v0, [Lcom/daaw/xv0;

    iput-object v1, p0, Lcom/daaw/wv0;->k:[Lcom/daaw/xv0;

    new-instance v1, Lcom/daaw/ds1;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2, v2}, Lcom/daaw/ds1;-><init>(FFF)V

    iput-object v1, p0, Lcom/daaw/wv0;->l:Lcom/daaw/ds1;

    new-instance v1, Lcom/daaw/ds1;

    invoke-direct {v1, v2, v2, v2}, Lcom/daaw/ds1;-><init>(FFF)V

    iput-object v1, p0, Lcom/daaw/wv0;->m:Lcom/daaw/ds1;

    new-instance v1, Lcom/daaw/bs1;

    invoke-direct {v1, v2, v2}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v1, p0, Lcom/daaw/wv0;->n:Lcom/daaw/bs1;

    new-instance v1, Lcom/daaw/ds1;

    invoke-direct {v1, v2, v2, v2}, Lcom/daaw/ds1;-><init>(FFF)V

    iput-object v1, p0, Lcom/daaw/wv0;->o:Lcom/daaw/ds1;

    iput v2, p0, Lcom/daaw/wv0;->q:F

    iput-boolean v0, p0, Lcom/daaw/wv0;->r:Z

    iput-boolean v0, p0, Lcom/daaw/wv0;->s:Z

    new-instance v1, Lcom/daaw/xv0;

    invoke-direct {v1}, Lcom/daaw/xv0;-><init>()V

    iput-object v1, p0, Lcom/daaw/wv0;->t:Lcom/daaw/xv0;

    iput-boolean v0, p0, Lcom/daaw/wv0;->u:Z

    sget-boolean v1, Lcom/daaw/wv0;->v:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/wv0;->u:Z

    sput-boolean v0, Lcom/daaw/wv0;->v:Z

    :cond_0
    return-void
.end method


# virtual methods
.method public a()[F
    .locals 1

    iget-object v0, p0, Lcom/daaw/wv0;->t:Lcom/daaw/xv0;

    invoke-virtual {v0}, Lcom/daaw/xv0;->b()[F

    move-result-object v0

    return-object v0
.end method

.method public b()F
    .locals 1

    iget v0, p0, Lcom/daaw/wv0;->p:F

    return v0
.end method

.method public c()F
    .locals 1

    iget-object v0, p0, Lcom/daaw/wv0;->t:Lcom/daaw/xv0;

    iget v0, v0, Lcom/daaw/xv0;->c:F

    return v0
.end method

.method public d(FFLcom/daaw/bs1;Lcom/daaw/bs1;FFLcom/daaw/bs1;FFLcom/daaw/bs1;Lcom/daaw/pr1;F)Z
    .locals 14

    move-object v0, p0

    move-object/from16 v1, p7

    move-object/from16 v2, p10

    iget-boolean v3, v0, Lcom/daaw/wv0;->r:Z

    const/4 v4, 0x0

    if-nez v3, :cond_0

    return v4

    :cond_0
    iget v3, v0, Lcom/daaw/wv0;->e:F

    add-float/2addr v3, p1

    iput v3, v0, Lcom/daaw/wv0;->e:F

    iget v5, v0, Lcom/daaw/wv0;->g:F

    div-float/2addr v3, v5

    iput v3, v0, Lcom/daaw/wv0;->f:F

    const/high16 v5, 0x3f800000    # 1.0f

    cmpl-float v3, v3, v5

    if-gtz v3, :cond_c

    iget-object v3, v0, Lcom/daaw/wv0;->k:[Lcom/daaw/xv0;

    if-nez v3, :cond_1

    goto/16 :goto_7

    :cond_1
    const/4 v3, 0x0

    if-eqz v2, :cond_2

    iget-object v6, v0, Lcom/daaw/wv0;->o:Lcom/daaw/ds1;

    iget v6, v6, Lcom/daaw/ds1;->c:F

    neg-float v6, v6

    sub-float v6, v6, p12

    invoke-static {v6, v3}, Ljava/lang/Math;->max(FF)F

    move-result v6

    const/high16 v7, 0x41200000    # 10.0f

    mul-float v7, v7, p12

    div-float/2addr v6, v7

    sub-float v6, v5, v6

    iget v7, v0, Lcom/daaw/wv0;->f:F

    invoke-static {v7, v6}, Ljava/lang/Math;->max(FF)F

    move-result v6

    iput v6, v0, Lcom/daaw/wv0;->f:F

    :cond_2
    const/4 v6, 0x0

    :goto_0
    iget-object v7, v0, Lcom/daaw/wv0;->k:[Lcom/daaw/xv0;

    array-length v8, v7

    if-ge v6, v8, :cond_4

    aget-object v8, v7, v6

    iget v8, v8, Lcom/daaw/xv0;->a:F

    iget v9, v0, Lcom/daaw/wv0;->f:F

    cmpl-float v8, v8, v9

    if-ltz v8, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    add-int/lit8 v6, v6, -0x1

    if-gez v6, :cond_5

    const/4 v6, 0x0

    :cond_5
    array-length v8, v7

    const/4 v9, 0x1

    sub-int/2addr v8, v9

    if-lt v6, v8, :cond_6

    array-length v6, v7

    add-int/lit8 v6, v6, -0x2

    :cond_6
    add-int/lit8 v8, v6, 0x1

    if-gez v6, :cond_7

    goto :goto_2

    :cond_7
    move v4, v6

    :goto_2
    iget v6, v0, Lcom/daaw/wv0;->f:F

    aget-object v10, v7, v4

    iget v10, v10, Lcom/daaw/xv0;->a:F

    sub-float/2addr v6, v10

    aget-object v10, v7, v8

    iget v10, v10, Lcom/daaw/xv0;->a:F

    aget-object v11, v7, v4

    iget v11, v11, Lcom/daaw/xv0;->a:F

    sub-float/2addr v10, v11

    div-float/2addr v6, v10

    cmpl-float v10, v6, v5

    if-lez v10, :cond_8

    goto :goto_3

    :cond_8
    move v5, v6

    :goto_3
    iget-object v6, v0, Lcom/daaw/wv0;->t:Lcom/daaw/xv0;

    aget-object v4, v7, v4

    aget-object v7, v7, v8

    invoke-static {v6, v4, v7, v5}, Lcom/daaw/xv0;->a(Lcom/daaw/xv0;Lcom/daaw/xv0;Lcom/daaw/xv0;F)V

    iget-object v4, v0, Lcom/daaw/wv0;->t:Lcom/daaw/xv0;

    iget v5, v4, Lcom/daaw/xv0;->b:F

    mul-float v5, v5, p5

    iput v5, v4, Lcom/daaw/xv0;->b:F

    iget v5, v4, Lcom/daaw/xv0;->c:F

    mul-float v5, v5, p5

    iput v5, v4, Lcom/daaw/xv0;->c:F

    iget-object v5, v0, Lcom/daaw/wv0;->l:Lcom/daaw/ds1;

    iget v6, v5, Lcom/daaw/ds1;->a:F

    iget v7, v1, Lcom/daaw/bs1;->a:F

    sub-float v7, v6, v7

    mul-float v7, v7, p8

    add-float/2addr v6, v7

    iput v6, v5, Lcom/daaw/ds1;->a:F

    iget v6, v5, Lcom/daaw/ds1;->b:F

    iget v1, v1, Lcom/daaw/bs1;->b:F

    sub-float v1, v6, v1

    mul-float v1, v1, p8

    add-float/2addr v6, v1

    iput v6, v5, Lcom/daaw/ds1;->b:F

    iget v1, v5, Lcom/daaw/ds1;->c:F

    add-float/2addr v1, v3

    iput v1, v5, Lcom/daaw/ds1;->c:F

    iget v1, v4, Lcom/daaw/xv0;->g:F

    iget v4, v0, Lcom/daaw/wv0;->e:F

    mul-float v4, v4, v1

    add-float/2addr v1, v4

    float-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    double-to-float v1, v4

    iget-object v4, v0, Lcom/daaw/wv0;->t:Lcom/daaw/xv0;

    iget v5, v4, Lcom/daaw/xv0;->h:F

    mul-float v1, v1, v5

    iget v4, v4, Lcom/daaw/xv0;->g:F

    iget v5, v0, Lcom/daaw/wv0;->e:F

    mul-float v5, v5, v4

    add-float/2addr v4, v5

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    double-to-float v4, v4

    iget-object v5, v0, Lcom/daaw/wv0;->t:Lcom/daaw/xv0;

    iget v6, v5, Lcom/daaw/xv0;->h:F

    mul-float v4, v4, v6

    sget-object v6, Lcom/daaw/wv0;->x:Lcom/daaw/ds1;

    iget-object v7, v0, Lcom/daaw/wv0;->l:Lcom/daaw/ds1;

    iget v8, v7, Lcom/daaw/ds1;->b:F

    neg-float v8, v8

    iput v8, v6, Lcom/daaw/ds1;->a:F

    iget v8, v7, Lcom/daaw/ds1;->c:F

    iput v8, v6, Lcom/daaw/ds1;->b:F

    iget v8, v7, Lcom/daaw/ds1;->a:F

    iput v8, v6, Lcom/daaw/ds1;->c:F

    sget-object v8, Lcom/daaw/wv0;->y:Lcom/daaw/ds1;

    iget v10, v7, Lcom/daaw/ds1;->c:F

    neg-float v10, v10

    iput v10, v8, Lcom/daaw/ds1;->a:F

    iget v11, v7, Lcom/daaw/ds1;->a:F

    iput v11, v8, Lcom/daaw/ds1;->b:F

    iget v12, v7, Lcom/daaw/ds1;->b:F

    iput v12, v8, Lcom/daaw/ds1;->c:F

    if-eqz v2, :cond_9

    iget-object v8, v0, Lcom/daaw/wv0;->m:Lcom/daaw/ds1;

    mul-float v10, v10, v1

    add-float/2addr v10, v11

    iget v13, v6, Lcom/daaw/ds1;->a:F

    mul-float v13, v13, v4

    add-float/2addr v10, v13

    iput v10, v8, Lcom/daaw/ds1;->a:F

    mul-float v11, v11, v1

    add-float/2addr v11, v12

    iget v10, v6, Lcom/daaw/ds1;->b:F

    mul-float v10, v10, v4

    add-float/2addr v11, v10

    iput v11, v8, Lcom/daaw/ds1;->b:F

    iget v10, v7, Lcom/daaw/ds1;->c:F

    mul-float v12, v12, v1

    add-float/2addr v10, v12

    iget v1, v6, Lcom/daaw/ds1;->c:F

    mul-float v1, v1, v4

    add-float/2addr v10, v1

    iput v10, v8, Lcom/daaw/ds1;->c:F

    goto :goto_4

    :cond_9
    iget-object v4, v0, Lcom/daaw/wv0;->m:Lcom/daaw/ds1;

    mul-float v6, v12, v1

    add-float/2addr v11, v6

    iput v11, v4, Lcom/daaw/ds1;->a:F

    iget v6, v7, Lcom/daaw/ds1;->a:F

    neg-float v6, v6

    mul-float v6, v6, v1

    add-float/2addr v12, v6

    iput v12, v4, Lcom/daaw/ds1;->b:F

    iget v1, v7, Lcom/daaw/ds1;->c:F

    iput v1, v4, Lcom/daaw/ds1;->c:F

    :goto_4
    iget-object v1, v0, Lcom/daaw/wv0;->o:Lcom/daaw/ds1;

    iget v4, v1, Lcom/daaw/ds1;->a:F

    iget-object v6, v0, Lcom/daaw/wv0;->m:Lcom/daaw/ds1;

    iget v8, v6, Lcom/daaw/ds1;->a:F

    mul-float v8, v8, p1

    mul-float v8, v8, p6

    mul-float v8, v8, p2

    add-float/2addr v4, v8

    iput v4, v1, Lcom/daaw/ds1;->a:F

    iget v4, v1, Lcom/daaw/ds1;->b:F

    iget v8, v6, Lcom/daaw/ds1;->b:F

    mul-float v8, v8, p1

    mul-float v8, v8, p6

    mul-float v8, v8, p2

    add-float/2addr v4, v8

    iput v4, v1, Lcom/daaw/ds1;->b:F

    iget v4, v1, Lcom/daaw/ds1;->c:F

    iget v8, v6, Lcom/daaw/ds1;->c:F

    mul-float v8, v8, p1

    mul-float v8, v8, p6

    mul-float v8, v8, p2

    add-float/2addr v4, v8

    iput v4, v1, Lcom/daaw/ds1;->c:F

    iget v4, v7, Lcom/daaw/ds1;->a:F

    iget-object v8, v0, Lcom/daaw/wv0;->n:Lcom/daaw/bs1;

    iget v10, v8, Lcom/daaw/bs1;->a:F

    mul-float v10, v10, p1

    mul-float v10, v10, p2

    add-float/2addr v4, v10

    iput v4, v7, Lcom/daaw/ds1;->a:F

    iget v4, v7, Lcom/daaw/ds1;->b:F

    iget v8, v8, Lcom/daaw/bs1;->b:F

    mul-float v8, v8, p1

    mul-float v8, v8, p2

    add-float/2addr v4, v8

    iput v4, v7, Lcom/daaw/ds1;->b:F

    iget-boolean v4, v5, Lcom/daaw/xv0;->e:Z

    if-nez v4, :cond_a

    iget v1, v5, Lcom/daaw/xv0;->d:F

    iput v1, v0, Lcom/daaw/wv0;->q:F

    goto/16 :goto_6

    :cond_a
    if-eqz v2, :cond_b

    iget v4, v2, Lcom/daaw/bs1;->a:F

    iget v5, v1, Lcom/daaw/ds1;->a:F

    sub-float/2addr v4, v5

    iget v5, v2, Lcom/daaw/bs1;->b:F

    iget v1, v1, Lcom/daaw/ds1;->b:F

    sub-float/2addr v5, v1

    invoke-static {v4, v5}, Lcom/daaw/bs1;->l(FF)F

    move-result v1

    iget-object v4, v0, Lcom/daaw/wv0;->o:Lcom/daaw/ds1;

    iget v4, v4, Lcom/daaw/ds1;->c:F

    div-float/2addr v1, v4

    float-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->atan(D)D

    move-result-wide v4

    double-to-float v1, v4

    iget v4, v2, Lcom/daaw/bs1;->a:F

    iget-object v5, v0, Lcom/daaw/wv0;->o:Lcom/daaw/ds1;

    iget v6, v5, Lcom/daaw/ds1;->a:F

    iget-object v7, v0, Lcom/daaw/wv0;->m:Lcom/daaw/ds1;

    iget v8, v7, Lcom/daaw/ds1;->a:F

    sub-float/2addr v6, v8

    sub-float/2addr v4, v6

    iget v6, v2, Lcom/daaw/bs1;->b:F

    iget v5, v5, Lcom/daaw/ds1;->b:F

    iget v7, v7, Lcom/daaw/ds1;->b:F

    sub-float/2addr v5, v7

    sub-float/2addr v6, v5

    invoke-static {v4, v6}, Lcom/daaw/bs1;->l(FF)F

    move-result v4

    iget-object v5, v0, Lcom/daaw/wv0;->o:Lcom/daaw/ds1;

    iget v5, v5, Lcom/daaw/ds1;->c:F

    iget-object v6, v0, Lcom/daaw/wv0;->m:Lcom/daaw/ds1;

    iget v6, v6, Lcom/daaw/ds1;->c:F

    sub-float/2addr v5, v6

    div-float/2addr v4, v5

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->atan(D)D

    move-result-wide v4

    double-to-float v4, v4

    sget-object v5, Lcom/daaw/wv0;->w:Lcom/daaw/ds1;

    iget v6, v2, Lcom/daaw/bs1;->a:F

    iget-object v7, v0, Lcom/daaw/wv0;->o:Lcom/daaw/ds1;

    iget v8, v7, Lcom/daaw/ds1;->a:F

    sub-float/2addr v6, v8

    iput v6, v5, Lcom/daaw/ds1;->a:F

    iget v2, v2, Lcom/daaw/bs1;->b:F

    iget v6, v7, Lcom/daaw/ds1;->b:F

    sub-float/2addr v2, v6

    iput v2, v5, Lcom/daaw/ds1;->b:F

    iput v3, v5, Lcom/daaw/ds1;->c:F

    invoke-virtual {v5}, Lcom/daaw/ds1;->a()F

    move-result v2

    iput v2, v0, Lcom/daaw/wv0;->q:F

    sub-float/2addr v1, v4

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const v2, 0x3e99999a    # 0.3f

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    const v2, 0x42c8199a    # 100.05f

    goto :goto_5

    :cond_b
    invoke-virtual {v6}, Lcom/daaw/ds1;->a()F

    move-result v1

    iput v1, v0, Lcom/daaw/wv0;->q:F

    iget-object v1, v0, Lcom/daaw/wv0;->m:Lcom/daaw/ds1;

    invoke-virtual {v1}, Lcom/daaw/ds1;->b()F

    move-result v1

    const v2, 0x3d4ccccd    # 0.05f

    :goto_5
    mul-float v3, v1, v2

    :goto_6
    iget-object v1, v0, Lcom/daaw/wv0;->t:Lcom/daaw/xv0;

    iget v1, v1, Lcom/daaw/xv0;->b:F

    mul-float v3, v3, p6

    mul-float v3, v3, p9

    add-float/2addr v1, v3

    iput v1, v0, Lcom/daaw/wv0;->p:F

    return v9

    :cond_c
    :goto_7
    iput-boolean v4, v0, Lcom/daaw/wv0;->r:Z

    return v4
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/wv0;->r:Z

    return v0
.end method

.method public f(F)V
    .locals 3

    iget-object p1, p0, Lcom/daaw/wv0;->j:Lcom/daaw/z6;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/z6;->i()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    iget-boolean v0, p0, Lcom/daaw/wv0;->h:Z

    if-nez v0, :cond_1

    int-to-float v1, p1

    iget v2, p0, Lcom/daaw/wv0;->f:F

    mul-float v1, v1, v2

    float-to-int v1, v1

    iput v1, p0, Lcom/daaw/wv0;->c:I

    :cond_1
    iget-boolean v1, p0, Lcom/daaw/wv0;->i:Z

    if-nez v1, :cond_2

    iget v1, p0, Lcom/daaw/wv0;->c:I

    if-lt v1, p1, :cond_2

    add-int/lit8 v1, p1, -0x1

    iput v1, p0, Lcom/daaw/wv0;->c:I

    :cond_2
    iget v1, p0, Lcom/daaw/wv0;->c:I

    rem-int/2addr v1, p1

    iput v1, p0, Lcom/daaw/wv0;->c:I

    if-nez v0, :cond_3

    const/high16 p1, 0x3f800000    # 1.0f

    iget v0, p0, Lcom/daaw/wv0;->f:F

    mul-float v0, v0, p1

    iput v0, p0, Lcom/daaw/wv0;->d:F

    :cond_3
    return-void
.end method

.method public g()F
    .locals 1

    iget v0, p0, Lcom/daaw/wv0;->q:F

    return v0
.end method

.method public getPosition()Lcom/daaw/ds1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/wv0;->o:Lcom/daaw/ds1;

    return-object v0
.end method

.method public h(I)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/wv0;->k:[Lcom/daaw/xv0;

    array-length v0, v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    new-array v0, p1, [Lcom/daaw/xv0;

    iput-object v0, p0, Lcom/daaw/wv0;->k:[Lcom/daaw/xv0;

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_1

    iget-object v1, p0, Lcom/daaw/wv0;->k:[Lcom/daaw/xv0;

    new-instance v2, Lcom/daaw/xv0;

    invoke-direct {v2}, Lcom/daaw/xv0;-><init>()V

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public i(I)Lcom/daaw/xv0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/wv0;->k:[Lcom/daaw/xv0;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public j(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/wv0;->r:Z

    return-void
.end method

.method public setVisible(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/wv0;->s:Z

    return-void
.end method
