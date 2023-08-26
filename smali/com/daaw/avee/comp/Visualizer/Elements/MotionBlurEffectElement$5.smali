.class Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement$5;
.super Ljava/lang/Object;
.source "MotionBlurEffectElement.java"

# interfaces
.implements Lcom/daaw/avee/Common/Action3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Action3<",
        "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
        "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;",
        "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;)V
    .locals 0

    .line 396
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement$5;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 5

    .line 400
    invoke-virtual {p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->getTexturePrimary()Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object p3

    .line 402
    invoke-interface {p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    div-float v0, v1, v0

    .line 403
    invoke-interface {p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->getHeight()I

    move-result p3

    int-to-float p3, p3

    div-float/2addr v1, p3

    .line 405
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement$5;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;

    iget-object p3, p3, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-virtual {p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->getObj()[F

    move-result-object p3

    const-string v2, "u_projView"

    const/4 v3, 0x0

    invoke-virtual {p2, v2, v3, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformMatrix(Ljava/lang/String;Z[F)V

    .line 409
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement$5;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;

    invoke-static {p3}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->access$100(Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object p3

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getValueAsFloat(Lcom/daaw/avee/comp/Visualizer/Meter;)F

    move-result p1

    .line 412
    new-instance p3, Lcom/daaw/avee/Common/Vec2f;

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement$5;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;

    invoke-static {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->access$200(Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;)F

    move-result v2

    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement$5;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;

    invoke-static {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->access$300(Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;)F

    move-result v3

    invoke-direct {p3, v2, v3}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 414
    iget v2, p3, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v2, v2, p1

    mul-float v2, v2, v0

    iput v2, p3, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 415
    iget v2, p3, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v2, v2, p1

    mul-float v2, v2, v1

    iput v2, p3, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 420
    invoke-virtual {p3}, Lcom/daaw/avee/Common/Vec2f;->length()F

    move-result v2

    const/high16 v3, 0x40800000    # 4.0f

    cmpl-float v2, v2, v3

    if-lez v2, :cond_0

    .line 422
    invoke-virtual {p3}, Lcom/daaw/avee/Common/Vec2f;->normalize()Lcom/daaw/avee/Common/Vec2f;

    .line 423
    iget v2, p3, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v2, v2, v3

    iput v2, p3, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 424
    iget v2, p3, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v2, v2, v3

    iput v2, p3, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 426
    :cond_0
    iget v2, p3, Lcom/daaw/avee/Common/Vec2f;->x:F

    neg-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    mul-float v2, v2, v3

    iget p3, p3, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float p3, p3, v3

    const-string v4, "posAmount"

    invoke-virtual {p2, v4, v2, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;FF)V

    .line 430
    new-instance p3, Lcom/daaw/avee/Common/Vec2f;

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement$5;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;

    invoke-static {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->access$400(Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;)F

    move-result v2

    iget-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement$5;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;

    invoke-static {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;->access$500(Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement;)F

    move-result v4

    invoke-direct {p3, v2, v4}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 432
    iget v2, p3, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float v2, v2, p1

    mul-float v2, v2, v0

    iput v2, p3, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 433
    iget v0, p3, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v0, v0, p1

    mul-float v0, v0, v1

    iput v0, p3, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 441
    iget p1, p3, Lcom/daaw/avee/Common/Vec2f;->x:F

    neg-float p1, p1

    mul-float p1, p1, v3

    iget p3, p3, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float p3, p3, v3

    const-string v0, "scaleAmount"

    invoke-virtual {p2, v0, p1, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;FF)V

    return-void
.end method

.method public bridge synthetic onInvoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 396
    check-cast p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    check-cast p2, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    check-cast p3, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/MotionBlurEffectElement$5;->onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    return-void
.end method
