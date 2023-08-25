.class public final synthetic Lcom/daaw/pq8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qr8;


# instance fields
.field public final synthetic a:Lcom/daaw/sq8;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/sq8;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/pq8;->a:Lcom/daaw/sq8;

    iput-object p2, p0, Lcom/daaw/pq8;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/rr8;Lcom/daaw/l64;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/pq8;->a:Lcom/daaw/sq8;

    iget-object v1, p0, Lcom/daaw/pq8;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1, p2}, Lcom/daaw/sq8;->E(Ljava/lang/Object;Lcom/daaw/rr8;Lcom/daaw/l64;)V

    return-void
.end method
