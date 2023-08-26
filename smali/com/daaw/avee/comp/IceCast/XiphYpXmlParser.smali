.class public Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;
.super Ljava/lang/Object;
.source "XiphYpXmlParser.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser$EntryFactory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "V::",
        "Ljava/util/List<",
        "TT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final ns:Ljava/lang/String;


# instance fields
.field private entryFactory:Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser$EntryFactory;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser$EntryFactory<",
            "TT;>;"
        }
    .end annotation
.end field

.field private listFactory:Lcom/daaw/avee/Common/Func/Func;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Func/Func<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser$EntryFactory;Lcom/daaw/avee/Common/Func/Func;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser$EntryFactory<",
            "TT;>;",
            "Lcom/daaw/avee/Common/Func/Func<",
            "TV;>;)V"
        }
    .end annotation

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;->entryFactory:Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser$EntryFactory;

    .line 36
    iput-object p2, p0, Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;->listFactory:Lcom/daaw/avee/Common/Func/Func;

    return-void
.end method

.method private readEntry(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 73
    sget-object v0, Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;->ns:Ljava/lang/String;

    const/4 v1, 0x2

    const-string v2, "entry"

    invoke-interface {p1, v1, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    move-object v2, v0

    move-object v3, v2

    move-object v4, v3

    .line 80
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v5

    const/4 v6, 0x3

    if-eq v5, v6, :cond_5

    .line 81
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v5

    if-eq v5, v1, :cond_0

    goto :goto_0

    .line 84
    :cond_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "server_name"

    .line 85
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 86
    invoke-direct {p0, p1, v5}, Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;->readTitle(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v6, "listen_url"

    .line 87
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 88
    invoke-direct {p0, p1, v5}, Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;->readTitle(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_2
    const-string v6, "bitrate"

    .line 89
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 90
    invoke-direct {p0, p1, v5}, Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;->readTitle(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_3
    const-string v6, "genre"

    .line 91
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 92
    invoke-direct {p0, p1, v5}, Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;->readTitle(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 94
    :cond_4
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;->skip(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_0

    .line 97
    :cond_5
    iget-object p1, p0, Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;->entryFactory:Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser$EntryFactory;

    invoke-static {v3}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v0, v2, v1, v4}, Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser$EntryFactory;->createEntry(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private readFeed(Lorg/xmlpull/v1/XmlPullParser;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            ")TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;->listFactory:Lcom/daaw/avee/Common/Func/Func;

    invoke-interface {v0}, Lcom/daaw/avee/Common/Func/Func;->onInvoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 54
    sget-object v1, Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;->ns:Ljava/lang/String;

    const/4 v2, 0x2

    const-string v3, "directory"

    invoke-interface {p1, v2, v1, v3}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 55
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    const/4 v3, 0x3

    if-eq v1, v3, :cond_2

    .line 56
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v1

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 59
    :cond_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v3, "entry"

    .line 61
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 62
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;->readEntry(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 64
    :cond_1
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;->skip(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private readText(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 135
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 136
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v0

    .line 137
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method private readTitle(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 102
    sget-object v0, Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;->ns:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-interface {p1, v1, v0, p2}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 103
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;->readText(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;

    move-result-object v0

    .line 104
    sget-object v1, Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;->ns:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-interface {p1, v2, v1, p2}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private skip(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 143
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_2

    .line 148
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2

    if-eq v2, v1, :cond_1

    const/4 v3, 0x3

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void

    .line 144
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method


# virtual methods
.method public parse(Ljava/io/InputStream;Lcom/daaw/avee/Common/StatusMsg;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "Lcom/daaw/avee/Common/StatusMsg;",
            ")TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 41
    :try_start_0
    invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object p2

    const-string v0, "http://xmlpull.org/v1/doc/features.html#process-namespaces"

    const/4 v1, 0x0

    .line 42
    invoke-interface {p2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->setFeature(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    .line 43
    invoke-interface {p2, p1, v0}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 44
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    .line 45
    invoke-direct {p0, p2}, Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser;->readFeed(Lorg/xmlpull/v1/XmlPullParser;)Ljava/util/List;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    return-object p2

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    throw p2
.end method
