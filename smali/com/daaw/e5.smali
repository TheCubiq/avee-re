.class public final synthetic Lcom/daaw/e5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/f5$a;

.field public final synthetic q:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/f5$a;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/e5;->p:Lcom/daaw/f5$a;

    iput-object p2, p0, Lcom/daaw/e5;->q:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/e5;->p:Lcom/daaw/f5$a;

    iget-object v1, p0, Lcom/daaw/e5;->q:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lcom/daaw/f5$a;->a(Lcom/daaw/f5$a;Ljava/lang/Runnable;)V

    return-void
.end method
