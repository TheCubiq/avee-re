.class Lcom/daaw/avee/Design/VisualizerDesign$30;
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
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 838
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$30;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Float;
    .locals 2

    .line 841
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerDesign$30;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/VisualizerDesign;->access$300(Lcom/daaw/avee/Design/VisualizerDesign;)F

    move-result v1

    invoke-static {v0, v1}, Lcom/daaw/avee/Design/VisualizerDesign;->access$400(Lcom/daaw/avee/Design/VisualizerDesign;F)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 838
    invoke-virtual {p0}, Lcom/daaw/avee/Design/VisualizerDesign$30;->invoke()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
