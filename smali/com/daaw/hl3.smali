.class public final Lcom/daaw/hl3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i14;


# instance fields
.field public final synthetic a:Lcom/daaw/il3;


# direct methods
.method public constructor <init>(Lcom/daaw/il3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/hl3;->a:Lcom/daaw/il3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/daaw/bk3;

    sget-object v0, Lcom/daaw/z04;->e:Lcom/daaw/g77;

    new-instance v1, Lcom/daaw/gl3;

    invoke-direct {v1, p0, p1}, Lcom/daaw/gl3;-><init>(Lcom/daaw/hl3;Lcom/daaw/bk3;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
