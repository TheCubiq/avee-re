.class public final Lcom/daaw/nk4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/mk4;


# direct methods
.method public constructor <init>(Lcom/daaw/mk4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/nk4;->a:Lcom/daaw/mk4;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Runnable;
    .locals 1

    iget-object v0, p0, Lcom/daaw/nk4;->a:Lcom/daaw/mk4;

    invoke-virtual {v0}, Lcom/daaw/mk4;->b()Ljava/lang/Runnable;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic zzb()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/nk4;->a:Lcom/daaw/mk4;

    invoke-virtual {v0}, Lcom/daaw/mk4;->b()Ljava/lang/Runnable;

    move-result-object v0

    return-object v0
.end method
