.class public Lchristophedelory/rss/media/Credit;
.super Ljava/lang/Object;
.source "Credit.java"


# instance fields
.field private _role:Ljava/lang/String;

.field private _scheme:Ljava/lang/String;

.field private _value:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 46
    iput-object v0, p0, Lchristophedelory/rss/media/Credit;->_scheme:Ljava/lang/String;

    .line 51
    iput-object v0, p0, Lchristophedelory/rss/media/Credit;->_role:Ljava/lang/String;

    .line 56
    iput-object v0, p0, Lchristophedelory/rss/media/Credit;->_value:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getRole()Ljava/lang/String;
    .locals 1

    .line 153
    iget-object v0, p0, Lchristophedelory/rss/media/Credit;->_role:Ljava/lang/String;

    return-object v0
.end method

.method public getScheme()Ljava/lang/String;
    .locals 1

    .line 100
    iget-object v0, p0, Lchristophedelory/rss/media/Credit;->_scheme:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Lchristophedelory/rss/media/Credit;->_value:Ljava/lang/String;

    return-object v0
.end method

.method public setRole(Ljava/lang/String;)V
    .locals 0

    .line 163
    iput-object p1, p0, Lchristophedelory/rss/media/Credit;->_role:Ljava/lang/String;

    return-void
.end method

.method public setScheme(Ljava/lang/String;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lchristophedelory/rss/media/Credit;->_scheme:Ljava/lang/String;

    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .line 82
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/media/Credit;->_value:Ljava/lang/String;

    return-void
.end method
