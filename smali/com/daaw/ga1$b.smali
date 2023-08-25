.class public Lcom/daaw/ga1$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zc0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ga1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public A:I

.field public B:F

.field public C:F

.field public D:F

.field public E:F

.field public F:F

.field public G:[I

.field public H:[F

.field public I:F

.field public J:I

.field public K:F

.field public L:F

.field public M:F

.field public N:Z

.field public O:[F

.field public P:F

.field public Q:F

.field public R:F

.field public S:Lcom/daaw/c31;

.field public T:Lcom/daaw/zc1;

.field public U:[D

.field public V:I

.field public W:Lcom/daaw/f00;

.field public X:Lcom/daaw/ie0;

.field public a:I

.field public b:I

.field public c:[D

.field public d:[F

.field public e:[F

.field public f:[F

.field public g:F

.field public h:F

.field public i:I

.field public j:I

.field public k:F

.field public l:I

.field public m:[F

.field public n:[F

.field public o:[F

.field public p:[F

.field public q:[F

.field public r:F

.field public s:Z

.field public t:I

.field public u:F

.field public v:F

.field public final w:F

.field public final x:F

.field public final y:F

.field public z:F


# direct methods
.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    iput v0, p0, Lcom/daaw/ga1$b;->a:I

    const/16 v0, 0x400

    iput v0, p0, Lcom/daaw/ga1$b;->b:I

    const/4 v0, 0x1

    new-array v1, v0, [D

    iput-object v1, p0, Lcom/daaw/ga1$b;->c:[D

    new-array v1, v0, [F

    iput-object v1, p0, Lcom/daaw/ga1$b;->d:[F

    new-array v1, v0, [F

    iput-object v1, p0, Lcom/daaw/ga1$b;->e:[F

    const/4 v1, 0x2

    new-array v2, v1, [F

    iput-object v2, p0, Lcom/daaw/ga1$b;->f:[F

    const/4 v2, 0x0

    iput v2, p0, Lcom/daaw/ga1$b;->i:I

    iput v2, p0, Lcom/daaw/ga1$b;->j:I

    const/4 v3, 0x0

    iput v3, p0, Lcom/daaw/ga1$b;->k:F

    const/16 v4, 0x40

    iput v4, p0, Lcom/daaw/ga1$b;->l:I

    new-array v5, v0, [F

    iput-object v5, p0, Lcom/daaw/ga1$b;->m:[F

    new-array v5, v0, [F

    iput-object v5, p0, Lcom/daaw/ga1$b;->n:[F

    new-array v5, v0, [F

    iput-object v5, p0, Lcom/daaw/ga1$b;->o:[F

    new-array v5, v0, [F

    iput-object v5, p0, Lcom/daaw/ga1$b;->p:[F

    new-array v5, v0, [F

    iput-object v5, p0, Lcom/daaw/ga1$b;->q:[F

    iput v3, p0, Lcom/daaw/ga1$b;->r:F

    iput-boolean v2, p0, Lcom/daaw/ga1$b;->s:Z

    iput v0, p0, Lcom/daaw/ga1$b;->t:I

    const v5, 0x3f4ccccd    # 0.8f

    iput v5, p0, Lcom/daaw/ga1$b;->u:F

    const/high16 v5, 0x3f800000    # 1.0f

    iput v5, p0, Lcom/daaw/ga1$b;->v:F

    const/high16 v6, 0x43960000    # 300.0f

    iput v6, p0, Lcom/daaw/ga1$b;->w:F

    const v6, 0x3f666666    # 0.9f

    iput v6, p0, Lcom/daaw/ga1$b;->x:F

    const v6, 0x3c23d70a    # 0.01f

    iput v6, p0, Lcom/daaw/ga1$b;->y:F

    const v6, 0x3ecccccd    # 0.4f

    iput v6, p0, Lcom/daaw/ga1$b;->z:F

    const/4 v6, 0x4

    iput v6, p0, Lcom/daaw/ga1$b;->A:I

    iput v3, p0, Lcom/daaw/ga1$b;->B:F

    const/high16 v6, 0x447a0000    # 1000.0f

    iput v6, p0, Lcom/daaw/ga1$b;->C:F

    iput v3, p0, Lcom/daaw/ga1$b;->D:F

    iput v5, p0, Lcom/daaw/ga1$b;->E:F

    iput v3, p0, Lcom/daaw/ga1$b;->F:F

    new-array v6, v2, [I

    iput-object v6, p0, Lcom/daaw/ga1$b;->G:[I

    new-array v6, v2, [F

    iput-object v6, p0, Lcom/daaw/ga1$b;->H:[F

    iput v5, p0, Lcom/daaw/ga1$b;->I:F

    iput v1, p0, Lcom/daaw/ga1$b;->J:I

    iput v3, p0, Lcom/daaw/ga1$b;->K:F

    const v1, 0x3e4ccccd    # 0.2f

    iput v1, p0, Lcom/daaw/ga1$b;->L:F

    iput v5, p0, Lcom/daaw/ga1$b;->M:F

    iput-boolean v0, p0, Lcom/daaw/ga1$b;->N:Z

    new-array v6, v2, [F

    iput-object v6, p0, Lcom/daaw/ga1$b;->O:[F

    const/high16 v6, 0x3f000000    # 0.5f

    iput v6, p0, Lcom/daaw/ga1$b;->P:F

    iput v3, p0, Lcom/daaw/ga1$b;->Q:F

    iput v3, p0, Lcom/daaw/ga1$b;->R:F

    new-instance v7, Lcom/daaw/c31;

    invoke-direct {v7, v6}, Lcom/daaw/c31;-><init>(F)V

    iput-object v7, p0, Lcom/daaw/ga1$b;->S:Lcom/daaw/c31;

    new-instance v6, Lcom/daaw/zc1;

    invoke-direct {v6}, Lcom/daaw/zc1;-><init>()V

    invoke-virtual {v6, v0, v5}, Lcom/daaw/zc1;->a(IF)Lcom/daaw/zc1;

    move-result-object v6

    iput-object v6, p0, Lcom/daaw/ga1$b;->T:Lcom/daaw/zc1;

    new-array v6, v2, [D

    iput-object v6, p0, Lcom/daaw/ga1$b;->U:[D

    iput v2, p0, Lcom/daaw/ga1$b;->V:I

    new-instance v6, Lcom/daaw/ql0;

    invoke-direct {v6}, Lcom/daaw/ql0;-><init>()V

    iput-object v6, p0, Lcom/daaw/ga1$b;->W:Lcom/daaw/f00;

    new-instance v6, Lcom/daaw/ga1$b$a;

    invoke-direct {v6, p0}, Lcom/daaw/ga1$b$a;-><init>(Lcom/daaw/ga1$b;)V

    iput-object v6, p0, Lcom/daaw/ga1$b;->X:Lcom/daaw/ie0;

    const v6, 0x3d75c28f    # 0.06f

    invoke-virtual {p0, v4, v6, v2}, Lcom/daaw/ga1$b;->D(IFI)V

    invoke-virtual {p0, v0}, Lcom/daaw/ga1$b;->z(I)V

    const/16 v2, 0xb

    invoke-virtual {p0, v2}, Lcom/daaw/ga1$b;->B(I)V

    const v2, 0x3f333333    # 0.7f

    const/high16 v4, 0x420c0000    # 35.0f

    invoke-virtual {p0, v3, v1, v2, v4}, Lcom/daaw/ga1$b;->w(FFFF)V

    invoke-virtual {p0, v0, v5}, Lcom/daaw/ga1$b;->y(IF)V

    return-void
.end method

.method public static synthetic c(Lcom/daaw/ga1$b;FLcom/daaw/sg0;)[F
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/ga1$b;->t(FLcom/daaw/sg0;)[F

    move-result-object p0

    return-object p0
.end method

.method public static s(DDII)D
    .locals 2

    div-double/2addr p2, p0

    int-to-double v0, p4

    add-int/lit8 p5, p5, -0x1

    int-to-double p4, p5

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {p4, p5}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, p4

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p2

    mul-double p0, p0, p2

    return-wide p0
.end method


# virtual methods
.method public final declared-synchronized A(F)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput p1, p0, Lcom/daaw/ga1$b;->M:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final B(I)V
    .locals 1

    iput p1, p0, Lcom/daaw/ga1$b;->a:I

    const/4 v0, 0x1

    shl-int p1, v0, p1

    const/16 v0, 0x20

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    const/16 v0, 0x2000

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lcom/daaw/ga1$b;->b:I

    return-void
.end method

.method public final declared-synchronized C(IFFZIFIIF)V
    .locals 11

    move-object v10, p0

    monitor-enter p0

    const v0, 0x3dcccccd    # 0.1f

    move v1, p2

    :try_start_0
    invoke-static {p2, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, v10, Lcom/daaw/ga1$b;->g:F

    move v0, p3

    iput v0, v10, Lcom/daaw/ga1$b;->h:F

    const/16 v1, 0x2710

    move v2, p1

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v2, 0x1

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v10, Lcom/daaw/ga1$b;->l:I

    move v5, p4

    iput-boolean v5, v10, Lcom/daaw/ga1$b;->s:Z

    move/from16 v1, p5

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v10, Lcom/daaw/ga1$b;->t:I

    move/from16 v6, p6

    iput v6, v10, Lcom/daaw/ga1$b;->K:F

    iget v2, v10, Lcom/daaw/ga1$b;->l:I

    new-array v1, v2, [F

    iput-object v1, v10, Lcom/daaw/ga1$b;->o:[F

    new-array v1, v2, [F

    iput-object v1, v10, Lcom/daaw/ga1$b;->p:[F

    move/from16 v7, p7

    iput v7, v10, Lcom/daaw/ga1$b;->i:I

    move/from16 v8, p8

    iput v8, v10, Lcom/daaw/ga1$b;->j:I

    move/from16 v9, p9

    iput v9, v10, Lcom/daaw/ga1$b;->k:F

    iget v3, v10, Lcom/daaw/ga1$b;->g:F

    move-object v1, p0

    move v4, p3

    move v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-virtual/range {v1 .. v9}, Lcom/daaw/ga1$b;->G(IFFZFIIF)V

    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/daaw/ga1$b;->v(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final D(IFI)V
    .locals 10

    const/high16 v2, 0x41a00000    # 20.0f

    const v3, 0x468ca000    # 18000.0f

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v9, 0x0

    move-object v0, p0

    move v1, p1

    move v6, p2

    move v7, p3

    move v8, p3

    invoke-virtual/range {v0 .. v9}, Lcom/daaw/ga1$b;->C(IFFZIFIIF)V

    return-void
.end method

.method public final declared-synchronized E(F)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput p1, p0, Lcom/daaw/ga1$b;->u:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized F(F)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput p1, p0, Lcom/daaw/ga1$b;->v:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final G(IFFZFIIF)V
    .locals 23

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    const/4 v4, 0x0

    move/from16 v5, p6

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    move/from16 v6, p7

    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    const/4 v7, 0x1

    if-eqz p4, :cond_0

    if-le v1, v7, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    if-eqz v8, :cond_1

    div-int/lit8 v9, v1, 0x2

    goto :goto_1

    :cond_1
    move v9, v1

    :goto_1
    if-eqz v8, :cond_2

    div-int/lit8 v8, v1, 0x2

    goto :goto_2

    :cond_2
    move v8, v1

    :goto_2
    sub-int/2addr v8, v5

    sub-int/2addr v8, v6

    iget v10, v0, Lcom/daaw/ga1$b;->t:I

    div-int v10, v8, v10

    invoke-static {v10, v7}, Ljava/lang/Math;->max(II)I

    move-result v10

    const/4 v11, 0x0

    :goto_3
    const/16 v17, 0x0

    if-ge v11, v1, :cond_3

    iget-object v12, v0, Lcom/daaw/ga1$b;->o:[F

    aput v17, v12, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_3
    const v11, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v18, 0x7f7fffff    # Float.MAX_VALUE

    const/16 v19, 0x0

    :goto_4
    if-ge v15, v8, :cond_6

    int-to-float v11, v8

    mul-float v11, v11, p8

    float-to-int v11, v11

    sub-int v11, v15, v11

    add-int/2addr v11, v8

    rem-int/2addr v11, v10

    iget-object v12, v0, Lcom/daaw/ga1$b;->o:[F

    add-int v20, v15, v5

    move/from16 p4, v8

    float-to-double v7, v2

    move/from16 v21, v5

    float-to-double v4, v3

    move/from16 p7, v11

    move-object/from16 v22, v12

    move-wide v11, v7

    move v7, v13

    move v8, v14

    move-wide v13, v4

    move v4, v15

    move/from16 v15, p7

    move/from16 v16, v10

    invoke-static/range {v11 .. v16}, Lcom/daaw/ga1$b;->s(DDII)D

    move-result-wide v11

    double-to-float v5, v11

    aput v5, v22, v20

    int-to-float v5, v10

    const/high16 v11, 0x3f800000    # 1.0f

    div-float v5, v11, v5

    sub-float v12, v3, v2

    move/from16 v13, p7

    int-to-float v13, v13

    mul-float v13, v13, v5

    mul-float v12, v12, v13

    add-float v5, v2, v12

    iget-object v12, v0, Lcom/daaw/ga1$b;->o:[F

    aget v13, v12, v20

    sub-float v11, v11, p5

    mul-float v13, v13, v11

    mul-float v5, v5, p5

    add-float/2addr v13, v5

    aput v13, v12, v20

    aget v5, v12, v20

    cmpl-float v5, v18, v5

    if-lez v5, :cond_4

    aget v5, v12, v20

    move/from16 v18, v5

    move/from16 v13, v20

    goto :goto_5

    :cond_4
    move v13, v7

    :goto_5
    aget v5, v12, v20

    cmpg-float v5, v19, v5

    if-gez v5, :cond_5

    aget v19, v12, v20

    move/from16 v14, v20

    goto :goto_6

    :cond_5
    move v14, v8

    :goto_6
    add-int/lit8 v15, v4, 0x1

    move/from16 v8, p4

    move/from16 v5, v21

    const/4 v4, 0x0

    const/4 v7, 0x1

    goto :goto_4

    :cond_6
    move/from16 v21, v5

    move/from16 p4, v8

    move v7, v13

    move v8, v14

    const/4 v2, 0x0

    :goto_7
    if-ge v2, v1, :cond_c

    move/from16 v3, v21

    if-le v2, v3, :cond_7

    if-eq v2, v7, :cond_7

    iget-object v4, v0, Lcom/daaw/ga1$b;->o:[F

    add-int/lit8 v5, v2, -0x1

    add-int/2addr v5, v1

    rem-int/2addr v5, v1

    aget v4, v4, v5

    goto :goto_8

    :cond_7
    iget-object v4, v0, Lcom/daaw/ga1$b;->o:[F

    aget v4, v4, v2

    :goto_8
    sub-int v5, p4, v6

    const/4 v10, 0x1

    sub-int/2addr v5, v10

    if-ge v2, v5, :cond_8

    if-eq v2, v8, :cond_8

    iget-object v5, v0, Lcom/daaw/ga1$b;->o:[F

    add-int/lit8 v10, v2, 0x1

    rem-int/2addr v10, v1

    aget v5, v5, v10

    goto :goto_9

    :cond_8
    iget-object v5, v0, Lcom/daaw/ga1$b;->o:[F

    aget v5, v5, v2

    :goto_9
    iget-object v10, v0, Lcom/daaw/ga1$b;->p:[F

    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    move-result v11

    aput v11, v10, v2

    cmpg-float v10, v4, v17

    if-gez v10, :cond_a

    cmpg-float v4, v5, v17

    if-gez v4, :cond_9

    iget-object v4, v0, Lcom/daaw/ga1$b;->p:[F

    aput v17, v4, v2

    goto :goto_a

    :cond_9
    iget-object v4, v0, Lcom/daaw/ga1$b;->p:[F

    aput v5, v4, v2

    goto :goto_a

    :cond_a
    cmpg-float v5, v4, v17

    if-gez v5, :cond_b

    iget-object v4, v0, Lcom/daaw/ga1$b;->p:[F

    aput v17, v4, v2

    goto :goto_a

    :cond_b
    iget-object v5, v0, Lcom/daaw/ga1$b;->p:[F

    aput v4, v5, v2

    :goto_a
    add-int/lit8 v2, v2, 0x1

    move/from16 v21, v3

    goto :goto_7

    :cond_c
    const/4 v4, 0x0

    :goto_b
    if-ge v4, v1, :cond_f

    iget-object v2, v0, Lcom/daaw/ga1$b;->o:[F

    aget v3, v2, v4

    cmpg-float v3, v3, v17

    if-gez v3, :cond_d

    aput v17, v2, v4

    :cond_d
    iget-object v2, v0, Lcom/daaw/ga1$b;->p:[F

    aget v3, v2, v4

    cmpg-float v3, v3, v17

    if-gez v3, :cond_e

    aput v17, v2, v4

    :cond_e
    add-int/lit8 v4, v4, 0x1

    goto :goto_b

    :cond_f
    const/4 v10, 0x1

    sub-int/2addr v1, v10

    move v3, v1

    const/4 v2, 0x1

    :goto_c
    if-lt v3, v9, :cond_10

    iget-object v4, v0, Lcom/daaw/ga1$b;->o:[F

    aget v5, v4, v2

    aput v5, v4, v3

    iget-object v4, v0, Lcom/daaw/ga1$b;->p:[F

    aget v5, v4, v2

    aput v5, v4, v3

    add-int/2addr v2, v10

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    add-int/lit8 v3, v3, -0x1

    goto :goto_c

    :cond_10
    return-void
.end method

.method public final H([F)V
    .locals 6

    iget v0, p0, Lcom/daaw/ga1$b;->D:F

    const v1, 0x3dccccd0    # 0.100000024f

    mul-float v0, v0, v1

    const/4 v2, 0x0

    aget v2, p1, v2

    const v3, 0x3f666666    # 0.9f

    mul-float v2, v2, v3

    add-float/2addr v0, v2

    iput v0, p0, Lcom/daaw/ga1$b;->D:F

    const/4 v2, 0x1

    aget v4, p1, v2

    iget v5, p0, Lcom/daaw/ga1$b;->C:F

    cmpl-float v4, v4, v5

    if-lez v4, :cond_0

    mul-float v5, v5, v1

    aget p1, p1, v2

    mul-float p1, p1, v3

    goto :goto_0

    :cond_0
    const v1, 0x3f7d70a4    # 0.99f

    mul-float v5, v5, v1

    aget p1, p1, v2

    const v1, 0x3c23d70a    # 0.01f

    mul-float p1, p1, v1

    :goto_0
    add-float/2addr v5, p1

    iput v5, p0, Lcom/daaw/ga1$b;->C:F

    iget p1, p0, Lcom/daaw/ga1$b;->C:F

    sub-float/2addr p1, v0

    iput p1, p0, Lcom/daaw/ga1$b;->E:F

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float p1, p1, v0

    if-gez p1, :cond_1

    iput v0, p0, Lcom/daaw/ga1$b;->E:F

    :cond_1
    const/high16 p1, 0x43960000    # 300.0f

    iget v0, p0, Lcom/daaw/ga1$b;->E:F

    div-float/2addr p1, v0

    iput p1, p0, Lcom/daaw/ga1$b;->E:F

    return-void
.end method

.method public declared-synchronized a(Lcom/daaw/un;)V
    .locals 13

    monitor-enter p0

    :try_start_0
    const-string v0, "fftSize"

    const/16 v1, 0xb

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/ga1$b;->B(I)V

    const-string v0, "sampleOutCount"

    const/16 v1, 0x80

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v3

    const-string v0, "lowerHz"

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v4

    const-string v0, "higherHz"

    const v1, 0x468ca000    # 18000.0f

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v5

    const-string v0, "mirrorSamples"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v6

    const-string v0, "repeatSamples"

    const/4 v12, 0x1

    invoke-virtual {p1, v0, v12}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v7

    const-string v0, "hzLinearFactor"

    const v2, 0x3d75c28f    # 0.06f

    invoke-virtual {p1, v0, v2}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v8

    const-string v0, "starAndEndGap"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v9

    const-string v0, "starAndEndGap"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v10

    const-string v0, "freqShift"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v11

    move-object v2, p0

    invoke-virtual/range {v2 .. v11}, Lcom/daaw/ga1$b;->C(IFFZIFIIF)V

    const-string v0, "smooth"

    const v2, 0x3f4ccccd    # 0.8f

    invoke-virtual {p1, v0, v2}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/ga1$b;->E(F)V

    const-string v0, "preSmooth"

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0, v2}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/ga1$b;->F(F)V

    const-string v0, "filterRadius"

    invoke-virtual {p1, v0, v12}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v0

    const-string v3, "filterStrength"

    invoke-virtual {p1, v3, v2}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v3

    invoke-virtual {p0, v0, v3}, Lcom/daaw/ga1$b;->y(IF)V

    const-string v0, "beatSmooth"

    const v3, 0x3ecccccd    # 0.4f

    invoke-virtual {p1, v0, v3}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/ga1$b;->x(F)V

    const-string v0, "beatRangeBarFirst"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    const-string v1, "beatRangeBarLast"

    const v3, 0x3e4ccccd    # 0.2f

    invoke-virtual {p1, v1, v3}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v1

    const-string v4, "beatRangeValueLower"

    const v5, 0x3f333333    # 0.7f

    invoke-virtual {p1, v4, v5}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v4

    const-string v5, "beatRangeValueHigher"

    const/high16 v6, 0x420c0000    # 35.0f

    invoke-virtual {p1, v5, v6}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v5

    invoke-virtual {p0, v0, v1, v4, v5}, Lcom/daaw/ga1$b;->w(FFFF)V

    const-string v0, "aWeight"

    invoke-virtual {p1, v0, v3}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/ga1$b;->u(F)V

    const-string v0, "outputMultiplier"

    invoke-virtual {p1, v0, v2}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/ga1$b;->A(F)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final j([FFZLcom/daaw/ie0;I[F[FZ)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p5

    array-length v3, v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x4

    if-ge v3, v6, :cond_1

    :goto_0
    array-length v2, v1

    if-ge v5, v2, :cond_0

    aput v4, v1, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    const v3, 0x4b189676    # 9999990.0f

    aput v3, p6, v5

    const v3, -0x34e7698a    # -9999990.0f

    const/4 v6, 0x1

    aput v3, p6, v6

    iget-object v3, v0, Lcom/daaw/ga1$b;->c:[D

    array-length v3, v3

    invoke-interface/range {p4 .. p4}, Lcom/daaw/ie0;->size()I

    move-result v6

    if-eq v3, v6, :cond_2

    invoke-interface/range {p4 .. p4}, Lcom/daaw/ie0;->size()I

    move-result v3

    new-array v3, v3, [D

    iput-object v3, v0, Lcom/daaw/ga1$b;->c:[D

    invoke-interface/range {p4 .. p4}, Lcom/daaw/ie0;->size()I

    move-result v3

    new-array v3, v3, [F

    iput-object v3, v0, Lcom/daaw/ga1$b;->d:[F

    const/4 v3, 0x0

    :goto_1
    iget-object v6, v0, Lcom/daaw/ga1$b;->d:[F

    array-length v7, v6

    if-ge v3, v7, :cond_2

    aput v4, v6, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_2
    iget-object v6, v0, Lcom/daaw/ga1$b;->c:[D

    array-length v6, v6

    if-ge v3, v6, :cond_4

    iget-object v6, v0, Lcom/daaw/ga1$b;->T:Lcom/daaw/zc1;

    move-object/from16 v7, p4

    invoke-virtual {v6, v3, v7}, Lcom/daaw/zc1;->c(ILcom/daaw/ie0;)D

    move-result-wide v8

    double-to-float v6, v8

    invoke-static {v6, v4}, Ljava/lang/Math;->max(FF)F

    move-result v6

    iget v8, v0, Lcom/daaw/ga1$b;->L:F

    const/high16 v9, 0x3f800000    # 1.0f

    cmpl-float v8, v8, v4

    if-lez v8, :cond_3

    int-to-double v10, v3

    iget-object v8, v0, Lcom/daaw/ga1$b;->c:[D

    array-length v8, v8

    int-to-double v12, v8

    int-to-double v14, v2

    invoke-static/range {v10 .. v15}, Lcom/daaw/av;->b(DDD)D

    move-result-wide v10

    invoke-static {v10, v11}, Lcom/daaw/av;->c(D)D

    move-result-wide v10

    double-to-float v8, v10

    iget v10, v0, Lcom/daaw/ga1$b;->L:F

    sub-float v11, v9, v10

    mul-float v10, v10, v8

    mul-float v10, v10, v8

    mul-float v10, v10, v8

    add-float/2addr v11, v10

    mul-float v6, v6, v11

    :cond_3
    iget-object v8, v0, Lcom/daaw/ga1$b;->c:[D

    aget-wide v10, v8, v3

    iget v12, v0, Lcom/daaw/ga1$b;->v:F

    sub-float/2addr v9, v12

    float-to-double v13, v9

    invoke-static {v13, v14}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v10, v10, v13

    mul-float v6, v6, v12

    float-to-double v12, v6

    invoke-static {v12, v13}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v10, v12

    aput-wide v10, v8, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_4
    move-object/from16 v7, p4

    invoke-interface/range {p4 .. p4}, Lcom/daaw/ie0;->size()I

    move-result v3

    if-eqz p8, :cond_5

    mul-int/lit8 v3, v3, 0x2

    :cond_5
    int-to-float v2, v2

    int-to-float v3, v3

    div-float/2addr v2, v3

    aput v4, v1, v5

    :goto_3
    array-length v3, v1

    if-ge v5, v3, :cond_7

    iget-object v3, v0, Lcom/daaw/ga1$b;->o:[F

    aget v3, v3, v5

    iget-object v6, v0, Lcom/daaw/ga1$b;->p:[F

    aget v6, v6, v5

    sub-float/2addr v3, v6

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    const/high16 v6, 0x42480000    # 50.0f

    div-float/2addr v3, v6

    const v6, 0x3f333333    # 0.7f

    const v7, 0x3e99999a    # 0.3f

    mul-float v3, v3, v7

    add-float/2addr v3, v6

    iget-object v6, v0, Lcom/daaw/ga1$b;->o:[F

    aget v6, v6, v5

    div-float/2addr v6, v2

    float-to-int v6, v6

    iget-object v7, v0, Lcom/daaw/ga1$b;->p:[F

    aget v7, v7, v5

    div-float/2addr v7, v2

    float-to-int v7, v7

    aput v4, v1, v5

    iget-object v8, v0, Lcom/daaw/ga1$b;->c:[D

    array-length v8, v8

    invoke-static {v6, v8}, Ljava/lang/Math;->min(II)I

    move-result v6

    move v8, v7

    :goto_4
    if-ge v8, v6, :cond_6

    aget v9, v1, v5

    iget-object v10, v0, Lcom/daaw/ga1$b;->c:[D

    aget-wide v11, v10, v8

    double-to-float v10, v11

    sub-int v11, v6, v7

    int-to-float v11, v11

    div-float/2addr v10, v11

    add-float/2addr v9, v10

    aput v9, v1, v5

    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_6
    aget v6, v1, v5

    mul-float v3, v3, p2

    mul-float v6, v6, v3

    aput v6, v1, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_7
    return-void
.end method

.method public declared-synchronized o(Lcom/daaw/un;)V
    .locals 13

    monitor-enter p0

    :try_start_0
    const-string v2, "fftSize"

    iget v3, p0, Lcom/daaw/ga1$b;->a:I

    const-string v4, "Performance"

    const/4 v5, 0x7

    const/16 v6, 0xd

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/un;->W(Ljava/lang/String;ILjava/lang/String;II)V

    const-string v8, "sampleOutCount"

    iget v9, p0, Lcom/daaw/ga1$b;->l:I

    const-string v10, "1_spectrum"

    const/4 v11, 0x0

    const/16 v12, 0x200

    move-object v7, p1

    invoke-virtual/range {v7 .. v12}, Lcom/daaw/un;->W(Ljava/lang/String;ILjava/lang/String;II)V

    const-string v2, "lowerHz"

    iget v3, p0, Lcom/daaw/ga1$b;->g:F

    const-string v4, "1_spectrumHz"

    const/4 v5, 0x0

    const/high16 v6, 0x43960000    # 300.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v8, "higherHz"

    iget v9, p0, Lcom/daaw/ga1$b;->h:F

    const-string v10, "1_spectrumHz"

    const/high16 v11, 0x43960000    # 300.0f

    const v12, 0x468ca000    # 18000.0f

    move-object v7, p1

    invoke-virtual/range {v7 .. v12}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v2, "hzLinearFactor"

    iget v3, p0, Lcom/daaw/ga1$b;->K:F

    const-string v4, "1_spectrumHz"

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v8, "freqShift"

    iget v9, p0, Lcom/daaw/ga1$b;->k:F

    const-string v10, "1_spectrumHz"

    const/4 v11, 0x0

    const/high16 v12, 0x3f800000    # 1.0f

    move-object v7, p1

    invoke-virtual/range {v7 .. v12}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v0, "mirrorSamples"

    iget-boolean v1, p0, Lcom/daaw/ga1$b;->s:Z

    const-string v2, "1_spectrum"

    invoke-virtual {p1, v0, v1, v2}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    const-string v4, "repeatSamples"

    iget v5, p0, Lcom/daaw/ga1$b;->t:I

    const-string v6, "1_spectrum"

    const/4 v7, 0x1

    const/4 v8, 0x6

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/un;->W(Ljava/lang/String;ILjava/lang/String;II)V

    const-string v4, "starAndEndGap"

    iget v5, p0, Lcom/daaw/ga1$b;->i:I

    const-string v6, "1_spectrum"

    const/4 v7, 0x0

    const/16 v8, 0x1e

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/un;->W(Ljava/lang/String;ILjava/lang/String;II)V

    const-string v4, "smooth"

    iget v5, p0, Lcom/daaw/ga1$b;->u:F

    const-string v6, "1_spectrum"

    const v7, 0x3dcccccd    # 0.1f

    const/high16 v8, 0x3f800000    # 1.0f

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v4, "preSmooth"

    iget v5, p0, Lcom/daaw/ga1$b;->v:F

    const-string v6, "1_spectrum"

    const v7, 0x3dcccccd    # 0.1f

    const/high16 v8, 0x3f800000    # 1.0f

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v4, "filterRadius"

    iget-object v0, p0, Lcom/daaw/ga1$b;->T:Lcom/daaw/zc1;

    invoke-virtual {v0}, Lcom/daaw/zc1;->b()I

    move-result v5

    const-string v6, "1_spectrum"

    const/4 v7, 0x0

    const/16 v8, 0x14

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/un;->W(Ljava/lang/String;ILjava/lang/String;II)V

    const-string v4, "filterStrength"

    iget-object v0, p0, Lcom/daaw/ga1$b;->T:Lcom/daaw/zc1;

    invoke-virtual {v0}, Lcom/daaw/zc1;->d()F

    move-result v5

    const-string v6, "1_spectrum"

    const v7, 0x3dcccccd    # 0.1f

    const/high16 v8, 0x40000000    # 2.0f

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v4, "beatSmooth"

    iget v5, p0, Lcom/daaw/ga1$b;->z:F

    const-string v6, "beat"

    const v7, 0x3dcccccd    # 0.1f

    const/high16 v8, 0x3f800000    # 1.0f

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v4, "beatRangeBarFirst"

    iget-object v0, p0, Lcom/daaw/ga1$b;->S:Lcom/daaw/c31;

    invoke-virtual {v0}, Lcom/daaw/c31;->c()F

    move-result v5

    const-string v6, "beat"

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v4, "beatRangeBarLast"

    iget-object v0, p0, Lcom/daaw/ga1$b;->S:Lcom/daaw/c31;

    invoke-virtual {v0}, Lcom/daaw/c31;->d()F

    move-result v5

    const-string v6, "beat"

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v4, "beatRangeValueLower"

    iget-object v0, p0, Lcom/daaw/ga1$b;->S:Lcom/daaw/c31;

    invoke-virtual {v0}, Lcom/daaw/c31;->e()F

    move-result v5

    const-string v6, "beat"

    const/4 v7, 0x0

    const/high16 v8, 0x42480000    # 50.0f

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v4, "beatRangeValueHigher"

    iget-object v0, p0, Lcom/daaw/ga1$b;->S:Lcom/daaw/c31;

    invoke-virtual {v0}, Lcom/daaw/c31;->f()F

    move-result v5

    const-string v6, "beat"

    const/4 v7, 0x0

    const/high16 v8, 0x42c80000    # 100.0f

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v4, "aWeight"

    iget v5, p0, Lcom/daaw/ga1$b;->L:F

    const-string v6, "1_spectrum"

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v4, "outputMultiplier"

    iget v5, p0, Lcom/daaw/ga1$b;->M:F

    const-string v6, "1_spectrum"

    const v7, 0x3dcccccd    # 0.1f

    const/high16 v8, 0x40400000    # 3.0f

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized q()F
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/daaw/ga1$b;->r:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized r()F
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/daaw/ga1$b;->R:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized t(FLcom/daaw/sg0;)[F
    .locals 15

    move-object v10, p0

    monitor-enter p0

    :try_start_0
    invoke-interface/range {p2 .. p2}, Lcom/daaw/sg0;->b()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, v10, Lcom/daaw/ga1$b;->b:I

    :goto_0
    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Lcom/daaw/sg0;->j(I)Lcom/daaw/avee/comp/playback/a;

    move-result-object v0

    const v1, 0xac44

    const/4 v2, 0x4

    const/4 v11, 0x0

    const/4 v3, 0x1

    const/4 v12, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/a;->l()Lcom/daaw/ke0;

    move-result-object v4

    invoke-interface {v4}, Lcom/daaw/ke0;->size()I

    move-result v5

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/a;->a()Z

    move-result v6

    iget v7, v0, Lcom/daaw/avee/comp/playback/a;->f:I

    iget-object v8, v10, Lcom/daaw/ga1$b;->f:[F

    aput v11, v8, v12

    iget-short v0, v0, Lcom/daaw/avee/comp/playback/a;->e:S

    int-to-float v0, v0

    aput v0, v8, v3

    move v9, v6

    goto :goto_1

    :cond_1
    new-instance v4, Lcom/daaw/gd1;

    invoke-direct {v4, v12, v2}, Lcom/daaw/gd1;-><init>(SI)V

    iget-object v0, v10, Lcom/daaw/ga1$b;->f:[F

    aput v11, v0, v12

    const/high16 v5, 0x447a0000    # 1000.0f

    aput v5, v0, v3

    const/4 v5, 0x4

    const v7, 0xac44

    const/4 v9, 0x0

    :goto_1
    if-ge v5, v2, :cond_2

    new-instance v4, Lcom/daaw/gd1;

    invoke-direct {v4, v12, v2}, Lcom/daaw/gd1;-><init>(SI)V

    const v6, 0xac44

    goto :goto_2

    :cond_2
    move v2, v5

    move v6, v7

    :goto_2
    iget-object v0, v10, Lcom/daaw/ga1$b;->n:[F

    array-length v0, v0

    iget v1, v10, Lcom/daaw/ga1$b;->l:I

    if-eq v0, v1, :cond_3

    new-array v0, v1, [F

    iput-object v0, v10, Lcom/daaw/ga1$b;->n:[F

    :cond_3
    iget-object v0, v10, Lcom/daaw/ga1$b;->m:[F

    array-length v0, v0

    iget-object v1, v10, Lcom/daaw/ga1$b;->n:[F

    array-length v5, v1

    if-eq v0, v5, :cond_4

    array-length v0, v1

    new-array v0, v0, [F

    iput-object v0, v10, Lcom/daaw/ga1$b;->m:[F

    const/4 v0, 0x0

    :goto_3
    iget-object v1, v10, Lcom/daaw/ga1$b;->m:[F

    array-length v5, v1

    if-ge v0, v5, :cond_4

    aput v11, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_4
    iget-object v0, v10, Lcom/daaw/ga1$b;->O:[F

    array-length v0, v0

    if-eq v2, v0, :cond_5

    new-array v0, v2, [F

    iput-object v0, v10, Lcom/daaw/ga1$b;->O:[F

    const/4 v0, 0x0

    :goto_4
    if-ge v0, v2, :cond_5

    iget-object v1, v10, Lcom/daaw/ga1$b;->O:[F

    const/high16 v5, 0x3b800000    # 0.00390625f

    invoke-static {v0, v2}, Lcom/daaw/bv;->c(II)F

    move-result v7

    mul-float v7, v7, v5

    aput v7, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_5
    iget-object v0, v10, Lcom/daaw/ga1$b;->f:[F

    invoke-virtual {p0, v0}, Lcom/daaw/ga1$b;->H([F)V

    iget-object v0, v10, Lcom/daaw/ga1$b;->U:[D

    array-length v0, v0

    if-eq v0, v2, :cond_6

    new-array v0, v2, [D

    iput-object v0, v10, Lcom/daaw/ga1$b;->U:[D

    :cond_6
    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_5
    iget-object v5, v10, Lcom/daaw/ga1$b;->U:[D

    array-length v5, v5

    if-ge v0, v5, :cond_7

    invoke-interface {v4, v0}, Lcom/daaw/ke0;->get(I)S

    move-result v5

    int-to-float v5, v5

    iget-object v7, v10, Lcom/daaw/ga1$b;->O:[F

    aget v7, v7, v0

    mul-float v5, v5, v7

    iget v7, v10, Lcom/daaw/ga1$b;->E:F

    mul-float v5, v5, v7

    mul-float v7, v5, v5

    add-float/2addr v1, v7

    iget-object v7, v10, Lcom/daaw/ga1$b;->U:[D

    float-to-double v13, v5

    aput-wide v13, v7, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_7
    iget v0, v10, Lcom/daaw/ga1$b;->V:I

    if-eq v0, v2, :cond_8

    iput v2, v10, Lcom/daaw/ga1$b;->V:I

    iget-object v0, v10, Lcom/daaw/ga1$b;->W:Lcom/daaw/f00;

    invoke-virtual {v0, v2}, Lcom/daaw/f00;->a(I)V

    :cond_8
    iget-object v0, v10, Lcom/daaw/ga1$b;->W:Lcom/daaw/f00;

    iget-object v4, v10, Lcom/daaw/ga1$b;->U:[D

    invoke-virtual {v0, v4, v3}, Lcom/daaw/f00;->b([DZ)V

    if-lez v2, :cond_9

    int-to-float v0, v2

    div-float/2addr v1, v0

    float-to-double v0, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v1, v0

    :cond_9
    iput v1, v10, Lcom/daaw/ga1$b;->B:F

    const/4 v0, 0x2

    new-array v7, v0, [F

    iget-object v2, v10, Lcom/daaw/ga1$b;->n:[F

    iget v3, v10, Lcom/daaw/ga1$b;->M:F

    iget-boolean v4, v10, Lcom/daaw/ga1$b;->s:Z

    iget-object v5, v10, Lcom/daaw/ga1$b;->X:Lcom/daaw/ie0;

    iget-object v8, v10, Lcom/daaw/ga1$b;->q:[F

    move-object v1, p0

    invoke-virtual/range {v1 .. v9}, Lcom/daaw/ga1$b;->j([FFZLcom/daaw/ie0;I[F[FZ)V

    iget-object v0, v10, Lcom/daaw/ga1$b;->S:Lcom/daaw/c31;

    iget-object v1, v10, Lcom/daaw/ga1$b;->m:[F

    array-length v1, v1

    invoke-virtual {v0, v1}, Lcom/daaw/c31;->g(I)V

    iget-object v0, v10, Lcom/daaw/ga1$b;->n:[F

    array-length v0, v0

    iget-object v1, v10, Lcom/daaw/ga1$b;->m:[F

    array-length v1, v1

    invoke-static {v0, v1}, Lcom/daaw/q6;->a(II)V

    iput v11, v10, Lcom/daaw/ga1$b;->Q:F

    const v0, -0x39e3c000    # -10000.0f

    const/4 v1, 0x0

    :goto_6
    iget-object v2, v10, Lcom/daaw/ga1$b;->n:[F

    array-length v3, v2

    if-ge v1, v3, :cond_b

    aget v3, v2, v1

    cmpl-float v3, v3, v0

    if-lez v3, :cond_a

    aget v0, v2, v1

    int-to-float v3, v1

    iput v3, v10, Lcom/daaw/ga1$b;->Q:F

    :cond_a
    aget v2, v2, v1

    iget-object v3, v10, Lcom/daaw/ga1$b;->m:[F

    aget v4, v3, v1

    sub-float/2addr v2, v4

    aget v4, v3, v1

    const/high16 v5, 0x41a00000    # 20.0f

    mul-float v2, v2, v5

    mul-float v2, v2, p1

    iget v5, v10, Lcom/daaw/ga1$b;->u:F

    mul-float v2, v2, v5

    add-float/2addr v4, v2

    aput v4, v3, v1

    aget v2, v3, v1

    invoke-static {v2, v11}, Ljava/lang/Math;->max(FF)F

    move-result v2

    aput v2, v3, v1

    iget-object v2, v10, Lcom/daaw/ga1$b;->S:Lcom/daaw/c31;

    iget-object v3, v10, Lcom/daaw/ga1$b;->m:[F

    aget v3, v3, v1

    invoke-virtual {v2, v1, v3}, Lcom/daaw/c31;->a(IF)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_b
    iget-object v0, v10, Lcom/daaw/ga1$b;->q:[F

    iget-object v1, v10, Lcom/daaw/ga1$b;->S:Lcom/daaw/c31;

    invoke-virtual {v1}, Lcom/daaw/c31;->b()F

    move-result v1

    aput v1, v0, v12

    iget v0, v10, Lcom/daaw/ga1$b;->r:F

    iget v1, v10, Lcom/daaw/ga1$b;->z:F

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float v3, v2, v1

    mul-float v0, v0, v3

    iget-object v3, v10, Lcom/daaw/ga1$b;->q:[F

    aget v3, v3, v12

    mul-float v3, v3, v1

    add-float/2addr v0, v3

    iput v0, v10, Lcom/daaw/ga1$b;->r:F

    iget v0, v10, Lcom/daaw/ga1$b;->Q:F

    iget-object v1, v10, Lcom/daaw/ga1$b;->n:[F

    array-length v1, v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, v10, Lcom/daaw/ga1$b;->Q:F

    iget v1, v10, Lcom/daaw/ga1$b;->R:F

    iget v3, v10, Lcom/daaw/ga1$b;->P:F

    sub-float/2addr v2, v3

    mul-float v1, v1, v2

    mul-float v0, v0, v3

    add-float/2addr v1, v0

    iput v1, v10, Lcom/daaw/ga1$b;->R:F

    iget-object v0, v10, Lcom/daaw/ga1$b;->m:[F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    goto :goto_8

    :goto_7
    throw v0

    :goto_8
    goto :goto_7
.end method

.method public final declared-synchronized u(F)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput p1, p0, Lcom/daaw/ga1$b;->L:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized v(I)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput p1, p0, Lcom/daaw/ga1$b;->A:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized w(FFFF)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ga1$b;->S:Lcom/daaw/c31;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/c31;->h(FFFF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized x(F)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput p1, p0, Lcom/daaw/ga1$b;->z:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized y(IF)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ga1$b;->T:Lcom/daaw/zc1;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/zc1;->a(IF)Lcom/daaw/zc1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized z(I)V
    .locals 5

    monitor-enter p0

    const/4 v0, 0x1

    if-ge p1, v0, :cond_0

    const/4 p1, 0x1

    :cond_0
    add-int/lit8 v0, p1, 0x1

    add-int/2addr v0, p1

    :try_start_0
    new-array v0, v0, [I

    iput-object v0, p0, Lcom/daaw/ga1$b;->G:[I

    array-length v1, v0

    new-array v1, v1, [F

    iput-object v1, p0, Lcom/daaw/ga1$b;->H:[F

    array-length v0, v0

    int-to-float v0, v0

    iput v0, p0, Lcom/daaw/ga1$b;->I:F

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/ga1$b;->G:[I

    array-length v2, v1

    if-ge v0, v2, :cond_1

    sub-int v2, v0, p1

    aput v2, v1, v0

    iget-object v3, p0, Lcom/daaw/ga1$b;->H:[F

    array-length v4, v1

    add-int/lit8 v4, v4, 0x2

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v4, v2

    array-length v1, v1

    add-int/lit8 v1, v1, 0x2

    invoke-static {v4, v1}, Lcom/daaw/bv;->b(II)F

    move-result v1

    aput v1, v3, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method
