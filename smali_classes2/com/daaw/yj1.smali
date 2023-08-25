.class public final Lcom/daaw/yj1;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ljava/util/concurrent/Executor;

.field public static final b:Ljava/util/concurrent/Executor;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/tt8;

    invoke-direct {v0}, Lcom/daaw/tt8;-><init>()V

    sput-object v0, Lcom/daaw/yj1;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lcom/daaw/ms8;

    invoke-direct {v0}, Lcom/daaw/ms8;-><init>()V

    sput-object v0, Lcom/daaw/yj1;->b:Ljava/util/concurrent/Executor;

    return-void
.end method
