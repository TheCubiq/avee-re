.class public Lchristophedelory/rss/Item;
.super Lchristophedelory/rss/media/BaseMedia;
.source "Item.java"


# instance fields
.field private _author:Ljava/lang/String;

.field private final _categories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lchristophedelory/rss/Category;",
            ">;"
        }
    .end annotation
.end field

.field private transient _channel:Lchristophedelory/rss/Channel;

.field private _comments:Ljava/lang/String;

.field private _description:Ljava/lang/String;

.field private _enclosure:Lchristophedelory/rss/Enclosure;

.field private _guid:Lchristophedelory/rss/GUID;

.field private _link:Ljava/net/URI;

.field private final _mediaContents:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lchristophedelory/rss/media/Content;",
            ">;"
        }
    .end annotation
.end field

.field private final _mediaGroups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lchristophedelory/rss/media/Group;",
            ">;"
        }
    .end annotation
.end field

.field private _pubDate:Ljava/util/Date;

.field private _source:Lchristophedelory/rss/Source;

.field private _title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 56
    invoke-direct {p0}, Lchristophedelory/rss/media/BaseMedia;-><init>()V

    const/4 v0, 0x0

    .line 61
    iput-object v0, p0, Lchristophedelory/rss/Item;->_title:Ljava/lang/String;

    .line 66
    iput-object v0, p0, Lchristophedelory/rss/Item;->_link:Ljava/net/URI;

    .line 71
    iput-object v0, p0, Lchristophedelory/rss/Item;->_description:Ljava/lang/String;

    .line 76
    iput-object v0, p0, Lchristophedelory/rss/Item;->_author:Ljava/lang/String;

    .line 81
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lchristophedelory/rss/Item;->_categories:Ljava/util/List;

    .line 86
    iput-object v0, p0, Lchristophedelory/rss/Item;->_comments:Ljava/lang/String;

    .line 91
    iput-object v0, p0, Lchristophedelory/rss/Item;->_enclosure:Lchristophedelory/rss/Enclosure;

    .line 96
    iput-object v0, p0, Lchristophedelory/rss/Item;->_guid:Lchristophedelory/rss/GUID;

    .line 101
    iput-object v0, p0, Lchristophedelory/rss/Item;->_pubDate:Ljava/util/Date;

    .line 106
    iput-object v0, p0, Lchristophedelory/rss/Item;->_source:Lchristophedelory/rss/Source;

    .line 111
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lchristophedelory/rss/Item;->_mediaContents:Ljava/util/List;

    .line 116
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lchristophedelory/rss/Item;->_mediaGroups:Ljava/util/List;

    .line 121
    iput-object v0, p0, Lchristophedelory/rss/Item;->_channel:Lchristophedelory/rss/Channel;

    return-void
.end method


# virtual methods
.method public addCategory(Lchristophedelory/rss/Category;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 320
    iget-object v0, p0, Lchristophedelory/rss/Item;->_categories:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 317
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no category"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addMediaContent(Lchristophedelory/rss/media/Content;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 528
    iget-object v0, p0, Lchristophedelory/rss/Item;->_mediaContents:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 525
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no media content"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addMediaGroup(Lchristophedelory/rss/media/Group;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 580
    iget-object v0, p0, Lchristophedelory/rss/Item;->_mediaGroups:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 577
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no media group"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getAuthor()Ljava/lang/String;
    .locals 1

    .line 270
    iget-object v0, p0, Lchristophedelory/rss/Item;->_author:Ljava/lang/String;

    return-object v0
.end method

.method public getCategories()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lchristophedelory/rss/Category;",
            ">;"
        }
    .end annotation

    .line 303
    iget-object v0, p0, Lchristophedelory/rss/Item;->_categories:Ljava/util/List;

    return-object v0
.end method

.method public getChannel()Lchristophedelory/rss/Channel;
    .locals 1

    .line 599
    iget-object v0, p0, Lchristophedelory/rss/Item;->_channel:Lchristophedelory/rss/Channel;

    return-object v0
.end method

.method public getComments()Ljava/lang/String;
    .locals 1

    .line 341
    iget-object v0, p0, Lchristophedelory/rss/Item;->_comments:Ljava/lang/String;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 238
    iget-object v0, p0, Lchristophedelory/rss/Item;->_description:Ljava/lang/String;

    return-object v0
.end method

.method public getEnclosure()Lchristophedelory/rss/Enclosure;
    .locals 1

    .line 370
    iget-object v0, p0, Lchristophedelory/rss/Item;->_enclosure:Lchristophedelory/rss/Enclosure;

    return-object v0
