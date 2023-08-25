.class public final Lcom/daaw/fc4;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lcom/daaw/e94;

.field public b:Lcom/daaw/vd4;

.field public c:Lcom/daaw/in6;

.field public d:Lcom/daaw/ke4;

.field public e:Lcom/daaw/uj6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ec4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/b94;
    .locals 8

    iget-object v0, p0, Lcom/daaw/fc4;->a:Lcom/daaw/e94;

    const-class v1, Lcom/daaw/e94;

    invoke-static {v0, v1}, Lcom/daaw/e08;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/daaw/fc4;->b:Lcom/daaw/vd4;

    const-class v1, Lcom/daaw/vd4;

    invoke-static {v0, v1}, Lcom/daaw/e08;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/daaw/fc4;->c:Lcom/daaw/in6;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/in6;

    invoke-direct {v0}, Lcom/daaw/in6;-><init>()V

    iput-object v0, p0, Lcom/daaw/fc4;->c:Lcom/daaw/in6;

    :cond_0
    iget-object v0, p0, Lcom/daaw/fc4;->d:Lcom/daaw/ke4;

    if-nez v0, :cond_1

    new-instance v0, Lcom/daaw/ke4;

    invoke-direct {v0}, Lcom/daaw/ke4;-><init>()V

    iput-object v0, p0, Lcom/daaw/fc4;->d:Lcom/daaw/ke4;

    :cond_1
    iget-object v0, p0, Lcom/daaw/fc4;->e:Lcom/daaw/uj6;

    if-nez v0, :cond_2

    new-instance v0, Lcom/daaw/uj6;

    invoke-direct {v0}, Lcom/daaw/uj6;-><init>()V

    iput-object v0, p0, Lcom/daaw/fc4;->e:Lcom/daaw/uj6;

    :cond_2
    new-instance v0, Lcom/daaw/bb4;

    iget-object v2, p0, Lcom/daaw/fc4;->a:Lcom/daaw/e94;

    iget-object v3, p0, Lcom/daaw/fc4;->b:Lcom/daaw/vd4;

    iget-object v4, p0, Lcom/daaw/fc4;->c:Lcom/daaw/in6;

    iget-object v5, p0, Lcom/daaw/fc4;->d:Lcom/daaw/ke4;

    iget-object v6, p0, Lcom/daaw/fc4;->e:Lcom/daaw/uj6;

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/daaw/bb4;-><init>(Lcom/daaw/e94;Lcom/daaw/vd4;Lcom/daaw/in6;Lcom/daaw/ke4;Lcom/daaw/uj6;Lcom/daaw/ab4;)V

    return-object v0
.end method

.method public final b(Lcom/daaw/e94;)Lcom/daaw/fc4;
    .locals 0

    iput-object p1, p0, Lcom/daaw/fc4;->a:Lcom/daaw/e94;

    return-object p0
.end method

.method public final c(Lcom/daaw/vd4;)Lcom/daaw/fc4;
    .locals 0

    iput-object p1, p0, Lcom/daaw/fc4;->b:Lcom/daaw/vd4;

    return-object p0
.end method
