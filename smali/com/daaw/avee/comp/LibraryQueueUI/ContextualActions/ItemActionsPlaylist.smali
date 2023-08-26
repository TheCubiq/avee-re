.class public Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist;
.super Ljava/lang/Object;
.source "ItemActionsPlaylist.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist$RemoveStandalonePlaylistAction;,
        Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist$DeletePlaylistAction;,
        Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist$RenamePlaylistAction;
    }
.end annotation


# static fields
.field public static onLibraryQueue2UI_ActionRemoveStandalonePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent4<",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/ContextData;",
            ">;"
        }
    .end annotation
.end field

.field public static onLibraryQueueUI_ActionDeletePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent4<",
            "Landroid/content/Context;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/ContextData;",
            ">;"
        }
    .end annotation
.end field

.field public static onLibraryQueueUI_ActionRenamePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent4<",
            "Landroid/content/Context;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/ContextData;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 21
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent4;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent4;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist;->onLibraryQueue2UI_ActionRemoveStandalonePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent4;

    .line 22
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent4;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent4;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist;->onLibraryQueueUI_ActionRenamePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent4;

    .line 23
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent4;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent4;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsPlaylist;->onLibraryQueueUI_ActionDeletePlaylist:Lcom/daaw/avee/Common/Events/WeakEvent4;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
