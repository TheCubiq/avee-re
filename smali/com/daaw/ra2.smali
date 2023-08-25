.class public final synthetic Lcom/daaw/ra2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/rb;

.field public final synthetic q:Lcom/daaw/xb;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/rb;Lcom/daaw/xb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ra2;->p:Lcom/daaw/rb;

    iput-object p2, p0, Lcom/daaw/ra2;->q:Lcom/daaw/xb;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ra2;->p:Lcom/daaw/rb;

    iget-object v1, p0, Lcom/daaw/ra2;->q:Lcom/daaw/xb;

    invoke-virtual {v0, v1}, Lcom/daaw/rb;->n(Lcom/daaw/xb;)V

    return-void
.end method
