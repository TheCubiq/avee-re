.class public Lchristophedelory/rss/media/Text;
.super Ljava/lang/Object;
.source "Text.java"


# instance fields
.field private _end:Ljava/lang/String;

.field private _lang:Ljava/lang/String;

.field private _start:Ljava/lang/String;

.field private _type:Ljava/lang/String;

.field private _value:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 47
    iput-object v0, p0, Lchristophedelory/rss/media/Text;->_type:Ljava/lang/String;

    .line 52
    iput-object v0, p0, Lchristophedelory/rss/media/Text;->_lang:Ljava/lang/String;

    .line 57
    iput-object v0, p0, Lchristophedelory/rss/media/Text;->_start:Ljava/lang/String;

    .line 62
    iput-object v0, p0, Lchristophedelory/rss/media/Text;->_end:Ljava/lang/String;

    .line 67
    iput-object v0, p0, Lchristophedelory/rss/media/Text;->_value:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getEnd()Ljava/lang/String;
    .locals 1

    .line 196
    iget-object v0, p0, Lchristophedelory/rss/media/Text;->_end:Ljava/lang/String;

    return-object v0
.end method

.method public getLang()Ljava/lang/String;
    .locals 1

    .line 140
    iget-object v0, p0, Lchristophedelory/rss/media/Text;->_lang:Ljava/lang/String;

    return-object v0
.end method

.method public getStart()Ljava/lang/String;
    .locals 1

    .line 168
    iget-object v0, p0, Lchristophedelory/rss/media/Text;->_start:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 112
    iget-object v0, p0, Lchristophedelory/rss/media/Text;->_type:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lchristophedelory/rss/media/Text;->_value:Ljava/lang/String;

    return-object v0
.end method

.method public setEnd(Ljava/lang/String;)V
    .locals 0

    .line 206
    iput-object p1, p0, Lchristophedelory/rss/media/Text;->_end:Ljava/lang/String;

    return-void
.end method

.method public setLang(Ljava/lang/String;)V
    .locals 0

    .line 150
    iput-object p1, p0, Lchristophedelory/rss/media/Text;->_lang:Ljava/lang/String;

    return-void
.end method

.method public setStart(Ljava/lang/String;)V
    .locals 0

    .line 178
    iput-object p1, p0, Lchristophedelory/rss/media/Text;->_start:Ljava/lang/String;

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lchristophedelory/rss/media/Text;->_type:Ljava/lang/String;

    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .line 94
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lchristophedelory/rss/media/Text;->_value:Ljava/lang/String;

    return-void
.end method
