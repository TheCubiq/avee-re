.class Lcom/daaw/avee/Design/VisualizerDesign$10;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR5$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEventR5$Handler<",
        "Ljava/lang/String;",
        "Lcom/daaw/avee/Common/Vec2f;",
        "Lcom/daaw/avee/Common/Vec2f;",
        "Lcom/daaw/avee/comp/Common/MeterOutputData;",
        "Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;",
        "Lcom/daaw/avee/Common/Vec2f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 251
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$10;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Common/MeterOutputData;Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;)Lcom/daaw/avee/Common/Vec2f;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    .line 256
    invoke-interface/range {p5 .. p5}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getFrameTimeF()F

    move-result v4

    .line 257
    invoke-interface/range {p5 .. p5}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getTotalFrameTimeF()F

    move-result v5

    if-nez v1, :cond_0

    .line 259
    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    iget v3, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-direct {v1, v3, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object v1

    .line 261
    :cond_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x1

    if-ge v6, v7, :cond_1

    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    iget v3, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-direct {v1, v3, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object v1

    :cond_1
    const/4 v6, 0x0

    if-nez p3, :cond_2

    .line 263
    new-instance v7, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v7, v6, v6}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    goto :goto_0

    :cond_2
    move-object/from16 v7, p3

    :goto_0
    const-string v8, "Nothing"

    .line 265
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 266
    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v1, v6, v6}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object v1

    :cond_3
    const-string v8, "Constant"

    .line 267
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 268
    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    iget v3, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-direct {v1, v3, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object v1

    :cond_4
    const-string v8, "IsPlaying"

    .line 269
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    const/high16 v9, 0x3f800000    # 1.0f

    if-eqz v8, :cond_6

    .line 270
    iget-object v1, v0, Lcom/daaw/avee/Design/VisualizerDesign$10;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-virtual {v1}, Lcom/daaw/avee/Design/VisualizerDesign;->isPlaying()Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v1, v9, v9}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    goto :goto_1

    :cond_5
    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v1, v6, v6}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    :goto_1
    return-object v1

    :cond_6
    const-string v8, "Beat"

    .line 271
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    .line 272
    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    iget v4, v3, Lcom/daaw/avee/comp/Common/MeterOutputData;->frameDataRmsValue:F

    iget v5, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v4, v4, v5

    iget v3, v3, Lcom/daaw/avee/comp/Common/MeterOutputData;->frameDataRmsValue:F

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v3, v3, v2

    invoke-direct {v1, v4, v3}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object v1

    :cond_7
    const-string v8, "BeatCamShakeMore"

    .line 273
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    const-wide v10, 0x3fe99999a0000000L    # 0.800000011920929

    const/high16 v12, 0x40200000    # 2.5f

    const v13, 0x3d75c28f    # 0.06f

    const/high16 v14, 0x3f000000    # 0.5f

    if-eqz v8, :cond_9

    .line 274
    iget-object v1, v0, Lcom/daaw/avee/Design/VisualizerDesign$10;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-virtual {v1}, Lcom/daaw/avee/Design/VisualizerDesign;->isPlaying()Z

    move-result v1

    if-eqz v1, :cond_8

    iget v1, v3, Lcom/daaw/avee/comp/Common/MeterOutputData;->frameDataRmsValue:F

    mul-float v1, v1, v12

    goto :goto_2

    :cond_8
    const/4 v1, 0x0

    .line 275
    :goto_2
    invoke-static {v1, v9}, Ljava/lang/Math;->min(FF)F

    move-result v1

    .line 276
    invoke-static {v1, v6}, Ljava/lang/Math;->max(FF)F

    move-result v1

    mul-float v3, v1, v1

    .line 280
    iget-object v4, v0, Lcom/daaw/avee/Design/VisualizerDesign$10;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {v4}, Lcom/daaw/avee/Design/VisualizerDesign;->access$1200(Lcom/daaw/avee/Design/VisualizerDesign;)Lcom/daaw/avee/Design/HandheldMotion;

    move-result-object v4

    mul-float v5, v5, v14

    mul-float v5, v5, v1

    iget v1, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v5, v5, v1

    rem-float/2addr v5, v9

    invoke-virtual {v4, v5}, Lcom/daaw/avee/Design/HandheldMotion;->getPos(F)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v1

    .line 282
    iget v4, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float/2addr v4, v14

    iget v5, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v4, v4, v5

    mul-float v4, v4, v3

    mul-float v4, v4, v13

    iput v4, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 283
    iget v4, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float/2addr v4, v14

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v4, v4, v2

    mul-float v4, v4, v3

    mul-float v4, v4, v13

    iput v4, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 284
    invoke-static {v1, v7, v1, v10, v11}, Lcom/daaw/avee/Common/Interpolate;->Lerp(Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;D)V

    return-object v1

    :cond_9
    const-string v8, "BeatCamShakeLess"

    .line 286
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    .line 287
    iget-object v1, v0, Lcom/daaw/avee/Design/VisualizerDesign$10;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-virtual {v1}, Lcom/daaw/avee/Design/VisualizerDesign;->isPlaying()Z

    move-result v1

    if-eqz v1, :cond_a

    iget v1, v3, Lcom/daaw/avee/comp/Common/MeterOutputData;->frameDataRmsValue:F

    mul-float v1, v1, v12

    goto :goto_3

    :cond_a
    const/4 v1, 0x0

    .line 288
    :goto_3
    invoke-static {v1, v9}, Ljava/lang/Math;->min(FF)F

    move-result v1

    .line 289
    invoke-static {v1, v6}, Ljava/lang/Math;->max(FF)F

    move-result v1

    mul-float v3, v1, v1

    .line 292
    iget-object v4, v0, Lcom/daaw/avee/Design/VisualizerDesign$10;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {v4}, Lcom/daaw/avee/Design/VisualizerDesign;->access$1300(Lcom/daaw/avee/Design/VisualizerDesign;)Lcom/daaw/avee/Design/HandheldMotion;

    move-result-object v4

    mul-float v5, v5, v14

    mul-float v5, v5, v1

    iget v1, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v5, v5, v1

    rem-float/2addr v5, v9

    invoke-virtual {v4, v5}, Lcom/daaw/avee/Design/HandheldMotion;->getPos(F)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v1

    .line 294
    iget v4, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float/2addr v4, v14

    iget v5, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v4, v4, v5

    mul-float v4, v4, v3

    mul-float v4, v4, v13

    iput v4, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 295
    iget v4, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float/2addr v4, v14

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v4, v4, v2

    mul-float v4, v4, v3

    mul-float v4, v4, v13

    iput v4, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 296
    invoke-static {v1, v7, v1, v10, v11}, Lcom/daaw/avee/Common/Interpolate;->Lerp(Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;D)V

    return-object v1

    :cond_b
    const-string v8, "TotalTime"

    .line 298
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_c

    .line 299
    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    iget v3, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v3, v3, v5

    rem-float/2addr v3, v9

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v5, v5, v2

    rem-float/2addr v5, v9

    invoke-direct {v1, v3, v5}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object v1

    :cond_c
    const-string v8, "TotalTimeBackward"

    .line 300
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    .line 301
    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    iget v3, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v3, v3, v5

    rem-float/2addr v3, v9

    sub-float v3, v9, v3

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v5, v5, v2

    rem-float/2addr v5, v9

    sub-float/2addr v9, v5

    invoke-direct {v1, v3, v9}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object v1

    :cond_d
    const-string v8, "TotalTimeWhenPlaying"

    .line 302
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_e

    .line 303
    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    iget-object v3, v0, Lcom/daaw/avee/Design/VisualizerDesign$10;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {v3}, Lcom/daaw/avee/Design/VisualizerDesign;->access$800(Lcom/daaw/avee/Design/VisualizerDesign;)F

    move-result v3

    iget v4, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v3, v3, v4

    rem-float/2addr v3, v9

    iget-object v4, v0, Lcom/daaw/avee/Design/VisualizerDesign$10;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {v4}, Lcom/daaw/avee/Design/VisualizerDesign;->access$800(Lcom/daaw/avee/Design/VisualizerDesign;)F

    move-result v4

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v4, v4, v2

    rem-float/2addr v4, v9

    invoke-direct {v1, v3, v4}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object v1

    :cond_e
    const-string v8, "ConstantShakeMore"

    .line 304
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    const-wide v10, 0x3fb99999a0000000L    # 0.10000000149011612

    if-eqz v8, :cond_f

    .line 305
    iget-object v1, v0, Lcom/daaw/avee/Design/VisualizerDesign$10;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {v1}, Lcom/daaw/avee/Design/VisualizerDesign;->access$1200(Lcom/daaw/avee/Design/VisualizerDesign;)Lcom/daaw/avee/Design/HandheldMotion;

    move-result-object v1

    mul-float v5, v5, v14

    iget v3, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v5, v5, v3

    rem-float/2addr v5, v9

    invoke-virtual {v1, v5}, Lcom/daaw/avee/Design/HandheldMotion;->getPos(F)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v1

    .line 306
    iget v3, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float/2addr v3, v14

    iget v4, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v3, v3, v4

    mul-float v3, v3, v13

    iput v3, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 307
    iget v3, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float/2addr v3, v14

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v3, v3, v2

    mul-float v3, v3, v13

    iput v3, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 308
    invoke-static {v1, v7, v1, v10, v11}, Lcom/daaw/avee/Common/Interpolate;->Lerp(Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;D)V

    return-object v1

    :cond_f
    const-string v8, "ConstantShake"

    .line 311
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_10

    .line 312
    iget-object v1, v0, Lcom/daaw/avee/Design/VisualizerDesign$10;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {v1}, Lcom/daaw/avee/Design/VisualizerDesign;->access$1300(Lcom/daaw/avee/Design/VisualizerDesign;)Lcom/daaw/avee/Design/HandheldMotion;

    move-result-object v1

    mul-float v5, v5, v14

    iget v3, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v5, v5, v3

    rem-float/2addr v5, v9

    invoke-virtual {v1, v5}, Lcom/daaw/avee/Design/HandheldMotion;->getPos(F)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v1

    .line 313
    iget v3, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float/2addr v3, v14

    iget v4, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v3, v3, v4

    mul-float v3, v3, v13

    iput v3, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 314
    iget v3, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float/2addr v3, v14

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v3, v3, v2

    mul-float v3, v3, v13

    iput v3, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 315
    invoke-static {v1, v7, v1, v10, v11}, Lcom/daaw/avee/Common/Interpolate;->Lerp(Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;D)V

    return-object v1

    :cond_10
    const-string v8, "BeatRandomShake"

    .line 318
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_12

    .line 319
    iget-object v1, v0, Lcom/daaw/avee/Design/VisualizerDesign$10;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-virtual {v1}, Lcom/daaw/avee/Design/VisualizerDesign;->isPlaying()Z

    move-result v1

    if-eqz v1, :cond_11

    iget v1, v3, Lcom/daaw/avee/comp/Common/MeterOutputData;->frameDataRmsValue:F

    mul-float v1, v1, v12

    goto :goto_4

    :cond_11
    const/4 v1, 0x0

    .line 320
    :goto_4
    invoke-static {v1, v9}, Ljava/lang/Math;->min(FF)F

    move-result v1

    .line 321
    invoke-static {v1, v6}, Ljava/lang/Math;->max(FF)F

    move-result v1

    mul-float v3, v1, v1

    mul-float v3, v3, v1

    .line 323
    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    iget-object v4, v0, Lcom/daaw/avee/Design/VisualizerDesign$10;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {v4}, Lcom/daaw/avee/Design/VisualizerDesign;->access$1000(Lcom/daaw/avee/Design/VisualizerDesign;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v4

    iget v4, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v4, v4, v3

    iget v5, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v4, v4, v5

    const v5, 0x3ccccccd    # 0.025f

    mul-float v4, v4, v5

    iget-object v6, v0, Lcom/daaw/avee/Design/VisualizerDesign$10;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {v6}, Lcom/daaw/avee/Design/VisualizerDesign;->access$1000(Lcom/daaw/avee/Design/VisualizerDesign;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v6

    iget v6, v6, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v6, v6, v3

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v6, v6, v2

    mul-float v6, v6, v5

    invoke-direct {v1, v4, v6}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object v1

    :cond_12
    const-string v8, "TrackPosition"

    .line 324
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_13

    .line 325
    invoke-static {}, Lcom/daaw/avee/Design/AppDesign;->getTrackPositionForRendering()J

    move-result-wide v3

    long-to-float v1, v3

    .line 326
    invoke-static {}, Lcom/daaw/avee/Design/AppDesign;->getTrackDurationForRendering()J

    move-result-wide v3

    long-to-float v3, v3

    div-float/2addr v1, v3

    .line 327
    invoke-static {v1, v9}, Ljava/lang/Math;->min(FF)F

    move-result v1

    .line 328
    invoke-static {v1, v6}, Ljava/lang/Math;->max(FF)F

    move-result v1

    .line 329
    new-instance v3, Lcom/daaw/avee/Common/Vec2f;

    iget v4, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v4, v4, v1

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v1, v1, v2

    invoke-direct {v3, v4, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object v3

    :cond_13
    const-string v8, "TotalTimeAndBeat"

    .line 330
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_15

    .line 331
    iget v1, v7, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 333
    iget-object v5, v0, Lcom/daaw/avee/Design/VisualizerDesign$10;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-virtual {v5}, Lcom/daaw/avee/Design/VisualizerDesign;->isPlaying()Z

    move-result v5

    if-eqz v5, :cond_14

    .line 334
    iget v5, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v4, v4, v5

    mul-float v4, v4, v9

    add-float/2addr v1, v4

    .line 335
    iget v3, v3, Lcom/daaw/avee/comp/Common/MeterOutputData;->frameDataRmsValue:F

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v3, v3, v2

    const v2, 0x3dcccccd    # 0.1f

    mul-float v3, v3, v2

    add-float/2addr v1, v3

    .line 338
    :cond_14
    new-instance v2, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v2, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object v2

    :cond_15
    const-string v8, "ConstantShakeRotMore"

    .line 339
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    const-wide v15, 0x401921fb54442d18L    # 6.283185307179586

    if-eqz v8, :cond_16

    .line 340
    iget-object v1, v0, Lcom/daaw/avee/Design/VisualizerDesign$10;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {v1}, Lcom/daaw/avee/Design/VisualizerDesign;->access$1200(Lcom/daaw/avee/Design/VisualizerDesign;)Lcom/daaw/avee/Design/HandheldMotion;

    move-result-object v1

    mul-float v5, v5, v14

    iget v3, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v5, v5, v3

    rem-float/2addr v5, v9

    invoke-virtual {v1, v5}, Lcom/daaw/avee/Design/HandheldMotion;->getRot(F)F

    move-result v1

    float-to-double v3, v1

    .line 341
    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v3, v15

    double-to-float v1, v3

    .line 342
    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v1, v1, v2

    mul-float v1, v1, v14

    .line 343
    iget v2, v7, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-static {v2, v1, v10, v11}, Lcom/daaw/avee/Common/Interpolate;->Lerp(FFD)F

    move-result v1

    .line 345
    new-instance v2, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v2, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object v2

    :cond_16
    const-string v8, "ConstantShakeRotLess"

    .line 346
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_17

    .line 347
    iget-object v1, v0, Lcom/daaw/avee/Design/VisualizerDesign$10;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {v1}, Lcom/daaw/avee/Design/VisualizerDesign;->access$1300(Lcom/daaw/avee/Design/VisualizerDesign;)Lcom/daaw/avee/Design/HandheldMotion;

    move-result-object v1

    mul-float v5, v5, v14

    iget v3, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v5, v5, v3

    rem-float/2addr v5, v9

    invoke-virtual {v1, v5}, Lcom/daaw/avee/Design/HandheldMotion;->getRot(F)F

    move-result v1

    float-to-double v3, v1

    .line 348
    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v3, v15

    double-to-float v1, v3

    .line 349
    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v1, v1, v2

    mul-float v1, v1, v14

    .line 350
    iget v2, v7, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-static {v2, v1, v10, v11}, Lcom/daaw/avee/Common/Interpolate;->Lerp(FFD)F

    move-result v1

    .line 352
    new-instance v2, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v2, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object v2

    :cond_17
    const-string v8, "BeatCamShakeRotMore"

    .line 353
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_19

    .line 354
    iget-object v1, v0, Lcom/daaw/avee/Design/VisualizerDesign$10;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-virtual {v1}, Lcom/daaw/avee/Design/VisualizerDesign;->isPlaying()Z

    move-result v1

    if-eqz v1, :cond_18

    iget v1, v3, Lcom/daaw/avee/comp/Common/MeterOutputData;->frameDataRmsValue:F

    mul-float v1, v1, v12

    goto :goto_5

    :cond_18
    const/4 v1, 0x0

    .line 355
    :goto_5
    invoke-static {v1, v9}, Ljava/lang/Math;->min(FF)F

    move-result v1

    .line 356
    invoke-static {v1, v6}, Ljava/lang/Math;->max(FF)F

    move-result v1

    mul-float v1, v1, v1

    .line 359
    iget-object v3, v0, Lcom/daaw/avee/Design/VisualizerDesign$10;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {v3}, Lcom/daaw/avee/Design/VisualizerDesign;->access$1200(Lcom/daaw/avee/Design/VisualizerDesign;)Lcom/daaw/avee/Design/HandheldMotion;

    move-result-object v3

    mul-float v5, v5, v14

    iget v4, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v5, v5, v4

    rem-float/2addr v5, v9

    invoke-virtual {v3, v5}, Lcom/daaw/avee/Design/HandheldMotion;->getRot(F)F

    move-result v3

    float-to-double v3, v3

    .line 360
    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v3, v15

    double-to-float v3, v3

    .line 361
    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v3, v3, v2

    mul-float v3, v3, v14

    mul-float v3, v3, v1

    .line 362
    iget v1, v7, Lcom/daaw/avee/Common/Vec2f;->x:F

    const-wide v4, 0x3fe99999a0000000L    # 0.800000011920929

    invoke-static {v1, v3, v4, v5}, Lcom/daaw/avee/Common/Interpolate;->Lerp(FFD)F

    move-result v1

    .line 364
    new-instance v2, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v2, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object v2

    :cond_19
    const-string v8, "BeatCamShakeRotLess"

    .line 365
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1b

    .line 366
    iget-object v1, v0, Lcom/daaw/avee/Design/VisualizerDesign$10;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-virtual {v1}, Lcom/daaw/avee/Design/VisualizerDesign;->isPlaying()Z

    move-result v1

    if-eqz v1, :cond_1a

    iget v1, v3, Lcom/daaw/avee/comp/Common/MeterOutputData;->frameDataRmsValue:F

    mul-float v1, v1, v12

    goto :goto_6

    :cond_1a
    const/4 v1, 0x0

    .line 367
    :goto_6
    invoke-static {v1, v9}, Ljava/lang/Math;->min(FF)F

    move-result v1

    .line 368
    invoke-static {v1, v6}, Ljava/lang/Math;->max(FF)F

    move-result v1

    mul-float v1, v1, v1

    .line 371
    iget-object v3, v0, Lcom/daaw/avee/Design/VisualizerDesign$10;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {v3}, Lcom/daaw/avee/Design/VisualizerDesign;->access$1300(Lcom/daaw/avee/Design/VisualizerDesign;)Lcom/daaw/avee/Design/HandheldMotion;

    move-result-object v3

    mul-float v5, v5, v14

    iget v4, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v5, v5, v4

    rem-float/2addr v5, v9

    invoke-virtual {v3, v5}, Lcom/daaw/avee/Design/HandheldMotion;->getRot(F)F

    move-result v3

    float-to-double v3, v3

    .line 372
    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v3, v15

    double-to-float v3, v3

    .line 373
    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v3, v3, v2

    mul-float v3, v3, v14

    mul-float v3, v3, v1

    .line 374
    iget v1, v7, Lcom/daaw/avee/Common/Vec2f;->x:F

    const-wide v4, 0x3fe99999a0000000L    # 0.800000011920929

    invoke-static {v1, v3, v4, v5}, Lcom/daaw/avee/Common/Interpolate;->Lerp(FFD)F

    move-result v1

    .line 376
    new-instance v2, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v2, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object v2

    :cond_1b
    const-string v5, "PeakBarIndex"

    .line 377
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1c

    .line 379
    iget v1, v3, Lcom/daaw/avee/comp/Common/MeterOutputData;->peakBarIndex:F

    iget v3, v7, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    float-to-double v4, v4

    invoke-static {v1, v3, v4, v5}, Lcom/daaw/avee/Common/Interpolate;->Lerp(FFD)F

    move-result v1

    .line 380
    new-instance v3, Lcom/daaw/avee/Common/Vec2f;

    iget v4, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v4, v4, v1

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v1, v1, v2

    invoke-direct {v3, v4, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object v3

    :cond_1c
    const-string v5, "BeatTriggerAnim"

    .line 381
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1f

    .line 385
    iget-object v1, v0, Lcom/daaw/avee/Design/VisualizerDesign$10;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-virtual {v1}, Lcom/daaw/avee/Design/VisualizerDesign;->isPlaying()Z

    move-result v1

    if-eqz v1, :cond_1d

    iget v1, v3, Lcom/daaw/avee/comp/Common/MeterOutputData;->frameDataRmsValue:F

    iget v3, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    cmpl-float v1, v1, v3

    if-lez v1, :cond_1d

    iget v1, v7, Lcom/daaw/avee/Common/Vec2f;->y:F

    const v3, 0x3fffffff    # 1.9999999f

    cmpl-float v1, v1, v3

    if-ltz v1, :cond_1d

    .line 387
    iput v6, v7, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 388
    iput v6, v7, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 391
    :cond_1d
    iget v1, v7, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v3, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v3, v3, v4

    add-float/2addr v1, v3

    const v3, 0x3efffffd    # 0.4999999f

    cmpl-float v3, v1, v3

    if-ltz v3, :cond_1e

    .line 403
    iget v1, v7, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v4, v4, v2

    add-float v6, v1, v4

    goto :goto_7

    :cond_1e
    move v14, v1

    .line 410
    :goto_7
    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v1, v14, v6}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    return-object v1

    :cond_1f
    return-object v7
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 251
    check-cast p1, Ljava/lang/String;

    check-cast p2, Lcom/daaw/avee/Common/Vec2f;

    check-cast p3, Lcom/daaw/avee/Common/Vec2f;

    check-cast p4, Lcom/daaw/avee/comp/Common/MeterOutputData;

    check-cast p5, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/avee/Design/VisualizerDesign$10;->invoke(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Common/MeterOutputData;Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object p1

    return-object p1
.end method
