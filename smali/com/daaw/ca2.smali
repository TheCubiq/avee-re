.class public final Lcom/daaw/ca2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/j09;
.implements Lcom/daaw/i42;


# static fields
.field public static final x:Lcom/daaw/q09;


# instance fields
.field public final a:Lcom/daaw/ik5;

.field public final b:Lcom/daaw/ik5;

.field public final c:Lcom/daaw/ik5;

.field public final d:Lcom/daaw/ik5;

.field public final e:Ljava/util/ArrayDeque;

.field public final f:Lcom/daaw/fa2;

.field public final g:Ljava/util/List;

.field public h:I

.field public i:I

.field public j:J

.field public k:I

.field public l:Lcom/daaw/ik5;

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:Lcom/daaw/m09;

.field public r:[Lcom/daaw/ba2;

.field public s:[[J

.field public t:I

.field public u:J

.field public v:I

.field public w:Lcom/google/android/gms/internal/ads/zzadu;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/daaw/z92;->b:Lcom/daaw/z92;

    sput-object v0, Lcom/daaw/ca2;->x:Lcom/daaw/q09;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/ca2;->h:I

    new-instance v0, Lcom/daaw/fa2;

    invoke-direct {v0}, Lcom/daaw/fa2;-><init>()V

    iput-object v0, p0, Lcom/daaw/ca2;->f:Lcom/daaw/fa2;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/ca2;->g:Ljava/util/List;

    new-instance v0, Lcom/daaw/ik5;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lcom/daaw/ik5;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/ca2;->d:Lcom/daaw/ik5;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lcom/daaw/ca2;->e:Ljava/util/ArrayDeque;

    new-instance v0, Lcom/daaw/ik5;

    sget-object v1, Lcom/daaw/c42;->a:[B

    invoke-direct {v0, v1}, Lcom/daaw/ik5;-><init>([B)V

    iput-object v0, p0, Lcom/daaw/ca2;->a:Lcom/daaw/ik5;

    new-instance v0, Lcom/daaw/ik5;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lcom/daaw/ik5;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/ca2;->b:Lcom/daaw/ik5;

    new-instance v0, Lcom/daaw/ik5;

    invoke-direct {v0}, Lcom/daaw/ik5;-><init>()V

    iput-object v0, p0, Lcom/daaw/ca2;->c:Lcom/daaw/ik5;

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/ca2;->m:I

    sget-object v0, Lcom/daaw/m09;->o:Lcom/daaw/m09;

    iput-object v0, p0, Lcom/daaw/ca2;->q:Lcom/daaw/m09;

    new-array p1, p1, [Lcom/daaw/ba2;

    iput-object p1, p0, Lcom/daaw/ca2;->r:[Lcom/daaw/ba2;

    return-void
.end method

.method public static g(I)I
    .locals 1

    const v0, 0x68656963

    if-eq p0, v0, :cond_1

    const v0, 0x71742020

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x2

    return p0
.end method

.method public static h(Lcom/daaw/ka2;J)I
    .locals 2

    invoke-virtual {p0, p1, p2}, Lcom/daaw/ka2;->a(J)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/ka2;->b(J)I

    move-result p0

    return p0

    :cond_0
    return v0
.end method

.method public static i(Lcom/daaw/ka2;JJ)J
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/ca2;->h(Lcom/daaw/ka2;J)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return-wide p3

    :cond_0
    iget-object p0, p0, Lcom/daaw/ka2;->c:[J

    aget-wide p1, p0, p1

    invoke-static {p1, p2, p3, p4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p0

    return-wide p0
.end method


# virtual methods
.method public final a(Lcom/daaw/k09;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/daaw/ga2;->b(Lcom/daaw/k09;Z)Z

    move-result p1

    return p1
.end method

.method public final b(J)Lcom/daaw/g42;
    .locals 12

    iget-object v0, p0, Lcom/daaw/ca2;->r:[Lcom/daaw/ba2;

    array-length v1, v0

    if-nez v1, :cond_0

    new-instance p1, Lcom/daaw/g42;

    sget-object p2, Lcom/daaw/j42;->c:Lcom/daaw/j42;

    invoke-direct {p1, p2, p2}, Lcom/daaw/g42;-><init>(Lcom/daaw/j42;Lcom/daaw/j42;)V

    goto/16 :goto_3

    :cond_0
    iget v1, p0, Lcom/daaw/ca2;->t:I

    const/4 v2, -0x1

    const-wide/16 v3, -0x1

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    if-eq v1, v2, :cond_3

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/daaw/ba2;->b:Lcom/daaw/ka2;

    invoke-static {v0, p1, p2}, Lcom/daaw/ca2;->h(Lcom/daaw/ka2;J)I

    move-result v1

    if-ne v1, v2, :cond_1

    new-instance p1, Lcom/daaw/g42;

    sget-object p2, Lcom/daaw/j42;->c:Lcom/daaw/j42;

    invoke-direct {p1, p2, p2}, Lcom/daaw/g42;-><init>(Lcom/daaw/j42;Lcom/daaw/j42;)V

    goto/16 :goto_3

    :cond_1
    iget-object v7, v0, Lcom/daaw/ka2;->f:[J

    aget-wide v8, v7, v1

    iget-object v7, v0, Lcom/daaw/ka2;->c:[J

    aget-wide v10, v7, v1

    cmp-long v7, v8, p1

    if-gez v7, :cond_2

    iget v7, v0, Lcom/daaw/ka2;->b:I

    add-int/2addr v7, v2

    if-ge v1, v7, :cond_2

    invoke-virtual {v0, p1, p2}, Lcom/daaw/ka2;->b(J)I

    move-result p1

    if-eq p1, v2, :cond_2

    if-eq p1, v1, :cond_2

    iget-object p2, v0, Lcom/daaw/ka2;->f:[J

    aget-wide v1, p2, p1

    iget-object p2, v0, Lcom/daaw/ka2;->c:[J

    aget-wide p1, p2, p1

    move-wide v3, p1

    goto :goto_0

    :cond_2
    move-wide v1, v5

    :goto_0
    move-wide p1, v8

    goto :goto_1

    :cond_3
    const-wide v10, 0x7fffffffffffffffL

    move-wide v1, v5

    :goto_1
    const/4 v0, 0x0

    :goto_2
    iget-object v7, p0, Lcom/daaw/ca2;->r:[Lcom/daaw/ba2;

    array-length v8, v7

    if-ge v0, v8, :cond_6

    iget v8, p0, Lcom/daaw/ca2;->t:I

    if-eq v0, v8, :cond_5

    aget-object v7, v7, v0

    iget-object v7, v7, Lcom/daaw/ba2;->b:Lcom/daaw/ka2;

    invoke-static {v7, p1, p2, v10, v11}, Lcom/daaw/ca2;->i(Lcom/daaw/ka2;JJ)J

    move-result-wide v8

    cmp-long v10, v1, v5

    if-eqz v10, :cond_4

    invoke-static {v7, v1, v2, v3, v4}, Lcom/daaw/ca2;->i(Lcom/daaw/ka2;JJ)J

    move-result-wide v3

    :cond_4
    move-wide v10, v8

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_6
    new-instance v0, Lcom/daaw/j42;

    invoke-direct {v0, p1, p2, v10, v11}, Lcom/daaw/j42;-><init>(JJ)V

    cmp-long p1, v1, v5

    if-nez p1, :cond_7

    new-instance p1, Lcom/daaw/g42;

    invoke-direct {p1, v0, v0}, Lcom/daaw/g42;-><init>(Lcom/daaw/j42;Lcom/daaw/j42;)V

    goto :goto_3

    :cond_7
    new-instance p1, Lcom/daaw/j42;

    invoke-direct {p1, v1, v2, v3, v4}, Lcom/daaw/j42;-><init>(JJ)V

    new-instance p2, Lcom/daaw/g42;

    invoke-direct {p2, v0, p1}, Lcom/daaw/g42;-><init>(Lcom/daaw/j42;Lcom/daaw/j42;)V

    move-object p1, p2

    :goto_3
    return-object p1
.end method

.method public final c(Lcom/daaw/m09;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ca2;->q:Lcom/daaw/m09;

    return-void
.end method

.method public final d(Lcom/daaw/k09;Lcom/daaw/f42;)I
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    :cond_0
    :goto_0
    iget v3, v0, Lcom/daaw/ca2;->h:I

    const v4, 0x66747970

    const-wide/16 v6, 0x0

    const/4 v8, -0x1

    const/16 v9, 0x8

    const/4 v10, 0x1

    if-eqz v3, :cond_20

    const-wide/32 v13, 0x40000

    if-eq v3, v10, :cond_18

    invoke-interface/range {p1 .. p1}, Lcom/daaw/k09;->zzf()J

    move-result-wide v3

    iget v9, v0, Lcom/daaw/ca2;->m:I

    if-ne v9, v8, :cond_b

    const-wide v16, 0x7fffffffffffffffL

    move-wide/from16 v18, v16

    move-wide/from16 v22, v18

    move-wide/from16 v25, v22

    const/4 v9, 0x0

    const/16 v20, -0x1

    const/16 v21, 0x1

    const/16 v24, 0x1

    const/16 v27, -0x1

    :goto_1
    iget-object v5, v0, Lcom/daaw/ca2;->r:[Lcom/daaw/ba2;

    array-length v15, v5

    if-ge v9, v15, :cond_8

    aget-object v5, v5, v9

    iget v15, v5, Lcom/daaw/ba2;->e:I

    iget-object v5, v5, Lcom/daaw/ba2;->b:Lcom/daaw/ka2;

    iget v12, v5, Lcom/daaw/ka2;->b:I

    if-ne v15, v12, :cond_1

    goto :goto_6

    :cond_1
    iget-object v5, v5, Lcom/daaw/ka2;->c:[J

    aget-wide v28, v5, v15

    iget-object v5, v0, Lcom/daaw/ca2;->s:[[J

    invoke-static {v5}, Lcom/daaw/it5;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [[J

    aget-object v5, v5, v9

    aget-wide v30, v5, v15

    sub-long v28, v28, v3

    cmp-long v5, v28, v6

    if-ltz v5, :cond_3

    cmp-long v5, v28, v13

    if-ltz v5, :cond_2

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v5, 0x1

    :goto_3
    if-nez v5, :cond_4

    if-nez v24, :cond_5

    const/4 v12, 0x0

    goto :goto_4

    :cond_4
    move/from16 v12, v24

    :goto_4
    if-ne v5, v12, :cond_6

    cmp-long v15, v28, v22

    if-gez v15, :cond_6

    :cond_5
    move/from16 v24, v5

    move/from16 v20, v9

    move-wide/from16 v22, v28

    move-wide/from16 v25, v30

    goto :goto_5

    :cond_6
    move/from16 v24, v12

    :goto_5
    cmp-long v12, v30, v18

    if-gez v12, :cond_7

    move/from16 v21, v5

    move/from16 v27, v9

    move-wide/from16 v18, v30

    :cond_7
    :goto_6
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_8
    cmp-long v5, v18, v16

    if-eqz v5, :cond_a

    if-eqz v21, :cond_a

    const-wide/32 v15, 0xa00000

    add-long v18, v18, v15

    cmp-long v5, v25, v18

    if-gez v5, :cond_9

    goto :goto_7

    :cond_9
    move/from16 v9, v27

    goto :goto_8

    :cond_a
    :goto_7
    move/from16 v9, v20

    :goto_8
    iput v9, v0, Lcom/daaw/ca2;->m:I

    if-ne v9, v8, :cond_b

    goto/16 :goto_d

    :cond_b
    iget-object v5, v0, Lcom/daaw/ca2;->r:[Lcom/daaw/ba2;

    aget-object v5, v5, v9

    iget-object v9, v5, Lcom/daaw/ba2;->c:Lcom/daaw/m42;

    iget v12, v5, Lcom/daaw/ba2;->e:I

    iget-object v15, v5, Lcom/daaw/ba2;->b:Lcom/daaw/ka2;

    iget-object v8, v15, Lcom/daaw/ka2;->c:[J

    aget-wide v10, v8, v12

    iget-object v8, v15, Lcom/daaw/ka2;->d:[I

    aget v8, v8, v12

    iget-object v15, v5, Lcom/daaw/ba2;->d:Lcom/daaw/n42;

    sub-long v3, v10, v3

    iget v13, v0, Lcom/daaw/ca2;->n:I

    int-to-long v13, v13

    add-long/2addr v3, v13

    cmp-long v13, v3, v6

    if-ltz v13, :cond_17

    const-wide/32 v6, 0x40000

    cmp-long v13, v3, v6

    if-ltz v13, :cond_c

    goto/16 :goto_c

    :cond_c
    iget-object v2, v5, Lcom/daaw/ba2;->a:Lcom/daaw/ha2;

    iget v2, v2, Lcom/daaw/ha2;->g:I

    const/4 v6, 0x1

    if-ne v2, v6, :cond_d

    const-wide/16 v6, 0x8

    add-long/2addr v3, v6

    add-int/lit8 v8, v8, -0x8

    :cond_d
    long-to-int v2, v3

    invoke-interface {v1, v2}, Lcom/daaw/k09;->u(I)V

    iget-object v2, v5, Lcom/daaw/ba2;->a:Lcom/daaw/ha2;

    iget v3, v2, Lcom/daaw/ha2;->j:I

    if-eqz v3, :cond_10

    iget-object v2, v0, Lcom/daaw/ca2;->b:Lcom/daaw/ik5;

    invoke-virtual {v2}, Lcom/daaw/ik5;->h()[B

    move-result-object v2

    const/4 v4, 0x0

    aput-byte v4, v2, v4

    const/4 v6, 0x1

    aput-byte v4, v2, v6

    const/4 v6, 0x2

    aput-byte v4, v2, v6

    rsub-int/lit8 v4, v3, 0x4

    :goto_9
    iget v6, v0, Lcom/daaw/ca2;->o:I

    if-ge v6, v8, :cond_14

    iget v6, v0, Lcom/daaw/ca2;->p:I

    if-nez v6, :cond_f

    invoke-interface {v1, v2, v4, v3}, Lcom/daaw/k09;->i([BII)V

    iget v6, v0, Lcom/daaw/ca2;->n:I

    add-int/2addr v6, v3

    iput v6, v0, Lcom/daaw/ca2;->n:I

    iget-object v6, v0, Lcom/daaw/ca2;->b:Lcom/daaw/ik5;

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Lcom/daaw/ik5;->f(I)V

    iget-object v6, v0, Lcom/daaw/ca2;->b:Lcom/daaw/ik5;

    invoke-virtual {v6}, Lcom/daaw/ik5;->m()I

    move-result v6

    if-ltz v6, :cond_e

    iput v6, v0, Lcom/daaw/ca2;->p:I

    iget-object v6, v0, Lcom/daaw/ca2;->a:Lcom/daaw/ik5;

    invoke-virtual {v6, v7}, Lcom/daaw/ik5;->f(I)V

    iget-object v6, v0, Lcom/daaw/ca2;->a:Lcom/daaw/ik5;

    const/4 v10, 0x4

    invoke-interface {v9, v6, v10}, Lcom/daaw/m42;->c(Lcom/daaw/ik5;I)V

    iget v6, v0, Lcom/daaw/ca2;->o:I

    add-int/2addr v6, v10

    iput v6, v0, Lcom/daaw/ca2;->o:I

    add-int/2addr v8, v4

    goto :goto_9

    :cond_e
    const-string v1, "Invalid NAL length"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object v1

    throw v1

    :cond_f
    const/4 v7, 0x0

    invoke-interface {v9, v1, v6, v7}, Lcom/daaw/m42;->e(Lcom/daaw/xp8;IZ)I

    move-result v6

    iget v7, v0, Lcom/daaw/ca2;->n:I

    add-int/2addr v7, v6

    iput v7, v0, Lcom/daaw/ca2;->n:I

    iget v7, v0, Lcom/daaw/ca2;->o:I

    add-int/2addr v7, v6

    iput v7, v0, Lcom/daaw/ca2;->o:I

    iget v7, v0, Lcom/daaw/ca2;->p:I

    sub-int/2addr v7, v6

    iput v7, v0, Lcom/daaw/ca2;->p:I

    goto :goto_9

    :cond_10
    iget-object v2, v2, Lcom/daaw/ha2;->f:Lcom/daaw/f92;

    iget-object v2, v2, Lcom/daaw/f92;->l:Ljava/lang/String;

    const-string v3, "audio/ac4"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    iget v2, v0, Lcom/daaw/ca2;->o:I

    if-nez v2, :cond_11

    iget-object v2, v0, Lcom/daaw/ca2;->c:Lcom/daaw/ik5;

    invoke-static {v8, v2}, Lcom/daaw/fz8;->b(ILcom/daaw/ik5;)V

    iget-object v2, v0, Lcom/daaw/ca2;->c:Lcom/daaw/ik5;

    const/4 v3, 0x7

    invoke-interface {v9, v2, v3}, Lcom/daaw/m42;->c(Lcom/daaw/ik5;I)V

    iget v2, v0, Lcom/daaw/ca2;->o:I

    add-int/2addr v2, v3

    iput v2, v0, Lcom/daaw/ca2;->o:I

    :cond_11
    add-int/lit8 v8, v8, 0x7

    goto :goto_a

    :cond_12
    if-eqz v15, :cond_13

    invoke-virtual {v15, v1}, Lcom/daaw/n42;->d(Lcom/daaw/k09;)V

    :cond_13
    :goto_a
    iget v2, v0, Lcom/daaw/ca2;->o:I

    if-ge v2, v8, :cond_14

    sub-int v2, v8, v2

    const/4 v3, 0x0

    invoke-interface {v9, v1, v2, v3}, Lcom/daaw/m42;->e(Lcom/daaw/xp8;IZ)I

    move-result v2

    iget v3, v0, Lcom/daaw/ca2;->n:I

    add-int/2addr v3, v2

    iput v3, v0, Lcom/daaw/ca2;->n:I

    iget v3, v0, Lcom/daaw/ca2;->o:I

    add-int/2addr v3, v2

    iput v3, v0, Lcom/daaw/ca2;->o:I

    iget v3, v0, Lcom/daaw/ca2;->p:I

    sub-int/2addr v3, v2

    iput v3, v0, Lcom/daaw/ca2;->p:I

    goto :goto_a

    :cond_14
    iget-object v1, v5, Lcom/daaw/ba2;->b:Lcom/daaw/ka2;

    iget-object v2, v1, Lcom/daaw/ka2;->f:[J

    aget-wide v3, v2, v12

    iget-object v1, v1, Lcom/daaw/ka2;->g:[I

    aget v1, v1, v12

    if-eqz v15, :cond_15

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object v2, v15

    move-object/from16 v16, v9

    move-wide/from16 v17, v3

    move/from16 v19, v1

    move/from16 v20, v8

    invoke-virtual/range {v15 .. v22}, Lcom/daaw/n42;->c(Lcom/daaw/m42;JIIILcom/daaw/l42;)V

    const/4 v1, 0x1

    add-int/2addr v12, v1

    iget-object v1, v5, Lcom/daaw/ba2;->b:Lcom/daaw/ka2;

    iget v1, v1, Lcom/daaw/ka2;->b:I

    if-ne v12, v1, :cond_16

    const/4 v1, 0x0

    invoke-virtual {v2, v9, v1}, Lcom/daaw/n42;->a(Lcom/daaw/m42;Lcom/daaw/l42;)V

    goto :goto_b

    :cond_15
    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object v15, v9

    move-wide/from16 v16, v3

    move/from16 v18, v1

    move/from16 v19, v8

    invoke-interface/range {v15 .. v21}, Lcom/daaw/m42;->b(JIIILcom/daaw/l42;)V

    :cond_16
    :goto_b
    iget v1, v5, Lcom/daaw/ba2;->e:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, v5, Lcom/daaw/ba2;->e:I

    const/4 v1, -0x1

    iput v1, v0, Lcom/daaw/ca2;->m:I

    const/4 v1, 0x0

    iput v1, v0, Lcom/daaw/ca2;->n:I

    iput v1, v0, Lcom/daaw/ca2;->o:I

    iput v1, v0, Lcom/daaw/ca2;->p:I

    const/4 v8, 0x0

    goto :goto_d

    :cond_17
    :goto_c
    iput-wide v10, v2, Lcom/daaw/f42;->a:J

    const/4 v8, 0x1

    :goto_d
    return v8

    :cond_18
    iget-wide v5, v0, Lcom/daaw/ca2;->j:J

    iget v3, v0, Lcom/daaw/ca2;->k:I

    int-to-long v7, v3

    sub-long/2addr v5, v7

    invoke-interface/range {p1 .. p1}, Lcom/daaw/k09;->zzf()J

    move-result-wide v7

    add-long/2addr v7, v5

    iget-object v3, v0, Lcom/daaw/ca2;->l:Lcom/daaw/ik5;

    if-eqz v3, :cond_1d

    invoke-virtual {v3}, Lcom/daaw/ik5;->h()[B

    move-result-object v10

    iget v11, v0, Lcom/daaw/ca2;->k:I

    long-to-int v6, v5

    invoke-interface {v1, v10, v11, v6}, Lcom/daaw/k09;->i([BII)V

    iget v5, v0, Lcom/daaw/ca2;->i:I

    if-ne v5, v4, :cond_1c

    invoke-virtual {v3, v9}, Lcom/daaw/ik5;->f(I)V

    invoke-virtual {v3}, Lcom/daaw/ik5;->m()I

    move-result v4

    invoke-static {v4}, Lcom/daaw/ca2;->g(I)I

    move-result v4

    if-eqz v4, :cond_19

    goto :goto_e

    :cond_19
    const/4 v4, 0x4

    invoke-virtual {v3, v4}, Lcom/daaw/ik5;->g(I)V

    :cond_1a
    invoke-virtual {v3}, Lcom/daaw/ik5;->i()I

    move-result v4

    if-lez v4, :cond_1b

    invoke-virtual {v3}, Lcom/daaw/ik5;->m()I

    move-result v4

    invoke-static {v4}, Lcom/daaw/ca2;->g(I)I

    move-result v4

    if-eqz v4, :cond_1a

    goto :goto_e

    :cond_1b
    const/4 v4, 0x0

    :goto_e
    iput v4, v0, Lcom/daaw/ca2;->v:I

    goto :goto_f

    :cond_1c
    iget-object v4, v0, Lcom/daaw/ca2;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1e

    iget-object v4, v0, Lcom/daaw/ca2;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/a92;

    new-instance v5, Lcom/daaw/b92;

    iget v6, v0, Lcom/daaw/ca2;->i:I

    invoke-direct {v5, v6, v3}, Lcom/daaw/b92;-><init>(ILcom/daaw/ik5;)V

    invoke-virtual {v4, v5}, Lcom/daaw/a92;->f(Lcom/daaw/b92;)V

    goto :goto_f

    :cond_1d
    const-wide/32 v3, 0x40000

    cmp-long v9, v5, v3

    if-gez v9, :cond_1f

    long-to-int v3, v5

    invoke-interface {v1, v3}, Lcom/daaw/k09;->u(I)V

    :cond_1e
    :goto_f
    const/4 v11, 0x0

    goto :goto_10

    :cond_1f
    invoke-interface/range {p1 .. p1}, Lcom/daaw/k09;->zzf()J

    move-result-wide v3

    add-long/2addr v3, v5

    iput-wide v3, v2, Lcom/daaw/f42;->a:J

    const/4 v11, 0x1

    :goto_10
    invoke-virtual {v0, v7, v8}, Lcom/daaw/ca2;->k(J)V

    if-eqz v11, :cond_0

    iget v3, v0, Lcom/daaw/ca2;->h:I

    const/4 v4, 0x2

    if-eq v3, v4, :cond_0

    const/4 v3, 0x1

    return v3

    :cond_20
    const/4 v3, 0x1

    iget v5, v0, Lcom/daaw/ca2;->k:I

    if-nez v5, :cond_22

    iget-object v5, v0, Lcom/daaw/ca2;->d:Lcom/daaw/ik5;

    invoke-virtual {v5}, Lcom/daaw/ik5;->h()[B

    move-result-object v5

    const/4 v8, 0x0

    invoke-interface {v1, v5, v8, v9, v3}, Lcom/daaw/k09;->e([BIIZ)Z

    move-result v5

    if-nez v5, :cond_21

    const/4 v3, -0x1

    return v3

    :cond_21
    iput v9, v0, Lcom/daaw/ca2;->k:I

    iget-object v3, v0, Lcom/daaw/ca2;->d:Lcom/daaw/ik5;

    invoke-virtual {v3, v8}, Lcom/daaw/ik5;->f(I)V

    iget-object v3, v0, Lcom/daaw/ca2;->d:Lcom/daaw/ik5;

    invoke-virtual {v3}, Lcom/daaw/ik5;->A()J

    move-result-wide v10

    iput-wide v10, v0, Lcom/daaw/ca2;->j:J

    iget-object v3, v0, Lcom/daaw/ca2;->d:Lcom/daaw/ik5;

    invoke-virtual {v3}, Lcom/daaw/ik5;->m()I

    move-result v3

    iput v3, v0, Lcom/daaw/ca2;->i:I

    :cond_22
    iget-wide v10, v0, Lcom/daaw/ca2;->j:J

    const-wide/16 v12, 0x1

    cmp-long v3, v10, v12

    if-nez v3, :cond_23

    iget-object v3, v0, Lcom/daaw/ca2;->d:Lcom/daaw/ik5;

    invoke-virtual {v3}, Lcom/daaw/ik5;->h()[B

    move-result-object v3

    invoke-interface {v1, v3, v9, v9}, Lcom/daaw/k09;->i([BII)V

    iget v3, v0, Lcom/daaw/ca2;->k:I

    add-int/2addr v3, v9

    iput v3, v0, Lcom/daaw/ca2;->k:I

    iget-object v3, v0, Lcom/daaw/ca2;->d:Lcom/daaw/ik5;

    invoke-virtual {v3}, Lcom/daaw/ik5;->B()J

    move-result-wide v5

    :goto_11
    iput-wide v5, v0, Lcom/daaw/ca2;->j:J

    goto :goto_13

    :cond_23
    cmp-long v3, v10, v6

    if-nez v3, :cond_26

    invoke-interface/range {p1 .. p1}, Lcom/daaw/k09;->zzd()J

    move-result-wide v5

    const-wide/16 v7, -0x1

    cmp-long v3, v5, v7

    if-nez v3, :cond_25

    iget-object v3, v0, Lcom/daaw/ca2;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/a92;

    if-eqz v3, :cond_24

    iget-wide v5, v3, Lcom/daaw/a92;->b:J

    goto :goto_12

    :cond_24
    move-wide v5, v7

    :cond_25
    :goto_12
    cmp-long v3, v5, v7

    if-eqz v3, :cond_26

    invoke-interface/range {p1 .. p1}, Lcom/daaw/k09;->zzf()J

    move-result-wide v7

    sub-long/2addr v5, v7

    iget v3, v0, Lcom/daaw/ca2;->k:I

    int-to-long v7, v3

    add-long/2addr v5, v7

    goto :goto_11

    :cond_26
    :goto_13
    iget-wide v5, v0, Lcom/daaw/ca2;->j:J

    iget v3, v0, Lcom/daaw/ca2;->k:I

    int-to-long v7, v3

    cmp-long v10, v5, v7

    if-ltz v10, :cond_30

    iget v5, v0, Lcom/daaw/ca2;->i:I

    const v6, 0x6d6f6f76

    const v7, 0x6d657461

    if-eq v5, v6, :cond_2d

    const v6, 0x7472616b

    if-eq v5, v6, :cond_2d

    const v6, 0x6d646961

    if-eq v5, v6, :cond_2d

    const v6, 0x6d696e66

    if-eq v5, v6, :cond_2d

    const v6, 0x7374626c

    if-eq v5, v6, :cond_2d

    const v6, 0x65647473

    if-eq v5, v6, :cond_2d

    if-ne v5, v7, :cond_27

    goto/16 :goto_18

    :cond_27
    const v6, 0x6d646864

    if-eq v5, v6, :cond_2a

    const v6, 0x6d766864

    if-eq v5, v6, :cond_2a

    const v6, 0x68646c72    # 4.3148E24f

    if-eq v5, v6, :cond_2a

    const v6, 0x73747364

    if-eq v5, v6, :cond_2a

    const v6, 0x73747473

    if-eq v5, v6, :cond_2a

    const v6, 0x73747373

    if-eq v5, v6, :cond_2a

    const v6, 0x63747473

    if-eq v5, v6, :cond_2a

    const v6, 0x656c7374

    if-eq v5, v6, :cond_2a

    const v6, 0x73747363

    if-eq v5, v6, :cond_2a

    const v6, 0x7374737a

    if-eq v5, v6, :cond_2a

    const v6, 0x73747a32

    if-eq v5, v6, :cond_2a

    const v6, 0x7374636f

    if-eq v5, v6, :cond_2a

    const v6, 0x636f3634

    if-eq v5, v6, :cond_2a

    const v6, 0x746b6864

    if-eq v5, v6, :cond_2a

    if-eq v5, v4, :cond_2a

    const v4, 0x75647461

    if-eq v5, v4, :cond_2a

    const v4, 0x6b657973

    if-eq v5, v4, :cond_2a

    const v4, 0x696c7374

    if-ne v5, v4, :cond_28

    goto :goto_14

    :cond_28
    invoke-interface/range {p1 .. p1}, Lcom/daaw/k09;->zzf()J

    move-result-wide v3

    iget v5, v0, Lcom/daaw/ca2;->k:I

    int-to-long v5, v5

    sub-long v10, v3, v5

    iget v3, v0, Lcom/daaw/ca2;->i:I

    const v4, 0x6d707664

    if-ne v3, v4, :cond_29

    new-instance v3, Lcom/google/android/gms/internal/ads/zzadu;

    const-wide/16 v8, 0x0

    add-long v14, v10, v5

    iget-wide v12, v0, Lcom/daaw/ca2;->j:J

    sub-long v5, v12, v5

    move-object v7, v3

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    move-wide/from16 v16, v5

    invoke-direct/range {v7 .. v17}, Lcom/google/android/gms/internal/ads/zzadu;-><init>(JJJJJ)V

    iput-object v3, v0, Lcom/daaw/ca2;->w:Lcom/google/android/gms/internal/ads/zzadu;

    :cond_29
    const/4 v3, 0x0

    goto :goto_17

    :cond_2a
    :goto_14
    if-ne v3, v9, :cond_2b

    const/4 v3, 0x1

    goto :goto_15

    :cond_2b
    const/4 v3, 0x0

    :goto_15
    invoke-static {v3}, Lcom/daaw/uo4;->f(Z)V

    iget-wide v3, v0, Lcom/daaw/ca2;->j:J

    const-wide/32 v5, 0x7fffffff

    cmp-long v7, v3, v5

    if-gtz v7, :cond_2c

    const/4 v3, 0x1

    goto :goto_16

    :cond_2c
    const/4 v3, 0x0

    :goto_16
    invoke-static {v3}, Lcom/daaw/uo4;->f(Z)V

    new-instance v3, Lcom/daaw/ik5;

    iget-wide v4, v0, Lcom/daaw/ca2;->j:J

    long-to-int v5, v4

    invoke-direct {v3, v5}, Lcom/daaw/ik5;-><init>(I)V

    iget-object v4, v0, Lcom/daaw/ca2;->d:Lcom/daaw/ik5;

    invoke-virtual {v4}, Lcom/daaw/ik5;->h()[B

    move-result-object v4

    invoke-virtual {v3}, Lcom/daaw/ik5;->h()[B

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v4, v6, v5, v6, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_17
    iput-object v3, v0, Lcom/daaw/ca2;->l:Lcom/daaw/ik5;

    const/4 v3, 0x1

    iput v3, v0, Lcom/daaw/ca2;->h:I

    goto/16 :goto_0

    :cond_2d
    :goto_18
    invoke-interface/range {p1 .. p1}, Lcom/daaw/k09;->zzf()J

    move-result-wide v3

    iget-wide v5, v0, Lcom/daaw/ca2;->j:J

    iget v8, v0, Lcom/daaw/ca2;->k:I

    int-to-long v10, v8

    add-long/2addr v3, v5

    sub-long/2addr v3, v10

    cmp-long v8, v5, v10

    if-eqz v8, :cond_2e

    iget v5, v0, Lcom/daaw/ca2;->i:I

    if-ne v5, v7, :cond_2e

    iget-object v5, v0, Lcom/daaw/ca2;->c:Lcom/daaw/ik5;

    invoke-virtual {v5, v9}, Lcom/daaw/ik5;->c(I)V

    iget-object v5, v0, Lcom/daaw/ca2;->c:Lcom/daaw/ik5;

    invoke-virtual {v5}, Lcom/daaw/ik5;->h()[B

    move-result-object v5

    const/4 v6, 0x0

    invoke-interface {v1, v5, v6, v9}, Lcom/daaw/k09;->j([BII)V

    iget-object v5, v0, Lcom/daaw/ca2;->c:Lcom/daaw/ik5;

    invoke-static {v5}, Lcom/daaw/r92;->d(Lcom/daaw/ik5;)V

    iget-object v5, v0, Lcom/daaw/ca2;->c:Lcom/daaw/ik5;

    invoke-virtual {v5}, Lcom/daaw/ik5;->k()I

    move-result v5

    invoke-interface {v1, v5}, Lcom/daaw/k09;->u(I)V

    invoke-interface/range {p1 .. p1}, Lcom/daaw/k09;->zzj()V

    :cond_2e
    iget-object v5, v0, Lcom/daaw/ca2;->e:Ljava/util/ArrayDeque;

    new-instance v6, Lcom/daaw/a92;

    iget v7, v0, Lcom/daaw/ca2;->i:I

    invoke-direct {v6, v7, v3, v4}, Lcom/daaw/a92;-><init>(IJ)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    iget-wide v5, v0, Lcom/daaw/ca2;->j:J

    iget v7, v0, Lcom/daaw/ca2;->k:I

    int-to-long v7, v7

    cmp-long v9, v5, v7

    if-nez v9, :cond_2f

    invoke-virtual {v0, v3, v4}, Lcom/daaw/ca2;->k(J)V

    goto/16 :goto_0

    :cond_2f
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ca2;->j()V

    goto/16 :goto_0

    :cond_30
    const-string v1, "Atom size less than header length (unsupported)."

    invoke-static {v1}, Lcom/daaw/dl3;->c(Ljava/lang/String;)Lcom/daaw/dl3;

    move-result-object v1

    goto :goto_1a

    :goto_19
    throw v1

    :goto_1a
    goto :goto_19
.end method

.method public final f(JJ)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/ca2;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/ca2;->k:I

    const/4 v1, -0x1

    iput v1, p0, Lcom/daaw/ca2;->m:I

    iput v0, p0, Lcom/daaw/ca2;->n:I

    iput v0, p0, Lcom/daaw/ca2;->o:I

    iput v0, p0, Lcom/daaw/ca2;->p:I

    const-wide/16 v2, 0x0

    cmp-long v4, p1, v2

    if-nez v4, :cond_0

    invoke-virtual {p0}, Lcom/daaw/ca2;->j()V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/ca2;->r:[Lcom/daaw/ba2;

    array-length p2, p1

    :goto_0
    if-ge v0, p2, :cond_3

    aget-object v2, p1, v0

    iget-object v3, v2, Lcom/daaw/ba2;->b:Lcom/daaw/ka2;

    invoke-virtual {v3, p3, p4}, Lcom/daaw/ka2;->a(J)I

    move-result v4

    if-ne v4, v1, :cond_1

    invoke-virtual {v3, p3, p4}, Lcom/daaw/ka2;->b(J)I

    move-result v4

    :cond_1
    iput v4, v2, Lcom/daaw/ba2;->e:I

    iget-object v2, v2, Lcom/daaw/ba2;->d:Lcom/daaw/n42;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/daaw/n42;->b()V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final j()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/ca2;->h:I

    iput v0, p0, Lcom/daaw/ca2;->k:I

    return-void
.end method

.method public final k(J)V
    .locals 27

    move-object/from16 v0, p0

    :goto_0
    iget-object v1, v0, Lcom/daaw/ca2;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_19

    iget-object v1, v0, Lcom/daaw/ca2;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/a92;

    iget-wide v3, v1, Lcom/daaw/a92;->b:J

    cmp-long v1, v3, p1

    if-nez v1, :cond_19

    iget-object v1, v0, Lcom/daaw/ca2;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/daaw/a92;

    iget v1, v3, Lcom/daaw/c92;->a:I

    const v4, 0x6d6f6f76

    if-ne v1, v4, :cond_17

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget v4, v0, Lcom/daaw/ca2;->v:I

    const/4 v12, 0x1

    if-ne v4, v12, :cond_0

    const/4 v9, 0x1

    goto :goto_1

    :cond_0
    const/4 v9, 0x0

    :goto_1
    new-instance v13, Lcom/daaw/y09;

    invoke-direct {v13}, Lcom/daaw/y09;-><init>()V

    const v4, 0x75647461

    invoke-virtual {v3, v4}, Lcom/daaw/a92;->d(I)Lcom/daaw/b92;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-static {v4}, Lcom/daaw/r92;->a(Lcom/daaw/b92;)Landroid/util/Pair;

    move-result-object v4

    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Lcom/google/android/gms/internal/ads/zzbq;

    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, Lcom/google/android/gms/internal/ads/zzbq;

    if-eqz v5, :cond_1

    invoke-virtual {v13, v5}, Lcom/daaw/y09;->b(Lcom/google/android/gms/internal/ads/zzbq;)Z

    :cond_1
    move-object v15, v4

    move-object/from16 v16, v5

    goto :goto_2

    :cond_2
    const/4 v15, 0x0

    const/16 v16, 0x0

    :goto_2
    const v4, 0x6d657461

    invoke-virtual {v3, v4}, Lcom/daaw/a92;->c(I)Lcom/daaw/a92;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-static {v4}, Lcom/daaw/r92;->b(Lcom/daaw/a92;)Lcom/google/android/gms/internal/ads/zzbq;

    move-result-object v4

    move-object v10, v4

    goto :goto_3

    :cond_3
    const/4 v10, 0x0

    :goto_3
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v7, 0x0

    const/4 v8, 0x0

    sget-object v17, Lcom/daaw/aa2;->a:Lcom/daaw/aa2;

    move-object v4, v13

    move-object v14, v10

    move-object/from16 v10, v17

    invoke-static/range {v3 .. v10}, Lcom/daaw/r92;->c(Lcom/daaw/a92;Lcom/daaw/y09;JLcom/google/android/gms/internal/ads/zzx;ZZLcom/daaw/ey6;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    move-wide v11, v6

    const/4 v8, 0x0

    const/4 v9, -0x1

    :goto_4
    const-wide/16 v18, 0x0

    if-ge v8, v4, :cond_11

    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v10, v20

    check-cast v10, Lcom/daaw/ka2;

    iget v5, v10, Lcom/daaw/ka2;->b:I

    if-nez v5, :cond_4

    move-object/from16 v22, v3

    move/from16 v24, v4

    const/4 v0, -0x1

    move-object v3, v1

    move-wide v1, v6

    goto/16 :goto_c

    :cond_4
    iget-object v5, v10, Lcom/daaw/ka2;->a:Lcom/daaw/ha2;

    move-object/from16 v22, v3

    iget-wide v2, v5, Lcom/daaw/ha2;->e:J

    cmp-long v23, v2, v6

    if-eqz v23, :cond_5

    goto :goto_5

    :cond_5
    iget-wide v2, v10, Lcom/daaw/ka2;->h:J

    :goto_5
    invoke-static {v11, v12, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    new-instance v6, Lcom/daaw/ba2;

    iget-object v7, v0, Lcom/daaw/ca2;->q:Lcom/daaw/m09;

    move/from16 v24, v4

    iget v4, v5, Lcom/daaw/ha2;->b:I

    invoke-interface {v7, v8, v4}, Lcom/daaw/m09;->n(II)Lcom/daaw/m42;

    move-result-object v4

    invoke-direct {v6, v5, v10, v4}, Lcom/daaw/ba2;-><init>(Lcom/daaw/ha2;Lcom/daaw/ka2;Lcom/daaw/m42;)V

    iget-object v4, v5, Lcom/daaw/ha2;->f:Lcom/daaw/f92;

    iget-object v4, v4, Lcom/daaw/f92;->l:Ljava/lang/String;

    const-string v7, "audio/true-hd"

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    iget v4, v10, Lcom/daaw/ka2;->e:I

    mul-int/lit8 v4, v4, 0x10

    goto :goto_6

    :cond_6
    iget v4, v10, Lcom/daaw/ka2;->e:I

    add-int/lit8 v4, v4, 0x1e

    :goto_6
    iget-object v7, v5, Lcom/daaw/ha2;->f:Lcom/daaw/f92;

    invoke-virtual {v7}, Lcom/daaw/f92;->b()Lcom/daaw/b72;

    move-result-object v7

    invoke-virtual {v7, v4}, Lcom/daaw/b72;->l(I)Lcom/daaw/b72;

    iget v4, v5, Lcom/daaw/ha2;->b:I

    move-wide/from16 v25, v11

    const/4 v11, 0x2

    if-ne v4, v11, :cond_7

    cmp-long v4, v2, v18

    if-lez v4, :cond_7

    iget v4, v10, Lcom/daaw/ka2;->b:I

    const/4 v10, 0x1

    if-le v4, v10, :cond_7

    int-to-float v4, v4

    long-to-float v2, v2

    const v3, 0x49742400    # 1000000.0f

    div-float/2addr v2, v3

    div-float/2addr v4, v2

    invoke-virtual {v7, v4}, Lcom/daaw/b72;->e(F)Lcom/daaw/b72;

    :cond_7
    iget v2, v5, Lcom/daaw/ha2;->b:I

    sget v3, Lcom/daaw/y92;->b:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_8

    invoke-virtual {v13}, Lcom/daaw/y09;->a()Z

    move-result v2

    if-eqz v2, :cond_8

    iget v2, v13, Lcom/daaw/y09;->a:I

    invoke-virtual {v7, v2}, Lcom/daaw/b72;->c(I)Lcom/daaw/b72;

    iget v2, v13, Lcom/daaw/y09;->b:I

    invoke-virtual {v7, v2}, Lcom/daaw/b72;->d(I)Lcom/daaw/b72;

    :cond_8
    iget v2, v5, Lcom/daaw/ha2;->b:I

    const/4 v3, 0x2

    new-array v4, v3, [Lcom/google/android/gms/internal/ads/zzbq;

    const/4 v3, 0x0

    aput-object v15, v4, v3

    iget-object v10, v0, Lcom/daaw/ca2;->g:Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_9

    const/4 v10, 0x0

    goto :goto_7

    :cond_9
    new-instance v10, Lcom/google/android/gms/internal/ads/zzbq;

    iget-object v11, v0, Lcom/daaw/ca2;->g:Ljava/util/List;

    invoke-direct {v10, v11}, Lcom/google/android/gms/internal/ads/zzbq;-><init>(Ljava/util/List;)V

    :goto_7
    const/4 v11, 0x1

    aput-object v10, v4, v11

    new-instance v12, Lcom/google/android/gms/internal/ads/zzbq;

    new-array v10, v3, [Lcom/google/android/gms/internal/ads/zzbp;

    move-object/from16 v21, v1

    move-object v3, v10

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v12, v0, v1, v3}, Lcom/google/android/gms/internal/ads/zzbq;-><init>(J[Lcom/google/android/gms/internal/ads/zzbp;)V

    if-ne v2, v11, :cond_b

    if-eqz v16, :cond_a

    move-object/from16 v12, v16

    :cond_a
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_9

    :cond_b
    const/4 v0, 0x2

    if-ne v2, v0, :cond_a

    if-eqz v14, :cond_a

    const/4 v0, 0x0

    :goto_8
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzbq;->a()I

    move-result v1

    if-ge v0, v1, :cond_a

    invoke-virtual {v14, v0}, Lcom/google/android/gms/internal/ads/zzbq;->b(I)Lcom/google/android/gms/internal/ads/zzbp;

    move-result-object v1

    instance-of v2, v1, Lcom/google/android/gms/internal/ads/zzadr;

    if-eqz v2, :cond_c

    check-cast v1, Lcom/google/android/gms/internal/ads/zzadr;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzadr;->p:Ljava/lang/String;

    const-string v3, "com.android.capture.fps"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    new-instance v12, Lcom/google/android/gms/internal/ads/zzbq;

    const/4 v0, 0x1

    new-array v2, v0, [Lcom/google/android/gms/internal/ads/zzbp;

    const/4 v0, 0x0

    aput-object v1, v2, v0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v12, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzbq;-><init>(J[Lcom/google/android/gms/internal/ads/zzbp;)V

    move-wide v1, v0

    goto :goto_9

    :cond_c
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    :goto_9
    const/4 v0, 0x0

    :goto_a
    const/4 v3, 0x2

    if-ge v0, v3, :cond_d

    aget-object v3, v4, v0

    invoke-virtual {v12, v3}, Lcom/google/android/gms/internal/ads/zzbq;->g(Lcom/google/android/gms/internal/ads/zzbq;)Lcom/google/android/gms/internal/ads/zzbq;

    move-result-object v12

    add-int/lit8 v0, v0, 0x1

    goto :goto_a

    :cond_d
    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/zzbq;->a()I

    move-result v0

    if-lez v0, :cond_e

    invoke-virtual {v7, v12}, Lcom/daaw/b72;->m(Lcom/google/android/gms/internal/ads/zzbq;)Lcom/daaw/b72;

    :cond_e
    iget-object v0, v6, Lcom/daaw/ba2;->c:Lcom/daaw/m42;

    invoke-virtual {v7}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object v3

    invoke-interface {v0, v3}, Lcom/daaw/m42;->f(Lcom/daaw/f92;)V

    iget v0, v5, Lcom/daaw/ha2;->b:I

    const/4 v3, 0x2

    if-ne v0, v3, :cond_f

    const/4 v0, -0x1

    if-ne v9, v0, :cond_10

    invoke-interface/range {v21 .. v21}, Ljava/util/List;->size()I

    move-result v3

    move v9, v3

    goto :goto_b

    :cond_f
    const/4 v0, -0x1

    :cond_10
    :goto_b
    move-object/from16 v3, v21

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-wide/from16 v11, v25

    :goto_c
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v0, p0

    move-wide v6, v1

    move-object v1, v3

    move-object/from16 v3, v22

    move/from16 v4, v24

    goto/16 :goto_4

    :cond_11
    move-object v4, v0

    move-object v3, v1

    const/4 v0, -0x1

    iput v9, v4, Lcom/daaw/ca2;->t:I

    iput-wide v11, v4, Lcom/daaw/ca2;->u:J

    const/4 v1, 0x0

    new-array v2, v1, [Lcom/daaw/ba2;

    invoke-interface {v3, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/daaw/ba2;

    iput-object v1, v4, Lcom/daaw/ca2;->r:[Lcom/daaw/ba2;

    array-length v2, v1

    new-array v3, v2, [[J

    new-array v5, v2, [I

    new-array v6, v2, [J

    new-array v2, v2, [Z

    const/4 v7, 0x0

    :goto_d
    array-length v8, v1

    if-ge v7, v8, :cond_12

    aget-object v8, v1, v7

    iget-object v8, v8, Lcom/daaw/ba2;->b:Lcom/daaw/ka2;

    iget v8, v8, Lcom/daaw/ka2;->b:I

    new-array v8, v8, [J

    aput-object v8, v3, v7

    aget-object v8, v1, v7

    iget-object v8, v8, Lcom/daaw/ba2;->b:Lcom/daaw/ka2;

    iget-object v8, v8, Lcom/daaw/ka2;->f:[J

    const/16 v21, 0x0

    aget-wide v9, v8, v21

    aput-wide v9, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_d

    :cond_12
    const/16 v21, 0x0

    const/4 v7, 0x0

    :goto_e
    array-length v8, v1

    if-ge v7, v8, :cond_16

    const-wide v8, 0x7fffffffffffffffL

    const/4 v10, 0x0

    const/4 v11, -0x1

    :goto_f
    array-length v12, v1

    if-ge v10, v12, :cond_14

    aget-boolean v12, v2, v10

    if-nez v12, :cond_13

    aget-wide v12, v6, v10

    cmp-long v14, v12, v8

    if-gtz v14, :cond_13

    move v11, v10

    move-wide v8, v12

    :cond_13
    add-int/lit8 v10, v10, 0x1

    goto :goto_f

    :cond_14
    aget v8, v5, v11

    aget-object v9, v3, v11

    aput-wide v18, v9, v8

    aget-object v10, v1, v11

    iget-object v10, v10, Lcom/daaw/ba2;->b:Lcom/daaw/ka2;

    iget-object v12, v10, Lcom/daaw/ka2;->d:[I

    aget v12, v12, v8

    int-to-long v12, v12

    add-long v18, v18, v12

    const/4 v12, 0x1

    add-int/2addr v8, v12

    aput v8, v5, v11

    array-length v9, v9

    if-ge v8, v9, :cond_15

    iget-object v9, v10, Lcom/daaw/ka2;->f:[J

    aget-wide v8, v9, v8

    aput-wide v8, v6, v11

    goto :goto_e

    :cond_15
    aput-boolean v12, v2, v11

    add-int/lit8 v7, v7, 0x1

    goto :goto_e

    :cond_16
    iput-object v3, v4, Lcom/daaw/ca2;->s:[[J

    iget-object v0, v4, Lcom/daaw/ca2;->q:Lcom/daaw/m09;

    invoke-interface {v0}, Lcom/daaw/m09;->zzC()V

    iget-object v0, v4, Lcom/daaw/ca2;->q:Lcom/daaw/m09;

    invoke-interface {v0, v4}, Lcom/daaw/m09;->i(Lcom/daaw/i42;)V

    iget-object v0, v4, Lcom/daaw/ca2;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    const/4 v0, 0x2

    iput v0, v4, Lcom/daaw/ca2;->h:I

    goto :goto_10

    :cond_17
    move-object v4, v0

    iget-object v0, v4, Lcom/daaw/ca2;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_18

    iget-object v0, v4, Lcom/daaw/ca2;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/a92;

    invoke-virtual {v0, v3}, Lcom/daaw/a92;->e(Lcom/daaw/a92;)V

    :cond_18
    :goto_10
    move-object v0, v4

    goto/16 :goto_0

    :cond_19
    move-object v4, v0

    iget v0, v4, Lcom/daaw/ca2;->h:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1a

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ca2;->j()V

    :cond_1a
    return-void
.end method

.method public final zze()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/ca2;->u:J

    return-wide v0
.end method

.method public final zzh()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
