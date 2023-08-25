.class public abstract Lcom/daaw/dx6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final p:Lcom/daaw/tj1;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/dx6;->p:Lcom/daaw/tj1;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/tj1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/dx6;->p:Lcom/daaw/tj1;

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public final b()Lcom/daaw/tj1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/dx6;->p:Lcom/daaw/tj1;

    return-object v0
.end method

.method public final c(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/dx6;->p:Lcom/daaw/tj1;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/tj1;->d(Ljava/lang/Exception;)Z

    :cond_0
    return-void
.end method

.method public final run()V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/dx6;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, Lcom/daaw/dx6;->c(Ljava/lang/Exception;)V

    return-void
.end method