.end method

.method public getGuid()Lchristophedelory/rss/GUID;
    .locals 1

    .line 406
    iget-object v0, p0, Lchristophedelory/rss/Item;->_guid:Lchristophedelory/rss/GUID;

    return-object v0
.end method

.method public getLink()Ljava/net/URI;
    .locals 1

    .line 219
    iget-object v0, p0, Lchristophedelory/rss/Item;->_link:Ljava/net/URI;

    return-object v0
.end method

.method public getLinkString()Ljava/lang/String;
    .locals 1

    .line 185
    iget-object v0, p0, Lchristophedelory/rss/Item;->_link:Ljava/net/URI;

    if-eqz v0, :cond_0

    .line 187
    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
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

    .line 546
    iget-object v0, p0, Lchristophedelory/rss/Item;->_mediaContents:Ljava/util/List;

    return-object v0
.end method

.method public getMediaGroups()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lchristophedelory/rss/media/Group;",
            ">;"
        }
    .end annotation

    .line 564
    iget-object v0, p0, Lchristophedelory/rss/Item;->_mediaGroups:Ljava/util/List;

    return-object v0
.end method

.method public getPubDate()Ljava/util/Date;
    .locals 1

    .line 471
    iget-object v0, p0, Lchristophedelory/rss/Item;->_pubDate:Ljava/util/Date;

    return-object v0
.end method

.method public getPubDateString()Ljava/lang/String;
    .locals 1

    .line 450
    iget-object v0, p0, Lchristophedelory/rss/Item;->_pubDate:Ljava/util/Date;

    if-eqz v0, :cond_0

    .line 452
    invoke-static {v0}, Lchristophedelory/rss/RFC822;->toString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSource()Lchristophedelory/rss/Source;
    .locals 1

    .line 501
    iget-object v0, p0, Lchristophedelory/rss/Item;->_source:Lchristophedelory/rss/Source;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 143
    iget-object v0, p0, Lchristophedelory/rss/Item;->_title:Ljava/lang/String;

    return-object v0
.end method

.method public setAuthor(Ljava/lang/String;)V
    .locals 0

    .line 281
    iput-object p1, p0, Lchristophedelory/rss/Item;->_author:Ljava/lang/String;

    return-void
.end method

.method setChannel(Lchristophedelory/rss/Channel;)V
    .locals 0

    .line 590
    iput-object p1, p0, Lchristophedelory/rss/Item;->_channel:Lchristophedelory/rss/Channel;

    return-void
.end method

.method public setComments(Ljava/lang/String;)V
    .locals 0

    .line 352
    iput-object p1, p0, Lchristophedelory/rss/Item;->_comments:Ljava/lang/String;

    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 248
    iput-object p1, p0, Lchristophedelory/rss/Item;->_description:Ljava/lang/String;

    return-void
.end method

.method public setEnclosure(Lchristophedelory/rss/Enclosure;)V
    .locals 0

    .line 381
    iput-object p1, p0, Lchristophedelory/rss/Item;->_enclosure:Lchristophedelory/rss/Enclosure;

    return-void
.end method

.method public setGuid(Lchristophedelory/rss/GUID;)V
    .locals 0

    .line 417
    iput-object p1, p0, Lchristophedelory/rss/Item;->_guid:Lchristophedelory/rss/GUID;

    return-void
.end method

.method public setLink(Ljava/net/URI;)V
    .locals 0

    .line 201
    iput-object p1, p0, Lchristophedelory/rss/Item;->_link:Ljava/net/URI;

    return-void
.end method

.method public setLinkString(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/URISyntaxException;
        }
    .end annotation

    .line 166
    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lchristophedelory/rss/Item;->_link:Ljava/net/URI;

    return-void
.end method

.method public setPubDate(Ljava/util/Date;)V
    .locals 0

    .line 483
    iput-object p1, p0, Lchristophedelory/rss/Item;->_pubDate:Ljava/util/Date;

    return-void
.end method

.method public setPubDateString(Ljava/lang/String;)V
    .locals 0

    .line 430
    invoke-static {p1}, Lchristophedelory/rss/RFC822;->valueOf(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/Item;->_pubDate:Ljava/util/Date;

    return-void
.end method

.method public setSource(Lchristophedelory/rss/Source;)V
    .locals 0

    .line 512
    iput-object p1, p0, Lchristophedelory/rss/Item;->_source:Lchristophedelory/rss/Source;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 153
    iput-object p1, p0, Lchristophedelory/rss/Item;->_title:Ljava/lang/String;

    return-void
.end method
