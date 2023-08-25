.class public final Lcom/daaw/kb0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qo0;
.implements Lcom/daaw/rb0$c;
.implements Lcom/daaw/pb0$a;


# instance fields
.field public A:I

.field public B:Lcom/google/android/exoplayer2/source/TrackGroupArray;

.field public C:[Lcom/daaw/rb0;

.field public D:[Lcom/daaw/rb0;

.field public E:Lcom/daaw/gb1;

.field public F:Z

.field public final p:Lcom/daaw/gb0;

.field public final q:Lcom/daaw/pb0;

.field public final r:Lcom/daaw/fb0;

.field public final s:I

.field public final t:Lcom/daaw/cp0$a;

.field public final u:Lcom/daaw/l2;

.field public final v:Ljava/util/IdentityHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/IdentityHashMap<",
            "Lcom/daaw/d81;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final w:Lcom/daaw/pl1;

.field public final x:Lcom/daaw/wi;

.field public final y:Z

.field public z:Lcom/daaw/qo0$a;


# direct methods
.method public constructor <init>(Lcom/daaw/gb0;Lcom/daaw/pb0;Lcom/daaw/fb0;ILcom/daaw/cp0$a;Lcom/daaw/l2;Lcom/daaw/wi;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/kb0;->p:Lcom/daaw/gb0;

    iput-object p2, p0, Lcom/daaw/kb0;->q:Lcom/daaw/pb0;

    iput-object p3, p0, Lcom/daaw/kb0;->r:Lcom/daaw/fb0;

    iput p4, p0, Lcom/daaw/kb0;->s:I

    iput-object p5, p0, Lcom/daaw/kb0;->t:Lcom/daaw/cp0$a;

    iput-object p6, p0, Lcom/daaw/kb0;->u:Lcom/daaw/l2;

    iput-object p7, p0, Lcom/daaw/kb0;->x:Lcom/daaw/wi;

    iput-boolean p8, p0, Lcom/daaw/kb0;->y:Z

    const/4 p1, 0x0

    new-array p2, p1, [Lcom/daaw/gb1;

    invoke-interface {p7, p2}, Lcom/daaw/wi;->a([Lcom/daaw/gb1;)Lcom/daaw/gb1;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/kb0;->E:Lcom/daaw/gb1;

    new-instance p2, Ljava/util/IdentityHashMap;

    invoke-direct {p2}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p2, p0, Lcom/daaw/kb0;->v:Ljava/util/IdentityHashMap;

    new-instance p2, Lcom/daaw/pl1;

    invoke-direct {p2}, Lcom/daaw/pl1;-><init>()V

    iput-object p2, p0, Lcom/daaw/kb0;->w:Lcom/daaw/pl1;

    new-array p2, p1, [Lcom/daaw/rb0;

    iput-object p2, p0, Lcom/daaw/kb0;->C:[Lcom/daaw/rb0;

    new-array p1, p1, [Lcom/daaw/rb0;

    iput-object p1, p0, Lcom/daaw/kb0;->D:[Lcom/daaw/rb0;

    invoke-virtual {p5}, Lcom/daaw/cp0$a;->q()V

    return-void
.end method

.method public static v(Lcom/google/android/exoplayer2/Format;Lcom/google/android/exoplayer2/Format;I)Lcom/google/android/exoplayer2/Format;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-eqz v1, :cond_0

    iget-object v2, v1, Lcom/google/android/exoplayer2/Format;->r:Ljava/lang/String;

    iget v3, v1, Lcom/google/android/exoplayer2/Format;->G:I

    iget v4, v1, Lcom/google/android/exoplayer2/Format;->M:I

    iget-object v1, v1, Lcom/google/android/exoplayer2/Format;->N:Ljava/lang/String;

    move-object v15, v1

    move-object v7, v2

    move v10, v3

    move v14, v4

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lcom/google/android/exoplayer2/Format;->r:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/daaw/sq1;->s(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v1, 0x0

    move-object v15, v1

    move-object v7, v2

    const/4 v10, -0x1

    const/4 v14, 0x0

    :goto_0
    invoke-static {v7}, Lcom/daaw/hq0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v5, v0, Lcom/google/android/exoplayer2/Format;->p:Ljava/lang/String;

    const/4 v9, -0x1

    const/4 v11, -0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    move/from16 v8, p2

    invoke-static/range {v5 .. v15}, Lcom/google/android/exoplayer2/Format;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/util/List;Lcom/google/android/exoplayer2/drm/DrmInitData;ILjava/lang/String;)Lcom/google/android/exoplayer2/Format;

    move-result-object v0

    return-object v0
.end method

.method public static w(Lcom/google/android/exoplayer2/Format;)Lcom/google/android/exoplayer2/Format;
    .locals 12

    iget-object v0, p0, Lcom/google/android/exoplayer2/Format;->r:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/daaw/sq1;->s(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/daaw/hq0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v2, p0, Lcom/google/android/exoplayer2/Format;->p:Ljava/lang/String;

    iget v5, p0, Lcom/google/android/exoplayer2/Format;->q:I

    iget v7, p0, Lcom/google/android/exoplayer2/Format;->y:I

    iget v8, p0, Lcom/google/android/exoplayer2/Format;->z:I

    iget v9, p0, Lcom/google/android/exoplayer2/Format;->A:F

    const/4 v6, -0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v2 .. v11}, Lcom/google/android/exoplayer2/Format;->J(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIFLjava/util/List;Lcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 11

    iget v0, p0, Lcom/daaw/kb0;->A:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/daaw/kb0;->A:I

    if-lez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/kb0;->C:[Lcom/daaw/rb0;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v5, v0, v3

    invoke-virtual {v5}, Lcom/daaw/rb0;->s()Lcom/google/android/exoplayer2/source/TrackGroupArray;

    move-result-object v5

    iget v5, v5, Lcom/google/android/exoplayer2/source/TrackGroupArray;->p:I

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    new-array v0, v4, [Lcom/google/android/exoplayer2/source/TrackGroup;

    iget-object v1, p0, Lcom/daaw/kb0;->C:[Lcom/daaw/rb0;

    array-length v3, v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_1
    if-ge v4, v3, :cond_3

    aget-object v6, v1, v4

    invoke-virtual {v6}, Lcom/daaw/rb0;->s()Lcom/google/android/exoplayer2/source/TrackGroupArray;

    move-result-object v7

    iget v7, v7, Lcom/google/android/exoplayer2/source/TrackGroupArray;->p:I

    const/4 v8, 0x0

    :goto_2
    if-ge v8, v7, :cond_2

    add-int/lit8 v9, v5, 0x1

    invoke-virtual {v6}, Lcom/daaw/rb0;->s()Lcom/google/android/exoplayer2/source/TrackGroupArray;

    move-result-object v10

    invoke-virtual {v10, v8}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->a(I)Lcom/google/android/exoplayer2/source/TrackGroup;

    move-result-object v10

    aput-object v10, v0, v5

    add-int/lit8 v8, v8, 0x1

    move v5, v9

    goto :goto_2

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    new-instance v1, Lcom/google/android/exoplayer2/source/TrackGroupArray;

    invoke-direct {v1, v0}, Lcom/google/android/exoplayer2/source/TrackGroupArray;-><init>([Lcom/google/android/exoplayer2/source/TrackGroup;)V

    iput-object v1, p0, Lcom/daaw/kb0;->B:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object v0, p0, Lcom/daaw/kb0;->z:Lcom/daaw/qo0$a;

    invoke-interface {v0, p0}, Lcom/daaw/qo0$a;->j(Lcom/daaw/qo0;)V

    return-void
.end method

.method public b()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/kb0;->E:Lcom/daaw/gb1;

    invoke-interface {v0}, Lcom/daaw/gb1;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public c(J)Z
    .locals 3

    iget-object v0, p0, Lcom/daaw/kb0;->B:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    if-nez v0, :cond_1

    iget-object p1, p0, Lcom/daaw/kb0;->C:[Lcom/daaw/rb0;

    array-length p2, p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    aget-object v2, p1, v1

    invoke-virtual {v2}, Lcom/daaw/rb0;->y()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v0

    :cond_1
    iget-object v0, p0, Lcom/daaw/kb0;->E:Lcom/daaw/gb1;

    invoke-interface {v0, p1, p2}, Lcom/daaw/gb1;->c(J)Z

    move-result p1

    return p1
.end method

.method public d(Lcom/daaw/ib0$a;Z)Z
    .locals 5

    iget-object v0, p0, Lcom/daaw/kb0;->C:[Lcom/daaw/rb0;

    array-length v1, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    invoke-virtual {v4, p1, p2}, Lcom/daaw/rb0;->O(Lcom/daaw/ib0$a;Z)Z

    move-result v4

    and-int/2addr v2, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/kb0;->z:Lcom/daaw/qo0$a;

    invoke-interface {p1, p0}, Lcom/daaw/gb1$a;->n(Lcom/daaw/gb1;)V

    return v2
.end method

.method public e(JLcom/daaw/ea1;)J
    .locals 0

    return-wide p1
.end method

.method public f()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/kb0;->E:Lcom/daaw/gb1;

    invoke-interface {v0}, Lcom/daaw/gb1;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public g(J)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/kb0;->E:Lcom/daaw/gb1;

    invoke-interface {v0, p1, p2}, Lcom/daaw/gb1;->g(J)V

    return-void
.end method

.method public h()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/kb0;->z:Lcom/daaw/qo0$a;

    invoke-interface {v0, p0}, Lcom/daaw/gb1$a;->n(Lcom/daaw/gb1;)V

    return-void
.end method

.method public i([Lcom/google/android/exoplayer2/trackselection/c;[Z[Lcom/daaw/d81;[ZJ)J
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    array-length v3, v1

    new-array v3, v3, [I

    array-length v4, v1

    new-array v4, v4, [I

    const/4 v6, 0x0

    :goto_0
    array-length v7, v1

    if-ge v6, v7, :cond_3

    aget-object v7, v2, v6

    const/4 v8, -0x1

    if-nez v7, :cond_0

    const/4 v7, -0x1

    goto :goto_1

    :cond_0
    iget-object v7, v0, Lcom/daaw/kb0;->v:Ljava/util/IdentityHashMap;

    aget-object v9, v2, v6

    invoke-virtual {v7, v9}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    :goto_1
    aput v7, v3, v6

    aput v8, v4, v6

    aget-object v7, v1, v6

    if-eqz v7, :cond_2

    aget-object v7, v1, v6

    invoke-interface {v7}, Lcom/google/android/exoplayer2/trackselection/c;->a()Lcom/google/android/exoplayer2/source/TrackGroup;

    move-result-object v7

    const/4 v9, 0x0

    :goto_2
    iget-object v10, v0, Lcom/daaw/kb0;->C:[Lcom/daaw/rb0;

    array-length v11, v10

    if-ge v9, v11, :cond_2

    aget-object v10, v10, v9

    invoke-virtual {v10}, Lcom/daaw/rb0;->s()Lcom/google/android/exoplayer2/source/TrackGroupArray;

    move-result-object v10

    invoke-virtual {v10, v7}, Lcom/google/android/exoplayer2/source/TrackGroupArray;->b(Lcom/google/android/exoplayer2/source/TrackGroup;)I

    move-result v10

    if-eq v10, v8, :cond_1

    aput v9, v4, v6

    goto :goto_3

    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_2
    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    iget-object v6, v0, Lcom/daaw/kb0;->v:Ljava/util/IdentityHashMap;

    invoke-virtual {v6}, Ljava/util/IdentityHashMap;->clear()V

    array-length v6, v1

    new-array v7, v6, [Lcom/daaw/d81;

    array-length v8, v1

    new-array v8, v8, [Lcom/daaw/d81;

    array-length v9, v1

    new-array v14, v9, [Lcom/google/android/exoplayer2/trackselection/c;

    iget-object v9, v0, Lcom/daaw/kb0;->C:[Lcom/daaw/rb0;

    array-length v9, v9

    new-array v15, v9, [Lcom/daaw/rb0;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    :goto_4
    iget-object v9, v0, Lcom/daaw/kb0;->C:[Lcom/daaw/rb0;

    array-length v9, v9

    if-ge v13, v9, :cond_10

    const/4 v9, 0x0

    :goto_5
    array-length v10, v1

    if-ge v9, v10, :cond_6

    aget v10, v3, v9

    const/4 v11, 0x0

    if-ne v10, v13, :cond_4

    aget-object v10, v2, v9

    goto :goto_6

    :cond_4
    move-object v10, v11

    :goto_6
    aput-object v10, v8, v9

    aget v10, v4, v9

    if-ne v10, v13, :cond_5

    aget-object v11, v1, v9

    :cond_5
    aput-object v11, v14, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_6
    iget-object v9, v0, Lcom/daaw/kb0;->C:[Lcom/daaw/rb0;

    aget-object v11, v9, v13

    move-object v9, v11

    move-object v10, v14

    move-object v5, v11

    move-object/from16 v11, p2

    move v2, v12

    move-object v12, v8

    move/from16 v18, v6

    move v6, v13

    move-object/from16 v13, p4

    move-object/from16 v19, v14

    move-object/from16 v20, v15

    move-wide/from16 v14, p5

    move/from16 v16, v17

    invoke-virtual/range {v9 .. v16}, Lcom/daaw/rb0;->W([Lcom/google/android/exoplayer2/trackselection/c;[Z[Lcom/daaw/d81;[ZJZ)Z

    move-result v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_7
    array-length v12, v1

    const/4 v13, 0x1

    if-ge v10, v12, :cond_b

    aget v12, v4, v10

    if-ne v12, v6, :cond_8

    aget-object v11, v8, v10

    if-eqz v11, :cond_7

    const/4 v11, 0x1

    goto :goto_8

    :cond_7
    const/4 v11, 0x0

    :goto_8
    invoke-static {v11}, Lcom/daaw/s6;->f(Z)V

    aget-object v11, v8, v10

    aput-object v11, v7, v10

    iget-object v11, v0, Lcom/daaw/kb0;->v:Ljava/util/IdentityHashMap;

    aget-object v12, v8, v10

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v11, v12, v14}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v11, 0x1

    goto :goto_a

    :cond_8
    aget v12, v3, v10

    if-ne v12, v6, :cond_a

    aget-object v12, v8, v10

    if-nez v12, :cond_9

    goto :goto_9

    :cond_9
    const/4 v13, 0x0

    :goto_9
    invoke-static {v13}, Lcom/daaw/s6;->f(Z)V

    :cond_a
    :goto_a
    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :cond_b
    move-object/from16 v10, v20

    if-eqz v11, :cond_e

    aput-object v5, v10, v2

    add-int/lit8 v12, v2, 0x1

    if-nez v2, :cond_d

    invoke-virtual {v5, v13}, Lcom/daaw/rb0;->X(Z)V

    if-nez v9, :cond_c

    iget-object v2, v0, Lcom/daaw/kb0;->D:[Lcom/daaw/rb0;

    array-length v9, v2

    if-eqz v9, :cond_c

    const/4 v9, 0x0

    aget-object v2, v2, v9

    if-eq v5, v2, :cond_f

    goto :goto_b

    :cond_c
    const/4 v9, 0x0

    :goto_b
    iget-object v2, v0, Lcom/daaw/kb0;->w:Lcom/daaw/pl1;

    invoke-virtual {v2}, Lcom/daaw/pl1;->b()V

    const/16 v17, 0x1

    goto :goto_c

    :cond_d
    const/4 v9, 0x0

    invoke-virtual {v5, v9}, Lcom/daaw/rb0;->X(Z)V

    goto :goto_c

    :cond_e
    const/4 v9, 0x0

    move v12, v2

    :cond_f
    :goto_c
    add-int/lit8 v13, v6, 0x1

    move-object/from16 v2, p3

    move-object v15, v10

    move/from16 v6, v18

    move-object/from16 v14, v19

    goto/16 :goto_4

    :cond_10
    move v5, v6

    move-object v10, v15

    const/4 v9, 0x0

    invoke-static {v7, v9, v2, v9, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v10, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/daaw/rb0;

    iput-object v1, v0, Lcom/daaw/kb0;->D:[Lcom/daaw/rb0;

    iget-object v2, v0, Lcom/daaw/kb0;->x:Lcom/daaw/wi;

    invoke-interface {v2, v1}, Lcom/daaw/wi;->a([Lcom/daaw/gb1;)Lcom/daaw/gb1;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/kb0;->E:Lcom/daaw/gb1;

    return-wide p5
.end method

.method public k(Lcom/daaw/ib0$a;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/kb0;->q:Lcom/daaw/pb0;

    invoke-interface {v0, p1}, Lcom/daaw/pb0;->e(Lcom/daaw/ib0$a;)V

    return-void
.end method

.method public l()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/kb0;->C:[Lcom/daaw/rb0;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lcom/daaw/rb0;->l()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public m(J)J
    .locals 4

    iget-object v0, p0, Lcom/daaw/kb0;->D:[Lcom/daaw/rb0;

    array-length v1, v0

    if-lez v1, :cond_1

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1, p2, v1}, Lcom/daaw/rb0;->V(JZ)Z

    move-result v0

    const/4 v1, 0x1

    :goto_0
    iget-object v2, p0, Lcom/daaw/kb0;->D:[Lcom/daaw/rb0;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    aget-object v2, v2, v1

    invoke-virtual {v2, p1, p2, v0}, Lcom/daaw/rb0;->V(JZ)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/kb0;->w:Lcom/daaw/pl1;

    invoke-virtual {v0}, Lcom/daaw/pl1;->b()V

    :cond_1
    return-wide p1
.end method

.method public bridge synthetic n(Lcom/daaw/gb1;)V
    .locals 0

    check-cast p1, Lcom/daaw/rb0;

    invoke-virtual {p0, p1}, Lcom/daaw/kb0;->x(Lcom/daaw/rb0;)V

    return-void
.end method

.method public final o(Lcom/daaw/ib0;J)V
    .locals 15

    move-object v7, p0

    move-object/from16 v8, p1

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, v8, Lcom/daaw/ib0;->c:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v9, 0x0

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    const/4 v10, 0x2

    const/4 v11, 0x1

    if-ge v3, v4, :cond_3

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/ib0$a;

    iget-object v5, v4, Lcom/daaw/ib0$a;->b:Lcom/google/android/exoplayer2/Format;

    iget v6, v5, Lcom/google/android/exoplayer2/Format;->z:I

    if-gtz v6, :cond_1

    iget-object v6, v5, Lcom/google/android/exoplayer2/Format;->r:Ljava/lang/String;

    invoke-static {v6, v10}, Lcom/daaw/sq1;->s(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    iget-object v5, v5, Lcom/google/android/exoplayer2/Format;->r:Ljava/lang/String;

    invoke-static {v5, v11}, Lcom/daaw/sq1;->s(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    :goto_1
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_4

    move-object v12, v1

    goto :goto_3

    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_5

    invoke-interface {v0, v2}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    :cond_5
    move-object v12, v0

    :goto_3
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v11

    invoke-static {v0}, Lcom/daaw/s6;->a(Z)V

    new-array v0, v9, [Lcom/daaw/ib0$a;

    invoke-interface {v12, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, [Lcom/daaw/ib0$a;

    aget-object v0, v13, v9

    iget-object v0, v0, Lcom/daaw/ib0$a;->b:Lcom/google/android/exoplayer2/Format;

    iget-object v14, v0, Lcom/google/android/exoplayer2/Format;->r:Ljava/lang/String;

    const/4 v1, 0x0

    iget-object v3, v8, Lcom/daaw/ib0;->f:Lcom/google/android/exoplayer2/Format;

    iget-object v4, v8, Lcom/daaw/ib0;->g:Ljava/util/List;

    move-object v0, p0

    move-object v2, v13

    move-wide/from16 v5, p2

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/kb0;->u(I[Lcom/daaw/ib0$a;Lcom/google/android/exoplayer2/Format;Ljava/util/List;J)Lcom/daaw/rb0;

    move-result-object v0

    iget-object v1, v7, Lcom/daaw/kb0;->C:[Lcom/daaw/rb0;

    aput-object v0, v1, v9

    iget-boolean v1, v7, Lcom/daaw/kb0;->y:Z

    if-eqz v1, :cond_f

    if-eqz v14, :cond_f

    invoke-static {v14, v10}, Lcom/daaw/sq1;->s(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    const/4 v1, 0x1

    goto :goto_4

    :cond_6
    const/4 v1, 0x0

    :goto_4
    invoke-static {v14, v11}, Lcom/daaw/sq1;->s(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    const/4 v2, 0x1

    goto :goto_5

    :cond_7
    const/4 v2, 0x0

    :goto_5
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, -0x1

    if-eqz v1, :cond_b

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v1

    new-array v5, v1, [Lcom/google/android/exoplayer2/Format;

    const/4 v6, 0x0

    :goto_6
    if-ge v6, v1, :cond_8

    aget-object v10, v13, v6

    iget-object v10, v10, Lcom/daaw/ib0$a;->b:Lcom/google/android/exoplayer2/Format;

    invoke-static {v10}, Lcom/daaw/kb0;->w(Lcom/google/android/exoplayer2/Format;)Lcom/google/android/exoplayer2/Format;

    move-result-object v10

    aput-object v10, v5, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    :cond_8
    new-instance v1, Lcom/google/android/exoplayer2/source/TrackGroup;

    invoke-direct {v1, v5}, Lcom/google/android/exoplayer2/source/TrackGroup;-><init>([Lcom/google/android/exoplayer2/Format;)V

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v2, :cond_a

    iget-object v1, v8, Lcom/daaw/ib0;->f:Lcom/google/android/exoplayer2/Format;

    if-nez v1, :cond_9

    iget-object v1, v8, Lcom/daaw/ib0;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_a

    :cond_9
    new-instance v1, Lcom/google/android/exoplayer2/source/TrackGroup;

    new-array v2, v11, [Lcom/google/android/exoplayer2/Format;

    aget-object v5, v13, v9

    iget-object v5, v5, Lcom/daaw/ib0$a;->b:Lcom/google/android/exoplayer2/Format;

    iget-object v6, v8, Lcom/daaw/ib0;->f:Lcom/google/android/exoplayer2/Format;

    invoke-static {v5, v6, v4}, Lcom/daaw/kb0;->v(Lcom/google/android/exoplayer2/Format;Lcom/google/android/exoplayer2/Format;I)Lcom/google/android/exoplayer2/Format;

    move-result-object v5

    aput-object v5, v2, v9

    invoke-direct {v1, v2}, Lcom/google/android/exoplayer2/source/TrackGroup;-><init>([Lcom/google/android/exoplayer2/Format;)V

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_a
    iget-object v1, v8, Lcom/daaw/ib0;->g:Ljava/util/List;

    if-eqz v1, :cond_d

    const/4 v2, 0x0

    :goto_7
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    if-ge v2, v5, :cond_d

    new-instance v5, Lcom/google/android/exoplayer2/source/TrackGroup;

    new-array v6, v11, [Lcom/google/android/exoplayer2/Format;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/exoplayer2/Format;

    aput-object v8, v6, v9

    invoke-direct {v5, v6}, Lcom/google/android/exoplayer2/source/TrackGroup;-><init>([Lcom/google/android/exoplayer2/Format;)V

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_b
    if-eqz v2, :cond_e

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v1

    new-array v2, v1, [Lcom/google/android/exoplayer2/Format;

    const/4 v5, 0x0

    :goto_8
    if-ge v5, v1, :cond_c

    aget-object v6, v13, v5

    iget-object v6, v6, Lcom/daaw/ib0$a;->b:Lcom/google/android/exoplayer2/Format;

    iget-object v10, v8, Lcom/daaw/ib0;->f:Lcom/google/android/exoplayer2/Format;

    iget v12, v6, Lcom/google/android/exoplayer2/Format;->q:I

    invoke-static {v6, v10, v12}, Lcom/daaw/kb0;->v(Lcom/google/android/exoplayer2/Format;Lcom/google/android/exoplayer2/Format;I)Lcom/google/android/exoplayer2/Format;

    move-result-object v6

    aput-object v6, v2, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    :cond_c
    new-instance v1, Lcom/google/android/exoplayer2/source/TrackGroup;

    invoke-direct {v1, v2}, Lcom/google/android/exoplayer2/source/TrackGroup;-><init>([Lcom/google/android/exoplayer2/Format;)V

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_d
    new-instance v1, Lcom/google/android/exoplayer2/source/TrackGroup;

    new-array v2, v11, [Lcom/google/android/exoplayer2/Format;

    const-string v5, "ID3"

    const-string v6, "application/id3"

    const/4 v8, 0x0

    invoke-static {v5, v6, v8, v4, v8}, Lcom/google/android/exoplayer2/Format;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;

    move-result-object v4

    aput-object v4, v2, v9

    invoke-direct {v1, v2}, Lcom/google/android/exoplayer2/source/TrackGroup;-><init>([Lcom/google/android/exoplayer2/Format;)V

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/exoplayer2/source/TrackGroupArray;

    new-array v4, v9, [Lcom/google/android/exoplayer2/source/TrackGroup;

    invoke-interface {v3, v4}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Lcom/google/android/exoplayer2/source/TrackGroup;

    invoke-direct {v2, v3}, Lcom/google/android/exoplayer2/source/TrackGroupArray;-><init>([Lcom/google/android/exoplayer2/source/TrackGroup;)V

    new-instance v3, Lcom/google/android/exoplayer2/source/TrackGroupArray;

    new-array v4, v11, [Lcom/google/android/exoplayer2/source/TrackGroup;

    aput-object v1, v4, v9

    invoke-direct {v3, v4}, Lcom/google/android/exoplayer2/source/TrackGroupArray;-><init>([Lcom/google/android/exoplayer2/source/TrackGroup;)V

    invoke-virtual {v0, v2, v9, v3}, Lcom/daaw/rb0;->Q(Lcom/google/android/exoplayer2/source/TrackGroupArray;ILcom/google/android/exoplayer2/source/TrackGroupArray;)V

    goto :goto_9

    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected codecs attribute: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    invoke-virtual {v0, v11}, Lcom/daaw/rb0;->X(Z)V

    invoke-virtual {v0}, Lcom/daaw/rb0;->y()V

    :goto_9
    return-void
.end method

.method public p(Lcom/daaw/qo0$a;J)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/kb0;->z:Lcom/daaw/qo0$a;

    iget-object p1, p0, Lcom/daaw/kb0;->q:Lcom/daaw/pb0;

    invoke-interface {p1, p0}, Lcom/daaw/pb0;->l(Lcom/daaw/pb0$a;)V

    invoke-virtual {p0, p2, p3}, Lcom/daaw/kb0;->r(J)V

    return-void
.end method

.method public q()J
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/kb0;->F:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/kb0;->t:Lcom/daaw/cp0$a;

    invoke-virtual {v0}, Lcom/daaw/cp0$a;->t()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/kb0;->F:Z

    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public final r(J)V
    .locals 16

    move-object/from16 v7, p0

    iget-object v0, v7, Lcom/daaw/kb0;->q:Lcom/daaw/pb0;

    invoke-interface {v0}, Lcom/daaw/pb0;->i()Lcom/daaw/ib0;

    move-result-object v0

    iget-object v8, v0, Lcom/daaw/ib0;->d:Ljava/util/List;

    iget-object v9, v0, Lcom/daaw/ib0;->e:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v1

    const/4 v10, 0x1

    add-int/2addr v1, v10

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    new-array v2, v1, [Lcom/daaw/rb0;

    iput-object v2, v7, Lcom/daaw/kb0;->C:[Lcom/daaw/rb0;

    iput v1, v7, Lcom/daaw/kb0;->A:I

    move-wide/from16 v11, p1

    invoke-virtual {v7, v0, v11, v12}, Lcom/daaw/kb0;->o(Lcom/daaw/ib0;J)V

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    :goto_0
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-ge v14, v0, :cond_1

    invoke-interface {v8, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/daaw/ib0$a;

    const/4 v1, 0x1

    new-array v2, v10, [Lcom/daaw/ib0$a;

    aput-object v5, v2, v13

    const/4 v3, 0x0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    move-object/from16 v0, p0

    move-object v13, v5

    move-wide/from16 v5, p1

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/kb0;->u(I[Lcom/daaw/ib0$a;Lcom/google/android/exoplayer2/Format;Ljava/util/List;J)Lcom/daaw/rb0;

    move-result-object v0

    iget-object v1, v7, Lcom/daaw/kb0;->C:[Lcom/daaw/rb0;

    add-int/lit8 v2, v15, 0x1

    aput-object v0, v1, v15

    iget-object v1, v13, Lcom/daaw/ib0$a;->b:Lcom/google/android/exoplayer2/Format;

    iget-boolean v3, v7, Lcom/daaw/kb0;->y:Z

    if-eqz v3, :cond_0

    iget-object v1, v1, Lcom/google/android/exoplayer2/Format;->r:Ljava/lang/String;

    if-eqz v1, :cond_0

    new-instance v1, Lcom/google/android/exoplayer2/source/TrackGroupArray;

    new-array v3, v10, [Lcom/google/android/exoplayer2/source/TrackGroup;

    new-instance v4, Lcom/google/android/exoplayer2/source/TrackGroup;

    new-array v5, v10, [Lcom/google/android/exoplayer2/Format;

    iget-object v6, v13, Lcom/daaw/ib0$a;->b:Lcom/google/android/exoplayer2/Format;

    const/4 v13, 0x0

    aput-object v6, v5, v13

    invoke-direct {v4, v5}, Lcom/google/android/exoplayer2/source/TrackGroup;-><init>([Lcom/google/android/exoplayer2/Format;)V

    aput-object v4, v3, v13

    invoke-direct {v1, v3}, Lcom/google/android/exoplayer2/source/TrackGroupArray;-><init>([Lcom/google/android/exoplayer2/source/TrackGroup;)V

    sget-object v3, Lcom/google/android/exoplayer2/source/TrackGroupArray;->s:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    invoke-virtual {v0, v1, v13, v3}, Lcom/daaw/rb0;->Q(Lcom/google/android/exoplayer2/source/TrackGroupArray;ILcom/google/android/exoplayer2/source/TrackGroupArray;)V

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/rb0;->y()V

    :goto_1
    add-int/lit8 v14, v14, 0x1

    move v15, v2

    const/4 v13, 0x0

    goto :goto_0

    :cond_1
    const/4 v13, 0x0

    :goto_2
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-ge v13, v0, :cond_2

    invoke-interface {v9, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/daaw/ib0$a;

    const/4 v1, 0x3

    new-array v2, v10, [Lcom/daaw/ib0$a;

    const/4 v0, 0x0

    aput-object v8, v2, v0

    const/4 v3, 0x0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    move-object/from16 v0, p0

    move-wide/from16 v5, p1

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/kb0;->u(I[Lcom/daaw/ib0$a;Lcom/google/android/exoplayer2/Format;Ljava/util/List;J)Lcom/daaw/rb0;

    move-result-object v0

    iget-object v1, v7, Lcom/daaw/kb0;->C:[Lcom/daaw/rb0;

    add-int/lit8 v2, v15, 0x1

    aput-object v0, v1, v15

    new-instance v1, Lcom/google/android/exoplayer2/source/TrackGroupArray;

    new-array v3, v10, [Lcom/google/android/exoplayer2/source/TrackGroup;

    new-instance v4, Lcom/google/android/exoplayer2/source/TrackGroup;

    new-array v5, v10, [Lcom/google/android/exoplayer2/Format;

    iget-object v6, v8, Lcom/daaw/ib0$a;->b:Lcom/google/android/exoplayer2/Format;

    const/4 v8, 0x0

    aput-object v6, v5, v8

    invoke-direct {v4, v5}, Lcom/google/android/exoplayer2/source/TrackGroup;-><init>([Lcom/google/android/exoplayer2/Format;)V

    aput-object v4, v3, v8

    invoke-direct {v1, v3}, Lcom/google/android/exoplayer2/source/TrackGroupArray;-><init>([Lcom/google/android/exoplayer2/source/TrackGroup;)V

    sget-object v3, Lcom/google/android/exoplayer2/source/TrackGroupArray;->s:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    invoke-virtual {v0, v1, v8, v3}, Lcom/daaw/rb0;->Q(Lcom/google/android/exoplayer2/source/TrackGroupArray;ILcom/google/android/exoplayer2/source/TrackGroupArray;)V

    add-int/lit8 v13, v13, 0x1

    move v15, v2

    goto :goto_2

    :cond_2
    iget-object v0, v7, Lcom/daaw/kb0;->C:[Lcom/daaw/rb0;

    iput-object v0, v7, Lcom/daaw/kb0;->D:[Lcom/daaw/rb0;

    return-void
.end method

.method public s()Lcom/google/android/exoplayer2/source/TrackGroupArray;
    .locals 1

    iget-object v0, p0, Lcom/daaw/kb0;->B:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    return-object v0
.end method

.method public t(JZ)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/kb0;->D:[Lcom/daaw/rb0;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p1, p2, p3}, Lcom/daaw/rb0;->t(JZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final u(I[Lcom/daaw/ib0$a;Lcom/google/android/exoplayer2/Format;Ljava/util/List;J)Lcom/daaw/rb0;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[",
            "Lcom/daaw/ib0$a;",
            "Lcom/google/android/exoplayer2/Format;",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/Format;",
            ">;J)",
            "Lcom/daaw/rb0;"
        }
    .end annotation

    move-object v10, p0

    new-instance v7, Lcom/daaw/eb0;

    iget-object v1, v10, Lcom/daaw/kb0;->p:Lcom/daaw/gb0;

    iget-object v2, v10, Lcom/daaw/kb0;->q:Lcom/daaw/pb0;

    iget-object v4, v10, Lcom/daaw/kb0;->r:Lcom/daaw/fb0;

    iget-object v5, v10, Lcom/daaw/kb0;->w:Lcom/daaw/pl1;

    move-object v0, v7

    move-object v3, p2

    move-object/from16 v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/daaw/eb0;-><init>(Lcom/daaw/gb0;Lcom/daaw/pb0;[Lcom/daaw/ib0$a;Lcom/daaw/fb0;Lcom/daaw/pl1;Ljava/util/List;)V

    new-instance v11, Lcom/daaw/rb0;

    iget-object v4, v10, Lcom/daaw/kb0;->u:Lcom/daaw/l2;

    iget v8, v10, Lcom/daaw/kb0;->s:I

    iget-object v9, v10, Lcom/daaw/kb0;->t:Lcom/daaw/cp0$a;

    move-object v0, v11

    move v1, p1

    move-object v2, p0

    move-object v3, v7

    move-wide/from16 v5, p5

    move-object v7, p3

    invoke-direct/range {v0 .. v9}, Lcom/daaw/rb0;-><init>(ILcom/daaw/rb0$c;Lcom/daaw/eb0;Lcom/daaw/l2;JLcom/google/android/exoplayer2/Format;ILcom/daaw/cp0$a;)V

    return-object v11
.end method

.method public x(Lcom/daaw/rb0;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/kb0;->z:Lcom/daaw/qo0$a;

    invoke-interface {p1, p0}, Lcom/daaw/gb1$a;->n(Lcom/daaw/gb1;)V

    return-void
.end method

.method public y()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/kb0;->q:Lcom/daaw/pb0;

    invoke-interface {v0, p0}, Lcom/daaw/pb0;->c(Lcom/daaw/pb0$a;)V

    iget-object v0, p0, Lcom/daaw/kb0;->C:[Lcom/daaw/rb0;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lcom/daaw/rb0;->S()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/kb0;->z:Lcom/daaw/qo0$a;

    iget-object v0, p0, Lcom/daaw/kb0;->t:Lcom/daaw/cp0$a;

    invoke-virtual {v0}, Lcom/daaw/cp0$a;->r()V

    return-void
.end method
