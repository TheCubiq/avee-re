.class public Lcom/daaw/fy1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/fy1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/fy1;


# direct methods
.method public constructor <init>(Lcom/daaw/fy1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/fy1$a;->p:Lcom/daaw/fy1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/fy1$a;->p:Lcom/daaw/fy1;

    invoke-virtual {v0, p1}, Lcom/daaw/fy1;->d(Ljava/lang/Runnable;)V

    return-void
.end method
