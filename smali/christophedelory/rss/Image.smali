.class public Lchristophedelory/rss/Image;
.super Ljava/lang/Object;
.source "Image.java"


# instance fields
.field private _description:Ljava/lang/String;

.field private _height:Ljava/lang/Integer;

.field private _link:Ljava/net/URI;

.field private _title:Ljava/lang/String;

.field private _url:Ljava/net/URI;

.field private _width:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 41
    iput-object v0, p0, Lchristophedelory/rss/Image;->_url:Ljava/net/URI;

    .line 46
    iput-object v0, p0, Lchristophedelory/rss/Image;->_title:Ljava/lang/String;

    .line 51
    iput-object v0, p0, Lchristophedelory/rss/Image;->_link:Ljava/net/URI;

    .line 56
    iput-object v0, p0, Lchristophedelory/rss/Image;->_width:Ljava/lang/Integer;

    .line 61
    iput-object v0, p0, Lchristophedelory/rss/Image;->_height:Ljava/lang/Integer;

    .line 66
    iput-object v0, p0, Lchristophedelory/rss/Image;->_description:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 289
    iget-object v0, p0, Lchristophedelory/rss/Image;->_description:Ljava/lang/String;

    return-object v0
.end method

.method public getHeight()Ljava/lang/Integer;
    .locals 1

    .line 263
    iget-object v0, p0, Lchristophedelory/rss/Image;->_height:Ljava/lang/Integer;

    return-object v0
.end method

.method public getLink()Ljava/net/URI;
    .locals 1

    .line 217
    iget-object v0, p0, Lchristophedelory/rss/Image;->_link:Ljava/net/URI;

    return-object v0
.end method

.method public getLinkString()Ljava/lang/String;
    .locals 1

    .line 174
    iget-object v0, p0, Lchristophedelory/rss/Image;->_link:Ljava/net/URI;

    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 155
    iget-object v0, p0, Lchristophedelory/rss/Image;->_title:Ljava/lang/String;

    return-object v0
.end method

.method public getURL()Ljava/net/URI;
    .locals 1

    .line 126
    iget-object v0, p0, Lchristophedelory/rss/Image;->_url:Ljava/net/URI;

    return-object v0
.end method

.method public getURLString()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Lchristophedelory/rss/Image;->_url:Ljava/net/URI;

    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getWidth()Ljava/lang/Integer;
    .locals 1

    .line 235
    iget-object v0, p0, Lchristophedelory/rss/Image;->_width:Ljava/lang/Integer;

    return-object v0
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 299
    iput-object p1, p0, Lchristophedelory/rss/Image;->_description:Ljava/lang/String;

    return-void
.end method

.method public setHeight(Ljava/lang/Integer;)V
    .locals 0

    .line 273
    iput-object p1, p0, Lchristophedelory/rss/Image;->_height:Ljava/lang/Integer;

    return-void
.end method

.method public setLink(Ljava/net/URI;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 204
    iput-object p1, p0, Lchristophedelory/rss/Image;->_link:Ljava/net/URI;

    return-void

    .line 201
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

    .line 187
    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lchristophedelory/rss/Image;->_link:Ljava/net/URI;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 137
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/Image;->_title:Ljava/lang/String;

    return-void
.end method

.method public setURL(Ljava/net/URI;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 115
    iput-object p1, p0, Lchristophedelory/rss/Image;->_url:Ljava/net/URI;

    return-void

    .line 112
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "No URL"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setURLString(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/URISyntaxException;
        }
    .end annotation

    .line 78
    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lchristophedelory/rss/Image;->_url:Ljava/net/URI;

    return-void
.end method

.method public setWidth(Ljava/lang/Integer;)V
    .locals 0

    .line 245
    iput-object p1, p0, Lchristophedelory/rss/Image;->_width:Ljava/lang/Integer;

    return-void
.end method
