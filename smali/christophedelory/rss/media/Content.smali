.class public Lchristophedelory/rss/media/Content;
.super Lchristophedelory/rss/media/BaseMedia;
.source "Content.java"


# instance fields
.field private _bitrate:Ljava/lang/Integer;

.field private _channels:Ljava/lang/Integer;

.field private _duration:Ljava/lang/Integer;

.field private _expression:Ljava/lang/String;

.field private _fileSize:Ljava/lang/Long;

.field private _framerate:Ljava/lang/Integer;

.field private _height:Ljava/lang/Integer;

.field private _isDefault:Ljava/lang/Boolean;

.field private _lang:Ljava/lang/String;

.field private _medium:Ljava/lang/String;

.field private _samplingrate:Ljava/lang/Float;

.field private _type:Ljava/lang/String;

.field private _url:Ljava/net/URI;

.field private _width:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 59
    invoke-direct {p0}, Lchristophedelory/rss/media/BaseMedia;-><init>()V

    const/4 v0, 0x0

    .line 64
    iput-object v0, p0, Lchristophedelory/rss/media/Content;->_url:Ljava/net/URI;

    .line 69
    iput-object v0, p0, Lchristophedelory/rss/media/Content;->_duration:Ljava/lang/Integer;

    .line 74
    iput-object v0, p0, Lchristophedelory/rss/media/Content;->_fileSize:Ljava/lang/Long;

    .line 79
    iput-object v0, p0, Lchristophedelory/rss/media/Content;->_width:Ljava/lang/Integer;

    .line 84
    iput-object v0, p0, Lchristophedelory/rss/media/Content;->_height:Ljava/lang/Integer;

    .line 89
    iput-object v0, p0, Lchristophedelory/rss/media/Content;->_channels:Ljava/lang/Integer;

    .line 94
    iput-object v0, p0, Lchristophedelory/rss/media/Content;->_bitrate:Ljava/lang/Integer;

    .line 99
    iput-object v0, p0, Lchristophedelory/rss/media/Content;->_framerate:Ljava/lang/Integer;

    .line 104
    iput-object v0, p0, Lchristophedelory/rss/media/Content;->_samplingrate:Ljava/lang/Float;

    .line 109
    iput-object v0, p0, Lchristophedelory/rss/media/Content;->_type:Ljava/lang/String;

    .line 114
    iput-object v0, p0, Lchristophedelory/rss/media/Content;->_medium:Ljava/lang/String;

    .line 120
    iput-object v0, p0, Lchristophedelory/rss/media/Content;->_expression:Ljava/lang/String;

    .line 125
    iput-object v0, p0, Lchristophedelory/rss/media/Content;->_lang:Ljava/lang/String;

    .line 130
    iput-object v0, p0, Lchristophedelory/rss/media/Content;->_isDefault:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public getBitrate()Ljava/lang/Integer;
    .locals 1

    .line 255
    iget-object v0, p0, Lchristophedelory/rss/media/Content;->_bitrate:Ljava/lang/Integer;

    return-object v0
.end method

.method public getChannels()Ljava/lang/Integer;
    .locals 1

    .line 387
    iget-object v0, p0, Lchristophedelory/rss/media/Content;->_channels:Ljava/lang/Integer;

    return-object v0
.end method

.method public getDuration()Ljava/lang/Integer;
    .locals 1

    .line 229
    iget-object v0, p0, Lchristophedelory/rss/media/Content;->_duration:Ljava/lang/Integer;

    return-object v0
.end method

.method public getExpression()Ljava/lang/String;
    .locals 1

    .line 487
    iget-object v0, p0, Lchristophedelory/rss/media/Content;->_expression:Ljava/lang/String;

    return-object v0
.end method

.method public getFileSize()Ljava/lang/Long;
    .locals 1

    .line 413
    iget-object v0, p0, Lchristophedelory/rss/media/Content;->_fileSize:Ljava/lang/Long;

    return-object v0
.end method

.method public getFramerate()Ljava/lang/Integer;
    .locals 1

    .line 281
    iget-object v0, p0, Lchristophedelory/rss/media/Content;->_framerate:Ljava/lang/Integer;

    return-object v0
.end method

.method public getHeight()Ljava/lang/Integer;
    .locals 1

    .line 361
    iget-object v0, p0, Lchristophedelory/rss/media/Content;->_height:Ljava/lang/Integer;

    return-object v0
.end method

.method public getIsDefault()Ljava/lang/Boolean;
    .locals 1

    .line 567
    iget-object v0, p0, Lchristophedelory/rss/media/Content;->_isDefault:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getLang()Ljava/lang/String;
    .locals 1

    .line 516
    iget-object v0, p0, Lchristophedelory/rss/media/Content;->_lang:Ljava/lang/String;

    return-object v0
.end method

.method public getMedium()Ljava/lang/String;
    .locals 1

    .line 458
    iget-object v0, p0, Lchristophedelory/rss/media/Content;->_medium:Ljava/lang/String;

    return-object v0
