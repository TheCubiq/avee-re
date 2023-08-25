.class public final synthetic Lcom/daaw/hm0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/avee/MainActivity;

.field public final synthetic q:Z

.field public final synthetic r:Z


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/avee/MainActivity;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/hm0;->p:Lcom/daaw/avee/MainActivity;

    iput-boolean p2, p0, Lcom/daaw/hm0;->q:Z

    iput-boolean p3, p0, Lcom/daaw/hm0;->r:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/hm0;->p:Lcom/daaw/avee/MainActivity;

    iget-boolean v1, p0, Lcom/daaw/hm0;->q:Z

    iget-boolean v2, p0, Lcom/daaw/hm0;->r:Z

    invoke-static {v0, v1, v2}, Lcom/daaw/avee/MainActivity;->e0(Lcom/daaw/avee/MainActivity;ZZ)V

    return-void
.end method
