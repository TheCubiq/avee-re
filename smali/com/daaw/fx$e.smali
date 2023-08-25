.class public Lcom/daaw/fx$e;
.super Ljava/lang/ref/WeakReference;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/fx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ref/WeakReference<",
        "Lcom/daaw/kx<",
        "*>;>;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/hi0;


# direct methods
.method public constructor <init>(Lcom/daaw/hi0;Lcom/daaw/kx;Ljava/lang/ref/ReferenceQueue;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/hi0;",
            "Lcom/daaw/kx<",
            "*>;",
            "Ljava/lang/ref/ReferenceQueue<",
            "-",
            "Lcom/daaw/kx<",
            "*>;>;)V"
        }
    .end annotation

    invoke-direct {p0, p2, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    iput-object p1, p0, Lcom/daaw/fx$e;->a:Lcom/daaw/hi0;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/fx$e;)Lcom/daaw/hi0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/fx$e;->a:Lcom/daaw/hi0;

    return-object p0
.end method
