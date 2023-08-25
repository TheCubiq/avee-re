.class public final synthetic Lcom/daaw/er7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/p28;

.field public final synthetic q:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/p28;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/er7;->p:Lcom/daaw/p28;

    iput-object p2, p0, Lcom/daaw/er7;->q:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/er7;->p:Lcom/daaw/p28;

    iget-object v1, p0, Lcom/daaw/er7;->q:Ljava/lang/String;

    iget-object v2, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v2}, Lcom/daaw/dr6;->B()Lcom/daaw/xb5;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/xb5;->w(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->B()Lcom/daaw/xb5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/xb5;->v()V

    :cond_0
    return-void
.end method
