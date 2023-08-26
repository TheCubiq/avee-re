.class Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement$5;
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

    .line 501
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement$5;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 1

    .line 505
    invoke-virtual {p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->getTexturePrimary()Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object p1

    .line 506
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement$5;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;

    invoke-static {p3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;->access$100(Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement;)F

    move-result p3

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p3, v0

    const/high16 v0, 0x40000000    # 2.0f

    mul-float p3, p3, v0

    const-string v0, "blurW"

    invoke-virtual {p2, v0, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 512
    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->getWidth()I

    move-result p1

    int-to-float p1, p1

    const-string p3, "resolutionH"

    invoke-virtual {p2, p3, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    return-void
.end method

.method public bridge synthetic onInvoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 501
    check-cast p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    check-cast p2, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    check-cast p3, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurKernelEffectElement$5;->onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    return-void
.end method
