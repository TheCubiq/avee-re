.class public Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "CustomSimpleAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnItemClickListener;,
        Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnDraggingListener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private collapsed:Z

.field private final mContext:Landroid/content/Context;

.field private mData:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private onDraggingListener:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnDraggingListener;

.field private onItemClickListener:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnItemClickListener;

.field private onItemLongClickListener:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnItemClickListener;

.field private scrollView:Landroid/view/ViewGroup;

.field private selectedItemPosition:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Landroid/view/ViewGroup;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;",
            "Landroid/view/ViewGroup;",
            ")V"
        }
    .end annotation

    .line 99
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    const/4 v0, -0x1

    .line 28
    iput v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->selectedItemPosition:I

    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->collapsed:Z

    .line 100
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->mContext:Landroid/content/Context;

    if-eqz p2, :cond_0

    .line 102
    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->mData:Ljava/util/List;

    goto :goto_0

    .line 103
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->mData:Ljava/util/List;

    .line 105
    :goto_0
    iput-object p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->scrollView:Landroid/view/ViewGroup;

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;)Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnItemClickListener;
    .locals 0

    .line 21
    iget-object p0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->onItemClickListener:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnItemClickListener;

    return-object p0
.end method


# virtual methods
.method public add(Lcom/daaw/avee/Common/Tuple2;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;I)V"
        }
    .end annotation

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 33
    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->getItemCount()I

    move-result p2

    .line 34
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->mData:Ljava/util/List;

    invoke-interface {v0, p2, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 35
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->notifyItemInserted(I)V

    return-void
.end method

.method public getCollapsed()Z
    .locals 1

    .line 66
    iget-boolean v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->collapsed:Z

    return v0
.end method

.method public getItemCount()I
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->mData:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 21
    check-cast p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->onBindViewHolder(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;I)V
    .locals 2

    .line 115
    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->initItem()V

    .line 116
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->mData:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/avee/Common/Tuple2;

    .line 117
    iget-object v0, p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->title:Landroid/widget/TextView;

    iget-object v1, p2, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    iget-object p2, p2, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->setTextSubtitle(Ljava/lang/CharSequence;)V

    .line 119
    iget-object p2, p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->collapsible:Landroid/view/ViewGroup;

    iget-boolean v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->collapsed:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/16 v0, 0x8

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 120
    iget-object p2, p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->itemView:Landroid/view/View;

    new-instance v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$1;

    invoke-direct {v0, p0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$1;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 135
    iget-object p2, p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->btnItemMore:Landroid/widget/ImageButton;

    new-instance v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$2;

    invoke-direct {v0, p0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$2;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;)V

    invoke-virtual {p2, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 150
    iget-object p2, p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->itemView:Landroid/view/View;

    iget p1, p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->itemPosition:I

    iget v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->selectedItemPosition:I

    if-ne p1, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    invoke-virtual {p2, v1}, Landroid/view/View;->setSelected(Z)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 21
    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;
    .locals 2

    .line 109
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->mContext:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c0029

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 110
    new-instance p2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;

    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->onDraggingListener:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnDraggingListener;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->scrollView:Landroid/view/ViewGroup;

    invoke-direct {p2, p1, v0, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;-><init>(Landroid/view/View;Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnDraggingListener;Landroid/view/ViewGroup;)V

    return-object p2
.end method

.method public remove(I)V
    .locals 1

    .line 39
    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->getItemCount()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 40
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->mData:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 41
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->notifyItemRemoved(I)V

    :cond_0
    return-void
.end method

.method public setAllData(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 60
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->mData:Ljava/util/List;

    .line 61
    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public setAllData([Lcom/daaw/avee/Common/Tuple2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 54
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->mData:Ljava/util/List;

    .line 55
    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public setCollapsed(Z)V
    .locals 1

    .line 71
    iget-boolean v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->collapsed:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 72
    :cond_0
    iput-boolean p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->collapsed:Z

    .line 73
    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public setDataAt(ILcom/daaw/avee/Common/Tuple2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-ltz p1, :cond_0

    .line 47
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->mData:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 48
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->mData:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public setOnDraggingListener(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnDraggingListener;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->onDraggingListener:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnDraggingListener;

    return-void
.end method

.method public setOnItemClickListener(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnItemClickListener;)V
    .locals 0

    .line 170
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->onItemClickListener:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnItemClickListener;

    return-void
.end method

.method public setOnItemLongClickListener(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnItemClickListener;)V
    .locals 0

    .line 174
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->onItemLongClickListener:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnItemClickListener;

    return-void
.end method

.method public setSelectedItem(I)V
    .locals 1

    const/4 v0, 0x0

    .line 79
    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->setSelectedItem(ILandroid/view/View;)V

    return-void
.end method

.method public setSelectedItem(ILandroid/view/View;)V
    .locals 1

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    .line 90
    invoke-virtual {p2, v0}, Landroid/view/View;->setSelected(Z)V

    goto :goto_0

    .line 92
    :cond_0
    iget p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->selectedItemPosition:I

    if-ltz p2, :cond_1

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->notifyItemChanged(I)V

    .line 95
    :cond_1
    :goto_0
    iput p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->selectedItemPosition:I

    if-ltz p1, :cond_2

    .line 96
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->notifyItemChanged(I)V

    :cond_2
    return-void
.end method
