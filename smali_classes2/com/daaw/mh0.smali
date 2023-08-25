.class public interface abstract Lcom/daaw/mh0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/nl$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/mh0$b;,
        Lcom/daaw/mh0$a;
    }
.end annotation


# static fields
.field public static final d:Lcom/daaw/mh0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/daaw/mh0$b;->p:Lcom/daaw/mh0$b;

    sput-object v0, Lcom/daaw/mh0;->d:Lcom/daaw/mh0$b;

    invoke-static {}, Lcom/daaw/rl;->b()V

    return-void
.end method


# virtual methods
.method public abstract L(Ljava/util/concurrent/CancellationException;)V
.end method

.method public abstract d()Z
.end method

.method public abstract q()Ljava/util/concurrent/CancellationException;
.end method

.method public abstract w(ZZLcom/daaw/z40;)Lcom/daaw/iu;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lcom/daaw/z40<",
            "-",
            "Ljava/lang/Throwable;",
            "Lcom/daaw/lp1;",
            ">;)",
            "Lcom/daaw/iu;"
        }
    .end annotation
.end method
