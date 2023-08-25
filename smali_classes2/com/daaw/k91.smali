.class public Lcom/daaw/k91;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final A:[F

.field public static B:F

.field public static C:F

.field public static w:F

.field public static x:F

.field public static y:F

.field public static z:F


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:J

.field public m:I

.field public n:F

.field public o:F

.field public p:F

.field public q:Z

.field public r:Landroid/view/animation/Interpolator;

.field public s:Z

.field public t:F

.field public u:F

.field public final v:F


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    const-wide/high16 v0, 0x3fe8000000000000L    # 0.75

    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    const-wide v2, 0x3feccccccccccccdL    # 0.9

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    div-double/2addr v0, v2

    double-to-float v0, v0

    sput v0, Lcom/daaw/k91;->w:F

    const/high16 v0, 0x44480000    # 800.0f

    sput v0, Lcom/daaw/k91;->x:F

    const v0, 0x3ecccccd    # 0.4f

    sput v0, Lcom/daaw/k91;->y:F

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v0, v1, v0

    sput v0, Lcom/daaw/k91;->z:F

    const/16 v0, 0x65

    new-array v0, v0, [F

    sput-object v0, Lcom/daaw/k91;->A:[F

    const/4 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x64

    if-gt v2, v3, :cond_2

    int-to-float v3, v2

    const/high16 v4, 0x42c80000    # 100.0f

    div-float v4, v3, v4

    const/high16 v3, 0x3f800000    # 1.0f

    :goto_1
    sub-float v5, v3, v0

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    add-float/2addr v5, v0

    const/high16 v6, 0x40400000    # 3.0f

    mul-float v6, v6, v5

    sub-float v7, v1, v5

    mul-float v6, v6, v7

    sget v8, Lcom/daaw/k91;->y:F

    mul-float v7, v7, v8

    sget v8, Lcom/daaw/k91;->z:F

    mul-float v8, v8, v5

    add-float/2addr v7, v8

    mul-float v7, v7, v6

    mul-float v8, v5, v5

    mul-float v8, v8, v5

    add-float/2addr v7, v8

    sub-float v9, v7, v4

    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v9

    float-to-double v9, v9

    const-wide v11, 0x3ee4f8b588e368f1L    # 1.0E-5

    cmpg-double v13, v9, v11

    if-gez v13, :cond_0

    add-float/2addr v6, v8

    sget-object v3, Lcom/daaw/k91;->A:[F

    aput v6, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    cmpl-float v6, v7, v4

    if-lez v6, :cond_1

    move v3, v5

    goto :goto_1

    :cond_1
    move v0, v5

    goto :goto_1

    :cond_2
    sget-object v0, Lcom/daaw/k91;->A:[F

    aput v1, v0, v3

    const/high16 v0, 0x41000000    # 8.0f

    sput v0, Lcom/daaw/k91;->B:F

    sput v1, Lcom/daaw/k91;->C:F

    invoke-static {v1}, Lcom/daaw/k91;->o(F)F

    move-result v0

    div-float/2addr v1, v0

    sput v1, Lcom/daaw/k91;->C:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/daaw/k91;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/animation/Interpolator;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/k91;->q:Z

    iput-object p2, p0, Lcom/daaw/k91;->r:Landroid/view/animation/Interpolator;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 p2, 0x43200000    # 160.0f

    mul-float p1, p1, p2

    iput p1, p0, Lcom/daaw/k91;->v:F

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/k91;->a(F)F

    move-result p1

    iput p1, p0, Lcom/daaw/k91;->u:F

    iput-boolean p3, p0, Lcom/daaw/k91;->s:Z

    return-void
.end method

.method public static o(F)F
    .locals 4

    sget v0, Lcom/daaw/k91;->B:F

    mul-float p0, p0, v0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v1, p0, v0

    if-gez v1, :cond_0

    neg-float v1, p0

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->exp(D)D

    move-result-wide v1

    double-to-float v1, v1

    sub-float/2addr v0, v1

    sub-float/2addr p0, v0

    goto :goto_0

    :cond_0
    const v1, 0x3ebc5ab2

    sub-float p0, v0, p0

    float-to-double v2, p0

    invoke-static {v2, v3}, Ljava/lang/Math;->exp(D)D

    move-result-wide v2

    double-to-float p0, v2

    sub-float/2addr v0, p0

    const p0, 0x3f21d2a7

    mul-float v0, v0, p0

    add-float p0, v0, v1

    :goto_0
    sget v0, Lcom/daaw/k91;->C:F

    mul-float p0, p0, v0

    return p0
.end method


# virtual methods
.method public final a(F)F
    .locals 2

    iget v0, p0, Lcom/daaw/k91;->v:F

    const v1, 0x43c10b3d

    mul-float v0, v0, v1

    mul-float v0, v0, p1

    return v0
.end method

.method public b()Z
    .locals 7

    iget-boolean v0, p0, Lcom/daaw/k91;->q:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/k91;->l:J

    sub-long/2addr v0, v2

    long-to-int v1, v0

    iget v0, p0, Lcom/daaw/k91;->m:I

    const/4 v2, 0x1

    if-ge v1, v0, :cond_4

    iget v3, p0, Lcom/daaw/k91;->a:I

    if-eqz v3, :cond_2

    if-eq v3, v2, :cond_1

    goto/16 :goto_2

    :cond_1
    int-to-float v1, v1

    int-to-float v0, v0

    div-float/2addr v1, v0

    const/high16 v0, 0x42c80000    # 100.0f

    mul-float v3, v1, v0

    float-to-int v3, v3

    int-to-float v4, v3

    div-float/2addr v4, v0

    add-int/lit8 v5, v3, 0x1

    int-to-float v6, v5

    div-float/2addr v6, v0

    sget-object v0, Lcom/daaw/k91;->A:[F

    aget v3, v0, v3

    aget v0, v0, v5

    sub-float/2addr v1, v4

    sub-float/2addr v6, v4

    div-float/2addr v1, v6

    sub-float/2addr v0, v3

    mul-float v1, v1, v0

    add-float/2addr v3, v1

    iget v0, p0, Lcom/daaw/k91;->b:I

    iget v1, p0, Lcom/daaw/k91;->d:I

    sub-int/2addr v1, v0

    int-to-float v1, v1

    mul-float v1, v1, v3

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/k91;->j:I

    iget v1, p0, Lcom/daaw/k91;->g:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/daaw/k91;->j:I

    iget v1, p0, Lcom/daaw/k91;->f:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/daaw/k91;->j:I

    iget v0, p0, Lcom/daaw/k91;->c:I

    iget v1, p0, Lcom/daaw/k91;->e:I

    sub-int/2addr v1, v0

    int-to-float v1, v1

    mul-float v3, v3, v1

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/k91;->k:I

    iget v1, p0, Lcom/daaw/k91;->i:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/daaw/k91;->k:I

    iget v1, p0, Lcom/daaw/k91;->h:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/daaw/k91;->k:I

    iget v1, p0, Lcom/daaw/k91;->j:I

    iget v3, p0, Lcom/daaw/k91;->d:I

    if-ne v1, v3, :cond_5

    iget v1, p0, Lcom/daaw/k91;->e:I

    if-ne v0, v1, :cond_5

    goto :goto_1

    :cond_2
    int-to-float v0, v1

    iget v1, p0, Lcom/daaw/k91;->n:F

    mul-float v0, v0, v1

    iget-object v1, p0, Lcom/daaw/k91;->r:Landroid/view/animation/Interpolator;

    if-nez v1, :cond_3

    invoke-static {v0}, Lcom/daaw/k91;->o(F)F

    move-result v0

    goto :goto_0

    :cond_3
    invoke-interface {v1, v0}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v0

    :goto_0
    iget v1, p0, Lcom/daaw/k91;->b:I

    iget v3, p0, Lcom/daaw/k91;->o:F

    mul-float v3, v3, v0

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    add-int/2addr v1, v3

    iput v1, p0, Lcom/daaw/k91;->j:I

    iget v1, p0, Lcom/daaw/k91;->c:I

    iget v3, p0, Lcom/daaw/k91;->p:F

    mul-float v0, v0, v3

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    add-int/2addr v1, v0

    iput v1, p0, Lcom/daaw/k91;->k:I

    goto :goto_2

    :cond_4
    iget v0, p0, Lcom/daaw/k91;->d:I

    iput v0, p0, Lcom/daaw/k91;->j:I

    iget v0, p0, Lcom/daaw/k91;->e:I

    iput v0, p0, Lcom/daaw/k91;->k:I

    :goto_1
    iput-boolean v2, p0, Lcom/daaw/k91;->q:Z

    :cond_5
    :goto_2
    return v2
.end method

.method public c(IIIIIIII)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    iget-boolean v3, v0, Lcom/daaw/k91;->s:Z

    if-eqz v3, :cond_0

    iget-boolean v3, v0, Lcom/daaw/k91;->q:Z

    if-nez v3, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/k91;->e()F

    move-result v3

    iget v4, v0, Lcom/daaw/k91;->d:I

    iget v5, v0, Lcom/daaw/k91;->b:I

    sub-int/2addr v4, v5

    int-to-float v4, v4

    iget v5, v0, Lcom/daaw/k91;->e:I

    iget v6, v0, Lcom/daaw/k91;->c:I

    sub-int/2addr v5, v6

    int-to-float v5, v5

    mul-float v6, v4, v4

    mul-float v7, v5, v5

    add-float/2addr v6, v7

    float-to-double v6, v6

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    double-to-float v6, v6

    div-float/2addr v4, v6

    div-float/2addr v5, v6

    mul-float v4, v4, v3

    mul-float v5, v5, v3

    move/from16 v3, p3

    int-to-float v6, v3

    invoke-static {v6}, Ljava/lang/Math;->signum(F)F

    move-result v7

    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    move-result v8

    cmpl-float v7, v7, v8

    if-nez v7, :cond_1

    move/from16 v7, p4

    int-to-float v8, v7

    invoke-static {v8}, Ljava/lang/Math;->signum(F)F

    move-result v9

    invoke-static {v5}, Ljava/lang/Math;->signum(F)F

    move-result v10

    cmpl-float v9, v9, v10

    if-nez v9, :cond_2

    add-float/2addr v6, v4

    float-to-int v3, v6

    add-float/2addr v8, v5

    float-to-int v4, v8

    move v7, v4

    goto :goto_0

    :cond_0
    move/from16 v3, p3

    :cond_1
    move/from16 v7, p4

    :cond_2
    :goto_0
    const/4 v4, 0x1

    iput v4, v0, Lcom/daaw/k91;->a:I

    const/4 v4, 0x0

    iput-boolean v4, v0, Lcom/daaw/k91;->q:Z

    mul-int v4, v3, v3

    mul-int v5, v7, v7

    add-int/2addr v4, v5

    int-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    double-to-float v4, v4

    iput v4, v0, Lcom/daaw/k91;->t:F

    sget v5, Lcom/daaw/k91;->y:F

    mul-float v5, v5, v4

    sget v6, Lcom/daaw/k91;->x:F

    div-float/2addr v5, v6

    float-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Math;->log(D)D

    move-result-wide v5

    const-wide v8, 0x408f400000000000L    # 1000.0

    sget v10, Lcom/daaw/k91;->w:F

    float-to-double v10, v10

    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    invoke-static {v10, v11}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr v10, v12

    div-double v10, v5, v10

    invoke-static {v10, v11}, Ljava/lang/Math;->exp(D)D

    move-result-wide v10

    mul-double v10, v10, v8

    double-to-int v8, v10

    iput v8, v0, Lcom/daaw/k91;->m:I

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v8

    iput-wide v8, v0, Lcom/daaw/k91;->l:J

    iput v1, v0, Lcom/daaw/k91;->b:I

    iput v2, v0, Lcom/daaw/k91;->c:I

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v9, 0x0

    cmpl-float v10, v4, v9

    if-nez v10, :cond_3

    const/high16 v3, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_3
    int-to-float v3, v3

    div-float/2addr v3, v4

    :goto_1
    cmpl-float v9, v4, v9

    if-nez v9, :cond_4

    goto :goto_2

    :cond_4
    int-to-float v7, v7

    div-float v8, v7, v4

    :goto_2
    sget v4, Lcom/daaw/k91;->x:F

    float-to-double v9, v4

    sget v4, Lcom/daaw/k91;->w:F

    float-to-double v14, v4

    move/from16 p3, v8

    float-to-double v7, v4

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr v7, v12

    invoke-static {v14, v15}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v14, v7

    mul-double v14, v14, v5

    invoke-static {v14, v15}, Ljava/lang/Math;->exp(D)D

    move-result-wide v4

    invoke-static {v9, v10}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v9, v9, v4

    double-to-int v4, v9

    move/from16 v5, p5

    iput v5, v0, Lcom/daaw/k91;->f:I

    move/from16 v5, p6

    iput v5, v0, Lcom/daaw/k91;->g:I

    move/from16 v5, p7

    iput v5, v0, Lcom/daaw/k91;->h:I

    move/from16 v5, p8

    iput v5, v0, Lcom/daaw/k91;->i:I

    int-to-float v4, v4

    mul-float v3, v3, v4

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    add-int/2addr v1, v3

    iput v1, v0, Lcom/daaw/k91;->d:I

    iget v3, v0, Lcom/daaw/k91;->g:I

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, v0, Lcom/daaw/k91;->d:I

    iget v3, v0, Lcom/daaw/k91;->f:I

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Lcom/daaw/k91;->d:I

    mul-float v4, v4, p3

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v1

    add-int/2addr v1, v2

    iput v1, v0, Lcom/daaw/k91;->e:I

    iget v2, v0, Lcom/daaw/k91;->i:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, v0, Lcom/daaw/k91;->e:I

    iget v2, v0, Lcom/daaw/k91;->h:I

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Lcom/daaw/k91;->e:I

    return-void
.end method

.method public final d(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/k91;->q:Z

    return-void
.end method

.method public e()F
    .locals 3

    iget v0, p0, Lcom/daaw/k91;->t:F

    iget v1, p0, Lcom/daaw/k91;->u:F

    invoke-virtual {p0}, Lcom/daaw/k91;->n()I

    move-result v2

    int-to-float v2, v2

    mul-float v1, v1, v2

    const/high16 v2, 0x44fa0000    # 2000.0f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lcom/daaw/k91;->j:I

    return v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Lcom/daaw/k91;->k:I

    return v0
.end method

.method public final h()I
    .locals 1

    iget v0, p0, Lcom/daaw/k91;->d:I

    return v0
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Lcom/daaw/k91;->e:I

    return v0
.end method

.method public final j()I
    .locals 1

    iget v0, p0, Lcom/daaw/k91;->b:I

    return v0
.end method

.method public final k()I
    .locals 1

    iget v0, p0, Lcom/daaw/k91;->c:I

    return v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/k91;->q:Z

    return v0
.end method

.method public m(IIIII)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/k91;->a:I

    iput-boolean v0, p0, Lcom/daaw/k91;->q:Z

    iput p5, p0, Lcom/daaw/k91;->m:I

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/k91;->l:J

    iput p1, p0, Lcom/daaw/k91;->b:I

    iput p2, p0, Lcom/daaw/k91;->c:I

    add-int/2addr p1, p3

    iput p1, p0, Lcom/daaw/k91;->d:I

    add-int/2addr p2, p4

    iput p2, p0, Lcom/daaw/k91;->e:I

    int-to-float p1, p3

    iput p1, p0, Lcom/daaw/k91;->o:F

    int-to-float p1, p4

    iput p1, p0, Lcom/daaw/k91;->p:F

    iget p1, p0, Lcom/daaw/k91;->m:I

    int-to-float p1, p1

    const/high16 p2, 0x3f800000    # 1.0f

    div-float/2addr p2, p1

    iput p2, p0, Lcom/daaw/k91;->n:F

    return-void
.end method

.method public n()I
    .locals 4

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/k91;->l:J

    sub-long/2addr v0, v2

    long-to-int v1, v0

    return v1
.end method
