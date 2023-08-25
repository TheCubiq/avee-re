.class public Lcom/daaw/wx1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/wx1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/sb1;

.field public final synthetic q:Lcom/daaw/wx1;


# direct methods
.method public constructor <init>(Lcom/daaw/wx1;Lcom/daaw/sb1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/wx1$a;->q:Lcom/daaw/wx1;

    iput-object p2, p0, Lcom/daaw/wx1$a;->p:Lcom/daaw/sb1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/wx1$a;->p:Lcom/daaw/sb1;

    iget-object v1, p0, Lcom/daaw/wx1$a;->q:Lcom/daaw/wx1;

    iget-object v1, v1, Lcom/daaw/wx1;->s:Landroidx/work/ListenableWorker;

    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->getForegroundInfoAsync()Lcom/daaw/fk0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/sb1;->s(Lcom/daaw/fk0;)Z

    return-void
.end method
