.class public final Lcom/daaw/c7;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/c7$e;,
        Lcom/daaw/c7$d;,
        Lcom/daaw/c7$b;,
        Lcom/daaw/c7$c;,
        Lcom/daaw/c7$f;,
        Lcom/daaw/c7$a;
    }
.end annotation


# static fields
.field public static final a:I

.field public static final b:I

.field public static final c:I

.field public static final d:I

.field public static final e:I

.field public static final f:I

.field public static final g:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "vide"

    invoke-static {v0}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/c7;->a:I

    const-string v0, "soun"

    invoke-static {v0}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/c7;->b:I

    const-string v0, "text"

    invoke-static {v0}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/c7;->c:I

    const-string v0, "sbtl"

    invoke-static {v0}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/c7;->d:I

    const-string v0, "subt"

    invoke-static {v0}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/c7;->e:I

    const-string v0, "clcp"

    invoke-static {v0}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/c7;->f:I

    const-string v0, "meta"

    invoke-static {v0}, Lcom/daaw/sq1;->v(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/c7;->g:I

    return-void
.end method

.method public static a([JJJJ)Z
    .locals 7

    array-length v0, p0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {v2, v3, v0}, Lcom/daaw/sq1;->l(III)I

    move-result v4

    array-length v5, p0

    sub-int/2addr v5, v2

    invoke-static {v5, v3, v0}, Lcom/daaw/sq1;->l(III)I

    move-result v0

    aget-wide v5, p0, v3

    cmp-long v2, v5, p3

    if-gtz v2, :cond_0

    aget-wide v4, p0, v4

    cmp-long v2, p3, v4

    if-gez v2, :cond_0

    aget-wide p3, p0, v0

    cmp-long p0, p3, p5

    if-gez p0, :cond_0

    cmp-long p0, p5, p1

    if-gtz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public static b(Lcom/daaw/rv0;II)I
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/rv0;->c()I

    move-result v0

    :goto_0
    sub-int v1, v0, p1

    if-ge v1, p2, :cond_2

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    const-string v3, "childAtomSize should be positive"

    invoke-static {v2, v3}, Lcom/daaw/s6;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v2

    sget v3, Lcom/daaw/b7;->K:I

    if-ne v2, v3, :cond_1

    return v0

    :cond_1
    add-int/2addr v0, v1

    goto :goto_0

    :cond_2
    const/4 p0, -0x1

    return p0
.end method

.method public static c(Lcom/daaw/rv0;IIIILjava/lang/String;ZLcom/google/android/exoplayer2/drm/DrmInitData;Lcom/daaw/c7$c;I)V
    .locals 28

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v14, p5

    move-object/from16 v3, p7

    move-object/from16 v15, p8

    add-int/lit8 v4, v1, 0x8

    const/16 v5, 0x8

    add-int/2addr v4, v5

    invoke-virtual {v0, v4}, Lcom/daaw/rv0;->J(I)V

    const/4 v4, 0x6

    const/4 v13, 0x0

    if-eqz p6, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->D()I

    move-result v5

    invoke-virtual {v0, v4}, Lcom/daaw/rv0;->K(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v5}, Lcom/daaw/rv0;->K(I)V

    const/4 v5, 0x0

    :goto_0
    const/4 v12, 0x2

    const/16 v6, 0x10

    const/4 v11, 0x1

    if-eqz v5, :cond_3

    if-ne v5, v11, :cond_1

    goto :goto_1

    :cond_1
    if-ne v5, v12, :cond_2

    invoke-virtual {v0, v6}, Lcom/daaw/rv0;->K(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->h()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v4

    long-to-int v5, v4

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->B()I

    move-result v4

    const/16 v6, 0x14

    invoke-virtual {v0, v6}, Lcom/daaw/rv0;->K(I)V

    goto :goto_2

    :cond_2
    return-void

    :cond_3
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->D()I

    move-result v7

    invoke-virtual {v0, v4}, Lcom/daaw/rv0;->K(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->y()I

    move-result v4

    if-ne v5, v11, :cond_4

    invoke-virtual {v0, v6}, Lcom/daaw/rv0;->K(I)V

    :cond_4
    move v5, v4

    move v4, v7

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->c()I

    move-result v6

    sget v7, Lcom/daaw/b7;->b0:I

    const/16 v16, 0x0

    move/from16 v8, p1

    if-ne v8, v7, :cond_7

    invoke-static {v0, v1, v2}, Lcom/daaw/c7;->o(Lcom/daaw/rv0;II)Landroid/util/Pair;

    move-result-object v7

    if-eqz v7, :cond_6

    iget-object v8, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-nez v3, :cond_5

    move-object/from16 v3, v16

    goto :goto_3

    :cond_5
    iget-object v9, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v9, Lcom/daaw/pm1;

    iget-object v9, v9, Lcom/daaw/pm1;->b:Ljava/lang/String;

    invoke-virtual {v3, v9}, Lcom/google/android/exoplayer2/drm/DrmInitData;->c(Ljava/lang/String;)Lcom/google/android/exoplayer2/drm/DrmInitData;

    move-result-object v3

    :goto_3
    iget-object v9, v15, Lcom/daaw/c7$c;->a:[Lcom/daaw/pm1;

    iget-object v7, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v7, Lcom/daaw/pm1;

    aput-object v7, v9, p9

    :cond_6
    invoke-virtual {v0, v6}, Lcom/daaw/rv0;->J(I)V

    :cond_7
    move-object v10, v3

    sget v3, Lcom/daaw/b7;->o:I

    const-string v9, "audio/raw"

    if-ne v8, v3, :cond_8

    const-string v3, "audio/ac3"

    goto :goto_6

    :cond_8
    sget v3, Lcom/daaw/b7;->q:I

    if-ne v8, v3, :cond_9

    const-string v3, "audio/eac3"

    goto :goto_6

    :cond_9
    sget v3, Lcom/daaw/b7;->s:I

    if-ne v8, v3, :cond_a

    const-string v3, "audio/vnd.dts"

    goto :goto_6

    :cond_a
    sget v3, Lcom/daaw/b7;->t:I

    if-eq v8, v3, :cond_13

    sget v3, Lcom/daaw/b7;->u:I

    if-ne v8, v3, :cond_b

    goto :goto_5

    :cond_b
    sget v3, Lcom/daaw/b7;->v:I

    if-ne v8, v3, :cond_c

    const-string v3, "audio/vnd.dts.hd;profile=lbr"

    goto :goto_6

    :cond_c
    sget v3, Lcom/daaw/b7;->z0:I

    if-ne v8, v3, :cond_d

    const-string v3, "audio/3gpp"

    goto :goto_6

    :cond_d
    sget v3, Lcom/daaw/b7;->A0:I

    if-ne v8, v3, :cond_e

    const-string v3, "audio/amr-wb"

    goto :goto_6

    :cond_e
    sget v3, Lcom/daaw/b7;->m:I

    if-eq v8, v3, :cond_12

    sget v3, Lcom/daaw/b7;->n:I

    if-ne v8, v3, :cond_f

    goto :goto_4

    :cond_f
    sget v3, Lcom/daaw/b7;->k:I

    if-ne v8, v3, :cond_10

    const-string v3, "audio/mpeg"

    goto :goto_6

    :cond_10
    sget v3, Lcom/daaw/b7;->P0:I

    if-ne v8, v3, :cond_11

    const-string v3, "audio/alac"

    goto :goto_6

    :cond_11
    move-object/from16 v3, v16

    goto :goto_6

    :cond_12
    :goto_4
    move-object v3, v9

    goto :goto_6

    :cond_13
    :goto_5
    const-string v3, "audio/vnd.dts.hd"

    :goto_6
    move-object v8, v3

    move/from16 v17, v4

    move/from16 v18, v5

    move v7, v6

    move-object/from16 v19, v16

    :goto_7
    sub-int v3, v7, v1

    const/4 v4, -0x1

    if-ge v3, v2, :cond_1e

    invoke-virtual {v0, v7}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->i()I

    move-result v6

    if-lez v6, :cond_14

    const/4 v3, 0x1

    goto :goto_8

    :cond_14
    const/4 v3, 0x0

    :goto_8
    const-string v5, "childAtomSize should be positive"

    invoke-static {v3, v5}, Lcom/daaw/s6;->b(ZLjava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->i()I

    move-result v3

    sget v5, Lcom/daaw/b7;->K:I

    if-eq v3, v5, :cond_1b

    if-eqz p6, :cond_15

    sget v11, Lcom/daaw/b7;->l:I

    if-ne v3, v11, :cond_15

    goto/16 :goto_c

    :cond_15
    sget v4, Lcom/daaw/b7;->p:I

    if-ne v3, v4, :cond_16

    add-int/lit8 v3, v7, 0x8

    invoke-virtual {v0, v3}, Lcom/daaw/rv0;->J(I)V

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, v14, v10}, Lcom/daaw/u;->d(Lcom/daaw/rv0;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;

    move-result-object v3

    :goto_9
    iput-object v3, v15, Lcom/daaw/c7$c;->b:Lcom/google/android/exoplayer2/Format;

    move-object/from16 v25, v8

    move-object/from16 v26, v9

    move-object/from16 v21, v10

    const/4 v1, 0x0

    const/16 v20, 0x1

    const/16 v22, 0x2

    goto/16 :goto_b

    :cond_16
    sget v4, Lcom/daaw/b7;->r:I

    if-ne v3, v4, :cond_17

    add-int/lit8 v3, v7, 0x8

    invoke-virtual {v0, v3}, Lcom/daaw/rv0;->J(I)V

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, v14, v10}, Lcom/daaw/u;->g(Lcom/daaw/rv0;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;

    move-result-object v3

    goto :goto_9

    :cond_17
    sget v4, Lcom/daaw/b7;->w:I

    if-ne v3, v4, :cond_18

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v11, -0x1

    const/16 v21, -0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object v4, v8

    move/from16 v24, v6

    move v6, v11

    move v11, v7

    move/from16 v7, v21

    move-object/from16 v25, v8

    move/from16 v8, v17

    move-object/from16 v26, v9

    move/from16 v9, v18

    move-object/from16 v21, v10

    move-object/from16 v10, v22

    move/from16 v27, v11

    const/16 v20, 0x1

    move-object/from16 v11, v21

    const/16 v22, 0x2

    move/from16 v12, v23

    const/4 v1, 0x0

    move-object/from16 v13, p5

    invoke-static/range {v3 .. v13}, Lcom/google/android/exoplayer2/Format;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/util/List;Lcom/google/android/exoplayer2/drm/DrmInitData;ILjava/lang/String;)Lcom/google/android/exoplayer2/Format;

    move-result-object v3

    iput-object v3, v15, Lcom/daaw/c7$c;->b:Lcom/google/android/exoplayer2/Format;

    move/from16 v6, v24

    goto :goto_a

    :cond_18
    move/from16 v24, v6

    move/from16 v27, v7

    move-object/from16 v25, v8

    move-object/from16 v26, v9

    move-object/from16 v21, v10

    const/4 v1, 0x0

    const/16 v20, 0x1

    const/16 v22, 0x2

    sget v4, Lcom/daaw/b7;->P0:I

    if-ne v3, v4, :cond_19

    new-array v3, v6, [B

    move/from16 v7, v27

    invoke-virtual {v0, v7}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {v0, v3, v1, v6}, Lcom/daaw/rv0;->g([BII)V

    move-object/from16 v19, v3

    goto :goto_b

    :cond_19
    :goto_a
    move/from16 v7, v27

    :cond_1a
    :goto_b
    move-object/from16 v8, v25

    goto :goto_e

    :cond_1b
    :goto_c
    move-object/from16 v25, v8

    move-object/from16 v26, v9

    move-object/from16 v21, v10

    const/4 v1, 0x0

    const/16 v20, 0x1

    const/16 v22, 0x2

    if-ne v3, v5, :cond_1c

    move v3, v7

    goto :goto_d

    :cond_1c
    invoke-static {v0, v7, v6}, Lcom/daaw/c7;->b(Lcom/daaw/rv0;II)I

    move-result v3

    :goto_d
    if-eq v3, v4, :cond_1a

    invoke-static {v0, v3}, Lcom/daaw/c7;->f(Lcom/daaw/rv0;I)Landroid/util/Pair;

    move-result-object v3

    iget-object v4, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    move-object v8, v4

    check-cast v8, Ljava/lang/String;

    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    move-object/from16 v19, v3

    check-cast v19, [B

    const-string v3, "audio/mp4a-latm"

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1d

    invoke-static/range {v19 .. v19}, Lcom/daaw/eg;->i([B)Landroid/util/Pair;

    move-result-object v3

    iget-object v4, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v18

    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v17

    :cond_1d
    :goto_e
    add-int/2addr v7, v6

    move/from16 v1, p2

    move-object/from16 v10, v21

    move-object/from16 v9, v26

    const/4 v11, 0x1

    const/4 v12, 0x2

    const/4 v13, 0x0

    goto/16 :goto_7

    :cond_1e
    move-object/from16 v25, v8

    move-object/from16 v26, v9

    move-object/from16 v21, v10

    const/16 v22, 0x2

    iget-object v0, v15, Lcom/daaw/c7$c;->b:Lcom/google/android/exoplayer2/Format;

    if-nez v0, :cond_21

    move-object/from16 v8, v25

    if-eqz v8, :cond_21

    move-object/from16 v0, v26

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1f

    const/4 v7, 0x2

    goto :goto_f

    :cond_1f
    const/4 v7, -0x1

    :goto_f
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, -0x1

    if-nez v19, :cond_20

    goto :goto_10

    :cond_20
    invoke-static/range {v19 .. v19}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    move-object/from16 v16, v1

    :goto_10
    const/4 v10, 0x0

    move-object v1, v8

    move/from16 v5, v17

    move/from16 v6, v18

    move-object/from16 v8, v16

    move-object/from16 v9, v21

    move-object/from16 v11, p5

    invoke-static/range {v0 .. v11}, Lcom/google/android/exoplayer2/Format;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILjava/util/List;Lcom/google/android/exoplayer2/drm/DrmInitData;ILjava/lang/String;)Lcom/google/android/exoplayer2/Format;

    move-result-object v0

    iput-object v0, v15, Lcom/daaw/c7$c;->b:Lcom/google/android/exoplayer2/Format;

    :cond_21
    return-void
.end method

.method public static d(Lcom/daaw/rv0;II)Landroid/util/Pair;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/rv0;",
            "II)",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Lcom/daaw/pm1;",
            ">;"
        }
    .end annotation

    add-int/lit8 v0, p1, 0x8

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, v2

    move-object v6, v4

    const/4 v5, -0x1

    const/4 v7, 0x0

    :goto_0
    sub-int v8, v0, p1

    if-ge v8, p2, :cond_3

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v8

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v9

    sget v10, Lcom/daaw/b7;->c0:I

    if-ne v9, v10, :cond_0

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    goto :goto_1

    :cond_0
    sget v10, Lcom/daaw/b7;->X:I

    if-ne v9, v10, :cond_1

    const/4 v4, 0x4

    invoke-virtual {p0, v4}, Lcom/daaw/rv0;->K(I)V

    invoke-virtual {p0, v4}, Lcom/daaw/rv0;->u(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    sget v10, Lcom/daaw/b7;->Y:I

    if-ne v9, v10, :cond_2

    move v5, v0

    move v7, v8

    :cond_2
    :goto_1
    add-int/2addr v0, v8

    goto :goto_0

    :cond_3
    const-string p1, "cenc"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, "cbc1"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, "cens"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, "cbcs"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    return-object v2

    :cond_5
    :goto_2
    const/4 p1, 0x1

    if-eqz v6, :cond_6

    const/4 p2, 0x1

    goto :goto_3

    :cond_6
    const/4 p2, 0x0

    :goto_3
    const-string v0, "frma atom is mandatory"

    invoke-static {p2, v0}, Lcom/daaw/s6;->b(ZLjava/lang/Object;)V

    if-eq v5, v1, :cond_7

    const/4 p2, 0x1

    goto :goto_4

    :cond_7
    const/4 p2, 0x0

    :goto_4
    const-string v0, "schi atom is mandatory"

    invoke-static {p2, v0}, Lcom/daaw/s6;->b(ZLjava/lang/Object;)V

    invoke-static {p0, v5, v7, v4}, Lcom/daaw/c7;->p(Lcom/daaw/rv0;IILjava/lang/String;)Lcom/daaw/pm1;

    move-result-object p0

    if-eqz p0, :cond_8

    const/4 v3, 0x1

    :cond_8
    const-string p1, "tenc atom is mandatory"

    invoke-static {v3, p1}, Lcom/daaw/s6;->b(ZLjava/lang/Object;)V

    invoke-static {v6, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lcom/daaw/b7$a;)Landroid/util/Pair;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/b7$a;",
            ")",
            "Landroid/util/Pair<",
            "[J[J>;"
        }
    .end annotation

    if-eqz p0, :cond_5

    sget v0, Lcom/daaw/b7;->R:I

    invoke-virtual {p0, v0}, Lcom/daaw/b7$a;->g(I)Lcom/daaw/b7$b;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_3

    :cond_0
    iget-object p0, p0, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v0

    invoke-static {v0}, Lcom/daaw/b7;->c(I)I

    move-result v0

    invoke-virtual {p0}, Lcom/daaw/rv0;->B()I

    move-result v1

    new-array v2, v1, [J

    new-array v3, v1, [J

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_4

    const/4 v5, 0x1

    if-ne v0, v5, :cond_1

    invoke-virtual {p0}, Lcom/daaw/rv0;->C()J

    move-result-wide v6

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/rv0;->z()J

    move-result-wide v6

    :goto_1
    aput-wide v6, v2, v4

    if-ne v0, v5, :cond_2

    invoke-virtual {p0}, Lcom/daaw/rv0;->q()J

    move-result-wide v6

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v6

    int-to-long v6, v6

    :goto_2
    aput-wide v6, v3, v4

    invoke-virtual {p0}, Lcom/daaw/rv0;->t()S

    move-result v6

    if-ne v6, v5, :cond_3

    const/4 v5, 0x2

    invoke-virtual {p0, v5}, Lcom/daaw/rv0;->K(I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported media rate."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    invoke-static {v2, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0

    :cond_5
    :goto_3
    const/4 p0, 0x0

    invoke-static {p0, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lcom/daaw/rv0;I)Landroid/util/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/rv0;",
            "I)",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "[B>;"
        }
    .end annotation

    add-int/lit8 p1, p1, 0x8

    add-int/lit8 p1, p1, 0x4

    invoke-virtual {p0, p1}, Lcom/daaw/rv0;->J(I)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/daaw/rv0;->K(I)V

    invoke-static {p0}, Lcom/daaw/c7;->g(Lcom/daaw/rv0;)I

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->K(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->x()I

    move-result v1

    and-int/lit16 v2, v1, 0x80

    if-eqz v2, :cond_0

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->K(I)V

    :cond_0
    and-int/lit8 v2, v1, 0x40

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lcom/daaw/rv0;->D()I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/daaw/rv0;->K(I)V

    :cond_1
    and-int/lit8 v1, v1, 0x20

    if-eqz v1, :cond_2

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->K(I)V

    :cond_2
    invoke-virtual {p0, p1}, Lcom/daaw/rv0;->K(I)V

    invoke-static {p0}, Lcom/daaw/c7;->g(Lcom/daaw/rv0;)I

    invoke-virtual {p0}, Lcom/daaw/rv0;->x()I

    move-result v0

    invoke-static {v0}, Lcom/daaw/hq0;->e(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "audio/mpeg"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "audio/vnd.dts"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "audio/vnd.dts.hd"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    const/16 v1, 0xc

    invoke-virtual {p0, v1}, Lcom/daaw/rv0;->K(I)V

    invoke-virtual {p0, p1}, Lcom/daaw/rv0;->K(I)V

    invoke-static {p0}, Lcom/daaw/c7;->g(Lcom/daaw/rv0;)I

    move-result p1

    new-array v1, p1, [B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, p1}, Lcom/daaw/rv0;->g([BII)V

    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0

    :cond_4
    :goto_0
    const/4 p0, 0x0

    invoke-static {v0, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static g(Lcom/daaw/rv0;)I
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/rv0;->x()I

    move-result v0

    and-int/lit8 v1, v0, 0x7f

    :goto_0
    const/16 v2, 0x80

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_0

    invoke-virtual {p0}, Lcom/daaw/rv0;->x()I

    move-result v0

    shl-int/lit8 v1, v1, 0x7

    and-int/lit8 v2, v0, 0x7f

    or-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public static h(Lcom/daaw/rv0;)I
    .locals 1

    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result p0

    sget v0, Lcom/daaw/c7;->b:I

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    sget v0, Lcom/daaw/c7;->a:I

    if-ne p0, v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    sget v0, Lcom/daaw/c7;->c:I

    if-eq p0, v0, :cond_4

    sget v0, Lcom/daaw/c7;->d:I

    if-eq p0, v0, :cond_4

    sget v0, Lcom/daaw/c7;->e:I

    if-eq p0, v0, :cond_4

    sget v0, Lcom/daaw/c7;->f:I

    if-ne p0, v0, :cond_2

    goto :goto_0

    :cond_2
    sget v0, Lcom/daaw/c7;->g:I

    if-ne p0, v0, :cond_3

    const/4 p0, 0x4

    return p0

    :cond_3
    const/4 p0, -0x1

    return p0

    :cond_4
    :goto_0
    const/4 p0, 0x3

    return p0
.end method

.method public static i(Lcom/daaw/rv0;I)Lcom/google/android/exoplayer2/metadata/Metadata;
    .locals 2

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->K(I)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/daaw/rv0;->c()I

    move-result v1

    if-ge v1, p1, :cond_1

    invoke-static {p0}, Lcom/daaw/zp0;->c(Lcom/daaw/rv0;)Lcom/google/android/exoplayer2/metadata/Metadata$Entry;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, 0x0

    goto :goto_1

    :cond_2
    new-instance p0, Lcom/google/android/exoplayer2/metadata/Metadata;

    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/metadata/Metadata;-><init>(Ljava/util/List;)V

    :goto_1
    return-object p0
.end method

.method public static j(Lcom/daaw/rv0;)Landroid/util/Pair;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/rv0;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v1

    invoke-static {v1}, Lcom/daaw/b7;->c(I)I

    move-result v1

    if-nez v1, :cond_0

    const/16 v2, 0x8

    goto :goto_0

    :cond_0
    const/16 v2, 0x10

    :goto_0
    invoke-virtual {p0, v2}, Lcom/daaw/rv0;->K(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->z()J

    move-result-wide v2

    if-nez v1, :cond_1

    const/4 v0, 0x4

    :cond_1
    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->K(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->D()I

    move-result p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    shr-int/lit8 v1, p0, 0xa

    and-int/lit8 v1, v1, 0x1f

    add-int/lit8 v1, v1, 0x60

    int-to-char v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    shr-int/lit8 v1, p0, 0x5

    and-int/lit8 v1, v1, 0x1f

    add-int/lit8 v1, v1, 0x60

    int-to-char v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 p0, p0, 0x1f

    add-int/lit8 p0, p0, 0x60

    int-to-char p0, p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static k(Lcom/daaw/rv0;I)Lcom/google/android/exoplayer2/metadata/Metadata;
    .locals 4

    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->K(I)V

    :goto_0
    invoke-virtual {p0}, Lcom/daaw/rv0;->c()I

    move-result v0

    if-ge v0, p1, :cond_1

    invoke-virtual {p0}, Lcom/daaw/rv0;->c()I

    move-result v0

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v1

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v2

    sget v3, Lcom/daaw/b7;->D0:I

    if-ne v2, v3, :cond_0

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->J(I)V

    add-int/2addr v0, v1

    invoke-static {p0, v0}, Lcom/daaw/c7;->i(Lcom/daaw/rv0;I)Lcom/google/android/exoplayer2/metadata/Metadata;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 v1, v1, -0x8

    invoke-virtual {p0, v1}, Lcom/daaw/rv0;->K(I)V

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static l(Lcom/daaw/rv0;)J
    .locals 2

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v1

    invoke-static {v1}, Lcom/daaw/b7;->c(I)I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    :goto_0
    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->K(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->z()J

    move-result-wide v0

    return-wide v0
.end method

.method public static m(Lcom/daaw/rv0;I)F
    .locals 0

    add-int/lit8 p1, p1, 0x8

    invoke-virtual {p0, p1}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->B()I

    move-result p1

    invoke-virtual {p0}, Lcom/daaw/rv0;->B()I

    move-result p0

    int-to-float p1, p1

    int-to-float p0, p0

    div-float/2addr p1, p0

    return p1
.end method

.method public static n(Lcom/daaw/rv0;II)[B
    .locals 4

    add-int/lit8 v0, p1, 0x8

    :goto_0
    sub-int v1, v0, p1

    if-ge v1, p2, :cond_1

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v1

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v2

    sget v3, Lcom/daaw/b7;->K0:I

    if-ne v2, v3, :cond_0

    iget-object p0, p0, Lcom/daaw/rv0;->a:[B

    add-int/2addr v1, v0

    invoke-static {p0, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p0

    return-object p0

    :cond_0
    add-int/2addr v0, v1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static o(Lcom/daaw/rv0;II)Landroid/util/Pair;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/rv0;",
            "II)",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Lcom/daaw/pm1;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/rv0;->c()I

    move-result v0

    :goto_0
    sub-int v1, v0, p1

    if-ge v1, p2, :cond_2

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    const-string v3, "childAtomSize should be positive"

    invoke-static {v2, v3}, Lcom/daaw/s6;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v2

    sget v3, Lcom/daaw/b7;->W:I

    if-ne v2, v3, :cond_1

    invoke-static {p0, v0, v1}, Lcom/daaw/c7;->d(Lcom/daaw/rv0;II)Landroid/util/Pair;

    move-result-object v2

    if-eqz v2, :cond_1

    return-object v2

    :cond_1
    add-int/2addr v0, v1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static p(Lcom/daaw/rv0;IILjava/lang/String;)Lcom/daaw/pm1;
    .locals 11

    add-int/lit8 v0, p1, 0x8

    :goto_0
    sub-int v1, v0, p1

    const/4 v2, 0x0

    if-ge v1, p2, :cond_4

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v1

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v3

    sget v4, Lcom/daaw/b7;->Z:I

    if-ne v3, v4, :cond_3

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result p1

    invoke-static {p1}, Lcom/daaw/b7;->c(I)I

    move-result p1

    const/4 p2, 0x1

    invoke-virtual {p0, p2}, Lcom/daaw/rv0;->K(I)V

    const/4 v0, 0x0

    if-nez p1, :cond_0

    invoke-virtual {p0, p2}, Lcom/daaw/rv0;->K(I)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/rv0;->x()I

    move-result p1

    and-int/lit16 v1, p1, 0xf0

    shr-int/lit8 v1, v1, 0x4

    and-int/lit8 p1, p1, 0xf

    move v9, p1

    move v8, v1

    :goto_1
    invoke-virtual {p0}, Lcom/daaw/rv0;->x()I

    move-result p1

    if-ne p1, p2, :cond_1

    const/4 v4, 0x1

    goto :goto_2

    :cond_1
    const/4 v4, 0x0

    :goto_2
    invoke-virtual {p0}, Lcom/daaw/rv0;->x()I

    move-result v6

    const/16 p1, 0x10

    new-array v7, p1, [B

    invoke-virtual {p0, v7, v0, p1}, Lcom/daaw/rv0;->g([BII)V

    if-eqz v4, :cond_2

    if-nez v6, :cond_2

    invoke-virtual {p0}, Lcom/daaw/rv0;->x()I

    move-result p1

    new-array v2, p1, [B

    invoke-virtual {p0, v2, v0, p1}, Lcom/daaw/rv0;->g([BII)V

    :cond_2
    move-object v10, v2

    new-instance p0, Lcom/daaw/pm1;

    move-object v3, p0

    move-object v5, p3

    invoke-direct/range {v3 .. v10}, Lcom/daaw/pm1;-><init>(ZLjava/lang/String;I[BII[B)V

    return-object p0

    :cond_3
    add-int/2addr v0, v1

    goto :goto_0

    :cond_4
    return-object v2
.end method

.method public static q(Lcom/daaw/nm1;Lcom/daaw/b7$a;Lcom/daaw/y50;)Lcom/daaw/tm1;
    .locals 43

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    sget v3, Lcom/daaw/b7;->r0:I

    invoke-virtual {v1, v3}, Lcom/daaw/b7$a;->g(I)Lcom/daaw/b7$b;

    move-result-object v3

    if-eqz v3, :cond_0

    new-instance v4, Lcom/daaw/c7$d;

    invoke-direct {v4, v3}, Lcom/daaw/c7$d;-><init>(Lcom/daaw/b7$b;)V

    goto :goto_0

    :cond_0
    sget v3, Lcom/daaw/b7;->s0:I

    invoke-virtual {v1, v3}, Lcom/daaw/b7$a;->g(I)Lcom/daaw/b7$b;

    move-result-object v3

    if-eqz v3, :cond_31

    new-instance v4, Lcom/daaw/c7$e;

    invoke-direct {v4, v3}, Lcom/daaw/c7$e;-><init>(Lcom/daaw/b7$b;)V

    :goto_0
    invoke-interface {v4}, Lcom/daaw/c7$b;->b()I

    move-result v3

    const/4 v5, 0x0

    if-nez v3, :cond_1

    new-instance v0, Lcom/daaw/tm1;

    new-array v7, v5, [J

    new-array v8, v5, [I

    const/4 v9, 0x0

    new-array v10, v5, [J

    new-array v11, v5, [I

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    move-object v6, v0

    invoke-direct/range {v6 .. v13}, Lcom/daaw/tm1;-><init>([J[II[J[IJ)V

    return-object v0

    :cond_1
    sget v6, Lcom/daaw/b7;->t0:I

    invoke-virtual {v1, v6}, Lcom/daaw/b7$a;->g(I)Lcom/daaw/b7$b;

    move-result-object v6

    const/4 v7, 0x1

    if-nez v6, :cond_2

    sget v6, Lcom/daaw/b7;->u0:I

    invoke-virtual {v1, v6}, Lcom/daaw/b7$a;->g(I)Lcom/daaw/b7$b;

    move-result-object v6

    const/4 v8, 0x1

    goto :goto_1

    :cond_2
    const/4 v8, 0x0

    :goto_1
    iget-object v6, v6, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    sget v9, Lcom/daaw/b7;->q0:I

    invoke-virtual {v1, v9}, Lcom/daaw/b7$a;->g(I)Lcom/daaw/b7$b;

    move-result-object v9

    iget-object v9, v9, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    sget v10, Lcom/daaw/b7;->n0:I

    invoke-virtual {v1, v10}, Lcom/daaw/b7$a;->g(I)Lcom/daaw/b7$b;

    move-result-object v10

    iget-object v10, v10, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    sget v11, Lcom/daaw/b7;->o0:I

    invoke-virtual {v1, v11}, Lcom/daaw/b7$a;->g(I)Lcom/daaw/b7$b;

    move-result-object v11

    const/4 v12, 0x0

    if-eqz v11, :cond_3

    iget-object v11, v11, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    goto :goto_2

    :cond_3
    move-object v11, v12

    :goto_2
    sget v13, Lcom/daaw/b7;->p0:I

    invoke-virtual {v1, v13}, Lcom/daaw/b7$a;->g(I)Lcom/daaw/b7$b;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v1, v1, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    goto :goto_3

    :cond_4
    move-object v1, v12

    :goto_3
    new-instance v13, Lcom/daaw/c7$a;

    invoke-direct {v13, v9, v6, v8}, Lcom/daaw/c7$a;-><init>(Lcom/daaw/rv0;Lcom/daaw/rv0;Z)V

    const/16 v6, 0xc

    invoke-virtual {v10, v6}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {v10}, Lcom/daaw/rv0;->B()I

    move-result v8

    sub-int/2addr v8, v7

    invoke-virtual {v10}, Lcom/daaw/rv0;->B()I

    move-result v9

    invoke-virtual {v10}, Lcom/daaw/rv0;->B()I

    move-result v14

    if-eqz v1, :cond_5

    invoke-virtual {v1, v6}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {v1}, Lcom/daaw/rv0;->B()I

    move-result v15

    goto :goto_4

    :cond_5
    const/4 v15, 0x0

    :goto_4
    const/16 v16, -0x1

    if-eqz v11, :cond_6

    invoke-virtual {v11, v6}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {v11}, Lcom/daaw/rv0;->B()I

    move-result v6

    if-lez v6, :cond_7

    invoke-virtual {v11}, Lcom/daaw/rv0;->B()I

    move-result v12

    add-int/lit8 v16, v12, -0x1

    move-object v12, v11

    goto :goto_5

    :cond_6
    move-object v12, v11

    const/4 v6, 0x0

    :cond_7
    :goto_5
    invoke-interface {v4}, Lcom/daaw/c7$b;->a()Z

    move-result v11

    if-eqz v11, :cond_8

    iget-object v11, v0, Lcom/daaw/nm1;->f:Lcom/google/android/exoplayer2/Format;

    iget-object v11, v11, Lcom/google/android/exoplayer2/Format;->u:Ljava/lang/String;

    const-string v5, "audio/raw"

    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    if-nez v8, :cond_8

    if-nez v15, :cond_8

    if-nez v6, :cond_8

    const/4 v5, 0x1

    goto :goto_6

    :cond_8
    const/4 v5, 0x0

    :goto_6
    const-wide/16 v18, 0x0

    if-nez v5, :cond_17

    new-array v5, v3, [J

    new-array v11, v3, [I

    new-array v7, v3, [J

    move/from16 p1, v6

    new-array v6, v3, [I

    move-object/from16 v23, v10

    move/from16 v2, v16

    move-wide/from16 v24, v18

    move-wide/from16 v26, v24

    const/4 v0, 0x0

    const/4 v10, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move/from16 v16, v15

    move v15, v14

    move v14, v9

    move v9, v8

    move/from16 v8, p1

    :goto_7
    if-ge v0, v3, :cond_10

    :goto_8
    if-nez v22, :cond_9

    invoke-virtual {v13}, Lcom/daaw/c7$a;->a()Z

    move-result v22

    invoke-static/range {v22 .. v22}, Lcom/daaw/s6;->f(Z)V

    move/from16 p1, v14

    move/from16 v28, v15

    iget-wide v14, v13, Lcom/daaw/c7$a;->d:J

    move-wide/from16 v26, v14

    iget v14, v13, Lcom/daaw/c7$a;->c:I

    move/from16 v22, v14

    move/from16 v15, v28

    move/from16 v14, p1

    goto :goto_8

    :cond_9
    move/from16 p1, v14

    move/from16 v28, v15

    if-eqz v1, :cond_b

    :goto_9
    if-nez v21, :cond_a

    if-lez v16, :cond_a

    invoke-virtual {v1}, Lcom/daaw/rv0;->B()I

    move-result v21

    invoke-virtual {v1}, Lcom/daaw/rv0;->i()I

    move-result v20

    add-int/lit8 v16, v16, -0x1

    goto :goto_9

    :cond_a
    add-int/lit8 v21, v21, -0x1

    :cond_b
    move/from16 v14, v20

    aput-wide v26, v5, v0

    invoke-interface {v4}, Lcom/daaw/c7$b;->c()I

    move-result v15

    aput v15, v11, v0

    aget v15, v11, v0

    if-le v15, v10, :cond_c

    aget v10, v11, v0

    :cond_c
    move-object v15, v4

    move-object/from16 v20, v5

    int-to-long v4, v14

    add-long v4, v24, v4

    aput-wide v4, v7, v0

    if-nez v12, :cond_d

    const/4 v4, 0x1

    goto :goto_a

    :cond_d
    const/4 v4, 0x0

    :goto_a
    aput v4, v6, v0

    if-ne v0, v2, :cond_e

    const/4 v4, 0x1

    aput v4, v6, v0

    add-int/lit8 v8, v8, -0x1

    if-lez v8, :cond_e

    invoke-virtual {v12}, Lcom/daaw/rv0;->B()I

    move-result v2

    sub-int/2addr v2, v4

    :cond_e
    move/from16 v4, v28

    move-object/from16 v28, v6

    int-to-long v5, v4

    add-long v24, v24, v5

    add-int/lit8 v5, p1, -0x1

    if-nez v5, :cond_f

    if-lez v9, :cond_f

    invoke-virtual/range {v23 .. v23}, Lcom/daaw/rv0;->B()I

    move-result v4

    invoke-virtual/range {v23 .. v23}, Lcom/daaw/rv0;->i()I

    move-result v5

    add-int/lit8 v9, v9, -0x1

    goto :goto_b

    :cond_f
    move/from16 v42, v5

    move v5, v4

    move/from16 v4, v42

    :goto_b
    aget v6, v11, v0

    move/from16 p1, v4

    move/from16 v29, v5

    int-to-long v4, v6

    add-long v26, v26, v4

    add-int/lit8 v22, v22, -0x1

    add-int/lit8 v0, v0, 0x1

    move-object v4, v15

    move-object/from16 v5, v20

    move-object/from16 v6, v28

    move/from16 v15, v29

    move/from16 v20, v14

    move/from16 v14, p1

    goto/16 :goto_7

    :cond_10
    move-object/from16 v28, v6

    move/from16 p1, v14

    move/from16 v14, v20

    move-object/from16 v20, v5

    int-to-long v4, v14

    add-long v24, v24, v4

    if-nez v21, :cond_11

    const/4 v0, 0x1

    goto :goto_c

    :cond_11
    const/4 v0, 0x0

    :goto_c
    invoke-static {v0}, Lcom/daaw/s6;->a(Z)V

    :goto_d
    if-lez v16, :cond_13

    invoke-virtual {v1}, Lcom/daaw/rv0;->B()I

    move-result v0

    if-nez v0, :cond_12

    const/4 v0, 0x1

    goto :goto_e

    :cond_12
    const/4 v0, 0x0

    :goto_e
    invoke-static {v0}, Lcom/daaw/s6;->a(Z)V

    invoke-virtual {v1}, Lcom/daaw/rv0;->i()I

    add-int/lit8 v16, v16, -0x1

    goto :goto_d

    :cond_13
    if-nez v8, :cond_15

    if-nez p1, :cond_15

    move/from16 v0, v22

    if-nez v0, :cond_16

    if-eqz v9, :cond_14

    goto :goto_f

    :cond_14
    move-object/from16 v2, p0

    goto :goto_10

    :cond_15
    move/from16 v0, v22

    :cond_16
    :goto_f
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Inconsistent stbl box for track "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, p0

    iget v4, v2, Lcom/daaw/nm1;->a:I

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ": remainingSynchronizationSamples "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", remainingSamplesAtTimestampDelta "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v4, p1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", remainingSamplesInChunk "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", remainingTimestampDeltaChanges "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_10
    move/from16 v23, v10

    move-object/from16 v5, v20

    move-wide/from16 v0, v24

    move-object/from16 v6, v28

    goto :goto_12

    :cond_17
    move-object v2, v0

    iget v0, v13, Lcom/daaw/c7$a;->a:I

    new-array v1, v0, [J

    new-array v0, v0, [I

    :goto_11
    invoke-virtual {v13}, Lcom/daaw/c7$a;->a()Z

    move-result v4

    if-eqz v4, :cond_18

    iget v4, v13, Lcom/daaw/c7$a;->b:I

    iget-wide v5, v13, Lcom/daaw/c7$a;->d:J

    aput-wide v5, v1, v4

    iget v5, v13, Lcom/daaw/c7$a;->c:I

    aput v5, v0, v4

    goto :goto_11

    :cond_18
    iget-object v4, v2, Lcom/daaw/nm1;->f:Lcom/google/android/exoplayer2/Format;

    iget v5, v4, Lcom/google/android/exoplayer2/Format;->I:I

    iget v4, v4, Lcom/google/android/exoplayer2/Format;->G:I

    invoke-static {v5, v4}, Lcom/daaw/sq1;->y(II)I

    move-result v4

    int-to-long v5, v14

    invoke-static {v4, v1, v0, v5, v6}, Lcom/daaw/l20;->a(I[J[IJ)Lcom/daaw/l20$b;

    move-result-object v0

    iget-object v5, v0, Lcom/daaw/l20$b;->a:[J

    iget-object v11, v0, Lcom/daaw/l20$b;->b:[I

    iget v10, v0, Lcom/daaw/l20$b;->c:I

    iget-object v7, v0, Lcom/daaw/l20$b;->d:[J

    iget-object v6, v0, Lcom/daaw/l20$b;->e:[I

    iget-wide v0, v0, Lcom/daaw/l20$b;->f:J

    move/from16 v23, v10

    :goto_12
    const-wide/32 v26, 0xf4240

    iget-wide v8, v2, Lcom/daaw/nm1;->c:J

    move-wide/from16 v24, v0

    move-wide/from16 v28, v8

    invoke-static/range {v24 .. v29}, Lcom/daaw/sq1;->T(JJJ)J

    move-result-wide v8

    iget-object v4, v2, Lcom/daaw/nm1;->h:[J

    if-eqz v4, :cond_30

    invoke-virtual/range {p2 .. p2}, Lcom/daaw/y50;->a()Z

    move-result v4

    if-eqz v4, :cond_19

    goto/16 :goto_23

    :cond_19
    iget-object v4, v2, Lcom/daaw/nm1;->h:[J

    array-length v10, v4

    const/4 v14, 0x1

    if-ne v10, v14, :cond_1b

    iget v10, v2, Lcom/daaw/nm1;->b:I

    if-ne v10, v14, :cond_1b

    array-length v10, v7

    const/4 v14, 0x2

    if-lt v10, v14, :cond_1b

    iget-object v10, v2, Lcom/daaw/nm1;->i:[J

    const/4 v14, 0x0

    aget-wide v15, v10, v14

    aget-wide v24, v4, v14

    iget-wide v12, v2, Lcom/daaw/nm1;->c:J

    move v10, v3

    iget-wide v3, v2, Lcom/daaw/nm1;->d:J

    move-wide/from16 v26, v12

    move-wide/from16 v28, v3

    invoke-static/range {v24 .. v29}, Lcom/daaw/sq1;->T(JJJ)J

    move-result-wide v3

    add-long/2addr v3, v15

    move-object/from16 v24, v7

    move-wide/from16 v25, v0

    move-wide/from16 v27, v15

    move-wide/from16 v29, v3

    invoke-static/range {v24 .. v30}, Lcom/daaw/c7;->a([JJJJ)Z

    move-result v12

    if-eqz v12, :cond_1c

    sub-long v24, v0, v3

    const/4 v3, 0x0

    aget-wide v12, v7, v3

    sub-long v26, v15, v12

    iget-object v3, v2, Lcom/daaw/nm1;->f:Lcom/google/android/exoplayer2/Format;

    iget v3, v3, Lcom/google/android/exoplayer2/Format;->H:I

    int-to-long v3, v3

    iget-wide v12, v2, Lcom/daaw/nm1;->c:J

    move-wide/from16 v28, v3

    move-wide/from16 v30, v12

    invoke-static/range {v26 .. v31}, Lcom/daaw/sq1;->T(JJJ)J

    move-result-wide v3

    iget-object v12, v2, Lcom/daaw/nm1;->f:Lcom/google/android/exoplayer2/Format;

    iget v12, v12, Lcom/google/android/exoplayer2/Format;->H:I

    int-to-long v12, v12

    iget-wide v14, v2, Lcom/daaw/nm1;->c:J

    move-wide/from16 v26, v12

    move-wide/from16 v28, v14

    invoke-static/range {v24 .. v29}, Lcom/daaw/sq1;->T(JJJ)J

    move-result-wide v12

    cmp-long v14, v3, v18

    if-nez v14, :cond_1a

    cmp-long v14, v12, v18

    if-eqz v14, :cond_1c

    :cond_1a
    const-wide/32 v14, 0x7fffffff

    cmp-long v16, v3, v14

    if-gtz v16, :cond_1c

    cmp-long v16, v12, v14

    if-gtz v16, :cond_1c

    long-to-int v0, v3

    move-object/from16 v1, p2

    iput v0, v1, Lcom/daaw/y50;->a:I

    long-to-int v0, v12

    iput v0, v1, Lcom/daaw/y50;->b:I

    iget-wide v0, v2, Lcom/daaw/nm1;->c:J

    const-wide/32 v2, 0xf4240

    invoke-static {v7, v2, v3, v0, v1}, Lcom/daaw/sq1;->V([JJJ)V

    new-instance v0, Lcom/daaw/tm1;

    move-object/from16 v20, v0

    move-object/from16 v21, v5

    move-object/from16 v22, v11

    move-object/from16 v24, v7

    move-object/from16 v25, v6

    move-wide/from16 v26, v8

    invoke-direct/range {v20 .. v27}, Lcom/daaw/tm1;-><init>([J[II[J[IJ)V

    return-object v0

    :cond_1b
    move v10, v3

    :cond_1c
    iget-object v3, v2, Lcom/daaw/nm1;->h:[J

    array-length v4, v3

    const/4 v12, 0x1

    if-ne v4, v12, :cond_1e

    const/4 v4, 0x0

    aget-wide v12, v3, v4

    cmp-long v3, v12, v18

    if-nez v3, :cond_1e

    iget-object v3, v2, Lcom/daaw/nm1;->i:[J

    aget-wide v8, v3, v4

    const/4 v3, 0x0

    :goto_13
    array-length v4, v7

    if-ge v3, v4, :cond_1d

    aget-wide v12, v7, v3

    sub-long v14, v12, v8

    const-wide/32 v16, 0xf4240

    iget-wide v12, v2, Lcom/daaw/nm1;->c:J

    move-wide/from16 v18, v12

    invoke-static/range {v14 .. v19}, Lcom/daaw/sq1;->T(JJJ)J

    move-result-wide v12

    aput-wide v12, v7, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_13

    :cond_1d
    sub-long v12, v0, v8

    const-wide/32 v14, 0xf4240

    iget-wide v0, v2, Lcom/daaw/nm1;->c:J

    move-wide/from16 v16, v0

    invoke-static/range {v12 .. v17}, Lcom/daaw/sq1;->T(JJJ)J

    move-result-wide v26

    new-instance v0, Lcom/daaw/tm1;

    move-object/from16 v20, v0

    move-object/from16 v21, v5

    move-object/from16 v22, v11

    move-object/from16 v24, v7

    move-object/from16 v25, v6

    invoke-direct/range {v20 .. v27}, Lcom/daaw/tm1;-><init>([J[II[J[IJ)V

    return-object v0

    :cond_1e
    iget v0, v2, Lcom/daaw/nm1;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1f

    const/4 v4, 0x1

    goto :goto_14

    :cond_1f
    const/4 v4, 0x0

    :goto_14
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v14, 0x0

    :goto_15
    iget-object v12, v2, Lcom/daaw/nm1;->h:[J

    array-length v13, v12

    const-wide/16 v15, -0x1

    if-ge v14, v13, :cond_22

    iget-object v13, v2, Lcom/daaw/nm1;->i:[J

    move-wide/from16 v26, v8

    aget-wide v8, v13, v14

    cmp-long v13, v8, v15

    if-eqz v13, :cond_21

    aget-wide v28, v12, v14

    iget-wide v12, v2, Lcom/daaw/nm1;->c:J

    move-object/from16 p1, v5

    move-object/from16 v25, v6

    iget-wide v5, v2, Lcom/daaw/nm1;->d:J

    move-wide/from16 v30, v12

    move-wide/from16 v32, v5

    invoke-static/range {v28 .. v33}, Lcom/daaw/sq1;->T(JJJ)J

    move-result-wide v5

    const/4 v12, 0x1

    invoke-static {v7, v8, v9, v12, v12}, Lcom/daaw/sq1;->c([JJZZ)I

    move-result v13

    add-long/2addr v8, v5

    const/4 v5, 0x0

    invoke-static {v7, v8, v9, v4, v5}, Lcom/daaw/sq1;->c([JJZZ)I

    move-result v6

    sub-int v5, v6, v13

    add-int/2addr v1, v5

    if-eq v3, v13, :cond_20

    const/4 v3, 0x1

    goto :goto_16

    :cond_20
    const/4 v3, 0x0

    :goto_16
    or-int/2addr v0, v3

    move v3, v6

    goto :goto_17

    :cond_21
    move-object/from16 p1, v5

    move-object/from16 v25, v6

    :goto_17
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v5, p1

    move-object/from16 v6, v25

    move-wide/from16 v8, v26

    goto :goto_15

    :cond_22
    move-object/from16 p1, v5

    move-object/from16 v25, v6

    move-wide/from16 v26, v8

    if-eq v1, v10, :cond_23

    const/4 v3, 0x1

    goto :goto_18

    :cond_23
    const/4 v3, 0x0

    :goto_18
    or-int/2addr v0, v3

    if-eqz v0, :cond_24

    new-array v3, v1, [J

    goto :goto_19

    :cond_24
    move-object/from16 v3, p1

    :goto_19
    if-eqz v0, :cond_25

    new-array v5, v1, [I

    goto :goto_1a

    :cond_25
    move-object v5, v11

    :goto_1a
    if-eqz v0, :cond_26

    const/4 v14, 0x0

    goto :goto_1b

    :cond_26
    move/from16 v14, v23

    :goto_1b
    if-eqz v0, :cond_27

    new-array v6, v1, [I

    goto :goto_1c

    :cond_27
    move-object/from16 v6, v25

    :goto_1c
    new-array v1, v1, [J

    move v9, v14

    const/4 v8, 0x0

    const/4 v14, 0x0

    :goto_1d
    iget-object v10, v2, Lcom/daaw/nm1;->h:[J

    array-length v12, v10

    if-ge v14, v12, :cond_2c

    iget-object v12, v2, Lcom/daaw/nm1;->i:[J

    move-object v13, v5

    move-object/from16 v22, v6

    aget-wide v5, v12, v14

    aget-wide v34, v10, v14

    cmp-long v10, v5, v15

    if-eqz v10, :cond_2b

    move-object/from16 p2, v13

    iget-wide v12, v2, Lcom/daaw/nm1;->c:J

    move/from16 v24, v9

    iget-wide v9, v2, Lcom/daaw/nm1;->d:J

    move-wide/from16 v28, v34

    move-wide/from16 v30, v12

    move-wide/from16 v32, v9

    invoke-static/range {v28 .. v33}, Lcom/daaw/sq1;->T(JJJ)J

    move-result-wide v9

    add-long/2addr v9, v5

    const/4 v12, 0x1

    invoke-static {v7, v5, v6, v12, v12}, Lcom/daaw/sq1;->c([JJZZ)I

    move-result v13

    const/4 v12, 0x0

    invoke-static {v7, v9, v10, v4, v12}, Lcom/daaw/sq1;->c([JJZZ)I

    move-result v9

    if-eqz v0, :cond_28

    sub-int v10, v9, v13

    move-object/from16 v12, p1

    invoke-static {v12, v13, v3, v8, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object/from16 v15, p2

    invoke-static {v11, v13, v15, v8, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move/from16 v16, v4

    move-object/from16 v4, v25

    move-object/from16 v42, v22

    move-object/from16 v22, v3

    move-object/from16 v3, v42

    invoke-static {v4, v13, v3, v8, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1e

    :cond_28
    move-object/from16 v12, p1

    move-object/from16 v15, p2

    move/from16 v16, v4

    move-object/from16 v4, v25

    move-object/from16 v42, v22

    move-object/from16 v22, v3

    move-object/from16 v3, v42

    :goto_1e
    move/from16 v10, v24

    :goto_1f
    if-ge v13, v9, :cond_2a

    const-wide/32 v30, 0xf4240

    move-object/from16 p1, v3

    move-object/from16 v25, v4

    iget-wide v3, v2, Lcom/daaw/nm1;->d:J

    move-wide/from16 v28, v18

    move-wide/from16 v32, v3

    invoke-static/range {v28 .. v33}, Lcom/daaw/sq1;->T(JJJ)J

    move-result-wide v3

    aget-wide v28, v7, v13

    sub-long v36, v28, v5

    const-wide/32 v38, 0xf4240

    move-wide/from16 v28, v5

    iget-wide v5, v2, Lcom/daaw/nm1;->c:J

    move-wide/from16 v40, v5

    invoke-static/range {v36 .. v41}, Lcom/daaw/sq1;->T(JJJ)J

    move-result-wide v5

    add-long/2addr v3, v5

    aput-wide v3, v1, v8

    if-eqz v0, :cond_29

    aget v3, v15, v8

    if-le v3, v10, :cond_29

    aget v10, v11, v13

    :cond_29
    add-int/lit8 v8, v8, 0x1

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v3, p1

    move-object/from16 v4, v25

    move-wide/from16 v5, v28

    goto :goto_1f

    :cond_2a
    move-object/from16 p1, v3

    move-object/from16 v25, v4

    move v9, v10

    goto :goto_20

    :cond_2b
    move-object/from16 v12, p1

    move/from16 v16, v4

    move/from16 v24, v9

    move-object v15, v13

    move-object/from16 p1, v22

    move-object/from16 v22, v3

    :goto_20
    add-long v18, v18, v34

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v6, p1

    move-object/from16 p1, v12

    move-object v5, v15

    move/from16 v4, v16

    move-object/from16 v3, v22

    const-wide/16 v15, -0x1

    goto/16 :goto_1d

    :cond_2c
    move-object/from16 v12, p1

    move-object/from16 v22, v3

    move-object v15, v5

    move-object/from16 p1, v6

    move/from16 v24, v9

    const-wide/32 v30, 0xf4240

    iget-wide v3, v2, Lcom/daaw/nm1;->c:J

    move-wide/from16 v28, v18

    move-wide/from16 v32, v3

    invoke-static/range {v28 .. v33}, Lcom/daaw/sq1;->T(JJJ)J

    move-result-wide v34

    const/4 v0, 0x0

    const/4 v14, 0x0

    :goto_21
    array-length v3, v6

    if-ge v14, v3, :cond_2e

    if-nez v0, :cond_2e

    aget v3, v6, v14

    const/4 v4, 0x1

    and-int/2addr v3, v4

    if-eqz v3, :cond_2d

    const/4 v3, 0x1

    goto :goto_22

    :cond_2d
    const/4 v3, 0x0

    :goto_22
    or-int/2addr v0, v3

    add-int/lit8 v14, v14, 0x1

    goto :goto_21

    :cond_2e
    if-nez v0, :cond_2f

    iget-wide v0, v2, Lcom/daaw/nm1;->c:J

    const-wide/32 v2, 0xf4240

    invoke-static {v7, v2, v3, v0, v1}, Lcom/daaw/sq1;->V([JJJ)V

    new-instance v0, Lcom/daaw/tm1;

    move-object/from16 v20, v0

    move-object/from16 v21, v12

    move-object/from16 v22, v11

    move-object/from16 v24, v7

    invoke-direct/range {v20 .. v27}, Lcom/daaw/tm1;-><init>([J[II[J[IJ)V

    return-object v0

    :cond_2f
    new-instance v0, Lcom/daaw/tm1;

    move-object/from16 v28, v0

    move-object/from16 v29, v22

    move-object/from16 v30, v15

    move/from16 v31, v24

    move-object/from16 v32, v1

    move-object/from16 v33, v6

    invoke-direct/range {v28 .. v35}, Lcom/daaw/tm1;-><init>([J[II[J[IJ)V

    return-object v0

    :cond_30
    :goto_23
    move-object v12, v5

    move-object/from16 v25, v6

    move-wide/from16 v26, v8

    iget-wide v0, v2, Lcom/daaw/nm1;->c:J

    const-wide/32 v2, 0xf4240

    invoke-static {v7, v2, v3, v0, v1}, Lcom/daaw/sq1;->V([JJJ)V

    new-instance v0, Lcom/daaw/tm1;

    move-object/from16 v20, v0

    move-object/from16 v21, v12

    move-object/from16 v22, v11

    move-object/from16 v24, v7

    invoke-direct/range {v20 .. v27}, Lcom/daaw/tm1;-><init>([J[II[J[IJ)V

    return-object v0

    :cond_31
    new-instance v0, Lcom/daaw/tv0;

    const-string v1, "Track has no sample table size information"

    invoke-direct {v0, v1}, Lcom/daaw/tv0;-><init>(Ljava/lang/String;)V

    goto :goto_25

    :goto_24
    throw v0

    :goto_25
    goto :goto_24
.end method

.method public static r(Lcom/daaw/rv0;IILjava/lang/String;Lcom/google/android/exoplayer2/drm/DrmInitData;Z)Lcom/daaw/c7$c;
    .locals 17

    move-object/from16 v10, p0

    const/16 v0, 0xc

    invoke-virtual {v10, v0}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->i()I

    move-result v11

    new-instance v12, Lcom/daaw/c7$c;

    invoke-direct {v12, v11}, Lcom/daaw/c7$c;-><init>(I)V

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_0
    if-ge v14, v11, :cond_8

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->c()I

    move-result v15

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->i()I

    move-result v16

    if-lez v16, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    const-string v1, "childAtomSize should be positive"

    invoke-static {v0, v1}, Lcom/daaw/s6;->b(ZLjava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->i()I

    move-result v1

    sget v0, Lcom/daaw/b7;->c:I

    if-eq v1, v0, :cond_6

    sget v0, Lcom/daaw/b7;->d:I

    if-eq v1, v0, :cond_6

    sget v0, Lcom/daaw/b7;->a0:I

    if-eq v1, v0, :cond_6

    sget v0, Lcom/daaw/b7;->m0:I

    if-eq v1, v0, :cond_6

    sget v0, Lcom/daaw/b7;->e:I

    if-eq v1, v0, :cond_6

    sget v0, Lcom/daaw/b7;->f:I

    if-eq v1, v0, :cond_6

    sget v0, Lcom/daaw/b7;->g:I

    if-eq v1, v0, :cond_6

    sget v0, Lcom/daaw/b7;->L0:I

    if-eq v1, v0, :cond_6

    sget v0, Lcom/daaw/b7;->M0:I

    if-ne v1, v0, :cond_1

    goto/16 :goto_4

    :cond_1
    sget v0, Lcom/daaw/b7;->j:I

    if-eq v1, v0, :cond_5

    sget v0, Lcom/daaw/b7;->b0:I

    if-eq v1, v0, :cond_5

    sget v0, Lcom/daaw/b7;->o:I

    if-eq v1, v0, :cond_5

    sget v0, Lcom/daaw/b7;->q:I

    if-eq v1, v0, :cond_5

    sget v0, Lcom/daaw/b7;->s:I

    if-eq v1, v0, :cond_5

    sget v0, Lcom/daaw/b7;->v:I

    if-eq v1, v0, :cond_5

    sget v0, Lcom/daaw/b7;->t:I

    if-eq v1, v0, :cond_5

    sget v0, Lcom/daaw/b7;->u:I

    if-eq v1, v0, :cond_5

    sget v0, Lcom/daaw/b7;->z0:I

    if-eq v1, v0, :cond_5

    sget v0, Lcom/daaw/b7;->A0:I

    if-eq v1, v0, :cond_5

    sget v0, Lcom/daaw/b7;->m:I

    if-eq v1, v0, :cond_5

    sget v0, Lcom/daaw/b7;->n:I

    if-eq v1, v0, :cond_5

    sget v0, Lcom/daaw/b7;->k:I

    if-eq v1, v0, :cond_5

    sget v0, Lcom/daaw/b7;->P0:I

    if-ne v1, v0, :cond_2

    goto :goto_3

    :cond_2
    sget v0, Lcom/daaw/b7;->k0:I

    if-eq v1, v0, :cond_4

    sget v0, Lcom/daaw/b7;->v0:I

    if-eq v1, v0, :cond_4

    sget v0, Lcom/daaw/b7;->w0:I

    if-eq v1, v0, :cond_4

    sget v0, Lcom/daaw/b7;->x0:I

    if-eq v1, v0, :cond_4

    sget v0, Lcom/daaw/b7;->y0:I

    if-ne v1, v0, :cond_3

    goto :goto_2

    :cond_3
    sget v0, Lcom/daaw/b7;->O0:I

    if-ne v1, v0, :cond_7

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    const-string v2, "application/x-camera-motion"

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, v3}, Lcom/google/android/exoplayer2/Format;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;

    move-result-object v0

    iput-object v0, v12, Lcom/daaw/c7$c;->b:Lcom/google/android/exoplayer2/Format;

    goto :goto_5

    :cond_4
    :goto_2
    move-object/from16 v0, p0

    move v2, v15

    move/from16 v3, v16

    move/from16 v4, p1

    move-object/from16 v5, p3

    move-object v6, v12

    invoke-static/range {v0 .. v6}, Lcom/daaw/c7;->s(Lcom/daaw/rv0;IIIILjava/lang/String;Lcom/daaw/c7$c;)V

    goto :goto_5

    :cond_5
    :goto_3
    move-object/from16 v0, p0

    move v2, v15

    move/from16 v3, v16

    move/from16 v4, p1

    move-object/from16 v5, p3

    move/from16 v6, p5

    move-object/from16 v7, p4

    move-object v8, v12

    move v9, v14

    invoke-static/range {v0 .. v9}, Lcom/daaw/c7;->c(Lcom/daaw/rv0;IIIILjava/lang/String;ZLcom/google/android/exoplayer2/drm/DrmInitData;Lcom/daaw/c7$c;I)V

    goto :goto_5

    :cond_6
    :goto_4
    move-object/from16 v0, p0

    move v2, v15

    move/from16 v3, v16

    move/from16 v4, p1

    move/from16 v5, p2

    move-object/from16 v6, p4

    move-object v7, v12

    move v8, v14

    invoke-static/range {v0 .. v8}, Lcom/daaw/c7;->w(Lcom/daaw/rv0;IIIIILcom/google/android/exoplayer2/drm/DrmInitData;Lcom/daaw/c7$c;I)V

    :cond_7
    :goto_5
    add-int v15, v15, v16

    invoke-virtual {v10, v15}, Lcom/daaw/rv0;->J(I)V

    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_0

    :cond_8
    return-object v12
.end method

.method public static s(Lcom/daaw/rv0;IIIILjava/lang/String;Lcom/daaw/c7$c;)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p6

    add-int/lit8 v3, p2, 0x8

    add-int/lit8 v3, v3, 0x8

    invoke-virtual {v0, v3}, Lcom/daaw/rv0;->J(I)V

    sget v3, Lcom/daaw/b7;->k0:I

    const-string v4, "application/ttml+xml"

    const/4 v5, 0x0

    const-wide v6, 0x7fffffffffffffffL

    if-ne v1, v3, :cond_0

    :goto_0
    move-object v9, v4

    move-object/from16 v18, v5

    move-wide/from16 v16, v6

    goto :goto_1

    :cond_0
    sget v3, Lcom/daaw/b7;->v0:I

    if-ne v1, v3, :cond_1

    add-int/lit8 v1, p3, -0x8

    add-int/lit8 v1, v1, -0x8

    new-array v3, v1, [B

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4, v1}, Lcom/daaw/rv0;->g([BII)V

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const-string v4, "application/x-quicktime-tx3g"

    goto :goto_0

    :cond_1
    sget v0, Lcom/daaw/b7;->w0:I

    if-ne v1, v0, :cond_2

    const-string v4, "application/x-mp4-vtt"

    goto :goto_0

    :cond_2
    sget v0, Lcom/daaw/b7;->x0:I

    if-ne v1, v0, :cond_3

    const-wide/16 v6, 0x0

    goto :goto_0

    :cond_3
    sget v0, Lcom/daaw/b7;->y0:I

    if-ne v1, v0, :cond_4

    const/4 v0, 0x1

    iput v0, v2, Lcom/daaw/c7$c;->d:I

    const-string v4, "application/x-mp4-cea-608"

    goto :goto_0

    :goto_1
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v8

    const/4 v10, 0x0

    const/4 v11, -0x1

    const/4 v12, 0x0

    const/4 v14, -0x1

    const/4 v15, 0x0

    move-object/from16 v13, p5

    invoke-static/range {v8 .. v18}, Lcom/google/android/exoplayer2/Format;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILcom/google/android/exoplayer2/drm/DrmInitData;JLjava/util/List;)Lcom/google/android/exoplayer2/Format;

    move-result-object v0

    iput-object v0, v2, Lcom/daaw/c7$c;->b:Lcom/google/android/exoplayer2/Format;

    return-void

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method

.method public static t(Lcom/daaw/rv0;)Lcom/daaw/c7$f;
    .locals 11

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v1

    invoke-static {v1}, Lcom/daaw/b7;->c(I)I

    move-result v1

    const/16 v2, 0x10

    if-nez v1, :cond_0

    const/16 v3, 0x8

    goto :goto_0

    :cond_0
    const/16 v3, 0x10

    :goto_0
    invoke-virtual {p0, v3}, Lcom/daaw/rv0;->K(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v3

    const/4 v4, 0x4

    invoke-virtual {p0, v4}, Lcom/daaw/rv0;->K(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->c()I

    move-result v5

    if-nez v1, :cond_1

    const/4 v0, 0x4

    :cond_1
    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v0, :cond_3

    iget-object v8, p0, Lcom/daaw/rv0;->a:[B

    add-int v9, v5, v7

    aget-byte v8, v8, v9

    const/4 v9, -0x1

    if-eq v8, v9, :cond_2

    const/4 v5, 0x0

    goto :goto_2

    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_3
    const/4 v5, 0x1

    :goto_2
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v5, :cond_4

    invoke-virtual {p0, v0}, Lcom/daaw/rv0;->K(I)V

    goto :goto_4

    :cond_4
    if-nez v1, :cond_5

    invoke-virtual {p0}, Lcom/daaw/rv0;->z()J

    move-result-wide v0

    goto :goto_3

    :cond_5
    invoke-virtual {p0}, Lcom/daaw/rv0;->C()J

    move-result-wide v0

    :goto_3
    const-wide/16 v9, 0x0

    cmp-long v5, v0, v9

    if-nez v5, :cond_6

    goto :goto_4

    :cond_6
    move-wide v7, v0

    :goto_4
    invoke-virtual {p0, v2}, Lcom/daaw/rv0;->K(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v0

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v1

    invoke-virtual {p0, v4}, Lcom/daaw/rv0;->K(I)V

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v2

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result p0

    const/high16 v4, 0x10000

    const/high16 v5, -0x10000

    if-nez v0, :cond_7

    if-ne v1, v4, :cond_7

    if-ne v2, v5, :cond_7

    if-nez p0, :cond_7

    const/16 v6, 0x5a

    goto :goto_5

    :cond_7
    if-nez v0, :cond_8

    if-ne v1, v5, :cond_8

    if-ne v2, v4, :cond_8

    if-nez p0, :cond_8

    const/16 v6, 0x10e

    goto :goto_5

    :cond_8
    if-ne v0, v5, :cond_9

    if-nez v1, :cond_9

    if-nez v2, :cond_9

    if-ne p0, v5, :cond_9

    const/16 v6, 0xb4

    :cond_9
    :goto_5
    new-instance p0, Lcom/daaw/c7$f;

    invoke-direct {p0, v3, v7, v8, v6}, Lcom/daaw/c7$f;-><init>(IJI)V

    return-object p0
.end method

.method public static u(Lcom/daaw/b7$a;Lcom/daaw/b7$b;JLcom/google/android/exoplayer2/drm/DrmInitData;ZZ)Lcom/daaw/nm1;
    .locals 18

    move-object/from16 v0, p0

    sget v1, Lcom/daaw/b7;->F:I

    invoke-virtual {v0, v1}, Lcom/daaw/b7$a;->f(I)Lcom/daaw/b7$a;

    move-result-object v1

    sget v2, Lcom/daaw/b7;->T:I

    invoke-virtual {v1, v2}, Lcom/daaw/b7$a;->g(I)Lcom/daaw/b7$b;

    move-result-object v2

    iget-object v2, v2, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    invoke-static {v2}, Lcom/daaw/c7;->h(Lcom/daaw/rv0;)I

    move-result v5

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-ne v5, v3, :cond_0

    return-object v2

    :cond_0
    sget v3, Lcom/daaw/b7;->P:I

    invoke-virtual {v0, v3}, Lcom/daaw/b7$a;->g(I)Lcom/daaw/b7$b;

    move-result-object v3

    iget-object v3, v3, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    invoke-static {v3}, Lcom/daaw/c7;->t(Lcom/daaw/rv0;)Lcom/daaw/c7$f;

    move-result-object v3

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, p2, v6

    if-nez v4, :cond_1

    invoke-static {v3}, Lcom/daaw/c7$f;->a(Lcom/daaw/c7$f;)J

    move-result-wide v8

    move-object/from16 v4, p1

    move-wide v10, v8

    goto :goto_0

    :cond_1
    move-object/from16 v4, p1

    move-wide/from16 v10, p2

    :goto_0
    iget-object v4, v4, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    invoke-static {v4}, Lcom/daaw/c7;->l(Lcom/daaw/rv0;)J

    move-result-wide v8

    cmp-long v4, v10, v6

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    const-wide/32 v12, 0xf4240

    move-wide v14, v8

    invoke-static/range {v10 .. v15}, Lcom/daaw/sq1;->T(JJJ)J

    move-result-wide v6

    :goto_1
    move-wide v10, v6

    sget v4, Lcom/daaw/b7;->G:I

    invoke-virtual {v1, v4}, Lcom/daaw/b7$a;->f(I)Lcom/daaw/b7$a;

    move-result-object v4

    sget v6, Lcom/daaw/b7;->H:I

    invoke-virtual {v4, v6}, Lcom/daaw/b7$a;->f(I)Lcom/daaw/b7$a;

    move-result-object v4

    sget v6, Lcom/daaw/b7;->S:I

    invoke-virtual {v1, v6}, Lcom/daaw/b7$a;->g(I)Lcom/daaw/b7$b;

    move-result-object v1

    iget-object v1, v1, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    invoke-static {v1}, Lcom/daaw/c7;->j(Lcom/daaw/rv0;)Landroid/util/Pair;

    move-result-object v1

    sget v6, Lcom/daaw/b7;->U:I

    invoke-virtual {v4, v6}, Lcom/daaw/b7$a;->g(I)Lcom/daaw/b7$b;

    move-result-object v4

    iget-object v12, v4, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    invoke-static {v3}, Lcom/daaw/c7$f;->b(Lcom/daaw/c7$f;)I

    move-result v13

    invoke-static {v3}, Lcom/daaw/c7$f;->c(Lcom/daaw/c7$f;)I

    move-result v14

    iget-object v4, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    move-object v15, v4

    check-cast v15, Ljava/lang/String;

    move-object/from16 v16, p4

    move/from16 v17, p6

    invoke-static/range {v12 .. v17}, Lcom/daaw/c7;->r(Lcom/daaw/rv0;IILjava/lang/String;Lcom/google/android/exoplayer2/drm/DrmInitData;Z)Lcom/daaw/c7$c;

    move-result-object v4

    if-nez p5, :cond_3

    sget v6, Lcom/daaw/b7;->Q:I

    invoke-virtual {v0, v6}, Lcom/daaw/b7$a;->f(I)Lcom/daaw/b7$a;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/c7;->e(Lcom/daaw/b7$a;)Landroid/util/Pair;

    move-result-object v0

    iget-object v6, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v6, [J

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, [J

    move-object/from16 v17, v0

    move-object/from16 v16, v6

    goto :goto_2

    :cond_3
    move-object/from16 v16, v2

    move-object/from16 v17, v16

    :goto_2
    iget-object v0, v4, Lcom/daaw/c7$c;->b:Lcom/google/android/exoplayer2/Format;

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    new-instance v2, Lcom/daaw/nm1;

    invoke-static {v3}, Lcom/daaw/c7$f;->b(Lcom/daaw/c7$f;)I

    move-result v0

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    iget-object v12, v4, Lcom/daaw/c7$c;->b:Lcom/google/android/exoplayer2/Format;

    iget v13, v4, Lcom/daaw/c7$c;->d:I

    iget-object v14, v4, Lcom/daaw/c7$c;->a:[Lcom/daaw/pm1;

    iget v15, v4, Lcom/daaw/c7$c;->c:I

    move-object v3, v2

    move v4, v0

    invoke-direct/range {v3 .. v17}, Lcom/daaw/nm1;-><init>(IIJJJLcom/google/android/exoplayer2/Format;I[Lcom/daaw/pm1;I[J[J)V

    :goto_3
    return-object v2
.end method

.method public static v(Lcom/daaw/b7$b;Z)Lcom/google/android/exoplayer2/metadata/Metadata;
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    return-object v0

    :cond_0
    iget-object p0, p0, Lcom/daaw/b7$b;->Q0:Lcom/daaw/rv0;

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Lcom/daaw/rv0;->J(I)V

    :goto_0
    invoke-virtual {p0}, Lcom/daaw/rv0;->a()I

    move-result v1

    if-lt v1, p1, :cond_2

    invoke-virtual {p0}, Lcom/daaw/rv0;->c()I

    move-result v1

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v2

    invoke-virtual {p0}, Lcom/daaw/rv0;->i()I

    move-result v3

    sget v4, Lcom/daaw/b7;->C0:I

    if-ne v3, v4, :cond_1

    invoke-virtual {p0, v1}, Lcom/daaw/rv0;->J(I)V

    add-int/2addr v1, v2

    invoke-static {p0, v1}, Lcom/daaw/c7;->k(Lcom/daaw/rv0;I)Lcom/google/android/exoplayer2/metadata/Metadata;

    move-result-object p0

    return-object p0

    :cond_1
    add-int/lit8 v2, v2, -0x8

    invoke-virtual {p0, v2}, Lcom/daaw/rv0;->K(I)V

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static w(Lcom/daaw/rv0;IIIIILcom/google/android/exoplayer2/drm/DrmInitData;Lcom/daaw/c7$c;I)V
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    add-int/lit8 v5, v1, 0x8

    add-int/lit8 v5, v5, 0x8

    invoke-virtual {v0, v5}, Lcom/daaw/rv0;->J(I)V

    const/16 v5, 0x10

    invoke-virtual {v0, v5}, Lcom/daaw/rv0;->K(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->D()I

    move-result v11

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->D()I

    move-result v12

    const/16 v5, 0x32

    invoke-virtual {v0, v5}, Lcom/daaw/rv0;->K(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->c()I

    move-result v5

    sget v6, Lcom/daaw/b7;->a0:I

    const/4 v7, 0x0

    move/from16 v8, p1

    if-ne v8, v6, :cond_2

    invoke-static {v0, v1, v2}, Lcom/daaw/c7;->o(Lcom/daaw/rv0;II)Landroid/util/Pair;

    move-result-object v6

    if-eqz v6, :cond_1

    iget-object v8, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-nez v3, :cond_0

    move-object v3, v7

    goto :goto_0

    :cond_0
    iget-object v9, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v9, Lcom/daaw/pm1;

    iget-object v9, v9, Lcom/daaw/pm1;->b:Ljava/lang/String;

    invoke-virtual {v3, v9}, Lcom/google/android/exoplayer2/drm/DrmInitData;->c(Ljava/lang/String;)Lcom/google/android/exoplayer2/drm/DrmInitData;

    move-result-object v3

    :goto_0
    iget-object v9, v4, Lcom/daaw/c7$c;->a:[Lcom/daaw/pm1;

    iget-object v6, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v6, Lcom/daaw/pm1;

    aput-object v6, v9, p8

    :cond_1
    invoke-virtual {v0, v5}, Lcom/daaw/rv0;->J(I)V

    :cond_2
    move-object/from16 v20, v3

    const/4 v3, -0x1

    const/high16 v9, 0x3f800000    # 1.0f

    move-object v14, v7

    move-object/from16 v17, v14

    const/4 v3, 0x0

    const/high16 v16, 0x3f800000    # 1.0f

    const/16 v18, -0x1

    :goto_1
    sub-int v9, v5, v1

    if-ge v9, v2, :cond_18

    invoke-virtual {v0, v5}, Lcom/daaw/rv0;->J(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->c()I

    move-result v9

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->i()I

    move-result v10

    if-nez v10, :cond_3

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->c()I

    move-result v13

    sub-int/2addr v13, v1

    if-ne v13, v2, :cond_3

    goto/16 :goto_a

    :cond_3
    if-lez v10, :cond_4

    const/4 v15, 0x1

    goto :goto_2

    :cond_4
    const/4 v15, 0x0

    :goto_2
    const-string v6, "childAtomSize should be positive"

    invoke-static {v15, v6}, Lcom/daaw/s6;->b(ZLjava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->i()I

    move-result v6

    sget v15, Lcom/daaw/b7;->I:I

    const/4 v13, 0x3

    if-ne v6, v15, :cond_7

    if-nez v7, :cond_5

    const/4 v13, 0x1

    goto :goto_3

    :cond_5
    const/4 v13, 0x0

    :goto_3
    invoke-static {v13}, Lcom/daaw/s6;->f(Z)V

    add-int/lit8 v9, v9, 0x8

    invoke-virtual {v0, v9}, Lcom/daaw/rv0;->J(I)V

    invoke-static/range {p0 .. p0}, Lcom/daaw/y9;->b(Lcom/daaw/rv0;)Lcom/daaw/y9;

    move-result-object v6

    iget-object v14, v6, Lcom/daaw/y9;->a:Ljava/util/List;

    iget v7, v6, Lcom/daaw/y9;->b:I

    iput v7, v4, Lcom/daaw/c7$c;->c:I

    if-nez v3, :cond_6

    iget v6, v6, Lcom/daaw/y9;->e:F

    move/from16 v16, v6

    :cond_6
    const-string v7, "video/avc"

    goto/16 :goto_9

    :cond_7
    sget v15, Lcom/daaw/b7;->J:I

    if-ne v6, v15, :cond_9

    if-nez v7, :cond_8

    const/4 v13, 0x1

    goto :goto_4

    :cond_8
    const/4 v13, 0x0

    :goto_4
    invoke-static {v13}, Lcom/daaw/s6;->f(Z)V

    add-int/lit8 v9, v9, 0x8

    invoke-virtual {v0, v9}, Lcom/daaw/rv0;->J(I)V

    invoke-static/range {p0 .. p0}, Lcom/daaw/cb0;->a(Lcom/daaw/rv0;)Lcom/daaw/cb0;

    move-result-object v6

    iget-object v14, v6, Lcom/daaw/cb0;->a:Ljava/util/List;

    iget v6, v6, Lcom/daaw/cb0;->b:I

    iput v6, v4, Lcom/daaw/c7$c;->c:I

    const-string v7, "video/hevc"

    goto/16 :goto_9

    :cond_9
    sget v15, Lcom/daaw/b7;->N0:I

    if-ne v6, v15, :cond_c

    if-nez v7, :cond_a

    const/4 v13, 0x1

    goto :goto_5

    :cond_a
    const/4 v13, 0x0

    :goto_5
    invoke-static {v13}, Lcom/daaw/s6;->f(Z)V

    sget v6, Lcom/daaw/b7;->L0:I

    if-ne v8, v6, :cond_b

    const-string v6, "video/x-vnd.on2.vp8"

    goto :goto_6

    :cond_b
    const-string v6, "video/x-vnd.on2.vp9"

    :goto_6
    move-object v7, v6

    goto/16 :goto_9

    :cond_c
    sget v15, Lcom/daaw/b7;->h:I

    if-ne v6, v15, :cond_e

    if-nez v7, :cond_d

    const/4 v13, 0x1

    goto :goto_7

    :cond_d
    const/4 v13, 0x0

    :goto_7
    invoke-static {v13}, Lcom/daaw/s6;->f(Z)V

    const-string v7, "video/3gpp"

    goto :goto_9

    :cond_e
    sget v15, Lcom/daaw/b7;->K:I

    if-ne v6, v15, :cond_10

    if-nez v7, :cond_f

    const/4 v13, 0x1

    goto :goto_8

    :cond_f
    const/4 v13, 0x0

    :goto_8
    invoke-static {v13}, Lcom/daaw/s6;->f(Z)V

    invoke-static {v0, v9}, Lcom/daaw/c7;->f(Lcom/daaw/rv0;I)Landroid/util/Pair;

    move-result-object v6

    iget-object v7, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v6, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-static {v6}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    goto :goto_9

    :cond_10
    sget v15, Lcom/daaw/b7;->j0:I

    if-ne v6, v15, :cond_11

    invoke-static {v0, v9}, Lcom/daaw/c7;->m(Lcom/daaw/rv0;I)F

    move-result v16

    const/4 v3, 0x1

    goto :goto_9

    :cond_11
    sget v15, Lcom/daaw/b7;->J0:I

    if-ne v6, v15, :cond_12

    invoke-static {v0, v9, v10}, Lcom/daaw/c7;->n(Lcom/daaw/rv0;II)[B

    move-result-object v17

    goto :goto_9

    :cond_12
    sget v9, Lcom/daaw/b7;->I0:I

    if-ne v6, v9, :cond_17

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->x()I

    move-result v6

    invoke-virtual {v0, v13}, Lcom/daaw/rv0;->K(I)V

    if-nez v6, :cond_17

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rv0;->x()I

    move-result v6

    if-eqz v6, :cond_16

    const/4 v9, 0x1

    if-eq v6, v9, :cond_15

    const/4 v15, 0x2

    if-eq v6, v15, :cond_14

    if-eq v6, v13, :cond_13

    goto :goto_9

    :cond_13
    const/16 v18, 0x3

    goto :goto_9

    :cond_14
    const/16 v18, 0x2

    goto :goto_9

    :cond_15
    const/16 v18, 0x1

    goto :goto_9

    :cond_16
    const/16 v18, 0x0

    :cond_17
    :goto_9
    add-int/2addr v5, v10

    goto/16 :goto_1

    :cond_18
    :goto_a
    if-nez v7, :cond_19

    return-void

    :cond_19
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x0

    const/4 v9, -0x1

    const/4 v10, -0x1

    const/high16 v13, -0x40800000    # -1.0f

    const/16 v19, 0x0

    move/from16 v15, p5

    invoke-static/range {v6 .. v20}, Lcom/google/android/exoplayer2/Format;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIFLjava/util/List;IF[BILcom/google/android/exoplayer2/video/ColorInfo;Lcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;

    move-result-object v0

    iput-object v0, v4, Lcom/daaw/c7$c;->b:Lcom/google/android/exoplayer2/Format;

    return-void
.end method
