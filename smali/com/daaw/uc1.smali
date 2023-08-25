.class public Lcom/daaw/uc1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/uc1$e;,
        Lcom/daaw/uc1$d;,
        Lcom/daaw/uc1$c;
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
.field public static e:Z

.field public static final f:Ljava/lang/String;


# instance fields
.field public a:Lcom/daaw/uc1$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/uc1$c<",
            "TG;>;"
        }
    .end annotation
.end field

.field public b:Lcom/daaw/r40;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/r40<",
            "TG;TG",
            "List;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lcom/daaw/uc1$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/uc1$d<",
            "TTStation;>;"
        }
    .end annotation
.end field

.field public d:Lcom/daaw/w40;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/w40<",
            "TVStation;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/daaw/uc1$c;Lcom/daaw/r40;Lcom/daaw/uc1$d;Lcom/daaw/w40;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/uc1$c<",
            "TG;>;",
            "Lcom/daaw/r40<",
            "TG;TG",
            "List;",
            ">;",
            "Lcom/daaw/uc1$d<",
            "TTStation;>;",
            "Lcom/daaw/w40<",
            "TVStation;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/uc1;->a:Lcom/daaw/uc1$c;

    iput-object p2, p0, Lcom/daaw/uc1;->b:Lcom/daaw/r40;

    iput-object p3, p0, Lcom/daaw/uc1;->c:Lcom/daaw/uc1$d;

    iput-object p4, p0, Lcom/daaw/uc1;->d:Lcom/daaw/w40;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/uc1;Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/uc1;->g(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic b(Lcom/daaw/uc1;Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/uc1;->j(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public c(Ljava/io/InputStream;Lcom/daaw/wf1;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "Lcom/daaw/wf1;",
            ")TG",
            "List;"
        }
    .end annotation

    :try_start_0
    invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v0

    const-string v1, "http://xmlpull.org/v1/doc/features.html#process-namespaces"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lorg/xmlpull/v1/XmlPullParser;->setFeature(Ljava/lang/String;Z)V

    sget-boolean v1, Lcom/daaw/uc1;->e:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    new-instance v1, Ljava/io/StringReader;

    const-string v3, "<response>\n <statusCode>200</statusCode>\n <statusText>Ok</statusText>\n <data>\n  <genrelist>\n   <genre name=\"Alternative\" id=\"1\" parentid=\"0\" haschildren=\"true\">\n    <genrelist>\n     <genre name=\"Adult Alternative\" id=\"2\" parentid=\"1\" haschildren=\"false\"/>\n     <genre name=\"Britpop\" id=\"3\" parentid=\"1\" haschildren=\"false\"/>\n     <genre name=\"Classic Alternative\" id=\"4\" parentid=\"1\" haschildren=\"false\"/> \n    </genrelist>\n   </genre>\n  </genrelist>\n </data>\n</response>"

    invoke-direct {v1, v3}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/Reader;)V

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1, v2}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    :goto_0
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    iget-object v1, p0, Lcom/daaw/uc1;->b:Lcom/daaw/r40;

    invoke-interface {v1, v2}, Lcom/daaw/r40;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    new-instance v2, Lcom/daaw/uc1$a;

    invoke-direct {v2, p0, v1}, Lcom/daaw/uc1$a;-><init>(Lcom/daaw/uc1;Ljava/util/List;)V

    invoke-virtual {p0, v0, p2, v2}, Lcom/daaw/uc1;->h(Lorg/xmlpull/v1/XmlPullParser;Lcom/daaw/wf1;Lcom/daaw/uc1$e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    return-object v1

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    throw p2
.end method

.method public d(Ljava/io/InputStream;Lcom/daaw/wf1;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "Lcom/daaw/wf1;",
            ")TVStation;"
        }
    .end annotation

    :try_start_0
    invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v0

    const-string v1, "http://xmlpull.org/v1/doc/features.html#process-namespaces"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lorg/xmlpull/v1/XmlPullParser;->setFeature(Ljava/lang/String;Z)V

    sget-boolean v1, Lcom/daaw/uc1;->e:Z

    if-eqz v1, :cond_0

    new-instance v1, Ljava/io/StringReader;

    const-string v2, "<response>\n <statusCode>200</statusCode>\n <statusText>Ok</statusText>\n <data>\n  <stationlist>\n   <tunein base=\"/sbin/tunein-station.pls\"/>\n   <station name=\".977 The Hitz Channel\" mt=\"audio/mpeg\" id=\"9907\" \n    br=\"128\" genre=\"Pop Rock Top 40\"\n    ct=\"Chingy - Balla Baby\" lc=\"11576\"/>\n   <station name=\"TechnoBase.FM - 24h Techno, Dance, Trance, House and More - 128k MP3-[SHOUTcast.com]\"\n    mt=\"audio/mpeg\"id=\"7429\" br=\"128\"genre=\"Techno Trance  Dance House\"\n    ct=\"We aRe oNe\" lc=\"8308\" ml=\"8500\" nsc=\"No\" cst=\"\"/>\n   <station name=\"Absolutely Smooth Jazz - S K Y . F M - the world\'s smoothest\n    jazz 24 hours a day-[SHOUTcast.com]\" mt=\"audio/mpeg\" id=\"948\"br=\"96\" genre=\"Soft Smooth Jazz\"\n    ct=\"Jonathan Butler/Kirk Whalum - Dancing on the Shore\" lc=\"6801\" ml=\"10023\" nsc=\"No\" cst=\"\"/>\n  </stationlist> \n </data>\n</response>"

    invoke-direct {v1, v2}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/Reader;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    :goto_0
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    iget-object v1, p0, Lcom/daaw/uc1;->d:Lcom/daaw/w40;

    invoke-interface {v1}, Lcom/daaw/w40;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    new-instance v2, Lcom/daaw/uc1$b;

    invoke-direct {v2, p0, v1}, Lcom/daaw/uc1$b;-><init>(Lcom/daaw/uc1;Ljava/util/List;)V

    invoke-virtual {p0, v0, p2, v2}, Lcom/daaw/uc1;->h(Lorg/xmlpull/v1/XmlPullParser;Lcom/daaw/wf1;Lcom/daaw/uc1$e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    return-object v1

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    throw p2
.end method

.method public final e(Lorg/xmlpull/v1/XmlPullParser;Lcom/daaw/uc1$e;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "Lcom/daaw/uc1$e<",
            "Ljava/lang/String;",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/daaw/uc1;->f:Ljava/lang/String;

    const/4 v1, 0x2

    const-string v2, "data"

    invoke-interface {p1, v1, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0, p1}, Lcom/daaw/uc1$e;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Lcom/daaw/uc1;->n(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final f(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;)Ljava/lang/Object;
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

    sget-object p2, Lcom/daaw/uc1;->f:Ljava/lang/String;

    const/4 v0, 0x2

    const-string v1, "genre"

    invoke-interface {p1, v0, p2, v1}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    const-string v1, "name"

    invoke-interface {p1, p2, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "id"

    invoke-interface {p1, p2, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iget-object v2, p0, Lcom/daaw/uc1;->a:Lcom/daaw/uc1$c;

    invoke-interface {v2, v1, p2}, Lcom/daaw/uc1$c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    iget-object v1, p0, Lcom/daaw/uc1;->b:Lcom/daaw/r40;

    invoke-interface {v1, p2}, Lcom/daaw/r40;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2

    const/4 v3, 0x3

    if-eq v2, v3, :cond_2

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v2

    if-eq v2, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "genrelist"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v1, v2}, Lcom/daaw/uc1;->g(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Ljava/util/List;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Lcom/daaw/uc1;->n(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_0

    :cond_2
    return-object p2
.end method

.method public final g(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Ljava/util/List;)V
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

    sget-object p3, Lcom/daaw/uc1;->f:Ljava/lang/String;

    const/4 v0, 0x2

    const-string v1, "genrelist"

    invoke-interface {p1, v0, p3, v1}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result p3

    const/4 v1, 0x3

    if-eq p3, v1, :cond_3

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result p3

    if-eq p3, v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object p3

    const-string v1, "genre"

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    const/4 p3, 0x0

    invoke-virtual {p0, p1, p3}, Lcom/daaw/uc1;->f(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;)Ljava/lang/Object;

    move-result-object p3

    if-eqz p2, :cond_0

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1}, Lcom/daaw/uc1;->n(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final h(Lorg/xmlpull/v1/XmlPullParser;Lcom/daaw/wf1;Lcom/daaw/uc1$e;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "Lcom/daaw/wf1;",
            "Lcom/daaw/uc1$e<",
            "Ljava/lang/String;",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/daaw/uc1;->f:Ljava/lang/String;

    const/4 v1, 0x2

    const-string v2, "response"

    invoke-interface {p1, v1, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    move-object v2, v0

    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    const/4 v4, 0x3

    if-eq v3, v4, :cond_4

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v3

    if-eq v3, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "statusCode"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p0, p1, v3}, Lcom/daaw/uc1;->l(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v4, "statusText"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {p0, p1, v3}, Lcom/daaw/uc1;->l(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_2
    const-string v4, "data"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p0, p1, p3}, Lcom/daaw/uc1;->e(Lorg/xmlpull/v1/XmlPullParser;Lcom/daaw/uc1$e;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0, p1}, Lcom/daaw/uc1;->n(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_0

    :cond_4
    if-eqz v0, :cond_5

    const-string p1, "200"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {p2, v2}, Lcom/daaw/wf1;->a(Ljava/lang/String;)V

    :cond_5
    return-void
.end method

.method public final i(Lorg/xmlpull/v1/XmlPullParser;[Ljava/lang/String;)Ljava/lang/Object;
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

    sget-object v0, Lcom/daaw/uc1;->f:Ljava/lang/String;

    const/4 v1, 0x2

    const-string v2, "station"

    invoke-interface {p1, v1, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    const-string v1, "name"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v1, "id"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v1, "br"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v1, v3}, Lcom/daaw/br1;->x(Ljava/lang/String;I)I

    move-result v6

    const-string v1, "genre"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v1, "ct"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    const/4 v1, 0x3

    invoke-interface {p1, v1, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/daaw/uc1;->c:Lcom/daaw/uc1$d;

    move-object v9, p2

    invoke-interface/range {v3 .. v9}, Lcom/daaw/uc1$d;->a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final j(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "TVStation;)V"
        }
    .end annotation

    const-string v0, ""

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/uc1;->f:Ljava/lang/String;

    const/4 v2, 0x2

    const-string v3, "stationlist"

    invoke-interface {p1, v2, v1, v3}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    const/4 v3, 0x3

    if-eq v1, v3, :cond_4

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v1

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v3, "tunein"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v1, 0x0

    invoke-virtual {p0, p1}, Lcom/daaw/uc1;->m(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v1

    goto :goto_0

    :cond_2
    const-string v3, "station"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0, p1, v0}, Lcom/daaw/uc1;->i(Lorg/xmlpull/v1/XmlPullParser;[Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    if-eqz p2, :cond_0

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {p0, p1}, Lcom/daaw/uc1;->n(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final k(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;
    .locals 2

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public final l(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    sget-object v0, Lcom/daaw/uc1;->f:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-interface {p1, v1, v0, p2}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/daaw/uc1;->k(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-interface {p1, v2, v0, p2}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public final m(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;
    .locals 4

    sget-object v0, Lcom/daaw/uc1;->f:Ljava/lang/String;

    const/4 v1, 0x2

    const-string v2, "tunein"

    invoke-interface {p1, v1, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    const-string v1, "base"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    const/4 v3, 0x3

    invoke-interface {p1, v3, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public final n(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 4

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_2

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

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method
