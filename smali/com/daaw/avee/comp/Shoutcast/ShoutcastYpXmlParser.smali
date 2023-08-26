.class public Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;
.super Ljava/lang/Object;
.source "ShoutcastYpXmlParser.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$ReadElementListener;,
        Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactoryStation;,
        Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<G:",
        "Ljava/lang/Object;",
        "G",
        "List::Ljava/util/List<",
        "TG;>;TStation:",
        "Ljava/lang/Object;",
        "VStation::",
        "Ljava/util/List<",
        "TTStation;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field static debug:Z = false

.field private static final ns:Ljava/lang/String;


# instance fields
.field private entryFactory:Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactory;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactory<",
            "TG;>;"
        }
    .end annotation
.end field

.field private entryFactoryStation:Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactoryStation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactoryStation<",
            "TTStation;>;"
        }
    .end annotation
.end field

.field private listFactory:Lcom/daaw/avee/Common/Func/Func1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Func/Func1<",
            "TG;TG",
            "List;",
            ">;"
        }
    .end annotation
.end field

.field private listFactoryStation:Lcom/daaw/avee/Common/Func/Func;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Func/Func<",
            "TVStation;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactory;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactoryStation;Lcom/daaw/avee/Common/Func/Func;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactory<",
            "TG;>;",
            "Lcom/daaw/avee/Common/Func/Func1<",
            "TG;TG",
            "List;",
            ">;",
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactoryStation<",
            "TTStation;>;",
            "Lcom/daaw/avee/Common/Func/Func<",
            "TVStation;>;)V"
        }
    .end annotation

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->entryFactory:Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactory;

    .line 54
    iput-object p2, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->listFactory:Lcom/daaw/avee/Common/Func/Func1;

    .line 55
    iput-object p3, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->entryFactoryStation:Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactoryStation;

    .line 56
    iput-object p4, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->listFactoryStation:Lcom/daaw/avee/Common/Func/Func;

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 21
    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->readGenrelist(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 21
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->readStationlist(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;)V

    return-void
.end method

.method private readData(Lorg/xmlpull/v1/XmlPullParser;Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$ReadElementListener;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$ReadElementListener<",
            "Ljava/lang/String;",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 221
    sget-object v0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->ns:Ljava/lang/String;

    const/4 v1, 0x2

    const-string v2, "data"

    invoke-interface {p1, v1, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 222
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    .line 223
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 226
    :cond_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    .line 231
    invoke-interface {p2, v0, p1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$ReadElementListener;->Invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 234
    :cond_1
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->skip(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private readEntry(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "TG",
            "List;",
            ")TG;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 268
    sget-object p2, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->ns:Ljava/lang/String;

    const/4 v0, 0x2

    const-string v1, "genre"

    invoke-interface {p1, v0, p2, v1}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 270
    sget-object p2, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->ns:Ljava/lang/String;

    const-string v1, "name"

    invoke-interface {p1, p2, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 271
    sget-object v1, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->ns:Ljava/lang/String;

    const-string v2, "id"

    invoke-interface {p1, v1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 273
    iget-object v2, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->entryFactory:Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactory;

    invoke-interface {v2, p2, v1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactory;->createEntry(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    .line 274
    iget-object v1, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->listFactory:Lcom/daaw/avee/Common/Func/Func1;

    invoke-interface {v1, p2}, Lcom/daaw/avee/Common/Func/Func1;->onInvoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 276
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2

    const/4 v3, 0x3

    if-eq v2, v3, :cond_2

    .line 277
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v2

    if-eq v2, v0, :cond_0

    goto :goto_0

    .line 280
    :cond_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "genrelist"

    .line 282
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    .line 283
    invoke-direct {p0, p1, v1, v2}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->readGenrelist(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Ljava/util/List;)V

    goto :goto_0

    .line 285
    :cond_1
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->skip(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_0

    :cond_2
    return-object p2
.end method

.method private readGenrelist(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "TG",
            "List;",
            "TG",
            "List;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 243
    sget-object p3, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->ns:Ljava/lang/String;

    const/4 v0, 0x2

    const-string v1, "genrelist"

    invoke-interface {p1, v0, p3, v1}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 244
    :cond_0
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result p3

    const/4 v1, 0x3

    if-eq p3, v1, :cond_3

    .line 245
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result p3

    if-eq p3, v0, :cond_1

    goto :goto_0

    .line 248
    :cond_1
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object p3

    const-string v1, "genre"

    .line 250
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    const/4 p3, 0x0

    .line 252
    invoke-direct {p0, p1, p3}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->readEntry(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;)Ljava/lang/Object;

    move-result-object p3

    if-eqz p2, :cond_0

    .line 253
    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 255
    :cond_2
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->skip(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method private readResponse(Lorg/xmlpull/v1/XmlPullParser;Lcom/daaw/avee/Common/StatusMsg;Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$ReadElementListener;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "Lcom/daaw/avee/Common/StatusMsg;",
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$ReadElementListener<",
            "Ljava/lang/String;",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 190
    sget-object v0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->ns:Ljava/lang/String;

    const/4 v1, 0x2

    const-string v2, "response"

    invoke-interface {p1, v1, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    move-object v2, v0

    .line 196
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    const/4 v4, 0x3

    if-eq v3, v4, :cond_4

    .line 197
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v3

    if-eq v3, v1, :cond_0

    goto :goto_0

    .line 200
    :cond_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "statusCode"

    .line 202
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 203
    invoke-direct {p0, p1, v3}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->readTitle(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v4, "statusText"

    .line 204
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 205
    invoke-direct {p0, p1, v3}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->readTitle(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_2
    const-string v4, "data"

    .line 206
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 207
    invoke-direct {p0, p1, p3}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->readData(Lorg/xmlpull/v1/XmlPullParser;Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$ReadElementListener;)V

    goto :goto_0

    .line 209
    :cond_3
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->skip(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_0

    :cond_4
    if-eqz v0, :cond_5

    const-string p1, "200"

    .line 213
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 214
    invoke-virtual {p2, v2}, Lcom/daaw/avee/Common/StatusMsg;->addCriticalError(Ljava/lang/String;)V

    :cond_5
    return-void
.end method

.method private readStation(Lorg/xmlpull/v1/XmlPullParser;[Ljava/lang/String;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "[",
            "Ljava/lang/String;",
            ")TTStation;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 350
    sget-object v0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->ns:Ljava/lang/String;

    const-string v1, "station"

    const/4 v2, 0x2

    invoke-interface {p1, v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 352
    sget-object v0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->ns:Ljava/lang/String;

    const-string v2, "name"

    invoke-interface {p1, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 353
    sget-object v0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->ns:Ljava/lang/String;

    const-string v2, "id"

    invoke-interface {p1, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 354
    sget-object v0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->ns:Ljava/lang/String;

    const-string v2, "br"

    invoke-interface {p1, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;I)I

    move-result v6

    .line 355
    sget-object v0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->ns:Ljava/lang/String;

    const-string v2, "genre"

    invoke-interface {p1, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 356
    sget-object v0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->ns:Ljava/lang/String;

    const-string v2, "ct"

    invoke-interface {p1, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 358
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    .line 359
    sget-object v0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->ns:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-interface {p1, v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 374
    iget-object v3, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->entryFactoryStation:Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactoryStation;

    move-object v9, p2

    invoke-interface/range {v3 .. v9}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactoryStation;->createEntry(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private readStationlist(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "TVStation;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, ""

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 326
    sget-object v1, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->ns:Ljava/lang/String;

    const/4 v3, 0x2

    const-string v4, "stationlist"

    invoke-interface {p1, v3, v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 327
    :cond_0
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    const/4 v4, 0x3

    if-eq v1, v4, :cond_4

    .line 328
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v1

    if-eq v1, v3, :cond_1

    goto :goto_0

    .line 331
    :cond_1
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v4, "tunein"

    .line 333
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 334
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->readTunein(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v2

    goto :goto_0

    :cond_2
    const-string v4, "station"

    .line 335
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 336
    invoke-direct {p0, p1, v0}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->readStation(Lorg/xmlpull/v1/XmlPullParser;[Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    if-eqz p2, :cond_0

    .line 337
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 339
    :cond_3
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->skip(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_0

    :cond_4
    return-void
.end method

.method private readText(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 426
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 427
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v0

    .line 428
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

    .line 392
    sget-object v0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->ns:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-interface {p1, v1, v0, p2}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 393
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->readText(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;

    move-result-object v0

    .line 394
    sget-object v1, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->ns:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-interface {p1, v2, v1, p2}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private readTunein(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 379
    sget-object v0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->ns:Ljava/lang/String;

    const-string v1, "tunein"

    const/4 v2, 0x2

    invoke-interface {p1, v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 381
    sget-object v0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->ns:Ljava/lang/String;

    const-string v2, "base"

    invoke-interface {p1, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 383
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    .line 384
    sget-object v2, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->ns:Ljava/lang/String;

    const/4 v3, 0x3

    invoke-interface {p1, v3, v2, v1}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

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

    .line 434
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_2

    .line 439
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

    .line 435
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
.method public parsePrimary(Ljava/io/InputStream;Lcom/daaw/avee/Common/StatusMsg;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "Lcom/daaw/avee/Common/StatusMsg;",
            ")TG",
            "List;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 61
    :try_start_0
    invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v0

    const-string v1, "http://xmlpull.org/v1/doc/features.html#process-namespaces"

    const/4 v2, 0x0

    .line 62
    invoke-interface {v0, v1, v2}, Lorg/xmlpull/v1/XmlPullParser;->setFeature(Ljava/lang/String;Z)V

    .line 64
    sget-boolean v1, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->debug:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 66
    new-instance v1, Ljava/io/StringReader;

    const-string v3, "<response>\n <statusCode>200</statusCode>\n <statusText>Ok</statusText>\n <data>\n  <genrelist> \n   <genre name=\"Alternative\" id=\"1\" parentid=\"0\" haschildren=\"true\"/>\n   <genre name=\"Blues\" id=\"24\" parentid=\"0\" haschildren=\"true\"/>\n  </genrelist> \n </data>\n</response>"

    invoke-direct {v1, v3}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/Reader;)V

    goto :goto_0

    .line 77
    :cond_0
    invoke-interface {v0, p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 82
    :goto_0
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    .line 84
    iget-object v1, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->listFactory:Lcom/daaw/avee/Common/Func/Func1;

    invoke-interface {v1, v2}, Lcom/daaw/avee/Common/Func/Func1;->onInvoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 85
    new-instance v2, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$1;

    invoke-direct {v2, p0, v1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$1;-><init>(Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;Ljava/util/List;)V

    invoke-direct {p0, v0, p2, v2}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->readResponse(Lorg/xmlpull/v1/XmlPullParser;Lcom/daaw/avee/Common/StatusMsg;Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$ReadElementListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    return-object v1

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    throw p2
.end method

.method public parseSecondary(Ljava/io/InputStream;Lcom/daaw/avee/Common/StatusMsg;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "Lcom/daaw/avee/Common/StatusMsg;",
            ")TG",
            "List;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 100
    :try_start_0
    invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v0

    const-string v1, "http://xmlpull.org/v1/doc/features.html#process-namespaces"

    const/4 v2, 0x0

    .line 101
    invoke-interface {v0, v1, v2}, Lorg/xmlpull/v1/XmlPullParser;->setFeature(Ljava/lang/String;Z)V

    .line 103
    sget-boolean v1, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->debug:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 105
    new-instance v1, Ljava/io/StringReader;

    const-string v3, "<response>\n <statusCode>200</statusCode>\n <statusText>Ok</statusText>\n <data>\n  <genrelist>\n   <genre name=\"Alternative\" id=\"1\" parentid=\"0\" haschildren=\"true\">\n    <genrelist>\n     <genre name=\"Adult Alternative\" id=\"2\" parentid=\"1\" haschildren=\"false\"/>\n     <genre name=\"Britpop\" id=\"3\" parentid=\"1\" haschildren=\"false\"/>\n     <genre name=\"Classic Alternative\" id=\"4\" parentid=\"1\" haschildren=\"false\"/> \n    </genrelist>\n   </genre>\n  </genrelist>\n </data>\n</response>"

    invoke-direct {v1, v3}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/Reader;)V

    goto :goto_0

    .line 121
    :cond_0
    invoke-interface {v0, p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 126
    :goto_0
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    .line 128
    iget-object v1, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->listFactory:Lcom/daaw/avee/Common/Func/Func1;

    invoke-interface {v1, v2}, Lcom/daaw/avee/Common/Func/Func1;->onInvoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 129
    new-instance v2, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$2;

    invoke-direct {v2, p0, v1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$2;-><init>(Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;Ljava/util/List;)V

    invoke-direct {p0, v0, p2, v2}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->readResponse(Lorg/xmlpull/v1/XmlPullParser;Lcom/daaw/avee/Common/StatusMsg;Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$ReadElementListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    return-object v1

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    throw p2
.end method

.method public parseStations(Ljava/io/InputStream;Lcom/daaw/avee/Common/StatusMsg;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "Lcom/daaw/avee/Common/StatusMsg;",
            ")TVStation;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 145
    :try_start_0
    invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v0

    const-string v1, "http://xmlpull.org/v1/doc/features.html#process-namespaces"

    const/4 v2, 0x0

    .line 146
    invoke-interface {v0, v1, v2}, Lorg/xmlpull/v1/XmlPullParser;->setFeature(Ljava/lang/String;Z)V

    .line 148
    sget-boolean v1, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->debug:Z

    if-eqz v1, :cond_0

    .line 150
    new-instance v1, Ljava/io/StringReader;

    const-string v2, "<response>\n <statusCode>200</statusCode>\n <statusText>Ok</statusText>\n <data>\n  <stationlist>\n   <tunein base=\"/sbin/tunein-station.pls\"/>\n   <station name=\".977 The Hitz Channel\" mt=\"audio/mpeg\" id=\"9907\" \n    br=\"128\" genre=\"Pop Rock Top 40\"\n    ct=\"Chingy - Balla Baby\" lc=\"11576\"/>\n   <station name=\"TechnoBase.FM - 24h Techno, Dance, Trance, House and More - 128k MP3-[SHOUTcast.com]\"\n    mt=\"audio/mpeg\"id=\"7429\" br=\"128\"genre=\"Techno Trance  Dance House\"\n    ct=\"We aRe oNe\" lc=\"8308\" ml=\"8500\" nsc=\"No\" cst=\"\"/>\n   <station name=\"Absolutely Smooth Jazz - S K Y . F M - the world\'s smoothest\n    jazz 24 hours a day-[SHOUTcast.com]\" mt=\"audio/mpeg\" id=\"948\"br=\"96\" genre=\"Soft Smooth Jazz\"\n    ct=\"Jonathan Butler/Kirk Whalum - Dancing on the Shore\" lc=\"6801\" ml=\"10023\" nsc=\"No\" cst=\"\"/>\n  </stationlist> \n </data>\n</response>"

    invoke-direct {v1, v2}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/Reader;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 169
    invoke-interface {v0, p1, v1}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 172
    :goto_0
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    .line 174
    iget-object v1, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->listFactoryStation:Lcom/daaw/avee/Common/Func/Func;

    invoke-interface {v1}, Lcom/daaw/avee/Common/Func/Func;->onInvoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 175
    new-instance v2, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$3;

    invoke-direct {v2, p0, v1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$3;-><init>(Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;Ljava/util/List;)V

    invoke-direct {p0, v0, p2, v2}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser;->readResponse(Lorg/xmlpull/v1/XmlPullParser;Lcom/daaw/avee/Common/StatusMsg;Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$ReadElementListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 184
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    return-object v1

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    throw p2
.end method
