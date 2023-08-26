.class Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$7;
.super Ljava/lang/Object;
.source "CustomSimpleViewHolder.java"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->setItemActions([Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;

.field final synthetic val$itemActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$7;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$7;->val$itemActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 2

    .line 176
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$7;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$7;->val$itemActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    invoke-virtual {v0, p1, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;->createMenu(Landroid/view/View;[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;)V

    const/4 p1, 0x1

    return p1
.end method
