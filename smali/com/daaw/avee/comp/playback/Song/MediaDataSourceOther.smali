.class public Lcom/daaw/avee/comp/playback/Song/MediaDataSourceOther;
.super Ljava/lang/Object;
.source "MediaDataSourceOther.java"

# interfaces
.implements Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;


# instance fields
.field private final contentType:I

.field private final uriString:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/net/Uri;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/Song/MediaDataSourceOther;->uriString:Landroid/net/Uri;

    .line 17
    invoke-static {p1}, Lcom/daaw/avee/comp/playback/Song/MediaDataSourceOther;->detectContentType(Landroid/net/Uri;)I

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/playback/Song/MediaDataSourceOther;->contentType:I

    return-void
.end method

.method public static detectContentType(Landroid/net/Uri;)I
    .locals 3

    .line 22
    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x3

    if-eqz p0, :cond_4

    const-string v1, "."

    .line 25
    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    add-int/2addr v1, v2

    .line 27
    :try_start_0
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p0, ""

    .line 31
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    const-string v1, "mpd"

    .line 36
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const-string v1, "ism"

    .line 37
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    return v2

    :cond_1
    const-string v1, "isml"

    .line 38
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    const-string v1, "flv"

    .line 42
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    return v0

    :cond_3
    const-string v1, "m3u8"

    .line 44
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    const/4 p0, 0x2

    return p0

    :cond_4
    return v0
.end method


# virtual methods
.method public getContentId()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getContentType()I
    .locals 1

    .line 53
    iget v0, p0, Lcom/daaw/avee/comp/playback/Song/MediaDataSourceOther;->contentType:I

    return v0
.end method

.method public getContentUri()Landroid/net/Uri;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/Song/MediaDataSourceOther;->uriString:Landroid/net/Uri;

    return-object v0
.end method

.method public getProviderDASH()Ljava/lang/String;
    .locals 1

    const-string v0, "widevine_test"

    return-object v0
.end method
