.class public final Lcom/daaw/qt8;
.super Lcom/daaw/ad2;
.source ""


# instance fields
.field public final r:Ljava/util/concurrent/Callable;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/concurrent/Callable;)V
    .locals 0

    const-string p1, "internal.appMetadata"

    invoke-direct {p0, p1}, Lcom/daaw/ad2;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/daaw/qt8;->r:Ljava/util/concurrent/Callable;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/w07;Ljava/util/List;)Lcom/daaw/gl2;
    .locals 0

    :try_start_0
    iget-object p1, p0, Lcom/daaw/qt8;->r:Ljava/util/concurrent/Callable;

    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/b38;->b(Ljava/lang/Object;)Lcom/daaw/gl2;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    sget-object p1, Lcom/daaw/gl2;->g:Lcom/daaw/gl2;

    return-object p1
.end method
