.class public final Lcom/daaw/hp4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Lcom/daaw/ip4;


# direct methods
.method public constructor <init>(Lcom/daaw/ip4;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/hp4;->a:Lcom/daaw/ip4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param

    check-cast p1, Ljava/lang/Boolean;

    iget-object p1, p0, Lcom/daaw/hp4;->a:Lcom/daaw/ip4;

    invoke-static {p1}, Lcom/daaw/ip4;->b(Lcom/daaw/ip4;)Lcom/daaw/gr4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/gr4;->zza()V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method
