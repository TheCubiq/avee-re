.class public final synthetic Lcom/daaw/dl5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# static fields
.field public static final synthetic a:Lcom/daaw/dl5;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/dl5;

    invoke-direct {v0}, Lcom/daaw/dl5;-><init>()V

    sput-object v0, Lcom/daaw/dl5;->a:Lcom/daaw/dl5;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 1

    check-cast p1, Ljava/util/concurrent/ExecutionException;

    invoke-virtual {p1}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    :cond_0
    invoke-static {p1}, Lcom/daaw/s67;->h(Ljava/lang/Throwable;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
