.class public Lchristophedelory/rss/Channel;
.super Lchristophedelory/rss/media/BaseMedia;
.source "Channel.java"


# instance fields
.field private final _categories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lchristophedelory/rss/Category;",
            ">;"
        }
    .end annotation
.end field

.field private _cloud:Lchristophedelory/rss/Cloud;

.field private _copyright:Ljava/lang/String;

.field private _description:Ljava/lang/String;

.field private _docs:Ljava/lang/String;

.field private _generator:Ljava/lang/String;

.field private _image:Lchristophedelory/rss/Image;

.field private final _items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lchristophedelory/rss/Item;",
            ">;"
        }
    .end annotation
.end field

.field private _language:Ljava/lang/String;

.field private _lastBuildDate:Ljava/util/Date;

.field private _link:Ljava/net/URI;

.field private _managingEditor:Ljava/lang/String;

.field private _pubDate:Ljava/util/Date;

.field private _rating:Ljava/lang/String;

.field private transient _rss:Lchristophedelory/rss/RSS;

.field private final _skipDays:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final _skipHours:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private _textInput:Lchristophedelory/rss/TextInput;

.field private _title:Ljava/lang/String;

.field private _ttl:Ljava/lang/Integer;

.field private _webMaster:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 41
    invoke-direct {p0}, Lchristophedelory/rss/media/BaseMedia;-><init>()V

    const/4 v0, 0x0

    .line 46
    iput-object v0, p0, Lchristophedelory/rss/Channel;->_title:Ljava/lang/String;

    .line 51
    iput-object v0, p0, Lchristophedelory/rss/Channel;->_link:Ljava/net/URI;

    .line 56
    iput-object v0, p0, Lchristophedelory/rss/Channel;->_description:Ljava/lang/String;

    .line 61
    iput-object v0, p0, Lchristophedelory/rss/Channel;->_language:Ljava/lang/String;

    .line 66
    iput-object v0, p0, Lchristophedelory/rss/Channel;->_copyright:Ljava/lang/String;

    .line 71
    iput-object v0, p0, Lchristophedelory/rss/Channel;->_managingEditor:Ljava/lang/String;

    .line 76
    iput-object v0, p0, Lchristophedelory/rss/Channel;->_webMaster:Ljava/lang/String;

    .line 81
    iput-object v0, p0, Lchristophedelory/rss/Channel;->_pubDate:Ljava/util/Date;

    .line 86
    iput-object v0, p0, Lchristophedelory/rss/Channel;->_lastBuildDate:Ljava/util/Date;

    .line 91
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lchristophedelory/rss/Channel;->_categories:Ljava/util/List;

    .line 96
    iput-object v0, p0, Lchristophedelory/rss/Channel;->_generator:Ljava/lang/String;

    const-string v1, "http://blogs.law.harvard.edu/tech/rss"

    .line 101
    iput-object v1, p0, Lchristophedelory/rss/Channel;->_docs:Ljava/lang/String;

    .line 106
    iput-object v0, p0, Lchristophedelory/rss/Channel;->_cloud:Lchristophedelory/rss/Cloud;

    .line 111
    iput-object v0, p0, Lchristophedelory/rss/Channel;->_ttl:Ljava/lang/Integer;

    .line 116
    iput-object v0, p0, Lchristophedelory/rss/Channel;->_image:Lchristophedelory/rss/Image;

    .line 121
    iput-object v0, p0, Lchristophedelory/rss/Channel;->_rating:Ljava/lang/String;

    .line 126
    iput-object v0, p0, Lchristophedelory/rss/Channel;->_textInput:Lchristophedelory/rss/TextInput;

    .line 131
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lchristophedelory/rss/Channel;->_skipHours:Ljava/util/List;

    .line 136
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lchristophedelory/rss/Channel;->_skipDays:Ljava/util/List;

    .line 141
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lchristophedelory/rss/Channel;->_items:Ljava/util/List;

    .line 146
    iput-object v0, p0, Lchristophedelory/rss/Channel;->_rss:Lchristophedelory/rss/RSS;

    return-void
.end method


