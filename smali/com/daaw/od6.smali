.class public final synthetic Lcom/daaw/od6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/az5;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/az5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/od6;->p:Lcom/daaw/az5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/od6;->p:Lcom/daaw/az5;

    invoke-virtual {v0}, Lcom/daaw/az5;->zzn()V

    return-void
.end method
