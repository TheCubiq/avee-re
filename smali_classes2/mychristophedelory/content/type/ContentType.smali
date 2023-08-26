.class public Lmychristophedelory/content/type/ContentType;
.super Ljava/lang/Object;
.source "ContentType.java"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private _description:Ljava/lang/String;

.field private final _extensions:[Ljava/lang/String;

.field private final _mimeTypes:[Ljava/lang/String;

.field private final _playerSupports:[Lchristophedelory/player/PlayerSupport;


# direct methods
.method public constructor <init>([Ljava/lang/String;[Ljava/lang/String;[Lchristophedelory/player/PlayerSupport;Ljava/lang/String;)V
    .locals 5

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    array-length v0, p1

    if-lez v0, :cond_4

    .line 86
    array-length v0, p2

    if-lez v0, :cond_3

    .line 91
    array-length v0, p1

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lmychristophedelory/content/type/ContentType;->_extensions:[Ljava/lang/String;

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 93
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    .line 95
    iget-object v2, p0, Lmychristophedelory/content/type/ContentType;->_extensions:[Ljava/lang/String;

    aget-object v3, p1, v1

    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 98
    :cond_0
    array-length p1, p2

    new-array p1, p1, [Ljava/lang/String;

    iput-object p1, p0, Lmychristophedelory/content/type/ContentType;->_mimeTypes:[Ljava/lang/String;

    const/4 p1, 0x0

    .line 100
    :goto_1
    array-length v1, p2

    if-ge p1, v1, :cond_1

    .line 102
    iget-object v1, p0, Lmychristophedelory/content/type/ContentType;->_mimeTypes:[Ljava/lang/String;

    aget-object v2, p2, p1

    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 105
    :cond_1
    iput-object p4, p0, Lmychristophedelory/content/type/ContentType;->_description:Ljava/lang/String;

    if-nez p3, :cond_2

    new-array p1, v0, [Lchristophedelory/player/PlayerSupport;

    goto :goto_2

    .line 106
    :cond_2
    invoke-virtual {p3}, [Lchristophedelory/player/PlayerSupport;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lchristophedelory/player/PlayerSupport;

    :goto_2
    iput-object p1, p0, Lmychristophedelory/content/type/ContentType;->_playerSupports:[Lchristophedelory/player/PlayerSupport;

    return-void

    .line 88
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Empty MIME type array"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 83
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Empty extension array"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method


# virtual methods
.method public accept(Ljava/io/File;)Z
    .locals 1

    .line 194
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lmychristophedelory/content/type/ContentType;->matchExtension(Ljava/lang/String;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 207
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 146
    iget-object v0, p0, Lmychristophedelory/content/type/ContentType;->_description:Ljava/lang/String;

    return-object v0
.end method

.method public getExtensions()[Ljava/lang/String;
    .locals 1

    .line 116
    iget-object v0, p0, Lmychristophedelory/content/type/ContentType;->_extensions:[Ljava/lang/String;

    invoke-virtual {v0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public getMimeTypes()[Ljava/lang/String;
    .locals 1

    .line 125
    iget-object v0, p0, Lmychristophedelory/content/type/ContentType;->_mimeTypes:[Ljava/lang/String;

    invoke-virtual {v0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public getPlayerSupports()[Lchristophedelory/player/PlayerSupport;
    .locals 1

    .line 135
    iget-object v0, p0, Lmychristophedelory/content/type/ContentType;->_playerSupports:[Lchristophedelory/player/PlayerSupport;

    invoke-virtual {v0}, [Lchristophedelory/player/PlayerSupport;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lchristophedelory/player/PlayerSupport;

    return-object v0
.end method

.method public matchExtension(Ljava/lang/String;)Z
    .locals 6

    .line 171
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    .line 174
    iget-object v0, p0, Lmychristophedelory/content/type/ContentType;->_extensions:[Ljava/lang/String;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v5, v0, v3

    if-nez v4, :cond_1

    .line 176
    invoke-virtual {p1, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v4, 0x1

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v4
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 156
    iput-object p1, p0, Lmychristophedelory/content/type/ContentType;->_description:Ljava/lang/String;

    return-void
.end method
