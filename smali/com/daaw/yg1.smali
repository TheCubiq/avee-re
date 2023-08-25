.class public Lcom/daaw/yg1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/mq0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/mq0<",
        "Ljava/lang/String;",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/mq0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/mq0<",
            "Landroid/net/Uri;",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/mq0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/mq0<",
            "Landroid/net/Uri;",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/yg1;->a:Lcom/daaw/mq0;

    return-void
.end method

.method public static c(Ljava/lang/String;)Landroid/net/Uri;
    .locals 1

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;II)Lcom/daaw/ip;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/yg1;->b(Ljava/lang/String;II)Lcom/daaw/ip;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;II)Lcom/daaw/ip;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II)",
            "Lcom/daaw/ip<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    invoke-static {p1}, Lcom/daaw/yg1;->c(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v0

    :goto_1
    iget-object v0, p0, Lcom/daaw/yg1;->a:Lcom/daaw/mq0;

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/mq0;->a(Ljava/lang/Object;II)Lcom/daaw/ip;

    move-result-object p1

    return-object p1
.end method
