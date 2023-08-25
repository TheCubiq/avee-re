.class public final synthetic Lcom/daaw/ux0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/e0;

.field public final synthetic q:Lcom/daaw/tx0$b;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/e0;Lcom/daaw/tx0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ux0;->p:Lcom/daaw/e0;

    iput-object p2, p0, Lcom/daaw/ux0;->q:Lcom/daaw/tx0$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ux0;->p:Lcom/daaw/e0;

    iget-object v1, p0, Lcom/daaw/ux0;->q:Lcom/daaw/tx0$b;

    invoke-static {v0, v1}, Lcom/daaw/wx0;->b(Lcom/daaw/e0;Lcom/daaw/tx0$b;)V

    return-void
.end method
