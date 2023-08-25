.class public Lcom/daaw/ha1$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zc0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ha1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/ha1$b$a;
    }
.end annotation


# instance fields
.field public A:F

.field public B:F

.field public C:F

.field public D:[I

.field public E:[F

.field public F:F

.field public G:I

.field public H:F

.field public I:F

.field public J:F

.field public K:Z

.field public L:[F

.field public M:F

.field public N:F

.field public O:F

.field public P:Lcom/daaw/c31;

.field public Q:Lcom/daaw/ad1;

.field public R:[D

.field public S:I

.field public T:[Lcom/daaw/pw0;

.field public U:[D

.field public V:Lcom/daaw/ie0;

.field public final W:Ljava/lang/Object;

.field public X:I

.field public final Y:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field public final Z:Ljava/util/concurrent/TimeUnit;

.field public a:I

.field public a0:Ljava/util/concurrent/ThreadPoolExecutor;

.field public b:Z

.field public b0:I

.field public c:[D

.field public final synthetic c0:Lcom/daaw/ha1;

.field public d:[F

.field public e:[F

.field public f:F

.field public g:F

.field public h:I

.field public i:I

.field public j:F

.field public k:I

.field public l:[F

.field public m:[F

.field public n:[F

.field public o:[F

.field public p:[F

.field public q:F

.field public r:Z

.field public s:I

.field public t:F

.field public final u:F

.field public final v:F

.field public final w:F

.field public x:F

.field public y:I

.field public z:F


# direct methods
.method public constructor <init>(Lcom/daaw/ha1;)V
    .locals 14

    iput-object p1, p0, Lcom/daaw/ha1$b;->c0:Lcom/daaw/ha1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x5a

    iput p1, p0, Lcom/daaw/ha1$b;->a:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/ha1$b;->b:Z

    const/4 v0, 0x1

    new-array v1, v0, [D

    iput-object v1, p0, Lcom/daaw/ha1$b;->c:[D

    new-array v1, v0, [F

    iput-object v1, p0, Lcom/daaw/ha1$b;->d:[F

    const/4 v1, 0x2

    new-array v2, v1, [F

    iput-object v2, p0, Lcom/daaw/ha1$b;->e:[F

    iput p1, p0, Lcom/daaw/ha1$b;->h:I

    iput p1, p0, Lcom/daaw/ha1$b;->i:I

    const/4 v2, 0x0

    iput v2, p0, Lcom/daaw/ha1$b;->j:F

    const/16 v3, 0x40

    iput v3, p0, Lcom/daaw/ha1$b;->k:I

    new-array v4, v0, [F

    iput-object v4, p0, Lcom/daaw/ha1$b;->l:[F

    new-array v4, v0, [F

    iput-object v4, p0, Lcom/daaw/ha1$b;->m:[F

    new-array v4, v0, [F

    iput-object v4, p0, Lcom/daaw/ha1$b;->n:[F

    new-array v4, v0, [F

    iput-object v4, p0, Lcom/daaw/ha1$b;->o:[F

    new-array v4, v0, [F

    iput-object v4, p0, Lcom/daaw/ha1$b;->p:[F

    iput v2, p0, Lcom/daaw/ha1$b;->q:F

    iput-boolean p1, p0, Lcom/daaw/ha1$b;->r:Z

    iput v0, p0, Lcom/daaw/ha1$b;->s:I

    const/high16 v4, 0x3f800000    # 1.0f

    iput v4, p0, Lcom/daaw/ha1$b;->t:F

    const/high16 v5, 0x43960000    # 300.0f

    iput v5, p0, Lcom/daaw/ha1$b;->u:F

    const v5, 0x3f666666    # 0.9f

    iput v5, p0, Lcom/daaw/ha1$b;->v:F

    const v5, 0x3c23d70a    # 0.01f

    iput v5, p0, Lcom/daaw/ha1$b;->w:F

    const v5, 0x3ecccccd    # 0.4f

    iput v5, p0, Lcom/daaw/ha1$b;->x:F

    const/4 v5, 0x4

    iput v5, p0, Lcom/daaw/ha1$b;->y:I

    iput v2, p0, Lcom/daaw/ha1$b;->z:F

    const/high16 v5, 0x447a0000    # 1000.0f

    iput v5, p0, Lcom/daaw/ha1$b;->A:F

    iput v2, p0, Lcom/daaw/ha1$b;->B:F

    iput v4, p0, Lcom/daaw/ha1$b;->C:F

    new-array v5, p1, [I

    iput-object v5, p0, Lcom/daaw/ha1$b;->D:[I

    new-array v5, p1, [F

    iput-object v5, p0, Lcom/daaw/ha1$b;->E:[F

    iput v4, p0, Lcom/daaw/ha1$b;->F:F

    iput v1, p0, Lcom/daaw/ha1$b;->G:I

    iput v2, p0, Lcom/daaw/ha1$b;->H:F

    const v1, 0x3e4ccccd    # 0.2f

    iput v1, p0, Lcom/daaw/ha1$b;->I:F

    iput v4, p0, Lcom/daaw/ha1$b;->J:F

    iput-boolean v0, p0, Lcom/daaw/ha1$b;->K:Z

    new-array v5, p1, [F

    iput-object v5, p0, Lcom/daaw/ha1$b;->L:[F

    const/high16 v5, 0x3f000000    # 0.5f

    iput v5, p0, Lcom/daaw/ha1$b;->M:F

    iput v2, p0, Lcom/daaw/ha1$b;->N:F

    iput v2, p0, Lcom/daaw/ha1$b;->O:F

    new-instance v6, Lcom/daaw/c31;

    invoke-direct {v6, v5}, Lcom/daaw/c31;-><init>(F)V

    iput-object v6, p0, Lcom/daaw/ha1$b;->P:Lcom/daaw/c31;

    invoke-static {v0, v4}, Lcom/daaw/ad1;->e(IF)Lcom/daaw/ad1;

    move-result-object v5

    iput-object v5, p0, Lcom/daaw/ha1$b;->Q:Lcom/daaw/ad1;

    new-array v5, p1, [D

    iput-object v5, p0, Lcom/daaw/ha1$b;->R:[D

    iput p1, p0, Lcom/daaw/ha1$b;->S:I

    new-array v5, p1, [D

    iput-object v5, p0, Lcom/daaw/ha1$b;->U:[D

    new-instance v5, Ljava/lang/Object;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    iput-object v5, p0, Lcom/daaw/ha1$b;->W:Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v5

    iput v5, p0, Lcom/daaw/ha1$b;->X:I

    new-instance v5, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v5}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v5, p0, Lcom/daaw/ha1$b;->Y:Ljava/util/concurrent/BlockingQueue;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iput-object v5, p0, Lcom/daaw/ha1$b;->Z:Ljava/util/concurrent/TimeUnit;

    const v5, 0xac44

    iput v5, p0, Lcom/daaw/ha1$b;->b0:I

    iget v5, p0, Lcom/daaw/ha1$b;->X:I

    const/4 v6, 0x3

    sub-int/2addr v5, v6

    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    move-result v9

    new-array v5, v9, [Lcom/daaw/pw0;

    iput-object v5, p0, Lcom/daaw/ha1$b;->T:[Lcom/daaw/pw0;

    const/4 v5, 0x0

    :goto_0
    iget-object v7, p0, Lcom/daaw/ha1$b;->T:[Lcom/daaw/pw0;

    array-length v8, v7

    if-ge v5, v8, :cond_0

    new-instance v8, Lcom/daaw/pw0;

    invoke-direct {v8}, Lcom/daaw/pw0;-><init>()V

    aput-object v8, v7, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    new-instance v5, Lcom/daaw/ha1$b$a;

    invoke-direct {v5, p0, p0}, Lcom/daaw/ha1$b$a;-><init>(Lcom/daaw/ha1$b;Lcom/daaw/ha1$b;)V

    iput-object v5, p0, Lcom/daaw/ha1$b;->V:Lcom/daaw/ie0;

    const v5, 0x3d75c28f    # 0.06f

    invoke-virtual {p0, v3, v5, p1}, Lcom/daaw/ha1$b;->F(IFI)V

    invoke-virtual {p0, v0}, Lcom/daaw/ha1$b;->A(I)V

    const p1, 0x3f333333    # 0.7f

    const/high16 v0, 0x420c0000    # 35.0f

    invoke-virtual {p0, v2, v1, p1, v0}, Lcom/daaw/ha1$b;->x(FFFF)V

    invoke-virtual {p0, v6, v4}, Lcom/daaw/ha1$b;->z(IF)V

    new-instance p1, Ljava/util/concurrent/ThreadPoolExecutor;

    const-wide/16 v10, 0x1

    iget-object v12, p0, Lcom/daaw/ha1$b;->Z:Ljava/util/concurrent/TimeUnit;

    iget-object v13, p0, Lcom/daaw/ha1$b;->Y:Ljava/util/concurrent/BlockingQueue;

    move-object v7, p1

    move v8, v9

    invoke-direct/range {v7 .. v13}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object p1, p0, Lcom/daaw/ha1$b;->a0:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method public static synthetic c(Lcom/daaw/ha1$b;IIIF[Lcom/daaw/yc1;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/daaw/ha1$b;->s(IIIF[Lcom/daaw/yc1;)V

    return-void
.end method

.method private synthetic s(IIIF[Lcom/daaw/yc1;)V
    .locals 9

    mul-int v2, p1, p2

    iget-object v0, p0, Lcom/daaw/ha1$b;->T:[Lcom/daaw/pw0;

    array-length v1, v0

    const/4 v3, 0x1

    sub-int/2addr v1, v3

    if-ne p2, v1, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 p3, p2, 0x1

    mul-int p3, p3, p1

    :goto_0
    aget-object v0, v0, p2

    iget-object v1, p0, Lcom/daaw/ha1$b;->R:[D

    iget-object v4, p0, Lcom/daaw/ha1$b;->U:[D

    float-to-double v5, p4

    iget-object p1, p0, Lcom/daaw/ha1$b;->e:[F

    aget p1, p1, v3

    float-to-double v7, p1

    move v3, p3

    invoke-virtual/range {v0 .. v8}, Lcom/daaw/pw0;->b([DII[DDD)V

    aget-object p1, p5, p2

    invoke-virtual {p1}, Lcom/daaw/yc1;->a()V

    return-void
.end method


# virtual methods
.method public A(I)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/ha1$b;->W:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    if-ge p1, v1, :cond_0

    const/4 p1, 0x1

    :cond_0
    add-int/lit8 v1, p1, 0x1

    add-int/2addr v1, p1

    :try_start_0
    new-array v1, v1, [I

    iput-object v1, p0, Lcom/daaw/ha1$b;->D:[I

    array-length v2, v1

    new-array v2, v2, [F

    iput-object v2, p0, Lcom/daaw/ha1$b;->E:[F

    array-length v1, v1

    int-to-float v1, v1

    iput v1, p0, Lcom/daaw/ha1$b;->F:F

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/ha1$b;->D:[I

    array-length v3, v2

    if-ge v1, v3, :cond_1

    sub-int v3, v1, p1

    aput v3, v2, v1

    iget-object v4, p0, Lcom/daaw/ha1$b;->E:[F

    array-length v5, v2

    add-int/lit8 v5, v5, 0x2

    div-int/lit8 v5, v5, 0x2

    add-int/2addr v5, v3

    array-length v2, v2

    add-int/lit8 v2, v2, 0x2

    invoke-static {v5, v2}, Lcom/daaw/bv;->b(II)F

    move-result v2

    aput v2, v4, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public final B(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/ha1$b;->b:Z

    return-void
.end method

.method public C(F)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ha1$b;->W:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput p1, p0, Lcom/daaw/ha1$b;->J:F

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final D(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/ha1$b;->a:I

    return-void
.end method

.method public E(IFFZIFIIF)V
    .locals 12

    move-object v10, p0

    iget-object v11, v10, Lcom/daaw/ha1$b;->W:Ljava/lang/Object;

    monitor-enter v11

    const v0, 0x3dcccccd    # 0.1f

    move v1, p2

    :try_start_0
    invoke-static {p2, v0}, Ljava/lang/Math;->max(FF)F

    move-result v1

    iput v1, v10, Lcom/daaw/ha1$b;->f:F

    move v4, p3

    invoke-static {p3, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, v10, Lcom/daaw/ha1$b;->g:F

    const/4 v0, 0x1

    move v1, p1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v10, Lcom/daaw/ha1$b;->k:I

    move/from16 v5, p4

    iput-boolean v5, v10, Lcom/daaw/ha1$b;->r:Z

    move/from16 v1, p5

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, v10, Lcom/daaw/ha1$b;->s:I

    move/from16 v0, p6

    iput v0, v10, Lcom/daaw/ha1$b;->H:F

    iget v2, v10, Lcom/daaw/ha1$b;->k:I

    new-array v1, v2, [F

    iput-object v1, v10, Lcom/daaw/ha1$b;->n:[F

    new-array v1, v2, [F

    iput-object v1, v10, Lcom/daaw/ha1$b;->o:[F

    move/from16 v7, p7

    iput v7, v10, Lcom/daaw/ha1$b;->h:I

    move/from16 v8, p8

    iput v8, v10, Lcom/daaw/ha1$b;->i:I

    move/from16 v9, p9

    iput v9, v10, Lcom/daaw/ha1$b;->j:F

    new-array v1, v2, [D

    iput-object v1, v10, Lcom/daaw/ha1$b;->U:[D

    iget v3, v10, Lcom/daaw/ha1$b;->f:F

    move-object v1, p0

    move v4, p3

    move/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-virtual/range {v1 .. v9}, Lcom/daaw/ha1$b;->H(IFFZFIIF)V

    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/daaw/ha1$b;->w(I)V

    const/4 v0, 0x0

    :goto_0
    iget-object v1, v10, Lcom/daaw/ha1$b;->T:[Lcom/daaw/pw0;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aget-object v1, v1, v0

    iget-object v2, v10, Lcom/daaw/ha1$b;->n:[F

    const v3, 0xac44

    invoke-virtual {v1, v2, v3}, Lcom/daaw/pw0;->a([FI)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    monitor-exit v11

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public F(IFI)V
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

    invoke-virtual/range {v0 .. v9}, Lcom/daaw/ha1$b;->E(IFFZIFIIF)V

    return-void
.end method

.method public G(F)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ha1$b;->W:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput p1, p0, Lcom/daaw/ha1$b;->t:F

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final H(IFFZFIIF)V
    .locals 23

    move-object/from16 v7, p0

    move/from16 v8, p1

    move/from16 v9, p2

    move/from16 v10, p3

    const/4 v11, 0x0

    move/from16 v0, p6

    invoke-static {v11, v0}, Ljava/lang/Math;->max(II)I

    move-result v12

    move/from16 v0, p7

    invoke-static {v11, v0}, Ljava/lang/Math;->max(II)I

    move-result v13

    const/4 v14, 0x1

    if-eqz p4, :cond_0

    if-le v8, v14, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    div-int/lit8 v1, v8, 0x2

    move v15, v1

    goto :goto_1

    :cond_1
    move v15, v8

    :goto_1
    if-eqz v0, :cond_2

    div-int/lit8 v0, v8, 0x2

    goto :goto_2

    :cond_2
    move v0, v8

    :goto_2
    sub-int/2addr v0, v12

    sub-int v6, v0, v13

    iget v0, v7, Lcom/daaw/ha1$b;->s:I

    div-int v0, v6, v0

    invoke-static {v0, v14}, Ljava/lang/Math;->max(II)I

    move-result v5

    const/4 v0, 0x0

    :goto_3
    const/16 v16, 0x0

    if-ge v0, v8, :cond_3

    iget-object v1, v7, Lcom/daaw/ha1$b;->n:[F

    aput v16, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_3
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v17, 0x7f7fffff    # Float.MAX_VALUE

    const/16 v18, 0x0

    :goto_4
    if-ge v3, v6, :cond_6

    int-to-float v0, v6

    mul-float v0, v0, p8

    float-to-int v0, v0

    sub-int v0, v3, v0

    add-int/2addr v0, v6

    rem-int v2, v0, v5

    iget-object v0, v7, Lcom/daaw/ha1$b;->n:[F

    add-int v19, v3, v12

    move/from16 p4, v15

    float-to-double v14, v9

    move/from16 v20, v12

    float-to-double v11, v10

    move-object/from16 v21, v0

    move-object/from16 v0, p0

    move/from16 v22, v1

    move/from16 p7, v2

    move-wide v1, v14

    move v15, v3

    move v14, v4

    move-wide v3, v11

    move v11, v5

    move/from16 v5, p7

    move v12, v6

    move v6, v11

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/ha1$b;->t(DDII)D

    move-result-wide v0

    double-to-float v0, v0

    aput v0, v21, v19

    int-to-float v0, v11

    const/high16 v1, 0x3f800000    # 1.0f

    div-float v0, v1, v0

    sub-float v2, v10, v9

    move/from16 v3, p7

    int-to-float v3, v3

    mul-float v3, v3, v0

    mul-float v2, v2, v3

    add-float v0, v9, v2

    iget-object v2, v7, Lcom/daaw/ha1$b;->n:[F

    aget v3, v2, v19

    sub-float v1, v1, p5

    mul-float v3, v3, v1

    mul-float v0, v0, p5

    add-float/2addr v3, v0

    aput v3, v2, v19

    aget v0, v2, v19

    cmpl-float v0, v17, v0

    if-lez v0, :cond_4

    aget v0, v2, v19

    move/from16 v17, v0

    move/from16 v4, v19

    goto :goto_5

    :cond_4
    move v4, v14

    :goto_5
    aget v0, v2, v19

    cmpg-float v0, v18, v0

    if-gez v0, :cond_5

    aget v18, v2, v19

    move/from16 v1, v19

    goto :goto_6

    :cond_5
    move/from16 v1, v22

    :goto_6
    add-int/lit8 v3, v15, 0x1

    move/from16 v15, p4

    move v5, v11

    move v6, v12

    move/from16 v12, v20

    const/4 v11, 0x0

    const/4 v14, 0x1

    goto :goto_4

    :cond_6
    move/from16 v22, v1

    move v14, v4

    move/from16 v20, v12

    move/from16 p4, v15

    move v12, v6

    const/4 v0, 0x0

    :goto_7
    if-ge v0, v8, :cond_c

    move/from16 v1, v20

    if-le v0, v1, :cond_7

    if-eq v0, v14, :cond_7

    iget-object v2, v7, Lcom/daaw/ha1$b;->n:[F

    add-int/lit8 v3, v0, -0x1

    add-int/2addr v3, v8

    rem-int/2addr v3, v8

    aget v2, v2, v3

    goto :goto_8

    :cond_7
    iget-object v2, v7, Lcom/daaw/ha1$b;->n:[F

    aget v2, v2, v0

    :goto_8
    sub-int v6, v12, v13

    const/4 v3, 0x1

    sub-int/2addr v6, v3

    move/from16 v11, v22

    if-ge v0, v6, :cond_8

    if-eq v0, v11, :cond_8

    iget-object v3, v7, Lcom/daaw/ha1$b;->n:[F

    add-int/lit8 v4, v0, 0x1

    rem-int/2addr v4, v8

    aget v3, v3, v4

    goto :goto_9

    :cond_8
    iget-object v3, v7, Lcom/daaw/ha1$b;->n:[F

    aget v3, v3, v0

    :goto_9
    iget-object v4, v7, Lcom/daaw/ha1$b;->o:[F

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v5

    aput v5, v4, v0

    cmpg-float v4, v2, v16

    if-gez v4, :cond_a

    cmpg-float v2, v3, v16

    if-gez v2, :cond_9

    iget-object v2, v7, Lcom/daaw/ha1$b;->o:[F

    aput v16, v2, v0

    goto :goto_a

    :cond_9
    iget-object v2, v7, Lcom/daaw/ha1$b;->o:[F

    aput v3, v2, v0

    goto :goto_a

    :cond_a
    cmpg-float v3, v2, v16

    if-gez v3, :cond_b

    iget-object v2, v7, Lcom/daaw/ha1$b;->o:[F

    aput v16, v2, v0

    goto :goto_a

    :cond_b
    iget-object v3, v7, Lcom/daaw/ha1$b;->o:[F

    aput v2, v3, v0

    :goto_a
    add-int/lit8 v0, v0, 0x1

    move/from16 v20, v1

    move/from16 v22, v11

    goto :goto_7

    :cond_c
    const/4 v11, 0x0

    :goto_b
    if-ge v11, v8, :cond_f

    iget-object v0, v7, Lcom/daaw/ha1$b;->n:[F

    aget v1, v0, v11

    cmpg-float v1, v1, v16

    if-gez v1, :cond_d

    aput v16, v0, v11

    :cond_d
    iget-object v0, v7, Lcom/daaw/ha1$b;->o:[F

    aget v1, v0, v11

    cmpg-float v1, v1, v16

    if-gez v1, :cond_e

    aput v16, v0, v11

    :cond_e
    add-int/lit8 v11, v11, 0x1

    goto :goto_b

    :cond_f
    const/4 v3, 0x1

    add-int/lit8 v0, v8, -0x1

    move/from16 v8, p4

    move v2, v0

    const/4 v1, 0x1

    :goto_c
    if-lt v2, v8, :cond_10

    iget-object v4, v7, Lcom/daaw/ha1$b;->n:[F

    aget v5, v4, v1

    aput v5, v4, v2

    iget-object v4, v7, Lcom/daaw/ha1$b;->o:[F

    aget v5, v4, v1

    aput v5, v4, v2

    add-int/2addr v1, v3

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    add-int/lit8 v2, v2, -0x1

    goto :goto_c

    :cond_10
    return-void
.end method

.method public final I([F)V
    .locals 6

    iget v0, p0, Lcom/daaw/ha1$b;->B:F

    const v1, 0x3dccccd0    # 0.100000024f

    mul-float v0, v0, v1

    const/4 v2, 0x0

    aget v2, p1, v2

    const v3, 0x3f666666    # 0.9f

    mul-float v2, v2, v3

    add-float/2addr v0, v2

    iput v0, p0, Lcom/daaw/ha1$b;->B:F

    const/4 v2, 0x1

    aget v4, p1, v2

    iget v5, p0, Lcom/daaw/ha1$b;->A:F

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

    iput v5, p0, Lcom/daaw/ha1$b;->A:F

    iget p1, p0, Lcom/daaw/ha1$b;->A:F

    sub-float/2addr p1, v0

    iput p1, p0, Lcom/daaw/ha1$b;->C:F

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float p1, p1, v0

    if-gez p1, :cond_1

    iput v0, p0, Lcom/daaw/ha1$b;->C:F

    :cond_1
    const/high16 p1, 0x43960000    # 300.0f

    iget v0, p0, Lcom/daaw/ha1$b;->C:F

    div-float/2addr p1, v0

    iput p1, p0, Lcom/daaw/ha1$b;->C:F

    return-void
.end method

.method public a(Lcom/daaw/un;)V
    .locals 14

    iget-object v0, p0, Lcom/daaw/ha1$b;->W:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v1, "audioDurationMs"

    const/16 v2, 0x3c

    invoke-virtual {p1, v1, v2}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/ha1$b;->D(I)V

    const-string v1, "highQualityAudioCapture"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/ha1$b;->B(Z)V

    const-string v1, "sampleOutCount"

    const/16 v3, 0x80

    invoke-virtual {p1, v1, v3}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v5

    const-string v1, "lowerHz"

    const v3, 0x3dcccccd    # 0.1f

    invoke-virtual {p1, v1, v3}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v6

    const-string v1, "higherHz"

    const v3, 0x468ca000    # 18000.0f

    invoke-virtual {p1, v1, v3}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v7

    const-string v1, "mirrorSamples"

    invoke-virtual {p1, v1, v2}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v8

    const-string v1, "repeatSamples"

    const/4 v3, 0x1

    invoke-virtual {p1, v1, v3}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v9

    const-string v1, "hzLinearFactor"

    const v3, 0x3d75c28f    # 0.06f

    invoke-virtual {p1, v1, v3}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v10

    const-string v1, "starAndEndGap"

    invoke-virtual {p1, v1, v2}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v11

    const-string v1, "starAndEndGap"

    invoke-virtual {p1, v1, v2}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v12

    const-string v1, "freqShift"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v13

    move-object v4, p0

    invoke-virtual/range {v4 .. v13}, Lcom/daaw/ha1$b;->E(IFFZIFIIF)V

    const-string v1, "smooth"

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {p1, v1, v3}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/ha1$b;->G(F)V

    const-string v1, "filterRadius"

    const/4 v4, 0x4

    invoke-virtual {p1, v1, v4}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v1

    const-string v4, "filterStrength"

    invoke-virtual {p1, v4, v3}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v4

    invoke-virtual {p0, v1, v4}, Lcom/daaw/ha1$b;->z(IF)V

    const-string v1, "beatSmooth"

    const v4, 0x3ecccccd    # 0.4f

    invoke-virtual {p1, v1, v4}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/ha1$b;->y(F)V

    const-string v1, "beatRangeBarFirst"

    invoke-virtual {p1, v1, v2}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v1

    const-string v2, "beatRangeBarLast"

    const v4, 0x3e4ccccd    # 0.2f

    invoke-virtual {p1, v2, v4}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v2

    const-string v4, "beatRangeValueLower"

    const v5, 0x3f333333    # 0.7f

    invoke-virtual {p1, v4, v5}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v4

    const-string v5, "beatRangeValueHigher"

    const/high16 v6, 0x420c0000    # 35.0f

    invoke-virtual {p1, v5, v6}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v5

    invoke-virtual {p0, v1, v2, v4, v5}, Lcom/daaw/ha1$b;->x(FFFF)V

    const-string v1, "lowerFreqMagnitude"

    const/high16 v2, 0x3e800000    # 0.25f

    invoke-virtual {p1, v1, v2}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/ha1$b;->v(F)V

    const-string v1, "outputMultiplier"

    invoke-virtual {p1, v1, v3}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/ha1$b;->C(F)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final j([FFZLcom/daaw/ie0;I[F[FZ)V
    .locals 4

    array-length p3, p1

    const/4 p5, 0x0

    const/4 p7, 0x0

    const/4 p8, 0x4

    if-ge p3, p8, :cond_1

    :goto_0
    array-length p2, p1

    if-ge p7, p2, :cond_0

    aput p5, p1, p7

    add-int/lit8 p7, p7, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    const p3, 0x4b189676    # 9999990.0f

    aput p3, p6, p7

    const p3, -0x34e7698a    # -9999990.0f

    const/4 p8, 0x1

    aput p3, p6, p8

    iget-object p3, p0, Lcom/daaw/ha1$b;->c:[D

    array-length p3, p3

    invoke-interface {p4}, Lcom/daaw/ie0;->size()I

    move-result p6

    if-eq p3, p6, :cond_2

    invoke-interface {p4}, Lcom/daaw/ie0;->size()I

    move-result p3

    new-array p3, p3, [D

    iput-object p3, p0, Lcom/daaw/ha1$b;->c:[D

    :cond_2
    array-length p3, p1

    iget-object p6, p0, Lcom/daaw/ha1$b;->c:[D

    array-length p6, p6

    if-ne p3, p6, :cond_3

    goto :goto_1

    :cond_3
    const/4 p8, 0x0

    :goto_1
    invoke-static {p8}, Lcom/daaw/q6;->i(Z)V

    iget p3, p0, Lcom/daaw/ha1$b;->I:F

    const/high16 p6, 0x3f800000    # 1.0f

    sub-float/2addr p6, p3

    :goto_2
    iget-object p8, p0, Lcom/daaw/ha1$b;->c:[D

    array-length p8, p8

    if-ge p7, p8, :cond_4

    iget-object p8, p0, Lcom/daaw/ha1$b;->Q:Lcom/daaw/ad1;

    invoke-virtual {p8, p7, p4}, Lcom/daaw/ad1;->g(ILcom/daaw/ie0;)D

    move-result-wide v0

    double-to-float p8, v0

    invoke-static {p8, p5}, Ljava/lang/Math;->max(FF)F

    move-result p8

    iget-object v0, p0, Lcom/daaw/ha1$b;->n:[F

    aget v0, v0, p7

    float-to-double v0, v0

    const-wide v2, 0x40a4500000000000L    # 2600.0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/daaw/av;->a(D)D

    move-result-wide v0

    double-to-float v0, v0

    const v1, 0x3dcccccd    # 0.1f

    mul-float v0, v0, v1

    mul-float v0, v0, p3

    add-float/2addr v0, p6

    mul-float p8, p8, v0

    mul-float p8, p8, p2

    aput p8, p1, p7

    add-int/lit8 p7, p7, 0x1

    goto :goto_2

    :cond_4
    return-void
.end method

.method public o(Lcom/daaw/un;)V
    .locals 8

    iget-object v7, p0, Lcom/daaw/ha1$b;->W:Ljava/lang/Object;

    monitor-enter v7

    :try_start_0
    const-string v2, "audioDurationMs"

    iget v3, p0, Lcom/daaw/ha1$b;->a:I

    const-string v4, "1_AudioCapture"

    const/16 v5, 0x14

    const/16 v6, 0x12c

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/un;->W(Ljava/lang/String;ILjava/lang/String;II)V

    const-string v1, "highQualityAudioCapture"

    iget-boolean v2, p0, Lcom/daaw/ha1$b;->b:Z

    const-string v3, "1_AudioCapture"

    invoke-virtual {p1, v1, v2, v3}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    const-string v2, "sampleOutCount"

    iget v3, p0, Lcom/daaw/ha1$b;->k:I

    const-string v4, "2_spectrum"

    const/4 v5, 0x0

    const/16 v6, 0x200

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/un;->W(Ljava/lang/String;ILjava/lang/String;II)V

    const-string v2, "lowerHz"

    iget v3, p0, Lcom/daaw/ha1$b;->f:F

    const-string v4, "2_spectrumHz"

    const/4 v5, 0x0

    const/high16 v6, 0x43960000    # 300.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v2, "higherHz"

    iget v3, p0, Lcom/daaw/ha1$b;->g:F

    const-string v4, "2_spectrumHz"

    const/high16 v5, 0x43960000    # 300.0f

    const v6, 0x468ca000    # 18000.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v2, "hzLinearFactor"

    iget v3, p0, Lcom/daaw/ha1$b;->H:F

    const-string v4, "2_spectrumHz"

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v2, "freqShift"

    iget v3, p0, Lcom/daaw/ha1$b;->j:F

    const-string v4, "2_spectrumHz"

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v1, "mirrorSamples"

    iget-boolean v2, p0, Lcom/daaw/ha1$b;->r:Z

    const-string v3, "2_spectrum"

    invoke-virtual {p1, v1, v2, v3}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    const-string v2, "repeatSamples"

    iget v3, p0, Lcom/daaw/ha1$b;->s:I

    const-string v4, "2_spectrum"

    const/4 v5, 0x1

    const/4 v6, 0x6

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/un;->W(Ljava/lang/String;ILjava/lang/String;II)V

    const-string v2, "starAndEndGap"

    iget v3, p0, Lcom/daaw/ha1$b;->h:I

    const-string v4, "2_spectrum"

    const/4 v5, 0x0

    const/16 v6, 0x1e

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/un;->W(Ljava/lang/String;ILjava/lang/String;II)V

    const-string v2, "smooth"

    iget v3, p0, Lcom/daaw/ha1$b;->t:F

    const-string v4, "2_spectrum"

    const v5, 0x3dcccccd    # 0.1f

    const/high16 v6, 0x3f800000    # 1.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v2, "filterRadius"

    iget-object v1, p0, Lcom/daaw/ha1$b;->Q:Lcom/daaw/ad1;

    invoke-virtual {v1}, Lcom/daaw/ad1;->f()I

    move-result v3

    const-string v4, "2_spectrum"

    const/4 v5, 0x0

    const/16 v6, 0x14

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/un;->W(Ljava/lang/String;ILjava/lang/String;II)V

    const-string v2, "filterStrength"

    iget-object v1, p0, Lcom/daaw/ha1$b;->Q:Lcom/daaw/ad1;

    invoke-virtual {v1}, Lcom/daaw/ad1;->h()F

    move-result v3

    const-string v4, "2_spectrum"

    const v5, 0x3dcccccd    # 0.1f

    const/high16 v6, 0x40000000    # 2.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v2, "beatSmooth"

    iget v3, p0, Lcom/daaw/ha1$b;->x:F

    const-string v4, "beat"

    const v5, 0x3dcccccd    # 0.1f

    const/high16 v6, 0x3f800000    # 1.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v2, "beatRangeBarFirst"

    iget-object v1, p0, Lcom/daaw/ha1$b;->P:Lcom/daaw/c31;

    invoke-virtual {v1}, Lcom/daaw/c31;->c()F

    move-result v3

    const-string v4, "beat"

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v2, "beatRangeBarLast"

    iget-object v1, p0, Lcom/daaw/ha1$b;->P:Lcom/daaw/c31;

    invoke-virtual {v1}, Lcom/daaw/c31;->d()F

    move-result v3

    const-string v4, "beat"

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v2, "beatRangeValueLower"

    iget-object v1, p0, Lcom/daaw/ha1$b;->P:Lcom/daaw/c31;

    invoke-virtual {v1}, Lcom/daaw/c31;->e()F

    move-result v3

    const-string v4, "beat"

    const/4 v5, 0x0

    const/high16 v6, 0x42480000    # 50.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v2, "beatRangeValueHigher"

    iget-object v1, p0, Lcom/daaw/ha1$b;->P:Lcom/daaw/c31;

    invoke-virtual {v1}, Lcom/daaw/c31;->f()F

    move-result v3

    const-string v4, "beat"

    const/4 v5, 0x0

    const/high16 v6, 0x42c80000    # 100.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v2, "lowerFreqMagnitude"

    iget v3, p0, Lcom/daaw/ha1$b;->I:F

    const-string v4, "2_spectrum"

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    const-string v2, "outputMultiplier"

    iget v3, p0, Lcom/daaw/ha1$b;->J:F

    const-string v4, "2_spectrum"

    const v5, 0x3dcccccd    # 0.1f

    const/high16 v6, 0x40400000    # 3.0f

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    monitor-exit v7

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public q()F
    .locals 2

    iget-object v0, p0, Lcom/daaw/ha1$b;->W:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/daaw/ha1$b;->q:F

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public r()F
    .locals 2

    iget-object v0, p0, Lcom/daaw/ha1$b;->W:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/daaw/ha1$b;->O:F

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public t(DDII)D
    .locals 2

    div-double/2addr p3, p1

    int-to-double v0, p5

    add-int/lit8 p6, p6, -0x1

    int-to-double p5, p6

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {p5, p6}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, p5

    invoke-static {p3, p4, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p3

    mul-double p1, p1, p3

    return-wide p1
.end method

.method public u(FLcom/daaw/sg0;)[F
    .locals 28

    move-object/from16 v10, p0

    iget-object v11, v10, Lcom/daaw/ha1$b;->W:Ljava/lang/Object;

    monitor-enter v11

    :try_start_0
    iget v0, v10, Lcom/daaw/ha1$b;->b0:I

    int-to-float v0, v0

    const v1, 0x3a83126f    # 0.001f

    mul-float v0, v0, v1

    iget v1, v10, Lcom/daaw/ha1$b;->a:I

    int-to-float v1, v1

    mul-float v0, v0, v1

    float-to-int v0, v0

    invoke-interface/range {p2 .. p2}, Lcom/daaw/sg0;->b()I

    move-result v1

    if-lez v1, :cond_0

    move v0, v1

    :cond_0
    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Lcom/daaw/sg0;->j(I)Lcom/daaw/avee/comp/playback/a;

    move-result-object v0

    const v2, 0xac44

    const/4 v3, 0x4

    const/4 v12, 0x0

    const/4 v4, 0x1

    const/4 v13, 0x0

    if-eqz v0, :cond_2

    iget-boolean v5, v10, Lcom/daaw/ha1$b;->b:Z

    if-eqz v5, :cond_1

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/a;->k()Lcom/daaw/ke0;

    move-result-object v5

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/a;->l()Lcom/daaw/ke0;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Lcom/daaw/ke0;->size()I

    move-result v6

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/a;->a()Z

    move-result v7

    iget v8, v0, Lcom/daaw/avee/comp/playback/a;->f:I

    iget-short v9, v0, Lcom/daaw/avee/comp/playback/a;->d:S

    int-to-float v9, v9

    iget-object v14, v10, Lcom/daaw/ha1$b;->e:[F

    aput v12, v14, v13

    iget-short v0, v0, Lcom/daaw/avee/comp/playback/a;->e:S

    int-to-float v0, v0

    aput v0, v14, v4

    move v0, v7

    goto :goto_1

    :cond_2
    new-instance v5, Lcom/daaw/gd1;

    invoke-direct {v5, v13, v3}, Lcom/daaw/gd1;-><init>(SI)V

    const/high16 v9, -0x3b860000    # -1000.0f

    iget-object v0, v10, Lcom/daaw/ha1$b;->e:[F

    aput v12, v0, v13

    const/high16 v6, 0x447a0000    # 1000.0f

    aput v6, v0, v4

    const/4 v0, 0x0

    const/4 v6, 0x4

    const v8, 0xac44

    :goto_1
    if-ge v6, v3, :cond_3

    new-instance v5, Lcom/daaw/gd1;

    invoke-direct {v5, v13, v3}, Lcom/daaw/gd1;-><init>(SI)V

    const/4 v8, 0x4

    const v14, 0xac44

    goto :goto_2

    :cond_3
    move v14, v8

    move v8, v6

    :goto_2
    iput v14, v10, Lcom/daaw/ha1$b;->b0:I

    iget-object v2, v10, Lcom/daaw/ha1$b;->m:[F

    array-length v2, v2

    iget v3, v10, Lcom/daaw/ha1$b;->k:I

    if-eq v2, v3, :cond_4

    new-array v2, v3, [F

    iput-object v2, v10, Lcom/daaw/ha1$b;->m:[F

    :cond_4
    iget-object v2, v10, Lcom/daaw/ha1$b;->l:[F

    array-length v2, v2

    iget-object v3, v10, Lcom/daaw/ha1$b;->m:[F

    array-length v6, v3

    if-eq v2, v6, :cond_5

    array-length v2, v3

    new-array v2, v2, [F

    iput-object v2, v10, Lcom/daaw/ha1$b;->l:[F

    const/4 v2, 0x0

    :goto_3
    iget-object v3, v10, Lcom/daaw/ha1$b;->l:[F

    array-length v6, v3

    if-ge v2, v6, :cond_5

    aput v12, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_5
    iget-object v2, v10, Lcom/daaw/ha1$b;->L:[F

    array-length v2, v2

    if-eq v8, v2, :cond_6

    new-array v2, v8, [F

    iput-object v2, v10, Lcom/daaw/ha1$b;->L:[F

    const/4 v2, 0x0

    :goto_4
    if-ge v2, v8, :cond_6

    iget-object v3, v10, Lcom/daaw/ha1$b;->L:[F

    const/high16 v6, 0x3b800000    # 0.00390625f

    invoke-static {v2, v8}, Lcom/daaw/bv;->c(II)F

    move-result v7

    mul-float v7, v7, v6

    aput v7, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    iget-object v2, v10, Lcom/daaw/ha1$b;->e:[F

    invoke-virtual {v10, v2}, Lcom/daaw/ha1$b;->I([F)V

    iget-object v2, v10, Lcom/daaw/ha1$b;->R:[D

    array-length v2, v2

    if-eq v2, v8, :cond_7

    new-array v2, v8, [D

    iput-object v2, v10, Lcom/daaw/ha1$b;->R:[D

    :cond_7
    const/4 v2, 0x0

    const/4 v15, 0x0

    :goto_5
    iget-object v3, v10, Lcom/daaw/ha1$b;->R:[D

    array-length v3, v3

    if-ge v2, v3, :cond_8

    invoke-interface {v5, v2}, Lcom/daaw/ke0;->get(I)S

    move-result v3

    int-to-float v3, v3

    iget-object v6, v10, Lcom/daaw/ha1$b;->L:[F

    aget v6, v6, v2

    mul-float v3, v3, v6

    iget v6, v10, Lcom/daaw/ha1$b;->C:F

    mul-float v3, v3, v6

    mul-float v6, v3, v3

    add-float/2addr v15, v6

    iget-object v6, v10, Lcom/daaw/ha1$b;->R:[D

    move-object/from16 v16, v5

    float-to-double v4, v3

    aput-wide v4, v6, v2

    add-int/lit8 v2, v2, 0x1

    move-object/from16 v5, v16

    const/4 v4, 0x1

    goto :goto_5

    :cond_8
    invoke-interface/range {p2 .. p2}, Lcom/daaw/sg0;->g()I

    move-result v1

    const/4 v6, 0x2

    and-int/2addr v1, v6

    if-eqz v1, :cond_b

    iget-object v1, v10, Lcom/daaw/ha1$b;->T:[Lcom/daaw/pw0;

    array-length v7, v1

    new-array v5, v7, [Lcom/daaw/yc1;

    const/4 v4, 0x0

    :goto_6
    iget-object v1, v10, Lcom/daaw/ha1$b;->T:[Lcom/daaw/pw0;

    array-length v1, v1

    if-ge v4, v1, :cond_a

    new-instance v1, Lcom/daaw/yc1;

    invoke-direct {v1}, Lcom/daaw/yc1;-><init>()V

    aput-object v1, v5, v4

    iget-object v1, v10, Lcom/daaw/ha1$b;->T:[Lcom/daaw/pw0;

    aget-object v2, v1, v4

    iget v2, v2, Lcom/daaw/pw0;->a:I

    if-eq v2, v14, :cond_9

    aget-object v1, v1, v4

    iget-object v2, v10, Lcom/daaw/ha1$b;->n:[F

    invoke-virtual {v1, v2, v14}, Lcom/daaw/pw0;->a([FI)V

    :cond_9
    iget-object v1, v10, Lcom/daaw/ha1$b;->T:[Lcom/daaw/pw0;

    aget-object v2, v1, v13

    iget v3, v2, Lcom/daaw/pw0;->c:I

    array-length v1, v1

    div-int v16, v3, v1

    iget-object v2, v10, Lcom/daaw/ha1$b;->a0:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v1, Lcom/daaw/ia1;

    move-object/from16 p2, v1

    move-object/from16 v1, p2

    move-object v12, v2

    move-object/from16 v2, p0

    move/from16 v17, v3

    move/from16 v3, v16

    move/from16 v16, v4

    move-object/from16 v18, v5

    move/from16 v5, v17

    move v6, v9

    move v13, v7

    move-object/from16 v7, v18

    invoke-direct/range {v1 .. v7}, Lcom/daaw/ia1;-><init>(Lcom/daaw/ha1$b;IIIF[Lcom/daaw/yc1;)V

    invoke-virtual {v12, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v4, v16, 0x1

    move v7, v13

    move-object/from16 v5, v18

    const/4 v6, 0x2

    const/4 v12, 0x0

    const/4 v13, 0x0

    goto :goto_6

    :cond_a
    move-object/from16 v18, v5

    move v13, v7

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v13, :cond_e

    :try_start_1
    aget-object v2, v18, v1

    invoke-virtual {v2}, Lcom/daaw/yc1;->b()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_b
    const/4 v1, 0x0

    :goto_8
    :try_start_2
    iget-object v2, v10, Lcom/daaw/ha1$b;->T:[Lcom/daaw/pw0;

    array-length v3, v2

    if-ge v1, v3, :cond_d

    aget-object v3, v2, v1

    iget v3, v3, Lcom/daaw/pw0;->a:I

    if-eq v3, v14, :cond_c

    aget-object v2, v2, v1

    iget-object v3, v10, Lcom/daaw/ha1$b;->n:[F

    invoke-virtual {v2, v3, v14}, Lcom/daaw/pw0;->a([FI)V

    :cond_c
    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_d
    const/4 v1, 0x0

    aget-object v19, v2, v1

    iget-object v3, v10, Lcom/daaw/ha1$b;->R:[D

    const/16 v21, 0x0

    aget-object v2, v2, v1

    iget v1, v2, Lcom/daaw/pw0;->c:I

    iget-object v2, v10, Lcom/daaw/ha1$b;->U:[D

    float-to-double v4, v9

    iget-object v6, v10, Lcom/daaw/ha1$b;->e:[F

    const/4 v7, 0x1

    aget v6, v6, v7

    float-to-double v6, v6

    move-object/from16 v20, v3

    move/from16 v22, v1

    move-object/from16 v23, v2

    move-wide/from16 v24, v4

    move-wide/from16 v26, v6

    invoke-virtual/range {v19 .. v27}, Lcom/daaw/pw0;->b([DII[DDD)V

    :cond_e
    if-lez v8, :cond_f

    int-to-float v1, v8

    div-float/2addr v15, v1

    float-to-double v1, v15

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    double-to-float v15, v1

    :cond_f
    iput v15, v10, Lcom/daaw/ha1$b;->z:F

    const/4 v1, 0x2

    new-array v7, v1, [F

    iget-object v2, v10, Lcom/daaw/ha1$b;->m:[F

    iget v3, v10, Lcom/daaw/ha1$b;->J:F

    iget-boolean v4, v10, Lcom/daaw/ha1$b;->r:Z

    iget-object v5, v10, Lcom/daaw/ha1$b;->V:Lcom/daaw/ie0;

    iget-object v8, v10, Lcom/daaw/ha1$b;->p:[F

    move-object/from16 v1, p0

    move v6, v14

    move v9, v0

    invoke-virtual/range {v1 .. v9}, Lcom/daaw/ha1$b;->j([FFZLcom/daaw/ie0;I[F[FZ)V

    iget-object v0, v10, Lcom/daaw/ha1$b;->P:Lcom/daaw/c31;

    iget-object v1, v10, Lcom/daaw/ha1$b;->l:[F

    array-length v1, v1

    invoke-virtual {v0, v1}, Lcom/daaw/c31;->g(I)V

    const-string v0, "barValues == barSmoothValues"

    iget-object v1, v10, Lcom/daaw/ha1$b;->m:[F

    array-length v1, v1

    iget-object v2, v10, Lcom/daaw/ha1$b;->l:[F

    array-length v2, v2

    invoke-static {v0, v1, v2}, Lcom/daaw/q6;->b(Ljava/lang/String;II)V

    const/4 v0, 0x0

    iput v0, v10, Lcom/daaw/ha1$b;->N:F

    const v0, -0x39e3c000    # -10000.0f

    const/4 v1, 0x0

    :goto_9
    iget-object v2, v10, Lcom/daaw/ha1$b;->m:[F

    array-length v3, v2

    if-ge v1, v3, :cond_11

    aget v3, v2, v1

    cmpl-float v3, v3, v0

    if-lez v3, :cond_10

    aget v0, v2, v1

    int-to-float v3, v1

    iput v3, v10, Lcom/daaw/ha1$b;->N:F

    :cond_10
    aget v2, v2, v1

    iget-object v3, v10, Lcom/daaw/ha1$b;->l:[F

    aget v4, v3, v1

    sub-float/2addr v2, v4

    aget v4, v3, v1

    const/high16 v5, 0x41a00000    # 20.0f

    mul-float v2, v2, v5

    mul-float v2, v2, p1

    iget v5, v10, Lcom/daaw/ha1$b;->t:F

    mul-float v2, v2, v5

    add-float/2addr v4, v2

    aput v4, v3, v1

    aget v2, v3, v1

    const/4 v4, 0x0

    invoke-static {v2, v4}, Ljava/lang/Math;->max(FF)F

    move-result v2

    aput v2, v3, v1

    iget-object v2, v10, Lcom/daaw/ha1$b;->P:Lcom/daaw/c31;

    iget-object v3, v10, Lcom/daaw/ha1$b;->l:[F

    aget v3, v3, v1

    invoke-virtual {v2, v1, v3}, Lcom/daaw/c31;->a(IF)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_11
    iget-object v0, v10, Lcom/daaw/ha1$b;->p:[F

    iget-object v1, v10, Lcom/daaw/ha1$b;->P:Lcom/daaw/c31;

    invoke-virtual {v1}, Lcom/daaw/c31;->b()F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    iget v0, v10, Lcom/daaw/ha1$b;->q:F

    iget v1, v10, Lcom/daaw/ha1$b;->x:F

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float v4, v3, v1

    mul-float v0, v0, v4

    iget-object v4, v10, Lcom/daaw/ha1$b;->p:[F

    aget v2, v4, v2

    mul-float v2, v2, v1

    add-float/2addr v0, v2

    iput v0, v10, Lcom/daaw/ha1$b;->q:F

    iget v0, v10, Lcom/daaw/ha1$b;->N:F

    iget-object v1, v10, Lcom/daaw/ha1$b;->m:[F

    array-length v1, v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, v10, Lcom/daaw/ha1$b;->N:F

    iget v1, v10, Lcom/daaw/ha1$b;->O:F

    iget v2, v10, Lcom/daaw/ha1$b;->M:F

    sub-float/2addr v3, v2

    mul-float v1, v1, v3

    mul-float v0, v0, v2

    add-float/2addr v1, v0

    iput v1, v10, Lcom/daaw/ha1$b;->O:F

    iget-object v0, v10, Lcom/daaw/ha1$b;->l:[F

    monitor-exit v11

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_b

    :goto_a
    throw v0

    :goto_b
    goto :goto_a
.end method

.method public v(F)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ha1$b;->W:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput p1, p0, Lcom/daaw/ha1$b;->I:F

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public w(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ha1$b;->W:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput p1, p0, Lcom/daaw/ha1$b;->y:I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public x(FFFF)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ha1$b;->W:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/ha1$b;->P:Lcom/daaw/c31;

    invoke-virtual {v1, p1, p2, p3, p4}, Lcom/daaw/c31;->h(FFFF)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public y(F)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ha1$b;->W:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput p1, p0, Lcom/daaw/ha1$b;->x:F

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public z(IF)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ha1$b;->W:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p1, p2}, Lcom/daaw/ad1;->e(IF)Lcom/daaw/ad1;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ha1$b;->Q:Lcom/daaw/ad1;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
