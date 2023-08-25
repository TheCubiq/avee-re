.class public final synthetic Lcom/daaw/ag5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/fg5;

.field public final synthetic q:Lcom/daaw/oj6;

.field public final synthetic r:Lcom/daaw/dj3;

.field public final synthetic s:Ljava/util/List;

.field public final synthetic t:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/fg5;Lcom/daaw/oj6;Lcom/daaw/dj3;Ljava/util/List;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ag5;->p:Lcom/daaw/fg5;

    iput-object p2, p0, Lcom/daaw/ag5;->q:Lcom/daaw/oj6;

    iput-object p3, p0, Lcom/daaw/ag5;->r:Lcom/daaw/dj3;

    iput-object p4, p0, Lcom/daaw/ag5;->s:Ljava/util/List;

    iput-object p5, p0, Lcom/daaw/ag5;->t:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/ag5;->p:Lcom/daaw/fg5;

    iget-object v1, p0, Lcom/daaw/ag5;->q:Lcom/daaw/oj6;

    iget-object v2, p0, Lcom/daaw/ag5;->r:Lcom/daaw/dj3;

    iget-object v3, p0, Lcom/daaw/ag5;->s:Ljava/util/List;

    iget-object v4, p0, Lcom/daaw/ag5;->t:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/daaw/fg5;->n(Lcom/daaw/oj6;Lcom/daaw/dj3;Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method
