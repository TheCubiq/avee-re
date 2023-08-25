.class public final Lcom/daaw/au7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/cv7;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/cv7<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final q:[I

.field public static final r:Lsun/misc/Unsafe;


# instance fields
.field public final a:[I

.field public final b:[Ljava/lang/Object;

.field public final c:I

.field public final d:I

.field public final e:Lcom/daaw/xt7;

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:[I

.field public final j:I

.field public final k:I

.field public final l:Lcom/daaw/lt7;

.field public final m:Lcom/daaw/tv7;

.field public final n:Lcom/daaw/wr7;

.field public final o:Lcom/daaw/cu7;

.field public final p:Lcom/daaw/st7;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Lcom/daaw/au7;->q:[I

    invoke-static {}, Lcom/daaw/gw7;->q()Lsun/misc/Unsafe;

    move-result-object v0

    sput-object v0, Lcom/daaw/au7;->r:Lsun/misc/Unsafe;

    return-void
.end method

.method public constructor <init>([I[Ljava/lang/Object;IILcom/daaw/xt7;ZZ[IIILcom/daaw/cu7;Lcom/daaw/lt7;Lcom/daaw/tv7;Lcom/daaw/wr7;Lcom/daaw/st7;[B)V
    .locals 5

    move-object v0, p0

    move-object v1, p5

    move-object/from16 v2, p14

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v3, p1

    iput-object v3, v0, Lcom/daaw/au7;->a:[I

    move-object v3, p2

    iput-object v3, v0, Lcom/daaw/au7;->b:[Ljava/lang/Object;

    move v3, p3

    iput v3, v0, Lcom/daaw/au7;->c:I

    move v3, p4

    iput v3, v0, Lcom/daaw/au7;->d:I

    instance-of v3, v1, Lcom/daaw/ls7;

    iput-boolean v3, v0, Lcom/daaw/au7;->g:Z

    move v3, p6

    iput-boolean v3, v0, Lcom/daaw/au7;->h:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2, p5}, Lcom/daaw/wr7;->h(Lcom/daaw/xt7;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v3, 0x1

    :cond_0
    iput-boolean v3, v0, Lcom/daaw/au7;->f:Z

    move-object v3, p8

    iput-object v3, v0, Lcom/daaw/au7;->i:[I

    move v3, p9

    iput v3, v0, Lcom/daaw/au7;->j:I

    move v3, p10

    iput v3, v0, Lcom/daaw/au7;->k:I

    move-object/from16 v3, p11

    iput-object v3, v0, Lcom/daaw/au7;->o:Lcom/daaw/cu7;

    move-object/from16 v3, p12

    iput-object v3, v0, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    move-object/from16 v3, p13

    iput-object v3, v0, Lcom/daaw/au7;->m:Lcom/daaw/tv7;

    iput-object v2, v0, Lcom/daaw/au7;->n:Lcom/daaw/wr7;

    iput-object v1, v0, Lcom/daaw/au7;->e:Lcom/daaw/xt7;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/daaw/au7;->p:Lcom/daaw/st7;

    return-void
.end method

.method public static C(I)Z
    .locals 1

    const/high16 v0, 0x20000000

    and-int/2addr p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static F(Ljava/lang/Object;ILcom/daaw/cv7;)Z
    .locals 2

    const v0, 0xfffff

    and-int/2addr p1, v0

    int-to-long v0, p1

    invoke-static {p0, v0, v1}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, Lcom/daaw/cv7;->c(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static G(Ljava/lang/Object;)Z
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    instance-of v0, p0, Lcom/daaw/ls7;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/daaw/ls7;

    invoke-virtual {p0}, Lcom/daaw/ls7;->F()Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static I(Ljava/lang/Object;J)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final L(ILjava/lang/Object;Lcom/daaw/rr7;)V
    .locals 1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p2, p0, p1}, Lcom/daaw/rr7;->f(ILjava/lang/String;)V

    return-void

    :cond_0
    check-cast p1, Lcom/daaw/yq7;

    invoke-virtual {p2, p0, p1}, Lcom/daaw/rr7;->o(ILcom/daaw/yq7;)V

    return-void
.end method

.method public static N(Ljava/lang/Object;)Lcom/daaw/uv7;
    .locals 2

    check-cast p0, Lcom/daaw/ls7;

    iget-object v0, p0, Lcom/daaw/ls7;->zzc:Lcom/daaw/uv7;

    invoke-static {}, Lcom/daaw/uv7;->c()Lcom/daaw/uv7;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/daaw/uv7;->f()Lcom/daaw/uv7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ls7;->zzc:Lcom/daaw/uv7;

    :cond_0
    return-object v0
.end method

.method public static O(Ljava/lang/Class;Lcom/daaw/ut7;Lcom/daaw/cu7;Lcom/daaw/lt7;Lcom/daaw/tv7;Lcom/daaw/wr7;Lcom/daaw/st7;)Lcom/daaw/au7;
    .locals 6

    instance-of p0, p1, Lcom/daaw/hu7;

    if-eqz p0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/daaw/hu7;

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-static/range {v0 .. v5}, Lcom/daaw/au7;->P(Lcom/daaw/hu7;Lcom/daaw/cu7;Lcom/daaw/lt7;Lcom/daaw/tv7;Lcom/daaw/wr7;Lcom/daaw/st7;)Lcom/daaw/au7;

    move-result-object p0

    return-object p0

    :cond_0
    check-cast p1, Lcom/daaw/qv7;

    const/4 p0, 0x0

    throw p0
.end method

.method public static P(Lcom/daaw/hu7;Lcom/daaw/cu7;Lcom/daaw/lt7;Lcom/daaw/tv7;Lcom/daaw/wr7;Lcom/daaw/st7;)Lcom/daaw/au7;
    .locals 34

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/hu7;->zzc()I

    move-result v0

    const/4 v1, 0x0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_0

    const/4 v10, 0x1

    goto :goto_0

    :cond_0
    const/4 v10, 0x0

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/hu7;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const v5, 0xd800

    if-lt v4, v5, :cond_1

    const/4 v4, 0x1

    :goto_1
    add-int/lit8 v6, v4, 0x1

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_2

    move v4, v6

    goto :goto_1

    :cond_1
    const/4 v6, 0x1

    :cond_2
    add-int/lit8 v4, v6, 0x1

    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v5, :cond_4

    and-int/lit16 v6, v6, 0x1fff

    const/16 v8, 0xd

    :goto_2
    add-int/lit8 v9, v4, 0x1

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_3

    and-int/lit16 v4, v4, 0x1fff

    shl-int/2addr v4, v8

    or-int/2addr v6, v4

    add-int/lit8 v8, v8, 0xd

    move v4, v9

    goto :goto_2

    :cond_3
    shl-int/2addr v4, v8

    or-int/2addr v6, v4

    move v4, v9

    :cond_4
    if-nez v6, :cond_5

    sget-object v6, Lcom/daaw/au7;->q:[I

    move-object v13, v6

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    goto/16 :goto_b

    :cond_5
    add-int/lit8 v6, v4, 0x1

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_7

    and-int/lit16 v4, v4, 0x1fff

    const/16 v8, 0xd

    :goto_3
    add-int/lit8 v9, v6, 0x1

    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v5, :cond_6

    and-int/lit16 v6, v6, 0x1fff

    shl-int/2addr v6, v8

    or-int/2addr v4, v6

    add-int/lit8 v8, v8, 0xd

    move v6, v9

    goto :goto_3

    :cond_6
    shl-int/2addr v6, v8

    or-int/2addr v4, v6

    move v6, v9

    :cond_7
    add-int/lit8 v8, v6, 0x1

    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v5, :cond_9

    and-int/lit16 v6, v6, 0x1fff

    const/16 v9, 0xd

    :goto_4
    add-int/lit8 v11, v8, 0x1

    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v5, :cond_8

    and-int/lit16 v8, v8, 0x1fff

    shl-int/2addr v8, v9

    or-int/2addr v6, v8

    add-int/lit8 v9, v9, 0xd

    move v8, v11

    goto :goto_4

    :cond_8
    shl-int/2addr v8, v9

    or-int/2addr v6, v8

    move v8, v11

    :cond_9
    add-int/lit8 v9, v8, 0x1

    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v5, :cond_b

    and-int/lit16 v8, v8, 0x1fff

    const/16 v11, 0xd

    :goto_5
    add-int/lit8 v12, v9, 0x1

    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v5, :cond_a

    and-int/lit16 v9, v9, 0x1fff

    shl-int/2addr v9, v11

    or-int/2addr v8, v9

    add-int/lit8 v11, v11, 0xd

    move v9, v12

    goto :goto_5

    :cond_a
    shl-int/2addr v9, v11

    or-int/2addr v8, v9

    move v9, v12

    :cond_b
    add-int/lit8 v11, v9, 0x1

    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v5, :cond_d

    and-int/lit16 v9, v9, 0x1fff

    const/16 v12, 0xd

    :goto_6
    add-int/lit8 v13, v11, 0x1

    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v5, :cond_c

    and-int/lit16 v11, v11, 0x1fff

    shl-int/2addr v11, v12

    or-int/2addr v9, v11

    add-int/lit8 v12, v12, 0xd

    move v11, v13

    goto :goto_6

    :cond_c
    shl-int/2addr v11, v12

    or-int/2addr v9, v11

    move v11, v13

    :cond_d
    add-int/lit8 v12, v11, 0x1

    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v5, :cond_f

    and-int/lit16 v11, v11, 0x1fff

    const/16 v13, 0xd

    :goto_7
    add-int/lit8 v14, v12, 0x1

    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v5, :cond_e

    and-int/lit16 v12, v12, 0x1fff

    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    add-int/lit8 v13, v13, 0xd

    move v12, v14

    goto :goto_7

    :cond_e
    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    move v12, v14

    :cond_f
    add-int/lit8 v13, v12, 0x1

    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v5, :cond_11

    and-int/lit16 v12, v12, 0x1fff

    const/16 v14, 0xd

    :goto_8
    add-int/lit8 v15, v13, 0x1

    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v5, :cond_10

    and-int/lit16 v13, v13, 0x1fff

    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    add-int/lit8 v14, v14, 0xd

    move v13, v15

    goto :goto_8

    :cond_10
    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    move v13, v15

    :cond_11
    add-int/lit8 v14, v13, 0x1

    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v5, :cond_13

    and-int/lit16 v13, v13, 0x1fff

    const/16 v15, 0xd

    :goto_9
    add-int/lit8 v16, v14, 0x1

    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v5, :cond_12

    and-int/lit16 v14, v14, 0x1fff

    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    add-int/lit8 v15, v15, 0xd

    move/from16 v14, v16

    goto :goto_9

    :cond_12
    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    move/from16 v14, v16

    :cond_13
    add-int/lit8 v15, v14, 0x1

    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v5, :cond_15

    and-int/lit16 v14, v14, 0x1fff

    const/16 v16, 0xd

    :goto_a
    add-int/lit8 v17, v15, 0x1

    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-lt v15, v5, :cond_14

    and-int/lit16 v15, v15, 0x1fff

    shl-int v15, v15, v16

    or-int/2addr v14, v15

    add-int/lit8 v16, v16, 0xd

    move/from16 v15, v17

    goto :goto_a

    :cond_14
    shl-int v15, v15, v16

    or-int/2addr v14, v15

    move/from16 v15, v17

    :cond_15
    add-int v16, v14, v12

    add-int v13, v16, v13

    new-array v13, v13, [I

    add-int v16, v4, v4

    add-int v16, v16, v6

    move v6, v4

    move v4, v15

    move/from16 v33, v12

    move v12, v9

    move/from16 v9, v33

    :goto_b
    sget-object v15, Lcom/daaw/au7;->r:Lsun/misc/Unsafe;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/hu7;->b()[Ljava/lang/Object;

    move-result-object v17

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/hu7;->zza()Lcom/daaw/xt7;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    mul-int/lit8 v7, v11, 0x3

    new-array v7, v7, [I

    add-int/2addr v11, v11

    new-array v11, v11, [Ljava/lang/Object;

    add-int v21, v14, v9

    move/from16 v22, v14

    move/from16 v23, v21

    const/4 v9, 0x0

    const/16 v20, 0x0

    :goto_c
    if-ge v4, v3, :cond_32

    add-int/lit8 v24, v4, 0x1

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_17

    and-int/lit16 v4, v4, 0x1fff

    move/from16 v2, v24

    const/16 v24, 0xd

    :goto_d
    add-int/lit8 v26, v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-lt v2, v5, :cond_16

    and-int/lit16 v2, v2, 0x1fff

    shl-int v2, v2, v24

    or-int/2addr v4, v2

    add-int/lit8 v24, v24, 0xd

    move/from16 v2, v26

    goto :goto_d

    :cond_16
    shl-int v2, v2, v24

    or-int/2addr v4, v2

    move/from16 v2, v26

    goto :goto_e

    :cond_17
    move/from16 v2, v24

    :goto_e
    add-int/lit8 v24, v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-lt v2, v5, :cond_19

    and-int/lit16 v2, v2, 0x1fff

    move/from16 v5, v24

    const/16 v24, 0xd

    :goto_f
    add-int/lit8 v27, v5, 0x1

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    move/from16 v28, v3

    const v3, 0xd800

    if-lt v5, v3, :cond_18

    and-int/lit16 v3, v5, 0x1fff

    shl-int v3, v3, v24

    or-int/2addr v2, v3

    add-int/lit8 v24, v24, 0xd

    move/from16 v5, v27

    move/from16 v3, v28

    goto :goto_f

    :cond_18
    shl-int v3, v5, v24

    or-int/2addr v2, v3

    move/from16 v3, v27

    goto :goto_10

    :cond_19
    move/from16 v28, v3

    move/from16 v3, v24

    :goto_10
    and-int/lit16 v5, v2, 0xff

    move/from16 v24, v14

    and-int/lit16 v14, v2, 0x400

    if-eqz v14, :cond_1a

    add-int/lit8 v14, v20, 0x1

    aput v9, v13, v20

    move/from16 v20, v14

    :cond_1a
    const/16 v14, 0x33

    if-lt v5, v14, :cond_22

    add-int/lit8 v14, v3, 0x1

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    move/from16 v27, v14

    const v14, 0xd800

    if-lt v3, v14, :cond_1c

    and-int/lit16 v3, v3, 0x1fff

    move/from16 v14, v27

    const/16 v27, 0xd

    :goto_11
    add-int/lit8 v31, v14, 0x1

    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    move/from16 v32, v12

    const v12, 0xd800

    if-lt v14, v12, :cond_1b

    and-int/lit16 v12, v14, 0x1fff

    shl-int v12, v12, v27

    or-int/2addr v3, v12

    add-int/lit8 v27, v27, 0xd

    move/from16 v14, v31

    move/from16 v12, v32

    goto :goto_11

    :cond_1b
    shl-int v12, v14, v27

    or-int/2addr v3, v12

    move/from16 v14, v31

    goto :goto_12

    :cond_1c
    move/from16 v32, v12

    move/from16 v14, v27

    :goto_12
    add-int/lit8 v12, v5, -0x33

    move/from16 v27, v14

    const/16 v14, 0x9

    if-eq v12, v14, :cond_1e

    const/16 v14, 0x11

    if-ne v12, v14, :cond_1d

    goto :goto_13

    :cond_1d
    const/16 v14, 0xc

    if-ne v12, v14, :cond_1f

    if-nez v10, :cond_1f

    div-int/lit8 v12, v9, 0x3

    add-int/lit8 v14, v16, 0x1

    add-int/2addr v12, v12

    const/16 v25, 0x1

    add-int/lit8 v12, v12, 0x1

    aget-object v16, v17, v16

    aput-object v16, v11, v12

    goto :goto_14

    :cond_1e
    :goto_13
    div-int/lit8 v12, v9, 0x3

    add-int/lit8 v14, v16, 0x1

    add-int/2addr v12, v12

    const/16 v25, 0x1

    add-int/lit8 v12, v12, 0x1

    aget-object v16, v17, v16

    aput-object v16, v11, v12

    :goto_14
    move/from16 v16, v14

    :cond_1f
    add-int/2addr v3, v3

    aget-object v12, v17, v3

    instance-of v14, v12, Ljava/lang/reflect/Field;

    if-eqz v14, :cond_20

    check-cast v12, Ljava/lang/reflect/Field;

    goto :goto_15

    :cond_20
    check-cast v12, Ljava/lang/String;

    invoke-static {v1, v12}, Lcom/daaw/au7;->s(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v12

    aput-object v12, v17, v3

    :goto_15
    move-object/from16 v31, v7

    move v14, v8

    invoke-virtual {v15, v12}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v7

    long-to-int v8, v7

    add-int/lit8 v3, v3, 0x1

    aget-object v7, v17, v3

    instance-of v12, v7, Ljava/lang/reflect/Field;

    if-eqz v12, :cond_21

    check-cast v7, Ljava/lang/reflect/Field;

    goto :goto_16

    :cond_21
    check-cast v7, Ljava/lang/String;

    invoke-static {v1, v7}, Lcom/daaw/au7;->s(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v7

    aput-object v7, v17, v3

    :goto_16
    move v3, v8

    invoke-virtual {v15, v7}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v7

    long-to-int v8, v7

    move-object/from16 v30, v0

    move-object v7, v1

    move v1, v8

    move-object/from16 v29, v11

    const/16 v25, 0x1

    move v8, v3

    const/4 v3, 0x0

    goto/16 :goto_21

    :cond_22
    move-object/from16 v31, v7

    move v14, v8

    move/from16 v32, v12

    add-int/lit8 v7, v16, 0x1

    aget-object v8, v17, v16

    check-cast v8, Ljava/lang/String;

    invoke-static {v1, v8}, Lcom/daaw/au7;->s(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v8

    const/16 v12, 0x9

    if-eq v5, v12, :cond_2a

    const/16 v12, 0x11

    if-ne v5, v12, :cond_23

    goto :goto_1a

    :cond_23
    const/16 v12, 0x1b

    if-eq v5, v12, :cond_29

    const/16 v12, 0x31

    if-ne v5, v12, :cond_24

    goto :goto_18

    :cond_24
    const/16 v12, 0xc

    if-eq v5, v12, :cond_28

    const/16 v12, 0x1e

    if-eq v5, v12, :cond_28

    const/16 v12, 0x2c

    if-ne v5, v12, :cond_25

    goto :goto_17

    :cond_25
    const/16 v12, 0x32

    if-ne v5, v12, :cond_26

    add-int/lit8 v12, v22, 0x1

    aput v9, v13, v22

    div-int/lit8 v22, v9, 0x3

    add-int v22, v22, v22

    add-int/lit8 v27, v7, 0x1

    aget-object v7, v17, v7

    aput-object v7, v11, v22

    and-int/lit16 v7, v2, 0x800

    if-eqz v7, :cond_27

    add-int/lit8 v7, v27, 0x1

    add-int/lit8 v22, v22, 0x1

    aget-object v27, v17, v27

    aput-object v27, v11, v22

    move/from16 v22, v12

    :cond_26
    const/16 v25, 0x1

    goto :goto_1b

    :cond_27
    move/from16 v22, v12

    move/from16 v12, v27

    const/16 v25, 0x1

    goto :goto_1c

    :cond_28
    :goto_17
    if-nez v10, :cond_26

    div-int/lit8 v12, v9, 0x3

    add-int/lit8 v27, v7, 0x1

    add-int/2addr v12, v12

    const/16 v25, 0x1

    add-int/lit8 v12, v12, 0x1

    aget-object v7, v17, v7

    aput-object v7, v11, v12

    goto :goto_19

    :cond_29
    :goto_18
    const/16 v25, 0x1

    div-int/lit8 v12, v9, 0x3

    add-int/lit8 v27, v7, 0x1

    add-int/2addr v12, v12

    add-int/lit8 v12, v12, 0x1

    aget-object v7, v17, v7

    aput-object v7, v11, v12

    :goto_19
    move/from16 v12, v27

    goto :goto_1c

    :cond_2a
    :goto_1a
    const/16 v25, 0x1

    div-int/lit8 v12, v9, 0x3

    add-int/2addr v12, v12

    add-int/lit8 v12, v12, 0x1

    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v27

    aput-object v27, v11, v12

    :goto_1b
    move v12, v7

    :goto_1c
    invoke-virtual {v15, v8}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v7

    long-to-int v8, v7

    and-int/lit16 v7, v2, 0x1000

    const v27, 0xfffff

    move-object/from16 v29, v11

    const/16 v11, 0x1000

    if-ne v7, v11, :cond_2e

    const/16 v7, 0x11

    if-gt v5, v7, :cond_2e

    add-int/lit8 v7, v3, 0x1

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const v11, 0xd800

    if-lt v3, v11, :cond_2c

    and-int/lit16 v3, v3, 0x1fff

    const/16 v26, 0xd

    :goto_1d
    add-int/lit8 v27, v7, 0x1

    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v11, :cond_2b

    and-int/lit16 v7, v7, 0x1fff

    shl-int v7, v7, v26

    or-int/2addr v3, v7

    add-int/lit8 v26, v26, 0xd

    move/from16 v7, v27

    goto :goto_1d

    :cond_2b
    shl-int v7, v7, v26

    or-int/2addr v3, v7

    goto :goto_1e

    :cond_2c
    move/from16 v27, v7

    :goto_1e
    add-int v7, v6, v6

    div-int/lit8 v26, v3, 0x20

    add-int v7, v7, v26

    aget-object v11, v17, v7

    move-object/from16 v30, v0

    instance-of v0, v11, Ljava/lang/reflect/Field;

    if-eqz v0, :cond_2d

    check-cast v11, Ljava/lang/reflect/Field;

    goto :goto_1f

    :cond_2d
    check-cast v11, Ljava/lang/String;

    invoke-static {v1, v11}, Lcom/daaw/au7;->s(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v11

    aput-object v11, v17, v7

    :goto_1f
    move-object v7, v1

    invoke-virtual {v15, v11}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    long-to-int v1, v0

    rem-int/lit8 v3, v3, 0x20

    goto :goto_20

    :cond_2e
    move-object/from16 v30, v0

    move-object v7, v1

    move/from16 v27, v3

    const v1, 0xfffff

    const/4 v3, 0x0

    :goto_20
    const/16 v0, 0x12

    if-lt v5, v0, :cond_2f

    const/16 v0, 0x31

    if-gt v5, v0, :cond_2f

    add-int/lit8 v0, v23, 0x1

    aput v8, v13, v23

    move/from16 v23, v0

    :cond_2f
    move/from16 v16, v12

    :goto_21
    add-int/lit8 v0, v9, 0x1

    aput v4, v31, v9

    add-int/lit8 v4, v0, 0x1

    and-int/lit16 v9, v2, 0x200

    if-eqz v9, :cond_30

    const/high16 v9, 0x20000000

    goto :goto_22

    :cond_30
    const/4 v9, 0x0

    :goto_22
    and-int/lit16 v2, v2, 0x100

    if-eqz v2, :cond_31

    const/high16 v2, 0x10000000

    goto :goto_23

    :cond_31
    const/4 v2, 0x0

    :goto_23
    or-int/2addr v2, v9

    shl-int/lit8 v5, v5, 0x14

    or-int/2addr v2, v5

    or-int/2addr v2, v8

    aput v2, v31, v0

    add-int/lit8 v9, v4, 0x1

    shl-int/lit8 v0, v3, 0x14

    or-int/2addr v0, v1

    aput v0, v31, v4

    move-object v1, v7

    move v8, v14

    move/from16 v14, v24

    move/from16 v4, v27

    move/from16 v3, v28

    move-object/from16 v11, v29

    move-object/from16 v0, v30

    move-object/from16 v7, v31

    move/from16 v12, v32

    const v5, 0xd800

    goto/16 :goto_c

    :cond_32
    move-object/from16 v31, v7

    move-object/from16 v29, v11

    move/from16 v32, v12

    move/from16 v24, v14

    move v14, v8

    new-instance v0, Lcom/daaw/au7;

    move-object v4, v0

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/hu7;->zza()Lcom/daaw/xt7;

    move-result-object v9

    const/4 v11, 0x0

    move-object/from16 v1, v29

    const/16 v20, 0x0

    move-object/from16 v5, v31

    move-object v6, v1

    move v7, v14

    move/from16 v8, v32

    move-object v12, v13

    move/from16 v13, v24

    move/from16 v14, v21

    move-object/from16 v15, p1

    move-object/from16 v16, p2

    move-object/from16 v17, p3

    move-object/from16 v18, p4

    move-object/from16 v19, p5

    invoke-direct/range {v4 .. v20}, Lcom/daaw/au7;-><init>([I[Ljava/lang/Object;IILcom/daaw/xt7;ZZ[IIILcom/daaw/cu7;Lcom/daaw/lt7;Lcom/daaw/tv7;Lcom/daaw/wr7;Lcom/daaw/st7;[B)V

    return-object v0
.end method

.method public static Q(Ljava/lang/Object;J)D
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Double;

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p0

    return-wide p0
.end method

.method public static R(Ljava/lang/Object;J)F
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    return p0
.end method

.method public static U(Ljava/lang/Object;J)I
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static j(I)I
    .locals 0

    ushr-int/lit8 p0, p0, 0x14

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public static l(Ljava/lang/Object;J)J
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method public static s(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 5

    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Field "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " not found. Known fields are "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw v1

    :goto_2
    goto :goto_1
.end method

.method public static t(Ljava/lang/Object;)V
    .locals 2

    invoke-static {p0}, Lcom/daaw/au7;->G(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "Mutating immutable message: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final A(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 3

    sget-object v0, Lcom/daaw/au7;->r:Lsun/misc/Unsafe;

    invoke-virtual {p0, p3}, Lcom/daaw/au7;->k(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v0, p1, v1, v2, p4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/au7;->y(Ljava/lang/Object;II)V

    return-void
.end method

.method public final B(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 0

    invoke-virtual {p0, p1, p3}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result p1

    invoke-virtual {p0, p2, p3}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final D(Ljava/lang/Object;I)Z
    .locals 9

    invoke-virtual {p0, p2}, Lcom/daaw/au7;->b0(I)I

    move-result v0

    const v1, 0xfffff

    and-int v2, v0, v1

    int-to-long v2, v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    const-wide/32 v6, 0xfffff

    cmp-long v8, v2, v6

    if-nez v8, :cond_14

    invoke-virtual {p0, p2}, Lcom/daaw/au7;->k(I)I

    move-result p2

    and-int v0, p2, v1

    int-to-long v0, v0

    invoke-static {p2}, Lcom/daaw/au7;->j(I)I

    move-result p2

    const-wide/16 v2, 0x0

    packed-switch p2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    invoke-static {p1, v0, v1}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return v5

    :cond_0
    return v4

    :pswitch_1
    invoke-static {p1, v0, v1}, Lcom/daaw/gw7;->n(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long v0, p1, v2

    if-eqz v0, :cond_1

    return v5

    :cond_1
    return v4

    :pswitch_2
    invoke-static {p1, v0, v1}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_2

    return v5

    :cond_2
    return v4

    :pswitch_3
    invoke-static {p1, v0, v1}, Lcom/daaw/gw7;->n(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long v0, p1, v2

    if-eqz v0, :cond_3

    return v5

    :cond_3
    return v4

    :pswitch_4
    invoke-static {p1, v0, v1}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_4

    return v5

    :cond_4
    return v4

    :pswitch_5
    invoke-static {p1, v0, v1}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_5

    return v5

    :cond_5
    return v4

    :pswitch_6
    invoke-static {p1, v0, v1}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_6

    return v5

    :cond_6
    return v4

    :pswitch_7
    sget-object p2, Lcom/daaw/yq7;->q:Lcom/daaw/yq7;

    invoke-static {p1, v0, v1}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/daaw/yq7;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v5

    :cond_7
    return v4

    :pswitch_8
    invoke-static {p1, v0, v1}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_8

    return v5

    :cond_8
    return v4

    :pswitch_9
    invoke-static {p1, v0, v1}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_a

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_9

    return v5

    :cond_9
    return v4

    :cond_a
    instance-of p2, p1, Lcom/daaw/yq7;

    if-eqz p2, :cond_c

    sget-object p2, Lcom/daaw/yq7;->q:Lcom/daaw/yq7;

    invoke-virtual {p2, p1}, Lcom/daaw/yq7;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v5

    :cond_b
    return v4

    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_a
    invoke-static {p1, v0, v1}, Lcom/daaw/gw7;->H(Ljava/lang/Object;J)Z

    move-result p1

    return p1

    :pswitch_b
    invoke-static {p1, v0, v1}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_d

    return v5

    :cond_d
    return v4

    :pswitch_c
    invoke-static {p1, v0, v1}, Lcom/daaw/gw7;->n(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long v0, p1, v2

    if-eqz v0, :cond_e

    return v5

    :cond_e
    return v4

    :pswitch_d
    invoke-static {p1, v0, v1}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_f

    return v5

    :cond_f
    return v4

    :pswitch_e
    invoke-static {p1, v0, v1}, Lcom/daaw/gw7;->n(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long v0, p1, v2

    if-eqz v0, :cond_10

    return v5

    :cond_10
    return v4

    :pswitch_f
    invoke-static {p1, v0, v1}, Lcom/daaw/gw7;->n(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long v0, p1, v2

    if-eqz v0, :cond_11

    return v5

    :cond_11
    return v4

    :pswitch_10
    invoke-static {p1, v0, v1}, Lcom/daaw/gw7;->k(Ljava/lang/Object;J)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    if-eqz p1, :cond_12

    return v5

    :cond_12
    return v4

    :pswitch_11
    invoke-static {p1, v0, v1}, Lcom/daaw/gw7;->j(Ljava/lang/Object;J)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    cmp-long v0, p1, v2

    if-eqz v0, :cond_13

    return v5

    :cond_13
    return v4

    :cond_14
    invoke-static {p1, v2, v3}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result p1

    ushr-int/lit8 p2, v0, 0x14

    shl-int p2, v5, p2

    and-int/2addr p1, p2

    if-eqz p1, :cond_15

    return v5

    :cond_15
    return v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final E(Ljava/lang/Object;IIII)Z
    .locals 1

    const v0, 0xfffff

    if-ne p3, v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result p1

    return p1

    :cond_0
    and-int p1, p4, p5

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final H(Ljava/lang/Object;II)Z
    .locals 2

    invoke-virtual {p0, p3}, Lcom/daaw/au7;->b0(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result p1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final J(Ljava/lang/Object;Lcom/daaw/rr7;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-boolean v3, v0, Lcom/daaw/au7;->f:Z

    if-nez v3, :cond_5

    iget-object v3, v0, Lcom/daaw/au7;->a:[I

    array-length v3, v3

    sget-object v4, Lcom/daaw/au7;->r:Lsun/misc/Unsafe;

    const v5, 0xfffff

    const/4 v7, 0x0

    const/4 v8, 0x0

    const v9, 0xfffff

    :goto_0
    if-ge v7, v3, :cond_4

    invoke-virtual {v0, v7}, Lcom/daaw/au7;->k(I)I

    move-result v10

    iget-object v11, v0, Lcom/daaw/au7;->a:[I

    aget v12, v11, v7

    invoke-static {v10}, Lcom/daaw/au7;->j(I)I

    move-result v13

    const/16 v14, 0x11

    const/4 v15, 0x1

    if-gt v13, v14, :cond_1

    add-int/lit8 v14, v7, 0x2

    aget v11, v11, v14

    and-int v14, v11, v5

    if-eq v14, v9, :cond_0

    int-to-long v8, v14

    invoke-virtual {v4, v1, v8, v9}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v8

    move v9, v14

    :cond_0
    ushr-int/lit8 v11, v11, 0x14

    shl-int v11, v15, v11

    goto :goto_1

    :cond_1
    const/4 v11, 0x0

    :goto_1
    and-int/2addr v10, v5

    int-to-long v5, v10

    packed-switch v13, :pswitch_data_0

    :cond_2
    :goto_2
    const/4 v13, 0x0

    goto/16 :goto_3

    :pswitch_0
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v7}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v6

    invoke-virtual {v2, v12, v5, v6}, Lcom/daaw/rr7;->B(ILjava/lang/Object;Lcom/daaw/cv7;)V

    goto :goto_2

    :pswitch_1
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/au7;->l(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-virtual {v2, v12, v5, v6}, Lcom/daaw/rr7;->c(IJ)V

    goto :goto_2

    :pswitch_2
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/au7;->U(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v2, v12, v5}, Lcom/daaw/rr7;->a(II)V

    goto :goto_2

    :pswitch_3
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/au7;->l(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-virtual {v2, v12, v5, v6}, Lcom/daaw/rr7;->J(IJ)V

    goto :goto_2

    :pswitch_4
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/au7;->U(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v2, v12, v5}, Lcom/daaw/rr7;->H(II)V

    goto :goto_2

    :pswitch_5
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/au7;->U(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v2, v12, v5}, Lcom/daaw/rr7;->t(II)V

    goto :goto_2

    :pswitch_6
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/au7;->U(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v2, v12, v5}, Lcom/daaw/rr7;->h(II)V

    goto :goto_2

    :pswitch_7
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/yq7;

    invoke-virtual {v2, v12, v5}, Lcom/daaw/rr7;->o(ILcom/daaw/yq7;)V

    goto :goto_2

    :pswitch_8
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v7}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v6

    invoke-virtual {v2, v12, v5, v6}, Lcom/daaw/rr7;->G(ILjava/lang/Object;Lcom/daaw/cv7;)V

    goto/16 :goto_2

    :pswitch_9
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v12, v5, v2}, Lcom/daaw/au7;->L(ILjava/lang/Object;Lcom/daaw/rr7;)V

    goto/16 :goto_2

    :pswitch_a
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/au7;->I(Ljava/lang/Object;J)Z

    move-result v5

    invoke-virtual {v2, v12, v5}, Lcom/daaw/rr7;->m(IZ)V

    goto/16 :goto_2

    :pswitch_b
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/au7;->U(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v2, v12, v5}, Lcom/daaw/rr7;->v(II)V

    goto/16 :goto_2

    :pswitch_c
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/au7;->l(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-virtual {v2, v12, v5, v6}, Lcom/daaw/rr7;->x(IJ)V

    goto/16 :goto_2

    :pswitch_d
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/au7;->U(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v2, v12, v5}, Lcom/daaw/rr7;->C(II)V

    goto/16 :goto_2

    :pswitch_e
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/au7;->l(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-virtual {v2, v12, v5, v6}, Lcom/daaw/rr7;->j(IJ)V

    goto/16 :goto_2

    :pswitch_f
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/au7;->l(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-virtual {v2, v12, v5, v6}, Lcom/daaw/rr7;->E(IJ)V

    goto/16 :goto_2

    :pswitch_10
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/au7;->R(Ljava/lang/Object;J)F

    move-result v5

    invoke-virtual {v2, v12, v5}, Lcom/daaw/rr7;->z(IF)V

    goto/16 :goto_2

    :pswitch_11
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/au7;->Q(Ljava/lang/Object;J)D

    move-result-wide v5

    invoke-virtual {v2, v12, v5, v6}, Lcom/daaw/rr7;->q(ID)V

    goto/16 :goto_2

    :pswitch_12
    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v2, v12, v5, v7}, Lcom/daaw/au7;->K(Lcom/daaw/rr7;ILjava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_13
    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-virtual {v0, v7}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v6

    invoke-static {v10, v5, v2, v6}, Lcom/daaw/ev7;->q(ILjava/util/List;Lcom/daaw/rr7;Lcom/daaw/cv7;)V

    goto/16 :goto_2

    :pswitch_14
    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ev7;->x(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_2

    :pswitch_15
    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ev7;->w(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_2

    :pswitch_16
    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ev7;->v(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_2

    :pswitch_17
    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ev7;->u(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_2

    :pswitch_18
    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ev7;->m(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_2

    :pswitch_19
    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ev7;->z(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_2

    :pswitch_1a
    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ev7;->j(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_2

    :pswitch_1b
    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ev7;->n(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_2

    :pswitch_1c
    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ev7;->o(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_2

    :pswitch_1d
    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ev7;->r(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_2

    :pswitch_1e
    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ev7;->B(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_2

    :pswitch_1f
    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ev7;->s(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_2

    :pswitch_20
    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ev7;->p(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_2

    :pswitch_21
    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ev7;->l(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_2

    :pswitch_22
    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    const/4 v11, 0x0

    invoke-static {v10, v5, v2, v11}, Lcom/daaw/ev7;->x(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_2

    :pswitch_23
    const/4 v11, 0x0

    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v11}, Lcom/daaw/ev7;->w(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_2

    :pswitch_24
    const/4 v11, 0x0

    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v11}, Lcom/daaw/ev7;->v(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_2

    :pswitch_25
    const/4 v11, 0x0

    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v11}, Lcom/daaw/ev7;->u(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_2

    :pswitch_26
    const/4 v11, 0x0

    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v11}, Lcom/daaw/ev7;->m(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_2

    :pswitch_27
    const/4 v11, 0x0

    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v11}, Lcom/daaw/ev7;->z(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_2

    :pswitch_28
    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2}, Lcom/daaw/ev7;->k(ILjava/util/List;Lcom/daaw/rr7;)V

    goto/16 :goto_2

    :pswitch_29
    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-virtual {v0, v7}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v6

    invoke-static {v10, v5, v2, v6}, Lcom/daaw/ev7;->t(ILjava/util/List;Lcom/daaw/rr7;Lcom/daaw/cv7;)V

    goto/16 :goto_2

    :pswitch_2a
    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2}, Lcom/daaw/ev7;->y(ILjava/util/List;Lcom/daaw/rr7;)V

    goto/16 :goto_2

    :pswitch_2b
    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    const/4 v13, 0x0

    invoke-static {v10, v5, v2, v13}, Lcom/daaw/ev7;->j(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_3

    :pswitch_2c
    const/4 v13, 0x0

    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v13}, Lcom/daaw/ev7;->n(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_3

    :pswitch_2d
    const/4 v13, 0x0

    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v13}, Lcom/daaw/ev7;->o(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_3

    :pswitch_2e
    const/4 v13, 0x0

    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v13}, Lcom/daaw/ev7;->r(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_3

    :pswitch_2f
    const/4 v13, 0x0

    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v13}, Lcom/daaw/ev7;->B(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_3

    :pswitch_30
    const/4 v13, 0x0

    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v13}, Lcom/daaw/ev7;->s(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_3

    :pswitch_31
    const/4 v13, 0x0

    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v13}, Lcom/daaw/ev7;->p(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_3

    :pswitch_32
    const/4 v13, 0x0

    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v13}, Lcom/daaw/ev7;->l(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_3

    :pswitch_33
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v7}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v6

    invoke-virtual {v2, v12, v5, v6}, Lcom/daaw/rr7;->B(ILjava/lang/Object;Lcom/daaw/cv7;)V

    goto/16 :goto_3

    :pswitch_34
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-virtual {v2, v12, v5, v6}, Lcom/daaw/rr7;->c(IJ)V

    goto/16 :goto_3

    :pswitch_35
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v2, v12, v5}, Lcom/daaw/rr7;->a(II)V

    goto/16 :goto_3

    :pswitch_36
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-virtual {v2, v12, v5, v6}, Lcom/daaw/rr7;->J(IJ)V

    goto/16 :goto_3

    :pswitch_37
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v2, v12, v5}, Lcom/daaw/rr7;->H(II)V

    goto/16 :goto_3

    :pswitch_38
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v2, v12, v5}, Lcom/daaw/rr7;->t(II)V

    goto/16 :goto_3

    :pswitch_39
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v2, v12, v5}, Lcom/daaw/rr7;->h(II)V

    goto/16 :goto_3

    :pswitch_3a
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/yq7;

    invoke-virtual {v2, v12, v5}, Lcom/daaw/rr7;->o(ILcom/daaw/yq7;)V

    goto/16 :goto_3

    :pswitch_3b
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v7}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v6

    invoke-virtual {v2, v12, v5, v6}, Lcom/daaw/rr7;->G(ILjava/lang/Object;Lcom/daaw/cv7;)V

    goto/16 :goto_3

    :pswitch_3c
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v12, v5, v2}, Lcom/daaw/au7;->L(ILjava/lang/Object;Lcom/daaw/rr7;)V

    goto/16 :goto_3

    :pswitch_3d
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-static {v1, v5, v6}, Lcom/daaw/gw7;->H(Ljava/lang/Object;J)Z

    move-result v5

    invoke-virtual {v2, v12, v5}, Lcom/daaw/rr7;->m(IZ)V

    goto :goto_3

    :pswitch_3e
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v2, v12, v5}, Lcom/daaw/rr7;->v(II)V

    goto :goto_3

    :pswitch_3f
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-virtual {v2, v12, v5, v6}, Lcom/daaw/rr7;->x(IJ)V

    goto :goto_3

    :pswitch_40
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-virtual {v2, v12, v5}, Lcom/daaw/rr7;->C(II)V

    goto :goto_3

    :pswitch_41
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-virtual {v2, v12, v5, v6}, Lcom/daaw/rr7;->j(IJ)V

    goto :goto_3

    :pswitch_42
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-virtual {v2, v12, v5, v6}, Lcom/daaw/rr7;->E(IJ)V

    goto :goto_3

    :pswitch_43
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-static {v1, v5, v6}, Lcom/daaw/gw7;->k(Ljava/lang/Object;J)F

    move-result v5

    invoke-virtual {v2, v12, v5}, Lcom/daaw/rr7;->z(IF)V

    goto :goto_3

    :pswitch_44
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-static {v1, v5, v6}, Lcom/daaw/gw7;->j(Ljava/lang/Object;J)D

    move-result-wide v5

    invoke-virtual {v2, v12, v5, v6}, Lcom/daaw/rr7;->q(ID)V

    :cond_3
    :goto_3
    add-int/lit8 v7, v7, 0x3

    const v5, 0xfffff

    goto/16 :goto_0

    :cond_4
    iget-object v3, v0, Lcom/daaw/au7;->m:Lcom/daaw/tv7;

    invoke-virtual {v3, v1}, Lcom/daaw/tv7;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v3, v1, v2}, Lcom/daaw/tv7;->r(Ljava/lang/Object;Lcom/daaw/rr7;)V

    return-void

    :cond_5
    iget-object v2, v0, Lcom/daaw/au7;->n:Lcom/daaw/wr7;

    invoke-virtual {v2, v1}, Lcom/daaw/wr7;->a(Ljava/lang/Object;)Lcom/daaw/as7;

    const/4 v1, 0x0

    goto :goto_5

    :goto_4
    throw v1

    :goto_5
    goto :goto_4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final K(Lcom/daaw/rr7;ILjava/lang/Object;I)V
    .locals 0

    if-nez p3, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p4}, Lcom/daaw/au7;->p(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/qt7;

    const/4 p1, 0x0

    throw p1
.end method

.method public final M(Ljava/lang/Object;[BIIILcom/daaw/kq7;)I
    .locals 28

    move-object/from16 v15, p0

    move-object/from16 v14, p1

    move-object/from16 v12, p2

    move/from16 v13, p4

    move/from16 v11, p5

    move-object/from16 v9, p6

    invoke-static/range {p1 .. p1}, Lcom/daaw/au7;->t(Ljava/lang/Object;)V

    sget-object v10, Lcom/daaw/au7;->r:Lsun/misc/Unsafe;

    const/16 v16, 0x0

    move/from16 v0, p3

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v5, 0x0

    const v6, 0xfffff

    :goto_0
    if-ge v0, v13, :cond_1b

    add-int/lit8 v1, v0, 0x1

    aget-byte v0, v12, v0

    if-gez v0, :cond_0

    invoke-static {v0, v12, v1, v9}, Lcom/daaw/lq7;->k(I[BILcom/daaw/kq7;)I

    move-result v0

    iget v1, v9, Lcom/daaw/kq7;->a:I

    move v4, v1

    move v1, v0

    goto :goto_1

    :cond_0
    move v4, v0

    :goto_1
    ushr-int/lit8 v0, v4, 0x3

    and-int/lit8 v7, v4, 0x7

    const/4 v8, 0x3

    if-le v0, v2, :cond_1

    div-int/2addr v3, v8

    invoke-virtual {v15, v0, v3}, Lcom/daaw/au7;->a0(II)I

    move-result v2

    goto :goto_2

    :cond_1
    invoke-virtual {v15, v0}, Lcom/daaw/au7;->Z(I)I

    move-result v2

    :goto_2
    const/4 v3, -0x1

    if-ne v2, v3, :cond_2

    move/from16 p3, v0

    move v2, v1

    move v8, v4

    move/from16 v25, v5

    move-object/from16 v27, v10

    move v7, v11

    const/16 v18, -0x1

    const/16 v19, 0x0

    goto/16 :goto_17

    :cond_2
    iget-object v3, v15, Lcom/daaw/au7;->a:[I

    add-int/lit8 v19, v2, 0x1

    aget v8, v3, v19

    invoke-static {v8}, Lcom/daaw/au7;->j(I)I

    move-result v11

    move/from16 v19, v0

    const v17, 0xfffff

    and-int v0, v8, v17

    move/from16 v20, v1

    int-to-long v0, v0

    move-wide/from16 v21, v0

    const/16 v0, 0x11

    if-gt v11, v0, :cond_e

    add-int/lit8 v0, v2, 0x2

    aget v0, v3, v0

    ushr-int/lit8 v3, v0, 0x14

    const/4 v1, 0x1

    shl-int v23, v1, v3

    const v3, 0xfffff

    and-int/2addr v0, v3

    move/from16 v17, v4

    if-eq v0, v6, :cond_4

    if-eq v6, v3, :cond_3

    int-to-long v3, v6

    invoke-virtual {v10, v14, v3, v4, v5}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_3
    int-to-long v3, v0

    invoke-virtual {v10, v14, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    move/from16 v26, v0

    move/from16 v25, v5

    goto :goto_3

    :cond_4
    move/from16 v25, v5

    move/from16 v26, v6

    :goto_3
    const/4 v0, 0x5

    packed-switch v11, :pswitch_data_0

    move v13, v2

    move/from16 v11, v19

    move/from16 v6, v20

    const/4 v0, 0x3

    const/16 v18, -0x1

    const v19, 0xfffff

    if-ne v7, v0, :cond_d

    invoke-virtual {v15, v14, v13}, Lcom/daaw/au7;->q(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v15, v13}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v1

    shl-int/lit8 v0, v11, 0x3

    or-int/lit8 v5, v0, 0x4

    move-object v0, v7

    move-object/from16 v2, p2

    move v3, v6

    move/from16 v4, p4

    move/from16 v8, v17

    move-object/from16 v6, p6

    invoke-static/range {v0 .. v6}, Lcom/daaw/lq7;->n(Ljava/lang/Object;Lcom/daaw/cv7;[BIIILcom/daaw/kq7;)I

    move-result v0

    invoke-virtual {v15, v14, v13, v7}, Lcom/daaw/au7;->z(Ljava/lang/Object;ILjava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_0
    if-nez v7, :cond_5

    move/from16 v1, v20

    invoke-static {v12, v1, v9}, Lcom/daaw/lq7;->m([BILcom/daaw/kq7;)I

    move-result v6

    iget-wide v0, v9, Lcom/daaw/kq7;->b:J

    invoke-static {v0, v1}, Lcom/daaw/jr7;->f(J)J

    move-result-wide v4

    move/from16 v11, v19

    move-wide/from16 v7, v21

    move-object v0, v10

    move-object/from16 v1, p1

    move v13, v2

    const/16 v18, -0x1

    const v19, 0xfffff

    move-wide v2, v7

    move/from16 v8, v17

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    or-int v5, v25, v23

    move v0, v6

    goto/16 :goto_6

    :cond_5
    move v13, v2

    move/from16 v11, v19

    const/16 v18, -0x1

    const v19, 0xfffff

    move/from16 v8, v17

    move/from16 v6, v20

    goto/16 :goto_f

    :pswitch_1
    move v13, v2

    move/from16 v8, v17

    move/from16 v11, v19

    move/from16 v1, v20

    move-wide/from16 v3, v21

    const/16 v18, -0x1

    const v19, 0xfffff

    if-nez v7, :cond_8

    invoke-static {v12, v1, v9}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v0

    iget v1, v9, Lcom/daaw/kq7;->a:I

    invoke-static {v1}, Lcom/daaw/jr7;->e(I)I

    move-result v1

    :cond_6
    :goto_4
    invoke-virtual {v10, v14, v3, v4, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_5

    :pswitch_2
    move v13, v2

    move/from16 v8, v17

    move/from16 v11, v19

    move/from16 v1, v20

    move-wide/from16 v3, v21

    const/16 v18, -0x1

    const v19, 0xfffff

    if-nez v7, :cond_8

    invoke-static {v12, v1, v9}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v0

    iget v1, v9, Lcom/daaw/kq7;->a:I

    invoke-virtual {v15, v13}, Lcom/daaw/au7;->m(I)Lcom/daaw/ps7;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-interface {v2, v1}, Lcom/daaw/ps7;->a(I)Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_4

    :cond_7
    invoke-static/range {p1 .. p1}, Lcom/daaw/au7;->N(Ljava/lang/Object;)Lcom/daaw/uv7;

    move-result-object v2

    int-to-long v3, v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v2, v8, v1}, Lcom/daaw/uv7;->j(ILjava/lang/Object;)V

    move v1, v8

    move v2, v11

    goto/16 :goto_11

    :pswitch_3
    move v13, v2

    move/from16 v8, v17

    move/from16 v11, v19

    move/from16 v1, v20

    move-wide/from16 v3, v21

    const/4 v0, 0x2

    const/16 v18, -0x1

    const v19, 0xfffff

    if-ne v7, v0, :cond_8

    invoke-static {v12, v1, v9}, Lcom/daaw/lq7;->a([BILcom/daaw/kq7;)I

    move-result v0

    iget-object v1, v9, Lcom/daaw/kq7;->c:Ljava/lang/Object;

    invoke-virtual {v10, v14, v3, v4, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_5

    :pswitch_4
    move v13, v2

    move/from16 v8, v17

    move/from16 v11, v19

    move/from16 v1, v20

    const/4 v0, 0x2

    const/16 v18, -0x1

    const v19, 0xfffff

    if-ne v7, v0, :cond_8

    invoke-virtual {v15, v14, v13}, Lcom/daaw/au7;->q(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v15, v13}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v2

    move-object v0, v6

    move v5, v1

    move-object v1, v2

    move-object/from16 v2, p2

    move v3, v5

    move/from16 v4, p4

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lcom/daaw/lq7;->o(Ljava/lang/Object;Lcom/daaw/cv7;[BIILcom/daaw/kq7;)I

    move-result v0

    invoke-virtual {v15, v14, v13, v6}, Lcom/daaw/au7;->z(Ljava/lang/Object;ILjava/lang/Object;)V

    :goto_5
    or-int v5, v25, v23

    :goto_6
    move v1, v8

    goto/16 :goto_a

    :cond_8
    move v6, v1

    goto/16 :goto_f

    :pswitch_5
    move v13, v2

    move/from16 v6, v17

    move/from16 v11, v19

    move/from16 v5, v20

    move-wide/from16 v3, v21

    const/4 v0, 0x2

    const/16 v18, -0x1

    const v19, 0xfffff

    if-ne v7, v0, :cond_b

    const/high16 v0, 0x20000000

    and-int/2addr v0, v8

    if-nez v0, :cond_9

    invoke-static {v12, v5, v9}, Lcom/daaw/lq7;->g([BILcom/daaw/kq7;)I

    move-result v0

    goto :goto_7

    :cond_9
    invoke-static {v12, v5, v9}, Lcom/daaw/lq7;->h([BILcom/daaw/kq7;)I

    move-result v0

    :goto_7
    iget-object v1, v9, Lcom/daaw/kq7;->c:Ljava/lang/Object;

    invoke-virtual {v10, v14, v3, v4, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_9

    :pswitch_6
    move v13, v2

    move/from16 v6, v17

    move/from16 v11, v19

    move/from16 v5, v20

    move-wide/from16 v3, v21

    const/16 v18, -0x1

    const v19, 0xfffff

    if-nez v7, :cond_b

    invoke-static {v12, v5, v9}, Lcom/daaw/lq7;->m([BILcom/daaw/kq7;)I

    move-result v0

    iget-wide v7, v9, Lcom/daaw/kq7;->b:J

    const-wide/16 v20, 0x0

    cmp-long v2, v7, v20

    if-eqz v2, :cond_a

    goto :goto_8

    :cond_a
    const/4 v1, 0x0

    :goto_8
    invoke-static {v14, v3, v4, v1}, Lcom/daaw/gw7;->x(Ljava/lang/Object;JZ)V

    goto :goto_9

    :pswitch_7
    move v13, v2

    move/from16 v6, v17

    move/from16 v11, v19

    move/from16 v5, v20

    move-wide/from16 v3, v21

    const/16 v18, -0x1

    const v19, 0xfffff

    if-ne v7, v0, :cond_b

    invoke-static {v12, v5}, Lcom/daaw/lq7;->b([BI)I

    move-result v0

    invoke-virtual {v10, v14, v3, v4, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v0, v5, 0x4

    :goto_9
    or-int v5, v25, v23

    move v1, v6

    :goto_a
    move v2, v11

    move v3, v13

    goto/16 :goto_12

    :cond_b
    move v8, v6

    move v6, v5

    goto/16 :goto_f

    :pswitch_8
    move v13, v2

    move/from16 v6, v17

    move/from16 v11, v19

    move/from16 v5, v20

    move-wide/from16 v3, v21

    const/16 v18, -0x1

    const v19, 0xfffff

    if-ne v7, v1, :cond_c

    invoke-static {v12, v5}, Lcom/daaw/lq7;->p([BI)J

    move-result-wide v7

    move-object v0, v10

    move-object/from16 v1, p1

    move-wide v2, v3

    move/from16 v17, v6

    move v6, v5

    move-wide v4, v7

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    goto/16 :goto_b

    :cond_c
    move/from16 v17, v6

    move v6, v5

    goto/16 :goto_e

    :pswitch_9
    move v13, v2

    move/from16 v11, v19

    move/from16 v6, v20

    move-wide/from16 v3, v21

    const/16 v18, -0x1

    const v19, 0xfffff

    if-nez v7, :cond_d

    invoke-static {v12, v6, v9}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v0

    iget v1, v9, Lcom/daaw/kq7;->a:I

    invoke-virtual {v10, v14, v3, v4, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_c

    :pswitch_a
    move v13, v2

    move/from16 v11, v19

    move/from16 v6, v20

    move-wide/from16 v3, v21

    const/16 v18, -0x1

    const v19, 0xfffff

    if-nez v7, :cond_d

    invoke-static {v12, v6, v9}, Lcom/daaw/lq7;->m([BILcom/daaw/kq7;)I

    move-result v6

    iget-wide v7, v9, Lcom/daaw/kq7;->b:J

    move-object v0, v10

    move-object/from16 v1, p1

    move-wide v2, v3

    move-wide v4, v7

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    or-int v5, v25, v23

    move v0, v6

    goto :goto_d

    :pswitch_b
    move v13, v2

    move/from16 v11, v19

    move/from16 v6, v20

    move-wide/from16 v3, v21

    const/16 v18, -0x1

    const v19, 0xfffff

    if-ne v7, v0, :cond_d

    invoke-static {v12, v6}, Lcom/daaw/lq7;->b([BI)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v14, v3, v4, v0}, Lcom/daaw/gw7;->A(Ljava/lang/Object;JF)V

    add-int/lit8 v0, v6, 0x4

    goto :goto_c

    :pswitch_c
    move v13, v2

    move/from16 v11, v19

    move/from16 v6, v20

    move-wide/from16 v3, v21

    const/16 v18, -0x1

    const v19, 0xfffff

    if-ne v7, v1, :cond_d

    invoke-static {v12, v6}, Lcom/daaw/lq7;->p([BI)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    invoke-static {v14, v3, v4, v0, v1}, Lcom/daaw/gw7;->z(Ljava/lang/Object;JD)V

    :goto_b
    add-int/lit8 v0, v6, 0x8

    :goto_c
    or-int v5, v25, v23

    :goto_d
    move v2, v11

    move v3, v13

    move/from16 v1, v17

    goto/16 :goto_12

    :cond_d
    :goto_e
    move/from16 v8, v17

    :goto_f
    move/from16 v7, p5

    move v2, v6

    move-object/from16 v27, v10

    move/from16 p3, v11

    move/from16 v19, v13

    goto/16 :goto_16

    :cond_e
    move v13, v2

    move v2, v4

    move/from16 v26, v6

    move/from16 v1, v19

    move/from16 v6, v20

    move-wide/from16 v3, v21

    const/16 v18, -0x1

    const v19, 0xfffff

    const/16 v0, 0x1b

    if-ne v11, v0, :cond_12

    const/4 v0, 0x2

    if-ne v7, v0, :cond_11

    invoke-virtual {v10, v14, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/us7;

    invoke-interface {v0}, Lcom/daaw/us7;->zzc()Z

    move-result v7

    if-nez v7, :cond_10

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v7

    if-nez v7, :cond_f

    const/16 v7, 0xa

    goto :goto_10

    :cond_f
    add-int/2addr v7, v7

    :goto_10
    invoke-interface {v0, v7}, Lcom/daaw/us7;->b(I)Lcom/daaw/us7;

    move-result-object v0

    invoke-virtual {v10, v14, v3, v4, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_10
    move-object v7, v0

    invoke-virtual {v15, v13}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v0

    move v8, v1

    move v1, v2

    move v11, v2

    move-object/from16 v2, p2

    move v3, v6

    move/from16 v4, p4

    move/from16 v25, v5

    move-object v5, v7

    move-object/from16 v6, p6

    invoke-static/range {v0 .. v6}, Lcom/daaw/lq7;->e(Lcom/daaw/cv7;I[BIILcom/daaw/us7;Lcom/daaw/kq7;)I

    move-result v0

    move v2, v8

    move v1, v11

    :goto_11
    move v3, v13

    move/from16 v5, v25

    :goto_12
    move/from16 v6, v26

    move/from16 v13, p4

    move/from16 v11, p5

    goto/16 :goto_0

    :cond_11
    move/from16 v25, v5

    move/from16 p3, v1

    move/from16 v17, v2

    move v15, v6

    move-object/from16 v27, v10

    move/from16 v19, v13

    goto/16 :goto_14

    :cond_12
    move/from16 v25, v5

    move v5, v1

    const/16 v0, 0x31

    if-gt v11, v0, :cond_14

    int-to-long v0, v8

    move-wide/from16 v20, v0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v8, v2

    move-object/from16 v2, p2

    move-wide/from16 v23, v3

    move v3, v6

    move/from16 v4, p4

    move/from16 p3, v5

    move v5, v8

    move v15, v6

    move/from16 v6, p3

    move/from16 v17, v8

    move v8, v13

    move-object/from16 v27, v10

    move-wide/from16 v9, v20

    move/from16 v19, v13

    move-wide/from16 v12, v23

    move-object/from16 v14, p6

    invoke-virtual/range {v0 .. v14}, Lcom/daaw/au7;->Y(Ljava/lang/Object;[BIIIIIIJIJLcom/daaw/kq7;)I

    move-result v0

    if-eq v0, v15, :cond_13

    :goto_13
    move-object/from16 v15, p0

    move-object/from16 v14, p1

    move-object/from16 v12, p2

    move/from16 v2, p3

    move/from16 v13, p4

    move/from16 v11, p5

    move-object/from16 v9, p6

    move/from16 v1, v17

    move/from16 v3, v19

    move/from16 v5, v25

    move/from16 v6, v26

    move-object/from16 v10, v27

    goto/16 :goto_0

    :cond_13
    move/from16 v7, p5

    move v2, v0

    goto :goto_15

    :cond_14
    move/from16 v17, v2

    move-wide/from16 v23, v3

    move/from16 p3, v5

    move v15, v6

    move-object/from16 v27, v10

    move/from16 v19, v13

    const/16 v0, 0x32

    if-ne v11, v0, :cond_16

    const/4 v0, 0x2

    if-ne v7, v0, :cond_15

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v3, v15

    move/from16 v4, p4

    move/from16 v5, v19

    move-wide/from16 v6, v23

    move-object/from16 v8, p6

    invoke-virtual/range {v0 .. v8}, Lcom/daaw/au7;->V(Ljava/lang/Object;[BIIIJLcom/daaw/kq7;)I

    move-result v0

    if-eq v0, v15, :cond_13

    goto :goto_13

    :cond_15
    :goto_14
    move/from16 v7, p5

    move v2, v15

    :goto_15
    move/from16 v8, v17

    :goto_16
    move/from16 v6, v26

    goto :goto_17

    :cond_16
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v3, v15

    move/from16 v4, p4

    move/from16 v5, v17

    move/from16 v6, p3

    move v9, v11

    move-wide/from16 v10, v23

    move/from16 v12, v19

    move-object/from16 v13, p6

    invoke-virtual/range {v0 .. v13}, Lcom/daaw/au7;->W(Ljava/lang/Object;[BIIIIIIIJILcom/daaw/kq7;)I

    move-result v0

    if-eq v0, v15, :cond_13

    goto :goto_13

    :goto_17
    if-ne v8, v7, :cond_17

    if-eqz v7, :cond_17

    move-object/from16 v9, p0

    move-object/from16 v12, p1

    move v0, v6

    move/from16 v5, v25

    const v1, 0xfffff

    move v6, v2

    goto/16 :goto_1a

    :cond_17
    move-object/from16 v9, p0

    iget-boolean v0, v9, Lcom/daaw/au7;->f:Z

    if-eqz v0, :cond_1a

    move-object/from16 v10, p6

    iget-object v0, v10, Lcom/daaw/kq7;->d:Lcom/daaw/vr7;

    sget-object v1, Lcom/daaw/vr7;->c:Lcom/daaw/vr7;

    if-eq v0, v1, :cond_19

    iget-object v1, v9, Lcom/daaw/au7;->e:Lcom/daaw/xt7;

    move/from16 v11, p3

    invoke-virtual {v0, v1, v11}, Lcom/daaw/vr7;->c(Lcom/daaw/xt7;I)Lcom/daaw/ks7;

    move-result-object v0

    if-nez v0, :cond_18

    invoke-static/range {p1 .. p1}, Lcom/daaw/au7;->N(Ljava/lang/Object;)Lcom/daaw/uv7;

    move-result-object v4

    move v0, v8

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lcom/daaw/lq7;->i(I[BIILcom/daaw/uv7;Lcom/daaw/kq7;)I

    move-result v0

    move-object/from16 v12, p1

    goto :goto_19

    :cond_18
    move-object/from16 v12, p1

    move-object v0, v12

    check-cast v0, Lcom/daaw/js7;

    const/4 v0, 0x0

    throw v0

    :cond_19
    move-object/from16 v12, p1

    move/from16 v11, p3

    goto :goto_18

    :cond_1a
    move-object/from16 v12, p1

    move/from16 v11, p3

    move-object/from16 v10, p6

    :goto_18
    invoke-static/range {p1 .. p1}, Lcom/daaw/au7;->N(Ljava/lang/Object;)Lcom/daaw/uv7;

    move-result-object v4

    move v0, v8

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lcom/daaw/lq7;->i(I[BIILcom/daaw/uv7;Lcom/daaw/kq7;)I

    move-result v0

    :goto_19
    move/from16 v13, p4

    move v1, v8

    move-object v15, v9

    move-object v9, v10

    move v2, v11

    move-object v14, v12

    move/from16 v3, v19

    move/from16 v5, v25

    move-object/from16 v10, v27

    move-object/from16 v12, p2

    move v11, v7

    goto/16 :goto_0

    :cond_1b
    move/from16 v25, v5

    move/from16 v26, v6

    move-object/from16 v27, v10

    move v7, v11

    move-object v12, v14

    move-object v9, v15

    move v6, v0

    move v8, v1

    move/from16 v0, v26

    const v1, 0xfffff

    :goto_1a
    if-eq v0, v1, :cond_1c

    int-to-long v0, v0

    move-object/from16 v2, v27

    invoke-virtual {v2, v12, v0, v1, v5}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_1c
    iget v0, v9, Lcom/daaw/au7;->j:I

    move v10, v0

    :goto_1b
    iget v0, v9, Lcom/daaw/au7;->k:I

    if-ge v10, v0, :cond_1d

    iget-object v0, v9, Lcom/daaw/au7;->i:[I

    aget v2, v0, v10

    const/4 v3, 0x0

    iget-object v4, v9, Lcom/daaw/au7;->m:Lcom/daaw/tv7;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v5, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/au7;->o(Ljava/lang/Object;ILjava/lang/Object;Lcom/daaw/tv7;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v10, v10, 0x1

    goto :goto_1b

    :cond_1d
    move/from16 v0, p4

    if-nez v7, :cond_1f

    if-ne v6, v0, :cond_1e

    goto :goto_1c

    :cond_1e
    invoke-static {}, Lcom/daaw/xs7;->g()Lcom/daaw/xs7;

    move-result-object v0

    throw v0

    :cond_1f
    if-gt v6, v0, :cond_20

    if-ne v8, v7, :cond_20

    :goto_1c
    return v6

    :cond_20
    invoke-static {}, Lcom/daaw/xs7;->g()Lcom/daaw/xs7;

    move-result-object v0

    goto :goto_1e

    :goto_1d
    throw v0

    :goto_1e
    goto :goto_1d

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final S(Ljava/lang/Object;)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, Lcom/daaw/au7;->r:Lsun/misc/Unsafe;

    const v3, 0xfffff

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, 0xfffff

    :goto_0
    iget-object v9, v0, Lcom/daaw/au7;->a:[I

    array-length v9, v9

    if-ge v5, v9, :cond_6

    invoke-virtual {v0, v5}, Lcom/daaw/au7;->k(I)I

    move-result v9

    iget-object v10, v0, Lcom/daaw/au7;->a:[I

    aget v11, v10, v5

    invoke-static {v9}, Lcom/daaw/au7;->j(I)I

    move-result v12

    const/16 v13, 0x11

    const/4 v14, 0x1

    if-gt v12, v13, :cond_0

    add-int/lit8 v13, v5, 0x2

    aget v10, v10, v13

    and-int v13, v10, v3

    ushr-int/lit8 v10, v10, 0x14

    shl-int v10, v14, v10

    if-eq v13, v8, :cond_1

    int-to-long v7, v13

    invoke-virtual {v2, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v7

    move v8, v13

    goto :goto_1

    :cond_0
    const/4 v10, 0x0

    :cond_1
    :goto_1
    and-int/2addr v9, v3

    int-to-long v3, v9

    const/16 v9, 0x3f

    packed-switch v12, :pswitch_data_0

    goto/16 :goto_c

    :pswitch_0
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/xt7;

    invoke-virtual {v0, v5}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v4

    invoke-static {v11, v3, v4}, Lcom/daaw/qr7;->F(ILcom/daaw/xt7;Lcom/daaw/cv7;)I

    move-result v3

    goto/16 :goto_b

    :pswitch_1
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-static {v1, v3, v4}, Lcom/daaw/au7;->l(Ljava/lang/Object;J)J

    move-result-wide v3

    shl-int/lit8 v10, v11, 0x3

    invoke-static {v10}, Lcom/daaw/qr7;->f(I)I

    move-result v10

    add-long v11, v3, v3

    shr-long/2addr v3, v9

    xor-long/2addr v3, v11

    invoke-static {v3, v4}, Lcom/daaw/qr7;->g(J)I

    move-result v3

    add-int/2addr v10, v3

    add-int/2addr v6, v10

    goto/16 :goto_c

    :pswitch_2
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-static {v1, v3, v4}, Lcom/daaw/au7;->U(Ljava/lang/Object;J)I

    move-result v3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lcom/daaw/qr7;->f(I)I

    move-result v4

    add-int v9, v3, v3

    shr-int/lit8 v3, v3, 0x1f

    xor-int/2addr v3, v9

    goto :goto_2

    :pswitch_3
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    goto/16 :goto_7

    :pswitch_4
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    goto/16 :goto_6

    :pswitch_5
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    goto/16 :goto_4

    :pswitch_6
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-static {v1, v3, v4}, Lcom/daaw/au7;->U(Ljava/lang/Object;J)I

    move-result v3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lcom/daaw/qr7;->f(I)I

    move-result v4

    :goto_2
    invoke-static {v3}, Lcom/daaw/qr7;->f(I)I

    move-result v3

    goto/16 :goto_9

    :pswitch_7
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    :goto_3
    check-cast v3, Lcom/daaw/yq7;

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lcom/daaw/qr7;->f(I)I

    move-result v4

    invoke-virtual {v3}, Lcom/daaw/yq7;->o()I

    move-result v3

    invoke-static {v3}, Lcom/daaw/qr7;->f(I)I

    move-result v9

    add-int/2addr v9, v3

    add-int/2addr v4, v9

    goto/16 :goto_a

    :pswitch_8
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v5}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v4

    invoke-static {v11, v3, v4}, Lcom/daaw/ev7;->Q(ILjava/lang/Object;Lcom/daaw/cv7;)I

    move-result v3

    goto/16 :goto_b

    :pswitch_9
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lcom/daaw/yq7;

    if-eqz v4, :cond_2

    goto :goto_3

    :cond_2
    check-cast v3, Ljava/lang/String;

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lcom/daaw/qr7;->f(I)I

    move-result v4

    invoke-static {v3}, Lcom/daaw/qr7;->d(Ljava/lang/String;)I

    move-result v3

    goto/16 :goto_9

    :pswitch_a
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, Lcom/daaw/qr7;->f(I)I

    move-result v3

    add-int/2addr v3, v14

    goto/16 :goto_b

    :pswitch_b
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_6

    :pswitch_c
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_7

    :pswitch_d
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    :goto_4
    invoke-static {v1, v3, v4}, Lcom/daaw/au7;->U(Ljava/lang/Object;J)I

    move-result v3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lcom/daaw/qr7;->f(I)I

    move-result v4

    invoke-static {v3}, Lcom/daaw/qr7;->G(I)I

    move-result v3

    goto/16 :goto_9

    :pswitch_e
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    goto :goto_5

    :pswitch_f
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    :goto_5
    invoke-static {v1, v3, v4}, Lcom/daaw/au7;->l(Ljava/lang/Object;J)J

    move-result-wide v3

    shl-int/lit8 v9, v11, 0x3

    invoke-static {v9}, Lcom/daaw/qr7;->f(I)I

    move-result v9

    invoke-static {v3, v4}, Lcom/daaw/qr7;->g(J)I

    move-result v3

    add-int/2addr v9, v3

    add-int/2addr v6, v9

    goto/16 :goto_c

    :pswitch_10
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    :goto_6
    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, Lcom/daaw/qr7;->f(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x4

    goto/16 :goto_b

    :pswitch_11
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    :goto_7
    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, Lcom/daaw/qr7;->f(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x8

    goto/16 :goto_b

    :pswitch_12
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v5}, Lcom/daaw/au7;->p(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v11, v3, v4}, Lcom/daaw/st7;->a(ILjava/lang/Object;Ljava/lang/Object;)I

    goto/16 :goto_c

    :pswitch_13
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {v0, v5}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v4

    invoke-static {v11, v3, v4}, Lcom/daaw/ev7;->L(ILjava/util/List;Lcom/daaw/cv7;)I

    move-result v3

    goto/16 :goto_b

    :pswitch_14
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ev7;->V(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto/16 :goto_8

    :pswitch_15
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ev7;->T(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto/16 :goto_8

    :pswitch_16
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ev7;->K(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto/16 :goto_8

    :pswitch_17
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ev7;->I(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto/16 :goto_8

    :pswitch_18
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ev7;->G(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto/16 :goto_8

    :pswitch_19
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ev7;->Y(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto/16 :goto_8

    :pswitch_1a
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ev7;->D(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto :goto_8

    :pswitch_1b
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ev7;->I(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto :goto_8

    :pswitch_1c
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ev7;->K(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto :goto_8

    :pswitch_1d
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ev7;->N(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto :goto_8

    :pswitch_1e
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ev7;->a0(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto :goto_8

    :pswitch_1f
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ev7;->P(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto :goto_8

    :pswitch_20
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ev7;->I(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto :goto_8

    :pswitch_21
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ev7;->K(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    :goto_8
    invoke-static {v11}, Lcom/daaw/qr7;->e(I)I

    move-result v4

    invoke-static {v3}, Lcom/daaw/qr7;->f(I)I

    move-result v9

    add-int/2addr v4, v9

    :goto_9
    add-int/2addr v4, v3

    :goto_a
    add-int/2addr v6, v4

    goto/16 :goto_c

    :pswitch_22
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const/4 v9, 0x0

    invoke-static {v11, v3, v9}, Lcom/daaw/ev7;->U(ILjava/util/List;Z)I

    move-result v3

    goto :goto_b

    :pswitch_23
    const/4 v9, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v9}, Lcom/daaw/ev7;->S(ILjava/util/List;Z)I

    move-result v3

    goto :goto_b

    :pswitch_24
    const/4 v9, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v9}, Lcom/daaw/ev7;->J(ILjava/util/List;Z)I

    move-result v3

    goto :goto_b

    :pswitch_25
    const/4 v9, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v9}, Lcom/daaw/ev7;->H(ILjava/util/List;Z)I

    move-result v3

    goto :goto_b

    :pswitch_26
    const/4 v9, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v9}, Lcom/daaw/ev7;->F(ILjava/util/List;Z)I

    move-result v3

    goto :goto_b

    :pswitch_27
    const/4 v9, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v9}, Lcom/daaw/ev7;->X(ILjava/util/List;Z)I

    move-result v3

    goto :goto_b

    :pswitch_28
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Lcom/daaw/ev7;->E(ILjava/util/List;)I

    move-result v3

    goto :goto_b

    :pswitch_29
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {v0, v5}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v4

    invoke-static {v11, v3, v4}, Lcom/daaw/ev7;->R(ILjava/util/List;Lcom/daaw/cv7;)I

    move-result v3

    goto :goto_b

    :pswitch_2a
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Lcom/daaw/ev7;->W(ILjava/util/List;)I

    move-result v3

    :goto_b
    add-int/2addr v6, v3

    :cond_3
    :goto_c
    const/4 v12, 0x0

    goto/16 :goto_16

    :pswitch_2b
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const/4 v12, 0x0

    invoke-static {v11, v3, v12}, Lcom/daaw/ev7;->A(ILjava/util/List;Z)I

    move-result v3

    goto :goto_d

    :pswitch_2c
    const/4 v12, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v12}, Lcom/daaw/ev7;->M(ILjava/util/List;Z)I

    move-result v3

    goto :goto_d

    :pswitch_2d
    const/4 v12, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v12}, Lcom/daaw/ev7;->Z(ILjava/util/List;Z)I

    move-result v3

    goto :goto_d

    :pswitch_2e
    const/4 v12, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v12}, Lcom/daaw/ev7;->O(ILjava/util/List;Z)I

    move-result v3

    goto :goto_d

    :pswitch_2f
    const/4 v12, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v12}, Lcom/daaw/ev7;->H(ILjava/util/List;Z)I

    move-result v3

    goto :goto_d

    :pswitch_30
    const/4 v12, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v12}, Lcom/daaw/ev7;->J(ILjava/util/List;Z)I

    move-result v3

    :goto_d
    add-int/2addr v6, v3

    goto/16 :goto_16

    :pswitch_31
    const/4 v12, 0x0

    and-int v9, v7, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/xt7;

    invoke-virtual {v0, v5}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v4

    invoke-static {v11, v3, v4}, Lcom/daaw/qr7;->F(ILcom/daaw/xt7;Lcom/daaw/cv7;)I

    move-result v3

    goto :goto_d

    :pswitch_32
    const/4 v12, 0x0

    and-int/2addr v10, v7

    if-eqz v10, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v3

    shl-int/lit8 v10, v11, 0x3

    invoke-static {v10}, Lcom/daaw/qr7;->f(I)I

    move-result v10

    add-long v14, v3, v3

    shr-long/2addr v3, v9

    xor-long/2addr v3, v14

    invoke-static {v3, v4}, Lcom/daaw/qr7;->g(J)I

    move-result v3

    add-int/2addr v10, v3

    add-int/2addr v6, v10

    goto/16 :goto_16

    :pswitch_33
    const/4 v12, 0x0

    and-int v9, v7, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lcom/daaw/qr7;->f(I)I

    move-result v4

    add-int v9, v3, v3

    shr-int/lit8 v3, v3, 0x1f

    xor-int/2addr v3, v9

    goto :goto_e

    :pswitch_34
    const/4 v12, 0x0

    and-int v3, v7, v10

    if-eqz v3, :cond_5

    goto/16 :goto_15

    :pswitch_35
    const/4 v12, 0x0

    and-int v3, v7, v10

    if-eqz v3, :cond_5

    goto/16 :goto_14

    :pswitch_36
    const/4 v12, 0x0

    and-int v9, v7, v10

    if-eqz v9, :cond_5

    goto/16 :goto_10

    :pswitch_37
    const/4 v12, 0x0

    and-int v9, v7, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lcom/daaw/qr7;->f(I)I

    move-result v4

    :goto_e
    invoke-static {v3}, Lcom/daaw/qr7;->f(I)I

    move-result v3

    goto/16 :goto_11

    :pswitch_38
    const/4 v12, 0x0

    and-int v9, v7, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    :goto_f
    check-cast v3, Lcom/daaw/yq7;

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lcom/daaw/qr7;->f(I)I

    move-result v4

    invoke-virtual {v3}, Lcom/daaw/yq7;->o()I

    move-result v3

    invoke-static {v3}, Lcom/daaw/qr7;->f(I)I

    move-result v9

    add-int/2addr v9, v3

    add-int/2addr v4, v9

    goto :goto_12

    :pswitch_39
    const/4 v12, 0x0

    and-int v9, v7, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v5}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v4

    invoke-static {v11, v3, v4}, Lcom/daaw/ev7;->Q(ILjava/lang/Object;Lcom/daaw/cv7;)I

    move-result v3

    goto/16 :goto_d

    :pswitch_3a
    const/4 v12, 0x0

    and-int v9, v7, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lcom/daaw/yq7;

    if-eqz v4, :cond_4

    goto :goto_f

    :cond_4
    check-cast v3, Ljava/lang/String;

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lcom/daaw/qr7;->f(I)I

    move-result v4

    invoke-static {v3}, Lcom/daaw/qr7;->d(Ljava/lang/String;)I

    move-result v3

    goto :goto_11

    :pswitch_3b
    const/4 v12, 0x0

    and-int v3, v7, v10

    if-eqz v3, :cond_5

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, Lcom/daaw/qr7;->f(I)I

    move-result v3

    add-int/2addr v3, v14

    goto/16 :goto_d

    :pswitch_3c
    const/4 v12, 0x0

    and-int v3, v7, v10

    if-eqz v3, :cond_5

    goto :goto_14

    :pswitch_3d
    const/4 v12, 0x0

    and-int v3, v7, v10

    if-eqz v3, :cond_5

    goto :goto_15

    :pswitch_3e
    const/4 v12, 0x0

    and-int v9, v7, v10

    if-eqz v9, :cond_5

    :goto_10
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lcom/daaw/qr7;->f(I)I

    move-result v4

    invoke-static {v3}, Lcom/daaw/qr7;->G(I)I

    move-result v3

    :goto_11
    add-int/2addr v4, v3

    :goto_12
    add-int/2addr v6, v4

    goto :goto_16

    :pswitch_3f
    const/4 v12, 0x0

    and-int v9, v7, v10

    if-eqz v9, :cond_5

    goto :goto_13

    :pswitch_40
    const/4 v12, 0x0

    and-int v9, v7, v10

    if-eqz v9, :cond_5

    :goto_13
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v3

    shl-int/lit8 v9, v11, 0x3

    invoke-static {v9}, Lcom/daaw/qr7;->f(I)I

    move-result v9

    invoke-static {v3, v4}, Lcom/daaw/qr7;->g(J)I

    move-result v3

    add-int/2addr v9, v3

    add-int/2addr v6, v9

    goto :goto_16

    :pswitch_41
    const/4 v12, 0x0

    and-int v3, v7, v10

    if-eqz v3, :cond_5

    :goto_14
    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, Lcom/daaw/qr7;->f(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x4

    goto/16 :goto_d

    :pswitch_42
    const/4 v12, 0x0

    and-int v3, v7, v10

    if-eqz v3, :cond_5

    :goto_15
    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, Lcom/daaw/qr7;->f(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x8

    goto/16 :goto_d

    :cond_5
    :goto_16
    add-int/lit8 v5, v5, 0x3

    const v3, 0xfffff

    goto/16 :goto_0

    :cond_6
    iget-object v2, v0, Lcom/daaw/au7;->m:Lcom/daaw/tv7;

    invoke-virtual {v2, v1}, Lcom/daaw/tv7;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/tv7;->a(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v6, v2

    iget-boolean v2, v0, Lcom/daaw/au7;->f:Z

    if-nez v2, :cond_7

    return v6

    :cond_7
    iget-object v2, v0, Lcom/daaw/au7;->n:Lcom/daaw/wr7;

    invoke-virtual {v2, v1}, Lcom/daaw/wr7;->a(Ljava/lang/Object;)Lcom/daaw/as7;

    const/4 v1, 0x0

    goto :goto_18

    :goto_17
    throw v1

    :goto_18
    goto :goto_17

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_30
        :pswitch_2f
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final T(Ljava/lang/Object;)I
    .locals 11

    sget-object v0, Lcom/daaw/au7;->r:Lsun/misc/Unsafe;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    iget-object v4, p0, Lcom/daaw/au7;->a:[I

    array-length v4, v4

    if-ge v2, v4, :cond_3

    invoke-virtual {p0, v2}, Lcom/daaw/au7;->k(I)I

    move-result v4

    invoke-static {v4}, Lcom/daaw/au7;->j(I)I

    move-result v5

    iget-object v6, p0, Lcom/daaw/au7;->a:[I

    aget v6, v6, v2

    const v7, 0xfffff

    and-int/2addr v4, v7

    int-to-long v7, v4

    sget-object v4, Lcom/daaw/bs7;->b0:Lcom/daaw/bs7;

    invoke-virtual {v4}, Lcom/daaw/bs7;->zza()I

    move-result v4

    if-lt v5, v4, :cond_0

    sget-object v4, Lcom/daaw/bs7;->o0:Lcom/daaw/bs7;

    invoke-virtual {v4}, Lcom/daaw/bs7;->zza()I

    move-result v4

    if-gt v5, v4, :cond_0

    iget-object v4, p0, Lcom/daaw/au7;->a:[I

    add-int/lit8 v9, v2, 0x2

    aget v4, v4, v9

    :cond_0
    const/16 v4, 0x3f

    packed-switch v5, :pswitch_data_0

    goto/16 :goto_17

    :pswitch_0
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_5

    :pswitch_1
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-static {p1, v7, v8}, Lcom/daaw/au7;->l(Ljava/lang/Object;J)J

    move-result-wide v7

    goto/16 :goto_6

    :pswitch_2
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v7, v8}, Lcom/daaw/au7;->U(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_7

    :pswitch_3
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_16

    :pswitch_4
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_15

    :pswitch_5
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    :pswitch_6
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v7, v8}, Lcom/daaw/au7;->U(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_8

    :pswitch_7
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_a

    :pswitch_8
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_c

    :pswitch_9
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lcom/daaw/yq7;

    if-eqz v5, :cond_1

    goto/16 :goto_d

    :pswitch_a
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_e

    :pswitch_b
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_15

    :pswitch_c
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_16

    :pswitch_d
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_1
    invoke-static {p1, v7, v8}, Lcom/daaw/au7;->U(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_10

    :pswitch_e
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :pswitch_f
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_2
    invoke-static {p1, v7, v8}, Lcom/daaw/au7;->l(Ljava/lang/Object;J)J

    move-result-wide v4

    goto/16 :goto_14

    :pswitch_10
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_15

    :pswitch_11
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_16

    :pswitch_12
    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v2}, Lcom/daaw/au7;->p(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6, v4, v5}, Lcom/daaw/st7;->a(ILjava/lang/Object;Ljava/lang/Object;)I

    goto/16 :goto_17

    :pswitch_13
    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-virtual {p0, v2}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v5

    invoke-static {v6, v4, v5}, Lcom/daaw/ev7;->L(ILjava/util/List;Lcom/daaw/cv7;)I

    move-result v4

    goto/16 :goto_4

    :pswitch_14
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ev7;->V(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto/16 :goto_3

    :pswitch_15
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ev7;->T(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto/16 :goto_3

    :pswitch_16
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ev7;->K(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto/16 :goto_3

    :pswitch_17
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ev7;->I(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto/16 :goto_3

    :pswitch_18
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ev7;->G(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto/16 :goto_3

    :pswitch_19
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ev7;->Y(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto/16 :goto_3

    :pswitch_1a
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ev7;->D(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto :goto_3

    :pswitch_1b
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ev7;->I(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto :goto_3

    :pswitch_1c
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ev7;->K(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto :goto_3

    :pswitch_1d
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ev7;->N(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto :goto_3

    :pswitch_1e
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ev7;->a0(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto :goto_3

    :pswitch_1f
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ev7;->P(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto :goto_3

    :pswitch_20
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ev7;->I(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto :goto_3

    :pswitch_21
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ev7;->K(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    :goto_3
    invoke-static {v6}, Lcom/daaw/qr7;->e(I)I

    move-result v5

    invoke-static {v4}, Lcom/daaw/qr7;->f(I)I

    move-result v6

    add-int/2addr v5, v6

    goto/16 :goto_11

    :pswitch_22
    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lcom/daaw/ev7;->U(ILjava/util/List;Z)I

    move-result v4

    goto/16 :goto_4

    :pswitch_23
    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lcom/daaw/ev7;->S(ILjava/util/List;Z)I

    move-result v4

    goto/16 :goto_4

    :pswitch_24
    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lcom/daaw/ev7;->F(ILjava/util/List;Z)I

    move-result v4

    goto/16 :goto_4

    :pswitch_25
    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lcom/daaw/ev7;->X(ILjava/util/List;Z)I

    move-result v4

    goto :goto_4

    :pswitch_26
    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4}, Lcom/daaw/ev7;->E(ILjava/util/List;)I

    move-result v4

    goto :goto_4

    :pswitch_27
    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-virtual {p0, v2}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v5

    invoke-static {v6, v4, v5}, Lcom/daaw/ev7;->R(ILjava/util/List;Lcom/daaw/cv7;)I

    move-result v4

    goto :goto_4

    :pswitch_28
    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4}, Lcom/daaw/ev7;->W(ILjava/util/List;)I

    move-result v4

    goto :goto_4

    :pswitch_29
    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lcom/daaw/ev7;->A(ILjava/util/List;Z)I

    move-result v4

    goto :goto_4

    :pswitch_2a
    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lcom/daaw/ev7;->M(ILjava/util/List;Z)I

    move-result v4

    goto :goto_4

    :pswitch_2b
    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lcom/daaw/ev7;->Z(ILjava/util/List;Z)I

    move-result v4

    goto :goto_4

    :pswitch_2c
    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lcom/daaw/ev7;->O(ILjava/util/List;Z)I

    move-result v4

    goto :goto_4

    :pswitch_2d
    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lcom/daaw/ev7;->H(ILjava/util/List;Z)I

    move-result v4

    goto :goto_4

    :pswitch_2e
    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lcom/daaw/ev7;->J(ILjava/util/List;Z)I

    move-result v4

    :goto_4
    add-int/2addr v3, v4

    goto/16 :goto_17

    :pswitch_2f
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_5
    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/xt7;

    invoke-virtual {p0, v2}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v5

    invoke-static {v6, v4, v5}, Lcom/daaw/qr7;->F(ILcom/daaw/xt7;Lcom/daaw/cv7;)I

    move-result v4

    goto :goto_4

    :pswitch_30
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->n(Ljava/lang/Object;J)J

    move-result-wide v7

    :goto_6
    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lcom/daaw/qr7;->f(I)I

    move-result v5

    add-long v9, v7, v7

    shr-long v6, v7, v4

    xor-long/2addr v6, v9

    invoke-static {v6, v7}, Lcom/daaw/qr7;->g(J)I

    move-result v4

    goto/16 :goto_11

    :pswitch_31
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v4

    :goto_7
    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lcom/daaw/qr7;->f(I)I

    move-result v5

    add-int v6, v4, v4

    shr-int/lit8 v4, v4, 0x1f

    xor-int/2addr v4, v6

    goto :goto_9

    :pswitch_32
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_16

    :pswitch_33
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_15

    :pswitch_34
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_f

    :pswitch_35
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v4

    :goto_8
    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lcom/daaw/qr7;->f(I)I

    move-result v5

    :goto_9
    invoke-static {v4}, Lcom/daaw/qr7;->f(I)I

    move-result v4

    goto/16 :goto_11

    :pswitch_36
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_a
    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    :goto_b
    check-cast v4, Lcom/daaw/yq7;

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lcom/daaw/qr7;->f(I)I

    move-result v5

    invoke-virtual {v4}, Lcom/daaw/yq7;->o()I

    move-result v4

    invoke-static {v4}, Lcom/daaw/qr7;->f(I)I

    move-result v6

    add-int/2addr v6, v4

    add-int/2addr v5, v6

    goto :goto_12

    :pswitch_37
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_c
    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v2}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v5

    invoke-static {v6, v4, v5}, Lcom/daaw/ev7;->Q(ILjava/lang/Object;Lcom/daaw/cv7;)I

    move-result v4

    goto/16 :goto_4

    :pswitch_38
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lcom/daaw/yq7;

    if-eqz v5, :cond_1

    :goto_d
    goto :goto_b

    :cond_1
    check-cast v4, Ljava/lang/String;

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lcom/daaw/qr7;->f(I)I

    move-result v5

    invoke-static {v4}, Lcom/daaw/qr7;->d(Ljava/lang/String;)I

    move-result v4

    goto :goto_11

    :pswitch_39
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_e
    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lcom/daaw/qr7;->f(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_4

    :pswitch_3a
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_15

    :pswitch_3b
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_16

    :pswitch_3c
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_f
    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v4

    :goto_10
    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lcom/daaw/qr7;->f(I)I

    move-result v5

    invoke-static {v4}, Lcom/daaw/qr7;->G(I)I

    move-result v4

    :goto_11
    add-int/2addr v5, v4

    :goto_12
    add-int/2addr v3, v5

    goto :goto_17

    :pswitch_3d
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_13

    :pswitch_3e
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_13
    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->n(Ljava/lang/Object;J)J

    move-result-wide v4

    :goto_14
    shl-int/lit8 v6, v6, 0x3

    invoke-static {v6}, Lcom/daaw/qr7;->f(I)I

    move-result v6

    invoke-static {v4, v5}, Lcom/daaw/qr7;->g(J)I

    move-result v4

    add-int/2addr v6, v4

    add-int/2addr v3, v6

    goto :goto_17

    :pswitch_3f
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_15
    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lcom/daaw/qr7;->f(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x4

    goto/16 :goto_4

    :pswitch_40
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_16
    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lcom/daaw/qr7;->f(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x8

    goto/16 :goto_4

    :cond_2
    :goto_17
    add-int/lit8 v2, v2, 0x3

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lcom/daaw/au7;->m:Lcom/daaw/tv7;

    invoke-virtual {v0, p1}, Lcom/daaw/tv7;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/tv7;->a(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr v3, p1

    return v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_2e
        :pswitch_2d
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_2d
        :pswitch_2e
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final V(Ljava/lang/Object;[BIIIJLcom/daaw/kq7;)I
    .locals 0

    sget-object p2, Lcom/daaw/au7;->r:Lsun/misc/Unsafe;

    invoke-virtual {p0, p5}, Lcom/daaw/au7;->p(I)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p2, p1, p6, p7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p4

    invoke-static {p4}, Lcom/daaw/st7;->b(Ljava/lang/Object;)Z

    move-result p5

    if-nez p5, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/daaw/rt7;->a()Lcom/daaw/rt7;

    move-result-object p5

    invoke-virtual {p5}, Lcom/daaw/rt7;->b()Lcom/daaw/rt7;

    move-result-object p5

    invoke-static {p5, p4}, Lcom/daaw/st7;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2, p1, p6, p7, p5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    check-cast p3, Lcom/daaw/qt7;

    const/4 p1, 0x0

    throw p1
.end method

.method public final W(Ljava/lang/Object;[BIIIIIIIJILcom/daaw/kq7;)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v2, p5

    move/from16 v9, p6

    move/from16 v3, p7

    move-wide/from16 v6, p10

    move/from16 v10, p12

    move-object/from16 v8, p13

    sget-object v11, Lcom/daaw/au7;->r:Lsun/misc/Unsafe;

    iget-object v12, v0, Lcom/daaw/au7;->a:[I

    add-int/lit8 v13, v10, 0x2

    aget v12, v12, v13

    const v13, 0xfffff

    and-int/2addr v12, v13

    int-to-long v12, v12

    const/4 v14, 0x5

    const/4 v15, 0x2

    packed-switch p9, :pswitch_data_0

    goto/16 :goto_5

    :pswitch_0
    const/4 v6, 0x3

    if-eq v3, v6, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-virtual {v0, v1, v9, v10}, Lcom/daaw/au7;->r(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v0, v10}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v3

    and-int/lit8 v2, v2, -0x8

    or-int/lit8 v7, v2, 0x4

    move-object v2, v11

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v8, p13

    invoke-static/range {v2 .. v8}, Lcom/daaw/lq7;->n(Ljava/lang/Object;Lcom/daaw/cv7;[BIIILcom/daaw/kq7;)I

    move-result v2

    invoke-virtual {v0, v1, v9, v10, v11}, Lcom/daaw/au7;->A(Ljava/lang/Object;IILjava/lang/Object;)V

    return v2

    :pswitch_1
    if-eqz v3, :cond_1

    goto/16 :goto_5

    :cond_1
    invoke-static {v4, v5, v8}, Lcom/daaw/lq7;->m([BILcom/daaw/kq7;)I

    move-result v2

    iget-wide v3, v8, Lcom/daaw/kq7;->b:J

    invoke-static {v3, v4}, Lcom/daaw/jr7;->f(J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v11, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_2
    if-eqz v3, :cond_2

    goto/16 :goto_5

    :cond_2
    invoke-static {v4, v5, v8}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v2

    iget v3, v8, Lcom/daaw/kq7;->a:I

    invoke-static {v3}, Lcom/daaw/jr7;->e(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v11, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_3
    if-nez v3, :cond_11

    invoke-static {v4, v5, v8}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v3

    iget v4, v8, Lcom/daaw/kq7;->a:I

    invoke-virtual {v0, v10}, Lcom/daaw/au7;->m(I)Lcom/daaw/ps7;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-interface {v5, v4}, Lcom/daaw/ps7;->a(I)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Lcom/daaw/au7;->N(Ljava/lang/Object;)Lcom/daaw/uv7;

    move-result-object v1

    int-to-long v4, v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Lcom/daaw/uv7;->j(ILjava/lang/Object;)V

    goto :goto_1

    :cond_4
    :goto_0
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v11, v1, v6, v7, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_1
    move v2, v3

    goto/16 :goto_6

    :pswitch_4
    if-eq v3, v15, :cond_5

    goto/16 :goto_5

    :cond_5
    invoke-static {v4, v5, v8}, Lcom/daaw/lq7;->a([BILcom/daaw/kq7;)I

    move-result v2

    iget-object v3, v8, Lcom/daaw/kq7;->c:Ljava/lang/Object;

    invoke-virtual {v11, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_5
    if-eq v3, v15, :cond_6

    goto/16 :goto_5

    :cond_6
    invoke-virtual {v0, v1, v9, v10}, Lcom/daaw/au7;->r(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v0, v10}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v3

    move-object v2, v11

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v7, p13

    invoke-static/range {v2 .. v7}, Lcom/daaw/lq7;->o(Ljava/lang/Object;Lcom/daaw/cv7;[BIILcom/daaw/kq7;)I

    move-result v2

    invoke-virtual {v0, v1, v9, v10, v11}, Lcom/daaw/au7;->A(Ljava/lang/Object;IILjava/lang/Object;)V

    return v2

    :pswitch_6
    if-ne v3, v15, :cond_11

    invoke-static {v4, v5, v8}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v2

    iget v3, v8, Lcom/daaw/kq7;->a:I

    if-nez v3, :cond_7

    const-string v3, ""

    invoke-virtual {v11, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_3

    :cond_7
    const/high16 v5, 0x20000000

    and-int v5, p8, v5

    if-eqz v5, :cond_9

    add-int v5, v2, v3

    invoke-static {v4, v2, v5}, Lcom/daaw/lw7;->j([BII)Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_2

    :cond_8
    invoke-static {}, Lcom/daaw/xs7;->d()Lcom/daaw/xs7;

    move-result-object v1

    throw v1

    :cond_9
    :goto_2
    new-instance v5, Ljava/lang/String;

    sget-object v8, Lcom/daaw/vs7;->b:Ljava/nio/charset/Charset;

    invoke-direct {v5, v4, v2, v3, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-virtual {v11, v1, v6, v7, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/2addr v2, v3

    :goto_3
    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_6

    :pswitch_7
    if-nez v3, :cond_11

    invoke-static {v4, v5, v8}, Lcom/daaw/lq7;->m([BILcom/daaw/kq7;)I

    move-result v2

    iget-wide v3, v8, Lcom/daaw/kq7;->b:J

    const-wide/16 v14, 0x0

    cmp-long v5, v3, v14

    if-eqz v5, :cond_a

    const/4 v15, 0x1

    goto :goto_4

    :cond_a
    const/4 v15, 0x0

    :goto_4
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v11, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_8
    if-eq v3, v14, :cond_b

    goto/16 :goto_5

    :cond_b
    invoke-static/range {p2 .. p3}, Lcom/daaw/lq7;->b([BI)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v11, v1, v6, v7, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v1, v5, 0x4

    return v1

    :pswitch_9
    const/4 v2, 0x1

    if-eq v3, v2, :cond_c

    goto :goto_5

    :cond_c
    invoke-static/range {p2 .. p3}, Lcom/daaw/lq7;->p([BI)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v11, v1, v6, v7, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v1, v5, 0x8

    return v1

    :pswitch_a
    if-eqz v3, :cond_d

    goto :goto_5

    :cond_d
    invoke-static {v4, v5, v8}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v2

    iget v3, v8, Lcom/daaw/kq7;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v11, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_b
    if-eqz v3, :cond_e

    goto :goto_5

    :cond_e
    invoke-static {v4, v5, v8}, Lcom/daaw/lq7;->m([BILcom/daaw/kq7;)I

    move-result v2

    iget-wide v3, v8, Lcom/daaw/kq7;->b:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v11, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_c
    if-eq v3, v14, :cond_f

    goto :goto_5

    :cond_f
    invoke-static/range {p2 .. p3}, Lcom/daaw/lq7;->b([BI)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v11, v1, v6, v7, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v1, v5, 0x4

    return v1

    :pswitch_d
    const/4 v2, 0x1

    if-eq v3, v2, :cond_10

    goto :goto_5

    :cond_10
    invoke-static/range {p2 .. p3}, Lcom/daaw/lq7;->p([BI)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v11, v1, v6, v7, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v1, v5, 0x8

    return v1

    :cond_11
    :goto_5
    move v2, v5

    :goto_6
    return v2

    :pswitch_data_0
    .packed-switch 0x33
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final X(Ljava/lang/Object;[BIILcom/daaw/kq7;)I
    .locals 30

    move-object/from16 v15, p0

    move-object/from16 v14, p1

    move-object/from16 v12, p2

    move/from16 v13, p4

    move-object/from16 v11, p5

    invoke-static/range {p1 .. p1}, Lcom/daaw/au7;->t(Ljava/lang/Object;)V

    sget-object v9, Lcom/daaw/au7;->r:Lsun/misc/Unsafe;

    const/4 v10, -0x1

    const/16 v16, 0x0

    const v8, 0xfffff

    move/from16 v0, p3

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v6, 0x0

    const v7, 0xfffff

    :goto_0
    if-ge v0, v13, :cond_14

    add-int/lit8 v3, v0, 0x1

    aget-byte v0, v12, v0

    if-gez v0, :cond_0

    invoke-static {v0, v12, v3, v11}, Lcom/daaw/lq7;->k(I[BILcom/daaw/kq7;)I

    move-result v0

    iget v3, v11, Lcom/daaw/kq7;->a:I

    move v4, v0

    move/from16 v17, v3

    goto :goto_1

    :cond_0
    move/from16 v17, v0

    move v4, v3

    :goto_1
    ushr-int/lit8 v5, v17, 0x3

    and-int/lit8 v3, v17, 0x7

    if-le v5, v1, :cond_1

    div-int/lit8 v2, v2, 0x3

    invoke-virtual {v15, v5, v2}, Lcom/daaw/au7;->a0(II)I

    move-result v0

    goto :goto_2

    :cond_1
    invoke-virtual {v15, v5}, Lcom/daaw/au7;->Z(I)I

    move-result v0

    :goto_2
    move v2, v0

    if-ne v2, v10, :cond_2

    move v2, v4

    move/from16 v23, v5

    move-object/from16 v29, v9

    const/4 v15, 0x0

    :goto_3
    const/16 v18, -0x1

    goto/16 :goto_14

    :cond_2
    iget-object v0, v15, Lcom/daaw/au7;->a:[I

    add-int/lit8 v1, v2, 0x1

    aget v1, v0, v1

    invoke-static {v1}, Lcom/daaw/au7;->j(I)I

    move-result v13

    and-int v10, v1, v8

    move-object/from16 v19, v9

    int-to-long v8, v10

    const/16 v10, 0x11

    move/from16 p3, v5

    if-gt v13, v10, :cond_b

    add-int/lit8 v10, v2, 0x2

    aget v0, v0, v10

    ushr-int/lit8 v10, v0, 0x14

    const/4 v5, 0x1

    shl-int v10, v5, v10

    const v15, 0xfffff

    and-int/2addr v0, v15

    move/from16 v22, v1

    move/from16 v20, v2

    if-eq v0, v7, :cond_5

    if-eq v7, v15, :cond_3

    int-to-long v1, v7

    move-object/from16 v7, v19

    invoke-virtual {v7, v14, v1, v2, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_4

    :cond_3
    move-object/from16 v7, v19

    :goto_4
    if-eq v0, v15, :cond_4

    int-to-long v1, v0

    invoke-virtual {v7, v14, v1, v2}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    :cond_4
    move-object v2, v7

    move v7, v0

    goto :goto_5

    :cond_5
    move-object/from16 v2, v19

    :goto_5
    const/4 v0, 0x5

    packed-switch v13, :pswitch_data_0

    move-object/from16 v13, p0

    move/from16 v23, p3

    move/from16 v15, v20

    const v19, 0xfffff

    move/from16 v20, v7

    move-object v7, v2

    goto/16 :goto_f

    :pswitch_0
    if-nez v3, :cond_6

    invoke-static {v12, v4, v11}, Lcom/daaw/lq7;->m([BILcom/daaw/kq7;)I

    move-result v13

    iget-wide v0, v11, Lcom/daaw/kq7;->b:J

    invoke-static {v0, v1}, Lcom/daaw/jr7;->f(J)J

    move-result-wide v4

    move-object v0, v2

    move-object/from16 v1, p1

    move/from16 v15, v20

    move/from16 v20, v7

    move-object v7, v2

    move-wide v2, v8

    move/from16 v23, p3

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    or-int/2addr v6, v10

    move-object v9, v7

    move v0, v13

    move v2, v15

    move/from16 v7, v20

    move/from16 v1, v23

    const v8, 0xfffff

    const/4 v10, -0x1

    move-object/from16 v15, p0

    goto/16 :goto_e

    :cond_6
    move/from16 v23, p3

    move/from16 v15, v20

    move/from16 v20, v7

    move-object v7, v2

    goto/16 :goto_8

    :pswitch_1
    move/from16 v23, p3

    move/from16 v15, v20

    move/from16 v20, v7

    move-object v7, v2

    if-nez v3, :cond_7

    invoke-static {v12, v4, v11}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v0

    iget v1, v11, Lcom/daaw/kq7;->a:I

    invoke-static {v1}, Lcom/daaw/jr7;->e(I)I

    move-result v1

    goto :goto_6

    :pswitch_2
    move/from16 v23, p3

    move/from16 v15, v20

    move/from16 v20, v7

    move-object v7, v2

    if-nez v3, :cond_7

    invoke-static {v12, v4, v11}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v0

    iget v1, v11, Lcom/daaw/kq7;->a:I

    :goto_6
    invoke-virtual {v7, v14, v8, v9, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_7

    :pswitch_3
    move/from16 v23, p3

    move/from16 v15, v20

    const/4 v0, 0x2

    move/from16 v20, v7

    move-object v7, v2

    if-ne v3, v0, :cond_7

    invoke-static {v12, v4, v11}, Lcom/daaw/lq7;->a([BILcom/daaw/kq7;)I

    move-result v0

    iget-object v1, v11, Lcom/daaw/kq7;->c:Ljava/lang/Object;

    invoke-virtual {v7, v14, v8, v9, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_7
    or-int/2addr v6, v10

    move/from16 v13, p4

    move-object v9, v7

    move v2, v15

    move/from16 v7, v20

    move/from16 v1, v23

    goto/16 :goto_16

    :pswitch_4
    move/from16 v23, p3

    move/from16 v15, v20

    const/4 v0, 0x2

    move/from16 v20, v7

    move-object v7, v2

    if-ne v3, v0, :cond_7

    move-object/from16 v13, p0

    const v19, 0xfffff

    invoke-virtual {v13, v14, v15}, Lcom/daaw/au7;->q(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v13, v15}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v1

    move-object v0, v8

    move-object/from16 v2, p2

    move v3, v4

    move/from16 v4, p4

    move-object/from16 v5, p5

    invoke-static/range {v0 .. v5}, Lcom/daaw/lq7;->o(Ljava/lang/Object;Lcom/daaw/cv7;[BIILcom/daaw/kq7;)I

    move-result v0

    invoke-virtual {v13, v14, v15, v8}, Lcom/daaw/au7;->z(Ljava/lang/Object;ILjava/lang/Object;)V

    goto/16 :goto_c

    :cond_7
    :goto_8
    move-object/from16 v13, p0

    const v19, 0xfffff

    goto/16 :goto_f

    :pswitch_5
    move-object/from16 v13, p0

    move/from16 v23, p3

    move/from16 v15, v20

    const/4 v0, 0x2

    const v19, 0xfffff

    move/from16 v20, v7

    move-object v7, v2

    if-ne v3, v0, :cond_a

    const/high16 v0, 0x20000000

    and-int v0, v22, v0

    if-nez v0, :cond_8

    invoke-static {v12, v4, v11}, Lcom/daaw/lq7;->g([BILcom/daaw/kq7;)I

    move-result v0

    goto :goto_9

    :cond_8
    invoke-static {v12, v4, v11}, Lcom/daaw/lq7;->h([BILcom/daaw/kq7;)I

    move-result v0

    :goto_9
    iget-object v1, v11, Lcom/daaw/kq7;->c:Ljava/lang/Object;

    invoke-virtual {v7, v14, v8, v9, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_6
    move-object/from16 v13, p0

    move/from16 v23, p3

    move/from16 v15, v20

    const v19, 0xfffff

    move/from16 v20, v7

    move-object v7, v2

    if-nez v3, :cond_a

    invoke-static {v12, v4, v11}, Lcom/daaw/lq7;->m([BILcom/daaw/kq7;)I

    move-result v0

    iget-wide v1, v11, Lcom/daaw/kq7;->b:J

    const-wide/16 v3, 0x0

    cmp-long v17, v1, v3

    if-eqz v17, :cond_9

    goto :goto_a

    :cond_9
    const/4 v5, 0x0

    :goto_a
    invoke-static {v14, v8, v9, v5}, Lcom/daaw/gw7;->x(Ljava/lang/Object;JZ)V

    goto/16 :goto_c

    :pswitch_7
    move-object/from16 v13, p0

    move/from16 v23, p3

    move/from16 v15, v20

    const v19, 0xfffff

    move/from16 v20, v7

    move-object v7, v2

    if-ne v3, v0, :cond_a

    invoke-static {v12, v4}, Lcom/daaw/lq7;->b([BI)I

    move-result v0

    invoke-virtual {v7, v14, v8, v9, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_b

    :pswitch_8
    move-object/from16 v13, p0

    move/from16 v23, p3

    move/from16 v15, v20

    const v19, 0xfffff

    move/from16 v20, v7

    move-object v7, v2

    if-ne v3, v5, :cond_a

    invoke-static {v12, v4}, Lcom/daaw/lq7;->p([BI)J

    move-result-wide v21

    move-object v0, v7

    move-object/from16 v1, p1

    move-wide v2, v8

    move v8, v4

    move-wide/from16 v4, v21

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    add-int/lit8 v0, v8, 0x8

    goto/16 :goto_c

    :pswitch_9
    move-object/from16 v13, p0

    move/from16 v23, p3

    move/from16 v15, v20

    const v19, 0xfffff

    move/from16 v20, v7

    move-object v7, v2

    if-nez v3, :cond_a

    invoke-static {v12, v4, v11}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v0

    iget v1, v11, Lcom/daaw/kq7;->a:I

    invoke-virtual {v7, v14, v8, v9, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_c

    :pswitch_a
    move-object/from16 v13, p0

    move/from16 v23, p3

    move/from16 v15, v20

    const v19, 0xfffff

    move/from16 v20, v7

    move-object v7, v2

    if-nez v3, :cond_a

    invoke-static {v12, v4, v11}, Lcom/daaw/lq7;->m([BILcom/daaw/kq7;)I

    move-result v17

    iget-wide v4, v11, Lcom/daaw/kq7;->b:J

    move-object v0, v7

    move-object/from16 v1, p1

    move-wide v2, v8

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    or-int/2addr v6, v10

    move-object v9, v7

    move v2, v15

    move/from16 v0, v17

    goto :goto_d

    :pswitch_b
    move-object/from16 v13, p0

    move/from16 v23, p3

    move/from16 v15, v20

    const v19, 0xfffff

    move/from16 v20, v7

    move-object v7, v2

    if-ne v3, v0, :cond_a

    invoke-static {v12, v4}, Lcom/daaw/lq7;->b([BI)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v14, v8, v9, v0}, Lcom/daaw/gw7;->A(Ljava/lang/Object;JF)V

    :goto_b
    add-int/lit8 v0, v4, 0x4

    goto :goto_c

    :pswitch_c
    move-object/from16 v13, p0

    move/from16 v23, p3

    move/from16 v15, v20

    const v19, 0xfffff

    move/from16 v20, v7

    move-object v7, v2

    if-ne v3, v5, :cond_a

    invoke-static {v12, v4}, Lcom/daaw/lq7;->p([BI)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    invoke-static {v14, v8, v9, v0, v1}, Lcom/daaw/gw7;->z(Ljava/lang/Object;JD)V

    add-int/lit8 v0, v4, 0x8

    :goto_c
    or-int/2addr v6, v10

    move-object v9, v7

    move v2, v15

    :goto_d
    move/from16 v7, v20

    move/from16 v1, v23

    const v8, 0xfffff

    const/4 v10, -0x1

    move-object v15, v13

    :goto_e
    move/from16 v13, p4

    goto/16 :goto_0

    :cond_a
    :goto_f
    move v2, v4

    move-object/from16 v29, v7

    move/from16 v7, v20

    goto/16 :goto_3

    :cond_b
    move/from16 v23, p3

    move/from16 v22, v1

    move/from16 v20, v7

    move-object v10, v15

    move-object/from16 v7, v19

    const v19, 0xfffff

    move v15, v2

    const/16 v0, 0x1b

    if-ne v13, v0, :cond_f

    const/4 v0, 0x2

    if-ne v3, v0, :cond_e

    invoke-virtual {v7, v14, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/us7;

    invoke-interface {v0}, Lcom/daaw/us7;->zzc()Z

    move-result v1

    if-nez v1, :cond_d

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_c

    const/16 v1, 0xa

    goto :goto_10

    :cond_c
    add-int/2addr v1, v1

    :goto_10
    invoke-interface {v0, v1}, Lcom/daaw/us7;->b(I)Lcom/daaw/us7;

    move-result-object v0

    invoke-virtual {v7, v14, v8, v9, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_d
    move-object v5, v0

    invoke-virtual {v10, v15}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v0

    move/from16 v1, v17

    move-object/from16 v2, p2

    move v3, v4

    move/from16 v4, p4

    move v8, v6

    move-object/from16 v6, p5

    invoke-static/range {v0 .. v6}, Lcom/daaw/lq7;->e(Lcom/daaw/cv7;I[BIILcom/daaw/us7;Lcom/daaw/kq7;)I

    move-result v0

    move/from16 v13, p4

    move-object v9, v7

    move v6, v8

    move v2, v15

    move/from16 v7, v20

    move/from16 v1, v23

    const v8, 0xfffff

    move-object v15, v10

    const/4 v10, -0x1

    goto/16 :goto_0

    :cond_e
    move v14, v4

    move/from16 v25, v6

    move-object/from16 v29, v7

    move/from16 v26, v20

    const/16 v18, -0x1

    goto/16 :goto_12

    :cond_f
    const/16 v0, 0x31

    if-gt v13, v0, :cond_11

    move/from16 v1, v22

    int-to-long v1, v1

    move-object/from16 v0, p0

    move-wide/from16 v21, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v5, v3

    move v3, v4

    move/from16 v24, v4

    move/from16 v4, p4

    move/from16 p3, v5

    move/from16 v5, v17

    move/from16 v25, v6

    move/from16 v6, v23

    move/from16 v26, v20

    move-object/from16 v20, v7

    move/from16 v7, p3

    move-wide/from16 v27, v8

    const v9, 0xfffff

    move v8, v15

    move-object/from16 v29, v20

    const/16 v18, -0x1

    move-wide/from16 v9, v21

    move v11, v13

    move-wide/from16 v12, v27

    move-object/from16 v14, p5

    invoke-virtual/range {v0 .. v14}, Lcom/daaw/au7;->Y(Ljava/lang/Object;[BIIIIIIJIJLcom/daaw/kq7;)I

    move-result v0

    move/from16 v14, v24

    if-eq v0, v14, :cond_10

    :goto_11
    move-object/from16 v14, p1

    move-object/from16 v12, p2

    move/from16 v13, p4

    move-object/from16 v11, p5

    move v2, v15

    move/from16 v1, v23

    move/from16 v6, v25

    move/from16 v7, v26

    goto/16 :goto_15

    :cond_10
    move v2, v0

    goto :goto_13

    :cond_11
    move/from16 p3, v3

    move v14, v4

    move/from16 v25, v6

    move-object/from16 v29, v7

    move-wide/from16 v27, v8

    move/from16 v26, v20

    move/from16 v1, v22

    const/16 v18, -0x1

    const/16 v0, 0x32

    move/from16 v7, p3

    if-ne v13, v0, :cond_13

    const/4 v0, 0x2

    if-ne v7, v0, :cond_12

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v3, v14

    move/from16 v4, p4

    move v5, v15

    move-wide/from16 v6, v27

    move-object/from16 v8, p5

    invoke-virtual/range {v0 .. v8}, Lcom/daaw/au7;->V(Ljava/lang/Object;[BIIIJLcom/daaw/kq7;)I

    move-result v0

    if-eq v0, v14, :cond_10

    goto :goto_11

    :cond_12
    :goto_12
    move v2, v14

    :goto_13
    move/from16 v6, v25

    move/from16 v7, v26

    goto :goto_14

    :cond_13
    move-object/from16 v0, p0

    move v8, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v3, v14

    move/from16 v4, p4

    move/from16 v5, v17

    move/from16 v6, v23

    move v9, v13

    move-wide/from16 v10, v27

    move v12, v15

    move-object/from16 v13, p5

    invoke-virtual/range {v0 .. v13}, Lcom/daaw/au7;->W(Ljava/lang/Object;[BIIIIIIIJILcom/daaw/kq7;)I

    move-result v0

    if-eq v0, v14, :cond_10

    goto :goto_11

    :goto_14
    invoke-static/range {p1 .. p1}, Lcom/daaw/au7;->N(Ljava/lang/Object;)Lcom/daaw/uv7;

    move-result-object v4

    move/from16 v0, v17

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object/from16 v5, p5

    invoke-static/range {v0 .. v5}, Lcom/daaw/lq7;->i(I[BIILcom/daaw/uv7;Lcom/daaw/kq7;)I

    move-result v0

    move-object/from16 v14, p1

    move-object/from16 v12, p2

    move/from16 v13, p4

    move-object/from16 v11, p5

    move v2, v15

    move/from16 v1, v23

    :goto_15
    move-object/from16 v9, v29

    :goto_16
    const v8, 0xfffff

    const/4 v10, -0x1

    move-object/from16 v15, p0

    goto/16 :goto_0

    :cond_14
    move/from16 v25, v6

    move-object/from16 v29, v9

    const v1, 0xfffff

    if-eq v7, v1, :cond_15

    int-to-long v1, v7

    move-object/from16 v3, p1

    move/from16 v6, v25

    move-object/from16 v4, v29

    invoke-virtual {v4, v3, v1, v2, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_15
    move/from16 v1, p4

    if-ne v0, v1, :cond_16

    return v0

    :cond_16
    invoke-static {}, Lcom/daaw/xs7;->g()Lcom/daaw/xs7;

    move-result-object v0

    goto :goto_18

    :goto_17
    throw v0

    :goto_18
    goto :goto_17

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final Y(Ljava/lang/Object;[BIIIIIIJIJLcom/daaw/kq7;)I
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v2, p5

    move/from16 v6, p7

    move/from16 v8, p8

    move-wide/from16 v9, p12

    move-object/from16 v7, p14

    sget-object v11, Lcom/daaw/au7;->r:Lsun/misc/Unsafe;

    invoke-virtual {v11, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/daaw/us7;

    invoke-interface {v12}, Lcom/daaw/us7;->zzc()Z

    move-result v13

    if-nez v13, :cond_1

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v13

    if-nez v13, :cond_0

    const/16 v13, 0xa

    goto :goto_0

    :cond_0
    add-int/2addr v13, v13

    :goto_0
    invoke-interface {v12, v13}, Lcom/daaw/us7;->b(I)Lcom/daaw/us7;

    move-result-object v12

    invoke-virtual {v11, v1, v9, v10, v12}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_1
    const/4 v9, 0x5

    const-wide/16 v10, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x2

    packed-switch p11, :pswitch_data_0

    const/4 v1, 0x3

    if-ne v6, v1, :cond_44

    invoke-virtual {p0, v8}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v1

    and-int/lit8 v6, v2, -0x8

    or-int/lit8 v6, v6, 0x4

    move-object/from16 p6, v1

    move-object/from16 p7, p2

    move/from16 p8, p3

    move/from16 p9, p4

    move/from16 p10, v6

    move-object/from16 p11, p14

    invoke-static/range {p6 .. p11}, Lcom/daaw/lq7;->c(Lcom/daaw/cv7;[BIIILcom/daaw/kq7;)I

    move-result v4

    :goto_1
    iget-object v8, v7, Lcom/daaw/kq7;->c:Ljava/lang/Object;

    invoke-interface {v12, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_21

    :pswitch_0
    if-ne v6, v14, :cond_4

    check-cast v12, Lcom/daaw/mt7;

    invoke-static {v3, v4, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v1

    iget v2, v7, Lcom/daaw/kq7;->a:I

    add-int/2addr v2, v1

    :goto_2
    if-ge v1, v2, :cond_2

    invoke-static {v3, v1, v7}, Lcom/daaw/lq7;->m([BILcom/daaw/kq7;)I

    move-result v1

    iget-wide v4, v7, Lcom/daaw/kq7;->b:J

    invoke-static {v4, v5}, Lcom/daaw/jr7;->f(J)J

    move-result-wide v4

    invoke-virtual {v12, v4, v5}, Lcom/daaw/mt7;->h(J)V

    goto :goto_2

    :cond_2
    if-ne v1, v2, :cond_3

    goto/16 :goto_24

    :cond_3
    invoke-static {}, Lcom/daaw/xs7;->j()Lcom/daaw/xs7;

    move-result-object v1

    throw v1

    :cond_4
    if-nez v6, :cond_44

    check-cast v12, Lcom/daaw/mt7;

    :cond_5
    invoke-static {v3, v4, v7}, Lcom/daaw/lq7;->m([BILcom/daaw/kq7;)I

    move-result v1

    iget-wide v8, v7, Lcom/daaw/kq7;->b:J

    invoke-static {v8, v9}, Lcom/daaw/jr7;->f(J)J

    move-result-wide v8

    invoke-virtual {v12, v8, v9}, Lcom/daaw/mt7;->h(J)V

    if-ge v1, v5, :cond_6

    invoke-static {v3, v1, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v4

    iget v6, v7, Lcom/daaw/kq7;->a:I

    if-eq v2, v6, :cond_5

    :cond_6
    return v1

    :pswitch_1
    if-ne v6, v14, :cond_9

    check-cast v12, Lcom/daaw/ms7;

    invoke-static {v3, v4, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v1

    iget v2, v7, Lcom/daaw/kq7;->a:I

    add-int/2addr v2, v1

    :goto_3
    if-ge v1, v2, :cond_7

    invoke-static {v3, v1, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v1

    iget v4, v7, Lcom/daaw/kq7;->a:I

    invoke-static {v4}, Lcom/daaw/jr7;->e(I)I

    move-result v4

    invoke-virtual {v12, v4}, Lcom/daaw/ms7;->i(I)V

    goto :goto_3

    :cond_7
    if-ne v1, v2, :cond_8

    goto/16 :goto_24

    :cond_8
    invoke-static {}, Lcom/daaw/xs7;->j()Lcom/daaw/xs7;

    move-result-object v1

    throw v1

    :cond_9
    if-nez v6, :cond_44

    check-cast v12, Lcom/daaw/ms7;

    :cond_a
    invoke-static {v3, v4, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v1

    iget v4, v7, Lcom/daaw/kq7;->a:I

    invoke-static {v4}, Lcom/daaw/jr7;->e(I)I

    move-result v4

    invoke-virtual {v12, v4}, Lcom/daaw/ms7;->i(I)V

    if-ge v1, v5, :cond_b

    invoke-static {v3, v1, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v4

    iget v6, v7, Lcom/daaw/kq7;->a:I

    if-eq v2, v6, :cond_a

    :cond_b
    return v1

    :pswitch_2
    if-ne v6, v14, :cond_c

    invoke-static {v3, v4, v12, v7}, Lcom/daaw/lq7;->f([BILcom/daaw/us7;Lcom/daaw/kq7;)I

    move-result v2

    goto :goto_4

    :cond_c
    if-nez v6, :cond_44

    move/from16 v2, p5

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object v6, v12

    move-object/from16 v7, p14

    invoke-static/range {v2 .. v7}, Lcom/daaw/lq7;->l(I[BIILcom/daaw/us7;Lcom/daaw/kq7;)I

    move-result v2

    :goto_4
    invoke-virtual {p0, v8}, Lcom/daaw/au7;->m(I)Lcom/daaw/ps7;

    move-result-object v3

    const/4 v4, 0x0

    iget-object v5, v0, Lcom/daaw/au7;->m:Lcom/daaw/tv7;

    move-object/from16 p7, p1

    move/from16 p8, p6

    move-object/from16 p9, v12

    move-object/from16 p10, v3

    move-object/from16 p11, v4

    move-object/from16 p12, v5

    invoke-static/range {p7 .. p12}, Lcom/daaw/ev7;->c(Ljava/lang/Object;ILjava/util/List;Lcom/daaw/ps7;Ljava/lang/Object;Lcom/daaw/tv7;)Ljava/lang/Object;

    :goto_5
    move v1, v2

    goto/16 :goto_24

    :pswitch_3
    if-ne v6, v14, :cond_44

    invoke-static {v3, v4, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v1

    iget v4, v7, Lcom/daaw/kq7;->a:I

    if-ltz v4, :cond_13

    array-length v6, v3

    sub-int/2addr v6, v1

    if-gt v4, v6, :cond_12

    if-nez v4, :cond_d

    :goto_6
    sget-object v4, Lcom/daaw/yq7;->q:Lcom/daaw/yq7;

    invoke-interface {v12, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_d
    invoke-static {v3, v1, v4}, Lcom/daaw/yq7;->G([BII)Lcom/daaw/yq7;

    move-result-object v6

    invoke-interface {v12, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v1, v4

    :goto_7
    if-ge v1, v5, :cond_11

    invoke-static {v3, v1, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v4

    iget v6, v7, Lcom/daaw/kq7;->a:I

    if-eq v2, v6, :cond_e

    goto :goto_8

    :cond_e
    invoke-static {v3, v4, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v1

    iget v4, v7, Lcom/daaw/kq7;->a:I

    if-ltz v4, :cond_10

    array-length v6, v3

    sub-int/2addr v6, v1

    if-gt v4, v6, :cond_f

    if-nez v4, :cond_d

    goto :goto_6

    :cond_f
    invoke-static {}, Lcom/daaw/xs7;->j()Lcom/daaw/xs7;

    move-result-object v1

    throw v1

    :cond_10
    invoke-static {}, Lcom/daaw/xs7;->f()Lcom/daaw/xs7;

    move-result-object v1

    throw v1

    :cond_11
    :goto_8
    return v1

    :cond_12
    invoke-static {}, Lcom/daaw/xs7;->j()Lcom/daaw/xs7;

    move-result-object v1

    throw v1

    :cond_13
    invoke-static {}, Lcom/daaw/xs7;->f()Lcom/daaw/xs7;

    move-result-object v1

    throw v1

    :pswitch_4
    if-eq v6, v14, :cond_14

    goto/16 :goto_23

    :cond_14
    invoke-virtual {p0, v8}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v1

    move-object/from16 p6, v1

    move/from16 p7, p5

    move-object/from16 p8, p2

    move/from16 p9, p3

    move/from16 p10, p4

    move-object/from16 p11, v12

    move-object/from16 p12, p14

    invoke-static/range {p6 .. p12}, Lcom/daaw/lq7;->e(Lcom/daaw/cv7;I[BIILcom/daaw/us7;Lcom/daaw/kq7;)I

    move-result v1

    return v1

    :pswitch_5
    if-ne v6, v14, :cond_44

    const-wide/32 v8, 0x20000000

    and-long v8, p9, v8

    const-string v1, ""

    cmp-long v6, v8, v10

    invoke-static {v3, v4, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v4

    if-nez v6, :cond_19

    iget v6, v7, Lcom/daaw/kq7;->a:I

    if-ltz v6, :cond_18

    if-nez v6, :cond_15

    :goto_9
    invoke-interface {v12, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_15
    new-instance v8, Ljava/lang/String;

    sget-object v9, Lcom/daaw/vs7;->b:Ljava/nio/charset/Charset;

    invoke-direct {v8, v3, v4, v6, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    :goto_a
    invoke-interface {v12, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v4, v6

    :goto_b
    if-ge v4, v5, :cond_44

    invoke-static {v3, v4, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v6

    iget v8, v7, Lcom/daaw/kq7;->a:I

    if-ne v2, v8, :cond_44

    invoke-static {v3, v6, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v4

    iget v6, v7, Lcom/daaw/kq7;->a:I

    if-ltz v6, :cond_17

    if-nez v6, :cond_16

    goto :goto_9

    :cond_16
    new-instance v8, Ljava/lang/String;

    sget-object v9, Lcom/daaw/vs7;->b:Ljava/nio/charset/Charset;

    invoke-direct {v8, v3, v4, v6, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_a

    :cond_17
    invoke-static {}, Lcom/daaw/xs7;->f()Lcom/daaw/xs7;

    move-result-object v1

    throw v1

    :cond_18
    invoke-static {}, Lcom/daaw/xs7;->f()Lcom/daaw/xs7;

    move-result-object v1

    throw v1

    :cond_19
    iget v6, v7, Lcom/daaw/kq7;->a:I

    if-ltz v6, :cond_1f

    if-nez v6, :cond_1a

    :goto_c
    invoke-interface {v12, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_1a
    add-int v8, v4, v6

    invoke-static {v3, v4, v8}, Lcom/daaw/lw7;->j([BII)Z

    move-result v9

    if-eqz v9, :cond_1e

    new-instance v9, Ljava/lang/String;

    sget-object v10, Lcom/daaw/vs7;->b:Ljava/nio/charset/Charset;

    invoke-direct {v9, v3, v4, v6, v10}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    :goto_d
    invoke-interface {v12, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v4, v8

    :goto_e
    if-ge v4, v5, :cond_44

    invoke-static {v3, v4, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v6

    iget v8, v7, Lcom/daaw/kq7;->a:I

    if-ne v2, v8, :cond_44

    invoke-static {v3, v6, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v4

    iget v6, v7, Lcom/daaw/kq7;->a:I

    if-ltz v6, :cond_1d

    if-nez v6, :cond_1b

    goto :goto_c

    :cond_1b
    add-int v8, v4, v6

    invoke-static {v3, v4, v8}, Lcom/daaw/lw7;->j([BII)Z

    move-result v9

    if-eqz v9, :cond_1c

    new-instance v9, Ljava/lang/String;

    sget-object v10, Lcom/daaw/vs7;->b:Ljava/nio/charset/Charset;

    invoke-direct {v9, v3, v4, v6, v10}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_d

    :cond_1c
    invoke-static {}, Lcom/daaw/xs7;->d()Lcom/daaw/xs7;

    move-result-object v1

    throw v1

    :cond_1d
    invoke-static {}, Lcom/daaw/xs7;->f()Lcom/daaw/xs7;

    move-result-object v1

    throw v1

    :cond_1e
    invoke-static {}, Lcom/daaw/xs7;->d()Lcom/daaw/xs7;

    move-result-object v1

    throw v1

    :cond_1f
    invoke-static {}, Lcom/daaw/xs7;->f()Lcom/daaw/xs7;

    move-result-object v1

    throw v1

    :pswitch_6
    const/4 v1, 0x0

    if-ne v6, v14, :cond_23

    check-cast v12, Lcom/daaw/mq7;

    invoke-static {v3, v4, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v2

    iget v4, v7, Lcom/daaw/kq7;->a:I

    add-int/2addr v4, v2

    :goto_f
    if-ge v2, v4, :cond_21

    invoke-static {v3, v2, v7}, Lcom/daaw/lq7;->m([BILcom/daaw/kq7;)I

    move-result v2

    iget-wide v5, v7, Lcom/daaw/kq7;->b:J

    cmp-long v8, v5, v10

    if-eqz v8, :cond_20

    const/4 v5, 0x1

    goto :goto_10

    :cond_20
    const/4 v5, 0x0

    :goto_10
    invoke-virtual {v12, v5}, Lcom/daaw/mq7;->e(Z)V

    goto :goto_f

    :cond_21
    if-ne v2, v4, :cond_22

    goto/16 :goto_5

    :cond_22
    invoke-static {}, Lcom/daaw/xs7;->j()Lcom/daaw/xs7;

    move-result-object v1

    throw v1

    :cond_23
    if-nez v6, :cond_44

    check-cast v12, Lcom/daaw/mq7;

    invoke-static {v3, v4, v7}, Lcom/daaw/lq7;->m([BILcom/daaw/kq7;)I

    move-result v4

    iget-wide v8, v7, Lcom/daaw/kq7;->b:J

    cmp-long v6, v8, v10

    if-eqz v6, :cond_24

    :goto_11
    const/4 v6, 0x1

    goto :goto_12

    :cond_24
    const/4 v6, 0x0

    :goto_12
    invoke-virtual {v12, v6}, Lcom/daaw/mq7;->e(Z)V

    if-ge v4, v5, :cond_26

    invoke-static {v3, v4, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v6

    iget v8, v7, Lcom/daaw/kq7;->a:I

    if-eq v2, v8, :cond_25

    goto :goto_13

    :cond_25
    invoke-static {v3, v6, v7}, Lcom/daaw/lq7;->m([BILcom/daaw/kq7;)I

    move-result v4

    iget-wide v8, v7, Lcom/daaw/kq7;->b:J

    cmp-long v6, v8, v10

    if-eqz v6, :cond_24

    goto :goto_11

    :cond_26
    :goto_13
    return v4

    :pswitch_7
    if-ne v6, v14, :cond_29

    check-cast v12, Lcom/daaw/ms7;

    invoke-static {v3, v4, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v1

    iget v2, v7, Lcom/daaw/kq7;->a:I

    add-int/2addr v2, v1

    :goto_14
    if-ge v1, v2, :cond_27

    invoke-static {v3, v1}, Lcom/daaw/lq7;->b([BI)I

    move-result v4

    invoke-virtual {v12, v4}, Lcom/daaw/ms7;->i(I)V

    add-int/lit8 v1, v1, 0x4

    goto :goto_14

    :cond_27
    if-ne v1, v2, :cond_28

    goto/16 :goto_24

    :cond_28
    invoke-static {}, Lcom/daaw/xs7;->j()Lcom/daaw/xs7;

    move-result-object v1

    throw v1

    :cond_29
    if-ne v6, v9, :cond_44

    check-cast v12, Lcom/daaw/ms7;

    invoke-static/range {p2 .. p3}, Lcom/daaw/lq7;->b([BI)I

    move-result v1

    :goto_15
    invoke-virtual {v12, v1}, Lcom/daaw/ms7;->i(I)V

    add-int/lit8 v1, v4, 0x4

    if-ge v1, v5, :cond_2b

    invoke-static {v3, v1, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v4

    iget v6, v7, Lcom/daaw/kq7;->a:I

    if-eq v2, v6, :cond_2a

    goto :goto_16

    :cond_2a
    invoke-static {v3, v4}, Lcom/daaw/lq7;->b([BI)I

    move-result v1

    goto :goto_15

    :cond_2b
    :goto_16
    return v1

    :pswitch_8
    if-ne v6, v14, :cond_2e

    check-cast v12, Lcom/daaw/mt7;

    invoke-static {v3, v4, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v1

    iget v2, v7, Lcom/daaw/kq7;->a:I

    add-int/2addr v2, v1

    :goto_17
    if-ge v1, v2, :cond_2c

    invoke-static {v3, v1}, Lcom/daaw/lq7;->p([BI)J

    move-result-wide v4

    invoke-virtual {v12, v4, v5}, Lcom/daaw/mt7;->h(J)V

    add-int/lit8 v1, v1, 0x8

    goto :goto_17

    :cond_2c
    if-ne v1, v2, :cond_2d

    goto/16 :goto_24

    :cond_2d
    invoke-static {}, Lcom/daaw/xs7;->j()Lcom/daaw/xs7;

    move-result-object v1

    throw v1

    :cond_2e
    if-ne v6, v13, :cond_44

    check-cast v12, Lcom/daaw/mt7;

    invoke-static/range {p2 .. p3}, Lcom/daaw/lq7;->p([BI)J

    move-result-wide v8

    :goto_18
    invoke-virtual {v12, v8, v9}, Lcom/daaw/mt7;->h(J)V

    add-int/lit8 v1, v4, 0x8

    if-ge v1, v5, :cond_30

    invoke-static {v3, v1, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v4

    iget v6, v7, Lcom/daaw/kq7;->a:I

    if-eq v2, v6, :cond_2f

    goto :goto_19

    :cond_2f
    invoke-static {v3, v4}, Lcom/daaw/lq7;->p([BI)J

    move-result-wide v8

    goto :goto_18

    :cond_30
    :goto_19
    return v1

    :pswitch_9
    if-ne v6, v14, :cond_31

    invoke-static {v3, v4, v12, v7}, Lcom/daaw/lq7;->f([BILcom/daaw/us7;Lcom/daaw/kq7;)I

    move-result v1

    goto/16 :goto_24

    :cond_31
    if-eqz v6, :cond_32

    goto/16 :goto_23

    :cond_32
    move-object/from16 p6, p2

    move/from16 p7, p3

    move/from16 p8, p4

    move-object/from16 p9, v12

    move-object/from16 p10, p14

    invoke-static/range {p5 .. p10}, Lcom/daaw/lq7;->l(I[BIILcom/daaw/us7;Lcom/daaw/kq7;)I

    move-result v1

    return v1

    :pswitch_a
    if-ne v6, v14, :cond_35

    check-cast v12, Lcom/daaw/mt7;

    invoke-static {v3, v4, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v1

    iget v2, v7, Lcom/daaw/kq7;->a:I

    add-int/2addr v2, v1

    :goto_1a
    if-ge v1, v2, :cond_33

    invoke-static {v3, v1, v7}, Lcom/daaw/lq7;->m([BILcom/daaw/kq7;)I

    move-result v1

    iget-wide v4, v7, Lcom/daaw/kq7;->b:J

    invoke-virtual {v12, v4, v5}, Lcom/daaw/mt7;->h(J)V

    goto :goto_1a

    :cond_33
    if-ne v1, v2, :cond_34

    goto/16 :goto_24

    :cond_34
    invoke-static {}, Lcom/daaw/xs7;->j()Lcom/daaw/xs7;

    move-result-object v1

    throw v1

    :cond_35
    if-nez v6, :cond_44

    check-cast v12, Lcom/daaw/mt7;

    :cond_36
    invoke-static {v3, v4, v7}, Lcom/daaw/lq7;->m([BILcom/daaw/kq7;)I

    move-result v1

    iget-wide v8, v7, Lcom/daaw/kq7;->b:J

    invoke-virtual {v12, v8, v9}, Lcom/daaw/mt7;->h(J)V

    if-ge v1, v5, :cond_37

    invoke-static {v3, v1, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v4

    iget v6, v7, Lcom/daaw/kq7;->a:I

    if-eq v2, v6, :cond_36

    :cond_37
    return v1

    :pswitch_b
    if-ne v6, v14, :cond_3a

    check-cast v12, Lcom/daaw/cs7;

    invoke-static {v3, v4, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v1

    iget v2, v7, Lcom/daaw/kq7;->a:I

    add-int/2addr v2, v1

    :goto_1b
    if-ge v1, v2, :cond_38

    invoke-static {v3, v1}, Lcom/daaw/lq7;->b([BI)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    invoke-virtual {v12, v4}, Lcom/daaw/cs7;->e(F)V

    add-int/lit8 v1, v1, 0x4

    goto :goto_1b

    :cond_38
    if-ne v1, v2, :cond_39

    goto/16 :goto_24

    :cond_39
    invoke-static {}, Lcom/daaw/xs7;->j()Lcom/daaw/xs7;

    move-result-object v1

    throw v1

    :cond_3a
    if-ne v6, v9, :cond_44

    check-cast v12, Lcom/daaw/cs7;

    invoke-static/range {p2 .. p3}, Lcom/daaw/lq7;->b([BI)I

    move-result v1

    :goto_1c
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-virtual {v12, v1}, Lcom/daaw/cs7;->e(F)V

    add-int/lit8 v1, v4, 0x4

    if-ge v1, v5, :cond_3c

    invoke-static {v3, v1, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v4

    iget v6, v7, Lcom/daaw/kq7;->a:I

    if-eq v2, v6, :cond_3b

    goto :goto_1d

    :cond_3b
    invoke-static {v3, v4}, Lcom/daaw/lq7;->b([BI)I

    move-result v1

    goto :goto_1c

    :cond_3c
    :goto_1d
    return v1

    :pswitch_c
    if-ne v6, v14, :cond_3f

    check-cast v12, Lcom/daaw/sr7;

    invoke-static {v3, v4, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v1

    iget v2, v7, Lcom/daaw/kq7;->a:I

    add-int/2addr v2, v1

    :goto_1e
    if-ge v1, v2, :cond_3d

    invoke-static {v3, v1}, Lcom/daaw/lq7;->p([BI)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v4

    invoke-virtual {v12, v4, v5}, Lcom/daaw/sr7;->e(D)V

    add-int/lit8 v1, v1, 0x8

    goto :goto_1e

    :cond_3d
    if-ne v1, v2, :cond_3e

    goto :goto_24

    :cond_3e
    invoke-static {}, Lcom/daaw/xs7;->j()Lcom/daaw/xs7;

    move-result-object v1

    throw v1

    :cond_3f
    if-ne v6, v13, :cond_44

    check-cast v12, Lcom/daaw/sr7;

    invoke-static/range {p2 .. p3}, Lcom/daaw/lq7;->p([BI)J

    move-result-wide v8

    :goto_1f
    invoke-static {v8, v9}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v8

    invoke-virtual {v12, v8, v9}, Lcom/daaw/sr7;->e(D)V

    add-int/lit8 v1, v4, 0x8

    if-ge v1, v5, :cond_41

    invoke-static {v3, v1, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v4

    iget v6, v7, Lcom/daaw/kq7;->a:I

    if-eq v2, v6, :cond_40

    goto :goto_20

    :cond_40
    invoke-static {v3, v4}, Lcom/daaw/lq7;->p([BI)J

    move-result-wide v8

    goto :goto_1f

    :cond_41
    :goto_20
    return v1

    :goto_21
    if-ge v4, v5, :cond_43

    invoke-static {v3, v4, v7}, Lcom/daaw/lq7;->j([BILcom/daaw/kq7;)I

    move-result v8

    iget v9, v7, Lcom/daaw/kq7;->a:I

    if-eq v2, v9, :cond_42

    goto :goto_22

    :cond_42
    move-object/from16 p6, v1

    move-object/from16 p7, p2

    move/from16 p8, v8

    move/from16 p9, p4

    move/from16 p10, v6

    move-object/from16 p11, p14

    invoke-static/range {p6 .. p11}, Lcom/daaw/lq7;->c(Lcom/daaw/cv7;[BIIILcom/daaw/kq7;)I

    move-result v4

    goto/16 :goto_1

    :cond_43
    :goto_22
    return v4

    :cond_44
    :goto_23
    move v1, v4

    :goto_24
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final Z(I)I
    .locals 1

    iget v0, p0, Lcom/daaw/au7;->c:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Lcom/daaw/au7;->d:I

    if-gt p1, v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/au7;->i(II)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final a(Ljava/lang/Object;)I
    .locals 8

    iget-object v0, p0, Lcom/daaw/au7;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Lcom/daaw/au7;->k(I)I

    move-result v3

    iget-object v4, p0, Lcom/daaw/au7;->a:[I

    aget v4, v4, v1

    const v5, 0xfffff

    and-int/2addr v5, v3

    int-to-long v5, v5

    invoke-static {v3}, Lcom/daaw/au7;->j(I)I

    move-result v3

    const/16 v7, 0x25

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_c

    :pswitch_0
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :pswitch_1
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :pswitch_2
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :pswitch_3
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :pswitch_4
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :pswitch_5
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_1
    goto :goto_2

    :pswitch_6
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_2

    :pswitch_7
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :pswitch_8
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :pswitch_9
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_6

    :pswitch_a
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/daaw/au7;->I(Ljava/lang/Object;J)Z

    move-result v3

    goto/16 :goto_7

    :pswitch_b
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_2

    :pswitch_c
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_3

    :pswitch_d
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_2
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/daaw/au7;->U(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_b

    :pswitch_e
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_3

    :pswitch_f
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_3
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/daaw/au7;->l(Ljava/lang/Object;J)J

    move-result-wide v3

    goto/16 :goto_a

    :pswitch_10
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/daaw/au7;->R(Ljava/lang/Object;J)F

    move-result v3

    goto :goto_8

    :pswitch_11
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/daaw/au7;->Q(Ljava/lang/Object;J)D

    move-result-wide v3

    goto :goto_9

    :pswitch_12
    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    goto :goto_5

    :goto_4
    :pswitch_13
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_b

    :pswitch_14
    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    :goto_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v7

    :cond_0
    mul-int/lit8 v2, v2, 0x35

    add-int/2addr v2, v7

    goto :goto_c

    :goto_6
    :pswitch_15
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto :goto_b

    :pswitch_16
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->H(Ljava/lang/Object;J)Z

    move-result v3

    :goto_7
    invoke-static {v3}, Lcom/daaw/vs7;->a(Z)I

    move-result v3

    goto :goto_b

    :pswitch_17
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v3

    goto :goto_b

    :pswitch_18
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->n(Ljava/lang/Object;J)J

    move-result-wide v3

    goto :goto_a

    :pswitch_19
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->k(Ljava/lang/Object;J)F

    move-result v3

    :goto_8
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    goto :goto_b

    :pswitch_1a
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->j(Ljava/lang/Object;J)D

    move-result-wide v3

    :goto_9
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    :goto_a
    invoke-static {v3, v4}, Lcom/daaw/vs7;->c(J)I

    move-result v3

    :goto_b
    add-int/2addr v2, v3

    :cond_1
    :goto_c
    add-int/lit8 v1, v1, 0x3

    goto/16 :goto_0

    :cond_2
    mul-int/lit8 v2, v2, 0x35

    iget-object v0, p0, Lcom/daaw/au7;->m:Lcom/daaw/tv7;

    invoke-virtual {v0, p1}, Lcom/daaw/tv7;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v2, v0

    iget-boolean v0, p0, Lcom/daaw/au7;->f:Z

    if-nez v0, :cond_3

    return v2

    :cond_3
    iget-object v0, p0, Lcom/daaw/au7;->n:Lcom/daaw/wr7;

    invoke-virtual {v0, p1}, Lcom/daaw/wr7;->a(Ljava/lang/Object;)Lcom/daaw/as7;

    const/4 p1, 0x0

    goto :goto_e

    :goto_d
    throw p1

    :goto_e
    goto :goto_d

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_18
        :pswitch_17
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_18
        :pswitch_17
        :pswitch_18
        :pswitch_12
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a0(II)I
    .locals 1

    iget v0, p0, Lcom/daaw/au7;->c:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Lcom/daaw/au7;->d:I

    if-gt p1, v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/au7;->i(II)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 7

    invoke-static {p1}, Lcom/daaw/au7;->G(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Lcom/daaw/ls7;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/daaw/ls7;

    const v2, 0x7fffffff

    invoke-virtual {v0, v2}, Lcom/daaw/ls7;->D(I)V

    iput v1, v0, Lcom/daaw/hq7;->zza:I

    invoke-virtual {v0}, Lcom/daaw/ls7;->B()V

    :cond_1
    iget-object v0, p0, Lcom/daaw/au7;->a:[I

    array-length v0, v0

    :goto_0
    if-ge v1, v0, :cond_4

    invoke-virtual {p0, v1}, Lcom/daaw/au7;->k(I)I

    move-result v2

    const v3, 0xfffff

    and-int/2addr v3, v2

    int-to-long v3, v3

    invoke-static {v2}, Lcom/daaw/au7;->j(I)I

    move-result v2

    const/16 v5, 0x9

    if-eq v2, v5, :cond_2

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    sget-object v2, Lcom/daaw/au7;->r:Lsun/misc/Unsafe;

    invoke-virtual {v2, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_3

    move-object v6, v5

    check-cast v6, Lcom/daaw/rt7;

    invoke-virtual {v6}, Lcom/daaw/rt7;->c()V

    invoke-virtual {v2, p1, v3, v4, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    iget-object v2, p0, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    invoke-virtual {v2, p1, v3, v4}, Lcom/daaw/lt7;->b(Ljava/lang/Object;J)V

    goto :goto_1

    :cond_2
    :pswitch_2
    invoke-virtual {p0, p1, v1}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0, v1}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v2

    sget-object v5, Lcom/daaw/au7;->r:Lsun/misc/Unsafe;

    invoke-virtual {v5, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/daaw/cv7;->b(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x3

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/daaw/au7;->m:Lcom/daaw/tv7;

    invoke-virtual {v0, p1}, Lcom/daaw/tv7;->m(Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/daaw/au7;->f:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/daaw/au7;->n:Lcom/daaw/wr7;

    invoke-virtual {v0, p1}, Lcom/daaw/wr7;->e(Ljava/lang/Object;)V

    :cond_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b0(I)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/au7;->a:[I

    add-int/lit8 p1, p1, 0x2

    aget p1, v0, p1

    return p1
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 18

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    const v8, 0xfffff

    const/4 v9, 0x0

    const v0, 0xfffff

    const/4 v1, 0x0

    const/4 v10, 0x0

    :goto_0
    iget v2, v6, Lcom/daaw/au7;->j:I

    const/4 v11, 0x0

    const/4 v3, 0x1

    if-ge v10, v2, :cond_b

    iget-object v2, v6, Lcom/daaw/au7;->i:[I

    aget v12, v2, v10

    iget-object v2, v6, Lcom/daaw/au7;->a:[I

    aget v13, v2, v12

    invoke-virtual {v6, v12}, Lcom/daaw/au7;->k(I)I

    move-result v14

    iget-object v2, v6, Lcom/daaw/au7;->a:[I

    add-int/lit8 v4, v12, 0x2

    aget v2, v2, v4

    and-int v4, v2, v8

    ushr-int/lit8 v2, v2, 0x14

    shl-int v15, v3, v2

    if-eq v4, v0, :cond_1

    if-eq v4, v8, :cond_0

    sget-object v0, Lcom/daaw/au7;->r:Lsun/misc/Unsafe;

    int-to-long v1, v4

    invoke-virtual {v0, v7, v1, v2}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v1

    :cond_0
    move/from16 v17, v1

    move/from16 v16, v4

    goto :goto_1

    :cond_1
    move/from16 v16, v0

    move/from16 v17, v1

    :goto_1
    const/high16 v0, 0x10000000

    and-int/2addr v0, v14

    if-eqz v0, :cond_3

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v12

    move/from16 v3, v16

    move/from16 v4, v17

    move v5, v15

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/au7;->E(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    return v9

    :cond_3
    :goto_2
    invoke-static {v14}, Lcom/daaw/au7;->j(I)I

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_9

    const/16 v1, 0x11

    if-eq v0, v1, :cond_9

    const/16 v1, 0x1b

    if-eq v0, v1, :cond_7

    const/16 v1, 0x3c

    if-eq v0, v1, :cond_6

    const/16 v1, 0x44

    if-eq v0, v1, :cond_6

    const/16 v1, 0x31

    if-eq v0, v1, :cond_7

    const/16 v1, 0x32

    if-eq v0, v1, :cond_4

    goto/16 :goto_4

    :cond_4
    and-int v0, v14, v8

    int-to-long v0, v0

    invoke-static {v7, v0, v1}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/rt7;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v6, v12}, Lcom/daaw/au7;->p(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/qt7;

    throw v11

    :cond_6
    invoke-virtual {v6, v7, v13, v12}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {v6, v12}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v0

    invoke-static {v7, v14, v0}, Lcom/daaw/au7;->F(Ljava/lang/Object;ILcom/daaw/cv7;)Z

    move-result v0

    if-nez v0, :cond_a

    return v9

    :cond_7
    and-int v0, v14, v8

    int-to-long v0, v0

    invoke-static {v7, v0, v1}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_a

    invoke-virtual {v6, v12}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v1

    const/4 v2, 0x0

    :goto_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_a

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Lcom/daaw/cv7;->c(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    return v9

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_9
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v12

    move/from16 v3, v16

    move/from16 v4, v17

    move v5, v15

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/au7;->E(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {v6, v12}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v0

    invoke-static {v7, v14, v0}, Lcom/daaw/au7;->F(Ljava/lang/Object;ILcom/daaw/cv7;)Z

    move-result v0

    if-nez v0, :cond_a

    return v9

    :cond_a
    :goto_4
    add-int/lit8 v10, v10, 0x1

    move/from16 v0, v16

    move/from16 v1, v17

    goto/16 :goto_0

    :cond_b
    iget-boolean v0, v6, Lcom/daaw/au7;->f:Z

    if-nez v0, :cond_c

    return v3

    :cond_c
    iget-object v0, v6, Lcom/daaw/au7;->n:Lcom/daaw/wr7;

    invoke-virtual {v0, v7}, Lcom/daaw/wr7;->a(Ljava/lang/Object;)Lcom/daaw/as7;

    goto :goto_6

    :goto_5
    throw v11

    :goto_6
    goto :goto_5
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    invoke-static {p1}, Lcom/daaw/au7;->t(Ljava/lang/Object;)V

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/au7;->a:[I

    array-length v1, v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Lcom/daaw/au7;->k(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v2, v1

    int-to-long v2, v2

    iget-object v4, p0, Lcom/daaw/au7;->a:[I

    aget v4, v4, v0

    invoke-static {v1}, Lcom/daaw/au7;->j(I)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_7

    :pswitch_0
    invoke-virtual {p0, p2, v4, v0}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :pswitch_1
    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/au7;->v(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_7

    :pswitch_2
    invoke-virtual {p0, p2, v4, v0}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_1
    invoke-static {p2, v2, v3}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v2, v3, v1}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v4, v0}, Lcom/daaw/au7;->y(Ljava/lang/Object;II)V

    goto/16 :goto_7

    :pswitch_3
    iget-object v1, p0, Lcom/daaw/au7;->p:Lcom/daaw/st7;

    invoke-static {v1, p1, p2, v2, v3}, Lcom/daaw/ev7;->i(Lcom/daaw/st7;Ljava/lang/Object;Ljava/lang/Object;J)V

    goto/16 :goto_7

    :pswitch_4
    iget-object v1, p0, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    invoke-virtual {v1, p1, p2, v2, v3}, Lcom/daaw/lt7;->c(Ljava/lang/Object;Ljava/lang/Object;J)V

    goto/16 :goto_7

    :pswitch_5
    invoke-virtual {p0, p2, v0}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_5

    :pswitch_6
    invoke-virtual {p0, p2, v0}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :pswitch_7
    invoke-virtual {p0, p2, v0}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_5

    :pswitch_8
    invoke-virtual {p0, p2, v0}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :pswitch_9
    invoke-virtual {p0, p2, v0}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_2
    goto :goto_4

    :pswitch_a
    invoke-virtual {p0, p2, v0}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    :pswitch_b
    invoke-virtual {p0, p2, v0}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_3

    :pswitch_c
    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/au7;->u(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_7

    :pswitch_d
    invoke-virtual {p0, p2, v0}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_3
    invoke-static {p2, v2, v3}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v2, v3, v1}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_6

    :pswitch_e
    invoke-virtual {p0, p2, v0}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, Lcom/daaw/gw7;->H(Ljava/lang/Object;J)Z

    move-result v1

    invoke-static {p1, v2, v3, v1}, Lcom/daaw/gw7;->x(Ljava/lang/Object;JZ)V

    goto :goto_6

    :pswitch_f
    invoke-virtual {p0, p2, v0}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    :pswitch_10
    invoke-virtual {p0, p2, v0}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_5

    :pswitch_11
    invoke-virtual {p0, p2, v0}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_4
    invoke-static {p2, v2, v3}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v2, v3, v1}, Lcom/daaw/gw7;->B(Ljava/lang/Object;JI)V

    goto :goto_6

    :pswitch_12
    invoke-virtual {p0, p2, v0}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_5

    :pswitch_13
    invoke-virtual {p0, p2, v0}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_5
    invoke-static {p2, v2, v3}, Lcom/daaw/gw7;->n(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {p1, v2, v3, v4, v5}, Lcom/daaw/gw7;->C(Ljava/lang/Object;JJ)V

    goto :goto_6

    :pswitch_14
    invoke-virtual {p0, p2, v0}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, Lcom/daaw/gw7;->k(Ljava/lang/Object;J)F

    move-result v1

    invoke-static {p1, v2, v3, v1}, Lcom/daaw/gw7;->A(Ljava/lang/Object;JF)V

    goto :goto_6

    :pswitch_15
    invoke-virtual {p0, p2, v0}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, Lcom/daaw/gw7;->j(Ljava/lang/Object;J)D

    move-result-wide v4

    invoke-static {p1, v2, v3, v4, v5}, Lcom/daaw/gw7;->z(Ljava/lang/Object;JD)V

    :goto_6
    invoke-virtual {p0, p1, v0}, Lcom/daaw/au7;->x(Ljava/lang/Object;I)V

    :cond_0
    :goto_7
    add-int/lit8 v0, v0, 0x3

    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/au7;->m:Lcom/daaw/tv7;

    invoke-static {v0, p1, p2}, Lcom/daaw/ev7;->f(Lcom/daaw/tv7;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/daaw/au7;->f:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/au7;->n:Lcom/daaw/wr7;

    invoke-static {v0, p1, p2}, Lcom/daaw/ev7;->e(Lcom/daaw/wr7;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_c
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 8

    iget-object v0, p0, Lcom/daaw/au7;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-virtual {p0, v2}, Lcom/daaw/au7;->k(I)I

    move-result v3

    const v4, 0xfffff

    and-int v5, v3, v4

    int-to-long v5, v5

    invoke-static {v3}, Lcom/daaw/au7;->j(I)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_2

    :pswitch_0
    invoke-virtual {p0, v2}, Lcom/daaw/au7;->b0(I)I

    move-result v3

    and-int/2addr v3, v4

    int-to-long v3, v3

    invoke-static {p1, v3, v4}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v7

    invoke-static {p2, v3, v4}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v3

    if-ne v7, v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/daaw/ev7;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_1

    :pswitch_1
    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/daaw/ev7;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_1

    :pswitch_2
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/au7;->B(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/daaw/ev7;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :pswitch_3
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/au7;->B(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->n(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lcom/daaw/gw7;->n(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    goto/16 :goto_2

    :pswitch_4
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/au7;->B(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_2

    :pswitch_5
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/au7;->B(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->n(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lcom/daaw/gw7;->n(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    goto/16 :goto_2

    :pswitch_6
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/au7;->B(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_2

    :pswitch_7
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/au7;->B(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_2

    :pswitch_8
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/au7;->B(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_2

    :pswitch_9
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/au7;->B(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/daaw/ev7;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :pswitch_a
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/au7;->B(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/daaw/ev7;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :pswitch_b
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/au7;->B(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/daaw/ev7;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :pswitch_c
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/au7;->B(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->H(Ljava/lang/Object;J)Z

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/daaw/gw7;->H(Ljava/lang/Object;J)Z

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_2

    :pswitch_d
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/au7;->B(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_2

    :pswitch_e
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/au7;->B(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->n(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lcom/daaw/gw7;->n(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    goto/16 :goto_2

    :pswitch_f
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/au7;->B(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto :goto_2

    :pswitch_10
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/au7;->B(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->n(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lcom/daaw/gw7;->n(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    goto :goto_2

    :pswitch_11
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/au7;->B(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->n(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lcom/daaw/gw7;->n(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    goto :goto_2

    :pswitch_12
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/au7;->B(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->k(Ljava/lang/Object;J)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/daaw/gw7;->k(Ljava/lang/Object;J)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto :goto_2

    :pswitch_13
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/au7;->B(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->j(Ljava/lang/Object;J)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lcom/daaw/gw7;->j(Ljava/lang/Object;J)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    return v1

    :cond_1
    :goto_2
    add-int/lit8 v2, v2, 0x3

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lcom/daaw/au7;->m:Lcom/daaw/tv7;

    invoke-virtual {v0, p1}, Lcom/daaw/tv7;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/au7;->m:Lcom/daaw/tv7;

    invoke-virtual {v2, p2}, Lcom/daaw/tv7;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    return v1

    :cond_3
    iget-boolean v0, p0, Lcom/daaw/au7;->f:Z

    if-nez v0, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    iget-object v0, p0, Lcom/daaw/au7;->n:Lcom/daaw/wr7;

    invoke-virtual {v0, p1}, Lcom/daaw/wr7;->a(Ljava/lang/Object;)Lcom/daaw/as7;

    iget-object p1, p0, Lcom/daaw/au7;->n:Lcom/daaw/wr7;

    invoke-virtual {p1, p2}, Lcom/daaw/wr7;->a(Ljava/lang/Object;)Lcom/daaw/as7;

    const/4 p1, 0x0

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Ljava/lang/Object;Lcom/daaw/rr7;)V
    .locals 9

    iget-boolean v0, p0, Lcom/daaw/au7;->h:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lcom/daaw/au7;->f:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/au7;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, Lcom/daaw/au7;->k(I)I

    move-result v3

    iget-object v4, p0, Lcom/daaw/au7;->a:[I

    aget v4, v4, v2

    invoke-static {v3}, Lcom/daaw/au7;->j(I)I

    move-result v5

    const/4 v6, 0x1

    const v7, 0xfffff

    packed-switch v5, :pswitch_data_0

    goto/16 :goto_13

    :pswitch_0
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_1

    :pswitch_1
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/au7;->l(Ljava/lang/Object;J)J

    move-result-wide v5

    goto/16 :goto_2

    :pswitch_2
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/au7;->U(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_3

    :pswitch_3
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/au7;->l(Ljava/lang/Object;J)J

    move-result-wide v5

    goto/16 :goto_4

    :pswitch_4
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/au7;->U(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_5

    :pswitch_5
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/au7;->U(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_6

    :pswitch_6
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/au7;->U(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_7

    :pswitch_7
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_8

    :pswitch_8
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_9

    :pswitch_9
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_a

    :pswitch_a
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/au7;->I(Ljava/lang/Object;J)Z

    move-result v3

    goto/16 :goto_b

    :pswitch_b
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/au7;->U(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_c

    :pswitch_c
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/au7;->l(Ljava/lang/Object;J)J

    move-result-wide v5

    goto/16 :goto_d

    :pswitch_d
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/au7;->U(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_e

    :pswitch_e
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/au7;->l(Ljava/lang/Object;J)J

    move-result-wide v5

    goto/16 :goto_f

    :pswitch_f
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/au7;->l(Ljava/lang/Object;J)J

    move-result-wide v5

    goto/16 :goto_10

    :pswitch_10
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/au7;->R(Ljava/lang/Object;J)F

    move-result v3

    goto/16 :goto_11

    :pswitch_11
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/au7;->Q(Ljava/lang/Object;J)D

    move-result-wide v5

    goto/16 :goto_12

    :pswitch_12
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, p2, v4, v3, v2}, Lcom/daaw/au7;->K(Lcom/daaw/rr7;ILjava/lang/Object;I)V

    goto/16 :goto_13

    :pswitch_13
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {p0, v2}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v5

    invoke-static {v4, v3, p2, v5}, Lcom/daaw/ev7;->q(ILjava/util/List;Lcom/daaw/rr7;Lcom/daaw/cv7;)V

    goto/16 :goto_13

    :pswitch_14
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ev7;->x(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_15
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ev7;->w(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_16
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ev7;->v(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_17
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ev7;->u(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_18
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ev7;->m(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_19
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ev7;->z(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_1a
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ev7;->j(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_1b
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ev7;->n(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_1c
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ev7;->o(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_1d
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ev7;->r(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_1e
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ev7;->B(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_1f
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ev7;->s(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_20
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ev7;->p(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_21
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ev7;->l(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_22
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ev7;->x(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_23
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ev7;->w(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_24
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ev7;->v(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_25
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ev7;->u(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_26
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ev7;->m(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_27
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ev7;->z(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_28
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2}, Lcom/daaw/ev7;->k(ILjava/util/List;Lcom/daaw/rr7;)V

    goto/16 :goto_13

    :pswitch_29
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {p0, v2}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v5

    invoke-static {v4, v3, p2, v5}, Lcom/daaw/ev7;->t(ILjava/util/List;Lcom/daaw/rr7;Lcom/daaw/cv7;)V

    goto/16 :goto_13

    :pswitch_2a
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2}, Lcom/daaw/ev7;->y(ILjava/util/List;Lcom/daaw/rr7;)V

    goto/16 :goto_13

    :pswitch_2b
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ev7;->j(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_2c
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ev7;->n(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_2d
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ev7;->o(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_2e
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ev7;->r(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_2f
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ev7;->B(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_30
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ev7;->s(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_31
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ev7;->p(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_32
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ev7;->l(ILjava/util/List;Lcom/daaw/rr7;Z)V

    goto/16 :goto_13

    :pswitch_33
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    :goto_1
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v2}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v5

    invoke-virtual {p2, v4, v3, v5}, Lcom/daaw/rr7;->B(ILjava/lang/Object;Lcom/daaw/cv7;)V

    goto/16 :goto_13

    :pswitch_34
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->n(Ljava/lang/Object;J)J

    move-result-wide v5

    :goto_2
    invoke-virtual {p2, v4, v5, v6}, Lcom/daaw/rr7;->c(IJ)V

    goto/16 :goto_13

    :pswitch_35
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v3

    :goto_3
    invoke-virtual {p2, v4, v3}, Lcom/daaw/rr7;->a(II)V

    goto/16 :goto_13

    :pswitch_36
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->n(Ljava/lang/Object;J)J

    move-result-wide v5

    :goto_4
    invoke-virtual {p2, v4, v5, v6}, Lcom/daaw/rr7;->J(IJ)V

    goto/16 :goto_13

    :pswitch_37
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v3

    :goto_5
    invoke-virtual {p2, v4, v3}, Lcom/daaw/rr7;->H(II)V

    goto/16 :goto_13

    :pswitch_38
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v3

    :goto_6
    invoke-virtual {p2, v4, v3}, Lcom/daaw/rr7;->t(II)V

    goto/16 :goto_13

    :pswitch_39
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v3

    :goto_7
    invoke-virtual {p2, v4, v3}, Lcom/daaw/rr7;->h(II)V

    goto/16 :goto_13

    :pswitch_3a
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    :goto_8
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/yq7;

    invoke-virtual {p2, v4, v3}, Lcom/daaw/rr7;->o(ILcom/daaw/yq7;)V

    goto/16 :goto_13

    :pswitch_3b
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    :goto_9
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v2}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v5

    invoke-virtual {p2, v4, v3, v5}, Lcom/daaw/rr7;->G(ILjava/lang/Object;Lcom/daaw/cv7;)V

    goto/16 :goto_13

    :pswitch_3c
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    :goto_a
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4, v3, p2}, Lcom/daaw/au7;->L(ILjava/lang/Object;Lcom/daaw/rr7;)V

    goto/16 :goto_13

    :pswitch_3d
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->H(Ljava/lang/Object;J)Z

    move-result v3

    :goto_b
    invoke-virtual {p2, v4, v3}, Lcom/daaw/rr7;->m(IZ)V

    goto/16 :goto_13

    :pswitch_3e
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v3

    :goto_c
    invoke-virtual {p2, v4, v3}, Lcom/daaw/rr7;->v(II)V

    goto :goto_13

    :pswitch_3f
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->n(Ljava/lang/Object;J)J

    move-result-wide v5

    :goto_d
    invoke-virtual {p2, v4, v5, v6}, Lcom/daaw/rr7;->x(IJ)V

    goto :goto_13

    :pswitch_40
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v3

    :goto_e
    invoke-virtual {p2, v4, v3}, Lcom/daaw/rr7;->C(II)V

    goto :goto_13

    :pswitch_41
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->n(Ljava/lang/Object;J)J

    move-result-wide v5

    :goto_f
    invoke-virtual {p2, v4, v5, v6}, Lcom/daaw/rr7;->j(IJ)V

    goto :goto_13

    :pswitch_42
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->n(Ljava/lang/Object;J)J

    move-result-wide v5

    :goto_10
    invoke-virtual {p2, v4, v5, v6}, Lcom/daaw/rr7;->E(IJ)V

    goto :goto_13

    :pswitch_43
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->k(Ljava/lang/Object;J)F

    move-result v3

    :goto_11
    invoke-virtual {p2, v4, v3}, Lcom/daaw/rr7;->z(IF)V

    goto :goto_13

    :pswitch_44
    invoke-virtual {p0, p1, v2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/gw7;->j(Ljava/lang/Object;J)D

    move-result-wide v5

    :goto_12
    invoke-virtual {p2, v4, v5, v6}, Lcom/daaw/rr7;->q(ID)V

    :cond_0
    :goto_13
    add-int/lit8 v2, v2, 0x3

    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/au7;->m:Lcom/daaw/tv7;

    invoke-virtual {v0, p1}, Lcom/daaw/tv7;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lcom/daaw/tv7;->r(Ljava/lang/Object;Lcom/daaw/rr7;)V

    return-void

    :cond_2
    iget-object p2, p0, Lcom/daaw/au7;->n:Lcom/daaw/wr7;

    invoke-virtual {p2, p1}, Lcom/daaw/wr7;->a(Ljava/lang/Object;)Lcom/daaw/as7;

    const/4 p1, 0x0

    throw p1

    :cond_3
    invoke-virtual {p0, p1, p2}, Lcom/daaw/au7;->J(Ljava/lang/Object;Lcom/daaw/rr7;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ljava/lang/Object;[BIILcom/daaw/kq7;)V
    .locals 8

    iget-boolean v0, p0, Lcom/daaw/au7;->h:Z

    if-eqz v0, :cond_0

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/au7;->X(Ljava/lang/Object;[BIILcom/daaw/kq7;)I

    return-void

    :cond_0
    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v7, p5

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/au7;->M(Ljava/lang/Object;[BIIILcom/daaw/kq7;)I

    return-void
.end method

.method public final h(Ljava/lang/Object;Lcom/daaw/iu7;Lcom/daaw/vr7;)V
    .locals 17

    move-object/from16 v7, p0

    move-object/from16 v15, p1

    move-object/from16 v0, p2

    move-object/from16 v6, p3

    invoke-static/range {p3 .. p3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lcom/daaw/au7;->t(Ljava/lang/Object;)V

    iget-object v14, v7, Lcom/daaw/au7;->m:Lcom/daaw/tv7;

    iget-object v5, v7, Lcom/daaw/au7;->n:Lcom/daaw/wr7;

    const/16 v16, 0x0

    move-object/from16 v4, v16

    move-object v8, v4

    :goto_0
    :try_start_0
    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzc()I

    move-result v2

    invoke-virtual {v7, v2}, Lcom/daaw/au7;->Z(I)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    if-gez v1, :cond_8

    const v1, 0x7fffffff

    if-ne v2, v1, :cond_1

    iget v0, v7, Lcom/daaw/au7;->j:I

    :goto_1
    iget v1, v7, Lcom/daaw/au7;->k:I

    if-ge v0, v1, :cond_0

    iget-object v1, v7, Lcom/daaw/au7;->i:[I

    aget v3, v1, v0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v5, v14

    move-object/from16 v6, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/au7;->o(Ljava/lang/Object;ILjava/lang/Object;Lcom/daaw/tv7;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_0
    if-eqz v4, :cond_15

    invoke-virtual {v14, v15, v4}, Lcom/daaw/tv7;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_1
    :try_start_1
    iget-boolean v1, v7, Lcom/daaw/au7;->f:Z

    if-nez v1, :cond_2

    move-object/from16 v11, v16

    goto :goto_2

    :cond_2
    iget-object v1, v7, Lcom/daaw/au7;->e:Lcom/daaw/xt7;

    invoke-virtual {v5, v6, v1, v2}, Lcom/daaw/wr7;->c(Lcom/daaw/vr7;Lcom/daaw/xt7;I)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object v11, v1

    :goto_2
    if-eqz v11, :cond_5

    if-nez v8, :cond_3

    :try_start_2
    invoke-virtual {v5, v15}, Lcom/daaw/wr7;->b(Ljava/lang/Object;)Lcom/daaw/as7;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    goto :goto_3

    :cond_3
    move-object v1, v8

    :goto_3
    move-object v8, v5

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move-object/from16 v12, p3

    move-object v13, v1

    move-object v3, v14

    move-object v14, v4

    move-object v2, v15

    move-object v15, v3

    :try_start_3
    invoke-virtual/range {v8 .. v15}, Lcom/daaw/wr7;->d(Ljava/lang/Object;Lcom/daaw/iu7;Ljava/lang/Object;Lcom/daaw/vr7;Lcom/daaw/as7;Ljava/lang/Object;Lcom/daaw/tv7;)Ljava/lang/Object;

    move-result-object v4

    move-object v8, v1

    :cond_4
    move-object v15, v2

    move-object v14, v3

    goto :goto_0

    :cond_5
    move-object v3, v14

    move-object v2, v15

    invoke-virtual {v3, v0}, Lcom/daaw/tv7;->q(Lcom/daaw/iu7;)Z

    if-nez v4, :cond_6

    invoke-virtual {v3, v2}, Lcom/daaw/tv7;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-object v4, v1

    :cond_6
    :try_start_4
    invoke-virtual {v3, v4, v0}, Lcom/daaw/tv7;->p(Ljava/lang/Object;Lcom/daaw/iu7;)Z

    move-result v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez v1, :cond_4

    iget v0, v7, Lcom/daaw/au7;->j:I

    :goto_4
    iget v1, v7, Lcom/daaw/au7;->k:I

    if-ge v0, v1, :cond_7

    iget-object v1, v7, Lcom/daaw/au7;->i:[I

    aget v5, v1, v0

    move-object/from16 v1, p0

    move-object v9, v2

    move-object/from16 v2, p1

    move-object v10, v3

    move v3, v5

    move-object v5, v10

    move-object/from16 v6, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/au7;->o(Ljava/lang/Object;ILjava/lang/Object;Lcom/daaw/tv7;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v0, v0, 0x1

    move-object v2, v9

    move-object v3, v10

    goto :goto_4

    :cond_7
    move-object v9, v2

    move-object v10, v3

    if-eqz v4, :cond_15

    invoke-virtual {v10, v9, v4}, Lcom/daaw/tv7;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    move-object v9, v2

    move-object v10, v3

    goto/16 :goto_1e

    :catchall_1
    move-exception v0

    move-object v9, v2

    move-object v10, v3

    goto/16 :goto_1c

    :catchall_2
    move-exception v0

    move-object v10, v14

    move-object v9, v15

    goto/16 :goto_1c

    :cond_8
    move-object v10, v14

    move-object v9, v15

    :try_start_5
    invoke-virtual {v7, v1}, Lcom/daaw/au7;->k(I)I

    move-result v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    :try_start_6
    invoke-static {v3}, Lcom/daaw/au7;->j(I)I

    move-result v11
    :try_end_6
    .catch Lcom/daaw/ws7; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    const v12, 0xfffff

    packed-switch v11, :pswitch_data_0

    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    if-nez v13, :cond_10

    :try_start_7
    invoke-virtual {v10, v9}, Lcom/daaw/tv7;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_7
    .catch Lcom/daaw/ws7; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto/16 :goto_17

    :pswitch_0
    :try_start_8
    invoke-virtual {v7, v9, v2, v1}, Lcom/daaw/au7;->r(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/xt7;

    invoke-virtual {v7, v1}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v11

    invoke-interface {v0, v3, v11, v6}, Lcom/daaw/iu7;->h(Ljava/lang/Object;Lcom/daaw/cv7;Lcom/daaw/vr7;)V

    :goto_5
    invoke-virtual {v7, v9, v2, v1, v3}, Lcom/daaw/au7;->A(Ljava/lang/Object;IILjava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_1
    and-int/2addr v3, v12

    int-to-long v11, v3

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzn()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v9, v11, v12, v3}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_6

    :pswitch_2
    and-int/2addr v3, v12

    int-to-long v11, v3

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzi()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v9, v11, v12, v3}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_6
    invoke-virtual {v7, v9, v2, v1}, Lcom/daaw/au7;->y(Ljava/lang/Object;II)V

    goto/16 :goto_8

    :pswitch_3
    and-int/2addr v3, v12

    int-to-long v11, v3

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzm()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v9, v11, v12, v3}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_6

    :pswitch_4
    and-int/2addr v3, v12

    int-to-long v11, v3

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzh()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v9, v11, v12, v3}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_6

    :pswitch_5
    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zze()I

    move-result v11

    invoke-virtual {v7, v1}, Lcom/daaw/au7;->m(I)Lcom/daaw/ps7;

    move-result-object v13

    if-eqz v13, :cond_a

    invoke-interface {v13, v11}, Lcom/daaw/ps7;->a(I)Z

    move-result v13

    if-eqz v13, :cond_9

    goto :goto_7

    :cond_9
    invoke-static {v9, v2, v11, v4, v10}, Lcom/daaw/ev7;->d(Ljava/lang/Object;IILjava/lang/Object;Lcom/daaw/tv7;)Ljava/lang/Object;

    move-result-object v4

    move-object v11, v5

    move-object v14, v6

    goto/16 :goto_1a

    :cond_a
    :goto_7
    and-int/2addr v3, v12

    int-to-long v12, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v9, v12, v13, v3}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_6

    :pswitch_6
    and-int/2addr v3, v12

    int-to-long v11, v3

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzj()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v9, v11, v12, v3}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_6

    :pswitch_7
    and-int/2addr v3, v12

    int-to-long v11, v3

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzp()Lcom/daaw/yq7;

    move-result-object v3

    invoke-static {v9, v11, v12, v3}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_6

    :pswitch_8
    invoke-virtual {v7, v9, v2, v1}, Lcom/daaw/au7;->r(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/xt7;

    invoke-virtual {v7, v1}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v11

    invoke-interface {v0, v3, v11, v6}, Lcom/daaw/iu7;->k(Ljava/lang/Object;Lcom/daaw/cv7;Lcom/daaw/vr7;)V

    goto/16 :goto_5

    :pswitch_9
    invoke-virtual {v7, v9, v3, v0}, Lcom/daaw/au7;->w(Ljava/lang/Object;ILcom/daaw/iu7;)V

    goto :goto_6

    :goto_8
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    goto/16 :goto_16

    :pswitch_a
    and-int/2addr v3, v12

    int-to-long v11, v3

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzN()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v9, v11, v12, v3}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_b
    and-int/2addr v3, v12

    int-to-long v11, v3

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzf()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v9, v11, v12, v3}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_c
    and-int/2addr v3, v12

    int-to-long v11, v3

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzk()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v9, v11, v12, v3}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_d
    and-int/2addr v3, v12

    int-to-long v11, v3

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzg()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v9, v11, v12, v3}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_e
    and-int/2addr v3, v12

    int-to-long v11, v3

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzo()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v9, v11, v12, v3}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_f
    and-int/2addr v3, v12

    int-to-long v11, v3

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzl()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v9, v11, v12, v3}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_10
    and-int/2addr v3, v12

    int-to-long v11, v3

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzb()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v9, v11, v12, v3}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_11
    and-int/2addr v3, v12

    int-to-long v11, v3

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zza()D

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-static {v9, v11, v12, v3}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_12
    invoke-virtual {v7, v1}, Lcom/daaw/au7;->p(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v7, v1}, Lcom/daaw/au7;->k(I)I

    move-result v1

    and-int/2addr v1, v12

    int-to-long v11, v1

    invoke-static {v9, v11, v12}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-static {v1}, Lcom/daaw/st7;->b(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-static {}, Lcom/daaw/rt7;->a()Lcom/daaw/rt7;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/rt7;->b()Lcom/daaw/rt7;

    move-result-object v3

    invoke-static {v3, v1}, Lcom/daaw/st7;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v9, v11, v12, v3}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object v1, v3

    goto :goto_9

    :cond_b
    invoke-static {}, Lcom/daaw/rt7;->a()Lcom/daaw/rt7;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/rt7;->b()Lcom/daaw/rt7;

    move-result-object v1

    invoke-static {v9, v11, v12, v1}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_c
    :goto_9
    check-cast v1, Lcom/daaw/rt7;

    check-cast v2, Lcom/daaw/qt7;

    throw v16

    :pswitch_13
    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v7, v1}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v1

    iget-object v11, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    invoke-virtual {v11, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2, v1, v6}, Lcom/daaw/iu7;->a(Ljava/util/List;Lcom/daaw/cv7;Lcom/daaw/vr7;)V

    goto/16 :goto_8

    :pswitch_14
    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/iu7;->m(Ljava/util/List;)V

    goto/16 :goto_8

    :pswitch_15
    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/iu7;->o(Ljava/util/List;)V

    goto/16 :goto_8

    :pswitch_16
    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/iu7;->i(Ljava/util/List;)V

    goto/16 :goto_8

    :pswitch_17
    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/iu7;->j(Ljava/util/List;)V

    goto/16 :goto_8

    :pswitch_18
    iget-object v11, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int/2addr v3, v12

    int-to-long v12, v3

    invoke-virtual {v11, v9, v12, v13}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v3

    invoke-interface {v0, v3}, Lcom/daaw/iu7;->b(Ljava/util/List;)V

    invoke-virtual {v7, v1}, Lcom/daaw/au7;->m(I)Lcom/daaw/ps7;

    move-result-object v11
    :try_end_8
    .catch Lcom/daaw/ws7; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    move-object/from16 v1, p1

    move-object v13, v4

    move-object v4, v11

    move-object v11, v5

    move-object v5, v13

    move-object v14, v6

    move-object v6, v10

    :try_start_9
    invoke-static/range {v1 .. v6}, Lcom/daaw/ev7;->c(Ljava/lang/Object;ILjava/util/List;Lcom/daaw/ps7;Ljava/lang/Object;Lcom/daaw/tv7;)Ljava/lang/Object;

    move-result-object v4

    goto/16 :goto_1a

    :pswitch_19
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_a
    invoke-interface {v0, v1}, Lcom/daaw/iu7;->p(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_1a
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_b
    invoke-interface {v0, v1}, Lcom/daaw/iu7;->q(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_1b
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_c
    invoke-interface {v0, v1}, Lcom/daaw/iu7;->l(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_1c
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_d
    invoke-interface {v0, v1}, Lcom/daaw/iu7;->n(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_1d
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_e
    invoke-interface {v0, v1}, Lcom/daaw/iu7;->g(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_1e
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_f
    invoke-interface {v0, v1}, Lcom/daaw/iu7;->d(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_1f
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_10
    invoke-interface {v0, v1}, Lcom/daaw/iu7;->c(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_20
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_11
    invoke-interface {v0, v1}, Lcom/daaw/iu7;->s(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_21
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_12
    invoke-interface {v0, v1}, Lcom/daaw/iu7;->e(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_22
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/iu7;->m(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_23
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/iu7;->o(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_24
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/iu7;->i(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_25
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/iu7;->j(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_26
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    iget-object v4, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int/2addr v3, v12

    int-to-long v5, v3

    invoke-virtual {v4, v9, v5, v6}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v3

    invoke-interface {v0, v3}, Lcom/daaw/iu7;->b(Ljava/util/List;)V

    invoke-virtual {v7, v1}, Lcom/daaw/au7;->m(I)Lcom/daaw/ps7;

    move-result-object v4

    move-object/from16 v1, p1

    move-object v5, v13

    move-object v6, v10

    invoke-static/range {v1 .. v6}, Lcom/daaw/ev7;->c(Ljava/lang/Object;ILjava/util/List;Lcom/daaw/ps7;Ljava/lang/Object;Lcom/daaw/tv7;)Ljava/lang/Object;

    move-result-object v4

    goto/16 :goto_1a

    :pswitch_27
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_a

    :pswitch_28
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/iu7;->f(Ljava/util/List;)V

    goto/16 :goto_16

    :pswitch_29
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    invoke-virtual {v7, v1}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v1

    and-int v2, v3, v12

    int-to-long v2, v2

    iget-object v4, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    invoke-virtual {v4, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2, v1, v14}, Lcom/daaw/iu7;->r(Ljava/util/List;Lcom/daaw/cv7;Lcom/daaw/vr7;)V

    goto/16 :goto_16

    :pswitch_2a
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    invoke-static {v3}, Lcom/daaw/au7;->C(I)Z

    move-result v1

    if-eqz v1, :cond_d

    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    move-object v2, v0

    check-cast v2, Lcom/daaw/kr7;

    const/4 v3, 0x1

    invoke-virtual {v2, v1, v3}, Lcom/daaw/kr7;->t(Ljava/util/List;Z)V

    goto/16 :goto_16

    :cond_d
    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    move-object v2, v0

    check-cast v2, Lcom/daaw/kr7;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Lcom/daaw/kr7;->t(Ljava/util/List;Z)V

    goto/16 :goto_16

    :pswitch_2b
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_b

    :pswitch_2c
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_c

    :pswitch_2d
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_d

    :pswitch_2e
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_e

    :pswitch_2f
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_f

    :pswitch_30
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_10

    :pswitch_31
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_11

    :pswitch_32
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    iget-object v1, v7, Lcom/daaw/au7;->l:Lcom/daaw/lt7;

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-virtual {v1, v9, v2, v3}, Lcom/daaw/lt7;->a(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_12

    :pswitch_33
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    invoke-virtual {v7, v9, v1}, Lcom/daaw/au7;->q(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/xt7;

    invoke-virtual {v7, v1}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v3

    invoke-interface {v0, v2, v3, v14}, Lcom/daaw/iu7;->h(Ljava/lang/Object;Lcom/daaw/cv7;Lcom/daaw/vr7;)V

    :goto_13
    invoke-virtual {v7, v9, v1, v2}, Lcom/daaw/au7;->z(Ljava/lang/Object;ILjava/lang/Object;)V

    goto/16 :goto_16

    :pswitch_34
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzn()J

    move-result-wide v4

    invoke-static {v9, v2, v3, v4, v5}, Lcom/daaw/gw7;->C(Ljava/lang/Object;JJ)V

    :goto_14
    invoke-virtual {v7, v9, v1}, Lcom/daaw/au7;->x(Ljava/lang/Object;I)V

    goto/16 :goto_16

    :pswitch_35
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzi()I

    move-result v4

    invoke-static {v9, v2, v3, v4}, Lcom/daaw/gw7;->B(Ljava/lang/Object;JI)V

    goto :goto_14

    :pswitch_36
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzm()J

    move-result-wide v4

    invoke-static {v9, v2, v3, v4, v5}, Lcom/daaw/gw7;->C(Ljava/lang/Object;JJ)V

    goto :goto_14

    :pswitch_37
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzh()I

    move-result v4

    invoke-static {v9, v2, v3, v4}, Lcom/daaw/gw7;->B(Ljava/lang/Object;JI)V

    goto :goto_14

    :pswitch_38
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zze()I

    move-result v4

    invoke-virtual {v7, v1}, Lcom/daaw/au7;->m(I)Lcom/daaw/ps7;

    move-result-object v5

    if-eqz v5, :cond_f

    invoke-interface {v5, v4}, Lcom/daaw/ps7;->a(I)Z

    move-result v5

    if-eqz v5, :cond_e

    goto :goto_15

    :cond_e
    invoke-static {v9, v2, v4, v13, v10}, Lcom/daaw/ev7;->d(Ljava/lang/Object;IILjava/lang/Object;Lcom/daaw/tv7;)Ljava/lang/Object;

    move-result-object v4

    goto/16 :goto_1a

    :cond_f
    :goto_15
    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-static {v9, v2, v3, v4}, Lcom/daaw/gw7;->B(Ljava/lang/Object;JI)V

    goto :goto_14

    :pswitch_39
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzj()I

    move-result v4

    invoke-static {v9, v2, v3, v4}, Lcom/daaw/gw7;->B(Ljava/lang/Object;JI)V

    goto :goto_14

    :pswitch_3a
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzp()Lcom/daaw/yq7;

    move-result-object v4

    invoke-static {v9, v2, v3, v4}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_14

    :pswitch_3b
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    invoke-virtual {v7, v9, v1}, Lcom/daaw/au7;->q(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/xt7;

    invoke-virtual {v7, v1}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v3

    invoke-interface {v0, v2, v3, v14}, Lcom/daaw/iu7;->k(Ljava/lang/Object;Lcom/daaw/cv7;Lcom/daaw/vr7;)V

    goto/16 :goto_13

    :pswitch_3c
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    invoke-virtual {v7, v9, v3, v0}, Lcom/daaw/au7;->w(Ljava/lang/Object;ILcom/daaw/iu7;)V

    goto/16 :goto_14

    :catchall_3
    move-exception v0

    goto/16 :goto_1d

    :pswitch_3d
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzN()Z

    move-result v4

    invoke-static {v9, v2, v3, v4}, Lcom/daaw/gw7;->x(Ljava/lang/Object;JZ)V

    goto/16 :goto_14

    :pswitch_3e
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzf()I

    move-result v4

    invoke-static {v9, v2, v3, v4}, Lcom/daaw/gw7;->B(Ljava/lang/Object;JI)V

    goto/16 :goto_14

    :pswitch_3f
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzk()J

    move-result-wide v4

    invoke-static {v9, v2, v3, v4, v5}, Lcom/daaw/gw7;->C(Ljava/lang/Object;JJ)V

    goto/16 :goto_14

    :pswitch_40
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzg()I

    move-result v4

    invoke-static {v9, v2, v3, v4}, Lcom/daaw/gw7;->B(Ljava/lang/Object;JI)V

    goto/16 :goto_14

    :pswitch_41
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzo()J

    move-result-wide v4

    invoke-static {v9, v2, v3, v4, v5}, Lcom/daaw/gw7;->C(Ljava/lang/Object;JJ)V

    goto/16 :goto_14

    :pswitch_42
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzl()J

    move-result-wide v4

    invoke-static {v9, v2, v3, v4, v5}, Lcom/daaw/gw7;->C(Ljava/lang/Object;JJ)V

    goto/16 :goto_14

    :pswitch_43
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zzb()F

    move-result v4

    invoke-static {v9, v2, v3, v4}, Lcom/daaw/gw7;->A(Ljava/lang/Object;JF)V

    goto/16 :goto_14

    :pswitch_44
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    and-int v2, v3, v12

    int-to-long v2, v2

    invoke-interface/range {p2 .. p2}, Lcom/daaw/iu7;->zza()D

    move-result-wide v4

    invoke-static {v9, v2, v3, v4, v5}, Lcom/daaw/gw7;->z(Ljava/lang/Object;JD)V
    :try_end_9
    .catch Lcom/daaw/ws7; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto/16 :goto_14

    :goto_16
    move-object v4, v13

    goto :goto_1a

    :goto_17
    move-object v4, v1

    goto :goto_18

    :cond_10
    move-object v4, v13

    :goto_18
    :try_start_a
    invoke-virtual {v10, v4, v0}, Lcom/daaw/tv7;->p(Ljava/lang/Object;Lcom/daaw/iu7;)Z

    move-result v1
    :try_end_a
    .catch Lcom/daaw/ws7; {:try_start_a .. :try_end_a} :catch_2
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    if-nez v1, :cond_12

    iget v0, v7, Lcom/daaw/au7;->j:I

    :goto_19
    iget v1, v7, Lcom/daaw/au7;->k:I

    if-ge v0, v1, :cond_11

    iget-object v1, v7, Lcom/daaw/au7;->i:[I

    aget v3, v1, v0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v5, v10

    move-object/from16 v6, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/au7;->o(Ljava/lang/Object;ILjava/lang/Object;Lcom/daaw/tv7;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_19

    :cond_11
    if-eqz v4, :cond_15

    invoke-virtual {v10, v9, v4}, Lcom/daaw/tv7;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_12
    :goto_1a
    move-object v15, v9

    move-object v5, v11

    move-object v6, v14

    move-object v14, v10

    goto/16 :goto_0

    :catchall_4
    move-exception v0

    goto :goto_1e

    :catch_0
    move-object v13, v4

    move-object v11, v5

    move-object v14, v6

    :catch_1
    move-object v4, v13

    :catch_2
    :try_start_b
    invoke-virtual {v10, v0}, Lcom/daaw/tv7;->q(Lcom/daaw/iu7;)Z

    if-nez v4, :cond_13

    invoke-virtual {v10, v9}, Lcom/daaw/tv7;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    :cond_13
    invoke-virtual {v10, v4, v0}, Lcom/daaw/tv7;->p(Ljava/lang/Object;Lcom/daaw/iu7;)Z

    move-result v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    if-nez v1, :cond_12

    iget v0, v7, Lcom/daaw/au7;->j:I

    :goto_1b
    iget v1, v7, Lcom/daaw/au7;->k:I

    if-ge v0, v1, :cond_14

    iget-object v1, v7, Lcom/daaw/au7;->i:[I

    aget v3, v1, v0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v5, v10

    move-object/from16 v6, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/au7;->o(Ljava/lang/Object;ILjava/lang/Object;Lcom/daaw/tv7;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_1b

    :cond_14
    if-eqz v4, :cond_15

    invoke-virtual {v10, v9, v4}, Lcom/daaw/tv7;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_15
    return-void

    :catchall_5
    move-exception v0

    :goto_1c
    move-object v13, v4

    goto :goto_1d

    :catchall_6
    move-exception v0

    move-object v13, v4

    move-object v10, v14

    move-object v9, v15

    :goto_1d
    move-object v4, v13

    :goto_1e
    iget v1, v7, Lcom/daaw/au7;->j:I

    move v8, v1

    :goto_1f
    iget v1, v7, Lcom/daaw/au7;->k:I

    if-ge v8, v1, :cond_16

    iget-object v1, v7, Lcom/daaw/au7;->i:[I

    aget v3, v1, v8

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v5, v10

    move-object/from16 v6, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/au7;->o(Ljava/lang/Object;ILjava/lang/Object;Lcom/daaw/tv7;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v8, v8, 0x1

    goto :goto_1f

    :cond_16
    if-eqz v4, :cond_17

    invoke-virtual {v10, v9, v4}, Lcom/daaw/tv7;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_17
    goto :goto_21

    :goto_20
    throw v0

    :goto_21
    goto :goto_20

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(II)I
    .locals 5

    iget-object v0, p0, Lcom/daaw/au7;->a:[I

    array-length v0, v0

    div-int/lit8 v0, v0, 0x3

    const/4 v1, -0x1

    add-int/2addr v0, v1

    :goto_0
    if-gt p2, v0, :cond_2

    add-int v2, v0, p2

    ushr-int/lit8 v2, v2, 0x1

    mul-int/lit8 v3, v2, 0x3

    iget-object v4, p0, Lcom/daaw/au7;->a:[I

    aget v4, v4, v3

    if-ne p1, v4, :cond_0

    return v3

    :cond_0
    if-ge p1, v4, :cond_1

    add-int/lit8 v2, v2, -0x1

    move v0, v2

    goto :goto_0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    move p2, v2

    goto :goto_0

    :cond_2
    return v1
.end method

.method public final k(I)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/au7;->a:[I

    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    return p1
.end method

.method public final m(I)Lcom/daaw/ps7;
    .locals 1

    div-int/lit8 p1, p1, 0x3

    iget-object v0, p0, Lcom/daaw/au7;->b:[Ljava/lang/Object;

    add-int/2addr p1, p1

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    check-cast p1, Lcom/daaw/ps7;

    return-object p1
.end method

.method public final n(I)Lcom/daaw/cv7;
    .locals 3

    div-int/lit8 p1, p1, 0x3

    add-int/2addr p1, p1

    iget-object v0, p0, Lcom/daaw/au7;->b:[Ljava/lang/Object;

    aget-object v0, v0, p1

    check-cast v0, Lcom/daaw/cv7;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, Lcom/daaw/fu7;->a()Lcom/daaw/fu7;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/au7;->b:[Ljava/lang/Object;

    add-int/lit8 v2, p1, 0x1

    aget-object v1, v1, v2

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v0, v1}, Lcom/daaw/fu7;->b(Ljava/lang/Class;)Lcom/daaw/cv7;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/au7;->b:[Ljava/lang/Object;

    aput-object v0, v1, p1

    return-object v0
.end method

.method public final o(Ljava/lang/Object;ILjava/lang/Object;Lcom/daaw/tv7;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    iget-object p4, p0, Lcom/daaw/au7;->a:[I

    aget p4, p4, p2

    invoke-virtual {p0, p2}, Lcom/daaw/au7;->k(I)I

    move-result p4

    const p5, 0xfffff

    and-int/2addr p4, p5

    int-to-long p4, p4

    invoke-static {p1, p4, p5}, Lcom/daaw/gw7;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    return-object p3

    :cond_0
    invoke-virtual {p0, p2}, Lcom/daaw/au7;->m(I)Lcom/daaw/ps7;

    move-result-object p4

    if-nez p4, :cond_1

    return-object p3

    :cond_1
    check-cast p1, Lcom/daaw/rt7;

    invoke-virtual {p0, p2}, Lcom/daaw/au7;->p(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/qt7;

    const/4 p1, 0x0

    throw p1
.end method

.method public final p(I)Ljava/lang/Object;
    .locals 1

    div-int/lit8 p1, p1, 0x3

    iget-object v0, p0, Lcom/daaw/au7;->b:[Ljava/lang/Object;

    add-int/2addr p1, p1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final q(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0, p2}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v0

    invoke-virtual {p0, p2}, Lcom/daaw/au7;->k(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {v0}, Lcom/daaw/cv7;->zze()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p2, Lcom/daaw/au7;->r:Lsun/misc/Unsafe;

    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/au7;->G(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, Lcom/daaw/cv7;->zze()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, Lcom/daaw/cv7;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method public final r(Ljava/lang/Object;II)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0, p3}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {v0}, Lcom/daaw/cv7;->zze()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p2, Lcom/daaw/au7;->r:Lsun/misc/Unsafe;

    invoke-virtual {p0, p3}, Lcom/daaw/au7;->k(I)I

    move-result p3

    const v1, 0xfffff

    and-int/2addr p3, v1

    int-to-long v1, p3

    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/au7;->G(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, Lcom/daaw/cv7;->zze()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, Lcom/daaw/cv7;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method public final u(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 5

    invoke-virtual {p0, p2, p3}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p3}, Lcom/daaw/au7;->k(I)I

    move-result v0

    const v1, 0xfffff

    and-int/2addr v0, v1

    int-to-long v0, v0

    sget-object v2, Lcom/daaw/au7;->r:Lsun/misc/Unsafe;

    invoke-virtual {v2, p2, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {p0, p3}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object p2

    invoke-virtual {p0, p1, p3}, Lcom/daaw/au7;->D(Ljava/lang/Object;I)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v3}, Lcom/daaw/au7;->G(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v2, p1, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Lcom/daaw/cv7;->zze()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4, v3}, Lcom/daaw/cv7;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p1, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-virtual {p0, p1, p3}, Lcom/daaw/au7;->x(Ljava/lang/Object;I)V

    return-void

    :cond_2
    invoke-virtual {v2, p1, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lcom/daaw/au7;->G(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    invoke-interface {p2}, Lcom/daaw/cv7;->zze()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4, p3}, Lcom/daaw/cv7;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p1, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p3, v4

    :cond_3
    invoke-interface {p2, p3, v3}, Lcom/daaw/cv7;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object v0, p0, Lcom/daaw/au7;->a:[I

    aget p3, v0, p3

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Source subfield "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " is present but null: "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final v(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/au7;->a:[I

    aget v0, v0, p3

    invoke-virtual {p0, p2, v0, p3}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p3}, Lcom/daaw/au7;->k(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    sget-object v3, Lcom/daaw/au7;->r:Lsun/misc/Unsafe;

    invoke-virtual {v3, p2, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {p0, p3}, Lcom/daaw/au7;->n(I)Lcom/daaw/cv7;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p3}, Lcom/daaw/au7;->H(Ljava/lang/Object;II)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-static {v4}, Lcom/daaw/au7;->G(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v3, p1, v1, v2, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Lcom/daaw/cv7;->zze()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {p2, v5, v4}, Lcom/daaw/cv7;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, p1, v1, v2, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-virtual {p0, p1, v0, p3}, Lcom/daaw/au7;->y(Ljava/lang/Object;II)V

    return-void

    :cond_2
    invoke-virtual {v3, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lcom/daaw/au7;->G(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p2}, Lcom/daaw/cv7;->zze()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v0, p3}, Lcom/daaw/cv7;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, p1, v1, v2, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p3, v0

    :cond_3
    invoke-interface {p2, p3, v4}, Lcom/daaw/cv7;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object v0, p0, Lcom/daaw/au7;->a:[I

    aget p3, v0, p3

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Source subfield "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " is present but null: "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final w(Ljava/lang/Object;ILcom/daaw/iu7;)V
    .locals 2

    invoke-static {p2}, Lcom/daaw/au7;->C(I)Z

    move-result v0

    const v1, 0xfffff

    if-eqz v0, :cond_0

    and-int/2addr p2, v1

    int-to-long v0, p2

    invoke-interface {p3}, Lcom/daaw/iu7;->zzs()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-static {p1, v0, v1, p2}, Lcom/daaw/gw7;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/au7;->g:Z

    and-int/2addr p2, v1

    if-eqz v0, :cond_1

    int-to-long v0, p2

    invoke-interface {p3}, Lcom/daaw/iu7;->zzr()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_1
    int-to-long v0, p2

    invoke-interface {p3}, Lcom/daaw/iu7;->zzp()Lcom/daaw/yq7;

    move-result-object p2

    goto :goto_0
.end method

.method public final x(Ljava/lang/Object;I)V
    .locals 5

    invoke-virtual {p0, p2}, Lcom/daaw/au7;->b0(I)I

    move-result p2

    const v0, 0xfffff

    and-int/2addr v0, p2

    int-to-long v0, v0

    const-wide/32 v2, 0xfffff

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-void

    :cond_0
    invoke-static {p1, v0, v1}, Lcom/daaw/gw7;->l(Ljava/lang/Object;J)I

    move-result v2

    const/4 v3, 0x1

    ushr-int/lit8 p2, p2, 0x14

    shl-int p2, v3, p2

    or-int/2addr p2, v2

    invoke-static {p1, v0, v1, p2}, Lcom/daaw/gw7;->B(Ljava/lang/Object;JI)V

    return-void
.end method

.method public final y(Ljava/lang/Object;II)V
    .locals 2

    invoke-virtual {p0, p3}, Lcom/daaw/au7;->b0(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1, p2}, Lcom/daaw/gw7;->B(Ljava/lang/Object;JI)V

    return-void
.end method

.method public final z(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 3

    sget-object v0, Lcom/daaw/au7;->r:Lsun/misc/Unsafe;

    invoke-virtual {p0, p2}, Lcom/daaw/au7;->k(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v0, p1, v1, v2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lcom/daaw/au7;->x(Ljava/lang/Object;I)V

    return-void
.end method

.method public final zza(Ljava/lang/Object;)I
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/au7;->h:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/au7;->T(Ljava/lang/Object;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/au7;->S(Ljava/lang/Object;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final zze()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/au7;->e:Lcom/daaw/xt7;

    check-cast v0, Lcom/daaw/ls7;

    invoke-virtual {v0}, Lcom/daaw/ls7;->n()Lcom/daaw/ls7;

    move-result-object v0

    return-object v0
.end method
