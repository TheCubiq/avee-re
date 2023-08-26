.class public abstract Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$PlaySingleItemAction$PlaySingleActionListener2;
.super Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;
.source "ItemActionsSongs.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$PlaySingleItemAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "PlaySingleActionListener2"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 264
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$PlaySingleItemAction;->playSingleItemAction:Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    invoke-direct {p0, v0}, Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;-><init>(Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;)V

    return-void
.end method


# virtual methods
.method protected abstract onPlaySingle(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;)V"
        }
    .end annotation
.end method
