.class public final Lcom/daaw/u58;
.super Lcom/daaw/hl2;
.source ""


# instance fields
.field public final synthetic e:Lcom/daaw/x78;


# direct methods
.method public constructor <init>(Lcom/daaw/x78;Lcom/daaw/xe7;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/u58;->e:Lcom/daaw/x78;

    invoke-direct {p0, p2}, Lcom/daaw/hl2;-><init>(Lcom/daaw/xe7;)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/u58;->e:Lcom/daaw/x78;

    invoke-virtual {v0}, Lcom/daaw/rc7;->f()V

    invoke-virtual {v0}, Lcom/daaw/x78;->z()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v1

    const-string v2, "Inactivity, disconnecting from the service"

    invoke-virtual {v1, v2}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/daaw/x78;->Q()V

    return-void
.end method
