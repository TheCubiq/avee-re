.class public final Lcom/daaw/d12;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/google/android/gms/signin/internal/zak;

.field public final synthetic q:Lcom/daaw/f12;


# direct methods
.method public constructor <init>(Lcom/daaw/f12;Lcom/google/android/gms/signin/internal/zak;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/d12;->q:Lcom/daaw/f12;

    iput-object p2, p0, Lcom/daaw/d12;->p:Lcom/google/android/gms/signin/internal/zak;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/d12;->q:Lcom/daaw/f12;

    iget-object v1, p0, Lcom/daaw/d12;->p:Lcom/google/android/gms/signin/internal/zak;

    invoke-static {v0, v1}, Lcom/daaw/f12;->i3(Lcom/daaw/f12;Lcom/google/android/gms/signin/internal/zak;)V

    return-void
.end method
