.class Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$3;
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

.field final synthetic val$activity:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;Landroid/app/Activity;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$3;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$3;->val$activity:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 93
    sget-object p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onResetAction:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v0, Lcom/daaw/avee/ContextData;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$3;->val$activity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lcom/daaw/avee/ContextData;-><init>(Landroid/app/Activity;)V

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$3;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;

    invoke-static {v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->access$400(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    move-result-object v1

    iget v1, v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->rootIdentifier:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$3;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;

    invoke-static {v2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->access$400(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    move-result-object v2

    iget-object v2, v2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->customizationScene:Lcom/daaw/avee/comp/Visualizer/CustomScene;

    invoke-virtual {p1, v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
