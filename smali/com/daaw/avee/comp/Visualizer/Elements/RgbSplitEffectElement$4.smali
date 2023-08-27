.class Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$4;
.super Ljava/lang/Object;
.source "RgbSplitEffectElement.java"

# interfaces
.implements Lcom/daaw/avee/Common/Action2;


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
        "Lcom/daaw/avee/Common/Action2<",
        "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
        "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)V
    .locals 0

    .line 353
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$4;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic onInvoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 353
    check-cast p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    check-cast p2, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$4;->onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)V

    return-void
.end method
