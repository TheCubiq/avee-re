.class public Lchristophedelory/rss/Source;
.super Ljava/lang/Object;
.source "Source.java"


# instance fields
.field private _channelName:Ljava/lang/String;

.field private _url:Ljava/net/URI;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 44
    iput-object v0, p0, Lchristophedelory/rss/Source;->_url:Ljava/net/URI;

    .line 49
    iput-object v0, p0, Lchristophedelory/rss/Source;->_channelName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getChannelName()Ljava/lang/String;
    .locals 1

    .line 77
    iget-object v0, p0, Lchristophedelory/rss/Source;->_channelName:Ljava/lang/String;

    return-object v0
.end method

.method public getURL()Ljava/net/URI;
    .locals 1

    .line 139
    iget-object v0, p0, Lchristophedelory/rss/Source;->_url:Ljava/net/URI;

    return-object v0
.end method

.method public getURLString()Ljava/lang/String;
    .locals 1

    .line 109
    iget-object v0, p0, Lchristophedelory/rss/Source;->_url:Ljava/net/URI;

    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setChannelName(Ljava/lang/String;)V
    .locals 0

    .line 59
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/Source;->_channelName:Ljava/lang/String;

    return-void
.end method

.method public setURL(Ljava/net/URI;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 126
    iput-object p1, p0, Lchristophedelory/rss/Source;->_url:Ljava/net/URI;

    return-void

    .line 123
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

    .line 90
    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lchristophedelory/rss/Source;->_url:Ljava/net/URI;

    return-void
.end method
