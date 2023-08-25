.class public Lcom/daaw/mb1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/mb1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final p:Lcom/daaw/mb1;

.field public final q:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/daaw/mb1;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/mb1$a;->p:Lcom/daaw/mb1;

    iput-object p2, p0, Lcom/daaw/mb1$a;->q:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/mb1$a;->q:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/daaw/mb1$a;->p:Lcom/daaw/mb1;

    invoke-virtual {v0}, Lcom/daaw/mb1;->b()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/mb1$a;->p:Lcom/daaw/mb1;

    invoke-virtual {v1}, Lcom/daaw/mb1;->b()V

    throw v0
.end method
