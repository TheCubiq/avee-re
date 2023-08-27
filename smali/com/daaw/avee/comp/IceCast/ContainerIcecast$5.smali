.class Lcom/daaw/avee/comp/IceCast/ContainerIcecast$5;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$SendToItemAction$SendToActionListener;
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

    .line 124
    iput-object p1, p0, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$5;->this$0:Lcom/daaw/avee/comp/IceCast/ContainerIcecast;

    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ContextualActions/ItemActionsSongs$SendToItemAction$SendToActionListener;-><init>()V

    return-void
.end method


# virtual methods
.method protected onSendTo(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;)V
    .locals 0
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

    .line 127
    check-cast p2, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ThisItemIdentifier;

    .line 128
    iget-object p1, p2, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ThisItemIdentifier;->item:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    if-nez p1, :cond_0

    return-void

    .line 130
    :cond_0
    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
