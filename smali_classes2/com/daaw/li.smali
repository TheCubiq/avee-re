.class public interface abstract Lcom/daaw/li;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/li;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/daaw/ki;->b:Lcom/daaw/ki;

    sput-object v0, Lcom/daaw/li;->a:Lcom/daaw/li;

    return-void
.end method


# virtual methods
.method public abstract a(Lcom/google/firebase/components/ComponentRegistrar;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/components/ComponentRegistrar;",
            ")",
            "Ljava/util/List<",
            "Lcom/daaw/vh<",
            "*>;>;"
        }
    .end annotation
.end method
