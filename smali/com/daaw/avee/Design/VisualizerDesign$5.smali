.class Lcom/daaw/avee/Design/VisualizerDesign$5;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent3$Handler<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$5;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;)V
    .locals 0

    .line 169
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$5;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-static {p1, p2}, Lcom/daaw/avee/Design/VisualizerDesign;->access$302(Lcom/daaw/avee/Design/VisualizerDesign;F)F

    .line 171
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$5;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerDesign;->access$500(Lcom/daaw/avee/Design/VisualizerDesign;)Landroid/os/Handler;

    move-result-object p1

    new-instance p2, Lcom/daaw/avee/Design/VisualizerDesign$5$1;

    invoke-direct {p2, p0}, Lcom/daaw/avee/Design/VisualizerDesign$5$1;-><init>(Lcom/daaw/avee/Design/VisualizerDesign$5;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 166
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Ljava/lang/Float;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/VisualizerDesign$5;->invoke(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;)V

    return-void
.end method
