.class public Llomont/Lomont4FFT;
.super Llomont/FFTBase;
.source "Lomont4FFT.java"


# instance fields
.field forwardCos:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field forwardSin:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field inverseCos:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field inverseSin:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Llomont/FFTBase;-><init>()V

    return-void
.end method


# virtual methods
.method public FFT([DZ)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 88
    array-length v2, v1

    .line 93
    div-int/lit8 v2, v2, 0x2

    .line 102
    div-int/lit8 v3, v2, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    add-int/lit8 v7, v5, 0x2

    .line 108
    aget-wide v8, v1, v7

    add-int v10, v6, v2

    .line 109
    aget-wide v11, v1, v10

    aput-wide v11, v1, v7

    .line 110
    aput-wide v8, v1, v10

    add-int/lit8 v7, v5, 0x3

    .line 111
    aget-wide v8, v1, v7

    add-int/lit8 v10, v2, 0x1

    add-int/2addr v10, v6

    .line 112
    aget-wide v11, v1, v10

    aput-wide v11, v1, v7

    .line 114
    aput-wide v8, v1, v10

    if-le v5, v6, :cond_0

    .line 119
    aget-wide v7, v1, v5

    .line 120
    aget-wide v9, v1, v6

    aput-wide v9, v1, v5

    .line 121
    aput-wide v7, v1, v6

    add-int/lit8 v7, v5, 0x1

    .line 122
    aget-wide v8, v1, v7

    add-int/lit8 v10, v6, 0x1

    .line 123
    aget-wide v11, v1, v10

    aput-wide v11, v1, v7

    .line 124
    aput-wide v8, v1, v10

    add-int/lit8 v7, v2, 0x2

    add-int v8, v5, v7

    .line 126
    aget-wide v9, v1, v8

    add-int/2addr v7, v6

    .line 128
    aget-wide v11, v1, v7

    aput-wide v11, v1, v8

    .line 131
    aput-wide v9, v1, v7

    add-int/lit8 v7, v2, 0x3

    add-int v8, v5, v7

    .line 133
    aget-wide v9, v1, v8

    add-int/2addr v7, v6

    .line 135
    aget-wide v11, v1, v7

    aput-wide v11, v1, v8

    .line 138
    aput-wide v9, v1, v7

    :cond_0
    add-int/lit8 v6, v6, 0x4

    if-lt v6, v2, :cond_7

    if-eqz p2, :cond_1

    .line 161
    iget-object v3, v0, Llomont/Lomont4FFT;->forwardCos:Ljava/util/List;

    goto :goto_1

    :cond_1
    iget-object v3, v0, Llomont/Lomont4FFT;->inverseCos:Ljava/util/List;

    :goto_1
    if-eqz p2, :cond_2

    .line 162
    iget-object v5, v0, Llomont/Lomont4FFT;->forwardSin:Ljava/util/List;

    goto :goto_2

    :cond_2
    iget-object v5, v0, Llomont/Lomont4FFT;->inverseSin:Ljava/util/List;

    :goto_2
    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    :cond_3
    if-le v2, v7, :cond_5

    mul-int/lit8 v7, v7, 0x2

    const/4 v9, 0x0

    :goto_3
    if-ge v9, v7, :cond_3

    .line 169
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Double;

    invoke-virtual {v10}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    add-int/lit8 v12, v8, 0x1

    .line 170
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Double;

    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v13

    move v8, v9

    :goto_4
    mul-int/lit8 v15, v2, 0x2

    if-ge v8, v15, :cond_4

    add-int v15, v8, v7

    .line 173
    aget-wide v16, v1, v15

    mul-double v16, v16, v10

    add-int/lit8 v18, v15, 0x1

    aget-wide v19, v1, v18

    mul-double v19, v19, v13

    sub-double v16, v16, v19

    .line 175
    aget-wide v19, v1, v15

    mul-double v19, v19, v13

    aget-wide v21, v1, v18

    mul-double v21, v21, v10

    add-double v19, v19, v21

    .line 177
    aget-wide v21, v1, v8

    sub-double v21, v21, v16

    aput-wide v21, v1, v15

    add-int/lit8 v15, v8, 0x1

    .line 178
    aget-wide v21, v1, v15

    sub-double v21, v21, v19

    aput-wide v21, v1, v18

    .line 179
    aget-wide v21, v1, v8

    add-double v21, v21, v16

    aput-wide v21, v1, v8

    .line 180
    aget-wide v16, v1, v15

    add-double v16, v16, v19

    aput-wide v16, v1, v15

    mul-int/lit8 v15, v7, 0x2

    add-int/2addr v8, v15

    goto :goto_4

    :cond_4
    add-int/lit8 v9, v9, 0x2

    move v8, v12

    goto :goto_3

    :cond_5
    if-nez p2, :cond_6

    .line 190
    div-int/2addr v6, v2

    int-to-double v5, v6

    :goto_5
    mul-int/lit8 v3, v2, 0x2

    if-ge v4, v3, :cond_6

    .line 192
    aget-wide v7, v1, v4

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v7, v7, v5

    aput-wide v7, v1, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_6
    return-void

    :cond_7
    move v7, v3

    :goto_6
    if-lt v5, v7, :cond_8

    sub-int/2addr v5, v7

    .line 152
    div-int/lit8 v7, v7, 0x2

    goto :goto_6

    :cond_8
    add-int/2addr v5, v7

    goto/16 :goto_0
.end method

.method public Initialize(I)V
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 24
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Llomont/Lomont4FFT;->forwardCos:Ljava/util/List;

    .line 25
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Llomont/Lomont4FFT;->forwardSin:Ljava/util/List;

    .line 26
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Llomont/Lomont4FFT;->inverseCos:Ljava/util/List;

    .line 27
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Llomont/Lomont4FFT;->inverseSin:Ljava/util/List;

    const/4 v2, 0x1

    const/4 v3, 0x1

    :goto_0
    const-wide/16 v7, 0x0

    const-wide v9, 0x400921fb54442d18L    # Math.PI

    if-le v1, v3, :cond_1

    mul-int/lit8 v11, v3, 0x2

    int-to-double v12, v3

    .line 35
    invoke-static {v12, v13}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v9, v12

    .line 38
    invoke-static {v9, v10}, Ljava/lang/Math;->cos(D)D

    move-result-wide v12

    .line 39
    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    move-result-wide v9

    const/4 v4, 0x0

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    :goto_1
    if-ge v4, v11, :cond_0

    .line 41
    iget-object v3, v0, Llomont/Lomont4FFT;->forwardCos:Ljava/util/List;

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v14

    invoke-interface {v3, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    iget-object v3, v0, Llomont/Lomont4FFT;->forwardSin:Ljava/util/List;

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v14

    invoke-interface {v3, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    mul-double v14, v5, v12

    mul-double v16, v7, v9

    sub-double v14, v14, v16

    mul-double v7, v7, v12

    mul-double v5, v5, v9

    add-double/2addr v7, v5

    add-int/lit8 v4, v4, 0x2

    move-wide v5, v14

    goto :goto_1

    :cond_0
    move v3, v11

    goto :goto_0

    :cond_1
    :goto_2
    if-le v1, v2, :cond_3

    mul-int/lit8 v3, v2, 0x2

    int-to-double v11, v2

    .line 58
    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    div-double v11, v9, v11

    const-wide/high16 v13, -0x4010000000000000L    # -1.0

    mul-double v11, v11, v13

    .line 62
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    move-result-wide v13

    .line 63
    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    move-result-wide v11

    move-wide/from16 v17, v7

    const/4 v2, 0x0

    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    :goto_3
    if-ge v2, v3, :cond_2

    .line 65
    iget-object v4, v0, Llomont/Lomont4FFT;->inverseCos:Ljava/util/List;

    invoke-static/range {v15 .. v16}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    iget-object v4, v0, Llomont/Lomont4FFT;->inverseSin:Ljava/util/List;

    invoke-static/range {v17 .. v18}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    mul-double v4, v15, v13

    mul-double v19, v17, v11

    sub-double v4, v4, v19

    mul-double v17, v17, v13

    mul-double v15, v15, v11

    add-double v17, v17, v15

    add-int/lit8 v2, v2, 0x2

    move-wide v15, v4

    goto :goto_3

    :cond_2
    move v2, v3

    goto :goto_2

    :cond_3
    return-void
.end method

.method public RealFFT([DZ)V
    .locals 33

    move-object/from16 v0, p1

    const-wide/high16 v1, -0x4010000000000000L    # -1.0

    if-eqz p2, :cond_0

    .line 203
    invoke-virtual/range {p0 .. p2}, Llomont/Lomont4FFT;->FFT([DZ)V

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    goto :goto_0

    :cond_0
    move-wide v3, v1

    .line 208
    :goto_0
    array-length v5, v0

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    const-wide v8, 0x400921fb54442d18L    # Math.PI

    int-to-double v10, v5

    .line 210
    invoke-static {v10, v11}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v8, v10

    mul-double v8, v8, v6

    mul-double v8, v8, v3

    .line 212
    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    move-result-wide v6

    .line 213
    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    move-result-wide v8

    move-wide v14, v6

    move-wide v12, v8

    const/4 v11, 0x1

    .line 216
    :goto_1
    div-int/lit8 v10, v5, 0x4

    const-wide/high16 v16, 0x3fe0000000000000L    # 0.5

    if-gt v11, v10, :cond_1

    .line 218
    div-int/lit8 v10, v5, 0x2

    sub-int/2addr v10, v11

    mul-int/lit8 v10, v10, 0x2

    .line 220
    aget-wide v18, v0, v10

    add-int/lit8 v20, v10, 0x1

    .line 221
    aget-wide v21, v0, v20

    mul-int/lit8 v23, v11, 0x2

    .line 223
    aget-wide v24, v0, v23

    add-int/lit8 v26, v23, 0x1

    .line 224
    aget-wide v27, v0, v26

    add-double v29, v24, v18

    sub-double v31, v27, v21

    sub-double v24, v24, v18

    mul-double v18, v24, v12

    add-double v27, v27, v21

    mul-double v21, v27, v12

    mul-double v27, v27, v14

    mul-double v24, v24, v14

    add-double v18, v18, v27

    mul-double v18, v18, v3

    add-double v27, v29, v18

    mul-double v27, v27, v16

    .line 237
    aput-wide v27, v0, v23

    sub-double v27, v24, v21

    mul-double v27, v27, v3

    sub-double v27, v31, v27

    mul-double v27, v27, v16

    .line 241
    aput-wide v27, v0, v26

    sub-double v29, v29, v18

    mul-double v29, v29, v16

    .line 247
    aput-wide v29, v0, v10

    mul-double v24, v24, v1

    add-double v24, v24, v21

    mul-double v24, v24, v3

    sub-double v24, v24, v31

    mul-double v24, v24, v16

    .line 251
    aput-wide v24, v0, v20

    mul-double v16, v14, v6

    mul-double v18, v12, v8

    sub-double v16, v16, v18

    mul-double v14, v14, v8

    mul-double v12, v12, v6

    add-double/2addr v12, v14

    add-int/lit8 v11, v11, 0x1

    move-wide/from16 v14, v16

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    if-eqz p2, :cond_2

    .line 266
    aget-wide v2, v0, v1

    .line 267
    aget-wide v4, v0, v1

    const/4 v6, 0x1

    aget-wide v7, v0, v6

    add-double/2addr v4, v7

    aput-wide v4, v0, v1

    .line 268
    aget-wide v4, v0, v6

    sub-double/2addr v2, v4

    aput-wide v2, v0, v6

    move-object/from16 v2, p0

    goto :goto_2

    :cond_2
    const/4 v6, 0x1

    .line 271
    aget-wide v2, v0, v1

    .line 273
    aget-wide v4, v0, v6

    add-double/2addr v4, v2

    mul-double v4, v4, v16

    aput-wide v4, v0, v1

    .line 275
    aget-wide v4, v0, v6

    sub-double/2addr v2, v4

    mul-double v2, v2, v16

    aput-wide v2, v0, v6

    move-object/from16 v2, p0

    .line 277
    invoke-virtual {v2, v0, v1}, Llomont/Lomont4FFT;->FFT([DZ)V

    :goto_2
    return-void
.end method
