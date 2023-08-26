.class Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement$2;
.super Ljava/lang/Object;
.source "BlurEffectElement.java"

# interfaces
.implements Lcom/daaw/avee/Common/Action3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;
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
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;)V
    .locals 0

    .line 255
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement$2;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 8

    .line 259
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getVPMatrix()[F

    move-result-object p1

    const/4 v0, 0x0

    const-string v1, "u_projView"

    invoke-virtual {p2, v1, v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformMatrix(Ljava/lang/String;Z[F)V

    const-string v3, "Color2"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    move-object v2, p2

    .line 261
    invoke-virtual/range {v2 .. v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;FFFF)V

    const/high16 p1, 0x3f800000    # 1.0f

    const-string v1, "saturation"

    .line 262
    invoke-virtual {p2, v1, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    const-string v1, "maskadd"

    .line 264
    invoke-virtual {p2, v1, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    const/high16 v1, -0x40800000    # -1.0f

    const-string v2, "maskmul"

    .line 265
    invoke-virtual {p2, v2, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    const-string v2, "mask_l_add"

    .line 268
    invoke-virtual {p2, v2, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    const/4 v2, 0x0

    const-string v3, "mask_l_mul"

    .line 269
    invoke-virtual {p2, v3, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 271
    invoke-virtual {p3, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->getTextureIsFlipped(I)Z

    move-result v0

    const/4 v3, 0x1

    invoke-virtual {p3, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->getTextureIsFlipped(I)Z

    move-result p3

    const-string v3, "tex2_y_mul"

    const-string v4, "tex2_y_add"

    if-ne v0, p3, :cond_0

    .line 272
    invoke-virtual {p2, v4, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 273
    invoke-virtual {p2, v3, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    goto :goto_0

    .line 275
    :cond_0
    invoke-virtual {p2, v4, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 276
    invoke-virtual {p2, v3, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    :goto_0
    return-void
.end method

.method public bridge synthetic onInvoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 255
    check-cast p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    check-cast p2, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    check-cast p3, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement$2;->onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    return-void
.end method
