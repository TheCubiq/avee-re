.class public Lcom/daaw/fx$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/fx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/ExecutorService;

.field public final b:Ljava/util/concurrent/ExecutorService;

.field public final c:Lcom/daaw/hx;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Lcom/daaw/hx;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/fx$a;->a:Ljava/util/concurrent/ExecutorService;

    iput-object p2, p0, Lcom/daaw/fx$a;->b:Ljava/util/concurrent/ExecutorService;

    iput-object p3, p0, Lcom/daaw/fx$a;->c:Lcom/daaw/hx;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/hi0;Z)Lcom/daaw/gx;
    .locals 7

    new-instance v6, Lcom/daaw/gx;

    iget-object v2, p0, Lcom/daaw/fx$a;->a:Ljava/util/concurrent/ExecutorService;

    iget-object v3, p0, Lcom/daaw/fx$a;->b:Ljava/util/concurrent/ExecutorService;

    iget-object v5, p0, Lcom/daaw/fx$a;->c:Lcom/daaw/hx;

    move-object v0, v6

    move-object v1, p1

    move v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/daaw/gx;-><init>(Lcom/daaw/hi0;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;ZLcom/daaw/hx;)V

    return-object v6
.end method
