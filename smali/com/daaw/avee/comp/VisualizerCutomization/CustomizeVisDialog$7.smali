.class Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$7;
.super Ljava/lang/Object;
.source "CustomizeVisDialog.java"

# interfaces
.implements Lcom/daaw/avee/Common/Action;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onPropertyChanged()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;)V
    .locals 0

    .line 593
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$7;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke()V
    .locals 5

    .line 596
    sget-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onCustomizationChanged:Lcom/daaw/avee/Common/Events/WeakEvent4;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$7;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iget v1, v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->rootIdentifier:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$7;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iget-object v2, v2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->customizationScene:Lcom/daaw/avee/comp/Visualizer/CustomScene;

    iget-object v3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$7;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-static {v3}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->access$200(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/daaw/avee/Common/Events/WeakEvent4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
