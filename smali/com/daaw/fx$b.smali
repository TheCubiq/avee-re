.class public Lcom/daaw/fx$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/dq$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/fx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Lcom/daaw/ut$a;

.field public volatile b:Lcom/daaw/ut;


# direct methods
.method public constructor <init>(Lcom/daaw/ut$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/fx$b;->a:Lcom/daaw/ut$a;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/ut;
    .locals 1

    iget-object v0, p0, Lcom/daaw/fx$b;->b:Lcom/daaw/ut;

    if-nez v0, :cond_2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/fx$b;->b:Lcom/daaw/ut;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/fx$b;->a:Lcom/daaw/ut$a;

    invoke-interface {v0}, Lcom/daaw/ut$a;->a()Lcom/daaw/ut;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/fx$b;->b:Lcom/daaw/ut;

    :cond_0
    iget-object v0, p0, Lcom/daaw/fx$b;->b:Lcom/daaw/ut;

    if-nez v0, :cond_1

    new-instance v0, Lcom/daaw/vt;

    invoke-direct {v0}, Lcom/daaw/vt;-><init>()V

    iput-object v0, p0, Lcom/daaw/fx$b;->b:Lcom/daaw/ut;

    :cond_1
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/daaw/fx$b;->b:Lcom/daaw/ut;

    return-object v0
.end method
