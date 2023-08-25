.class public final synthetic Lcom/daaw/mf6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/pf6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/pf6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/mf6;->p:Lcom/daaw/pf6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/mf6;->p:Lcom/daaw/pf6;

    iget-object v0, v0, Lcom/daaw/pf6;->e:Lcom/daaw/qf6;

    invoke-static {v0}, Lcom/daaw/qf6;->c(Lcom/daaw/qf6;)Lcom/daaw/tg6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/tg6;->zzn()V

    return-void
.end method
