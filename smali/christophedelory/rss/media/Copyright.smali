.class public Lchristophedelory/rss/media/Copyright;
.super Ljava/lang/Object;
.source "Copyright.java"


# instance fields
.field private _url:Ljava/net/URI;

.field private _value:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 46
    iput-object v0, p0, Lchristophedelory/rss/media/Copyright;->_url:Ljava/net/URI;

    .line 51
    iput-object v0, p0, Lchristophedelory/rss/media/Copyright;->_value:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getURL()Ljava/net/URI;
    .locals 1

    .line 110
    iget-object v0, p0, Lchristophedelory/rss/media/Copyright;->_url:Ljava/net/URI;

    return-object v0
.end method

.method public getURLString()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lchristophedelory/rss/media/Copyright;->_url:Ljava/net/URI;

    if-eqz v0, :cond_0

    .line 85
    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 126
    iget-object v0, p0, Lchristophedelory/rss/media/Copyright;->_value:Ljava/lang/String;

    return-object v0
.end method

.method public setURL(Ljava/net/URI;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lchristophedelory/rss/media/Copyright;->_url:Ljava/net/URI;

    return-void
.end method

.method public setURLString(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/URISyntaxException;
        }
    .end annotation

    .line 63
    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lchristophedelory/rss/media/Copyright;->_url:Ljava/net/URI;

    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .line 137
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/media/Copyright;->_value:Ljava/lang/String;

    return-void
.end method
