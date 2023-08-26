.class Lcom/daaw/avee/Design/VisualizerDesign$32;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Landroid/view/SurfaceHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 869
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$32;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Landroid/view/SurfaceHolder;)V
    .locals 2

    .line 872
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerDesign$32;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lcom/daaw/avee/Design/VisualizerDesign;->access$202(Lcom/daaw/avee/Design/VisualizerDesign;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;

    .line 874
    sget-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->setVideoSurfaceHolder:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->invoke(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 869
    check-cast p1, Landroid/view/SurfaceHolder;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/VisualizerDesign$32;->invoke(Landroid/view/SurfaceHolder;)V

    return-void
.end method
