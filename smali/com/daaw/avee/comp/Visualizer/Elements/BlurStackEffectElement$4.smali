.class Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement$4;
.super Ljava/lang/Object;
.source "BlurStackEffectElement.java"

# interfaces
.implements Lcom/daaw/avee/Common/Action3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;
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
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;)V
    .locals 0

    .line 343
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement$4;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 8

    .line 346
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement$4;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->access$100(Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;)Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->getObj()[F

    move-result-object p1

    const/4 v0, 0x0

    const-string v1, "u_projView"

    invoke-virtual {p2, v1, v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformMatrix(Ljava/lang/String;Z[F)V

    const/4 p1, 0x4

    new-array p1, p1, [F

    .line 350
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement$4;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;

    invoke-static {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;->access$200(Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement;)I

    move-result v1

    invoke-static {p1, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToF4Color([FI)V

    .line 351
    aget v4, p1, v0

    const/4 v1, 0x1

    aget v5, p1, v1

    const/4 v2, 0x2

    aget v6, p1, v2

    const/4 v2, 0x3

    aget v7, p1, v2

    const-string v3, "Color2"

    move-object v2, p2

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;FFFF)V

    const/high16 p1, 0x3f800000    # 1.0f

    const-string v2, "saturation"

    .line 352
    invoke-virtual {p2, v2, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    const/4 v2, 0x0

    const-string v3, "maskadd"

    .line 354
    invoke-virtual {p2, v3, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    const-string v3, "maskmul"

    .line 355
    invoke-virtual {p2, v3, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    const-string v3, "mask_l_add"

    .line 357
    invoke-virtual {p2, v3, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    const-string v3, "mask_l_mul"

    .line 358
    invoke-virtual {p2, v3, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 360
    invoke-virtual {p3, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->getTextureIsFlipped(I)Z

    move-result v0

    invoke-virtual {p3, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->getTextureIsFlipped(I)Z

    move-result p3

    const-string v1, "tex2_y_mul"

    const-string v3, "tex2_y_add"

    if-ne v0, p3, :cond_0

    .line 361
    invoke-virtual {p2, v3, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 362
    invoke-virtual {p2, v1, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    goto :goto_0

    .line 364
    :cond_0
    invoke-virtual {p2, v3, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    const/high16 p1, -0x40800000    # -1.0f

    .line 365
    invoke-virtual {p2, v1, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    :goto_0
    return-void
.end method

.method public bridge synthetic onInvoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 343
    check-cast p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    check-cast p2, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    check-cast p3, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurStackEffectElement$4;->onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    return-void
.end method
