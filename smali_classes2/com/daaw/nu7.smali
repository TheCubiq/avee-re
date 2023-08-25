.class public final synthetic Lcom/daaw/nu7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/tc8;

.field public final synthetic q:Lcom/daaw/tj1;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/tc8;Lcom/daaw/tj1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/nu7;->p:Lcom/daaw/tc8;

    iput-object p2, p0, Lcom/daaw/nu7;->q:Lcom/daaw/tj1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/nu7;->p:Lcom/daaw/tc8;

    iget-object v1, p0, Lcom/daaw/nu7;->q:Lcom/daaw/tj1;

    invoke-virtual {v0, v1}, Lcom/daaw/tc8;->e(Lcom/daaw/tj1;)V

    return-void
.end method
