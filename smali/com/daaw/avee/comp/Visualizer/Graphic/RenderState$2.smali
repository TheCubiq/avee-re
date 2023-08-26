.class Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$2;
.super Ljava/lang/Object;
.source "RenderState.java"

# interfaces
.implements Lcom/daaw/avee/Common/Action2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->onFrameStart(III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Action2<",
        "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
        "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 0

    .line 311
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$2;->this$0:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)V
    .locals 1

    const-string p1, "u_texture"

    const/4 v0, 0x0

    .line 314
    invoke-virtual {p2, p1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformi(Ljava/lang/String;I)V

    return-void
.end method

.method public bridge synthetic onInvoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 311
    check-cast p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    check-cast p2, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$2;->onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)V

    return-void
.end method
