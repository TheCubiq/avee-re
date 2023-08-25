.class public final Lcom/daaw/a68;
.super Lcom/daaw/hl2;
.source ""


# instance fields
.field public final synthetic e:Lcom/daaw/x78;


# direct methods
.method public constructor <init>(Lcom/daaw/x78;Lcom/daaw/xe7;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/a68;->e:Lcom/daaw/x78;

    invoke-direct {p0, p2}, Lcom/daaw/hl2;-><init>(Lcom/daaw/xe7;)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/a68;->e:Lcom/daaw/x78;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->w()Lcom/daaw/hk5;

    move-result-object v0

    const-string v1, "Tasks have been queued for a long time"

    invoke-virtual {v0, v1}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    return-void
.end method
