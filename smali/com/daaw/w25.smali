.class public final synthetic Lcom/daaw/w25;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/r35;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/r35;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/w25;->p:Lcom/daaw/r35;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/w25;->p:Lcom/daaw/r35;

    invoke-interface {v0}, Lcom/daaw/r35;->zzp()V

    return-void
.end method
