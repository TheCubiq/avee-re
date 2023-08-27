.class Lcom/daaw/avee/comp/IceCast/ContainerIcecast$6;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$ViewDetailsItemAction$ViewDetailsActionListener2;
.source "ContainerIcecast.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/IceCast/ContainerIcecast;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/IceCast/ContainerIcecast;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/IceCast/ContainerIcecast;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$6;->this$0:Lcom/daaw/avee/comp/IceCast/ContainerIcecast;

    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$ViewDetailsItemAction$ViewDetailsActionListener2;-><init>()V

    return-void
.end method


# virtual methods
.method protected onDetails(Landroid/content/Context;Ljava/lang/Object;)Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$ItemsDetails;
    .locals 0

    .line 138
    check-cast p2, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ThisItemIdentifier;

    .line 139
    iget-object p1, p2, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ThisItemIdentifier;->item:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    if-nez p1, :cond_0

    .line 140
    new-instance p1, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$ItemsDetails;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$ItemsDetails;-><init>(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)V

    return-object p1

    .line 141
    :cond_0
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$ItemsDetails;

    invoke-direct {p2, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$ItemsDetails;-><init>(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)V

    return-object p2
.end method
