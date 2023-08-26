.class Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$2;
.super Ljava/lang/Object;
.source "CustomizeVisDialog.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent2$Handler<",
        "Ljava/lang/Integer;",
        "Lcom/daaw/avee/comp/Visualizer/CustomScene;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;)V
    .locals 0

    .line 248
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$2;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Integer;Lcom/daaw/avee/comp/Visualizer/CustomScene;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 248
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Lcom/daaw/avee/comp/Visualizer/CustomScene;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$2;->invoke(Ljava/lang/Integer;Lcom/daaw/avee/comp/Visualizer/CustomScene;)V

    return-void
.end method
