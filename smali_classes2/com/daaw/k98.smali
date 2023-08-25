.class public final Lcom/daaw/k98;
.super Lcom/daaw/hl2;
.source ""


# instance fields
.field public final synthetic e:Lcom/daaw/w98;


# direct methods
.method public constructor <init>(Lcom/daaw/w98;Lcom/daaw/xe7;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/k98;->e:Lcom/daaw/w98;

    invoke-direct {p0, p2}, Lcom/daaw/hl2;-><init>(Lcom/daaw/xe7;)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/k98;->e:Lcom/daaw/w98;

    iget-object v1, v0, Lcom/daaw/w98;->d:Lcom/daaw/ca8;

    invoke-virtual {v1}, Lcom/daaw/rc7;->f()V

    iget-object v1, v0, Lcom/daaw/w98;->d:Lcom/daaw/ca8;

    iget-object v1, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->b()Lcom/daaw/ag;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/ag;->b()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v3, v1, v2}, Lcom/daaw/w98;->d(ZZJ)Z

    iget-object v1, v0, Lcom/daaw/w98;->d:Lcom/daaw/ca8;

    iget-object v1, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->y()Lcom/daaw/vk4;

    move-result-object v1

    iget-object v0, v0, Lcom/daaw/w98;->d:Lcom/daaw/ca8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->b()Lcom/daaw/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/ag;->b()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/daaw/vk4;->m(J)V

    return-void
.end method
