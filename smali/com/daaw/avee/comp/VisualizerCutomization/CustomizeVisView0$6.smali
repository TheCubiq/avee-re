.class Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$6;
.super Ljava/lang/Object;
.source "CustomizeVisView0.java"

# interfaces
.implements Lcom/emtronics/dragsortrecycler/DragSortRecycler$OnItemMovedListener;


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


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)V
    .locals 0

    .line 195
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$6;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemMoved(II)V
    .locals 4

    const/4 v0, 0x1

    .line 199
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 200
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$6;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;

    invoke-static {v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->access$500(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v0

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    if-ne p1, p2, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 204
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$6;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;

    iget v2, v2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->selectedElementInTree:I

    if-ltz v2, :cond_1

    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$6;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;

    iget v2, v2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->selectedElementInTree:I

    iget-object v3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$6;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;

    invoke-static {v3}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->access$500(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 205
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$6;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;

    invoke-static {v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->access$500(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$6;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;

    iget v2, v2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->selectedElementInTree:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;

    .line 207
    :cond_1
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$6;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;

    invoke-static {v2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->access$500(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;

    .line 208
    iget-object v3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$6;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;

    invoke-static {v3}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->access$500(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 209
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$6;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;

    invoke-static {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->access$500(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 211
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$6;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;

    if-eqz v1, :cond_2

    invoke-static {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->access$500(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p2

    goto :goto_0

    :cond_2
    const/4 p2, -0x1

    :goto_0
    iput p2, p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->selectedElementInTree:I

    .line 220
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$6;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;

    invoke-static {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->access$500(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)Ljava/util/List;

    move-result-object p2

    invoke-static {p1, p2, v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->access$600(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;Ljava/util/List;Z)V

    return-void
.end method
