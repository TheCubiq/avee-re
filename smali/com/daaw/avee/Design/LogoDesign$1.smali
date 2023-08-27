.class Lcom/daaw/avee/Design/LogoDesign$1;
.super Ljava/lang/Object;
.source "LogoDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/LogoDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/LogoDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/LogoDesign;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/daaw/avee/Design/LogoDesign$1;->this$0:Lcom/daaw/avee/Design/LogoDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V
    .locals 2

    .line 44
    iget-object v0, p0, Lcom/daaw/avee/Design/LogoDesign$1;->this$0:Lcom/daaw/avee/Design/LogoDesign;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lcom/daaw/avee/Design/LogoDesign;->access$002(Lcom/daaw/avee/Design/LogoDesign;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 41
    check-cast p1, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/LogoDesign$1;->invoke(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V

    return-void
.end method
