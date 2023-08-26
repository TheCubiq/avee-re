.class public Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;
.super Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;
.source "BufferRendererEdge.java"


# instance fields
.field m0:Lcom/daaw/avee/Common/Vec2f;

.field m1:Lcom/daaw/avee/Common/Vec2f;

.field texOff02:F

.field texOff13:F

.field private v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 22
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;-><init>(I)V

    .line 14
    new-instance p1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-direct {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    .line 15
    new-instance p1, Lcom/daaw/avee/Common/Vec2f;

    const/4 v0, 0x0

    invoke-direct {p1, v0, v0}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m0:Lcom/daaw/avee/Common/Vec2f;

    .line 16
    new-instance p1, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {p1, v0, v0}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m1:Lcom/daaw/avee/Common/Vec2f;

    return-void
.end method


# virtual methods
.method public drawBatchRectangle2Patch(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lcom/daaw/avee/Common/Func/Func3;IFLcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;",
            "Lcom/daaw/avee/Common/Func/Func3<",
            "Ljava/lang/Integer;",
            "[F[I",
            "Ljava/lang/Boolean;",
            ">;IF",
            "Lcom/daaw/avee/Common/Vec2f;",
            "Lcom/daaw/avee/Common/Vec2f;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;",
            ")V"
        }
    .end annotation

    move-object/from16 v7, p0

    move/from16 v8, p3

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    move-object/from16 v11, p7

    .line 170
    move-object/from16 v12, p1

    check-cast v12, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    const/16 v0, 0x8

    new-array v13, v0, [F

    const/4 v14, 0x4

    new-array v15, v14, [I

    .line 176
    iget v0, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-virtual {v11, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateU(F)F

    move-result v0

    iput v0, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 177
    iget v0, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-virtual {v11, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateV(F)F

    move-result v0

    iput v0, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 179
    iget v0, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-virtual {v11, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateU(F)F

    move-result v0

    iput v0, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 180
    iget v0, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-virtual {v11, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateV(F)F

    move-result v0

    iput v0, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 v0, 0x0

    .line 181
    iput v0, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 183
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posW:F

    .line 184
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual/range {p7 .. p7}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateW()F

    move-result v1

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texZ:F

    .line 185
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v1, p4

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    .line 193
    iget v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->maxTrianglesBatchForRender:I

    iget v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->maxTrianglesBatchForRender:I

    rem-int/2addr v1, v14

    sub-int v6, v0, v1

    const/4 v5, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v8, :cond_2

    mul-int/lit8 v0, v4, 0x4

    .line 196
    rem-int/2addr v0, v6

    if-nez v0, :cond_0

    sub-int v0, v8, v4

    mul-int/lit8 v0, v0, 0x4

    .line 197
    invoke-static {v0, v6}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v7, v12, v0, v11, v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->checkFlush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;ILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 199
    :cond_0
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v3, p2

    invoke-interface {v3, v0, v13, v15}, Lcom/daaw/avee/Common/Func/Func3;->Invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    move/from16 v16, v4

    move/from16 v18, v6

    const/4 v1, 0x4

    const/4 v14, 0x0

    goto/16 :goto_1

    .line 202
    :cond_1
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m0:Lcom/daaw/avee/Common/Vec2f;

    aget v1, v13, v5

    aget v2, v13, v14

    add-float/2addr v1, v2

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float v1, v1, v2

    iput v1, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 203
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m0:Lcom/daaw/avee/Common/Vec2f;

    const/4 v1, 0x1

    aget v16, v13, v1

    const/16 v17, 0x5

    aget v18, v13, v17

    add-float v16, v16, v18

    mul-float v1, v16, v2

    iput v1, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 205
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m1:Lcom/daaw/avee/Common/Vec2f;

    const/4 v1, 0x2

    aget v16, v13, v1

    const/16 v18, 0x6

    aget v19, v13, v18

    add-float v16, v16, v19

    mul-float v1, v16, v2

    iput v1, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 206
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m1:Lcom/daaw/avee/Common/Vec2f;

    const/4 v1, 0x3

    aget v16, v13, v1

    const/16 v19, 0x7

    aget v20, v13, v19

    add-float v16, v16, v20

    mul-float v1, v16, v2

    iput v1, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 209
    aget v0, v13, v5

    aget v1, v13, v14

    sub-float/2addr v0, v1

    const/4 v1, 0x1

    aget v16, v13, v1

    aget v17, v13, v17

    sub-float v1, v16, v17

    invoke-static {v0, v1}, Lcom/daaw/avee/Common/Vec2f;->length(FF)F

    move-result v0

    const/4 v1, 0x2

    .line 213
    aget v16, v13, v1

    aget v17, v13, v18

    sub-float v1, v16, v17

    const/16 v16, 0x3

    aget v17, v13, v16

    aget v18, v13, v19

    sub-float v5, v17, v18

    invoke-static {v1, v5}, Lcom/daaw/avee/Common/Vec2f;->length(FF)F

    move-result v1

    mul-float v0, v0, v2

    mul-float v1, v1, v2

    const/high16 v2, 0x3cc00000    # 0.0234375f

    mul-float v0, v0, v2

    .line 219
    iput v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->texOff02:F

    mul-float v1, v1, v2

    .line 220
    iput v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->texOff13:F

    .line 223
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 224
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget v2, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->texOff02:F

    add-float/2addr v1, v2

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 234
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m0:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m0:Lcom/daaw/avee/Common/Vec2f;

    iget v5, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v0, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    const/16 v17, 0x2

    move/from16 v18, v0

    move-object/from16 v0, p0

    const/4 v14, 0x1

    move v3, v5

    move/from16 v16, v4

    move/from16 v4, v18

    const/4 v14, 0x0

    move-object v5, v15

    move/from16 v18, v6

    move/from16 v6, v17

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;FFF[II)V

    .line 236
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 237
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 247
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v7, v0, v13, v15, v14}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[F[II)V

    .line 249
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 250
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget v2, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->texOff13:F

    add-float/2addr v1, v2

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 260
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m1:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m1:Lcom/daaw/avee/Common/Vec2f;

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    const/4 v6, 0x3

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;FFF[II)V

    .line 262
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 263
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget v2, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->texOff13:F

    add-float/2addr v1, v2

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 273
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m1:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m1:Lcom/daaw/avee/Common/Vec2f;

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;FFF[II)V

    .line 275
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 276
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 286
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v7, v0, v13, v15, v14}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[F[II)V

    .line 288
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 289
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 299
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v13, v15, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[F[II)V

    .line 301
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 302
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 312
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/4 v1, 0x2

    invoke-virtual {v7, v0, v13, v15, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[F[II)V

    .line 314
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 315
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget v2, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->texOff02:F

    add-float/2addr v1, v2

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 325
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m0:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m0:Lcom/daaw/avee/Common/Vec2f;

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    const/4 v6, 0x0

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;FFF[II)V

    .line 327
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 328
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 338
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/4 v1, 0x3

    invoke-virtual {v7, v0, v13, v15, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[F[II)V

    .line 340
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 341
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 351
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v7, v0, v13, v15, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[F[II)V

    .line 353
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 354
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget v2, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->texOff02:F

    add-float/2addr v1, v2

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 364
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m0:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m0:Lcom/daaw/avee/Common/Vec2f;

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;FFF[II)V

    .line 366
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 367
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget v2, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->texOff13:F

    add-float/2addr v1, v2

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 377
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m1:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m1:Lcom/daaw/avee/Common/Vec2f;

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    const/4 v6, 0x1

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;FFF[II)V

    .line 380
    iget v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateParticleCount:I

    const/4 v1, 0x4

    add-int/2addr v0, v1

    iput v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateParticleCount:I

    :goto_1
    add-int/lit8 v4, v16, 0x1

    move/from16 v6, v18

    const/4 v5, 0x0

    const/4 v14, 0x4

    goto/16 :goto_0

    :cond_2
    return-void
.end method

.method public drawRectangle2Patch(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p4

    move/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    move/from16 v7, p8

    move/from16 v8, p9

    move-object/from16 v9, p12

    move-object/from16 v10, p13

    move-object/from16 v11, p14

    .line 44
    move-object/from16 v12, p1

    check-cast v12, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    const/4 v13, 0x4

    const/4 v14, 0x0

    .line 45
    invoke-virtual {v0, v12, v13, v11, v14}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->checkFlush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;ILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)Z

    move-result v12

    if-nez v12, :cond_0

    return-void

    .line 49
    :cond_0
    iget v12, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-virtual {v11, v12}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateU(F)F

    move-result v12

    iput v12, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 50
    iget v12, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-virtual {v11, v12}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateV(F)F

    move-result v12

    iput v12, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 52
    iget v12, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-virtual {v11, v12}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateU(F)F

    move-result v12

    iput v12, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 53
    iget v12, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-virtual {v11, v12}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateV(F)F

    move-result v12

    iput v12, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 v12, 0x0

    .line 54
    iput v12, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 56
    iget-object v12, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m0:Lcom/daaw/avee/Common/Vec2f;

    add-float v14, v1, v5

    const/high16 v15, 0x3f000000    # 0.5f

    mul-float v14, v14, v15

    iput v14, v12, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 57
    iget-object v12, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m0:Lcom/daaw/avee/Common/Vec2f;

    add-float v14, v2, v6

    mul-float v14, v14, v15

    iput v14, v12, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 59
    iget-object v12, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m1:Lcom/daaw/avee/Common/Vec2f;

    add-float v14, v3, v7

    mul-float v14, v14, v15

    iput v14, v12, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 60
    iget-object v12, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m1:Lcom/daaw/avee/Common/Vec2f;

    add-float v14, v4, v8

    mul-float v14, v14, v15

    iput v14, v12, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float v12, v1, v5

    sub-float v14, v2, v6

    .line 64
    invoke-static {v12, v14}, Lcom/daaw/avee/Common/Vec2f;->length(FF)F

    move-result v12

    sub-float v14, v3, v7

    sub-float v13, v4, v8

    .line 68
    invoke-static {v14, v13}, Lcom/daaw/avee/Common/Vec2f;->length(FF)F

    move-result v13

    mul-float v12, v12, v15

    mul-float v13, v13, v15

    const/high16 v14, 0x3cc00000    # 0.0234375f

    mul-float v12, v12, v14

    mul-float v13, v13, v14

    .line 78
    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/high16 v15, 0x3f800000    # 1.0f

    iput v15, v14, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posW:F

    .line 79
    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual/range {p14 .. p14}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateW()F

    move-result v11

    iput v11, v14, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texZ:F

    .line 80
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v14, p11

    iput v14, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->colorRgba:I

    .line 81
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v14, p10

    iput v14, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    .line 83
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m0:Lcom/daaw/avee/Common/Vec2f;

    iget v14, v14, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v14, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 84
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m0:Lcom/daaw/avee/Common/Vec2f;

    iget v14, v14, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v14, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 85
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v14, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v14, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 86
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v14, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v14, v12

    iput v14, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 87
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 89
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v1, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 90
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v2, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 91
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v14, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v14, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 92
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v14, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v14, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 93
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 95
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m1:Lcom/daaw/avee/Common/Vec2f;

    iget v14, v14, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v14, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 96
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m1:Lcom/daaw/avee/Common/Vec2f;

    iget v14, v14, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v14, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 97
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v14, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v14, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 98
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v14, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v14, v13

    iput v14, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 99
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 101
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m1:Lcom/daaw/avee/Common/Vec2f;

    iget v14, v14, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v14, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 102
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m1:Lcom/daaw/avee/Common/Vec2f;

    iget v14, v14, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v14, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 103
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v14, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v14, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 104
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v14, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v14, v13

    iput v14, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 105
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 107
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v1, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 108
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 109
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 110
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 111
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 113
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 114
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v4, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 115
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 116
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 117
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 119
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v5, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 120
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v6, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 121
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 122
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 123
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 125
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m0:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 126
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m0:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 127
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 128
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v2, v12

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 129
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 131
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v7, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 132
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v8, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 133
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 134
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 135
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 137
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v7, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 138
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v8, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 139
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 140
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 141
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 143
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m0:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 144
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m0:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 145
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 146
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v2, v12

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 147
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 149
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m1:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 150
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->m1:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 151
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 152
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v2, v13

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 153
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 155
    iget v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateParticleCount:I

    const/4 v2, 0x4

    add-int/2addr v1, v2

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;->updateParticleCount:I

    return-void
.end method
