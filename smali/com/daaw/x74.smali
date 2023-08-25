.class public final synthetic Lcom/daaw/x74;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/z74;

.field public final synthetic q:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/z74;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/x74;->p:Lcom/daaw/z74;

    iput-object p2, p0, Lcom/daaw/x74;->q:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/x74;->p:Lcom/daaw/z74;

    iget-object v1, p0, Lcom/daaw/x74;->q:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lcom/daaw/z74;->i3(Ljava/util/Map;)V

    return-void
.end method
