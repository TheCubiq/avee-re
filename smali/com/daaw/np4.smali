.class public final synthetic Lcom/daaw/np4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/op4;

.field public final synthetic b:Lcom/daaw/f77;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/op4;Lcom/daaw/f77;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/np4;->a:Lcom/daaw/op4;

    iput-object p2, p0, Lcom/daaw/np4;->b:Lcom/daaw/f77;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/np4;->a:Lcom/daaw/op4;

    iget-object v1, p0, Lcom/daaw/np4;->b:Lcom/daaw/f77;

    invoke-virtual {v0, v1}, Lcom/daaw/op4;->a(Lcom/daaw/f77;)Lcom/google/android/gms/internal/ads/zzccb;

    move-result-object v0

    return-object v0
.end method