# virtual methods
.method public addCategory(Lchristophedelory/rss/Category;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 555
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_categories:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 552
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no category"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addItem(Lchristophedelory/rss/Item;)V
    .locals 1

    .line 873
    invoke-virtual {p1, p0}, Lchristophedelory/rss/Item;->setChannel(Lchristophedelory/rss/Channel;)V

    .line 874
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_items:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addSkipDay(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 840
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_skipDays:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 837
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no skipDay"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addSkipHour(Ljava/lang/Integer;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 799
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_skipHours:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 796
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no skipHour"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
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

    .line 538
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_categories:Ljava/util/List;

    return-object v0
.end method

.method public getCloud()Lchristophedelory/rss/Cloud;
    .locals 1

    .line 645
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_cloud:Lchristophedelory/rss/Cloud;

    return-object v0
.end method

.method public getCopyright()Ljava/lang/String;
    .locals 1

    .line 322
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_copyright:Ljava/lang/String;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 259
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_description:Ljava/lang/String;

    return-object v0
.end method

.method public getDocs()Ljava/lang/String;
    .locals 1

    .line 615
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_docs:Ljava/lang/String;

    return-object v0
.end method

.method public getGenerator()Ljava/lang/String;
    .locals 1

    .line 585
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_generator:Ljava/lang/String;

    return-object v0
.end method

.method public getImage()Lchristophedelory/rss/Image;
    .locals 1

    .line 704
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_image:Lchristophedelory/rss/Image;

    return-object v0
.end method

.method public getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lchristophedelory/rss/Item;",
            ">;"
        }
    .end annotation

    .line 862
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_items:Ljava/util/List;

    return-object v0
.end method

.method public getLanguage()Ljava/lang/String;
    .locals 1

    .line 294
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_language:Ljava/lang/String;

    return-object v0
.end method

.method public getLastBuildDate()Ljava/util/Date;
    .locals 1

    .line 512
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_lastBuildDate:Ljava/util/Date;

    return-object v0
.end method

.method public getLastBuildDateString()Ljava/lang/String;
    .locals 1

    .line 483
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_lastBuildDate:Ljava/util/Date;

    if-eqz v0, :cond_0

    .line 485
    invoke-static {v0}, Lchristophedelory/rss/RFC822;->toString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getLink()Ljava/net/URI;
    .locals 1

    .line 240
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_link:Ljava/net/URI;

    return-object v0
.end method

.method public getLinkString()Ljava/lang/String;
    .locals 1

    .line 212
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_link:Ljava/net/URI;

    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getManagingEditor()Ljava/lang/String;
    .locals 1

    .line 350
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_managingEditor:Ljava/lang/String;

    return-object v0
.end method

.method public getPubDate()Ljava/util/Date;
    .locals 1

    .line 452
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_pubDate:Ljava/util/Date;

    return-object v0
.end method

.method public getPubDateString()Ljava/lang/String;
    .locals 1

    .line 419
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_pubDate:Ljava/util/Date;

    if-eqz v0, :cond_0

    .line 421
    invoke-static {v0}, Lchristophedelory/rss/RFC822;->toString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getRSS()Lchristophedelory/rss/RSS;
    .locals 1

    .line 893
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_rss:Lchristophedelory/rss/RSS;

    return-object v0
.end method

.method public getRating()Ljava/lang/String;
    .locals 1

    .line 731
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_rating:Ljava/lang/String;

    return-object v0
.end method

.method public getSkipDays()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 824
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_skipDays:Ljava/util/List;

    return-object v0
.end method

.method public getSkipHours()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 783
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_skipHours:Ljava/util/List;

    return-object v0
.end method

.method public getTTL()Ljava/lang/Integer;
    .locals 1

    .line 677
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_ttl:Ljava/lang/Integer;

    return-object v0
.end method

.method public getTextInput()Lchristophedelory/rss/TextInput;
    .locals 1

    .line 758
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_textInput:Lchristophedelory/rss/TextInput;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 167
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_title:Ljava/lang/String;

    return-object v0
.end method

.method public getWebMaster()Ljava/lang/String;
    .locals 1

    .line 378
    iget-object v0, p0, Lchristophedelory/rss/Channel;->_webMaster:Ljava/lang/String;

    return-object v0
.end method

.method public setCloud(Lchristophedelory/rss/Cloud;)V
    .locals 0

    .line 626
    iput-object p1, p0, Lchristophedelory/rss/Channel;->_cloud:Lchristophedelory/rss/Cloud;

    return-void
.end method

.method public setCopyright(Ljava/lang/String;)V
    .locals 0

    .line 332
    iput-object p1, p0, Lchristophedelory/rss/Channel;->_copyright:Ljava/lang/String;

    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 270
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/Channel;->_description:Ljava/lang/String;

    return-void
.end method

.method public setDocs(Ljava/lang/String;)V
    .locals 0

    .line 595
    iput-object p1, p0, Lchristophedelory/rss/Channel;->_docs:Ljava/lang/String;

    return-void
.end method

.method public setGenerator(Ljava/lang/String;)V
    .locals 0

    .line 566
    iput-object p1, p0, Lchristophedelory/rss/Channel;->_generator:Ljava/lang/String;

    return-void
.end method

.method public setImage(Lchristophedelory/rss/Image;)V
    .locals 0

    .line 687
    iput-object p1, p0, Lchristophedelory/rss/Channel;->_image:Lchristophedelory/rss/Image;

    return-void
.end method

.method public setLanguage(Ljava/lang/String;)V
    .locals 0

    .line 304
    iput-object p1, p0, Lchristophedelory/rss/Channel;->_language:Ljava/lang/String;

    return-void
.end method

.method public setLastBuildDate(Ljava/util/Date;)V
    .locals 0

    .line 499
    iput-object p1, p0, Lchristophedelory/rss/Channel;->_lastBuildDate:Ljava/util/Date;

    return-void
.end method

.method public setLastBuildDateString(Ljava/lang/String;)V
    .locals 0

    .line 464
    invoke-static {p1}, Lchristophedelory/rss/RFC822;->valueOf(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/Channel;->_lastBuildDate:Ljava/util/Date;

    return-void
.end method

.method public setLink(Ljava/net/URI;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 229
    iput-object p1, p0, Lchristophedelory/rss/Channel;->_link:Ljava/net/URI;

    return-void

    .line 226
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "No link"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setLinkString(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/URISyntaxException;
        }
    .end annotation

    .line 191
    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lchristophedelory/rss/Channel;->_link:Ljava/net/URI;

    return-void
.end method

.method public setManagingEditor(Ljava/lang/String;)V
    .locals 0

    .line 360
    iput-object p1, p0, Lchristophedelory/rss/Channel;->_managingEditor:Ljava/lang/String;

    return-void
.end method

.method public setPubDate(Ljava/util/Date;)V
    .locals 0

    .line 435
    iput-object p1, p0, Lchristophedelory/rss/Channel;->_pubDate:Ljava/util/Date;

    return-void
.end method

.method public setPubDateString(Ljava/lang/String;)V
    .locals 0

    .line 400
    invoke-static {p1}, Lchristophedelory/rss/RFC822;->valueOf(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/Channel;->_pubDate:Ljava/util/Date;

    return-void
.end method

.method setRSS(Lchristophedelory/rss/RSS;)V
    .locals 0

    .line 884
    iput-object p1, p0, Lchristophedelory/rss/Channel;->_rss:Lchristophedelory/rss/RSS;

    return-void
.end method

.method public setRating(Ljava/lang/String;)V
    .locals 0

    .line 714
    iput-object p1, p0, Lchristophedelory/rss/Channel;->_rating:Ljava/lang/String;

    return-void
.end method

.method public setTTL(Ljava/lang/Integer;)V
    .locals 0

    .line 656
    iput-object p1, p0, Lchristophedelory/rss/Channel;->_ttl:Ljava/lang/Integer;

    return-void
.end method

.method public setTextInput(Lchristophedelory/rss/TextInput;)V
    .locals 0

    .line 741
    iput-object p1, p0, Lchristophedelory/rss/Channel;->_textInput:Lchristophedelory/rss/TextInput;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 178
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/Channel;->_title:Ljava/lang/String;

    return-void
.end method

.method public setWebMaster(Ljava/lang/String;)V
    .locals 0

    .line 388
    iput-object p1, p0, Lchristophedelory/rss/Channel;->_webMaster:Ljava/lang/String;

    return-void
.end method
