.class public final synthetic Lcom/daaw/ni8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/dj8;

.field public final synthetic q:Lcom/daaw/ql7;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/dj8;Lcom/daaw/ql7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ni8;->p:Lcom/daaw/dj8;

    iput-object p2, p0, Lcom/daaw/ni8;->q:Lcom/daaw/ql7;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ni8;->p:Lcom/daaw/dj8;

    iget-object v1, p0, Lcom/daaw/ni8;->q:Lcom/daaw/ql7;

    invoke-virtual {v0, v1}, Lcom/daaw/dj8;->m(Lcom/daaw/ql7;)V

    return-void
.end method
