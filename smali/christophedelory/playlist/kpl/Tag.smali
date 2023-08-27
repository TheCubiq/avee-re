.class public Lchristophedelory/playlist/kpl/Tag;
.super Ljava/lang/Object;
.source "Tag.java"


# instance fields
.field private _album:Ljava/lang/String;

.field private _artist:Ljava/lang/String;

.field private _comment:Ljava/lang/String;

.field private _genre:Ljava/lang/String;

.field private _gid:Ljava/lang/String;

.field private _has_tag:Ljava/lang/String;

.field private _title:Ljava/lang/String;

.field private _track:Ljava/lang/String;

.field private _year:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 40
    iput-object v0, p0, Lchristophedelory/playlist/kpl/Tag;->_artist:Ljava/lang/String;

    .line 45
    iput-object v0, p0, Lchristophedelory/playlist/kpl/Tag;->_album:Ljava/lang/String;

    .line 50
    iput-object v0, p0, Lchristophedelory/playlist/kpl/Tag;->_title:Ljava/lang/String;

    .line 55
    iput-object v0, p0, Lchristophedelory/playlist/kpl/Tag;->_year:Ljava/lang/String;

    .line 60
    iput-object v0, p0, Lchristophedelory/playlist/kpl/Tag;->_comment:Ljava/lang/String;

    .line 65
    iput-object v0, p0, Lchristophedelory/playlist/kpl/Tag;->_genre:Ljava/lang/String;

    .line 70
    iput-object v0, p0, Lchristophedelory/playlist/kpl/Tag;->_track:Ljava/lang/String;

    .line 75
    iput-object v0, p0, Lchristophedelory/playlist/kpl/Tag;->_gid:Ljava/lang/String;

    const-string v0, "True"

    .line 80
    iput-object v0, p0, Lchristophedelory/playlist/kpl/Tag;->_has_tag:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAlbum()Ljava/lang/String;
    .locals 1

    .line 109
    iget-object v0, p0, Lchristophedelory/playlist/kpl/Tag;->_album:Ljava/lang/String;

    return-object v0
.end method

.method public getArtist()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lchristophedelory/playlist/kpl/Tag;->_artist:Ljava/lang/String;

    return-object v0
.end method

.method public getComment()Ljava/lang/String;
    .locals 1

    .line 169
    iget-object v0, p0, Lchristophedelory/playlist/kpl/Tag;->_comment:Ljava/lang/String;

    return-object v0
.end method

.method public getGenre()Ljava/lang/String;
    .locals 1

    .line 189
    iget-object v0, p0, Lchristophedelory/playlist/kpl/Tag;->_genre:Ljava/lang/String;

    return-object v0
.end method

.method public getGid()Ljava/lang/String;
    .locals 1

    .line 229
    iget-object v0, p0, Lchristophedelory/playlist/kpl/Tag;->_gid:Ljava/lang/String;

    return-object v0
.end method

.method public getHasTag()Ljava/lang/String;
    .locals 1

    .line 249
    iget-object v0, p0, Lchristophedelory/playlist/kpl/Tag;->_has_tag:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 129
    iget-object v0, p0, Lchristophedelory/playlist/kpl/Tag;->_title:Ljava/lang/String;

    return-object v0
.end method

.method public getTrack()Ljava/lang/String;
    .locals 1

    .line 209
    iget-object v0, p0, Lchristophedelory/playlist/kpl/Tag;->_track:Ljava/lang/String;

    return-object v0
.end method

.method public getYear()Ljava/lang/String;
    .locals 1

    .line 149
    iget-object v0, p0, Lchristophedelory/playlist/kpl/Tag;->_year:Ljava/lang/String;

    return-object v0
.end method

.method public setAlbum(Ljava/lang/String;)V
    .locals 0

    .line 119
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/playlist/kpl/Tag;->_album:Ljava/lang/String;

    return-void
.end method

.method public setArtist(Ljava/lang/String;)V
    .locals 0

    .line 99
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/playlist/kpl/Tag;->_artist:Ljava/lang/String;

    return-void
.end method

.method public setComment(Ljava/lang/String;)V
    .locals 0

    .line 179
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/playlist/kpl/Tag;->_comment:Ljava/lang/String;

    return-void
.end method

.method public setGenre(Ljava/lang/String;)V
    .locals 0

    .line 199
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/playlist/kpl/Tag;->_genre:Ljava/lang/String;

    return-void
.end method

.method public setGid(Ljava/lang/String;)V
    .locals 0

    .line 239
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/playlist/kpl/Tag;->_gid:Ljava/lang/String;

    return-void
.end method

.method public setHasTag(Ljava/lang/String;)V
    .locals 0

    .line 259
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/playlist/kpl/Tag;->_has_tag:Ljava/lang/String;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 139
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/playlist/kpl/Tag;->_title:Ljava/lang/String;

    return-void
.end method

.method public setTrack(Ljava/lang/String;)V
    .locals 0

    .line 219
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/playlist/kpl/Tag;->_track:Ljava/lang/String;

    return-void
.end method

.method public setYear(Ljava/lang/String;)V
    .locals 0

    .line 159
    invoke-static {p1}, Lchristophedelory/lang/StringUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/playlist/kpl/Tag;->_year:Ljava/lang/String;

    return-void
.end method
