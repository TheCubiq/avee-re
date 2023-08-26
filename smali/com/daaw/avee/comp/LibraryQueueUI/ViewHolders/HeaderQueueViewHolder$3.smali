.class Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderQueueViewHolder$3;
.super Ljava/lang/Object;
.source "HeaderQueueViewHolder.java"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderQueueViewHolder;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderQueueViewHolder;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderQueueViewHolder;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderQueueViewHolder$3;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderQueueViewHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 3

    .line 79
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseHeaderViewHolder;->onAction:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/ContextData;

    invoke-direct {v1, p1}, Lcom/daaw/avee/ContextData;-><init>(Landroid/view/View;)V

    const/16 v2, 0x456

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p1}, Lcom/daaw/avee/Common/Events/WeakEvent3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method
