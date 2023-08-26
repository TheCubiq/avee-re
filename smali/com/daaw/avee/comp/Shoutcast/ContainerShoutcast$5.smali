.class final Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$5;
.super Ljava/lang/Object;
.source "ContainerShoutcast.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast;->sortContent(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;Lcom/daaw/avee/Common/MultiList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/daaw/avee/Common/Tuple2<",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
        "Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic val$comparator:Ljava/util/Comparator;


# direct methods
.method constructor <init>(Ljava/util/Comparator;)V
    .locals 0

    .line 142
    iput-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$5;->val$comparator:Ljava/util/Comparator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/daaw/avee/Common/Tuple2;Lcom/daaw/avee/Common/Tuple2;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;",
            ">;",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;",
            ">;)I"
        }
    .end annotation

    .line 145
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$5;->val$comparator:Ljava/util/Comparator;

    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    iget-object v2, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    iget-object p1, p1, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    invoke-direct {v1, v2, p1}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Lcom/daaw/avee/Common/Tuple2;

    iget-object v2, p2, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    iget-object p2, p2, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    invoke-direct {p1, v2, p2}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1, p1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 142
    check-cast p1, Lcom/daaw/avee/Common/Tuple2;

    check-cast p2, Lcom/daaw/avee/Common/Tuple2;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/Shoutcast/ContainerShoutcast$5;->compare(Lcom/daaw/avee/Common/Tuple2;Lcom/daaw/avee/Common/Tuple2;)I

    move-result p1

    return p1
.end method
