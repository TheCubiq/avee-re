.class public abstract Lcom/daaw/hq1;
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
        "Landroid/net/Uri;",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/mq0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/mq0<",
            "Lcom/daaw/o70;",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/mq0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/daaw/mq0<",
            "Lcom/daaw/o70;",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/hq1;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/hq1;->b:Lcom/daaw/mq0;

    return-void
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "file"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "content"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "android.resource"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;II)Lcom/daaw/ip;
    .locals 0

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/hq1;->d(Landroid/net/Uri;II)Lcom/daaw/ip;

    move-result-object p1

    return-object p1
.end method

.method public abstract b(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/ip;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            ")",
            "Lcom/daaw/ip<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract c(Landroid/content/Context;Landroid/net/Uri;)Lcom/daaw/ip;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/net/Uri;",
            ")",
            "Lcom/daaw/ip<",
            "TT;>;"
        }
    .end annotation
.end method

.method public final d(Landroid/net/Uri;II)Lcom/daaw/ip;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "II)",
            "Lcom/daaw/ip<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/hq1;->e(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1}, Lcom/daaw/v6;->a(Landroid/net/Uri;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-static {p1}, Lcom/daaw/v6;->b(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/hq1;->a:Landroid/content/Context;

    invoke-virtual {p0, p2, p1}, Lcom/daaw/hq1;->b(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/ip;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/daaw/hq1;->a:Landroid/content/Context;

    invoke-virtual {p0, p2, p1}, Lcom/daaw/hq1;->c(Landroid/content/Context;Landroid/net/Uri;)Lcom/daaw/ip;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/daaw/hq1;->b:Lcom/daaw/mq0;

    if-eqz v1, :cond_3

    const-string v1, "http"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "https"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/daaw/hq1;->b:Lcom/daaw/mq0;

    new-instance v1, Lcom/daaw/o70;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/daaw/o70;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1, p2, p3}, Lcom/daaw/mq0;->a(Ljava/lang/Object;II)Lcom/daaw/ip;

    move-result-object p1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
