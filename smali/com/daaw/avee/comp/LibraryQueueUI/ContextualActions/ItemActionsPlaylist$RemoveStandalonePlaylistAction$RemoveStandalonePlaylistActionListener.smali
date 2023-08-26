.class public abstract Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist$RemoveStandalonePlaylistAction$RemoveStandalonePlaylistActionListener;
.super Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;
.source "ItemActionsPlaylist.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist$RemoveStandalonePlaylistAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "RemoveStandalonePlaylistActionListener"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 130
    invoke-static {}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist$RemoveStandalonePlaylistAction;->access$200()Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;-><init>(Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;)V

    return-void
.end method


# virtual methods
.method protected abstract onRemoveStandalonePlaylist(Landroid/content/Context;Ljava/lang/Object;Lcom/daaw/avee/Common/MultiList;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            "Lcom/daaw/avee/Common/MultiList<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method
