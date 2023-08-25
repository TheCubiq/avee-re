.class public final synthetic Lcom/daaw/b74;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/b74;->p:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/b74;->p:Ljava/lang/String;

    sget v1, Lcom/daaw/h74;->R:I

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/qz3;->f()Lcom/daaw/l93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/l93;->e(Ljava/lang/String;)V

    return-void
.end method
