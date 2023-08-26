.class public Lchristophedelory/rss/media/Rating;
.super Ljava/lang/Object;
.source "Rating.java"


# instance fields
.field private _scheme:Ljava/lang/String;

.field private _value:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 47
    iput-object v0, p0, Lchristophedelory/rss/media/Rating;->_scheme:Ljava/lang/String;

    .line 52
    iput-object v0, p0, Lchristophedelory/rss/media/Rating;->_value:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getScheme()Ljava/lang/String;
    .locals 1

    .line 95
    iget-object v0, p0, Lchristophedelory/rss/media/Rating;->_scheme:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lchristophedelory/rss/media/Rating;->_value:Ljava/lang/String;

    return-object v0
.end method

.method public setScheme(Ljava/lang/String;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lchristophedelory/rss/media/Rating;->_scheme:Ljava/lang/String;

    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .line 78
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/media/Rating;->_value:Ljava/lang/String;

    return-void
.end method
