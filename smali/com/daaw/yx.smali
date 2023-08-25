.class public final synthetic Lcom/daaw/yx;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Ljava/util/Map$Entry;

.field public final synthetic q:Lcom/daaw/wx;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map$Entry;Lcom/daaw/wx;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/yx;->p:Ljava/util/Map$Entry;

    iput-object p2, p0, Lcom/daaw/yx;->q:Lcom/daaw/wx;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/yx;->p:Ljava/util/Map$Entry;

    iget-object v1, p0, Lcom/daaw/yx;->q:Lcom/daaw/wx;

    invoke-static {v0, v1}, Lcom/daaw/zx;->b(Ljava/util/Map$Entry;Lcom/daaw/wx;)V

    return-void
.end method
