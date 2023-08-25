.class public final Lcom/daaw/j03;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/as2;

.field public final synthetic q:Lcom/daaw/k03;


# direct methods
.method public constructor <init>(Lcom/daaw/k03;Lcom/daaw/as2;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/j03;->q:Lcom/daaw/k03;

    iput-object p2, p0, Lcom/daaw/j03;->p:Lcom/daaw/as2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/j03;->p:Lcom/daaw/as2;

    invoke-virtual {v0}, Lcom/daaw/as2;->a()V

    return-void
.end method
