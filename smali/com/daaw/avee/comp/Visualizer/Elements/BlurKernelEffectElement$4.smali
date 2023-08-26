.class Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement$4;
.super Ljava/lang/Object;
.source "BlurKernelEffectElement.java"

# interfaces
.implements Lcom/daaw/avee/Common/Action3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;
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
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;)V
    .locals 0

    .line 303
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement$4;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 7

    .line 307
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getVPMatrix()[F

    move-result-object p1

    const/4 v0, 0x0

    const-string v1, "u_projView"

    invoke-virtual {p2, v1, v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformMatrix(Ljava/lang/String;Z[F)V

    .line 309
    invoke-virtual {p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->getTexturePrimary()Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object p1

    .line 310
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement$4;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;

    invoke-static {p3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->access$100(Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;)F

    move-result p3

    const-string v1, "radius"

    invoke-virtual {p2, v1, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 311
    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->getWidth()I

    move-result p3

    int-to-float p3, p3

    const-string v1, "resolutionW"

    invoke-virtual {p2, v1, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 312
    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->getHeight()I

    move-result p1

    int-to-float p1, p1

    const-string p3, "resolutionH"

    invoke-virtual {p2, p3, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    const/4 p1, 0x4

    new-array p1, p1, [F

    .line 314
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement$4;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;

    invoke-static {p3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->access$200(Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;)I

    move-result p3

    invoke-static {p1, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToF4Color([FI)V

    .line 315
    aget v3, p1, v0

    const/4 p3, 0x1

    aget v4, p1, p3

    const/4 p3, 0x2

    aget v5, p1, p3

    const/4 p3, 0x3

    aget v6, p1, p3

    const-string v2, "Color2"

    move-object v1, p2

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;FFFF)V

    return-void
.end method

.method public bridge synthetic onInvoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 303
    check-cast p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    check-cast p2, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    check-cast p3, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement$4;->onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    return-void
.end method