.end method

.method public getSamplingrate()Ljava/lang/Float;
    .locals 1

    .line 309
    iget-object v0, p0, Lchristophedelory/rss/media/Content;->_samplingrate:Ljava/lang/Float;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 429
    iget-object v0, p0, Lchristophedelory/rss/media/Content;->_type:Ljava/lang/String;

    return-object v0
.end method

.method public getURL()Ljava/net/URI;
    .locals 1

    .line 190
    iget-object v0, p0, Lchristophedelory/rss/media/Content;->_url:Ljava/net/URI;

    return-object v0
.end method

.method public getURLString()Ljava/lang/String;
    .locals 1

    .line 163
    iget-object v0, p0, Lchristophedelory/rss/media/Content;->_url:Ljava/net/URI;

    if-eqz v0, :cond_0

    .line 165
    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getWidth()Ljava/lang/Integer;
    .locals 1

    .line 335
    iget-object v0, p0, Lchristophedelory/rss/media/Content;->_width:Ljava/lang/Integer;

    return-object v0
.end method

.method public isDefault()Z
    .locals 1

    .line 537
    iget-object v0, p0, Lchristophedelory/rss/media/Content;->_isDefault:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_0
    return v0
.end method

.method public setBitrate(Ljava/lang/Integer;)V
    .locals 0

    .line 239
    iput-object p1, p0, Lchristophedelory/rss/media/Content;->_bitrate:Ljava/lang/Integer;

    return-void
.end method

.method public setChannels(Ljava/lang/Integer;)V
    .locals 0

    .line 371
    iput-object p1, p0, Lchristophedelory/rss/media/Content;->_channels:Ljava/lang/Integer;

    return-void
.end method

.method public setDefault(Z)V
    .locals 0

    .line 548
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/media/Content;->_isDefault:Ljava/lang/Boolean;

    return-void
.end method

.method public setDuration(I)V
    .locals 0

    .line 201
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/media/Content;->_duration:Ljava/lang/Integer;

    return-void
.end method

.method public setDuration(Ljava/lang/Integer;)V
    .locals 0

    .line 212
    iput-object p1, p0, Lchristophedelory/rss/media/Content;->_duration:Ljava/lang/Integer;

    return-void
.end method

.method public setExpression(Ljava/lang/String;)V
    .locals 0

    .line 498
    iput-object p1, p0, Lchristophedelory/rss/media/Content;->_expression:Ljava/lang/String;

    return-void
.end method

.method public setFileSize(Ljava/lang/Long;)V
    .locals 0

    .line 397
    iput-object p1, p0, Lchristophedelory/rss/media/Content;->_fileSize:Ljava/lang/Long;

    return-void
.end method

.method public setFramerate(Ljava/lang/Integer;)V
    .locals 0

    .line 265
    iput-object p1, p0, Lchristophedelory/rss/media/Content;->_framerate:Ljava/lang/Integer;

    return-void
.end method

.method public setHeight(Ljava/lang/Integer;)V
    .locals 0

    .line 345
    iput-object p1, p0, Lchristophedelory/rss/media/Content;->_height:Ljava/lang/Integer;

    return-void
.end method

.method public setIsDefault(Ljava/lang/Boolean;)V
    .locals 0

    .line 578
    iput-object p1, p0, Lchristophedelory/rss/media/Content;->_isDefault:Ljava/lang/Boolean;

    return-void
.end method

.method public setLang(Ljava/lang/String;)V
    .locals 0

    .line 526
    iput-object p1, p0, Lchristophedelory/rss/media/Content;->_lang:Ljava/lang/String;

    return-void
.end method

.method public setMedium(Ljava/lang/String;)V
    .locals 0

    .line 468
    iput-object p1, p0, Lchristophedelory/rss/media/Content;->_medium:Ljava/lang/String;

    return-void
.end method

.method public setSamplingrate(Ljava/lang/Float;)V
    .locals 0

    .line 292
    iput-object p1, p0, Lchristophedelory/rss/media/Content;->_samplingrate:Ljava/lang/Float;

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 439
    iput-object p1, p0, Lchristophedelory/rss/media/Content;->_type:Ljava/lang/String;

    return-void
.end method

.method public setURL(Ljava/net/URI;)V
    .locals 0

    .line 179
    iput-object p1, p0, Lchristophedelory/rss/media/Content;->_url:Ljava/net/URI;

    return-void
.end method

.method public setURLString(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/URISyntaxException;
        }
    .end annotation

    .line 142
    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lchristophedelory/rss/media/Content;->_url:Ljava/net/URI;

    return-void
.end method

.method public setWidth(Ljava/lang/Integer;)V
    .locals 0

    .line 319
    iput-object p1, p0, Lchristophedelory/rss/media/Content;->_width:Ljava/lang/Integer;

    return-void
.end method
