.class public final synthetic Lcom/daaw/np6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/op6;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Lcom/daaw/to6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/op6;Ljava/lang/String;Lcom/daaw/to6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/np6;->p:Lcom/daaw/op6;

    iput-object p2, p0, Lcom/daaw/np6;->q:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/np6;->r:Lcom/daaw/to6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/np6;->p:Lcom/daaw/op6;

    iget-object v1, p0, Lcom/daaw/np6;->q:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/np6;->r:Lcom/daaw/to6;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/op6;->b(Ljava/lang/String;Lcom/daaw/to6;)V

    return-void
.end method
