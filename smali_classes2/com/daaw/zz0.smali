.class public Lcom/daaw/zz0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/yr1;


# instance fields
.field public a:Z

.field public b:Z

.field public c:Lcom/daaw/q00;

.field public final d:Lcom/daaw/wz0;


# direct methods
.method public constructor <init>(Lcom/daaw/wz0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/zz0;->a:Z

    iput-boolean v0, p0, Lcom/daaw/zz0;->b:Z

    iput-object p1, p0, Lcom/daaw/zz0;->d:Lcom/daaw/wz0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/zz0;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/zz0;->a:Z

    return-void

    :cond_0
    new-instance v0, Lcom/daaw/cx;

    const-string v1, "Cannot encode a second value in the ValueEncoderContext"

    invoke-direct {v0, v1}, Lcom/daaw/cx;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Lcom/daaw/q00;Z)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/zz0;->a:Z

    iput-object p1, p0, Lcom/daaw/zz0;->c:Lcom/daaw/q00;

    iput-boolean p2, p0, Lcom/daaw/zz0;->b:Z

    return-void
.end method

.method public c(Ljava/lang/String;)Lcom/daaw/yr1;
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/zz0;->a()V

    iget-object v0, p0, Lcom/daaw/zz0;->d:Lcom/daaw/wz0;

    iget-object v1, p0, Lcom/daaw/zz0;->c:Lcom/daaw/q00;

    iget-boolean v2, p0, Lcom/daaw/zz0;->b:Z

    invoke-virtual {v0, v1, p1, v2}, Lcom/daaw/wz0;->h(Lcom/daaw/q00;Ljava/lang/Object;Z)Lcom/daaw/mt0;

    return-object p0
.end method

.method public d(Z)Lcom/daaw/yr1;
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/zz0;->a()V

    iget-object v0, p0, Lcom/daaw/zz0;->d:Lcom/daaw/wz0;

    iget-object v1, p0, Lcom/daaw/zz0;->c:Lcom/daaw/q00;

    iget-boolean v2, p0, Lcom/daaw/zz0;->b:Z

    invoke-virtual {v0, v1, p1, v2}, Lcom/daaw/wz0;->n(Lcom/daaw/q00;ZZ)Lcom/daaw/wz0;

    return-object p0
.end method
