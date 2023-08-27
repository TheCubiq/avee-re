.class Lcom/daaw/avee/Design/VisualizerDesign$4;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEventR$Handler<",
        "Landroid/view/SurfaceHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$4;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Landroid/view/SurfaceHolder;
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerDesign$4;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/VisualizerDesign;->access$200(Lcom/daaw/avee/Design/VisualizerDesign;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/SurfaceHolder;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 160
    invoke-virtual {p0}, Lcom/daaw/avee/Design/VisualizerDesign$4;->invoke()Landroid/view/SurfaceHolder;

    move-result-object v0

    return-object v0
.end method
