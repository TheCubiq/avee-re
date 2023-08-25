.class public Lcom/daaw/qq;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/vo;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/qq$b;,
        Lcom/daaw/qq$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/lk0;

.field public final b:[I

.field public final c:Lcom/google/android/exoplayer2/trackselection/c;

.field public final d:I

.field public final e:Lcom/daaw/mp;

.field public final f:J

.field public final g:I

.field public final h:Lcom/daaw/ex0$c;

.field public final i:[Lcom/daaw/qq$b;

.field public j:Lcom/daaw/wo;

.field public k:I

.field public l:Ljava/io/IOException;

.field public m:Z

.field public n:J


# direct methods
.method public constructor <init>(Lcom/daaw/lk0;Lcom/daaw/wo;I[ILcom/google/android/exoplayer2/trackselection/c;ILcom/daaw/mp;JIZZLcom/daaw/ex0$c;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v2, p1

    iput-object v2, v0, Lcom/daaw/qq;->a:Lcom/daaw/lk0;

    move-object/from16 v2, p2

    iput-object v2, v0, Lcom/daaw/qq;->j:Lcom/daaw/wo;

    move-object/from16 v3, p4

    iput-object v3, v0, Lcom/daaw/qq;->b:[I

    iput-object v1, v0, Lcom/daaw/qq;->c:Lcom/google/android/exoplayer2/trackselection/c;

    move/from16 v10, p6

    iput v10, v0, Lcom/daaw/qq;->d:I

    move-object/from16 v3, p7

    iput-object v3, v0, Lcom/daaw/qq;->e:Lcom/daaw/mp;

    move/from16 v3, p3

    iput v3, v0, Lcom/daaw/qq;->k:I

    move-wide/from16 v4, p8

    iput-wide v4, v0, Lcom/daaw/qq;->f:J

    move/from16 v4, p10

    iput v4, v0, Lcom/daaw/qq;->g:I

    move-object/from16 v11, p13

    iput-object v11, v0, Lcom/daaw/qq;->h:Lcom/daaw/ex0$c;

    invoke-virtual/range {p2 .. p3}, Lcom/daaw/wo;->g(I)J

    move-result-wide v12

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v2, v0, Lcom/daaw/qq;->n:J

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/qq;->j()Ljava/util/ArrayList;

    move-result-object v14

    invoke-interface/range {p5 .. p5}, Lcom/google/android/exoplayer2/trackselection/c;->length()I

    move-result v2

    new-array v2, v2, [Lcom/daaw/qq$b;

    iput-object v2, v0, Lcom/daaw/qq;->i:[Lcom/daaw/qq$b;

    const/4 v2, 0x0

    const/4 v15, 0x0

    :goto_0
    iget-object v2, v0, Lcom/daaw/qq;->i:[Lcom/daaw/qq$b;

    array-length v2, v2

    if-ge v15, v2, :cond_0

    invoke-interface {v1, v15}, Lcom/google/android/exoplayer2/trackselection/c;->f(I)I

    move-result v2

    invoke-interface {v14, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/daaw/j41;

    iget-object v9, v0, Lcom/daaw/qq;->i:[Lcom/daaw/qq$b;

    new-instance v16, Lcom/daaw/qq$b;

    move-object/from16 v2, v16

    move-wide v3, v12

    move/from16 v5, p6

    move/from16 v7, p11

    move/from16 v8, p12

    move-object/from16 v17, v9

    move-object/from16 v9, p13

    invoke-direct/range {v2 .. v9}, Lcom/daaw/qq$b;-><init>(JILcom/daaw/j41;ZZLcom/daaw/sm1;)V

    aput-object v16, v17, v15

    add-int/lit8 v15, v15, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static k(Lcom/daaw/qq$b;Lcom/daaw/mp;Lcom/google/android/exoplayer2/Format;ILjava/lang/Object;Lcom/daaw/d31;Lcom/daaw/d31;)Lcom/daaw/ef;
    .locals 8

    iget-object v0, p0, Lcom/daaw/qq$b;->b:Lcom/daaw/j41;

    iget-object v0, v0, Lcom/daaw/j41;->d:Ljava/lang/String;

    if-eqz p5, :cond_0

    invoke-virtual {p5, p6, v0}, Lcom/daaw/d31;->a(Lcom/daaw/d31;Ljava/lang/String;)Lcom/daaw/d31;

    move-result-object p6

    if-nez p6, :cond_0

    goto :goto_0

    :cond_0
    move-object p5, p6

    :goto_0
    new-instance p6, Lcom/daaw/pp;

    invoke-virtual {p5, v0}, Lcom/daaw/d31;->b(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    iget-wide v3, p5, Lcom/daaw/d31;->a:J

    iget-wide v5, p5, Lcom/daaw/d31;->b:J

    iget-object p5, p0, Lcom/daaw/qq$b;->b:Lcom/daaw/j41;

    invoke-virtual {p5}, Lcom/daaw/j41;->a()Ljava/lang/String;

    move-result-object v7

    move-object v1, p6

    invoke-direct/range {v1 .. v7}, Lcom/daaw/pp;-><init>(Landroid/net/Uri;JJLjava/lang/String;)V

    new-instance p5, Lcom/daaw/uf0;

    iget-object v7, p0, Lcom/daaw/qq$b;->a:Lcom/daaw/ff;

    move-object v1, p5

    move-object v2, p1

    move-object v3, p6

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v7}, Lcom/daaw/uf0;-><init>(Lcom/daaw/mp;Lcom/daaw/pp;Lcom/google/android/exoplayer2/Format;ILjava/lang/Object;Lcom/daaw/ff;)V

    return-object p5
.end method

.method public static l(Lcom/daaw/qq$b;Lcom/daaw/mp;ILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JIJ)Lcom/daaw/ef;
    .locals 23

    move-object/from16 v0, p0

    move-wide/from16 v13, p6

    iget-object v1, v0, Lcom/daaw/qq$b;->b:Lcom/daaw/j41;

    invoke-virtual {v0, v13, v14}, Lcom/daaw/qq$b;->e(J)J

    move-result-wide v7

    invoke-virtual {v0, v13, v14}, Lcom/daaw/qq$b;->f(J)Lcom/daaw/d31;

    move-result-object v2

    iget-object v4, v1, Lcom/daaw/j41;->d:Ljava/lang/String;

    iget-object v3, v0, Lcom/daaw/qq$b;->a:Lcom/daaw/ff;

    if-nez v3, :cond_0

    invoke-virtual {v0, v13, v14}, Lcom/daaw/qq$b;->c(J)J

    move-result-wide v9

    new-instance v3, Lcom/daaw/pp;

    invoke-virtual {v2, v4}, Lcom/daaw/d31;->b(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v16

    iget-wide v4, v2, Lcom/daaw/d31;->a:J

    iget-wide v11, v2, Lcom/daaw/d31;->b:J

    invoke-virtual {v1}, Lcom/daaw/j41;->a()Ljava/lang/String;

    move-result-object v21

    move-object v15, v3

    move-wide/from16 v17, v4

    move-wide/from16 v19, v11

    invoke-direct/range {v15 .. v21}, Lcom/daaw/pp;-><init>(Landroid/net/Uri;JJLjava/lang/String;)V

    new-instance v15, Lcom/daaw/pd1;

    move-object v0, v15

    move-object/from16 v1, p1

    move-object v2, v3

    move-object/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-wide v6, v7

    move-wide v8, v9

    move-wide/from16 v10, p6

    move/from16 v12, p2

    move-object/from16 v13, p3

    invoke-direct/range {v0 .. v13}, Lcom/daaw/pd1;-><init>(Lcom/daaw/mp;Lcom/daaw/pp;Lcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJILcom/google/android/exoplayer2/Format;)V

    return-object v15

    :cond_0
    const/4 v3, 0x1

    move/from16 v5, p8

    const/4 v15, 0x1

    :goto_0
    if-ge v3, v5, :cond_2

    int-to-long v9, v3

    add-long/2addr v9, v13

    invoke-virtual {v0, v9, v10}, Lcom/daaw/qq$b;->f(J)Lcom/daaw/d31;

    move-result-object v6

    invoke-virtual {v2, v6, v4}, Lcom/daaw/d31;->a(Lcom/daaw/d31;Ljava/lang/String;)Lcom/daaw/d31;

    move-result-object v6

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v15, v15, 0x1

    add-int/lit8 v3, v3, 0x1

    move-object v2, v6

    goto :goto_0

    :cond_2
    :goto_1
    int-to-long v5, v15

    add-long/2addr v5, v13

    const-wide/16 v9, 0x1

    sub-long/2addr v5, v9

    invoke-virtual {v0, v5, v6}, Lcom/daaw/qq$b;->c(J)J

    move-result-wide v9

    new-instance v16, Lcom/daaw/pp;

    move-object/from16 v3, v16

    invoke-virtual {v2, v4}, Lcom/daaw/d31;->b(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v17

    iget-wide v4, v2, Lcom/daaw/d31;->a:J

    iget-wide v11, v2, Lcom/daaw/d31;->b:J

    invoke-virtual {v1}, Lcom/daaw/j41;->a()Ljava/lang/String;

    move-result-object v22

    move-wide/from16 v18, v4

    move-wide/from16 v20, v11

    invoke-direct/range {v16 .. v22}, Lcom/daaw/pp;-><init>(Landroid/net/Uri;JJLjava/lang/String;)V

    iget-wide v1, v1, Lcom/daaw/j41;->e:J

    neg-long v1, v1

    move-wide/from16 v16, v1

    new-instance v19, Lcom/daaw/fk;

    move-object/from16 v1, v19

    iget-object v0, v0, Lcom/daaw/qq$b;->a:Lcom/daaw/ff;

    move-object/from16 v18, v0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-wide/from16 v11, p9

    move-wide/from16 v13, p6

    invoke-direct/range {v1 .. v18}, Lcom/daaw/fk;-><init>(Lcom/daaw/mp;Lcom/daaw/pp;Lcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJJIJLcom/daaw/ff;)V

    return-object v19
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/qq;->l:Ljava/io/IOException;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/qq;->a:Lcom/daaw/lk0;

    invoke-interface {v0}, Lcom/daaw/lk0;->a()V

    return-void

    :cond_0
    throw v0
.end method

.method public c(Lcom/daaw/wo;I)V
    .locals 4

    :try_start_0
    iput-object p1, p0, Lcom/daaw/qq;->j:Lcom/daaw/wo;

    iput p2, p0, Lcom/daaw/qq;->k:I

    invoke-virtual {p1, p2}, Lcom/daaw/wo;->g(I)J

    move-result-wide p1

    invoke-virtual {p0}, Lcom/daaw/qq;->j()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/qq;->i:[Lcom/daaw/qq$b;

    array-length v2, v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/daaw/qq;->c:Lcom/google/android/exoplayer2/trackselection/c;

    invoke-interface {v2, v1}, Lcom/google/android/exoplayer2/trackselection/c;->f(I)I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/j41;

    iget-object v3, p0, Lcom/daaw/qq;->i:[Lcom/daaw/qq$b;

    aget-object v3, v3, v1

    invoke-virtual {v3, p1, p2, v2}, Lcom/daaw/qq$b;->i(JLcom/daaw/j41;)V
    :try_end_0
    .catch Lcom/daaw/ob; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    iput-object p1, p0, Lcom/daaw/qq;->l:Ljava/io/IOException;

    :cond_0
    return-void
.end method

.method public final d()J
    .locals 7

    iget-wide v0, p0, Lcom/daaw/qq;->f:J

    const-wide/16 v2, 0x3e8

    const-wide/16 v4, 0x0

    cmp-long v6, v0, v4

    if-eqz v6, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v4, p0, Lcom/daaw/qq;->f:J

    add-long/2addr v0, v4

    :goto_0
    mul-long v0, v0, v2

    return-wide v0

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    goto :goto_0
.end method

.method public e(JLcom/daaw/ea1;)J
    .locals 11

    iget-object v0, p0, Lcom/daaw/qq;->i:[Lcom/daaw/qq$b;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    iget-object v4, v3, Lcom/daaw/qq$b;->c:Lcom/daaw/bp;

    if-eqz v4, :cond_1

    invoke-virtual {v3, p1, p2}, Lcom/daaw/qq$b;->d(J)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/daaw/qq$b;->e(J)J

    move-result-wide v7

    cmp-long v2, v7, p1

    if-gez v2, :cond_0

    invoke-virtual {v3}, Lcom/daaw/qq$b;->b()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    int-to-long v4, v2

    cmp-long v2, v0, v4

    if-gez v2, :cond_0

    const-wide/16 v4, 0x1

    add-long/2addr v0, v4

    invoke-virtual {v3, v0, v1}, Lcom/daaw/qq$b;->e(J)J

    move-result-wide v0

    move-wide v9, v0

    goto :goto_1

    :cond_0
    move-wide v9, v7

    :goto_1
    move-wide v4, p1

    move-object v6, p3

    invoke-static/range {v4 .. v10}, Lcom/daaw/sq1;->S(JLcom/daaw/ea1;JJ)J

    move-result-wide p1

    return-wide p1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-wide p1
.end method

.method public f(Lcom/daaw/ef;)V
    .locals 5

    instance-of v0, p1, Lcom/daaw/uf0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/daaw/uf0;

    iget-object v1, p0, Lcom/daaw/qq;->i:[Lcom/daaw/qq$b;

    iget-object v2, p0, Lcom/daaw/qq;->c:Lcom/google/android/exoplayer2/trackselection/c;

    iget-object v0, v0, Lcom/daaw/ef;->c:Lcom/google/android/exoplayer2/Format;

    invoke-interface {v2, v0}, Lcom/google/android/exoplayer2/trackselection/c;->i(Lcom/google/android/exoplayer2/Format;)I

    move-result v0

    aget-object v0, v1, v0

    iget-object v1, v0, Lcom/daaw/qq$b;->c:Lcom/daaw/bp;

    if-nez v1, :cond_0

    iget-object v1, v0, Lcom/daaw/qq$b;->a:Lcom/daaw/ff;

    invoke-virtual {v1}, Lcom/daaw/ff;->c()Lcom/daaw/da1;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Lcom/daaw/cp;

    check-cast v1, Lcom/daaw/hf;

    iget-object v3, v0, Lcom/daaw/qq$b;->b:Lcom/daaw/j41;

    iget-wide v3, v3, Lcom/daaw/j41;->e:J

    invoke-direct {v2, v1, v3, v4}, Lcom/daaw/cp;-><init>(Lcom/daaw/hf;J)V

    iput-object v2, v0, Lcom/daaw/qq$b;->c:Lcom/daaw/bp;

    :cond_0
    iget-object v0, p0, Lcom/daaw/qq;->h:Lcom/daaw/ex0$c;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lcom/daaw/ex0$c;->h(Lcom/daaw/ef;)V

    :cond_1
    return-void
.end method

.method public g(Lcom/daaw/ef;ZLjava/lang/Exception;)Z
    .locals 6

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object p2, p0, Lcom/daaw/qq;->h:Lcom/daaw/ex0$c;

    const/4 v0, 0x1

    if-eqz p2, :cond_1

    invoke-virtual {p2, p1}, Lcom/daaw/ex0$c;->g(Lcom/daaw/ef;)Z

    move-result p2

    if-eqz p2, :cond_1

    return v0

    :cond_1
    iget-object p2, p0, Lcom/daaw/qq;->j:Lcom/daaw/wo;

    iget-boolean p2, p2, Lcom/daaw/wo;->d:Z

    if-nez p2, :cond_2

    instance-of p2, p1, Lcom/daaw/zn0;

    if-eqz p2, :cond_2

    instance-of p2, p3, Lcom/daaw/tb0$e;

    if-eqz p2, :cond_2

    move-object p2, p3

    check-cast p2, Lcom/daaw/tb0$e;

    iget p2, p2, Lcom/daaw/tb0$e;->r:I

    const/16 v1, 0x194

    if-ne p2, v1, :cond_2

    iget-object p2, p0, Lcom/daaw/qq;->i:[Lcom/daaw/qq$b;

    iget-object v1, p0, Lcom/daaw/qq;->c:Lcom/google/android/exoplayer2/trackselection/c;

    iget-object v2, p1, Lcom/daaw/ef;->c:Lcom/google/android/exoplayer2/Format;

    invoke-interface {v1, v2}, Lcom/google/android/exoplayer2/trackselection/c;->i(Lcom/google/android/exoplayer2/Format;)I

    move-result v1

    aget-object p2, p2, v1

    invoke-virtual {p2}, Lcom/daaw/qq$b;->b()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    if-eqz v1, :cond_2

    invoke-virtual {p2}, Lcom/daaw/qq$b;->a()J

    move-result-wide v2

    int-to-long v4, v1

    add-long/2addr v2, v4

    const-wide/16 v4, 0x1

    sub-long/2addr v2, v4

    move-object p2, p1

    check-cast p2, Lcom/daaw/zn0;

    invoke-virtual {p2}, Lcom/daaw/zn0;->e()J

    move-result-wide v4

    cmp-long p2, v4, v2

    if-lez p2, :cond_2

    iput-boolean v0, p0, Lcom/daaw/qq;->m:Z

    return v0

    :cond_2
    iget-object p2, p0, Lcom/daaw/qq;->c:Lcom/google/android/exoplayer2/trackselection/c;

    iget-object p1, p1, Lcom/daaw/ef;->c:Lcom/google/android/exoplayer2/Format;

    invoke-interface {p2, p1}, Lcom/google/android/exoplayer2/trackselection/c;->i(Lcom/google/android/exoplayer2/Format;)I

    move-result p1

    invoke-static {p2, p1, p3}, Lcom/daaw/kf;->a(Lcom/google/android/exoplayer2/trackselection/c;ILjava/lang/Exception;)Z

    move-result p1

    return p1
.end method

.method public h(JLjava/util/List;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "+",
            "Lcom/daaw/zn0;",
            ">;)I"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/qq;->l:Ljava/io/IOException;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/qq;->c:Lcom/google/android/exoplayer2/trackselection/c;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/trackselection/c;->length()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/qq;->c:Lcom/google/android/exoplayer2/trackselection/c;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/exoplayer2/trackselection/c;->h(JLjava/util/List;)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    return p1
.end method

.method public i(Lcom/daaw/zn0;JJLcom/daaw/gf;)V
    .locals 22

    move-object/from16 v0, p0

    move-wide/from16 v2, p2

    move-wide/from16 v8, p4

    move-object/from16 v10, p6

    iget-object v1, v0, Lcom/daaw/qq;->l:Ljava/io/IOException;

    if-eqz v1, :cond_0

    return-void

    :cond_0
    sub-long v4, v8, v2

    invoke-virtual {v0, v2, v3}, Lcom/daaw/qq;->m(J)J

    move-result-wide v6

    iget-object v1, v0, Lcom/daaw/qq;->j:Lcom/daaw/wo;

    iget-wide v11, v1, Lcom/daaw/wo;->a:J

    invoke-static {v11, v12}, Lcom/daaw/dd;->a(J)J

    move-result-wide v11

    iget-object v1, v0, Lcom/daaw/qq;->j:Lcom/daaw/wo;

    iget v13, v0, Lcom/daaw/qq;->k:I

    invoke-virtual {v1, v13}, Lcom/daaw/wo;->d(I)Lcom/daaw/gw0;

    move-result-object v1

    iget-wide v13, v1, Lcom/daaw/gw0;->b:J

    invoke-static {v13, v14}, Lcom/daaw/dd;->a(J)J

    move-result-wide v13

    add-long/2addr v11, v13

    add-long/2addr v11, v8

    iget-object v1, v0, Lcom/daaw/qq;->h:Lcom/daaw/ex0$c;

    if-eqz v1, :cond_1

    invoke-virtual {v1, v11, v12}, Lcom/daaw/ex0$c;->f(J)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    iget-object v1, v0, Lcom/daaw/qq;->c:Lcom/google/android/exoplayer2/trackselection/c;

    move-wide/from16 v2, p2

    invoke-interface/range {v1 .. v7}, Lcom/google/android/exoplayer2/trackselection/c;->n(JJJ)V

    iget-object v1, v0, Lcom/daaw/qq;->i:[Lcom/daaw/qq$b;

    iget-object v2, v0, Lcom/daaw/qq;->c:Lcom/google/android/exoplayer2/trackselection/c;

    invoke-interface {v2}, Lcom/google/android/exoplayer2/trackselection/c;->b()I

    move-result v2

    aget-object v11, v1, v2

    iget-object v1, v11, Lcom/daaw/qq$b;->a:Lcom/daaw/ff;

    if-eqz v1, :cond_5

    iget-object v2, v11, Lcom/daaw/qq$b;->b:Lcom/daaw/j41;

    invoke-virtual {v1}, Lcom/daaw/ff;->b()[Lcom/google/android/exoplayer2/Format;

    move-result-object v1

    const/4 v3, 0x0

    if-nez v1, :cond_2

    invoke-virtual {v2}, Lcom/daaw/j41;->k()Lcom/daaw/d31;

    move-result-object v1

    goto :goto_0

    :cond_2
    move-object v1, v3

    :goto_0
    iget-object v4, v11, Lcom/daaw/qq$b;->c:Lcom/daaw/bp;

    if-nez v4, :cond_3

    invoke-virtual {v2}, Lcom/daaw/j41;->j()Lcom/daaw/d31;

    move-result-object v2

    goto :goto_1

    :cond_3
    move-object v2, v3

    :goto_1
    if-nez v1, :cond_4

    if-eqz v2, :cond_5

    :cond_4
    iget-object v4, v0, Lcom/daaw/qq;->e:Lcom/daaw/mp;

    iget-object v3, v0, Lcom/daaw/qq;->c:Lcom/google/android/exoplayer2/trackselection/c;

    invoke-interface {v3}, Lcom/google/android/exoplayer2/trackselection/c;->k()Lcom/google/android/exoplayer2/Format;

    move-result-object v5

    iget-object v3, v0, Lcom/daaw/qq;->c:Lcom/google/android/exoplayer2/trackselection/c;

    invoke-interface {v3}, Lcom/google/android/exoplayer2/trackselection/c;->l()I

    move-result v6

    iget-object v3, v0, Lcom/daaw/qq;->c:Lcom/google/android/exoplayer2/trackselection/c;

    invoke-interface {v3}, Lcom/google/android/exoplayer2/trackselection/c;->o()Ljava/lang/Object;

    move-result-object v7

    move-object v3, v11

    move-object v8, v1

    move-object v9, v2

    invoke-static/range {v3 .. v9}, Lcom/daaw/qq;->k(Lcom/daaw/qq$b;Lcom/daaw/mp;Lcom/google/android/exoplayer2/Format;ILjava/lang/Object;Lcom/daaw/d31;Lcom/daaw/d31;)Lcom/daaw/ef;

    move-result-object v1

    iput-object v1, v10, Lcom/daaw/gf;->a:Lcom/daaw/ef;

    return-void

    :cond_5
    invoke-virtual {v11}, Lcom/daaw/qq$b;->b()I

    move-result v1

    const/4 v3, 0x1

    if-nez v1, :cond_8

    iget-object v1, v0, Lcom/daaw/qq;->j:Lcom/daaw/wo;

    iget-boolean v4, v1, Lcom/daaw/wo;->d:Z

    if-eqz v4, :cond_7

    iget v4, v0, Lcom/daaw/qq;->k:I

    invoke-virtual {v1}, Lcom/daaw/wo;->e()I

    move-result v1

    sub-int/2addr v1, v3

    if-ge v4, v1, :cond_6

    goto :goto_2

    :cond_6
    const/4 v2, 0x0

    goto :goto_3

    :cond_7
    :goto_2
    const/4 v2, 0x1

    :goto_3
    iput-boolean v2, v10, Lcom/daaw/gf;->b:Z

    return-void

    :cond_8
    invoke-virtual {v11}, Lcom/daaw/qq$b;->a()J

    move-result-wide v4

    const/4 v6, -0x1

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v14, 0x1

    if-ne v1, v6, :cond_a

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/qq;->d()J

    move-result-wide v6

    iget-object v1, v0, Lcom/daaw/qq;->j:Lcom/daaw/wo;

    iget-wide v2, v1, Lcom/daaw/wo;->a:J

    invoke-static {v2, v3}, Lcom/daaw/dd;->a(J)J

    move-result-wide v1

    sub-long/2addr v6, v1

    iget-object v1, v0, Lcom/daaw/qq;->j:Lcom/daaw/wo;

    iget v2, v0, Lcom/daaw/qq;->k:I

    invoke-virtual {v1, v2}, Lcom/daaw/wo;->d(I)Lcom/daaw/gw0;

    move-result-object v1

    iget-wide v1, v1, Lcom/daaw/gw0;->b:J

    invoke-static {v1, v2}, Lcom/daaw/dd;->a(J)J

    move-result-wide v1

    sub-long/2addr v6, v1

    iget-object v1, v0, Lcom/daaw/qq;->j:Lcom/daaw/wo;

    iget-wide v1, v1, Lcom/daaw/wo;->f:J

    cmp-long v3, v1, v12

    if-eqz v3, :cond_9

    invoke-static {v1, v2}, Lcom/daaw/dd;->a(J)J

    move-result-wide v1

    sub-long v1, v6, v1

    invoke-virtual {v11, v1, v2}, Lcom/daaw/qq$b;->d(J)J

    move-result-wide v1

    invoke-static {v4, v5, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    :cond_9
    invoke-virtual {v11, v6, v7}, Lcom/daaw/qq$b;->d(J)J

    move-result-wide v1

    goto :goto_4

    :cond_a
    int-to-long v1, v1

    add-long/2addr v1, v4

    :goto_4
    sub-long/2addr v1, v14

    move-wide/from16 v18, v4

    invoke-virtual {v0, v11, v1, v2}, Lcom/daaw/qq;->n(Lcom/daaw/qq$b;J)V

    if-nez p1, :cond_b

    invoke-virtual {v11, v8, v9}, Lcom/daaw/qq$b;->d(J)J

    move-result-wide v16

    move-wide/from16 v20, v1

    invoke-static/range {v16 .. v21}, Lcom/daaw/sq1;->m(JJJ)J

    move-result-wide v3

    goto :goto_5

    :cond_b
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/zn0;->e()J

    move-result-wide v3

    cmp-long v5, v3, v18

    if-gez v5, :cond_c

    new-instance v1, Lcom/daaw/ob;

    invoke-direct {v1}, Lcom/daaw/ob;-><init>()V

    iput-object v1, v0, Lcom/daaw/qq;->l:Ljava/io/IOException;

    return-void

    :cond_c
    :goto_5
    move-wide/from16 v17, v3

    cmp-long v3, v17, v1

    if-gtz v3, :cond_f

    iget-boolean v3, v0, Lcom/daaw/qq;->m:Z

    if-eqz v3, :cond_d

    cmp-long v3, v17, v1

    if-ltz v3, :cond_d

    goto :goto_7

    :cond_d
    iget v3, v0, Lcom/daaw/qq;->g:I

    int-to-long v3, v3

    sub-long v1, v1, v17

    add-long/2addr v1, v14

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v2, v1

    if-nez p1, :cond_e

    move-wide/from16 v20, v8

    goto :goto_6

    :cond_e
    move-wide/from16 v20, v12

    :goto_6
    iget-object v12, v0, Lcom/daaw/qq;->e:Lcom/daaw/mp;

    iget v13, v0, Lcom/daaw/qq;->d:I

    iget-object v1, v0, Lcom/daaw/qq;->c:Lcom/google/android/exoplayer2/trackselection/c;

    invoke-interface {v1}, Lcom/google/android/exoplayer2/trackselection/c;->k()Lcom/google/android/exoplayer2/Format;

    move-result-object v14

    iget-object v1, v0, Lcom/daaw/qq;->c:Lcom/google/android/exoplayer2/trackselection/c;

    invoke-interface {v1}, Lcom/google/android/exoplayer2/trackselection/c;->l()I

    move-result v15

    iget-object v1, v0, Lcom/daaw/qq;->c:Lcom/google/android/exoplayer2/trackselection/c;

    invoke-interface {v1}, Lcom/google/android/exoplayer2/trackselection/c;->o()Ljava/lang/Object;

    move-result-object v16

    move/from16 v19, v2

    invoke-static/range {v11 .. v21}, Lcom/daaw/qq;->l(Lcom/daaw/qq$b;Lcom/daaw/mp;ILcom/google/android/exoplayer2/Format;ILjava/lang/Object;JIJ)Lcom/daaw/ef;

    move-result-object v1

    iput-object v1, v10, Lcom/daaw/gf;->a:Lcom/daaw/ef;

    return-void

    :cond_f
    :goto_7
    iget-object v1, v0, Lcom/daaw/qq;->j:Lcom/daaw/wo;

    iget-boolean v2, v1, Lcom/daaw/wo;->d:Z

    if-eqz v2, :cond_11

    iget v2, v0, Lcom/daaw/qq;->k:I

    invoke-virtual {v1}, Lcom/daaw/wo;->e()I

    move-result v1

    const/4 v3, 0x1

    sub-int/2addr v1, v3

    if-ge v2, v1, :cond_10

    goto :goto_8

    :cond_10
    const/4 v2, 0x0

    goto :goto_9

    :cond_11
    const/4 v3, 0x1

    :goto_8
    const/4 v2, 0x1

    :goto_9
    iput-boolean v2, v10, Lcom/daaw/gf;->b:Z

    return-void
.end method

.method public final j()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/daaw/j41;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/qq;->j:Lcom/daaw/wo;

    iget v1, p0, Lcom/daaw/qq;->k:I

    invoke-virtual {v0, v1}, Lcom/daaw/wo;->d(I)Lcom/daaw/gw0;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/gw0;->c:Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lcom/daaw/qq;->b:[I

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget v5, v2, v4

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/e1;

    iget-object v5, v5, Lcom/daaw/e1;->c:Ljava/util/List;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final m(J)J
    .locals 5

    iget-object v0, p0, Lcom/daaw/qq;->j:Lcom/daaw/wo;

    iget-boolean v0, v0, Lcom/daaw/wo;->d:Z

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v0, :cond_0

    iget-wide v3, p0, Lcom/daaw/qq;->n:J

    cmp-long v0, v3, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/daaw/qq;->n:J

    sub-long p1, v0, p1

    move-wide v1, p1

    :cond_1
    return-wide v1
.end method

.method public final n(Lcom/daaw/qq$b;J)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/qq;->j:Lcom/daaw/wo;

    iget-boolean v0, v0, Lcom/daaw/wo;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2, p3}, Lcom/daaw/qq$b;->c(J)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    iput-wide p1, p0, Lcom/daaw/qq;->n:J

    return-void
.end method
