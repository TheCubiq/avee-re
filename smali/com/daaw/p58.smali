.class public final synthetic Lcom/daaw/p58;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/u68;

.field public final synthetic q:Lcom/daaw/z88;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/u68;Lcom/daaw/z88;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/p58;->p:Lcom/daaw/u68;

    iput-object p2, p0, Lcom/daaw/p58;->q:Lcom/daaw/z88;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/p58;->q:Lcom/daaw/z88;

    invoke-static {v0}, Lcom/daaw/u68;->a0(Lcom/daaw/z88;)V

    return-void
.end method
