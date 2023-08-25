.class public Lcom/daaw/ue1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lcom/daaw/tc;


# direct methods
.method public constructor <init>(Lcom/daaw/tc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ue1;->a:Lcom/daaw/tc;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/y31;Lcom/daaw/te1;Lcom/daaw/ds1;Ljava/lang/String;IIZIIIILcom/daaw/w31;)V
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move/from16 v4, p8

    move/from16 v5, p9

    invoke-virtual/range {p4 .. p4}, Ljava/lang/String;->length()I

    move-result v6

    iget v7, v2, Lcom/daaw/ds1;->a:F

    iget v2, v2, Lcom/daaw/ds1;->b:F

    add-int v8, v4, p10

    int-to-float v8, v8

    add-int v9, v5, p11

    int-to-float v9, v9

    new-instance v15, Lcom/daaw/bs1;

    const/4 v14, 0x0

    invoke-direct {v15, v14, v14}, Lcom/daaw/bs1;-><init>(FF)V

    new-instance v13, Lcom/daaw/bs1;

    invoke-direct {v13, v14, v14}, Lcom/daaw/bs1;-><init>(FF)V

    const/16 v12, 0xa

    if-nez p7, :cond_1

    move v4, v2

    move v5, v7

    move/from16 v2, p6

    :goto_0
    if-ge v2, v6, :cond_9

    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-ne v8, v12, :cond_0

    invoke-virtual/range {p2 .. p2}, Lcom/daaw/te1;->b()F

    move-result v5

    add-float/2addr v4, v5

    move v5, v7

    move-object v9, v13

    move-object/from16 p3, v15

    goto :goto_1

    :cond_0
    invoke-virtual {v1, v8}, Lcom/daaw/te1;->d(C)Lcom/daaw/te1$a;

    move-result-object v8

    iget v9, v8, Lcom/daaw/te1$a;->a:F

    invoke-virtual/range {p2 .. p2}, Lcom/daaw/te1;->h()Lcom/daaw/bs1;

    move-result-object v10

    iget v10, v10, Lcom/daaw/bs1;->a:F

    div-float/2addr v9, v10

    iput v9, v15, Lcom/daaw/bs1;->a:F

    iget v9, v8, Lcom/daaw/te1$a;->b:F

    invoke-virtual/range {p2 .. p2}, Lcom/daaw/te1;->h()Lcom/daaw/bs1;

    move-result-object v10

    iget v10, v10, Lcom/daaw/bs1;->b:F

    div-float/2addr v9, v10

    iput v9, v15, Lcom/daaw/bs1;->b:F

    iget v9, v8, Lcom/daaw/te1$a;->a:F

    iget v10, v8, Lcom/daaw/te1$a;->c:F

    add-float/2addr v9, v10

    invoke-virtual/range {p2 .. p2}, Lcom/daaw/te1;->h()Lcom/daaw/bs1;

    move-result-object v10

    iget v10, v10, Lcom/daaw/bs1;->a:F

    div-float/2addr v9, v10

    iput v9, v13, Lcom/daaw/bs1;->a:F

    iget v9, v8, Lcom/daaw/te1$a;->b:F

    iget v10, v8, Lcom/daaw/te1$a;->d:F

    add-float/2addr v9, v10

    invoke-virtual/range {p2 .. p2}, Lcom/daaw/te1;->h()Lcom/daaw/bs1;

    move-result-object v10

    iget v10, v10, Lcom/daaw/bs1;->b:F

    div-float/2addr v9, v10

    iput v9, v13, Lcom/daaw/bs1;->b:F

    iget-object v10, v0, Lcom/daaw/ue1;->a:Lcom/daaw/tc;

    iget v9, v8, Lcom/daaw/te1$a;->e:F

    add-float/2addr v9, v5

    iget v11, v8, Lcom/daaw/te1$a;->f:F

    add-float/2addr v11, v4

    iget v14, v8, Lcom/daaw/te1$a;->d:F

    sub-float v16, v11, v14

    iget v11, v8, Lcom/daaw/te1$a;->c:F

    const/16 v21, 0x0

    const/high16 v17, 0x3f800000    # 1.0f

    move/from16 v18, v11

    move-object/from16 v11, p1

    move v12, v9

    move-object v9, v13

    move/from16 v13, v16

    move/from16 v16, v14

    move/from16 v14, v17

    move-object/from16 p3, v15

    move/from16 v15, v18

    move/from16 v17, p5

    move-object/from16 v18, p3

    move-object/from16 v19, v9

    move-object/from16 v20, p12

    invoke-virtual/range {v10 .. v21}, Lcom/daaw/tc;->n(Lcom/daaw/y31;FFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Z)V

    iget v8, v8, Lcom/daaw/te1$a;->g:F

    add-float/2addr v5, v8

    :goto_1
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v15, p3

    move-object v13, v9

    const/16 v12, 0xa

    goto :goto_0

    :cond_1
    move-object/from16 p3, v15

    move-object v15, v13

    move v10, v7

    move v7, v2

    move/from16 v2, p6

    :goto_2
    if-ge v2, v6, :cond_9

    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v11

    const/16 v13, 0xa

    if-ne v11, v13, :cond_2

    invoke-virtual/range {p2 .. p2}, Lcom/daaw/te1;->b()F

    move-result v11

    add-float/2addr v7, v11

    move-object/from16 v24, p3

    move-object/from16 v26, v15

    const/16 v22, 0xa

    const/16 v25, 0x0

    goto/16 :goto_4

    :cond_2
    invoke-virtual {v1, v11}, Lcom/daaw/te1;->d(C)Lcom/daaw/te1$a;

    move-result-object v12

    int-to-float v11, v4

    sub-float/2addr v11, v10

    int-to-float v13, v5

    sub-float/2addr v13, v7

    iget v14, v12, Lcom/daaw/te1$a;->c:F

    add-float v16, v14, v10

    sub-float v16, v16, v8

    iget v1, v12, Lcom/daaw/te1$a;->d:F

    add-float v17, v1, v7

    sub-float v17, v17, v9

    const/16 v18, 0x0

    cmpg-float v19, v11, v18

    if-gez v19, :cond_3

    const/4 v11, 0x0

    :cond_3
    cmpg-float v19, v13, v18

    if-gez v19, :cond_4

    const/4 v13, 0x0

    :cond_4
    cmpg-float v19, v16, v18

    if-gez v19, :cond_5

    const/16 v16, 0x0

    :cond_5
    cmpg-float v19, v17, v18

    if-gez v19, :cond_6

    const/16 v17, 0x0

    :cond_6
    cmpl-float v19, v11, v14

    if-gtz v19, :cond_8

    cmpl-float v19, v16, v14

    if-gtz v19, :cond_8

    cmpl-float v19, v13, v1

    if-gtz v19, :cond_8

    cmpl-float v19, v17, v1

    if-lez v19, :cond_7

    goto :goto_3

    :cond_7
    add-float v23, v10, v11

    add-float v19, v7, v13

    iget v10, v12, Lcom/daaw/te1$a;->a:F

    add-float/2addr v10, v11

    iget v11, v12, Lcom/daaw/te1$a;->b:F

    add-float/2addr v11, v13

    sub-float v16, v14, v16

    sub-float v1, v1, v17

    invoke-virtual/range {p2 .. p2}, Lcom/daaw/te1;->h()Lcom/daaw/bs1;

    move-result-object v13

    iget v13, v13, Lcom/daaw/bs1;->a:F

    div-float v13, v10, v13

    move-object/from16 v14, p3

    iput v13, v14, Lcom/daaw/bs1;->a:F

    invoke-virtual/range {p2 .. p2}, Lcom/daaw/te1;->h()Lcom/daaw/bs1;

    move-result-object v13

    iget v13, v13, Lcom/daaw/bs1;->b:F

    div-float v13, v11, v13

    iput v13, v14, Lcom/daaw/bs1;->b:F

    add-float v10, v10, v16

    invoke-virtual/range {p2 .. p2}, Lcom/daaw/te1;->h()Lcom/daaw/bs1;

    move-result-object v13

    iget v13, v13, Lcom/daaw/bs1;->a:F

    div-float/2addr v10, v13

    iput v10, v15, Lcom/daaw/bs1;->a:F

    add-float/2addr v11, v1

    invoke-virtual/range {p2 .. p2}, Lcom/daaw/te1;->h()Lcom/daaw/bs1;

    move-result-object v10

    iget v10, v10, Lcom/daaw/bs1;->b:F

    div-float/2addr v11, v10

    iput v11, v15, Lcom/daaw/bs1;->b:F

    iget-object v10, v0, Lcom/daaw/ue1;->a:Lcom/daaw/tc;

    const/16 v21, 0x0

    const/high16 v17, 0x3f800000    # 1.0f

    move-object/from16 v11, p1

    move-object v13, v12

    move/from16 v12, v23

    move-object v0, v13

    const/16 v22, 0xa

    move/from16 v13, v19

    move-object/from16 v24, v14

    const/16 v25, 0x0

    move/from16 v14, v17

    move-object/from16 v26, v15

    move/from16 v15, v16

    move/from16 v16, v1

    move/from16 v17, p5

    move-object/from16 v18, v24

    move-object/from16 v19, v26

    move-object/from16 v20, p12

    invoke-virtual/range {v10 .. v21}, Lcom/daaw/tc;->n(Lcom/daaw/y31;FFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Z)V

    iget v0, v0, Lcom/daaw/te1$a;->g:F

    add-float v23, v23, v0

    move/from16 v10, v23

    goto :goto_4

    :cond_8
    :goto_3
    move-object/from16 v24, p3

    move-object v0, v12

    move-object/from16 v26, v15

    const/16 v22, 0xa

    const/16 v25, 0x0

    iget v0, v0, Lcom/daaw/te1$a;->g:F

    add-float/2addr v10, v0

    :goto_4
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 p3, v24

    move-object/from16 v15, v26

    const/4 v14, 0x0

    goto/16 :goto_2

    :cond_9
    return-void
.end method

.method public b(Lcom/daaw/te1;Ljava/lang/String;)Lcom/daaw/cs1;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {p1, v2}, Lcom/daaw/te1;->d(C)Lcom/daaw/te1$a;

    move-result-object v2

    iget v2, v2, Lcom/daaw/te1$a;->g:F

    add-float/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance p2, Lcom/daaw/cs1;

    float-to-int v0, v0

    invoke-virtual {p1}, Lcom/daaw/te1;->b()F

    move-result p1

    float-to-int p1, p1

    invoke-direct {p2, v0, p1}, Lcom/daaw/cs1;-><init>(II)V

    return-object p2
.end method
