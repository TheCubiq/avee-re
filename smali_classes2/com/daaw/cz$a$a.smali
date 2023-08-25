.class public Lcom/daaw/cz$a$a;
.super Lcom/daaw/ga;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/cz$a;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Ljava/lang/Runnable;

.field public final synthetic q:Lcom/daaw/cz$a;


# direct methods
.method public constructor <init>(Lcom/daaw/cz$a;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/cz$a$a;->q:Lcom/daaw/cz$a;

    iput-object p2, p0, Lcom/daaw/cz$a$a;->p:Ljava/lang/Runnable;

    invoke-direct {p0}, Lcom/daaw/ga;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/cz$a$a;->p:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
