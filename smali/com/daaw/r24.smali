.class public final synthetic Lcom/daaw/r24;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/d24;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/d24;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/r24;->p:Lcom/daaw/d24;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/r24;->p:Lcom/daaw/d24;

    invoke-interface {v0}, Lcom/daaw/d24;->zzk()V

    return-void
.end method
