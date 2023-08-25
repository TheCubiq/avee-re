.class public final synthetic Lcom/daaw/ik4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ik4;->p:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ik4;->p:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Lcom/daaw/kk4;->o(Ljava/util/concurrent/atomic/AtomicReference;)V

    return-void
.end method
