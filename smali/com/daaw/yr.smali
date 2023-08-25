.class public Lcom/daaw/yr;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/we1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/yr$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/lk0;

.field public final b:I

.field public final c:Lcom/google/android/exoplayer2/trackselection/c;

.field public final d:[Lcom/daaw/ff;

.field public final e:Lcom/daaw/mp;

.field public f:Lcom/daaw/xe1;

.field public g:I

.field public h:Ljava/io/IOException;


# direct methods
.method public constructor <init>(Lcom/daaw/lk0;Lcom/daaw/xe1;ILcom/google/android/exoplayer2/trackselection/c;Lcom/daaw/mp;[Lcom/daaw/pm1;)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v3, p4

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v4, p1

    iput-object v4, v0, Lcom/daaw/yr;->a:Lcom/daaw/lk0;

    iput-object v1, v0, Lcom/daaw/yr;->f:Lcom/daaw/xe1;

    iput v2, v0, Lcom/daaw/yr;->b:I

    iput-object v3, v0, Lcom/daaw/yr;->c:Lcom/google/android/exoplayer2/trackselection/c;

    move-object/from16 v4, p5

    iput-object v4, v0, Lcom/daaw/yr;->e:Lcom/daaw/mp;

    iget-object v4, v1, Lcom/daaw/xe1;->f:[Lcom/daaw/xe1$b;

    aget-object v2, v4, v2

    invoke-interface/range {p4 .. p4}, Lcom/google/android/exoplayer2/trackselection/c;->length()I

    move-result v4

    new-array v4, v4, [Lcom/daaw/ff;

    iput-object v4, v0, Lcom/daaw/yr;->d:[Lcom/daaw/ff;

    const/4 v5, 0x0

    :goto_0
    iget-object v6, v0, Lcom/daaw/yr;->d:[Lcom/daaw/ff;

    array-length v6, v6

    if-ge v5, v6, :cond_1

    invoke-interface {v3, v5}, Lcom/google/android/exoplayer2/trackselection/c;->f(I)I

    move-result v8

    iget-object v6, v2, Lcom/daaw/xe1$b;->j:[Lcom/google/android/exoplayer2/Format;

    aget-object v6, v6, v8

    iget v9, v2, Lcom/daaw/xe1$b;->a:I

    const/4 v7, 0x2

    if-ne v9, v7, :cond_0

    const/4 v7, 0x4

    const/16 v19, 0x4

    goto :goto_1

    :cond_0
    const/16 v19, 0x0

    :goto_1
    new-instance v14, Lcom/daaw/nm1;

    iget-wide v10, v2, Lcom/daaw/xe1$b;->c:J

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    move/from16 p3, v5

    iget-wide v4, v1, Lcom/daaw/xe1;->g:J

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object v7, v14

    move-object/from16 v22, v14

    move-wide v14, v4

    move-object/from16 v16, v6

    move-object/from16 v18, p6

    invoke-direct/range {v7 .. v21}, Lcom/daaw/nm1;-><init>(IIJJJLcom/google/android/exoplayer2/Format;I[Lcom/daaw/pm1;I[J[J)V

    new-instance v4, Lcom/daaw/d40;

    const/4 v5, 0x3

    const/4 v7, 0x0

    move-object/from16 v8, v22

    invoke-direct {v4, v5, v7, v8, v7}, Lcom/daaw/d40;-><init>(ILcom/daaw/ol1;Lcom/daaw/nm1;Lcom/google/android/exoplayer2/drm/DrmInitData;)V

    iget-object v5, v0, Lcom/daaw/yr;->d:[Lcom/daaw/ff;

    new-instance v7, Lcom/daaw/ff;

    iget v8, v2, Lcom/daaw/xe1$b;->a:I

    invoke-direct {v7, v4, v8, v6}, Lcom/daaw/ff;-><init>(Lcom/daaw/zz;ILcom/google/android/exoplayer2/Format;)V

    aput-object v7, v5, p3

    add-int/lit8 v5, p3, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static d(Lcom/google/android/exoplayer2/Format;Lcom/daaw/mp;Landroid/net/Uri;Ljava/lang/String;IJJJILjava/lang/Object;Lcom/daaw/ff;)Lcom/daaw/zn0;
    .locals 20

    move-object/from16 v3, p0

    move-object/from16 v1, p1

    move-wide/from16 v6, p5

    move-wide/from16 v15, p5

    move-wide/from16 v8, p7

    move-wide/from16 v10, p9

    move/from16 v4, p11

    move-object/from16 v5, p12

    move-object/from16 v17, p13

    new-instance v0, Lcom/daaw/pp;

    move-object v2, v0

    const-wide/16 v12, 0x0

    const-wide/16 v18, -0x1

    move-object/from16 p5, v0

    move-object/from16 p6, p2

    move-wide/from16 p7, v12

    move-wide/from16 p9, v18

    move-object/from16 p11, p3

    invoke-direct/range {p5 .. p11}, Lcom/daaw/pp;-><init>(Landroid/net/Uri;JJLjava/lang/String;)V

    new-instance v18, Lcom/daaw/fk;

    move-object/from16 v0, v18

    move/from16 v12, p4

    int-to-long v12, v12

    const/4 v14, 0x1

    invoke-direct/range {v0 .. v17}, Lcom/daaw/fk;-><init>(Lcom/daaw/mp;Lcom/daaw/pp;Lcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJJIJLcom/daaw/ff;)V

    return-object v18
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/yr;->h:Ljava/io/IOException;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/yr;->a:Lcom/daaw/lk0;

    invoke-interface {v0}, Lcom/daaw/lk0;->a()V

    return-void

    :cond_0
    throw v0
.end method

.method public b(Lcom/daaw/xe1;)V
    .locals 8

    iget-object v0, p0, Lcom/daaw/yr;->f:Lcom/daaw/xe1;

    iget-object v0, v0, Lcom/daaw/xe1;->f:[Lcom/daaw/xe1$b;

    iget v1, p0, Lcom/daaw/yr;->b:I

    aget-object v0, v0, v1

    iget v2, v0, Lcom/daaw/xe1$b;->k:I

    iget-object v3, p1, Lcom/daaw/xe1;->f:[Lcom/daaw/xe1$b;

    aget-object v1, v3, v1

    if-eqz v2, :cond_2

    iget v3, v1, Lcom/daaw/xe1$b;->k:I

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v3, v2, -0x1

    invoke-virtual {v0, v3}, Lcom/daaw/xe1$b;->e(I)J

    move-result-wide v4

    invoke-virtual {v0, v3}, Lcom/daaw/xe1$b;->c(I)J

    move-result-wide v6

    add-long/2addr v4, v6

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lcom/daaw/xe1$b;->e(I)J

    move-result-wide v6

    cmp-long v1, v4, v6

    if-gtz v1, :cond_1

    goto :goto_0

    :cond_1
    iget v1, p0, Lcom/daaw/yr;->g:I

    invoke-virtual {v0, v6, v7}, Lcom/daaw/xe1$b;->d(J)I

    move-result v0

    add-int/2addr v1, v0

    iput v1, p0, Lcom/daaw/yr;->g:I

    goto :goto_1

    :cond_2
    :goto_0
    iget v0, p0, Lcom/daaw/yr;->g:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/daaw/yr;->g:I

    :goto_1
    iput-object p1, p0, Lcom/daaw/yr;->f:Lcom/daaw/xe1;

    return-void
.end method

.method public e(JLcom/daaw/ea1;)J
    .locals 9

    iget-object v0, p0, Lcom/daaw/yr;->f:Lcom/daaw/xe1;

    iget-object v0, v0, Lcom/daaw/xe1;->f:[Lcom/daaw/xe1$b;

    iget v1, p0, Lcom/daaw/yr;->b:I

    aget-object v0, v0, v1

    invoke-virtual {v0, p1, p2}, Lcom/daaw/xe1$b;->d(J)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/xe1$b;->e(I)J

    move-result-wide v5

    cmp-long v2, v5, p1

    if-gez v2, :cond_0

    iget v2, v0, Lcom/daaw/xe1$b;->k:I

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lcom/daaw/xe1$b;->e(I)J

    move-result-wide v0

    move-wide v7, v0

    goto :goto_0

    :cond_0
    move-wide v7, v5

    :goto_0
    move-wide v2, p1

    move-object v4, p3

    invoke-static/range {v2 .. v8}, Lcom/daaw/sq1;->S(JLcom/daaw/ea1;JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public f(Lcom/daaw/ef;)V
    .locals 0

    return-void
.end method

.method public g(Lcom/daaw/ef;ZLjava/lang/Exception;)Z
    .locals 0

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/yr;->c:Lcom/google/android/exoplayer2/trackselection/c;

    iget-object p1, p1, Lcom/daaw/ef;->c:Lcom/google/android/exoplayer2/Format;

    invoke-interface {p2, p1}, Lcom/google/android/exoplayer2/trackselection/c;->i(Lcom/google/android/exoplayer2/Format;)I

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

    iget-object v0, p0, Lcom/daaw/yr;->h:Ljava/io/IOException;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/yr;->c:Lcom/google/android/exoplayer2/trackselection/c;

    invoke-interface {v0}, Lcom/google/android/exoplayer2/trackselection/c;->length()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/yr;->c:Lcom/google/android/exoplayer2/trackselection/c;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/exoplayer2/trackselection/c;->h(JLjava/util/List;)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    return p1
.end method

.method public final i(Lcom/daaw/zn0;JJLcom/daaw/gf;)V
    .locals 27

    move-object/from16 v0, p0

    move-wide/from16 v2, p2

    move-wide/from16 v8, p4

    move-object/from16 v10, p6

    iget-object v1, v0, Lcom/daaw/yr;->h:Ljava/io/IOException;

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget-object v1, v0, Lcom/daaw/yr;->f:Lcom/daaw/xe1;

    iget-object v4, v1, Lcom/daaw/xe1;->f:[Lcom/daaw/xe1$b;

    iget v5, v0, Lcom/daaw/yr;->b:I

    aget-object v11, v4, v5

    iget v4, v11, Lcom/daaw/xe1$b;->k:I

    if-nez v4, :cond_1

    iget-boolean v1, v1, Lcom/daaw/xe1;->d:Z

    xor-int/lit8 v1, v1, 0x1

    iput-boolean v1, v10, Lcom/daaw/gf;->b:Z

    return-void

    :cond_1
    if-nez p1, :cond_2

    invoke-virtual {v11, v8, v9}, Lcom/daaw/xe1$b;->d(J)I

    move-result v1

    goto :goto_0

    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/zn0;->e()J

    move-result-wide v4

    iget v1, v0, Lcom/daaw/yr;->g:I

    int-to-long v6, v1

    sub-long/2addr v4, v6

    long-to-int v1, v4

    if-gez v1, :cond_3

    new-instance v1, Lcom/daaw/ob;

    invoke-direct {v1}, Lcom/daaw/ob;-><init>()V

    iput-object v1, v0, Lcom/daaw/yr;->h:Ljava/io/IOException;

    return-void

    :cond_3
    :goto_0
    move v12, v1

    iget v1, v11, Lcom/daaw/xe1$b;->k:I

    if-lt v12, v1, :cond_4

    iget-object v1, v0, Lcom/daaw/yr;->f:Lcom/daaw/xe1;

    iget-boolean v1, v1, Lcom/daaw/xe1;->d:Z

    xor-int/lit8 v1, v1, 0x1

    iput-boolean v1, v10, Lcom/daaw/gf;->b:Z

    return-void

    :cond_4
    sub-long v4, v8, v2

    invoke-virtual {v0, v2, v3}, Lcom/daaw/yr;->j(J)J

    move-result-wide v6

    iget-object v1, v0, Lcom/daaw/yr;->c:Lcom/google/android/exoplayer2/trackselection/c;

    move-wide/from16 v2, p2

    invoke-interface/range {v1 .. v7}, Lcom/google/android/exoplayer2/trackselection/c;->n(JJJ)V

    invoke-virtual {v11, v12}, Lcom/daaw/xe1$b;->e(I)J

    move-result-wide v18

    invoke-virtual {v11, v12}, Lcom/daaw/xe1$b;->c(I)J

    move-result-wide v1

    add-long v20, v18, v1

    if-nez p1, :cond_5

    move-wide/from16 v22, v8

    goto :goto_1

    :cond_5
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    move-wide/from16 v22, v1

    :goto_1
    iget v1, v0, Lcom/daaw/yr;->g:I

    add-int v17, v12, v1

    iget-object v1, v0, Lcom/daaw/yr;->c:Lcom/google/android/exoplayer2/trackselection/c;

    invoke-interface {v1}, Lcom/google/android/exoplayer2/trackselection/c;->b()I

    move-result v1

    iget-object v2, v0, Lcom/daaw/yr;->d:[Lcom/daaw/ff;

    aget-object v26, v2, v1

    iget-object v2, v0, Lcom/daaw/yr;->c:Lcom/google/android/exoplayer2/trackselection/c;

    invoke-interface {v2, v1}, Lcom/google/android/exoplayer2/trackselection/c;->f(I)I

    move-result v1

    invoke-virtual {v11, v1, v12}, Lcom/daaw/xe1$b;->a(II)Landroid/net/Uri;

    move-result-object v15

    iget-object v1, v0, Lcom/daaw/yr;->c:Lcom/google/android/exoplayer2/trackselection/c;

    invoke-interface {v1}, Lcom/google/android/exoplayer2/trackselection/c;->k()Lcom/google/android/exoplayer2/Format;

    move-result-object v13

    iget-object v14, v0, Lcom/daaw/yr;->e:Lcom/daaw/mp;

    const/16 v16, 0x0

    iget-object v1, v0, Lcom/daaw/yr;->c:Lcom/google/android/exoplayer2/trackselection/c;

    invoke-interface {v1}, Lcom/google/android/exoplayer2/trackselection/c;->l()I

    move-result v24

    iget-object v1, v0, Lcom/daaw/yr;->c:Lcom/google/android/exoplayer2/trackselection/c;

    invoke-interface {v1}, Lcom/google/android/exoplayer2/trackselection/c;->o()Ljava/lang/Object;

    move-result-object v25

    invoke-static/range {v13 .. v26}, Lcom/daaw/yr;->d(Lcom/google/android/exoplayer2/Format;Lcom/daaw/mp;Landroid/net/Uri;Ljava/lang/String;IJJJILjava/lang/Object;Lcom/daaw/ff;)Lcom/daaw/zn0;

    move-result-object v1

    iput-object v1, v10, Lcom/daaw/gf;->a:Lcom/daaw/ef;

    return-void
.end method

.method public final j(J)J
    .locals 4

    iget-object v0, p0, Lcom/daaw/yr;->f:Lcom/daaw/xe1;

    iget-boolean v1, v0, Lcom/daaw/xe1;->d:Z

    if-nez v1, :cond_0

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    return-wide p1

    :cond_0
    iget-object v0, v0, Lcom/daaw/xe1;->f:[Lcom/daaw/xe1$b;

    iget v1, p0, Lcom/daaw/yr;->b:I

    aget-object v0, v0, v1

    iget v1, v0, Lcom/daaw/xe1$b;->k:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lcom/daaw/xe1$b;->e(I)J

    move-result-wide v2

    invoke-virtual {v0, v1}, Lcom/daaw/xe1$b;->c(I)J

    move-result-wide v0

    add-long/2addr v2, v0

    sub-long/2addr v2, p1

    return-wide v2
.end method
