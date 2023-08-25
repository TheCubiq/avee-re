.class public final Lcom/daaw/i94;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/e94;


# direct methods
.method public constructor <init>(Lcom/daaw/e94;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/i94;->a:Lcom/daaw/e94;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/ref/WeakReference;
    .locals 1

    iget-object v0, p0, Lcom/daaw/i94;->a:Lcom/daaw/e94;

    invoke-virtual {v0}, Lcom/daaw/e94;->f()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final synthetic zzb()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/i94;->a:Lcom/daaw/e94;

    invoke-virtual {v0}, Lcom/daaw/e94;->f()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
