.class public final synthetic Lcom/daaw/xx3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/ky3;

.field public final synthetic q:Lcom/daaw/jy3;

.field public final synthetic r:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ky3;Lcom/daaw/jy3;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/xx3;->p:Lcom/daaw/ky3;

    iput-object p2, p0, Lcom/daaw/xx3;->q:Lcom/daaw/jy3;

    iput-object p3, p0, Lcom/daaw/xx3;->r:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/xx3;->p:Lcom/daaw/ky3;

    iget-object v1, p0, Lcom/daaw/xx3;->q:Lcom/daaw/jy3;

    iget-object v2, p0, Lcom/daaw/xx3;->r:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ky3;->o(Lcom/daaw/jy3;Ljava/lang/String;)V

    return-void
.end method
