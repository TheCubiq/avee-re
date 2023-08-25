.class public final Lcom/daaw/ha8;
.super Lcom/daaw/hl2;
.source ""


# instance fields
.field public final synthetic e:Lcom/daaw/ka8;


# direct methods
.method public constructor <init>(Lcom/daaw/ka8;Lcom/daaw/xe7;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ha8;->e:Lcom/daaw/ka8;

    invoke-direct {p0, p2}, Lcom/daaw/hl2;-><init>(Lcom/daaw/xe7;)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ha8;->e:Lcom/daaw/ka8;

    invoke-virtual {v0}, Lcom/daaw/ka8;->l()V

    iget-object v0, p0, Lcom/daaw/ha8;->e:Lcom/daaw/ka8;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v0

    const-string v1, "Starting upload from DelayedRunnable"

    invoke-virtual {v0, v1}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/ha8;->e:Lcom/daaw/ka8;

    iget-object v0, v0, Lcom/daaw/na8;->b:Lcom/daaw/yb8;

    invoke-virtual {v0}, Lcom/daaw/yb8;->C()V

    return-void
.end method
