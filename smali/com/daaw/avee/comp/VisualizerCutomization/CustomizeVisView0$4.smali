.class Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$4;
.super Ljava/lang/Object;
.source "CustomizeVisView0.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->onCreatedView0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;Landroid/app/Activity;[Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;

.field final synthetic val$availableElementTypeNamesToAdd:[Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;[Ljava/lang/String;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$4;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$4;->val$availableElementTypeNamesToAdd:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 105
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 107
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$4;->val$availableElementTypeNamesToAdd:[Ljava/lang/String;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 108
    aget-object v8, v1, v0

    .line 109
    sget-object v3, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onAddElementAction:Lcom/daaw/avee/Common/Events/WeakEvent5;

    new-instance v4, Lcom/daaw/avee/ContextData;

    invoke-direct {v4, p1}, Lcom/daaw/avee/ContextData;-><init>(Landroid/view/View;)V

    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$4;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;

    invoke-static {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->access$400(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    move-result-object p1

    iget p1, p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->rootIdentifier:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$4;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;

    iget p1, p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->selectedElementInTree:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$4;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;

    invoke-static {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->access$400(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    move-result-object p1

    iget-object v7, p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->customizationScene:Lcom/daaw/avee/comp/Visualizer/CustomScene;

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/avee/Common/Events/WeakEvent5;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
