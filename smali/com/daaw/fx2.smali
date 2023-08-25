.class public abstract Lcom/daaw/fx2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lcom/daaw/ex2;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a([Lcom/daaw/hq2;Lcom/daaw/rw2;)Lcom/daaw/gx2;
.end method

.method public abstract b(Ljava/lang/Object;)V
.end method

.method public final c(Lcom/daaw/ex2;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/fx2;->a:Lcom/daaw/ex2;

    return-void
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fx2;->a:Lcom/daaw/ex2;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/ex2;->zzh()V

    :cond_0
    return-void
.end method
