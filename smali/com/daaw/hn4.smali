.class public final Lcom/daaw/hn4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Lcom/daaw/jn4;


# direct methods
.method public constructor <init>(Lcom/daaw/jn4;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/hn4;->a:Lcom/daaw/jn4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param

    check-cast p1, Lcom/google/android/gms/internal/ads/zzccb;

    iget-object p1, p0, Lcom/daaw/hn4;->a:Lcom/daaw/jn4;

    invoke-static {p1}, Lcom/daaw/jn4;->b(Lcom/daaw/jn4;)Lcom/daaw/fw4;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/daaw/fw4;->S(Z)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/hn4;->a:Lcom/daaw/jn4;

    invoke-static {p1}, Lcom/daaw/jn4;->b(Lcom/daaw/jn4;)Lcom/daaw/fw4;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/fw4;->S(Z)V

    return-void
.end method
