.class public Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFontRenderer;
.super Ljava/lang/Object;
.source "SpriteFontRenderer.java"


# instance fields
.field private bufferRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFontRenderer;->bufferRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    return-void
.end method


# virtual methods
.method public drawText(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;Lcom/daaw/avee/Common/Vec3f;Ljava/lang/String;IILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 13

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v12, p7

    .line 70
    invoke-virtual/range {v0 .. v12}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFontRenderer;->drawText(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;Lcom/daaw/avee/Common/Vec3f;Ljava/lang/String;IIZIIIILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    return-void
.end method

.method public drawText(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;Lcom/daaw/avee/Common/Vec3f;Ljava/lang/String;IIZIIIILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move/from16 v4, p8

    move/from16 v5, p9

    .line 88
    invoke-virtual/range {p4 .. p4}, Ljava/lang/String;->length()I

    move-result v6

    .line 89
    iget v7, v2, Lcom/daaw/avee/Common/Vec3f;->x:F

    .line 90
    iget v2, v2, Lcom/daaw/avee/Common/Vec3f;->y:F

    add-int v8, v4, p10

    int-to-float v8, v8

    add-int v9, v5, p11

    int-to-float v9, v9

    .line 103
    new-instance v15, Lcom/daaw/avee/Common/Vec2f;

    const/4 v14, 0x0

    invoke-direct {v15, v14, v14}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 104
    new-instance v13, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v13, v14, v14}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    const/16 v12, 0xa

    if-nez p7, :cond_1

    move v4, v2

    move v5, v7

    move/from16 v2, p6

    :goto_0
    if-ge v2, v6, :cond_9

    .line 108
    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-ne v8, v12, :cond_0

    .line 112
    invoke-virtual/range {p2 .. p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->fontHeight()F

    move-result v5

    add-float/2addr v4, v5

    move v5, v7

    move/from16 v22, v5

    move-object v9, v13

    move-object/from16 p7, v15

    const/16 v7, 0xa

    goto/16 :goto_1

    .line 116
    :cond_0
    invoke-virtual {v1, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->getSpriteDescByChar(C)Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    move-result-object v8

    .line 118
    iget v9, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->x:F

    invoke-virtual/range {p2 .. p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->textureDim()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v10

    iget v10, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    div-float/2addr v9, v10

    iput v9, v15, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 119
    iget v9, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->y:F

    invoke-virtual/range {p2 .. p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->textureDim()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v10

    iget v10, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    div-float/2addr v9, v10

    iput v9, v15, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 120
    iget v9, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->x:F

    iget v10, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->width:F

    add-float/2addr v9, v10

    invoke-virtual/range {p2 .. p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->textureDim()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v10

    iget v10, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    div-float/2addr v9, v10

    iput v9, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 121
    iget v9, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->y:F

    iget v10, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->height:F

    add-float/2addr v9, v10

    invoke-virtual/range {p2 .. p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->textureDim()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v10

    iget v10, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    div-float/2addr v9, v10

    iput v9, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 123
    iget-object v10, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFontRenderer;->bufferRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    iget v9, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->visualXOffset:F

    add-float/2addr v9, v5

    iget v11, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->visualYOffset:F

    add-float/2addr v11, v4

    iget v14, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->height:F

    sub-float v14, v11, v14

    iget v11, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->width:F

    move/from16 p3, v4

    iget v4, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->height:F

    const/16 v21, 0x0

    const/high16 v16, 0x3f800000    # 1.0f

    move/from16 v17, v11

    move-object/from16 v11, p1

    move/from16 v22, v7

    const/16 v7, 0xa

    move v12, v9

    move-object v9, v13

    move v13, v14

    move/from16 v14, v16

    move-object/from16 p7, v15

    move/from16 v15, v17

    move/from16 v16, v4

    move/from16 v17, p5

    move-object/from16 v18, p7

    move-object/from16 v19, v9

    move-object/from16 v20, p12

    invoke-virtual/range {v10 .. v21}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangleRightBottomWH(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V

    .line 134
    iget v4, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->spaceWidth:F

    add-float/2addr v5, v4

    move/from16 v4, p3

    :goto_1
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v15, p7

    move-object v13, v9

    move/from16 v7, v22

    const/16 v12, 0xa

    goto/16 :goto_0

    :cond_1
    move/from16 v22, v7

    move-object/from16 p7, v15

    const/16 v7, 0xa

    move-object v15, v13

    move/from16 v10, v22

    move/from16 v22, v2

    move/from16 v2, p6

    :goto_2
    if-ge v2, v6, :cond_9

    .line 139
    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-ne v11, v7, :cond_2

    .line 142
    invoke-virtual/range {p2 .. p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->fontHeight()F

    move-result v11

    add-float v22, v22, v11

    move-object/from16 v23, p7

    move-object/from16 v25, v15

    const/16 v24, 0x0

    goto/16 :goto_4

    .line 146
    :cond_2
    invoke-virtual {v1, v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->getSpriteDescByChar(C)Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    move-result-object v13

    int-to-float v11, v4

    sub-float/2addr v11, v10

    int-to-float v12, v5

    sub-float v12, v12, v22

    .line 150
    iget v7, v13, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->width:F

    add-float/2addr v7, v10

    sub-float/2addr v7, v8

    .line 151
    iget v14, v13, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->height:F

    add-float v14, v14, v22

    sub-float/2addr v14, v9

    const/16 v16, 0x0

    cmpg-float v17, v11, v16

    if-gez v17, :cond_3

    const/4 v11, 0x0

    :cond_3
    cmpg-float v17, v12, v16

    if-gez v17, :cond_4

    const/4 v12, 0x0

    :cond_4
    cmpg-float v17, v7, v16

    if-gez v17, :cond_5

    const/4 v7, 0x0

    :cond_5
    cmpg-float v17, v14, v16

    if-gez v17, :cond_6

    const/4 v14, 0x0

    .line 158
    :cond_6
    iget v1, v13, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->width:F

    cmpl-float v1, v11, v1

    if-gtz v1, :cond_8

    iget v1, v13, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->width:F

    cmpl-float v1, v7, v1

    if-gtz v1, :cond_8

    iget v1, v13, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->height:F

    cmpl-float v1, v12, v1

    if-gtz v1, :cond_8

    iget v1, v13, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->height:F

    cmpl-float v1, v14, v1

    if-lez v1, :cond_7

    goto :goto_3

    :cond_7
    add-float v1, v10, v11

    add-float v17, v22, v12

    .line 165
    iget v10, v13, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->x:F

    add-float/2addr v10, v11

    .line 166
    iget v11, v13, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->y:F

    add-float/2addr v11, v12

    .line 167
    iget v12, v13, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->width:F

    sub-float v7, v12, v7

    .line 168
    iget v12, v13, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->height:F

    sub-float v18, v12, v14

    .line 170
    invoke-virtual/range {p2 .. p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->textureDim()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v12

    iget v12, v12, Lcom/daaw/avee/Common/Vec2f;->x:F

    div-float v12, v10, v12

    move-object/from16 v14, p7

    iput v12, v14, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 171
    invoke-virtual/range {p2 .. p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->textureDim()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v12

    iget v12, v12, Lcom/daaw/avee/Common/Vec2f;->y:F

    div-float v12, v11, v12

    iput v12, v14, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v10, v7

    .line 172
    invoke-virtual/range {p2 .. p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->textureDim()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v12

    iget v12, v12, Lcom/daaw/avee/Common/Vec2f;->x:F

    div-float/2addr v10, v12

    iput v10, v15, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float v11, v11, v18

    .line 173
    invoke-virtual/range {p2 .. p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->textureDim()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v10

    iget v10, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    div-float/2addr v11, v10

    iput v11, v15, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 175
    iget-object v10, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFontRenderer;->bufferRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    const/16 v21, 0x0

    const/high16 v19, 0x3f800000    # 1.0f

    move-object/from16 v11, p1

    move v12, v1

    move-object v0, v13

    move/from16 v13, v17

    move-object/from16 v23, v14

    const/16 v24, 0x0

    move/from16 v14, v19

    move-object/from16 v25, v15

    move v15, v7

    move/from16 v16, v18

    move/from16 v17, p5

    move-object/from16 v18, v23

    move-object/from16 v19, v25

    move-object/from16 v20, p12

    invoke-virtual/range {v10 .. v21}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangleRightBottomWH(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V

    .line 186
    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->spaceWidth:F

    add-float/2addr v1, v0

    move v10, v1

    goto :goto_4

    :cond_8
    :goto_3
    move-object/from16 v23, p7

    move-object v0, v13

    move-object/from16 v25, v15

    const/16 v24, 0x0

    .line 159
    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->spaceWidth:F

    add-float/2addr v10, v0

    :goto_4
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 p7, v23

    move-object/from16 v15, v25

    const/16 v7, 0xa

    const/4 v14, 0x0

    goto/16 :goto_2

    :cond_9
    return-void
.end method

.method public drawText(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;Lcom/daaw/avee/Common/Vec3f;Ljava/lang/String;ILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 13

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v12, p6

    .line 66
    invoke-virtual/range {v0 .. v12}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFontRenderer;->drawText(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;Lcom/daaw/avee/Common/Vec3f;Ljava/lang/String;IIZIIIILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    return-void
.end method

.method public flush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFontRenderer;->bufferRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->flush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    return-void
.end method

.method public measureText(Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;Ljava/lang/String;)Lcom/daaw/avee/Common/Vec2i;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 46
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 47
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {p1, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->getSpriteDescByChar(C)Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    move-result-object v2

    .line 48
    iget v2, v2, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->spaceWidth:F

    add-float/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 51
    :cond_0
    new-instance p2, Lcom/daaw/avee/Common/Vec2i;

    float-to-int v0, v0

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->fontHeight()F

    move-result p1

    float-to-int p1, p1

    invoke-direct {p2, v0, p1}, Lcom/daaw/avee/Common/Vec2i;-><init>(II)V

    return-object p2
.end method

.method public measureTextBounds(Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;Ljava/lang/String;)Lcom/daaw/avee/Common/Vec2i;
    .locals 4

    const/4 v0, 0x0

    .line 26
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->getSpriteDescByChar(C)Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    move-result-object v0

    .line 27
    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->visualXOffset:F

    const/4 v1, 0x0

    add-float/2addr v0, v1

    cmpg-float v2, v0, v1

    if-gez v2, :cond_0

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    const/4 v0, 0x1

    const/4 v2, 0x1

    .line 30
    :goto_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v3, v0

    if-ge v2, v3, :cond_1

    .line 31
    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {p1, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->getSpriteDescByChar(C)Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    move-result-object v3

    .line 32
    iget v3, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->spaceWidth:F

    add-float/2addr v1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    move-result p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->getSpriteDescByChar(C)Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    move-result-object p2

    .line 36
    iget v0, p2, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->visualXOffset:F

    iget p2, p2, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->spaceWidth:F

    add-float/2addr v0, p2

    add-float/2addr v1, v0

    .line 39
    new-instance p2, Lcom/daaw/avee/Common/Vec2i;

    float-to-int v0, v1

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->fontMaxHeight()F

    move-result p1

    float-to-int p1, p1

    invoke-direct {p2, v0, p1}, Lcom/daaw/avee/Common/Vec2i;-><init>(II)V

    return-object p2
.end method

.method public measureTextY(Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;)I
    .locals 0

    .line 55
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->fontHeight()F

    move-result p1

    float-to-int p1, p1

    return p1
.end method
