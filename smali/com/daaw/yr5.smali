.class public final synthetic Lcom/daaw/yr5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/as5;

.field public final synthetic q:Lcom/daaw/a74;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/as5;Lcom/daaw/a74;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/yr5;->p:Lcom/daaw/as5;

    iput-object p2, p0, Lcom/daaw/yr5;->q:Lcom/daaw/a74;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/yr5;->p:Lcom/daaw/as5;

    iget-object v1, p0, Lcom/daaw/yr5;->q:Lcom/daaw/a74;

    invoke-virtual {v0, v1}, Lcom/daaw/as5;->d(Lcom/daaw/a74;)V

    return-void
.end method
