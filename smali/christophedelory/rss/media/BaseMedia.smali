.class public Lchristophedelory/rss/media/BaseMedia;
.super Ljava/lang/Object;
.source "BaseMedia.java"


# instance fields
.field private _mediaAdult:Ljava/lang/Boolean;

.field private final _mediaCategories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lchristophedelory/rss/media/Category;",
            ">;"
        }
    .end annotation
.end field

.field private _mediaCopyright:Lchristophedelory/rss/media/Copyright;

.field private final _mediaCredits:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lchristophedelory/rss/media/Credit;",
            ">;"
        }
    .end annotation
.end field

.field private _mediaDescription:Lchristophedelory/rss/media/Description;

.field private final _mediaHashes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lchristophedelory/rss/media/Hash;",
            ">;"
        }
    .end annotation
.end field

.field private _mediaKeywords:Ljava/lang/String;

.field private _mediaPlayer:Lchristophedelory/rss/media/Player;

.field private final _mediaRatings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lchristophedelory/rss/media/Rating;",
            ">;"
        }
    .end annotation
.end field

.field private final _mediaRestrictions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lchristophedelory/rss/media/Restriction;",
            ">;"
        }
    .end annotation
.end field

.field private final _mediaTexts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lchristophedelory/rss/media/Text;",
            ">;"
        }
    .end annotation
.end field

.field private final _mediaThumbnails:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lchristophedelory/rss/media/Thumbnail;",
            ">;"
        }
    .end annotation
.end field

.field private _mediaTitle:Lchristophedelory/rss/media/Title;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 45
    iput-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaTitle:Lchristophedelory/rss/media/Title;

    .line 50
    iput-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaDescription:Lchristophedelory/rss/media/Description;

    .line 55
    iput-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaPlayer:Lchristophedelory/rss/media/Player;

    .line 60
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaThumbnails:Ljava/util/List;

    .line 65
    iput-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaAdult:Ljava/lang/Boolean;

    .line 70
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaCategories:Ljava/util/List;

    .line 75
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaRatings:Ljava/util/List;

    .line 80
    iput-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaKeywords:Ljava/lang/String;

    .line 85
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaHashes:Ljava/util/List;

    .line 90
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaCredits:Ljava/util/List;

    .line 95
    iput-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaCopyright:Lchristophedelory/rss/media/Copyright;

    .line 100
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaTexts:Ljava/util/List;

    .line 105
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaRestrictions:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public addMediaCategory(Lchristophedelory/rss/media/Category;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 304
    iget-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaCategories:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 301
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no media category"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addMediaCredit(Lchristophedelory/rss/media/Credit;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 437
    iget-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaCredits:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 434
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no media credit"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addMediaHash(Lchristophedelory/rss/media/Hash;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 403
    iget-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaHashes:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 400
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no media hash"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addMediaRating(Lchristophedelory/rss/media/Rating;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 338
    iget-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaRatings:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 335
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no media rating"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addMediaRestriction(Lchristophedelory/rss/media/Restriction;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 531
    iget-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaRestrictions:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 528
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no media restriction"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addMediaText(Lchristophedelory/rss/media/Text;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 497
    iget-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaTexts:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 494
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no media text"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addMediaThumbnail(Lchristophedelory/rss/media/Thumbnail;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 146
    iget-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaThumbnails:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 143
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "no media thumbnail"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getMediaAdult()Ljava/lang/Boolean;
    .locals 1

    .line 257
    iget-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaAdult:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getMediaCategories()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lchristophedelory/rss/media/Category;",
            ">;"
        }
    .end annotation

    .line 288
    iget-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaCategories:Ljava/util/List;

    return-object v0
.end method

.method public getMediaCopyright()Lchristophedelory/rss/media/Copyright;
    .locals 1

    .line 453
    iget-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaCopyright:Lchristophedelory/rss/media/Copyright;

    return-object v0
.end method

.method public getMediaCredits()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lchristophedelory/rss/media/Credit;",
            ">;"
        }
    .end annotation

    .line 421
    iget-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaCredits:Ljava/util/List;

    return-object v0
.end method

.method public getMediaDescription()Lchristophedelory/rss/media/Description;
    .locals 1

    .line 206
    iget-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaDescription:Lchristophedelory/rss/media/Description;

    return-object v0
.end method

.method public getMediaHashes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lchristophedelory/rss/media/Hash;",
            ">;"
        }
    .end annotation

    .line 387
    iget-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaHashes:Ljava/util/List;

    return-object v0
.end method

.method public getMediaKeywords()Ljava/lang/String;
    .locals 1

    .line 359
    iget-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaKeywords:Ljava/lang/String;

    return-object v0
.end method

.method public getMediaPlayer()Lchristophedelory/rss/media/Player;
    .locals 1

    .line 130
    iget-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaPlayer:Lchristophedelory/rss/media/Player;

    return-object v0
.end method

.method public getMediaRatings()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lchristophedelory/rss/media/Rating;",
            ">;"
        }
    .end annotation

    .line 322
    iget-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaRatings:Ljava/util/List;

    return-object v0
.end method

.method public getMediaRestrictions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lchristophedelory/rss/media/Restriction;",
            ">;"
        }
    .end annotation

    .line 515
    iget-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaRestrictions:Ljava/util/List;

    return-object v0
.end method

.method public getMediaTexts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lchristophedelory/rss/media/Text;",
            ">;"
        }
    .end annotation

    .line 481
    iget-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaTexts:Ljava/util/List;

    return-object v0
.end method

.method public getMediaThumbnails()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lchristophedelory/rss/media/Thumbnail;",
            ">;"
        }
    .end annotation

    .line 164
    iget-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaThumbnails:Ljava/util/List;

    return-object v0
.end method

.method public getMediaTitle()Lchristophedelory/rss/media/Title;
    .locals 1

    .line 190
    iget-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaTitle:Lchristophedelory/rss/media/Title;

    return-object v0
.end method

.method public isMediaAdult()Z
    .locals 1

    .line 227
    iget-object v0, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaAdult:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_0
    return v0
.end method

.method public setMediaAdult(Ljava/lang/Boolean;)V
    .locals 0

    .line 268
    iput-object p1, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaAdult:Ljava/lang/Boolean;

    return-void
.end method

.method public setMediaAdult(Z)V
    .locals 0

    .line 238
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaAdult:Ljava/lang/Boolean;

    return-void
.end method

.method public setMediaCopyright(Lchristophedelory/rss/media/Copyright;)V
    .locals 0

    .line 463
    iput-object p1, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaCopyright:Lchristophedelory/rss/media/Copyright;

    return-void
.end method

.method public setMediaDescription(Lchristophedelory/rss/media/Description;)V
    .locals 0

    .line 216
    iput-object p1, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaDescription:Lchristophedelory/rss/media/Description;

    return-void
.end method

.method public setMediaKeywords(Ljava/lang/String;)V
    .locals 0

    .line 369
    iput-object p1, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaKeywords:Ljava/lang/String;

    return-void
.end method

.method public setMediaPlayer(Lchristophedelory/rss/media/Player;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaPlayer:Lchristophedelory/rss/media/Player;

    return-void
.end method

.method public setMediaTitle(Lchristophedelory/rss/media/Title;)V
    .locals 0

    .line 174
    iput-object p1, p0, Lchristophedelory/rss/media/BaseMedia;->_mediaTitle:Lchristophedelory/rss/media/Title;

    return-void
.end method
