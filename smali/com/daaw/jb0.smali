.class public final Lcom/daaw/jb0;
.super Lcom/daaw/zn0;
.source ""


# static fields
.field public static final F:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public A:I

.field public B:Z

.field public C:Z

.field public volatile D:Z

.field public volatile E:Z

.field public final j:I

.field public final k:I

.field public final l:Lcom/daaw/ib0$a;

.field public final m:Lcom/daaw/mp;

.field public final n:Lcom/daaw/pp;

.field public final o:Z

.field public final p:Z

.field public final q:Z

.field public final r:Lcom/daaw/ol1;

.field public final s:Z

.field public final t:Lcom/daaw/zz;

.field public final u:Z

.field public final v:Z

.field public final w:Lcom/daaw/qe0;

.field public final x:Lcom/daaw/rv0;

.field public y:Lcom/daaw/rb0;

.field public z:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lcom/daaw/jb0;->F:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/gb0;Lcom/daaw/mp;Lcom/daaw/pp;Lcom/daaw/pp;Lcom/daaw/ib0$a;Ljava/util/List;ILjava/lang/Object;JJJIZZLcom/daaw/ol1;Lcom/daaw/jb0;Lcom/google/android/exoplayer2/drm/DrmInitData;[B[B)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/gb0;",
            "Lcom/daaw/mp;",
            "Lcom/daaw/pp;",
            "Lcom/daaw/pp;",
            "Lcom/daaw/ib0$a;",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/Format;",
            ">;I",
            "Ljava/lang/Object;",
            "JJJIZZ",
            "Lcom/daaw/ol1;",
            "Lcom/daaw/jb0;",
            "Lcom/google/android/exoplayer2/drm/DrmInitData;",
            "[B[B)V"
        }
    .end annotation

    move-object/from16 v12, p0

    move-object/from16 v13, p2

    move-object/from16 v14, p4

    move-object/from16 v15, p5

    move/from16 v10, p15

    move-object/from16 v11, p19

    move-object/from16 v0, p21

    move-object/from16 v1, p22

    invoke-static {v13, v0, v1}, Lcom/daaw/jb0;->g(Lcom/daaw/mp;[B[B)Lcom/daaw/mp;

    move-result-object v1

    iget-object v3, v15, Lcom/daaw/ib0$a;->b:Lcom/google/android/exoplayer2/Format;

    move-object/from16 v0, p0

    move-object/from16 v2, p3

    move/from16 v4, p7

    move-object/from16 v5, p8

    move-wide/from16 v6, p9

    move-wide/from16 v8, p11

    move v13, v10

    move-wide/from16 v10, p13

    invoke-direct/range {v0 .. v11}, Lcom/daaw/zn0;-><init>(Lcom/daaw/mp;Lcom/daaw/pp;Lcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJ)V

    iput v13, v12, Lcom/daaw/jb0;->k:I

    iput-object v14, v12, Lcom/daaw/jb0;->n:Lcom/daaw/pp;

    iput-object v15, v12, Lcom/daaw/jb0;->l:Lcom/daaw/ib0$a;

    move/from16 v0, p17

    iput-boolean v0, v12, Lcom/daaw/jb0;->p:Z

    move-object/from16 v0, p18

    iput-object v0, v12, Lcom/daaw/jb0;->r:Lcom/daaw/ol1;

    iget-object v1, v12, Lcom/daaw/ef;->h:Lcom/daaw/mp;

    instance-of v1, v1, Lcom/daaw/u1;

    iput-boolean v1, v12, Lcom/daaw/jb0;->o:Z

    move/from16 v1, p16

    iput-boolean v1, v12, Lcom/daaw/jb0;->q:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v4, p19

    if-eqz v4, :cond_3

    iget-object v5, v4, Lcom/daaw/jb0;->l:Lcom/daaw/ib0$a;

    if-eq v5, v15, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    iput-boolean v5, v12, Lcom/daaw/jb0;->s:Z

    iget v6, v4, Lcom/daaw/jb0;->k:I

    if-ne v6, v13, :cond_2

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    iget-object v5, v4, Lcom/daaw/jb0;->t:Lcom/daaw/zz;

    goto :goto_2

    :cond_2
    :goto_1
    move-object v5, v3

    :goto_2
    move-object/from16 v6, p3

    goto :goto_3

    :cond_3
    iput-boolean v2, v12, Lcom/daaw/jb0;->s:Z

    move-object/from16 v6, p3

    move-object v5, v3

    :goto_3
    iget-object v6, v6, Lcom/daaw/pp;->a:Landroid/net/Uri;

    iget-object v7, v12, Lcom/daaw/ef;->c:Lcom/google/android/exoplayer2/Format;

    move-object/from16 p7, p1

    move-object/from16 p8, v5

    move-object/from16 p9, v6

    move-object/from16 p10, v7

    move-object/from16 p11, p6

    move-object/from16 p12, p20

    move-object/from16 p13, p18

    invoke-interface/range {p7 .. p13}, Lcom/daaw/gb0;->a(Lcom/daaw/zz;Landroid/net/Uri;Lcom/google/android/exoplayer2/Format;Ljava/util/List;Lcom/google/android/exoplayer2/drm/DrmInitData;Lcom/daaw/ol1;)Landroid/util/Pair;

    move-result-object v0

    iget-object v6, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v6, Lcom/daaw/zz;

    iput-object v6, v12, Lcom/daaw/jb0;->t:Lcom/daaw/zz;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, v12, Lcom/daaw/jb0;->u:Z

    if-ne v6, v5, :cond_4

    const/4 v5, 0x1

    goto :goto_4

    :cond_4
    const/4 v5, 0x0

    :goto_4
    iput-boolean v5, v12, Lcom/daaw/jb0;->v:Z

    if-eqz v5, :cond_5

    if-eqz v14, :cond_5

    goto :goto_5

    :cond_5
    const/4 v1, 0x0

    :goto_5
    iput-boolean v1, v12, Lcom/daaw/jb0;->C:Z

    if-eqz v0, :cond_7

    if-eqz v4, :cond_6

    iget-object v0, v4, Lcom/daaw/jb0;->x:Lcom/daaw/rv0;

    if-eqz v0, :cond_6

    iget-object v1, v4, Lcom/daaw/jb0;->w:Lcom/daaw/qe0;

    iput-object v1, v12, Lcom/daaw/jb0;->w:Lcom/daaw/qe0;

    goto :goto_6

    :cond_6
    new-instance v0, Lcom/daaw/qe0;

    invoke-direct {v0}, Lcom/daaw/qe0;-><init>()V

    iput-object v0, v12, Lcom/daaw/jb0;->w:Lcom/daaw/qe0;

    new-instance v0, Lcom/daaw/rv0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lcom/daaw/rv0;-><init>(I)V

    :goto_6
    iput-object v0, v12, Lcom/daaw/jb0;->x:Lcom/daaw/rv0;

    goto :goto_7

    :cond_7
    iput-object v3, v12, Lcom/daaw/jb0;->w:Lcom/daaw/qe0;

    iput-object v3, v12, Lcom/daaw/jb0;->x:Lcom/daaw/rv0;

    :goto_7
    move-object/from16 v0, p2

    iput-object v0, v12, Lcom/daaw/jb0;->m:Lcom/daaw/mp;

    sget-object v0, Lcom/daaw/jb0;->F:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    iput v0, v12, Lcom/daaw/jb0;->j:I

    return-void
.end method

.method public static g(Lcom/daaw/mp;[B[B)Lcom/daaw/mp;
    .locals 1

    if-eqz p1, :cond_0

    new-instance v0, Lcom/daaw/u1;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/u1;-><init>(Lcom/daaw/mp;[B[B)V

    return-object v0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/jb0;->j()V

    iget-boolean v0, p0, Lcom/daaw/jb0;->D:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/daaw/jb0;->q:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/jb0;->i()V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/jb0;->E:Z

    :cond_1
    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/jb0;->D:Z

    return-void
.end method

.method public c()J
    .locals 2

    iget v0, p0, Lcom/daaw/jb0;->A:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/jb0;->E:Z

    return v0
.end method

.method public h(Lcom/daaw/rb0;)V
    .locals 3

    iput-object p1, p0, Lcom/daaw/jb0;->y:Lcom/daaw/rb0;

    iget v0, p0, Lcom/daaw/jb0;->j:I

    iget-boolean v1, p0, Lcom/daaw/jb0;->s:Z

    iget-boolean v2, p0, Lcom/daaw/jb0;->v:Z

    invoke-virtual {p1, v0, v1, v2}, Lcom/daaw/rb0;->E(IZZ)V

    iget-boolean v0, p0, Lcom/daaw/jb0;->v:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/jb0;->t:Lcom/daaw/zz;

    invoke-interface {v0, p1}, Lcom/daaw/zz;->i(Lcom/daaw/d00;)V

    :cond_0
    return-void
.end method

.method public final i()V
    .locals 13

    iget-boolean v0, p0, Lcom/daaw/jb0;->o:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ef;->a:Lcom/daaw/pp;

    iget v3, p0, Lcom/daaw/jb0;->A:I

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/ef;->a:Lcom/daaw/pp;

    iget v3, p0, Lcom/daaw/jb0;->A:I

    int-to-long v3, v3

    invoke-virtual {v0, v3, v4}, Lcom/daaw/pp;->b(J)Lcom/daaw/pp;

    move-result-object v0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    iget-boolean v4, p0, Lcom/daaw/jb0;->p:Z

    if-nez v4, :cond_2

    iget-object v4, p0, Lcom/daaw/jb0;->r:Lcom/daaw/ol1;

    invoke-virtual {v4}, Lcom/daaw/ol1;->j()V

    goto :goto_1

    :cond_2
    iget-object v4, p0, Lcom/daaw/jb0;->r:Lcom/daaw/ol1;

    invoke-virtual {v4}, Lcom/daaw/ol1;->c()J

    move-result-wide v4

    const-wide v6, 0x7fffffffffffffffL

    cmp-long v8, v4, v6

    if-nez v8, :cond_3

    iget-object v4, p0, Lcom/daaw/jb0;->r:Lcom/daaw/ol1;

    iget-wide v5, p0, Lcom/daaw/ef;->f:J

    invoke-virtual {v4, v5, v6}, Lcom/daaw/ol1;->h(J)V

    :cond_3
    :goto_1
    :try_start_0
    new-instance v4, Lcom/daaw/wq;

    iget-object v8, p0, Lcom/daaw/ef;->h:Lcom/daaw/mp;

    iget-wide v9, v0, Lcom/daaw/pp;->c:J

    invoke-interface {v8, v0}, Lcom/daaw/mp;->c(Lcom/daaw/pp;)J

    move-result-wide v11

    move-object v7, v4

    invoke-direct/range {v7 .. v12}, Lcom/daaw/wq;-><init>(Lcom/daaw/mp;JJ)V

    iget-boolean v0, p0, Lcom/daaw/jb0;->u:Z

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Lcom/daaw/jb0;->B:Z

    if-nez v0, :cond_5

    invoke-virtual {p0, v4}, Lcom/daaw/jb0;->k(Lcom/daaw/a00;)J

    move-result-wide v5

    iput-boolean v1, p0, Lcom/daaw/jb0;->B:Z

    iget-object v0, p0, Lcom/daaw/jb0;->y:Lcom/daaw/rb0;

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v5, v7

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/daaw/jb0;->r:Lcom/daaw/ol1;

    invoke-virtual {v1, v5, v6}, Lcom/daaw/ol1;->b(J)J

    move-result-wide v5

    goto :goto_2

    :cond_4
    iget-wide v5, p0, Lcom/daaw/ef;->f:J

    :goto_2
    invoke-virtual {v0, v5, v6}, Lcom/daaw/rb0;->Y(J)V

    :cond_5
    if-eqz v3, :cond_6

    iget v0, p0, Lcom/daaw/jb0;->A:I

    invoke-interface {v4, v0}, Lcom/daaw/a00;->j(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_6
    :goto_3
    if-nez v2, :cond_7

    :try_start_1
    iget-boolean v0, p0, Lcom/daaw/jb0;->D:Z

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/daaw/jb0;->t:Lcom/daaw/zz;

    const/4 v1, 0x0

    invoke-interface {v0, v4, v1}, Lcom/daaw/zz;->d(Lcom/daaw/a00;Lcom/daaw/iy0;)I

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    :try_start_2
    invoke-interface {v4}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v1

    iget-object v3, p0, Lcom/daaw/ef;->a:Lcom/daaw/pp;

    iget-wide v3, v3, Lcom/daaw/pp;->c:J

    sub-long/2addr v1, v3

    long-to-int v2, v1

    iput v2, p0, Lcom/daaw/jb0;->A:I

    throw v0

    :cond_7
    invoke-interface {v4}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v0

    iget-object v2, p0, Lcom/daaw/ef;->a:Lcom/daaw/pp;

    iget-wide v2, v2, Lcom/daaw/pp;->c:J

    sub-long/2addr v0, v2

    long-to-int v1, v0

    iput v1, p0, Lcom/daaw/jb0;->A:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v0, p0, Lcom/daaw/ef;->h:Lcom/daaw/mp;

    invoke-static {v0}, Lcom/daaw/sq1;->h(Lcom/daaw/mp;)V

    return-void

    :catchall_1
    move-exception v0

    iget-object v1, p0, Lcom/daaw/ef;->h:Lcom/daaw/mp;

    invoke-static {v1}, Lcom/daaw/sq1;->h(Lcom/daaw/mp;)V

    goto :goto_5

    :goto_4
    throw v0

    :goto_5
    goto :goto_4
.end method

.method public final j()V
    .locals 8

    iget-boolean v0, p0, Lcom/daaw/jb0;->C:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/jb0;->n:Lcom/daaw/pp;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget v1, p0, Lcom/daaw/jb0;->z:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/pp;->b(J)Lcom/daaw/pp;

    move-result-object v0

    :try_start_0
    new-instance v7, Lcom/daaw/wq;

    iget-object v2, p0, Lcom/daaw/jb0;->m:Lcom/daaw/mp;

    iget-wide v3, v0, Lcom/daaw/pp;->c:J

    invoke-interface {v2, v0}, Lcom/daaw/mp;->c(Lcom/daaw/pp;)J

    move-result-wide v5

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lcom/daaw/wq;-><init>(Lcom/daaw/mp;JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    :try_start_1
    iget-boolean v0, p0, Lcom/daaw/jb0;->D:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/jb0;->t:Lcom/daaw/zz;

    const/4 v1, 0x0

    invoke-interface {v0, v7, v1}, Lcom/daaw/zz;->d(Lcom/daaw/a00;Lcom/daaw/iy0;)I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_2
    invoke-interface {v7}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v1

    iget-object v3, p0, Lcom/daaw/jb0;->n:Lcom/daaw/pp;

    iget-wide v3, v3, Lcom/daaw/pp;->c:J

    sub-long/2addr v1, v3

    long-to-int v2, v1

    iput v2, p0, Lcom/daaw/jb0;->z:I

    throw v0

    :cond_1
    invoke-interface {v7}, Lcom/daaw/a00;->getPosition()J

    move-result-wide v0

    iget-object v2, p0, Lcom/daaw/jb0;->n:Lcom/daaw/pp;

    iget-wide v2, v2, Lcom/daaw/pp;->c:J

    sub-long/2addr v0, v2

    long-to-int v1, v0

    iput v1, p0, Lcom/daaw/jb0;->z:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v0, p0, Lcom/daaw/jb0;->m:Lcom/daaw/mp;

    invoke-static {v0}, Lcom/daaw/sq1;->h(Lcom/daaw/mp;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/jb0;->C:Z

    return-void

    :catchall_1
    move-exception v0

    iget-object v1, p0, Lcom/daaw/jb0;->m:Lcom/daaw/mp;

    invoke-static {v1}, Lcom/daaw/sq1;->h(Lcom/daaw/mp;)V

    throw v0

    :cond_2
    :goto_1
    return-void
.end method

.method public final k(Lcom/daaw/a00;)J
    .locals 9

    invoke-interface {p1}, Lcom/daaw/a00;->i()V

    iget-object v0, p0, Lcom/daaw/jb0;->x:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    const/4 v1, 0x0

    const/16 v2, 0xa

    const/4 v3, 0x1

    invoke-interface {p1, v0, v1, v2, v3}, Lcom/daaw/a00;->d([BIIZ)Z

    move-result v0

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v0, :cond_0

    return-wide v4

    :cond_0
    iget-object v0, p0, Lcom/daaw/jb0;->x:Lcom/daaw/rv0;

    invoke-virtual {v0, v2}, Lcom/daaw/rv0;->G(I)V

    iget-object v0, p0, Lcom/daaw/jb0;->x:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->A()I

    move-result v0

    sget v6, Lcom/daaw/qe0;->c:I

    if-eq v0, v6, :cond_1

    return-wide v4

    :cond_1
    iget-object v0, p0, Lcom/daaw/jb0;->x:Lcom/daaw/rv0;

    const/4 v6, 0x3

    invoke-virtual {v0, v6}, Lcom/daaw/rv0;->K(I)V

    iget-object v0, p0, Lcom/daaw/jb0;->x:Lcom/daaw/rv0;

    invoke-virtual {v0}, Lcom/daaw/rv0;->w()I

    move-result v0

    add-int/lit8 v6, v0, 0xa

    iget-object v7, p0, Lcom/daaw/jb0;->x:Lcom/daaw/rv0;

    invoke-virtual {v7}, Lcom/daaw/rv0;->b()I

    move-result v7

    if-le v6, v7, :cond_2

    iget-object v7, p0, Lcom/daaw/jb0;->x:Lcom/daaw/rv0;

    iget-object v8, v7, Lcom/daaw/rv0;->a:[B

    invoke-virtual {v7, v6}, Lcom/daaw/rv0;->G(I)V

    iget-object v6, p0, Lcom/daaw/jb0;->x:Lcom/daaw/rv0;

    iget-object v6, v6, Lcom/daaw/rv0;->a:[B

    invoke-static {v8, v1, v6, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    iget-object v6, p0, Lcom/daaw/jb0;->x:Lcom/daaw/rv0;

    iget-object v6, v6, Lcom/daaw/rv0;->a:[B

    invoke-interface {p1, v6, v2, v0, v3}, Lcom/daaw/a00;->d([BIIZ)Z

    move-result p1

    if-nez p1, :cond_3

    return-wide v4

    :cond_3
    iget-object p1, p0, Lcom/daaw/jb0;->w:Lcom/daaw/qe0;

    iget-object v2, p0, Lcom/daaw/jb0;->x:Lcom/daaw/rv0;

    iget-object v2, v2, Lcom/daaw/rv0;->a:[B

    invoke-virtual {p1, v2, v0}, Lcom/daaw/qe0;->c([BI)Lcom/google/android/exoplayer2/metadata/Metadata;

    move-result-object p1

    if-nez p1, :cond_4

    return-wide v4

    :cond_4
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/metadata/Metadata;->b()I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_6

    invoke-virtual {p1, v2}, Lcom/google/android/exoplayer2/metadata/Metadata;->a(I)Lcom/google/android/exoplayer2/metadata/Metadata$Entry;

    move-result-object v3

    instance-of v6, v3, Lcom/google/android/exoplayer2/metadata/id3/PrivFrame;

    if-eqz v6, :cond_5

    check-cast v3, Lcom/google/android/exoplayer2/metadata/id3/PrivFrame;

    iget-object v6, v3, Lcom/google/android/exoplayer2/metadata/id3/PrivFrame;->q:Ljava/lang/String;

    const-string v7, "com.apple.streaming.transportStreamTimestamp"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    iget-object p1, v3, Lcom/google/android/exoplayer2/metadata/id3/PrivFrame;->r:[B

    iget-object v0, p0, Lcom/daaw/jb0;->x:Lcom/daaw/rv0;

    iget-object v0, v0, Lcom/daaw/rv0;->a:[B

    const/16 v2, 0x8

    invoke-static {p1, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Lcom/daaw/jb0;->x:Lcom/daaw/rv0;

    invoke-virtual {p1, v2}, Lcom/daaw/rv0;->G(I)V

    iget-object p1, p0, Lcom/daaw/jb0;->x:Lcom/daaw/rv0;

    invoke-virtual {p1}, Lcom/daaw/rv0;->q()J

    move-result-wide v0

    const-wide v2, 0x1ffffffffL

    and-long/2addr v0, v2

    return-wide v0

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_6
    return-wide v4
.end method
