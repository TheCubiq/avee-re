.class public final Lcom/daaw/ut2;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:I

.field public static final b:I

.field public static final c:I

.field public static final d:I

.field public static final e:I

.field public static final f:I

.field public static final g:I

.field public static final h:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "vide"

    invoke-static {v0}, Lcom/daaw/pz2;->g(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/ut2;->a:I

    const-string v0, "soun"

    invoke-static {v0}, Lcom/daaw/pz2;->g(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/ut2;->b:I

    const-string v0, "text"

    invoke-static {v0}, Lcom/daaw/pz2;->g(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/ut2;->c:I

    const-string v0, "sbtl"

    invoke-static {v0}, Lcom/daaw/pz2;->g(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/ut2;->d:I

    const-string v0, "subt"

    invoke-static {v0}, Lcom/daaw/pz2;->g(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/ut2;->e:I

    const-string v0, "clcp"

    invoke-static {v0}, Lcom/daaw/pz2;->g(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/ut2;->f:I

    const-string v0, "cenc"

    invoke-static {v0}, Lcom/daaw/pz2;->g(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/ut2;->g:I

    const-string v0, "meta"

    invoke-static {v0}, Lcom/daaw/pz2;->g(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/daaw/ut2;->h:I

    return-void
.end method

.method public static a(Lcom/daaw/lt2;Lcom/daaw/mt2;JLcom/google/android/gms/internal/ads/zzavc;Z)Lcom/daaw/fu2;
    .locals 50

    move-object/from16 v0, p0

    move-object/from16 v15, p4

    sget v1, Lcom/daaw/nt2;->F:I

    invoke-virtual {v0, v1}, Lcom/daaw/lt2;->d(I)Lcom/daaw/lt2;

    move-result-object v1

    sget v2, Lcom/daaw/nt2;->T:I

    invoke-virtual {v1, v2}, Lcom/daaw/lt2;->e(I)Lcom/daaw/mt2;

    move-result-object v2

    iget-object v2, v2, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    const/16 v14, 0x10

    invoke-virtual {v2, v14}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v2}, Lcom/daaw/iz2;->e()I

    move-result v2

    sget v3, Lcom/daaw/ut2;->b:I

    const/4 v4, 0x4

    const/4 v11, -0x1

    if-ne v2, v3, :cond_0

    const/4 v10, 0x1

    goto :goto_1

    :cond_0
    sget v3, Lcom/daaw/ut2;->a:I

    if-ne v2, v3, :cond_1

    const/4 v10, 0x2

    goto :goto_1

    :cond_1
    sget v3, Lcom/daaw/ut2;->c:I

    if-eq v2, v3, :cond_4

    sget v3, Lcom/daaw/ut2;->d:I

    if-eq v2, v3, :cond_4

    sget v3, Lcom/daaw/ut2;->e:I

    if-eq v2, v3, :cond_4

    sget v3, Lcom/daaw/ut2;->f:I

    if-ne v2, v3, :cond_2

    goto :goto_0

    :cond_2
    sget v3, Lcom/daaw/ut2;->h:I

    if-ne v2, v3, :cond_3

    const/4 v10, 0x4

    goto :goto_1

    :cond_3
    const/4 v10, -0x1

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v10, 0x3

    :goto_1
    const/4 v8, 0x0

    if-ne v10, v11, :cond_5

    return-object v8

    :cond_5
    sget v2, Lcom/daaw/nt2;->P:I

    invoke-virtual {v0, v2}, Lcom/daaw/lt2;->e(I)Lcom/daaw/mt2;

    move-result-object v2

    iget-object v2, v2, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    const/16 v7, 0x8

    invoke-virtual {v2, v7}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v2}, Lcom/daaw/iz2;->e()I

    move-result v3

    invoke-static {v3}, Lcom/daaw/nt2;->b(I)I

    move-result v3

    if-nez v3, :cond_6

    const/16 v5, 0x8

    goto :goto_2

    :cond_6
    const/16 v5, 0x10

    :goto_2
    invoke-virtual {v2, v5}, Lcom/daaw/iz2;->w(I)V

    invoke-virtual {v2}, Lcom/daaw/iz2;->e()I

    move-result v5

    invoke-virtual {v2, v4}, Lcom/daaw/iz2;->w(I)V

    invoke-virtual {v2}, Lcom/daaw/iz2;->c()I

    move-result v6

    if-nez v3, :cond_7

    const/4 v12, 0x4

    goto :goto_3

    :cond_7
    const/16 v12, 0x8

    :goto_3
    const/4 v9, 0x0

    :goto_4
    const-wide/16 v19, 0x0

    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    if-ge v9, v12, :cond_a

    iget-object v13, v2, Lcom/daaw/iz2;->a:[B

    add-int v24, v6, v9

    aget-byte v13, v13, v24

    if-eq v13, v11, :cond_9

    if-nez v3, :cond_8

    invoke-virtual {v2}, Lcom/daaw/iz2;->m()J

    move-result-wide v12

    goto :goto_5

    :cond_8
    invoke-virtual {v2}, Lcom/daaw/iz2;->n()J

    move-result-wide v12

    :goto_5
    cmp-long v3, v12, v19

    if-nez v3, :cond_b

    goto :goto_6

    :cond_9
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_a
    invoke-virtual {v2, v12}, Lcom/daaw/iz2;->w(I)V

    :goto_6
    move-wide/from16 v12, v21

    :cond_b
    invoke-virtual {v2, v14}, Lcom/daaw/iz2;->w(I)V

    invoke-virtual {v2}, Lcom/daaw/iz2;->e()I

    move-result v3

    invoke-virtual {v2}, Lcom/daaw/iz2;->e()I

    move-result v6

    invoke-virtual {v2, v4}, Lcom/daaw/iz2;->w(I)V

    invoke-virtual {v2}, Lcom/daaw/iz2;->e()I

    move-result v9

    invoke-virtual {v2}, Lcom/daaw/iz2;->e()I

    move-result v2

    const/high16 v4, 0x10000

    const/high16 v14, -0x10000

    if-nez v3, :cond_f

    if-ne v6, v4, :cond_e

    if-ne v9, v14, :cond_d

    if-nez v2, :cond_c

    const/16 v2, 0x5a

    goto :goto_9

    :cond_c
    const/4 v3, 0x0

    const/high16 v6, 0x10000

    const/high16 v9, -0x10000

    goto :goto_7

    :cond_d
    const/4 v3, 0x0

    const/high16 v6, 0x10000

    goto :goto_7

    :cond_e
    const/4 v3, 0x0

    :cond_f
    :goto_7
    if-nez v3, :cond_13

    if-ne v6, v14, :cond_12

    if-ne v9, v4, :cond_10

    if-nez v2, :cond_11

    const/16 v2, 0x10e

    goto :goto_9

    :cond_10
    move v4, v9

    :cond_11
    const/4 v3, 0x0

    const/high16 v6, -0x10000

    goto :goto_8

    :cond_12
    move v4, v9

    const/4 v3, 0x0

    goto :goto_8

    :cond_13
    move v4, v9

    :goto_8
    if-ne v3, v14, :cond_14

    if-nez v6, :cond_14

    if-nez v4, :cond_14

    if-ne v2, v14, :cond_14

    const/16 v2, 0xb4

    goto :goto_9

    :cond_14
    const/4 v2, 0x0

    :goto_9
    new-instance v14, Lcom/daaw/tt2;

    invoke-direct {v14, v5, v12, v13, v2}, Lcom/daaw/tt2;-><init>(IJI)V

    cmp-long v2, p2, v21

    if-nez v2, :cond_15

    invoke-static {v14}, Lcom/daaw/tt2;->c(Lcom/daaw/tt2;)J

    move-result-wide v2

    move-wide/from16 v26, v2

    move-object/from16 v2, p1

    goto :goto_a

    :cond_15
    move-object/from16 v2, p1

    move-wide/from16 v26, p2

    :goto_a
    iget-object v2, v2, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    invoke-virtual {v2, v7}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v2}, Lcom/daaw/iz2;->e()I

    move-result v3

    invoke-static {v3}, Lcom/daaw/nt2;->b(I)I

    move-result v3

    if-nez v3, :cond_16

    const/16 v3, 0x8

    goto :goto_b

    :cond_16
    const/16 v3, 0x10

    :goto_b
    invoke-virtual {v2, v3}, Lcom/daaw/iz2;->w(I)V

    invoke-virtual {v2}, Lcom/daaw/iz2;->m()J

    move-result-wide v32

    cmp-long v2, v26, v21

    if-nez v2, :cond_17

    move-wide/from16 v26, v21

    goto :goto_c

    :cond_17
    const-wide/32 v28, 0xf4240

    move-wide/from16 v30, v32

    invoke-static/range {v26 .. v31}, Lcom/daaw/pz2;->j(JJJ)J

    move-result-wide v2

    move-wide/from16 v26, v2

    :goto_c
    sget v2, Lcom/daaw/nt2;->G:I

    invoke-virtual {v1, v2}, Lcom/daaw/lt2;->d(I)Lcom/daaw/lt2;

    move-result-object v2

    sget v3, Lcom/daaw/nt2;->H:I

    invoke-virtual {v2, v3}, Lcom/daaw/lt2;->d(I)Lcom/daaw/lt2;

    move-result-object v2

    sget v3, Lcom/daaw/nt2;->S:I

    invoke-virtual {v1, v3}, Lcom/daaw/lt2;->e(I)Lcom/daaw/mt2;

    move-result-object v1

    iget-object v1, v1, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    invoke-virtual {v1, v7}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v1}, Lcom/daaw/iz2;->e()I

    move-result v3

    invoke-static {v3}, Lcom/daaw/nt2;->b(I)I

    move-result v3

    if-nez v3, :cond_18

    const/16 v4, 0x8

    goto :goto_d

    :cond_18
    const/16 v4, 0x10

    :goto_d
    invoke-virtual {v1, v4}, Lcom/daaw/iz2;->w(I)V

    invoke-virtual {v1}, Lcom/daaw/iz2;->m()J

    move-result-wide v4

    if-nez v3, :cond_19

    const/4 v3, 0x4

    goto :goto_e

    :cond_19
    const/16 v3, 0x8

    :goto_e
    invoke-virtual {v1, v3}, Lcom/daaw/iz2;->w(I)V

    invoke-virtual {v1}, Lcom/daaw/iz2;->j()I

    move-result v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    shr-int/lit8 v6, v1, 0xa

    and-int/lit8 v6, v6, 0x1f

    add-int/lit8 v6, v6, 0x60

    int-to-char v6, v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    shr-int/lit8 v6, v1, 0x5

    and-int/lit8 v6, v6, 0x1f

    add-int/lit8 v6, v6, 0x60

    int-to-char v6, v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v1, v1, 0x1f

    add-int/lit8 v1, v1, 0x60

    int-to-char v1, v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v13

    sget v1, Lcom/daaw/nt2;->U:I

    invoke-virtual {v2, v1}, Lcom/daaw/lt2;->e(I)Lcom/daaw/mt2;

    move-result-object v1

    iget-object v12, v1, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    invoke-static {v14}, Lcom/daaw/tt2;->a(Lcom/daaw/tt2;)I

    move-result v21

    invoke-static {v14}, Lcom/daaw/tt2;->b(Lcom/daaw/tt2;)I

    move-result v22

    iget-object v1, v13, Landroid/util/Pair;->second:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Ljava/lang/String;

    const/16 v1, 0xc

    invoke-virtual {v12, v1}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v12}, Lcom/daaw/iz2;->e()I

    move-result v6

    new-instance v5, Lcom/daaw/qt2;

    invoke-direct {v5, v6}, Lcom/daaw/qt2;-><init>(I)V

    const/4 v4, 0x0

    :goto_f
    if-ge v4, v6, :cond_66

    invoke-virtual {v12}, Lcom/daaw/iz2;->c()I

    move-result v3

    invoke-virtual {v12}, Lcom/daaw/iz2;->e()I

    move-result v2

    move/from16 v24, v10

    if-lez v2, :cond_1a

    const/4 v1, 0x1

    goto :goto_10

    :cond_1a
    const/4 v1, 0x0

    :goto_10
    const-string v10, "childAtomSize should be positive"

    invoke-static {v1, v10}, Lcom/daaw/az2;->d(ZLjava/lang/Object;)V

    invoke-virtual {v12}, Lcom/daaw/iz2;->e()I

    move-result v1

    sget v7, Lcom/daaw/nt2;->c:I

    if-eq v1, v7, :cond_49

    sget v7, Lcom/daaw/nt2;->d:I

    if-eq v1, v7, :cond_49

    sget v7, Lcom/daaw/nt2;->a0:I

    if-eq v1, v7, :cond_49

    sget v7, Lcom/daaw/nt2;->l0:I

    if-eq v1, v7, :cond_49

    sget v7, Lcom/daaw/nt2;->e:I

    if-eq v1, v7, :cond_49

    sget v7, Lcom/daaw/nt2;->f:I

    if-eq v1, v7, :cond_49

    sget v7, Lcom/daaw/nt2;->g:I

    if-eq v1, v7, :cond_49

    sget v7, Lcom/daaw/nt2;->K0:I

    if-eq v1, v7, :cond_49

    sget v7, Lcom/daaw/nt2;->L0:I

    if-ne v1, v7, :cond_1b

    goto/16 :goto_2b

    :cond_1b
    sget v7, Lcom/daaw/nt2;->j:I

    if-eq v1, v7, :cond_25

    sget v7, Lcom/daaw/nt2;->b0:I

    if-eq v1, v7, :cond_25

    sget v7, Lcom/daaw/nt2;->o:I

    if-eq v1, v7, :cond_25

    sget v7, Lcom/daaw/nt2;->q:I

    if-eq v1, v7, :cond_25

    sget v7, Lcom/daaw/nt2;->s:I

    if-eq v1, v7, :cond_25

    sget v7, Lcom/daaw/nt2;->v:I

    if-eq v1, v7, :cond_25

    sget v7, Lcom/daaw/nt2;->t:I

    if-eq v1, v7, :cond_25

    sget v7, Lcom/daaw/nt2;->u:I

    if-eq v1, v7, :cond_25

    sget v7, Lcom/daaw/nt2;->y0:I

    if-eq v1, v7, :cond_25

    sget v7, Lcom/daaw/nt2;->z0:I

    if-eq v1, v7, :cond_25

    sget v7, Lcom/daaw/nt2;->m:I

    if-eq v1, v7, :cond_25

    sget v7, Lcom/daaw/nt2;->n:I

    if-eq v1, v7, :cond_25

    sget v7, Lcom/daaw/nt2;->k:I

    if-eq v1, v7, :cond_25

    sget v7, Lcom/daaw/nt2;->O0:I

    if-ne v1, v7, :cond_1c

    goto/16 :goto_14

    :cond_1c
    sget v7, Lcom/daaw/nt2;->k0:I

    if-eq v1, v7, :cond_1f

    sget v10, Lcom/daaw/nt2;->u0:I

    if-eq v1, v10, :cond_1f

    sget v10, Lcom/daaw/nt2;->v0:I

    if-eq v1, v10, :cond_1f

    sget v10, Lcom/daaw/nt2;->w0:I

    if-eq v1, v10, :cond_1f

    sget v10, Lcom/daaw/nt2;->x0:I

    if-ne v1, v10, :cond_1d

    goto :goto_11

    :cond_1d
    sget v7, Lcom/daaw/nt2;->N0:I

    if-ne v1, v7, :cond_1e

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v7, "application/x-camera-motion"

    invoke-static {v1, v7, v8, v11, v15}, Lcom/google/android/gms/internal/ads/zzatd;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/google/android/gms/internal/ads/zzavc;)Lcom/google/android/gms/internal/ads/zzatd;

    move-result-object v1

    iput-object v1, v5, Lcom/daaw/qt2;->b:Lcom/google/android/gms/internal/ads/zzatd;

    :cond_1e
    move/from16 v29, v2

    move/from16 v23, v3

    move/from16 v35, v4

    move-object v2, v5

    move/from16 v31, v6

    move-object/from16 v34, v9

    move-object v0, v12

    move-object/from16 v46, v13

    move-object/from16 v17, v14

    goto/16 :goto_17

    :cond_1f
    :goto_11
    add-int/lit8 v10, v3, 0x10

    invoke-virtual {v12, v10}, Lcom/daaw/iz2;->v(I)V

    const-string v10, "application/ttml+xml"

    const-wide v29, 0x7fffffffffffffffL

    if-ne v1, v7, :cond_20

    move-object/from16 v18, v8

    move-object v7, v10

    :goto_12
    const/4 v10, 0x1

    goto :goto_13

    :cond_20
    sget v7, Lcom/daaw/nt2;->u0:I

    if-ne v1, v7, :cond_21

    add-int/lit8 v1, v2, -0x10

    new-array v7, v1, [B

    const/4 v10, 0x0

    invoke-virtual {v12, v7, v10, v1}, Lcom/daaw/iz2;->q([BII)V

    invoke-static {v7}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v7, "application/x-quicktime-tx3g"

    move-object/from16 v18, v1

    goto :goto_12

    :cond_21
    sget v7, Lcom/daaw/nt2;->v0:I

    if-ne v1, v7, :cond_22

    const-string v1, "application/x-mp4-vtt"

    move-object v7, v1

    move-object/from16 v18, v8

    goto :goto_12

    :cond_22
    sget v7, Lcom/daaw/nt2;->w0:I

    if-ne v1, v7, :cond_23

    move-object/from16 v18, v8

    move-object v7, v10

    move-wide/from16 v29, v19

    goto :goto_12

    :cond_23
    sget v7, Lcom/daaw/nt2;->x0:I

    if-ne v1, v7, :cond_24

    const/4 v10, 0x1

    iput v10, v5, Lcom/daaw/qt2;->d:I

    const-string v1, "application/x-mp4-cea-608"

    move-object v7, v1

    move-object/from16 v18, v8

    :goto_13
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/16 v31, 0x0

    const/16 v34, -0x1

    const/16 v35, 0x0

    const/16 v36, -0x1

    move-object/from16 p1, v13

    move v13, v2

    move-object v2, v7

    move v7, v3

    move-object/from16 v3, v31

    move/from16 v37, v4

    move/from16 v4, v34

    move-object/from16 v38, v5

    move/from16 v5, v35

    move/from16 v31, v6

    move-object v6, v9

    move/from16 v39, v7

    move/from16 v7, v36

    move-object/from16 v8, p4

    move-object/from16 v40, v9

    move-wide/from16 v9, v29

    const/4 v0, -0x1

    move-object/from16 v11, v18

    invoke-static/range {v1 .. v11}, Lcom/google/android/gms/internal/ads/zzatd;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILcom/google/android/gms/internal/ads/zzavc;JLjava/util/List;)Lcom/google/android/gms/internal/ads/zzatd;

    move-result-object v1

    move-object/from16 v11, v38

    iput-object v1, v11, Lcom/daaw/qt2;->b:Lcom/google/android/gms/internal/ads/zzatd;

    move-object/from16 v46, p1

    move-object v2, v11

    move-object v0, v12

    move/from16 v29, v13

    move-object/from16 v17, v14

    move/from16 v35, v37

    move/from16 v23, v39

    goto/16 :goto_16

    :cond_24
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_25
    :goto_14
    move/from16 v39, v3

    move/from16 v37, v4

    move-object v11, v5

    move/from16 v31, v6

    move-object/from16 v40, v9

    move-object/from16 p1, v13

    const/4 v0, -0x1

    move v13, v2

    move/from16 v9, v39

    add-int/lit8 v3, v9, 0x10

    invoke-virtual {v12, v3}, Lcom/daaw/iz2;->v(I)V

    const/4 v2, 0x6

    if-eqz p5, :cond_26

    invoke-virtual {v12}, Lcom/daaw/iz2;->j()I

    move-result v3

    invoke-virtual {v12, v2}, Lcom/daaw/iz2;->w(I)V

    const/16 v8, 0x8

    goto :goto_15

    :cond_26
    const/16 v8, 0x8

    invoke-virtual {v12, v8}, Lcom/daaw/iz2;->w(I)V

    const/4 v3, 0x0

    :goto_15
    if-eqz v3, :cond_29

    const/4 v7, 0x1

    const/4 v6, 0x2

    if-ne v3, v7, :cond_27

    goto :goto_18

    :cond_27
    if-ne v3, v6, :cond_28

    const/16 v2, 0x10

    invoke-virtual {v12, v2}, Lcom/daaw/iz2;->w(I)V

    invoke-virtual {v12}, Lcom/daaw/iz2;->l()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v3, v2

    invoke-virtual {v12}, Lcom/daaw/iz2;->i()I

    move-result v2

    const/16 v4, 0x14

    invoke-virtual {v12, v4}, Lcom/daaw/iz2;->w(I)V

    const/16 v5, 0x10

    goto :goto_19

    :cond_28
    move-object/from16 v46, p1

    move/from16 v23, v9

    move-object v2, v11

    move-object v0, v12

    move/from16 v29, v13

    move-object/from16 v17, v14

    move/from16 v35, v37

    :goto_16
    move-object/from16 v34, v40

    :goto_17
    const/16 v16, 0x0

    const/16 v18, 0x3

    const/16 v28, -0x1

    goto/16 :goto_3c

    :cond_29
    const/4 v6, 0x2

    const/4 v7, 0x1

    :goto_18
    invoke-virtual {v12}, Lcom/daaw/iz2;->j()I

    move-result v4

    invoke-virtual {v12, v2}, Lcom/daaw/iz2;->w(I)V

    invoke-virtual {v12}, Lcom/daaw/iz2;->h()I

    move-result v2

    const/16 v5, 0x10

    if-ne v3, v7, :cond_2a

    invoke-virtual {v12, v5}, Lcom/daaw/iz2;->w(I)V

    :cond_2a
    move v3, v2

    move v2, v4

    :goto_19
    invoke-virtual {v12}, Lcom/daaw/iz2;->c()I

    move-result v4

    sget v5, Lcom/daaw/nt2;->b0:I

    if-ne v1, v5, :cond_2b

    move/from16 v5, v37

    invoke-static {v12, v9, v13, v11, v5}, Lcom/daaw/ut2;->e(Lcom/daaw/iz2;IILcom/daaw/qt2;I)I

    move-result v1

    invoke-virtual {v12, v4}, Lcom/daaw/iz2;->v(I)V

    goto :goto_1a

    :cond_2b
    move/from16 v5, v37

    :goto_1a
    sget v6, Lcom/daaw/nt2;->o:I

    const-string v0, "audio/raw"

    if-ne v1, v6, :cond_2c

    const-string v1, "audio/ac3"

    goto :goto_1d

    :cond_2c
    sget v6, Lcom/daaw/nt2;->q:I

    if-ne v1, v6, :cond_2d

    const-string v1, "audio/eac3"

    goto :goto_1d

    :cond_2d
    sget v6, Lcom/daaw/nt2;->s:I

    if-ne v1, v6, :cond_2e

    const-string v1, "audio/vnd.dts"

    goto :goto_1d

    :cond_2e
    sget v6, Lcom/daaw/nt2;->t:I

    if-eq v1, v6, :cond_37

    sget v6, Lcom/daaw/nt2;->u:I

    if-ne v1, v6, :cond_2f

    goto :goto_1c

    :cond_2f
    sget v6, Lcom/daaw/nt2;->v:I

    if-ne v1, v6, :cond_30

    const-string v1, "audio/vnd.dts.hd;profile=lbr"

    goto :goto_1d

    :cond_30
    sget v6, Lcom/daaw/nt2;->y0:I

    if-ne v1, v6, :cond_31

    const-string v1, "audio/3gpp"

    goto :goto_1d

    :cond_31
    sget v6, Lcom/daaw/nt2;->z0:I

    if-ne v1, v6, :cond_32

    const-string v1, "audio/amr-wb"

    goto :goto_1d

    :cond_32
    sget v6, Lcom/daaw/nt2;->m:I

    if-eq v1, v6, :cond_36

    sget v6, Lcom/daaw/nt2;->n:I

    if-ne v1, v6, :cond_33

    goto :goto_1b

    :cond_33
    sget v6, Lcom/daaw/nt2;->k:I

    if-ne v1, v6, :cond_34

    const-string v1, "audio/mpeg"

    goto :goto_1d

    :cond_34
    sget v6, Lcom/daaw/nt2;->O0:I

    if-ne v1, v6, :cond_35

    const-string v1, "audio/alac"

    goto :goto_1d

    :cond_35
    const/4 v1, 0x0

    goto :goto_1d

    :cond_36
    :goto_1b
    move-object v1, v0

    goto :goto_1d

    :cond_37
    :goto_1c
    const-string v1, "audio/vnd.dts.hd"

    :goto_1d
    move-object v6, v1

    move/from16 v28, v2

    move/from16 v29, v3

    const/16 v30, 0x0

    :goto_1e
    sub-int v1, v4, v9

    if-ge v1, v13, :cond_45

    invoke-virtual {v12, v4}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v12}, Lcom/daaw/iz2;->e()I

    move-result v3

    if-lez v3, :cond_38

    const/4 v1, 0x1

    goto :goto_1f

    :cond_38
    const/4 v1, 0x0

    :goto_1f
    invoke-static {v1, v10}, Lcom/daaw/az2;->d(ZLjava/lang/Object;)V

    invoke-virtual {v12}, Lcom/daaw/iz2;->e()I

    move-result v1

    sget v2, Lcom/daaw/nt2;->K:I

    if-eq v1, v2, :cond_3e

    if-eqz p5, :cond_39

    sget v7, Lcom/daaw/nt2;->l:I

    if-ne v1, v7, :cond_39

    goto/16 :goto_23

    :cond_39
    sget v2, Lcom/daaw/nt2;->p:I

    if-ne v1, v2, :cond_3a

    add-int/lit8 v1, v4, 0x8

    invoke-virtual {v12, v1}, Lcom/daaw/iz2;->v(I)V

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v7, v40

    invoke-static {v12, v1, v7, v15}, Lcom/daaw/nq2;->b(Lcom/daaw/iz2;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzavc;)Lcom/google/android/gms/internal/ads/zzatd;

    move-result-object v1

    :goto_20
    iput-object v1, v11, Lcom/daaw/qt2;->b:Lcom/google/android/gms/internal/ads/zzatd;

    move/from16 v43, v5

    move-object/from16 v44, v6

    move-object/from16 v34, v7

    move/from16 v45, v9

    move-object v15, v10

    move/from16 v35, v13

    const/16 v17, 0x2

    const/16 v25, 0x10

    move-object v13, v11

    :goto_21
    const/4 v11, 0x0

    goto/16 :goto_22

    :cond_3a
    move-object/from16 v7, v40

    sget v2, Lcom/daaw/nt2;->r:I

    if-ne v1, v2, :cond_3b

    add-int/lit8 v1, v4, 0x8

    invoke-virtual {v12, v1}, Lcom/daaw/iz2;->v(I)V

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v12, v1, v7, v15}, Lcom/daaw/nq2;->c(Lcom/daaw/iz2;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzavc;)Lcom/google/android/gms/internal/ads/zzatd;

    move-result-object v1

    goto :goto_20

    :cond_3b
    sget v2, Lcom/daaw/nt2;->w:I

    if-ne v1, v2, :cond_3d

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/16 v34, 0x0

    const/16 v35, -0x1

    const/16 v36, -0x1

    const/16 v37, 0x0

    const/16 v38, 0x0

    move-object v2, v6

    move/from16 v41, v3

    move-object/from16 v3, v34

    move/from16 v42, v4

    move/from16 v4, v35

    move/from16 v43, v5

    const/16 v25, 0x10

    move/from16 v5, v36

    move-object/from16 v44, v6

    const/16 v17, 0x2

    move/from16 v6, v28

    move-object/from16 v34, v7

    const/4 v15, 0x1

    move/from16 v7, v29

    move-object/from16 v8, v37

    move/from16 v45, v9

    move-object/from16 v9, p4

    move-object v15, v10

    move/from16 v10, v38

    move/from16 v35, v13

    move-object v13, v11

    move-object/from16 v11, v34

    invoke-static/range {v1 .. v11}, Lcom/google/android/gms/internal/ads/zzatd;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/util/List;Lcom/google/android/gms/internal/ads/zzavc;ILjava/lang/String;)Lcom/google/android/gms/internal/ads/zzatd;

    move-result-object v1

    iput-object v1, v13, Lcom/daaw/qt2;->b:Lcom/google/android/gms/internal/ads/zzatd;

    move/from16 v3, v41

    :cond_3c
    move/from16 v4, v42

    goto :goto_21

    :cond_3d
    move/from16 v41, v3

    move/from16 v42, v4

    move/from16 v43, v5

    move-object/from16 v44, v6

    move-object/from16 v34, v7

    move/from16 v45, v9

    move-object v15, v10

    move/from16 v35, v13

    const/16 v17, 0x2

    const/16 v25, 0x10

    move-object v13, v11

    sget v2, Lcom/daaw/nt2;->O0:I

    if-ne v1, v2, :cond_3c

    new-array v1, v3, [B

    move/from16 v4, v42

    invoke-virtual {v12, v4}, Lcom/daaw/iz2;->v(I)V

    const/4 v11, 0x0

    invoke-virtual {v12, v1, v11, v3}, Lcom/daaw/iz2;->q([BII)V

    move-object/from16 v30, v1

    :goto_22
    move-object/from16 v6, v44

    const/4 v10, -0x1

    goto/16 :goto_28

    :cond_3e
    :goto_23
    move/from16 v43, v5

    move-object/from16 v44, v6

    move/from16 v45, v9

    move-object v15, v10

    move/from16 v35, v13

    move-object/from16 v34, v40

    const/16 v17, 0x2

    const/16 v25, 0x10

    move-object v13, v11

    const/4 v11, 0x0

    if-ne v1, v2, :cond_40

    move v1, v4

    :cond_3f
    :goto_24
    const/4 v10, -0x1

    goto :goto_27

    :cond_40
    invoke-virtual {v12}, Lcom/daaw/iz2;->c()I

    move-result v1

    :goto_25
    sub-int v2, v1, v4

    if-ge v2, v3, :cond_42

    invoke-virtual {v12, v1}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v12}, Lcom/daaw/iz2;->e()I

    move-result v2

    if-lez v2, :cond_41

    const/4 v9, 0x1

    goto :goto_26

    :cond_41
    const/4 v9, 0x0

    :goto_26
    invoke-static {v9, v15}, Lcom/daaw/az2;->d(ZLjava/lang/Object;)V

    invoke-virtual {v12}, Lcom/daaw/iz2;->e()I

    move-result v5

    sget v6, Lcom/daaw/nt2;->K:I

    if-eq v5, v6, :cond_3f

    add-int/2addr v1, v2

    goto :goto_25

    :cond_42
    const/4 v1, -0x1

    goto :goto_24

    :goto_27
    if-eq v1, v10, :cond_44

    invoke-static {v12, v1}, Lcom/daaw/ut2;->f(Lcom/daaw/iz2;I)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    move-object/from16 v30, v1

    check-cast v30, [B

    const-string v1, "audio/mp4a-latm"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_43

    invoke-static/range {v30 .. v30}, Lcom/daaw/bz2;->a([B)Landroid/util/Pair;

    move-result-object v1

    iget-object v5, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move/from16 v28, v1

    move-object v6, v2

    move/from16 v29, v5

    goto :goto_28

    :cond_43
    move-object v6, v2

    goto :goto_28

    :cond_44
    move-object/from16 v6, v44

    :goto_28
    add-int/2addr v4, v3

    move-object v11, v13

    move-object v10, v15

    move-object/from16 v40, v34

    move/from16 v13, v35

    move/from16 v5, v43

    move/from16 v9, v45

    const/4 v7, 0x1

    const/16 v8, 0x8

    move-object/from16 v15, p4

    goto/16 :goto_1e

    :cond_45
    move/from16 v43, v5

    move-object/from16 v44, v6

    move/from16 v45, v9

    move/from16 v35, v13

    move-object/from16 v34, v40

    const/4 v10, -0x1

    const/16 v17, 0x2

    const/16 v25, 0x10

    move-object v13, v11

    const/4 v11, 0x0

    iget-object v1, v13, Lcom/daaw/qt2;->b:Lcom/google/android/gms/internal/ads/zzatd;

    if-nez v1, :cond_48

    move-object/from16 v6, v44

    if-eqz v6, :cond_48

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v15, 0x1

    if-eq v15, v0, :cond_46

    const/4 v8, -0x1

    goto :goto_29

    :cond_46
    const/4 v8, 0x2

    :goto_29
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v30, :cond_47

    const/4 v0, 0x0

    goto :goto_2a

    :cond_47
    invoke-static/range {v30 .. v30}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :goto_2a
    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v5, -0x1

    const/4 v9, -0x1

    const/16 v18, -0x1

    const/16 v23, 0x0

    const/16 v30, 0x0

    move-object v2, v6

    move/from16 v6, v28

    move/from16 v7, v29

    const/16 v28, -0x1

    move/from16 v10, v18

    const/16 v18, 0x0

    move-object v11, v0

    move-object v0, v12

    move-object/from16 v12, p4

    move-object/from16 v46, p1

    move-object/from16 v47, v13

    move/from16 v48, v35

    const/16 v16, 0x0

    move/from16 v13, v23

    move-object/from16 v17, v14

    move-object/from16 v14, v34

    move-object/from16 v15, v30

    invoke-static/range {v1 .. v15}, Lcom/google/android/gms/internal/ads/zzatd;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIILjava/util/List;Lcom/google/android/gms/internal/ads/zzavc;ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzaxo;)Lcom/google/android/gms/internal/ads/zzatd;

    move-result-object v1

    move-object/from16 v14, v47

    iput-object v1, v14, Lcom/daaw/qt2;->b:Lcom/google/android/gms/internal/ads/zzatd;

    move-object v2, v14

    move/from16 v35, v43

    move/from16 v23, v45

    goto/16 :goto_3a

    :cond_48
    move-object/from16 v46, p1

    move-object v0, v12

    move-object/from16 v17, v14

    const/16 v16, 0x0

    const/16 v28, -0x1

    move-object v2, v13

    move/from16 v29, v35

    move/from16 v35, v43

    move/from16 v23, v45

    goto/16 :goto_3b

    :cond_49
    :goto_2b
    move/from16 v48, v2

    move/from16 v45, v3

    move/from16 v43, v4

    move/from16 v31, v6

    move-object/from16 v34, v9

    move-object v15, v10

    move-object v0, v12

    move-object/from16 v46, v13

    move-object/from16 v17, v14

    const/16 v16, 0x0

    const/16 v28, -0x1

    move-object v14, v5

    move/from16 v13, v45

    add-int/lit8 v3, v13, 0x10

    invoke-virtual {v0, v3}, Lcom/daaw/iz2;->v(I)V

    const/16 v12, 0x10

    invoke-virtual {v0, v12}, Lcom/daaw/iz2;->w(I)V

    invoke-virtual {v0}, Lcom/daaw/iz2;->j()I

    move-result v6

    invoke-virtual {v0}, Lcom/daaw/iz2;->j()I

    move-result v7

    const/16 v2, 0x32

    invoke-virtual {v0, v2}, Lcom/daaw/iz2;->w(I)V

    invoke-virtual {v0}, Lcom/daaw/iz2;->c()I

    move-result v2

    sget v3, Lcom/daaw/nt2;->a0:I

    move/from16 v11, v43

    move/from16 v10, v48

    if-ne v1, v3, :cond_4a

    invoke-static {v0, v13, v10, v14, v11}, Lcom/daaw/ut2;->e(Lcom/daaw/iz2;IILcom/daaw/qt2;I)I

    move-result v1

    invoke-virtual {v0, v2}, Lcom/daaw/iz2;->v(I)V

    :cond_4a
    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v9, 0x0

    const/high16 v18, 0x3f800000    # 1.0f

    const/16 v23, 0x0

    const/16 v25, -0x1

    :goto_2c
    sub-int v5, v2, v13

    if-ge v5, v10, :cond_64

    invoke-virtual {v0, v2}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v0}, Lcom/daaw/iz2;->c()I

    move-result v5

    invoke-virtual {v0}, Lcom/daaw/iz2;->e()I

    move-result v8

    if-nez v8, :cond_4c

    invoke-virtual {v0}, Lcom/daaw/iz2;->c()I

    move-result v8

    sub-int/2addr v8, v13

    if-ne v8, v10, :cond_4b

    goto/16 :goto_39

    :cond_4b
    const/4 v8, 0x0

    :cond_4c
    if-lez v8, :cond_4d

    const/4 v12, 0x1

    goto :goto_2d

    :cond_4d
    const/4 v12, 0x0

    :goto_2d
    invoke-static {v12, v15}, Lcom/daaw/az2;->d(ZLjava/lang/Object;)V

    invoke-virtual {v0}, Lcom/daaw/iz2;->e()I

    move-result v12

    move/from16 v48, v10

    sget v10, Lcom/daaw/nt2;->I:I

    if-ne v12, v10, :cond_50

    if-nez v3, :cond_4e

    const/4 v9, 0x1

    goto :goto_2e

    :cond_4e
    const/4 v9, 0x0

    :goto_2e
    invoke-static {v9}, Lcom/daaw/az2;->e(Z)V

    add-int/lit8 v5, v5, 0x8

    invoke-virtual {v0, v5}, Lcom/daaw/iz2;->v(I)V

    invoke-static {v0}, Lcom/daaw/qz2;->a(Lcom/daaw/iz2;)Lcom/daaw/qz2;

    move-result-object v3

    iget-object v9, v3, Lcom/daaw/qz2;->a:Ljava/util/List;

    iget v5, v3, Lcom/daaw/qz2;->b:I

    iput v5, v14, Lcom/daaw/qt2;->c:I

    if-nez v4, :cond_4f

    iget v3, v3, Lcom/daaw/qz2;->c:F

    move/from16 v18, v3

    :cond_4f
    const-string v3, "video/avc"

    goto :goto_30

    :cond_50
    sget v10, Lcom/daaw/nt2;->J:I

    if-ne v12, v10, :cond_52

    if-nez v3, :cond_51

    const/4 v9, 0x1

    goto :goto_2f

    :cond_51
    const/4 v9, 0x0

    :goto_2f
    invoke-static {v9}, Lcom/daaw/az2;->e(Z)V

    add-int/lit8 v5, v5, 0x8

    invoke-virtual {v0, v5}, Lcom/daaw/iz2;->v(I)V

    invoke-static {v0}, Lcom/daaw/yz2;->a(Lcom/daaw/iz2;)Lcom/daaw/yz2;

    move-result-object v3

    iget-object v9, v3, Lcom/daaw/yz2;->a:Ljava/util/List;

    iget v3, v3, Lcom/daaw/yz2;->b:I

    iput v3, v14, Lcom/daaw/qt2;->c:I

    const-string v3, "video/hevc"

    :goto_30
    move/from16 v29, v1

    :goto_31
    const/4 v5, 0x2

    const/4 v10, 0x1

    const/4 v12, 0x3

    goto/16 :goto_38

    :cond_52
    sget v10, Lcom/daaw/nt2;->M0:I

    if-ne v12, v10, :cond_55

    if-nez v3, :cond_53

    const/4 v3, 0x1

    goto :goto_32

    :cond_53
    const/4 v3, 0x0

    :goto_32
    invoke-static {v3}, Lcom/daaw/az2;->e(Z)V

    sget v3, Lcom/daaw/nt2;->K0:I

    if-ne v1, v3, :cond_54

    const-string v3, "video/x-vnd.on2.vp8"

    goto :goto_30

    :cond_54
    const-string v3, "video/x-vnd.on2.vp9"

    goto :goto_30

    :cond_55
    sget v10, Lcom/daaw/nt2;->h:I

    if-ne v12, v10, :cond_57

    if-nez v3, :cond_56

    const/4 v3, 0x1

    goto :goto_33

    :cond_56
    const/4 v3, 0x0

    :goto_33
    invoke-static {v3}, Lcom/daaw/az2;->e(Z)V

    const-string v3, "video/3gpp"

    goto :goto_30

    :cond_57
    sget v10, Lcom/daaw/nt2;->K:I

    if-ne v12, v10, :cond_59

    if-nez v3, :cond_58

    const/4 v9, 0x1

    goto :goto_34

    :cond_58
    const/4 v9, 0x0

    :goto_34
    invoke-static {v9}, Lcom/daaw/az2;->e(Z)V

    invoke-static {v0, v5}, Lcom/daaw/ut2;->f(Lcom/daaw/iz2;I)Landroid/util/Pair;

    move-result-object v3

    iget-object v5, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, [B

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    move/from16 v29, v1

    move-object v3, v5

    goto :goto_31

    :cond_59
    sget v10, Lcom/daaw/nt2;->j0:I

    if-ne v12, v10, :cond_5a

    add-int/lit8 v5, v5, 0x8

    invoke-virtual {v0, v5}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v0}, Lcom/daaw/iz2;->i()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v0}, Lcom/daaw/iz2;->i()I

    move-result v5

    int-to-float v5, v5

    div-float v18, v4, v5

    move/from16 v29, v1

    const/4 v4, 0x1

    goto :goto_31

    :cond_5a
    sget v10, Lcom/daaw/nt2;->I0:I

    if-ne v12, v10, :cond_5d

    add-int/lit8 v10, v5, 0x8

    :goto_35
    sub-int v12, v10, v5

    if-ge v12, v8, :cond_5c

    invoke-virtual {v0, v10}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v0}, Lcom/daaw/iz2;->e()I

    move-result v12

    move/from16 v29, v1

    invoke-virtual {v0}, Lcom/daaw/iz2;->e()I

    move-result v1

    move/from16 p1, v4

    sget v4, Lcom/daaw/nt2;->J0:I

    if-ne v1, v4, :cond_5b

    iget-object v1, v0, Lcom/daaw/iz2;->a:[B

    add-int/2addr v12, v10

    invoke-static {v1, v10, v12}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v1

    goto :goto_36

    :cond_5b
    add-int/2addr v10, v12

    move/from16 v4, p1

    move/from16 v1, v29

    goto :goto_35

    :cond_5c
    move/from16 v29, v1

    move/from16 p1, v4

    const/4 v1, 0x0

    :goto_36
    move/from16 v4, p1

    move-object/from16 v23, v1

    goto/16 :goto_31

    :cond_5d
    move/from16 v29, v1

    move/from16 p1, v4

    sget v1, Lcom/daaw/nt2;->H0:I

    if-ne v12, v1, :cond_63

    invoke-virtual {v0}, Lcom/daaw/iz2;->g()I

    move-result v1

    const/4 v12, 0x3

    invoke-virtual {v0, v12}, Lcom/daaw/iz2;->w(I)V

    if-nez v1, :cond_62

    invoke-virtual {v0}, Lcom/daaw/iz2;->g()I

    move-result v1

    if-eqz v1, :cond_61

    const/4 v10, 0x1

    const/4 v5, 0x2

    if-eq v1, v10, :cond_60

    if-eq v1, v5, :cond_5f

    if-eq v1, v12, :cond_5e

    goto :goto_37

    :cond_5e
    move/from16 v4, p1

    const/16 v25, 0x3

    goto :goto_38

    :cond_5f
    move/from16 v4, p1

    const/16 v25, 0x2

    goto :goto_38

    :cond_60
    move/from16 v4, p1

    const/16 v25, 0x1

    goto :goto_38

    :cond_61
    const/4 v5, 0x2

    const/4 v10, 0x1

    move/from16 v4, p1

    const/16 v25, 0x0

    goto :goto_38

    :cond_62
    const/4 v5, 0x2

    const/4 v10, 0x1

    goto :goto_37

    :cond_63
    const/4 v5, 0x2

    const/4 v10, 0x1

    const/4 v12, 0x3

    :goto_37
    move/from16 v4, p1

    :goto_38
    add-int/2addr v2, v8

    move/from16 v1, v29

    move/from16 v10, v48

    const/16 v12, 0x10

    goto/16 :goto_2c

    :cond_64
    :goto_39
    move/from16 v48, v10

    const/4 v5, 0x2

    const/4 v10, 0x1

    const/4 v12, 0x3

    if-eqz v3, :cond_65

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v8, -0x1

    const/4 v15, -0x1

    const/high16 v29, -0x40800000    # -1.0f

    const/16 v30, 0x0

    move-object v2, v3

    move-object v3, v4

    move v4, v8

    const/4 v8, 0x2

    move v5, v15

    const/4 v15, 0x2

    move/from16 v8, v29

    move/from16 v29, v48

    move/from16 v10, v22

    move/from16 v35, v11

    move/from16 v11, v18

    const/16 v18, 0x3

    const/16 v36, 0x10

    move-object/from16 v12, v23

    move/from16 v23, v13

    move/from16 v13, v25

    move-object/from16 v49, v14

    move-object/from16 v14, v30

    move-object/from16 v15, p4

    invoke-static/range {v1 .. v15}, Lcom/google/android/gms/internal/ads/zzatd;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIFLjava/util/List;IF[BILcom/google/android/gms/internal/ads/zzbbb;Lcom/google/android/gms/internal/ads/zzavc;)Lcom/google/android/gms/internal/ads/zzatd;

    move-result-object v1

    move-object/from16 v2, v49

    iput-object v1, v2, Lcom/daaw/qt2;->b:Lcom/google/android/gms/internal/ads/zzatd;

    goto :goto_3d

    :cond_65
    move/from16 v35, v11

    move/from16 v23, v13

    move-object v2, v14

    :goto_3a
    move/from16 v29, v48

    :goto_3b
    const/16 v18, 0x3

    :goto_3c
    const/16 v36, 0x10

    :goto_3d
    add-int v3, v23, v29

    invoke-virtual {v0, v3}, Lcom/daaw/iz2;->v(I)V

    add-int/lit8 v4, v35, 0x1

    move-object/from16 v15, p4

    move-object v12, v0

    move-object v5, v2

    move-object/from16 v14, v17

    move/from16 v10, v24

    move/from16 v6, v31

    move-object/from16 v9, v34

    move-object/from16 v13, v46

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v11, -0x1

    move-object/from16 v0, p0

    goto/16 :goto_f

    :cond_66
    move-object v2, v5

    move/from16 v24, v10

    move-object/from16 v46, v13

    move-object/from16 v17, v14

    const/16 v16, 0x0

    sget v0, Lcom/daaw/nt2;->Q:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/daaw/lt2;->d(I)Lcom/daaw/lt2;

    move-result-object v0

    if-eqz v0, :cond_6c

    sget v1, Lcom/daaw/nt2;->R:I

    invoke-virtual {v0, v1}, Lcom/daaw/lt2;->e(I)Lcom/daaw/mt2;

    move-result-object v0

    if-nez v0, :cond_67

    goto :goto_41

    :cond_67
    iget-object v0, v0, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v0}, Lcom/daaw/iz2;->e()I

    move-result v1

    invoke-static {v1}, Lcom/daaw/nt2;->b(I)I

    move-result v1

    invoke-virtual {v0}, Lcom/daaw/iz2;->i()I

    move-result v3

    new-array v4, v3, [J

    new-array v5, v3, [J

    const/4 v13, 0x0

    :goto_3e
    if-ge v13, v3, :cond_6b

    const/4 v6, 0x1

    if-ne v1, v6, :cond_68

    invoke-virtual {v0}, Lcom/daaw/iz2;->n()J

    move-result-wide v7

    goto :goto_3f

    :cond_68
    invoke-virtual {v0}, Lcom/daaw/iz2;->m()J

    move-result-wide v7

    :goto_3f
    aput-wide v7, v4, v13

    if-ne v1, v6, :cond_69

    invoke-virtual {v0}, Lcom/daaw/iz2;->l()J

    move-result-wide v7

    goto :goto_40

    :cond_69
    invoke-virtual {v0}, Lcom/daaw/iz2;->e()I

    move-result v7

    int-to-long v7, v7

    :goto_40
    aput-wide v7, v5, v13

    invoke-virtual {v0}, Lcom/daaw/iz2;->p()S

    move-result v7

    if-ne v7, v6, :cond_6a

    const/4 v7, 0x2

    invoke-virtual {v0, v7}, Lcom/daaw/iz2;->w(I)V

    add-int/lit8 v13, v13, 0x1

    goto :goto_3e

    :cond_6a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported media rate."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6b
    invoke-static {v4, v5}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    move-object v1, v0

    const/4 v0, 0x0

    goto :goto_42

    :cond_6c
    :goto_41
    const/4 v0, 0x0

    invoke-static {v0, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v1

    :goto_42
    iget-object v3, v2, Lcom/daaw/qt2;->b:Lcom/google/android/gms/internal/ads/zzatd;

    if-nez v3, :cond_6d

    return-object v0

    :cond_6d
    new-instance v0, Lcom/daaw/fu2;

    invoke-static/range {v17 .. v17}, Lcom/daaw/tt2;->a(Lcom/daaw/tt2;)I

    move-result v16

    move-object/from16 v3, v46

    iget-object v3, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v18

    iget-object v3, v2, Lcom/daaw/qt2;->b:Lcom/google/android/gms/internal/ads/zzatd;

    iget v4, v2, Lcom/daaw/qt2;->d:I

    iget-object v5, v2, Lcom/daaw/qt2;->a:[Lcom/daaw/gu2;

    iget v2, v2, Lcom/daaw/qt2;->c:I

    iget-object v6, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    move-object/from16 v28, v6

    check-cast v28, [J

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    move-object/from16 v29, v1

    check-cast v29, [J

    move-object v15, v0

    move/from16 v17, v24

    move-wide/from16 v20, v32

    move-wide/from16 v22, v26

    move-object/from16 v24, v3

    move/from16 v25, v4

    move-object/from16 v26, v5

    move/from16 v27, v2

    invoke-direct/range {v15 .. v29}, Lcom/daaw/fu2;-><init>(IIJJJLcom/google/android/gms/internal/ads/zzatd;I[Lcom/daaw/gu2;I[J[J)V

    return-object v0
.end method

.method public static b(Lcom/daaw/fu2;Lcom/daaw/lt2;Lcom/daaw/rs2;)Lcom/daaw/iu2;
    .locals 42

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    sget v3, Lcom/daaw/nt2;->q0:I

    invoke-virtual {v1, v3}, Lcom/daaw/lt2;->e(I)Lcom/daaw/mt2;

    move-result-object v3

    if-eqz v3, :cond_0

    new-instance v4, Lcom/daaw/rt2;

    invoke-direct {v4, v3}, Lcom/daaw/rt2;-><init>(Lcom/daaw/mt2;)V

    goto :goto_0

    :cond_0
    sget v3, Lcom/daaw/nt2;->r0:I

    invoke-virtual {v1, v3}, Lcom/daaw/lt2;->e(I)Lcom/daaw/mt2;

    move-result-object v3

    if-eqz v3, :cond_37

    new-instance v4, Lcom/daaw/st2;

    invoke-direct {v4, v3}, Lcom/daaw/st2;-><init>(Lcom/daaw/mt2;)V

    :goto_0
    invoke-interface {v4}, Lcom/daaw/pt2;->zza()I

    move-result v3

    const/4 v5, 0x0

    if-nez v3, :cond_1

    new-instance v0, Lcom/daaw/iu2;

    new-array v7, v5, [J

    new-array v8, v5, [I

    const/4 v9, 0x0

    new-array v10, v5, [J

    new-array v11, v5, [I

    move-object v6, v0

    invoke-direct/range {v6 .. v11}, Lcom/daaw/iu2;-><init>([J[II[J[I)V

    return-object v0

    :cond_1
    sget v6, Lcom/daaw/nt2;->s0:I

    invoke-virtual {v1, v6}, Lcom/daaw/lt2;->e(I)Lcom/daaw/mt2;

    move-result-object v6

    if-nez v6, :cond_2

    sget v6, Lcom/daaw/nt2;->t0:I

    invoke-virtual {v1, v6}, Lcom/daaw/lt2;->e(I)Lcom/daaw/mt2;

    move-result-object v6

    const/4 v8, 0x1

    goto :goto_1

    :cond_2
    const/4 v8, 0x0

    :goto_1
    iget-object v6, v6, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    sget v9, Lcom/daaw/nt2;->p0:I

    invoke-virtual {v1, v9}, Lcom/daaw/lt2;->e(I)Lcom/daaw/mt2;

    move-result-object v9

    iget-object v9, v9, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    sget v10, Lcom/daaw/nt2;->m0:I

    invoke-virtual {v1, v10}, Lcom/daaw/lt2;->e(I)Lcom/daaw/mt2;

    move-result-object v10

    iget-object v10, v10, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    sget v11, Lcom/daaw/nt2;->n0:I

    invoke-virtual {v1, v11}, Lcom/daaw/lt2;->e(I)Lcom/daaw/mt2;

    move-result-object v11

    const/4 v12, 0x0

    if-eqz v11, :cond_3

    iget-object v11, v11, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    goto :goto_2

    :cond_3
    move-object v11, v12

    :goto_2
    sget v13, Lcom/daaw/nt2;->o0:I

    invoke-virtual {v1, v13}, Lcom/daaw/lt2;->e(I)Lcom/daaw/mt2;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v1, v1, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    goto :goto_3

    :cond_4
    move-object v1, v12

    :goto_3
    new-instance v13, Lcom/daaw/ot2;

    invoke-direct {v13, v9, v6, v8}, Lcom/daaw/ot2;-><init>(Lcom/daaw/iz2;Lcom/daaw/iz2;Z)V

    const/16 v6, 0xc

    invoke-virtual {v10, v6}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v10}, Lcom/daaw/iz2;->i()I

    move-result v8

    const/4 v9, -0x1

    add-int/2addr v8, v9

    invoke-virtual {v10}, Lcom/daaw/iz2;->i()I

    move-result v14

    invoke-virtual {v10}, Lcom/daaw/iz2;->i()I

    move-result v15

    if-eqz v1, :cond_5

    invoke-virtual {v1, v6}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v1}, Lcom/daaw/iz2;->i()I

    move-result v16

    goto :goto_4

    :cond_5
    const/16 v16, 0x0

    :goto_4
    if-eqz v11, :cond_7

    invoke-virtual {v11, v6}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {v11}, Lcom/daaw/iz2;->i()I

    move-result v6

    if-lez v6, :cond_6

    invoke-virtual {v11}, Lcom/daaw/iz2;->i()I

    move-result v12

    add-int/2addr v12, v9

    goto :goto_6

    :cond_6
    move-object v11, v12

    goto :goto_5

    :cond_7
    const/4 v6, 0x0

    :goto_5
    const/4 v12, -0x1

    :goto_6
    invoke-interface {v4}, Lcom/daaw/pt2;->zzc()Z

    move-result v17

    const-wide/16 v18, 0x0

    if-eqz v17, :cond_d

    iget-object v5, v0, Lcom/daaw/fu2;->f:Lcom/google/android/gms/internal/ads/zzatd;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzatd;->u:Ljava/lang/String;

    const-string v9, "audio/raw"

    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    if-nez v8, :cond_d

    if-nez v16, :cond_c

    if-nez v6, :cond_c

    iget v1, v13, Lcom/daaw/ot2;->a:I

    new-array v5, v1, [J

    new-array v6, v1, [I

    :goto_7
    invoke-virtual {v13}, Lcom/daaw/ot2;->a()Z

    move-result v8

    if-eqz v8, :cond_8

    iget v8, v13, Lcom/daaw/ot2;->b:I

    iget-wide v9, v13, Lcom/daaw/ot2;->d:J

    aput-wide v9, v5, v8

    iget v9, v13, Lcom/daaw/ot2;->c:I

    aput v9, v6, v8

    goto :goto_7

    :cond_8
    invoke-interface {v4}, Lcom/daaw/pt2;->zzb()I

    move-result v4

    int-to-long v8, v15

    const/16 v10, 0x2000

    div-int/2addr v10, v4

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_8
    if-ge v11, v1, :cond_9

    aget v13, v6, v11

    invoke-static {v13, v10}, Lcom/daaw/pz2;->d(II)I

    move-result v13

    add-int/2addr v12, v13

    add-int/lit8 v11, v11, 0x1

    goto :goto_8

    :cond_9
    new-array v11, v12, [J

    new-array v13, v12, [I

    new-array v14, v12, [J

    new-array v12, v12, [I

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    :goto_9
    if-ge v15, v1, :cond_b

    aget v22, v6, v15

    aget-wide v23, v5, v15

    move/from16 v7, v16

    move/from16 v40, v20

    move/from16 v20, v1

    move/from16 v1, v40

    move/from16 v41, v22

    move-object/from16 v22, v5

    move/from16 v5, v41

    :goto_a
    if-lez v5, :cond_a

    invoke-static {v10, v5}, Ljava/lang/Math;->min(II)I

    move-result v16

    aput-wide v23, v11, v21

    move-object/from16 v25, v6

    mul-int v6, v4, v16

    aput v6, v13, v21

    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    move-result v7

    move/from16 v26, v7

    int-to-long v6, v1

    mul-long v6, v6, v8

    aput-wide v6, v14, v21

    const/4 v6, 0x1

    aput v6, v12, v21

    aget v6, v13, v21

    int-to-long v6, v6

    add-long v23, v23, v6

    add-int v1, v1, v16

    sub-int v5, v5, v16

    add-int/lit8 v21, v21, 0x1

    move-object/from16 v6, v25

    move/from16 v7, v26

    goto :goto_a

    :cond_a
    move-object/from16 v25, v6

    add-int/lit8 v15, v15, 0x1

    move/from16 v16, v7

    move-object/from16 v5, v22

    move/from16 v40, v20

    move/from16 v20, v1

    move/from16 v1, v40

    goto :goto_9

    :cond_b
    move-object v4, v0

    move-object v0, v12

    move-object v15, v14

    move/from16 v14, v16

    move-wide/from16 v27, v18

    move-object v12, v11

    goto/16 :goto_18

    :cond_c
    const/4 v8, 0x0

    :cond_d
    new-array v5, v3, [J

    new-array v7, v3, [I

    new-array v9, v3, [J

    move/from16 v20, v6

    new-array v6, v3, [I

    move-wide/from16 v25, v18

    move-wide/from16 v27, v25

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    :goto_b
    if-ge v2, v3, :cond_17

    :goto_c
    if-nez v22, :cond_e

    invoke-virtual {v13}, Lcom/daaw/ot2;->a()Z

    move-result v22

    invoke-static/range {v22 .. v22}, Lcom/daaw/az2;->e(Z)V

    move/from16 v24, v14

    move/from16 v29, v15

    iget-wide v14, v13, Lcom/daaw/ot2;->d:J

    move-wide/from16 v25, v14

    iget v14, v13, Lcom/daaw/ot2;->c:I

    move/from16 v22, v14

    move/from16 v14, v24

    move/from16 v15, v29

    goto :goto_c

    :cond_e
    move/from16 v24, v14

    move/from16 v29, v15

    if-eqz v1, :cond_11

    :goto_d
    if-nez v21, :cond_10

    if-lez v16, :cond_f

    invoke-virtual {v1}, Lcom/daaw/iz2;->i()I

    move-result v21

    invoke-virtual {v1}, Lcom/daaw/iz2;->e()I

    move-result v23

    add-int/lit8 v16, v16, -0x1

    goto :goto_d

    :cond_f
    const/4 v14, -0x1

    const/16 v21, 0x0

    goto :goto_e

    :cond_10
    const/4 v14, -0x1

    :goto_e
    add-int/lit8 v21, v21, -0x1

    :cond_11
    move/from16 v14, v23

    aput-wide v25, v5, v2

    invoke-interface {v4}, Lcom/daaw/pt2;->zzb()I

    move-result v15

    aput v15, v7, v2

    if-le v15, v0, :cond_12

    move-object/from16 v23, v5

    move v0, v15

    move-object v15, v4

    goto :goto_f

    :cond_12
    move-object v15, v4

    move-object/from16 v23, v5

    :goto_f
    int-to-long v4, v14

    add-long v4, v27, v4

    aput-wide v4, v9, v2

    if-nez v11, :cond_13

    const/4 v4, 0x1

    goto :goto_10

    :cond_13
    const/4 v4, 0x0

    :goto_10
    aput v4, v6, v2

    if-ne v2, v12, :cond_14

    const/4 v4, 0x1

    aput v4, v6, v2

    add-int/lit8 v20, v20, -0x1

    if-lez v20, :cond_14

    invoke-virtual {v11}, Lcom/daaw/iz2;->i()I

    move-result v4

    const/4 v5, -0x1

    add-int/2addr v4, v5

    move v12, v4

    :cond_14
    move/from16 v4, v29

    move-object/from16 v29, v6

    int-to-long v5, v4

    add-long v27, v27, v5

    add-int/lit8 v5, v24, -0x1

    if-nez v5, :cond_16

    if-lez v8, :cond_15

    invoke-virtual {v10}, Lcom/daaw/iz2;->i()I

    move-result v4

    invoke-virtual {v10}, Lcom/daaw/iz2;->i()I

    move-result v5

    add-int/lit8 v8, v8, -0x1

    goto :goto_11

    :cond_15
    move v5, v4

    const/4 v4, 0x0

    goto :goto_11

    :cond_16
    move/from16 v40, v5

    move v5, v4

    move/from16 v4, v40

    :goto_11
    aget v6, v7, v2

    move/from16 v24, v4

    move/from16 v30, v5

    int-to-long v4, v6

    add-long v25, v25, v4

    add-int/lit8 v22, v22, -0x1

    add-int/lit8 v2, v2, 0x1

    move-object v4, v15

    move-object/from16 v5, v23

    move-object/from16 v6, v29

    move/from16 v15, v30

    move/from16 v23, v14

    move/from16 v14, v24

    goto/16 :goto_b

    :cond_17
    move-object/from16 v23, v5

    move-object/from16 v29, v6

    move/from16 v24, v14

    if-nez v21, :cond_18

    const/4 v2, 0x1

    goto :goto_12

    :cond_18
    const/4 v2, 0x0

    :goto_12
    invoke-static {v2}, Lcom/daaw/az2;->c(Z)V

    :goto_13
    if-lez v16, :cond_1a

    invoke-virtual {v1}, Lcom/daaw/iz2;->i()I

    move-result v2

    if-nez v2, :cond_19

    const/4 v2, 0x1

    goto :goto_14

    :cond_19
    const/4 v2, 0x0

    :goto_14
    invoke-static {v2}, Lcom/daaw/az2;->c(Z)V

    invoke-virtual {v1}, Lcom/daaw/iz2;->e()I

    add-int/lit8 v16, v16, -0x1

    goto :goto_13

    :cond_1a
    if-nez v20, :cond_1e

    if-nez v24, :cond_1d

    if-nez v22, :cond_1c

    if-eqz v8, :cond_1b

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object/from16 v4, p0

    move v5, v0

    goto :goto_15

    :cond_1b
    move-object/from16 v4, p0

    move v5, v0

    goto :goto_17

    :cond_1c
    const/4 v1, 0x0

    move-object/from16 v4, p0

    move v5, v0

    move/from16 v2, v22

    goto :goto_15

    :cond_1d
    move-object/from16 v4, p0

    move v5, v0

    move/from16 v2, v22

    move/from16 v1, v24

    :goto_15
    const/4 v0, 0x0

    goto :goto_16

    :cond_1e
    move-object/from16 v4, p0

    move v5, v0

    move/from16 v0, v20

    move/from16 v2, v22

    move/from16 v1, v24

    :goto_16
    iget v6, v4, Lcom/daaw/fu2;->a:I

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Inconsistent stbl box for track "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ": remainingSynchronizationSamples "

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", remainingSamplesAtTimestampDelta "

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", remainingSamplesInChunk "

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", remainingTimestampDeltaChanges "

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_17
    move v14, v5

    move-object v13, v7

    move-object v15, v9

    move-object/from16 v12, v23

    move-object/from16 v0, v29

    :goto_18
    iget-object v1, v4, Lcom/daaw/fu2;->i:[J

    if-eqz v1, :cond_36

    invoke-virtual/range {p2 .. p2}, Lcom/daaw/rs2;->a()Z

    move-result v2

    if-eqz v2, :cond_1f

    goto/16 :goto_29

    :cond_1f
    array-length v2, v1

    const/4 v7, 0x1

    if-ne v2, v7, :cond_22

    iget v2, v4, Lcom/daaw/fu2;->b:I

    if-ne v2, v7, :cond_22

    array-length v2, v15

    const/4 v7, 0x2

    if-lt v2, v7, :cond_22

    iget-object v7, v4, Lcom/daaw/fu2;->j:[J

    const/4 v8, 0x0

    aget-wide v9, v7, v8

    aget-wide v29, v1, v8

    iget-wide v5, v4, Lcom/daaw/fu2;->c:J

    move-wide/from16 v22, v9

    iget-wide v8, v4, Lcom/daaw/fu2;->d:J

    move-wide/from16 v31, v5

    move-wide/from16 v33, v8

    invoke-static/range {v29 .. v34}, Lcom/daaw/pz2;->j(JJJ)J

    move-result-wide v5

    add-long v9, v22, v5

    const/4 v1, 0x0

    aget-wide v5, v15, v1

    cmp-long v1, v5, v22

    if-gtz v1, :cond_22

    const/4 v1, 0x1

    aget-wide v7, v15, v1

    cmp-long v1, v22, v7

    if-gez v1, :cond_22

    const/4 v1, -0x1

    add-int/2addr v2, v1

    aget-wide v1, v15, v2

    cmp-long v7, v1, v9

    if-gez v7, :cond_22

    cmp-long v1, v9, v27

    if-gtz v1, :cond_22

    sub-long v29, v22, v5

    iget-object v1, v4, Lcom/daaw/fu2;->f:Lcom/google/android/gms/internal/ads/zzatd;

    iget v1, v1, Lcom/google/android/gms/internal/ads/zzatd;->H:I

    int-to-long v1, v1

    iget-wide v5, v4, Lcom/daaw/fu2;->c:J

    move-wide/from16 v31, v1

    move-wide/from16 v33, v5

    invoke-static/range {v29 .. v34}, Lcom/daaw/pz2;->j(JJJ)J

    move-result-wide v1

    sub-long v29, v27, v9

    iget-object v5, v4, Lcom/daaw/fu2;->f:Lcom/google/android/gms/internal/ads/zzatd;

    iget v5, v5, Lcom/google/android/gms/internal/ads/zzatd;->H:I

    int-to-long v5, v5

    iget-wide v7, v4, Lcom/daaw/fu2;->c:J

    move-wide/from16 v31, v5

    move-wide/from16 v33, v7

    invoke-static/range {v29 .. v34}, Lcom/daaw/pz2;->j(JJJ)J

    move-result-wide v5

    cmp-long v7, v1, v18

    if-nez v7, :cond_20

    cmp-long v1, v5, v18

    if-eqz v1, :cond_22

    move-wide/from16 v1, v18

    :cond_20
    const-wide/32 v7, 0x7fffffff

    cmp-long v9, v1, v7

    if-gtz v9, :cond_22

    cmp-long v9, v5, v7

    if-lez v9, :cond_21

    goto :goto_19

    :cond_21
    long-to-int v2, v1

    move-object/from16 v1, p2

    iput v2, v1, Lcom/daaw/rs2;->a:I

    long-to-int v2, v5

    iput v2, v1, Lcom/daaw/rs2;->b:I

    iget-wide v1, v4, Lcom/daaw/fu2;->c:J

    const-wide/32 v3, 0xf4240

    invoke-static {v15, v3, v4, v1, v2}, Lcom/daaw/pz2;->n([JJJ)V

    new-instance v1, Lcom/daaw/iu2;

    move-object v11, v1

    move-object/from16 v16, v0

    invoke-direct/range {v11 .. v16}, Lcom/daaw/iu2;-><init>([J[II[J[I)V

    return-object v1

    :cond_22
    :goto_19
    iget-object v1, v4, Lcom/daaw/fu2;->i:[J

    array-length v2, v1

    const/4 v5, 0x1

    if-ne v2, v5, :cond_24

    const/16 v17, 0x0

    aget-wide v5, v1, v17

    cmp-long v1, v5, v18

    if-nez v1, :cond_24

    const/4 v1, 0x0

    :goto_1a
    array-length v2, v15

    if-ge v1, v2, :cond_23

    aget-wide v2, v15, v1

    iget-object v5, v4, Lcom/daaw/fu2;->j:[J

    aget-wide v6, v5, v17

    sub-long v18, v2, v6

    const-wide/32 v20, 0xf4240

    iget-wide v2, v4, Lcom/daaw/fu2;->c:J

    move-wide/from16 v22, v2

    invoke-static/range {v18 .. v23}, Lcom/daaw/pz2;->j(JJJ)J

    move-result-wide v2

    aput-wide v2, v15, v1

    add-int/lit8 v1, v1, 0x1

    const/16 v17, 0x0

    goto :goto_1a

    :cond_23
    new-instance v1, Lcom/daaw/iu2;

    move-object v11, v1

    move-object/from16 v16, v0

    invoke-direct/range {v11 .. v16}, Lcom/daaw/iu2;-><init>([J[II[J[I)V

    return-object v1

    :cond_24
    iget v1, v4, Lcom/daaw/fu2;->b:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_25

    const/4 v6, 0x1

    goto :goto_1b

    :cond_25
    const/4 v6, 0x0

    :goto_1b
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    :goto_1c
    iget-object v7, v4, Lcom/daaw/fu2;->i:[J

    array-length v9, v7

    const-wide/16 v10, -0x1

    if-ge v8, v9, :cond_28

    iget-object v9, v4, Lcom/daaw/fu2;->j:[J

    move-object/from16 p1, v13

    move/from16 v16, v14

    aget-wide v13, v9, v8

    cmp-long v9, v13, v10

    if-eqz v9, :cond_27

    aget-wide v25, v7, v8

    iget-wide v9, v4, Lcom/daaw/fu2;->c:J

    move-object v7, v12

    iget-wide v11, v4, Lcom/daaw/fu2;->d:J

    move-wide/from16 v27, v9

    move-wide/from16 v29, v11

    invoke-static/range {v25 .. v30}, Lcom/daaw/pz2;->j(JJJ)J

    move-result-wide v9

    const/4 v11, 0x1

    invoke-static {v15, v13, v14, v11, v11}, Lcom/daaw/pz2;->b([JJZZ)I

    move-result v12

    add-long/2addr v13, v9

    const/4 v9, 0x0

    invoke-static {v15, v13, v14, v6, v9}, Lcom/daaw/pz2;->b([JJZZ)I

    move-result v10

    sub-int v9, v10, v12

    add-int/2addr v1, v9

    if-eq v2, v12, :cond_26

    const/4 v2, 0x1

    goto :goto_1d

    :cond_26
    const/4 v2, 0x0

    :goto_1d
    or-int/2addr v2, v5

    move v5, v2

    move v2, v10

    goto :goto_1e

    :cond_27
    move-object v7, v12

    :goto_1e
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v13, p1

    move-object v12, v7

    move/from16 v14, v16

    goto :goto_1c

    :cond_28
    move-object v7, v12

    move-object/from16 p1, v13

    move/from16 v16, v14

    if-eq v1, v3, :cond_29

    const/4 v2, 0x1

    goto :goto_1f

    :cond_29
    const/4 v2, 0x0

    :goto_1f
    or-int/2addr v2, v5

    if-eqz v2, :cond_2a

    new-array v3, v1, [J

    goto :goto_20

    :cond_2a
    move-object v3, v7

    :goto_20
    if-eqz v2, :cond_2b

    new-array v5, v1, [I

    goto :goto_21

    :cond_2b
    move-object/from16 v5, p1

    :goto_21
    const/4 v8, 0x1

    if-ne v8, v2, :cond_2c

    const/4 v14, 0x0

    goto :goto_22

    :cond_2c
    move/from16 v14, v16

    :goto_22
    if-eqz v2, :cond_2d

    new-array v8, v1, [I

    goto :goto_23

    :cond_2d
    move-object v8, v0

    :goto_23
    new-array v1, v1, [J

    move/from16 v28, v14

    move-wide/from16 v13, v18

    const/4 v9, 0x0

    const/4 v12, 0x0

    :goto_24
    iget-object v10, v4, Lcom/daaw/fu2;->i:[J

    array-length v11, v10

    if-ge v9, v11, :cond_32

    iget-object v11, v4, Lcom/daaw/fu2;->j:[J

    move-wide/from16 v29, v13

    aget-wide v13, v11, v9

    aget-wide v31, v10, v9

    const-wide/16 v10, -0x1

    cmp-long v16, v13, v10

    if-eqz v16, :cond_31

    iget-wide v10, v4, Lcom/daaw/fu2;->c:J

    move-object/from16 v24, v0

    move-object/from16 v16, v1

    iget-wide v0, v4, Lcom/daaw/fu2;->d:J

    move-wide/from16 v18, v31

    move-wide/from16 v20, v10

    move-wide/from16 v22, v0

    invoke-static/range {v18 .. v23}, Lcom/daaw/pz2;->j(JJJ)J

    move-result-wide v0

    const/4 v10, 0x1

    invoke-static {v15, v13, v14, v10, v10}, Lcom/daaw/pz2;->b([JJZZ)I

    move-result v11

    add-long/2addr v0, v13

    const/4 v10, 0x0

    invoke-static {v15, v0, v1, v6, v10}, Lcom/daaw/pz2;->b([JJZZ)I

    move-result v0

    if-eqz v2, :cond_2e

    sub-int v1, v0, v11

    invoke-static {v7, v11, v3, v12, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object/from16 v10, p1

    invoke-static {v10, v11, v5, v12, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move/from16 v27, v6

    move-object/from16 v6, v24

    invoke-static {v6, v11, v8, v12, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_25

    :cond_2e
    move-object/from16 v10, p1

    move/from16 v27, v6

    move-object/from16 v6, v24

    :goto_25
    move/from16 v1, v28

    :goto_26
    if-ge v11, v0, :cond_30

    const-wide/32 v20, 0xf4240

    move-object/from16 v33, v6

    move-object/from16 v24, v7

    iget-wide v6, v4, Lcom/daaw/fu2;->d:J

    move-wide/from16 v18, v29

    move-wide/from16 v22, v6

    invoke-static/range {v18 .. v23}, Lcom/daaw/pz2;->j(JJJ)J

    move-result-wide v6

    aget-wide v18, v15, v11

    sub-long v34, v18, v13

    const-wide/32 v36, 0xf4240

    move-wide/from16 p1, v13

    iget-wide v13, v4, Lcom/daaw/fu2;->c:J

    move-wide/from16 v38, v13

    invoke-static/range {v34 .. v39}, Lcom/daaw/pz2;->j(JJJ)J

    move-result-wide v13

    add-long/2addr v6, v13

    aput-wide v6, v16, v12

    if-eqz v2, :cond_2f

    aget v6, v5, v12

    if-le v6, v1, :cond_2f

    aget v1, v10, v11

    :cond_2f
    add-int/lit8 v12, v12, 0x1

    add-int/lit8 v11, v11, 0x1

    move-wide/from16 v13, p1

    move-object/from16 v7, v24

    move-object/from16 v6, v33

    goto :goto_26

    :cond_30
    move-object/from16 v33, v6

    move-object/from16 v24, v7

    move/from16 v28, v1

    goto :goto_27

    :cond_31
    move-object/from16 v10, p1

    move-object/from16 v33, v0

    move-object/from16 v16, v1

    move/from16 v27, v6

    move-object/from16 v24, v7

    :goto_27
    add-long v13, v29, v31

    add-int/lit8 v9, v9, 0x1

    move-object/from16 p1, v10

    move-object/from16 v1, v16

    move-object/from16 v7, v24

    move/from16 v6, v27

    move-object/from16 v0, v33

    goto/16 :goto_24

    :cond_32
    move-object/from16 v16, v1

    const/4 v0, 0x0

    const/16 v17, 0x0

    :goto_28
    array-length v1, v8

    if-ge v0, v1, :cond_33

    if-nez v17, :cond_34

    aget v1, v8, v0

    const/4 v2, 0x1

    and-int/lit8 v17, v1, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_28

    :cond_33
    if-eqz v17, :cond_35

    :cond_34
    new-instance v0, Lcom/daaw/iu2;

    move-object/from16 v25, v0

    move-object/from16 v26, v3

    move-object/from16 v27, v5

    move-object/from16 v29, v16

    move-object/from16 v30, v8

    invoke-direct/range {v25 .. v30}, Lcom/daaw/iu2;-><init>([J[II[J[I)V

    return-object v0

    :cond_35
    new-instance v0, Lcom/daaw/eq2;

    const-string v1, "The edited sample sequence does not contain a sync sample."

    invoke-direct {v0, v1}, Lcom/daaw/eq2;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_36
    :goto_29
    move-object/from16 v33, v0

    move-object/from16 v24, v12

    move-object v10, v13

    move/from16 v16, v14

    iget-wide v0, v4, Lcom/daaw/fu2;->c:J

    const-wide/32 v2, 0xf4240

    invoke-static {v15, v2, v3, v0, v1}, Lcom/daaw/pz2;->n([JJJ)V

    new-instance v0, Lcom/daaw/iu2;

    move-object v11, v0

    move-object/from16 v12, v24

    move-object v13, v10

    move/from16 v14, v16

    move-object/from16 v16, v33

    invoke-direct/range {v11 .. v16}, Lcom/daaw/iu2;-><init>([J[II[J[I)V

    return-object v0

    :cond_37
    new-instance v0, Lcom/daaw/eq2;

    const-string v1, "Track has no sample table size information"

    invoke-direct {v0, v1}, Lcom/daaw/eq2;-><init>(Ljava/lang/String;)V

    goto :goto_2b

    :goto_2a
    throw v0

    :goto_2b
    goto :goto_2a
.end method

.method public static c(Lcom/daaw/mt2;Z)Lcom/google/android/gms/internal/ads/zzaxo;
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    return-object v0

    :cond_0
    iget-object p0, p0, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Lcom/daaw/iz2;->v(I)V

    :goto_0
    invoke-virtual {p0}, Lcom/daaw/iz2;->a()I

    move-result v1

    if-lt v1, p1, :cond_7

    invoke-virtual {p0}, Lcom/daaw/iz2;->c()I

    move-result v1

    invoke-virtual {p0}, Lcom/daaw/iz2;->e()I

    move-result v2

    invoke-virtual {p0}, Lcom/daaw/iz2;->e()I

    move-result v3

    sget v4, Lcom/daaw/nt2;->B0:I

    if-ne v3, v4, :cond_6

    invoke-virtual {p0, v1}, Lcom/daaw/iz2;->v(I)V

    add-int/2addr v1, v2

    const/16 v2, 0xc

    invoke-virtual {p0, v2}, Lcom/daaw/iz2;->w(I)V

    :goto_1
    invoke-virtual {p0}, Lcom/daaw/iz2;->c()I

    move-result v2

    if-ge v2, v1, :cond_5

    invoke-virtual {p0}, Lcom/daaw/iz2;->c()I

    move-result v2

    invoke-virtual {p0}, Lcom/daaw/iz2;->e()I

    move-result v3

    invoke-virtual {p0}, Lcom/daaw/iz2;->e()I

    move-result v4

    sget v5, Lcom/daaw/nt2;->C0:I

    if-ne v4, v5, :cond_4

    invoke-virtual {p0, v2}, Lcom/daaw/iz2;->v(I)V

    add-int/2addr v2, v3

    invoke-virtual {p0, p1}, Lcom/daaw/iz2;->w(I)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    :goto_2
    invoke-virtual {p0}, Lcom/daaw/iz2;->c()I

    move-result v1

    if-ge v1, v2, :cond_2

    invoke-static {p0}, Lcom/daaw/au2;->a(Lcom/daaw/iz2;)Lcom/google/android/gms/internal/ads/zzaxn;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_3

    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/ads/zzaxo;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzaxo;-><init>(Ljava/util/List;)V

    goto :goto_3

    :cond_4
    add-int/lit8 v3, v3, -0x8

    invoke-virtual {p0, v3}, Lcom/daaw/iz2;->w(I)V

    goto :goto_1

    :cond_5
    :goto_3
    return-object v0

    :cond_6
    add-int/lit8 v2, v2, -0x8

    invoke-virtual {p0, v2}, Lcom/daaw/iz2;->w(I)V

    goto :goto_0

    :cond_7
    return-object v0
.end method

.method public static d(Lcom/daaw/iz2;)I
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/iz2;->g()I

    move-result v0

    and-int/lit8 v1, v0, 0x7f

    :goto_0
    const/16 v2, 0x80

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_0

    invoke-virtual {p0}, Lcom/daaw/iz2;->g()I

    move-result v0

    shl-int/lit8 v1, v1, 0x7

    and-int/lit8 v2, v0, 0x7f

    or-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public static e(Lcom/daaw/iz2;IILcom/daaw/qt2;I)I
    .locals 15

    move-object v0, p0

    invoke-virtual {p0}, Lcom/daaw/iz2;->c()I

    move-result v1

    :goto_0
    sub-int v2, v1, p1

    const/4 v3, 0x0

    move/from16 v4, p2

    if-ge v2, v4, :cond_e

    invoke-virtual {p0, v1}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {p0}, Lcom/daaw/iz2;->e()I

    move-result v2

    const/4 v5, 0x1

    if-lez v2, :cond_0

    const/4 v6, 0x1

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    :goto_1
    const-string v7, "childAtomSize should be positive"

    invoke-static {v6, v7}, Lcom/daaw/az2;->d(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/daaw/iz2;->e()I

    move-result v6

    sget v7, Lcom/daaw/nt2;->W:I

    if-ne v6, v7, :cond_d

    add-int/lit8 v6, v1, 0x8

    const/4 v7, 0x0

    move-object v9, v7

    move-object v10, v9

    const/4 v8, 0x0

    :goto_2
    sub-int v11, v6, v1

    if-ge v11, v2, :cond_8

    invoke-virtual {p0, v6}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {p0}, Lcom/daaw/iz2;->e()I

    move-result v11

    invoke-virtual {p0}, Lcom/daaw/iz2;->e()I

    move-result v12

    sget v13, Lcom/daaw/nt2;->c0:I

    if-ne v12, v13, :cond_1

    invoke-virtual {p0}, Lcom/daaw/iz2;->e()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    goto :goto_5

    :cond_1
    sget v13, Lcom/daaw/nt2;->X:I

    if-ne v12, v13, :cond_3

    const/4 v8, 0x4

    invoke-virtual {p0, v8}, Lcom/daaw/iz2;->w(I)V

    invoke-virtual {p0}, Lcom/daaw/iz2;->e()I

    move-result v8

    sget v12, Lcom/daaw/ut2;->g:I

    if-ne v8, v12, :cond_2

    const/4 v8, 0x1

    goto :goto_5

    :cond_2
    const/4 v8, 0x0

    goto :goto_5

    :cond_3
    sget v13, Lcom/daaw/nt2;->Y:I

    if-ne v12, v13, :cond_7

    add-int/lit8 v10, v6, 0x8

    :goto_3
    sub-int v12, v10, v6

    if-ge v12, v11, :cond_6

    invoke-virtual {p0, v10}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {p0}, Lcom/daaw/iz2;->e()I

    move-result v12

    invoke-virtual {p0}, Lcom/daaw/iz2;->e()I

    move-result v13

    sget v14, Lcom/daaw/nt2;->Z:I

    if-ne v13, v14, :cond_5

    const/4 v10, 0x6

    invoke-virtual {p0, v10}, Lcom/daaw/iz2;->w(I)V

    invoke-virtual {p0}, Lcom/daaw/iz2;->g()I

    move-result v10

    if-ne v10, v5, :cond_4

    const/4 v10, 0x1

    goto :goto_4

    :cond_4
    const/4 v10, 0x0

    :goto_4
    invoke-virtual {p0}, Lcom/daaw/iz2;->g()I

    move-result v12

    const/16 v13, 0x10

    new-array v14, v13, [B

    invoke-virtual {p0, v14, v3, v13}, Lcom/daaw/iz2;->q([BII)V

    new-instance v13, Lcom/daaw/gu2;

    invoke-direct {v13, v10, v12, v14}, Lcom/daaw/gu2;-><init>(ZI[B)V

    move-object v10, v13

    goto :goto_5

    :cond_5
    add-int/2addr v10, v12

    goto :goto_3

    :cond_6
    move-object v10, v7

    :cond_7
    :goto_5
    add-int/2addr v6, v11

    goto :goto_2

    :cond_8
    if-eqz v8, :cond_b

    if-eqz v9, :cond_9

    const/4 v6, 0x1

    goto :goto_6

    :cond_9
    const/4 v6, 0x0

    :goto_6
    const-string v7, "frma atom is mandatory"

    invoke-static {v6, v7}, Lcom/daaw/az2;->d(ZLjava/lang/Object;)V

    if-eqz v10, :cond_a

    const/4 v3, 0x1

    :cond_a
    const-string v5, "schi->tenc atom is mandatory"

    invoke-static {v3, v5}, Lcom/daaw/az2;->d(ZLjava/lang/Object;)V

    invoke-static {v9, v10}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v7

    :cond_b
    if-nez v7, :cond_c

    goto :goto_7

    :cond_c
    move-object/from16 v5, p3

    iget-object v0, v5, Lcom/daaw/qt2;->a:[Lcom/daaw/gu2;

    iget-object v1, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/gu2;

    aput-object v1, v0, p4

    iget-object v0, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_d
    :goto_7
    move-object/from16 v5, p3

    add-int/2addr v1, v2

    goto/16 :goto_0

    :cond_e
    return v3
.end method

.method public static f(Lcom/daaw/iz2;I)Landroid/util/Pair;
    .locals 4

    const/16 v0, 0xc

    add-int/2addr p1, v0

    invoke-virtual {p0, p1}, Lcom/daaw/iz2;->v(I)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/daaw/iz2;->w(I)V

    invoke-static {p0}, Lcom/daaw/ut2;->d(Lcom/daaw/iz2;)I

    const/4 v1, 0x2

    invoke-virtual {p0, v1}, Lcom/daaw/iz2;->w(I)V

    invoke-virtual {p0}, Lcom/daaw/iz2;->g()I

    move-result v2

    and-int/lit16 v3, v2, 0x80

    if-eqz v3, :cond_0

    invoke-virtual {p0, v1}, Lcom/daaw/iz2;->w(I)V

    :cond_0
    and-int/lit8 v3, v2, 0x40

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Lcom/daaw/iz2;->j()I

    move-result v3

    invoke-virtual {p0, v3}, Lcom/daaw/iz2;->w(I)V

    :cond_1
    const/16 v3, 0x20

    and-int/2addr v2, v3

    if-eqz v2, :cond_2

    invoke-virtual {p0, v1}, Lcom/daaw/iz2;->w(I)V

    :cond_2
    invoke-virtual {p0, p1}, Lcom/daaw/iz2;->w(I)V

    invoke-static {p0}, Lcom/daaw/ut2;->d(Lcom/daaw/iz2;)I

    invoke-virtual {p0}, Lcom/daaw/iz2;->g()I

    move-result v1

    const/4 v2, 0x0

    if-eq v1, v3, :cond_9

    const/16 v3, 0x21

    if-eq v1, v3, :cond_8

    const/16 v3, 0x23

    if-eq v1, v3, :cond_7

    const/16 v3, 0x40

    if-eq v1, v3, :cond_6

    const/16 v3, 0x6b

    if-eq v1, v3, :cond_5

    const/16 v3, 0xa5

    if-eq v1, v3, :cond_4

    const/16 v3, 0xa6

    if-eq v1, v3, :cond_3

    packed-switch v1, :pswitch_data_0

    packed-switch v1, :pswitch_data_1

    goto :goto_0

    :pswitch_0
    const-string p0, "audio/vnd.dts.hd"

    invoke-static {p0, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0

    :pswitch_1
    const-string p0, "audio/vnd.dts"

    invoke-static {p0, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0

    :cond_3
    const-string v2, "audio/eac3"

    goto :goto_0

    :cond_4
    const-string v2, "audio/ac3"

    goto :goto_0

    :cond_5
    const-string p0, "audio/mpeg"

    invoke-static {p0, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0

    :cond_6
    :pswitch_2
    const-string v2, "audio/mp4a-latm"

    goto :goto_0

    :cond_7
    const-string v2, "video/hevc"

    goto :goto_0

    :cond_8
    const-string v2, "video/avc"

    goto :goto_0

    :cond_9
    const-string v2, "video/mp4v-es"

    :goto_0
    invoke-virtual {p0, v0}, Lcom/daaw/iz2;->w(I)V

    invoke-virtual {p0, p1}, Lcom/daaw/iz2;->w(I)V

    invoke-static {p0}, Lcom/daaw/ut2;->d(Lcom/daaw/iz2;)I

    move-result p1

    new-array v0, p1, [B

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p1}, Lcom/daaw/iz2;->q([BII)V

    invoke-static {v2, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x66
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xa9
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
