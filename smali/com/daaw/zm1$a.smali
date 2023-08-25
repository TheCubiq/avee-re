.class public Lcom/daaw/zm1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/zm1;->execute(Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Ljava/lang/Runnable;

.field public final synthetic q:Lcom/daaw/zm1;


# direct methods
.method public constructor <init>(Lcom/daaw/zm1;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/zm1$a;->q:Lcom/daaw/zm1;

    iput-object p2, p0, Lcom/daaw/zm1$a;->p:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/zm1$a;->p:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/daaw/zm1$a;->q:Lcom/daaw/zm1;

    invoke-virtual {v0}, Lcom/daaw/zm1;->a()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/zm1$a;->q:Lcom/daaw/zm1;

    invoke-virtual {v1}, Lcom/daaw/zm1;->a()V

    throw v0
.end method
