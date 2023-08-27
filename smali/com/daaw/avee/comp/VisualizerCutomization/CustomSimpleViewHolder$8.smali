.class Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$8;
.super Ljava/lang/Object;
.source "CustomSimpleViewHolder.java"

# interfaces
.implements Landroid/widget/PopupMenu$OnMenuItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->createMenu(Landroid/view/View;[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;

.field final synthetic val$itemActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

.field final synthetic val$v:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;Landroid/view/View;)V
    .locals 0

    .line 195
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$8;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$8;->val$itemActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    iput-object p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$8;->val$v:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 2

    .line 198
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    .line 200
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$8;->val$itemActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    aget-object p1, v0, p1

    new-instance v0, Lcom/daaw/avee/ContextData;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$8;->val$v:Landroid/view/View;

    invoke-direct {v0, v1}, Lcom/daaw/avee/ContextData;-><init>(Landroid/view/View;)V

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$8;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;

    iget v1, v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->itemPosition:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;->execute(Lcom/daaw/avee/ContextData;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method
