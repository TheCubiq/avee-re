.class Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder$4;
.super Ljava/lang/Object;
.source "HeaderSongsViewHolder.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder;->onBind(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder$4;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/HeaderSongsViewHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 90
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseHeaderViewHolder;->onActionChooseSort:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/ContextData;

    invoke-direct {v1, p1}, Lcom/daaw/avee/ContextData;-><init>(Landroid/view/View;)V

    invoke-virtual {v0, v1, p1}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
