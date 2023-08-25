.class public Lcom/daaw/wb1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ai1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/wb1;->o(Lcom/daaw/vb1;Ljava/util/concurrent/Executor;)Lcom/daaw/rj1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/ai1<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/wb1;


# direct methods
.method public constructor <init>(Lcom/daaw/wb1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/wb1$a;->a:Lcom/daaw/wb1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lcom/daaw/rj1;
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/daaw/wb1$a;->b(Ljava/lang/Void;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Void;)Lcom/daaw/rj1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Void;",
            ")",
            "Lcom/daaw/rj1<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object p1, p0, Lcom/daaw/wb1$a;->a:Lcom/daaw/wb1;

    invoke-static {p1}, Lcom/daaw/wb1;->d(Lcom/daaw/wb1;)Lcom/daaw/bc1;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/wb1$a;->a:Lcom/daaw/wb1;

    invoke-static {v0}, Lcom/daaw/wb1;->c(Lcom/daaw/wb1;)Lcom/daaw/ac1;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lcom/daaw/bc1;->a(Lcom/daaw/ac1;Z)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/daaw/wb1$a;->a:Lcom/daaw/wb1;

    invoke-static {v0}, Lcom/daaw/wb1;->e(Lcom/daaw/wb1;)Lcom/daaw/xb1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/xb1;->b(Lorg/json/JSONObject;)Lcom/daaw/tb1;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/wb1$a;->a:Lcom/daaw/wb1;

    invoke-static {v1}, Lcom/daaw/wb1;->f(Lcom/daaw/wb1;)Lcom/daaw/hd;

    move-result-object v1

    iget-wide v2, v0, Lcom/daaw/tb1;->c:J

    invoke-virtual {v1, v2, v3, p1}, Lcom/daaw/hd;->c(JLorg/json/JSONObject;)V

    iget-object v1, p0, Lcom/daaw/wb1$a;->a:Lcom/daaw/wb1;

    const-string v2, "Loaded settings: "

    invoke-static {v1, p1, v2}, Lcom/daaw/wb1;->g(Lcom/daaw/wb1;Lorg/json/JSONObject;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/wb1$a;->a:Lcom/daaw/wb1;

    invoke-static {p1}, Lcom/daaw/wb1;->c(Lcom/daaw/wb1;)Lcom/daaw/ac1;

    move-result-object v1

    iget-object v1, v1, Lcom/daaw/ac1;->f:Ljava/lang/String;

    invoke-static {p1, v1}, Lcom/daaw/wb1;->h(Lcom/daaw/wb1;Ljava/lang/String;)Z

    iget-object p1, p0, Lcom/daaw/wb1$a;->a:Lcom/daaw/wb1;

    invoke-static {p1}, Lcom/daaw/wb1;->i(Lcom/daaw/wb1;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/wb1$a;->a:Lcom/daaw/wb1;

    invoke-static {p1}, Lcom/daaw/wb1;->j(Lcom/daaw/wb1;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/tj1;

    invoke-virtual {p1, v0}, Lcom/daaw/tj1;->e(Ljava/lang/Object;)Z

    :cond_0
    const/4 p1, 0x0

    invoke-static {p1}, Lcom/daaw/dk1;->e(Ljava/lang/Object;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method
