.class public Lcom/mpatric/mp3agic/ID3Wrapper;
.super Ljava/lang/Object;
.source "ID3Wrapper.java"


# instance fields
.field private final id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

.field private final id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;


# direct methods
.method public constructor <init>(Lcom/mpatric/mp3agic/ID3v1;Lcom/mpatric/mp3agic/ID3v2;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

    .line 10
    iput-object p2, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    return-void
.end method


# virtual methods
.method public clearComment()V
    .locals 2

    .line 285
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    const-string v1, "COMM"

    .line 286
    invoke-interface {v0, v1}, Lcom/mpatric/mp3agic/ID3v2;->clearFrameSet(Ljava/lang/String;)V

    .line 288
    :cond_0
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 289
    invoke-interface {v0, v1}, Lcom/mpatric/mp3agic/ID3v1;->setComment(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public clearCopyright()V
    .locals 2

    .line 294
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    const-string v1, "TCOP"

    .line 295
    invoke-interface {v0, v1}, Lcom/mpatric/mp3agic/ID3v2;->clearFrameSet(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public clearEncoder()V
    .locals 2

    .line 300
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    const-string v1, "TENC"

    .line 301
    invoke-interface {v0, v1}, Lcom/mpatric/mp3agic/ID3v2;->clearFrameSet(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public getAlbum()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getAlbum()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getAlbum()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 80
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getAlbum()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 81
    :cond_0
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

    if-eqz v0, :cond_1

    .line 82
    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v1;->getAlbum()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getAlbumArtist()Ljava/lang/String;
    .locals 1

    .line 199
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    .line 200
    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getAlbumArtist()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getAlbumImage()[B
    .locals 1

    .line 249
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    .line 250
    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getAlbumImage()[B

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getAlbumImageMimeType()Ljava/lang/String;
    .locals 1

    .line 263
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    .line 264
    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getAlbumImageMimeType()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getArtist()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getArtist()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getArtist()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 42
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getArtist()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 43
    :cond_0
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

    if-eqz v0, :cond_1

    .line 44
    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v1;->getArtist()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getComment()Ljava/lang/String;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getComment()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getComment()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 147
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getComment()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 148
    :cond_0
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

    if-eqz v0, :cond_1

    .line 149
    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v1;->getComment()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getComposer()Ljava/lang/String;
    .locals 1

    .line 165
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    .line 166
    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getComposer()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getCopyright()Ljava/lang/String;
    .locals 1

    .line 207
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    .line 208
    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getCopyright()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getEncoder()Ljava/lang/String;
    .locals 1

    .line 235
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    .line 236
    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getEncoder()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getGenre()I
    .locals 2

    .line 117
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v1;->getGenre()I

    move-result v0

    if-eq v0, v1, :cond_0

    .line 118
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v1;->getGenre()I

    move-result v0

    return v0

    .line 119
    :cond_0
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_1

    .line 120
    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getGenre()I

    move-result v0

    return v0

    :cond_1
    return v1
.end method

.method public getGenreDescription()Ljava/lang/String;
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

    if-eqz v0, :cond_0

    .line 137
    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v1;->getGenreDescription()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 138
    :cond_0
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_1

    .line 139
    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getGenreDescription()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getId3v1Tag()Lcom/mpatric/mp3agic/ID3v1;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

    return-object v0
.end method

.method public getId3v2Tag()Lcom/mpatric/mp3agic/ID3v2;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    return-object v0
.end method

.method public getLyrics()Ljava/lang/String;
    .locals 1

    .line 277
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    .line 278
    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getLyrics()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getOriginalArtist()Ljava/lang/String;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    .line 180
    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getOriginalArtist()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getTitle()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 62
    :cond_0
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

    if-eqz v0, :cond_1

    .line 63
    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v1;->getTitle()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getTrack()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getTrack()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getTrack()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 23
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getTrack()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

    if-eqz v0, :cond_1

    .line 25
    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v1;->getTrack()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    .line 222
    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getYear()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getYear()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getYear()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 99
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v2;->getYear()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 100
    :cond_0
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

    if-eqz v0, :cond_1

    .line 101
    invoke-interface {v0}, Lcom/mpatric/mp3agic/ID3v1;->getYear()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public setAlbum(Ljava/lang/String;)V
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    .line 90
    invoke-interface {v0, p1}, Lcom/mpatric/mp3agic/ID3v2;->setAlbum(Ljava/lang/String;)V

    .line 92
    :cond_0
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

    if-eqz v0, :cond_1

    .line 93
    invoke-interface {v0, p1}, Lcom/mpatric/mp3agic/ID3v1;->setAlbum(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public setAlbumArtist(Ljava/lang/String;)V
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    .line 194
    invoke-interface {v0, p1}, Lcom/mpatric/mp3agic/ID3v2;->setAlbumArtist(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setAlbumImage([BLjava/lang/String;)V
    .locals 1

    .line 257
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    .line 258
    invoke-interface {v0, p1, p2}, Lcom/mpatric/mp3agic/ID3v2;->setAlbumImage([BLjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setArtist(Ljava/lang/String;)V
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    .line 52
    invoke-interface {v0, p1}, Lcom/mpatric/mp3agic/ID3v2;->setArtist(Ljava/lang/String;)V

    .line 54
    :cond_0
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

    if-eqz v0, :cond_1

    .line 55
    invoke-interface {v0, p1}, Lcom/mpatric/mp3agic/ID3v1;->setArtist(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public setComment(Ljava/lang/String;)V
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    .line 157
    invoke-interface {v0, p1}, Lcom/mpatric/mp3agic/ID3v2;->setComment(Ljava/lang/String;)V

    .line 159
    :cond_0
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

    if-eqz v0, :cond_1

    .line 160
    invoke-interface {v0, p1}, Lcom/mpatric/mp3agic/ID3v1;->setComment(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public setComposer(Ljava/lang/String;)V
    .locals 1

    .line 173
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    .line 174
    invoke-interface {v0, p1}, Lcom/mpatric/mp3agic/ID3v2;->setComposer(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setCopyright(Ljava/lang/String;)V
    .locals 1

    .line 215
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    .line 216
    invoke-interface {v0, p1}, Lcom/mpatric/mp3agic/ID3v2;->setCopyright(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setEncoder(Ljava/lang/String;)V
    .locals 1

    .line 243
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    .line 244
    invoke-interface {v0, p1}, Lcom/mpatric/mp3agic/ID3v2;->setEncoder(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setGenre(I)V
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    .line 128
    invoke-interface {v0, p1}, Lcom/mpatric/mp3agic/ID3v2;->setGenre(I)V

    .line 130
    :cond_0
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

    if-eqz v0, :cond_1

    .line 131
    invoke-interface {v0, p1}, Lcom/mpatric/mp3agic/ID3v1;->setGenre(I)V

    :cond_1
    return-void
.end method

.method public setLyrics(Ljava/lang/String;)V
    .locals 1

    .line 271
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    .line 272
    invoke-interface {v0, p1}, Lcom/mpatric/mp3agic/ID3v2;->setLyrics(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setOriginalArtist(Ljava/lang/String;)V
    .locals 1

    .line 187
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    .line 188
    invoke-interface {v0, p1}, Lcom/mpatric/mp3agic/ID3v2;->setOriginalArtist(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    .line 71
    invoke-interface {v0, p1}, Lcom/mpatric/mp3agic/ID3v2;->setTitle(Ljava/lang/String;)V

    .line 73
    :cond_0
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

    if-eqz v0, :cond_1

    .line 74
    invoke-interface {v0, p1}, Lcom/mpatric/mp3agic/ID3v1;->setTitle(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public setTrack(Ljava/lang/String;)V
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    .line 33
    invoke-interface {v0, p1}, Lcom/mpatric/mp3agic/ID3v2;->setTrack(Ljava/lang/String;)V

    .line 35
    :cond_0
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

    if-eqz v0, :cond_1

    .line 36
    invoke-interface {v0, p1}, Lcom/mpatric/mp3agic/ID3v1;->setTrack(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 1

    .line 229
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    .line 230
    invoke-interface {v0, p1}, Lcom/mpatric/mp3agic/ID3v2;->setUrl(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setYear(Ljava/lang/String;)V
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v2Tag:Lcom/mpatric/mp3agic/ID3v2;

    if-eqz v0, :cond_0

    .line 109
    invoke-interface {v0, p1}, Lcom/mpatric/mp3agic/ID3v2;->setYear(Ljava/lang/String;)V

    .line 111
    :cond_0
    iget-object v0, p0, Lcom/mpatric/mp3agic/ID3Wrapper;->id3v1Tag:Lcom/mpatric/mp3agic/ID3v1;

    if-eqz v0, :cond_1

    .line 112
    invoke-interface {v0, p1}, Lcom/mpatric/mp3agic/ID3v1;->setYear(Ljava/lang/String;)V

    :cond_1
    return-void
.end method
