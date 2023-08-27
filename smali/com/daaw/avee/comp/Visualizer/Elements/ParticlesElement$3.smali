.class Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;
.super Ljava/lang/Object;
.source "ParticlesElement.java"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->update(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;Landroid/graphics/RectF;FLcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Lcom/daaw/avee/Common/Vec2f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Func/Func3<",
        "Ljava/lang/Integer;",
        "[F[I",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

.field final synthetic val$areaCenterPersp:Lcom/daaw/avee/Common/Vec2f;

.field final synthetic val$drawRect:Landroid/graphics/RectF;

.field final synthetic val$nearCameraFadeOutDistanceSafe:F

.field final synthetic val$renderData:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

.field final synthetic val$scaleFactor:F

.field final synthetic val$totalOverallScale:F

.field final synthetic val$totalOverallSpeed:F

.field final synthetic val$trailLengthScaled:F


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;Landroid/graphics/RectF;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;FFFFLcom/daaw/avee/Common/Vec2f;F)V
    .locals 0

    .line 614
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->val$drawRect:Landroid/graphics/RectF;

    iput-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->val$renderData:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    iput p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->val$scaleFactor:F

    iput p5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->val$totalOverallScale:F

    iput p6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->val$totalOverallSpeed:F

    iput p7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->val$trailLengthScaled:F

    iput-object p8, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->val$areaCenterPersp:Lcom/daaw/avee/Common/Vec2f;

    iput p9, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->val$nearCameraFadeOutDistanceSafe:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public Invoke(Ljava/lang/Integer;[F[I)Ljava/lang/Boolean;
    .locals 17

    move-object/from16 v0, p0

    .line 619
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-static {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->access$100(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    aget-object v1, v1, v2

    invoke-interface {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;->getAlive()Z

    move-result v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    if-nez v1, :cond_0

    return-object v3

    :cond_0
    const/4 v1, 0x0

    .line 622
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-static {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->access$200(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IForceField;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 623
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-static {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->access$100(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    aget-object v1, v1, v4

    invoke-interface {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;->getPosition()Lcom/daaw/avee/Common/Vec3f;

    move-result-object v1

    .line 624
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-static {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->access$200(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IForceField;

    move-result-object v4

    iget v5, v1, Lcom/daaw/avee/Common/Vec3f;->x:F

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->val$drawRect:Landroid/graphics/RectF;

    invoke-virtual {v6}, Landroid/graphics/RectF;->centerX()F

    move-result v6

    sub-float/2addr v5, v6

    iget v1, v1, Lcom/daaw/avee/Common/Vec3f;->y:F

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->val$drawRect:Landroid/graphics/RectF;

    invoke-virtual {v6}, Landroid/graphics/RectF;->centerY()F

    move-result v6

    sub-float/2addr v1, v6

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-static {v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->access$300(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v6

    invoke-interface {v4, v5, v1, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IForceField;->getVelocityAndFactor(FFLcom/daaw/avee/Common/Vec2f;)F

    move-result v1

    move v12, v1

    goto :goto_0

    :cond_1
    const/4 v12, 0x0

    .line 627
    :goto_0
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-static {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->access$100(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    aget-object v4, v1, v4

    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->val$renderData:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    .line 628
    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getFrameTimeSmooth()F

    move-result v5

    iget v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->val$scaleFactor:F

    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    .line 630
    invoke-static {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->access$400(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v7

    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    .line 631
    invoke-static {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->access$500(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v8

    iget v9, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->val$totalOverallScale:F

    iget v10, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->val$totalOverallSpeed:F

    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    .line 634
    invoke-static {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->access$300(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v11

    iget v13, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->val$trailLengthScaled:F

    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->val$areaCenterPersp:Lcom/daaw/avee/Common/Vec2f;

    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    iget-object v15, v1, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->vpMat:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    iget v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->val$nearCameraFadeOutDistanceSafe:F

    move/from16 v16, v1

    .line 627
    invoke-interface/range {v4 .. v16}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;->update(FFLcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;FFLcom/daaw/avee/Common/Vec2f;FFLcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;F)Z

    move-result v1

    if-nez v1, :cond_2

    return-object v3

    .line 642
    :cond_2
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-static {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->access$500(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v1

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-static {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->access$500(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v4

    iget v4, v4, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-static {v1, v4}, Ljava/lang/Math;->max(FF)F

    move-result v1

    .line 644
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->val$renderData:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-static {v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->access$400(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v5

    invoke-virtual {v4, v5, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->isVisibleOnScreen(Lcom/daaw/avee/Common/Vec2f;F)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 646
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-static {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->access$100(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aget-object v1, v1, v3

    const/4 v3, 0x1

    invoke-interface {v1, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;->setVisible(Z)V

    .line 647
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-static {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->access$100(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    aget-object v1, v1, v4

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->val$renderData:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    invoke-virtual {v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getFrameTimeSmooth()F

    move-result v4

    invoke-interface {v1, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;->updateVisible(F)V

    .line 649
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-static {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->access$600(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)[F

    move-result-object v1

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-static {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->access$100(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    aget-object v4, v4, v5

    invoke-interface {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;->getColorArgb()[F

    move-result-object v4

    iget-object v5, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    iget-object v5, v5, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->colorRgbaTmp0:[F

    invoke-static {v1, v4, v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->f4ColorMultiply([F[F[F)V

    .line 650
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-static {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->access$600(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)[F

    move-result-object v1

    invoke-static {v1, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->f4ColorToIntColorRgba([FI)I

    move-result v1

    aput v1, p3, v2

    .line 651
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-static {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->access$100(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    aget-object v1, v1, v2

    invoke-interface {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;->getPosition()Lcom/daaw/avee/Common/Vec3f;

    move-result-object v1

    .line 652
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-static {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->access$100(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    aget-object v5, v2, v5

    iget v6, v1, Lcom/daaw/avee/Common/Vec3f;->x:F

    iget v7, v1, Lcom/daaw/avee/Common/Vec3f;->y:F

    iget v8, v1, Lcom/daaw/avee/Common/Vec3f;->z:F

    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-static {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->access$100(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    aget-object v1, v1, v2

    invoke-interface {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;->getRot()F

    move-result v9

    move-object/from16 v10, p2

    invoke-virtual/range {v4 .. v10}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->renderParticle(Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;FFFF[F)V

    .line 653
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    .line 655
    :cond_3
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-static {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->access$100(Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;)[Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    aget-object v1, v1, v4

    invoke-interface {v1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IParticle;->setVisible(Z)V

    return-object v3
.end method

.method public bridge synthetic Invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 614
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, [F

    check-cast p3, [I

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement$3;->Invoke(Ljava/lang/Integer;[F[I)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
