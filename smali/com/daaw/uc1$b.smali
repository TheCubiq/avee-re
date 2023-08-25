.class public Lcom/daaw/uc1$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/uc1$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/uc1;->d(Ljava/io/InputStream;Lcom/daaw/wf1;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/uc1$e<",
        "Ljava/lang/String;",
        "Lorg/xmlpull/v1/XmlPullParser;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Lcom/daaw/uc1;


# direct methods
.method public constructor <init>(Lcom/daaw/uc1;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/uc1$b;->b:Lcom/daaw/uc1;

    iput-object p2, p0, Lcom/daaw/uc1$b;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lorg/xmlpull/v1/XmlPullParser;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/uc1$b;->b(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/Boolean;
    .locals 1

    iget-object p1, p0, Lcom/daaw/uc1$b;->b:Lcom/daaw/uc1;

    iget-object v0, p0, Lcom/daaw/uc1$b;->a:Ljava/util/List;

    invoke-static {p1, p2, v0}, Lcom/daaw/uc1;->b(Lcom/daaw/uc1;Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method
