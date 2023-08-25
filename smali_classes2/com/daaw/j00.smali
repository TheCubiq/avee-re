.class public Lcom/daaw/j00;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 37

    move/from16 v0, p1

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v1

    const/4 v2, 0x1

    move-object/from16 v3, p0

    invoke-virtual {v3, v1, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    if-ge v0, v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v11

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v12

    mul-int v13, v11, v12

    new-array v14, v13, [I

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, v1

    move-object v4, v14

    move v6, v11

    move v9, v11

    move v10, v12

    invoke-virtual/range {v3 .. v10}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    add-int/lit8 v3, v11, -0x1

    add-int/lit8 v4, v12, -0x1

    add-int v5, v0, v0

    add-int/2addr v5, v2

    new-array v6, v13, [I

    new-array v7, v13, [I

    new-array v8, v13, [I

    invoke-static {v11, v12}, Ljava/lang/Math;->max(II)I

    move-result v9

    new-array v9, v9, [I

    add-int/lit8 v10, v5, 0x1

    shr-int/2addr v10, v2

    mul-int v10, v10, v10

    mul-int/lit16 v13, v10, 0x100

    new-array v15, v13, [I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v13, :cond_1

    div-int v17, v2, v10

    aput v17, v15, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x3

    const/4 v10, 0x2

    new-array v13, v10, [I

    const/16 v16, 0x1

    aput v2, v13, v16

    const/4 v2, 0x0

    aput v5, v13, v2

    const-class v2, I

    invoke-static {v2, v13}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [[I

    add-int/lit8 v13, v0, 0x1

    const/4 v10, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    :goto_1
    move-object/from16 v20, v1

    if-ge v10, v12, :cond_6

    neg-int v1, v0

    move/from16 v29, v12

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move v12, v1

    const/4 v1, 0x0

    :goto_2
    const v30, 0xff00

    const/high16 v31, 0xff0000

    move/from16 v32, v4

    move-object/from16 v33, v9

    if-gt v12, v0, :cond_3

    const/4 v4, 0x0

    invoke-static {v12, v4}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-static {v3, v9}, Ljava/lang/Math;->min(II)I

    move-result v9

    add-int v9, v18, v9

    aget v9, v14, v9

    add-int v34, v12, v0

    aget-object v34, v2, v34

    and-int v31, v9, v31

    shr-int/lit8 v31, v31, 0x10

    aput v31, v34, v4

    and-int v30, v9, v30

    shr-int/lit8 v30, v30, 0x8

    const/16 v16, 0x1

    aput v30, v34, v16

    and-int/lit16 v9, v9, 0xff

    const/16 v17, 0x2

    aput v9, v34, v17

    invoke-static {v12}, Ljava/lang/Math;->abs(I)I

    move-result v9

    sub-int v9, v13, v9

    aget v30, v34, v4

    mul-int v30, v30, v9

    add-int v1, v1, v30

    aget v30, v34, v16

    mul-int v30, v30, v9

    add-int v21, v21, v30

    aget v30, v34, v17

    mul-int v30, v30, v9

    add-int v22, v22, v30

    if-lez v12, :cond_2

    aget v9, v34, v4

    add-int v26, v26, v9

    aget v9, v34, v16

    add-int v27, v27, v9

    aget v9, v34, v17

    add-int v28, v28, v9

    goto :goto_3

    :cond_2
    aget v9, v34, v4

    add-int v23, v23, v9

    aget v4, v34, v16

    add-int v24, v24, v4

    aget v4, v34, v17

    add-int v25, v25, v4

    :goto_3
    add-int/lit8 v12, v12, 0x1

    move/from16 v4, v32

    move-object/from16 v9, v33

    goto :goto_2

    :cond_3
    move v9, v0

    move v4, v1

    const/4 v1, 0x0

    :goto_4
    if-ge v1, v11, :cond_5

    aget v12, v15, v4

    aput v12, v6, v18

    aget v12, v15, v21

    aput v12, v7, v18

    aget v12, v15, v22

    aput v12, v8, v18

    sub-int v4, v4, v23

    sub-int v21, v21, v24

    sub-int v22, v22, v25

    sub-int v12, v9, v0

    add-int/2addr v12, v5

    rem-int/2addr v12, v5

    aget-object v12, v2, v12

    const/16 v34, 0x0

    aget v35, v12, v34

    sub-int v23, v23, v35

    const/16 v16, 0x1

    aget v34, v12, v16

    sub-int v24, v24, v34

    const/16 v17, 0x2

    aget v34, v12, v17

    sub-int v25, v25, v34

    if-nez v10, :cond_4

    add-int v34, v1, v0

    move-object/from16 v35, v15

    add-int/lit8 v15, v34, 0x1

    invoke-static {v15, v3}, Ljava/lang/Math;->min(II)I

    move-result v15

    aput v15, v33, v1

    goto :goto_5

    :cond_4
    move-object/from16 v35, v15

    :goto_5
    aget v15, v33, v1

    add-int v15, v19, v15

    aget v15, v14, v15

    and-int v34, v15, v31

    shr-int/lit8 v34, v34, 0x10

    const/16 v36, 0x0

    aput v34, v12, v36

    and-int v34, v15, v30

    shr-int/lit8 v34, v34, 0x8

    const/16 v16, 0x1

    aput v34, v12, v16

    and-int/lit16 v15, v15, 0xff

    const/16 v17, 0x2

    aput v15, v12, v17

    aget v15, v12, v36

    add-int v26, v26, v15

    aget v15, v12, v16

    add-int v27, v27, v15

    aget v12, v12, v17

    add-int v28, v28, v12

    add-int v4, v4, v26

    add-int v21, v21, v27

    add-int v22, v22, v28

    add-int/lit8 v9, v9, 0x1

    rem-int/2addr v9, v5

    rem-int v12, v9, v5

    aget-object v12, v2, v12

    const/4 v15, 0x0

    aget v34, v12, v15

    add-int v23, v23, v34

    const/16 v16, 0x1

    aget v34, v12, v16

    add-int v24, v24, v34

    const/16 v17, 0x2

    aget v34, v12, v17

    add-int v25, v25, v34

    aget v34, v12, v15

    sub-int v26, v26, v34

    aget v15, v12, v16

    sub-int v27, v27, v15

    aget v12, v12, v17

    sub-int v28, v28, v12

    add-int/lit8 v18, v18, 0x1

    add-int/lit8 v1, v1, 0x1

    move-object/from16 v15, v35

    goto/16 :goto_4

    :cond_5
    move-object/from16 v35, v15

    add-int v19, v19, v11

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v1, v20

    move/from16 v12, v29

    move/from16 v4, v32

    move-object/from16 v9, v33

    goto/16 :goto_1

    :cond_6
    move/from16 v32, v4

    move-object/from16 v33, v9

    move/from16 v29, v12

    move-object/from16 v35, v15

    const/4 v1, 0x0

    :goto_6
    if-ge v1, v11, :cond_c

    neg-int v3, v0

    mul-int v4, v3, v11

    move/from16 v22, v5

    move-object/from16 v23, v14

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    move v5, v3

    move v14, v4

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_7
    move/from16 v24, v11

    if-gt v5, v0, :cond_9

    const/4 v11, 0x0

    invoke-static {v11, v14}, Ljava/lang/Math;->max(II)I

    move-result v25

    add-int v25, v25, v1

    add-int v26, v5, v0

    aget-object v26, v2, v26

    aget v27, v6, v25

    aput v27, v26, v11

    aget v11, v7, v25

    const/16 v16, 0x1

    aput v11, v26, v16

    aget v11, v8, v25

    const/16 v17, 0x2

    aput v11, v26, v17

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v11

    sub-int v11, v13, v11

    aget v27, v6, v25

    mul-int v27, v27, v11

    add-int v3, v3, v27

    aget v27, v7, v25

    mul-int v27, v27, v11

    add-int v4, v4, v27

    aget v25, v8, v25

    mul-int v25, v25, v11

    add-int v9, v9, v25

    const/4 v11, 0x0

    if-lez v5, :cond_7

    aget v25, v26, v11

    add-int v18, v18, v25

    const/16 v16, 0x1

    aget v25, v26, v16

    add-int v19, v19, v25

    const/16 v17, 0x2

    aget v25, v26, v17

    add-int v21, v21, v25

    goto :goto_8

    :cond_7
    const/16 v16, 0x1

    const/16 v17, 0x2

    aget v25, v26, v11

    add-int v10, v10, v25

    aget v11, v26, v16

    add-int/2addr v12, v11

    aget v11, v26, v17

    add-int/2addr v15, v11

    :goto_8
    move/from16 v11, v32

    if-ge v5, v11, :cond_8

    add-int v14, v14, v24

    :cond_8
    add-int/lit8 v5, v5, 0x1

    move/from16 v32, v11

    move/from16 v11, v24

    goto :goto_7

    :cond_9
    move/from16 v11, v32

    move/from16 v26, v0

    move/from16 v25, v1

    move v5, v4

    move/from16 v14, v29

    move v4, v3

    const/4 v3, 0x0

    :goto_9
    if-ge v3, v14, :cond_b

    const/high16 v27, -0x1000000

    aget v28, v23, v25

    and-int v27, v28, v27

    aget v28, v35, v4

    shl-int/lit8 v28, v28, 0x10

    or-int v27, v27, v28

    aget v28, v35, v5

    shl-int/lit8 v28, v28, 0x8

    or-int v27, v27, v28

    aget v28, v35, v9

    or-int v27, v27, v28

    aput v27, v23, v25

    sub-int/2addr v4, v10

    sub-int/2addr v5, v12

    sub-int/2addr v9, v15

    sub-int v27, v26, v0

    add-int v27, v27, v22

    rem-int v27, v27, v22

    aget-object v27, v2, v27

    const/16 v28, 0x0

    aget v29, v27, v28

    sub-int v10, v10, v29

    const/16 v16, 0x1

    aget v28, v27, v16

    sub-int v12, v12, v28

    const/16 v17, 0x2

    aget v28, v27, v17

    sub-int v15, v15, v28

    if-nez v1, :cond_a

    add-int v0, v3, v13

    invoke-static {v0, v11}, Ljava/lang/Math;->min(II)I

    move-result v0

    mul-int v0, v0, v24

    aput v0, v33, v3

    :cond_a
    aget v0, v33, v3

    add-int/2addr v0, v1

    aget v28, v6, v0

    const/16 v29, 0x0

    aput v28, v27, v29

    aget v28, v7, v0

    const/16 v16, 0x1

    aput v28, v27, v16

    aget v0, v8, v0

    const/16 v17, 0x2

    aput v0, v27, v17

    aget v0, v27, v29

    add-int v18, v18, v0

    aget v0, v27, v16

    add-int v19, v19, v0

    aget v0, v27, v17

    add-int v21, v21, v0

    add-int v4, v4, v18

    add-int v5, v5, v19

    add-int v9, v9, v21

    add-int/lit8 v26, v26, 0x1

    rem-int v26, v26, v22

    aget-object v0, v2, v26

    const/16 v27, 0x0

    aget v28, v0, v27

    add-int v10, v10, v28

    const/16 v16, 0x1

    aget v28, v0, v16

    add-int v12, v12, v28

    const/16 v17, 0x2

    aget v28, v0, v17

    add-int v15, v15, v28

    aget v28, v0, v27

    sub-int v18, v18, v28

    aget v28, v0, v16

    sub-int v19, v19, v28

    aget v0, v0, v17

    sub-int v21, v21, v0

    add-int v25, v25, v24

    add-int/lit8 v3, v3, 0x1

    move/from16 v0, p1

    goto/16 :goto_9

    :cond_b
    const/16 v16, 0x1

    const/16 v17, 0x2

    const/16 v27, 0x0

    add-int/lit8 v1, v1, 0x1

    move/from16 v0, p1

    move/from16 v32, v11

    move/from16 v29, v14

    move/from16 v5, v22

    move-object/from16 v14, v23

    move/from16 v11, v24

    goto/16 :goto_6

    :cond_c
    move/from16 v24, v11

    move-object/from16 v23, v14

    move/from16 v14, v29

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v3, v20

    move-object/from16 v4, v23

    move/from16 v6, v24

    move/from16 v9, v24

    move v10, v14

    invoke-virtual/range {v3 .. v10}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    return-object v20
.end method
