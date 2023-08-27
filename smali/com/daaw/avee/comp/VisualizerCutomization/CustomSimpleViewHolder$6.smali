.class Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$6;
.super Ljava/lang/Object;
.source "CustomSimpleViewHolder.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


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

.field final synthetic val$scrollView:Landroid/view/ViewGroup;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;Landroid/view/ViewGroup;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$6;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder;

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$6;->val$scrollView:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .line 105
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleViewHolder$6;->val$scrollView:Landroid/view/ViewGroup;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 106
    invoke-virtual {p1, p2}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
