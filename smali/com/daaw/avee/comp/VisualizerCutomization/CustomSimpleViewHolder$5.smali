.class Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$5;
.super Ljava/lang/Object;
.source "CustomSimpleViewHolder.java"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;-><init>(Landroid/view/View;Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnDraggingListener;Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;

.field final synthetic val$_onDraggingListener:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnDraggingListener;

.field final synthetic val$view:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnDraggingListener;Landroid/view/View;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$5;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$5;->val$_onDraggingListener:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnDraggingListener;

    iput-object p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$5;->val$view:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 1

    .line 97
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$5;->val$_onDraggingListener:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnDraggingListener;

    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$5;->val$view:Landroid/view/View;

    invoke-interface {p1, v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnDraggingListener;->onStartDragging(Landroid/view/View;)V

    const/4 p1, 0x1

    return p1
.end method
