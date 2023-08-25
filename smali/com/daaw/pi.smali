.class public final synthetic Lcom/daaw/pi;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/wu0;

.field public final synthetic q:Lcom/daaw/b01;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/wu0;Lcom/daaw/b01;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/pi;->p:Lcom/daaw/wu0;

    iput-object p2, p0, Lcom/daaw/pi;->q:Lcom/daaw/b01;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/pi;->p:Lcom/daaw/wu0;

    iget-object v1, p0, Lcom/daaw/pi;->q:Lcom/daaw/b01;

    invoke-static {v0, v1}, Lcom/daaw/qi;->l(Lcom/daaw/wu0;Lcom/daaw/b01;)V

    return-void
.end method
