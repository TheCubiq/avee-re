.class public final synthetic Lcom/daaw/zi2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/il2;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/il2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/zi2;->p:Lcom/daaw/il2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/zi2;->p:Lcom/daaw/il2;

    invoke-virtual {v0}, Lcom/daaw/il2;->b()V

    return-void
.end method
