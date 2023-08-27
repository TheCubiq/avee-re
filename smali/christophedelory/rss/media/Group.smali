.class public Lchristophedelory/rss/media/Group;
.super Lchristophedelory/rss/media/BaseMedia;
.source "Group.java"


# instance fields
.field private final _mediaContents:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lchristophedelory/rss/media/Content;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Lchristophedelory/rss/media/BaseMedia;-><init>()V

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lchristophedelory/rss/media/Group;->_mediaContents:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public addMediaContent(Lchristophedelory/rss/media/Content;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 59
    iget-object v0, p0, Lchristophedelory/rss/media/Group;->_mediaContents:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 56
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no media content"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getMediaContents()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lchristophedelory/rss/media/Content;",
            ">;"
        }
    .end annotation

    .line 77
    iget-object v0, p0, Lchristophedelory/rss/media/Group;->_mediaContents:Ljava/util/List;

    return-object v0
.end method
