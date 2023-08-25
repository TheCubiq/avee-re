.class public final Lcom/daaw/ui3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pa$b;


# instance fields
.field public final synthetic a:Lcom/daaw/e14;


# direct methods
.method public constructor <init>(Lcom/daaw/vi3;Lcom/daaw/e14;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/ui3;->a:Lcom/daaw/e14;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final I(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/ui3;->a:Lcom/daaw/e14;

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Connection failed."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    return-void
.end method
