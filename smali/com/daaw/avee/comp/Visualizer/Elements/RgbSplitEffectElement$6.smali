.class Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$6;
.super Ljava/lang/Object;
.source "RgbSplitEffectElement.java"

# interfaces
.implements Lcom/daaw/avee/Common/Action3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;
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
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)V
    .locals 0

    .line 371
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$6;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 5

    .line 374
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$6;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;

    iget-object p3, p3, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-virtual {p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->getObj()[F

    move-result-object p3

    const/4 v0, 0x0

    const-string v1, "u_projView"

    invoke-virtual {p2, v1, v0, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformMatrix(Ljava/lang/String;Z[F)V

    .line 376
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$6;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;

    invoke-static {p3}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->access$100(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object p3

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v1

    invoke-virtual {p3, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getValueAsFloat(Lcom/daaw/avee/comp/Visualizer/Meter;)F

    move-result p3

    .line 377
    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 378
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$6;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;

    invoke-static {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->access$200(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v2

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object p1

    invoke-virtual {v2, p1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getValueAsVec2f(Lcom/daaw/avee/comp/Visualizer/Meter;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;

    .line 380
    iget p1, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    mul-float p1, p1, p3

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    mul-float v1, v1, p3

    const-string p3, "dirAmount"

    invoke-virtual {p2, p3, p1, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;FF)V

    .line 388
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$6;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->access$300(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)[F

    move-result-object p1

    aget p1, p1, v0

    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$6;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;

    invoke-static {p3}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->access$300(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)[F

    move-result-object p3

    const/4 v1, 0x1

    aget p3, p3, v1

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$6;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;

    invoke-static {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->access$300(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)[F

    move-result-object v2

    const/4 v3, 0x2

    aget v2, v2, v3

    const-string v4, "splitColor0"

    invoke-virtual {p2, v4, p1, p3, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;FFF)V

    .line 389
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$6;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->access$400(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)[F

    move-result-object p1

    aget p1, p1, v0

    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$6;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;

    invoke-static {p3}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->access$400(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)[F

    move-result-object p3

    aget p3, p3, v1

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$6;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;

    invoke-static {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->access$400(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)[F

    move-result-object v2

    aget v2, v2, v3

    const-string v4, "splitColor1"

    invoke-virtual {p2, v4, p1, p3, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;FFF)V

    .line 390
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$6;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->access$500(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)[F

    move-result-object p1

    aget p1, p1, v0

    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$6;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;

    invoke-static {p3}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->access$500(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)[F

    move-result-object p3

    aget p3, p3, v1

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$6;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->access$500(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)[F

    move-result-object v0

    aget v0, v0, v3

    const-string v1, "splitColor2"

    invoke-virtual {p2, v1, p1, p3, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;FFF)V

    return-void
.end method

.method public bridge synthetic onInvoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 371
    check-cast p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    check-cast p2, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    check-cast p3, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$6;->onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    return-void
.end method
