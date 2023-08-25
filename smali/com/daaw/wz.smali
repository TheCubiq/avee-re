.class public Lcom/daaw/wz;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Z

.field public b:J

.field public c:Ljava/util/concurrent/locks/Lock;

.field public d:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lcom/daaw/sc;",
            ">;"
        }
    .end annotation
.end field

.field public volatile e:I

.field public f:Z

.field public g:I

.field public h:J

.field public i:J

.field public j:[[B


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/wz;->b:J

    new-instance v2, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v2}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v2, p0, Lcom/daaw/wz;->c:Ljava/util/concurrent/locks/Lock;

    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    iput-object v2, p0, Lcom/daaw/wz;->d:Ljava/util/LinkedList;

    const/4 v2, 0x0

    iput v2, p0, Lcom/daaw/wz;->e:I

    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/daaw/wz;->f:Z

    const/4 v2, -0x1

    iput v2, p0, Lcom/daaw/wz;->g:I

    const-wide/16 v2, -0x1

    iput-wide v2, p0, Lcom/daaw/wz;->h:J

    iput-wide v0, p0, Lcom/daaw/wz;->i:J

    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    const-class v1, B

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[B

    iput-object v0, p0, Lcom/daaw/wz;->j:[[B

    return-void

    nop

    :array_0
    .array-data 4
        0x1
        0x0
    .end array-data
.end method


# virtual methods
.method public final a(IJ[JLcom/daaw/sc;)Lcom/daaw/sc;
    .locals 9

    iget-object p1, p0, Lcom/daaw/wz;->d:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const-wide v0, 0x7fffffffffffffffL

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/sc;

    if-ne p5, v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lcom/daaw/sc;->e()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    :cond_2
    iget-wide v4, v3, Lcom/daaw/sc;->d:J

    sub-long v4, p2, v4

    const-wide/16 v6, -0x1

    cmp-long v8, v4, v6

    if-ltz v8, :cond_0

    iget-wide v6, v3, Lcom/daaw/sc;->a:J

    cmp-long v8, p2, v6

    if-gtz v8, :cond_0

    cmp-long v6, v0, v4

    if-lez v6, :cond_0

    move-object v2, v3

    move-wide v0, v4

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    const-wide/16 p2, 0x0

    cmp-long p5, v0, p2

    if-gez p5, :cond_4

    move-wide v0, p2

    :cond_4
    aput-wide v0, p4, p1

    return-object v2
.end method

.method public b(JLcom/daaw/avee/comp/playback/a$h;Lcom/daaw/avee/comp/playback/a;Z)Lcom/daaw/avee/comp/playback/a;
    .locals 24

    move-object/from16 v7, p0

    move-object/from16 v0, p3

    move-object/from16 v8, p4

    iget v1, v0, Lcom/daaw/avee/comp/playback/a$h;->b:I

    mul-int/lit16 v1, v1, 0x3e8

    int-to-long v1, v1

    add-long v9, p1, v1

    iget-boolean v1, v7, Lcom/daaw/wz;->a:Z

    const/4 v11, 0x0

    if-nez v1, :cond_0

    iput-boolean v11, v8, Lcom/daaw/avee/comp/playback/a;->a:Z

    return-object v8

    :cond_0
    iput-boolean v11, v8, Lcom/daaw/avee/comp/playback/a;->k:Z

    iput-wide v9, v8, Lcom/daaw/avee/comp/playback/a;->m:J

    iget-wide v1, v7, Lcom/daaw/wz;->b:J

    iput-wide v1, v8, Lcom/daaw/avee/comp/playback/a;->o:J

    const-wide v1, 0x7fffffffffffffffL

    iput-wide v1, v8, Lcom/daaw/avee/comp/playback/a;->p:J

    const-wide/high16 v1, -0x8000000000000000L

    iput-wide v1, v8, Lcom/daaw/avee/comp/playback/a;->q:J

    const/4 v12, 0x1

    new-array v13, v12, [J

    new-array v15, v12, [J

    const/4 v14, 0x2

    new-array v6, v14, [S

    new-array v5, v12, [F

    const/4 v1, 0x0

    aput v1, v5, v11

    :try_start_0
    iget-object v1, v7, Lcom/daaw/wz;->c:Ljava/util/concurrent/locks/Lock;

    const-wide/16 v2, 0x1f4

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, v3, v4}, Ljava/util/concurrent/locks/Lock;->tryLock(JLjava/util/concurrent/TimeUnit;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object/from16 v22, v5

    move-object/from16 v23, v6

    goto/16 :goto_9

    :catch_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_a

    if-eqz p5, :cond_1

    :try_start_1
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/wz;->f()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v22, v5

    move-object/from16 v23, v6

    goto/16 :goto_7

    :catchall_0
    move-exception v0

    move-object/from16 v22, v5

    move-object/from16 v23, v6

    goto/16 :goto_8

    :cond_1
    const/16 v16, 0x0

    const/4 v2, 0x0

    move-object/from16 v1, p0

    move-wide v3, v9

    move-object/from16 v22, v5

    move-object v5, v13

    move-object/from16 v23, v6

    move-object/from16 v6, v16

    :try_start_2
    invoke-virtual/range {v1 .. v6}, Lcom/daaw/wz;->a(IJ[JLcom/daaw/sc;)Lcom/daaw/sc;

    move-result-object v1

    if-eqz v1, :cond_2

    iget v2, v1, Lcom/daaw/sc;->b:I

    iget v3, v0, Lcom/daaw/avee/comp/playback/a$h;->a:I

    iget v4, v0, Lcom/daaw/avee/comp/playback/a$h;->d:I

    iget-wide v5, v0, Lcom/daaw/avee/comp/playback/a$h;->c:J

    move-object v0, v15

    int-to-long v14, v2

    invoke-static {v5, v6, v14, v15}, Lcom/daaw/hr1;->c(JJ)I

    move-result v5

    invoke-virtual {v8, v2, v3, v4, v5}, Lcom/daaw/avee/comp/playback/a;->d(IIII)V

    goto :goto_1

    :cond_2
    move-object v0, v15

    :goto_1
    iget-short v2, v8, Lcom/daaw/avee/comp/playback/a;->d:S

    aput-short v2, v23, v11

    iget-short v2, v8, Lcom/daaw/avee/comp/playback/a;->e:S

    aput-short v2, v23, v12

    move-object v6, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_2
    if-eqz v6, :cond_7

    aget-wide v3, v13, v11

    iget v5, v6, Lcom/daaw/sc;->b:I

    int-to-long v14, v5

    invoke-static {v3, v4, v14, v15}, Lcom/daaw/hr1;->c(JJ)I

    move-result v3

    if-lez v1, :cond_3

    if-eqz v3, :cond_3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "t["

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "]; startFrameOffsetBuffer != 0; totalSamplesGot: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " startFrameOffsetBuffer: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " startOffsetTime: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-wide v14, v13, v11

    invoke-virtual {v4, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_3
    iget-object v15, v8, Lcom/daaw/avee/comp/playback/a;->c:[S

    iget v4, v8, Lcom/daaw/avee/comp/playback/a;->b:I

    const/4 v5, 0x2

    move-object v14, v6

    move/from16 v16, v4

    move/from16 v17, v2

    move/from16 v18, v3

    move-object/from16 v19, v23

    move-object/from16 v20, v22

    move-object/from16 v21, v0

    invoke-virtual/range {v14 .. v21}, Lcom/daaw/sc;->d([SIII[S[F[J)I

    move-result v4

    add-int v14, v2, v4

    invoke-virtual/range {p4 .. p4}, Lcom/daaw/avee/comp/playback/a;->b()I

    move-result v2

    if-lt v14, v2, :cond_4

    add-int/2addr v3, v4

    int-to-long v0, v3

    iget v2, v6, Lcom/daaw/sc;->b:I

    int-to-long v2, v2

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/hr1;->e(JJ)J

    move-result-wide v0

    iget-wide v2, v6, Lcom/daaw/sc;->d:J

    add-long/2addr v2, v0

    iput-wide v2, v7, Lcom/daaw/wz;->i:J

    iput-boolean v12, v8, Lcom/daaw/avee/comp/playback/a;->k:Z

    goto :goto_4

    :cond_4
    aget-wide v2, v0, v11

    const-wide/16 v15, -0x1

    cmp-long v4, v2, v15

    if-eqz v4, :cond_5

    const/4 v2, 0x1

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    :goto_3
    invoke-static {v2}, Lcom/daaw/q6;->i(Z)V

    add-int/lit8 v15, v1, 0x1

    const/16 v1, 0x9

    if-lt v15, v1, :cond_6

    :goto_4
    move v2, v14

    goto :goto_5

    :cond_6
    aget-wide v3, v0, v11

    move-object/from16 v1, p0

    move v2, v15

    const/4 v11, 0x2

    move-object v5, v13

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/wz;->a(IJ[JLcom/daaw/sc;)Lcom/daaw/sc;

    move-result-object v6

    move v2, v14

    move v1, v15

    const/4 v11, 0x0

    goto/16 :goto_2

    :cond_7
    :goto_5
    const/4 v11, 0x2

    invoke-virtual/range {p4 .. p4}, Lcom/daaw/avee/comp/playback/a;->b()I

    move-result v0

    if-lt v2, v0, :cond_8

    iput-boolean v12, v8, Lcom/daaw/avee/comp/playback/a;->k:Z

    goto :goto_6

    :cond_8
    invoke-virtual/range {p4 .. p4}, Lcom/daaw/avee/comp/playback/a;->b()I

    move-result v0

    if-le v0, v11, :cond_9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "totalSamplesGot: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " need: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p4 .. p4}, Lcom/daaw/avee/comp/playback/a;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_9
    :goto_6
    iput v2, v8, Lcom/daaw/avee/comp/playback/a;->l:I

    int-to-long v0, v2

    iget v2, v8, Lcom/daaw/avee/comp/playback/a;->f:I

    int-to-long v2, v2

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/hr1;->e(JJ)J

    move-result-wide v0

    add-long/2addr v9, v0

    iput-wide v9, v8, Lcom/daaw/avee/comp/playback/a;->n:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_7
    :try_start_3
    iget-object v0, v7, Lcom/daaw/wz;->c:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_a

    :catch_2
    move-exception v0

    goto :goto_9

    :catchall_1
    move-exception v0

    :goto_8
    iget-object v1, v7, Lcom/daaw/wz;->c:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    :goto_9
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :goto_a
    const/4 v1, 0x0

    goto :goto_b

    :cond_a
    move-object/from16 v22, v5

    move-object/from16 v23, v6

    goto :goto_a

    :goto_b
    aget-short v0, v23, v1

    iput-short v0, v8, Lcom/daaw/avee/comp/playback/a;->d:S

    aget-short v0, v23, v12

    iput-short v0, v8, Lcom/daaw/avee/comp/playback/a;->e:S

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual/range {p4 .. p4}, Lcom/daaw/avee/comp/playback/a;->b()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v0, v2

    aget v1, v22, v1

    mul-float v0, v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, v8, Lcom/daaw/avee/comp/playback/a;->g:F

    iput-boolean v12, v8, Lcom/daaw/avee/comp/playback/a;->a:Z

    return-object v8
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcom/daaw/wz;->e:I

    return-void
.end method

.method public d(Ljava/nio/ByteBuffer;JIIII)V
    .locals 12

    move-object v1, p0

    move/from16 v0, p4

    const-wide/16 v2, 0x0

    move-wide v4, p2

    invoke-static {v2, v3, p2, p3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    if-lez v0, :cond_0

    iget v2, v1, Lcom/daaw/wz;->g:I

    if-ne v2, v0, :cond_0

    iget-wide v2, v1, Lcom/daaw/wz;->h:J

    cmp-long v4, v2, v6

    if-nez v4, :cond_0

    return-void

    :cond_0
    iput-wide v6, v1, Lcom/daaw/wz;->h:J

    iput v0, v1, Lcom/daaw/wz;->g:I

    iput-wide v6, v1, Lcom/daaw/wz;->b:J

    const/4 v0, 0x0

    :try_start_0
    iget-object v2, v1, Lcom/daaw/wz;->c:Ljava/util/concurrent/locks/Lock;

    const-wide/16 v3, 0x1f4

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v2, v3, v4, v5}, Ljava/util/concurrent/locks/Lock;->tryLock(JLjava/util/concurrent/TimeUnit;)Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_4

    :try_start_1
    iget v2, v1, Lcom/daaw/wz;->e:I

    if-lez v2, :cond_1

    invoke-virtual {p0}, Lcom/daaw/wz;->f()V

    iput v0, v1, Lcom/daaw/wz;->e:I

    :cond_1
    const/4 v0, 0x0

    iget-object v2, v1, Lcom/daaw/wz;->d:Ljava/util/LinkedList;

    invoke-virtual {v2}, Ljava/util/LinkedList;->size()I

    move-result v2

    if-lez v2, :cond_2

    iget-object v2, v1, Lcom/daaw/wz;->d:Ljava/util/LinkedList;

    invoke-virtual {v2}, Ljava/util/LinkedList;->size()I

    move-result v2

    const/16 v3, 0x12c

    if-lt v2, v3, :cond_2

    iget-object v0, v1, Lcom/daaw/wz;->d:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/sc;

    :cond_2
    if-nez v0, :cond_3

    new-instance v0, Lcom/daaw/sc;

    invoke-direct {v0}, Lcom/daaw/sc;-><init>()V

    :cond_3
    iget-object v11, v1, Lcom/daaw/wz;->j:[[B

    move-object v4, v0

    move-object v5, p1

    move/from16 v8, p5

    move/from16 v9, p6

    move/from16 v10, p7

    invoke-virtual/range {v4 .. v11}, Lcom/daaw/sc;->c(Ljava/nio/ByteBuffer;JIII[[B)V

    iget-object v2, v1, Lcom/daaw/wz;->d:Ljava/util/LinkedList;

    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, v1, Lcom/daaw/wz;->a:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    :try_start_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    iget-object v0, v1, Lcom/daaw/wz;->c:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_3

    :goto_2
    iget-object v2, v1, Lcom/daaw/wz;->c:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0

    :cond_4
    const-string v0, "thread lock timeout 1"

    invoke-static {v0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :goto_3
    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/wz;->d:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/sc;

    invoke-virtual {v1}, Lcom/daaw/sc;->f()V

    goto :goto_0

    :cond_0
    return-void
.end method
