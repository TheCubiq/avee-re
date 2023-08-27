.class Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$1;
.super Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;
.source "CustomSimpleSectionedAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;-><init>(Landroid/content/Context;IILcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;Lcom/daaw/avee/Common/Func/Func;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$1;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 2

    .line 58
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$1;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;

    invoke-static {v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->access$100(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;)Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->getItemCount()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->access$002(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;Z)Z

    .line 59
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$1;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public onItemRangeChanged(II)V
    .locals 2

    .line 64
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$1;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;

    invoke-static {v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->access$100(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;)Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->getItemCount()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->access$002(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;Z)Z

    .line 65
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$1;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->notifyItemRangeChanged(II)V

    return-void
.end method

.method public onItemRangeInserted(II)V
    .locals 2

    .line 70
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$1;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;

    invoke-static {v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->access$100(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;)Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->getItemCount()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->access$002(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;Z)Z

    .line 71
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$1;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->notifyItemRangeInserted(II)V

    return-void
.end method

.method public onItemRangeRemoved(II)V
    .locals 2

    .line 76
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$1;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;

    invoke-static {v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->access$100(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;)Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->getItemCount()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->access$002(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;Z)Z

    .line 77
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$1;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->notifyItemRangeRemoved(II)V

    return-void
.end method
