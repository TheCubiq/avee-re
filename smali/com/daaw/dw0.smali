.class public Lcom/daaw/dw0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static p:I = 0x1474


# instance fields
.field public a:Ljava/nio/ByteBuffer;

.field public final b:Ljava/lang/Object;

.field public c:I

.field public d:J

.field public e:I

.field public f:Lcom/daaw/a31;

.field public g:I

.field public h:Ljava/lang/String;

.field public i:J

.field public j:I

.field public k:I

.field public l:I

.field public m:J

.field public n:Lcom/daaw/sc;

.field public o:[[B


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;J)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x4e20

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/dw0;->a:Ljava/nio/ByteBuffer;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/dw0;->b:Ljava/lang/Object;

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/dw0;->c:I

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/daaw/dw0;->d:J

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/dw0;->l:I

    new-instance v1, Lcom/daaw/sc;

    invoke-direct {v1}, Lcom/daaw/sc;-><init>()V

    iput-object v1, p0, Lcom/daaw/dw0;->n:Lcom/daaw/sc;

    const/4 v1, 0x2

    new-array v2, v1, [I

    fill-array-data v2, :array_0

    const-class v3, B

    invoke-static {v3, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [[B

    iput-object v2, p0, Lcom/daaw/dw0;->o:[[B

    iput-object p1, p0, Lcom/daaw/dw0;->h:Ljava/lang/String;

    iput-wide p2, p0, Lcom/daaw/dw0;->i:J

    const p1, 0xac44

    iput p1, p0, Lcom/daaw/dw0;->j:I

    iput v1, p0, Lcom/daaw/dw0;->k:I

    iput v0, p0, Lcom/daaw/dw0;->e:I

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/dw0;->f:Lcom/daaw/a31;

    iput v0, p0, Lcom/daaw/dw0;->g:I

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lcom/daaw/dw0;->m:J

    return-void

    :array_0
    .array-data 4
        0x1
        0x0
    .end array-data
.end method


# virtual methods
.method public final a(III)V
    .locals 6

    iput p1, p0, Lcom/daaw/dw0;->j:I

    iput p2, p0, Lcom/daaw/dw0;->k:I

    iget-wide v0, p0, Lcom/daaw/dw0;->i:J

    int-to-long v4, p1

    move v2, p2

    move v3, p3

    invoke-static/range {v0 .. v5}, Lcom/daaw/hr1;->b(JIIJ)I

    move-result p1

    iput p1, p0, Lcom/daaw/dw0;->e:I

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/dw0;->g:I

    iget-object p2, p0, Lcom/daaw/dw0;->f:Lcom/daaw/a31;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/daaw/a31;->a()V

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, p0, Lcom/daaw/dw0;->h:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    iget p3, p0, Lcom/daaw/dw0;->e:I

    add-int/lit16 p3, p3, 0x1400

    invoke-static {p2, p3}, Lcom/daaw/a31;->b(Ljava/lang/String;I)Lcom/daaw/a31;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/dw0;->f:Lcom/daaw/a31;

    add-int/lit8 p1, p1, 0x1

    if-nez p2, :cond_1

    const/4 p2, 0x3

    if-lt p1, p2, :cond_0

    :cond_1
    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lcom/daaw/dw0;->m:J

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/dw0;->f:Lcom/daaw/a31;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/a31;->a()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/dw0;->f:Lcom/daaw/a31;

    return-void
.end method

.method public c(JLcom/daaw/avee/comp/playback/a$h;Lcom/daaw/avee/comp/playback/a;I)Lcom/daaw/avee/comp/playback/a;
    .locals 25

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-object/from16 v0, p3

    move-object/from16 v4, p4

    move/from16 v12, p5

    const/4 v14, 0x0

    iput-boolean v14, v4, Lcom/daaw/avee/comp/playback/a;->k:Z

    iput-wide v2, v4, Lcom/daaw/avee/comp/playback/a;->m:J

    const-wide/16 v9, 0x0

    iput-wide v9, v4, Lcom/daaw/avee/comp/playback/a;->o:J

    const-wide v5, 0x7fffffffffffffffL

    iput-wide v5, v4, Lcom/daaw/avee/comp/playback/a;->p:J

    const-wide/high16 v5, -0x8000000000000000L

    iput-wide v5, v4, Lcom/daaw/avee/comp/playback/a;->q:J

    iget-object v5, v1, Lcom/daaw/dw0;->f:Lcom/daaw/a31;

    if-nez v5, :cond_0

    return-object v4

    :cond_0
    iget v5, v1, Lcom/daaw/dw0;->j:I

    iget v6, v0, Lcom/daaw/avee/comp/playback/a$h;->a:I

    iget v7, v0, Lcom/daaw/avee/comp/playback/a$h;->d:I

    iget-wide v9, v0, Lcom/daaw/avee/comp/playback/a$h;->c:J

    int-to-long v14, v5

    invoke-static {v9, v10, v14, v15}, Lcom/daaw/hr1;->c(JJ)I

    move-result v8

    invoke-virtual {v4, v5, v6, v7, v8}, Lcom/daaw/avee/comp/playback/a;->d(IIII)V

    iget v0, v0, Lcom/daaw/avee/comp/playback/a$h;->b:I

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v5, v0

    add-long/2addr v2, v5

    iget v7, v1, Lcom/daaw/dw0;->k:I

    iget v0, v1, Lcom/daaw/dw0;->j:I

    int-to-long v9, v0

    move-wide v5, v2

    move/from16 v8, p5

    const-wide/16 v13, 0x0

    invoke-static/range {v5 .. v10}, Lcom/daaw/hr1;->b(JIIJ)I

    move-result v0

    invoke-virtual/range {p4 .. p4}, Lcom/daaw/avee/comp/playback/a;->b()I

    move-result v5

    int-to-long v5, v5

    iget v7, v1, Lcom/daaw/dw0;->k:I

    invoke-static {v5, v6, v7, v12}, Lcom/daaw/hr1;->d(JII)I

    move-result v5

    invoke-virtual/range {p4 .. p4}, Lcom/daaw/avee/comp/playback/a;->c()I

    move-result v6

    int-to-long v6, v6

    iget v8, v1, Lcom/daaw/dw0;->k:I

    invoke-static {v6, v7, v8, v12}, Lcom/daaw/hr1;->d(JII)I

    move-result v6

    iget v7, v1, Lcom/daaw/dw0;->l:I

    sub-int v7, v0, v7

    int-to-long v7, v7

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    move-result-wide v9

    int-to-long v13, v12

    cmp-long v11, v9, v13

    if-gez v11, :cond_1

    iget v0, v1, Lcom/daaw/dw0;->l:I

    goto :goto_0

    :cond_1
    const-wide/16 v9, 0x0

    cmp-long v11, v7, v9

    if-eqz v11, :cond_2

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "! readPosDelta: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_2
    :goto_0
    add-int/2addr v6, v0

    iput v6, v1, Lcom/daaw/dw0;->l:I

    iget v6, v1, Lcom/daaw/dw0;->e:I

    add-int v7, v0, v5

    sub-int v8, v6, v7

    sub-int/2addr v7, v6

    const/4 v6, 0x0

    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    move-result v14

    sub-int/2addr v5, v14

    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    add-int v6, v0, v5

    iget v7, v1, Lcom/daaw/dw0;->g:I

    add-int/lit8 v7, v7, -0xa

    const/4 v15, 0x1

    if-le v6, v7, :cond_5

    sget v7, Lcom/daaw/dw0;->p:I

    if-gt v8, v7, :cond_3

    const/4 v7, 0x1

    goto :goto_1

    :cond_3
    const/4 v7, 0x0

    :goto_1
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "need read to"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v7, :cond_4

    const-string v10, "/ignore: "

    goto :goto_2

    :cond_4
    const-string v10, ": "

    :goto_2
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "; raf filled to: "

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v1, Lcom/daaw/dw0;->g:I

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "; maxBytes: "

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v1, Lcom/daaw/dw0;->e:I

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "; bytesTillEnd: "

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    if-nez v7, :cond_6

    return-object v4

    :cond_5
    const/4 v7, 0x0

    :cond_6
    iget-object v13, v1, Lcom/daaw/dw0;->b:Ljava/lang/Object;

    monitor-enter v13

    :try_start_0
    iget-object v6, v1, Lcom/daaw/dw0;->f:Lcom/daaw/a31;

    if-nez v6, :cond_7

    monitor-exit v13

    return-object v4

    :cond_7
    if-eqz v7, :cond_8

    iget-object v0, v1, Lcom/daaw/dw0;->a:Ljava/nio/ByteBuffer;

    const/4 v6, 0x0

    invoke-virtual {v0, v6}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, v1, Lcom/daaw/dw0;->a:Ljava/nio/ByteBuffer;

    goto :goto_3

    :cond_8
    invoke-virtual {v6, v0}, Lcom/daaw/a31;->c(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    :goto_3
    move-object v6, v0

    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    if-le v5, v0, :cond_9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "readSizeInBytes ["

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "] > buf.remainingInBytes ["

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "]"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    move v11, v0

    goto :goto_4

    :cond_9
    move v11, v5

    :goto_4
    iget-object v5, v1, Lcom/daaw/dw0;->n:Lcom/daaw/sc;

    const-wide/16 v7, 0x0

    iget v9, v1, Lcom/daaw/dw0;->j:I

    iget v10, v1, Lcom/daaw/dw0;->k:I

    iget-object v0, v1, Lcom/daaw/dw0;->o:[[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move/from16 v12, p5

    move-object/from16 v16, v13

    move-object v13, v0

    :try_start_1
    invoke-virtual/range {v5 .. v13}, Lcom/daaw/sc;->b(Ljava/nio/ByteBuffer;JIIII[[B)V

    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    new-array v0, v15, [J

    const/4 v5, 0x2

    new-array v5, v5, [S

    new-array v6, v15, [F

    iget-object v7, v1, Lcom/daaw/dw0;->n:Lcom/daaw/sc;

    iget-object v8, v4, Lcom/daaw/avee/comp/playback/a;->c:[S

    iget v9, v4, Lcom/daaw/avee/comp/playback/a;->b:I

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v17, v7

    move-object/from16 v18, v8

    move/from16 v19, v9

    move-object/from16 v22, v5

    move-object/from16 v23, v6

    move-object/from16 v24, v0

    invoke-virtual/range {v17 .. v24}, Lcom/daaw/sc;->d([SIII[S[F[J)I

    move-result v0

    add-int/2addr v14, v0

    invoke-virtual/range {p4 .. p4}, Lcom/daaw/avee/comp/playback/a;->b()I

    move-result v7

    if-lt v14, v7, :cond_a

    const/4 v7, 0x1

    goto :goto_5

    :cond_a
    const/4 v7, 0x0

    :goto_5
    iput-boolean v7, v4, Lcom/daaw/avee/comp/playback/a;->k:Z

    iput v0, v4, Lcom/daaw/avee/comp/playback/a;->l:I

    int-to-long v7, v0

    iget v0, v4, Lcom/daaw/avee/comp/playback/a;->f:I

    int-to-long v9, v0

    invoke-static {v7, v8, v9, v10}, Lcom/daaw/hr1;->e(JJ)J

    move-result-wide v7

    add-long/2addr v2, v7

    iput-wide v2, v4, Lcom/daaw/avee/comp/playback/a;->n:J

    const/4 v0, 0x0

    aget-short v2, v5, v0

    iput-short v2, v4, Lcom/daaw/avee/comp/playback/a;->d:S

    aget-short v2, v5, v15

    iput-short v2, v4, Lcom/daaw/avee/comp/playback/a;->e:S

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual/range {p4 .. p4}, Lcom/daaw/avee/comp/playback/a;->b()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    aget v0, v6, v0

    mul-float v2, v2, v0

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    double-to-float v0, v2

    iput v0, v4, Lcom/daaw/avee/comp/playback/a;->g:F

    iput-boolean v15, v4, Lcom/daaw/avee/comp/playback/a;->a:Z

    return-object v4

    :catchall_0
    move-exception v0

    move-object/from16 v16, v13

    :goto_6
    :try_start_2
    monitor-exit v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_6
.end method

.method public d()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/dw0;->b:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput v1, p0, Lcom/daaw/dw0;->g:I

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/daaw/dw0;->m:J

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public e(Ljava/nio/ByteBuffer;JIIII)V
    .locals 8

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    iget v2, p0, Lcom/daaw/dw0;->c:I

    if-ne v2, p4, :cond_0

    iget-wide v2, p0, Lcom/daaw/dw0;->d:J

    cmp-long v4, v2, p2

    if-nez v4, :cond_0

    return-void

    :cond_0
    iput-wide p2, p0, Lcom/daaw/dw0;->d:J

    iput p4, p0, Lcom/daaw/dw0;->c:I

    iget-object p4, p0, Lcom/daaw/dw0;->f:Lcom/daaw/a31;

    if-eqz p4, :cond_1

    iget p4, p0, Lcom/daaw/dw0;->j:I

    if-ne p4, p5, :cond_1

    iget p4, p0, Lcom/daaw/dw0;->k:I

    if-eq p4, p6, :cond_2

    :cond_1
    const-string p4, "createRaf"

    invoke-static {p4}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    iget-object p4, p0, Lcom/daaw/dw0;->b:Ljava/lang/Object;

    monitor-enter p4

    :try_start_0
    invoke-virtual {p0, p5, p6, p7}, Lcom/daaw/dw0;->a(III)V

    monitor-exit p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_2
    iget-object p4, p0, Lcom/daaw/dw0;->f:Lcom/daaw/a31;

    if-nez p4, :cond_3

    return-void

    :cond_3
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result p4

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result p5

    sub-int/2addr p4, p5

    iget v4, p0, Lcom/daaw/dw0;->k:I

    iget p5, p0, Lcom/daaw/dw0;->j:I

    int-to-long v6, p5

    move-wide v2, p2

    move v5, p7

    invoke-static/range {v2 .. v7}, Lcom/daaw/hr1;->b(JIIJ)I

    move-result p5

    sub-int/2addr p5, p4

    if-gez p5, :cond_4

    new-instance p6, Ljava/lang/StringBuilder;

    invoke-direct {p6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "startByte: "

    invoke-virtual {p6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "; TimeUs: "

    invoke-virtual {p6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_4
    if-gez p5, :cond_5

    const/4 p5, 0x0

    :cond_5
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result p2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result p3

    const-wide/32 v2, 0x7a120

    iget v4, p0, Lcom/daaw/dw0;->k:I

    iget p6, p0, Lcom/daaw/dw0;->j:I

    int-to-long v6, p6

    move v5, p7

    invoke-static/range {v2 .. v7}, Lcom/daaw/hr1;->b(JIIJ)I

    move-result p6

    iget-object p7, p0, Lcom/daaw/dw0;->b:Ljava/lang/Object;

    monitor-enter p7

    :try_start_1
    iget-object v2, p0, Lcom/daaw/dw0;->f:Lcom/daaw/a31;

    if-eqz v2, :cond_8

    iget v2, p0, Lcom/daaw/dw0;->g:I

    sub-int v2, p5, v2

    int-to-long v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v4

    int-to-long v6, p6

    cmp-long p6, v4, v6

    if-gez p6, :cond_6

    iget p5, p0, Lcom/daaw/dw0;->g:I

    goto :goto_0

    :cond_6
    cmp-long p6, v2, v0

    if-eqz p6, :cond_7

    new-instance p6, Ljava/lang/StringBuilder;

    invoke-direct {p6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "newDataFillDelta: "

    invoke-virtual {p6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p6

    invoke-static {p6}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_7
    :goto_0
    add-int/2addr p4, p5

    iput p4, p0, Lcom/daaw/dw0;->g:I

    iget-object p4, p0, Lcom/daaw/dw0;->f:Lcom/daaw/a31;

    invoke-virtual {p4, p5, p1}, Lcom/daaw/a31;->d(ILjava/nio/ByteBuffer;)V

    :cond_8
    monitor-exit p7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p1, p3}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit p4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method
