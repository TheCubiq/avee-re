.class public final Lcom/daaw/or2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public A:Ljava/lang/reflect/Method;

.field public B:I

.field public C:J

.field public D:J

.field public E:I

.field public F:J

.field public G:J

.field public H:I

.field public I:I

.field public J:J

.field public K:J

.field public L:J

.field public M:F

.field public N:[Lcom/daaw/qq2;

.field public O:[Ljava/nio/ByteBuffer;

.field public P:Ljava/nio/ByteBuffer;

.field public Q:Ljava/nio/ByteBuffer;

.field public R:[B

.field public S:I

.field public T:I

.field public U:Z

.field public V:Z

.field public W:I

.field public X:Z

.field public Y:J

.field public final a:Lcom/daaw/pr2;

.field public final b:Lcom/daaw/vr2;

.field public final c:[Lcom/daaw/qq2;

.field public final d:Lcom/daaw/kr2;

.field public final e:Landroid/os/ConditionVariable;

.field public final f:[J

.field public final g:Lcom/daaw/gr2;

.field public final h:Ljava/util/LinkedList;

.field public i:Landroid/media/AudioTrack;

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:Z

.field public o:I

.field public p:J

.field public q:Lcom/daaw/fq2;

.field public r:Lcom/daaw/fq2;

.field public s:J

.field public t:J

.field public u:I

.field public v:I

.field public w:J

.field public x:J

.field public y:Z

.field public z:J


# direct methods
.method public constructor <init>(Lcom/daaw/oq2;[Lcom/daaw/qq2;Lcom/daaw/kr2;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcom/daaw/or2;->d:Lcom/daaw/kr2;

    new-instance p1, Landroid/os/ConditionVariable;

    const/4 p3, 0x1

    invoke-direct {p1, p3}, Landroid/os/ConditionVariable;-><init>(Z)V

    iput-object p1, p0, Lcom/daaw/or2;->e:Landroid/os/ConditionVariable;

    sget p1, Lcom/daaw/pz2;->a:I

    const/4 v0, 0x0

    const/16 v1, 0x12

    if-lt p1, v1, :cond_0

    :try_start_0
    const-class p1, Landroid/media/AudioTrack;

    const-string v1, "getLatency"

    invoke-virtual {p1, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/or2;->A:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :cond_0
    :goto_0
    sget p1, Lcom/daaw/pz2;->a:I

    const/16 v1, 0x13

    if-lt p1, v1, :cond_1

    new-instance p1, Lcom/daaw/hr2;

    invoke-direct {p1}, Lcom/daaw/hr2;-><init>()V

    goto :goto_1

    :cond_1
    new-instance p1, Lcom/daaw/gr2;

    invoke-direct {p1, v0}, Lcom/daaw/gr2;-><init>(Lcom/daaw/fr2;)V

    :goto_1
    iput-object p1, p0, Lcom/daaw/or2;->g:Lcom/daaw/gr2;

    new-instance p1, Lcom/daaw/pr2;

    invoke-direct {p1}, Lcom/daaw/pr2;-><init>()V

    iput-object p1, p0, Lcom/daaw/or2;->a:Lcom/daaw/pr2;

    new-instance v0, Lcom/daaw/vr2;

    invoke-direct {v0}, Lcom/daaw/vr2;-><init>()V

    iput-object v0, p0, Lcom/daaw/or2;->b:Lcom/daaw/vr2;

    const/4 v1, 0x3

    new-array v1, v1, [Lcom/daaw/qq2;

    iput-object v1, p0, Lcom/daaw/or2;->c:[Lcom/daaw/qq2;

    new-instance v2, Lcom/daaw/tr2;

    invoke-direct {v2}, Lcom/daaw/tr2;-><init>()V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    aput-object p1, v1, p3

    const/4 p1, 0x2

    invoke-static {p2, v3, v1, p1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-object v0, v1, p1

    const/16 p1, 0xa

    new-array p1, p1, [J

    iput-object p1, p0, Lcom/daaw/or2;->f:[J

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lcom/daaw/or2;->M:F

    iput v3, p0, Lcom/daaw/or2;->I:I

    iput v3, p0, Lcom/daaw/or2;->W:I

    sget-object p1, Lcom/daaw/fq2;->d:Lcom/daaw/fq2;

    iput-object p1, p0, Lcom/daaw/or2;->r:Lcom/daaw/fq2;

    const/4 p1, -0x1

    iput p1, p0, Lcom/daaw/or2;->T:I

    new-array p1, v3, [Lcom/daaw/qq2;

    iput-object p1, p0, Lcom/daaw/or2;->N:[Lcom/daaw/qq2;

    new-array p1, v3, [Ljava/nio/ByteBuffer;

    iput-object p1, p0, Lcom/daaw/or2;->O:[Ljava/nio/ByteBuffer;

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/daaw/or2;->h:Ljava/util/LinkedList;

    return-void
.end method

.method public static bridge synthetic b(Lcom/daaw/or2;)Landroid/os/ConditionVariable;
    .locals 0

    iget-object p0, p0, Lcom/daaw/or2;->e:Landroid/os/ConditionVariable;

    return-object p0
.end method


# virtual methods
.method public final a(Z)J
    .locals 17

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/or2;->x()Z

    move-result v1

    if-eqz v1, :cond_e

    iget v1, v0, Lcom/daaw/or2;->I:I

    if-eqz v1, :cond_e

    iget-object v1, v0, Lcom/daaw/or2;->i:Landroid/media/AudioTrack;

    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v1

    const/4 v2, 0x3

    const-wide/16 v3, 0x3e8

    if-ne v1, v2, :cond_7

    iget-object v1, v0, Lcom/daaw/or2;->g:Lcom/daaw/gr2;

    invoke-virtual {v1}, Lcom/daaw/gr2;->b()J

    move-result-wide v1

    const-wide/16 v5, 0x0

    cmp-long v7, v1, v5

    if-nez v7, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v7

    div-long/2addr v7, v3

    iget-wide v9, v0, Lcom/daaw/or2;->x:J

    sub-long v9, v7, v9

    const-wide/16 v11, 0x7530

    const/4 v13, 0x0

    cmp-long v14, v9, v11

    if-ltz v14, :cond_2

    iget-object v9, v0, Lcom/daaw/or2;->f:[J

    iget v10, v0, Lcom/daaw/or2;->u:I

    sub-long v11, v1, v7

    aput-wide v11, v9, v10

    add-int/lit8 v10, v10, 0x1

    const/16 v9, 0xa

    rem-int/2addr v10, v9

    iput v10, v0, Lcom/daaw/or2;->u:I

    iget v10, v0, Lcom/daaw/or2;->v:I

    if-ge v10, v9, :cond_1

    add-int/lit8 v10, v10, 0x1

    iput v10, v0, Lcom/daaw/or2;->v:I

    :cond_1
    iput-wide v7, v0, Lcom/daaw/or2;->x:J

    iput-wide v5, v0, Lcom/daaw/or2;->w:J

    const/4 v9, 0x0

    :goto_0
    iget v10, v0, Lcom/daaw/or2;->v:I

    if-ge v9, v10, :cond_2

    iget-wide v11, v0, Lcom/daaw/or2;->w:J

    iget-object v14, v0, Lcom/daaw/or2;->f:[J

    aget-wide v15, v14, v9

    int-to-long v5, v10

    div-long/2addr v15, v5

    add-long/2addr v11, v15

    iput-wide v11, v0, Lcom/daaw/or2;->w:J

    add-int/lit8 v9, v9, 0x1

    const-wide/16 v5, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/or2;->y()Z

    move-result v5

    if-nez v5, :cond_7

    iget-wide v5, v0, Lcom/daaw/or2;->z:J

    sub-long v5, v7, v5

    const-wide/32 v9, 0x7a120

    cmp-long v11, v5, v9

    if-ltz v11, :cond_7

    iget-object v5, v0, Lcom/daaw/or2;->g:Lcom/daaw/gr2;

    invoke-virtual {v5}, Lcom/daaw/gr2;->h()Z

    move-result v5

    iput-boolean v5, v0, Lcom/daaw/or2;->y:Z

    const-wide/32 v9, 0x4c4b40

    if-eqz v5, :cond_5

    iget-object v5, v0, Lcom/daaw/or2;->g:Lcom/daaw/gr2;

    invoke-virtual {v5}, Lcom/daaw/gr2;->d()J

    move-result-wide v5

    div-long/2addr v5, v3

    iget-object v11, v0, Lcom/daaw/or2;->g:Lcom/daaw/gr2;

    invoke-virtual {v11}, Lcom/daaw/gr2;->c()J

    move-result-wide v11

    iget-wide v14, v0, Lcom/daaw/or2;->K:J

    cmp-long v16, v5, v14

    if-gez v16, :cond_3

    :goto_1
    iput-boolean v13, v0, Lcom/daaw/or2;->y:Z

    goto :goto_3

    :cond_3
    sub-long v14, v5, v7

    invoke-static {v14, v15}, Ljava/lang/Math;->abs(J)J

    move-result-wide v14

    const-string v3, ", "

    cmp-long v4, v14, v9

    if-lez v4, :cond_4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Spurious audio timestamp (system clock mismatch): "

    :goto_2
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_4
    invoke-virtual {v0, v11, v12}, Lcom/daaw/or2;->q(J)J

    move-result-wide v14

    sub-long/2addr v14, v1

    invoke-static {v14, v15}, Ljava/lang/Math;->abs(J)J

    move-result-wide v14

    cmp-long v4, v14, v9

    if-lez v4, :cond_5

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Spurious audio timestamp (frame position mismatch): "

    goto :goto_2

    :cond_5
    :goto_3
    iget-object v1, v0, Lcom/daaw/or2;->A:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_6

    iget-boolean v2, v0, Lcom/daaw/or2;->n:Z

    if-nez v2, :cond_6

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, v0, Lcom/daaw/or2;->i:Landroid/media/AudioTrack;

    invoke-virtual {v1, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v3, v1

    const-wide/16 v5, 0x3e8

    mul-long v3, v3, v5

    iget-wide v5, v0, Lcom/daaw/or2;->p:J

    sub-long/2addr v3, v5

    iput-wide v3, v0, Lcom/daaw/or2;->L:J

    const-wide/16 v5, 0x0

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    iput-wide v3, v0, Lcom/daaw/or2;->L:J

    cmp-long v1, v3, v9

    if-lez v1, :cond_6

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Ignoring impossibly large audio latency: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-wide/16 v3, 0x0

    iput-wide v3, v0, Lcom/daaw/or2;->L:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    iput-object v2, v0, Lcom/daaw/or2;->A:Ljava/lang/reflect/Method;

    :cond_6
    :goto_4
    iput-wide v7, v0, Lcom/daaw/or2;->z:J

    :cond_7
    :goto_5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    iget-boolean v5, v0, Lcom/daaw/or2;->y:Z

    if-eqz v5, :cond_8

    iget-object v5, v0, Lcom/daaw/or2;->g:Lcom/daaw/gr2;

    invoke-virtual {v5}, Lcom/daaw/gr2;->d()J

    move-result-wide v5

    div-long/2addr v5, v3

    sub-long/2addr v1, v5

    invoke-virtual {v0, v1, v2}, Lcom/daaw/or2;->p(J)J

    move-result-wide v1

    iget-object v3, v0, Lcom/daaw/or2;->g:Lcom/daaw/gr2;

    invoke-virtual {v3}, Lcom/daaw/gr2;->c()J

    move-result-wide v3

    add-long/2addr v3, v1

    invoke-virtual {v0, v3, v4}, Lcom/daaw/or2;->q(J)J

    move-result-wide v1

    goto :goto_7

    :cond_8
    iget v3, v0, Lcom/daaw/or2;->v:I

    if-nez v3, :cond_9

    iget-object v1, v0, Lcom/daaw/or2;->g:Lcom/daaw/gr2;

    invoke-virtual {v1}, Lcom/daaw/gr2;->b()J

    move-result-wide v1

    goto :goto_6

    :cond_9
    iget-wide v3, v0, Lcom/daaw/or2;->w:J

    add-long/2addr v1, v3

    :goto_6
    if-nez p1, :cond_a

    iget-wide v3, v0, Lcom/daaw/or2;->L:J

    sub-long/2addr v1, v3

    :cond_a
    :goto_7
    iget-wide v3, v0, Lcom/daaw/or2;->J:J

    :goto_8
    iget-object v5, v0, Lcom/daaw/or2;->h:Ljava/util/LinkedList;

    invoke-virtual {v5}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_b

    iget-object v5, v0, Lcom/daaw/or2;->h:Ljava/util/LinkedList;

    invoke-virtual {v5}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/mr2;

    invoke-static {v5}, Lcom/daaw/mr2;->b(Lcom/daaw/mr2;)J

    move-result-wide v5

    cmp-long v7, v1, v5

    if-ltz v7, :cond_b

    iget-object v5, v0, Lcom/daaw/or2;->h:Ljava/util/LinkedList;

    invoke-virtual {v5}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/mr2;

    invoke-static {v5}, Lcom/daaw/mr2;->c(Lcom/daaw/mr2;)Lcom/daaw/fq2;

    move-result-object v6

    iput-object v6, v0, Lcom/daaw/or2;->r:Lcom/daaw/fq2;

    invoke-static {v5}, Lcom/daaw/mr2;->b(Lcom/daaw/mr2;)J

    move-result-wide v6

    iput-wide v6, v0, Lcom/daaw/or2;->t:J

    invoke-static {v5}, Lcom/daaw/mr2;->a(Lcom/daaw/mr2;)J

    move-result-wide v5

    iget-wide v7, v0, Lcom/daaw/or2;->J:J

    sub-long/2addr v5, v7

    iput-wide v5, v0, Lcom/daaw/or2;->s:J

    goto :goto_8

    :cond_b
    iget-object v5, v0, Lcom/daaw/or2;->r:Lcom/daaw/fq2;

    iget v5, v5, Lcom/daaw/fq2;->a:F

    const/high16 v6, 0x3f800000    # 1.0f

    cmpl-float v5, v5, v6

    if-nez v5, :cond_c

    iget-wide v5, v0, Lcom/daaw/or2;->s:J

    add-long/2addr v1, v5

    iget-wide v5, v0, Lcom/daaw/or2;->t:J

    sub-long/2addr v1, v5

    goto :goto_9

    :cond_c
    iget-object v5, v0, Lcom/daaw/or2;->h:Ljava/util/LinkedList;

    invoke-virtual {v5}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_d

    iget-object v5, v0, Lcom/daaw/or2;->b:Lcom/daaw/vr2;

    invoke-virtual {v5}, Lcom/daaw/vr2;->f()J

    move-result-wide v6

    const-wide/16 v8, 0x400

    cmp-long v10, v6, v8

    if-ltz v10, :cond_d

    iget-wide v6, v0, Lcom/daaw/or2;->s:J

    iget-wide v8, v0, Lcom/daaw/or2;->t:J

    sub-long v10, v1, v8

    invoke-virtual {v5}, Lcom/daaw/vr2;->e()J

    move-result-wide v12

    invoke-virtual {v5}, Lcom/daaw/vr2;->f()J

    move-result-wide v14

    invoke-static/range {v10 .. v15}, Lcom/daaw/pz2;->j(JJJ)J

    move-result-wide v1

    add-long/2addr v1, v6

    goto :goto_9

    :cond_d
    iget-wide v5, v0, Lcom/daaw/or2;->s:J

    iget-object v7, v0, Lcom/daaw/or2;->r:Lcom/daaw/fq2;

    iget v7, v7, Lcom/daaw/fq2;->a:F

    float-to-double v7, v7

    iget-wide v9, v0, Lcom/daaw/or2;->t:J

    sub-long/2addr v1, v9

    long-to-double v1, v1

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v7, v7, v1

    double-to-long v1, v7

    add-long/2addr v1, v5

    :goto_9
    add-long/2addr v3, v1

    return-wide v3

    :cond_e
    const-wide/high16 v1, -0x8000000000000000L

    return-wide v1
.end method

.method public final c()Lcom/daaw/fq2;
    .locals 1

    iget-object v0, p0, Lcom/daaw/or2;->r:Lcom/daaw/fq2;

    return-object v0
.end method

.method public final d(Lcom/daaw/fq2;)Lcom/daaw/fq2;
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/or2;->n:Z

    if-eqz v0, :cond_0

    sget-object p1, Lcom/daaw/fq2;->d:Lcom/daaw/fq2;

    iput-object p1, p0, Lcom/daaw/or2;->r:Lcom/daaw/fq2;

    return-object p1

    :cond_0
    new-instance v0, Lcom/daaw/fq2;

    iget-object v1, p0, Lcom/daaw/or2;->b:Lcom/daaw/vr2;

    iget p1, p1, Lcom/daaw/fq2;->a:F

    invoke-virtual {v1, p1}, Lcom/daaw/vr2;->d(F)F

    move-result p1

    iget-object v1, p0, Lcom/daaw/or2;->b:Lcom/daaw/vr2;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2}, Lcom/daaw/vr2;->c(F)F

    invoke-direct {v0, p1, v2}, Lcom/daaw/fq2;-><init>(FF)V

    iget-object p1, p0, Lcom/daaw/or2;->q:Lcom/daaw/fq2;

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/daaw/or2;->h:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/daaw/or2;->h:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/mr2;

    invoke-static {p1}, Lcom/daaw/mr2;->c(Lcom/daaw/mr2;)Lcom/daaw/fq2;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/or2;->r:Lcom/daaw/fq2;

    :cond_2
    :goto_0
    invoke-virtual {v0, p1}, Lcom/daaw/fq2;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p0}, Lcom/daaw/or2;->x()Z

    move-result p1

    if-eqz p1, :cond_3

    iput-object v0, p0, Lcom/daaw/or2;->q:Lcom/daaw/fq2;

    goto :goto_1

    :cond_3
    iput-object v0, p0, Lcom/daaw/or2;->r:Lcom/daaw/fq2;

    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/daaw/or2;->r:Lcom/daaw/fq2;

    return-object p1
.end method

.method public final e(Ljava/lang/String;IIII[I)V
    .locals 6

    invoke-static {p4, p2}, Lcom/daaw/pz2;->i(II)I

    move-result p1

    iput p1, p0, Lcom/daaw/or2;->B:I

    iget-object p1, p0, Lcom/daaw/or2;->a:Lcom/daaw/pr2;

    invoke-virtual {p1, p6}, Lcom/daaw/pr2;->c([I)V

    iget-object p1, p0, Lcom/daaw/or2;->c:[Lcom/daaw/qq2;

    const/4 p5, 0x0

    const/4 p6, 0x0

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x3

    const/4 v2, 0x2

    if-ge p6, v1, :cond_1

    aget-object v1, p1, p6

    :try_start_0
    invoke-interface {v1, p3, p2, p4}, Lcom/daaw/qq2;->b(III)Z

    move-result v3
    :try_end_0
    .catch Lcom/daaw/pq2; {:try_start_0 .. :try_end_0} :catch_0

    or-int/2addr v0, v3

    invoke-interface {v1}, Lcom/daaw/qq2;->zzi()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Lcom/daaw/qq2;->zza()I

    move-result p2

    invoke-interface {v1}, Lcom/daaw/qq2;->zzb()I

    const/4 p4, 0x2

    :cond_0
    add-int/lit8 p6, p6, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance p2, Lcom/daaw/ir2;

    invoke-direct {p2, p1}, Lcom/daaw/ir2;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/daaw/or2;->t()V

    :cond_2
    const/16 p1, 0xfc

    packed-switch p2, :pswitch_data_0

    new-instance p1, Lcom/daaw/ir2;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Unsupported channel count: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/daaw/ir2;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    sget p6, Lcom/daaw/jp2;->a:I

    goto :goto_1

    :pswitch_1
    const/16 p6, 0x4fc

    goto :goto_1

    :pswitch_2
    const/16 p6, 0xfc

    goto :goto_1

    :pswitch_3
    const/16 p6, 0xdc

    goto :goto_1

    :pswitch_4
    const/16 p6, 0xcc

    goto :goto_1

    :pswitch_5
    const/16 p6, 0x1c

    goto :goto_1

    :pswitch_6
    const/16 p6, 0xc

    goto :goto_1

    :pswitch_7
    const/4 p6, 0x4

    :goto_1
    sget v3, Lcom/daaw/pz2;->a:I

    const/16 v4, 0x17

    if-gt v3, v4, :cond_4

    sget-object v4, Lcom/daaw/pz2;->b:Ljava/lang/String;

    const-string v5, "foster"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    sget-object v4, Lcom/daaw/pz2;->c:Ljava/lang/String;

    const-string v5, "NVIDIA"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    if-eq p2, v1, :cond_5

    const/4 v1, 0x5

    if-eq p2, v1, :cond_5

    const/4 p1, 0x7

    if-eq p2, p1, :cond_3

    goto :goto_2

    :cond_3
    sget p1, Lcom/daaw/jp2;->a:I

    goto :goto_3

    :cond_4
    :goto_2
    move p1, p6

    :cond_5
    :goto_3
    const/16 p6, 0x19

    if-gt v3, p6, :cond_6

    sget-object p6, Lcom/daaw/pz2;->b:Ljava/lang/String;

    const-string v1, "fugu"

    invoke-virtual {v1, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p6

    :cond_6
    if-nez v0, :cond_8

    invoke-virtual {p0}, Lcom/daaw/or2;->x()Z

    move-result p6

    if-eqz p6, :cond_8

    iget p6, p0, Lcom/daaw/or2;->l:I

    if-ne p6, p4, :cond_8

    iget p6, p0, Lcom/daaw/or2;->j:I

    if-ne p6, p3, :cond_8

    iget p6, p0, Lcom/daaw/or2;->k:I

    if-eq p6, p1, :cond_7

    goto :goto_4

    :cond_7
    return-void

    :cond_8
    :goto_4
    invoke-virtual {p0}, Lcom/daaw/or2;->k()V

    iput p4, p0, Lcom/daaw/or2;->l:I

    iput-boolean p5, p0, Lcom/daaw/or2;->n:Z

    iput p3, p0, Lcom/daaw/or2;->j:I

    iput p1, p0, Lcom/daaw/or2;->k:I

    iput v2, p0, Lcom/daaw/or2;->m:I

    invoke-static {v2, p2}, Lcom/daaw/pz2;->i(II)I

    move-result p2

    iput p2, p0, Lcom/daaw/or2;->E:I

    iget p2, p0, Lcom/daaw/or2;->m:I

    invoke-static {p3, p1, p2}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    move-result p1

    const/4 p2, -0x2

    if-eq p1, p2, :cond_9

    const/4 p5, 0x1

    :cond_9
    invoke-static {p5}, Lcom/daaw/az2;->e(Z)V

    mul-int/lit8 p2, p1, 0x4

    const-wide/32 p3, 0x3d090

    invoke-virtual {p0, p3, p4}, Lcom/daaw/or2;->p(J)J

    move-result-wide p3

    iget p5, p0, Lcom/daaw/or2;->E:I

    long-to-int p4, p3

    mul-int p4, p4, p5

    int-to-long v0, p1

    const-wide/32 v2, 0xb71b0

    invoke-virtual {p0, v2, v3}, Lcom/daaw/or2;->p(J)J

    move-result-wide v2

    int-to-long p5, p5

    mul-long v2, v2, p5

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p5

    long-to-int p1, p5

    if-ge p2, p4, :cond_a

    move p2, p4

    goto :goto_5

    :cond_a
    if-le p2, p1, :cond_b

    move p2, p1

    :cond_b
    :goto_5
    iput p2, p0, Lcom/daaw/or2;->o:I

    iget p1, p0, Lcom/daaw/or2;->E:I

    div-int/2addr p2, p1

    int-to-long p1, p2

    invoke-virtual {p0, p1, p2}, Lcom/daaw/or2;->q(J)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/daaw/or2;->p:J

    iget-object p1, p0, Lcom/daaw/or2;->r:Lcom/daaw/fq2;

    invoke-virtual {p0, p1}, Lcom/daaw/or2;->d(Lcom/daaw/fq2;)Lcom/daaw/fq2;

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f()V
    .locals 2

    iget v0, p0, Lcom/daaw/or2;->I:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    iput v0, p0, Lcom/daaw/or2;->I:I

    :cond_0
    return-void
.end method

.method public final g()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/or2;->V:Z

    invoke-virtual {p0}, Lcom/daaw/or2;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/or2;->u()V

    iget-object v0, p0, Lcom/daaw/or2;->g:Lcom/daaw/gr2;

    invoke-virtual {v0}, Lcom/daaw/gr2;->f()V

    :cond_0
    return-void
.end method

.method public final h()V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/or2;->V:Z

    invoke-virtual {p0}, Lcom/daaw/or2;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    iput-wide v0, p0, Lcom/daaw/or2;->K:J

    iget-object v0, p0, Lcom/daaw/or2;->i:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    :cond_0
    return-void
.end method

.method public final i()V
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/or2;->U:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/or2;->x()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/or2;->w()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/or2;->g:Lcom/daaw/gr2;

    invoke-virtual {p0}, Lcom/daaw/or2;->r()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/gr2;->e(J)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/or2;->U:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public final j()V
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/or2;->k()V

    iget-object v0, p0, Lcom/daaw/or2;->c:[Lcom/daaw/qq2;

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x3

    if-ge v2, v3, :cond_0

    aget-object v3, v0, v2

    invoke-interface {v3}, Lcom/daaw/qq2;->zzg()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iput v1, p0, Lcom/daaw/or2;->W:I

    iput-boolean v1, p0, Lcom/daaw/or2;->V:Z

    return-void
.end method

.method public final k()V
    .locals 7

    invoke-virtual {p0}, Lcom/daaw/or2;->x()Z

    move-result v0

    if-eqz v0, :cond_4

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/or2;->C:J

    iput-wide v0, p0, Lcom/daaw/or2;->D:J

    iput-wide v0, p0, Lcom/daaw/or2;->F:J

    iput-wide v0, p0, Lcom/daaw/or2;->G:J

    const/4 v2, 0x0

    iput v2, p0, Lcom/daaw/or2;->H:I

    iget-object v3, p0, Lcom/daaw/or2;->q:Lcom/daaw/fq2;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    iput-object v3, p0, Lcom/daaw/or2;->r:Lcom/daaw/fq2;

    iput-object v4, p0, Lcom/daaw/or2;->q:Lcom/daaw/fq2;

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/daaw/or2;->h:Ljava/util/LinkedList;

    invoke-virtual {v3}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, p0, Lcom/daaw/or2;->h:Ljava/util/LinkedList;

    invoke-virtual {v3}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/mr2;

    invoke-static {v3}, Lcom/daaw/mr2;->c(Lcom/daaw/mr2;)Lcom/daaw/fq2;

    move-result-object v3

    iput-object v3, p0, Lcom/daaw/or2;->r:Lcom/daaw/fq2;

    :cond_1
    :goto_0
    iget-object v3, p0, Lcom/daaw/or2;->h:Ljava/util/LinkedList;

    invoke-virtual {v3}, Ljava/util/LinkedList;->clear()V

    iput-wide v0, p0, Lcom/daaw/or2;->s:J

    iput-wide v0, p0, Lcom/daaw/or2;->t:J

    iput-object v4, p0, Lcom/daaw/or2;->P:Ljava/nio/ByteBuffer;

    iput-object v4, p0, Lcom/daaw/or2;->Q:Ljava/nio/ByteBuffer;

    const/4 v3, 0x0

    :goto_1
    iget-object v5, p0, Lcom/daaw/or2;->N:[Lcom/daaw/qq2;

    array-length v6, v5

    if-ge v3, v6, :cond_2

    aget-object v5, v5, v3

    invoke-interface {v5}, Lcom/daaw/qq2;->zzd()V

    iget-object v6, p0, Lcom/daaw/or2;->O:[Ljava/nio/ByteBuffer;

    invoke-interface {v5}, Lcom/daaw/qq2;->zzc()Ljava/nio/ByteBuffer;

    move-result-object v5

    aput-object v5, v6, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    iput-boolean v2, p0, Lcom/daaw/or2;->U:Z

    const/4 v3, -0x1

    iput v3, p0, Lcom/daaw/or2;->T:I

    iput v2, p0, Lcom/daaw/or2;->I:I

    iput-wide v0, p0, Lcom/daaw/or2;->L:J

    invoke-virtual {p0}, Lcom/daaw/or2;->u()V

    iget-object v0, p0, Lcom/daaw/or2;->i:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/daaw/or2;->i:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    :cond_3
    iget-object v0, p0, Lcom/daaw/or2;->i:Landroid/media/AudioTrack;

    iput-object v4, p0, Lcom/daaw/or2;->i:Landroid/media/AudioTrack;

    iget-object v1, p0, Lcom/daaw/or2;->g:Lcom/daaw/gr2;

    invoke-virtual {v1, v4, v2}, Lcom/daaw/gr2;->g(Landroid/media/AudioTrack;Z)V

    iget-object v1, p0, Lcom/daaw/or2;->e:Landroid/os/ConditionVariable;

    invoke-virtual {v1}, Landroid/os/ConditionVariable;->close()V

    new-instance v1, Lcom/daaw/er2;

    invoke-direct {v1, p0, v0}, Lcom/daaw/er2;-><init>(Lcom/daaw/or2;Landroid/media/AudioTrack;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    :cond_4
    return-void
.end method

.method public final l(F)V
    .locals 1

    iget v0, p0, Lcom/daaw/or2;->M:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Lcom/daaw/or2;->M:F

    invoke-virtual {p0}, Lcom/daaw/or2;->v()V

    :cond_0
    return-void
.end method

.method public final m(Ljava/nio/ByteBuffer;J)Z
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-wide/from16 v2, p2

    iget-object v4, v1, Lcom/daaw/or2;->P:Ljava/nio/ByteBuffer;

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_1

    if-ne v0, v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v4, 0x1

    :goto_1
    invoke-static {v4}, Lcom/daaw/az2;->c(Z)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/or2;->x()Z

    move-result v4

    const/4 v7, 0x0

    if-nez v4, :cond_5

    iget-object v4, v1, Lcom/daaw/or2;->e:Landroid/os/ConditionVariable;

    invoke-virtual {v4}, Landroid/os/ConditionVariable;->block()V

    iget v15, v1, Lcom/daaw/or2;->W:I

    new-instance v4, Landroid/media/AudioTrack;

    const/4 v9, 0x3

    iget v10, v1, Lcom/daaw/or2;->j:I

    iget v11, v1, Lcom/daaw/or2;->k:I

    iget v12, v1, Lcom/daaw/or2;->m:I

    iget v13, v1, Lcom/daaw/or2;->o:I

    const/4 v14, 0x1

    move-object v8, v4

    if-nez v15, :cond_2

    invoke-direct/range {v8 .. v14}, Landroid/media/AudioTrack;-><init>(IIIIII)V

    goto :goto_2

    :cond_2
    invoke-direct/range {v8 .. v15}, Landroid/media/AudioTrack;-><init>(IIIIIII)V

    :goto_2
    iput-object v4, v1, Lcom/daaw/or2;->i:Landroid/media/AudioTrack;

    iget-object v4, v1, Lcom/daaw/or2;->i:Landroid/media/AudioTrack;

    invoke-virtual {v4}, Landroid/media/AudioTrack;->getState()I

    move-result v4

    if-ne v4, v6, :cond_4

    iget-object v4, v1, Lcom/daaw/or2;->i:Landroid/media/AudioTrack;

    invoke-virtual {v4}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result v4

    iget v8, v1, Lcom/daaw/or2;->W:I

    if-eq v8, v4, :cond_3

    iput v4, v1, Lcom/daaw/or2;->W:I

    iget-object v8, v1, Lcom/daaw/or2;->d:Lcom/daaw/kr2;

    check-cast v8, Lcom/daaw/rr2;

    iget-object v8, v8, Lcom/daaw/rr2;->a:Lcom/daaw/sr2;

    invoke-static {v8}, Lcom/daaw/sr2;->O(Lcom/daaw/sr2;)Lcom/daaw/xq2;

    move-result-object v8

    invoke-virtual {v8, v4}, Lcom/daaw/xq2;->b(I)V

    :cond_3
    iget-object v4, v1, Lcom/daaw/or2;->g:Lcom/daaw/gr2;

    iget-object v8, v1, Lcom/daaw/or2;->i:Landroid/media/AudioTrack;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/or2;->y()Z

    move-result v9

    invoke-virtual {v4, v8, v9}, Lcom/daaw/gr2;->g(Landroid/media/AudioTrack;Z)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/or2;->v()V

    iput-boolean v5, v1, Lcom/daaw/or2;->X:Z

    iget-boolean v4, v1, Lcom/daaw/or2;->V:Z

    if-eqz v4, :cond_5

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/or2;->h()V

    goto :goto_4

    :cond_4
    :try_start_0
    iget-object v0, v1, Lcom/daaw/or2;->i:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    iput-object v7, v1, Lcom/daaw/or2;->i:Landroid/media/AudioTrack;

    throw v0

    :catch_0
    :goto_3
    iput-object v7, v1, Lcom/daaw/or2;->i:Landroid/media/AudioTrack;

    new-instance v0, Lcom/daaw/jr2;

    iget v2, v1, Lcom/daaw/or2;->j:I

    iget v3, v1, Lcom/daaw/or2;->k:I

    iget v5, v1, Lcom/daaw/or2;->o:I

    invoke-direct {v0, v4, v2, v3, v5}, Lcom/daaw/jr2;-><init>(IIII)V

    throw v0

    :cond_5
    :goto_4
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/or2;->y()Z

    move-result v4

    const-wide/16 v8, 0x0

    const/4 v10, 0x2

    if-eqz v4, :cond_8

    iget-object v4, v1, Lcom/daaw/or2;->i:Landroid/media/AudioTrack;

    invoke-virtual {v4}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v4

    if-ne v4, v10, :cond_6

    iput-boolean v5, v1, Lcom/daaw/or2;->X:Z

    return v5

    :cond_6
    iget-object v4, v1, Lcom/daaw/or2;->i:Landroid/media/AudioTrack;

    invoke-virtual {v4}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v4

    if-ne v4, v6, :cond_8

    iget-object v4, v1, Lcom/daaw/or2;->g:Lcom/daaw/gr2;

    invoke-virtual {v4}, Lcom/daaw/gr2;->a()J

    move-result-wide v11

    cmp-long v4, v11, v8

    if-nez v4, :cond_7

    goto :goto_5

    :cond_7
    return v5

    :cond_8
    :goto_5
    iget-boolean v4, v1, Lcom/daaw/or2;->X:Z

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/or2;->n()Z

    move-result v11

    iput-boolean v11, v1, Lcom/daaw/or2;->X:Z

    if-eqz v4, :cond_9

    if-nez v11, :cond_9

    iget-object v4, v1, Lcom/daaw/or2;->i:Landroid/media/AudioTrack;

    invoke-virtual {v4}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v4

    if-eq v4, v6, :cond_9

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v11

    iget-wide v13, v1, Lcom/daaw/or2;->Y:J

    iget-object v4, v1, Lcom/daaw/or2;->d:Lcom/daaw/kr2;

    iget v15, v1, Lcom/daaw/or2;->o:I

    iget-wide v7, v1, Lcom/daaw/or2;->p:J

    invoke-static {v7, v8}, Lcom/daaw/jp2;->b(J)J

    move-result-wide v17

    check-cast v4, Lcom/daaw/rr2;

    iget-object v4, v4, Lcom/daaw/rr2;->a:Lcom/daaw/sr2;

    invoke-static {v4}, Lcom/daaw/sr2;->O(Lcom/daaw/sr2;)Lcom/daaw/xq2;

    move-result-object v4

    sub-long v19, v11, v13

    move v7, v15

    move-object v15, v4

    move/from16 v16, v7

    invoke-virtual/range {v15 .. v20}, Lcom/daaw/xq2;->c(IJJ)V

    :cond_9
    iget-object v4, v1, Lcom/daaw/or2;->P:Ljava/nio/ByteBuffer;

    if-nez v4, :cond_17

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v4

    if-nez v4, :cond_a

    return v6

    :cond_a
    iget-boolean v4, v1, Lcom/daaw/or2;->n:Z

    if-eqz v4, :cond_f

    iget v4, v1, Lcom/daaw/or2;->H:I

    if-nez v4, :cond_f

    iget v4, v1, Lcom/daaw/or2;->m:I

    const/4 v7, 0x7

    const/4 v8, 0x5

    const/4 v9, 0x6

    if-eq v4, v7, :cond_e

    const/16 v7, 0x8

    if-ne v4, v7, :cond_b

    goto :goto_6

    :cond_b
    if-ne v4, v8, :cond_c

    sget v4, Lcom/daaw/nq2;->d:I

    const/16 v4, 0x600

    goto :goto_7

    :cond_c
    if-ne v4, v9, :cond_d

    invoke-static/range {p1 .. p1}, Lcom/daaw/nq2;->a(Ljava/nio/ByteBuffer;)I

    move-result v4

    goto :goto_7

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected audio encoding: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    :goto_6
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v4

    add-int/lit8 v7, v4, 0x4

    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    and-int/2addr v7, v6

    shl-int/2addr v7, v9

    add-int/2addr v4, v8

    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v4

    and-int/lit16 v4, v4, 0xfc

    shr-int/2addr v4, v10

    or-int/2addr v4, v7

    add-int/2addr v4, v6

    mul-int/lit8 v4, v4, 0x20

    :goto_7
    iput v4, v1, Lcom/daaw/or2;->H:I

    :cond_f
    iget-object v4, v1, Lcom/daaw/or2;->q:Lcom/daaw/fq2;

    if-eqz v4, :cond_11

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/or2;->w()Z

    move-result v4

    if-nez v4, :cond_10

    return v5

    :cond_10
    iget-object v4, v1, Lcom/daaw/or2;->h:Ljava/util/LinkedList;

    new-instance v7, Lcom/daaw/mr2;

    iget-object v12, v1, Lcom/daaw/or2;->q:Lcom/daaw/fq2;

    const-wide/16 v8, 0x0

    invoke-static {v8, v9, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v13

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/or2;->r()J

    move-result-wide v8

    invoke-virtual {v1, v8, v9}, Lcom/daaw/or2;->q(J)J

    move-result-wide v15

    const/16 v17, 0x0

    move-object v11, v7

    invoke-direct/range {v11 .. v17}, Lcom/daaw/mr2;-><init>(Lcom/daaw/fq2;JJLcom/daaw/lr2;)V

    invoke-virtual {v4, v7}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    iput-object v4, v1, Lcom/daaw/or2;->q:Lcom/daaw/fq2;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/or2;->t()V

    :cond_11
    iget v4, v1, Lcom/daaw/or2;->I:I

    if-nez v4, :cond_12

    const-wide/16 v7, 0x0

    invoke-static {v7, v8, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    iput-wide v7, v1, Lcom/daaw/or2;->J:J

    iput v6, v1, Lcom/daaw/or2;->I:I

    goto :goto_9

    :cond_12
    iget-wide v7, v1, Lcom/daaw/or2;->J:J

    iget-boolean v4, v1, Lcom/daaw/or2;->n:Z

    if-eqz v4, :cond_13

    iget-wide v11, v1, Lcom/daaw/or2;->D:J

    goto :goto_8

    :cond_13
    iget-wide v11, v1, Lcom/daaw/or2;->C:J

    iget v4, v1, Lcom/daaw/or2;->B:I

    int-to-long v13, v4

    div-long/2addr v11, v13

    :goto_8
    invoke-virtual {v1, v11, v12}, Lcom/daaw/or2;->q(J)J

    move-result-wide v11

    add-long/2addr v7, v11

    iget v4, v1, Lcom/daaw/or2;->I:I

    if-ne v4, v6, :cond_14

    sub-long v11, v7, v2

    invoke-static {v11, v12}, Ljava/lang/Math;->abs(J)J

    move-result-wide v11

    const-wide/32 v13, 0x30d40

    cmp-long v4, v11, v13

    if-lez v4, :cond_14

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Discontinuity detected [expected "

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v9, ", got "

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v9, "]"

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iput v10, v1, Lcom/daaw/or2;->I:I

    :cond_14
    iget v4, v1, Lcom/daaw/or2;->I:I

    if-ne v4, v10, :cond_15

    iget-wide v9, v1, Lcom/daaw/or2;->J:J

    sub-long v7, v2, v7

    add-long/2addr v9, v7

    iput-wide v9, v1, Lcom/daaw/or2;->J:J

    iput v6, v1, Lcom/daaw/or2;->I:I

    iget-object v4, v1, Lcom/daaw/or2;->d:Lcom/daaw/kr2;

    check-cast v4, Lcom/daaw/rr2;

    iget-object v4, v4, Lcom/daaw/rr2;->a:Lcom/daaw/sr2;

    invoke-static {v4, v6}, Lcom/daaw/sr2;->P(Lcom/daaw/sr2;Z)V

    :cond_15
    :goto_9
    iget-boolean v4, v1, Lcom/daaw/or2;->n:Z

    if-eqz v4, :cond_16

    iget-wide v7, v1, Lcom/daaw/or2;->D:J

    iget v4, v1, Lcom/daaw/or2;->H:I

    int-to-long v9, v4

    add-long/2addr v7, v9

    iput-wide v7, v1, Lcom/daaw/or2;->D:J

    goto :goto_a

    :cond_16
    iget-wide v7, v1, Lcom/daaw/or2;->C:J

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v4

    int-to-long v9, v4

    add-long/2addr v7, v9

    iput-wide v7, v1, Lcom/daaw/or2;->C:J

    :goto_a
    iput-object v0, v1, Lcom/daaw/or2;->P:Ljava/nio/ByteBuffer;

    :cond_17
    iget-boolean v0, v1, Lcom/daaw/or2;->n:Z

    if-eqz v0, :cond_18

    iget-object v0, v1, Lcom/daaw/or2;->P:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0, v2, v3}, Lcom/daaw/or2;->z(Ljava/nio/ByteBuffer;J)Z

    goto :goto_b

    :cond_18
    invoke-virtual {v1, v2, v3}, Lcom/daaw/or2;->s(J)V

    :goto_b
    iget-object v0, v1, Lcom/daaw/or2;->P:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_19

    const/4 v2, 0x0

    iput-object v2, v1, Lcom/daaw/or2;->P:Ljava/nio/ByteBuffer;

    return v6

    :cond_19
    return v5
.end method

.method public final n()Z
    .locals 7

    invoke-virtual {p0}, Lcom/daaw/or2;->x()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/or2;->r()J

    move-result-wide v3

    iget-object v0, p0, Lcom/daaw/or2;->g:Lcom/daaw/gr2;

    invoke-virtual {v0}, Lcom/daaw/gr2;->a()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-gtz v0, :cond_2

    invoke-virtual {p0}, Lcom/daaw/or2;->y()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/or2;->i:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    iget-object v0, p0, Lcom/daaw/or2;->i:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlaybackHeadPosition()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    :cond_2
    return v1
.end method

.method public final o()Z
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/or2;->x()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/daaw/or2;->U:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/daaw/or2;->n()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public final p(J)J
    .locals 2

    iget v0, p0, Lcom/daaw/or2;->j:I

    int-to-long v0, v0

    mul-long p1, p1, v0

    const-wide/32 v0, 0xf4240

    div-long/2addr p1, v0

    return-wide p1
.end method

.method public final q(J)J
    .locals 2

    const-wide/32 v0, 0xf4240

    mul-long p1, p1, v0

    iget v0, p0, Lcom/daaw/or2;->j:I

    int-to-long v0, v0

    div-long/2addr p1, v0

    return-wide p1
.end method

.method public final r()J
    .locals 4

    iget-boolean v0, p0, Lcom/daaw/or2;->n:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/daaw/or2;->G:J

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lcom/daaw/or2;->F:J

    iget v2, p0, Lcom/daaw/or2;->E:I

    int-to-long v2, v2

    div-long/2addr v0, v2

    :goto_0
    return-wide v0
.end method

.method public final s(J)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/or2;->N:[Lcom/daaw/qq2;

    array-length v0, v0

    move v1, v0

    :goto_0
    if-ltz v1, :cond_5

    if-lez v1, :cond_0

    iget-object v2, p0, Lcom/daaw/or2;->O:[Ljava/nio/ByteBuffer;

    add-int/lit8 v3, v1, -0x1

    aget-object v2, v2, v3

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lcom/daaw/or2;->P:Ljava/nio/ByteBuffer;

    if-nez v2, :cond_1

    sget-object v2, Lcom/daaw/qq2;->a:Ljava/nio/ByteBuffer;

    :cond_1
    :goto_1
    if-ne v1, v0, :cond_2

    invoke-virtual {p0, v2, p1, p2}, Lcom/daaw/or2;->z(Ljava/nio/ByteBuffer;J)Z

    goto :goto_2

    :cond_2
    iget-object v3, p0, Lcom/daaw/or2;->N:[Lcom/daaw/qq2;

    aget-object v3, v3, v1

    invoke-interface {v3, v2}, Lcom/daaw/qq2;->a(Ljava/nio/ByteBuffer;)V

    invoke-interface {v3}, Lcom/daaw/qq2;->zzc()Ljava/nio/ByteBuffer;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/or2;->O:[Ljava/nio/ByteBuffer;

    aput-object v3, v4, v1

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v3

    if-eqz v3, :cond_3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v2

    if-eqz v2, :cond_4

    return-void

    :cond_4
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_5
    return-void
.end method

.method public final t()V
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/daaw/or2;->c:[Lcom/daaw/qq2;

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x3

    if-ge v3, v4, :cond_1

    aget-object v4, v1, v3

    invoke-interface {v4}, Lcom/daaw/qq2;->zzi()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-interface {v4}, Lcom/daaw/qq2;->zzd()V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v3, v1, [Lcom/daaw/qq2;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/qq2;

    iput-object v0, p0, Lcom/daaw/or2;->N:[Lcom/daaw/qq2;

    new-array v0, v1, [Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/daaw/or2;->O:[Ljava/nio/ByteBuffer;

    :goto_2
    if-ge v2, v1, :cond_2

    iget-object v0, p0, Lcom/daaw/or2;->N:[Lcom/daaw/qq2;

    aget-object v0, v0, v2

    invoke-interface {v0}, Lcom/daaw/qq2;->zzd()V

    iget-object v3, p0, Lcom/daaw/or2;->O:[Ljava/nio/ByteBuffer;

    invoke-interface {v0}, Lcom/daaw/qq2;->zzc()Ljava/nio/ByteBuffer;

    move-result-object v0

    aput-object v0, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final u()V
    .locals 3

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/or2;->w:J

    const/4 v2, 0x0

    iput v2, p0, Lcom/daaw/or2;->v:I

    iput v2, p0, Lcom/daaw/or2;->u:I

    iput-wide v0, p0, Lcom/daaw/or2;->x:J

    iput-boolean v2, p0, Lcom/daaw/or2;->y:Z

    iput-wide v0, p0, Lcom/daaw/or2;->z:J

    return-void
.end method

.method public final v()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/or2;->x()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget v0, Lcom/daaw/pz2;->a:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/daaw/or2;->i:Landroid/media/AudioTrack;

    iget v1, p0, Lcom/daaw/or2;->M:F

    invoke-virtual {v0, v1}, Landroid/media/AudioTrack;->setVolume(F)I

    return-void

    :cond_1
    iget-object v0, p0, Lcom/daaw/or2;->i:Landroid/media/AudioTrack;

    iget v1, p0, Lcom/daaw/or2;->M:F

    invoke-virtual {v0, v1, v1}, Landroid/media/AudioTrack;->setStereoVolume(FF)I

    return-void
.end method

.method public final w()Z
    .locals 9

    iget v0, p0, Lcom/daaw/or2;->T:I

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lcom/daaw/or2;->n:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/or2;->N:[Lcom/daaw/qq2;

    array-length v0, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput v0, p0, Lcom/daaw/or2;->T:I

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iget v4, p0, Lcom/daaw/or2;->T:I

    iget-object v5, p0, Lcom/daaw/or2;->N:[Lcom/daaw/qq2;

    array-length v6, v5

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    if-ge v4, v6, :cond_4

    aget-object v4, v5, v4

    if-eqz v0, :cond_2

    invoke-interface {v4}, Lcom/daaw/qq2;->zze()V

    :cond_2
    invoke-virtual {p0, v7, v8}, Lcom/daaw/or2;->s(J)V

    invoke-interface {v4}, Lcom/daaw/qq2;->zzj()Z

    move-result v0

    if-nez v0, :cond_3

    return v3

    :cond_3
    iget v0, p0, Lcom/daaw/or2;->T:I

    add-int/2addr v0, v2

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/daaw/or2;->Q:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_5

    invoke-virtual {p0, v0, v7, v8}, Lcom/daaw/or2;->z(Ljava/nio/ByteBuffer;J)Z

    iget-object v0, p0, Lcom/daaw/or2;->Q:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_5

    return v3

    :cond_5
    iput v1, p0, Lcom/daaw/or2;->T:I

    return v2
.end method

.method public final x()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/or2;->i:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final y()Z
    .locals 4

    sget v0, Lcom/daaw/pz2;->a:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, 0x17

    if-ge v0, v3, :cond_1

    iget v0, p0, Lcom/daaw/or2;->m:I

    const/4 v3, 0x5

    if-eq v0, v3, :cond_2

    const/4 v3, 0x6

    if-eq v0, v3, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    :cond_2
    return v1
.end method

.method public final z(Ljava/nio/ByteBuffer;J)Z
    .locals 9

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result p2

    const/4 p3, 0x1

    if-nez p2, :cond_0

    return p3

    :cond_0
    iget-object p2, p0, Lcom/daaw/or2;->Q:Ljava/nio/ByteBuffer;

    const/16 v0, 0x15

    const/4 v1, 0x0

    if-eqz p2, :cond_2

    if-ne p2, p1, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    invoke-static {p2}, Lcom/daaw/az2;->c(Z)V

    goto :goto_1

    :cond_2
    iput-object p1, p0, Lcom/daaw/or2;->Q:Ljava/nio/ByteBuffer;

    sget p2, Lcom/daaw/pz2;->a:I

    if-ge p2, v0, :cond_5

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result p2

    iget-object v2, p0, Lcom/daaw/or2;->R:[B

    if-eqz v2, :cond_3

    array-length v2, v2

    if-ge v2, p2, :cond_4

    :cond_3
    new-array v2, p2, [B

    iput-object v2, p0, Lcom/daaw/or2;->R:[B

    :cond_4
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v2

    iget-object v3, p0, Lcom/daaw/or2;->R:[B

    invoke-virtual {p1, v3, v1, p2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iput v1, p0, Lcom/daaw/or2;->S:I

    :cond_5
    :goto_1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result p2

    sget v2, Lcom/daaw/pz2;->a:I

    if-ge v2, v0, :cond_7

    iget-wide v2, p0, Lcom/daaw/or2;->F:J

    iget-object v0, p0, Lcom/daaw/or2;->g:Lcom/daaw/gr2;

    invoke-virtual {v0}, Lcom/daaw/gr2;->a()J

    move-result-wide v4

    iget v0, p0, Lcom/daaw/or2;->E:I

    iget v6, p0, Lcom/daaw/or2;->o:I

    int-to-long v7, v0

    mul-long v4, v4, v7

    sub-long/2addr v2, v4

    long-to-int v0, v2

    sub-int/2addr v6, v0

    if-lez v6, :cond_6

    invoke-static {p2, v6}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v2, p0, Lcom/daaw/or2;->i:Landroid/media/AudioTrack;

    iget-object v3, p0, Lcom/daaw/or2;->R:[B

    iget v4, p0, Lcom/daaw/or2;->S:I

    invoke-virtual {v2, v3, v4, v0}, Landroid/media/AudioTrack;->write([BII)I

    move-result v0

    if-lez v0, :cond_8

    iget v2, p0, Lcom/daaw/or2;->S:I

    add-int/2addr v2, v0

    iput v2, p0, Lcom/daaw/or2;->S:I

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_2

    :cond_6
    const/4 v0, 0x0

    goto :goto_2

    :cond_7
    iget-object v0, p0, Lcom/daaw/or2;->i:Landroid/media/AudioTrack;

    invoke-virtual {v0, p1, p2, p3}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    move-result v0

    :cond_8
    :goto_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/daaw/or2;->Y:J

    if-ltz v0, :cond_c

    iget-boolean p1, p0, Lcom/daaw/or2;->n:Z

    if-nez p1, :cond_9

    iget-wide v2, p0, Lcom/daaw/or2;->F:J

    int-to-long v4, v0

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/daaw/or2;->F:J

    :cond_9
    if-ne v0, p2, :cond_b

    if-eqz p1, :cond_a

    iget-wide p1, p0, Lcom/daaw/or2;->G:J

    iget v0, p0, Lcom/daaw/or2;->H:I

    int-to-long v0, v0

    add-long/2addr p1, v0

    iput-wide p1, p0, Lcom/daaw/or2;->G:J

    :cond_a
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/or2;->Q:Ljava/nio/ByteBuffer;

    return p3

    :cond_b
    return v1

    :cond_c
    new-instance p1, Lcom/daaw/nr2;

    invoke-direct {p1, v0}, Lcom/daaw/nr2;-><init>(I)V

    throw p1
.end method
