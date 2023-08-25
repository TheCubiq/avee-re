.class public final Lcom/daaw/b57;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final c:Lcom/daaw/b57;


# instance fields
.field public volatile a:Ljava/lang/Thread;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field

.field public volatile b:Lcom/daaw/b57;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/b57;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/b57;-><init>(Z)V

    sput-object v0, Lcom/daaw/b57;->c:Lcom/daaw/b57;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/daaw/c57;->l()Lcom/daaw/r47;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lcom/daaw/r47;->d(Lcom/daaw/b57;Ljava/lang/Thread;)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
