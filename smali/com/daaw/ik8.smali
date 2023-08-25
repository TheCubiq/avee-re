.class public final Lcom/daaw/ik8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public A:J

.field public B:J

.field public C:J

.field public D:Z

.field public E:J

.field public F:J

.field public final a:Lcom/daaw/xj8;

.field public final b:[J

.field public c:Landroid/media/AudioTrack;

.field public d:I

.field public e:I

.field public f:Lcom/daaw/vj8;

.field public g:I

.field public h:Z

.field public i:J

.field public j:F

.field public k:Z

.field public l:J

.field public m:J

.field public n:Ljava/lang/reflect/Method;

.field public o:J

.field public p:Z

.field public q:Z

.field public r:J

.field public s:J

.field public t:J

.field public u:J

.field public v:I

.field public w:I

.field public x:J

.field public y:J

.field public z:J


# direct methods
.method public constructor <init>(Lcom/daaw/xj8;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ik8;->a:Lcom/daaw/xj8;

    sget p1, Lcom/daaw/it5;->a:I

    :try_start_0
    const-class p1, Landroid/media/AudioTrack;

    const-string v0, "getLatency"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ik8;->n:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/16 p1, 0xa

    new-array p1, p1, [J

    iput-object p1, p0, Lcom/daaw/ik8;->b:[J

    return-void
.end method


# virtual methods
.method public final a(J)I
    .locals 6

    invoke-virtual {p0}, Lcom/daaw/ik8;->m()J

    move-result-wide v0

    iget v2, p0, Lcom/daaw/ik8;->d:I

    iget v3, p0, Lcom/daaw/ik8;->e:I

    int-to-long v4, v2

    mul-long v0, v0, v4

    sub-long/2addr p1, v0

    long-to-int p2, p1

    sub-int/2addr v3, p2

    return v3
.end method

.method public final b(Z)J
    .locals 22

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/daaw/ik8;->c:Landroid/media/AudioTrack;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v1

    const/4 v2, 0x3

    const/4 v3, 0x1

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x3e8

    if-ne v1, v2, :cond_7

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik8;->m()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ik8;->l(J)J

    move-result-wide v1

    cmp-long v8, v1, v4

    if-nez v8, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v8

    div-long/2addr v8, v6

    iget-wide v10, v0, Lcom/daaw/ik8;->m:J

    sub-long v10, v8, v10

    const-wide/16 v12, 0x7530

    cmp-long v15, v10, v12

    if-ltz v15, :cond_2

    iget-object v10, v0, Lcom/daaw/ik8;->b:[J

    iget v11, v0, Lcom/daaw/ik8;->v:I

    sub-long v12, v1, v8

    aput-wide v12, v10, v11

    add-int/2addr v11, v3

    const/16 v10, 0xa

    rem-int/2addr v11, v10

    iput v11, v0, Lcom/daaw/ik8;->v:I

    iget v11, v0, Lcom/daaw/ik8;->w:I

    if-ge v11, v10, :cond_1

    add-int/2addr v11, v3

    iput v11, v0, Lcom/daaw/ik8;->w:I

    :cond_1
    iput-wide v8, v0, Lcom/daaw/ik8;->m:J

    iput-wide v4, v0, Lcom/daaw/ik8;->l:J

    const/4 v10, 0x0

    :goto_0
    iget v11, v0, Lcom/daaw/ik8;->w:I

    if-ge v10, v11, :cond_2

    iget-wide v12, v0, Lcom/daaw/ik8;->l:J

    iget-object v15, v0, Lcom/daaw/ik8;->b:[J

    aget-wide v16, v15, v10

    int-to-long v3, v11

    div-long v16, v16, v3

    add-long v12, v12, v16

    iput-wide v12, v0, Lcom/daaw/ik8;->l:J

    add-int/lit8 v10, v10, 0x1

    const/4 v3, 0x1

    const-wide/16 v4, 0x0

    goto :goto_0

    :cond_2
    iget-boolean v3, v0, Lcom/daaw/ik8;->h:Z

    if-nez v3, :cond_7

    iget-object v3, v0, Lcom/daaw/ik8;->f:Lcom/daaw/vj8;

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v8, v9}, Lcom/daaw/vj8;->g(J)Z

    move-result v4

    const-string v5, "DefaultAudioSink"

    const-wide/32 v10, 0x4c4b40

    if-nez v4, :cond_3

    goto/16 :goto_3

    :cond_3
    invoke-virtual {v3}, Lcom/daaw/vj8;->b()J

    move-result-wide v12

    invoke-virtual {v3}, Lcom/daaw/vj8;->a()J

    move-result-wide v6

    sub-long v18, v12, v8

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->abs(J)J

    move-result-wide v18

    const-string v4, ", "

    cmp-long v20, v18, v10

    if-lez v20, :cond_4

    iget-object v15, v0, Lcom/daaw/ik8;->a:Lcom/daaw/xj8;

    check-cast v15, Lcom/daaw/il8;

    iget-object v14, v15, Lcom/daaw/il8;->a:Lcom/daaw/sl8;

    invoke-static {v14}, Lcom/daaw/sl8;->I(Lcom/daaw/sl8;)J

    move-result-wide v10

    iget-object v14, v15, Lcom/daaw/il8;->a:Lcom/daaw/sl8;

    invoke-static {v14}, Lcom/daaw/sl8;->J(Lcom/daaw/sl8;)J

    move-result-wide v14

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v21, v3

    const-string v3, "Spurious audio timestamp (system clock mismatch): "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v5, v0}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {v21 .. v21}, Lcom/daaw/vj8;->d()V

    :goto_2
    move-object/from16 v0, p0

    goto :goto_3

    :cond_4
    move-object/from16 v21, v3

    invoke-virtual {v0, v6, v7}, Lcom/daaw/ik8;->l(J)J

    move-result-wide v10

    sub-long/2addr v10, v1

    invoke-static {v10, v11}, Ljava/lang/Math;->abs(J)J

    move-result-wide v10

    const-wide/32 v14, 0x4c4b40

    cmp-long v3, v10, v14

    if-lez v3, :cond_5

    iget-object v3, v0, Lcom/daaw/ik8;->a:Lcom/daaw/xj8;

    check-cast v3, Lcom/daaw/il8;

    iget-object v10, v3, Lcom/daaw/il8;->a:Lcom/daaw/sl8;

    invoke-static {v10}, Lcom/daaw/sl8;->I(Lcom/daaw/sl8;)J

    move-result-wide v10

    iget-object v3, v3, Lcom/daaw/il8;->a:Lcom/daaw/sl8;

    invoke-static {v3}, Lcom/daaw/sl8;->J(Lcom/daaw/sl8;)J

    move-result-wide v14

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Spurious audio timestamp (frame position mismatch): "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_5
    invoke-virtual/range {v21 .. v21}, Lcom/daaw/vj8;->c()V

    goto :goto_2

    :goto_3
    iget-boolean v1, v0, Lcom/daaw/ik8;->q:Z

    if-eqz v1, :cond_7

    iget-object v1, v0, Lcom/daaw/ik8;->n:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_7

    iget-wide v2, v0, Lcom/daaw/ik8;->r:J

    sub-long v2, v8, v2

    const-wide/32 v6, 0x7a120

    cmp-long v4, v2, v6

    if-ltz v4, :cond_7

    :try_start_0
    iget-object v2, v0, Lcom/daaw/ik8;->c:Landroid/media/AudioTrack;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x0

    :try_start_1
    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    sget v2, Lcom/daaw/it5;->a:I

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v1, v1

    const-wide/16 v3, 0x3e8

    mul-long v1, v1, v3

    iget-wide v3, v0, Lcom/daaw/ik8;->i:J

    sub-long/2addr v1, v3

    iput-wide v1, v0, Lcom/daaw/ik8;->o:J

    const-wide/16 v3, 0x0

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    iput-wide v1, v0, Lcom/daaw/ik8;->o:J

    const-wide/32 v3, 0x4c4b40

    cmp-long v6, v1, v3

    if-lez v6, :cond_6

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Ignoring impossibly large audio latency: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Lcom/daaw/ik8;->o:J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_4

    :catch_0
    const/4 v1, 0x0

    iput-object v1, v0, Lcom/daaw/ik8;->n:Ljava/lang/reflect/Method;

    :cond_6
    :goto_4
    iput-wide v8, v0, Lcom/daaw/ik8;->r:J

    :cond_7
    :goto_5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    iget-object v3, v0, Lcom/daaw/ik8;->f:Lcom/daaw/vj8;

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3}, Lcom/daaw/vj8;->f()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-virtual {v3}, Lcom/daaw/vj8;->a()J

    move-result-wide v5

    invoke-virtual {v0, v5, v6}, Lcom/daaw/ik8;->l(J)J

    move-result-wide v5

    invoke-virtual {v3}, Lcom/daaw/vj8;->b()J

    move-result-wide v7

    sub-long v7, v1, v7

    iget v3, v0, Lcom/daaw/ik8;->j:F

    invoke-static {v7, v8, v3}, Lcom/daaw/it5;->c0(JF)J

    move-result-wide v7

    add-long/2addr v5, v7

    goto :goto_7

    :cond_8
    iget v3, v0, Lcom/daaw/ik8;->w:I

    if-nez v3, :cond_9

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ik8;->m()J

    move-result-wide v5

    invoke-virtual {v0, v5, v6}, Lcom/daaw/ik8;->l(J)J

    move-result-wide v5

    goto :goto_6

    :cond_9
    iget-wide v5, v0, Lcom/daaw/ik8;->l:J

    add-long/2addr v5, v1

    :goto_6
    if-nez p1, :cond_a

    iget-wide v7, v0, Lcom/daaw/ik8;->o:J

    sub-long/2addr v5, v7

    const-wide/16 v7, 0x0

    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    :cond_a
    :goto_7
    iget-boolean v3, v0, Lcom/daaw/ik8;->D:Z

    if-eq v3, v4, :cond_b

    iget-wide v7, v0, Lcom/daaw/ik8;->C:J

    iput-wide v7, v0, Lcom/daaw/ik8;->F:J

    iget-wide v7, v0, Lcom/daaw/ik8;->B:J

    iput-wide v7, v0, Lcom/daaw/ik8;->E:J

    :cond_b
    iget-wide v7, v0, Lcom/daaw/ik8;->F:J

    sub-long v7, v1, v7

    const-wide/32 v9, 0xf4240

    cmp-long v3, v7, v9

    if-gez v3, :cond_c

    const-wide/16 v11, 0x3e8

    mul-long v13, v7, v11

    div-long/2addr v13, v9

    mul-long v5, v5, v13

    sub-long v9, v11, v13

    iget-wide v13, v0, Lcom/daaw/ik8;->E:J

    iget v3, v0, Lcom/daaw/ik8;->j:F

    invoke-static {v7, v8, v3}, Lcom/daaw/it5;->c0(JF)J

    move-result-wide v7

    add-long/2addr v13, v7

    mul-long v9, v9, v13

    add-long/2addr v5, v9

    div-long/2addr v5, v11

    :cond_c
    iget-boolean v3, v0, Lcom/daaw/ik8;->k:Z

    if-nez v3, :cond_d

    iget-wide v7, v0, Lcom/daaw/ik8;->B:J

    cmp-long v3, v5, v7

    if-lez v3, :cond_d

    const/4 v3, 0x1

    iput-boolean v3, v0, Lcom/daaw/ik8;->k:Z

    sub-long v7, v5, v7

    invoke-static {v7, v8}, Lcom/daaw/it5;->j0(J)J

    move-result-wide v7

    iget v3, v0, Lcom/daaw/ik8;->j:F

    invoke-static {v7, v8, v3}, Lcom/daaw/it5;->e0(JF)J

    move-result-wide v7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    invoke-static {v7, v8}, Lcom/daaw/it5;->j0(J)J

    move-result-wide v7

    sub-long/2addr v9, v7

    iget-object v3, v0, Lcom/daaw/ik8;->a:Lcom/daaw/xj8;

    check-cast v3, Lcom/daaw/il8;

    iget-object v3, v3, Lcom/daaw/il8;->a:Lcom/daaw/sl8;

    invoke-static {v3}, Lcom/daaw/sl8;->p(Lcom/daaw/sl8;)Lcom/daaw/lj8;

    move-result-object v7

    if-eqz v7, :cond_d

    invoke-static {v3}, Lcom/daaw/sl8;->p(Lcom/daaw/sl8;)Lcom/daaw/lj8;

    move-result-object v3

    check-cast v3, Lcom/daaw/cm8;

    iget-object v3, v3, Lcom/daaw/cm8;->a:Lcom/daaw/em8;

    invoke-static {v3}, Lcom/daaw/em8;->x0(Lcom/daaw/em8;)Lcom/daaw/dj8;

    move-result-object v3

    invoke-virtual {v3, v9, v10}, Lcom/daaw/dj8;->r(J)V

    :cond_d
    iput-wide v1, v0, Lcom/daaw/ik8;->C:J

    iput-wide v5, v0, Lcom/daaw/ik8;->B:J

    iput-boolean v4, v0, Lcom/daaw/ik8;->D:Z

    return-wide v5
.end method

.method public final c(J)V
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/ik8;->m()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/ik8;->z:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v0, v0, v2

    iput-wide v0, p0, Lcom/daaw/ik8;->x:J

    iput-wide p1, p0, Lcom/daaw/ik8;->A:J

    return-void
.end method

.method public final d()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/ik8;->n()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/ik8;->c:Landroid/media/AudioTrack;

    iput-object v0, p0, Lcom/daaw/ik8;->f:Lcom/daaw/vj8;

    return-void
.end method

.method public final e(Landroid/media/AudioTrack;ZIII)V
    .locals 3

    iput-object p1, p0, Lcom/daaw/ik8;->c:Landroid/media/AudioTrack;

    iput p4, p0, Lcom/daaw/ik8;->d:I

    iput p5, p0, Lcom/daaw/ik8;->e:I

    new-instance v0, Lcom/daaw/vj8;

    invoke-direct {v0, p1}, Lcom/daaw/vj8;-><init>(Landroid/media/AudioTrack;)V

    iput-object v0, p0, Lcom/daaw/ik8;->f:Lcom/daaw/vj8;

    invoke-virtual {p1}, Landroid/media/AudioTrack;->getSampleRate()I

    move-result p1

    iput p1, p0, Lcom/daaw/ik8;->g:I

    const/4 p1, 0x6

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    sget p2, Lcom/daaw/it5;->a:I

    const/16 v2, 0x17

    if-ge p2, v2, :cond_0

    const/4 p2, 0x5

    if-eq p3, p2, :cond_1

    if-ne p3, p1, :cond_0

    const/4 p3, 0x6

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    iput-boolean v0, p0, Lcom/daaw/ik8;->h:Z

    invoke-static {p3}, Lcom/daaw/it5;->v(I)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/ik8;->q:Z

    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz p1, :cond_2

    div-int/2addr p5, p4

    int-to-long p4, p5

    invoke-virtual {p0, p4, p5}, Lcom/daaw/ik8;->l(J)J

    move-result-wide p4

    goto :goto_1

    :cond_2
    move-wide p4, p2

    :goto_1
    iput-wide p4, p0, Lcom/daaw/ik8;->i:J

    const-wide/16 p4, 0x0

    iput-wide p4, p0, Lcom/daaw/ik8;->s:J

    iput-wide p4, p0, Lcom/daaw/ik8;->t:J

    iput-wide p4, p0, Lcom/daaw/ik8;->u:J

    iput-boolean v1, p0, Lcom/daaw/ik8;->p:Z

    iput-wide p2, p0, Lcom/daaw/ik8;->x:J

    iput-wide p2, p0, Lcom/daaw/ik8;->y:J

    iput-wide p4, p0, Lcom/daaw/ik8;->r:J

    iput-wide p4, p0, Lcom/daaw/ik8;->o:J

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lcom/daaw/ik8;->j:F

    return-void
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ik8;->f:Lcom/daaw/vj8;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/daaw/vj8;->e()V

    return-void
.end method

.method public final g(J)Z
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/ik8;->m()J

    move-result-wide v0

    cmp-long v2, p1, v0

    if-gtz v2, :cond_1

    iget-boolean p1, p0, Lcom/daaw/ik8;->h:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/ik8;->c:Landroid/media/AudioTrack;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/media/AudioTrack;->getPlayState()I

    move-result p1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_0

    invoke-virtual {p0}, Lcom/daaw/ik8;->m()J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final h()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/ik8;->c:Landroid/media/AudioTrack;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final i(J)Z
    .locals 5

    iget-wide v0, p0, Lcom/daaw/ik8;->y:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iget-wide v0, p0, Lcom/daaw/ik8;->y:J

    sub-long/2addr p1, v0

    const-wide/16 v0, 0xc8

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final j(J)Z
    .locals 9

    iget-object v0, p0, Lcom/daaw/ik8;->c:Landroid/media/AudioTrack;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    iget-boolean v1, p0, Lcom/daaw/ik8;->h:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    iput-boolean v3, p0, Lcom/daaw/ik8;->p:Z

    return v3

    :cond_0
    if-ne v0, v2, :cond_2

    invoke-virtual {p0}, Lcom/daaw/ik8;->m()J

    move-result-wide v0

    const-wide/16 v4, 0x0

    cmp-long v6, v0, v4

    if-eqz v6, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    return v3

    :cond_2
    :goto_0
    iget-boolean v1, p0, Lcom/daaw/ik8;->p:Z

    invoke-virtual {p0, p1, p2}, Lcom/daaw/ik8;->g(J)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/ik8;->p:Z

    if-eqz v1, :cond_3

    if-nez p1, :cond_3

    if-eq v0, v2, :cond_3

    iget-object p1, p0, Lcom/daaw/ik8;->a:Lcom/daaw/xj8;

    iget v4, p0, Lcom/daaw/ik8;->e:I

    iget-wide v0, p0, Lcom/daaw/ik8;->i:J

    invoke-static {v0, v1}, Lcom/daaw/it5;->j0(J)J

    move-result-wide v5

    check-cast p1, Lcom/daaw/il8;

    iget-object p2, p1, Lcom/daaw/il8;->a:Lcom/daaw/sl8;

    invoke-static {p2}, Lcom/daaw/sl8;->p(Lcom/daaw/sl8;)Lcom/daaw/lj8;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-object p1, p1, Lcom/daaw/il8;->a:Lcom/daaw/sl8;

    invoke-static {p1}, Lcom/daaw/sl8;->H(Lcom/daaw/sl8;)J

    move-result-wide v7

    invoke-static {p1}, Lcom/daaw/sl8;->p(Lcom/daaw/sl8;)Lcom/daaw/lj8;

    move-result-object p1

    check-cast p1, Lcom/daaw/cm8;

    iget-object p1, p1, Lcom/daaw/cm8;->a:Lcom/daaw/em8;

    invoke-static {p1}, Lcom/daaw/em8;->x0(Lcom/daaw/em8;)Lcom/daaw/dj8;

    move-result-object v3

    sub-long v7, v0, v7

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/dj8;->t(IJJ)V

    :cond_3
    return v2
.end method

.method public final k()Z
    .locals 5

    invoke-virtual {p0}, Lcom/daaw/ik8;->n()V

    iget-wide v0, p0, Lcom/daaw/ik8;->x:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-object v0, p0, Lcom/daaw/ik8;->f:Lcom/daaw/vj8;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/daaw/vj8;->e()V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final l(J)J
    .locals 2

    const-wide/32 v0, 0xf4240

    mul-long p1, p1, v0

    iget v0, p0, Lcom/daaw/ik8;->g:I

    int-to-long v0, v0

    div-long/2addr p1, v0

    return-wide p1
.end method

.method public final m()J
    .locals 11

    iget-object v0, p0, Lcom/daaw/ik8;->c:Landroid/media/AudioTrack;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v1, p0, Lcom/daaw/ik8;->x:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/ik8;->x:J

    iget v4, p0, Lcom/daaw/ik8;->g:I

    iget-wide v5, p0, Lcom/daaw/ik8;->A:J

    iget-wide v7, p0, Lcom/daaw/ik8;->z:J

    const-wide/16 v9, 0x3e8

    mul-long v0, v0, v9

    sub-long/2addr v0, v2

    int-to-long v2, v4

    mul-long v0, v0, v2

    const-wide/32 v2, 0xf4240

    div-long/2addr v0, v2

    add-long/2addr v7, v0

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v1

    const/4 v2, 0x1

    const-wide/16 v5, 0x0

    if-ne v1, v2, :cond_1

    return-wide v5

    :cond_1
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlaybackHeadPosition()I

    move-result v0

    int-to-long v7, v0

    const-wide v9, 0xffffffffL

    and-long/2addr v7, v9

    iget-boolean v0, p0, Lcom/daaw/ik8;->h:Z

    if-eqz v0, :cond_4

    const/4 v0, 0x2

    if-ne v1, v0, :cond_3

    cmp-long v1, v7, v5

    if-nez v1, :cond_2

    iget-wide v1, p0, Lcom/daaw/ik8;->s:J

    iput-wide v1, p0, Lcom/daaw/ik8;->u:J

    :cond_2
    const/4 v1, 0x2

    :cond_3
    iget-wide v9, p0, Lcom/daaw/ik8;->u:J

    add-long/2addr v7, v9

    :cond_4
    sget v0, Lcom/daaw/it5;->a:I

    const/16 v2, 0x1d

    if-gt v0, v2, :cond_8

    cmp-long v0, v7, v5

    if-nez v0, :cond_6

    iget-wide v7, p0, Lcom/daaw/ik8;->s:J

    cmp-long v0, v7, v5

    if-lez v0, :cond_7

    const/4 v0, 0x3

    if-ne v1, v0, :cond_7

    iget-wide v0, p0, Lcom/daaw/ik8;->y:J

    cmp-long v2, v0, v3

    if-nez v2, :cond_5

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/ik8;->y:J

    :cond_5
    iget-wide v0, p0, Lcom/daaw/ik8;->s:J

    return-wide v0

    :cond_6
    move-wide v5, v7

    :cond_7
    iput-wide v3, p0, Lcom/daaw/ik8;->y:J

    move-wide v7, v5

    :cond_8
    iget-wide v0, p0, Lcom/daaw/ik8;->s:J

    cmp-long v2, v0, v7

    if-lez v2, :cond_9

    iget-wide v0, p0, Lcom/daaw/ik8;->t:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/daaw/ik8;->t:J

    :cond_9
    iput-wide v7, p0, Lcom/daaw/ik8;->s:J

    iget-wide v0, p0, Lcom/daaw/ik8;->t:J

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    add-long/2addr v7, v0

    return-wide v7
.end method

.method public final n()V
    .locals 3

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/ik8;->l:J

    const/4 v2, 0x0

    iput v2, p0, Lcom/daaw/ik8;->w:I

    iput v2, p0, Lcom/daaw/ik8;->v:I

    iput-wide v0, p0, Lcom/daaw/ik8;->m:J

    iput-wide v0, p0, Lcom/daaw/ik8;->C:J

    iput-wide v0, p0, Lcom/daaw/ik8;->F:J

    iput-boolean v2, p0, Lcom/daaw/ik8;->k:Z

    return-void
.end method
