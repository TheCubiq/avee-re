.class public Lcom/daaw/t71;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/t71$b;,
        Lcom/daaw/t71$a;
    }
.end annotation


# direct methods
.method public static a(Ljava/lang/String;Lcom/daaw/t71$a;)Lcom/daaw/t71$a;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v11, p1

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v12

    new-instance v13, Lcom/daaw/uv0;

    const/4 v14, 0x0

    invoke-direct {v13, v0, v14}, Lcom/daaw/uv0;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v13}, Lcom/daaw/uv0;->i()V

    const/4 v15, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    :goto_0
    iget v4, v13, Lcom/daaw/uv0;->d:I

    if-ge v4, v12, :cond_c

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x2b

    const/16 v6, 0x6d

    if-eq v4, v5, :cond_0

    const/16 v5, 0x2d

    if-eq v4, v5, :cond_0

    packed-switch v4, :pswitch_data_0

    goto :goto_1

    :cond_0
    :pswitch_0
    if-eq v1, v6, :cond_3

    const/16 v5, 0x4d

    if-ne v1, v5, :cond_1

    goto :goto_3

    :cond_1
    invoke-static {v1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v5

    const-string v7, "lhvcsqta"

    invoke-virtual {v7, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    if-ltz v5, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    invoke-virtual {v13}, Lcom/daaw/uv0;->a()V

    move v1, v4

    :goto_2
    move/from16 v18, v1

    goto :goto_4

    :cond_3
    :goto_3
    add-int/lit8 v4, v1, -0x1

    int-to-char v4, v4

    move/from16 v18, v1

    move v1, v4

    :goto_4
    sparse-switch v1, :sswitch_data_0

    move/from16 v23, v9

    move/from16 v19, v10

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Invalid path command: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Lcom/daaw/uv0;->a()V

    :goto_5
    const/4 v8, 0x0

    goto/16 :goto_8

    :sswitch_0
    invoke-interface/range {p1 .. p1}, Lcom/daaw/t71$a;->close()V

    invoke-interface {v11, v10, v9}, Lcom/daaw/t71$a;->b(FF)V

    move v3, v9

    move/from16 v17, v3

    move v2, v10

    move/from16 v16, v2

    :goto_6
    const/4 v8, 0x1

    goto/16 :goto_8

    :sswitch_1
    invoke-virtual {v13}, Lcom/daaw/uv0;->d()F

    move-result v4

    const/16 v5, 0x76

    if-ne v1, v5, :cond_4

    invoke-interface {v11, v15, v4}, Lcom/daaw/t71$a;->d(FF)V

    add-float/2addr v3, v4

    goto :goto_5

    :cond_4
    invoke-interface {v11, v2, v4}, Lcom/daaw/t71$a;->e(FF)V

    move v3, v4

    goto :goto_5

    :sswitch_2
    invoke-virtual {v13}, Lcom/daaw/uv0;->d()F

    move-result v4

    invoke-virtual {v13}, Lcom/daaw/uv0;->d()F

    move-result v5

    invoke-virtual {v13}, Lcom/daaw/uv0;->d()F

    move-result v6

    invoke-virtual {v13}, Lcom/daaw/uv0;->d()F

    move-result v7

    invoke-static {v1}, Ljava/lang/Character;->isLowerCase(C)Z

    move-result v1

    if-eqz v1, :cond_5

    add-float/2addr v4, v2

    add-float/2addr v6, v2

    add-float/2addr v5, v3

    add-float/2addr v7, v3

    :cond_5
    move/from16 v19, v4

    move/from16 v20, v5

    move/from16 v21, v6

    move/from16 v22, v7

    const/high16 v1, 0x40000000    # 2.0f

    mul-float v2, v2, v1

    sub-float v2, v2, v16

    mul-float v3, v3, v1

    sub-float v3, v3, v17

    move-object/from16 v1, p1

    move/from16 v4, v19

    move/from16 v5, v20

    move/from16 v6, v21

    move/from16 v7, v22

    invoke-interface/range {v1 .. v7}, Lcom/daaw/t71$a;->c(FFFFFF)V

    move/from16 v16, v19

    move/from16 v17, v20

    move/from16 v2, v21

    move/from16 v3, v22

    goto :goto_6

    :sswitch_3
    invoke-virtual {v13}, Lcom/daaw/uv0;->d()F

    move-result v4

    invoke-virtual {v13}, Lcom/daaw/uv0;->d()F

    move-result v5

    if-ne v1, v6, :cond_6

    add-float/2addr v10, v4

    add-float/2addr v9, v5

    invoke-interface {v11, v4, v5}, Lcom/daaw/t71$a;->a(FF)V

    goto :goto_7

    :cond_6
    invoke-interface {v11, v4, v5}, Lcom/daaw/t71$a;->b(FF)V

    move v2, v4

    move v10, v2

    move v3, v5

    move v9, v3

    goto :goto_5

    :sswitch_4
    invoke-virtual {v13}, Lcom/daaw/uv0;->d()F

    move-result v4

    invoke-virtual {v13}, Lcom/daaw/uv0;->d()F

    move-result v5

    const/16 v6, 0x6c

    if-ne v1, v6, :cond_7

    invoke-interface {v11, v4, v5}, Lcom/daaw/t71$a;->d(FF)V

    :goto_7
    add-float/2addr v2, v4

    add-float/2addr v3, v5

    goto/16 :goto_5

    :cond_7
    invoke-interface {v11, v4, v5}, Lcom/daaw/t71$a;->e(FF)V

    move v2, v4

    move v3, v5

    goto/16 :goto_5

    :sswitch_5
    invoke-virtual {v13}, Lcom/daaw/uv0;->d()F

    move-result v4

    const/16 v5, 0x68

    if-ne v1, v5, :cond_8

    invoke-interface {v11, v4, v15}, Lcom/daaw/t71$a;->d(FF)V

    add-float/2addr v2, v4

    goto/16 :goto_5

    :cond_8
    invoke-interface {v11, v4, v3}, Lcom/daaw/t71$a;->e(FF)V

    move v2, v4

    goto/16 :goto_5

    :sswitch_6
    invoke-virtual {v13}, Lcom/daaw/uv0;->d()F

    move-result v4

    invoke-virtual {v13}, Lcom/daaw/uv0;->d()F

    move-result v5

    invoke-virtual {v13}, Lcom/daaw/uv0;->d()F

    move-result v6

    invoke-virtual {v13}, Lcom/daaw/uv0;->d()F

    move-result v7

    invoke-virtual {v13}, Lcom/daaw/uv0;->d()F

    move-result v16

    invoke-virtual {v13}, Lcom/daaw/uv0;->d()F

    move-result v17

    const/16 v8, 0x63

    if-ne v1, v8, :cond_9

    add-float/2addr v4, v2

    add-float/2addr v6, v2

    add-float v16, v16, v2

    add-float/2addr v5, v3

    add-float/2addr v7, v3

    add-float v17, v17, v3

    :cond_9
    move v2, v4

    move v3, v5

    move v8, v6

    move/from16 v20, v7

    move-object/from16 v1, p1

    move v4, v8

    move/from16 v5, v20

    move/from16 v6, v16

    move/from16 v7, v17

    invoke-interface/range {v1 .. v7}, Lcom/daaw/t71$a;->c(FFFFFF)V

    move/from16 v2, v16

    move/from16 v3, v17

    move/from16 v17, v20

    move/from16 v16, v8

    goto/16 :goto_6

    :sswitch_7
    invoke-virtual {v13}, Lcom/daaw/uv0;->d()F

    move-result v6

    invoke-virtual {v13}, Lcom/daaw/uv0;->d()F

    move-result v7

    invoke-virtual {v13}, Lcom/daaw/uv0;->d()F

    move-result v8

    invoke-virtual {v13}, Lcom/daaw/uv0;->c()I

    move-result v19

    invoke-virtual {v13}, Lcom/daaw/uv0;->c()I

    move-result v20

    invoke-virtual {v13}, Lcom/daaw/uv0;->d()F

    move-result v4

    invoke-virtual {v13}, Lcom/daaw/uv0;->d()F

    move-result v5

    const/16 v14, 0x61

    if-ne v1, v14, :cond_a

    add-float/2addr v4, v2

    add-float/2addr v5, v3

    :cond_a
    move v14, v4

    move/from16 v22, v5

    move-object/from16 v1, p1

    move v4, v14

    move/from16 v5, v22

    move/from16 v23, v9

    move/from16 v9, v19

    move/from16 v19, v10

    move/from16 v10, v20

    invoke-static/range {v1 .. v10}, Lcom/daaw/t71;->b(Lcom/daaw/t71$a;FFFFFFFII)V

    move v2, v14

    move/from16 v10, v19

    move/from16 v3, v22

    move/from16 v9, v23

    goto/16 :goto_5

    :goto_8
    if-nez v8, :cond_b

    move/from16 v16, v2

    move/from16 v17, v3

    :cond_b
    invoke-virtual {v13}, Lcom/daaw/uv0;->i()V

    move/from16 v1, v18

    const/4 v14, 0x0

    goto/16 :goto_0

    :cond_c
    return-object v11

    nop

    :pswitch_data_0
    .packed-switch 0x30
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

    :sswitch_data_0
    .sparse-switch
        0x41 -> :sswitch_7
        0x43 -> :sswitch_6
        0x48 -> :sswitch_5
        0x4c -> :sswitch_4
        0x4d -> :sswitch_3
        0x51 -> :sswitch_2
        0x53 -> :sswitch_2
        0x54 -> :sswitch_4
        0x56 -> :sswitch_1
        0x5a -> :sswitch_0
        0x61 -> :sswitch_7
        0x63 -> :sswitch_6
        0x68 -> :sswitch_5
        0x6c -> :sswitch_4
        0x6d -> :sswitch_3
        0x71 -> :sswitch_2
        0x73 -> :sswitch_2
        0x74 -> :sswitch_4
        0x76 -> :sswitch_1
        0x7a -> :sswitch_0
    .end sparse-switch
.end method

.method public static b(Lcom/daaw/t71$a;FFFFFFFII)V
    .locals 0

    return-void
.end method

.method public static c(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/daaw/la1;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/t71$b;

    invoke-direct {v0}, Lcom/daaw/t71$b;-><init>()V

    invoke-static {p0, v0}, Lcom/daaw/t71;->a(Ljava/lang/String;Lcom/daaw/t71$a;)Lcom/daaw/t71$a;

    invoke-virtual {v0}, Lcom/daaw/t71$b;->f()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
