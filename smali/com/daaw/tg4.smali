.class public final synthetic Lcom/daaw/tg4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/ug4;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ug4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/tg4;->p:Lcom/daaw/ug4;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/tg4;->p:Lcom/daaw/ug4;

    iget-object v0, v0, Lcom/daaw/ug4;->a:Lcom/daaw/vg4;

    invoke-static {v0}, Lcom/daaw/vg4;->a(Lcom/daaw/vg4;)Lcom/daaw/ah4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/ah4;->k()V

    return-void
.end method
