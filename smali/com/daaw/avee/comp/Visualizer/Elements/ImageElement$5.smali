.class Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$5;
.super Ljava/lang/Object;
.source "ImageElement.java"

# interfaces
.implements Lcom/daaw/avee/Common/Action3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;
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
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;)V
    .locals 0

    .line 463
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$5;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 10

    .line 466
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$5;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->access$600(Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;)Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->getObj()[F

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "u_projView"

    invoke-virtual {p2, v2, v1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformMatrix(Ljava/lang/String;Z[F)V

    const-string v4, "Color2"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    move-object v3, p2

    .line 468
    invoke-virtual/range {v3 .. v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;FFFF)V

    .line 470
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$5;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->access$700(Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getValueAsFloat(Lcom/daaw/avee/comp/Visualizer/Meter;)F

    move-result p1

    const-string v0, "saturation"

    .line 471
    invoke-virtual {p2, v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 473
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$5;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->access$800(Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;)I

    move-result p1

    const/4 v0, 0x1

    const/high16 v2, -0x40800000    # -1.0f

    const-string v3, "mask_l_mul"

    const-string v4, "mask_l_add"

    const-string v5, "maskmul"

    const-string v6, "maskadd"

    if-ne p1, v0, :cond_0

    .line 476
    invoke-virtual {p2, v6, v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 477
    invoke-virtual {p2, v5, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 480
    invoke-virtual {p2, v4, v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 481
    invoke-virtual {p2, v3, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    goto :goto_0

    .line 482
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$5;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->access$800(Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;)I

    move-result p1

    const/4 v9, 0x2

    if-ne p1, v9, :cond_1

    .line 485
    invoke-virtual {p2, v6, v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 486
    invoke-virtual {p2, v5, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 489
    invoke-virtual {p2, v4, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 490
    invoke-virtual {p2, v3, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    goto :goto_0

    .line 491
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$5;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->access$800(Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;)I

    move-result p1

    const/4 v9, 0x3

    if-ne p1, v9, :cond_2

    .line 494
    invoke-virtual {p2, v6, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 495
    invoke-virtual {p2, v5, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 498
    invoke-virtual {p2, v4, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 499
    invoke-virtual {p2, v3, v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    goto :goto_0

    .line 503
    :cond_2
    invoke-virtual {p2, v6, v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 504
    invoke-virtual {p2, v5, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 507
    invoke-virtual {p2, v4, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 508
    invoke-virtual {p2, v3, v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 512
    :goto_0
    invoke-virtual {p3, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->getTextureIsFlipped(I)Z

    move-result p1

    invoke-virtual {p3, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->getTextureIsFlipped(I)Z

    move-result p3

    const-string v0, "tex2_y_mul"

    const-string v1, "tex2_y_add"

    if-ne p1, p3, :cond_3

    .line 513
    invoke-virtual {p2, v1, v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 514
    invoke-virtual {p2, v0, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    goto :goto_1

    .line 516
    :cond_3
    invoke-virtual {p2, v1, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 517
    invoke-virtual {p2, v0, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    :goto_1
    return-void
.end method

.method public bridge synthetic onInvoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 463
    check-cast p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    check-cast p2, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    check-cast p3, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement$5;->onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    return-void
.end method
