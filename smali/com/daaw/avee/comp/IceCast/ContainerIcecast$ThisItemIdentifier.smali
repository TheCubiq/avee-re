.class Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ThisItemIdentifier;
.super Ljava/lang/Object;
.source "ContainerIcecast.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/IceCast/ContainerIcecast;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ThisItemIdentifier"
.end annotation


# instance fields
.field public item:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

.field public itemPosition:I


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;I)V
    .locals 0

    .line 446
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 447
    iput p2, p0, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ThisItemIdentifier;->itemPosition:I

    .line 448
    iput-object p1, p0, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ThisItemIdentifier;->item:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 462
    instance-of v0, p1, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ThisItemIdentifier;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ThisItemIdentifier;->itemPosition:I

    check-cast p1, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ThisItemIdentifier;

    iget p1, p1, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ThisItemIdentifier;->itemPosition:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 457
    iget v0, p0, Lcom/daaw/avee/comp/IceCast/ContainerIcecast$ThisItemIdentifier;->itemPosition:I

    return v0
.end method
