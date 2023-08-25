.class public final Lcom/daaw/fe8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ve8;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/ve8<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final p:[I

.field public static final q:Lsun/misc/Unsafe;


# instance fields
.field public final a:[I

.field public final b:[Ljava/lang/Object;

.field public final c:I

.field public final d:I

.field public final e:Lcom/daaw/zd8;

.field public final f:Z

.field public final g:Z

.field public final h:[I

.field public final i:I

.field public final j:I

.field public final k:Lcom/daaw/zc8;

.field public final l:Lcom/daaw/og8;

.field public final m:Lcom/daaw/o88;

.field public final n:Lcom/daaw/je8;

.field public final o:Lcom/daaw/pd8;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Lcom/daaw/fe8;->p:[I

    invoke-static {}, Lcom/daaw/ih8;->l()Lsun/misc/Unsafe;

    move-result-object v0

    sput-object v0, Lcom/daaw/fe8;->q:Lsun/misc/Unsafe;

    return-void
.end method

.method public constructor <init>([I[Ljava/lang/Object;IILcom/daaw/zd8;ZZ[IIILcom/daaw/je8;Lcom/daaw/zc8;Lcom/daaw/og8;Lcom/daaw/o88;Lcom/daaw/pd8;[B)V
    .locals 5

    move-object v0, p0

    move-object v1, p5

    move-object/from16 v2, p14

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v3, p1

    iput-object v3, v0, Lcom/daaw/fe8;->a:[I

    move-object v3, p2

    iput-object v3, v0, Lcom/daaw/fe8;->b:[Ljava/lang/Object;

    move v3, p3

    iput v3, v0, Lcom/daaw/fe8;->c:I

    move v3, p4

    iput v3, v0, Lcom/daaw/fe8;->d:I

    move v3, p6

    iput-boolean v3, v0, Lcom/daaw/fe8;->g:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2, p5}, Lcom/daaw/o88;->c(Lcom/daaw/zd8;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v3, 0x1

    :cond_0
    iput-boolean v3, v0, Lcom/daaw/fe8;->f:Z

    move-object v3, p8

    iput-object v3, v0, Lcom/daaw/fe8;->h:[I

    move v3, p9

    iput v3, v0, Lcom/daaw/fe8;->i:I

    move v3, p10

    iput v3, v0, Lcom/daaw/fe8;->j:I

    move-object/from16 v3, p11

    iput-object v3, v0, Lcom/daaw/fe8;->n:Lcom/daaw/je8;

    move-object/from16 v3, p12

    iput-object v3, v0, Lcom/daaw/fe8;->k:Lcom/daaw/zc8;

    move-object/from16 v3, p13

    iput-object v3, v0, Lcom/daaw/fe8;->l:Lcom/daaw/og8;

    iput-object v2, v0, Lcom/daaw/fe8;->m:Lcom/daaw/o88;

    iput-object v1, v0, Lcom/daaw/fe8;->e:Lcom/daaw/zd8;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/daaw/fe8;->o:Lcom/daaw/pd8;

    return-void
.end method

.method public static C(Ljava/lang/Object;ILcom/daaw/ve8;)Z
    .locals 2

    const v0, 0xfffff

    and-int/2addr p1, v0

    int-to-long v0, p1

    invoke-static {p0, v0, v1}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, Lcom/daaw/ve8;->c(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static D(Ljava/lang/Object;)Z
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    instance-of v0, p0, Lcom/daaw/ja8;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/daaw/ja8;

    invoke-virtual {p0}, Lcom/daaw/ja8;->x()Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static F(Ljava/lang/Object;J)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final G(ILjava/lang/Object;Lcom/daaw/ki8;)V
    .locals 1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-interface {p2, p0, p1}, Lcom/daaw/ki8;->j(ILjava/lang/String;)V

    return-void

    :cond_0
    check-cast p1, Lcom/daaw/y68;

    invoke-interface {p2, p0, p1}, Lcom/daaw/ki8;->y(ILcom/daaw/y68;)V

    return-void
.end method

.method public static I(Ljava/lang/Object;)Lcom/daaw/qg8;
    .locals 2

    check-cast p0, Lcom/daaw/ja8;

    iget-object v0, p0, Lcom/daaw/ja8;->zzc:Lcom/daaw/qg8;

    invoke-static {}, Lcom/daaw/qg8;->c()Lcom/daaw/qg8;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/daaw/qg8;->f()Lcom/daaw/qg8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ja8;->zzc:Lcom/daaw/qg8;

    :cond_0
    return-object v0
.end method

.method public static J(Ljava/lang/Class;Lcom/daaw/td8;Lcom/daaw/je8;Lcom/daaw/zc8;Lcom/daaw/og8;Lcom/daaw/o88;Lcom/daaw/pd8;)Lcom/daaw/fe8;
    .locals 6

    instance-of p0, p1, Lcom/daaw/te8;

    if-eqz p0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/daaw/te8;

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-static/range {v0 .. v5}, Lcom/daaw/fe8;->K(Lcom/daaw/te8;Lcom/daaw/je8;Lcom/daaw/zc8;Lcom/daaw/og8;Lcom/daaw/o88;Lcom/daaw/pd8;)Lcom/daaw/fe8;

    move-result-object p0

    return-object p0

    :cond_0
    check-cast p1, Lcom/daaw/ig8;

    const/4 p0, 0x0

    throw p0
.end method

.method public static K(Lcom/daaw/te8;Lcom/daaw/je8;Lcom/daaw/zc8;Lcom/daaw/og8;Lcom/daaw/o88;Lcom/daaw/pd8;)Lcom/daaw/fe8;
    .locals 34

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/te8;->zzc()I

    move-result v0

    const/4 v1, 0x0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_0

    const/4 v10, 0x1

    goto :goto_0

    :cond_0
    const/4 v10, 0x0

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/te8;->a()Ljava/lang/String;

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

    sget-object v6, Lcom/daaw/fe8;->p:[I

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
    sget-object v15, Lcom/daaw/fe8;->q:Lsun/misc/Unsafe;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/te8;->b()[Ljava/lang/Object;

    move-result-object v17

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/te8;->zza()Lcom/daaw/zd8;

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

    invoke-static {v1, v12}, Lcom/daaw/fe8;->p(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

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

    invoke-static {v1, v7}, Lcom/daaw/fe8;->p(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

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

    invoke-static {v1, v8}, Lcom/daaw/fe8;->p(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

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

    invoke-static {v1, v11}, Lcom/daaw/fe8;->p(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

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

    new-instance v0, Lcom/daaw/fe8;

    move-object v4, v0

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/te8;->zza()Lcom/daaw/zd8;

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

    invoke-direct/range {v4 .. v20}, Lcom/daaw/fe8;-><init>([I[Ljava/lang/Object;IILcom/daaw/zd8;ZZ[IIILcom/daaw/je8;Lcom/daaw/zc8;Lcom/daaw/og8;Lcom/daaw/o88;Lcom/daaw/pd8;[B)V

    return-object v0
.end method

.method public static L(Ljava/lang/Object;J)D
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Double;

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p0

    return-wide p0
.end method

.method public static M(Ljava/lang/Object;J)F
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    return p0
.end method

.method public static P(Ljava/lang/Object;J)I
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static h(I)I
    .locals 0

    ushr-int/lit8 p0, p0, 0x14

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public static j(Ljava/lang/Object;J)J
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method public static p(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
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

.method public static q(Ljava/lang/Object;)V
    .locals 2

    invoke-static {p0}, Lcom/daaw/fe8;->D(Ljava/lang/Object;)Z

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
.method public final A(Ljava/lang/Object;I)Z
    .locals 9

    invoke-virtual {p0, p2}, Lcom/daaw/fe8;->W(I)I

    move-result v0

    const v1, 0xfffff

    and-int v2, v0, v1

    int-to-long v2, v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    const-wide/32 v6, 0xfffff

    cmp-long v8, v2, v6

    if-nez v8, :cond_14

    invoke-virtual {p0, p2}, Lcom/daaw/fe8;->i(I)I

    move-result p2

    and-int v0, p2, v1

    int-to-long v0, v0

    invoke-static {p2}, Lcom/daaw/fe8;->h(I)I

    move-result p2

    const-wide/16 v2, 0x0

    packed-switch p2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    invoke-static {p1, v0, v1}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return v5

    :cond_0
    return v4

    :pswitch_1
    invoke-static {p1, v0, v1}, Lcom/daaw/ih8;->i(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long v0, p1, v2

    if-eqz v0, :cond_1

    return v5

    :cond_1
    return v4

    :pswitch_2
    invoke-static {p1, v0, v1}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_2

    return v5

    :cond_2
    return v4

    :pswitch_3
    invoke-static {p1, v0, v1}, Lcom/daaw/ih8;->i(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long v0, p1, v2

    if-eqz v0, :cond_3

    return v5

    :cond_3
    return v4

    :pswitch_4
    invoke-static {p1, v0, v1}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_4

    return v5

    :cond_4
    return v4

    :pswitch_5
    invoke-static {p1, v0, v1}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_5

    return v5

    :cond_5
    return v4

    :pswitch_6
    invoke-static {p1, v0, v1}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_6

    return v5

    :cond_6
    return v4

    :pswitch_7
    sget-object p2, Lcom/daaw/y68;->q:Lcom/daaw/y68;

    invoke-static {p1, v0, v1}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/daaw/y68;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v5

    :cond_7
    return v4

    :pswitch_8
    invoke-static {p1, v0, v1}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_8

    return v5

    :cond_8
    return v4

    :pswitch_9
    invoke-static {p1, v0, v1}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

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
    instance-of p2, p1, Lcom/daaw/y68;

    if-eqz p2, :cond_c

    sget-object p2, Lcom/daaw/y68;->q:Lcom/daaw/y68;

    invoke-virtual {p2, p1}, Lcom/daaw/y68;->equals(Ljava/lang/Object;)Z

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
    invoke-static {p1, v0, v1}, Lcom/daaw/ih8;->B(Ljava/lang/Object;J)Z

    move-result p1

    return p1

    :pswitch_b
    invoke-static {p1, v0, v1}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_d

    return v5

    :cond_d
    return v4

    :pswitch_c
    invoke-static {p1, v0, v1}, Lcom/daaw/ih8;->i(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long v0, p1, v2

    if-eqz v0, :cond_e

    return v5

    :cond_e
    return v4

    :pswitch_d
    invoke-static {p1, v0, v1}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_f

    return v5

    :cond_f
    return v4

    :pswitch_e
    invoke-static {p1, v0, v1}, Lcom/daaw/ih8;->i(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long v0, p1, v2

    if-eqz v0, :cond_10

    return v5

    :cond_10
    return v4

    :pswitch_f
    invoke-static {p1, v0, v1}, Lcom/daaw/ih8;->i(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long v0, p1, v2

    if-eqz v0, :cond_11

    return v5

    :cond_11
    return v4

    :pswitch_10
    invoke-static {p1, v0, v1}, Lcom/daaw/ih8;->g(Ljava/lang/Object;J)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    if-eqz p1, :cond_12

    return v5

    :cond_12
    return v4

    :pswitch_11
    invoke-static {p1, v0, v1}, Lcom/daaw/ih8;->f(Ljava/lang/Object;J)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    cmp-long v0, p1, v2

    if-eqz v0, :cond_13

    return v5

    :cond_13
    return v4

    :cond_14
    invoke-static {p1, v2, v3}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

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

.method public final B(Ljava/lang/Object;IIII)Z
    .locals 1

    const v0, 0xfffff

    if-ne p3, v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

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

.method public final E(Ljava/lang/Object;II)Z
    .locals 2

    invoke-virtual {p0, p3}, Lcom/daaw/fe8;->W(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result p1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final H(Ljava/lang/Object;[BIIILcom/daaw/e58;)I
    .locals 29

    move-object/from16 v15, p0

    move-object/from16 v14, p1

    move-object/from16 v12, p2

    move/from16 v13, p4

    move/from16 v11, p5

    move-object/from16 v9, p6

    invoke-static/range {p1 .. p1}, Lcom/daaw/fe8;->q(Ljava/lang/Object;)V

    sget-object v10, Lcom/daaw/fe8;->q:Lsun/misc/Unsafe;

    const/16 v16, 0x0

    move/from16 v0, p3

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v5, 0x0

    const v6, 0xfffff

    :goto_0
    const/16 v17, 0x0

    if-ge v0, v13, :cond_1b

    add-int/lit8 v1, v0, 0x1

    aget-byte v0, v12, v0

    if-gez v0, :cond_0

    invoke-static {v0, v12, v1, v9}, Lcom/daaw/h58;->k(I[BILcom/daaw/e58;)I

    move-result v0

    iget v1, v9, Lcom/daaw/e58;->a:I

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

    invoke-virtual {v15, v0, v3}, Lcom/daaw/fe8;->V(II)I

    move-result v2

    goto :goto_2

    :cond_1
    invoke-virtual {v15, v0}, Lcom/daaw/fe8;->U(I)I

    move-result v2

    :goto_2
    const/4 v3, -0x1

    if-ne v2, v3, :cond_2

    move/from16 p3, v0

    move v2, v1

    move v8, v4

    move/from16 v26, v5

    move-object/from16 v28, v10

    move v7, v11

    const/16 v19, -0x1

    const/16 v20, 0x0

    goto/16 :goto_17

    :cond_2
    iget-object v3, v15, Lcom/daaw/fe8;->a:[I

    add-int/lit8 v20, v2, 0x1

    aget v8, v3, v20

    invoke-static {v8}, Lcom/daaw/fe8;->h(I)I

    move-result v11

    move/from16 v20, v0

    const v18, 0xfffff

    and-int v0, v8, v18

    move/from16 v21, v1

    int-to-long v0, v0

    move-wide/from16 v22, v0

    const/16 v0, 0x11

    if-gt v11, v0, :cond_e

    add-int/lit8 v0, v2, 0x2

    aget v0, v3, v0

    ushr-int/lit8 v3, v0, 0x14

    const/4 v1, 0x1

    shl-int v24, v1, v3

    const v3, 0xfffff

    and-int/2addr v0, v3

    move/from16 v18, v4

    if-eq v0, v6, :cond_4

    if-eq v6, v3, :cond_3

    int-to-long v3, v6

    invoke-virtual {v10, v14, v3, v4, v5}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_3
    int-to-long v3, v0

    invoke-virtual {v10, v14, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    move/from16 v27, v0

    move/from16 v26, v5

    goto :goto_3

    :cond_4
    move/from16 v26, v5

    move/from16 v27, v6

    :goto_3
    const/4 v0, 0x5

    packed-switch v11, :pswitch_data_0

    move v13, v2

    move/from16 v11, v20

    move/from16 v6, v21

    const/4 v0, 0x3

    const/16 v19, -0x1

    const v20, 0xfffff

    if-ne v7, v0, :cond_d

    invoke-virtual {v15, v14, v13}, Lcom/daaw/fe8;->n(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v15, v13}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v1

    shl-int/lit8 v0, v11, 0x3

    or-int/lit8 v5, v0, 0x4

    move-object v0, v7

    move-object/from16 v2, p2

    move v3, v6

    move/from16 v4, p4

    move/from16 v8, v18

    move-object/from16 v6, p6

    invoke-static/range {v0 .. v6}, Lcom/daaw/h58;->n(Ljava/lang/Object;Lcom/daaw/ve8;[BIIILcom/daaw/e58;)I

    move-result v0

    invoke-virtual {v15, v14, v13, v7}, Lcom/daaw/fe8;->v(Ljava/lang/Object;ILjava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_0
    if-nez v7, :cond_5

    move/from16 v1, v21

    invoke-static {v12, v1, v9}, Lcom/daaw/h58;->m([BILcom/daaw/e58;)I

    move-result v6

    iget-wide v0, v9, Lcom/daaw/e58;->b:J

    invoke-static {v0, v1}, Lcom/daaw/k78;->b(J)J

    move-result-wide v4

    move/from16 v11, v20

    move-wide/from16 v7, v22

    move-object v0, v10

    move-object/from16 v1, p1

    move v13, v2

    const/16 v19, -0x1

    const v20, 0xfffff

    move-wide v2, v7

    move/from16 v8, v18

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    or-int v5, v26, v24

    move v0, v6

    goto/16 :goto_6

    :cond_5
    move v13, v2

    move/from16 v11, v20

    const/16 v19, -0x1

    const v20, 0xfffff

    move/from16 v8, v18

    move/from16 v6, v21

    goto/16 :goto_f

    :pswitch_1
    move v13, v2

    move/from16 v8, v18

    move/from16 v11, v20

    move/from16 v1, v21

    move-wide/from16 v3, v22

    const/16 v19, -0x1

    const v20, 0xfffff

    if-nez v7, :cond_8

    invoke-static {v12, v1, v9}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v0

    iget v1, v9, Lcom/daaw/e58;->a:I

    invoke-static {v1}, Lcom/daaw/k78;->a(I)I

    move-result v1

    :cond_6
    :goto_4
    invoke-virtual {v10, v14, v3, v4, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_5

    :pswitch_2
    move v13, v2

    move/from16 v8, v18

    move/from16 v11, v20

    move/from16 v1, v21

    move-wide/from16 v3, v22

    const/16 v19, -0x1

    const v20, 0xfffff

    if-nez v7, :cond_8

    invoke-static {v12, v1, v9}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v0

    iget v1, v9, Lcom/daaw/e58;->a:I

    invoke-virtual {v15, v13}, Lcom/daaw/fe8;->k(I)Lcom/daaw/ua8;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-interface {v2, v1}, Lcom/daaw/ua8;->a(I)Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_4

    :cond_7
    invoke-static/range {p1 .. p1}, Lcom/daaw/fe8;->I(Ljava/lang/Object;)Lcom/daaw/qg8;

    move-result-object v2

    int-to-long v3, v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v2, v8, v1}, Lcom/daaw/qg8;->j(ILjava/lang/Object;)V

    move v1, v8

    move v2, v11

    goto/16 :goto_11

    :pswitch_3
    move v13, v2

    move/from16 v8, v18

    move/from16 v11, v20

    move/from16 v1, v21

    move-wide/from16 v3, v22

    const/4 v0, 0x2

    const/16 v19, -0x1

    const v20, 0xfffff

    if-ne v7, v0, :cond_8

    invoke-static {v12, v1, v9}, Lcom/daaw/h58;->a([BILcom/daaw/e58;)I

    move-result v0

    iget-object v1, v9, Lcom/daaw/e58;->c:Ljava/lang/Object;

    invoke-virtual {v10, v14, v3, v4, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_5

    :pswitch_4
    move v13, v2

    move/from16 v8, v18

    move/from16 v11, v20

    move/from16 v1, v21

    const/4 v0, 0x2

    const/16 v19, -0x1

    const v20, 0xfffff

    if-ne v7, v0, :cond_8

    invoke-virtual {v15, v14, v13}, Lcom/daaw/fe8;->n(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v15, v13}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v2

    move-object v0, v6

    move v5, v1

    move-object v1, v2

    move-object/from16 v2, p2

    move v3, v5

    move/from16 v4, p4

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lcom/daaw/h58;->o(Ljava/lang/Object;Lcom/daaw/ve8;[BIILcom/daaw/e58;)I

    move-result v0

    invoke-virtual {v15, v14, v13, v6}, Lcom/daaw/fe8;->v(Ljava/lang/Object;ILjava/lang/Object;)V

    :goto_5
    or-int v5, v26, v24

    :goto_6
    move v1, v8

    goto/16 :goto_a

    :cond_8
    move v6, v1

    goto/16 :goto_f

    :pswitch_5
    move v13, v2

    move/from16 v6, v18

    move/from16 v11, v20

    move/from16 v5, v21

    move-wide/from16 v3, v22

    const/4 v0, 0x2

    const/16 v19, -0x1

    const v20, 0xfffff

    if-ne v7, v0, :cond_b

    const/high16 v0, 0x20000000

    and-int/2addr v0, v8

    if-nez v0, :cond_9

    invoke-static {v12, v5, v9}, Lcom/daaw/h58;->g([BILcom/daaw/e58;)I

    move-result v0

    goto :goto_7

    :cond_9
    invoke-static {v12, v5, v9}, Lcom/daaw/h58;->h([BILcom/daaw/e58;)I

    move-result v0

    :goto_7
    iget-object v1, v9, Lcom/daaw/e58;->c:Ljava/lang/Object;

    invoke-virtual {v10, v14, v3, v4, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_9

    :pswitch_6
    move v13, v2

    move/from16 v6, v18

    move/from16 v11, v20

    move/from16 v5, v21

    move-wide/from16 v3, v22

    const/16 v19, -0x1

    const v20, 0xfffff

    if-nez v7, :cond_b

    invoke-static {v12, v5, v9}, Lcom/daaw/h58;->m([BILcom/daaw/e58;)I

    move-result v0

    iget-wide v7, v9, Lcom/daaw/e58;->b:J

    const-wide/16 v17, 0x0

    cmp-long v2, v7, v17

    if-eqz v2, :cond_a

    goto :goto_8

    :cond_a
    const/4 v1, 0x0

    :goto_8
    invoke-static {v14, v3, v4, v1}, Lcom/daaw/ih8;->r(Ljava/lang/Object;JZ)V

    goto :goto_9

    :pswitch_7
    move v13, v2

    move/from16 v6, v18

    move/from16 v11, v20

    move/from16 v5, v21

    move-wide/from16 v3, v22

    const/16 v19, -0x1

    const v20, 0xfffff

    if-ne v7, v0, :cond_b

    invoke-static {v12, v5}, Lcom/daaw/h58;->b([BI)I

    move-result v0

    invoke-virtual {v10, v14, v3, v4, v0}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v0, v5, 0x4

    :goto_9
    or-int v5, v26, v24

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

    move/from16 v6, v18

    move/from16 v11, v20

    move/from16 v5, v21

    move-wide/from16 v3, v22

    const/16 v19, -0x1

    const v20, 0xfffff

    if-ne v7, v1, :cond_c

    invoke-static {v12, v5}, Lcom/daaw/h58;->p([BI)J

    move-result-wide v7

    move-object v0, v10

    move-object/from16 v1, p1

    move-wide v2, v3

    move/from16 v18, v6

    move v6, v5

    move-wide v4, v7

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    goto/16 :goto_b

    :cond_c
    move/from16 v18, v6

    move v6, v5

    goto/16 :goto_e

    :pswitch_9
    move v13, v2

    move/from16 v11, v20

    move/from16 v6, v21

    move-wide/from16 v3, v22

    const/16 v19, -0x1

    const v20, 0xfffff

    if-nez v7, :cond_d

    invoke-static {v12, v6, v9}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v0

    iget v1, v9, Lcom/daaw/e58;->a:I

    invoke-virtual {v10, v14, v3, v4, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_c

    :pswitch_a
    move v13, v2

    move/from16 v11, v20

    move/from16 v6, v21

    move-wide/from16 v3, v22

    const/16 v19, -0x1

    const v20, 0xfffff

    if-nez v7, :cond_d

    invoke-static {v12, v6, v9}, Lcom/daaw/h58;->m([BILcom/daaw/e58;)I

    move-result v6

    iget-wide v7, v9, Lcom/daaw/e58;->b:J

    move-object v0, v10

    move-object/from16 v1, p1

    move-wide v2, v3

    move-wide v4, v7

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    or-int v5, v26, v24

    move v0, v6

    goto :goto_d

    :pswitch_b
    move v13, v2

    move/from16 v11, v20

    move/from16 v6, v21

    move-wide/from16 v3, v22

    const/16 v19, -0x1

    const v20, 0xfffff

    if-ne v7, v0, :cond_d

    invoke-static {v12, v6}, Lcom/daaw/h58;->b([BI)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v14, v3, v4, v0}, Lcom/daaw/ih8;->u(Ljava/lang/Object;JF)V

    add-int/lit8 v0, v6, 0x4

    goto :goto_c

    :pswitch_c
    move v13, v2

    move/from16 v11, v20

    move/from16 v6, v21

    move-wide/from16 v3, v22

    const/16 v19, -0x1

    const v20, 0xfffff

    if-ne v7, v1, :cond_d

    invoke-static {v12, v6}, Lcom/daaw/h58;->p([BI)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    invoke-static {v14, v3, v4, v0, v1}, Lcom/daaw/ih8;->t(Ljava/lang/Object;JD)V

    :goto_b
    add-int/lit8 v0, v6, 0x8

    :goto_c
    or-int v5, v26, v24

    :goto_d
    move v2, v11

    move v3, v13

    move/from16 v1, v18

    goto/16 :goto_12

    :cond_d
    :goto_e
    move/from16 v8, v18

    :goto_f
    move/from16 v7, p5

    move v2, v6

    move-object/from16 v28, v10

    move/from16 p3, v11

    move/from16 v20, v13

    goto/16 :goto_16

    :cond_e
    move v13, v2

    move v2, v4

    move/from16 v27, v6

    move/from16 v1, v20

    move/from16 v6, v21

    move-wide/from16 v3, v22

    const/16 v19, -0x1

    const v20, 0xfffff

    const/16 v0, 0x1b

    if-ne v11, v0, :cond_12

    const/4 v0, 0x2

    if-ne v7, v0, :cond_11

    invoke-virtual {v10, v14, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/db8;

    invoke-interface {v0}, Lcom/daaw/db8;->zzc()Z

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
    invoke-interface {v0, v7}, Lcom/daaw/db8;->b(I)Lcom/daaw/db8;

    move-result-object v0

    invoke-virtual {v10, v14, v3, v4, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_10
    move-object v7, v0

    invoke-virtual {v15, v13}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v0

    move v8, v1

    move v1, v2

    move v11, v2

    move-object/from16 v2, p2

    move v3, v6

    move/from16 v4, p4

    move/from16 v26, v5

    move-object v5, v7

    move-object/from16 v6, p6

    invoke-static/range {v0 .. v6}, Lcom/daaw/h58;->e(Lcom/daaw/ve8;I[BIILcom/daaw/db8;Lcom/daaw/e58;)I

    move-result v0

    move v2, v8

    move v1, v11

    :goto_11
    move v3, v13

    move/from16 v5, v26

    :goto_12
    move/from16 v6, v27

    move/from16 v13, p4

    move/from16 v11, p5

    goto/16 :goto_0

    :cond_11
    move/from16 v26, v5

    move/from16 p3, v1

    move/from16 v18, v2

    move v15, v6

    move-object/from16 v28, v10

    move/from16 v20, v13

    goto/16 :goto_14

    :cond_12
    move/from16 v26, v5

    move v5, v1

    const/16 v0, 0x31

    if-gt v11, v0, :cond_14

    int-to-long v0, v8

    move-wide/from16 v21, v0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v8, v2

    move-object/from16 v2, p2

    move-wide/from16 v24, v3

    move v3, v6

    move/from16 v4, p4

    move/from16 p3, v5

    move v5, v8

    move v15, v6

    move/from16 v6, p3

    move/from16 v18, v8

    move v8, v13

    move-object/from16 v28, v10

    move-wide/from16 v9, v21

    move/from16 v20, v13

    move-wide/from16 v12, v24

    move-object/from16 v14, p6

    invoke-virtual/range {v0 .. v14}, Lcom/daaw/fe8;->T(Ljava/lang/Object;[BIIIIIIJIJLcom/daaw/e58;)I

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

    move/from16 v1, v18

    move/from16 v3, v20

    move/from16 v5, v26

    move/from16 v6, v27

    move-object/from16 v10, v28

    goto/16 :goto_0

    :cond_13
    move/from16 v7, p5

    move v2, v0

    goto :goto_15

    :cond_14
    move/from16 v18, v2

    move-wide/from16 v24, v3

    move/from16 p3, v5

    move v15, v6

    move-object/from16 v28, v10

    move/from16 v20, v13

    const/16 v0, 0x32

    if-ne v11, v0, :cond_16

    const/4 v0, 0x2

    if-ne v7, v0, :cond_15

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v3, v15

    move/from16 v4, p4

    move/from16 v5, v20

    move-wide/from16 v6, v24

    move-object/from16 v8, p6

    invoke-virtual/range {v0 .. v8}, Lcom/daaw/fe8;->Q(Ljava/lang/Object;[BIIIJLcom/daaw/e58;)I

    move-result v0

    if-eq v0, v15, :cond_13

    goto :goto_13

    :cond_15
    :goto_14
    move/from16 v7, p5

    move v2, v15

    :goto_15
    move/from16 v8, v18

    :goto_16
    move/from16 v6, v27

    goto :goto_17

    :cond_16
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v3, v15

    move/from16 v4, p4

    move/from16 v5, v18

    move/from16 v6, p3

    move v9, v11

    move-wide/from16 v10, v24

    move/from16 v12, v20

    move-object/from16 v13, p6

    invoke-virtual/range {v0 .. v13}, Lcom/daaw/fe8;->R(Ljava/lang/Object;[BIIIIIIIJILcom/daaw/e58;)I

    move-result v0

    if-eq v0, v15, :cond_13

    goto :goto_13

    :goto_17
    if-ne v8, v7, :cond_17

    if-eqz v7, :cond_17

    move-object/from16 v9, p0

    move-object/from16 v12, p1

    move v0, v2

    move v1, v8

    move/from16 v5, v26

    goto/16 :goto_1a

    :cond_17
    move-object/from16 v9, p0

    iget-boolean v0, v9, Lcom/daaw/fe8;->f:Z

    if-eqz v0, :cond_1a

    move-object/from16 v10, p6

    iget-object v0, v10, Lcom/daaw/e58;->d:Lcom/daaw/l88;

    sget-object v1, Lcom/daaw/l88;->c:Lcom/daaw/l88;

    if-eq v0, v1, :cond_19

    iget-object v1, v9, Lcom/daaw/fe8;->e:Lcom/daaw/zd8;

    move/from16 v11, p3

    invoke-virtual {v0, v1, v11}, Lcom/daaw/l88;->b(Lcom/daaw/zd8;I)Lcom/daaw/ea8;

    move-result-object v0

    if-nez v0, :cond_18

    invoke-static/range {p1 .. p1}, Lcom/daaw/fe8;->I(Ljava/lang/Object;)Lcom/daaw/qg8;

    move-result-object v4

    move v0, v8

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lcom/daaw/h58;->i(I[BIILcom/daaw/qg8;Lcom/daaw/e58;)I

    move-result v0

    move-object/from16 v12, p1

    goto :goto_19

    :cond_18
    move-object/from16 v12, p1

    move-object v0, v12

    check-cast v0, Lcom/daaw/ba8;

    throw v17

    :cond_19
    move-object/from16 v12, p1

    move/from16 v11, p3

    goto :goto_18

    :cond_1a
    move-object/from16 v12, p1

    move/from16 v11, p3

    move-object/from16 v10, p6

    :goto_18
    invoke-static/range {p1 .. p1}, Lcom/daaw/fe8;->I(Ljava/lang/Object;)Lcom/daaw/qg8;

    move-result-object v4

    move v0, v8

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lcom/daaw/h58;->i(I[BIILcom/daaw/qg8;Lcom/daaw/e58;)I

    move-result v0

    :goto_19
    move/from16 v13, p4

    move v1, v8

    move-object v15, v9

    move-object v9, v10

    move v2, v11

    move-object v14, v12

    move/from16 v3, v20

    move/from16 v5, v26

    move-object/from16 v10, v28

    move-object/from16 v12, p2

    move v11, v7

    goto/16 :goto_0

    :cond_1b
    move/from16 v26, v5

    move/from16 v27, v6

    move-object/from16 v28, v10

    move v7, v11

    move-object v12, v14

    move-object v9, v15

    :goto_1a
    const v2, 0xfffff

    if-eq v6, v2, :cond_1c

    int-to-long v3, v6

    move-object/from16 v6, v28

    invoke-virtual {v6, v12, v3, v4, v5}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_1c
    iget v3, v9, Lcom/daaw/fe8;->i:I

    :goto_1b
    iget v4, v9, Lcom/daaw/fe8;->j:I

    if-ge v3, v4, :cond_1f

    iget-object v4, v9, Lcom/daaw/fe8;->h:[I

    aget v4, v4, v3

    iget-object v5, v9, Lcom/daaw/fe8;->a:[I

    aget v5, v5, v4

    invoke-virtual {v9, v4}, Lcom/daaw/fe8;->i(I)I

    move-result v5

    and-int/2addr v5, v2

    int-to-long v5, v5

    invoke-static {v12, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_1d

    goto :goto_1c

    :cond_1d
    invoke-virtual {v9, v4}, Lcom/daaw/fe8;->k(I)Lcom/daaw/ua8;

    move-result-object v6

    if-nez v6, :cond_1e

    :goto_1c
    add-int/lit8 v3, v3, 0x1

    goto :goto_1b

    :cond_1e
    check-cast v5, Lcom/daaw/nd8;

    invoke-virtual {v9, v4}, Lcom/daaw/fe8;->m(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ld8;

    throw v17

    :cond_1f
    move/from16 v2, p4

    if-nez v7, :cond_21

    if-ne v0, v2, :cond_20

    goto :goto_1d

    :cond_20
    invoke-static {}, Lcom/daaw/mb8;->e()Lcom/daaw/mb8;

    move-result-object v0

    throw v0

    :cond_21
    if-gt v0, v2, :cond_22

    if-ne v1, v7, :cond_22

    :goto_1d
    return v0

    :cond_22
    invoke-static {}, Lcom/daaw/mb8;->e()Lcom/daaw/mb8;

    move-result-object v0

    goto :goto_1f

    :goto_1e
    throw v0

    :goto_1f
    goto :goto_1e

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

.method public final N(Ljava/lang/Object;)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, Lcom/daaw/fe8;->q:Lsun/misc/Unsafe;

    const v3, 0xfffff

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, 0xfffff

    :goto_0
    iget-object v9, v0, Lcom/daaw/fe8;->a:[I

    array-length v9, v9

    if-ge v5, v9, :cond_6

    invoke-virtual {v0, v5}, Lcom/daaw/fe8;->i(I)I

    move-result v9

    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v11, v10, v5

    invoke-static {v9}, Lcom/daaw/fe8;->h(I)I

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
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/zd8;

    invoke-virtual {v0, v5}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v4

    invoke-static {v11, v3, v4}, Lcom/daaw/w78;->y(ILcom/daaw/zd8;Lcom/daaw/ve8;)I

    move-result v3

    goto/16 :goto_b

    :pswitch_1
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-static {v1, v3, v4}, Lcom/daaw/fe8;->j(Ljava/lang/Object;J)J

    move-result-wide v3

    shl-int/lit8 v10, v11, 0x3

    invoke-static {v10}, Lcom/daaw/w78;->a(I)I

    move-result v10

    add-long v11, v3, v3

    shr-long/2addr v3, v9

    xor-long/2addr v3, v11

    invoke-static {v3, v4}, Lcom/daaw/w78;->b(J)I

    move-result v3

    add-int/2addr v10, v3

    add-int/2addr v6, v10

    goto/16 :goto_c

    :pswitch_2
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-static {v1, v3, v4}, Lcom/daaw/fe8;->P(Ljava/lang/Object;J)I

    move-result v3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lcom/daaw/w78;->a(I)I

    move-result v4

    add-int v9, v3, v3

    shr-int/lit8 v3, v3, 0x1f

    xor-int/2addr v3, v9

    goto :goto_2

    :pswitch_3
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    goto/16 :goto_7

    :pswitch_4
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    goto/16 :goto_6

    :pswitch_5
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    goto/16 :goto_4

    :pswitch_6
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-static {v1, v3, v4}, Lcom/daaw/fe8;->P(Ljava/lang/Object;J)I

    move-result v3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lcom/daaw/w78;->a(I)I

    move-result v4

    :goto_2
    invoke-static {v3}, Lcom/daaw/w78;->a(I)I

    move-result v3

    goto/16 :goto_9

    :pswitch_7
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    :goto_3
    check-cast v3, Lcom/daaw/y68;

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lcom/daaw/w78;->a(I)I

    move-result v4

    invoke-virtual {v3}, Lcom/daaw/y68;->f()I

    move-result v3

    invoke-static {v3}, Lcom/daaw/w78;->a(I)I

    move-result v9

    add-int/2addr v9, v3

    add-int/2addr v4, v9

    goto/16 :goto_a

    :pswitch_8
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v5}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v4

    invoke-static {v11, v3, v4}, Lcom/daaw/ze8;->Q(ILjava/lang/Object;Lcom/daaw/ve8;)I

    move-result v3

    goto/16 :goto_b

    :pswitch_9
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lcom/daaw/y68;

    if-eqz v4, :cond_2

    goto :goto_3

    :cond_2
    check-cast v3, Ljava/lang/String;

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lcom/daaw/w78;->a(I)I

    move-result v4

    invoke-static {v3}, Lcom/daaw/w78;->C(Ljava/lang/String;)I

    move-result v3

    goto/16 :goto_9

    :pswitch_a
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, Lcom/daaw/w78;->a(I)I

    move-result v3

    add-int/2addr v3, v14

    goto/16 :goto_b

    :pswitch_b
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_6

    :pswitch_c
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_7

    :pswitch_d
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    :goto_4
    invoke-static {v1, v3, v4}, Lcom/daaw/fe8;->P(Ljava/lang/Object;J)I

    move-result v3

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lcom/daaw/w78;->a(I)I

    move-result v4

    invoke-static {v3}, Lcom/daaw/w78;->z(I)I

    move-result v3

    goto/16 :goto_9

    :pswitch_e
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    goto :goto_5

    :pswitch_f
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v9

    if-eqz v9, :cond_3

    :goto_5
    invoke-static {v1, v3, v4}, Lcom/daaw/fe8;->j(Ljava/lang/Object;J)J

    move-result-wide v3

    shl-int/lit8 v9, v11, 0x3

    invoke-static {v9}, Lcom/daaw/w78;->a(I)I

    move-result v9

    invoke-static {v3, v4}, Lcom/daaw/w78;->b(J)I

    move-result v3

    add-int/2addr v9, v3

    add-int/2addr v6, v9

    goto/16 :goto_c

    :pswitch_10
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    :goto_6
    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, Lcom/daaw/w78;->a(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x4

    goto/16 :goto_b

    :pswitch_11
    invoke-virtual {v0, v1, v11, v5}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_3

    :goto_7
    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, Lcom/daaw/w78;->a(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x8

    goto/16 :goto_b

    :pswitch_12
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v5}, Lcom/daaw/fe8;->m(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v11, v3, v4}, Lcom/daaw/pd8;->a(ILjava/lang/Object;Ljava/lang/Object;)I

    goto/16 :goto_c

    :pswitch_13
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {v0, v5}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v4

    invoke-static {v11, v3, v4}, Lcom/daaw/ze8;->L(ILjava/util/List;Lcom/daaw/ve8;)I

    move-result v3

    goto/16 :goto_b

    :pswitch_14
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ze8;->V(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto/16 :goto_8

    :pswitch_15
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ze8;->T(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto/16 :goto_8

    :pswitch_16
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ze8;->K(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto/16 :goto_8

    :pswitch_17
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ze8;->I(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto/16 :goto_8

    :pswitch_18
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ze8;->G(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto/16 :goto_8

    :pswitch_19
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ze8;->Y(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto/16 :goto_8

    :pswitch_1a
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ze8;->D(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto :goto_8

    :pswitch_1b
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ze8;->I(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto :goto_8

    :pswitch_1c
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ze8;->K(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto :goto_8

    :pswitch_1d
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ze8;->N(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto :goto_8

    :pswitch_1e
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ze8;->a0(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto :goto_8

    :pswitch_1f
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ze8;->P(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto :goto_8

    :pswitch_20
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ze8;->I(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    goto :goto_8

    :pswitch_21
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lcom/daaw/ze8;->K(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_3

    :goto_8
    invoke-static {v11}, Lcom/daaw/w78;->D(I)I

    move-result v4

    invoke-static {v3}, Lcom/daaw/w78;->a(I)I

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

    invoke-static {v11, v3, v9}, Lcom/daaw/ze8;->U(ILjava/util/List;Z)I

    move-result v3

    goto :goto_b

    :pswitch_23
    const/4 v9, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v9}, Lcom/daaw/ze8;->S(ILjava/util/List;Z)I

    move-result v3

    goto :goto_b

    :pswitch_24
    const/4 v9, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v9}, Lcom/daaw/ze8;->J(ILjava/util/List;Z)I

    move-result v3

    goto :goto_b

    :pswitch_25
    const/4 v9, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v9}, Lcom/daaw/ze8;->H(ILjava/util/List;Z)I

    move-result v3

    goto :goto_b

    :pswitch_26
    const/4 v9, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v9}, Lcom/daaw/ze8;->F(ILjava/util/List;Z)I

    move-result v3

    goto :goto_b

    :pswitch_27
    const/4 v9, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v9}, Lcom/daaw/ze8;->X(ILjava/util/List;Z)I

    move-result v3

    goto :goto_b

    :pswitch_28
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Lcom/daaw/ze8;->E(ILjava/util/List;)I

    move-result v3

    goto :goto_b

    :pswitch_29
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {v0, v5}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v4

    invoke-static {v11, v3, v4}, Lcom/daaw/ze8;->R(ILjava/util/List;Lcom/daaw/ve8;)I

    move-result v3

    goto :goto_b

    :pswitch_2a
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Lcom/daaw/ze8;->W(ILjava/util/List;)I

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

    invoke-static {v11, v3, v12}, Lcom/daaw/ze8;->A(ILjava/util/List;Z)I

    move-result v3

    goto :goto_d

    :pswitch_2c
    const/4 v12, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v12}, Lcom/daaw/ze8;->M(ILjava/util/List;Z)I

    move-result v3

    goto :goto_d

    :pswitch_2d
    const/4 v12, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v12}, Lcom/daaw/ze8;->Z(ILjava/util/List;Z)I

    move-result v3

    goto :goto_d

    :pswitch_2e
    const/4 v12, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v12}, Lcom/daaw/ze8;->O(ILjava/util/List;Z)I

    move-result v3

    goto :goto_d

    :pswitch_2f
    const/4 v12, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v12}, Lcom/daaw/ze8;->H(ILjava/util/List;Z)I

    move-result v3

    goto :goto_d

    :pswitch_30
    const/4 v12, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3, v12}, Lcom/daaw/ze8;->J(ILjava/util/List;Z)I

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

    check-cast v3, Lcom/daaw/zd8;

    invoke-virtual {v0, v5}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v4

    invoke-static {v11, v3, v4}, Lcom/daaw/w78;->y(ILcom/daaw/zd8;Lcom/daaw/ve8;)I

    move-result v3

    goto :goto_d

    :pswitch_32
    const/4 v12, 0x0

    and-int/2addr v10, v7

    if-eqz v10, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v3

    shl-int/lit8 v10, v11, 0x3

    invoke-static {v10}, Lcom/daaw/w78;->a(I)I

    move-result v10

    add-long v14, v3, v3

    shr-long/2addr v3, v9

    xor-long/2addr v3, v14

    invoke-static {v3, v4}, Lcom/daaw/w78;->b(J)I

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

    invoke-static {v4}, Lcom/daaw/w78;->a(I)I

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

    invoke-static {v4}, Lcom/daaw/w78;->a(I)I

    move-result v4

    :goto_e
    invoke-static {v3}, Lcom/daaw/w78;->a(I)I

    move-result v3

    goto/16 :goto_11

    :pswitch_38
    const/4 v12, 0x0

    and-int v9, v7, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    :goto_f
    check-cast v3, Lcom/daaw/y68;

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lcom/daaw/w78;->a(I)I

    move-result v4

    invoke-virtual {v3}, Lcom/daaw/y68;->f()I

    move-result v3

    invoke-static {v3}, Lcom/daaw/w78;->a(I)I

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

    invoke-virtual {v0, v5}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v4

    invoke-static {v11, v3, v4}, Lcom/daaw/ze8;->Q(ILjava/lang/Object;Lcom/daaw/ve8;)I

    move-result v3

    goto/16 :goto_d

    :pswitch_3a
    const/4 v12, 0x0

    and-int v9, v7, v10

    if-eqz v9, :cond_5

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lcom/daaw/y68;

    if-eqz v4, :cond_4

    goto :goto_f

    :cond_4
    check-cast v3, Ljava/lang/String;

    shl-int/lit8 v4, v11, 0x3

    invoke-static {v4}, Lcom/daaw/w78;->a(I)I

    move-result v4

    invoke-static {v3}, Lcom/daaw/w78;->C(Ljava/lang/String;)I

    move-result v3

    goto :goto_11

    :pswitch_3b
    const/4 v12, 0x0

    and-int v3, v7, v10

    if-eqz v3, :cond_5

    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, Lcom/daaw/w78;->a(I)I

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

    invoke-static {v4}, Lcom/daaw/w78;->a(I)I

    move-result v4

    invoke-static {v3}, Lcom/daaw/w78;->z(I)I

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

    invoke-static {v9}, Lcom/daaw/w78;->a(I)I

    move-result v9

    invoke-static {v3, v4}, Lcom/daaw/w78;->b(J)I

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

    invoke-static {v3}, Lcom/daaw/w78;->a(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x4

    goto/16 :goto_d

    :pswitch_42
    const/4 v12, 0x0

    and-int v3, v7, v10

    if-eqz v3, :cond_5

    :goto_15
    shl-int/lit8 v3, v11, 0x3

    invoke-static {v3}, Lcom/daaw/w78;->a(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x8

    goto/16 :goto_d

    :cond_5
    :goto_16
    add-int/lit8 v5, v5, 0x3

    const v3, 0xfffff

    goto/16 :goto_0

    :cond_6
    iget-object v2, v0, Lcom/daaw/fe8;->l:Lcom/daaw/og8;

    invoke-virtual {v2, v1}, Lcom/daaw/og8;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/daaw/og8;->a(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v6, v2

    iget-boolean v2, v0, Lcom/daaw/fe8;->f:Z

    if-nez v2, :cond_7

    return v6

    :cond_7
    iget-object v2, v0, Lcom/daaw/fe8;->m:Lcom/daaw/o88;

    invoke-virtual {v2, v1}, Lcom/daaw/o88;->a(Ljava/lang/Object;)Lcom/daaw/a98;

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

.method public final O(Ljava/lang/Object;)I
    .locals 11

    sget-object v0, Lcom/daaw/fe8;->q:Lsun/misc/Unsafe;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    iget-object v4, p0, Lcom/daaw/fe8;->a:[I

    array-length v4, v4

    if-ge v2, v4, :cond_3

    invoke-virtual {p0, v2}, Lcom/daaw/fe8;->i(I)I

    move-result v4

    invoke-static {v4}, Lcom/daaw/fe8;->h(I)I

    move-result v5

    iget-object v6, p0, Lcom/daaw/fe8;->a:[I

    aget v6, v6, v2

    const v7, 0xfffff

    and-int/2addr v4, v7

    int-to-long v7, v4

    sget-object v4, Lcom/daaw/d98;->b0:Lcom/daaw/d98;

    invoke-virtual {v4}, Lcom/daaw/d98;->zza()I

    move-result v4

    if-lt v5, v4, :cond_0

    sget-object v4, Lcom/daaw/d98;->o0:Lcom/daaw/d98;

    invoke-virtual {v4}, Lcom/daaw/d98;->zza()I

    move-result v4

    if-gt v5, v4, :cond_0

    iget-object v4, p0, Lcom/daaw/fe8;->a:[I

    add-int/lit8 v9, v2, 0x2

    aget v4, v4, v9

    :cond_0
    const/16 v4, 0x3f

    packed-switch v5, :pswitch_data_0

    goto/16 :goto_17

    :pswitch_0
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_5

    :pswitch_1
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-static {p1, v7, v8}, Lcom/daaw/fe8;->j(Ljava/lang/Object;J)J

    move-result-wide v7

    goto/16 :goto_6

    :pswitch_2
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v7, v8}, Lcom/daaw/fe8;->P(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_7

    :pswitch_3
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_16

    :pswitch_4
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_15

    :pswitch_5
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    :pswitch_6
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v7, v8}, Lcom/daaw/fe8;->P(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_8

    :pswitch_7
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_a

    :pswitch_8
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_c

    :pswitch_9
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lcom/daaw/y68;

    if-eqz v5, :cond_1

    goto/16 :goto_d

    :pswitch_a
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_e

    :pswitch_b
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_15

    :pswitch_c
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_16

    :pswitch_d
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_1
    invoke-static {p1, v7, v8}, Lcom/daaw/fe8;->P(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_10

    :pswitch_e
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :pswitch_f
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_2
    invoke-static {p1, v7, v8}, Lcom/daaw/fe8;->j(Ljava/lang/Object;J)J

    move-result-wide v4

    goto/16 :goto_14

    :pswitch_10
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_15

    :pswitch_11
    invoke-virtual {p0, p1, v6, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_16

    :pswitch_12
    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v2}, Lcom/daaw/fe8;->m(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6, v4, v5}, Lcom/daaw/pd8;->a(ILjava/lang/Object;Ljava/lang/Object;)I

    goto/16 :goto_17

    :pswitch_13
    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-virtual {p0, v2}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v5

    invoke-static {v6, v4, v5}, Lcom/daaw/ze8;->L(ILjava/util/List;Lcom/daaw/ve8;)I

    move-result v4

    goto/16 :goto_4

    :pswitch_14
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ze8;->V(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto/16 :goto_3

    :pswitch_15
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ze8;->T(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto/16 :goto_3

    :pswitch_16
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ze8;->K(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto/16 :goto_3

    :pswitch_17
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ze8;->I(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto/16 :goto_3

    :pswitch_18
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ze8;->G(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto/16 :goto_3

    :pswitch_19
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ze8;->Y(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto/16 :goto_3

    :pswitch_1a
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ze8;->D(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto :goto_3

    :pswitch_1b
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ze8;->I(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto :goto_3

    :pswitch_1c
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ze8;->K(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto :goto_3

    :pswitch_1d
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ze8;->N(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto :goto_3

    :pswitch_1e
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ze8;->a0(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto :goto_3

    :pswitch_1f
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ze8;->P(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto :goto_3

    :pswitch_20
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ze8;->I(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    goto :goto_3

    :pswitch_21
    invoke-virtual {v0, p1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lcom/daaw/ze8;->K(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_2

    :goto_3
    invoke-static {v6}, Lcom/daaw/w78;->D(I)I

    move-result v5

    invoke-static {v4}, Lcom/daaw/w78;->a(I)I

    move-result v6

    add-int/2addr v5, v6

    goto/16 :goto_11

    :pswitch_22
    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lcom/daaw/ze8;->U(ILjava/util/List;Z)I

    move-result v4

    goto/16 :goto_4

    :pswitch_23
    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lcom/daaw/ze8;->S(ILjava/util/List;Z)I

    move-result v4

    goto/16 :goto_4

    :pswitch_24
    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lcom/daaw/ze8;->F(ILjava/util/List;Z)I

    move-result v4

    goto/16 :goto_4

    :pswitch_25
    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lcom/daaw/ze8;->X(ILjava/util/List;Z)I

    move-result v4

    goto :goto_4

    :pswitch_26
    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4}, Lcom/daaw/ze8;->E(ILjava/util/List;)I

    move-result v4

    goto :goto_4

    :pswitch_27
    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-virtual {p0, v2}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v5

    invoke-static {v6, v4, v5}, Lcom/daaw/ze8;->R(ILjava/util/List;Lcom/daaw/ve8;)I

    move-result v4

    goto :goto_4

    :pswitch_28
    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4}, Lcom/daaw/ze8;->W(ILjava/util/List;)I

    move-result v4

    goto :goto_4

    :pswitch_29
    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lcom/daaw/ze8;->A(ILjava/util/List;Z)I

    move-result v4

    goto :goto_4

    :pswitch_2a
    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lcom/daaw/ze8;->M(ILjava/util/List;Z)I

    move-result v4

    goto :goto_4

    :pswitch_2b
    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lcom/daaw/ze8;->Z(ILjava/util/List;Z)I

    move-result v4

    goto :goto_4

    :pswitch_2c
    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lcom/daaw/ze8;->O(ILjava/util/List;Z)I

    move-result v4

    goto :goto_4

    :pswitch_2d
    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lcom/daaw/ze8;->H(ILjava/util/List;Z)I

    move-result v4

    goto :goto_4

    :pswitch_2e
    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v6, v4, v1}, Lcom/daaw/ze8;->J(ILjava/util/List;Z)I

    move-result v4

    :goto_4
    add-int/2addr v3, v4

    goto/16 :goto_17

    :pswitch_2f
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_5
    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/zd8;

    invoke-virtual {p0, v2}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v5

    invoke-static {v6, v4, v5}, Lcom/daaw/w78;->y(ILcom/daaw/zd8;Lcom/daaw/ve8;)I

    move-result v4

    goto :goto_4

    :pswitch_30
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->i(Ljava/lang/Object;J)J

    move-result-wide v7

    :goto_6
    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lcom/daaw/w78;->a(I)I

    move-result v5

    add-long v9, v7, v7

    shr-long v6, v7, v4

    xor-long/2addr v6, v9

    invoke-static {v6, v7}, Lcom/daaw/w78;->b(J)I

    move-result v4

    goto/16 :goto_11

    :pswitch_31
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v4

    :goto_7
    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lcom/daaw/w78;->a(I)I

    move-result v5

    add-int v6, v4, v4

    shr-int/lit8 v4, v4, 0x1f

    xor-int/2addr v4, v6

    goto :goto_9

    :pswitch_32
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_16

    :pswitch_33
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_15

    :pswitch_34
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_f

    :pswitch_35
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v4

    :goto_8
    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lcom/daaw/w78;->a(I)I

    move-result v5

    :goto_9
    invoke-static {v4}, Lcom/daaw/w78;->a(I)I

    move-result v4

    goto/16 :goto_11

    :pswitch_36
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_a
    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    :goto_b
    check-cast v4, Lcom/daaw/y68;

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lcom/daaw/w78;->a(I)I

    move-result v5

    invoke-virtual {v4}, Lcom/daaw/y68;->f()I

    move-result v4

    invoke-static {v4}, Lcom/daaw/w78;->a(I)I

    move-result v6

    add-int/2addr v6, v4

    add-int/2addr v5, v6

    goto :goto_12

    :pswitch_37
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_c
    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v2}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v5

    invoke-static {v6, v4, v5}, Lcom/daaw/ze8;->Q(ILjava/lang/Object;Lcom/daaw/ve8;)I

    move-result v4

    goto/16 :goto_4

    :pswitch_38
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lcom/daaw/y68;

    if-eqz v5, :cond_1

    :goto_d
    goto :goto_b

    :cond_1
    check-cast v4, Ljava/lang/String;

    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lcom/daaw/w78;->a(I)I

    move-result v5

    invoke-static {v4}, Lcom/daaw/w78;->C(Ljava/lang/String;)I

    move-result v4

    goto :goto_11

    :pswitch_39
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_e
    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lcom/daaw/w78;->a(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_4

    :pswitch_3a
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_15

    :pswitch_3b
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_16

    :pswitch_3c
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_f
    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v4

    :goto_10
    shl-int/lit8 v5, v6, 0x3

    invoke-static {v5}, Lcom/daaw/w78;->a(I)I

    move-result v5

    invoke-static {v4}, Lcom/daaw/w78;->z(I)I

    move-result v4

    :goto_11
    add-int/2addr v5, v4

    :goto_12
    add-int/2addr v3, v5

    goto :goto_17

    :pswitch_3d
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_13

    :pswitch_3e
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_13
    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->i(Ljava/lang/Object;J)J

    move-result-wide v4

    :goto_14
    shl-int/lit8 v6, v6, 0x3

    invoke-static {v6}, Lcom/daaw/w78;->a(I)I

    move-result v6

    invoke-static {v4, v5}, Lcom/daaw/w78;->b(J)I

    move-result v4

    add-int/2addr v6, v4

    add-int/2addr v3, v6

    goto :goto_17

    :pswitch_3f
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_15
    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lcom/daaw/w78;->a(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x4

    goto/16 :goto_4

    :pswitch_40
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_16
    shl-int/lit8 v4, v6, 0x3

    invoke-static {v4}, Lcom/daaw/w78;->a(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x8

    goto/16 :goto_4

    :cond_2
    :goto_17
    add-int/lit8 v2, v2, 0x3

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lcom/daaw/fe8;->l:Lcom/daaw/og8;

    invoke-virtual {v0, p1}, Lcom/daaw/og8;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/og8;->a(Ljava/lang/Object;)I

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

.method public final Q(Ljava/lang/Object;[BIIIJLcom/daaw/e58;)I
    .locals 0

    sget-object p2, Lcom/daaw/fe8;->q:Lsun/misc/Unsafe;

    invoke-virtual {p0, p5}, Lcom/daaw/fe8;->m(I)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p2, p1, p6, p7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p4

    move-object p5, p4

    check-cast p5, Lcom/daaw/nd8;

    invoke-virtual {p5}, Lcom/daaw/nd8;->e()Z

    move-result p5

    if-eqz p5, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/daaw/nd8;->a()Lcom/daaw/nd8;

    move-result-object p5

    invoke-virtual {p5}, Lcom/daaw/nd8;->b()Lcom/daaw/nd8;

    move-result-object p5

    invoke-static {p5, p4}, Lcom/daaw/pd8;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2, p1, p6, p7, p5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    check-cast p3, Lcom/daaw/ld8;

    const/4 p1, 0x0

    throw p1
.end method

.method public final R(Ljava/lang/Object;[BIIIIIIIJILcom/daaw/e58;)I
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

    sget-object v11, Lcom/daaw/fe8;->q:Lsun/misc/Unsafe;

    iget-object v12, v0, Lcom/daaw/fe8;->a:[I

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
    invoke-virtual {v0, v1, v9, v10}, Lcom/daaw/fe8;->o(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v0, v10}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v3

    and-int/lit8 v2, v2, -0x8

    or-int/lit8 v7, v2, 0x4

    move-object v2, v11

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v8, p13

    invoke-static/range {v2 .. v8}, Lcom/daaw/h58;->n(Ljava/lang/Object;Lcom/daaw/ve8;[BIIILcom/daaw/e58;)I

    move-result v2

    invoke-virtual {v0, v1, v9, v10, v11}, Lcom/daaw/fe8;->w(Ljava/lang/Object;IILjava/lang/Object;)V

    return v2

    :pswitch_1
    if-eqz v3, :cond_1

    goto/16 :goto_5

    :cond_1
    invoke-static {v4, v5, v8}, Lcom/daaw/h58;->m([BILcom/daaw/e58;)I

    move-result v2

    iget-wide v3, v8, Lcom/daaw/e58;->b:J

    invoke-static {v3, v4}, Lcom/daaw/k78;->b(J)J

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
    invoke-static {v4, v5, v8}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v2

    iget v3, v8, Lcom/daaw/e58;->a:I

    invoke-static {v3}, Lcom/daaw/k78;->a(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v11, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_3
    if-nez v3, :cond_11

    invoke-static {v4, v5, v8}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v3

    iget v4, v8, Lcom/daaw/e58;->a:I

    invoke-virtual {v0, v10}, Lcom/daaw/fe8;->k(I)Lcom/daaw/ua8;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-interface {v5, v4}, Lcom/daaw/ua8;->a(I)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Lcom/daaw/fe8;->I(Ljava/lang/Object;)Lcom/daaw/qg8;

    move-result-object v1

    int-to-long v4, v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Lcom/daaw/qg8;->j(ILjava/lang/Object;)V

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
    invoke-static {v4, v5, v8}, Lcom/daaw/h58;->a([BILcom/daaw/e58;)I

    move-result v2

    iget-object v3, v8, Lcom/daaw/e58;->c:Ljava/lang/Object;

    invoke-virtual {v11, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_5
    if-eq v3, v15, :cond_6

    goto/16 :goto_5

    :cond_6
    invoke-virtual {v0, v1, v9, v10}, Lcom/daaw/fe8;->o(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v0, v10}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v3

    move-object v2, v11

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v7, p13

    invoke-static/range {v2 .. v7}, Lcom/daaw/h58;->o(Ljava/lang/Object;Lcom/daaw/ve8;[BIILcom/daaw/e58;)I

    move-result v2

    invoke-virtual {v0, v1, v9, v10, v11}, Lcom/daaw/fe8;->w(Ljava/lang/Object;IILjava/lang/Object;)V

    return v2

    :pswitch_6
    if-ne v3, v15, :cond_11

    invoke-static {v4, v5, v8}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v2

    iget v3, v8, Lcom/daaw/e58;->a:I

    if-nez v3, :cond_7

    const-string v3, ""

    invoke-virtual {v11, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_3

    :cond_7
    const/high16 v5, 0x20000000

    and-int v5, p8, v5

    if-eqz v5, :cond_9

    add-int v5, v2, v3

    invoke-static {v4, v2, v5}, Lcom/daaw/ei8;->f([BII)Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_2

    :cond_8
    invoke-static {}, Lcom/daaw/mb8;->c()Lcom/daaw/mb8;

    move-result-object v1

    throw v1

    :cond_9
    :goto_2
    new-instance v5, Ljava/lang/String;

    sget-object v8, Lcom/daaw/gb8;->b:Ljava/nio/charset/Charset;

    invoke-direct {v5, v4, v2, v3, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-virtual {v11, v1, v6, v7, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/2addr v2, v3

    :goto_3
    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_6

    :pswitch_7
    if-nez v3, :cond_11

    invoke-static {v4, v5, v8}, Lcom/daaw/h58;->m([BILcom/daaw/e58;)I

    move-result v2

    iget-wide v3, v8, Lcom/daaw/e58;->b:J

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
    invoke-static/range {p2 .. p3}, Lcom/daaw/h58;->b([BI)I

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
    invoke-static/range {p2 .. p3}, Lcom/daaw/h58;->p([BI)J

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
    invoke-static {v4, v5, v8}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v2

    iget v3, v8, Lcom/daaw/e58;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v11, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_b
    if-eqz v3, :cond_e

    goto :goto_5

    :cond_e
    invoke-static {v4, v5, v8}, Lcom/daaw/h58;->m([BILcom/daaw/e58;)I

    move-result v2

    iget-wide v3, v8, Lcom/daaw/e58;->b:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v11, v1, v6, v7, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v11, v1, v12, v13, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_c
    if-eq v3, v14, :cond_f

    goto :goto_5

    :cond_f
    invoke-static/range {p2 .. p3}, Lcom/daaw/h58;->b([BI)I

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
    invoke-static/range {p2 .. p3}, Lcom/daaw/h58;->p([BI)J

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

.method public final S(Ljava/lang/Object;[BIILcom/daaw/e58;)I
    .locals 30

    move-object/from16 v15, p0

    move-object/from16 v14, p1

    move-object/from16 v12, p2

    move/from16 v13, p4

    move-object/from16 v11, p5

    invoke-static/range {p1 .. p1}, Lcom/daaw/fe8;->q(Ljava/lang/Object;)V

    sget-object v9, Lcom/daaw/fe8;->q:Lsun/misc/Unsafe;

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

    invoke-static {v0, v12, v3, v11}, Lcom/daaw/h58;->k(I[BILcom/daaw/e58;)I

    move-result v0

    iget v3, v11, Lcom/daaw/e58;->a:I

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

    invoke-virtual {v15, v5, v2}, Lcom/daaw/fe8;->V(II)I

    move-result v0

    goto :goto_2

    :cond_1
    invoke-virtual {v15, v5}, Lcom/daaw/fe8;->U(I)I

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
    iget-object v0, v15, Lcom/daaw/fe8;->a:[I

    add-int/lit8 v1, v2, 0x1

    aget v1, v0, v1

    invoke-static {v1}, Lcom/daaw/fe8;->h(I)I

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

    invoke-static {v12, v4, v11}, Lcom/daaw/h58;->m([BILcom/daaw/e58;)I

    move-result v13

    iget-wide v0, v11, Lcom/daaw/e58;->b:J

    invoke-static {v0, v1}, Lcom/daaw/k78;->b(J)J

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

    invoke-static {v12, v4, v11}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v0

    iget v1, v11, Lcom/daaw/e58;->a:I

    invoke-static {v1}, Lcom/daaw/k78;->a(I)I

    move-result v1

    goto :goto_6

    :pswitch_2
    move/from16 v23, p3

    move/from16 v15, v20

    move/from16 v20, v7

    move-object v7, v2

    if-nez v3, :cond_7

    invoke-static {v12, v4, v11}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v0

    iget v1, v11, Lcom/daaw/e58;->a:I

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

    invoke-static {v12, v4, v11}, Lcom/daaw/h58;->a([BILcom/daaw/e58;)I

    move-result v0

    iget-object v1, v11, Lcom/daaw/e58;->c:Ljava/lang/Object;

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

    invoke-virtual {v13, v14, v15}, Lcom/daaw/fe8;->n(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v13, v15}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v1

    move-object v0, v8

    move-object/from16 v2, p2

    move v3, v4

    move/from16 v4, p4

    move-object/from16 v5, p5

    invoke-static/range {v0 .. v5}, Lcom/daaw/h58;->o(Ljava/lang/Object;Lcom/daaw/ve8;[BIILcom/daaw/e58;)I

    move-result v0

    invoke-virtual {v13, v14, v15, v8}, Lcom/daaw/fe8;->v(Ljava/lang/Object;ILjava/lang/Object;)V

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

    invoke-static {v12, v4, v11}, Lcom/daaw/h58;->g([BILcom/daaw/e58;)I

    move-result v0

    goto :goto_9

    :cond_8
    invoke-static {v12, v4, v11}, Lcom/daaw/h58;->h([BILcom/daaw/e58;)I

    move-result v0

    :goto_9
    iget-object v1, v11, Lcom/daaw/e58;->c:Ljava/lang/Object;

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

    invoke-static {v12, v4, v11}, Lcom/daaw/h58;->m([BILcom/daaw/e58;)I

    move-result v0

    iget-wide v1, v11, Lcom/daaw/e58;->b:J

    const-wide/16 v3, 0x0

    cmp-long v17, v1, v3

    if-eqz v17, :cond_9

    goto :goto_a

    :cond_9
    const/4 v5, 0x0

    :goto_a
    invoke-static {v14, v8, v9, v5}, Lcom/daaw/ih8;->r(Ljava/lang/Object;JZ)V

    goto/16 :goto_c

    :pswitch_7
    move-object/from16 v13, p0

    move/from16 v23, p3

    move/from16 v15, v20

    const v19, 0xfffff

    move/from16 v20, v7

    move-object v7, v2

    if-ne v3, v0, :cond_a

    invoke-static {v12, v4}, Lcom/daaw/h58;->b([BI)I

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

    invoke-static {v12, v4}, Lcom/daaw/h58;->p([BI)J

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

    invoke-static {v12, v4, v11}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v0

    iget v1, v11, Lcom/daaw/e58;->a:I

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

    invoke-static {v12, v4, v11}, Lcom/daaw/h58;->m([BILcom/daaw/e58;)I

    move-result v17

    iget-wide v4, v11, Lcom/daaw/e58;->b:J

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

    invoke-static {v12, v4}, Lcom/daaw/h58;->b([BI)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v14, v8, v9, v0}, Lcom/daaw/ih8;->u(Ljava/lang/Object;JF)V

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

    invoke-static {v12, v4}, Lcom/daaw/h58;->p([BI)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    invoke-static {v14, v8, v9, v0, v1}, Lcom/daaw/ih8;->t(Ljava/lang/Object;JD)V

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

    check-cast v0, Lcom/daaw/db8;

    invoke-interface {v0}, Lcom/daaw/db8;->zzc()Z

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
    invoke-interface {v0, v1}, Lcom/daaw/db8;->b(I)Lcom/daaw/db8;

    move-result-object v0

    invoke-virtual {v7, v14, v8, v9, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_d
    move-object v5, v0

    invoke-virtual {v10, v15}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v0

    move/from16 v1, v17

    move-object/from16 v2, p2

    move v3, v4

    move/from16 v4, p4

    move v8, v6

    move-object/from16 v6, p5

    invoke-static/range {v0 .. v6}, Lcom/daaw/h58;->e(Lcom/daaw/ve8;I[BIILcom/daaw/db8;Lcom/daaw/e58;)I

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

    invoke-virtual/range {v0 .. v14}, Lcom/daaw/fe8;->T(Ljava/lang/Object;[BIIIIIIJIJLcom/daaw/e58;)I

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

    invoke-virtual/range {v0 .. v8}, Lcom/daaw/fe8;->Q(Ljava/lang/Object;[BIIIJLcom/daaw/e58;)I

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

    invoke-virtual/range {v0 .. v13}, Lcom/daaw/fe8;->R(Ljava/lang/Object;[BIIIIIIIJILcom/daaw/e58;)I

    move-result v0

    if-eq v0, v14, :cond_10

    goto :goto_11

    :goto_14
    invoke-static/range {p1 .. p1}, Lcom/daaw/fe8;->I(Ljava/lang/Object;)Lcom/daaw/qg8;

    move-result-object v4

    move/from16 v0, v17

    move-object/from16 v1, p2

    move/from16 v3, p4

    move-object/from16 v5, p5

    invoke-static/range {v0 .. v5}, Lcom/daaw/h58;->i(I[BIILcom/daaw/qg8;Lcom/daaw/e58;)I

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
    invoke-static {}, Lcom/daaw/mb8;->e()Lcom/daaw/mb8;

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

.method public final T(Ljava/lang/Object;[BIIIIIIJIJLcom/daaw/e58;)I
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

    sget-object v11, Lcom/daaw/fe8;->q:Lsun/misc/Unsafe;

    invoke-virtual {v11, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/daaw/db8;

    invoke-interface {v12}, Lcom/daaw/db8;->zzc()Z

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
    invoke-interface {v12, v13}, Lcom/daaw/db8;->b(I)Lcom/daaw/db8;

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

    invoke-virtual {p0, v8}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v1

    and-int/lit8 v6, v2, -0x8

    or-int/lit8 v6, v6, 0x4

    move-object/from16 p6, v1

    move-object/from16 p7, p2

    move/from16 p8, p3

    move/from16 p9, p4

    move/from16 p10, v6

    move-object/from16 p11, p14

    invoke-static/range {p6 .. p11}, Lcom/daaw/h58;->c(Lcom/daaw/ve8;[BIIILcom/daaw/e58;)I

    move-result v4

    :goto_1
    iget-object v8, v7, Lcom/daaw/e58;->c:Ljava/lang/Object;

    invoke-interface {v12, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_21

    :pswitch_0
    if-ne v6, v14, :cond_4

    check-cast v12, Lcom/daaw/cd8;

    invoke-static {v3, v4, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v1

    iget v2, v7, Lcom/daaw/e58;->a:I

    add-int/2addr v2, v1

    :goto_2
    if-ge v1, v2, :cond_2

    invoke-static {v3, v1, v7}, Lcom/daaw/h58;->m([BILcom/daaw/e58;)I

    move-result v1

    iget-wide v4, v7, Lcom/daaw/e58;->b:J

    invoke-static {v4, v5}, Lcom/daaw/k78;->b(J)J

    move-result-wide v4

    invoke-virtual {v12, v4, v5}, Lcom/daaw/cd8;->f(J)V

    goto :goto_2

    :cond_2
    if-ne v1, v2, :cond_3

    goto/16 :goto_24

    :cond_3
    invoke-static {}, Lcom/daaw/mb8;->f()Lcom/daaw/mb8;

    move-result-object v1

    throw v1

    :cond_4
    if-nez v6, :cond_44

    check-cast v12, Lcom/daaw/cd8;

    :cond_5
    invoke-static {v3, v4, v7}, Lcom/daaw/h58;->m([BILcom/daaw/e58;)I

    move-result v1

    iget-wide v8, v7, Lcom/daaw/e58;->b:J

    invoke-static {v8, v9}, Lcom/daaw/k78;->b(J)J

    move-result-wide v8

    invoke-virtual {v12, v8, v9}, Lcom/daaw/cd8;->f(J)V

    if-ge v1, v5, :cond_6

    invoke-static {v3, v1, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v4

    iget v6, v7, Lcom/daaw/e58;->a:I

    if-eq v2, v6, :cond_5

    :cond_6
    return v1

    :pswitch_1
    if-ne v6, v14, :cond_9

    check-cast v12, Lcom/daaw/ma8;

    invoke-static {v3, v4, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v1

    iget v2, v7, Lcom/daaw/e58;->a:I

    add-int/2addr v2, v1

    :goto_3
    if-ge v1, v2, :cond_7

    invoke-static {v3, v1, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v1

    iget v4, v7, Lcom/daaw/e58;->a:I

    invoke-static {v4}, Lcom/daaw/k78;->a(I)I

    move-result v4

    invoke-virtual {v12, v4}, Lcom/daaw/ma8;->i(I)V

    goto :goto_3

    :cond_7
    if-ne v1, v2, :cond_8

    goto/16 :goto_24

    :cond_8
    invoke-static {}, Lcom/daaw/mb8;->f()Lcom/daaw/mb8;

    move-result-object v1

    throw v1

    :cond_9
    if-nez v6, :cond_44

    check-cast v12, Lcom/daaw/ma8;

    :cond_a
    invoke-static {v3, v4, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v1

    iget v4, v7, Lcom/daaw/e58;->a:I

    invoke-static {v4}, Lcom/daaw/k78;->a(I)I

    move-result v4

    invoke-virtual {v12, v4}, Lcom/daaw/ma8;->i(I)V

    if-ge v1, v5, :cond_b

    invoke-static {v3, v1, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v4

    iget v6, v7, Lcom/daaw/e58;->a:I

    if-eq v2, v6, :cond_a

    :cond_b
    return v1

    :pswitch_2
    if-ne v6, v14, :cond_c

    invoke-static {v3, v4, v12, v7}, Lcom/daaw/h58;->f([BILcom/daaw/db8;Lcom/daaw/e58;)I

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

    invoke-static/range {v2 .. v7}, Lcom/daaw/h58;->l(I[BIILcom/daaw/db8;Lcom/daaw/e58;)I

    move-result v2

    :goto_4
    invoke-virtual {p0, v8}, Lcom/daaw/fe8;->k(I)Lcom/daaw/ua8;

    move-result-object v3

    const/4 v4, 0x0

    iget-object v5, v0, Lcom/daaw/fe8;->l:Lcom/daaw/og8;

    move-object/from16 p7, p1

    move/from16 p8, p6

    move-object/from16 p9, v12

    move-object/from16 p10, v3

    move-object/from16 p11, v4

    move-object/from16 p12, v5

    invoke-static/range {p7 .. p12}, Lcom/daaw/ze8;->c(Ljava/lang/Object;ILjava/util/List;Lcom/daaw/ua8;Ljava/lang/Object;Lcom/daaw/og8;)Ljava/lang/Object;

    :goto_5
    move v1, v2

    goto/16 :goto_24

    :pswitch_3
    if-ne v6, v14, :cond_44

    invoke-static {v3, v4, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v1

    iget v4, v7, Lcom/daaw/e58;->a:I

    if-ltz v4, :cond_13

    array-length v6, v3

    sub-int/2addr v6, v1

    if-gt v4, v6, :cond_12

    if-nez v4, :cond_d

    :goto_6
    sget-object v4, Lcom/daaw/y68;->q:Lcom/daaw/y68;

    invoke-interface {v12, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_d
    invoke-static {v3, v1, v4}, Lcom/daaw/y68;->q([BII)Lcom/daaw/y68;

    move-result-object v6

    invoke-interface {v12, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v1, v4

    :goto_7
    if-ge v1, v5, :cond_11

    invoke-static {v3, v1, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v4

    iget v6, v7, Lcom/daaw/e58;->a:I

    if-eq v2, v6, :cond_e

    goto :goto_8

    :cond_e
    invoke-static {v3, v4, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v1

    iget v4, v7, Lcom/daaw/e58;->a:I

    if-ltz v4, :cond_10

    array-length v6, v3

    sub-int/2addr v6, v1

    if-gt v4, v6, :cond_f

    if-nez v4, :cond_d

    goto :goto_6

    :cond_f
    invoke-static {}, Lcom/daaw/mb8;->f()Lcom/daaw/mb8;

    move-result-object v1

    throw v1

    :cond_10
    invoke-static {}, Lcom/daaw/mb8;->d()Lcom/daaw/mb8;

    move-result-object v1

    throw v1

    :cond_11
    :goto_8
    return v1

    :cond_12
    invoke-static {}, Lcom/daaw/mb8;->f()Lcom/daaw/mb8;

    move-result-object v1

    throw v1

    :cond_13
    invoke-static {}, Lcom/daaw/mb8;->d()Lcom/daaw/mb8;

    move-result-object v1

    throw v1

    :pswitch_4
    if-eq v6, v14, :cond_14

    goto/16 :goto_23

    :cond_14
    invoke-virtual {p0, v8}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v1

    move-object/from16 p6, v1

    move/from16 p7, p5

    move-object/from16 p8, p2

    move/from16 p9, p3

    move/from16 p10, p4

    move-object/from16 p11, v12

    move-object/from16 p12, p14

    invoke-static/range {p6 .. p12}, Lcom/daaw/h58;->e(Lcom/daaw/ve8;I[BIILcom/daaw/db8;Lcom/daaw/e58;)I

    move-result v1

    return v1

    :pswitch_5
    if-ne v6, v14, :cond_44

    const-wide/32 v8, 0x20000000

    and-long v8, p9, v8

    const-string v1, ""

    cmp-long v6, v8, v10

    invoke-static {v3, v4, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v4

    if-nez v6, :cond_19

    iget v6, v7, Lcom/daaw/e58;->a:I

    if-ltz v6, :cond_18

    if-nez v6, :cond_15

    :goto_9
    invoke-interface {v12, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_15
    new-instance v8, Ljava/lang/String;

    sget-object v9, Lcom/daaw/gb8;->b:Ljava/nio/charset/Charset;

    invoke-direct {v8, v3, v4, v6, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    :goto_a
    invoke-interface {v12, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v4, v6

    :goto_b
    if-ge v4, v5, :cond_44

    invoke-static {v3, v4, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v6

    iget v8, v7, Lcom/daaw/e58;->a:I

    if-ne v2, v8, :cond_44

    invoke-static {v3, v6, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v4

    iget v6, v7, Lcom/daaw/e58;->a:I

    if-ltz v6, :cond_17

    if-nez v6, :cond_16

    goto :goto_9

    :cond_16
    new-instance v8, Ljava/lang/String;

    sget-object v9, Lcom/daaw/gb8;->b:Ljava/nio/charset/Charset;

    invoke-direct {v8, v3, v4, v6, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_a

    :cond_17
    invoke-static {}, Lcom/daaw/mb8;->d()Lcom/daaw/mb8;

    move-result-object v1

    throw v1

    :cond_18
    invoke-static {}, Lcom/daaw/mb8;->d()Lcom/daaw/mb8;

    move-result-object v1

    throw v1

    :cond_19
    iget v6, v7, Lcom/daaw/e58;->a:I

    if-ltz v6, :cond_1f

    if-nez v6, :cond_1a

    :goto_c
    invoke-interface {v12, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_1a
    add-int v8, v4, v6

    invoke-static {v3, v4, v8}, Lcom/daaw/ei8;->f([BII)Z

    move-result v9

    if-eqz v9, :cond_1e

    new-instance v9, Ljava/lang/String;

    sget-object v10, Lcom/daaw/gb8;->b:Ljava/nio/charset/Charset;

    invoke-direct {v9, v3, v4, v6, v10}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    :goto_d
    invoke-interface {v12, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v4, v8

    :goto_e
    if-ge v4, v5, :cond_44

    invoke-static {v3, v4, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v6

    iget v8, v7, Lcom/daaw/e58;->a:I

    if-ne v2, v8, :cond_44

    invoke-static {v3, v6, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v4

    iget v6, v7, Lcom/daaw/e58;->a:I

    if-ltz v6, :cond_1d

    if-nez v6, :cond_1b

    goto :goto_c

    :cond_1b
    add-int v8, v4, v6

    invoke-static {v3, v4, v8}, Lcom/daaw/ei8;->f([BII)Z

    move-result v9

    if-eqz v9, :cond_1c

    new-instance v9, Ljava/lang/String;

    sget-object v10, Lcom/daaw/gb8;->b:Ljava/nio/charset/Charset;

    invoke-direct {v9, v3, v4, v6, v10}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_d

    :cond_1c
    invoke-static {}, Lcom/daaw/mb8;->c()Lcom/daaw/mb8;

    move-result-object v1

    throw v1

    :cond_1d
    invoke-static {}, Lcom/daaw/mb8;->d()Lcom/daaw/mb8;

    move-result-object v1

    throw v1

    :cond_1e
    invoke-static {}, Lcom/daaw/mb8;->c()Lcom/daaw/mb8;

    move-result-object v1

    throw v1

    :cond_1f
    invoke-static {}, Lcom/daaw/mb8;->d()Lcom/daaw/mb8;

    move-result-object v1

    throw v1

    :pswitch_6
    const/4 v1, 0x0

    if-ne v6, v14, :cond_23

    check-cast v12, Lcom/daaw/k58;

    invoke-static {v3, v4, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v2

    iget v4, v7, Lcom/daaw/e58;->a:I

    add-int/2addr v4, v2

    :goto_f
    if-ge v2, v4, :cond_21

    invoke-static {v3, v2, v7}, Lcom/daaw/h58;->m([BILcom/daaw/e58;)I

    move-result v2

    iget-wide v5, v7, Lcom/daaw/e58;->b:J

    cmp-long v8, v5, v10

    if-eqz v8, :cond_20

    const/4 v5, 0x1

    goto :goto_10

    :cond_20
    const/4 v5, 0x0

    :goto_10
    invoke-virtual {v12, v5}, Lcom/daaw/k58;->e(Z)V

    goto :goto_f

    :cond_21
    if-ne v2, v4, :cond_22

    goto/16 :goto_5

    :cond_22
    invoke-static {}, Lcom/daaw/mb8;->f()Lcom/daaw/mb8;

    move-result-object v1

    throw v1

    :cond_23
    if-nez v6, :cond_44

    check-cast v12, Lcom/daaw/k58;

    invoke-static {v3, v4, v7}, Lcom/daaw/h58;->m([BILcom/daaw/e58;)I

    move-result v4

    iget-wide v8, v7, Lcom/daaw/e58;->b:J

    cmp-long v6, v8, v10

    if-eqz v6, :cond_24

    :goto_11
    const/4 v6, 0x1

    goto :goto_12

    :cond_24
    const/4 v6, 0x0

    :goto_12
    invoke-virtual {v12, v6}, Lcom/daaw/k58;->e(Z)V

    if-ge v4, v5, :cond_26

    invoke-static {v3, v4, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v6

    iget v8, v7, Lcom/daaw/e58;->a:I

    if-eq v2, v8, :cond_25

    goto :goto_13

    :cond_25
    invoke-static {v3, v6, v7}, Lcom/daaw/h58;->m([BILcom/daaw/e58;)I

    move-result v4

    iget-wide v8, v7, Lcom/daaw/e58;->b:J

    cmp-long v6, v8, v10

    if-eqz v6, :cond_24

    goto :goto_11

    :cond_26
    :goto_13
    return v4

    :pswitch_7
    if-ne v6, v14, :cond_29

    check-cast v12, Lcom/daaw/ma8;

    invoke-static {v3, v4, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v1

    iget v2, v7, Lcom/daaw/e58;->a:I

    add-int/2addr v2, v1

    :goto_14
    if-ge v1, v2, :cond_27

    invoke-static {v3, v1}, Lcom/daaw/h58;->b([BI)I

    move-result v4

    invoke-virtual {v12, v4}, Lcom/daaw/ma8;->i(I)V

    add-int/lit8 v1, v1, 0x4

    goto :goto_14

    :cond_27
    if-ne v1, v2, :cond_28

    goto/16 :goto_24

    :cond_28
    invoke-static {}, Lcom/daaw/mb8;->f()Lcom/daaw/mb8;

    move-result-object v1

    throw v1

    :cond_29
    if-ne v6, v9, :cond_44

    check-cast v12, Lcom/daaw/ma8;

    invoke-static/range {p2 .. p3}, Lcom/daaw/h58;->b([BI)I

    move-result v1

    :goto_15
    invoke-virtual {v12, v1}, Lcom/daaw/ma8;->i(I)V

    add-int/lit8 v1, v4, 0x4

    if-ge v1, v5, :cond_2b

    invoke-static {v3, v1, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v4

    iget v6, v7, Lcom/daaw/e58;->a:I

    if-eq v2, v6, :cond_2a

    goto :goto_16

    :cond_2a
    invoke-static {v3, v4}, Lcom/daaw/h58;->b([BI)I

    move-result v1

    goto :goto_15

    :cond_2b
    :goto_16
    return v1

    :pswitch_8
    if-ne v6, v14, :cond_2e

    check-cast v12, Lcom/daaw/cd8;

    invoke-static {v3, v4, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v1

    iget v2, v7, Lcom/daaw/e58;->a:I

    add-int/2addr v2, v1

    :goto_17
    if-ge v1, v2, :cond_2c

    invoke-static {v3, v1}, Lcom/daaw/h58;->p([BI)J

    move-result-wide v4

    invoke-virtual {v12, v4, v5}, Lcom/daaw/cd8;->f(J)V

    add-int/lit8 v1, v1, 0x8

    goto :goto_17

    :cond_2c
    if-ne v1, v2, :cond_2d

    goto/16 :goto_24

    :cond_2d
    invoke-static {}, Lcom/daaw/mb8;->f()Lcom/daaw/mb8;

    move-result-object v1

    throw v1

    :cond_2e
    if-ne v6, v13, :cond_44

    check-cast v12, Lcom/daaw/cd8;

    invoke-static/range {p2 .. p3}, Lcom/daaw/h58;->p([BI)J

    move-result-wide v8

    :goto_18
    invoke-virtual {v12, v8, v9}, Lcom/daaw/cd8;->f(J)V

    add-int/lit8 v1, v4, 0x8

    if-ge v1, v5, :cond_30

    invoke-static {v3, v1, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v4

    iget v6, v7, Lcom/daaw/e58;->a:I

    if-eq v2, v6, :cond_2f

    goto :goto_19

    :cond_2f
    invoke-static {v3, v4}, Lcom/daaw/h58;->p([BI)J

    move-result-wide v8

    goto :goto_18

    :cond_30
    :goto_19
    return v1

    :pswitch_9
    if-ne v6, v14, :cond_31

    invoke-static {v3, v4, v12, v7}, Lcom/daaw/h58;->f([BILcom/daaw/db8;Lcom/daaw/e58;)I

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

    invoke-static/range {p5 .. p10}, Lcom/daaw/h58;->l(I[BIILcom/daaw/db8;Lcom/daaw/e58;)I

    move-result v1

    return v1

    :pswitch_a
    if-ne v6, v14, :cond_35

    check-cast v12, Lcom/daaw/cd8;

    invoke-static {v3, v4, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v1

    iget v2, v7, Lcom/daaw/e58;->a:I

    add-int/2addr v2, v1

    :goto_1a
    if-ge v1, v2, :cond_33

    invoke-static {v3, v1, v7}, Lcom/daaw/h58;->m([BILcom/daaw/e58;)I

    move-result v1

    iget-wide v4, v7, Lcom/daaw/e58;->b:J

    invoke-virtual {v12, v4, v5}, Lcom/daaw/cd8;->f(J)V

    goto :goto_1a

    :cond_33
    if-ne v1, v2, :cond_34

    goto/16 :goto_24

    :cond_34
    invoke-static {}, Lcom/daaw/mb8;->f()Lcom/daaw/mb8;

    move-result-object v1

    throw v1

    :cond_35
    if-nez v6, :cond_44

    check-cast v12, Lcom/daaw/cd8;

    :cond_36
    invoke-static {v3, v4, v7}, Lcom/daaw/h58;->m([BILcom/daaw/e58;)I

    move-result v1

    iget-wide v8, v7, Lcom/daaw/e58;->b:J

    invoke-virtual {v12, v8, v9}, Lcom/daaw/cd8;->f(J)V

    if-ge v1, v5, :cond_37

    invoke-static {v3, v1, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v4

    iget v6, v7, Lcom/daaw/e58;->a:I

    if-eq v2, v6, :cond_36

    :cond_37
    return v1

    :pswitch_b
    if-ne v6, v14, :cond_3a

    check-cast v12, Lcom/daaw/g98;

    invoke-static {v3, v4, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v1

    iget v2, v7, Lcom/daaw/e58;->a:I

    add-int/2addr v2, v1

    :goto_1b
    if-ge v1, v2, :cond_38

    invoke-static {v3, v1}, Lcom/daaw/h58;->b([BI)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    invoke-virtual {v12, v4}, Lcom/daaw/g98;->e(F)V

    add-int/lit8 v1, v1, 0x4

    goto :goto_1b

    :cond_38
    if-ne v1, v2, :cond_39

    goto/16 :goto_24

    :cond_39
    invoke-static {}, Lcom/daaw/mb8;->f()Lcom/daaw/mb8;

    move-result-object v1

    throw v1

    :cond_3a
    if-ne v6, v9, :cond_44

    check-cast v12, Lcom/daaw/g98;

    invoke-static/range {p2 .. p3}, Lcom/daaw/h58;->b([BI)I

    move-result v1

    :goto_1c
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-virtual {v12, v1}, Lcom/daaw/g98;->e(F)V

    add-int/lit8 v1, v4, 0x4

    if-ge v1, v5, :cond_3c

    invoke-static {v3, v1, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v4

    iget v6, v7, Lcom/daaw/e58;->a:I

    if-eq v2, v6, :cond_3b

    goto :goto_1d

    :cond_3b
    invoke-static {v3, v4}, Lcom/daaw/h58;->b([BI)I

    move-result v1

    goto :goto_1c

    :cond_3c
    :goto_1d
    return v1

    :pswitch_c
    if-ne v6, v14, :cond_3f

    check-cast v12, Lcom/daaw/c88;

    invoke-static {v3, v4, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v1

    iget v2, v7, Lcom/daaw/e58;->a:I

    add-int/2addr v2, v1

    :goto_1e
    if-ge v1, v2, :cond_3d

    invoke-static {v3, v1}, Lcom/daaw/h58;->p([BI)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v4

    invoke-virtual {v12, v4, v5}, Lcom/daaw/c88;->e(D)V

    add-int/lit8 v1, v1, 0x8

    goto :goto_1e

    :cond_3d
    if-ne v1, v2, :cond_3e

    goto :goto_24

    :cond_3e
    invoke-static {}, Lcom/daaw/mb8;->f()Lcom/daaw/mb8;

    move-result-object v1

    throw v1

    :cond_3f
    if-ne v6, v13, :cond_44

    check-cast v12, Lcom/daaw/c88;

    invoke-static/range {p2 .. p3}, Lcom/daaw/h58;->p([BI)J

    move-result-wide v8

    :goto_1f
    invoke-static {v8, v9}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v8

    invoke-virtual {v12, v8, v9}, Lcom/daaw/c88;->e(D)V

    add-int/lit8 v1, v4, 0x8

    if-ge v1, v5, :cond_41

    invoke-static {v3, v1, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v4

    iget v6, v7, Lcom/daaw/e58;->a:I

    if-eq v2, v6, :cond_40

    goto :goto_20

    :cond_40
    invoke-static {v3, v4}, Lcom/daaw/h58;->p([BI)J

    move-result-wide v8

    goto :goto_1f

    :cond_41
    :goto_20
    return v1

    :goto_21
    if-ge v4, v5, :cond_43

    invoke-static {v3, v4, v7}, Lcom/daaw/h58;->j([BILcom/daaw/e58;)I

    move-result v8

    iget v9, v7, Lcom/daaw/e58;->a:I

    if-eq v2, v9, :cond_42

    goto :goto_22

    :cond_42
    move-object/from16 p6, v1

    move-object/from16 p7, p2

    move/from16 p8, v8

    move/from16 p9, p4

    move/from16 p10, v6

    move-object/from16 p11, p14

    invoke-static/range {p6 .. p11}, Lcom/daaw/h58;->c(Lcom/daaw/ve8;[BIIILcom/daaw/e58;)I

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

.method public final U(I)I
    .locals 1

    iget v0, p0, Lcom/daaw/fe8;->c:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Lcom/daaw/fe8;->d:I

    if-gt p1, v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/fe8;->X(II)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final V(II)I
    .locals 1

    iget v0, p0, Lcom/daaw/fe8;->c:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Lcom/daaw/fe8;->d:I

    if-gt p1, v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/fe8;->X(II)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final W(I)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/fe8;->a:[I

    add-int/lit8 p1, p1, 0x2

    aget p1, v0, p1

    return p1
.end method

.method public final X(II)I
    .locals 5

    iget-object v0, p0, Lcom/daaw/fe8;->a:[I

    array-length v0, v0

    div-int/lit8 v0, v0, 0x3

    const/4 v1, -0x1

    add-int/2addr v0, v1

    :goto_0
    if-gt p2, v0, :cond_2

    add-int v2, v0, p2

    ushr-int/lit8 v2, v2, 0x1

    mul-int/lit8 v3, v2, 0x3

    iget-object v4, p0, Lcom/daaw/fe8;->a:[I

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

.method public final a(Ljava/lang/Object;)I
    .locals 8

    iget-object v0, p0, Lcom/daaw/fe8;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Lcom/daaw/fe8;->i(I)I

    move-result v3

    iget-object v4, p0, Lcom/daaw/fe8;->a:[I

    aget v4, v4, v1

    const v5, 0xfffff

    and-int/2addr v5, v3

    int-to-long v5, v5

    invoke-static {v3}, Lcom/daaw/fe8;->h(I)I

    move-result v3

    const/16 v7, 0x25

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_c

    :pswitch_0
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :pswitch_1
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :pswitch_2
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :pswitch_3
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :pswitch_4
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :pswitch_5
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_1
    goto :goto_2

    :pswitch_6
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_2

    :pswitch_7
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :pswitch_8
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :pswitch_9
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_6

    :pswitch_a
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/daaw/fe8;->F(Ljava/lang/Object;J)Z

    move-result v3

    goto/16 :goto_7

    :pswitch_b
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_2

    :pswitch_c
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_3

    :pswitch_d
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_2
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/daaw/fe8;->P(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_b

    :pswitch_e
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_3

    :pswitch_f
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_3
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/daaw/fe8;->j(Ljava/lang/Object;J)J

    move-result-wide v3

    goto/16 :goto_a

    :pswitch_10
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/daaw/fe8;->M(Ljava/lang/Object;J)F

    move-result v3

    goto :goto_8

    :pswitch_11
    invoke-virtual {p0, p1, v4, v1}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/daaw/fe8;->L(Ljava/lang/Object;J)D

    move-result-wide v3

    goto :goto_9

    :pswitch_12
    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    goto :goto_5

    :goto_4
    :pswitch_13
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_b

    :pswitch_14
    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

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

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto :goto_b

    :pswitch_16
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->B(Ljava/lang/Object;J)Z

    move-result v3

    :goto_7
    invoke-static {v3}, Lcom/daaw/gb8;->a(Z)I

    move-result v3

    goto :goto_b

    :pswitch_17
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v3

    goto :goto_b

    :pswitch_18
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    goto :goto_a

    :pswitch_19
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->g(Ljava/lang/Object;J)F

    move-result v3

    :goto_8
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    goto :goto_b

    :pswitch_1a
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->f(Ljava/lang/Object;J)D

    move-result-wide v3

    :goto_9
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    :goto_a
    invoke-static {v3, v4}, Lcom/daaw/gb8;->c(J)I

    move-result v3

    :goto_b
    add-int/2addr v2, v3

    :cond_1
    :goto_c
    add-int/lit8 v1, v1, 0x3

    goto/16 :goto_0

    :cond_2
    mul-int/lit8 v2, v2, 0x35

    iget-object v0, p0, Lcom/daaw/fe8;->l:Lcom/daaw/og8;

    invoke-virtual {v0, p1}, Lcom/daaw/og8;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v2, v0

    iget-boolean v0, p0, Lcom/daaw/fe8;->f:Z

    if-nez v0, :cond_3

    return v2

    :cond_3
    iget-object v0, p0, Lcom/daaw/fe8;->m:Lcom/daaw/o88;

    invoke-virtual {v0, p1}, Lcom/daaw/o88;->a(Ljava/lang/Object;)Lcom/daaw/a98;

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

.method public final b(Ljava/lang/Object;)V
    .locals 7

    invoke-static {p1}, Lcom/daaw/fe8;->D(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Lcom/daaw/ja8;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/daaw/ja8;

    const v2, 0x7fffffff

    invoke-virtual {v0, v2}, Lcom/daaw/ja8;->w(I)V

    iput v1, v0, Lcom/daaw/w48;->zzb:I

    invoke-virtual {v0}, Lcom/daaw/ja8;->u()V

    :cond_1
    iget-object v0, p0, Lcom/daaw/fe8;->a:[I

    array-length v0, v0

    :goto_0
    if-ge v1, v0, :cond_4

    invoke-virtual {p0, v1}, Lcom/daaw/fe8;->i(I)I

    move-result v2

    const v3, 0xfffff

    and-int/2addr v3, v2

    int-to-long v3, v3

    invoke-static {v2}, Lcom/daaw/fe8;->h(I)I

    move-result v2

    const/16 v5, 0x9

    if-eq v2, v5, :cond_2

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    sget-object v2, Lcom/daaw/fe8;->q:Lsun/misc/Unsafe;

    invoke-virtual {v2, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_3

    move-object v6, v5

    check-cast v6, Lcom/daaw/nd8;

    invoke-virtual {v6}, Lcom/daaw/nd8;->c()V

    invoke-virtual {v2, p1, v3, v4, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    iget-object v2, p0, Lcom/daaw/fe8;->k:Lcom/daaw/zc8;

    invoke-virtual {v2, p1, v3, v4}, Lcom/daaw/zc8;->a(Ljava/lang/Object;J)V

    goto :goto_1

    :cond_2
    :pswitch_2
    invoke-virtual {p0, p1, v1}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0, v1}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v2

    sget-object v5, Lcom/daaw/fe8;->q:Lsun/misc/Unsafe;

    invoke-virtual {v5, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/daaw/ve8;->b(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x3

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/daaw/fe8;->l:Lcom/daaw/og8;

    invoke-virtual {v0, p1}, Lcom/daaw/og8;->g(Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/daaw/fe8;->f:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/daaw/fe8;->m:Lcom/daaw/o88;

    invoke-virtual {v0, p1}, Lcom/daaw/o88;->b(Ljava/lang/Object;)V

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
    iget v2, v6, Lcom/daaw/fe8;->i:I

    const/4 v11, 0x0

    const/4 v3, 0x1

    if-ge v10, v2, :cond_b

    iget-object v2, v6, Lcom/daaw/fe8;->h:[I

    aget v12, v2, v10

    iget-object v2, v6, Lcom/daaw/fe8;->a:[I

    aget v13, v2, v12

    invoke-virtual {v6, v12}, Lcom/daaw/fe8;->i(I)I

    move-result v14

    iget-object v2, v6, Lcom/daaw/fe8;->a:[I

    add-int/lit8 v4, v12, 0x2

    aget v2, v2, v4

    and-int v4, v2, v8

    ushr-int/lit8 v2, v2, 0x14

    shl-int v15, v3, v2

    if-eq v4, v0, :cond_1

    if-eq v4, v8, :cond_0

    sget-object v0, Lcom/daaw/fe8;->q:Lsun/misc/Unsafe;

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

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/fe8;->B(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    return v9

    :cond_3
    :goto_2
    invoke-static {v14}, Lcom/daaw/fe8;->h(I)I

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

    invoke-static {v7, v0, v1}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/nd8;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v6, v12}, Lcom/daaw/fe8;->m(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ld8;

    throw v11

    :cond_6
    invoke-virtual {v6, v7, v13, v12}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {v6, v12}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v0

    invoke-static {v7, v14, v0}, Lcom/daaw/fe8;->C(Ljava/lang/Object;ILcom/daaw/ve8;)Z

    move-result v0

    if-nez v0, :cond_a

    return v9

    :cond_7
    and-int v0, v14, v8

    int-to-long v0, v0

    invoke-static {v7, v0, v1}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_a

    invoke-virtual {v6, v12}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v1

    const/4 v2, 0x0

    :goto_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_a

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Lcom/daaw/ve8;->c(Ljava/lang/Object;)Z

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

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/fe8;->B(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {v6, v12}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v0

    invoke-static {v7, v14, v0}, Lcom/daaw/fe8;->C(Ljava/lang/Object;ILcom/daaw/ve8;)Z

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
    iget-boolean v0, v6, Lcom/daaw/fe8;->f:Z

    if-nez v0, :cond_c

    return v3

    :cond_c
    iget-object v0, v6, Lcom/daaw/fe8;->m:Lcom/daaw/o88;

    invoke-virtual {v0, v7}, Lcom/daaw/o88;->a(Ljava/lang/Object;)Lcom/daaw/a98;

    goto :goto_6

    :goto_5
    throw v11

    :goto_6
    goto :goto_5
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    invoke-static {p1}, Lcom/daaw/fe8;->q(Ljava/lang/Object;)V

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/fe8;->a:[I

    array-length v1, v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Lcom/daaw/fe8;->i(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v2, v1

    int-to-long v2, v2

    iget-object v4, p0, Lcom/daaw/fe8;->a:[I

    aget v4, v4, v0

    invoke-static {v1}, Lcom/daaw/fe8;->h(I)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_7

    :pswitch_0
    invoke-virtual {p0, p2, v4, v0}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :pswitch_1
    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/fe8;->s(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_7

    :pswitch_2
    invoke-virtual {p0, p2, v4, v0}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_1
    invoke-static {p2, v2, v3}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v2, v3, v1}, Lcom/daaw/ih8;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v4, v0}, Lcom/daaw/fe8;->u(Ljava/lang/Object;II)V

    goto/16 :goto_7

    :pswitch_3
    iget-object v1, p0, Lcom/daaw/fe8;->o:Lcom/daaw/pd8;

    invoke-static {v1, p1, p2, v2, v3}, Lcom/daaw/ze8;->B(Lcom/daaw/pd8;Ljava/lang/Object;Ljava/lang/Object;J)V

    goto/16 :goto_7

    :pswitch_4
    iget-object v1, p0, Lcom/daaw/fe8;->k:Lcom/daaw/zc8;

    invoke-virtual {v1, p1, p2, v2, v3}, Lcom/daaw/zc8;->b(Ljava/lang/Object;Ljava/lang/Object;J)V

    goto/16 :goto_7

    :pswitch_5
    invoke-virtual {p0, p2, v0}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_5

    :pswitch_6
    invoke-virtual {p0, p2, v0}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :pswitch_7
    invoke-virtual {p0, p2, v0}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_5

    :pswitch_8
    invoke-virtual {p0, p2, v0}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :pswitch_9
    invoke-virtual {p0, p2, v0}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_2
    goto :goto_4

    :pswitch_a
    invoke-virtual {p0, p2, v0}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    :pswitch_b
    invoke-virtual {p0, p2, v0}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_3

    :pswitch_c
    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/fe8;->r(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_7

    :pswitch_d
    invoke-virtual {p0, p2, v0}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_3
    invoke-static {p2, v2, v3}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v2, v3, v1}, Lcom/daaw/ih8;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_6

    :pswitch_e
    invoke-virtual {p0, p2, v0}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, Lcom/daaw/ih8;->B(Ljava/lang/Object;J)Z

    move-result v1

    invoke-static {p1, v2, v3, v1}, Lcom/daaw/ih8;->r(Ljava/lang/Object;JZ)V

    goto :goto_6

    :pswitch_f
    invoke-virtual {p0, p2, v0}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    :pswitch_10
    invoke-virtual {p0, p2, v0}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_5

    :pswitch_11
    invoke-virtual {p0, p2, v0}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_4
    invoke-static {p2, v2, v3}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v2, v3, v1}, Lcom/daaw/ih8;->v(Ljava/lang/Object;JI)V

    goto :goto_6

    :pswitch_12
    invoke-virtual {p0, p2, v0}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_5

    :pswitch_13
    invoke-virtual {p0, p2, v0}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_5
    invoke-static {p2, v2, v3}, Lcom/daaw/ih8;->i(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-static {p1, v2, v3, v4, v5}, Lcom/daaw/ih8;->w(Ljava/lang/Object;JJ)V

    goto :goto_6

    :pswitch_14
    invoke-virtual {p0, p2, v0}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, Lcom/daaw/ih8;->g(Ljava/lang/Object;J)F

    move-result v1

    invoke-static {p1, v2, v3, v1}, Lcom/daaw/ih8;->u(Ljava/lang/Object;JF)V

    goto :goto_6

    :pswitch_15
    invoke-virtual {p0, p2, v0}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v2, v3}, Lcom/daaw/ih8;->f(Ljava/lang/Object;J)D

    move-result-wide v4

    invoke-static {p1, v2, v3, v4, v5}, Lcom/daaw/ih8;->t(Ljava/lang/Object;JD)V

    :goto_6
    invoke-virtual {p0, p1, v0}, Lcom/daaw/fe8;->t(Ljava/lang/Object;I)V

    :cond_0
    :goto_7
    add-int/lit8 v0, v0, 0x3

    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/fe8;->l:Lcom/daaw/og8;

    invoke-static {v0, p1, p2}, Lcom/daaw/ze8;->f(Lcom/daaw/og8;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/daaw/fe8;->f:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/fe8;->m:Lcom/daaw/o88;

    invoke-static {v0, p1, p2}, Lcom/daaw/ze8;->e(Lcom/daaw/o88;Ljava/lang/Object;Ljava/lang/Object;)V

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

    iget-object v0, p0, Lcom/daaw/fe8;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-virtual {p0, v2}, Lcom/daaw/fe8;->i(I)I

    move-result v3

    const v4, 0xfffff

    and-int v5, v3, v4

    int-to-long v5, v5

    invoke-static {v3}, Lcom/daaw/fe8;->h(I)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_2

    :pswitch_0
    invoke-virtual {p0, v2}, Lcom/daaw/fe8;->W(I)I

    move-result v3

    and-int/2addr v3, v4

    int-to-long v3, v3

    invoke-static {p1, v3, v4}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v7

    invoke-static {p2, v3, v4}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v3

    if-ne v7, v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/daaw/ze8;->z(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_1

    :pswitch_1
    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/daaw/ze8;->z(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_1

    :pswitch_2
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/fe8;->z(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/daaw/ze8;->z(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :pswitch_3
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/fe8;->z(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lcom/daaw/ih8;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    goto/16 :goto_2

    :pswitch_4
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/fe8;->z(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_2

    :pswitch_5
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/fe8;->z(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lcom/daaw/ih8;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    goto/16 :goto_2

    :pswitch_6
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/fe8;->z(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_2

    :pswitch_7
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/fe8;->z(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_2

    :pswitch_8
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/fe8;->z(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_2

    :pswitch_9
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/fe8;->z(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/daaw/ze8;->z(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :pswitch_a
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/fe8;->z(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/daaw/ze8;->z(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :pswitch_b
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/fe8;->z(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/daaw/ze8;->z(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :pswitch_c
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/fe8;->z(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->B(Ljava/lang/Object;J)Z

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/daaw/ih8;->B(Ljava/lang/Object;J)Z

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_2

    :pswitch_d
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/fe8;->z(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto/16 :goto_2

    :pswitch_e
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/fe8;->z(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lcom/daaw/ih8;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    goto/16 :goto_2

    :pswitch_f
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/fe8;->z(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto :goto_2

    :pswitch_10
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/fe8;->z(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lcom/daaw/ih8;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    goto :goto_2

    :pswitch_11
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/fe8;->z(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->i(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lcom/daaw/ih8;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    goto :goto_2

    :pswitch_12
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/fe8;->z(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->g(Ljava/lang/Object;J)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    invoke-static {p2, v5, v6}, Lcom/daaw/ih8;->g(Ljava/lang/Object;J)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    if-ne v3, v4, :cond_0

    goto :goto_2

    :pswitch_13
    invoke-virtual {p0, p1, p2, v2}, Lcom/daaw/fe8;->z(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->f(Ljava/lang/Object;J)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    invoke-static {p2, v5, v6}, Lcom/daaw/ih8;->f(Ljava/lang/Object;J)D

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
    iget-object v0, p0, Lcom/daaw/fe8;->l:Lcom/daaw/og8;

    invoke-virtual {v0, p1}, Lcom/daaw/og8;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/fe8;->l:Lcom/daaw/og8;

    invoke-virtual {v2, p2}, Lcom/daaw/og8;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    return v1

    :cond_3
    iget-boolean v0, p0, Lcom/daaw/fe8;->f:Z

    if-nez v0, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    iget-object v0, p0, Lcom/daaw/fe8;->m:Lcom/daaw/o88;

    invoke-virtual {v0, p1}, Lcom/daaw/o88;->a(Ljava/lang/Object;)Lcom/daaw/a98;

    iget-object p1, p0, Lcom/daaw/fe8;->m:Lcom/daaw/o88;

    invoke-virtual {p1, p2}, Lcom/daaw/o88;->a(Ljava/lang/Object;)Lcom/daaw/a98;

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

.method public final f(Ljava/lang/Object;Lcom/daaw/ki8;)V
    .locals 9

    iget-boolean v0, p0, Lcom/daaw/fe8;->g:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lcom/daaw/fe8;->f:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/fe8;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, Lcom/daaw/fe8;->i(I)I

    move-result v3

    iget-object v4, p0, Lcom/daaw/fe8;->a:[I

    aget v4, v4, v2

    invoke-static {v3}, Lcom/daaw/fe8;->h(I)I

    move-result v5

    const/4 v6, 0x1

    const v7, 0xfffff

    packed-switch v5, :pswitch_data_0

    goto/16 :goto_13

    :pswitch_0
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_1

    :pswitch_1
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/fe8;->j(Ljava/lang/Object;J)J

    move-result-wide v5

    goto/16 :goto_2

    :pswitch_2
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/fe8;->P(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_3

    :pswitch_3
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/fe8;->j(Ljava/lang/Object;J)J

    move-result-wide v5

    goto/16 :goto_4

    :pswitch_4
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/fe8;->P(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_5

    :pswitch_5
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/fe8;->P(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_6

    :pswitch_6
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/fe8;->P(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_7

    :pswitch_7
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_8

    :pswitch_8
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_9

    :pswitch_9
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_a

    :pswitch_a
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/fe8;->F(Ljava/lang/Object;J)Z

    move-result v3

    goto/16 :goto_b

    :pswitch_b
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/fe8;->P(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_c

    :pswitch_c
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/fe8;->j(Ljava/lang/Object;J)J

    move-result-wide v5

    goto/16 :goto_d

    :pswitch_d
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/fe8;->P(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_e

    :pswitch_e
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/fe8;->j(Ljava/lang/Object;J)J

    move-result-wide v5

    goto/16 :goto_f

    :pswitch_f
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/fe8;->j(Ljava/lang/Object;J)J

    move-result-wide v5

    goto/16 :goto_10

    :pswitch_10
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/fe8;->M(Ljava/lang/Object;J)F

    move-result v3

    goto/16 :goto_11

    :pswitch_11
    invoke-virtual {p0, p1, v4, v2}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/fe8;->L(Ljava/lang/Object;J)D

    move-result-wide v5

    goto/16 :goto_12

    :pswitch_12
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, p2, v4, v3, v2}, Lcom/daaw/fe8;->y(Lcom/daaw/ki8;ILjava/lang/Object;I)V

    goto/16 :goto_13

    :pswitch_13
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {p0, v2}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v5

    invoke-static {v4, v3, p2, v5}, Lcom/daaw/ze8;->o(ILjava/util/List;Lcom/daaw/ki8;Lcom/daaw/ve8;)V

    goto/16 :goto_13

    :pswitch_14
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ze8;->v(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_15
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ze8;->u(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_16
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ze8;->t(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_17
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ze8;->s(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_18
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ze8;->k(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_19
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ze8;->x(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_1a
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ze8;->h(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_1b
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ze8;->l(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_1c
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ze8;->m(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_1d
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ze8;->p(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_1e
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ze8;->y(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_1f
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ze8;->q(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_20
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ze8;->n(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_21
    and-int/2addr v3, v7

    int-to-long v7, v3

    invoke-static {p1, v7, v8}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v6}, Lcom/daaw/ze8;->j(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_22
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ze8;->v(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_23
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ze8;->u(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_24
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ze8;->t(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_25
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ze8;->s(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_26
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ze8;->k(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_27
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ze8;->x(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_28
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2}, Lcom/daaw/ze8;->i(ILjava/util/List;Lcom/daaw/ki8;)V

    goto/16 :goto_13

    :pswitch_29
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {p0, v2}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v5

    invoke-static {v4, v3, p2, v5}, Lcom/daaw/ze8;->r(ILjava/util/List;Lcom/daaw/ki8;Lcom/daaw/ve8;)V

    goto/16 :goto_13

    :pswitch_2a
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2}, Lcom/daaw/ze8;->w(ILjava/util/List;Lcom/daaw/ki8;)V

    goto/16 :goto_13

    :pswitch_2b
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ze8;->h(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_2c
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ze8;->l(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_2d
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ze8;->m(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_2e
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ze8;->p(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_2f
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ze8;->y(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_30
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ze8;->q(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_31
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ze8;->n(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_32
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v4, v3, p2, v1}, Lcom/daaw/ze8;->j(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_13

    :pswitch_33
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    :goto_1
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v2}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v5

    invoke-interface {p2, v4, v3, v5}, Lcom/daaw/ki8;->E(ILjava/lang/Object;Lcom/daaw/ve8;)V

    goto/16 :goto_13

    :pswitch_34
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    :goto_2
    invoke-interface {p2, v4, v5, v6}, Lcom/daaw/ki8;->I(IJ)V

    goto/16 :goto_13

    :pswitch_35
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v3

    :goto_3
    invoke-interface {p2, v4, v3}, Lcom/daaw/ki8;->h(II)V

    goto/16 :goto_13

    :pswitch_36
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    :goto_4
    invoke-interface {p2, v4, v5, v6}, Lcom/daaw/ki8;->m(IJ)V

    goto/16 :goto_13

    :pswitch_37
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v3

    :goto_5
    invoke-interface {p2, v4, v3}, Lcom/daaw/ki8;->w(II)V

    goto/16 :goto_13

    :pswitch_38
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v3

    :goto_6
    invoke-interface {p2, v4, v3}, Lcom/daaw/ki8;->q(II)V

    goto/16 :goto_13

    :pswitch_39
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v3

    :goto_7
    invoke-interface {p2, v4, v3}, Lcom/daaw/ki8;->b(II)V

    goto/16 :goto_13

    :pswitch_3a
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    :goto_8
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/y68;

    invoke-interface {p2, v4, v3}, Lcom/daaw/ki8;->y(ILcom/daaw/y68;)V

    goto/16 :goto_13

    :pswitch_3b
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    :goto_9
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v2}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v5

    invoke-interface {p2, v4, v3, v5}, Lcom/daaw/ki8;->e(ILjava/lang/Object;Lcom/daaw/ve8;)V

    goto/16 :goto_13

    :pswitch_3c
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    :goto_a
    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4, v3, p2}, Lcom/daaw/fe8;->G(ILjava/lang/Object;Lcom/daaw/ki8;)V

    goto/16 :goto_13

    :pswitch_3d
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->B(Ljava/lang/Object;J)Z

    move-result v3

    :goto_b
    invoke-interface {p2, v4, v3}, Lcom/daaw/ki8;->g(IZ)V

    goto/16 :goto_13

    :pswitch_3e
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v3

    :goto_c
    invoke-interface {p2, v4, v3}, Lcom/daaw/ki8;->f(II)V

    goto :goto_13

    :pswitch_3f
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    :goto_d
    invoke-interface {p2, v4, v5, v6}, Lcom/daaw/ki8;->a(IJ)V

    goto :goto_13

    :pswitch_40
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v3

    :goto_e
    invoke-interface {p2, v4, v3}, Lcom/daaw/ki8;->v(II)V

    goto :goto_13

    :pswitch_41
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    :goto_f
    invoke-interface {p2, v4, v5, v6}, Lcom/daaw/ki8;->F(IJ)V

    goto :goto_13

    :pswitch_42
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->i(Ljava/lang/Object;J)J

    move-result-wide v5

    :goto_10
    invoke-interface {p2, v4, v5, v6}, Lcom/daaw/ki8;->k(IJ)V

    goto :goto_13

    :pswitch_43
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->g(Ljava/lang/Object;J)F

    move-result v3

    :goto_11
    invoke-interface {p2, v4, v3}, Lcom/daaw/ki8;->x(IF)V

    goto :goto_13

    :pswitch_44
    invoke-virtual {p0, p1, v2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v5

    if-eqz v5, :cond_0

    and-int/2addr v3, v7

    int-to-long v5, v3

    invoke-static {p1, v5, v6}, Lcom/daaw/ih8;->f(Ljava/lang/Object;J)D

    move-result-wide v5

    :goto_12
    invoke-interface {p2, v4, v5, v6}, Lcom/daaw/ki8;->t(ID)V

    :cond_0
    :goto_13
    add-int/lit8 v2, v2, 0x3

    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/fe8;->l:Lcom/daaw/og8;

    invoke-virtual {v0, p1}, Lcom/daaw/og8;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lcom/daaw/og8;->i(Ljava/lang/Object;Lcom/daaw/ki8;)V

    return-void

    :cond_2
    iget-object p2, p0, Lcom/daaw/fe8;->m:Lcom/daaw/o88;

    invoke-virtual {p2, p1}, Lcom/daaw/o88;->a(Ljava/lang/Object;)Lcom/daaw/a98;

    const/4 p1, 0x0

    throw p1

    :cond_3
    invoke-virtual {p0, p1, p2}, Lcom/daaw/fe8;->x(Ljava/lang/Object;Lcom/daaw/ki8;)V

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

.method public final g(Ljava/lang/Object;[BIILcom/daaw/e58;)V
    .locals 8

    iget-boolean v0, p0, Lcom/daaw/fe8;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/fe8;->S(Ljava/lang/Object;[BIILcom/daaw/e58;)I

    return-void

    :cond_0
    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v7, p5

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/fe8;->H(Ljava/lang/Object;[BIIILcom/daaw/e58;)I

    return-void
.end method

.method public final i(I)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/fe8;->a:[I

    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    return p1
.end method

.method public final k(I)Lcom/daaw/ua8;
    .locals 1

    div-int/lit8 p1, p1, 0x3

    iget-object v0, p0, Lcom/daaw/fe8;->b:[Ljava/lang/Object;

    add-int/2addr p1, p1

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    check-cast p1, Lcom/daaw/ua8;

    return-object p1
.end method

.method public final l(I)Lcom/daaw/ve8;
    .locals 3

    div-int/lit8 p1, p1, 0x3

    add-int/2addr p1, p1

    iget-object v0, p0, Lcom/daaw/fe8;->b:[Ljava/lang/Object;

    aget-object v0, v0, p1

    check-cast v0, Lcom/daaw/ve8;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, Lcom/daaw/pe8;->a()Lcom/daaw/pe8;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/fe8;->b:[Ljava/lang/Object;

    add-int/lit8 v2, p1, 0x1

    aget-object v1, v1, v2

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v0, v1}, Lcom/daaw/pe8;->b(Ljava/lang/Class;)Lcom/daaw/ve8;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/fe8;->b:[Ljava/lang/Object;

    aput-object v0, v1, p1

    return-object v0
.end method

.method public final m(I)Ljava/lang/Object;
    .locals 1

    div-int/lit8 p1, p1, 0x3

    iget-object v0, p0, Lcom/daaw/fe8;->b:[Ljava/lang/Object;

    add-int/2addr p1, p1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final n(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0, p2}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v0

    invoke-virtual {p0, p2}, Lcom/daaw/fe8;->i(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {v0}, Lcom/daaw/ve8;->zze()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p2, Lcom/daaw/fe8;->q:Lsun/misc/Unsafe;

    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/fe8;->D(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, Lcom/daaw/ve8;->zze()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, Lcom/daaw/ve8;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method public final o(Ljava/lang/Object;II)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0, p3}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {v0}, Lcom/daaw/ve8;->zze()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p2, Lcom/daaw/fe8;->q:Lsun/misc/Unsafe;

    invoke-virtual {p0, p3}, Lcom/daaw/fe8;->i(I)I

    move-result p3

    const v1, 0xfffff

    and-int/2addr p3, v1

    int-to-long v1, p3

    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/fe8;->D(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, Lcom/daaw/ve8;->zze()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, Lcom/daaw/ve8;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method public final r(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 5

    invoke-virtual {p0, p2, p3}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p3}, Lcom/daaw/fe8;->i(I)I

    move-result v0

    const v1, 0xfffff

    and-int/2addr v0, v1

    int-to-long v0, v0

    sget-object v2, Lcom/daaw/fe8;->q:Lsun/misc/Unsafe;

    invoke-virtual {v2, p2, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {p0, p3}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object p2

    invoke-virtual {p0, p1, p3}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v3}, Lcom/daaw/fe8;->D(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v2, p1, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Lcom/daaw/ve8;->zze()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4, v3}, Lcom/daaw/ve8;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p1, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-virtual {p0, p1, p3}, Lcom/daaw/fe8;->t(Ljava/lang/Object;I)V

    return-void

    :cond_2
    invoke-virtual {v2, p1, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lcom/daaw/fe8;->D(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    invoke-interface {p2}, Lcom/daaw/ve8;->zze()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4, p3}, Lcom/daaw/ve8;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p1, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p3, v4

    :cond_3
    invoke-interface {p2, p3, v3}, Lcom/daaw/ve8;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object v0, p0, Lcom/daaw/fe8;->a:[I

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

.method public final s(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/fe8;->a:[I

    aget v0, v0, p3

    invoke-virtual {p0, p2, v0, p3}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p3}, Lcom/daaw/fe8;->i(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    sget-object v3, Lcom/daaw/fe8;->q:Lsun/misc/Unsafe;

    invoke-virtual {v3, p2, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {p0, p3}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p3}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-static {v4}, Lcom/daaw/fe8;->D(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v3, p1, v1, v2, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Lcom/daaw/ve8;->zze()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {p2, v5, v4}, Lcom/daaw/ve8;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, p1, v1, v2, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-virtual {p0, p1, v0, p3}, Lcom/daaw/fe8;->u(Ljava/lang/Object;II)V

    return-void

    :cond_2
    invoke-virtual {v3, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lcom/daaw/fe8;->D(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p2}, Lcom/daaw/ve8;->zze()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v0, p3}, Lcom/daaw/ve8;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, p1, v1, v2, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p3, v0

    :cond_3
    invoke-interface {p2, p3, v4}, Lcom/daaw/ve8;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object v0, p0, Lcom/daaw/fe8;->a:[I

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

.method public final t(Ljava/lang/Object;I)V
    .locals 5

    invoke-virtual {p0, p2}, Lcom/daaw/fe8;->W(I)I

    move-result p2

    const v0, 0xfffff

    and-int/2addr v0, p2

    int-to-long v0, v0

    const-wide/32 v2, 0xfffff

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-void

    :cond_0
    invoke-static {p1, v0, v1}, Lcom/daaw/ih8;->h(Ljava/lang/Object;J)I

    move-result v2

    const/4 v3, 0x1

    ushr-int/lit8 p2, p2, 0x14

    shl-int p2, v3, p2

    or-int/2addr p2, v2

    invoke-static {p1, v0, v1, p2}, Lcom/daaw/ih8;->v(Ljava/lang/Object;JI)V

    return-void
.end method

.method public final u(Ljava/lang/Object;II)V
    .locals 2

    invoke-virtual {p0, p3}, Lcom/daaw/fe8;->W(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1, p2}, Lcom/daaw/ih8;->v(Ljava/lang/Object;JI)V

    return-void
.end method

.method public final v(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 3

    sget-object v0, Lcom/daaw/fe8;->q:Lsun/misc/Unsafe;

    invoke-virtual {p0, p2}, Lcom/daaw/fe8;->i(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v0, p1, v1, v2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lcom/daaw/fe8;->t(Ljava/lang/Object;I)V

    return-void
.end method

.method public final w(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 3

    sget-object v0, Lcom/daaw/fe8;->q:Lsun/misc/Unsafe;

    invoke-virtual {p0, p3}, Lcom/daaw/fe8;->i(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v0, p1, v1, v2, p4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/fe8;->u(Ljava/lang/Object;II)V

    return-void
.end method

.method public final x(Ljava/lang/Object;Lcom/daaw/ki8;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-boolean v3, v0, Lcom/daaw/fe8;->f:Z

    if-nez v3, :cond_5

    iget-object v3, v0, Lcom/daaw/fe8;->a:[I

    array-length v3, v3

    sget-object v4, Lcom/daaw/fe8;->q:Lsun/misc/Unsafe;

    const v5, 0xfffff

    const/4 v7, 0x0

    const/4 v8, 0x0

    const v9, 0xfffff

    :goto_0
    if-ge v7, v3, :cond_4

    invoke-virtual {v0, v7}, Lcom/daaw/fe8;->i(I)I

    move-result v10

    iget-object v11, v0, Lcom/daaw/fe8;->a:[I

    aget v12, v11, v7

    invoke-static {v10}, Lcom/daaw/fe8;->h(I)I

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
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v7}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v6

    invoke-interface {v2, v12, v5, v6}, Lcom/daaw/ki8;->E(ILjava/lang/Object;Lcom/daaw/ve8;)V

    goto :goto_2

    :pswitch_1
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/fe8;->j(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {v2, v12, v5, v6}, Lcom/daaw/ki8;->I(IJ)V

    goto :goto_2

    :pswitch_2
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/fe8;->P(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v2, v12, v5}, Lcom/daaw/ki8;->h(II)V

    goto :goto_2

    :pswitch_3
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/fe8;->j(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {v2, v12, v5, v6}, Lcom/daaw/ki8;->m(IJ)V

    goto :goto_2

    :pswitch_4
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/fe8;->P(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v2, v12, v5}, Lcom/daaw/ki8;->w(II)V

    goto :goto_2

    :pswitch_5
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/fe8;->P(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v2, v12, v5}, Lcom/daaw/ki8;->q(II)V

    goto :goto_2

    :pswitch_6
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/fe8;->P(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v2, v12, v5}, Lcom/daaw/ki8;->b(II)V

    goto :goto_2

    :pswitch_7
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/y68;

    invoke-interface {v2, v12, v5}, Lcom/daaw/ki8;->y(ILcom/daaw/y68;)V

    goto :goto_2

    :pswitch_8
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v7}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v6

    invoke-interface {v2, v12, v5, v6}, Lcom/daaw/ki8;->e(ILjava/lang/Object;Lcom/daaw/ve8;)V

    goto/16 :goto_2

    :pswitch_9
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v12, v5, v2}, Lcom/daaw/fe8;->G(ILjava/lang/Object;Lcom/daaw/ki8;)V

    goto/16 :goto_2

    :pswitch_a
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/fe8;->F(Ljava/lang/Object;J)Z

    move-result v5

    invoke-interface {v2, v12, v5}, Lcom/daaw/ki8;->g(IZ)V

    goto/16 :goto_2

    :pswitch_b
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/fe8;->P(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v2, v12, v5}, Lcom/daaw/ki8;->f(II)V

    goto/16 :goto_2

    :pswitch_c
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/fe8;->j(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {v2, v12, v5, v6}, Lcom/daaw/ki8;->a(IJ)V

    goto/16 :goto_2

    :pswitch_d
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/fe8;->P(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v2, v12, v5}, Lcom/daaw/ki8;->v(II)V

    goto/16 :goto_2

    :pswitch_e
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/fe8;->j(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {v2, v12, v5, v6}, Lcom/daaw/ki8;->F(IJ)V

    goto/16 :goto_2

    :pswitch_f
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/fe8;->j(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {v2, v12, v5, v6}, Lcom/daaw/ki8;->k(IJ)V

    goto/16 :goto_2

    :pswitch_10
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/fe8;->M(Ljava/lang/Object;J)F

    move-result v5

    invoke-interface {v2, v12, v5}, Lcom/daaw/ki8;->x(IF)V

    goto/16 :goto_2

    :pswitch_11
    invoke-virtual {v0, v1, v12, v7}, Lcom/daaw/fe8;->E(Ljava/lang/Object;II)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-static {v1, v5, v6}, Lcom/daaw/fe8;->L(Ljava/lang/Object;J)D

    move-result-wide v5

    invoke-interface {v2, v12, v5, v6}, Lcom/daaw/ki8;->t(ID)V

    goto/16 :goto_2

    :pswitch_12
    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v2, v12, v5, v7}, Lcom/daaw/fe8;->y(Lcom/daaw/ki8;ILjava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_13
    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-virtual {v0, v7}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v6

    invoke-static {v10, v5, v2, v6}, Lcom/daaw/ze8;->o(ILjava/util/List;Lcom/daaw/ki8;Lcom/daaw/ve8;)V

    goto/16 :goto_2

    :pswitch_14
    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ze8;->v(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_2

    :pswitch_15
    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ze8;->u(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_2

    :pswitch_16
    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ze8;->t(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_2

    :pswitch_17
    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ze8;->s(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_2

    :pswitch_18
    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ze8;->k(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_2

    :pswitch_19
    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ze8;->x(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_2

    :pswitch_1a
    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ze8;->h(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_2

    :pswitch_1b
    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ze8;->l(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_2

    :pswitch_1c
    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ze8;->m(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_2

    :pswitch_1d
    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ze8;->p(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_2

    :pswitch_1e
    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ze8;->y(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_2

    :pswitch_1f
    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ze8;->q(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_2

    :pswitch_20
    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ze8;->n(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_2

    :pswitch_21
    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v15}, Lcom/daaw/ze8;->j(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_2

    :pswitch_22
    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    const/4 v11, 0x0

    invoke-static {v10, v5, v2, v11}, Lcom/daaw/ze8;->v(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_2

    :pswitch_23
    const/4 v11, 0x0

    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v11}, Lcom/daaw/ze8;->u(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_2

    :pswitch_24
    const/4 v11, 0x0

    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v11}, Lcom/daaw/ze8;->t(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_2

    :pswitch_25
    const/4 v11, 0x0

    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v11}, Lcom/daaw/ze8;->s(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_2

    :pswitch_26
    const/4 v11, 0x0

    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v11}, Lcom/daaw/ze8;->k(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_2

    :pswitch_27
    const/4 v11, 0x0

    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v11}, Lcom/daaw/ze8;->x(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_2

    :pswitch_28
    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2}, Lcom/daaw/ze8;->i(ILjava/util/List;Lcom/daaw/ki8;)V

    goto/16 :goto_2

    :pswitch_29
    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-virtual {v0, v7}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v6

    invoke-static {v10, v5, v2, v6}, Lcom/daaw/ze8;->r(ILjava/util/List;Lcom/daaw/ki8;Lcom/daaw/ve8;)V

    goto/16 :goto_2

    :pswitch_2a
    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2}, Lcom/daaw/ze8;->w(ILjava/util/List;Lcom/daaw/ki8;)V

    goto/16 :goto_2

    :pswitch_2b
    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    const/4 v13, 0x0

    invoke-static {v10, v5, v2, v13}, Lcom/daaw/ze8;->h(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_3

    :pswitch_2c
    const/4 v13, 0x0

    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v13}, Lcom/daaw/ze8;->l(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_3

    :pswitch_2d
    const/4 v13, 0x0

    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v13}, Lcom/daaw/ze8;->m(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_3

    :pswitch_2e
    const/4 v13, 0x0

    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v13}, Lcom/daaw/ze8;->p(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_3

    :pswitch_2f
    const/4 v13, 0x0

    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v13}, Lcom/daaw/ze8;->y(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_3

    :pswitch_30
    const/4 v13, 0x0

    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v13}, Lcom/daaw/ze8;->q(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_3

    :pswitch_31
    const/4 v13, 0x0

    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v13}, Lcom/daaw/ze8;->n(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_3

    :pswitch_32
    const/4 v13, 0x0

    iget-object v10, v0, Lcom/daaw/fe8;->a:[I

    aget v10, v10, v7

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v10, v5, v2, v13}, Lcom/daaw/ze8;->j(ILjava/util/List;Lcom/daaw/ki8;Z)V

    goto/16 :goto_3

    :pswitch_33
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v7}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v6

    invoke-interface {v2, v12, v5, v6}, Lcom/daaw/ki8;->E(ILjava/lang/Object;Lcom/daaw/ve8;)V

    goto/16 :goto_3

    :pswitch_34
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {v2, v12, v5, v6}, Lcom/daaw/ki8;->I(IJ)V

    goto/16 :goto_3

    :pswitch_35
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v2, v12, v5}, Lcom/daaw/ki8;->h(II)V

    goto/16 :goto_3

    :pswitch_36
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {v2, v12, v5, v6}, Lcom/daaw/ki8;->m(IJ)V

    goto/16 :goto_3

    :pswitch_37
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v2, v12, v5}, Lcom/daaw/ki8;->w(II)V

    goto/16 :goto_3

    :pswitch_38
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v2, v12, v5}, Lcom/daaw/ki8;->q(II)V

    goto/16 :goto_3

    :pswitch_39
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v2, v12, v5}, Lcom/daaw/ki8;->b(II)V

    goto/16 :goto_3

    :pswitch_3a
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/y68;

    invoke-interface {v2, v12, v5}, Lcom/daaw/ki8;->y(ILcom/daaw/y68;)V

    goto/16 :goto_3

    :pswitch_3b
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v7}, Lcom/daaw/fe8;->l(I)Lcom/daaw/ve8;

    move-result-object v6

    invoke-interface {v2, v12, v5, v6}, Lcom/daaw/ki8;->e(ILjava/lang/Object;Lcom/daaw/ve8;)V

    goto/16 :goto_3

    :pswitch_3c
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v12, v5, v2}, Lcom/daaw/fe8;->G(ILjava/lang/Object;Lcom/daaw/ki8;)V

    goto/16 :goto_3

    :pswitch_3d
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-static {v1, v5, v6}, Lcom/daaw/ih8;->B(Ljava/lang/Object;J)Z

    move-result v5

    invoke-interface {v2, v12, v5}, Lcom/daaw/ki8;->g(IZ)V

    goto :goto_3

    :pswitch_3e
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v2, v12, v5}, Lcom/daaw/ki8;->f(II)V

    goto :goto_3

    :pswitch_3f
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {v2, v12, v5, v6}, Lcom/daaw/ki8;->a(IJ)V

    goto :goto_3

    :pswitch_40
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v2, v12, v5}, Lcom/daaw/ki8;->v(II)V

    goto :goto_3

    :pswitch_41
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {v2, v12, v5, v6}, Lcom/daaw/ki8;->F(IJ)V

    goto :goto_3

    :pswitch_42
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-virtual {v4, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-interface {v2, v12, v5, v6}, Lcom/daaw/ki8;->k(IJ)V

    goto :goto_3

    :pswitch_43
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-static {v1, v5, v6}, Lcom/daaw/ih8;->g(Ljava/lang/Object;J)F

    move-result v5

    invoke-interface {v2, v12, v5}, Lcom/daaw/ki8;->x(IF)V

    goto :goto_3

    :pswitch_44
    const/4 v13, 0x0

    and-int v10, v8, v11

    if-eqz v10, :cond_3

    invoke-static {v1, v5, v6}, Lcom/daaw/ih8;->f(Ljava/lang/Object;J)D

    move-result-wide v5

    invoke-interface {v2, v12, v5, v6}, Lcom/daaw/ki8;->t(ID)V

    :cond_3
    :goto_3
    add-int/lit8 v7, v7, 0x3

    const v5, 0xfffff

    goto/16 :goto_0

    :cond_4
    iget-object v3, v0, Lcom/daaw/fe8;->l:Lcom/daaw/og8;

    invoke-virtual {v3, v1}, Lcom/daaw/og8;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v3, v1, v2}, Lcom/daaw/og8;->i(Ljava/lang/Object;Lcom/daaw/ki8;)V

    return-void

    :cond_5
    iget-object v2, v0, Lcom/daaw/fe8;->m:Lcom/daaw/o88;

    invoke-virtual {v2, v1}, Lcom/daaw/o88;->a(Ljava/lang/Object;)Lcom/daaw/a98;

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

.method public final y(Lcom/daaw/ki8;ILjava/lang/Object;I)V
    .locals 0

    if-nez p3, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p4}, Lcom/daaw/fe8;->m(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ld8;

    const/4 p1, 0x0

    throw p1
.end method

.method public final z(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 0

    invoke-virtual {p0, p1, p3}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result p1

    invoke-virtual {p0, p2, p3}, Lcom/daaw/fe8;->A(Ljava/lang/Object;I)Z

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final zza(Ljava/lang/Object;)I
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/fe8;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/fe8;->O(Ljava/lang/Object;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/fe8;->N(Ljava/lang/Object;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final zze()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/fe8;->e:Lcom/daaw/zd8;

    check-cast v0, Lcom/daaw/ja8;

    invoke-virtual {v0}, Lcom/daaw/ja8;->k()Lcom/daaw/ja8;

    move-result-object v0

    return-object v0
.end method
