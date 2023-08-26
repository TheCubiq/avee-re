.class public Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "CustomSimpleViewHolder.java"


# static fields
.field static final itemActionsComposition:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

.field static final itemActionsElement:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

.field static final itemActionsElementPremium:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

.field public static onRequest:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final btnItemMore:Landroid/widget/ImageButton;

.field public final collapsible:Landroid/view/ViewGroup;

.field public isSection:Z

.field public itemPosition:I

.field public final subtitle:Landroid/widget/TextView;

.field public final title:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 25
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->onRequest:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v0, 0x1

    new-array v1, v0, [Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 27
    new-instance v2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$1;

    invoke-direct {v2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$1;-><init>()V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sput-object v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->itemActionsElement:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 39
    new-instance v2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$2;

    invoke-direct {v2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$2;-><init>()V

    aput-object v2, v1, v3

    new-instance v2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$3;

    invoke-direct {v2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$3;-><init>()V

    aput-object v2, v1, v0

    sput-object v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->itemActionsElementPremium:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    new-array v0, v0, [Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 58
    new-instance v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$4;

    invoke-direct {v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$4;-><init>()V

    aput-object v1, v0, v3

    sput-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->itemActionsComposition:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 77
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const/4 v0, 0x1

    .line 78
    iput-boolean v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->isSection:Z

    const v0, 0x7f090244

    .line 79
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->title:Landroid/widget/TextView;

    const v0, 0x7f090245

    .line 80
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->subtitle:Landroid/widget/TextView;

    const v0, 0x7f0900a9

    .line 81
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->collapsible:Landroid/view/ViewGroup;

    const v0, 0x7f090074

    .line 82
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->btnItemMore:Landroid/widget/ImageButton;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnDraggingListener;Landroid/view/ViewGroup;)V
    .locals 2

    .line 88
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const/4 v0, 0x0

    .line 89
    iput-boolean v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->isSection:Z

    const v0, 0x7f090244

    .line 90
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->title:Landroid/widget/TextView;

    const v0, 0x7f090245

    .line 91
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->subtitle:Landroid/widget/TextView;

    const v0, 0x7f0900a9

    .line 92
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->collapsible:Landroid/view/ViewGroup;

    const v0, 0x7f090074

    .line 93
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->btnItemMore:Landroid/widget/ImageButton;

    .line 94
    new-instance v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$5;

    invoke-direct {v1, p0, p2, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$5;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnDraggingListener;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 102
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->btnItemMore:Landroid/widget/ImageButton;

    new-instance p2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$6;

    invoke-direct {p2, p0, p3}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$6;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;Landroid/view/ViewGroup;)V

    invoke-virtual {p1, p2}, Landroid/widget/ImageButton;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method


# virtual methods
.method public createMenu(Landroid/view/View;[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;)V
    .locals 5

    .line 193
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 194
    new-instance v1, Landroid/widget/PopupMenu;

    invoke-direct {v1, v0, p1}, Landroid/widget/PopupMenu;-><init>(Landroid/content/Context;Landroid/view/View;)V

    .line 195
    new-instance v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$8;

    invoke-direct {v0, p0, p2, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$8;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;Landroid/view/View;)V

    invoke-virtual {v1, v0}, Landroid/widget/PopupMenu;->setOnMenuItemClickListener(Landroid/widget/PopupMenu$OnMenuItemClickListener;)V

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 206
    :goto_0
    array-length v2, p2

    if-ge v0, v2, :cond_1

    .line 208
    aget-object v2, p2, v0

    invoke-virtual {v2}, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;->getItemActionBase()Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->getShouldShow()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 209
    aget-object v2, p2, v0

    invoke-virtual {v2}, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;->getItemActionBase()Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->isAllowSingle()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 211
    invoke-virtual {v1}, Landroid/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    move-result-object v2

    aget-object v3, p2, v0

    .line 213
    invoke-virtual {v3}, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;->getItemActionBase()Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->getActionId()I

    move-result v3

    aget-object v4, p2, v0

    .line 214
    invoke-virtual {v4}, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;->getItemActionBase()Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    move-result-object v4

    invoke-virtual {v4}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->getNameStrResId()I

    move-result v4

    .line 211
    invoke-interface {v2, p1, v0, v3, v4}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 219
    :cond_1
    invoke-virtual {v1}, Landroid/widget/PopupMenu;->show()V

    return-void
.end method

.method public initItem()V
    .locals 2

    .line 122
    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->getAdapterPosition()I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->itemPosition:I

    .line 124
    iget-boolean v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->isSection:Z

    if-eqz v1, :cond_1

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 127
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->setItemActions([Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;)V

    goto :goto_0

    .line 129
    :cond_0
    sget-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->itemActionsComposition:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->setItemActions([Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;)V

    goto :goto_0

    .line 132
    :cond_1
    sget-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->onRequest:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 133
    sget-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->itemActionsElementPremium:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->setItemActions([Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;)V

    goto :goto_0

    .line 135
    :cond_2
    sget-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->itemActionsElement:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->setItemActions([Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;)V

    :goto_0
    return-void
.end method

.method public setItemActions([Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 170
    array-length v0, p1

    if-lez v0, :cond_0

    .line 172
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->itemView:Landroid/view/View;

    new-instance v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$7;

    invoke-direct {v1, p0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$7;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    goto :goto_0

    .line 182
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->itemView:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :goto_0
    return-void
.end method

.method public setTextSubtitle(Ljava/lang/CharSequence;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 142
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 143
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->subtitle:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->subtitle:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 146
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->subtitle:Landroid/widget/TextView;

    const-string v0, ""

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 147
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->subtitle:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method
