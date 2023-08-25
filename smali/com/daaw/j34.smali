.class public final synthetic Lcom/daaw/j34;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/t34;

.field public final synthetic q:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/t34;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/j34;->p:Lcom/daaw/t34;

    iput-object p2, p0, Lcom/daaw/j34;->q:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/j34;->p:Lcom/daaw/t34;

    iget-object v1, p0, Lcom/daaw/j34;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/daaw/t34;->D(Ljava/lang/String;)V

    return-void
.end method
