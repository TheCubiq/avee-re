.class Lcom/daaw/avee/Design/VisualizerDesign$35;
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
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 911
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$35;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Boolean;)V
    .locals 1

    .line 914
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerDesign$35;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, p1}, Lcom/daaw/avee/Design/VisualizerDesign;->access$1502(Lcom/daaw/avee/Design/VisualizerDesign;Z)Z

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 911
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/VisualizerDesign$35;->invoke(Ljava/lang/Boolean;)V

    return-void
.end method
