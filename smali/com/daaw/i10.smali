.class public Lcom/daaw/i10;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/d51;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/i10$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/d51<",
        "Ljava/io/File;",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final c:Lcom/daaw/i10$a;


# instance fields
.field public a:Lcom/daaw/d51;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/d51<",
            "Ljava/io/InputStream;",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Lcom/daaw/i10$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/i10$a;

    invoke-direct {v0}, Lcom/daaw/i10$a;-><init>()V

    sput-object v0, Lcom/daaw/i10;->c:Lcom/daaw/i10$a;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/d51;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/d51<",
            "Ljava/io/InputStream;",
            "TT;>;)V"
        }
    .end annotation

    sget-object v0, Lcom/daaw/i10;->c:Lcom/daaw/i10$a;

    invoke-direct {p0, p1, v0}, Lcom/daaw/i10;-><init>(Lcom/daaw/d51;Lcom/daaw/i10$a;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/d51;Lcom/daaw/i10$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/d51<",
            "Ljava/io/InputStream;",
            "TT;>;",
            "Lcom/daaw/i10$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/i10;->a:Lcom/daaw/d51;

    iput-object p2, p0, Lcom/daaw/i10;->b:Lcom/daaw/i10$a;

    return-void
.end method


# virtual methods
.method public a(Ljava/io/File;II)Lcom/daaw/z41;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "II)",
            "Lcom/daaw/z41<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/i10;->b:Lcom/daaw/i10$a;

    invoke-virtual {v1, p1}, Lcom/daaw/i10$a;->a(Ljava/io/File;)Ljava/io/InputStream;

    move-result-object v0

    iget-object p1, p0, Lcom/daaw/i10;->a:Lcom/daaw/d51;

    invoke-interface {p1, v0, p2, p3}, Lcom/daaw/d51;->c(Ljava/lang/Object;II)Lcom/daaw/z41;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    :try_start_1
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_0
    return-object p1

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_1

    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    :cond_1
    throw p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;II)Lcom/daaw/z41;
    .locals 0

    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/i10;->a(Ljava/io/File;II)Lcom/daaw/z41;

    move-result-object p1

    return-object p1
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method
