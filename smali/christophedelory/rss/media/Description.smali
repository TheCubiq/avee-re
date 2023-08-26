.class public Lchristophedelory/rss/media/Description;
.super Ljava/lang/Object;
.source "Description.java"


# instance fields
.field private _type:Ljava/lang/String;

.field private _value:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 42
    iput-object v0, p0, Lchristophedelory/rss/media/Description;->_type:Ljava/lang/String;

    .line 47
    iput-object v0, p0, Lchristophedelory/rss/media/Description;->_value:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getType()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Lchristophedelory/rss/media/Description;->_type:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lchristophedelory/rss/media/Description;->_value:Ljava/lang/String;

    return-object v0
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lchristophedelory/rss/media/Description;->_type:Ljava/lang/String;

    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .line 57
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/media/Description;->_value:Ljava/lang/String;

    return-void
.end method
