.class public Lcom/daaw/eb0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/eb0$a;,
        Lcom/daaw/eb0$c;,
        Lcom/daaw/eb0$b;
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/gb0;

.field public final b:Lcom/daaw/mp;

.field public final c:Lcom/daaw/mp;

.field public final d:Lcom/daaw/pl1;

.field public final e:[Lcom/daaw/ib0$a;

.field public final f:Lcom/daaw/pb0;

.field public final g:Lcom/google/android/exoplayer2/source/TrackGroup;

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/Format;",
            ">;"
        }
    .end annotation
.end field

.field public i:Z

.field public j:[B

.field public k:Ljava/io/IOException;

.field public l:Lcom/daaw/ib0$a;

.field public m:Z

.field public n:Landroid/net/Uri;

.field public o:[B

.field public p:Ljava/lang/String;

.field public q:[B

.field public r:Lcom/google/android/exoplayer2/trackselection/c;

.field public s:J

.field public t:Z


# direct methods
.method public constructor <init>(Lcom/daaw/gb0;Lcom/daaw/pb0;[Lcom/daaw/ib0$a;Lcom/daaw/fb0;Lcom/daaw/pl1;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/gb0;",
            "Lcom/daaw/pb0;",
            "[",
            "Lcom/daaw/ib0$a;",
            "Lcom/daaw/fb0;",
            "Lcom/daaw/pl1;",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/Format;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/eb0;->a:Lcom/daaw/gb0;

    iput-object p2, p0, Lcom/daaw/eb0;->f:Lcom/daaw/pb0;

    iput-object p3, p0, Lcom/daaw/eb0;->e:[Lcom/daaw/ib0$a;

    iput-object p5, p0, Lcom/daaw/eb0;->d:Lcom/daaw/pl1;

    iput-object p6, p0, Lcom/daaw/eb0;->h:Ljava/util/List;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/daaw/eb0;->s:J

    array-length p1, p3

    new-array p1, p1, [Lcom/google/android/exoplayer2/Format;

    array-length p2, p3

    new-array p2, p2, [I

    const/4 p5, 0x0

    :goto_0
    array-length p6, p3

    if-ge p5, p6, :cond_0

    aget-object p6, p3, p5

    iget-object p6, p6, Lcom/daaw/ib0$a;->b:Lcom/google/android/exoplayer2/Format;

    aput-object p6, p1, p5

    aput p5, p2, p5

    add-int/lit8 p5, p5, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x1

    invoke-interface {p4, p3}, Lcom/daaw/fb0;->a(I)Lcom/daaw/mp;

    move-result-object p3

    iput-object p3, p0, Lcom/daaw/eb0;->b:Lcom/daaw/mp;

    const/4 p3, 0x3

    invoke-interface {p4, p3}, Lcom/daaw/fb0;->a(I)Lcom/daaw/mp;

    move-result-object p3

    iput-object p3, p0, Lcom/daaw/eb0;->c:Lcom/daaw/mp;

    new-instance p3, Lcom/google/android/exoplayer2/source/TrackGroup;

    invoke-direct {p3, p1}, Lcom/google/android/exoplayer2/source/TrackGroup;-><init>([Lcom/google/android/exoplayer2/Format;)V

    iput-object p3, p0, Lcom/daaw/eb0;->g:Lcom/google/android/exoplayer2/source/TrackGroup;

    new-instance p1, Lcom/daaw/eb0$c;

    invoke-direct {p1, p3, p2}, Lcom/daaw/eb0$c;-><init>(Lcom/google/android/exoplayer2/source/TrackGroup;[I)V

    iput-object p1, p0, Lcom/daaw/eb0;->r:Lcom/google/android/exoplayer2/trackselection/c;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/eb0;->n:Landroid/net/Uri;

    iput-object v0, p0, Lcom/daaw/eb0;->o:[B

    iput-object v0, p0, Lcom/daaw/eb0;->p:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/eb0;->q:[B

    return-void
.end method

.method public b(Lcom/daaw/jb0;JJLcom/daaw/eb0$b;)V
    .locals 33

    move-object/from16 v6, p0

    move-object/from16 v0, p1

    move-wide/from16 v1, p2

    move-object/from16 v15, p6

    if-nez v0, :cond_0

    const/4 v3, -0x1

    goto :goto_0

    :cond_0
    iget-object v3, v6, Lcom/daaw/eb0;->g:Lcom/google/android/exoplayer2/source/TrackGroup;

    iget-object v4, v0, Lcom/daaw/ef;->c:Lcom/google/android/exoplayer2/Format;

    invoke-virtual {v3, v4}, Lcom/google/android/exoplayer2/source/TrackGroup;->b(Lcom/google/android/exoplayer2/Format;)I

    move-result v3

    :goto_0
    sub-long v4, p4, v1

    invoke-virtual {v6, v1, v2}, Lcom/daaw/eb0;->k(J)J

    move-result-wide v7

    if-eqz v0, :cond_1

    iget-boolean v9, v6, Lcom/daaw/eb0;->m:Z

    if-nez v9, :cond_1

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ef;->d()J

    move-result-wide v9

    sub-long/2addr v4, v9

    const-wide/16 v11, 0x0

    invoke-static {v11, v12, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v16, v7, v13

    if-eqz v16, :cond_1

    sub-long/2addr v7, v9

    invoke-static {v11, v12, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    :cond_1
    move-wide v10, v4

    move-wide v12, v7

    iget-object v7, v6, Lcom/daaw/eb0;->r:Lcom/google/android/exoplayer2/trackselection/c;

    move-wide/from16 v8, p2

    invoke-interface/range {v7 .. v13}, Lcom/google/android/exoplayer2/trackselection/c;->n(JJJ)V

    iget-object v1, v6, Lcom/daaw/eb0;->r:Lcom/google/android/exoplayer2/trackselection/c;

    invoke-interface {v1}, Lcom/google/android/exoplayer2/trackselection/c;->j()I

    move-result v1

    const/4 v2, 0x0

    const/4 v4, 0x1

    if-eq v3, v1, :cond_2

    const/4 v5, 0x1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    iget-object v7, v6, Lcom/daaw/eb0;->e:[Lcom/daaw/ib0$a;

    aget-object v7, v7, v1

    iget-object v8, v6, Lcom/daaw/eb0;->f:Lcom/daaw/pb0;

    invoke-interface {v8, v7}, Lcom/daaw/pb0;->m(Lcom/daaw/ib0$a;)Z

    move-result v8

    if-nez v8, :cond_4

    iput-object v7, v15, Lcom/daaw/eb0$b;->c:Lcom/daaw/ib0$a;

    iget-boolean v0, v6, Lcom/daaw/eb0;->t:Z

    iget-object v1, v6, Lcom/daaw/eb0;->l:Lcom/daaw/ib0$a;

    if-ne v1, v7, :cond_3

    const/4 v2, 0x1

    :cond_3
    and-int/2addr v0, v2

    iput-boolean v0, v6, Lcom/daaw/eb0;->t:Z

    iput-object v7, v6, Lcom/daaw/eb0;->l:Lcom/daaw/ib0$a;

    return-void

    :cond_4
    iget-object v8, v6, Lcom/daaw/eb0;->f:Lcom/daaw/pb0;

    invoke-interface {v8, v7}, Lcom/daaw/pb0;->d(Lcom/daaw/ib0$a;)Lcom/daaw/lb0;

    move-result-object v8

    iget-boolean v9, v8, Lcom/daaw/lb0;->k:Z

    iput-boolean v9, v6, Lcom/daaw/eb0;->m:Z

    invoke-virtual {v6, v8}, Lcom/daaw/eb0;->o(Lcom/daaw/lb0;)V

    iget-wide v9, v8, Lcom/daaw/lb0;->e:J

    iget-object v11, v6, Lcom/daaw/eb0;->f:Lcom/daaw/pb0;

    invoke-interface {v11}, Lcom/daaw/pb0;->f()J

    move-result-wide v11

    sub-long/2addr v9, v11

    if-eqz v0, :cond_7

    if-eqz v5, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/zn0;->e()J

    move-result-wide v11

    :cond_6
    :goto_2
    move v3, v1

    :goto_3
    move-object v1, v8

    move-wide/from16 v20, v11

    move-object v12, v7

    goto :goto_9

    :cond_7
    :goto_4
    iget-wide v11, v8, Lcom/daaw/lb0;->p:J

    add-long/2addr v11, v9

    if-eqz v0, :cond_9

    iget-boolean v5, v6, Lcom/daaw/eb0;->m:Z

    if-eqz v5, :cond_8

    goto :goto_5

    :cond_8
    iget-wide v13, v0, Lcom/daaw/ef;->f:J

    goto :goto_6

    :cond_9
    :goto_5
    move-wide/from16 v13, p4

    :goto_6
    iget-boolean v5, v8, Lcom/daaw/lb0;->l:Z

    if-nez v5, :cond_a

    cmp-long v5, v13, v11

    if-ltz v5, :cond_a

    iget-wide v11, v8, Lcom/daaw/lb0;->h:J

    iget-object v3, v8, Lcom/daaw/lb0;->o:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    int-to-long v13, v3

    add-long/2addr v11, v13

    goto :goto_2

    :cond_a
    sub-long/2addr v13, v9

    iget-object v5, v8, Lcom/daaw/lb0;->o:Ljava/util/List;

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    iget-object v12, v6, Lcom/daaw/eb0;->f:Lcom/daaw/pb0;

    invoke-interface {v12}, Lcom/daaw/pb0;->g()Z

    move-result v12

    if-eqz v12, :cond_c

    if-nez v0, :cond_b

    goto :goto_7

    :cond_b
    const/4 v12, 0x0

    goto :goto_8

    :cond_c
    :goto_7
    const/4 v12, 0x1

    :goto_8
    invoke-static {v5, v11, v4, v12}, Lcom/daaw/sq1;->d(Ljava/util/List;Ljava/lang/Object;ZZ)I

    move-result v5

    int-to-long v11, v5

    iget-wide v13, v8, Lcom/daaw/lb0;->h:J

    add-long/2addr v11, v13

    cmp-long v5, v11, v13

    if-gez v5, :cond_6

    if-eqz v0, :cond_6

    iget-object v1, v6, Lcom/daaw/eb0;->e:[Lcom/daaw/ib0$a;

    aget-object v7, v1, v3

    iget-object v1, v6, Lcom/daaw/eb0;->f:Lcom/daaw/pb0;

    invoke-interface {v1, v7}, Lcom/daaw/pb0;->d(Lcom/daaw/ib0$a;)Lcom/daaw/lb0;

    move-result-object v1

    iget-wide v8, v1, Lcom/daaw/lb0;->e:J

    iget-object v5, v6, Lcom/daaw/eb0;->f:Lcom/daaw/pb0;

    invoke-interface {v5}, Lcom/daaw/pb0;->f()J

    move-result-wide v10

    sub-long/2addr v8, v10

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/zn0;->e()J

    move-result-wide v11

    move-wide v9, v8

    move-object v8, v1

    goto :goto_3

    :goto_9
    iget-wide v7, v1, Lcom/daaw/lb0;->h:J

    cmp-long v5, v20, v7

    if-gez v5, :cond_d

    new-instance v0, Lcom/daaw/ob;

    invoke-direct {v0}, Lcom/daaw/ob;-><init>()V

    iput-object v0, v6, Lcom/daaw/eb0;->k:Ljava/io/IOException;

    return-void

    :cond_d
    sub-long v7, v20, v7

    long-to-int v5, v7

    iget-object v7, v1, Lcom/daaw/lb0;->o:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-lt v5, v7, :cond_10

    iget-boolean v0, v1, Lcom/daaw/lb0;->l:Z

    if-eqz v0, :cond_e

    iput-boolean v4, v15, Lcom/daaw/eb0$b;->b:Z

    goto :goto_a

    :cond_e
    iput-object v12, v15, Lcom/daaw/eb0$b;->c:Lcom/daaw/ib0$a;

    iget-boolean v0, v6, Lcom/daaw/eb0;->t:Z

    iget-object v1, v6, Lcom/daaw/eb0;->l:Lcom/daaw/ib0$a;

    if-ne v1, v12, :cond_f

    const/4 v2, 0x1

    :cond_f
    and-int/2addr v0, v2

    iput-boolean v0, v6, Lcom/daaw/eb0;->t:Z

    iput-object v12, v6, Lcom/daaw/eb0;->l:Lcom/daaw/ib0$a;

    :goto_a
    return-void

    :cond_10
    iput-boolean v2, v6, Lcom/daaw/eb0;->t:Z

    const/4 v2, 0x0

    iput-object v2, v6, Lcom/daaw/eb0;->l:Lcom/daaw/ib0$a;

    iget-object v4, v1, Lcom/daaw/lb0;->o:Ljava/util/List;

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/lb0$a;

    iget-object v5, v4, Lcom/daaw/lb0$a;->u:Ljava/lang/String;

    if-eqz v5, :cond_12

    iget-object v7, v1, Lcom/daaw/nb0;->a:Ljava/lang/String;

    invoke-static {v7, v5}, Lcom/daaw/iq1;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    iget-object v7, v6, Lcom/daaw/eb0;->n:Landroid/net/Uri;

    invoke-virtual {v5, v7}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    iget-object v2, v4, Lcom/daaw/lb0$a;->v:Ljava/lang/String;

    iget-object v0, v6, Lcom/daaw/eb0;->r:Lcom/google/android/exoplayer2/trackselection/c;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/trackselection/c;->l()I

    move-result v4

    iget-object v0, v6, Lcom/daaw/eb0;->r:Lcom/google/android/exoplayer2/trackselection/c;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/trackselection/c;->o()Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v0, p0

    move-object v1, v5

    move-object v5, v7

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/eb0;->f(Landroid/net/Uri;Ljava/lang/String;IILjava/lang/Object;)Lcom/daaw/eb0$a;

    move-result-object v0

    iput-object v0, v15, Lcom/daaw/eb0$b;->a:Lcom/daaw/ef;

    return-void

    :cond_11
    iget-object v3, v4, Lcom/daaw/lb0$a;->v:Ljava/lang/String;

    iget-object v7, v6, Lcom/daaw/eb0;->p:Ljava/lang/String;

    invoke-static {v3, v7}, Lcom/daaw/sq1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_13

    iget-object v3, v4, Lcom/daaw/lb0$a;->v:Ljava/lang/String;

    iget-object v7, v6, Lcom/daaw/eb0;->o:[B

    invoke-virtual {v6, v5, v3, v7}, Lcom/daaw/eb0;->m(Landroid/net/Uri;Ljava/lang/String;[B)V

    goto :goto_b

    :cond_12
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/eb0;->a()V

    :cond_13
    :goto_b
    iget-object v3, v4, Lcom/daaw/lb0$a;->q:Lcom/daaw/lb0$a;

    if-eqz v3, :cond_14

    iget-object v2, v1, Lcom/daaw/nb0;->a:Ljava/lang/String;

    iget-object v5, v3, Lcom/daaw/lb0$a;->p:Ljava/lang/String;

    invoke-static {v2, v5}, Lcom/daaw/iq1;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v23

    new-instance v2, Lcom/daaw/pp;

    iget-wide v7, v3, Lcom/daaw/lb0$a;->w:J

    iget-wide v13, v3, Lcom/daaw/lb0$a;->x:J

    const/16 v28, 0x0

    move-object/from16 v22, v2

    move-wide/from16 v24, v7

    move-wide/from16 v26, v13

    invoke-direct/range {v22 .. v28}, Lcom/daaw/pp;-><init>(Landroid/net/Uri;JJLjava/lang/String;)V

    :cond_14
    move-object v11, v2

    iget-wide v2, v4, Lcom/daaw/lb0$a;->t:J

    add-long/2addr v2, v9

    move-wide/from16 v16, v2

    iget v5, v1, Lcom/daaw/lb0;->g:I

    iget v7, v4, Lcom/daaw/lb0$a;->s:I

    add-int/2addr v5, v7

    move/from16 v22, v5

    iget-object v7, v6, Lcom/daaw/eb0;->d:Lcom/daaw/pl1;

    invoke-virtual {v7, v5}, Lcom/daaw/pl1;->a(I)Lcom/daaw/ol1;

    move-result-object v25

    iget-object v5, v1, Lcom/daaw/nb0;->a:Ljava/lang/String;

    iget-object v7, v4, Lcom/daaw/lb0$a;->p:Ljava/lang/String;

    invoke-static {v5, v7}, Lcom/daaw/iq1;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v27

    new-instance v26, Lcom/daaw/pp;

    move-object/from16 v10, v26

    iget-wide v7, v4, Lcom/daaw/lb0$a;->w:J

    iget-wide v13, v4, Lcom/daaw/lb0$a;->x:J

    const/16 v32, 0x0

    move-wide/from16 v28, v7

    move-wide/from16 v30, v13

    invoke-direct/range {v26 .. v32}, Lcom/daaw/pp;-><init>(Landroid/net/Uri;JJLjava/lang/String;)V

    new-instance v5, Lcom/daaw/jb0;

    move-object v7, v5

    iget-object v8, v6, Lcom/daaw/eb0;->a:Lcom/daaw/gb0;

    iget-object v9, v6, Lcom/daaw/eb0;->b:Lcom/daaw/mp;

    iget-object v13, v6, Lcom/daaw/eb0;->h:Ljava/util/List;

    iget-object v14, v6, Lcom/daaw/eb0;->r:Lcom/google/android/exoplayer2/trackselection/c;

    invoke-interface {v14}, Lcom/google/android/exoplayer2/trackselection/c;->l()I

    move-result v14

    iget-object v0, v6, Lcom/daaw/eb0;->r:Lcom/google/android/exoplayer2/trackselection/c;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/trackselection/c;->o()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    move-object/from16 p2, v7

    move-object/from16 p3, v8

    iget-wide v7, v4, Lcom/daaw/lb0$a;->r:J

    add-long v18, v2, v7

    iget-boolean v0, v4, Lcom/daaw/lb0$a;->y:Z

    move/from16 v23, v0

    iget-boolean v0, v6, Lcom/daaw/eb0;->i:Z

    move/from16 v24, v0

    iget-object v0, v1, Lcom/daaw/lb0;->n:Lcom/google/android/exoplayer2/drm/DrmInitData;

    move-object/from16 v27, v0

    iget-object v0, v6, Lcom/daaw/eb0;->o:[B

    move-object/from16 v28, v0

    iget-object v0, v6, Lcom/daaw/eb0;->q:[B

    move-object/from16 v29, v0

    move-object/from16 v26, p1

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    invoke-direct/range {v7 .. v29}, Lcom/daaw/jb0;-><init>(Lcom/daaw/gb0;Lcom/daaw/mp;Lcom/daaw/pp;Lcom/daaw/pp;Lcom/daaw/ib0$a;Ljava/util/List;ILjava/lang/Object;JJJIZZLcom/daaw/ol1;Lcom/daaw/jb0;Lcom/google/android/exoplayer2/drm/DrmInitData;[B[B)V

    move-object/from16 v0, p6

    iput-object v5, v0, Lcom/daaw/eb0$b;->a:Lcom/daaw/ef;

    return-void
.end method

.method public c()Lcom/google/android/exoplayer2/source/TrackGroup;
    .locals 1

    iget-object v0, p0, Lcom/daaw/eb0;->g:Lcom/google/android/exoplayer2/source/TrackGroup;

    return-object v0
.end method

.method public d()Lcom/google/android/exoplayer2/trackselection/c;
    .locals 1

    iget-object v0, p0, Lcom/daaw/eb0;->r:Lcom/google/android/exoplayer2/trackselection/c;

    return-object v0
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/eb0;->k:Ljava/io/IOException;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/eb0;->l:Lcom/daaw/ib0$a;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/daaw/eb0;->t:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/eb0;->f:Lcom/daaw/pb0;

    invoke-interface {v1, v0}, Lcom/daaw/pb0;->h(Lcom/daaw/ib0$a;)V

    :cond_0
    return-void

    :cond_1
    throw v0
.end method

.method public final f(Landroid/net/Uri;Ljava/lang/String;IILjava/lang/Object;)Lcom/daaw/eb0$a;
    .locals 9

    new-instance v8, Lcom/daaw/pp;

    const-wide/16 v2, 0x0

    const-wide/16 v4, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v0, v8

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Lcom/daaw/pp;-><init>(Landroid/net/Uri;JJLjava/lang/String;I)V

    new-instance p1, Lcom/daaw/eb0$a;

    iget-object v1, p0, Lcom/daaw/eb0;->c:Lcom/daaw/mp;

    iget-object v0, p0, Lcom/daaw/eb0;->e:[Lcom/daaw/ib0$a;

    aget-object p3, v0, p3

    iget-object v3, p3, Lcom/daaw/ib0$a;->b:Lcom/google/android/exoplayer2/Format;

    iget-object v6, p0, Lcom/daaw/eb0;->j:[B

    move-object v0, p1

    move-object v2, v8

    move v4, p4

    move-object v5, p5

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/daaw/eb0$a;-><init>(Lcom/daaw/mp;Lcom/daaw/pp;Lcom/google/android/exoplayer2/Format;ILjava/lang/Object;[BLjava/lang/String;)V

    return-object p1
.end method

.method public g(Lcom/daaw/ef;)V
    .locals 2

    instance-of v0, p1, Lcom/daaw/eb0$a;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/daaw/eb0$a;

    invoke-virtual {p1}, Lcom/daaw/dp;->f()[B

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/eb0;->j:[B

    iget-object v0, p1, Lcom/daaw/ef;->a:Lcom/daaw/pp;

    iget-object v0, v0, Lcom/daaw/pp;->a:Landroid/net/Uri;

    iget-object v1, p1, Lcom/daaw/eb0$a;->l:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/daaw/eb0$a;->h()[B

    move-result-object p1

    invoke-virtual {p0, v0, v1, p1}, Lcom/daaw/eb0;->m(Landroid/net/Uri;Ljava/lang/String;[B)V

    :cond_0
    return-void
.end method

.method public h(Lcom/daaw/ef;ZLjava/io/IOException;)Z
    .locals 1

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/eb0;->r:Lcom/google/android/exoplayer2/trackselection/c;

    iget-object v0, p0, Lcom/daaw/eb0;->g:Lcom/google/android/exoplayer2/source/TrackGroup;

    iget-object p1, p1, Lcom/daaw/ef;->c:Lcom/google/android/exoplayer2/Format;

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/source/TrackGroup;->b(Lcom/google/android/exoplayer2/Format;)I

    move-result p1

    invoke-interface {p2, p1}, Lcom/google/android/exoplayer2/trackselection/c;->p(I)I

    move-result p1

    invoke-static {p2, p1, p3}, Lcom/daaw/kf;->a(Lcom/google/android/exoplayer2/trackselection/c;ILjava/lang/Exception;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public i(Lcom/daaw/ib0$a;Z)Z
    .locals 7

    iget-object v0, p0, Lcom/daaw/eb0;->g:Lcom/google/android/exoplayer2/source/TrackGroup;

    iget-object v1, p1, Lcom/daaw/ib0$a;->b:Lcom/google/android/exoplayer2/Format;

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/source/TrackGroup;->b(Lcom/google/android/exoplayer2/Format;)I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    iget-object v3, p0, Lcom/daaw/eb0;->r:Lcom/google/android/exoplayer2/trackselection/c;

    invoke-interface {v3, v0}, Lcom/google/android/exoplayer2/trackselection/c;->p(I)I

    move-result v0

    if-ne v0, v1, :cond_1

    return v2

    :cond_1
    iget-boolean v1, p0, Lcom/daaw/eb0;->t:Z

    iget-object v3, p0, Lcom/daaw/eb0;->l:Lcom/daaw/ib0$a;

    const/4 v4, 0x0

    if-ne v3, p1, :cond_2

    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    or-int/2addr p1, v1

    iput-boolean p1, p0, Lcom/daaw/eb0;->t:Z

    if-eqz p2, :cond_4

    iget-object p1, p0, Lcom/daaw/eb0;->r:Lcom/google/android/exoplayer2/trackselection/c;

    const-wide/32 v5, 0xea60

    invoke-interface {p1, v0, v5, v6}, Lcom/google/android/exoplayer2/trackselection/c;->c(IJ)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :cond_4
    :goto_1
    return v2
.end method

.method public j()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/eb0;->k:Ljava/io/IOException;

    return-void
.end method

.method public final k(J)J
    .locals 5

    iget-wide v0, p0, Lcom/daaw/eb0;->s:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_1

    sub-long v2, v0, p1

    :cond_1
    return-wide v2
.end method

.method public l(Lcom/google/android/exoplayer2/trackselection/c;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/eb0;->r:Lcom/google/android/exoplayer2/trackselection/c;

    return-void
.end method

.method public final m(Landroid/net/Uri;Ljava/lang/String;[B)V
    .locals 5

    invoke-static {p2}, Lcom/daaw/sq1;->a0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "0x"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    new-instance v1, Ljava/math/BigInteger;

    const/16 v2, 0x10

    invoke-direct {v1, v0, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v0

    new-array v1, v2, [B

    array-length v3, v0

    if-le v3, v2, :cond_1

    array-length v3, v0

    sub-int/2addr v3, v2

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    array-length v4, v0

    sub-int/2addr v2, v4

    add-int/2addr v2, v3

    array-length v4, v0

    sub-int/2addr v4, v3

    invoke-static {v0, v3, v1, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object p1, p0, Lcom/daaw/eb0;->n:Landroid/net/Uri;

    iput-object p3, p0, Lcom/daaw/eb0;->o:[B

    iput-object p2, p0, Lcom/daaw/eb0;->p:Ljava/lang/String;

    iput-object v1, p0, Lcom/daaw/eb0;->q:[B

    return-void
.end method

.method public n(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/eb0;->i:Z

    return-void
.end method

.method public final o(Lcom/daaw/lb0;)V
    .locals 4

    iget-boolean v0, p1, Lcom/daaw/lb0;->l:Z

    if-eqz v0, :cond_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/lb0;->e()J

    move-result-wide v0

    iget-object p1, p0, Lcom/daaw/eb0;->f:Lcom/daaw/pb0;

    invoke-interface {p1}, Lcom/daaw/pb0;->f()J

    move-result-wide v2

    sub-long/2addr v0, v2

    :goto_0
    iput-wide v0, p0, Lcom/daaw/eb0;->s:J

    return-void
.end method
