.class public final Lcom/daaw/yu6;
.super Lcom/daaw/ru6;
.source ""


# instance fields
.field public p:Lcom/daaw/iz6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/iz6<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public q:Lcom/daaw/iz6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/iz6<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public r:Lcom/daaw/xu6;

.field public s:Ljava/net/HttpURLConnection;


# direct methods
.method public constructor <init>()V
    .locals 3

    sget-object v0, Lcom/daaw/vu6;->p:Lcom/daaw/vu6;

    sget-object v1, Lcom/daaw/wu6;->p:Lcom/daaw/wu6;

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/daaw/yu6;-><init>(Lcom/daaw/iz6;Lcom/daaw/iz6;Lcom/daaw/xu6;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/iz6;Lcom/daaw/iz6;Lcom/daaw/xu6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/iz6<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/daaw/iz6<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/daaw/xu6;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/daaw/ru6;-><init>()V

    iput-object p1, p0, Lcom/daaw/yu6;->p:Lcom/daaw/iz6;

    iput-object p2, p0, Lcom/daaw/yu6;->q:Lcom/daaw/iz6;

    iput-object p3, p0, Lcom/daaw/yu6;->r:Lcom/daaw/xu6;

    return-void
.end method

.method public static K(Ljava/net/HttpURLConnection;)V
    .locals 0

    invoke-static {}, Lcom/daaw/su6;->a()V

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_0
    return-void
.end method

.method public static synthetic n()Ljava/lang/Integer;
    .locals 1

    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic q()Ljava/lang/Integer;
    .locals 1

    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic u(I)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(I)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public D()Ljava/net/HttpURLConnection;
    .locals 2

    iget-object v0, p0, Lcom/daaw/yu6;->p:Lcom/daaw/iz6;

    invoke-interface {v0}, Lcom/daaw/iz6;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/yu6;->q:Lcom/daaw/iz6;

    invoke-interface {v1}, Lcom/daaw/iz6;->zza()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/daaw/su6;->b(II)V

    iget-object v0, p0, Lcom/daaw/yu6;->r:Lcom/daaw/xu6;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0}, Lcom/daaw/xu6;->zza()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    iput-object v0, p0, Lcom/daaw/yu6;->s:Ljava/net/HttpURLConnection;

    return-object v0
.end method

.method public E(Lcom/daaw/xu6;II)Ljava/net/HttpURLConnection;
    .locals 1

    new-instance v0, Lcom/daaw/tu6;

    invoke-direct {v0, p2}, Lcom/daaw/tu6;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/yu6;->p:Lcom/daaw/iz6;

    new-instance p2, Lcom/daaw/uu6;

    invoke-direct {p2, p3}, Lcom/daaw/uu6;-><init>(I)V

    iput-object p2, p0, Lcom/daaw/yu6;->q:Lcom/daaw/iz6;

    iput-object p1, p0, Lcom/daaw/yu6;->r:Lcom/daaw/xu6;

    invoke-virtual {p0}, Lcom/daaw/yu6;->D()Ljava/net/HttpURLConnection;

    move-result-object p1

    return-object p1
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/yu6;->s:Ljava/net/HttpURLConnection;

    invoke-static {v0}, Lcom/daaw/yu6;->K(Ljava/net/HttpURLConnection;)V

    return-void
.end method
