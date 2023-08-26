.class Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$7;
.super Ljava/lang/Object;
.source "CustomizeVisView0.java"

# interfaces
.implements Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnDraggingListener;


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

.field final synthetic val$dragSortRecycler:Lcom/emtronics/dragsortrecycler/DragSortRecycler;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;Lcom/emtronics/dragsortrecycler/DragSortRecycler;)V
    .locals 0

    .line 247
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$7;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$7;->val$dragSortRecycler:Lcom/emtronics/dragsortrecycler/DragSortRecycler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onStartDragging(Landroid/view/View;)V
    .locals 1

    .line 250
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$7;->val$dragSortRecycler:Lcom/emtronics/dragsortrecycler/DragSortRecycler;

    invoke-virtual {v0, p1}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->StartDragging(Landroid/view/View;)V

    return-void
.end method
