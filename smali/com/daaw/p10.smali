.class public final Lcom/daaw/p10;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/vv0$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/daaw/o10<",
        "TT;TK;>;K:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/vv0$a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/vv0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vv0$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TK;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/vv0$a;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vv0$a<",
            "TT;>;",
            "Ljava/util/List<",
            "TK;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/p10;->a:Lcom/daaw/vv0$a;

    iput-object p2, p0, Lcom/daaw/p10;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/net/Uri;Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/p10;->b(Landroid/net/Uri;Ljava/io/InputStream;)Lcom/daaw/o10;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/net/Uri;Ljava/io/InputStream;)Lcom/daaw/o10;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/io/InputStream;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/p10;->a:Lcom/daaw/vv0$a;

    invoke-interface {v0, p1, p2}, Lcom/daaw/vv0$a;->a(Landroid/net/Uri;Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/o10;

    iget-object p2, p0, Lcom/daaw/p10;->b:Ljava/util/List;

    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/daaw/p10;->b:Ljava/util/List;

    invoke-interface {p1, p2}, Lcom/daaw/o10;->a(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/o10;

    :cond_1
    :goto_0
    return-object p1
.end method
