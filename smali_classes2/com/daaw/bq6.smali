.class public final Lcom/daaw/bq6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/vn7;

.field public final synthetic q:Lcom/daaw/dr6;


# direct methods
.method public constructor <init>(Lcom/daaw/dr6;Lcom/daaw/vn7;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/bq6;->q:Lcom/daaw/dr6;

    iput-object p2, p0, Lcom/daaw/bq6;->p:Lcom/daaw/vn7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/bq6;->q:Lcom/daaw/dr6;

    iget-object v1, p0, Lcom/daaw/bq6;->p:Lcom/daaw/vn7;

    invoke-static {v0, v1}, Lcom/daaw/dr6;->c(Lcom/daaw/dr6;Lcom/daaw/vn7;)V

    iget-object v0, p0, Lcom/daaw/bq6;->q:Lcom/daaw/dr6;

    iget-object v1, p0, Lcom/daaw/bq6;->p:Lcom/daaw/vn7;

    iget-object v1, v1, Lcom/daaw/vn7;->g:Lcom/google/android/gms/internal/measurement/zzcl;

    invoke-virtual {v0, v1}, Lcom/daaw/dr6;->l(Lcom/google/android/gms/internal/measurement/zzcl;)V

    return-void
.end method
