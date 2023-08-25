.class public final synthetic Lcom/daaw/bq7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/p28;

.field public final synthetic q:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/p28;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/bq7;->p:Lcom/daaw/p28;

    iput-object p2, p0, Lcom/daaw/bq7;->q:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/bq7;->p:Lcom/daaw/p28;

    iget-object v1, p0, Lcom/daaw/bq7;->q:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Lcom/daaw/p28;->p(Landroid/os/Bundle;)V

    return-void
.end method
