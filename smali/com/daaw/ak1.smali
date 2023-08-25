.class public Lcom/daaw/ak1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Result:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lcom/daaw/me0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/me0<",
            "TResult;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/ak1;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/ak1;->b:Lcom/daaw/me0;

    return-void
.end method

.method public static synthetic c(Lcom/daaw/ak1;Lcom/daaw/me0;)Lcom/daaw/me0;
    .locals 0

    iput-object p1, p0, Lcom/daaw/ak1;->b:Lcom/daaw/me0;

    return-object p1
.end method

.method public static synthetic d(Lcom/daaw/ak1;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/daaw/ak1;->a:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ak1;->b:Lcom/daaw/me0;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/daaw/me0;->cancel(Z)Z

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/ak1;->b:Lcom/daaw/me0;

    iput-object v0, p0, Lcom/daaw/ak1;->a:Ljava/lang/String;

    return-void
.end method

.method public b(Ljava/lang/String;Lcom/daaw/me0;Lcom/daaw/ir1$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/daaw/me0<",
            "TResult;>;",
            "Lcom/daaw/ir1$b<",
            "TResult;>;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/ak1;->a()V

    iput-object p2, p0, Lcom/daaw/ak1;->b:Lcom/daaw/me0;

    iput-object p1, p0, Lcom/daaw/ak1;->a:Ljava/lang/String;

    new-instance p1, Lcom/daaw/ak1$a;

    invoke-direct {p1, p0, p3}, Lcom/daaw/ak1$a;-><init>(Lcom/daaw/ak1;Lcom/daaw/ir1$b;)V

    invoke-interface {p2, p1}, Lcom/daaw/me0;->a(Lcom/daaw/ir1$b;)V

    return-void
.end method

.method public e(Ljava/lang/String;)Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/ak1;->a:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/daaw/br1;->h(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object p1, p0, Lcom/daaw/ak1;->b:Lcom/daaw/me0;

    if-nez p1, :cond_1

    return v0

    :cond_1
    invoke-interface {p1}, Lcom/daaw/me0;->getStatus()Landroid/os/AsyncTask$Status;

    move-result-object p1

    sget-object v1, Landroid/os/AsyncTask$Status;->RUNNING:Landroid/os/AsyncTask$Status;

    if-ne p1, v1, :cond_2

    const/4 v0, 0x1

    :cond_2
    return v0
.end method
