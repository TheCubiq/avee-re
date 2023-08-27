.class Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement$5;
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

    .line 620
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement$5;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 6

    .line 625
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement$5;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->access$100(Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;)F

    move-result p1

    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement$5;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;

    iget p3, p3, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->currentVerticalBlurV2ResultHeight:I

    int-to-float p3, p3

    div-float/2addr p1, p3

    const-string p3, "blurH"

    invoke-virtual {p2, p3, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    const/4 p1, 0x4

    new-array p1, p1, [F

    .line 628
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement$5;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;

    invoke-static {p3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->access$200(Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;)I

    move-result p3

    invoke-static {p1, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->intColorToF4Color([FI)V

    const/4 p3, 0x0

    .line 629
    aget v2, p1, p3

    const/4 p3, 0x1

    aget v3, p1, p3

    const/4 p3, 0x2

    aget v4, p1, p3

    const/4 p3, 0x3

    aget v5, p1, p3

    const-string v1, "Color2"

    move-object v0, p2

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;FFFF)V

    .line 631
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement$5;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;

    iget p1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->currentVerticalBlurV2ResultWidth:I

    int-to-float p1, p1

    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement$5;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;

    iget p3, p3, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->currentVerticalBlurV2ResultHeight:I

    int-to-float p3, p3

    const-string v0, "resolution"

    invoke-virtual {p2, v0, p1, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;FF)V

    return-void
.end method

.method public bridge synthetic onInvoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 620
    check-cast p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    check-cast p2, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    check-cast p3, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement$5;->onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    return-void
.end method
